// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ddos
{
    /// <summary>
    /// Anti-DDoS Advanced instance resource. "Ddosbgp" is the short term of this product.
    /// 
    /// &gt; **NOTE:** The endpoint of bssopenapi used only support "business.aliyuncs.com" at present.
    /// 
    /// &gt; **NOTE:** Available in 1.57.0+ .
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var instance = new AliCloud.Ddos.DdosBgpInstance("instance", new AliCloud.Ddos.DdosBgpInstanceArgs
    ///         {
    ///             Bandwidth = 201,
    ///             BaseBandwidth = 20,
    ///             IpCount = 100,
    ///             IpType = "IPv4",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Ddosbgp instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ddos/ddosBgpInstance:DdosBgpInstance example ddosbgp-abc123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ddos/ddosBgpInstance:DdosBgpInstance")]
    public partial class DdosBgpInstance : Pulumi.CustomResource
    {
        /// <summary>
        /// Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 51,91,101,201,301. The unit is Gbps.
        /// </summary>
        [Output("bandwidth")]
        public Output<int> Bandwidth { get; private set; } = null!;

        /// <summary>
        /// Base defend bandwidth of the instance. Valid values: 20. The unit is Gbps. Default to `20`.
        /// </summary>
        [Output("baseBandwidth")]
        public Output<int?> BaseBandwidth { get; private set; } = null!;

        /// <summary>
        /// IP count of the instance. Valid values: 100.
        /// </summary>
        [Output("ipCount")]
        public Output<int> IpCount { get; private set; } = null!;

        /// <summary>
        /// IP version of the instance. Valid values: IPv4,IPv6.
        /// </summary>
        [Output("ipType")]
        public Output<string> IpType { get; private set; } = null!;

        /// <summary>
        /// Name of the instance. This name can have a string of 1 to 63 characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The duration that you will buy Ddosbgp instance (in month). Valid values: [1~9], 12, 24, 36. Default to 12. At present, the provider does not support modify "period".
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// Type of the instance. Valid values: Enterprise,Professional. Default to `Enterprise`
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;


        /// <summary>
        /// Create a DdosBgpInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DdosBgpInstance(string name, DdosBgpInstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ddos/ddosBgpInstance:DdosBgpInstance", name, args ?? new DdosBgpInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DdosBgpInstance(string name, Input<string> id, DdosBgpInstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ddos/ddosBgpInstance:DdosBgpInstance", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new Pulumi.Alias { Type = "alicloud:dns/ddosBgpInstance:DdosBgpInstance"},
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DdosBgpInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DdosBgpInstance Get(string name, Input<string> id, DdosBgpInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new DdosBgpInstance(name, id, state, options);
        }
    }

    public sealed class DdosBgpInstanceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 51,91,101,201,301. The unit is Gbps.
        /// </summary>
        [Input("bandwidth", required: true)]
        public Input<int> Bandwidth { get; set; } = null!;

        /// <summary>
        /// Base defend bandwidth of the instance. Valid values: 20. The unit is Gbps. Default to `20`.
        /// </summary>
        [Input("baseBandwidth")]
        public Input<int>? BaseBandwidth { get; set; }

        /// <summary>
        /// IP count of the instance. Valid values: 100.
        /// </summary>
        [Input("ipCount", required: true)]
        public Input<int> IpCount { get; set; } = null!;

        /// <summary>
        /// IP version of the instance. Valid values: IPv4,IPv6.
        /// </summary>
        [Input("ipType", required: true)]
        public Input<string> IpType { get; set; } = null!;

        /// <summary>
        /// Name of the instance. This name can have a string of 1 to 63 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The duration that you will buy Ddosbgp instance (in month). Valid values: [1~9], 12, 24, 36. Default to 12. At present, the provider does not support modify "period".
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Type of the instance. Valid values: Enterprise,Professional. Default to `Enterprise`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DdosBgpInstanceArgs()
        {
        }
    }

    public sealed class DdosBgpInstanceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: 51,91,101,201,301. The unit is Gbps.
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// Base defend bandwidth of the instance. Valid values: 20. The unit is Gbps. Default to `20`.
        /// </summary>
        [Input("baseBandwidth")]
        public Input<int>? BaseBandwidth { get; set; }

        /// <summary>
        /// IP count of the instance. Valid values: 100.
        /// </summary>
        [Input("ipCount")]
        public Input<int>? IpCount { get; set; }

        /// <summary>
        /// IP version of the instance. Valid values: IPv4,IPv6.
        /// </summary>
        [Input("ipType")]
        public Input<string>? IpType { get; set; }

        /// <summary>
        /// Name of the instance. This name can have a string of 1 to 63 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The duration that you will buy Ddosbgp instance (in month). Valid values: [1~9], 12, 24, 36. Default to 12. At present, the provider does not support modify "period".
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// Type of the instance. Valid values: Enterprise,Professional. Default to `Enterprise`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DdosBgpInstanceState()
        {
        }
    }
}
