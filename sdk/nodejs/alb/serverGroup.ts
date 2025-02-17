// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides an ALB Server Group resource.
 *
 * For information about ALB Server Group and how to use it, see [What is Server Group](https://www.alibabacloud.com/help/en/slb/application-load-balancer/developer-reference/api-alb-2020-06-16-createservergroup).
 *
 * > **NOTE:** Available since v1.131.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const exampleResourceGroups = alicloud.resourcemanager.getResourceGroups({});
 * const exampleZones = alicloud.getZones({
 *     availableResourceCreation: "Instance",
 * });
 * const exampleInstanceTypes = exampleZones.then(exampleZones => alicloud.ecs.getInstanceTypes({
 *     availabilityZone: exampleZones.zones?.[0]?.id,
 *     cpuCoreCount: 1,
 *     memorySize: 2,
 * }));
 * const exampleImages = alicloud.ecs.getImages({
 *     nameRegex: "^ubuntu_[0-9]+_[0-9]+_x64*",
 *     owners: "system",
 * });
 * const exampleNetwork = new alicloud.vpc.Network("exampleNetwork", {
 *     vpcName: name,
 *     cidrBlock: "10.4.0.0/16",
 * });
 * const exampleSwitch = new alicloud.vpc.Switch("exampleSwitch", {
 *     vswitchName: name,
 *     cidrBlock: "10.4.0.0/16",
 *     vpcId: exampleNetwork.id,
 *     zoneId: exampleZones.then(exampleZones => exampleZones.zones?.[0]?.id),
 * });
 * const exampleSecurityGroup = new alicloud.ecs.SecurityGroup("exampleSecurityGroup", {
 *     description: name,
 *     vpcId: exampleNetwork.id,
 * });
 * const exampleInstance = new alicloud.ecs.Instance("exampleInstance", {
 *     availabilityZone: exampleZones.then(exampleZones => exampleZones.zones?.[0]?.id),
 *     instanceName: name,
 *     imageId: exampleImages.then(exampleImages => exampleImages.images?.[0]?.id),
 *     instanceType: exampleInstanceTypes.then(exampleInstanceTypes => exampleInstanceTypes.instanceTypes?.[0]?.id),
 *     securityGroups: [exampleSecurityGroup.id],
 *     vswitchId: exampleSwitch.id,
 * });
 * const exampleServerGroup = new alicloud.alb.ServerGroup("exampleServerGroup", {
 *     protocol: "HTTP",
 *     vpcId: exampleNetwork.id,
 *     serverGroupName: name,
 *     resourceGroupId: exampleResourceGroups.then(exampleResourceGroups => exampleResourceGroups.groups?.[0]?.id),
 *     stickySessionConfig: {
 *         stickySessionEnabled: true,
 *         cookie: "tf-example",
 *         stickySessionType: "Server",
 *     },
 *     healthCheckConfig: {
 *         healthCheckConnectPort: 46325,
 *         healthCheckEnabled: true,
 *         healthCheckHost: "tf-example.com",
 *         healthCheckCodes: [
 *             "http_2xx",
 *             "http_3xx",
 *             "http_4xx",
 *         ],
 *         healthCheckHttpVersion: "HTTP1.1",
 *         healthCheckInterval: 2,
 *         healthCheckMethod: "HEAD",
 *         healthCheckPath: "/tf-example",
 *         healthCheckProtocol: "HTTP",
 *         healthCheckTimeout: 5,
 *         healthyThreshold: 3,
 *         unhealthyThreshold: 3,
 *     },
 *     servers: [{
 *         description: name,
 *         port: 80,
 *         serverId: exampleInstance.id,
 *         serverIp: exampleInstance.privateIp,
 *         serverType: "Ecs",
 *         weight: 10,
 *     }],
 *     tags: {
 *         Created: "TF",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * ALB Server Group can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:alb/serverGroup:ServerGroup example <id>
 * ```
 */
export class ServerGroup extends pulumi.CustomResource {
    /**
     * Get an existing ServerGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerGroupState, opts?: pulumi.CustomResourceOptions): ServerGroup {
        return new ServerGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:alb/serverGroup:ServerGroup';

    /**
     * Returns true if the given object is an instance of ServerGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServerGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServerGroup.__pulumiType;
    }

    /**
     * The dry run.
     */
    public readonly dryRun!: pulumi.Output<boolean | undefined>;
    /**
     * The configuration of health checks. See `healthCheckConfig` below.
     */
    public readonly healthCheckConfig!: pulumi.Output<outputs.alb.ServerGroupHealthCheckConfig>;
    /**
     * The server protocol. Valid values: ` HTTP`, `HTTPS`, `gRPC`. While `serverGroupType` is `Fc` this parameter will not take effect. From version 1.215.0, `protocol` can be set to `gRPC`.
     */
    public readonly protocol!: pulumi.Output<string>;
    /**
     * The ID of the resource group.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * The scheduling algorithm. Valid values: ` Sch`, ` Wlc`, `Wrr`. **NOTE:** This parameter takes effect when the `serverGroupType` parameter is set to `Instance` or `Ip`.
     */
    public readonly scheduler!: pulumi.Output<string>;
    /**
     * The name of the server group.
     */
    public readonly serverGroupName!: pulumi.Output<string>;
    /**
     * The type of the server group. Default value: `Instance`. Valid values:
     */
    public readonly serverGroupType!: pulumi.Output<string>;
    /**
     * The backend servers. See `servers` below.
     */
    public readonly servers!: pulumi.Output<outputs.alb.ServerGroupServer[] | undefined>;
    /**
     * The status of the backend server.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The configuration of session persistence. See `stickySessionConfig` below.
     */
    public readonly stickySessionConfig!: pulumi.Output<outputs.alb.ServerGroupStickySessionConfig>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The ID of the VPC that you want to access. **NOTE:** This parameter takes effect when the `serverGroupType` parameter is set to `Instance` or `Ip`.
     */
    public readonly vpcId!: pulumi.Output<string | undefined>;

    /**
     * Create a ServerGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerGroupArgs | ServerGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerGroupState | undefined;
            resourceInputs["dryRun"] = state ? state.dryRun : undefined;
            resourceInputs["healthCheckConfig"] = state ? state.healthCheckConfig : undefined;
            resourceInputs["protocol"] = state ? state.protocol : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["scheduler"] = state ? state.scheduler : undefined;
            resourceInputs["serverGroupName"] = state ? state.serverGroupName : undefined;
            resourceInputs["serverGroupType"] = state ? state.serverGroupType : undefined;
            resourceInputs["servers"] = state ? state.servers : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["stickySessionConfig"] = state ? state.stickySessionConfig : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as ServerGroupArgs | undefined;
            if ((!args || args.healthCheckConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'healthCheckConfig'");
            }
            if ((!args || args.serverGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverGroupName'");
            }
            resourceInputs["dryRun"] = args ? args.dryRun : undefined;
            resourceInputs["healthCheckConfig"] = args ? args.healthCheckConfig : undefined;
            resourceInputs["protocol"] = args ? args.protocol : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["scheduler"] = args ? args.scheduler : undefined;
            resourceInputs["serverGroupName"] = args ? args.serverGroupName : undefined;
            resourceInputs["serverGroupType"] = args ? args.serverGroupType : undefined;
            resourceInputs["servers"] = args ? args.servers : undefined;
            resourceInputs["stickySessionConfig"] = args ? args.stickySessionConfig : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServerGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServerGroup resources.
 */
export interface ServerGroupState {
    /**
     * The dry run.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The configuration of health checks. See `healthCheckConfig` below.
     */
    healthCheckConfig?: pulumi.Input<inputs.alb.ServerGroupHealthCheckConfig>;
    /**
     * The server protocol. Valid values: ` HTTP`, `HTTPS`, `gRPC`. While `serverGroupType` is `Fc` this parameter will not take effect. From version 1.215.0, `protocol` can be set to `gRPC`.
     */
    protocol?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The scheduling algorithm. Valid values: ` Sch`, ` Wlc`, `Wrr`. **NOTE:** This parameter takes effect when the `serverGroupType` parameter is set to `Instance` or `Ip`.
     */
    scheduler?: pulumi.Input<string>;
    /**
     * The name of the server group.
     */
    serverGroupName?: pulumi.Input<string>;
    /**
     * The type of the server group. Default value: `Instance`. Valid values:
     */
    serverGroupType?: pulumi.Input<string>;
    /**
     * The backend servers. See `servers` below.
     */
    servers?: pulumi.Input<pulumi.Input<inputs.alb.ServerGroupServer>[]>;
    /**
     * The status of the backend server.
     */
    status?: pulumi.Input<string>;
    /**
     * The configuration of session persistence. See `stickySessionConfig` below.
     */
    stickySessionConfig?: pulumi.Input<inputs.alb.ServerGroupStickySessionConfig>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The ID of the VPC that you want to access. **NOTE:** This parameter takes effect when the `serverGroupType` parameter is set to `Instance` or `Ip`.
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServerGroup resource.
 */
export interface ServerGroupArgs {
    /**
     * The dry run.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The configuration of health checks. See `healthCheckConfig` below.
     */
    healthCheckConfig: pulumi.Input<inputs.alb.ServerGroupHealthCheckConfig>;
    /**
     * The server protocol. Valid values: ` HTTP`, `HTTPS`, `gRPC`. While `serverGroupType` is `Fc` this parameter will not take effect. From version 1.215.0, `protocol` can be set to `gRPC`.
     */
    protocol?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The scheduling algorithm. Valid values: ` Sch`, ` Wlc`, `Wrr`. **NOTE:** This parameter takes effect when the `serverGroupType` parameter is set to `Instance` or `Ip`.
     */
    scheduler?: pulumi.Input<string>;
    /**
     * The name of the server group.
     */
    serverGroupName: pulumi.Input<string>;
    /**
     * The type of the server group. Default value: `Instance`. Valid values:
     */
    serverGroupType?: pulumi.Input<string>;
    /**
     * The backend servers. See `servers` below.
     */
    servers?: pulumi.Input<pulumi.Input<inputs.alb.ServerGroupServer>[]>;
    /**
     * The configuration of session persistence. See `stickySessionConfig` below.
     */
    stickySessionConfig?: pulumi.Input<inputs.alb.ServerGroupStickySessionConfig>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The ID of the VPC that you want to access. **NOTE:** This parameter takes effect when the `serverGroupType` parameter is set to `Instance` or `Ip`.
     */
    vpcId?: pulumi.Input<string>;
}
