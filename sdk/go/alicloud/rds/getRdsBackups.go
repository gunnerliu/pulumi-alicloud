// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Rds Backups of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.149.0+.
func GetRdsBackups(ctx *pulumi.Context, args *GetRdsBackupsArgs, opts ...pulumi.InvokeOption) (*GetRdsBackupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRdsBackupsResult
	err := ctx.Invoke("alicloud:rds/getRdsBackups:getRdsBackups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRdsBackups.
type GetRdsBackupsArgs struct {
	// BackupMode.
	BackupMode *string `pulumi:"backupMode"`
	// Backup task status. **NOTE:** This parameter will only be returned when a task is executed. Value:
	// * **NoStart**: Not started
	// * **Checking**: check the backup
	// * **Preparing**: Prepare a backup
	// * **Waiting**: Waiting for backup
	// * **Uploading**: Upload backup
	// * **Finished**: Complete backup
	// * **Failed**: backup Failed
	BackupStatus *string `pulumi:"backupStatus"`
	// The db instance id.
	DbInstanceId string `pulumi:"dbInstanceId"`
	// The end time.
	EndTime *string `pulumi:"endTime"`
	// A list of Backup IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The start time.
	StartTime *string `pulumi:"startTime"`
}

// A collection of values returned by getRdsBackups.
type GetRdsBackupsResult struct {
	BackupMode   *string               `pulumi:"backupMode"`
	BackupStatus *string               `pulumi:"backupStatus"`
	Backups      []GetRdsBackupsBackup `pulumi:"backups"`
	DbInstanceId string                `pulumi:"dbInstanceId"`
	EndTime      *string               `pulumi:"endTime"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	StartTime  *string  `pulumi:"startTime"`
}

func GetRdsBackupsOutput(ctx *pulumi.Context, args GetRdsBackupsOutputArgs, opts ...pulumi.InvokeOption) GetRdsBackupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetRdsBackupsResult, error) {
			args := v.(GetRdsBackupsArgs)
			r, err := GetRdsBackups(ctx, &args, opts...)
			var s GetRdsBackupsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetRdsBackupsResultOutput)
}

// A collection of arguments for invoking getRdsBackups.
type GetRdsBackupsOutputArgs struct {
	// BackupMode.
	BackupMode pulumi.StringPtrInput `pulumi:"backupMode"`
	// Backup task status. **NOTE:** This parameter will only be returned when a task is executed. Value:
	// * **NoStart**: Not started
	// * **Checking**: check the backup
	// * **Preparing**: Prepare a backup
	// * **Waiting**: Waiting for backup
	// * **Uploading**: Upload backup
	// * **Finished**: Complete backup
	// * **Failed**: backup Failed
	BackupStatus pulumi.StringPtrInput `pulumi:"backupStatus"`
	// The db instance id.
	DbInstanceId pulumi.StringInput `pulumi:"dbInstanceId"`
	// The end time.
	EndTime pulumi.StringPtrInput `pulumi:"endTime"`
	// A list of Backup IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The start time.
	StartTime pulumi.StringPtrInput `pulumi:"startTime"`
}

func (GetRdsBackupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRdsBackupsArgs)(nil)).Elem()
}

// A collection of values returned by getRdsBackups.
type GetRdsBackupsResultOutput struct{ *pulumi.OutputState }

func (GetRdsBackupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRdsBackupsResult)(nil)).Elem()
}

func (o GetRdsBackupsResultOutput) ToGetRdsBackupsResultOutput() GetRdsBackupsResultOutput {
	return o
}

func (o GetRdsBackupsResultOutput) ToGetRdsBackupsResultOutputWithContext(ctx context.Context) GetRdsBackupsResultOutput {
	return o
}

func (o GetRdsBackupsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetRdsBackupsResult] {
	return pulumix.Output[GetRdsBackupsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetRdsBackupsResultOutput) BackupMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRdsBackupsResult) *string { return v.BackupMode }).(pulumi.StringPtrOutput)
}

func (o GetRdsBackupsResultOutput) BackupStatus() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRdsBackupsResult) *string { return v.BackupStatus }).(pulumi.StringPtrOutput)
}

func (o GetRdsBackupsResultOutput) Backups() GetRdsBackupsBackupArrayOutput {
	return o.ApplyT(func(v GetRdsBackupsResult) []GetRdsBackupsBackup { return v.Backups }).(GetRdsBackupsBackupArrayOutput)
}

func (o GetRdsBackupsResultOutput) DbInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetRdsBackupsResult) string { return v.DbInstanceId }).(pulumi.StringOutput)
}

func (o GetRdsBackupsResultOutput) EndTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRdsBackupsResult) *string { return v.EndTime }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRdsBackupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRdsBackupsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetRdsBackupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRdsBackupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetRdsBackupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRdsBackupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetRdsBackupsResultOutput) StartTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRdsBackupsResult) *string { return v.StartTime }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRdsBackupsResultOutput{})
}
