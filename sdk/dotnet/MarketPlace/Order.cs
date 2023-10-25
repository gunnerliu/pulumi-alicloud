// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MarketPlace
{
    /// <summary>
    /// ## Import
    /// 
    /// Market order can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:marketplace/order:Order order your-order-id
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:marketplace/order:Order")]
    public partial class Order : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Service providers customize additional components.
        /// </summary>
        [Output("components")]
        public Output<ImmutableDictionary<string, object>?> Components { get; private set; } = null!;

        /// <summary>
        /// The coupon id of the market product.
        /// </summary>
        [Output("couponId")]
        public Output<string?> CouponId { get; private set; } = null!;

        /// <summary>
        /// The number of purchase cycles.
        /// </summary>
        [Output("duration")]
        public Output<int?> Duration { get; private set; } = null!;

        /// <summary>
        /// The package version of the market product.
        /// </summary>
        [Output("packageVersion")]
        public Output<string> PackageVersion { get; private set; } = null!;

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
        /// </summary>
        [Output("payType")]
        public Output<string?> PayType { get; private set; } = null!;

        /// <summary>
        /// The purchase cycle of the product, valid values are `Day`, `Month` and `Year`.
        /// </summary>
        [Output("pricingCycle")]
        public Output<string> PricingCycle { get; private set; } = null!;

        /// <summary>
        /// The product_code of market place product.
        /// </summary>
        [Output("productCode")]
        public Output<string> ProductCode { get; private set; } = null!;

        /// <summary>
        /// The quantity of the market product will be purchased.
        /// </summary>
        [Output("quantity")]
        public Output<int?> Quantity { get; private set; } = null!;


        /// <summary>
        /// Create a Order resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Order(string name, OrderArgs args, CustomResourceOptions? options = null)
            : base("alicloud:marketplace/order:Order", name, args ?? new OrderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Order(string name, Input<string> id, OrderState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:marketplace/order:Order", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Order resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Order Get(string name, Input<string> id, OrderState? state = null, CustomResourceOptions? options = null)
        {
            return new Order(name, id, state, options);
        }
    }

    public sealed class OrderArgs : global::Pulumi.ResourceArgs
    {
        [Input("components")]
        private InputMap<object>? _components;

        /// <summary>
        /// Service providers customize additional components.
        /// </summary>
        public InputMap<object> Components
        {
            get => _components ?? (_components = new InputMap<object>());
            set => _components = value;
        }

        /// <summary>
        /// The coupon id of the market product.
        /// </summary>
        [Input("couponId")]
        public Input<string>? CouponId { get; set; }

        /// <summary>
        /// The number of purchase cycles.
        /// </summary>
        [Input("duration")]
        public Input<int>? Duration { get; set; }

        /// <summary>
        /// The package version of the market product.
        /// </summary>
        [Input("packageVersion", required: true)]
        public Input<string> PackageVersion { get; set; } = null!;

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
        /// </summary>
        [Input("payType")]
        public Input<string>? PayType { get; set; }

        /// <summary>
        /// The purchase cycle of the product, valid values are `Day`, `Month` and `Year`.
        /// </summary>
        [Input("pricingCycle", required: true)]
        public Input<string> PricingCycle { get; set; } = null!;

        /// <summary>
        /// The product_code of market place product.
        /// </summary>
        [Input("productCode", required: true)]
        public Input<string> ProductCode { get; set; } = null!;

        /// <summary>
        /// The quantity of the market product will be purchased.
        /// </summary>
        [Input("quantity")]
        public Input<int>? Quantity { get; set; }

        public OrderArgs()
        {
        }
        public static new OrderArgs Empty => new OrderArgs();
    }

    public sealed class OrderState : global::Pulumi.ResourceArgs
    {
        [Input("components")]
        private InputMap<object>? _components;

        /// <summary>
        /// Service providers customize additional components.
        /// </summary>
        public InputMap<object> Components
        {
            get => _components ?? (_components = new InputMap<object>());
            set => _components = value;
        }

        /// <summary>
        /// The coupon id of the market product.
        /// </summary>
        [Input("couponId")]
        public Input<string>? CouponId { get; set; }

        /// <summary>
        /// The number of purchase cycles.
        /// </summary>
        [Input("duration")]
        public Input<int>? Duration { get; set; }

        /// <summary>
        /// The package version of the market product.
        /// </summary>
        [Input("packageVersion")]
        public Input<string>? PackageVersion { get; set; }

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
        /// </summary>
        [Input("payType")]
        public Input<string>? PayType { get; set; }

        /// <summary>
        /// The purchase cycle of the product, valid values are `Day`, `Month` and `Year`.
        /// </summary>
        [Input("pricingCycle")]
        public Input<string>? PricingCycle { get; set; }

        /// <summary>
        /// The product_code of market place product.
        /// </summary>
        [Input("productCode")]
        public Input<string>? ProductCode { get; set; }

        /// <summary>
        /// The quantity of the market product will be purchased.
        /// </summary>
        [Input("quantity")]
        public Input<int>? Quantity { get; set; }

        public OrderState()
        {
        }
        public static new OrderState Empty => new OrderState();
    }
}
