// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a CEN transit router VPC attachment resource that associate the VPC with the CEN instance. [What is Cen Transit Router VPC Attachment](https://help.aliyun.com/document_detail/261358.html)
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
 * const transitRouterAttachmentName = config.get("transitRouterAttachmentName") || "sdk_rebot_cen_tr_yaochi";
 * const transitRouterAttachmentDescription = config.get("transitRouterAttachmentDescription") || "sdk_rebot_cen_tr_yaochi";
 * const defaultTransitRouterAvailableResources = alicloud.cen.getTransitRouterAvailableResources({});
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {
 *     vpcName: "sdk_rebot_cen_tr_yaochi",
 *     cidrBlock: "192.168.0.0/16",
 * });
 * const defaultMaster = new alicloud.vpc.Switch("defaultMaster", {
 *     vswitchName: "sdk_rebot_cen_tr_yaochi",
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "192.168.1.0/24",
 *     zoneId: defaultTransitRouterAvailableResources.then(defaultTransitRouterAvailableResources => defaultTransitRouterAvailableResources.resources?.[0]?.masterZones?.[0]),
 * });
 * const defaultSlave = new alicloud.vpc.Switch("defaultSlave", {
 *     vswitchName: "sdk_rebot_cen_tr_yaochi",
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "192.168.2.0/24",
 *     zoneId: defaultTransitRouterAvailableResources.then(defaultTransitRouterAvailableResources => defaultTransitRouterAvailableResources.resources?.[0]?.slaveZones?.[0]),
 * });
 * const defaultInstance = new alicloud.cen.Instance("defaultInstance", {
 *     cenInstanceName: "sdk_rebot_cen_tr_yaochi",
 *     protectionLevel: "REDUCED",
 * });
 * const defaultTransitRouter = new alicloud.cen.TransitRouter("defaultTransitRouter", {cenId: defaultInstance.id});
 * const defaultTransitRouterVpcAttachment = new alicloud.cen.TransitRouterVpcAttachment("defaultTransitRouterVpcAttachment", {
 *     cenId: defaultInstance.id,
 *     transitRouterId: defaultTransitRouter.transitRouterId,
 *     vpcId: defaultNetwork.id,
 *     zoneMappings: [
 *         {
 *             zoneId: defaultTransitRouterAvailableResources.then(defaultTransitRouterAvailableResources => defaultTransitRouterAvailableResources.resources?.[0]?.masterZones?.[0]),
 *             vswitchId: defaultMaster.id,
 *         },
 *         {
 *             zoneId: defaultTransitRouterAvailableResources.then(defaultTransitRouterAvailableResources => defaultTransitRouterAvailableResources.resources?.[0]?.slaveZones?.[1]),
 *             vswitchId: defaultSlave.id,
 *         },
 *     ],
 *     transitRouterAttachmentName: transitRouterAttachmentName,
 *     transitRouterAttachmentDescription: transitRouterAttachmentDescription,
 * });
 * ```
 *
 * ## Import
 *
 * CEN instance can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cen/transitRouterVpcAttachment:TransitRouterVpcAttachment example tr-********:tr-attach-********
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
    public readonly autoPublishRouteEnabled!: pulumi.Output<boolean>;
    /**
     * The ID of the CEN.
     */
    public readonly cenId!: pulumi.Output<string>;
    /**
     * The dry run.
     */
    public readonly dryRun!: pulumi.Output<boolean | undefined>;
    /**
     * The payment type of the resource. Valid values: `PayAsYouGo`.
     */
    public readonly paymentType!: pulumi.Output<string>;
    /**
     * The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
     */
    public readonly resourceType!: pulumi.Output<string | undefined>;
    /**
     * Whether to enabled route table association. The system default value is `true`. **NOTE:** "Field `routeTableAssociationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association."
     *
     * @deprecated Field 'route_table_association_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_association' instead.
     */
    public readonly routeTableAssociationEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to enabled route table propagation. The system default value is `true`. **NOTE:** "Field `routeTablePropagationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation."
     *
     * @deprecated Field 'route_table_propagation_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_propagation' instead.
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
     * The ID of transit router attachment.
     */
    public /*out*/ readonly transitRouterAttachmentId!: pulumi.Output<string>;
    /**
     * The name of the transit router vbr attachment.
     */
    public readonly transitRouterAttachmentName!: pulumi.Output<string | undefined>;
    /**
     * The ID of the transit router.
     */
    public readonly transitRouterId!: pulumi.Output<string | undefined>;
    /**
     * The ID of the VPC.
     */
    public readonly vpcId!: pulumi.Output<string>;
    /**
     * The owner id of vpc.
     */
    public readonly vpcOwnerId!: pulumi.Output<string>;
    /**
     * The list of zone mapping of the VPC. **NOTE:** From version 1.184.0, `zoneMappings` can be modified.
     * > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
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
     * The payment type of the resource. Valid values: `PayAsYouGo`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
     */
    resourceType?: pulumi.Input<string>;
    /**
     * Whether to enabled route table association. The system default value is `true`. **NOTE:** "Field `routeTableAssociationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association."
     *
     * @deprecated Field 'route_table_association_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_association' instead.
     */
    routeTableAssociationEnabled?: pulumi.Input<boolean>;
    /**
     * Whether to enabled route table propagation. The system default value is `true`. **NOTE:** "Field `routeTablePropagationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation."
     *
     * @deprecated Field 'route_table_propagation_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_propagation' instead.
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
     * The ID of transit router attachment.
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
     * The list of zone mapping of the VPC. **NOTE:** From version 1.184.0, `zoneMappings` can be modified.
     * > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
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
     * The payment type of the resource. Valid values: `PayAsYouGo`.
     */
    paymentType?: pulumi.Input<string>;
    /**
     * The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
     */
    resourceType?: pulumi.Input<string>;
    /**
     * Whether to enabled route table association. The system default value is `true`. **NOTE:** "Field `routeTableAssociationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association."
     *
     * @deprecated Field 'route_table_association_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_association' instead.
     */
    routeTableAssociationEnabled?: pulumi.Input<boolean>;
    /**
     * Whether to enabled route table propagation. The system default value is `true`. **NOTE:** "Field `routeTablePropagationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation."
     *
     * @deprecated Field 'route_table_propagation_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_propagation' instead.
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
     * The list of zone mapping of the VPC. **NOTE:** From version 1.184.0, `zoneMappings` can be modified.
     * > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
     */
    zoneMappings: pulumi.Input<pulumi.Input<inputs.cen.TransitRouterVpcAttachmentZoneMapping>[]>;
}
