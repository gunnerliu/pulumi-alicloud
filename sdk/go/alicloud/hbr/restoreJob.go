// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hbr

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Hybrid Backup Recovery (HBR) Restore Job resource.
//
// For information about Hybrid Backup Recovery (HBR) Restore Job and how to use it, see [What is Restore Job](https://www.alibabacloud.com/help/doc-detail/186575.htm).
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
// 		ecsSnapshots, err := hbr.GetSnapshots(ctx, &hbr.GetSnapshotsArgs{
// 			SourceType: "ECS_FILE",
// 			VaultId:    defaultEcsBackupPlans.Plans[0].VaultId,
// 			InstanceId: &opt3,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt4 := defaultOssBackupPlans.Plans[0].Bucket
// 		ossSnapshots, err := hbr.GetSnapshots(ctx, &hbr.GetSnapshotsArgs{
// 			SourceType: "OSS",
// 			VaultId:    defaultOssBackupPlans.Plans[0].VaultId,
// 			Bucket:     &opt4,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt5 := defaultNasBackupPlans.Plans[0].FileSystemId
// 		opt6 := defaultNasBackupPlans.Plans[0].CreateTime
// 		nasSnapshots, err := hbr.GetSnapshots(ctx, &hbr.GetSnapshotsArgs{
// 			SourceType:   "NAS",
// 			VaultId:      defaultNasBackupPlans.Plans[0].VaultId,
// 			FileSystemId: &opt5,
// 			CreateTime:   &opt6,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hbr.NewRestoreJob(ctx, "nasJob", &hbr.RestoreJobArgs{
// 			SnapshotHash:       pulumi.String(nasSnapshots.Snapshots[0].SnapshotHash),
// 			VaultId:            pulumi.String(defaultNasBackupPlans.Plans[0].VaultId),
// 			SourceType:         pulumi.String("NAS"),
// 			RestoreType:        pulumi.String("NAS"),
// 			SnapshotId:         pulumi.String(nasSnapshots.Snapshots[0].SnapshotId),
// 			TargetFileSystemId: pulumi.String(defaultNasBackupPlans.Plans[0].FileSystemId),
// 			TargetCreateTime:   pulumi.String(defaultNasBackupPlans.Plans[0].CreateTime),
// 			TargetPath:         pulumi.String("/"),
// 			Options:            pulumi.String("    {\"includes\":[], \"excludes\":[]}\n"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hbr.NewRestoreJob(ctx, "ossJob", &hbr.RestoreJobArgs{
// 			SnapshotHash: pulumi.String(ossSnapshots.Snapshots[0].SnapshotHash),
// 			VaultId:      pulumi.String(defaultOssBackupPlans.Plans[0].VaultId),
// 			SourceType:   pulumi.String("OSS"),
// 			RestoreType:  pulumi.String("OSS"),
// 			SnapshotId:   pulumi.String(ossSnapshots.Snapshots[0].SnapshotId),
// 			TargetBucket: pulumi.String(defaultOssBackupPlans.Plans[0].Bucket),
// 			TargetPrefix: pulumi.String(""),
// 			Options:      pulumi.String("    {\"includes\":[], \"excludes\":[]}\n"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hbr.NewRestoreJob(ctx, "ecsJob", &hbr.RestoreJobArgs{
// 			SnapshotHash:     pulumi.String(ecsSnapshots.Snapshots[0].SnapshotHash),
// 			VaultId:          pulumi.String(defaultEcsBackupPlans.Plans[0].VaultId),
// 			SourceType:       pulumi.String("ECS_FILE"),
// 			RestoreType:      pulumi.String("ECS_FILE"),
// 			SnapshotId:       pulumi.String(ecsSnapshots.Snapshots[0].SnapshotId),
// 			TargetInstanceId: pulumi.String(defaultEcsBackupPlans.Plans[0].InstanceId),
// 			TargetPath:       pulumi.String("/"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// > **NOTE:** This resource can only be created, cannot be modified or deleted. Therefore, any modification of the resource attribute will not affect exist resource.
//
// ## Import
//
// Hybrid Backup Recovery (HBR) Restore Job can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:hbr/restoreJob:RestoreJob example <restore_job_id>:<restore_type>
// ```
type RestoreJob struct {
	pulumi.CustomResourceState

	// The exclude path. It's a json string with format:`["/excludePath]`, up to 255 characters. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	Exclude pulumi.StringPtrOutput `pulumi:"exclude"`
	// The include path. It's a json string with format:`["/includePath"]`, Up to 255 characters. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	Include pulumi.StringPtrOutput `pulumi:"include"`
	// Recovery options. It's a json string with format:`"{"includes":[],"excludes":[]}",`.
	Options pulumi.StringPtrOutput `pulumi:"options"`
	// Restore Job ID. It's the unique key of this resource, if you want to set this argument by yourself, you must specify a unique keyword that never appears.
	RestoreJobId pulumi.StringOutput `pulumi:"restoreJobId"`
	// The type of recovery destination. Valid values: `ECS_FILE`, `NAS`, `OSS`. **Note**: Currently, there is a one-to-one correspondence between the data source type with the recovery destination type.
	RestoreType pulumi.StringOutput `pulumi:"restoreType"`
	// The hashcode of Snapshot.
	SnapshotHash pulumi.StringOutput `pulumi:"snapshotHash"`
	// The ID of Snapshot.
	SnapshotId pulumi.StringOutput `pulumi:"snapshotId"`
	// The type of data source. Valid values: `ECS_FILE`, `NAS`, `OSS`.
	SourceType pulumi.StringOutput `pulumi:"sourceType"`
	// The Restore Job Status.
	Status pulumi.StringOutput `pulumi:"status"`
	// The target name of OSS bucket.
	TargetBucket             pulumi.StringPtrOutput `pulumi:"targetBucket"`
	TargetClientId           pulumi.StringPtrOutput `pulumi:"targetClientId"`
	TargetContainer          pulumi.StringPtrOutput `pulumi:"targetContainer"`
	TargetContainerClusterId pulumi.StringPtrOutput `pulumi:"targetContainerClusterId"`
	// The creation time of destination File System. While sourceType equals `NAS`, this parameter must be set. **Note** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
	TargetCreateTime   pulumi.StringPtrOutput `pulumi:"targetCreateTime"`
	TargetDataSourceId pulumi.StringPtrOutput `pulumi:"targetDataSourceId"`
	// The ID of destination File System.
	TargetFileSystemId pulumi.StringPtrOutput `pulumi:"targetFileSystemId"`
	// The target ID of ECS instance.
	TargetInstanceId pulumi.StringPtrOutput `pulumi:"targetInstanceId"`
	// The target file path of (ECS) instance. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	TargetPath pulumi.StringPtrOutput `pulumi:"targetPath"`
	// The target prefix of the OSS object. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	TargetPrefix pulumi.StringPtrOutput `pulumi:"targetPrefix"`
	// The ID of backup vault.
	VaultId pulumi.StringOutput `pulumi:"vaultId"`
}

