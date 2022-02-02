// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MarketPlace
{
    public static class GetProduct
    {
        /// <summary>
        /// This data source provides the Market product item details of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in 1.69.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var @default = Output.Create(AliCloud.MarketPlace.GetProduct.InvokeAsync(new AliCloud.MarketPlace.GetProductArgs
        ///         {
        ///             ProductCode = "cmapi022206",
        ///         }));
        ///         this.ProductName = @default.Apply(@default =&gt; @default.Products?[0]?.Name);
        ///         this.FirstProductSkuCode = @default.Apply(@default =&gt; @default.Products?[0]?.Skuses?[0]?.SkuCode);
        ///         this.FirstProductPackageVersion = @default.Apply(@default =&gt; @default.Products?[0]?.Skuses?[0]?.PackageVersions?[0]?.PackageVersion);
        ///     }
        /// 
        ///     [Output("productName")]
        ///     public Output&lt;string&gt; ProductName { get; set; }
        ///     [Output("firstProductSkuCode")]
        ///     public Output&lt;string&gt; FirstProductSkuCode { get; set; }
        ///     [Output("firstProductPackageVersion")]
        ///     public Output&lt;string&gt; FirstProductPackageVersion { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetProductResult> InvokeAsync(GetProductArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetProductResult>("alicloud:marketplace/getProduct:getProduct", args ?? new GetProductArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Market product item details of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in 1.69.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var @default = Output.Create(AliCloud.MarketPlace.GetProduct.InvokeAsync(new AliCloud.MarketPlace.GetProductArgs
        ///         {
        ///             ProductCode = "cmapi022206",
        ///         }));
        ///         this.ProductName = @default.Apply(@default =&gt; @default.Products?[0]?.Name);
        ///         this.FirstProductSkuCode = @default.Apply(@default =&gt; @default.Products?[0]?.Skuses?[0]?.SkuCode);
        ///         this.FirstProductPackageVersion = @default.Apply(@default =&gt; @default.Products?[0]?.Skuses?[0]?.PackageVersions?[0]?.PackageVersion);
        ///     }
        /// 
        ///     [Output("productName")]
        ///     public Output&lt;string&gt; ProductName { get; set; }
        ///     [Output("firstProductSkuCode")]
        ///     public Output&lt;string&gt; FirstProductSkuCode { get; set; }
        ///     [Output("firstProductPackageVersion")]
        ///     public Output&lt;string&gt; FirstProductPackageVersion { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetProductResult> Invoke(GetProductInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetProductResult>("alicloud:marketplace/getProduct:getProduct", args ?? new GetProductInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProductArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// A available region id used to filter market place Ecs images.
        /// </summary>
        [Input("availableRegion")]
        public string? AvailableRegion { get; set; }

        /// <summary>
        /// The product code of the market product.
        /// </summary>
        [Input("productCode", required: true)]
        public string ProductCode { get; set; } = null!;

        public GetProductArgs()
        {
        }
    }

    public sealed class GetProductInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// A available region id used to filter market place Ecs images.
        /// </summary>
        [Input("availableRegion")]
        public Input<string>? AvailableRegion { get; set; }

        /// <summary>
        /// The product code of the market product.
        /// </summary>
        [Input("productCode", required: true)]
        public Input<string> ProductCode { get; set; } = null!;

        public GetProductInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetProductResult
    {
        public readonly string? AvailableRegion;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProductCode;
        /// <summary>
        /// A product. It contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetProductProductResult> Products;

        [OutputConstructor]
        private GetProductResult(
            string? availableRegion,

            string id,

            string productCode,

            ImmutableArray<Outputs.GetProductProductResult> products)
        {
            AvailableRegion = availableRegion;
            Id = id;
            ProductCode = productCode;
            Products = products;
        }
    }
}
