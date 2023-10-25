// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cen Inter Region Traffic Qos Queue resource.
 *
 * For information about Cen Inter Region Traffic Qos Queue and how to use it, see [What is Inter Region Traffic Qos Queue](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createceninterregiontrafficqosqueue).
 *
 * > **NOTE:** Available since v1.195.0.
 *
 * ## Import
 *
 * Cen Inter Region Traffic Qos Queue can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cen/interRegionTrafficQosQueue:InterRegionTrafficQosQueue example <id>
 * ```
 */
export class InterRegionTrafficQosQueue extends pulumi.CustomResource {
    /**
     * Get an existing InterRegionTrafficQosQueue resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InterRegionTrafficQosQueueState, opts?: pulumi.CustomResourceOptions): InterRegionTrafficQosQueue {
        return new InterRegionTrafficQosQueue(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cen/interRegionTrafficQosQueue:InterRegionTrafficQosQueue';

    /**
     * Returns true if the given object is an instance of InterRegionTrafficQosQueue.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InterRegionTrafficQosQueue {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InterRegionTrafficQosQueue.__pulumiType;
    }

    /**
     * The DSCP value of the traffic packet to be matched in the current queue, ranging from 0 to 63.
     */
    public readonly dscps!: pulumi.Output<string[]>;
    /**
     * The description information of the traffic scheduling policy.
     */
    public readonly interRegionTrafficQosQueueDescription!: pulumi.Output<string | undefined>;
    /**
     * The name of the traffic scheduling policy.
     */
    public readonly interRegionTrafficQosQueueName!: pulumi.Output<string | undefined>;
    /**
     * The percentage of cross-region bandwidth that the current queue can use.
     */
    public readonly remainBandwidthPercent!: pulumi.Output<number>;
    /**
     * The status of the traffic scheduling policy. -**Creating**: The function is being created.-**Active**: available.-**Modifying**: is being modified.-**Deleting**: Deleted.-**Deleted**: Deleted.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The ID of the traffic scheduling policy.
     */
    public readonly trafficQosPolicyId!: pulumi.Output<string>;

    /**
     * Create a InterRegionTrafficQosQueue resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InterRegionTrafficQosQueueArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InterRegionTrafficQosQueueArgs | InterRegionTrafficQosQueueState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InterRegionTrafficQosQueueState | undefined;
            resourceInputs["dscps"] = state ? state.dscps : undefined;
            resourceInputs["interRegionTrafficQosQueueDescription"] = state ? state.interRegionTrafficQosQueueDescription : undefined;
            resourceInputs["interRegionTrafficQosQueueName"] = state ? state.interRegionTrafficQosQueueName : undefined;
            resourceInputs["remainBandwidthPercent"] = state ? state.remainBandwidthPercent : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["trafficQosPolicyId"] = state ? state.trafficQosPolicyId : undefined;
        } else {
            const args = argsOrState as InterRegionTrafficQosQueueArgs | undefined;
            if ((!args || args.dscps === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dscps'");
            }
            if ((!args || args.remainBandwidthPercent === undefined) && !opts.urn) {
                throw new Error("Missing required property 'remainBandwidthPercent'");
            }
            if ((!args || args.trafficQosPolicyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'trafficQosPolicyId'");
            }
            resourceInputs["dscps"] = args ? args.dscps : undefined;
            resourceInputs["interRegionTrafficQosQueueDescription"] = args ? args.interRegionTrafficQosQueueDescription : undefined;
            resourceInputs["interRegionTrafficQosQueueName"] = args ? args.interRegionTrafficQosQueueName : undefined;
            resourceInputs["remainBandwidthPercent"] = args ? args.remainBandwidthPercent : undefined;
            resourceInputs["trafficQosPolicyId"] = args ? args.trafficQosPolicyId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InterRegionTrafficQosQueue.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InterRegionTrafficQosQueue resources.
 */
export interface InterRegionTrafficQosQueueState {
    /**
     * The DSCP value of the traffic packet to be matched in the current queue, ranging from 0 to 63.
     */
    dscps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The description information of the traffic scheduling policy.
     */
    interRegionTrafficQosQueueDescription?: pulumi.Input<string>;
    /**
     * The name of the traffic scheduling policy.
     */
    interRegionTrafficQosQueueName?: pulumi.Input<string>;
    /**
     * The percentage of cross-region bandwidth that the current queue can use.
     */
    remainBandwidthPercent?: pulumi.Input<number>;
    /**
     * The status of the traffic scheduling policy. -**Creating**: The function is being created.-**Active**: available.-**Modifying**: is being modified.-**Deleting**: Deleted.-**Deleted**: Deleted.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the traffic scheduling policy.
     */
    trafficQosPolicyId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InterRegionTrafficQosQueue resource.
 */
export interface InterRegionTrafficQosQueueArgs {
    /**
     * The DSCP value of the traffic packet to be matched in the current queue, ranging from 0 to 63.
     */
    dscps: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The description information of the traffic scheduling policy.
     */
    interRegionTrafficQosQueueDescription?: pulumi.Input<string>;
    /**
     * The name of the traffic scheduling policy.
     */
    interRegionTrafficQosQueueName?: pulumi.Input<string>;
    /**
     * The percentage of cross-region bandwidth that the current queue can use.
     */
    remainBandwidthPercent: pulumi.Input<number>;
    /**
     * The ID of the traffic scheduling policy.
     */
    trafficQosPolicyId: pulumi.Input<string>;
}
