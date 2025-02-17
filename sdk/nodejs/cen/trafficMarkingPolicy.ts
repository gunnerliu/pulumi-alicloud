// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Enterprise Network (CEN) Traffic Marking Policy resource.
 *
 * For information about Cloud Enterprise Network (CEN) Traffic Marking Policy and how to use it, see [What is Traffic Marking Policy](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtrafficmarkingpolicy).
 *
 * > **NOTE:** Available since v1.173.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const exampleInstance = new alicloud.cen.Instance("exampleInstance", {
 *     cenInstanceName: "tf_example",
 *     description: "an example for cen",
 * });
 * const exampleTransitRouter = new alicloud.cen.TransitRouter("exampleTransitRouter", {
 *     transitRouterName: "tf_example",
 *     cenId: exampleInstance.id,
 * });
 * const exampleTrafficMarkingPolicy = new alicloud.cen.TrafficMarkingPolicy("exampleTrafficMarkingPolicy", {
 *     markingDscp: 1,
 *     priority: 1,
 *     trafficMarkingPolicyName: "tf_example",
 *     transitRouterId: exampleTransitRouter.transitRouterId,
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Enterprise Network (CEN) Traffic Marking Policy can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cen/trafficMarkingPolicy:TrafficMarkingPolicy example <transit_router_id>:<traffic_marking_policy_id>
 * ```
 */
export class TrafficMarkingPolicy extends pulumi.CustomResource {
    /**
     * Get an existing TrafficMarkingPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TrafficMarkingPolicyState, opts?: pulumi.CustomResourceOptions): TrafficMarkingPolicy {
        return new TrafficMarkingPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cen/trafficMarkingPolicy:TrafficMarkingPolicy';

    /**
     * Returns true if the given object is an instance of TrafficMarkingPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TrafficMarkingPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TrafficMarkingPolicy.__pulumiType;
    }

    /**
     * The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The dry run.
     */
    public readonly dryRun!: pulumi.Output<boolean | undefined>;
    /**
     * The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
     */
    public readonly markingDscp!: pulumi.Output<number>;
    /**
     * The Priority of the Traffic Marking Policy. Value range: 1~100.
     */
    public readonly priority!: pulumi.Output<number>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The ID of the Traffic Marking Policy.
     */
    public /*out*/ readonly trafficMarkingPolicyId!: pulumi.Output<string>;
    /**
     * The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     */
    public readonly trafficMarkingPolicyName!: pulumi.Output<string | undefined>;
    /**
     * The ID of the transit router.
     */
    public readonly transitRouterId!: pulumi.Output<string>;

    /**
     * Create a TrafficMarkingPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TrafficMarkingPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TrafficMarkingPolicyArgs | TrafficMarkingPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TrafficMarkingPolicyState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["dryRun"] = state ? state.dryRun : undefined;
            resourceInputs["markingDscp"] = state ? state.markingDscp : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["trafficMarkingPolicyId"] = state ? state.trafficMarkingPolicyId : undefined;
            resourceInputs["trafficMarkingPolicyName"] = state ? state.trafficMarkingPolicyName : undefined;
            resourceInputs["transitRouterId"] = state ? state.transitRouterId : undefined;
        } else {
            const args = argsOrState as TrafficMarkingPolicyArgs | undefined;
            if ((!args || args.markingDscp === undefined) && !opts.urn) {
                throw new Error("Missing required property 'markingDscp'");
            }
            if ((!args || args.priority === undefined) && !opts.urn) {
                throw new Error("Missing required property 'priority'");
            }
            if ((!args || args.transitRouterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitRouterId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["dryRun"] = args ? args.dryRun : undefined;
            resourceInputs["markingDscp"] = args ? args.markingDscp : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["trafficMarkingPolicyName"] = args ? args.trafficMarkingPolicyName : undefined;
            resourceInputs["transitRouterId"] = args ? args.transitRouterId : undefined;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["trafficMarkingPolicyId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TrafficMarkingPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TrafficMarkingPolicy resources.
 */
export interface TrafficMarkingPolicyState {
    /**
     * The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     */
    description?: pulumi.Input<string>;
    /**
     * The dry run.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
     */
    markingDscp?: pulumi.Input<number>;
    /**
     * The Priority of the Traffic Marking Policy. Value range: 1~100.
     */
    priority?: pulumi.Input<number>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the Traffic Marking Policy.
     */
    trafficMarkingPolicyId?: pulumi.Input<string>;
    /**
     * The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     */
    trafficMarkingPolicyName?: pulumi.Input<string>;
    /**
     * The ID of the transit router.
     */
    transitRouterId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TrafficMarkingPolicy resource.
 */
export interface TrafficMarkingPolicyArgs {
    /**
     * The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     */
    description?: pulumi.Input<string>;
    /**
     * The dry run.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
     */
    markingDscp: pulumi.Input<number>;
    /**
     * The Priority of the Traffic Marking Policy. Value range: 1~100.
     */
    priority: pulumi.Input<number>;
    /**
     * The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     */
    trafficMarkingPolicyName?: pulumi.Input<string>;
    /**
     * The ID of the transit router.
     */
    transitRouterId: pulumi.Input<string>;
}
