// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package slb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides availability zones for SLB that can be accessed by an Alibaba Cloud account within the region configured in the provider.
//
// > **NOTE:** Available in v1.73.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/slb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := slb.GetZones(ctx, &slb.GetZonesArgs{
//				AvailableSlbAddressIpVersion: pulumi.StringRef("ipv4"),
//				AvailableSlbAddressType:      pulumi.StringRef("vpc"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetZones(ctx *pulumi.Context, args *GetZonesArgs, opts ...pulumi.InvokeOption) (*GetZonesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetZonesResult
	err := ctx.Invoke("alicloud:slb/getZones:getZones", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZones.
type GetZonesArgs struct {
	// Filter the results by a slb instance address version. Can be either `ipv4`, or `ipv6`.
	AvailableSlbAddressIpVersion *string `pulumi:"availableSlbAddressIpVersion"`
	// Filter the results by a slb instance network type. Valid values:
	// * vpc: an internal SLB instance that is deployed in a virtual private cloud (VPC).
	// * classic_internet: a public-facing SLB instance.
	// * classic_intranet: an internal SLB instance that is deployed in a classic network.
	AvailableSlbAddressType *string `pulumi:"availableSlbAddressType"`
	// Default to false and only output `id` in the `zones` block. Set it to true can output more details.
	//
	// Deprecated: The parameter enable_details has been deprecated from version v1.154.0+
	EnableDetails *bool `pulumi:"enableDetails"`
	// The primary zone.
	MasterZoneId *string `pulumi:"masterZoneId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The secondary zone.
	SlaveZoneId *string `pulumi:"slaveZoneId"`
}

// A collection of values returned by getZones.
type GetZonesResult struct {
	AvailableSlbAddressIpVersion *string `pulumi:"availableSlbAddressIpVersion"`
	AvailableSlbAddressType      *string `pulumi:"availableSlbAddressType"`
	// Deprecated: The parameter enable_details has been deprecated from version v1.154.0+
	EnableDetails *bool `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of primary zone IDs.
	Ids []string `pulumi:"ids"`
	// (Available in 1.157.0+) The primary zone.
	MasterZoneId *string `pulumi:"masterZoneId"`
	OutputFile   *string `pulumi:"outputFile"`
	// (Available in 1.157.0+) The secondary zone.
	SlaveZoneId *string `pulumi:"slaveZoneId"`
	// A list of availability zones. Each element contains the following attributes:
	Zones []GetZonesZone `pulumi:"zones"`
}

func GetZonesOutput(ctx *pulumi.Context, args GetZonesOutputArgs, opts ...pulumi.InvokeOption) GetZonesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetZonesResult, error) {
			args := v.(GetZonesArgs)
			r, err := GetZones(ctx, &args, opts...)
			var s GetZonesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetZonesResultOutput)
}

// A collection of arguments for invoking getZones.
type GetZonesOutputArgs struct {
	// Filter the results by a slb instance address version. Can be either `ipv4`, or `ipv6`.
	AvailableSlbAddressIpVersion pulumi.StringPtrInput `pulumi:"availableSlbAddressIpVersion"`
	// Filter the results by a slb instance network type. Valid values:
	// * vpc: an internal SLB instance that is deployed in a virtual private cloud (VPC).
	// * classic_internet: a public-facing SLB instance.
	// * classic_intranet: an internal SLB instance that is deployed in a classic network.
	AvailableSlbAddressType pulumi.StringPtrInput `pulumi:"availableSlbAddressType"`
	// Default to false and only output `id` in the `zones` block. Set it to true can output more details.
	//
	// Deprecated: The parameter enable_details has been deprecated from version v1.154.0+
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// The primary zone.
	MasterZoneId pulumi.StringPtrInput `pulumi:"masterZoneId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The secondary zone.
	SlaveZoneId pulumi.StringPtrInput `pulumi:"slaveZoneId"`
}

func (GetZonesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesArgs)(nil)).Elem()
}

// A collection of values returned by getZones.
type GetZonesResultOutput struct{ *pulumi.OutputState }

func (GetZonesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesResult)(nil)).Elem()
}

func (o GetZonesResultOutput) ToGetZonesResultOutput() GetZonesResultOutput {
	return o
}

func (o GetZonesResultOutput) ToGetZonesResultOutputWithContext(ctx context.Context) GetZonesResultOutput {
	return o
}

func (o GetZonesResultOutput) AvailableSlbAddressIpVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZonesResult) *string { return v.AvailableSlbAddressIpVersion }).(pulumi.StringPtrOutput)
}

func (o GetZonesResultOutput) AvailableSlbAddressType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZonesResult) *string { return v.AvailableSlbAddressType }).(pulumi.StringPtrOutput)
}

// Deprecated: The parameter enable_details has been deprecated from version v1.154.0+
func (o GetZonesResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetZonesResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetZonesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of primary zone IDs.
func (o GetZonesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetZonesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// (Available in 1.157.0+) The primary zone.
func (o GetZonesResultOutput) MasterZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZonesResult) *string { return v.MasterZoneId }).(pulumi.StringPtrOutput)
}

func (o GetZonesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZonesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// (Available in 1.157.0+) The secondary zone.
func (o GetZonesResultOutput) SlaveZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZonesResult) *string { return v.SlaveZoneId }).(pulumi.StringPtrOutput)
}

// A list of availability zones. Each element contains the following attributes:
func (o GetZonesResultOutput) Zones() GetZonesZoneArrayOutput {
	return o.ApplyT(func(v GetZonesResult) []GetZonesZone { return v.Zones }).(GetZonesZoneArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetZonesResultOutput{})
}
