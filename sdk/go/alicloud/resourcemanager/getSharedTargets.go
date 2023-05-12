// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package resourcemanager

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Resource Manager Shared Targets of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.111.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := resourcemanager.GetSharedTargets(ctx, &resourcemanager.GetSharedTargetsArgs{
//				Ids: []string{
//					"15681091********",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstResourceManagerSharedTargetId", example.Targets[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetSharedTargets(ctx *pulumi.Context, args *GetSharedTargetsArgs, opts ...pulumi.InvokeOption) (*GetSharedTargetsResult, error) {
	var rv GetSharedTargetsResult
	err := ctx.Invoke("alicloud:resourcemanager/getSharedTargets:getSharedTargets", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSharedTargets.
type GetSharedTargetsArgs struct {
	// A list of Shared Target IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The resource shared ID of resource manager.
	ResourceShareId *string `pulumi:"resourceShareId"`
	// The status of shared target.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getSharedTargets.
type GetSharedTargetsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id              string                   `pulumi:"id"`
	Ids             []string                 `pulumi:"ids"`
	OutputFile      *string                  `pulumi:"outputFile"`
	ResourceShareId *string                  `pulumi:"resourceShareId"`
	Status          *string                  `pulumi:"status"`
	Targets         []GetSharedTargetsTarget `pulumi:"targets"`
}

func GetSharedTargetsOutput(ctx *pulumi.Context, args GetSharedTargetsOutputArgs, opts ...pulumi.InvokeOption) GetSharedTargetsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSharedTargetsResult, error) {
			args := v.(GetSharedTargetsArgs)
			r, err := GetSharedTargets(ctx, &args, opts...)
			var s GetSharedTargetsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSharedTargetsResultOutput)
}

// A collection of arguments for invoking getSharedTargets.
type GetSharedTargetsOutputArgs struct {
	// A list of Shared Target IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The resource shared ID of resource manager.
	ResourceShareId pulumi.StringPtrInput `pulumi:"resourceShareId"`
	// The status of shared target.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetSharedTargetsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSharedTargetsArgs)(nil)).Elem()
}

// A collection of values returned by getSharedTargets.
type GetSharedTargetsResultOutput struct{ *pulumi.OutputState }

func (GetSharedTargetsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSharedTargetsResult)(nil)).Elem()
}

func (o GetSharedTargetsResultOutput) ToGetSharedTargetsResultOutput() GetSharedTargetsResultOutput {
	return o
}

func (o GetSharedTargetsResultOutput) ToGetSharedTargetsResultOutputWithContext(ctx context.Context) GetSharedTargetsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetSharedTargetsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSharedTargetsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSharedTargetsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSharedTargetsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSharedTargetsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSharedTargetsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetSharedTargetsResultOutput) ResourceShareId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSharedTargetsResult) *string { return v.ResourceShareId }).(pulumi.StringPtrOutput)
}

func (o GetSharedTargetsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSharedTargetsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetSharedTargetsResultOutput) Targets() GetSharedTargetsTargetArrayOutput {
	return o.ApplyT(func(v GetSharedTargetsResult) []GetSharedTargetsTarget { return v.Targets }).(GetSharedTargetsTargetArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSharedTargetsResultOutput{})
}
