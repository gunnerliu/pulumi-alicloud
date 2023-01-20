// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Enterprise Network (CEN) Transit Router Prefix List Association resource.
 *
 * For information about Cloud Enterprise Network (CEN) Transit Router Prefix List Association and how to use it, see [What is Transit Router Prefix List Association](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/createtransitrouterprefixlistassociation).
 *
 * > **NOTE:** Available in v1.188.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultAccount = alicloud.getAccount({});
 * const defaultPrefixList = new alicloud.vpc.PrefixList("defaultPrefixList", {entrys: [{
 *     cidr: "192.168.0.0/16",
 * }]});
 * const defaultInstance = new alicloud.cen.Instance("defaultInstance", {cenInstanceName: "tf-example"});
 * const defaultTransitRouter = new alicloud.cen.TransitRouter("defaultTransitRouter", {cenId: defaultInstance.id});
 * const defaultTransitRouterRouteTable = new alicloud.cen.TransitRouterRouteTable("defaultTransitRouterRouteTable", {transitRouterId: defaultTransitRouter.transitRouterId});
 * const defaultTransitRouterPrefixListAssociation = new alicloud.cen.TransitRouterPrefixListAssociation("defaultTransitRouterPrefixListAssociation", {
 *     prefixListId: defaultPrefixList.id,
 *     transitRouterId: defaultTransitRouter.transitRouterId,
 *     transitRouterTableId: defaultTransitRouterRouteTable.transitRouterRouteTableId,
 *     nextHop: "BlackHole",
 *     nextHopType: "BlackHole",
 *     ownerUid: defaultAccount.then(defaultAccount => defaultAccount.id),
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Enterprise Network (CEN) Transit Router Prefix List Association can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cen/transitRouterPrefixListAssociation:TransitRouterPrefixListAssociation default <prefix_list_id>:<transit_router_id>:<transit_router_table_id>:<next_hop>.
 * ```
 */
export class TransitRouterPrefixListAssociation extends pulumi.CustomResource {
    /**
     * Get an existing TransitRouterPrefixListAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TransitRouterPrefixListAssociationState, opts?: pulumi.CustomResourceOptions): TransitRouterPrefixListAssociation {
        return new TransitRouterPrefixListAssociation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cen/transitRouterPrefixListAssociation:TransitRouterPrefixListAssociation';

    /**
     * Returns true if the given object is an instance of TransitRouterPrefixListAssociation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TransitRouterPrefixListAssociation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TransitRouterPrefixListAssociation.__pulumiType;
    }

    /**
     * The ID of the next hop. **NOTE:** If `nextHop` is set to `BlackHole`, you must set this parameter to `BlackHole`.
     */
    public readonly nextHop!: pulumi.Output<string>;
    /**
     * The type of the next hop. Valid values:
     */
    public readonly nextHopType!: pulumi.Output<string>;
    /**
     * The ID of the Alibaba Cloud account to which the prefix list belongs.
     */
    public readonly ownerUid!: pulumi.Output<number>;
    /**
     * The ID of the prefix list.
     */
    public readonly prefixListId!: pulumi.Output<string>;
    /**
     * The status of the prefix list.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The ID of the transit router.
     */
    public readonly transitRouterId!: pulumi.Output<string>;
    /**
     * The ID of the route table of the transit router.
     */
    public readonly transitRouterTableId!: pulumi.Output<string>;

    /**
     * Create a TransitRouterPrefixListAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TransitRouterPrefixListAssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TransitRouterPrefixListAssociationArgs | TransitRouterPrefixListAssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TransitRouterPrefixListAssociationState | undefined;
            resourceInputs["nextHop"] = state ? state.nextHop : undefined;
            resourceInputs["nextHopType"] = state ? state.nextHopType : undefined;
            resourceInputs["ownerUid"] = state ? state.ownerUid : undefined;
            resourceInputs["prefixListId"] = state ? state.prefixListId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["transitRouterId"] = state ? state.transitRouterId : undefined;
            resourceInputs["transitRouterTableId"] = state ? state.transitRouterTableId : undefined;
        } else {
            const args = argsOrState as TransitRouterPrefixListAssociationArgs | undefined;
            if ((!args || args.nextHop === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nextHop'");
            }
            if ((!args || args.prefixListId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'prefixListId'");
            }
            if ((!args || args.transitRouterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitRouterId'");
            }
            if ((!args || args.transitRouterTableId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitRouterTableId'");
            }
            resourceInputs["nextHop"] = args ? args.nextHop : undefined;
            resourceInputs["nextHopType"] = args ? args.nextHopType : undefined;
            resourceInputs["ownerUid"] = args ? args.ownerUid : undefined;
            resourceInputs["prefixListId"] = args ? args.prefixListId : undefined;
            resourceInputs["transitRouterId"] = args ? args.transitRouterId : undefined;
            resourceInputs["transitRouterTableId"] = args ? args.transitRouterTableId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TransitRouterPrefixListAssociation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TransitRouterPrefixListAssociation resources.
 */
export interface TransitRouterPrefixListAssociationState {
    /**
     * The ID of the next hop. **NOTE:** If `nextHop` is set to `BlackHole`, you must set this parameter to `BlackHole`.
     */
    nextHop?: pulumi.Input<string>;
    /**
     * The type of the next hop. Valid values:
     */
    nextHopType?: pulumi.Input<string>;
    /**
     * The ID of the Alibaba Cloud account to which the prefix list belongs.
     */
    ownerUid?: pulumi.Input<number>;
    /**
     * The ID of the prefix list.
     */
    prefixListId?: pulumi.Input<string>;
    /**
     * The status of the prefix list.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the transit router.
     */
    transitRouterId?: pulumi.Input<string>;
    /**
     * The ID of the route table of the transit router.
     */
    transitRouterTableId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TransitRouterPrefixListAssociation resource.
 */
export interface TransitRouterPrefixListAssociationArgs {
    /**
     * The ID of the next hop. **NOTE:** If `nextHop` is set to `BlackHole`, you must set this parameter to `BlackHole`.
     */
    nextHop: pulumi.Input<string>;
    /**
     * The type of the next hop. Valid values:
     */
    nextHopType?: pulumi.Input<string>;
    /**
     * The ID of the Alibaba Cloud account to which the prefix list belongs.
     */
    ownerUid?: pulumi.Input<number>;
    /**
     * The ID of the prefix list.
     */
    prefixListId: pulumi.Input<string>;
    /**
     * The ID of the transit router.
     */
    transitRouterId: pulumi.Input<string>;
    /**
     * The ID of the route table of the transit router.
     */
    transitRouterTableId: pulumi.Input<string>;
}
