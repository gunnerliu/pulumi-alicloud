// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    /// <summary>
    /// Provides a CEN transit router VPC attachment resource that associate the VPC with the CEN instance. [What is Cen Transit Router VPC Attachment](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtransitroutervpcattachment)
    /// 
    /// &gt; **NOTE:** Available since v1.126.0.
    /// 
    /// ## Import
    /// 
    /// CEN instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cen/transitRouterVpcAttachment:TransitRouterVpcAttachment example tr-********:tr-attach-********
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cen/transitRouterVpcAttachment:TransitRouterVpcAttachment")]
    public partial class TransitRouterVpcAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether the transit router is automatically published to the VPC instance. Default value: `false`. Valid values:
        /// </summary>
        [Output("autoPublishRouteEnabled")]
        public Output<bool> AutoPublishRouteEnabled { get; private set; } = null!;

        /// <summary>
        /// The ID of the CEN.
        /// </summary>
        [Output("cenId")]
        public Output<string> CenId { get; private set; } = null!;

        /// <summary>
        /// The dry run.
        /// </summary>
        [Output("dryRun")]
        public Output<bool?> DryRun { get; private set; } = null!;

        /// <summary>
        /// The payment type of the resource. Valid values: `PayAsYouGo`.
        /// </summary>
        [Output("paymentType")]
        public Output<string> PaymentType { get; private set; } = null!;

        /// <summary>
        /// The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
        /// </summary>
        [Output("resourceType")]
        public Output<string?> ResourceType { get; private set; } = null!;

        /// <summary>
        /// Whether to enabled route table association. The system default value is `true`. **NOTE:** "Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association."
        /// </summary>
        [Output("routeTableAssociationEnabled")]
        public Output<bool?> RouteTableAssociationEnabled { get; private set; } = null!;

        /// <summary>
        /// Whether to enabled route table propagation. The system default value is `true`. **NOTE:** "Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation."
        /// </summary>
        [Output("routeTablePropagationEnabled")]
        public Output<bool?> RouteTablePropagationEnabled { get; private set; } = null!;

        /// <summary>
        /// The associating status of the network.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The description of the transit router vbr attachment.
        /// </summary>
        [Output("transitRouterAttachmentDescription")]
        public Output<string?> TransitRouterAttachmentDescription { get; private set; } = null!;

        /// <summary>
        /// The ID of transit router attachment.
        /// </summary>
        [Output("transitRouterAttachmentId")]
        public Output<string> TransitRouterAttachmentId { get; private set; } = null!;

        /// <summary>
        /// The name of the transit router vbr attachment.
        /// </summary>
        [Output("transitRouterAttachmentName")]
        public Output<string?> TransitRouterAttachmentName { get; private set; } = null!;

        /// <summary>
        /// The ID of the transit router.
        /// </summary>
        [Output("transitRouterId")]
        public Output<string?> TransitRouterId { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;

        /// <summary>
        /// The owner id of vpc.
        /// </summary>
        [Output("vpcOwnerId")]
        public Output<string> VpcOwnerId { get; private set; } = null!;

        /// <summary>
        /// The list of zone mapping of the VPC. **NOTE:** From version 1.184.0, `zone_mappings` can be modified. See `zone_mappings` below.
        /// &gt; **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zone_id of zone_mapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
        /// </summary>
        [Output("zoneMappings")]
        public Output<ImmutableArray<Outputs.TransitRouterVpcAttachmentZoneMapping>> ZoneMappings { get; private set; } = null!;


        /// <summary>
        /// Create a TransitRouterVpcAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TransitRouterVpcAttachment(string name, TransitRouterVpcAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cen/transitRouterVpcAttachment:TransitRouterVpcAttachment", name, args ?? new TransitRouterVpcAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TransitRouterVpcAttachment(string name, Input<string> id, TransitRouterVpcAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cen/transitRouterVpcAttachment:TransitRouterVpcAttachment", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing TransitRouterVpcAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TransitRouterVpcAttachment Get(string name, Input<string> id, TransitRouterVpcAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new TransitRouterVpcAttachment(name, id, state, options);
        }
    }

    public sealed class TransitRouterVpcAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the transit router is automatically published to the VPC instance. Default value: `false`. Valid values:
        /// </summary>
        [Input("autoPublishRouteEnabled")]
        public Input<bool>? AutoPublishRouteEnabled { get; set; }

        /// <summary>
        /// The ID of the CEN.
        /// </summary>
        [Input("cenId", required: true)]
        public Input<string> CenId { get; set; } = null!;

        /// <summary>
        /// The dry run.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The payment type of the resource. Valid values: `PayAsYouGo`.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        /// <summary>
        /// Whether to enabled route table association. The system default value is `true`. **NOTE:** "Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association."
        /// </summary>
        [Input("routeTableAssociationEnabled")]
        public Input<bool>? RouteTableAssociationEnabled { get; set; }

        /// <summary>
        /// Whether to enabled route table propagation. The system default value is `true`. **NOTE:** "Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation."
        /// </summary>
        [Input("routeTablePropagationEnabled")]
        public Input<bool>? RouteTablePropagationEnabled { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The description of the transit router vbr attachment.
        /// </summary>
        [Input("transitRouterAttachmentDescription")]
        public Input<string>? TransitRouterAttachmentDescription { get; set; }

        /// <summary>
        /// The name of the transit router vbr attachment.
        /// </summary>
        [Input("transitRouterAttachmentName")]
        public Input<string>? TransitRouterAttachmentName { get; set; }

        /// <summary>
        /// The ID of the transit router.
        /// </summary>
        [Input("transitRouterId")]
        public Input<string>? TransitRouterId { get; set; }

        /// <summary>
        /// The ID of the VPC.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        /// <summary>
        /// The owner id of vpc.
        /// </summary>
        [Input("vpcOwnerId")]
        public Input<string>? VpcOwnerId { get; set; }

        [Input("zoneMappings", required: true)]
        private InputList<Inputs.TransitRouterVpcAttachmentZoneMappingArgs>? _zoneMappings;

        /// <summary>
        /// The list of zone mapping of the VPC. **NOTE:** From version 1.184.0, `zone_mappings` can be modified. See `zone_mappings` below.
        /// &gt; **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zone_id of zone_mapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
        /// </summary>
        public InputList<Inputs.TransitRouterVpcAttachmentZoneMappingArgs> ZoneMappings
        {
            get => _zoneMappings ?? (_zoneMappings = new InputList<Inputs.TransitRouterVpcAttachmentZoneMappingArgs>());
            set => _zoneMappings = value;
        }

        public TransitRouterVpcAttachmentArgs()
        {
        }
        public static new TransitRouterVpcAttachmentArgs Empty => new TransitRouterVpcAttachmentArgs();
    }

    public sealed class TransitRouterVpcAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the transit router is automatically published to the VPC instance. Default value: `false`. Valid values:
        /// </summary>
        [Input("autoPublishRouteEnabled")]
        public Input<bool>? AutoPublishRouteEnabled { get; set; }

        /// <summary>
        /// The ID of the CEN.
        /// </summary>
        [Input("cenId")]
        public Input<string>? CenId { get; set; }

        /// <summary>
        /// The dry run.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The payment type of the resource. Valid values: `PayAsYouGo`.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        /// <summary>
        /// Whether to enabled route table association. The system default value is `true`. **NOTE:** "Field `route_table_association_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association."
        /// </summary>
        [Input("routeTableAssociationEnabled")]
        public Input<bool>? RouteTableAssociationEnabled { get; set; }

        /// <summary>
        /// Whether to enabled route table propagation. The system default value is `true`. **NOTE:** "Field `route_table_propagation_enabled` has been deprecated from provider version 1.192.0. Please use the resource `alicloud.cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation."
        /// </summary>
        [Input("routeTablePropagationEnabled")]
        public Input<bool>? RouteTablePropagationEnabled { get; set; }

        /// <summary>
        /// The associating status of the network.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The description of the transit router vbr attachment.
        /// </summary>
        [Input("transitRouterAttachmentDescription")]
        public Input<string>? TransitRouterAttachmentDescription { get; set; }

        /// <summary>
        /// The ID of transit router attachment.
        /// </summary>
        [Input("transitRouterAttachmentId")]
        public Input<string>? TransitRouterAttachmentId { get; set; }

        /// <summary>
        /// The name of the transit router vbr attachment.
        /// </summary>
        [Input("transitRouterAttachmentName")]
        public Input<string>? TransitRouterAttachmentName { get; set; }

        /// <summary>
        /// The ID of the transit router.
        /// </summary>
        [Input("transitRouterId")]
        public Input<string>? TransitRouterId { get; set; }

        /// <summary>
        /// The ID of the VPC.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The owner id of vpc.
        /// </summary>
        [Input("vpcOwnerId")]
        public Input<string>? VpcOwnerId { get; set; }

        [Input("zoneMappings")]
        private InputList<Inputs.TransitRouterVpcAttachmentZoneMappingGetArgs>? _zoneMappings;

        /// <summary>
        /// The list of zone mapping of the VPC. **NOTE:** From version 1.184.0, `zone_mappings` can be modified. See `zone_mappings` below.
        /// &gt; **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zone_id of zone_mapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
        /// </summary>
        public InputList<Inputs.TransitRouterVpcAttachmentZoneMappingGetArgs> ZoneMappings
        {
            get => _zoneMappings ?? (_zoneMappings = new InputList<Inputs.TransitRouterVpcAttachmentZoneMappingGetArgs>());
            set => _zoneMappings = value;
        }

        public TransitRouterVpcAttachmentState()
        {
        }
        public static new TransitRouterVpcAttachmentState Empty => new TransitRouterVpcAttachmentState();
    }
}
