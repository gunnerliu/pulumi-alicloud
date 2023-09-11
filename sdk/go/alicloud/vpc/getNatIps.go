// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Vpc Nat Ips of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.136.0+.
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
//			ids, err := vpc.GetNatIps(ctx, &vpc.GetNatIpsArgs{
//				NatGatewayId: "example_value",
//				Ids: []string{
//					"example_value-1",
//					"example_value-2",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcNatIpId1", ids.Ips[0].Id)
//			nameRegex, err := vpc.GetNatIps(ctx, &vpc.GetNatIpsArgs{
//				NatGatewayId: "example_value",
//				NameRegex:    pulumi.StringRef("^my-NatIp"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcNatIpId2", nameRegex.Ips[0].Id)
//			natIpCidr, err := vpc.GetNatIps(ctx, &vpc.GetNatIpsArgs{
//				NatGatewayId: "example_value",
//				NatIpCidr:    pulumi.StringRef("example_value"),
//				NameRegex:    pulumi.StringRef("^my-NatIp"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcNatIpId3", natIpCidr.Ips[0].Id)
//			natIpName, err := vpc.GetNatIps(ctx, &vpc.GetNatIpsArgs{
//				NatGatewayId: "example_value",
//				Ids: []string{
//					"example_value",
//				},
//				NatIpNames: []string{
//					"example_value",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcNatIpId4", natIpName.Ips[0].Id)
//			natIpIds, err := vpc.GetNatIps(ctx, &vpc.GetNatIpsArgs{
//				NatGatewayId: "example_value",
//				Ids: []string{
//					"example_value",
//				},
//				NatIpIds: []string{
//					"example_value",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcNatIpId5", natIpIds.Ips[0].Id)
//			status, err := vpc.GetNatIps(ctx, &vpc.GetNatIpsArgs{
//				NatGatewayId: "example_value",
//				Ids: []string{
//					"example_value",
//				},
//				Status: pulumi.StringRef("example_value"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcNatIpId6", status.Ips[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetNatIps(ctx *pulumi.Context, args *GetNatIpsArgs, opts ...pulumi.InvokeOption) (*GetNatIpsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNatIpsResult
	err := ctx.Invoke("alicloud:vpc/getNatIps:getNatIps", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNatIps.
type GetNatIpsArgs struct {
	// A list of Nat Ip IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Nat Ip name.
	NameRegex *string `pulumi:"nameRegex"`
	// The ID of the Virtual Private Cloud (VPC) NAT gateway to which the NAT IP address belongs.
	NatGatewayId string `pulumi:"natGatewayId"`
	// The CIDR block to which the NAT IP address belongs.
	NatIpCidr *string  `pulumi:"natIpCidr"`
	NatIpIds  []string `pulumi:"natIpIds"`
	// The name of the NAT IP address.
	NatIpNames []string `pulumi:"natIpNames"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the NAT IP address. Valid values: `Available`, `Deleting` and `Creating`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getNatIps.
type GetNatIpsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id           string        `pulumi:"id"`
	Ids          []string      `pulumi:"ids"`
	Ips          []GetNatIpsIp `pulumi:"ips"`
	NameRegex    *string       `pulumi:"nameRegex"`
	Names        []string      `pulumi:"names"`
	NatGatewayId string        `pulumi:"natGatewayId"`
	NatIpCidr    *string       `pulumi:"natIpCidr"`
	NatIpIds     []string      `pulumi:"natIpIds"`
	NatIpNames   []string      `pulumi:"natIpNames"`
	OutputFile   *string       `pulumi:"outputFile"`
	Status       *string       `pulumi:"status"`
}

func GetNatIpsOutput(ctx *pulumi.Context, args GetNatIpsOutputArgs, opts ...pulumi.InvokeOption) GetNatIpsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNatIpsResult, error) {
			args := v.(GetNatIpsArgs)
			r, err := GetNatIps(ctx, &args, opts...)
			var s GetNatIpsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNatIpsResultOutput)
}

// A collection of arguments for invoking getNatIps.
type GetNatIpsOutputArgs struct {
	// A list of Nat Ip IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Nat Ip name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// The ID of the Virtual Private Cloud (VPC) NAT gateway to which the NAT IP address belongs.
	NatGatewayId pulumi.StringInput `pulumi:"natGatewayId"`
	// The CIDR block to which the NAT IP address belongs.
	NatIpCidr pulumi.StringPtrInput   `pulumi:"natIpCidr"`
	NatIpIds  pulumi.StringArrayInput `pulumi:"natIpIds"`
	// The name of the NAT IP address.
	NatIpNames pulumi.StringArrayInput `pulumi:"natIpNames"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the NAT IP address. Valid values: `Available`, `Deleting` and `Creating`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetNatIpsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNatIpsArgs)(nil)).Elem()
}

// A collection of values returned by getNatIps.
type GetNatIpsResultOutput struct{ *pulumi.OutputState }

func (GetNatIpsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNatIpsResult)(nil)).Elem()
}

func (o GetNatIpsResultOutput) ToGetNatIpsResultOutput() GetNatIpsResultOutput {
	return o
}

func (o GetNatIpsResultOutput) ToGetNatIpsResultOutputWithContext(ctx context.Context) GetNatIpsResultOutput {
	return o
}

func (o GetNatIpsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetNatIpsResult] {
	return pulumix.Output[GetNatIpsResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetNatIpsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNatIpsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetNatIpsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetNatIpsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetNatIpsResultOutput) Ips() GetNatIpsIpArrayOutput {
	return o.ApplyT(func(v GetNatIpsResult) []GetNatIpsIp { return v.Ips }).(GetNatIpsIpArrayOutput)
}

func (o GetNatIpsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNatIpsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetNatIpsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetNatIpsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetNatIpsResultOutput) NatGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v GetNatIpsResult) string { return v.NatGatewayId }).(pulumi.StringOutput)
}

func (o GetNatIpsResultOutput) NatIpCidr() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNatIpsResult) *string { return v.NatIpCidr }).(pulumi.StringPtrOutput)
}

func (o GetNatIpsResultOutput) NatIpIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetNatIpsResult) []string { return v.NatIpIds }).(pulumi.StringArrayOutput)
}

func (o GetNatIpsResultOutput) NatIpNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetNatIpsResult) []string { return v.NatIpNames }).(pulumi.StringArrayOutput)
}

func (o GetNatIpsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNatIpsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetNatIpsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNatIpsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNatIpsResultOutput{})
}
