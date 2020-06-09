// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a forward resource.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "forward-entry-example-name";
 *
 * const defaultZones = pulumi.output(alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * }, { async: true }));
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     cidrBlock: "172.16.0.0/12",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     availabilityZone: defaultZones.zones[0].id,
 *     cidrBlock: "172.16.0.0/21",
 *     vpcId: defaultNetwork.id,
 * });
 * const defaultNatGateway = new alicloud.vpc.NatGateway("default", {
 *     specification: "Small",
 *     vpcId: defaultNetwork.id,
 * });
 * const defaultEip = new alicloud.ecs.Eip("default", {});
 * const defaultEipAssociation = new alicloud.ecs.EipAssociation("default", {
 *     allocationId: defaultEip.id,
 *     instanceId: defaultNatGateway.id,
 * });
 * const defaultForwardEntry = new alicloud.vpc.ForwardEntry("default", {
 *     externalIp: defaultEip.ipAddress,
 *     externalPort: "80",
 *     forwardTableId: defaultNatGateway.forwardTableIds,
 *     internalIp: "172.16.0.3",
 *     internalPort: "8080",
 *     ipProtocol: "tcp",
 * });
 * ```
 */
export class ForwardEntry extends pulumi.CustomResource {
    /**
     * Get an existing ForwardEntry resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ForwardEntryState, opts?: pulumi.CustomResourceOptions): ForwardEntry {
        return new ForwardEntry(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/forwardEntry:ForwardEntry';

    /**
     * Returns true if the given object is an instance of ForwardEntry.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ForwardEntry {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ForwardEntry.__pulumiType;
    }

    /**
     * The external ip address, the ip must along bandwidth package public ip which `alicloud.vpc.NatGateway` argument `bandwidthPackages`.
     */
    public readonly externalIp!: pulumi.Output<string>;
    /**
     * The external port, valid value is 1~65535|any.
     */
    public readonly externalPort!: pulumi.Output<string>;
    /**
     * The id of the forward entry on the server.
     */
    public /*out*/ readonly forwardEntryId!: pulumi.Output<string>;
    /**
     * The value can get from `alicloud.vpc.NatGateway` Attributes "forwardTableIds".
     */
    public readonly forwardTableId!: pulumi.Output<string>;
    /**
     * The internal ip, must a private ip.
     */
    public readonly internalIp!: pulumi.Output<string>;
    /**
     * The internal port, valid value is 1~65535|any.
     */
    public readonly internalPort!: pulumi.Output<string>;
    /**
     * The ip protocal, valid value is tcp|udp|any.
     */
    public readonly ipProtocol!: pulumi.Output<string>;
    /**
     * The name of forward entry.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a ForwardEntry resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ForwardEntryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ForwardEntryArgs | ForwardEntryState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ForwardEntryState | undefined;
            inputs["externalIp"] = state ? state.externalIp : undefined;
            inputs["externalPort"] = state ? state.externalPort : undefined;
            inputs["forwardEntryId"] = state ? state.forwardEntryId : undefined;
            inputs["forwardTableId"] = state ? state.forwardTableId : undefined;
            inputs["internalIp"] = state ? state.internalIp : undefined;
            inputs["internalPort"] = state ? state.internalPort : undefined;
            inputs["ipProtocol"] = state ? state.ipProtocol : undefined;
            inputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as ForwardEntryArgs | undefined;
            if (!args || args.externalIp === undefined) {
                throw new Error("Missing required property 'externalIp'");
            }
            if (!args || args.externalPort === undefined) {
                throw new Error("Missing required property 'externalPort'");
            }
            if (!args || args.forwardTableId === undefined) {
                throw new Error("Missing required property 'forwardTableId'");
            }
            if (!args || args.internalIp === undefined) {
                throw new Error("Missing required property 'internalIp'");
            }
            if (!args || args.internalPort === undefined) {
                throw new Error("Missing required property 'internalPort'");
            }
            if (!args || args.ipProtocol === undefined) {
                throw new Error("Missing required property 'ipProtocol'");
            }
            inputs["externalIp"] = args ? args.externalIp : undefined;
            inputs["externalPort"] = args ? args.externalPort : undefined;
            inputs["forwardTableId"] = args ? args.forwardTableId : undefined;
            inputs["internalIp"] = args ? args.internalIp : undefined;
            inputs["internalPort"] = args ? args.internalPort : undefined;
            inputs["ipProtocol"] = args ? args.ipProtocol : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["forwardEntryId"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ForwardEntry.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ForwardEntry resources.
 */
export interface ForwardEntryState {
    /**
     * The external ip address, the ip must along bandwidth package public ip which `alicloud.vpc.NatGateway` argument `bandwidthPackages`.
     */
    readonly externalIp?: pulumi.Input<string>;
    /**
     * The external port, valid value is 1~65535|any.
     */
    readonly externalPort?: pulumi.Input<string>;
    /**
     * The id of the forward entry on the server.
     */
    readonly forwardEntryId?: pulumi.Input<string>;
    /**
     * The value can get from `alicloud.vpc.NatGateway` Attributes "forwardTableIds".
     */
    readonly forwardTableId?: pulumi.Input<string>;
    /**
     * The internal ip, must a private ip.
     */
    readonly internalIp?: pulumi.Input<string>;
    /**
     * The internal port, valid value is 1~65535|any.
     */
    readonly internalPort?: pulumi.Input<string>;
    /**
     * The ip protocal, valid value is tcp|udp|any.
     */
    readonly ipProtocol?: pulumi.Input<string>;
    /**
     * The name of forward entry.
     */
    readonly name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ForwardEntry resource.
 */
export interface ForwardEntryArgs {
    /**
     * The external ip address, the ip must along bandwidth package public ip which `alicloud.vpc.NatGateway` argument `bandwidthPackages`.
     */
    readonly externalIp: pulumi.Input<string>;
    /**
     * The external port, valid value is 1~65535|any.
     */
    readonly externalPort: pulumi.Input<string>;
    /**
     * The value can get from `alicloud.vpc.NatGateway` Attributes "forwardTableIds".
     */
    readonly forwardTableId: pulumi.Input<string>;
    /**
     * The internal ip, must a private ip.
     */
    readonly internalIp: pulumi.Input<string>;
    /**
     * The internal port, valid value is 1~65535|any.
     */
    readonly internalPort: pulumi.Input<string>;
    /**
     * The ip protocal, valid value is tcp|udp|any.
     */
    readonly ipProtocol: pulumi.Input<string>;
    /**
     * The name of forward entry.
     */
    readonly name?: pulumi.Input<string>;
}