// NewRestoreJob registers a new resource with the given unique name, arguments, and options.
func NewRestoreJob(ctx *pulumi.Context,
	name string, args *RestoreJobArgs, opts ...pulumi.ResourceOption) (*RestoreJob, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RestoreType == nil {
		return nil, errors.New("invalid value for required argument 'RestoreType'")
	}
	if args.SnapshotHash == nil {
		return nil, errors.New("invalid value for required argument 'SnapshotHash'")
	}
	if args.SnapshotId == nil {
		return nil, errors.New("invalid value for required argument 'SnapshotId'")
	}
	if args.SourceType == nil {
		return nil, errors.New("invalid value for required argument 'SourceType'")
	}
	if args.VaultId == nil {
		return nil, errors.New("invalid value for required argument 'VaultId'")
	}
	var resource RestoreJob
	err := ctx.RegisterResource("alicloud:hbr/restoreJob:RestoreJob", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRestoreJob gets an existing RestoreJob resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRestoreJob(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RestoreJobState, opts ...pulumi.ResourceOption) (*RestoreJob, error) {
	var resource RestoreJob
	err := ctx.ReadResource("alicloud:hbr/restoreJob:RestoreJob", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RestoreJob resources.
type restoreJobState struct {
	// The exclude path. It's a json string with format:`["/excludePath]`, up to 255 characters. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	Exclude *string `pulumi:"exclude"`
	// The include path. It's a json string with format:`["/includePath"]`, Up to 255 characters. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	Include *string `pulumi:"include"`
	// Recovery options. It's a json string with format:`"{"includes":[],"excludes":[]}",`.
	Options *string `pulumi:"options"`
	// Restore Job ID. It's the unique key of this resource, if you want to set this argument by yourself, you must specify a unique keyword that never appears.
	RestoreJobId *string `pulumi:"restoreJobId"`
	// The type of recovery destination. Valid values: `ECS_FILE`, `NAS`, `OSS`. **Note**: Currently, there is a one-to-one correspondence between the data source type with the recovery destination type.
	RestoreType *string `pulumi:"restoreType"`
	// The hashcode of Snapshot.
	SnapshotHash *string `pulumi:"snapshotHash"`
	// The ID of Snapshot.
	SnapshotId *string `pulumi:"snapshotId"`
	// The type of data source. Valid values: `ECS_FILE`, `NAS`, `OSS`.
	SourceType *string `pulumi:"sourceType"`
	// The Restore Job Status.
	Status *string `pulumi:"status"`
	// The target name of OSS bucket.
	TargetBucket             *string `pulumi:"targetBucket"`
	TargetClientId           *string `pulumi:"targetClientId"`
	TargetContainer          *string `pulumi:"targetContainer"`
	TargetContainerClusterId *string `pulumi:"targetContainerClusterId"`
	// The creation time of destination File System. While sourceType equals `NAS`, this parameter must be set. **Note** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
	TargetCreateTime   *string `pulumi:"targetCreateTime"`
	TargetDataSourceId *string `pulumi:"targetDataSourceId"`
	// The ID of destination File System.
	TargetFileSystemId *string `pulumi:"targetFileSystemId"`
	// The target ID of ECS instance.
	TargetInstanceId *string `pulumi:"targetInstanceId"`
	// The target file path of (ECS) instance. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	TargetPath *string `pulumi:"targetPath"`
	// The target prefix of the OSS object. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	TargetPrefix *string `pulumi:"targetPrefix"`
	// The ID of backup vault.
	VaultId *string `pulumi:"vaultId"`
}

type RestoreJobState struct {
	// The exclude path. It's a json string with format:`["/excludePath]`, up to 255 characters. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	Exclude pulumi.StringPtrInput
	// The include path. It's a json string with format:`["/includePath"]`, Up to 255 characters. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	Include pulumi.StringPtrInput
	// Recovery options. It's a json string with format:`"{"includes":[],"excludes":[]}",`.
	Options pulumi.StringPtrInput
	// Restore Job ID. It's the unique key of this resource, if you want to set this argument by yourself, you must specify a unique keyword that never appears.
	RestoreJobId pulumi.StringPtrInput
	// The type of recovery destination. Valid values: `ECS_FILE`, `NAS`, `OSS`. **Note**: Currently, there is a one-to-one correspondence between the data source type with the recovery destination type.
	RestoreType pulumi.StringPtrInput
	// The hashcode of Snapshot.
	SnapshotHash pulumi.StringPtrInput
	// The ID of Snapshot.
	SnapshotId pulumi.StringPtrInput
	// The type of data source. Valid values: `ECS_FILE`, `NAS`, `OSS`.
	SourceType pulumi.StringPtrInput
	// The Restore Job Status.
	Status pulumi.StringPtrInput
	// The target name of OSS bucket.
	TargetBucket             pulumi.StringPtrInput
	TargetClientId           pulumi.StringPtrInput
	TargetContainer          pulumi.StringPtrInput
	TargetContainerClusterId pulumi.StringPtrInput
	// The creation time of destination File System. While sourceType equals `NAS`, this parameter must be set. **Note** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
	TargetCreateTime   pulumi.StringPtrInput
	TargetDataSourceId pulumi.StringPtrInput
	// The ID of destination File System.
	TargetFileSystemId pulumi.StringPtrInput
	// The target ID of ECS instance.
	TargetInstanceId pulumi.StringPtrInput
	// The target file path of (ECS) instance. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	TargetPath pulumi.StringPtrInput
	// The target prefix of the OSS object. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	TargetPrefix pulumi.StringPtrInput
	// The ID of backup vault.
	VaultId pulumi.StringPtrInput
}

func (RestoreJobState) ElementType() reflect.Type {
	return reflect.TypeOf((*restoreJobState)(nil)).Elem()
}

type restoreJobArgs struct {
	// The exclude path. It's a json string with format:`["/excludePath]`, up to 255 characters. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	Exclude *string `pulumi:"exclude"`
	// The include path. It's a json string with format:`["/includePath"]`, Up to 255 characters. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	Include *string `pulumi:"include"`
	// Recovery options. It's a json string with format:`"{"includes":[],"excludes":[]}",`.
	Options *string `pulumi:"options"`
	// Restore Job ID. It's the unique key of this resource, if you want to set this argument by yourself, you must specify a unique keyword that never appears.
	RestoreJobId *string `pulumi:"restoreJobId"`
	// The type of recovery destination. Valid values: `ECS_FILE`, `NAS`, `OSS`. **Note**: Currently, there is a one-to-one correspondence between the data source type with the recovery destination type.
	RestoreType string `pulumi:"restoreType"`
	// The hashcode of Snapshot.
	SnapshotHash string `pulumi:"snapshotHash"`
	// The ID of Snapshot.
	SnapshotId string `pulumi:"snapshotId"`
	// The type of data source. Valid values: `ECS_FILE`, `NAS`, `OSS`.
	SourceType string `pulumi:"sourceType"`
	// The target name of OSS bucket.
	TargetBucket             *string `pulumi:"targetBucket"`
	TargetClientId           *string `pulumi:"targetClientId"`
	TargetContainer          *string `pulumi:"targetContainer"`
	TargetContainerClusterId *string `pulumi:"targetContainerClusterId"`
	// The creation time of destination File System. While sourceType equals `NAS`, this parameter must be set. **Note** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
	TargetCreateTime   *string `pulumi:"targetCreateTime"`
	TargetDataSourceId *string `pulumi:"targetDataSourceId"`
	// The ID of destination File System.
	TargetFileSystemId *string `pulumi:"targetFileSystemId"`
	// The target ID of ECS instance.
	TargetInstanceId *string `pulumi:"targetInstanceId"`
	// The target file path of (ECS) instance. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	TargetPath *string `pulumi:"targetPath"`
	// The target prefix of the OSS object. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	TargetPrefix *string `pulumi:"targetPrefix"`
	// The ID of backup vault.
	VaultId string `pulumi:"vaultId"`
}

// The set of arguments for constructing a RestoreJob resource.
type RestoreJobArgs struct {
	// The exclude path. It's a json string with format:`["/excludePath]`, up to 255 characters. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	Exclude pulumi.StringPtrInput
	// The include path. It's a json string with format:`["/includePath"]`, Up to 255 characters. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	Include pulumi.StringPtrInput
	// Recovery options. It's a json string with format:`"{"includes":[],"excludes":[]}",`.
	Options pulumi.StringPtrInput
	// Restore Job ID. It's the unique key of this resource, if you want to set this argument by yourself, you must specify a unique keyword that never appears.
	RestoreJobId pulumi.StringPtrInput
	// The type of recovery destination. Valid values: `ECS_FILE`, `NAS`, `OSS`. **Note**: Currently, there is a one-to-one correspondence between the data source type with the recovery destination type.
	RestoreType pulumi.StringInput
	// The hashcode of Snapshot.
	SnapshotHash pulumi.StringInput
	// The ID of Snapshot.
	SnapshotId pulumi.StringInput
	// The type of data source. Valid values: `ECS_FILE`, `NAS`, `OSS`.
	SourceType pulumi.StringInput
	// The target name of OSS bucket.
	TargetBucket             pulumi.StringPtrInput
	TargetClientId           pulumi.StringPtrInput
	TargetContainer          pulumi.StringPtrInput
	TargetContainerClusterId pulumi.StringPtrInput
	// The creation time of destination File System. While sourceType equals `NAS`, this parameter must be set. **Note** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
	TargetCreateTime   pulumi.StringPtrInput
	TargetDataSourceId pulumi.StringPtrInput
	// The ID of destination File System.
	TargetFileSystemId pulumi.StringPtrInput
	// The target ID of ECS instance.
	TargetInstanceId pulumi.StringPtrInput
	// The target file path of (ECS) instance. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	TargetPath pulumi.StringPtrInput
	// The target prefix of the OSS object. **WARNING:** If this value filled in incorrectly, the task may not start correctly, so please check the parameters before executing the plan.
	TargetPrefix pulumi.StringPtrInput
	// The ID of backup vault.
	VaultId pulumi.StringInput
}

func (RestoreJobArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*restoreJobArgs)(nil)).Elem()
}

type RestoreJobInput interface {
	pulumi.Input

	ToRestoreJobOutput() RestoreJobOutput
	ToRestoreJobOutputWithContext(ctx context.Context) RestoreJobOutput
}

func (*RestoreJob) ElementType() reflect.Type {
	return reflect.TypeOf((*RestoreJob)(nil))
}

func (i *RestoreJob) ToRestoreJobOutput() RestoreJobOutput {
	return i.ToRestoreJobOutputWithContext(context.Background())
}

func (i *RestoreJob) ToRestoreJobOutputWithContext(ctx context.Context) RestoreJobOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RestoreJobOutput)
}

