// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package log

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Log Stores of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.126.0+.
func GetStores(ctx *pulumi.Context, args *GetStoresArgs, opts ...pulumi.InvokeOption) (*GetStoresResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetStoresResult
	err := ctx.Invoke("alicloud:log/getStores:getStores", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStores.
type GetStoresArgs struct {
	// A list of store IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by store name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	Project    string  `pulumi:"project"`
}

// A collection of values returned by getStores.
type GetStoresResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string           `pulumi:"id"`
	Ids        []string         `pulumi:"ids"`
	NameRegex  *string          `pulumi:"nameRegex"`
	Names      []string         `pulumi:"names"`
	OutputFile *string          `pulumi:"outputFile"`
	Project    string           `pulumi:"project"`
	Stores     []GetStoresStore `pulumi:"stores"`
}

func GetStoresOutput(ctx *pulumi.Context, args GetStoresOutputArgs, opts ...pulumi.InvokeOption) GetStoresResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetStoresResult, error) {
			args := v.(GetStoresArgs)
			r, err := GetStores(ctx, &args, opts...)
			var s GetStoresResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetStoresResultOutput)
}

// A collection of arguments for invoking getStores.
type GetStoresOutputArgs struct {
	// A list of store IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by store name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	Project    pulumi.StringInput    `pulumi:"project"`
}

func (GetStoresOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStoresArgs)(nil)).Elem()
}

// A collection of values returned by getStores.
type GetStoresResultOutput struct{ *pulumi.OutputState }

func (GetStoresResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStoresResult)(nil)).Elem()
}

func (o GetStoresResultOutput) ToGetStoresResultOutput() GetStoresResultOutput {
	return o
}

func (o GetStoresResultOutput) ToGetStoresResultOutputWithContext(ctx context.Context) GetStoresResultOutput {
	return o
}

func (o GetStoresResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetStoresResult] {
	return pulumix.Output[GetStoresResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetStoresResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStoresResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetStoresResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetStoresResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetStoresResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetStoresResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetStoresResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetStoresResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetStoresResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetStoresResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetStoresResultOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v GetStoresResult) string { return v.Project }).(pulumi.StringOutput)
}

func (o GetStoresResultOutput) Stores() GetStoresStoreArrayOutput {
	return o.ApplyT(func(v GetStoresResult) []GetStoresStore { return v.Stores }).(GetStoresStoreArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetStoresResultOutput{})
}
