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

// This data source provides the Vpc Traffic Mirror Filters of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.140.0+.
func GetTrafficMirrorFilters(ctx *pulumi.Context, args *GetTrafficMirrorFiltersArgs, opts ...pulumi.InvokeOption) (*GetTrafficMirrorFiltersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTrafficMirrorFiltersResult
	err := ctx.Invoke("alicloud:vpc/getTrafficMirrorFilters:getTrafficMirrorFilters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTrafficMirrorFilters.
type GetTrafficMirrorFiltersArgs struct {
	// A list of Traffic Mirror Filter IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Traffic Mirror Filter name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The state of the filter. Valid values:`Creating`, `Created`, `Modifying` and `Deleting`. `Creating`: The filter is being created. `Created`: The filter is created. `Modifying`: The filter is being modified. `Deleting`: The filter is being deleted.
	Status *string `pulumi:"status"`
	// The name of the filter.
	TrafficMirrorFilterName *string `pulumi:"trafficMirrorFilterName"`
}

// A collection of values returned by getTrafficMirrorFilters.
type GetTrafficMirrorFiltersResult struct {
	Filters []GetTrafficMirrorFiltersFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id                      string   `pulumi:"id"`
	Ids                     []string `pulumi:"ids"`
	NameRegex               *string  `pulumi:"nameRegex"`
	Names                   []string `pulumi:"names"`
	OutputFile              *string  `pulumi:"outputFile"`
	Status                  *string  `pulumi:"status"`
	TrafficMirrorFilterName *string  `pulumi:"trafficMirrorFilterName"`
}

func GetTrafficMirrorFiltersOutput(ctx *pulumi.Context, args GetTrafficMirrorFiltersOutputArgs, opts ...pulumi.InvokeOption) GetTrafficMirrorFiltersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetTrafficMirrorFiltersResult, error) {
			args := v.(GetTrafficMirrorFiltersArgs)
			r, err := GetTrafficMirrorFilters(ctx, &args, opts...)
			var s GetTrafficMirrorFiltersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetTrafficMirrorFiltersResultOutput)
}

// A collection of arguments for invoking getTrafficMirrorFilters.
type GetTrafficMirrorFiltersOutputArgs struct {
	// A list of Traffic Mirror Filter IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Traffic Mirror Filter name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The state of the filter. Valid values:`Creating`, `Created`, `Modifying` and `Deleting`. `Creating`: The filter is being created. `Created`: The filter is created. `Modifying`: The filter is being modified. `Deleting`: The filter is being deleted.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The name of the filter.
	TrafficMirrorFilterName pulumi.StringPtrInput `pulumi:"trafficMirrorFilterName"`
}

func (GetTrafficMirrorFiltersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTrafficMirrorFiltersArgs)(nil)).Elem()
}

// A collection of values returned by getTrafficMirrorFilters.
type GetTrafficMirrorFiltersResultOutput struct{ *pulumi.OutputState }

func (GetTrafficMirrorFiltersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTrafficMirrorFiltersResult)(nil)).Elem()
}

func (o GetTrafficMirrorFiltersResultOutput) ToGetTrafficMirrorFiltersResultOutput() GetTrafficMirrorFiltersResultOutput {
	return o
}

func (o GetTrafficMirrorFiltersResultOutput) ToGetTrafficMirrorFiltersResultOutputWithContext(ctx context.Context) GetTrafficMirrorFiltersResultOutput {
	return o
}

func (o GetTrafficMirrorFiltersResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetTrafficMirrorFiltersResult] {
	return pulumix.Output[GetTrafficMirrorFiltersResult]{
		OutputState: o.OutputState,
	}
}

func (o GetTrafficMirrorFiltersResultOutput) Filters() GetTrafficMirrorFiltersFilterArrayOutput {
	return o.ApplyT(func(v GetTrafficMirrorFiltersResult) []GetTrafficMirrorFiltersFilter { return v.Filters }).(GetTrafficMirrorFiltersFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetTrafficMirrorFiltersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTrafficMirrorFiltersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTrafficMirrorFiltersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTrafficMirrorFiltersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetTrafficMirrorFiltersResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrafficMirrorFiltersResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetTrafficMirrorFiltersResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTrafficMirrorFiltersResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetTrafficMirrorFiltersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrafficMirrorFiltersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetTrafficMirrorFiltersResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrafficMirrorFiltersResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetTrafficMirrorFiltersResultOutput) TrafficMirrorFilterName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrafficMirrorFiltersResult) *string { return v.TrafficMirrorFilterName }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTrafficMirrorFiltersResultOutput{})
}
