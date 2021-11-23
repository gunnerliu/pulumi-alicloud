// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hbr

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Hbr Restore Jobs of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.133.0+.
func GetRestoreJobs(ctx *pulumi.Context, args *GetRestoreJobsArgs, opts ...pulumi.InvokeOption) (*GetRestoreJobsResult, error) {
	var rv GetRestoreJobsResult
	err := ctx.Invoke("alicloud:hbr/getRestoreJobs:getRestoreJobs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRestoreJobs.
type GetRestoreJobsArgs struct {
	OutputFile *string `pulumi:"outputFile"`
	// The ID of restore job.
	RestoreIds []string `pulumi:"restoreIds"`
	// The type of recovery destination. Valid Values: `ECS_FILE`, `OSS`, `NAS`.
	RestoreType string `pulumi:"restoreType"`
	// The type of data source. Valid values: `ECS_FILE`, `NAS`, `OSS`.
	SourceTypes []string `pulumi:"sourceTypes"`
	// The status of restore job.
	Status *string `pulumi:"status"`
	// The name of target ofo OSS bucket.
	TargetBuckets []string `pulumi:"targetBuckets"`
	// The ID of destination file system.
	TargetFileSystemIds []string `pulumi:"targetFileSystemIds"`
	// The ID of target ECS instance.
	TargetInstanceIds []string `pulumi:"targetInstanceIds"`
	// The ID of backup vault.
	VaultIds []string `pulumi:"vaultIds"`
}

// A collection of values returned by getRestoreJobs.
type GetRestoreJobsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id                  string              `pulumi:"id"`
	Ids                 []string            `pulumi:"ids"`
	Jobs                []GetRestoreJobsJob `pulumi:"jobs"`
	OutputFile          *string             `pulumi:"outputFile"`
	RestoreIds          []string            `pulumi:"restoreIds"`
	RestoreType         string              `pulumi:"restoreType"`
	SourceTypes         []string            `pulumi:"sourceTypes"`
	Status              *string             `pulumi:"status"`
	TargetBuckets       []string            `pulumi:"targetBuckets"`
	TargetFileSystemIds []string            `pulumi:"targetFileSystemIds"`
	TargetInstanceIds   []string            `pulumi:"targetInstanceIds"`
	VaultIds            []string            `pulumi:"vaultIds"`
}

func GetRestoreJobsOutput(ctx *pulumi.Context, args GetRestoreJobsOutputArgs, opts ...pulumi.InvokeOption) GetRestoreJobsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetRestoreJobsResult, error) {
			args := v.(GetRestoreJobsArgs)
			r, err := GetRestoreJobs(ctx, &args, opts...)
			return *r, err
		}).(GetRestoreJobsResultOutput)
}

// A collection of arguments for invoking getRestoreJobs.
type GetRestoreJobsOutputArgs struct {
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of restore job.
	RestoreIds pulumi.StringArrayInput `pulumi:"restoreIds"`
	// The type of recovery destination. Valid Values: `ECS_FILE`, `OSS`, `NAS`.
	RestoreType pulumi.StringInput `pulumi:"restoreType"`
	// The type of data source. Valid values: `ECS_FILE`, `NAS`, `OSS`.
	SourceTypes pulumi.StringArrayInput `pulumi:"sourceTypes"`
	// The status of restore job.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The name of target ofo OSS bucket.
	TargetBuckets pulumi.StringArrayInput `pulumi:"targetBuckets"`
	// The ID of destination file system.
	TargetFileSystemIds pulumi.StringArrayInput `pulumi:"targetFileSystemIds"`
	// The ID of target ECS instance.
	TargetInstanceIds pulumi.StringArrayInput `pulumi:"targetInstanceIds"`
	// The ID of backup vault.
	VaultIds pulumi.StringArrayInput `pulumi:"vaultIds"`
}

func (GetRestoreJobsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRestoreJobsArgs)(nil)).Elem()
}

// A collection of values returned by getRestoreJobs.
type GetRestoreJobsResultOutput struct{ *pulumi.OutputState }

func (GetRestoreJobsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRestoreJobsResult)(nil)).Elem()
}

func (o GetRestoreJobsResultOutput) ToGetRestoreJobsResultOutput() GetRestoreJobsResultOutput {
	return o
}

func (o GetRestoreJobsResultOutput) ToGetRestoreJobsResultOutputWithContext(ctx context.Context) GetRestoreJobsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetRestoreJobsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRestoreJobsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetRestoreJobsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRestoreJobsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetRestoreJobsResultOutput) Jobs() GetRestoreJobsJobArrayOutput {
	return o.ApplyT(func(v GetRestoreJobsResult) []GetRestoreJobsJob { return v.Jobs }).(GetRestoreJobsJobArrayOutput)
}

func (o GetRestoreJobsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRestoreJobsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetRestoreJobsResultOutput) RestoreIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRestoreJobsResult) []string { return v.RestoreIds }).(pulumi.StringArrayOutput)
}

func (o GetRestoreJobsResultOutput) RestoreType() pulumi.StringOutput {
	return o.ApplyT(func(v GetRestoreJobsResult) string { return v.RestoreType }).(pulumi.StringOutput)
}

func (o GetRestoreJobsResultOutput) SourceTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRestoreJobsResult) []string { return v.SourceTypes }).(pulumi.StringArrayOutput)
}

func (o GetRestoreJobsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRestoreJobsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetRestoreJobsResultOutput) TargetBuckets() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRestoreJobsResult) []string { return v.TargetBuckets }).(pulumi.StringArrayOutput)
}

func (o GetRestoreJobsResultOutput) TargetFileSystemIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRestoreJobsResult) []string { return v.TargetFileSystemIds }).(pulumi.StringArrayOutput)
}

func (o GetRestoreJobsResultOutput) TargetInstanceIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRestoreJobsResult) []string { return v.TargetInstanceIds }).(pulumi.StringArrayOutput)
}

func (o GetRestoreJobsResultOutput) VaultIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRestoreJobsResult) []string { return v.VaultIds }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRestoreJobsResultOutput{})
}