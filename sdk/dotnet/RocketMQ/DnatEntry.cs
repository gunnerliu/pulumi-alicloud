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
    /// Provides a Sag DnatEntry resource. This topic describes how to add a DNAT entry to a Smart Access Gateway (SAG) instance to enable the DNAT function. By using the DNAT function, you can forward requests received by public IP addresses to Alibaba Cloud instances according to custom mapping rules.
    /// 
    /// For information about Sag DnatEntry and how to use it, see [What is Sag DnatEntry](https://www.alibabacloud.com/help/en/smart-access-gateway/latest/adddnatentry).
    /// 
    /// &gt; **NOTE:** Available since v1.63.0.
    /// 
    /// &gt; **NOTE:** Only the following regions suppor. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-2`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]
    /// 
    /// ## Import
    /// 
    /// The Sag DnatEntry can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:rocketmq/dnatEntry:DnatEntry example sag-abc123456:dnat-abc123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:rocketmq/dnatEntry:DnatEntry")]
    public partial class DnatEntry : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The external public IP address.when "type" is "Internet",automatically identify the external ip.
        /// </summary>
        [Output("externalIp")]
        public Output<string?> ExternalIp { get; private set; } = null!;

        /// <summary>
        /// The public port.Value range: 1 to 65535 or "any".
        /// </summary>
        [Output("externalPort")]
        public Output<string> ExternalPort { get; private set; } = null!;

        /// <summary>
        /// The destination private IP address.
        /// </summary>
        [Output("internalIp")]
        public Output<string> InternalIp { get; private set; } = null!;

        /// <summary>
        /// The destination private port.Value range: 1 to 65535 or "any".
        /// </summary>
        [Output("internalPort")]
        public Output<string> InternalPort { get; private set; } = null!;

        /// <summary>
        /// The protocol type. Valid values: TCP: Forwards packets of the TCP protocol. UDP: Forwards packets of the UDP protocol. Any: Forwards packets of all protocols.
        /// </summary>
        [Output("ipProtocol")]
        public Output<string> IpProtocol { get; private set; } = null!;

        /// <summary>
        /// The ID of the SAG instance.
        /// </summary>
        [Output("sagId")]
        public Output<string> SagId { get; private set; } = null!;

        /// <summary>
        /// The DNAT type. Valid values: Intranet: DNAT of private IP addresses. Internet: DNAT of public IP addresses
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a DnatEntry resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DnatEntry(string name, DnatEntryArgs args, CustomResourceOptions? options = null)
            : base("alicloud:rocketmq/dnatEntry:DnatEntry", name, args ?? new DnatEntryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DnatEntry(string name, Input<string> id, DnatEntryState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:rocketmq/dnatEntry:DnatEntry", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DnatEntry resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DnatEntry Get(string name, Input<string> id, DnatEntryState? state = null, CustomResourceOptions? options = null)
        {
            return new DnatEntry(name, id, state, options);
        }
    }

    public sealed class DnatEntryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The external public IP address.when "type" is "Internet",automatically identify the external ip.
        /// </summary>
        [Input("externalIp")]
        public Input<string>? ExternalIp { get; set; }

        /// <summary>
        /// The public port.Value range: 1 to 65535 or "any".
        /// </summary>
        [Input("externalPort", required: true)]
        public Input<string> ExternalPort { get; set; } = null!;

        /// <summary>
        /// The destination private IP address.
        /// </summary>
        [Input("internalIp", required: true)]
        public Input<string> InternalIp { get; set; } = null!;

        /// <summary>
        /// The destination private port.Value range: 1 to 65535 or "any".
        /// </summary>
        [Input("internalPort", required: true)]
        public Input<string> InternalPort { get; set; } = null!;

        /// <summary>
        /// The protocol type. Valid values: TCP: Forwards packets of the TCP protocol. UDP: Forwards packets of the UDP protocol. Any: Forwards packets of all protocols.
        /// </summary>
        [Input("ipProtocol", required: true)]
        public Input<string> IpProtocol { get; set; } = null!;

        /// <summary>
        /// The ID of the SAG instance.
        /// </summary>
        [Input("sagId", required: true)]
        public Input<string> SagId { get; set; } = null!;

        /// <summary>
        /// The DNAT type. Valid values: Intranet: DNAT of private IP addresses. Internet: DNAT of public IP addresses
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public DnatEntryArgs()
        {
        }
        public static new DnatEntryArgs Empty => new DnatEntryArgs();
    }

    public sealed class DnatEntryState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The external public IP address.when "type" is "Internet",automatically identify the external ip.
        /// </summary>
        [Input("externalIp")]
        public Input<string>? ExternalIp { get; set; }

        /// <summary>
        /// The public port.Value range: 1 to 65535 or "any".
        /// </summary>
        [Input("externalPort")]
        public Input<string>? ExternalPort { get; set; }

        /// <summary>
        /// The destination private IP address.
        /// </summary>
        [Input("internalIp")]
        public Input<string>? InternalIp { get; set; }

        /// <summary>
        /// The destination private port.Value range: 1 to 65535 or "any".
        /// </summary>
        [Input("internalPort")]
        public Input<string>? InternalPort { get; set; }

        /// <summary>
        /// The protocol type. Valid values: TCP: Forwards packets of the TCP protocol. UDP: Forwards packets of the UDP protocol. Any: Forwards packets of all protocols.
        /// </summary>
        [Input("ipProtocol")]
        public Input<string>? IpProtocol { get; set; }

        /// <summary>
        /// The ID of the SAG instance.
        /// </summary>
        [Input("sagId")]
        public Input<string>? SagId { get; set; }

        /// <summary>
        /// The DNAT type. Valid values: Intranet: DNAT of private IP addresses. Internet: DNAT of public IP addresses
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DnatEntryState()
        {
        }
        public static new DnatEntryState Empty => new DnatEntryState();
    }
}
