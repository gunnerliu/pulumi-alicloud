// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a CEN Transit Router VPC Attachment resource that associate the VPC with the CEN instance. [What is Cen Transit Router VPC Attachment](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtransitroutervpcattachment)
 *
 * > **NOTE:** Available since v1.126.0.
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
 * const default = alicloud.cen.getTransitRouterAvailableResources({});
 * const masterZone = _default.then(_default => _default.resources?.[0]?.masterZones?.[0]);
 * const slaveZone = _default.then(_default => _default.resources?.[0]?.slaveZones?.[1]);
 * const exampleNetwork = new alicloud.vpc.Network("exampleNetwork", {
 *     vpcName: name,
 *     cidrBlock: "192.168.0.0/16",
 * });
 * const exampleMaster = new alicloud.vpc.Switch("exampleMaster", {
 *     vswitchName: name,
 *     cidrBlock: "192.168.1.0/24",
 *     vpcId: exampleNetwork.id,
 *     zoneId: masterZone,
 * });
 * const exampleSlave = new alicloud.vpc.Switch("exampleSlave", {
 *     vswitchName: name,
 *     cidrBlock: "192.168.2.0/24",
 *     vpcId: exampleNetwork.id,
 *     zoneId: slaveZone,
 * });
 * const exampleInstance = new alicloud.cen.Instance("exampleInstance", {
 *     cenInstanceName: name,
 *     protectionLevel: "REDUCED",
 * });
 * const exampleTransitRouter = new alicloud.cen.TransitRouter("exampleTransitRouter", {
 *     transitRouterName: name,
 *     cenId: exampleInstance.id,
 * });
 * const exampleTransitRouterVpcAttachment = new alicloud.cen.TransitRouterVpcAttachment("exampleTransitRouterVpcAttachment", {
 *     cenId: exampleInstance.id,
 *     transitRouterId: exampleTransitRouter.transitRouterId,
 *     vpcId: exampleNetwork.id,
 *     zoneMappings: [
 *         {
 *             zoneId: masterZone,
 *             vswitchId: exampleMaster.id,
 *         },
 *         {
 *             zoneId: slaveZone,
 *             vswitchId: exampleSlave.id,
 *         },
 *     ],
 *     transitRouterAttachmentName: name,
 *     transitRouterAttachmentDescription: name,
 * });
 * ```
 *
 * ## Import
 *
 * CEN Transit Router VPC Attachment can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cen/transitRouterVpcAttachment:TransitRouterVpcAttachment example <cen_id>:<transit_router_attachment_id>
 * ```
 */
