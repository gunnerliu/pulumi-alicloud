// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sddp

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Sddp Configs of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.133.0+.
func GetConfigs(ctx *pulumi.Context, args *GetConfigsArgs, opts ...pulumi.InvokeOption) (*GetConfigsResult, error) {
	var rv GetConfigsResult
	err := ctx.Invoke("alicloud:sddp/getConfigs:getConfigs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConfigs.
type GetConfigsArgs struct {
	// A list of Config IDs.
	Ids  []string `pulumi:"ids"`
	Lang *string  `pulumi:"lang"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getConfigs.
type GetConfigsResult struct {
	Configs []GetConfigsConfig `pulumi:"configs"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	Lang       *string  `pulumi:"lang"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetConfigsOutput(ctx *pulumi.Context, args GetConfigsOutputArgs, opts ...pulumi.InvokeOption) GetConfigsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetConfigsResult, error) {
			args := v.(GetConfigsArgs)
			r, err := GetConfigs(ctx, &args, opts...)
			var s GetConfigsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetConfigsResultOutput)
}

// A collection of arguments for invoking getConfigs.
type GetConfigsOutputArgs struct {
	// A list of Config IDs.
	Ids  pulumi.StringArrayInput `pulumi:"ids"`
	Lang pulumi.StringPtrInput   `pulumi:"lang"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetConfigsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConfigsArgs)(nil)).Elem()
}

// A collection of values returned by getConfigs.
type GetConfigsResultOutput struct{ *pulumi.OutputState }

func (GetConfigsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConfigsResult)(nil)).Elem()
}

func (o GetConfigsResultOutput) ToGetConfigsResultOutput() GetConfigsResultOutput {
	return o
}

func (o GetConfigsResultOutput) ToGetConfigsResultOutputWithContext(ctx context.Context) GetConfigsResultOutput {
	return o
}

func (o GetConfigsResultOutput) Configs() GetConfigsConfigArrayOutput {
	return o.ApplyT(func(v GetConfigsResult) []GetConfigsConfig { return v.Configs }).(GetConfigsConfigArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetConfigsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetConfigsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetConfigsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetConfigsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetConfigsResultOutput) Lang() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetConfigsResult) *string { return v.Lang }).(pulumi.StringPtrOutput)
}

func (o GetConfigsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetConfigsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetConfigsResultOutput{})
}
