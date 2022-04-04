// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides CEN Route Maps available to the user.
//
// > **NOTE:** Available in v1.87.0+.
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
// 		this, err := cen.GetRouteMaps(ctx, &cen.GetRouteMapsArgs{
// 			CenId: "cen-ihdlgo87ai********",
// 			Ids: []string{
// 				"cen-ihdlgo87ai:cenrmap-bnh97kb3mn********",
// 			},
// 			DescriptionRegex:  pulumi.StringRef("datasource_test"),
// 			CenRegionId:       pulumi.StringRef("cn-hangzhou"),
// 			TransmitDirection: pulumi.StringRef("RegionIn"),
// 			Status:            pulumi.StringRef("Active"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstCenRouteMapId", this.Maps[0].RouteMapId)
// 		return nil
// 	})
// }
// ```
func GetRouteMaps(ctx *pulumi.Context, args *GetRouteMapsArgs, opts ...pulumi.InvokeOption) (*GetRouteMapsResult, error) {
	var rv GetRouteMapsResult
	err := ctx.Invoke("alicloud:cen/getRouteMaps:getRouteMaps", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRouteMaps.
type GetRouteMapsArgs struct {
	// The ID of the CEN instance.
	CenId string `pulumi:"cenId"`
	// The ID of the region to which the CEN instance belongs.
	CenRegionId *string `pulumi:"cenRegionId"`
	// A regex string to filter CEN route map by description.
	DescriptionRegex *string `pulumi:"descriptionRegex"`
	// A list of CEN route map IDs. Each item formats as `<cen_id>:<route_map_id>`.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of the route map, including `Creating`, `Active` and `Deleting`.
	Status *string `pulumi:"status"`
	// The direction in which the route map is applied, including `RegionIn` and `RegionOut`.
	TransmitDirection *string `pulumi:"transmitDirection"`
}

// A collection of values returned by getRouteMaps.
type GetRouteMapsResult struct {
	// The ID of the CEN instance.
	CenId string `pulumi:"cenId"`
	// The ID of the region to which the CEN instance belongs.
	CenRegionId      *string `pulumi:"cenRegionId"`
	DescriptionRegex *string `pulumi:"descriptionRegex"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of CEN route map IDs. Each item formats as `<cen_id>:<route_map_id>`. Before 1.161.0, its element is `routeMapId`.
	Ids []string `pulumi:"ids"`
	// A list of CEN instances. Each element contains the following attributes:
	Maps       []GetRouteMapsMap `pulumi:"maps"`
	OutputFile *string           `pulumi:"outputFile"`
	// The status of the route map.
	Status *string `pulumi:"status"`
	// The direction in which the route map is applied.
	TransmitDirection *string `pulumi:"transmitDirection"`
}

func GetRouteMapsOutput(ctx *pulumi.Context, args GetRouteMapsOutputArgs, opts ...pulumi.InvokeOption) GetRouteMapsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetRouteMapsResult, error) {
			args := v.(GetRouteMapsArgs)
			r, err := GetRouteMaps(ctx, &args, opts...)
			var s GetRouteMapsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetRouteMapsResultOutput)
}

// A collection of arguments for invoking getRouteMaps.
type GetRouteMapsOutputArgs struct {
	// The ID of the CEN instance.
	CenId pulumi.StringInput `pulumi:"cenId"`
	// The ID of the region to which the CEN instance belongs.
	CenRegionId pulumi.StringPtrInput `pulumi:"cenRegionId"`
	// A regex string to filter CEN route map by description.
	DescriptionRegex pulumi.StringPtrInput `pulumi:"descriptionRegex"`
	// A list of CEN route map IDs. Each item formats as `<cen_id>:<route_map_id>`.
	Ids        pulumi.StringArrayInput `pulumi:"ids"`
	OutputFile pulumi.StringPtrInput   `pulumi:"outputFile"`
	// The status of the route map, including `Creating`, `Active` and `Deleting`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The direction in which the route map is applied, including `RegionIn` and `RegionOut`.
	TransmitDirection pulumi.StringPtrInput `pulumi:"transmitDirection"`
}

func (GetRouteMapsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteMapsArgs)(nil)).Elem()
}

// A collection of values returned by getRouteMaps.
type GetRouteMapsResultOutput struct{ *pulumi.OutputState }

func (GetRouteMapsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteMapsResult)(nil)).Elem()
}

func (o GetRouteMapsResultOutput) ToGetRouteMapsResultOutput() GetRouteMapsResultOutput {
	return o
}

func (o GetRouteMapsResultOutput) ToGetRouteMapsResultOutputWithContext(ctx context.Context) GetRouteMapsResultOutput {
	return o
}

// The ID of the CEN instance.
func (o GetRouteMapsResultOutput) CenId() pulumi.StringOutput {
	return o.ApplyT(func(v GetRouteMapsResult) string { return v.CenId }).(pulumi.StringOutput)
}

// The ID of the region to which the CEN instance belongs.
func (o GetRouteMapsResultOutput) CenRegionId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRouteMapsResult) *string { return v.CenRegionId }).(pulumi.StringPtrOutput)
}

func (o GetRouteMapsResultOutput) DescriptionRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRouteMapsResult) *string { return v.DescriptionRegex }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRouteMapsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRouteMapsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of CEN route map IDs. Each item formats as `<cen_id>:<route_map_id>`. Before 1.161.0, its element is `routeMapId`.
func (o GetRouteMapsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRouteMapsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// A list of CEN instances. Each element contains the following attributes:
func (o GetRouteMapsResultOutput) Maps() GetRouteMapsMapArrayOutput {
	return o.ApplyT(func(v GetRouteMapsResult) []GetRouteMapsMap { return v.Maps }).(GetRouteMapsMapArrayOutput)
}

func (o GetRouteMapsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRouteMapsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The status of the route map.
func (o GetRouteMapsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRouteMapsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// The direction in which the route map is applied.
func (o GetRouteMapsResultOutput) TransmitDirection() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRouteMapsResult) *string { return v.TransmitDirection }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRouteMapsResultOutput{})
}
