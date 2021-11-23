// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hbr

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Hbr Snapshots of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.133.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/hbr"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "plan-tf-used-dont-delete"
// 		defaultEcsBackupPlans, err := hbr.GetEcsBackupPlans(ctx, &hbr.GetEcsBackupPlansArgs{
// 			NameRegex: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt1 := "plan-tf-used-dont-delete"
// 		defaultOssBackupPlans, err := hbr.GetOssBackupPlans(ctx, &hbr.GetOssBackupPlansArgs{
// 			NameRegex: &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt2 := "plan-tf-used-dont-delete"
// 		defaultNasBackupPlans, err := hbr.GetNasBackupPlans(ctx, &hbr.GetNasBackupPlansArgs{
// 			NameRegex: &opt2,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt3 := defaultEcsBackupPlans.Plans[0].InstanceId
// 		_, err = hbr.GetSnapshots(ctx, &hbr.GetSnapshotsArgs{
// 			SourceType: "ECS_FILE",
// 			VaultId:    defaultEcsBackupPlans.Plans[0].VaultId,
// 			InstanceId: &opt3,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt4 := defaultOssBackupPlans.Plans[0].Bucket
// 		opt5 := "2021-07-20T14:17:15CST,2021-07-24T14:17:15CST"
// 		opt6 := "BETWEEN"
// 		_, err = hbr.GetSnapshots(ctx, &hbr.GetSnapshotsArgs{
// 			SourceType:          "OSS",
// 			VaultId:             defaultOssBackupPlans.Plans[0].VaultId,
// 			Bucket:              &opt4,
// 			CompleteTime:        &opt5,
// 			CompleteTimeChecker: &opt6,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt7 := defaultNasBackupPlans.Plans[0].FileSystemId
// 		opt8 := defaultNasBackupPlans.Plans[0].CreateTime
// 		opt9 := "2021-08-23T14:17:15CST"
// 		opt10 := "GREATER_THAN_OR_EQUAL"
// 		nasSnapshots, err := hbr.GetSnapshots(ctx, &hbr.GetSnapshotsArgs{
// 			SourceType:          "NAS",
// 			VaultId:             defaultNasBackupPlans.Plans[0].VaultId,
// 			FileSystemId:        &opt7,
// 			CreateTime:          &opt8,
// 			CompleteTime:        &opt9,
// 			CompleteTimeChecker: &opt10,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("hbrSnapshotId1", nasSnapshots.Snapshots[0].Id)
// 		return nil
// 	})
// }
// ```
func GetSnapshots(ctx *pulumi.Context, args *GetSnapshotsArgs, opts ...pulumi.InvokeOption) (*GetSnapshotsResult, error) {
	var rv GetSnapshotsResult
	err := ctx.Invoke("alicloud:hbr/getSnapshots:getSnapshots", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSnapshots.
type GetSnapshotsArgs struct {
	// The name of OSS bucket.
	Bucket *string `pulumi:"bucket"`
	// The time when the snapshot completed. UNIX time in seconds.
	CompleteTime *string `pulumi:"completeTime"`
	// Complete time filter operator. Optional values: `MATCH_TERM`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `BETWEEN`.
	CompleteTimeChecker *string `pulumi:"completeTimeChecker"`
	// File System Creation Time of Nas. Unix Time Seconds.
	CreateTime *string `pulumi:"createTime"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// The ID of NAS File system.
	FileSystemId *string `pulumi:"fileSystemId"`
	// A list of Snapshot IDs.
	Ids []string `pulumi:"ids"`
	// The ID of ECS instance.
	InstanceId *string `pulumi:"instanceId"`
	Limit      *int    `pulumi:"limit"`
	OutputFile *string `pulumi:"outputFile"`
	Query      *string `pulumi:"query"`
	// Data source type, optional values: `ECS_FILE`, `OSS`, `NAS`.
	SourceType string `pulumi:"sourceType"`
	// The status of snapshot execution. Possible values: `COMPLETE`, `PARTIAL_COMPLETE`, `FAILED`.
	Status *string `pulumi:"status"`
	// The ID of Vault.
	VaultId string `pulumi:"vaultId"`
}

// A collection of values returned by getSnapshots.
type GetSnapshotsResult struct {
	Bucket              *string `pulumi:"bucket"`
	CompleteTime        *string `pulumi:"completeTime"`
	CompleteTimeChecker *string `pulumi:"completeTimeChecker"`
	CreateTime          *string `pulumi:"createTime"`
	EnableDetails       *bool   `pulumi:"enableDetails"`
	FileSystemId        *string `pulumi:"fileSystemId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                 `pulumi:"id"`
	Ids        []string               `pulumi:"ids"`
	InstanceId *string                `pulumi:"instanceId"`
	Limit      *int                   `pulumi:"limit"`
	OutputFile *string                `pulumi:"outputFile"`
	Query      *string                `pulumi:"query"`
	Snapshots  []GetSnapshotsSnapshot `pulumi:"snapshots"`
	SourceType string                 `pulumi:"sourceType"`
	Status     *string                `pulumi:"status"`
	VaultId    string                 `pulumi:"vaultId"`
}

func GetSnapshotsOutput(ctx *pulumi.Context, args GetSnapshotsOutputArgs, opts ...pulumi.InvokeOption) GetSnapshotsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSnapshotsResult, error) {
			args := v.(GetSnapshotsArgs)
			r, err := GetSnapshots(ctx, &args, opts...)
			return *r, err
		}).(GetSnapshotsResultOutput)
}

