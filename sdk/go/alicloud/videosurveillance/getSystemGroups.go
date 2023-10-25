// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package videosurveillance

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Video Surveillance System Groups of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.135.0+.
func GetSystemGroups(ctx *pulumi.Context, args *GetSystemGroupsArgs, opts ...pulumi.InvokeOption) (*GetSystemGroupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSystemGroupsResult
	err := ctx.Invoke("alicloud:videosurveillance/getSystemGroups:getSystemGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSystemGroups.
type GetSystemGroupsArgs struct {
	// A list of Group IDs.
	Ids []string `pulumi:"ids"`
	// The use of the access protocol support `gb28181`,`rtmp`(Real Time Messaging Protocol).
	InProtocol *string `pulumi:"inProtocol"`
	// The name.
	Name *string `pulumi:"name"`
	// A regex string to filter results by Group name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status. Valid values: `on`,`off`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getSystemGroups.
type GetSystemGroupsResult struct {
	Groups []GetSystemGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	InProtocol *string  `pulumi:"inProtocol"`
	Name       *string  `pulumi:"name"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	Status     *string  `pulumi:"status"`
}

func GetSystemGroupsOutput(ctx *pulumi.Context, args GetSystemGroupsOutputArgs, opts ...pulumi.InvokeOption) GetSystemGroupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSystemGroupsResult, error) {
			args := v.(GetSystemGroupsArgs)
			r, err := GetSystemGroups(ctx, &args, opts...)
			var s GetSystemGroupsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSystemGroupsResultOutput)
}

// A collection of arguments for invoking getSystemGroups.
type GetSystemGroupsOutputArgs struct {
	// A list of Group IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The use of the access protocol support `gb28181`,`rtmp`(Real Time Messaging Protocol).
	InProtocol pulumi.StringPtrInput `pulumi:"inProtocol"`
	// The name.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// A regex string to filter results by Group name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status. Valid values: `on`,`off`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetSystemGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSystemGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getSystemGroups.
type GetSystemGroupsResultOutput struct{ *pulumi.OutputState }

func (GetSystemGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSystemGroupsResult)(nil)).Elem()
}

func (o GetSystemGroupsResultOutput) ToGetSystemGroupsResultOutput() GetSystemGroupsResultOutput {
	return o
}

func (o GetSystemGroupsResultOutput) ToGetSystemGroupsResultOutputWithContext(ctx context.Context) GetSystemGroupsResultOutput {
	return o
}

func (o GetSystemGroupsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetSystemGroupsResult] {
	return pulumix.Output[GetSystemGroupsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetSystemGroupsResultOutput) Groups() GetSystemGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetSystemGroupsResult) []GetSystemGroupsGroup { return v.Groups }).(GetSystemGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSystemGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSystemGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSystemGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSystemGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSystemGroupsResultOutput) InProtocol() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSystemGroupsResult) *string { return v.InProtocol }).(pulumi.StringPtrOutput)
}

func (o GetSystemGroupsResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSystemGroupsResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o GetSystemGroupsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSystemGroupsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetSystemGroupsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSystemGroupsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetSystemGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSystemGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetSystemGroupsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSystemGroupsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSystemGroupsResultOutput{})
}
