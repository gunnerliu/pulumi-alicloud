// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ebs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Ebs Disk Replica Groups of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.187.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ebs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := ebs.GetDiskReplicaGroups(ctx, &ebs.GetDiskReplicaGroupsArgs{
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("ebsDiskReplicaGroupId1", ids.Groups[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetDiskReplicaGroups(ctx *pulumi.Context, args *GetDiskReplicaGroupsArgs, opts ...pulumi.InvokeOption) (*GetDiskReplicaGroupsResult, error) {
	var rv GetDiskReplicaGroupsResult
	err := ctx.Invoke("alicloud:ebs/getDiskReplicaGroups:getDiskReplicaGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDiskReplicaGroups.
type GetDiskReplicaGroupsArgs struct {
	// A list of Disk Replica Group IDs.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
}

// A collection of values returned by getDiskReplicaGroups.
type GetDiskReplicaGroupsResult struct {
	Groups []GetDiskReplicaGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetDiskReplicaGroupsOutput(ctx *pulumi.Context, args GetDiskReplicaGroupsOutputArgs, opts ...pulumi.InvokeOption) GetDiskReplicaGroupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDiskReplicaGroupsResult, error) {
			args := v.(GetDiskReplicaGroupsArgs)
			r, err := GetDiskReplicaGroups(ctx, &args, opts...)
			var s GetDiskReplicaGroupsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDiskReplicaGroupsResultOutput)
}

// A collection of arguments for invoking getDiskReplicaGroups.
type GetDiskReplicaGroupsOutputArgs struct {
	// A list of Disk Replica Group IDs.
	Ids        pulumi.StringArrayInput `pulumi:"ids"`
	OutputFile pulumi.StringPtrInput   `pulumi:"outputFile"`
}

func (GetDiskReplicaGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDiskReplicaGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getDiskReplicaGroups.
type GetDiskReplicaGroupsResultOutput struct{ *pulumi.OutputState }

func (GetDiskReplicaGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDiskReplicaGroupsResult)(nil)).Elem()
}

func (o GetDiskReplicaGroupsResultOutput) ToGetDiskReplicaGroupsResultOutput() GetDiskReplicaGroupsResultOutput {
	return o
}

func (o GetDiskReplicaGroupsResultOutput) ToGetDiskReplicaGroupsResultOutputWithContext(ctx context.Context) GetDiskReplicaGroupsResultOutput {
	return o
}

func (o GetDiskReplicaGroupsResultOutput) Groups() GetDiskReplicaGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetDiskReplicaGroupsResult) []GetDiskReplicaGroupsGroup { return v.Groups }).(GetDiskReplicaGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDiskReplicaGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDiskReplicaGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDiskReplicaGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDiskReplicaGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetDiskReplicaGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDiskReplicaGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDiskReplicaGroupsResultOutput{})
}