export class TransitRouterVpcAttachment extends pulumi.CustomResource {
    /**
     * Get an existing TransitRouterVpcAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TransitRouterVpcAttachmentState, opts?: pulumi.CustomResourceOptions): TransitRouterVpcAttachment {
        return new TransitRouterVpcAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cen/transitRouterVpcAttachment:TransitRouterVpcAttachment';

    /**
     * Returns true if the given object is an instance of TransitRouterVpcAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TransitRouterVpcAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TransitRouterVpcAttachment.__pulumiType;
    }

    /**
     * Whether the transit router is automatically published to the VPC instance. Default value: `false`. Valid values:
     */
    public readonly autoPublishRouteEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the CEN.
     */
    public readonly cenId!: pulumi.Output<string>;
    /**
     * The dry run.
     */
    public readonly dryRun!: pulumi.Output<boolean | undefined>;
    /**
     * The payment type of the resource. Default value: `PayAsYouGo`. Valid values: `PayAsYouGo`.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * The resource type of the transit router vpc attachment. Default value: `VPC`. Valid values: `VPC`.
     */
    public readonly resourceType!: pulumi.Output<string>;
    /**
     * Whether to enabled route table association. **NOTE:** "Field `routeTableAssociationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association."
     *
     * @deprecated Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud_cen_transit_router_route_table_association` instead.
     */
    public readonly routeTableAssociationEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to enabled route table propagation. **NOTE:** "Field `routeTablePropagationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation."
     *
     * @deprecated Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud_cen_transit_router_route_table_propagation` instead.
     */
    public readonly routeTablePropagationEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The associating status of the network.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The description of the transit router vbr attachment.
     */
    public readonly transitRouterAttachmentDescription!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Transit Router Attachment.
     */
    public /*out*/ readonly transitRouterAttachmentId!: pulumi.Output<string>;
    /**
     * The name of the transit router vbr attachment.
     */
    public readonly transitRouterAttachmentName!: pulumi.Output<string | undefined>;
    /**
     * The ID of the transit router.
     */
    public readonly transitRouterId!: pulumi.Output<string>;
    /**
     * The ID of the VPC.
     */
    public readonly vpcId!: pulumi.Output<string>;
    /**
     * The owner id of vpc.
     */
    public readonly vpcOwnerId!: pulumi.Output<string>;
    /**
     * The list of zone mapping of the VPC. See `zoneMappings` below. **NOTE:** From version 1.184.0, `zoneMappings` can be modified.
     * > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-listtransitrouteravailableresource)
     */
    public readonly zoneMappings!: pulumi.Output<outputs.cen.TransitRouterVpcAttachmentZoneMapping[]>;

    /**
     * Create a TransitRouterVpcAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TransitRouterVpcAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TransitRouterVpcAttachmentArgs | TransitRouterVpcAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TransitRouterVpcAttachmentState | undefined;
            resourceInputs["autoPublishRouteEnabled"] = state ? state.autoPublishRouteEnabled : undefined;
            resourceInputs["cenId"] = state ? state.cenId : undefined;
            resourceInputs["dryRun"] = state ? state.dryRun : undefined;
            resourceInputs["paymentType"] = state ? state.paymentType : undefined;
            resourceInputs["resourceType"] = state ? state.resourceType : undefined;
            resourceInputs["routeTableAssociationEnabled"] = state ? state.routeTableAssociationEnabled : undefined;
            resourceInputs["routeTablePropagationEnabled"] = state ? state.routeTablePropagationEnabled : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["transitRouterAttachmentDescription"] = state ? state.transitRouterAttachmentDescription : undefined;
            resourceInputs["transitRouterAttachmentId"] = state ? state.transitRouterAttachmentId : undefined;
            resourceInputs["transitRouterAttachmentName"] = state ? state.transitRouterAttachmentName : undefined;
            resourceInputs["transitRouterId"] = state ? state.transitRouterId : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
            resourceInputs["vpcOwnerId"] = state ? state.vpcOwnerId : undefined;
            resourceInputs["zoneMappings"] = state ? state.zoneMappings : undefined;
        } else {
            const args = argsOrState as TransitRouterVpcAttachmentArgs | undefined;
            if ((!args || args.cenId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cenId'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            if ((!args || args.zoneMappings === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneMappings'");
            }
            resourceInputs["autoPublishRouteEnabled"] = args ? args.autoPublishRouteEnabled : undefined;
            resourceInputs["cenId"] = args ? args.cenId : undefined;
            resourceInputs["dryRun"] = args ? args.dryRun : undefined;
            resourceInputs["paymentType"] = args ? args.paymentType : undefined;
            resourceInputs["resourceType"] = args ? args.resourceType : undefined;
            resourceInputs["routeTableAssociationEnabled"] = args ? args.routeTableAssociationEnabled : undefined;
            resourceInputs["routeTablePropagationEnabled"] = args ? args.routeTablePropagationEnabled : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["transitRouterAttachmentDescription"] = args ? args.transitRouterAttachmentDescription : undefined;
            resourceInputs["transitRouterAttachmentName"] = args ? args.transitRouterAttachmentName : undefined;
            resourceInputs["transitRouterId"] = args ? args.transitRouterId : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["vpcOwnerId"] = args ? args.vpcOwnerId : undefined;
            resourceInputs["zoneMappings"] = args ? args.zoneMappings : undefined;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["transitRouterAttachmentId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TransitRouterVpcAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TransitRouterVpcAttachment resources.
 */
export interface TransitRouterVpcAttachmentState {
    /**
     * Whether the transit router is automatically published to the VPC instance. Default value: `false`. Valid values:
     */
    autoPublishRouteEnabled?: pulumi.Input<boolean>;
    /**
     * The ID of the CEN.
     */
    cenId?: pulumi.Input<string>;
    /**
     * The dry run.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The payment type of the resource. Default value: `PayAsYouGo`. Valid values: `PayAsYouGo`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The resource type of the transit router vpc attachment. Default value: `VPC`. Valid values: `VPC`.
     */
    resourceType?: pulumi.Input<string>;
    /**
     * Whether to enabled route table association. **NOTE:** "Field `routeTableAssociationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association."
     *
     * @deprecated Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud_cen_transit_router_route_table_association` instead.
     */
    routeTableAssociationEnabled?: pulumi.Input<boolean>;
    /**
     * Whether to enabled route table propagation. **NOTE:** "Field `routeTablePropagationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation."
     *
     * @deprecated Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud_cen_transit_router_route_table_propagation` instead.
     */
    routeTablePropagationEnabled?: pulumi.Input<boolean>;
    /**
     * The associating status of the network.
     */
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The description of the transit router vbr attachment.
     */
    transitRouterAttachmentDescription?: pulumi.Input<string>;
    /**
     * The ID of the Transit Router Attachment.
     */
    transitRouterAttachmentId?: pulumi.Input<string>;
    /**
     * The name of the transit router vbr attachment.
     */
    transitRouterAttachmentName?: pulumi.Input<string>;
    /**
     * The ID of the transit router.
     */
    transitRouterId?: pulumi.Input<string>;
    /**
     * The ID of the VPC.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * The owner id of vpc.
     */
    vpcOwnerId?: pulumi.Input<string>;
    /**
     * The list of zone mapping of the VPC. See `zoneMappings` below. **NOTE:** From version 1.184.0, `zoneMappings` can be modified.
     * > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-listtransitrouteravailableresource)
     */
    zoneMappings?: pulumi.Input<pulumi.Input<inputs.cen.TransitRouterVpcAttachmentZoneMapping>[]>;
}

/**
 * The set of arguments for constructing a TransitRouterVpcAttachment resource.
 */
export interface TransitRouterVpcAttachmentArgs {
    /**
     * Whether the transit router is automatically published to the VPC instance. Default value: `false`. Valid values:
     */
    autoPublishRouteEnabled?: pulumi.Input<boolean>;
    /**
     * The ID of the CEN.
     */
    cenId: pulumi.Input<string>;
    /**
     * The dry run.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The payment type of the resource. Default value: `PayAsYouGo`. Valid values: `PayAsYouGo`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The resource type of the transit router vpc attachment. Default value: `VPC`. Valid values: `VPC`.
     */
    resourceType?: pulumi.Input<string>;
    /**
     * Whether to enabled route table association. **NOTE:** "Field `routeTableAssociationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association."
     *
     * @deprecated Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud_cen_transit_router_route_table_association` instead.
     */
    routeTableAssociationEnabled?: pulumi.Input<boolean>;
    /**
     * Whether to enabled route table propagation. **NOTE:** "Field `routeTablePropagationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation."
     *
     * @deprecated Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud_cen_transit_router_route_table_propagation` instead.
     */
    routeTablePropagationEnabled?: pulumi.Input<boolean>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The description of the transit router vbr attachment.
     */
    transitRouterAttachmentDescription?: pulumi.Input<string>;
    /**
     * The name of the transit router vbr attachment.
     */
    transitRouterAttachmentName?: pulumi.Input<string>;
    /**
     * The ID of the transit router.
     */
    transitRouterId?: pulumi.Input<string>;
    /**
     * The ID of the VPC.
     */
    vpcId: pulumi.Input<string>;
    /**
     * The owner id of vpc.
     */
    vpcOwnerId?: pulumi.Input<string>;
    /**
     * The list of zone mapping of the VPC. See `zoneMappings` below. **NOTE:** From version 1.184.0, `zoneMappings` can be modified.
     * > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-listtransitrouteravailableresource)
     */
    zoneMappings: pulumi.Input<pulumi.Input<inputs.cen.TransitRouterVpcAttachmentZoneMapping>[]>;
}
