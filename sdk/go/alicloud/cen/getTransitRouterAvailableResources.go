// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Cen Transit Router Available Resources of the current Alibaba Cloud user.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cen"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cen.GetTransitRouterAvailableResources(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("masterId", data.Alicloud_cen_transit_router_available_resources.Default.Resources[0].Master_zones[0])
//			ctx.Export("slaveId", data.Alicloud_cen_transit_router_available_resources.Default.Resources[0].Slave_zones[0])
//			return nil
//		})
//	}
//
// ```
func GetTransitRouterAvailableResources(ctx *pulumi.Context, args *GetTransitRouterAvailableResourcesArgs, opts ...pulumi.InvokeOption) (*GetTransitRouterAvailableResourcesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTransitRouterAvailableResourcesResult
	err := ctx.Invoke("alicloud:cen/getTransitRouterAvailableResources:getTransitRouterAvailableResources", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTransitRouterAvailableResources.
type GetTransitRouterAvailableResourcesArgs struct {
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getTransitRouterAvailableResources.
type GetTransitRouterAvailableResourcesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string                                       `pulumi:"id"`
	OutputFile *string                                      `pulumi:"outputFile"`
	Resources  []GetTransitRouterAvailableResourcesResource `pulumi:"resources"`
}

func GetTransitRouterAvailableResourcesOutput(ctx *pulumi.Context, args GetTransitRouterAvailableResourcesOutputArgs, opts ...pulumi.InvokeOption) GetTransitRouterAvailableResourcesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetTransitRouterAvailableResourcesResult, error) {
			args := v.(GetTransitRouterAvailableResourcesArgs)
			r, err := GetTransitRouterAvailableResources(ctx, &args, opts...)
			var s GetTransitRouterAvailableResourcesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetTransitRouterAvailableResourcesResultOutput)
}

// A collection of arguments for invoking getTransitRouterAvailableResources.
type GetTransitRouterAvailableResourcesOutputArgs struct {
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetTransitRouterAvailableResourcesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterAvailableResourcesArgs)(nil)).Elem()
}

// A collection of values returned by getTransitRouterAvailableResources.
type GetTransitRouterAvailableResourcesResultOutput struct{ *pulumi.OutputState }

func (GetTransitRouterAvailableResourcesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterAvailableResourcesResult)(nil)).Elem()
}

func (o GetTransitRouterAvailableResourcesResultOutput) ToGetTransitRouterAvailableResourcesResultOutput() GetTransitRouterAvailableResourcesResultOutput {
	return o
}

func (o GetTransitRouterAvailableResourcesResultOutput) ToGetTransitRouterAvailableResourcesResultOutputWithContext(ctx context.Context) GetTransitRouterAvailableResourcesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetTransitRouterAvailableResourcesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransitRouterAvailableResourcesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTransitRouterAvailableResourcesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterAvailableResourcesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetTransitRouterAvailableResourcesResultOutput) Resources() GetTransitRouterAvailableResourcesResourceArrayOutput {
	return o.ApplyT(func(v GetTransitRouterAvailableResourcesResult) []GetTransitRouterAvailableResourcesResource {
		return v.Resources
	}).(GetTransitRouterAvailableResourcesResourceArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTransitRouterAvailableResourcesResultOutput{})
}
