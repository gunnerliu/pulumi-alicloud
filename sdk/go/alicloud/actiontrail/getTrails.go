// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package actiontrail

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list of ActionTrail Trails in an Alibaba Cloud account according to the specified filters.
//
// > **NOTE:** Available in 1.95.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/actiontrail"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := actiontrail.GetTrails(ctx, &actiontrail.GetTrailsArgs{
//				NameRegex: pulumi.StringRef("tf-testacc-actiontrail"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("trailName", _default.Trails[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetTrails(ctx *pulumi.Context, args *GetTrailsArgs, opts ...pulumi.InvokeOption) (*GetTrailsResult, error) {
	var rv GetTrailsResult
	err := ctx.Invoke("alicloud:actiontrail/getTrails:getTrails", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTrails.
type GetTrailsArgs struct {
	// A list of ActionTrail Trail IDs. It is the same as trail name.
	Ids []string `pulumi:"ids"`
	// Whether to show organization tracking. Default to `false`.
	IncludeOrganizationTrail *bool `pulumi:"includeOrganizationTrail"`
	// Whether to show shadow tracking. Default to `false`.
	IncludeShadowTrails *bool `pulumi:"includeShadowTrails"`
	// A regex string to filter results by trail name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// Filter the results by status of the ActionTrail Trail. Valid values: `Disable`, `Enable`, `Fresh`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getTrails.
type GetTrailsResult struct {
	// Field `actiontrails` has been deprecated from version 1.95.0. Use `trails` instead."
	//
	// Deprecated: Field 'actiontrails' has been deprecated from version 1.95.0. Use 'trails' instead.
	Actiontrails []GetTrailsActiontrail `pulumi:"actiontrails"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of ActionTrail Trail ids. It is the same as trail name.
	Ids                      []string `pulumi:"ids"`
	IncludeOrganizationTrail *bool    `pulumi:"includeOrganizationTrail"`
	IncludeShadowTrails      *bool    `pulumi:"includeShadowTrails"`
	NameRegex                *string  `pulumi:"nameRegex"`
	// A list of trail names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of the ActionTrail Trail.
	Status *string `pulumi:"status"`
	// A list of ActionTrail Trails. Each element contains the following attributes:
	Trails []GetTrailsTrail `pulumi:"trails"`
}

func GetTrailsOutput(ctx *pulumi.Context, args GetTrailsOutputArgs, opts ...pulumi.InvokeOption) GetTrailsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetTrailsResult, error) {
			args := v.(GetTrailsArgs)
			r, err := GetTrails(ctx, &args, opts...)
			var s GetTrailsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetTrailsResultOutput)
}

// A collection of arguments for invoking getTrails.
type GetTrailsOutputArgs struct {
	// A list of ActionTrail Trail IDs. It is the same as trail name.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// Whether to show organization tracking. Default to `false`.
	IncludeOrganizationTrail pulumi.BoolPtrInput `pulumi:"includeOrganizationTrail"`
	// Whether to show shadow tracking. Default to `false`.
	IncludeShadowTrails pulumi.BoolPtrInput `pulumi:"includeShadowTrails"`
	// A regex string to filter results by trail name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Filter the results by status of the ActionTrail Trail. Valid values: `Disable`, `Enable`, `Fresh`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetTrailsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTrailsArgs)(nil)).Elem()
}

// A collection of values returned by getTrails.
type GetTrailsResultOutput struct{ *pulumi.OutputState }

func (GetTrailsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTrailsResult)(nil)).Elem()
}

func (o GetTrailsResultOutput) ToGetTrailsResultOutput() GetTrailsResultOutput {
	return o
}

func (o GetTrailsResultOutput) ToGetTrailsResultOutputWithContext(ctx context.Context) GetTrailsResultOutput {
	return o
}

// Field `actiontrails` has been deprecated from version 1.95.0. Use `trails` instead."
//
// Deprecated: Field 'actiontrails' has been deprecated from version 1.95.0. Use 'trails' instead.
func (o GetTrailsResultOutput) Actiontrails() GetTrailsActiontrailArrayOutput {
	return o.ApplyT(func(v GetTrailsResult) []GetTrailsActiontrail { return v.Actiontrails }).(GetTrailsActiontrailArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetTrailsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTrailsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of ActionTrail Trail ids. It is the same as trail name.
func (o GetTrailsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTrailsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetTrailsResultOutput) IncludeOrganizationTrail() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetTrailsResult) *bool { return v.IncludeOrganizationTrail }).(pulumi.BoolPtrOutput)
}

func (o GetTrailsResultOutput) IncludeShadowTrails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetTrailsResult) *bool { return v.IncludeShadowTrails }).(pulumi.BoolPtrOutput)
}

func (o GetTrailsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrailsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of trail names.
func (o GetTrailsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTrailsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetTrailsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrailsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The status of the ActionTrail Trail.
func (o GetTrailsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrailsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// A list of ActionTrail Trails. Each element contains the following attributes:
func (o GetTrailsResultOutput) Trails() GetTrailsTrailArrayOutput {
	return o.ApplyT(func(v GetTrailsResult) []GetTrailsTrail { return v.Trails }).(GetTrailsTrailArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTrailsResultOutput{})
}
