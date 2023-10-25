// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eds

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Ecd Network Packages of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.142.0+.
func GetNetworkPackages(ctx *pulumi.Context, args *GetNetworkPackagesArgs, opts ...pulumi.InvokeOption) (*GetNetworkPackagesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNetworkPackagesResult
	err := ctx.Invoke("alicloud:eds/getNetworkPackages:getNetworkPackages", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkPackages.
type GetNetworkPackagesArgs struct {
	// A list of Network Package IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of network package. Valid values: `Creating`, `InUse`, `Releasing`,`Released`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getNetworkPackages.
type GetNetworkPackagesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string                      `pulumi:"id"`
	Ids        []string                    `pulumi:"ids"`
	OutputFile *string                     `pulumi:"outputFile"`
	Packages   []GetNetworkPackagesPackage `pulumi:"packages"`
	Status     *string                     `pulumi:"status"`
}

func GetNetworkPackagesOutput(ctx *pulumi.Context, args GetNetworkPackagesOutputArgs, opts ...pulumi.InvokeOption) GetNetworkPackagesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNetworkPackagesResult, error) {
			args := v.(GetNetworkPackagesArgs)
			r, err := GetNetworkPackages(ctx, &args, opts...)
			var s GetNetworkPackagesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNetworkPackagesResultOutput)
}

// A collection of arguments for invoking getNetworkPackages.
type GetNetworkPackagesOutputArgs struct {
	// A list of Network Package IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of network package. Valid values: `Creating`, `InUse`, `Releasing`,`Released`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetNetworkPackagesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworkPackagesArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkPackages.
type GetNetworkPackagesResultOutput struct{ *pulumi.OutputState }

func (GetNetworkPackagesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworkPackagesResult)(nil)).Elem()
}

func (o GetNetworkPackagesResultOutput) ToGetNetworkPackagesResultOutput() GetNetworkPackagesResultOutput {
	return o
}

func (o GetNetworkPackagesResultOutput) ToGetNetworkPackagesResultOutputWithContext(ctx context.Context) GetNetworkPackagesResultOutput {
	return o
}

func (o GetNetworkPackagesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetNetworkPackagesResult] {
	return pulumix.Output[GetNetworkPackagesResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetNetworkPackagesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworkPackagesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetNetworkPackagesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetNetworkPackagesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetNetworkPackagesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworkPackagesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetNetworkPackagesResultOutput) Packages() GetNetworkPackagesPackageArrayOutput {
	return o.ApplyT(func(v GetNetworkPackagesResult) []GetNetworkPackagesPackage { return v.Packages }).(GetNetworkPackagesPackageArrayOutput)
}

func (o GetNetworkPackagesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworkPackagesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNetworkPackagesResultOutput{})
}
