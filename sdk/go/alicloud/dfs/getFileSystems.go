// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dfs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Dfs File Systems of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.140.0+.
func GetFileSystems(ctx *pulumi.Context, args *GetFileSystemsArgs, opts ...pulumi.InvokeOption) (*GetFileSystemsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetFileSystemsResult
	err := ctx.Invoke("alicloud:dfs/getFileSystems:getFileSystems", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFileSystems.
type GetFileSystemsArgs struct {
	// A list of File System IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by File System name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getFileSystems.
type GetFileSystemsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string                 `pulumi:"id"`
	Ids        []string               `pulumi:"ids"`
	NameRegex  *string                `pulumi:"nameRegex"`
	Names      []string               `pulumi:"names"`
	OutputFile *string                `pulumi:"outputFile"`
	Systems    []GetFileSystemsSystem `pulumi:"systems"`
}

func GetFileSystemsOutput(ctx *pulumi.Context, args GetFileSystemsOutputArgs, opts ...pulumi.InvokeOption) GetFileSystemsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetFileSystemsResult, error) {
			args := v.(GetFileSystemsArgs)
			r, err := GetFileSystems(ctx, &args, opts...)
			var s GetFileSystemsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetFileSystemsResultOutput)
}

// A collection of arguments for invoking getFileSystems.
type GetFileSystemsOutputArgs struct {
	// A list of File System IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by File System name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetFileSystemsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFileSystemsArgs)(nil)).Elem()
}

// A collection of values returned by getFileSystems.
type GetFileSystemsResultOutput struct{ *pulumi.OutputState }

func (GetFileSystemsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFileSystemsResult)(nil)).Elem()
}

func (o GetFileSystemsResultOutput) ToGetFileSystemsResultOutput() GetFileSystemsResultOutput {
	return o
}

func (o GetFileSystemsResultOutput) ToGetFileSystemsResultOutputWithContext(ctx context.Context) GetFileSystemsResultOutput {
	return o
}

func (o GetFileSystemsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetFileSystemsResult] {
	return pulumix.Output[GetFileSystemsResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetFileSystemsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFileSystemsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetFileSystemsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetFileSystemsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetFileSystemsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetFileSystemsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetFileSystemsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetFileSystemsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetFileSystemsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetFileSystemsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetFileSystemsResultOutput) Systems() GetFileSystemsSystemArrayOutput {
	return o.ApplyT(func(v GetFileSystemsResult) []GetFileSystemsSystem { return v.Systems }).(GetFileSystemsSystemArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFileSystemsResultOutput{})
}
