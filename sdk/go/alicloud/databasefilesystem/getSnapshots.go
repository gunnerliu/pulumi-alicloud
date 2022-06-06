// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databasefilesystem

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Dbfs Snapshots of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.156.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/databasefilesystem"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		ids, err := databasefilesystem.GetSnapshots(ctx, &databasefilesystem.GetSnapshotsArgs{
// 			Ids: []string{
// 				"example_id",
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("dbfsSnapshotId1", ids.Snapshots[0].Id)
// 		nameRegex, err := databasefilesystem.GetSnapshots(ctx, &databasefilesystem.GetSnapshotsArgs{
// 			NameRegex: pulumi.StringRef("^my-Snapshot"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("dbfsSnapshotId2", nameRegex.Snapshots[0].Id)
// 		status, err := databasefilesystem.GetSnapshots(ctx, &databasefilesystem.GetSnapshotsArgs{
// 			Status: pulumi.StringRef("accomplished"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("dbfsSnapshotId3", status.Snapshots[0].Id)
// 		return nil
// 	})
// }
// ```
func GetSnapshots(ctx *pulumi.Context, args *GetSnapshotsArgs, opts ...pulumi.InvokeOption) (*GetSnapshotsResult, error) {
	var rv GetSnapshotsResult
	err := ctx.Invoke("alicloud:databasefilesystem/getSnapshots:getSnapshots", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSnapshots.
type GetSnapshotsArgs struct {
	// A list of Snapshot IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Snapshot name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// The status of the snapshot. Possible values: `progressing`, `accomplished`, `failed`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getSnapshots.
type GetSnapshotsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string                 `pulumi:"id"`
	Ids        []string               `pulumi:"ids"`
	NameRegex  *string                `pulumi:"nameRegex"`
	Names      []string               `pulumi:"names"`
	OutputFile *string                `pulumi:"outputFile"`
	Snapshots  []GetSnapshotsSnapshot `pulumi:"snapshots"`
	Status     *string                `pulumi:"status"`
}

func GetSnapshotsOutput(ctx *pulumi.Context, args GetSnapshotsOutputArgs, opts ...pulumi.InvokeOption) GetSnapshotsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSnapshotsResult, error) {
			args := v.(GetSnapshotsArgs)
			r, err := GetSnapshots(ctx, &args, opts...)
			var s GetSnapshotsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSnapshotsResultOutput)
}

// A collection of arguments for invoking getSnapshots.
type GetSnapshotsOutputArgs struct {
	// A list of Snapshot IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Snapshot name.
	NameRegex  pulumi.StringPtrInput `pulumi:"nameRegex"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the snapshot. Possible values: `progressing`, `accomplished`, `failed`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetSnapshotsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnapshotsArgs)(nil)).Elem()
}

// A collection of values returned by getSnapshots.
type GetSnapshotsResultOutput struct{ *pulumi.OutputState }

func (GetSnapshotsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSnapshotsResult)(nil)).Elem()
}

func (o GetSnapshotsResultOutput) ToGetSnapshotsResultOutput() GetSnapshotsResultOutput {
	return o
}

func (o GetSnapshotsResultOutput) ToGetSnapshotsResultOutputWithContext(ctx context.Context) GetSnapshotsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetSnapshotsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSnapshotsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSnapshotsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSnapshotsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSnapshotsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetSnapshotsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) Snapshots() GetSnapshotsSnapshotArrayOutput {
	return o.ApplyT(func(v GetSnapshotsResult) []GetSnapshotsSnapshot { return v.Snapshots }).(GetSnapshotsSnapshotArrayOutput)
}

func (o GetSnapshotsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSnapshotsResultOutput{})
}