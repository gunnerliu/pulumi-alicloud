// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## 
 *
 * ***
 * subcategory: "VPC"
 * layout: "alicloud"
 * page_title: "Alicloud: alicloud.vpc.FlowLog"
 * sidebar_current: "docs-alicloud-resource-vpc-flow-log"
 * description: |-
 *   Provides a Alicloud VPC Flow Log resource.
 * ---
 *
 * # alicloud\_vpc\_flow\_log
 *
 * Provides a VPC Flow Log resource.
 *
 * For information about VPC Flow log and how to use it, see [Flow log overview](https://www.alibabacloud.com/help/doc-detail/127150.htm).
 *
 * > **NOTE:** Available in v1.117.0+
 *
 * > **NOTE:** While it uses `alicloud.vpc.FlowLog` to build a vpc flow log resource, it will be active by default.
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
 * const name = config.get("name") || "terratest_vpc_flow_log";
 * const logStoreName = config.get("logStoreName") || "vpc-flow-log-for-vpc";
 * const projectName = config.get("projectName") || "vpc-flow-log-for-vpc";
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {cidrBlock: "192.168.0.0/24"});
 * const defaultFlowLog = new alicloud.vpc.FlowLog("defaultFlowLog", {
 *     resourceId: defaultNetwork.id,
 *     resourceType: "VPC",
 *     trafficType: "All",
 *     logStoreName: logStoreName,
 *     projectName: projectName,
 *     flowLogName: name,
 *     status: "Active",
 * }, {
 *     dependsOn: ["alicloud_vpc.default"],
 * });
 * ```
 *
 * ## Import
 *
 * VPC Flow Log can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:vpc/flowLog:FlowLog example fl-abc123456
 * ```
 */
export class FlowLog extends pulumi.CustomResource {
    /**
     * Get an existing FlowLog resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FlowLogState, opts?: pulumi.CustomResourceOptions): FlowLog {
        return new FlowLog(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/flowLog:FlowLog';

    /**
     * Returns true if the given object is an instance of FlowLog.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FlowLog {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FlowLog.__pulumiType;
    }

    /**
     * The Description of the VPC Flow Log.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The Name of the VPC Flow Log.
     */
    public readonly flowLogName!: pulumi.Output<string | undefined>;
    /**
     * The name of the logstore.
     */
    public readonly logStoreName!: pulumi.Output<string>;
    /**
     * The name of the project.
     */
    public readonly projectName!: pulumi.Output<string>;
    /**
     * The ID of the resource.
     */
    public readonly resourceId!: pulumi.Output<string>;
    /**
     * The type of the resource to capture traffic.
     */
    public readonly resourceType!: pulumi.Output<string>;
    /**
     * The status of the VPC Flow Log.
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * The type of traffic collected.
     */
    public readonly trafficType!: pulumi.Output<string>;

    /**
     * Create a FlowLog resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FlowLogArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FlowLogArgs | FlowLogState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FlowLogState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["flowLogName"] = state ? state.flowLogName : undefined;
            inputs["logStoreName"] = state ? state.logStoreName : undefined;
            inputs["projectName"] = state ? state.projectName : undefined;
            inputs["resourceId"] = state ? state.resourceId : undefined;
            inputs["resourceType"] = state ? state.resourceType : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["trafficType"] = state ? state.trafficType : undefined;
        } else {
            const args = argsOrState as FlowLogArgs | undefined;
            if ((!args || args.logStoreName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'logStoreName'");
            }
            if ((!args || args.projectName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectName'");
            }
            if ((!args || args.resourceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceId'");
            }
            if ((!args || args.resourceType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceType'");
            }
            if ((!args || args.trafficType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'trafficType'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["flowLogName"] = args ? args.flowLogName : undefined;
            inputs["logStoreName"] = args ? args.logStoreName : undefined;
            inputs["projectName"] = args ? args.projectName : undefined;
            inputs["resourceId"] = args ? args.resourceId : undefined;
            inputs["resourceType"] = args ? args.resourceType : undefined;
            inputs["status"] = args ? args.status : undefined;
            inputs["trafficType"] = args ? args.trafficType : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(FlowLog.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FlowLog resources.
 */
export interface FlowLogState {
    /**
     * The Description of the VPC Flow Log.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The Name of the VPC Flow Log.
     */
    readonly flowLogName?: pulumi.Input<string>;
    /**
     * The name of the logstore.
     */
    readonly logStoreName?: pulumi.Input<string>;
    /**
     * The name of the project.
     */
    readonly projectName?: pulumi.Input<string>;
    /**
     * The ID of the resource.
     */
    readonly resourceId?: pulumi.Input<string>;
    /**
     * The type of the resource to capture traffic.
     */
    readonly resourceType?: pulumi.Input<string>;
    /**
     * The status of the VPC Flow Log.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * The type of traffic collected.
     */
    readonly trafficType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FlowLog resource.
 */
export interface FlowLogArgs {
    /**
     * The Description of the VPC Flow Log.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The Name of the VPC Flow Log.
     */
    readonly flowLogName?: pulumi.Input<string>;
    /**
     * The name of the logstore.
     */
    readonly logStoreName: pulumi.Input<string>;
    /**
     * The name of the project.
     */
    readonly projectName: pulumi.Input<string>;
    /**
     * The ID of the resource.
     */
    readonly resourceId: pulumi.Input<string>;
    /**
     * The type of the resource to capture traffic.
     */
    readonly resourceType: pulumi.Input<string>;
    /**
     * The status of the VPC Flow Log.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * The type of traffic collected.
     */
    readonly trafficType: pulumi.Input<string>;
}