func (i *RestoreJob) ToRestoreJobPtrOutput() RestoreJobPtrOutput {
	return i.ToRestoreJobPtrOutputWithContext(context.Background())
}

func (i *RestoreJob) ToRestoreJobPtrOutputWithContext(ctx context.Context) RestoreJobPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RestoreJobPtrOutput)
}

type RestoreJobPtrInput interface {
	pulumi.Input

	ToRestoreJobPtrOutput() RestoreJobPtrOutput
	ToRestoreJobPtrOutputWithContext(ctx context.Context) RestoreJobPtrOutput
}

type restoreJobPtrType RestoreJobArgs

func (*restoreJobPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**RestoreJob)(nil))
}

func (i *restoreJobPtrType) ToRestoreJobPtrOutput() RestoreJobPtrOutput {
	return i.ToRestoreJobPtrOutputWithContext(context.Background())
}

func (i *restoreJobPtrType) ToRestoreJobPtrOutputWithContext(ctx context.Context) RestoreJobPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RestoreJobPtrOutput)
}

// RestoreJobArrayInput is an input type that accepts RestoreJobArray and RestoreJobArrayOutput values.
// You can construct a concrete instance of `RestoreJobArrayInput` via:
//
//          RestoreJobArray{ RestoreJobArgs{...} }
type RestoreJobArrayInput interface {
	pulumi.Input

	ToRestoreJobArrayOutput() RestoreJobArrayOutput
	ToRestoreJobArrayOutputWithContext(context.Context) RestoreJobArrayOutput
}

