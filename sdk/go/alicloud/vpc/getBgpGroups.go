// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Vpc Bgp Groups of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.152.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := vpc.GetBgpGroups(ctx, &vpc.GetBgpGroupsArgs{
//				Ids: []string{
//					"example_value",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcBgpGroupId1", ids.Groups[0].Id)
//			nameRegex, err := vpc.GetBgpGroups(ctx, &vpc.GetBgpGroupsArgs{
//				NameRegex: pulumi.StringRef("^my-BgpGroup"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcBgpGroupId2", nameRegex.Groups[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetBgpGroups(ctx *pulumi.Context, args *GetBgpGroupsArgs, opts ...pulumi.InvokeOption) (*GetBgpGroupsResult, error) {
	var rv GetBgpGroupsResult
	err := ctx.Invoke("alicloud:vpc/getBgpGroups:getBgpGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBgpGroups.
type GetBgpGroupsArgs struct {
	// A list of Bgp Group IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Bgp Group name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the VBR.
	RouterId *string `pulumi:"routerId"`
	// The status of the resource.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getBgpGroups.
type GetBgpGroupsResult struct {
	Groups []GetBgpGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	RouterId   *string  `pulumi:"routerId"`
	Status     *string  `pulumi:"status"`
}

func GetBgpGroupsOutput(ctx *pulumi.Context, args GetBgpGroupsOutputArgs, opts ...pulumi.InvokeOption) GetBgpGroupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetBgpGroupsResult, error) {
			args := v.(GetBgpGroupsArgs)
			r, err := GetBgpGroups(ctx, &args, opts...)
			var s GetBgpGroupsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetBgpGroupsResultOutput)
}

// A collection of arguments for invoking getBgpGroups.
type GetBgpGroupsOutputArgs struct {
	// A list of Bgp Group IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Bgp Group name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the VBR.
	RouterId pulumi.StringPtrInput `pulumi:"routerId"`
	// The status of the resource.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetBgpGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBgpGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getBgpGroups.
type GetBgpGroupsResultOutput struct{ *pulumi.OutputState }

func (GetBgpGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBgpGroupsResult)(nil)).Elem()
}

func (o GetBgpGroupsResultOutput) ToGetBgpGroupsResultOutput() GetBgpGroupsResultOutput {
	return o
}

func (o GetBgpGroupsResultOutput) ToGetBgpGroupsResultOutputWithContext(ctx context.Context) GetBgpGroupsResultOutput {
	return o
}

func (o GetBgpGroupsResultOutput) Groups() GetBgpGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetBgpGroupsResult) []GetBgpGroupsGroup { return v.Groups }).(GetBgpGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetBgpGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBgpGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetBgpGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetBgpGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetBgpGroupsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBgpGroupsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetBgpGroupsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetBgpGroupsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetBgpGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBgpGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetBgpGroupsResultOutput) RouterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBgpGroupsResult) *string { return v.RouterId }).(pulumi.StringPtrOutput)
}

func (o GetBgpGroupsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBgpGroupsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetBgpGroupsResultOutput{})
}
