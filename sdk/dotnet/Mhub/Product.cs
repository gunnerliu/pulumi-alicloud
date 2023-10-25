// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Mhub
{
    /// <summary>
    /// Provides a MHUB Product resource.
    /// 
    /// For information about MHUB Product and how to use it, see [What is Product](https://help.aliyun.com/product/65109.html).
    /// 
    /// &gt; **NOTE:** Available in v1.138.0+.
    /// 
    /// &gt; **NOTE:** At present, the resource only supports cn-shanghai region.
    /// 
    /// ## Import
    /// 
    /// MHUB Product can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:mhub/product:Product example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:mhub/product:Product")]
    public partial class Product : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ProductName.
        /// </summary>
        [Output("productName")]
        public Output<string> ProductName { get; private set; } = null!;


        /// <summary>
        /// Create a Product resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Product(string name, ProductArgs args, CustomResourceOptions? options = null)
            : base("alicloud:mhub/product:Product", name, args ?? new ProductArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Product(string name, Input<string> id, ProductState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:mhub/product:Product", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Product resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Product Get(string name, Input<string> id, ProductState? state = null, CustomResourceOptions? options = null)
        {
            return new Product(name, id, state, options);
        }
    }

    public sealed class ProductArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ProductName.
        /// </summary>
        [Input("productName", required: true)]
        public Input<string> ProductName { get; set; } = null!;

        public ProductArgs()
        {
        }
        public static new ProductArgs Empty => new ProductArgs();
    }

    public sealed class ProductState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ProductName.
        /// </summary>
        [Input("productName")]
        public Input<string>? ProductName { get; set; }

        public ProductState()
        {
        }
        public static new ProductState Empty => new ProductState();
    }
}
