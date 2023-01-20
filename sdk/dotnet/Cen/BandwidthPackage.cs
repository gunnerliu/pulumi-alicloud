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
    /// ## Import
    /// 
    /// CEN bandwidth package can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cen/bandwidthPackage:BandwidthPackage example cenbwp-abc123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cen/bandwidthPackage:BandwidthPackage")]
    public partial class BandwidthPackage : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
        /// </summary>
        [Output("bandwidth")]
        public Output<int> Bandwidth { get; private set; } = null!;

        /// <summary>
        /// The name of the bandwidth package. Defaults to null.
        /// </summary>
        [Output("cenBandwidthPackageName")]
        public Output<string> CenBandwidthPackageName { get; private set; } = null!;

        /// <summary>
        /// Field `charge_type` has been deprecated from version 1.97.0. Use `payment_type` and instead.
        /// </summary>
        [Output("chargeType")]
        public Output<string> ChargeType { get; private set; } = null!;

        /// <summary>
        /// The description of the bandwidth package. Default to null.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The time of the bandwidth package to expire.
        /// </summary>
        [Output("expiredTime")]
        public Output<string> ExpiredTime { get; private set; } = null!;

        /// <summary>
        /// The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
        /// </summary>
        [Output("geographicRegionAId")]
        public Output<string> GeographicRegionAId { get; private set; } = null!;

        /// <summary>
        /// The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
        /// </summary>
        [Output("geographicRegionBId")]
        public Output<string> GeographicRegionBId { get; private set; } = null!;

        /// <summary>
        /// Field `geographic_region_ids` has been deprecated from version 1.97.0. Use `geographic_region_a_id` and `geographic_region_b_id` instead.
        /// </summary>
        [Output("geographicRegionIds")]
        public Output<ImmutableArray<string>> GeographicRegionIds { get; private set; } = null!;

        /// <summary>
        /// Field `name` has been deprecated from version 1.97.0. Use `cen_bandwidth_package_name` and instead.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PrePaid`. If set to PrePaid, the bandwidth package can't be deleted before expired time.
        /// </summary>
        [Output("paymentType")]
        public Output<string> PaymentType { get; private set; } = null!;

        [Output("period")]
        public Output<int?> Period { get; private set; } = null!;

        /// <summary>
        /// The association status of the bandwidth package.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a BandwidthPackage resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BandwidthPackage(string name, BandwidthPackageArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cen/bandwidthPackage:BandwidthPackage", name, args ?? new BandwidthPackageArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BandwidthPackage(string name, Input<string> id, BandwidthPackageState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cen/bandwidthPackage:BandwidthPackage", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BandwidthPackage resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BandwidthPackage Get(string name, Input<string> id, BandwidthPackageState? state = null, CustomResourceOptions? options = null)
        {
            return new BandwidthPackage(name, id, state, options);
        }
    }

    public sealed class BandwidthPackageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
        /// </summary>
        [Input("bandwidth", required: true)]
        public Input<int> Bandwidth { get; set; } = null!;

        /// <summary>
        /// The name of the bandwidth package. Defaults to null.
        /// </summary>
        [Input("cenBandwidthPackageName")]
        public Input<string>? CenBandwidthPackageName { get; set; }

        /// <summary>
        /// Field `charge_type` has been deprecated from version 1.97.0. Use `payment_type` and instead.
        /// </summary>
        [Input("chargeType")]
        public Input<string>? ChargeType { get; set; }

        /// <summary>
        /// The description of the bandwidth package. Default to null.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
        /// </summary>
        [Input("geographicRegionAId")]
        public Input<string>? GeographicRegionAId { get; set; }

        /// <summary>
        /// The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
        /// </summary>
        [Input("geographicRegionBId")]
        public Input<string>? GeographicRegionBId { get; set; }

        [Input("geographicRegionIds")]
        private InputList<string>? _geographicRegionIds;

        /// <summary>
        /// Field `geographic_region_ids` has been deprecated from version 1.97.0. Use `geographic_region_a_id` and `geographic_region_b_id` instead.
        /// </summary>
        [Obsolete(@"Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead.")]
        public InputList<string> GeographicRegionIds
        {
            get => _geographicRegionIds ?? (_geographicRegionIds = new InputList<string>());
            set => _geographicRegionIds = value;
        }

        /// <summary>
        /// Field `name` has been deprecated from version 1.97.0. Use `cen_bandwidth_package_name` and instead.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PrePaid`. If set to PrePaid, the bandwidth package can't be deleted before expired time.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        [Input("period")]
        public Input<int>? Period { get; set; }

        public BandwidthPackageArgs()
        {
        }
        public static new BandwidthPackageArgs Empty => new BandwidthPackageArgs();
    }

    public sealed class BandwidthPackageState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The bandwidth in Mbps of the bandwidth package. Cannot be less than 2Mbps.
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// The name of the bandwidth package. Defaults to null.
        /// </summary>
        [Input("cenBandwidthPackageName")]
        public Input<string>? CenBandwidthPackageName { get; set; }

        /// <summary>
        /// Field `charge_type` has been deprecated from version 1.97.0. Use `payment_type` and instead.
        /// </summary>
        [Input("chargeType")]
        public Input<string>? ChargeType { get; set; }

        /// <summary>
        /// The description of the bandwidth package. Default to null.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The time of the bandwidth package to expire.
        /// </summary>
        [Input("expiredTime")]
        public Input<string>? ExpiredTime { get; set; }

        /// <summary>
        /// The area A to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
        /// </summary>
        [Input("geographicRegionAId")]
        public Input<string>? GeographicRegionAId { get; set; }

        /// <summary>
        /// The area B to which the network instance belongs. Valid values: `China` | `North-America` | `Asia-Pacific` | `Europe` | `Australia`.
        /// </summary>
        [Input("geographicRegionBId")]
        public Input<string>? GeographicRegionBId { get; set; }

        [Input("geographicRegionIds")]
        private InputList<string>? _geographicRegionIds;

        /// <summary>
        /// Field `geographic_region_ids` has been deprecated from version 1.97.0. Use `geographic_region_a_id` and `geographic_region_b_id` instead.
        /// </summary>
        [Obsolete(@"Field 'geographic_region_ids' has been deprecated from version 1.98.0. Use 'geographic_region_a_id' and 'geographic_region_b_id' instead.")]
        public InputList<string> GeographicRegionIds
        {
            get => _geographicRegionIds ?? (_geographicRegionIds = new InputList<string>());
            set => _geographicRegionIds = value;
        }

        /// <summary>
        /// Field `name` has been deprecated from version 1.97.0. Use `cen_bandwidth_package_name` and instead.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The billing method. Valid value: `PostPaid` | `PrePaid`. Default to `PrePaid`. If set to PrePaid, the bandwidth package can't be deleted before expired time.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        [Input("period")]
        public Input<int>? Period { get; set; }

        /// <summary>
        /// The association status of the bandwidth package.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public BandwidthPackageState()
        {
        }
        public static new BandwidthPackageState Empty => new BandwidthPackageState();
    }
}
