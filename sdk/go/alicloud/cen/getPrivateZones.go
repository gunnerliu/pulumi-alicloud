// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides CEN Private Zones available to the user.
//
// > **NOTE:** Available in v1.88.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cen"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		this, err := cen.GetPrivateZones(ctx, &cen.GetPrivateZonesArgs{
// 			CenId: "cen-o40h17ll9w********",
// 			Ids: []string{
// 				"cn-hangzhou",
// 			},
// 			Status: pulumi.StringRef("Active"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstCenPrivateZonesId", this.Zones[0].Id)
// 		return nil
// 	})
// }
// ```
func GetPrivateZones(ctx *pulumi.Context, args *GetPrivateZonesArgs, opts ...pulumi.InvokeOption) (*GetPrivateZonesResult, error) {
	var rv GetPrivateZonesResult
	err := ctx.Invoke("alicloud:cen/getPrivateZones:getPrivateZones", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrivateZones.
type GetPrivateZonesArgs struct {
	// The ID of the CEN instance.
	CenId string `pulumi:"cenId"`
	// The service region. The service region is the target region of the PrivateZone service accessed through CEN.
	HostRegionId *string `pulumi:"hostRegionId"`
	// A list of CEN private zone IDs. Each element format as `<cen_id>:<access_region_id>`.
	// **NOTE:** Before 1.162.0, each element same as `accessRegionId`.
	// * ` hostRegionId  ` - (Optional) The service region is the target region of the PrivateZone service accessed through CEN.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of the PrivateZone service, including `Creating`, `Active` and `Deleting`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getPrivateZones.
type GetPrivateZonesResult struct {
	// The ID of the CEN instance.
	CenId string `pulumi:"cenId"`
	// The service region. The service region is the target region of the PrivateZone service accessed through CEN.
	HostRegionId *string `pulumi:"hostRegionId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of CEN private zone IDs. Each element format as `<cen_id>:<access_region_id>`.
	// **NOTE:** Before 1.162.0, each element same as `accessRegionId`.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of the PrivateZone service.
	Status *string `pulumi:"status"`
	// A list of CEN private zones. Each element contains the following attributes:
	Zones []GetPrivateZonesZone `pulumi:"zones"`
}

func GetPrivateZonesOutput(ctx *pulumi.Context, args GetPrivateZonesOutputArgs, opts ...pulumi.InvokeOption) GetPrivateZonesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPrivateZonesResult, error) {
			args := v.(GetPrivateZonesArgs)
			r, err := GetPrivateZones(ctx, &args, opts...)
			var s GetPrivateZonesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPrivateZonesResultOutput)
}

// A collection of arguments for invoking getPrivateZones.
type GetPrivateZonesOutputArgs struct {
	// The ID of the CEN instance.
	CenId pulumi.StringInput `pulumi:"cenId"`
	// The service region. The service region is the target region of the PrivateZone service accessed through CEN.
	HostRegionId pulumi.StringPtrInput `pulumi:"hostRegionId"`
	// A list of CEN private zone IDs. Each element format as `<cen_id>:<access_region_id>`.
	// **NOTE:** Before 1.162.0, each element same as `accessRegionId`.
	// * ` hostRegionId  ` - (Optional) The service region is the target region of the PrivateZone service accessed through CEN.
	Ids        pulumi.StringArrayInput `pulumi:"ids"`
	OutputFile pulumi.StringPtrInput   `pulumi:"outputFile"`
	// The status of the PrivateZone service, including `Creating`, `Active` and `Deleting`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetPrivateZonesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPrivateZonesArgs)(nil)).Elem()
}

// A collection of values returned by getPrivateZones.
type GetPrivateZonesResultOutput struct{ *pulumi.OutputState }

func (GetPrivateZonesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPrivateZonesResult)(nil)).Elem()
}

func (o GetPrivateZonesResultOutput) ToGetPrivateZonesResultOutput() GetPrivateZonesResultOutput {
	return o
}

func (o GetPrivateZonesResultOutput) ToGetPrivateZonesResultOutputWithContext(ctx context.Context) GetPrivateZonesResultOutput {
	return o
}

// The ID of the CEN instance.
func (o GetPrivateZonesResultOutput) CenId() pulumi.StringOutput {
	return o.ApplyT(func(v GetPrivateZonesResult) string { return v.CenId }).(pulumi.StringOutput)
}

// The service region. The service region is the target region of the PrivateZone service accessed through CEN.
func (o GetPrivateZonesResultOutput) HostRegionId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPrivateZonesResult) *string { return v.HostRegionId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPrivateZonesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPrivateZonesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of CEN private zone IDs. Each element format as `<cen_id>:<access_region_id>`.
// **NOTE:** Before 1.162.0, each element same as `accessRegionId`.
func (o GetPrivateZonesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPrivateZonesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetPrivateZonesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPrivateZonesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The status of the PrivateZone service.
func (o GetPrivateZonesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPrivateZonesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// A list of CEN private zones. Each element contains the following attributes:
func (o GetPrivateZonesResultOutput) Zones() GetPrivateZonesZoneArrayOutput {
	return o.ApplyT(func(v GetPrivateZonesResult) []GetPrivateZonesZone { return v.Zones }).(GetPrivateZonesZoneArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPrivateZonesResultOutput{})
}
