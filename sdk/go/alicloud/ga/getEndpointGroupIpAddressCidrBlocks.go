// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ga

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Global Accelerator (GA) Endpoint Group Ip Address Cidr Blocks of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.213.0.
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
//			_default, err := ga.GetEndpointGroupIpAddressCidrBlocks(ctx, &ga.GetEndpointGroupIpAddressCidrBlocksArgs{
//				EndpointGroupRegion: "cn-hangzhou",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("gaEndpointGroupIpAddressCidrBlocksEndpointGroupRegion", _default.EndpointGroupIpAddressCidrBlocks[0].EndpointGroupRegion)
//			return nil
//		})
//	}
//
// ```
func GetEndpointGroupIpAddressCidrBlocks(ctx *pulumi.Context, args *GetEndpointGroupIpAddressCidrBlocksArgs, opts ...pulumi.InvokeOption) (*GetEndpointGroupIpAddressCidrBlocksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEndpointGroupIpAddressCidrBlocksResult
	err := ctx.Invoke("alicloud:ga/getEndpointGroupIpAddressCidrBlocks:getEndpointGroupIpAddressCidrBlocks", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEndpointGroupIpAddressCidrBlocks.
type GetEndpointGroupIpAddressCidrBlocksArgs struct {
	// The region ID of the endpoint group.
	EndpointGroupRegion string `pulumi:"endpointGroupRegion"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getEndpointGroupIpAddressCidrBlocks.
type GetEndpointGroupIpAddressCidrBlocksResult struct {
	// A list of Endpoint Group Ip Address Cidr Blocks. Each element contains the following attributes:
	EndpointGroupIpAddressCidrBlocks []GetEndpointGroupIpAddressCidrBlocksEndpointGroupIpAddressCidrBlock `pulumi:"endpointGroupIpAddressCidrBlocks"`
	// The region ID of the endpoint group.
	EndpointGroupRegion string `pulumi:"endpointGroupRegion"`
	// The provider-assigned unique ID for this managed resource.
	Id         string  `pulumi:"id"`
	OutputFile *string `pulumi:"outputFile"`
}

func GetEndpointGroupIpAddressCidrBlocksOutput(ctx *pulumi.Context, args GetEndpointGroupIpAddressCidrBlocksOutputArgs, opts ...pulumi.InvokeOption) GetEndpointGroupIpAddressCidrBlocksResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEndpointGroupIpAddressCidrBlocksResult, error) {
			args := v.(GetEndpointGroupIpAddressCidrBlocksArgs)
			r, err := GetEndpointGroupIpAddressCidrBlocks(ctx, &args, opts...)
			var s GetEndpointGroupIpAddressCidrBlocksResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEndpointGroupIpAddressCidrBlocksResultOutput)
}

// A collection of arguments for invoking getEndpointGroupIpAddressCidrBlocks.
type GetEndpointGroupIpAddressCidrBlocksOutputArgs struct {
	// The region ID of the endpoint group.
	EndpointGroupRegion pulumi.StringInput `pulumi:"endpointGroupRegion"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetEndpointGroupIpAddressCidrBlocksOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEndpointGroupIpAddressCidrBlocksArgs)(nil)).Elem()
}

// A collection of values returned by getEndpointGroupIpAddressCidrBlocks.
type GetEndpointGroupIpAddressCidrBlocksResultOutput struct{ *pulumi.OutputState }

func (GetEndpointGroupIpAddressCidrBlocksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEndpointGroupIpAddressCidrBlocksResult)(nil)).Elem()
}

func (o GetEndpointGroupIpAddressCidrBlocksResultOutput) ToGetEndpointGroupIpAddressCidrBlocksResultOutput() GetEndpointGroupIpAddressCidrBlocksResultOutput {
	return o
}

func (o GetEndpointGroupIpAddressCidrBlocksResultOutput) ToGetEndpointGroupIpAddressCidrBlocksResultOutputWithContext(ctx context.Context) GetEndpointGroupIpAddressCidrBlocksResultOutput {
	return o
}

// A list of Endpoint Group Ip Address Cidr Blocks. Each element contains the following attributes:
func (o GetEndpointGroupIpAddressCidrBlocksResultOutput) EndpointGroupIpAddressCidrBlocks() GetEndpointGroupIpAddressCidrBlocksEndpointGroupIpAddressCidrBlockArrayOutput {
	return o.ApplyT(func(v GetEndpointGroupIpAddressCidrBlocksResult) []GetEndpointGroupIpAddressCidrBlocksEndpointGroupIpAddressCidrBlock {
		return v.EndpointGroupIpAddressCidrBlocks
	}).(GetEndpointGroupIpAddressCidrBlocksEndpointGroupIpAddressCidrBlockArrayOutput)
}

// The region ID of the endpoint group.
func (o GetEndpointGroupIpAddressCidrBlocksResultOutput) EndpointGroupRegion() pulumi.StringOutput {
	return o.ApplyT(func(v GetEndpointGroupIpAddressCidrBlocksResult) string { return v.EndpointGroupRegion }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEndpointGroupIpAddressCidrBlocksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEndpointGroupIpAddressCidrBlocksResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetEndpointGroupIpAddressCidrBlocksResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEndpointGroupIpAddressCidrBlocksResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEndpointGroupIpAddressCidrBlocksResultOutput{})
}
