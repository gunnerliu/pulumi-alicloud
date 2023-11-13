// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudstoragegateway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Cloud Storage Gateway Gateways of the current Alibaba Cloud user.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cloudstoragegateway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := cloudstoragegateway.NewStorageBundle(ctx, "example", &cloudstoragegateway.StorageBundleArgs{
//				StorageBundleName: pulumi.String("example_value"),
//			})
//			if err != nil {
//				return err
//			}
//			nameRegex := cloudstoragegateway.GetGatewaysOutput(ctx, cloudstoragegateway.GetGatewaysOutputArgs{
//				StorageBundleId: example.ID(),
//				NameRegex:       pulumi.String("^my-Gateway"),
//			}, nil)
//			ctx.Export("cloudStorageGatewayGatewayId", nameRegex.ApplyT(func(nameRegex cloudstoragegateway.GetGatewaysResult) (*string, error) {
//				return &nameRegex.Gateways[0].Id, nil
//			}).(pulumi.StringPtrOutput))
//			return nil
//		})
//	}
//
// ```
func GetGateways(ctx *pulumi.Context, args *GetGatewaysArgs, opts ...pulumi.InvokeOption) (*GetGatewaysResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGatewaysResult
	err := ctx.Invoke("alicloud:cloudstoragegateway/getGateways:getGateways", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGateways.
type GetGatewaysArgs struct {
	// A list of Gateway IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Gateway name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
	// gateway status.
	Status *string `pulumi:"status"`
	// storage bundle id.
	StorageBundleId string `pulumi:"storageBundleId"`
}

// A collection of values returned by getGateways.
type GetGatewaysResult struct {
	Gateways []GetGatewaysGateway `pulumi:"gateways"`
	// The provider-assigned unique ID for this managed resource.
	Id              string   `pulumi:"id"`
	Ids             []string `pulumi:"ids"`
	NameRegex       *string  `pulumi:"nameRegex"`
	Names           []string `pulumi:"names"`
	OutputFile      *string  `pulumi:"outputFile"`
	PageNumber      *int     `pulumi:"pageNumber"`
	PageSize        *int     `pulumi:"pageSize"`
	Status          *string  `pulumi:"status"`
	StorageBundleId string   `pulumi:"storageBundleId"`
	TotalCount      int      `pulumi:"totalCount"`
}

func GetGatewaysOutput(ctx *pulumi.Context, args GetGatewaysOutputArgs, opts ...pulumi.InvokeOption) GetGatewaysResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetGatewaysResult, error) {
			args := v.(GetGatewaysArgs)
			r, err := GetGateways(ctx, &args, opts...)
			var s GetGatewaysResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetGatewaysResultOutput)
}

// A collection of arguments for invoking getGateways.
type GetGatewaysOutputArgs struct {
	// A list of Gateway IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Gateway name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
	// gateway status.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// storage bundle id.
	StorageBundleId pulumi.StringInput `pulumi:"storageBundleId"`
}

func (GetGatewaysOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewaysArgs)(nil)).Elem()
}

// A collection of values returned by getGateways.
type GetGatewaysResultOutput struct{ *pulumi.OutputState }

func (GetGatewaysResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewaysResult)(nil)).Elem()
}

func (o GetGatewaysResultOutput) ToGetGatewaysResultOutput() GetGatewaysResultOutput {
	return o
}

func (o GetGatewaysResultOutput) ToGetGatewaysResultOutputWithContext(ctx context.Context) GetGatewaysResultOutput {
	return o
}

func (o GetGatewaysResultOutput) Gateways() GetGatewaysGatewayArrayOutput {
	return o.ApplyT(func(v GetGatewaysResult) []GetGatewaysGateway { return v.Gateways }).(GetGatewaysGatewayArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGatewaysResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGatewaysResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetGatewaysResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetGatewaysResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetGatewaysResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetGatewaysResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetGatewaysResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetGatewaysResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetGatewaysResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetGatewaysResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func (o GetGatewaysResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetGatewaysResultOutput) StorageBundleId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGatewaysResult) string { return v.StorageBundleId }).(pulumi.StringOutput)
}

func (o GetGatewaysResultOutput) TotalCount() pulumi.IntOutput {
	return o.ApplyT(func(v GetGatewaysResult) int { return v.TotalCount }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGatewaysResultOutput{})
}
