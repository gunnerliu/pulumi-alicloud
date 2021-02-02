// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga
{
    /// <summary>
    /// Provides a Global Accelerator (GA) Ip Set resource.
    /// 
    /// For information about Global Accelerator (GA) Ip Set and how to use it, see [What is Ip Set](https://www.alibabacloud.com/help/en/doc-detail/153246.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.113.0+.
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
    ///         var exampleAccelerator = new AliCloud.Ga.Accelerator("exampleAccelerator", new AliCloud.Ga.AcceleratorArgs
    ///         {
    ///             Duration = 1,
    ///             AutoUseCoupon = true,
    ///             Spec = "1",
    ///         });
    ///         var exampleBandwidthPackage = new AliCloud.Ga.BandwidthPackage("exampleBandwidthPackage", new AliCloud.Ga.BandwidthPackageArgs
    ///         {
    ///             Bandwidth = 20,
    ///             Type = "Basic",
    ///             BandwidthType = "Basic",
    ///             Duration = "1",
    ///             AutoPay = true,
    ///             Ratio = 30,
    ///         });
    ///         var exampleBandwidthPackageAttachment = new AliCloud.Ga.BandwidthPackageAttachment("exampleBandwidthPackageAttachment", new AliCloud.Ga.BandwidthPackageAttachmentArgs
    ///         {
    ///             AcceleratorId = exampleAccelerator.Id,
    ///             BandwidthPackageId = exampleBandwidthPackage.Id,
    ///         });
    ///         var exampleIpSet = new AliCloud.Ga.IpSet("exampleIpSet", new AliCloud.Ga.IpSetArgs
    ///         {
    ///             AccelerateRegionId = "cn-hangzhou",
    ///             Bandwidth = 5,
    ///             AcceleratorId = exampleAccelerator.Id,
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 exampleBandwidthPackageAttachment,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Ga Ip Set can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ga/ipSet:IpSet example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ga/ipSet:IpSet")]
    public partial class IpSet : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of an acceleration region.
        /// </summary>
        [Output("accelerateRegionId")]
        public Output<string> AccelerateRegionId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Global Accelerator (GA) instance.
        /// </summary>
        [Output("acceleratorId")]
        public Output<string> AcceleratorId { get; private set; } = null!;

        /// <summary>
        /// The bandwidth allocated to the acceleration region.
        /// </summary>
        [Output("bandwidth")]
        public Output<int?> Bandwidth { get; private set; } = null!;

        /// <summary>
        /// The list of accelerated IP addresses in the acceleration region.
        /// </summary>
        [Output("ipAddressLists")]
        public Output<ImmutableArray<string>> IpAddressLists { get; private set; } = null!;

        /// <summary>
        /// The IP protocol used by the GA instance. Valid values: `IPv4`, `IPv6`. Default value is `IPv4`.
        /// </summary>
        [Output("ipVersion")]
        public Output<string?> IpVersion { get; private set; } = null!;

        /// <summary>
        /// The status of the acceleration region.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a IpSet resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IpSet(string name, IpSetArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ga/ipSet:IpSet", name, args ?? new IpSetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IpSet(string name, Input<string> id, IpSetState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ga/ipSet:IpSet", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IpSet resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IpSet Get(string name, Input<string> id, IpSetState? state = null, CustomResourceOptions? options = null)
        {
            return new IpSet(name, id, state, options);
        }
    }

    public sealed class IpSetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of an acceleration region.
        /// </summary>
        [Input("accelerateRegionId", required: true)]
        public Input<string> AccelerateRegionId { get; set; } = null!;

        /// <summary>
        /// The ID of the Global Accelerator (GA) instance.
        /// </summary>
        [Input("acceleratorId", required: true)]
        public Input<string> AcceleratorId { get; set; } = null!;

        /// <summary>
        /// The bandwidth allocated to the acceleration region.
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// The IP protocol used by the GA instance. Valid values: `IPv4`, `IPv6`. Default value is `IPv4`.
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        public IpSetArgs()
        {
        }
    }

    public sealed class IpSetState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of an acceleration region.
        /// </summary>
        [Input("accelerateRegionId")]
        public Input<string>? AccelerateRegionId { get; set; }

        /// <summary>
        /// The ID of the Global Accelerator (GA) instance.
        /// </summary>
        [Input("acceleratorId")]
        public Input<string>? AcceleratorId { get; set; }

        /// <summary>
        /// The bandwidth allocated to the acceleration region.
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        [Input("ipAddressLists")]
        private InputList<string>? _ipAddressLists;

        /// <summary>
        /// The list of accelerated IP addresses in the acceleration region.
        /// </summary>
        public InputList<string> IpAddressLists
        {
            get => _ipAddressLists ?? (_ipAddressLists = new InputList<string>());
            set => _ipAddressLists = value;
        }

        /// <summary>
        /// The IP protocol used by the GA instance. Valid values: `IPv4`, `IPv6`. Default value is `IPv4`.
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        /// <summary>
        /// The status of the acceleration region.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public IpSetState()
        {
        }
    }
}
