// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a CEN transit router resource that associate the transitRouter with the CEN instance.[What is Cen Transit Router](https://help.aliyun.com/document_detail/261169.html)
 *
 * > **NOTE:** Available in 1.126.0+
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
 * const name = config.get("name") || "tf-testAccCenTransitRouter";
 * const defaultInstance = new alicloud.cen.Instance("defaultInstance", {description: "terraform01"});
 * const defaultTransitRouter = new alicloud.cen.TransitRouter("defaultTransitRouter", {
 *     name: name,
 *     cenId: defaultInstance.id,
 * });
 * ```
 *
 * ## Import
 *
 * CEN instance can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cen/transitRouter:TransitRouter default cen-*****:tr-*******
 * ```
 */
export class TransitRouter extends pulumi.CustomResource {
    /**
     * Get an existing TransitRouter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TransitRouterState, opts?: pulumi.CustomResourceOptions): TransitRouter {
        return new TransitRouter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cen/transitRouter:TransitRouter';

    /**
     * Returns true if the given object is an instance of TransitRouter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TransitRouter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TransitRouter.__pulumiType;
    }

    /**
     * The ID of the CEN.
     */
    public readonly cenId!: pulumi.Output<string>;
    /**
     * The dry run.
     */
    public readonly dryRun!: pulumi.Output<boolean | undefined>;
    /**
     * The associating status of the Transit Router.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The description of the transit router.
     */
    public readonly transitRouterDescription!: pulumi.Output<string | undefined>;
    public /*out*/ readonly transitRouterId!: pulumi.Output<string>;
    /**
     * The name of the transit router.
     */
    public readonly transitRouterName!: pulumi.Output<string | undefined>;
    /**
     * The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;

    /**
     * Create a TransitRouter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TransitRouterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TransitRouterArgs | TransitRouterState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TransitRouterState | undefined;
            inputs["cenId"] = state ? state.cenId : undefined;
            inputs["dryRun"] = state ? state.dryRun : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["transitRouterDescription"] = state ? state.transitRouterDescription : undefined;
            inputs["transitRouterId"] = state ? state.transitRouterId : undefined;
            inputs["transitRouterName"] = state ? state.transitRouterName : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as TransitRouterArgs | undefined;
            if ((!args || args.cenId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cenId'");
            }
            inputs["cenId"] = args ? args.cenId : undefined;
            inputs["dryRun"] = args ? args.dryRun : undefined;
            inputs["transitRouterDescription"] = args ? args.transitRouterDescription : undefined;
            inputs["transitRouterName"] = args ? args.transitRouterName : undefined;
            inputs["status"] = undefined /*out*/;
            inputs["transitRouterId"] = undefined /*out*/;
            inputs["type"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(TransitRouter.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TransitRouter resources.
 */
export interface TransitRouterState {
    /**
     * The ID of the CEN.
     */
    readonly cenId?: pulumi.Input<string>;
    /**
     * The dry run.
     */
    readonly dryRun?: pulumi.Input<boolean>;
    /**
     * The associating status of the Transit Router.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * The description of the transit router.
     */
    readonly transitRouterDescription?: pulumi.Input<string>;
    readonly transitRouterId?: pulumi.Input<string>;
    /**
     * The name of the transit router.
     */
    readonly transitRouterName?: pulumi.Input<string>;
    /**
     * The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
     */
    readonly type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TransitRouter resource.
 */
export interface TransitRouterArgs {
    /**
     * The ID of the CEN.
     */
    readonly cenId: pulumi.Input<string>;
    /**
     * The dry run.
     */
    readonly dryRun?: pulumi.Input<boolean>;
    /**
     * The description of the transit router.
     */
    readonly transitRouterDescription?: pulumi.Input<string>;
    /**
     * The name of the transit router.
     */
    readonly transitRouterName?: pulumi.Input<string>;
}
