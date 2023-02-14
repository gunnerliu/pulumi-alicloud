// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ga

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Global Accelerator (GA) Custom Routing Endpoints of the current Alibaba Cloud user.
//
// > **NOTE:** Available in 1.197.0+
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ga"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := ga.GetCustomRoutingEndpoints(ctx, &ga.GetCustomRoutingEndpointsArgs{
//				Ids: []string{
//					"example_id",
//				},
//				AcceleratorId: "your_accelerator_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("gaCustomRoutingEndpointsId1", ids.CustomRoutingEndpoints[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetCustomRoutingEndpoints(ctx *pulumi.Context, args *GetCustomRoutingEndpointsArgs, opts ...pulumi.InvokeOption) (*GetCustomRoutingEndpointsResult, error) {
	var rv GetCustomRoutingEndpointsResult
	err := ctx.Invoke("alicloud:ga/getCustomRoutingEndpoints:getCustomRoutingEndpoints", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCustomRoutingEndpoints.
type GetCustomRoutingEndpointsArgs struct {
	// The ID of the GA instance.
	AcceleratorId string `pulumi:"acceleratorId"`
	// The ID of the endpoint group.
	EndpointGroupId *string `pulumi:"endpointGroupId"`
	// A list of Custom Routing Endpoint IDs.
	Ids []string `pulumi:"ids"`
	// The ID of the custom routing listener.
	ListenerId *string `pulumi:"listenerId"`
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
}

// A collection of values returned by getCustomRoutingEndpoints.
type GetCustomRoutingEndpointsResult struct {
	// The ID of the GA instance with which the endpoint is associated.
	AcceleratorId string `pulumi:"acceleratorId"`
	// A list of Custom Routing Endpoints. Each element contains the following attributes:
	CustomRoutingEndpoints []GetCustomRoutingEndpointsCustomRoutingEndpoint `pulumi:"customRoutingEndpoints"`
	// The ID of the Custom Routing Endpoint Group.
	EndpointGroupId *string `pulumi:"endpointGroupId"`
	// The provider-assigned unique ID for this managed resource.
	Id  string   `pulumi:"id"`
	Ids []string `pulumi:"ids"`
	// The ID of the listener with which the endpoint is associated.
	ListenerId *string `pulumi:"listenerId"`
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
}

func GetCustomRoutingEndpointsOutput(ctx *pulumi.Context, args GetCustomRoutingEndpointsOutputArgs, opts ...pulumi.InvokeOption) GetCustomRoutingEndpointsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetCustomRoutingEndpointsResult, error) {
			args := v.(GetCustomRoutingEndpointsArgs)
			r, err := GetCustomRoutingEndpoints(ctx, &args, opts...)
			var s GetCustomRoutingEndpointsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetCustomRoutingEndpointsResultOutput)
}

// A collection of arguments for invoking getCustomRoutingEndpoints.
type GetCustomRoutingEndpointsOutputArgs struct {
	// The ID of the GA instance.
	AcceleratorId pulumi.StringInput `pulumi:"acceleratorId"`
	// The ID of the endpoint group.
	EndpointGroupId pulumi.StringPtrInput `pulumi:"endpointGroupId"`
	// A list of Custom Routing Endpoint IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The ID of the custom routing listener.
	ListenerId pulumi.StringPtrInput `pulumi:"listenerId"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
}

func (GetCustomRoutingEndpointsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCustomRoutingEndpointsArgs)(nil)).Elem()
}

// A collection of values returned by getCustomRoutingEndpoints.
type GetCustomRoutingEndpointsResultOutput struct{ *pulumi.OutputState }

func (GetCustomRoutingEndpointsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCustomRoutingEndpointsResult)(nil)).Elem()
}

func (o GetCustomRoutingEndpointsResultOutput) ToGetCustomRoutingEndpointsResultOutput() GetCustomRoutingEndpointsResultOutput {
	return o
}

func (o GetCustomRoutingEndpointsResultOutput) ToGetCustomRoutingEndpointsResultOutputWithContext(ctx context.Context) GetCustomRoutingEndpointsResultOutput {
	return o
}

// The ID of the GA instance with which the endpoint is associated.
func (o GetCustomRoutingEndpointsResultOutput) AcceleratorId() pulumi.StringOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointsResult) string { return v.AcceleratorId }).(pulumi.StringOutput)
}

// A list of Custom Routing Endpoints. Each element contains the following attributes:
func (o GetCustomRoutingEndpointsResultOutput) CustomRoutingEndpoints() GetCustomRoutingEndpointsCustomRoutingEndpointArrayOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointsResult) []GetCustomRoutingEndpointsCustomRoutingEndpoint {
		return v.CustomRoutingEndpoints
	}).(GetCustomRoutingEndpointsCustomRoutingEndpointArrayOutput)
}

// The ID of the Custom Routing Endpoint Group.
func (o GetCustomRoutingEndpointsResultOutput) EndpointGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointsResult) *string { return v.EndpointGroupId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetCustomRoutingEndpointsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetCustomRoutingEndpointsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// The ID of the listener with which the endpoint is associated.
func (o GetCustomRoutingEndpointsResultOutput) ListenerId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointsResult) *string { return v.ListenerId }).(pulumi.StringPtrOutput)
}

func (o GetCustomRoutingEndpointsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetCustomRoutingEndpointsResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointsResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetCustomRoutingEndpointsResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetCustomRoutingEndpointsResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCustomRoutingEndpointsResultOutput{})
}