type RestoreJobArray []RestoreJobInput

func (RestoreJobArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RestoreJob)(nil)).Elem()
}

func (i RestoreJobArray) ToRestoreJobArrayOutput() RestoreJobArrayOutput {
	return i.ToRestoreJobArrayOutputWithContext(context.Background())
}

func (i RestoreJobArray) ToRestoreJobArrayOutputWithContext(ctx context.Context) RestoreJobArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RestoreJobArrayOutput)
}

// RestoreJobMapInput is an input type that accepts RestoreJobMap and RestoreJobMapOutput values.
// You can construct a concrete instance of `RestoreJobMapInput` via:
//
//          RestoreJobMap{ "key": RestoreJobArgs{...} }
type RestoreJobMapInput interface {
	pulumi.Input

	ToRestoreJobMapOutput() RestoreJobMapOutput
	ToRestoreJobMapOutputWithContext(context.Context) RestoreJobMapOutput
}

type RestoreJobMap map[string]RestoreJobInput

func (RestoreJobMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RestoreJob)(nil)).Elem()
}

func (i RestoreJobMap) ToRestoreJobMapOutput() RestoreJobMapOutput {
	return i.ToRestoreJobMapOutputWithContext(context.Background())
}

func (i RestoreJobMap) ToRestoreJobMapOutputWithContext(ctx context.Context) RestoreJobMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RestoreJobMapOutput)
}

