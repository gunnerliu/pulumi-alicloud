// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public partial class CommonBandwithPackage : Pulumi.CustomResource
    {
        /// <summary>
        /// The bandwidth of the common bandwidth package, in Mbps.
        /// </summary>
        [Output("bandwidth")]
        public Output<int> Bandwidth { get; private set; } = null!;

        /// <summary>
        /// The description of the common bandwidth package instance.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The billing method of the common bandwidth package. Valid values are "PayByBandwidth" and "PayBy95" and "PayByTraffic". "PayBy95" is pay by classic 95th percentile pricing. International Account doesn't supports "PayByBandwidth" and "PayBy95". Default to "PayByTraffic".
        /// </summary>
        [Output("internetChargeType")]
        public Output<string?> InternetChargeType { get; private set; } = null!;

        /// <summary>
        /// The type of the Internet Service Provider. Default to `BGP`.
        /// </summary>
        [Output("isp")]
        public Output<string?> Isp { get; private set; } = null!;

        /// <summary>
        /// The name of the common bandwidth package.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Ratio of the common bandwidth package. It is valid when `internet_charge_type` is `PayBy95`. Default to 100. Valid values: [10-100].
        /// </summary>
        [Output("ratio")]
        public Output<int?> Ratio { get; private set; } = null!;

        /// <summary>
        /// The Id of resource group which the common bandwidth package belongs.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;


        /// <summary>
        /// Create a CommonBandwithPackage resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CommonBandwithPackage(string name, CommonBandwithPackageArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpc/commonBandwithPackage:CommonBandwithPackage", name, args ?? new CommonBandwithPackageArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CommonBandwithPackage(string name, Input<string> id, CommonBandwithPackageState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpc/commonBandwithPackage:CommonBandwithPackage", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CommonBandwithPackage resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CommonBandwithPackage Get(string name, Input<string> id, CommonBandwithPackageState? state = null, CustomResourceOptions? options = null)
        {
            return new CommonBandwithPackage(name, id, state, options);
        }
    }

    public sealed class CommonBandwithPackageArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The bandwidth of the common bandwidth package, in Mbps.
        /// </summary>
        [Input("bandwidth", required: true)]
        public Input<int> Bandwidth { get; set; } = null!;

        /// <summary>
        /// The description of the common bandwidth package instance.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The billing method of the common bandwidth package. Valid values are "PayByBandwidth" and "PayBy95" and "PayByTraffic". "PayBy95" is pay by classic 95th percentile pricing. International Account doesn't supports "PayByBandwidth" and "PayBy95". Default to "PayByTraffic".
        /// </summary>
        [Input("internetChargeType")]
        public Input<string>? InternetChargeType { get; set; }

        /// <summary>
        /// The type of the Internet Service Provider. Default to `BGP`.
        /// </summary>
        [Input("isp")]
        public Input<string>? Isp { get; set; }

        /// <summary>
        /// The name of the common bandwidth package.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Ratio of the common bandwidth package. It is valid when `internet_charge_type` is `PayBy95`. Default to 100. Valid values: [10-100].
        /// </summary>
        [Input("ratio")]
        public Input<int>? Ratio { get; set; }

        /// <summary>
        /// The Id of resource group which the common bandwidth package belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        public CommonBandwithPackageArgs()
        {
        }
    }

    public sealed class CommonBandwithPackageState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The bandwidth of the common bandwidth package, in Mbps.
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// The description of the common bandwidth package instance.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The billing method of the common bandwidth package. Valid values are "PayByBandwidth" and "PayBy95" and "PayByTraffic". "PayBy95" is pay by classic 95th percentile pricing. International Account doesn't supports "PayByBandwidth" and "PayBy95". Default to "PayByTraffic".
        /// </summary>
        [Input("internetChargeType")]
        public Input<string>? InternetChargeType { get; set; }

        /// <summary>
        /// The type of the Internet Service Provider. Default to `BGP`.
        /// </summary>
        [Input("isp")]
        public Input<string>? Isp { get; set; }

        /// <summary>
        /// The name of the common bandwidth package.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Ratio of the common bandwidth package. It is valid when `internet_charge_type` is `PayBy95`. Default to 100. Valid values: [10-100].
        /// </summary>
        [Input("ratio")]
        public Input<int>? Ratio { get; set; }

        /// <summary>
        /// The Id of resource group which the common bandwidth package belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        public CommonBandwithPackageState()
        {
        }
    }
}
