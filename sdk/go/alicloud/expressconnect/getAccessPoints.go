// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package expressconnect

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Express Connect Access Points of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.132.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/expressconnect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := expressconnect.GetAccessPoints(ctx, &expressconnect.GetAccessPointsArgs{
//				Ids: []string{
//					"ap-cn-hangzhou-yh-C",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("expressConnectAccessPointId1", ids.Points[0].Id)
//			nameRegex, err := expressconnect.GetAccessPoints(ctx, &expressconnect.GetAccessPointsArgs{
//				NameRegex: pulumi.StringRef("^杭州-"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("expressConnectAccessPointId2", nameRegex.Points[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetAccessPoints(ctx *pulumi.Context, args *GetAccessPointsArgs, opts ...pulumi.InvokeOption) (*GetAccessPointsResult, error) {
	var rv GetAccessPointsResult
	err := ctx.Invoke("alicloud:expressconnect/getAccessPoints:getAccessPoints", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccessPoints.
type GetAccessPointsArgs struct {
	// A list of Access Point IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Access Point name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The Physical Connection to Which the Access Point State.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getAccessPoints.
type GetAccessPointsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string                 `pulumi:"id"`
	Ids        []string               `pulumi:"ids"`
	NameRegex  *string                `pulumi:"nameRegex"`
	Names      []string               `pulumi:"names"`
	OutputFile *string                `pulumi:"outputFile"`
	Points     []GetAccessPointsPoint `pulumi:"points"`
	Status     *string                `pulumi:"status"`
}

func GetAccessPointsOutput(ctx *pulumi.Context, args GetAccessPointsOutputArgs, opts ...pulumi.InvokeOption) GetAccessPointsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAccessPointsResult, error) {
			args := v.(GetAccessPointsArgs)
			r, err := GetAccessPoints(ctx, &args, opts...)
			var s GetAccessPointsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAccessPointsResultOutput)
}

// A collection of arguments for invoking getAccessPoints.
type GetAccessPointsOutputArgs struct {
	// A list of Access Point IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Access Point name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The Physical Connection to Which the Access Point State.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetAccessPointsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccessPointsArgs)(nil)).Elem()
}

// A collection of values returned by getAccessPoints.
type GetAccessPointsResultOutput struct{ *pulumi.OutputState }

func (GetAccessPointsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccessPointsResult)(nil)).Elem()
}

func (o GetAccessPointsResultOutput) ToGetAccessPointsResultOutput() GetAccessPointsResultOutput {
	return o
}

func (o GetAccessPointsResultOutput) ToGetAccessPointsResultOutputWithContext(ctx context.Context) GetAccessPointsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetAccessPointsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccessPointsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAccessPointsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAccessPointsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetAccessPointsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccessPointsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetAccessPointsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAccessPointsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetAccessPointsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccessPointsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetAccessPointsResultOutput) Points() GetAccessPointsPointArrayOutput {
	return o.ApplyT(func(v GetAccessPointsResult) []GetAccessPointsPoint { return v.Points }).(GetAccessPointsPointArrayOutput)
}

func (o GetAccessPointsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccessPointsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAccessPointsResultOutput{})
}