type RestoreJobOutput struct{ *pulumi.OutputState }

func (RestoreJobOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*RestoreJob)(nil))
}

func (o RestoreJobOutput) ToRestoreJobOutput() RestoreJobOutput {
	return o
}

func (o RestoreJobOutput) ToRestoreJobOutputWithContext(ctx context.Context) RestoreJobOutput {
	return o
}

func (o RestoreJobOutput) ToRestoreJobPtrOutput() RestoreJobPtrOutput {
	return o.ToRestoreJobPtrOutputWithContext(context.Background())
}

func (o RestoreJobOutput) ToRestoreJobPtrOutputWithContext(ctx context.Context) RestoreJobPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v RestoreJob) *RestoreJob {
		return &v
	}).(RestoreJobPtrOutput)
}

type RestoreJobPtrOutput struct{ *pulumi.OutputState }

func (RestoreJobPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RestoreJob)(nil))
}

func (o RestoreJobPtrOutput) ToRestoreJobPtrOutput() RestoreJobPtrOutput {
	return o
}

func (o RestoreJobPtrOutput) ToRestoreJobPtrOutputWithContext(ctx context.Context) RestoreJobPtrOutput {
	return o
}

func (o RestoreJobPtrOutput) Elem() RestoreJobOutput {
	return o.ApplyT(func(v *RestoreJob) RestoreJob {
		if v != nil {
			return *v
		}
		var ret RestoreJob
		return ret
	}).(RestoreJobOutput)
}

