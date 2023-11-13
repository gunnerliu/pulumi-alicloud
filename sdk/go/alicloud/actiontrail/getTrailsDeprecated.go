// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package actiontrail

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **DEPRECATED:**  This datasource has been renamed to actiontrail.getTrails from version 1.95.0.
//
// This data source provides a list of action trail of the current Alibaba Cloud user.
//
// Deprecated: DataSource has been renamed to `getTrails`
func GetTrailsDeprecated(ctx *pulumi.Context, args *GetTrailsDeprecatedArgs, opts ...pulumi.InvokeOption) (*GetTrailsDeprecatedResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTrailsDeprecatedResult
	err := ctx.Invoke("alicloud:actiontrail/getTrailsDeprecated:getTrailsDeprecated", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTrailsDeprecated.
type GetTrailsDeprecatedArgs struct {
	Ids                      []string `pulumi:"ids"`
	IncludeOrganizationTrail *bool    `pulumi:"includeOrganizationTrail"`
	IncludeShadowTrails      *bool    `pulumi:"includeShadowTrails"`
	// A regex string to filter results action trail name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	Status     *string `pulumi:"status"`
}

// A collection of values returned by getTrailsDeprecated.
type GetTrailsDeprecatedResult struct {
	// A list of actiontrails. Each element contains the following attributes:
	//
	// Deprecated: Field 'actiontrails' has been deprecated from version 1.95.0. Use 'trails' instead.
	Actiontrails []GetTrailsDeprecatedActiontrail `pulumi:"actiontrails"`
	// The provider-assigned unique ID for this managed resource.
	Id                       string   `pulumi:"id"`
	Ids                      []string `pulumi:"ids"`
	IncludeOrganizationTrail *bool    `pulumi:"includeOrganizationTrail"`
	IncludeShadowTrails      *bool    `pulumi:"includeShadowTrails"`
	NameRegex                *string  `pulumi:"nameRegex"`
	// A list of trail names.
	Names      []string                   `pulumi:"names"`
	OutputFile *string                    `pulumi:"outputFile"`
	Status     *string                    `pulumi:"status"`
	Trails     []GetTrailsDeprecatedTrail `pulumi:"trails"`
}

func GetTrailsDeprecatedOutput(ctx *pulumi.Context, args GetTrailsDeprecatedOutputArgs, opts ...pulumi.InvokeOption) GetTrailsDeprecatedResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetTrailsDeprecatedResult, error) {
			args := v.(GetTrailsDeprecatedArgs)
			r, err := GetTrailsDeprecated(ctx, &args, opts...)
			var s GetTrailsDeprecatedResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetTrailsDeprecatedResultOutput)
}

// A collection of arguments for invoking getTrailsDeprecated.
type GetTrailsDeprecatedOutputArgs struct {
	Ids                      pulumi.StringArrayInput `pulumi:"ids"`
	IncludeOrganizationTrail pulumi.BoolPtrInput     `pulumi:"includeOrganizationTrail"`
	IncludeShadowTrails      pulumi.BoolPtrInput     `pulumi:"includeShadowTrails"`
	// A regex string to filter results action trail name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	Status     pulumi.StringPtrInput `pulumi:"status"`
}

func (GetTrailsDeprecatedOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTrailsDeprecatedArgs)(nil)).Elem()
}

// A collection of values returned by getTrailsDeprecated.
type GetTrailsDeprecatedResultOutput struct{ *pulumi.OutputState }

func (GetTrailsDeprecatedResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTrailsDeprecatedResult)(nil)).Elem()
}

func (o GetTrailsDeprecatedResultOutput) ToGetTrailsDeprecatedResultOutput() GetTrailsDeprecatedResultOutput {
	return o
}

func (o GetTrailsDeprecatedResultOutput) ToGetTrailsDeprecatedResultOutputWithContext(ctx context.Context) GetTrailsDeprecatedResultOutput {
	return o
}

// A list of actiontrails. Each element contains the following attributes:
//
// Deprecated: Field 'actiontrails' has been deprecated from version 1.95.0. Use 'trails' instead.
func (o GetTrailsDeprecatedResultOutput) Actiontrails() GetTrailsDeprecatedActiontrailArrayOutput {
	return o.ApplyT(func(v GetTrailsDeprecatedResult) []GetTrailsDeprecatedActiontrail { return v.Actiontrails }).(GetTrailsDeprecatedActiontrailArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetTrailsDeprecatedResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTrailsDeprecatedResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTrailsDeprecatedResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTrailsDeprecatedResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetTrailsDeprecatedResultOutput) IncludeOrganizationTrail() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetTrailsDeprecatedResult) *bool { return v.IncludeOrganizationTrail }).(pulumi.BoolPtrOutput)
}

func (o GetTrailsDeprecatedResultOutput) IncludeShadowTrails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetTrailsDeprecatedResult) *bool { return v.IncludeShadowTrails }).(pulumi.BoolPtrOutput)
}

func (o GetTrailsDeprecatedResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrailsDeprecatedResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of trail names.
func (o GetTrailsDeprecatedResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTrailsDeprecatedResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetTrailsDeprecatedResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrailsDeprecatedResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetTrailsDeprecatedResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrailsDeprecatedResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetTrailsDeprecatedResultOutput) Trails() GetTrailsDeprecatedTrailArrayOutput {
	return o.ApplyT(func(v GetTrailsDeprecatedResult) []GetTrailsDeprecatedTrail { return v.Trails }).(GetTrailsDeprecatedTrailArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTrailsDeprecatedResultOutput{})
}
