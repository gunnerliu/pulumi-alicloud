// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nlb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Nlb Server Groups of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.186.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/nlb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := nlb.GetServerGroups(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("nlbServerGroupId1", ids.Groups[0].Id)
//			nameRegex, err := nlb.GetServerGroups(ctx, &nlb.GetServerGroupsArgs{
//				NameRegex: pulumi.StringRef("^my-ServerGroup"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("nlbServerGroupId2", nameRegex.Groups[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetServerGroups(ctx *pulumi.Context, args *GetServerGroupsArgs, opts ...pulumi.InvokeOption) (*GetServerGroupsResult, error) {
	var rv GetServerGroupsResult
	err := ctx.Invoke("alicloud:nlb/getServerGroups:getServerGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServerGroups.
type GetServerGroupsArgs struct {
	// A list of Server Group IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Server Group name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the resource group to which the security group belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The names of the server groups to be queried.
	ServerGroupNames []string `pulumi:"serverGroupNames"`
	// The type of the server group.
	ServerGroupType *string `pulumi:"serverGroupType"`
	// The status of the server group.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// A collection of values returned by getServerGroups.
type GetServerGroupsResult struct {
	Groups []GetServerGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id               string                 `pulumi:"id"`
	Ids              []string               `pulumi:"ids"`
	NameRegex        *string                `pulumi:"nameRegex"`
	Names            []string               `pulumi:"names"`
	OutputFile       *string                `pulumi:"outputFile"`
	ResourceGroupId  *string                `pulumi:"resourceGroupId"`
	ServerGroupNames []string               `pulumi:"serverGroupNames"`
	ServerGroupType  *string                `pulumi:"serverGroupType"`
	Status           *string                `pulumi:"status"`
	Tags             map[string]interface{} `pulumi:"tags"`
}

func GetServerGroupsOutput(ctx *pulumi.Context, args GetServerGroupsOutputArgs, opts ...pulumi.InvokeOption) GetServerGroupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServerGroupsResult, error) {
			args := v.(GetServerGroupsArgs)
			r, err := GetServerGroups(ctx, &args, opts...)
			var s GetServerGroupsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetServerGroupsResultOutput)
}

// A collection of arguments for invoking getServerGroups.
type GetServerGroupsOutputArgs struct {
	// A list of Server Group IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Server Group name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the resource group to which the security group belongs.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// The names of the server groups to be queried.
	ServerGroupNames pulumi.StringArrayInput `pulumi:"serverGroupNames"`
	// The type of the server group.
	ServerGroupType pulumi.StringPtrInput `pulumi:"serverGroupType"`
	// The status of the server group.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput `pulumi:"tags"`
}

func (GetServerGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getServerGroups.
type GetServerGroupsResultOutput struct{ *pulumi.OutputState }

func (GetServerGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerGroupsResult)(nil)).Elem()
}

func (o GetServerGroupsResultOutput) ToGetServerGroupsResultOutput() GetServerGroupsResultOutput {
	return o
}

func (o GetServerGroupsResultOutput) ToGetServerGroupsResultOutputWithContext(ctx context.Context) GetServerGroupsResultOutput {
	return o
}

func (o GetServerGroupsResultOutput) Groups() GetServerGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetServerGroupsResult) []GetServerGroupsGroup { return v.Groups }).(GetServerGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServerGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServerGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetServerGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServerGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetServerGroupsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerGroupsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetServerGroupsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServerGroupsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetServerGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetServerGroupsResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerGroupsResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

func (o GetServerGroupsResultOutput) ServerGroupNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServerGroupsResult) []string { return v.ServerGroupNames }).(pulumi.StringArrayOutput)
}

func (o GetServerGroupsResultOutput) ServerGroupType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerGroupsResult) *string { return v.ServerGroupType }).(pulumi.StringPtrOutput)
}

func (o GetServerGroupsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerGroupsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetServerGroupsResultOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetServerGroupsResult) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServerGroupsResultOutput{})
}
