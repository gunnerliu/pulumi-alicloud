// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hbr

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a HBR Oss Backup Plan resource.
//
// For information about HBR Oss Backup Plan and how to use it, see [What is Oss Backup Plan](https://www.alibabacloud.com/help/doc-detail/130040.htm).
//
// > **NOTE:** Available in v1.131.0+.
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
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/oss"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		name := "tf-test112358"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		defaultVault, err := hbr.NewVault(ctx, "defaultVault", &hbr.VaultArgs{
// 			VaultName: pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultBucket, err := oss.NewBucket(ctx, "defaultBucket", &oss.BucketArgs{
// 			Bucket: pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hbr.NewOssBackupPlan(ctx, "defaultOssBackupPlan", &hbr.OssBackupPlanArgs{
// 			OssBackupPlanName: pulumi.String(name),
// 			Prefix:            pulumi.String("/"),
// 			Bucket:            defaultBucket.Bucket,
// 			VaultId:           defaultVault.ID(),
// 			Schedule:          pulumi.String("I|1602673264|PT2H"),
// 			BackupType:        pulumi.String("COMPLETE"),
// 			Retention:         pulumi.String("2"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// HBR Oss Backup Plan can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:hbr/ossBackupPlan:OssBackupPlan example <id>
// ```
type OssBackupPlan struct {
	pulumi.CustomResourceState

	// Backup type. Valid values: `COMPLETE`.
	BackupType pulumi.StringOutput `pulumi:"backupType"`
	// The name of OSS bucket.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// Whether to disable the backup task. Valid values: `true`, `false`.
	Disabled pulumi.BoolOutput `pulumi:"disabled"`
	// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
	OssBackupPlanName pulumi.StringOutput `pulumi:"ossBackupPlanName"`
	// Backup prefix. Once specified, only objects with matching prefixes will be backed up.
	Prefix pulumi.StringPtrOutput `pulumi:"prefix"`
	// Backup retention days, the minimum is 1.
	Retention pulumi.StringOutput `pulumi:"retention"`
	// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
	Schedule pulumi.StringOutput `pulumi:"schedule"`
	// The ID of backup vault.
	VaultId pulumi.StringOutput `pulumi:"vaultId"`
}

