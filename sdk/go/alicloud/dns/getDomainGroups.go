// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetDomainGroups(ctx *pulumi.Context, args *GetDomainGroupsArgs, opts ...pulumi.InvokeOption) (*GetDomainGroupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDomainGroupsResult
	err := ctx.Invoke("alicloud:dns/getDomainGroups:getDomainGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDomainGroups.
type GetDomainGroupsArgs struct {
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	OutputFile *string  `pulumi:"outputFile"`
}

// A collection of values returned by getDomainGroups.
type GetDomainGroupsResult struct {
	Groups []GetDomainGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetDomainGroupsOutput(ctx *pulumi.Context, args GetDomainGroupsOutputArgs, opts ...pulumi.InvokeOption) GetDomainGroupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDomainGroupsResult, error) {
			args := v.(GetDomainGroupsArgs)
			r, err := GetDomainGroups(ctx, &args, opts...)
			var s GetDomainGroupsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDomainGroupsResultOutput)
}

// A collection of arguments for invoking getDomainGroups.
type GetDomainGroupsOutputArgs struct {
	Ids        pulumi.StringArrayInput `pulumi:"ids"`
	NameRegex  pulumi.StringPtrInput   `pulumi:"nameRegex"`
	OutputFile pulumi.StringPtrInput   `pulumi:"outputFile"`
}

func (GetDomainGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDomainGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getDomainGroups.
type GetDomainGroupsResultOutput struct{ *pulumi.OutputState }

func (GetDomainGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDomainGroupsResult)(nil)).Elem()
}

func (o GetDomainGroupsResultOutput) ToGetDomainGroupsResultOutput() GetDomainGroupsResultOutput {
	return o
}

func (o GetDomainGroupsResultOutput) ToGetDomainGroupsResultOutputWithContext(ctx context.Context) GetDomainGroupsResultOutput {
	return o
}

func (o GetDomainGroupsResultOutput) Groups() GetDomainGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetDomainGroupsResult) []GetDomainGroupsGroup { return v.Groups }).(GetDomainGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDomainGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDomainGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDomainGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetDomainGroupsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDomainGroupsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetDomainGroupsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDomainGroupsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetDomainGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDomainGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDomainGroupsResultOutput{})
}
