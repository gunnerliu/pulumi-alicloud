import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a CEN route entry resource. Cloud Enterprise Network (CEN) supports publishing and withdrawing route entries of attached networks. You can publish a route entry of an attached VPC or VBR to a CEN instance, then other attached networks can learn the route if there is no route conflict. You can withdraw a published route entry when CEN does not need it any more.
 *
 * For information about CEN route entries publishment and how to use it, see [Manage network routes](https://www.alibabacloud.com/help/doc-detail/86980.htm).
 */
export declare class RouteEntry extends pulumi.CustomResource {
    /**
     * Get an existing RouteEntry resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouteEntryState): RouteEntry;
    /**
     * The destination CIDR block of the route entry to publish.
     */
    readonly cidrBlock: pulumi.Output<string>;
    /**
     * The ID of the CEN.
     */
    readonly instanceId: pulumi.Output<string>;
    /**
     * The route table of the attached VBR or VPC.
     */
    readonly routeTableId: pulumi.Output<string>;
    /**
     * Create a RouteEntry resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouteEntryArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering RouteEntry resources.
 */
export interface RouteEntryState {
    /**
     * The destination CIDR block of the route entry to publish.
     */
    readonly cidrBlock?: pulumi.Input<string>;
    /**
     * The ID of the CEN.
     */
    readonly instanceId?: pulumi.Input<string>;
    /**
     * The route table of the attached VBR or VPC.
     */
    readonly routeTableId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a RouteEntry resource.
 */
export interface RouteEntryArgs {
    /**
     * The destination CIDR block of the route entry to publish.
     */
    readonly cidrBlock: pulumi.Input<string>;
    /**
     * The ID of the CEN.
     */
    readonly instanceId: pulumi.Input<string>;
    /**
     * The route table of the attached VBR or VPC.
     */
    readonly routeTableId: pulumi.Input<string>;
}