// NewOssBackupPlan registers a new resource with the given unique name, arguments, and options.
func NewOssBackupPlan(ctx *pulumi.Context,
	name string, args *OssBackupPlanArgs, opts ...pulumi.ResourceOption) (*OssBackupPlan, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BackupType == nil {
		return nil, errors.New("invalid value for required argument 'BackupType'")
	}
	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	if args.OssBackupPlanName == nil {
		return nil, errors.New("invalid value for required argument 'OssBackupPlanName'")
	}
	if args.Retention == nil {
		return nil, errors.New("invalid value for required argument 'Retention'")
	}
	if args.Schedule == nil {
		return nil, errors.New("invalid value for required argument 'Schedule'")
	}
	if args.VaultId == nil {
		return nil, errors.New("invalid value for required argument 'VaultId'")
	}
	var resource OssBackupPlan
	err := ctx.RegisterResource("alicloud:hbr/ossBackupPlan:OssBackupPlan", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOssBackupPlan gets an existing OssBackupPlan resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOssBackupPlan(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OssBackupPlanState, opts ...pulumi.ResourceOption) (*OssBackupPlan, error) {
	var resource OssBackupPlan
	err := ctx.ReadResource("alicloud:hbr/ossBackupPlan:OssBackupPlan", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OssBackupPlan resources.
type ossBackupPlanState struct {
	// Backup type. Valid values: `COMPLETE`.
	BackupType *string `pulumi:"backupType"`
	// The name of OSS bucket.
	Bucket *string `pulumi:"bucket"`
	// Whether to disable the backup task. Valid values: `true`, `false`.
	Disabled *bool `pulumi:"disabled"`
	// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
	OssBackupPlanName *string `pulumi:"ossBackupPlanName"`
	// Backup prefix. Once specified, only objects with matching prefixes will be backed up.
	Prefix *string `pulumi:"prefix"`
	// Backup retention days, the minimum is 1.
	Retention *string `pulumi:"retention"`
	// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
	Schedule *string `pulumi:"schedule"`
	// The ID of backup vault.
	VaultId *string `pulumi:"vaultId"`
}

type OssBackupPlanState struct {
	// Backup type. Valid values: `COMPLETE`.
	BackupType pulumi.StringPtrInput
	// The name of OSS bucket.
	Bucket pulumi.StringPtrInput
	// Whether to disable the backup task. Valid values: `true`, `false`.
	Disabled pulumi.BoolPtrInput
	// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
	OssBackupPlanName pulumi.StringPtrInput
	// Backup prefix. Once specified, only objects with matching prefixes will be backed up.
	Prefix pulumi.StringPtrInput
	// Backup retention days, the minimum is 1.
	Retention pulumi.StringPtrInput
	// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
	Schedule pulumi.StringPtrInput
	// The ID of backup vault.
	VaultId pulumi.StringPtrInput
}

func (OssBackupPlanState) ElementType() reflect.Type {
	return reflect.TypeOf((*ossBackupPlanState)(nil)).Elem()
}

type ossBackupPlanArgs struct {
	// Backup type. Valid values: `COMPLETE`.
	BackupType string `pulumi:"backupType"`
	// The name of OSS bucket.
	Bucket string `pulumi:"bucket"`
	// Whether to disable the backup task. Valid values: `true`, `false`.
	Disabled *bool `pulumi:"disabled"`
	// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
	OssBackupPlanName string `pulumi:"ossBackupPlanName"`
	// Backup prefix. Once specified, only objects with matching prefixes will be backed up.
	Prefix *string `pulumi:"prefix"`
	// Backup retention days, the minimum is 1.
	Retention string `pulumi:"retention"`
	// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
	Schedule string `pulumi:"schedule"`
	// The ID of backup vault.
	VaultId string `pulumi:"vaultId"`
}

// The set of arguments for constructing a OssBackupPlan resource.
type OssBackupPlanArgs struct {
	// Backup type. Valid values: `COMPLETE`.
	BackupType pulumi.StringInput
	// The name of OSS bucket.
	Bucket pulumi.StringInput
	// Whether to disable the backup task. Valid values: `true`, `false`.
	Disabled pulumi.BoolPtrInput
	// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
	OssBackupPlanName pulumi.StringInput
	// Backup prefix. Once specified, only objects with matching prefixes will be backed up.
	Prefix pulumi.StringPtrInput
	// Backup retention days, the minimum is 1.
	Retention pulumi.StringInput
	// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
	Schedule pulumi.StringInput
	// The ID of backup vault.
	VaultId pulumi.StringInput
}

func (OssBackupPlanArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ossBackupPlanArgs)(nil)).Elem()
}

type OssBackupPlanInput interface {
	pulumi.Input

	ToOssBackupPlanOutput() OssBackupPlanOutput
	ToOssBackupPlanOutputWithContext(ctx context.Context) OssBackupPlanOutput
}

func (*OssBackupPlan) ElementType() reflect.Type {
	return reflect.TypeOf((**OssBackupPlan)(nil)).Elem()
}

func (i *OssBackupPlan) ToOssBackupPlanOutput() OssBackupPlanOutput {
	return i.ToOssBackupPlanOutputWithContext(context.Background())
}

func (i *OssBackupPlan) ToOssBackupPlanOutputWithContext(ctx context.Context) OssBackupPlanOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OssBackupPlanOutput)
}

// OssBackupPlanArrayInput is an input type that accepts OssBackupPlanArray and OssBackupPlanArrayOutput values.
// You can construct a concrete instance of `OssBackupPlanArrayInput` via:
//
//          OssBackupPlanArray{ OssBackupPlanArgs{...} }
type OssBackupPlanArrayInput interface {
	pulumi.Input

	ToOssBackupPlanArrayOutput() OssBackupPlanArrayOutput
	ToOssBackupPlanArrayOutputWithContext(context.Context) OssBackupPlanArrayOutput
}

type OssBackupPlanArray []OssBackupPlanInput

func (OssBackupPlanArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OssBackupPlan)(nil)).Elem()
}

func (i OssBackupPlanArray) ToOssBackupPlanArrayOutput() OssBackupPlanArrayOutput {
	return i.ToOssBackupPlanArrayOutputWithContext(context.Background())
}

func (i OssBackupPlanArray) ToOssBackupPlanArrayOutputWithContext(ctx context.Context) OssBackupPlanArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OssBackupPlanArrayOutput)
}

// OssBackupPlanMapInput is an input type that accepts OssBackupPlanMap and OssBackupPlanMapOutput values.
// You can construct a concrete instance of `OssBackupPlanMapInput` via:
//
//          OssBackupPlanMap{ "key": OssBackupPlanArgs{...} }
type OssBackupPlanMapInput interface {
	pulumi.Input

	ToOssBackupPlanMapOutput() OssBackupPlanMapOutput
	ToOssBackupPlanMapOutputWithContext(context.Context) OssBackupPlanMapOutput
}

type OssBackupPlanMap map[string]OssBackupPlanInput

func (OssBackupPlanMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OssBackupPlan)(nil)).Elem()
}

