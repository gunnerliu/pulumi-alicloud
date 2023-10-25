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
    /// Provides a CEN transit router peer attachment resource that associate the transit router with the CEN instance. [What is CEN transit router peer attachment](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtransitrouterpeerattachment)
    /// 
    /// &gt; **NOTE:** Available since v1.128.0.
    /// 
    /// ## Import
    /// 
    /// CEN instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cen/transitRouterPeerAttachment:TransitRouterPeerAttachment example tr-********:tr-attach-*******
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cen/transitRouterPeerAttachment:TransitRouterPeerAttachment")]
    public partial class TransitRouterPeerAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Auto publish route enabled. The system default value is `false`.
        /// </summary>
        [Output("autoPublishRouteEnabled")]
        public Output<bool?> AutoPublishRouteEnabled { get; private set; } = null!;

        /// <summary>
        /// The bandwidth of the bandwidth package.
        /// </summary>
        [Output("bandwidth")]
        public Output<int?> Bandwidth { get; private set; } = null!;

        /// <summary>
        /// The method that is used to allocate bandwidth to the cross-region connection. Valid values: `BandwidthPackage` and `DataTransfer`.
        /// </summary>
        [Output("bandwidthType")]
        public Output<string> BandwidthType { get; private set; } = null!;

        /// <summary>
        /// The ID of the bandwidth package. If you do not enter the ID of the package, it means you are using the test. The system default test is 1bps, demonstrating that you test network connectivity
        /// </summary>
        [Output("cenBandwidthPackageId")]
        public Output<string?> CenBandwidthPackageId { get; private set; } = null!;

        /// <summary>
        /// The ID of the CEN.
        /// </summary>
        [Output("cenId")]
        public Output<string> CenId { get; private set; } = null!;

        /// <summary>
        /// Whether to perform pre-check for this request, including permission, instance status verification, etc.
        /// </summary>
        [Output("dryRun")]
        public Output<bool?> DryRun { get; private set; } = null!;

        /// <summary>
        /// The ID of the peer transit router.
        /// </summary>
        [Output("peerTransitRouterId")]
        public Output<string> PeerTransitRouterId { get; private set; } = null!;

        /// <summary>
        /// The region ID of peer transit router.
        /// </summary>
        [Output("peerTransitRouterRegionId")]
        public Output<string> PeerTransitRouterRegionId { get; private set; } = null!;

        /// <summary>
        /// The resource type to attachment. Only support `VR` and default value is `VR`.
        /// </summary>
        [Output("resourceType")]
        public Output<string?> ResourceType { get; private set; } = null!;

        /// <summary>
        /// Whether to association route table. System default is `false`.
        /// </summary>
        [Output("routeTableAssociationEnabled")]
        public Output<bool?> RouteTableAssociationEnabled { get; private set; } = null!;

        /// <summary>
        /// Whether to propagation route table. System default is `false`.
        /// </summary>
        [Output("routeTablePropagationEnabled")]
        public Output<bool?> RouteTablePropagationEnabled { get; private set; } = null!;

        /// <summary>
        /// The associating status of the network.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The description of transit router attachment. The description is 2~256 characters long and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
        /// </summary>
        [Output("transitRouterAttachmentDescription")]
        public Output<string?> TransitRouterAttachmentDescription { get; private set; } = null!;

        /// <summary>
        /// The ID of transit router attachment id.
        /// </summary>
        [Output("transitRouterAttachmentId")]
        public Output<string> TransitRouterAttachmentId { get; private set; } = null!;

        /// <summary>
        /// The name of transit router attachment. The name is 2~128 characters in length, starts with uppercase and lowercase letters or Chinese, and can contain numbers, underscores (_) and dashes (-)
        /// </summary>
        [Output("transitRouterAttachmentName")]
        public Output<string?> TransitRouterAttachmentName { get; private set; } = null!;

        /// <summary>
        /// The ID of the transit router to attach.
        /// </summary>
        [Output("transitRouterId")]
        public Output<string?> TransitRouterId { get; private set; } = null!;


        /// <summary>
        /// Create a TransitRouterPeerAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TransitRouterPeerAttachment(string name, TransitRouterPeerAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cen/transitRouterPeerAttachment:TransitRouterPeerAttachment", name, args ?? new TransitRouterPeerAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TransitRouterPeerAttachment(string name, Input<string> id, TransitRouterPeerAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cen/transitRouterPeerAttachment:TransitRouterPeerAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TransitRouterPeerAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TransitRouterPeerAttachment Get(string name, Input<string> id, TransitRouterPeerAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new TransitRouterPeerAttachment(name, id, state, options);
        }
    }

    public sealed class TransitRouterPeerAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Auto publish route enabled. The system default value is `false`.
        /// </summary>
        [Input("autoPublishRouteEnabled")]
        public Input<bool>? AutoPublishRouteEnabled { get; set; }

        /// <summary>
        /// The bandwidth of the bandwidth package.
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// The method that is used to allocate bandwidth to the cross-region connection. Valid values: `BandwidthPackage` and `DataTransfer`.
        /// </summary>
        [Input("bandwidthType")]
        public Input<string>? BandwidthType { get; set; }

        /// <summary>
        /// The ID of the bandwidth package. If you do not enter the ID of the package, it means you are using the test. The system default test is 1bps, demonstrating that you test network connectivity
        /// </summary>
        [Input("cenBandwidthPackageId")]
        public Input<string>? CenBandwidthPackageId { get; set; }

        /// <summary>
        /// The ID of the CEN.
        /// </summary>
        [Input("cenId", required: true)]
        public Input<string> CenId { get; set; } = null!;

        /// <summary>
        /// Whether to perform pre-check for this request, including permission, instance status verification, etc.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The ID of the peer transit router.
        /// </summary>
        [Input("peerTransitRouterId", required: true)]
        public Input<string> PeerTransitRouterId { get; set; } = null!;

        /// <summary>
        /// The region ID of peer transit router.
        /// </summary>
        [Input("peerTransitRouterRegionId", required: true)]
        public Input<string> PeerTransitRouterRegionId { get; set; } = null!;

        /// <summary>
        /// The resource type to attachment. Only support `VR` and default value is `VR`.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        /// <summary>
        /// Whether to association route table. System default is `false`.
        /// </summary>
        [Input("routeTableAssociationEnabled")]
        public Input<bool>? RouteTableAssociationEnabled { get; set; }

        /// <summary>
        /// Whether to propagation route table. System default is `false`.
        /// </summary>
        [Input("routeTablePropagationEnabled")]
        public Input<bool>? RouteTablePropagationEnabled { get; set; }

        /// <summary>
        /// The description of transit router attachment. The description is 2~256 characters long and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
        /// </summary>
        [Input("transitRouterAttachmentDescription")]
        public Input<string>? TransitRouterAttachmentDescription { get; set; }

        /// <summary>
        /// The name of transit router attachment. The name is 2~128 characters in length, starts with uppercase and lowercase letters or Chinese, and can contain numbers, underscores (_) and dashes (-)
        /// </summary>
        [Input("transitRouterAttachmentName")]
        public Input<string>? TransitRouterAttachmentName { get; set; }

        /// <summary>
        /// The ID of the transit router to attach.
        /// </summary>
        [Input("transitRouterId")]
        public Input<string>? TransitRouterId { get; set; }

        public TransitRouterPeerAttachmentArgs()
        {
        }
        public static new TransitRouterPeerAttachmentArgs Empty => new TransitRouterPeerAttachmentArgs();
    }

    public sealed class TransitRouterPeerAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Auto publish route enabled. The system default value is `false`.
        /// </summary>
        [Input("autoPublishRouteEnabled")]
        public Input<bool>? AutoPublishRouteEnabled { get; set; }

        /// <summary>
        /// The bandwidth of the bandwidth package.
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// The method that is used to allocate bandwidth to the cross-region connection. Valid values: `BandwidthPackage` and `DataTransfer`.
        /// </summary>
        [Input("bandwidthType")]
        public Input<string>? BandwidthType { get; set; }

        /// <summary>
        /// The ID of the bandwidth package. If you do not enter the ID of the package, it means you are using the test. The system default test is 1bps, demonstrating that you test network connectivity
        /// </summary>
        [Input("cenBandwidthPackageId")]
        public Input<string>? CenBandwidthPackageId { get; set; }

        /// <summary>
        /// The ID of the CEN.
        /// </summary>
        [Input("cenId")]
        public Input<string>? CenId { get; set; }

        /// <summary>
        /// Whether to perform pre-check for this request, including permission, instance status verification, etc.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The ID of the peer transit router.
        /// </summary>
        [Input("peerTransitRouterId")]
        public Input<string>? PeerTransitRouterId { get; set; }

        /// <summary>
        /// The region ID of peer transit router.
        /// </summary>
        [Input("peerTransitRouterRegionId")]
        public Input<string>? PeerTransitRouterRegionId { get; set; }

        /// <summary>
        /// The resource type to attachment. Only support `VR` and default value is `VR`.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        /// <summary>
        /// Whether to association route table. System default is `false`.
        /// </summary>
        [Input("routeTableAssociationEnabled")]
        public Input<bool>? RouteTableAssociationEnabled { get; set; }

        /// <summary>
        /// Whether to propagation route table. System default is `false`.
        /// </summary>
        [Input("routeTablePropagationEnabled")]
        public Input<bool>? RouteTablePropagationEnabled { get; set; }

        /// <summary>
        /// The associating status of the network.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The description of transit router attachment. The description is 2~256 characters long and must start with a letter or Chinese, but cannot start with `http://` or `https://`.
        /// </summary>
        [Input("transitRouterAttachmentDescription")]
        public Input<string>? TransitRouterAttachmentDescription { get; set; }

        /// <summary>
        /// The ID of transit router attachment id.
        /// </summary>
        [Input("transitRouterAttachmentId")]
        public Input<string>? TransitRouterAttachmentId { get; set; }

        /// <summary>
        /// The name of transit router attachment. The name is 2~128 characters in length, starts with uppercase and lowercase letters or Chinese, and can contain numbers, underscores (_) and dashes (-)
        /// </summary>
        [Input("transitRouterAttachmentName")]
        public Input<string>? TransitRouterAttachmentName { get; set; }

        /// <summary>
        /// The ID of the transit router to attach.
        /// </summary>
        [Input("transitRouterId")]
        public Input<string>? TransitRouterId { get; set; }

        public TransitRouterPeerAttachmentState()
        {
        }
        public static new TransitRouterPeerAttachmentState Empty => new TransitRouterPeerAttachmentState();
    }
}
