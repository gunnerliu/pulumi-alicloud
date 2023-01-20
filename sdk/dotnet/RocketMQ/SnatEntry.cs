// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.RocketMQ
{
    /// <summary>
    /// Provides a Sag SnatEntry resource. This topic describes how to add a SNAT entry to enable the SNAT function. The SNAT function can hide internal IP addresses and resolve private IP address conflicts. With this function, on-premises sites can access internal IP addresses, but cannot be accessed by internal IP addresses. If you do not add a SNAT entry, on-premises sites can access each other only when all related IP addresses do not conflict.
    /// 
    /// For information about Sag SnatEntry and how to use it, see [What is Sag SnatEntry](https://www.alibabacloud.com/help/doc-detail/124231.htm).
    /// 
    /// &gt; **NOTE:** Available in 1.61.0+
    /// 
    /// &gt; **NOTE:** Only the following regions support. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-2`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new AliCloud.RocketMQ.SnatEntry("default", new()
    ///     {
    ///         CidrBlock = "192.168.7.0/24",
    ///         SagId = "sag-3rb1t3iagy3w0zgwy9",
    ///         SnatIp = "192.0.0.2",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The Sag SnatEntry can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:rocketmq/snatEntry:SnatEntry example sag-abc123456:snat-abc123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:rocketmq/snatEntry:SnatEntry")]
    public partial class SnatEntry : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The destination CIDR block.
        /// </summary>
        [Output("cidrBlock")]
        public Output<string> CidrBlock { get; private set; } = null!;

        /// <summary>
        /// The ID of the SAG instance.
        /// </summary>
        [Output("sagId")]
        public Output<string> SagId { get; private set; } = null!;

        /// <summary>
        /// The public IP address.
        /// </summary>
        [Output("snatIp")]
        public Output<string> SnatIp { get; private set; } = null!;


        /// <summary>
        /// Create a SnatEntry resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SnatEntry(string name, SnatEntryArgs args, CustomResourceOptions? options = null)
            : base("alicloud:rocketmq/snatEntry:SnatEntry", name, args ?? new SnatEntryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SnatEntry(string name, Input<string> id, SnatEntryState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:rocketmq/snatEntry:SnatEntry", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SnatEntry resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SnatEntry Get(string name, Input<string> id, SnatEntryState? state = null, CustomResourceOptions? options = null)
        {
            return new SnatEntry(name, id, state, options);
        }
    }

    public sealed class SnatEntryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The destination CIDR block.
        /// </summary>
        [Input("cidrBlock", required: true)]
        public Input<string> CidrBlock { get; set; } = null!;

        /// <summary>
        /// The ID of the SAG instance.
        /// </summary>
        [Input("sagId", required: true)]
        public Input<string> SagId { get; set; } = null!;

        /// <summary>
        /// The public IP address.
        /// </summary>
        [Input("snatIp", required: true)]
        public Input<string> SnatIp { get; set; } = null!;

        public SnatEntryArgs()
        {
        }
        public static new SnatEntryArgs Empty => new SnatEntryArgs();
    }

    public sealed class SnatEntryState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The destination CIDR block.
        /// </summary>
        [Input("cidrBlock")]
        public Input<string>? CidrBlock { get; set; }

        /// <summary>
        /// The ID of the SAG instance.
        /// </summary>
        [Input("sagId")]
        public Input<string>? SagId { get; set; }

        /// <summary>
        /// The public IP address.
        /// </summary>
        [Input("snatIp")]
        public Input<string>? SnatIp { get; set; }

        public SnatEntryState()
        {
        }
        public static new SnatEntryState Empty => new SnatEntryState();
    }
}
