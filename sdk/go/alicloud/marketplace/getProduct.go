// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package marketplace

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Market product item details of Alibaba Cloud.
//
// > **NOTE:** Available in 1.69.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/marketplace"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := marketplace.GetProduct(ctx, &marketplace.GetProductArgs{
//				ProductCode: "cmapi022206",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("productName", _default.Products[0].Name)
//			ctx.Export("firstProductSkuCode", _default.Products[0].Skuses[0].SkuCode)
//			ctx.Export("firstProductPackageVersion", _default.Products[0].Skuses[0].PackageVersions[0].PackageVersion)
//			return nil
//		})
//	}
//
// ```
func GetProduct(ctx *pulumi.Context, args *GetProductArgs, opts ...pulumi.InvokeOption) (*GetProductResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetProductResult
	err := ctx.Invoke("alicloud:marketplace/getProduct:getProduct", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProduct.
type GetProductArgs struct {
	// A available region id used to filter market place Ecs images.
	AvailableRegion *string `pulumi:"availableRegion"`
	// The product code of the market product.
	ProductCode string `pulumi:"productCode"`
}

// A collection of values returned by getProduct.
type GetProductResult struct {
	AvailableRegion *string `pulumi:"availableRegion"`
	// The provider-assigned unique ID for this managed resource.
	Id          string `pulumi:"id"`
	ProductCode string `pulumi:"productCode"`
	// A product. It contains the following attributes:
	Products []GetProductProduct `pulumi:"products"`
}

func GetProductOutput(ctx *pulumi.Context, args GetProductOutputArgs, opts ...pulumi.InvokeOption) GetProductResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetProductResult, error) {
			args := v.(GetProductArgs)
			r, err := GetProduct(ctx, &args, opts...)
			var s GetProductResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetProductResultOutput)
}

// A collection of arguments for invoking getProduct.
type GetProductOutputArgs struct {
	// A available region id used to filter market place Ecs images.
	AvailableRegion pulumi.StringPtrInput `pulumi:"availableRegion"`
	// The product code of the market product.
	ProductCode pulumi.StringInput `pulumi:"productCode"`
}

func (GetProductOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProductArgs)(nil)).Elem()
}

// A collection of values returned by getProduct.
type GetProductResultOutput struct{ *pulumi.OutputState }

func (GetProductResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProductResult)(nil)).Elem()
}

func (o GetProductResultOutput) ToGetProductResultOutput() GetProductResultOutput {
	return o
}

func (o GetProductResultOutput) ToGetProductResultOutputWithContext(ctx context.Context) GetProductResultOutput {
	return o
}

func (o GetProductResultOutput) AvailableRegion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProductResult) *string { return v.AvailableRegion }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetProductResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProductResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetProductResultOutput) ProductCode() pulumi.StringOutput {
	return o.ApplyT(func(v GetProductResult) string { return v.ProductCode }).(pulumi.StringOutput)
}

// A product. It contains the following attributes:
func (o GetProductResultOutput) Products() GetProductProductArrayOutput {
	return o.ApplyT(func(v GetProductResult) []GetProductProduct { return v.Products }).(GetProductProductArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetProductResultOutput{})
}
