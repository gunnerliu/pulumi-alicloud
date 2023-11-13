// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pvtz

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Pvtz Endpoints of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.143.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/pvtz"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := pvtz.GetEndpoints(ctx, &pvtz.GetEndpointsArgs{
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("pvtzEndpointId1", ids.Endpoints[0].Id)
//			nameRegex, err := pvtz.GetEndpoints(ctx, &pvtz.GetEndpointsArgs{
//				NameRegex: pulumi.StringRef("^my-Endpoint"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("pvtzEndpointId2", nameRegex.Endpoints[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetEndpoints(ctx *pulumi.Context, args *GetEndpointsArgs, opts ...pulumi.InvokeOption) (*GetEndpointsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEndpointsResult
	err := ctx.Invoke("alicloud:pvtz/getEndpoints:getEndpoints", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEndpoints.
type GetEndpointsArgs struct {
	// A list of Endpoint IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Endpoint name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the resource. Valid values: `CHANGE_FAILED`, `CHANGE_INIT`, `EXCEPTION`, `FAILED`, `INIT`, `SUCCESS`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getEndpoints.
type GetEndpointsResult struct {
	Endpoints []GetEndpointsEndpoint `pulumi:"endpoints"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	Status     *string  `pulumi:"status"`
}

func GetEndpointsOutput(ctx *pulumi.Context, args GetEndpointsOutputArgs, opts ...pulumi.InvokeOption) GetEndpointsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEndpointsResult, error) {
			args := v.(GetEndpointsArgs)
			r, err := GetEndpoints(ctx, &args, opts...)
			var s GetEndpointsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEndpointsResultOutput)
}

// A collection of arguments for invoking getEndpoints.
type GetEndpointsOutputArgs struct {
	// A list of Endpoint IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Endpoint name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the resource. Valid values: `CHANGE_FAILED`, `CHANGE_INIT`, `EXCEPTION`, `FAILED`, `INIT`, `SUCCESS`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetEndpointsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEndpointsArgs)(nil)).Elem()
}

// A collection of values returned by getEndpoints.
type GetEndpointsResultOutput struct{ *pulumi.OutputState }

func (GetEndpointsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEndpointsResult)(nil)).Elem()
}

func (o GetEndpointsResultOutput) ToGetEndpointsResultOutput() GetEndpointsResultOutput {
	return o
}

func (o GetEndpointsResultOutput) ToGetEndpointsResultOutputWithContext(ctx context.Context) GetEndpointsResultOutput {
	return o
}

func (o GetEndpointsResultOutput) Endpoints() GetEndpointsEndpointArrayOutput {
	return o.ApplyT(func(v GetEndpointsResult) []GetEndpointsEndpoint { return v.Endpoints }).(GetEndpointsEndpointArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEndpointsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEndpointsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetEndpointsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEndpointsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetEndpointsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEndpointsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetEndpointsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEndpointsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetEndpointsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEndpointsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetEndpointsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEndpointsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEndpointsResultOutput{})
}
