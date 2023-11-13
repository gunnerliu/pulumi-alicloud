// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Ecs Image Pipelines of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.163.0+.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := ecs.LookupEcsImagePipeline(ctx, &ecs.LookupEcsImagePipelineArgs{
//				Ids: []string{
//					"example_value",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("ecsImagePipelineId1", ids.Pipelines[0].Id)
//			nameRegex, err := ecs.LookupEcsImagePipeline(ctx, &ecs.LookupEcsImagePipelineArgs{
//				NameRegex: pulumi.StringRef("^my-ImagePipeline"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("ecsImagePipelineId2", nameRegex.Pipelines[0].Id)
//			return nil
//		})
//	}
//
// ```
func LookupEcsImagePipeline(ctx *pulumi.Context, args *LookupEcsImagePipelineArgs, opts ...pulumi.InvokeOption) (*LookupEcsImagePipelineResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEcsImagePipelineResult
	err := ctx.Invoke("alicloud:ecs/getEcsImagePipeline:getEcsImagePipeline", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEcsImagePipeline.
type LookupEcsImagePipelineArgs struct {
	// A list of Image Pipeline ids.
	Ids []string `pulumi:"ids"`
	// The name of the image template.
	Name *string `pulumi:"name"`
	// A regex string to filter results by Image Pipeline name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the resource group to which the image template belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// A collection of values returned by getEcsImagePipeline.
type LookupEcsImagePipelineResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id              string                        `pulumi:"id"`
	Ids             []string                      `pulumi:"ids"`
	Name            *string                       `pulumi:"name"`
	NameRegex       *string                       `pulumi:"nameRegex"`
	Names           []string                      `pulumi:"names"`
	OutputFile      *string                       `pulumi:"outputFile"`
	Pipelines       []GetEcsImagePipelinePipeline `pulumi:"pipelines"`
	ResourceGroupId *string                       `pulumi:"resourceGroupId"`
	Tags            map[string]interface{}        `pulumi:"tags"`
}

func LookupEcsImagePipelineOutput(ctx *pulumi.Context, args LookupEcsImagePipelineOutputArgs, opts ...pulumi.InvokeOption) LookupEcsImagePipelineResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEcsImagePipelineResult, error) {
			args := v.(LookupEcsImagePipelineArgs)
			r, err := LookupEcsImagePipeline(ctx, &args, opts...)
			var s LookupEcsImagePipelineResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEcsImagePipelineResultOutput)
}

// A collection of arguments for invoking getEcsImagePipeline.
type LookupEcsImagePipelineOutputArgs struct {
	// A list of Image Pipeline ids.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The name of the image template.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// A regex string to filter results by Image Pipeline name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the resource group to which the image template belongs.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput `pulumi:"tags"`
}

func (LookupEcsImagePipelineOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEcsImagePipelineArgs)(nil)).Elem()
}

// A collection of values returned by getEcsImagePipeline.
type LookupEcsImagePipelineResultOutput struct{ *pulumi.OutputState }

func (LookupEcsImagePipelineResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEcsImagePipelineResult)(nil)).Elem()
}

func (o LookupEcsImagePipelineResultOutput) ToLookupEcsImagePipelineResultOutput() LookupEcsImagePipelineResultOutput {
	return o
}

func (o LookupEcsImagePipelineResultOutput) ToLookupEcsImagePipelineResultOutputWithContext(ctx context.Context) LookupEcsImagePipelineResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEcsImagePipelineResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEcsImagePipelineResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupEcsImagePipelineResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupEcsImagePipelineResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o LookupEcsImagePipelineResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEcsImagePipelineResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o LookupEcsImagePipelineResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEcsImagePipelineResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o LookupEcsImagePipelineResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupEcsImagePipelineResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o LookupEcsImagePipelineResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEcsImagePipelineResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o LookupEcsImagePipelineResultOutput) Pipelines() GetEcsImagePipelinePipelineArrayOutput {
	return o.ApplyT(func(v LookupEcsImagePipelineResult) []GetEcsImagePipelinePipeline { return v.Pipelines }).(GetEcsImagePipelinePipelineArrayOutput)
}

func (o LookupEcsImagePipelineResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEcsImagePipelineResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

func (o LookupEcsImagePipelineResultOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v LookupEcsImagePipelineResult) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEcsImagePipelineResultOutput{})
}