// A collection of arguments for invoking getSnapshots.
type GetSnapshotsOutputArgs struct {
	// The name of OSS bucket.
	Bucket pulumi.StringPtrInput `pulumi:"bucket"`
	// The time when the snapshot completed. UNIX time in seconds.
	CompleteTime pulumi.StringPtrInput `pulumi:"completeTime"`
	// Complete time filter operator. Optional values: `MATCH_TERM`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `BETWEEN`.
	CompleteTimeChecker pulumi.StringPtrInput `pulumi:"completeTimeChecker"`
	// File System Creation Time of Nas. Unix Time Seconds.
	CreateTime pulumi.StringPtrInput `pulumi:"createTime"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// The ID of NAS File system.
	FileSystemId pulumi.StringPtrInput `pulumi:"fileSystemId"`
	// A list of Snapshot IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The ID of ECS instance.
	InstanceId pulumi.StringPtrInput `pulumi:"instanceId"`
	Limit      pulumi.IntPtrInput    `pulumi:"limit"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	Query      pulumi.StringPtrInput `pulumi:"query"`
	// Data source type, optional values: `ECS_FILE`, `OSS`, `NAS`.
	SourceType pulumi.StringInput `pulumi:"sourceType"`
	// The status of snapshot execution. Possible values: `COMPLETE`, `PARTIAL_COMPLETE`, `FAILED`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The ID of Vault.
	VaultId pulumi.StringInput `pulumi:"vaultId"`
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

func (o GetSnapshotsResultOutput) Bucket() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.Bucket }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) CompleteTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.CompleteTime }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) CompleteTimeChecker() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.CompleteTimeChecker }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) CreateTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.CreateTime }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

func (o GetSnapshotsResultOutput) FileSystemId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.FileSystemId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSnapshotsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSnapshotsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSnapshotsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSnapshotsResultOutput) InstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.InstanceId }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) Limit() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *int { return v.Limit }).(pulumi.IntPtrOutput)
}

func (o GetSnapshotsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) Query() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.Query }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) Snapshots() GetSnapshotsSnapshotArrayOutput {
	return o.ApplyT(func(v GetSnapshotsResult) []GetSnapshotsSnapshot { return v.Snapshots }).(GetSnapshotsSnapshotArrayOutput)
}

func (o GetSnapshotsResultOutput) SourceType() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsResult) string { return v.SourceType }).(pulumi.StringOutput)
}

func (o GetSnapshotsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSnapshotsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetSnapshotsResultOutput) VaultId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSnapshotsResult) string { return v.VaultId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSnapshotsResultOutput{})
}