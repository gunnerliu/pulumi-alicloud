// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ga

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Global Accelerator (GA) Bandwidth Packages of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.112.0+.
func GetBandwidthPackages(ctx *pulumi.Context, args *GetBandwidthPackagesArgs, opts ...pulumi.InvokeOption) (*GetBandwidthPackagesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetBandwidthPackagesResult
	err := ctx.Invoke("alicloud:ga/getBandwidthPackages:getBandwidthPackages", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBandwidthPackages.
type GetBandwidthPackagesArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Bandwidth Package IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Bandwidth Package name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the bandwidth plan.
	Status *string `pulumi:"status"`
	// The type of the bandwidth packet. China station only supports return to basic.
	Type *string `pulumi:"type"`
}

// A collection of values returned by getBandwidthPackages.
type GetBandwidthPackagesResult struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                        `pulumi:"id"`
	Ids        []string                      `pulumi:"ids"`
	NameRegex  *string                       `pulumi:"nameRegex"`
	Names      []string                      `pulumi:"names"`
	OutputFile *string                       `pulumi:"outputFile"`
	Packages   []GetBandwidthPackagesPackage `pulumi:"packages"`
	Status     *string                       `pulumi:"status"`
	Type       *string                       `pulumi:"type"`
}

func GetBandwidthPackagesOutput(ctx *pulumi.Context, args GetBandwidthPackagesOutputArgs, opts ...pulumi.InvokeOption) GetBandwidthPackagesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetBandwidthPackagesResult, error) {
			args := v.(GetBandwidthPackagesArgs)
			r, err := GetBandwidthPackages(ctx, &args, opts...)
			var s GetBandwidthPackagesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetBandwidthPackagesResultOutput)
}

// A collection of arguments for invoking getBandwidthPackages.
type GetBandwidthPackagesOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Bandwidth Package IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Bandwidth Package name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the bandwidth plan.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The type of the bandwidth packet. China station only supports return to basic.
	Type pulumi.StringPtrInput `pulumi:"type"`
}

func (GetBandwidthPackagesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBandwidthPackagesArgs)(nil)).Elem()
}

// A collection of values returned by getBandwidthPackages.
type GetBandwidthPackagesResultOutput struct{ *pulumi.OutputState }

func (GetBandwidthPackagesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBandwidthPackagesResult)(nil)).Elem()
}

func (o GetBandwidthPackagesResultOutput) ToGetBandwidthPackagesResultOutput() GetBandwidthPackagesResultOutput {
	return o
}

func (o GetBandwidthPackagesResultOutput) ToGetBandwidthPackagesResultOutputWithContext(ctx context.Context) GetBandwidthPackagesResultOutput {
	return o
}

func (o GetBandwidthPackagesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetBandwidthPackagesResult] {
	return pulumix.Output[GetBandwidthPackagesResult]{
		OutputState: o.OutputState,
	}
}

func (o GetBandwidthPackagesResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetBandwidthPackagesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetBandwidthPackagesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetBandwidthPackagesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetBandwidthPackagesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetBandwidthPackagesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetBandwidthPackagesResultOutput) Packages() GetBandwidthPackagesPackageArrayOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) []GetBandwidthPackagesPackage { return v.Packages }).(GetBandwidthPackagesPackageArrayOutput)
}

func (o GetBandwidthPackagesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetBandwidthPackagesResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBandwidthPackagesResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetBandwidthPackagesResultOutput{})
}
