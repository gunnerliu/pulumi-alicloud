// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Monitor Service Hybrid Monitor Fc Task resource.
 *
 * For information about Cloud Monitor Service Hybrid Monitor Fc Task and how to use it, see [What is Hybrid Monitor Fc Task](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createhybridmonitortask).
 *
 * > **NOTE:** Available in v1.179.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.cms.HybridMonitorFcTask("example", {
 *     namespace: "example_value",
 *     targetUserId: "example_value",
 *     yarmConfig: "example_value",
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Monitor Service Hybrid Monitor Fc Task can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cms/hybridMonitorFcTask:HybridMonitorFcTask example <hybrid_monitor_fc_task_id>:<namespace>
 * ```
 */
export class HybridMonitorFcTask extends pulumi.CustomResource {
    /**
     * Get an existing HybridMonitorFcTask resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HybridMonitorFcTaskState, opts?: pulumi.CustomResourceOptions): HybridMonitorFcTask {
        return new HybridMonitorFcTask(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cms/hybridMonitorFcTask:HybridMonitorFcTask';

    /**
     * Returns true if the given object is an instance of HybridMonitorFcTask.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is HybridMonitorFcTask {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === HybridMonitorFcTask.__pulumiType;
    }

    /**
     * The ID of the monitoring task.
     */
    public /*out*/ readonly hybridMonitorFcTaskId!: pulumi.Output<string>;
    /**
     * the namespace of the Alibaba Cloud service.
     */
    public readonly namespace!: pulumi.Output<string>;
    /**
     * The ID of the member account. If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in Resource Directory to Hybrid Cloud Monitoring. You can use Resource Directory to monitor Alibaba Cloud services across enterprise accounts.
     */
    public readonly targetUserId!: pulumi.Output<string>;
    /**
     * The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.
     */
    public readonly yarmConfig!: pulumi.Output<string>;

    /**
     * Create a HybridMonitorFcTask resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HybridMonitorFcTaskArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HybridMonitorFcTaskArgs | HybridMonitorFcTaskState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HybridMonitorFcTaskState | undefined;
            resourceInputs["hybridMonitorFcTaskId"] = state ? state.hybridMonitorFcTaskId : undefined;
            resourceInputs["namespace"] = state ? state.namespace : undefined;
            resourceInputs["targetUserId"] = state ? state.targetUserId : undefined;
            resourceInputs["yarmConfig"] = state ? state.yarmConfig : undefined;
        } else {
            const args = argsOrState as HybridMonitorFcTaskArgs | undefined;
            if ((!args || args.namespace === undefined) && !opts.urn) {
                throw new Error("Missing required property 'namespace'");
            }
            if ((!args || args.yarmConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'yarmConfig'");
            }
            resourceInputs["namespace"] = args ? args.namespace : undefined;
            resourceInputs["targetUserId"] = args ? args.targetUserId : undefined;
            resourceInputs["yarmConfig"] = args ? args.yarmConfig : undefined;
            resourceInputs["hybridMonitorFcTaskId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(HybridMonitorFcTask.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering HybridMonitorFcTask resources.
 */
export interface HybridMonitorFcTaskState {
    /**
     * The ID of the monitoring task.
     */
    hybridMonitorFcTaskId?: pulumi.Input<string>;
    /**
     * the namespace of the Alibaba Cloud service.
     */
    namespace?: pulumi.Input<string>;
    /**
     * The ID of the member account. If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in Resource Directory to Hybrid Cloud Monitoring. You can use Resource Directory to monitor Alibaba Cloud services across enterprise accounts.
     */
    targetUserId?: pulumi.Input<string>;
    /**
     * The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.
     */
    yarmConfig?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a HybridMonitorFcTask resource.
 */
export interface HybridMonitorFcTaskArgs {
    /**
     * the namespace of the Alibaba Cloud service.
     */
    namespace: pulumi.Input<string>;
    /**
     * The ID of the member account. If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in Resource Directory to Hybrid Cloud Monitoring. You can use Resource Directory to monitor Alibaba Cloud services across enterprise accounts.
     */
    targetUserId?: pulumi.Input<string>;
    /**
     * The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.
     */
    yarmConfig: pulumi.Input<string>;
}