func (i OssBackupPlanMap) ToOssBackupPlanMapOutput() OssBackupPlanMapOutput {
	return i.ToOssBackupPlanMapOutputWithContext(context.Background())
}

func (i OssBackupPlanMap) ToOssBackupPlanMapOutputWithContext(ctx context.Context) OssBackupPlanMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OssBackupPlanMapOutput)
}

type OssBackupPlanOutput struct{ *pulumi.OutputState }

func (OssBackupPlanOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OssBackupPlan)(nil)).Elem()
}

func (o OssBackupPlanOutput) ToOssBackupPlanOutput() OssBackupPlanOutput {
	return o
}

func (o OssBackupPlanOutput) ToOssBackupPlanOutputWithContext(ctx context.Context) OssBackupPlanOutput {
	return o
}

// Backup type. Valid values: `COMPLETE`.
func (o OssBackupPlanOutput) BackupType() pulumi.StringOutput {
	return o.ApplyT(func(v *OssBackupPlan) pulumi.StringOutput { return v.BackupType }).(pulumi.StringOutput)
}

// The name of OSS bucket.
func (o OssBackupPlanOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *OssBackupPlan) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// Whether to disable the backup task. Valid values: `true`, `false`.
func (o OssBackupPlanOutput) Disabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *OssBackupPlan) pulumi.BoolOutput { return v.Disabled }).(pulumi.BoolOutput)
}

// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
func (o OssBackupPlanOutput) OssBackupPlanName() pulumi.StringOutput {
	return o.ApplyT(func(v *OssBackupPlan) pulumi.StringOutput { return v.OssBackupPlanName }).(pulumi.StringOutput)
}

// Backup prefix. Once specified, only objects with matching prefixes will be backed up.
func (o OssBackupPlanOutput) Prefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OssBackupPlan) pulumi.StringPtrOutput { return v.Prefix }).(pulumi.StringPtrOutput)
}

// Backup retention days, the minimum is 1.
func (o OssBackupPlanOutput) Retention() pulumi.StringOutput {
	return o.ApplyT(func(v *OssBackupPlan) pulumi.StringOutput { return v.Retention }).(pulumi.StringOutput)
}

// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
func (o OssBackupPlanOutput) Schedule() pulumi.StringOutput {
	return o.ApplyT(func(v *OssBackupPlan) pulumi.StringOutput { return v.Schedule }).(pulumi.StringOutput)
}

// The ID of backup vault.
func (o OssBackupPlanOutput) VaultId() pulumi.StringOutput {
	return o.ApplyT(func(v *OssBackupPlan) pulumi.StringOutput { return v.VaultId }).(pulumi.StringOutput)
}

type OssBackupPlanArrayOutput struct{ *pulumi.OutputState }

func (OssBackupPlanArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OssBackupPlan)(nil)).Elem()
}

func (o OssBackupPlanArrayOutput) ToOssBackupPlanArrayOutput() OssBackupPlanArrayOutput {
	return o
}

func (o OssBackupPlanArrayOutput) ToOssBackupPlanArrayOutputWithContext(ctx context.Context) OssBackupPlanArrayOutput {
	return o
}

func (o OssBackupPlanArrayOutput) Index(i pulumi.IntInput) OssBackupPlanOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OssBackupPlan {
		return vs[0].([]*OssBackupPlan)[vs[1].(int)]
	}).(OssBackupPlanOutput)
}

type OssBackupPlanMapOutput struct{ *pulumi.OutputState }

func (OssBackupPlanMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OssBackupPlan)(nil)).Elem()
}

func (o OssBackupPlanMapOutput) ToOssBackupPlanMapOutput() OssBackupPlanMapOutput {
	return o
}

func (o OssBackupPlanMapOutput) ToOssBackupPlanMapOutputWithContext(ctx context.Context) OssBackupPlanMapOutput {
	return o
}

func (o OssBackupPlanMapOutput) MapIndex(k pulumi.StringInput) OssBackupPlanOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OssBackupPlan {
		return vs[0].(map[string]*OssBackupPlan)[vs[1].(string)]
	}).(OssBackupPlanOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OssBackupPlanInput)(nil)).Elem(), &OssBackupPlan{})
	pulumi.RegisterInputType(reflect.TypeOf((*OssBackupPlanArrayInput)(nil)).Elem(), OssBackupPlanArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OssBackupPlanMapInput)(nil)).Elem(), OssBackupPlanMap{})
	pulumi.RegisterOutputType(OssBackupPlanOutput{})
	pulumi.RegisterOutputType(OssBackupPlanArrayOutput{})
	pulumi.RegisterOutputType(OssBackupPlanMapOutput{})
}
