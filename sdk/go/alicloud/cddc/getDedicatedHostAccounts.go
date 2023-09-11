// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cddc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Cddc Dedicated Host Accounts of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.148.0+.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cddc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := cddc.GetDedicatedHostAccounts(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("cddcDedicatedHostAccountId1", ids.Accounts[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetDedicatedHostAccounts(ctx *pulumi.Context, args *GetDedicatedHostAccountsArgs, opts ...pulumi.InvokeOption) (*GetDedicatedHostAccountsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDedicatedHostAccountsResult
	err := ctx.Invoke("alicloud:cddc/getDedicatedHostAccounts:getDedicatedHostAccounts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDedicatedHostAccounts.
type GetDedicatedHostAccountsArgs struct {
	// The ID of the Dedicated host.
	DedicatedHostId *string `pulumi:"dedicatedHostId"`
	// A list of Dedicated Host Account IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Account name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
}

// A collection of values returned by getDedicatedHostAccounts.
type GetDedicatedHostAccountsResult struct {
	Accounts        []GetDedicatedHostAccountsAccount `pulumi:"accounts"`
	DedicatedHostId *string                           `pulumi:"dedicatedHostId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	PageNumber *int     `pulumi:"pageNumber"`
	PageSize   *int     `pulumi:"pageSize"`
}

func GetDedicatedHostAccountsOutput(ctx *pulumi.Context, args GetDedicatedHostAccountsOutputArgs, opts ...pulumi.InvokeOption) GetDedicatedHostAccountsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDedicatedHostAccountsResult, error) {
			args := v.(GetDedicatedHostAccountsArgs)
			r, err := GetDedicatedHostAccounts(ctx, &args, opts...)
			var s GetDedicatedHostAccountsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDedicatedHostAccountsResultOutput)
}

// A collection of arguments for invoking getDedicatedHostAccounts.
type GetDedicatedHostAccountsOutputArgs struct {
	// The ID of the Dedicated host.
	DedicatedHostId pulumi.StringPtrInput `pulumi:"dedicatedHostId"`
	// A list of Dedicated Host Account IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Account name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
}

func (GetDedicatedHostAccountsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDedicatedHostAccountsArgs)(nil)).Elem()
}

// A collection of values returned by getDedicatedHostAccounts.
type GetDedicatedHostAccountsResultOutput struct{ *pulumi.OutputState }

func (GetDedicatedHostAccountsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDedicatedHostAccountsResult)(nil)).Elem()
}

func (o GetDedicatedHostAccountsResultOutput) ToGetDedicatedHostAccountsResultOutput() GetDedicatedHostAccountsResultOutput {
	return o
}

func (o GetDedicatedHostAccountsResultOutput) ToGetDedicatedHostAccountsResultOutputWithContext(ctx context.Context) GetDedicatedHostAccountsResultOutput {
	return o
}

func (o GetDedicatedHostAccountsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetDedicatedHostAccountsResult] {
	return pulumix.Output[GetDedicatedHostAccountsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetDedicatedHostAccountsResultOutput) Accounts() GetDedicatedHostAccountsAccountArrayOutput {
	return o.ApplyT(func(v GetDedicatedHostAccountsResult) []GetDedicatedHostAccountsAccount { return v.Accounts }).(GetDedicatedHostAccountsAccountArrayOutput)
}

func (o GetDedicatedHostAccountsResultOutput) DedicatedHostId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDedicatedHostAccountsResult) *string { return v.DedicatedHostId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDedicatedHostAccountsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDedicatedHostAccountsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDedicatedHostAccountsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDedicatedHostAccountsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetDedicatedHostAccountsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDedicatedHostAccountsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetDedicatedHostAccountsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDedicatedHostAccountsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetDedicatedHostAccountsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDedicatedHostAccountsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetDedicatedHostAccountsResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetDedicatedHostAccountsResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetDedicatedHostAccountsResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetDedicatedHostAccountsResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDedicatedHostAccountsResultOutput{})
}
