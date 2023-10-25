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

// This data source provides Service Catalog Launch Option available to the user. [What is Launch Option](https://www.alibabacloud.com/help/en/service-catalog/developer-reference/api-servicecatalog-2021-09-01-listlaunchoptions).
//
// > **NOTE:** Available since v1.196.0.
func GetLaunchOptions(ctx *pulumi.Context, args *GetLaunchOptionsArgs, opts ...pulumi.InvokeOption) (*GetLaunchOptionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLaunchOptionsResult
	err := ctx.Invoke("alicloud:servicecatalog/getLaunchOptions:getLaunchOptions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLaunchOptions.
type GetLaunchOptionsArgs struct {
	// A list of Launch Option IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by portfolio name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// Product ID.
	ProductId string `pulumi:"productId"`
}

// A collection of values returned by getLaunchOptions.
type GetLaunchOptionsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id  string   `pulumi:"id"`
	Ids []string `pulumi:"ids"`
	// (Available since v1.197.0) A list of Launch Option Entries. Each element contains the following attributes:
	LaunchOptions []GetLaunchOptionsLaunchOption `pulumi:"launchOptions"`
	NameRegex     *string                        `pulumi:"nameRegex"`
	// (Deprecated since v1.197.0) A list of Launch Option Entries. Each element contains the following attributes:
	//
	// Deprecated: Field 'options' has been deprecated from provider version 1.197.0.
	Options    []GetLaunchOptionsOption `pulumi:"options"`
	OutputFile *string                  `pulumi:"outputFile"`
	ProductId  string                   `pulumi:"productId"`
}

func GetLaunchOptionsOutput(ctx *pulumi.Context, args GetLaunchOptionsOutputArgs, opts ...pulumi.InvokeOption) GetLaunchOptionsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetLaunchOptionsResult, error) {
			args := v.(GetLaunchOptionsArgs)
			r, err := GetLaunchOptions(ctx, &args, opts...)
			var s GetLaunchOptionsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetLaunchOptionsResultOutput)
}

// A collection of arguments for invoking getLaunchOptions.
type GetLaunchOptionsOutputArgs struct {
	// A list of Launch Option IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by portfolio name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Product ID.
	ProductId pulumi.StringInput `pulumi:"productId"`
}

func (GetLaunchOptionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLaunchOptionsArgs)(nil)).Elem()
}

// A collection of values returned by getLaunchOptions.
type GetLaunchOptionsResultOutput struct{ *pulumi.OutputState }

func (GetLaunchOptionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLaunchOptionsResult)(nil)).Elem()
}

func (o GetLaunchOptionsResultOutput) ToGetLaunchOptionsResultOutput() GetLaunchOptionsResultOutput {
	return o
}

func (o GetLaunchOptionsResultOutput) ToGetLaunchOptionsResultOutputWithContext(ctx context.Context) GetLaunchOptionsResultOutput {
	return o
}

func (o GetLaunchOptionsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetLaunchOptionsResult] {
	return pulumix.Output[GetLaunchOptionsResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetLaunchOptionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLaunchOptionsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetLaunchOptionsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetLaunchOptionsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// (Available since v1.197.0) A list of Launch Option Entries. Each element contains the following attributes:
func (o GetLaunchOptionsResultOutput) LaunchOptions() GetLaunchOptionsLaunchOptionArrayOutput {
	return o.ApplyT(func(v GetLaunchOptionsResult) []GetLaunchOptionsLaunchOption { return v.LaunchOptions }).(GetLaunchOptionsLaunchOptionArrayOutput)
}

func (o GetLaunchOptionsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLaunchOptionsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// (Deprecated since v1.197.0) A list of Launch Option Entries. Each element contains the following attributes:
//
// Deprecated: Field 'options' has been deprecated from provider version 1.197.0.
func (o GetLaunchOptionsResultOutput) Options() GetLaunchOptionsOptionArrayOutput {
	return o.ApplyT(func(v GetLaunchOptionsResult) []GetLaunchOptionsOption { return v.Options }).(GetLaunchOptionsOptionArrayOutput)
}

func (o GetLaunchOptionsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLaunchOptionsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetLaunchOptionsResultOutput) ProductId() pulumi.StringOutput {
	return o.ApplyT(func(v GetLaunchOptionsResult) string { return v.ProductId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLaunchOptionsResultOutput{})
}
