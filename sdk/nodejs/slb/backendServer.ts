// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Add a group of backend servers (ECS or ENI instance) to the Server Load Balancer or remove them from it.
 *
 * > **NOTE:** Available in 1.53.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "slbbackendservertest";
 * const defaultZones = alicloud.getZones({
 *     availableDiskCategory: "cloud_efficiency",
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultInstanceTypes = defaultZones.then(defaultZones => alicloud.ecs.getInstanceTypes({
 *     availabilityZone: defaultZones.zones[0].id,
 *     cpuCoreCount: 1,
 *     memorySize: 2,
 * }));
 * const defaultImages = alicloud.ecs.getImages({
 *     nameRegex: "^ubuntu_18.*64",
 *     mostRecent: true,
 *     owners: "system",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {cidrBlock: "172.16.0.0/16"});
 * const defaultSwitch = new alicloud.vpc.Switch("defaultSwitch", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/16",
 *     availabilityZone: defaultZones.then(defaultZones => defaultZones.zones[0].id),
 * });
 * const defaultSecurityGroup = new alicloud.ecs.SecurityGroup("defaultSecurityGroup", {vpcId: defaultNetwork.id});
 * const defaultInstance: alicloud.ecs.Instance[];
 * for (const range = {value: 0}; range.value < "2"; range.value++) {
 *     defaultInstance.push(new alicloud.ecs.Instance(`defaultInstance-${range.value}`, {
 *         imageId: defaultImages.then(defaultImages => defaultImages.images[0].id),
 *         instanceType: defaultInstanceTypes.then(defaultInstanceTypes => defaultInstanceTypes.instanceTypes[0].id),
 *         instanceName: name,
 *         securityGroups: [defaultSecurityGroup].map(__item => __item.id),
 *         internetChargeType: "PayByTraffic",
 *         internetMaxBandwidthOut: "10",
 *         availabilityZone: defaultZones.then(defaultZones => defaultZones.zones[0].id),
 *         instanceChargeType: "PostPaid",
 *         systemDiskCategory: "cloud_efficiency",
 *         vswitchId: defaultSwitch.id,
 *     }));
 * }
 * const defaultLoadBalancer = new alicloud.slb.LoadBalancer("defaultLoadBalancer", {vswitchId: defaultSwitch.id});
 * const defaultBackendServer = new alicloud.slb.BackendServer("defaultBackendServer", {
 *     loadBalancerId: defaultLoadBalancer.id,
 *     backendServers: [
 *         {
 *             serverId: defaultInstance[0].id,
 *             weight: 100,
 *         },
 *         {
 *             serverId: defaultInstance[1].id,
 *             weight: 100,
 *         },
 *     ],
 * });
 * ```
 * ## Block servers
 *
 * The servers mapping supports the following:
 *
 * * `serverId` - (Required) A list backend server ID (ECS instance ID).
 * * `weight` - (Optional) Weight of the backend server. Valid value range: [0-100].
 * * `type` - (Optional) Type of the backend server. Valid value `ecs`, `eni`. Default to `ecs`.
 * * `serverIp` - (Optional, Available in 1.93.0+) ServerIp of the backend server. This parameter can be specified when the type is `eni`. `ecs` type currently does not support adding `serverIp` parameter.
 *
 * ## Import
 *
 * Load balancer backend server can be imported using the load balancer id.
 *
 * ```sh
 *  $ pulumi import alicloud:slb/backendServer:BackendServer example lb-abc123456
 * ```
 */
export class BackendServer extends pulumi.CustomResource {
    /**
     * Get an existing BackendServer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BackendServerState, opts?: pulumi.CustomResourceOptions): BackendServer {
        return new BackendServer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:slb/backendServer:BackendServer';

    /**
     * Returns true if the given object is an instance of BackendServer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BackendServer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BackendServer.__pulumiType;
    }

    /**
     * A list of instances to added backend server in the SLB. It contains three sub-fields as `Block server` follows.
     */
    public readonly backendServers!: pulumi.Output<outputs.slb.BackendServerBackendServer[] | undefined>;
    /**
     * Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
     */
    public readonly deleteProtectionValidation!: pulumi.Output<boolean | undefined>;
    /**
     * ID of the load balancer.
     */
    public readonly loadBalancerId!: pulumi.Output<string>;

    /**
     * Create a BackendServer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BackendServerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BackendServerArgs | BackendServerState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as BackendServerState | undefined;
            inputs["backendServers"] = state ? state.backendServers : undefined;
            inputs["deleteProtectionValidation"] = state ? state.deleteProtectionValidation : undefined;
            inputs["loadBalancerId"] = state ? state.loadBalancerId : undefined;
        } else {
            const args = argsOrState as BackendServerArgs | undefined;
            if (!args || args.loadBalancerId === undefined) {
                throw new Error("Missing required property 'loadBalancerId'");
            }
            inputs["backendServers"] = args ? args.backendServers : undefined;
            inputs["deleteProtectionValidation"] = args ? args.deleteProtectionValidation : undefined;
            inputs["loadBalancerId"] = args ? args.loadBalancerId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(BackendServer.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BackendServer resources.
 */
export interface BackendServerState {
    /**
     * A list of instances to added backend server in the SLB. It contains three sub-fields as `Block server` follows.
     */
    readonly backendServers?: pulumi.Input<pulumi.Input<inputs.slb.BackendServerBackendServer>[]>;
    /**
     * Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
     */
    readonly deleteProtectionValidation?: pulumi.Input<boolean>;
    /**
     * ID of the load balancer.
     */
    readonly loadBalancerId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BackendServer resource.
 */
export interface BackendServerArgs {
    /**
     * A list of instances to added backend server in the SLB. It contains three sub-fields as `Block server` follows.
     */
    readonly backendServers?: pulumi.Input<pulumi.Input<inputs.slb.BackendServerBackendServer>[]>;
    /**
     * Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
     */
    readonly deleteProtectionValidation?: pulumi.Input<boolean>;
    /**
     * ID of the load balancer.
     */
    readonly loadBalancerId: pulumi.Input<string>;
}
