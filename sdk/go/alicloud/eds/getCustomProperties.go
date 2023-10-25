// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eds

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Ecd Custom Properties of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.176.0+.
func GetCustomProperties(ctx *pulumi.Context, args *GetCustomPropertiesArgs, opts ...pulumi.InvokeOption) (*GetCustomPropertiesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetCustomPropertiesResult
	err := ctx.Invoke("alicloud:eds/getCustomProperties:getCustomProperties", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCustomProperties.
type GetCustomPropertiesArgs struct {
	// A list of Custom Property IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getCustomProperties.
type GetCustomPropertiesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string                        `pulumi:"id"`
	Ids        []string                      `pulumi:"ids"`
	OutputFile *string                       `pulumi:"outputFile"`
	Properties []GetCustomPropertiesProperty `pulumi:"properties"`
}

func GetCustomPropertiesOutput(ctx *pulumi.Context, args GetCustomPropertiesOutputArgs, opts ...pulumi.InvokeOption) GetCustomPropertiesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetCustomPropertiesResult, error) {
			args := v.(GetCustomPropertiesArgs)
			r, err := GetCustomProperties(ctx, &args, opts...)
			var s GetCustomPropertiesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetCustomPropertiesResultOutput)
}

// A collection of arguments for invoking getCustomProperties.
type GetCustomPropertiesOutputArgs struct {
	// A list of Custom Property IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetCustomPropertiesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCustomPropertiesArgs)(nil)).Elem()
}

// A collection of values returned by getCustomProperties.
type GetCustomPropertiesResultOutput struct{ *pulumi.OutputState }

func (GetCustomPropertiesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCustomPropertiesResult)(nil)).Elem()
}

func (o GetCustomPropertiesResultOutput) ToGetCustomPropertiesResultOutput() GetCustomPropertiesResultOutput {
	return o
}

func (o GetCustomPropertiesResultOutput) ToGetCustomPropertiesResultOutputWithContext(ctx context.Context) GetCustomPropertiesResultOutput {
	return o
}

func (o GetCustomPropertiesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetCustomPropertiesResult] {
	return pulumix.Output[GetCustomPropertiesResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetCustomPropertiesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCustomPropertiesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetCustomPropertiesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetCustomPropertiesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetCustomPropertiesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCustomPropertiesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetCustomPropertiesResultOutput) Properties() GetCustomPropertiesPropertyArrayOutput {
	return o.ApplyT(func(v GetCustomPropertiesResult) []GetCustomPropertiesProperty { return v.Properties }).(GetCustomPropertiesPropertyArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCustomPropertiesResultOutput{})
}
