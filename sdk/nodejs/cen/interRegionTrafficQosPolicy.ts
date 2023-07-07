// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Enterprise Network (CEN) Inter Region Traffic Qos Policy resource.
 *
 * For information about Cloud Enterprise Network (CEN) Inter Region Traffic Qos Policy and how to use it, see [What is Inter Region Traffic Qos Policy](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-createceninterregiontrafficqospolicy).
 *
 * > **NOTE:** Available since v1.195.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const bj = new alicloud.Provider("bj", {region: "cn-beijing"});
 * const hz = new alicloud.Provider("hz", {region: "cn-hangzhou"});
 * const defaultInstance = new alicloud.cen.Instance("defaultInstance", {cenInstanceName: "tf-example"}, {
 *     provider: alicloud.hz,
 * });
 * const defaultBandwidthPackage = new alicloud.cen.BandwidthPackage("defaultBandwidthPackage", {
 *     bandwidth: 5,
 *     geographicRegionAId: "China",
 *     geographicRegionBId: "China",
 * }, {
 *     provider: alicloud.hz,
 * });
 * const defaultBandwidthPackageAttachment = new alicloud.cen.BandwidthPackageAttachment("defaultBandwidthPackageAttachment", {
 *     instanceId: defaultInstance.id,
 *     bandwidthPackageId: defaultBandwidthPackage.id,
 * }, {
 *     provider: alicloud.hz,
 * });
 * const hzTransitRouter = new alicloud.cen.TransitRouter("hzTransitRouter", {cenId: defaultBandwidthPackageAttachment.instanceId}, {
 *     provider: alicloud.hz,
 * });
 * const bjTransitRouter = new alicloud.cen.TransitRouter("bjTransitRouter", {cenId: hzTransitRouter.cenId}, {
 *     provider: alicloud.bj,
 * });
 * const defaultTransitRouterPeerAttachment = new alicloud.cen.TransitRouterPeerAttachment("defaultTransitRouterPeerAttachment", {
 *     cenId: defaultInstance.id,
 *     transitRouterId: hzTransitRouter.transitRouterId,
 *     peerTransitRouterRegionId: "cn-beijing",
 *     peerTransitRouterId: bjTransitRouter.transitRouterId,
 *     cenBandwidthPackageId: defaultBandwidthPackageAttachment.bandwidthPackageId,
 *     bandwidth: 5,
 * }, {
 *     provider: alicloud.hz,
 * });
 * const defaultInterRegionTrafficQosPolicy = new alicloud.cen.InterRegionTrafficQosPolicy("defaultInterRegionTrafficQosPolicy", {
 *     transitRouterId: hzTransitRouter.transitRouterId,
 *     transitRouterAttachmentId: defaultTransitRouterPeerAttachment.transitRouterAttachmentId,
 *     interRegionTrafficQosPolicyName: "tf-example-name",
 *     interRegionTrafficQosPolicyDescription: "tf-example-description",
 * }, {
 *     provider: alicloud.hz,
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Enterprise Network (CEN) Inter Region Traffic Qos Policy can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cen/interRegionTrafficQosPolicy:InterRegionTrafficQosPolicy example <id>
 * ```
 */
export class InterRegionTrafficQosPolicy extends pulumi.CustomResource {
    /**
     * Get an existing InterRegionTrafficQosPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InterRegionTrafficQosPolicyState, opts?: pulumi.CustomResourceOptions): InterRegionTrafficQosPolicy {
        return new InterRegionTrafficQosPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cen/interRegionTrafficQosPolicy:InterRegionTrafficQosPolicy';

    /**
     * Returns true if the given object is an instance of InterRegionTrafficQosPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InterRegionTrafficQosPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InterRegionTrafficQosPolicy.__pulumiType;
    }

    /**
     * The description of the QoS policy. The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The description must start with a letter.
     */
    public readonly interRegionTrafficQosPolicyDescription!: pulumi.Output<string | undefined>;
    /**
     * The name of the QoS policy. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
     */
    public readonly interRegionTrafficQosPolicyName!: pulumi.Output<string | undefined>;
    /**
     * The status of the Inter Region Traffic Qos Policy.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The ID of the inter-region connection.
     */
    public readonly transitRouterAttachmentId!: pulumi.Output<string>;
    /**
     * The ID of the transit router.
     */
    public readonly transitRouterId!: pulumi.Output<string>;

    /**
     * Create a InterRegionTrafficQosPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InterRegionTrafficQosPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InterRegionTrafficQosPolicyArgs | InterRegionTrafficQosPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InterRegionTrafficQosPolicyState | undefined;
            resourceInputs["interRegionTrafficQosPolicyDescription"] = state ? state.interRegionTrafficQosPolicyDescription : undefined;
            resourceInputs["interRegionTrafficQosPolicyName"] = state ? state.interRegionTrafficQosPolicyName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["transitRouterAttachmentId"] = state ? state.transitRouterAttachmentId : undefined;
            resourceInputs["transitRouterId"] = state ? state.transitRouterId : undefined;
        } else {
            const args = argsOrState as InterRegionTrafficQosPolicyArgs | undefined;
            if ((!args || args.transitRouterAttachmentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitRouterAttachmentId'");
            }
            if ((!args || args.transitRouterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitRouterId'");
            }
            resourceInputs["interRegionTrafficQosPolicyDescription"] = args ? args.interRegionTrafficQosPolicyDescription : undefined;
            resourceInputs["interRegionTrafficQosPolicyName"] = args ? args.interRegionTrafficQosPolicyName : undefined;
            resourceInputs["transitRouterAttachmentId"] = args ? args.transitRouterAttachmentId : undefined;
            resourceInputs["transitRouterId"] = args ? args.transitRouterId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InterRegionTrafficQosPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InterRegionTrafficQosPolicy resources.
 */
export interface InterRegionTrafficQosPolicyState {
    /**
     * The description of the QoS policy. The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The description must start with a letter.
     */
    interRegionTrafficQosPolicyDescription?: pulumi.Input<string>;
    /**
     * The name of the QoS policy. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
     */
    interRegionTrafficQosPolicyName?: pulumi.Input<string>;
    /**
     * The status of the Inter Region Traffic Qos Policy.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the inter-region connection.
     */
    transitRouterAttachmentId?: pulumi.Input<string>;
    /**
     * The ID of the transit router.
     */
    transitRouterId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InterRegionTrafficQosPolicy resource.
 */
export interface InterRegionTrafficQosPolicyArgs {
    /**
     * The description of the QoS policy. The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The description must start with a letter.
     */
    interRegionTrafficQosPolicyDescription?: pulumi.Input<string>;
    /**
     * The name of the QoS policy. The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
     */
    interRegionTrafficQosPolicyName?: pulumi.Input<string>;
    /**
     * The ID of the inter-region connection.
     */
    transitRouterAttachmentId: pulumi.Input<string>;
    /**
     * The ID of the transit router.
     */
    transitRouterId: pulumi.Input<string>;
}