type RestoreJobArrayOutput struct{ *pulumi.OutputState }

func (RestoreJobArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]RestoreJob)(nil))
}

func (o RestoreJobArrayOutput) ToRestoreJobArrayOutput() RestoreJobArrayOutput {
	return o
}

func (o RestoreJobArrayOutput) ToRestoreJobArrayOutputWithContext(ctx context.Context) RestoreJobArrayOutput {
	return o
}

func (o RestoreJobArrayOutput) Index(i pulumi.IntInput) RestoreJobOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) RestoreJob {
		return vs[0].([]RestoreJob)[vs[1].(int)]
	}).(RestoreJobOutput)
}

type RestoreJobMapOutput struct{ *pulumi.OutputState }

func (RestoreJobMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]RestoreJob)(nil))
}

func (o RestoreJobMapOutput) ToRestoreJobMapOutput() RestoreJobMapOutput {
	return o
}

func (o RestoreJobMapOutput) ToRestoreJobMapOutputWithContext(ctx context.Context) RestoreJobMapOutput {
	return o
}

func (o RestoreJobMapOutput) MapIndex(k pulumi.StringInput) RestoreJobOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) RestoreJob {
		return vs[0].(map[string]RestoreJob)[vs[1].(string)]
	}).(RestoreJobOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RestoreJobInput)(nil)).Elem(), &RestoreJob{})
	pulumi.RegisterInputType(reflect.TypeOf((*RestoreJobPtrInput)(nil)).Elem(), &RestoreJob{})
	pulumi.RegisterInputType(reflect.TypeOf((*RestoreJobArrayInput)(nil)).Elem(), RestoreJobArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RestoreJobMapInput)(nil)).Elem(), RestoreJobMap{})
	pulumi.RegisterOutputType(RestoreJobOutput{})
	pulumi.RegisterOutputType(RestoreJobPtrOutput{})
	pulumi.RegisterOutputType(RestoreJobArrayOutput{})
	pulumi.RegisterOutputType(RestoreJobMapOutput{})
}