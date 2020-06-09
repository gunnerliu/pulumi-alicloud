// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns
{
    /// <summary>
    /// BGP-Line Anti-DDoS instance resource. "Ddoscoo" is the short term of this product. See [What is Anti-DDoS Pro](https://www.alibabacloud.com/help/doc-detail/69319.htm).
    /// 
    /// &gt; **NOTE:** The product region only support cn-hangzhou.
    /// 
    /// &gt; **NOTE:** The endpoint of bssopenapi used only support "business.aliyuncs.com" at present.
    /// 
    /// &gt; **NOTE:** Available in 1.37.0+ .
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
    ///         var newInstance = new AliCloud.Ddos.DdosCooInstance("newInstance", new AliCloud.Ddos.DdosCooInstanceArgs
    ///         {
    ///             Bandwidth = "30",
    ///             BaseBandwidth = "30",
    ///             DomainCount = "50",
    ///             Period = 1,
    ///             PortCount = "50",
    ///             ServiceBandwidth = "100",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [Obsolete(@"alicloud.dns.DdosCooInstance has been deprecated in favor of alicloud.ddos.DdosCooInstance")]
    public partial class DdosCooInstance : Pulumi.CustomResource
    {
        /// <summary>
        /// Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        /// </summary>
        [Output("bandwidth")]
        public Output<string> Bandwidth { get; private set; } = null!;

        /// <summary>
        /// Base defend bandwidth of the instance. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        /// </summary>
        [Output("baseBandwidth")]
        public Output<string> BaseBandwidth { get; private set; } = null!;

        /// <summary>
        /// Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        /// </summary>
        [Output("domainCount")]
        public Output<string> DomainCount { get; private set; } = null!;

        /// <summary>
        /// Name of the instance. This name can have a string of 1 to 63 characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify "period".
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        /// </summary>
        [Output("portCount")]
        public Output<string> PortCount { get; private set; } = null!;

        /// <summary>
        /// Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
        /// </summary>
        [Output("serviceBandwidth")]
        public Output<string> ServiceBandwidth { get; private set; } = null!;


        /// <summary>
        /// Create a DdosCooInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DdosCooInstance(string name, DdosCooInstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:dns/ddosCooInstance:DdosCooInstance", name, args ?? new DdosCooInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DdosCooInstance(string name, Input<string> id, DdosCooInstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:dns/ddosCooInstance:DdosCooInstance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DdosCooInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DdosCooInstance Get(string name, Input<string> id, DdosCooInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new DdosCooInstance(name, id, state, options);
        }
    }

    public sealed class DdosCooInstanceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        /// </summary>
        [Input("bandwidth", required: true)]
        public Input<string> Bandwidth { get; set; } = null!;

        /// <summary>
        /// Base defend bandwidth of the instance. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        /// </summary>
        [Input("baseBandwidth", required: true)]
        public Input<string> BaseBandwidth { get; set; } = null!;

        /// <summary>
        /// Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        /// </summary>
        [Input("domainCount", required: true)]
        public Input<string> DomainCount { get; set; } = null!;

        /// <summary>
        /// Name of the instance. This name can have a string of 1 to 63 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify "period".
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        /// </summary>
        [Input("portCount", required: true)]
        public Input<string> PortCount { get; set; } = null!;

        /// <summary>
        /// Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
        /// </summary>
        [Input("serviceBandwidth", required: true)]
        public Input<string> ServiceBandwidth { get; set; } = null!;

        public DdosCooInstanceArgs()
        {
        }
    }

    public sealed class DdosCooInstanceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        /// </summary>
        [Input("bandwidth")]
        public Input<string>? Bandwidth { get; set; }

        /// <summary>
        /// Base defend bandwidth of the instance. Valid values: 30, 60, 100, 300, 400, 500, 600. The unit is Gbps. Only support upgrade.
        /// </summary>
        [Input("baseBandwidth")]
        public Input<string>? BaseBandwidth { get; set; }

        /// <summary>
        /// Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        /// </summary>
        [Input("domainCount")]
        public Input<string>? DomainCount { get; set; }

        /// <summary>
        /// Name of the instance. This name can have a string of 1 to 63 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The duration that you will buy Ddoscoo instance (in month). Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify "period".
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
        /// </summary>
        [Input("portCount")]
        public Input<string>? PortCount { get; set; }

        /// <summary>
        /// Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade.
        /// </summary>
        [Input("serviceBandwidth")]
        public Input<string>? ServiceBandwidth { get; set; }

        public DdosCooInstanceState()
        {
        }
    }
}
