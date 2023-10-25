// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudfirewall

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides Cloud Firewall Instance Member available to the user.[What is Instance Member](https://help.aliyun.com/document_detail/261237.html)
//
// > **NOTE:** Available in 1.194.0+
func GetInstanceMembers(ctx *pulumi.Context, args *GetInstanceMembersArgs, opts ...pulumi.InvokeOption) (*GetInstanceMembersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInstanceMembersResult
	err := ctx.Invoke("alicloud:cloudfirewall/getInstanceMembers:getInstanceMembers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstanceMembers.
type GetInstanceMembersArgs struct {
	CurrentPage *string `pulumi:"currentPage"`
	// A list of Instance Member IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
}

// A collection of values returned by getInstanceMembers.
type GetInstanceMembersResult struct {
	CurrentPage *string `pulumi:"currentPage"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Instance Member IDs.
	Ids []string `pulumi:"ids"`
	// A list of Instance Member Entries. Each element contains the following attributes:
	Members    []GetInstanceMembersMember `pulumi:"members"`
	OutputFile *string                    `pulumi:"outputFile"`
	PageNumber *int                       `pulumi:"pageNumber"`
	PageSize   *int                       `pulumi:"pageSize"`
}

func GetInstanceMembersOutput(ctx *pulumi.Context, args GetInstanceMembersOutputArgs, opts ...pulumi.InvokeOption) GetInstanceMembersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetInstanceMembersResult, error) {
			args := v.(GetInstanceMembersArgs)
			r, err := GetInstanceMembers(ctx, &args, opts...)
			var s GetInstanceMembersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetInstanceMembersResultOutput)
}

// A collection of arguments for invoking getInstanceMembers.
type GetInstanceMembersOutputArgs struct {
	CurrentPage pulumi.StringPtrInput `pulumi:"currentPage"`
	// A list of Instance Member IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
}

func (GetInstanceMembersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceMembersArgs)(nil)).Elem()
}

// A collection of values returned by getInstanceMembers.
type GetInstanceMembersResultOutput struct{ *pulumi.OutputState }

func (GetInstanceMembersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceMembersResult)(nil)).Elem()
}

func (o GetInstanceMembersResultOutput) ToGetInstanceMembersResultOutput() GetInstanceMembersResultOutput {
	return o
}

func (o GetInstanceMembersResultOutput) ToGetInstanceMembersResultOutputWithContext(ctx context.Context) GetInstanceMembersResultOutput {
	return o
}

func (o GetInstanceMembersResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetInstanceMembersResult] {
	return pulumix.Output[GetInstanceMembersResult]{
		OutputState: o.OutputState,
	}
}

func (o GetInstanceMembersResultOutput) CurrentPage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceMembersResult) *string { return v.CurrentPage }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetInstanceMembersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceMembersResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of Instance Member IDs.
func (o GetInstanceMembersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetInstanceMembersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// A list of Instance Member Entries. Each element contains the following attributes:
func (o GetInstanceMembersResultOutput) Members() GetInstanceMembersMemberArrayOutput {
	return o.ApplyT(func(v GetInstanceMembersResult) []GetInstanceMembersMember { return v.Members }).(GetInstanceMembersMemberArrayOutput)
}

func (o GetInstanceMembersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceMembersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetInstanceMembersResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetInstanceMembersResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetInstanceMembersResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetInstanceMembersResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstanceMembersResultOutput{})
}
