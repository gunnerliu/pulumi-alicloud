// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    /// <summary>
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/nat_gateway.html.markdown.
    /// </summary>
    public partial class NatGateway : Pulumi.CustomResource
    {
        /// <summary>
        /// A list ID of the bandwidth packages, and split them with commas.
        /// </summary>
        [Output("bandwidthPackageIds")]
        public Output<string> BandwidthPackageIds { get; private set; } = null!;

        /// <summary>
        /// A list of bandwidth packages for the nat gatway. Only support nat gateway created before 00:00 on November 4, 2017. Available in v1.13.0+ and v1.7.1-.
        /// </summary>
        [Output("bandwidthPackages")]
        public Output<ImmutableArray<Outputs.NatGatewayBandwidthPackages>> BandwidthPackages { get; private set; } = null!;

        /// <summary>
        /// Description of the nat gateway, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Defaults to null.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The nat gateway will auto create a snap and forward item, the `forward_table_ids` is the created one.
        /// </summary>
        [Output("forwardTableIds")]
        public Output<string> ForwardTableIds { get; private set; } = null!;

        /// <summary>
        /// The billing method of the nat gateway. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
        /// </summary>
        [Output("instanceChargeType")]
        public Output<string> InstanceChargeType { get; private set; } = null!;

        /// <summary>
        /// Name of the nat gateway. The value can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Defaults to null.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
        /// </summary>
        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// The nat gateway will auto create a snap and forward item, the `snat_table_ids` is the created one.
        /// </summary>
        [Output("snatTableIds")]
        public Output<string> SnatTableIds { get; private set; } = null!;

        /// <summary>
        /// It has been deprecated from provider version 1.7.1, and new field 'specification' can replace it.
        /// </summary>
        [Output("spec")]
        public Output<string?> Spec { get; private set; } = null!;

        /// <summary>
        /// The specification of the nat gateway. Valid values are `Small`, `Middle` and `Large`. Default to `Small`. Details refer to [Nat Gateway Specification](https://www.alibabacloud.com/help/doc-detail/42757.htm).
        /// </summary>
        [Output("specification")]
        public Output<string?> Specification { get; private set; } = null!;

        /// <summary>
        /// The VPC ID.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a NatGateway resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NatGateway(string name, NatGatewayArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpc/natGateway:NatGateway", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private NatGateway(string name, Input<string> id, NatGatewayState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpc/natGateway:NatGateway", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NatGateway resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NatGateway Get(string name, Input<string> id, NatGatewayState? state = null, CustomResourceOptions? options = null)
        {
            return new NatGateway(name, id, state, options);
        }
    }

    public sealed class NatGatewayArgs : Pulumi.ResourceArgs
    {
        [Input("bandwidthPackages")]
        private InputList<Inputs.NatGatewayBandwidthPackagesArgs>? _bandwidthPackages;

        /// <summary>
        /// A list of bandwidth packages for the nat gatway. Only support nat gateway created before 00:00 on November 4, 2017. Available in v1.13.0+ and v1.7.1-.
        /// </summary>
        public InputList<Inputs.NatGatewayBandwidthPackagesArgs> BandwidthPackages
        {
            get => _bandwidthPackages ?? (_bandwidthPackages = new InputList<Inputs.NatGatewayBandwidthPackagesArgs>());
            set => _bandwidthPackages = value;
        }

        /// <summary>
        /// Description of the nat gateway, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Defaults to null.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The billing method of the nat gateway. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        /// <summary>
        /// Name of the nat gateway. The value can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Defaults to null.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// It has been deprecated from provider version 1.7.1, and new field 'specification' can replace it.
        /// </summary>
        [Input("spec")]
        public Input<string>? Spec { get; set; }

        /// <summary>
        /// The specification of the nat gateway. Valid values are `Small`, `Middle` and `Large`. Default to `Small`. Details refer to [Nat Gateway Specification](https://www.alibabacloud.com/help/doc-detail/42757.htm).
        /// </summary>
        [Input("specification")]
        public Input<string>? Specification { get; set; }

        /// <summary>
        /// The VPC ID.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        public NatGatewayArgs()
        {
        }
    }

    public sealed class NatGatewayState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A list ID of the bandwidth packages, and split them with commas.
        /// </summary>
        [Input("bandwidthPackageIds")]
        public Input<string>? BandwidthPackageIds { get; set; }

        [Input("bandwidthPackages")]
        private InputList<Inputs.NatGatewayBandwidthPackagesGetArgs>? _bandwidthPackages;

        /// <summary>
        /// A list of bandwidth packages for the nat gatway. Only support nat gateway created before 00:00 on November 4, 2017. Available in v1.13.0+ and v1.7.1-.
        /// </summary>
        public InputList<Inputs.NatGatewayBandwidthPackagesGetArgs> BandwidthPackages
        {
            get => _bandwidthPackages ?? (_bandwidthPackages = new InputList<Inputs.NatGatewayBandwidthPackagesGetArgs>());
            set => _bandwidthPackages = value;
        }

        /// <summary>
        /// Description of the nat gateway, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Defaults to null.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The nat gateway will auto create a snap and forward item, the `forward_table_ids` is the created one.
        /// </summary>
        [Input("forwardTableIds")]
        public Input<string>? ForwardTableIds { get; set; }

        /// <summary>
        /// The billing method of the nat gateway. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        /// <summary>
        /// Name of the nat gateway. The value can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Defaults to null.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The duration that you will buy the resource, in month. It is valid when `instance_charge_type` is `PrePaid`. Default to 1. Valid values: [1-9, 12, 24, 36]. At present, the provider does not support modify "period" and you can do that via web console.
        /// </summary>
        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The nat gateway will auto create a snap and forward item, the `snat_table_ids` is the created one.
        /// </summary>
        [Input("snatTableIds")]
        public Input<string>? SnatTableIds { get; set; }

        /// <summary>
        /// It has been deprecated from provider version 1.7.1, and new field 'specification' can replace it.
        /// </summary>
        [Input("spec")]
        public Input<string>? Spec { get; set; }

        /// <summary>
        /// The specification of the nat gateway. Valid values are `Small`, `Middle` and `Large`. Default to `Small`. Details refer to [Nat Gateway Specification](https://www.alibabacloud.com/help/doc-detail/42757.htm).
        /// </summary>
        [Input("specification")]
        public Input<string>? Specification { get; set; }

        /// <summary>
        /// The VPC ID.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public NatGatewayState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class NatGatewayBandwidthPackagesArgs : Pulumi.ResourceArgs
    {
        [Input("bandwidth", required: true)]
        public Input<int> Bandwidth { get; set; } = null!;

        [Input("ipCount", required: true)]
        public Input<int> IpCount { get; set; } = null!;

        [Input("publicIpAddresses")]
        public Input<string>? PublicIpAddresses { get; set; }

        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public NatGatewayBandwidthPackagesArgs()
        {
        }
    }

    public sealed class NatGatewayBandwidthPackagesGetArgs : Pulumi.ResourceArgs
    {
        [Input("bandwidth", required: true)]
        public Input<int> Bandwidth { get; set; } = null!;

        [Input("ipCount", required: true)]
        public Input<int> IpCount { get; set; } = null!;

        [Input("publicIpAddresses")]
        public Input<string>? PublicIpAddresses { get; set; }

        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public NatGatewayBandwidthPackagesGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class NatGatewayBandwidthPackages
    {
        public readonly int Bandwidth;
        public readonly int IpCount;
        public readonly string PublicIpAddresses;
        public readonly string Zone;

        [OutputConstructor]
        private NatGatewayBandwidthPackages(
            int bandwidth,
            int ipCount,
            string publicIpAddresses,
            string zone)
        {
            Bandwidth = bandwidth;
            IpCount = ipCount;
            PublicIpAddresses = publicIpAddresses;
            Zone = zone;
        }
    }
    }
}