// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mhub

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Mhub Products of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.138.0+.
func GetProducts(ctx *pulumi.Context, args *GetProductsArgs, opts ...pulumi.InvokeOption) (*GetProductsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetProductsResult
	err := ctx.Invoke("alicloud:mhub/getProducts:getProducts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProducts.
type GetProductsArgs struct {
	// A list of Product IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Product name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getProducts.
type GetProductsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string               `pulumi:"id"`
	Ids        []string             `pulumi:"ids"`
	NameRegex  *string              `pulumi:"nameRegex"`
	Names      []string             `pulumi:"names"`
	OutputFile *string              `pulumi:"outputFile"`
	Products   []GetProductsProduct `pulumi:"products"`
}

func GetProductsOutput(ctx *pulumi.Context, args GetProductsOutputArgs, opts ...pulumi.InvokeOption) GetProductsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetProductsResult, error) {
			args := v.(GetProductsArgs)
			r, err := GetProducts(ctx, &args, opts...)
			var s GetProductsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetProductsResultOutput)
}

// A collection of arguments for invoking getProducts.
type GetProductsOutputArgs struct {
	// A list of Product IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Product name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetProductsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProductsArgs)(nil)).Elem()
}

// A collection of values returned by getProducts.
type GetProductsResultOutput struct{ *pulumi.OutputState }

func (GetProductsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProductsResult)(nil)).Elem()
}

func (o GetProductsResultOutput) ToGetProductsResultOutput() GetProductsResultOutput {
	return o
}

func (o GetProductsResultOutput) ToGetProductsResultOutputWithContext(ctx context.Context) GetProductsResultOutput {
	return o
}

func (o GetProductsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetProductsResult] {
	return pulumix.Output[GetProductsResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetProductsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProductsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetProductsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetProductsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetProductsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProductsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetProductsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetProductsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetProductsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProductsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetProductsResultOutput) Products() GetProductsProductArrayOutput {
	return o.ApplyT(func(v GetProductsResult) []GetProductsProduct { return v.Products }).(GetProductsProductArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetProductsResultOutput{})
}
