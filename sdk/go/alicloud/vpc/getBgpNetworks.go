// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Vpc Bgp Networks of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.153.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := vpc.GetBgpNetworks(ctx, &vpc.GetBgpNetworksArgs{
//				Ids: []string{
//					"example_value",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcBgpNetworkId1", ids.Networks[0].Id)
//			routerId, err := vpc.GetBgpNetworks(ctx, &vpc.GetBgpNetworksArgs{
//				RouterId: pulumi.StringRef("example_value"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcBgpNetworkId2", routerId.Networks[0].Id)
//			status, err := vpc.GetBgpNetworks(ctx, &vpc.GetBgpNetworksArgs{
//				Status: pulumi.StringRef("Available"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcBgpNetworkId3", status.Networks[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetBgpNetworks(ctx *pulumi.Context, args *GetBgpNetworksArgs, opts ...pulumi.InvokeOption) (*GetBgpNetworksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetBgpNetworksResult
	err := ctx.Invoke("alicloud:vpc/getBgpNetworks:getBgpNetworks", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBgpNetworks.
type GetBgpNetworksArgs struct {
	// A list of Bgp Network IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the vRouter.
	RouterId *string `pulumi:"routerId"`
	// The state of the advertised BGP network.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getBgpNetworks.
type GetBgpNetworksResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string                  `pulumi:"id"`
	Ids        []string                `pulumi:"ids"`
	Networks   []GetBgpNetworksNetwork `pulumi:"networks"`
	OutputFile *string                 `pulumi:"outputFile"`
	RouterId   *string                 `pulumi:"routerId"`
	Status     *string                 `pulumi:"status"`
}

func GetBgpNetworksOutput(ctx *pulumi.Context, args GetBgpNetworksOutputArgs, opts ...pulumi.InvokeOption) GetBgpNetworksResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetBgpNetworksResult, error) {
			args := v.(GetBgpNetworksArgs)
			r, err := GetBgpNetworks(ctx, &args, opts...)
			var s GetBgpNetworksResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetBgpNetworksResultOutput)
}

// A collection of arguments for invoking getBgpNetworks.
type GetBgpNetworksOutputArgs struct {
	// A list of Bgp Network IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the vRouter.
	RouterId pulumi.StringPtrInput `pulumi:"routerId"`
	// The state of the advertised BGP network.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetBgpNetworksOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBgpNetworksArgs)(nil)).Elem()
}

// A collection of values returned by getBgpNetworks.
type GetBgpNetworksResultOutput struct{ *pulumi.OutputState }

func (GetBgpNetworksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBgpNetworksResult)(nil)).Elem()
}

func (o GetBgpNetworksResultOutput) ToGetBgpNetworksResultOutput() GetBgpNetworksResultOutput {
	return o
}

func (o GetBgpNetworksResultOutput) ToGetBgpNetworksResultOutputWithContext(ctx context.Context) GetBgpNetworksResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetBgpNetworksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBgpNetworksResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetBgpNetworksResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetBgpNetworksResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetBgpNetworksResultOutput) Networks() GetBgpNetworksNetworkArrayOutput {
	return o.ApplyT(func(v GetBgpNetworksResult) []GetBgpNetworksNetwork { return v.Networks }).(GetBgpNetworksNetworkArrayOutput)
}

func (o GetBgpNetworksResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBgpNetworksResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetBgpNetworksResultOutput) RouterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBgpNetworksResult) *string { return v.RouterId }).(pulumi.StringPtrOutput)
}

func (o GetBgpNetworksResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBgpNetworksResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetBgpNetworksResultOutput{})
}
