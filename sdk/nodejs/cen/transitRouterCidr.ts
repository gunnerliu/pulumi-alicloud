// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Enterprise Network (CEN) Transit Router Cidr resource.
 *
 * For information about Cloud Enterprise Network (CEN) Transit Router Cidr and how to use it, see [What is Transit Router Cidr](https://www.alibabacloud.com/help/zh/cloud-enterprise-network/latest/createtransitroutercidr).
 *
 * > **NOTE:** Available in v1.193.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultInstance = new alicloud.cen.Instance("defaultInstance", {cenInstanceName: "tf-example"});
 * const defaultTransitRouter = new alicloud.cen.TransitRouter("defaultTransitRouter", {cenId: defaultInstance.id});
 * const defaultTransitRouterCidr = new alicloud.cen.TransitRouterCidr("defaultTransitRouterCidr", {
 *     transitRouterId: defaultTransitRouter.transitRouterId,
 *     cidr: "192.168.0.0/16",
 *     transitRouterCidrName: "tf-example-name",
 *     description: "tf-example-description",
 *     publishCidrRoute: true,
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Enterprise Network (CEN) Transit Router Cidr can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cen/transitRouterCidr:TransitRouterCidr default <transit_router_id>:<transit_router_cidr_id>.
 * ```
 */
export class TransitRouterCidr extends pulumi.CustomResource {
    /**
     * Get an existing TransitRouterCidr resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TransitRouterCidrState, opts?: pulumi.CustomResourceOptions): TransitRouterCidr {
        return new TransitRouterCidr(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cen/transitRouterCidr:TransitRouterCidr';

    /**
     * Returns true if the given object is an instance of TransitRouterCidr.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TransitRouterCidr {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TransitRouterCidr.__pulumiType;
    }

    /**
     * The cidr of the transit router.
     */
    public readonly cidr!: pulumi.Output<string>;
    /**
     * The description of the transit router. The description must be `2` to `256` characters in length, and it must start with English letters, but cannot start with `http://` or `https://`.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether to allow automatically adding Transit Router Cidr in Transit Router Route Table. Valid values: `true` and `false`. Default value: `true`.
     */
    public readonly publishCidrRoute!: pulumi.Output<boolean>;
    /**
     * The ID of the transit router cidr.
     */
    public /*out*/ readonly transitRouterCidrId!: pulumi.Output<string>;
    /**
     * The name of the transit router. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
     */
    public readonly transitRouterCidrName!: pulumi.Output<string | undefined>;
    /**
     * The ID of the transit router.
     */
    public readonly transitRouterId!: pulumi.Output<string>;

    /**
     * Create a TransitRouterCidr resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TransitRouterCidrArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TransitRouterCidrArgs | TransitRouterCidrState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TransitRouterCidrState | undefined;
            resourceInputs["cidr"] = state ? state.cidr : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["publishCidrRoute"] = state ? state.publishCidrRoute : undefined;
            resourceInputs["transitRouterCidrId"] = state ? state.transitRouterCidrId : undefined;
            resourceInputs["transitRouterCidrName"] = state ? state.transitRouterCidrName : undefined;
            resourceInputs["transitRouterId"] = state ? state.transitRouterId : undefined;
        } else {
            const args = argsOrState as TransitRouterCidrArgs | undefined;
            if ((!args || args.cidr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cidr'");
            }
            if ((!args || args.transitRouterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitRouterId'");
            }
            resourceInputs["cidr"] = args ? args.cidr : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["publishCidrRoute"] = args ? args.publishCidrRoute : undefined;
            resourceInputs["transitRouterCidrName"] = args ? args.transitRouterCidrName : undefined;
            resourceInputs["transitRouterId"] = args ? args.transitRouterId : undefined;
            resourceInputs["transitRouterCidrId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TransitRouterCidr.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TransitRouterCidr resources.
 */
export interface TransitRouterCidrState {
    /**
     * The cidr of the transit router.
     */
    cidr?: pulumi.Input<string>;
    /**
     * The description of the transit router. The description must be `2` to `256` characters in length, and it must start with English letters, but cannot start with `http://` or `https://`.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether to allow automatically adding Transit Router Cidr in Transit Router Route Table. Valid values: `true` and `false`. Default value: `true`.
     */
    publishCidrRoute?: pulumi.Input<boolean>;
    /**
     * The ID of the transit router cidr.
     */
    transitRouterCidrId?: pulumi.Input<string>;
    /**
     * The name of the transit router. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
     */
    transitRouterCidrName?: pulumi.Input<string>;
    /**
     * The ID of the transit router.
     */
    transitRouterId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TransitRouterCidr resource.
 */
export interface TransitRouterCidrArgs {
    /**
     * The cidr of the transit router.
     */
    cidr: pulumi.Input<string>;
    /**
     * The description of the transit router. The description must be `2` to `256` characters in length, and it must start with English letters, but cannot start with `http://` or `https://`.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether to allow automatically adding Transit Router Cidr in Transit Router Route Table. Valid values: `true` and `false`. Default value: `true`.
     */
    publishCidrRoute?: pulumi.Input<boolean>;
    /**
     * The name of the transit router. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
     */
    transitRouterCidrName?: pulumi.Input<string>;
    /**
     * The ID of the transit router.
     */
    transitRouterId: pulumi.Input<string>;
}
