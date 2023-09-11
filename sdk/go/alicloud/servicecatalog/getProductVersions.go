// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package servicecatalog

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides Service Catalog Product Version available to the user.[What is Product Version](https://www.alibabacloud.com/help/en/servicecatalog/latest/api-doc-servicecatalog-2021-09-01-api-doc-listproductversions)
//
// > **NOTE:** Available in 1.196.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/servicecatalog"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := servicecatalog.GetProductVersions(ctx, &servicecatalog.GetProductVersionsArgs{
//				NameRegex: pulumi.StringRef("1.0.0"),
//				ProductId: "prod-bp125x4k29wb7q",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("alicloudServiceCatalogProductVersionExampleId", _default.ProductVersions[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetProductVersions(ctx *pulumi.Context, args *GetProductVersionsArgs, opts ...pulumi.InvokeOption) (*GetProductVersionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetProductVersionsResult
	err := ctx.Invoke("alicloud:servicecatalog/getProductVersions:getProductVersions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProductVersions.
type GetProductVersionsArgs struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Product Version IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Group Metric Rule name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// Product ID
	ProductId string `pulumi:"productId"`
}

// A collection of values returned by getProductVersions.
type GetProductVersionsResult struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Product Version IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of name of Product Versions.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	ProductId  string   `pulumi:"productId"`
	// A list of Product Version Entries. Each element contains the following attributes:
	ProductVersions []GetProductVersionsProductVersion `pulumi:"productVersions"`
	// Deprecated: Field 'versions' has been deprecated from provider version 1.197.0.
	Versions []GetProductVersionsVersion `pulumi:"versions"`
}

func GetProductVersionsOutput(ctx *pulumi.Context, args GetProductVersionsOutputArgs, opts ...pulumi.InvokeOption) GetProductVersionsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetProductVersionsResult, error) {
			args := v.(GetProductVersionsArgs)
			r, err := GetProductVersions(ctx, &args, opts...)
			var s GetProductVersionsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetProductVersionsResultOutput)
}

// A collection of arguments for invoking getProductVersions.
type GetProductVersionsOutputArgs struct {
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Product Version IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Group Metric Rule name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Product ID
	ProductId pulumi.StringInput `pulumi:"productId"`
}

func (GetProductVersionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProductVersionsArgs)(nil)).Elem()
}

// A collection of values returned by getProductVersions.
type GetProductVersionsResultOutput struct{ *pulumi.OutputState }

func (GetProductVersionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProductVersionsResult)(nil)).Elem()
}

func (o GetProductVersionsResultOutput) ToGetProductVersionsResultOutput() GetProductVersionsResultOutput {
	return o
}

func (o GetProductVersionsResultOutput) ToGetProductVersionsResultOutputWithContext(ctx context.Context) GetProductVersionsResultOutput {
	return o
}

func (o GetProductVersionsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetProductVersionsResult] {
	return pulumix.Output[GetProductVersionsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetProductVersionsResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetProductVersionsResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetProductVersionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProductVersionsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of Product Version IDs.
func (o GetProductVersionsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetProductVersionsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetProductVersionsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProductVersionsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of name of Product Versions.
func (o GetProductVersionsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetProductVersionsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetProductVersionsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetProductVersionsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetProductVersionsResultOutput) ProductId() pulumi.StringOutput {
	return o.ApplyT(func(v GetProductVersionsResult) string { return v.ProductId }).(pulumi.StringOutput)
}

// A list of Product Version Entries. Each element contains the following attributes:
func (o GetProductVersionsResultOutput) ProductVersions() GetProductVersionsProductVersionArrayOutput {
	return o.ApplyT(func(v GetProductVersionsResult) []GetProductVersionsProductVersion { return v.ProductVersions }).(GetProductVersionsProductVersionArrayOutput)
}

// Deprecated: Field 'versions' has been deprecated from provider version 1.197.0.
func (o GetProductVersionsResultOutput) Versions() GetProductVersionsVersionArrayOutput {
	return o.ApplyT(func(v GetProductVersionsResult) []GetProductVersionsVersion { return v.Versions }).(GetProductVersionsVersionArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetProductVersionsResultOutput{})
}
