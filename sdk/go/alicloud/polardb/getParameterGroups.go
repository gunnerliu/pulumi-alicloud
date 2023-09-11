// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package polardb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the PolarDB Parameter Groups of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.183.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/polardb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := polardb.GetParameterGroups(ctx, &polardb.GetParameterGroupsArgs{
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("polardbParameterGroupId1", ids.Groups[0].Id)
//			nameRegex, err := polardb.GetParameterGroups(ctx, &polardb.GetParameterGroupsArgs{
//				NameRegex: pulumi.StringRef("example_name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("polardbParameterGroupId2", nameRegex.Groups[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetParameterGroups(ctx *pulumi.Context, args *GetParameterGroupsArgs, opts ...pulumi.InvokeOption) (*GetParameterGroupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetParameterGroupsResult
	err := ctx.Invoke("alicloud:polardb/getParameterGroups:getParameterGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getParameterGroups.
type GetParameterGroupsArgs struct {
	// The type of the database engine.
	DbType *string `pulumi:"dbType"`
	// The version number of the database engine.
	DbVersion *string `pulumi:"dbVersion"`
	// A list of Parameter Group IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Parameter Group name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getParameterGroups.
type GetParameterGroupsResult struct {
	DbType    *string                   `pulumi:"dbType"`
	DbVersion *string                   `pulumi:"dbVersion"`
	Groups    []GetParameterGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetParameterGroupsOutput(ctx *pulumi.Context, args GetParameterGroupsOutputArgs, opts ...pulumi.InvokeOption) GetParameterGroupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetParameterGroupsResult, error) {
			args := v.(GetParameterGroupsArgs)
			r, err := GetParameterGroups(ctx, &args, opts...)
			var s GetParameterGroupsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetParameterGroupsResultOutput)
}

// A collection of arguments for invoking getParameterGroups.
type GetParameterGroupsOutputArgs struct {
	// The type of the database engine.
	DbType pulumi.StringPtrInput `pulumi:"dbType"`
	// The version number of the database engine.
	DbVersion pulumi.StringPtrInput `pulumi:"dbVersion"`
	// A list of Parameter Group IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Parameter Group name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetParameterGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetParameterGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getParameterGroups.
type GetParameterGroupsResultOutput struct{ *pulumi.OutputState }

func (GetParameterGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetParameterGroupsResult)(nil)).Elem()
}

func (o GetParameterGroupsResultOutput) ToGetParameterGroupsResultOutput() GetParameterGroupsResultOutput {
	return o
}

func (o GetParameterGroupsResultOutput) ToGetParameterGroupsResultOutputWithContext(ctx context.Context) GetParameterGroupsResultOutput {
	return o
}

func (o GetParameterGroupsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetParameterGroupsResult] {
	return pulumix.Output[GetParameterGroupsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetParameterGroupsResultOutput) DbType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetParameterGroupsResult) *string { return v.DbType }).(pulumi.StringPtrOutput)
}

func (o GetParameterGroupsResultOutput) DbVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetParameterGroupsResult) *string { return v.DbVersion }).(pulumi.StringPtrOutput)
}

func (o GetParameterGroupsResultOutput) Groups() GetParameterGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetParameterGroupsResult) []GetParameterGroupsGroup { return v.Groups }).(GetParameterGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetParameterGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetParameterGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetParameterGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetParameterGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetParameterGroupsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetParameterGroupsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetParameterGroupsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetParameterGroupsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetParameterGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetParameterGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetParameterGroupsResultOutput{})
}
