// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bastionhost

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// > **NOTE:** From the version 1.132.0, the data source has been renamed to `bastionhost.getInstances`.
//
// This data source provides a list of cloud Bastionhost instances in an Alibaba Cloud account according to the specified filters.
//
// > **NOTE:** Available in 1.63.0+ .
func GetInstances(ctx *pulumi.Context, args *GetInstancesArgs, opts ...pulumi.InvokeOption) (*GetInstancesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInstancesResult
	err := ctx.Invoke("alicloud:bastionhost/getInstances:getInstances", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstances.
type GetInstancesArgs struct {
	// A regex string to filter results by the instance description.
	DescriptionRegex *string `pulumi:"descriptionRegex"`
	// Matched instance IDs to filter data source result.
	Ids []string `pulumi:"ids"`
	// File name to persist data source output.
	OutputFile *string `pulumi:"outputFile"`
	// A map of tags assigned to the bastionhost instance. It must be in the format:
	Tags map[string]interface{} `pulumi:"tags"`
}

// A collection of values returned by getInstances.
type GetInstancesResult struct {
	DescriptionRegex *string  `pulumi:"descriptionRegex"`
	Descriptions     []string `pulumi:"descriptions"`
	// The provider-assigned unique ID for this managed resource.
	Id  string   `pulumi:"id"`
	Ids []string `pulumi:"ids"`
	// A list of apis. Each element contains the following attributes:
	Instances  []GetInstancesInstance `pulumi:"instances"`
	OutputFile *string                `pulumi:"outputFile"`
	// A map of tags assigned to the bastionhost instance.
	Tags map[string]interface{} `pulumi:"tags"`
}

func GetInstancesOutput(ctx *pulumi.Context, args GetInstancesOutputArgs, opts ...pulumi.InvokeOption) GetInstancesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetInstancesResult, error) {
			args := v.(GetInstancesArgs)
			r, err := GetInstances(ctx, &args, opts...)
			var s GetInstancesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetInstancesResultOutput)
}

// A collection of arguments for invoking getInstances.
type GetInstancesOutputArgs struct {
	// A regex string to filter results by the instance description.
	DescriptionRegex pulumi.StringPtrInput `pulumi:"descriptionRegex"`
	// Matched instance IDs to filter data source result.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name to persist data source output.
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// A map of tags assigned to the bastionhost instance. It must be in the format:
	Tags pulumi.MapInput `pulumi:"tags"`
}

func (GetInstancesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesArgs)(nil)).Elem()
}

// A collection of values returned by getInstances.
type GetInstancesResultOutput struct{ *pulumi.OutputState }

func (GetInstancesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesResult)(nil)).Elem()
}

func (o GetInstancesResultOutput) ToGetInstancesResultOutput() GetInstancesResultOutput {
	return o
}

func (o GetInstancesResultOutput) ToGetInstancesResultOutputWithContext(ctx context.Context) GetInstancesResultOutput {
	return o
}

func (o GetInstancesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetInstancesResult] {
	return pulumix.Output[GetInstancesResult]{
		OutputState: o.OutputState,
	}
}

func (o GetInstancesResultOutput) DescriptionRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstancesResult) *string { return v.DescriptionRegex }).(pulumi.StringPtrOutput)
}

func (o GetInstancesResultOutput) Descriptions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetInstancesResult) []string { return v.Descriptions }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetInstancesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetInstancesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetInstancesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// A list of apis. Each element contains the following attributes:
func (o GetInstancesResultOutput) Instances() GetInstancesInstanceArrayOutput {
	return o.ApplyT(func(v GetInstancesResult) []GetInstancesInstance { return v.Instances }).(GetInstancesInstanceArrayOutput)
}

func (o GetInstancesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstancesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A map of tags assigned to the bastionhost instance.
func (o GetInstancesResultOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetInstancesResult) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstancesResultOutput{})
}
