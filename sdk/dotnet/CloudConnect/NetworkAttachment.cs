// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudConnect
{
    /// <summary>
    /// Provides a Cloud Connect Network Attachment resource. This topic describes how to associate a Smart Access Gateway (SAG) instance with a network instance. You must associate an SAG instance with a network instance if you want to connect the SAG to Alibaba Cloud. You can connect an SAG to Alibaba Cloud through a leased line, the Internet, or the active and standby links.
    /// 
    /// For information about Cloud Connect Network Attachment and how to use it, see [What is Cloud Connect Network Attachment](https://www.alibabacloud.com/help/doc-detail/124230.htm).
    /// 
    /// &gt; **NOTE:** Available in 1.64.0+
    /// 
    /// &gt; **NOTE:** Only the following regions support. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-2`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]
    /// 
    /// ## Example Usage
    /// 
    /// 
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var ccn = new AliCloud.CloudConnect.Network("ccn", new AliCloud.CloudConnect.NetworkArgs
    ///         {
    ///             IsDefault = "true",
    ///         });
    ///         var @default = new AliCloud.CloudConnect.NetworkAttachment("default", new AliCloud.CloudConnect.NetworkAttachmentArgs
    ///         {
    ///             CcnId = ccn.Id,
    ///             SagId = "sag-xxxxx",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class NetworkAttachment : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the CCN instance.
        /// </summary>
        [Output("ccnId")]
        public Output<string> CcnId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Smart Access Gateway instance.
        /// </summary>
        [Output("sagId")]
        public Output<string> SagId { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkAttachment(string name, NetworkAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cloudconnect/networkAttachment:NetworkAttachment", name, args ?? new NetworkAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkAttachment(string name, Input<string> id, NetworkAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cloudconnect/networkAttachment:NetworkAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NetworkAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkAttachment Get(string name, Input<string> id, NetworkAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkAttachment(name, id, state, options);
        }
    }

    public sealed class NetworkAttachmentArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the CCN instance.
        /// </summary>
        [Input("ccnId", required: true)]
        public Input<string> CcnId { get; set; } = null!;

        /// <summary>
        /// The ID of the Smart Access Gateway instance.
        /// </summary>
        [Input("sagId", required: true)]
        public Input<string> SagId { get; set; } = null!;

        public NetworkAttachmentArgs()
        {
        }
    }

    public sealed class NetworkAttachmentState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the CCN instance.
        /// </summary>
        [Input("ccnId")]
        public Input<string>? CcnId { get; set; }

        /// <summary>
        /// The ID of the Smart Access Gateway instance.
        /// </summary>
        [Input("sagId")]
        public Input<string>? SagId { get; set; }

        public NetworkAttachmentState()
        {
        }
    }
}
