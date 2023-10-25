// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ros

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Ros Stack Groups of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.107.0+.
func GetStackGroups(ctx *pulumi.Context, args *GetStackGroupsArgs, opts ...pulumi.InvokeOption) (*GetStackGroupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetStackGroupsResult
	err := ctx.Invoke("alicloud:ros/getStackGroups:getStackGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStackGroups.
type GetStackGroupsArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Stack Group IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Stack Group name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of Stack Group.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getStackGroups.
type GetStackGroupsResult struct {
	EnableDetails *bool                 `pulumi:"enableDetails"`
	Groups        []GetStackGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	Status     *string  `pulumi:"status"`
}

func GetStackGroupsOutput(ctx *pulumi.Context, args GetStackGroupsOutputArgs, opts ...pulumi.InvokeOption) GetStackGroupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetStackGroupsResult, error) {
			args := v.(GetStackGroupsArgs)
			r, err := GetStackGroups(ctx, &args, opts...)
			var s GetStackGroupsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetStackGroupsResultOutput)
}

// A collection of arguments for invoking getStackGroups.
type GetStackGroupsOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Stack Group IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Stack Group name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of Stack Group.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetStackGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStackGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getStackGroups.
type GetStackGroupsResultOutput struct{ *pulumi.OutputState }

func (GetStackGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStackGroupsResult)(nil)).Elem()
}

func (o GetStackGroupsResultOutput) ToGetStackGroupsResultOutput() GetStackGroupsResultOutput {
	return o
}

func (o GetStackGroupsResultOutput) ToGetStackGroupsResultOutputWithContext(ctx context.Context) GetStackGroupsResultOutput {
	return o
}

func (o GetStackGroupsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetStackGroupsResult] {
	return pulumix.Output[GetStackGroupsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetStackGroupsResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetStackGroupsResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

func (o GetStackGroupsResultOutput) Groups() GetStackGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetStackGroupsResult) []GetStackGroupsGroup { return v.Groups }).(GetStackGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetStackGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetStackGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetStackGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetStackGroupsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetStackGroupsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetStackGroupsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetStackGroupsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetStackGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetStackGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetStackGroupsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetStackGroupsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetStackGroupsResultOutput{})
}
