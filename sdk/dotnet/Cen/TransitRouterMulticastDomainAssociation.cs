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
    /// Provides a Cloud Enterprise Network (CEN) Transit Router Multicast Domain Association resource.
    /// 
    /// For information about Cloud Enterprise Network (CEN) Transit Router Multicast Domain Association and how to use it, see [What is Transit Router Multicast Domain Association](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-associatetransitroutermulticastdomain).
    /// 
    /// &gt; **NOTE:** Available since v1.195.0.
    /// 
    /// ## Import
    /// 
    /// Cloud Enterprise Network (CEN) Transit Router Multicast Domain Association can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cen/transitRouterMulticastDomainAssociation:TransitRouterMulticastDomainAssociation example &lt;transit_router_multicast_domain_id&gt;:&lt;transit_router_attachment_id&gt;:&lt;vswitch_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cen/transitRouterMulticastDomainAssociation:TransitRouterMulticastDomainAssociation")]
    public partial class TransitRouterMulticastDomainAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The status of the Transit Router Multicast Domain Association.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC connection.
        /// </summary>
        [Output("transitRouterAttachmentId")]
        public Output<string> TransitRouterAttachmentId { get; private set; } = null!;

        /// <summary>
        /// The ID of the multicast domain.
        /// </summary>
        [Output("transitRouterMulticastDomainId")]
        public Output<string> TransitRouterMulticastDomainId { get; private set; } = null!;

        /// <summary>
        /// The ID of the vSwitch.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a TransitRouterMulticastDomainAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TransitRouterMulticastDomainAssociation(string name, TransitRouterMulticastDomainAssociationArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cen/transitRouterMulticastDomainAssociation:TransitRouterMulticastDomainAssociation", name, args ?? new TransitRouterMulticastDomainAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TransitRouterMulticastDomainAssociation(string name, Input<string> id, TransitRouterMulticastDomainAssociationState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cen/transitRouterMulticastDomainAssociation:TransitRouterMulticastDomainAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TransitRouterMulticastDomainAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TransitRouterMulticastDomainAssociation Get(string name, Input<string> id, TransitRouterMulticastDomainAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new TransitRouterMulticastDomainAssociation(name, id, state, options);
        }
    }

    public sealed class TransitRouterMulticastDomainAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the VPC connection.
        /// </summary>
        [Input("transitRouterAttachmentId", required: true)]
        public Input<string> TransitRouterAttachmentId { get; set; } = null!;

        /// <summary>
        /// The ID of the multicast domain.
        /// </summary>
        [Input("transitRouterMulticastDomainId", required: true)]
        public Input<string> TransitRouterMulticastDomainId { get; set; } = null!;

        /// <summary>
        /// The ID of the vSwitch.
        /// </summary>
        [Input("vswitchId", required: true)]
        public Input<string> VswitchId { get; set; } = null!;

        public TransitRouterMulticastDomainAssociationArgs()
        {
        }
        public static new TransitRouterMulticastDomainAssociationArgs Empty => new TransitRouterMulticastDomainAssociationArgs();
    }

    public sealed class TransitRouterMulticastDomainAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The status of the Transit Router Multicast Domain Association.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the VPC connection.
        /// </summary>
        [Input("transitRouterAttachmentId")]
        public Input<string>? TransitRouterAttachmentId { get; set; }

        /// <summary>
        /// The ID of the multicast domain.
        /// </summary>
        [Input("transitRouterMulticastDomainId")]
        public Input<string>? TransitRouterMulticastDomainId { get; set; }

        /// <summary>
        /// The ID of the vSwitch.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public TransitRouterMulticastDomainAssociationState()
        {
        }
        public static new TransitRouterMulticastDomainAssociationState Empty => new TransitRouterMulticastDomainAssociationState();
    }
}
