// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an RDS instance backup policy resource and used to configure instance backup policy.
//
// > **NOTE:** Each DB instance has a backup policy and it will be set default values when destroying the resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/rds"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		creation := "Rds"
// 		if param := cfg.Get("creation"); param != "" {
// 			creation = param
// 		}
// 		name := "dbbackuppolicybasic"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		opt0 := creation
// 		defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
// 			AvailableResourceCreation: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
// 			VpcName:   pulumi.String(name),
// 			CidrBlock: pulumi.String("172.16.0.0/16"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
// 			VpcId:            defaultNetwork.ID(),
// 			CidrBlock:        pulumi.String("172.16.0.0/24"),
// 			AvailabilityZone: pulumi.String(defaultZones.Zones[0].Id),
// 			VswitchName:      pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		instance, err := rds.NewInstance(ctx, "instance", &rds.InstanceArgs{
// 			Engine:          pulumi.String("MySQL"),
// 			EngineVersion:   pulumi.String("5.6"),
// 			InstanceType:    pulumi.String("rds.mysql.s1.small"),
// 			InstanceStorage: pulumi.Int(10),
// 			VswitchId:       defaultSwitch.ID(),
// 			InstanceName:    pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = rds.NewBackupPolicy(ctx, "policy", &rds.BackupPolicyArgs{
// 			InstanceId: instance.ID(),
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
// RDS backup policy can be imported using the id or instance id, e.g.
//
// ```sh
//  $ pulumi import alicloud:rds/backupPolicy:BackupPolicy example "rm-12345678"
// ```
type BackupPolicy struct {
	pulumi.CustomResourceState

	// Instance archive backup keep count. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. When `archiveBackupKeepPolicy` is `ByMonth` Valid values: [1-31]. When `archiveBackupKeepPolicy` is `ByWeek` Valid values: [1-7].
	ArchiveBackupKeepCount pulumi.IntOutput `pulumi:"archiveBackupKeepCount"`
	// Instance archive backup keep policy. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values are `ByMonth`, `Disable`, `KeepAll`.
	ArchiveBackupKeepPolicy pulumi.StringOutput `pulumi:"archiveBackupKeepPolicy"`
	// Instance archive backup retention days. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values: [30-1095], and `archiveBackupRetentionPeriod` must larger than `backupRetentionPeriod` 730.
	ArchiveBackupRetentionPeriod pulumi.IntOutput `pulumi:"archiveBackupRetentionPeriod"`
	// It has been deprecated from version 1.69.0, and use field 'preferred_backup_period' instead.
	//
	// Deprecated: Attribute 'backup_period' has been deprecated from version 1.69.0. Use `preferred_backup_period` instead
	BackupPeriods pulumi.StringArrayOutput `pulumi:"backupPeriods"`
	// Instance backup retention days. Valid values: [7-730]. Default to 7. But mysql local disk is unlimited.
	BackupRetentionPeriod pulumi.IntPtrOutput `pulumi:"backupRetentionPeriod"`
	// It has been deprecated from version 1.69.0, and use field 'preferred_backup_time' instead.
	//
	// Deprecated: Attribute 'backup_time' has been deprecated from version 1.69.0. Use `preferred_backup_time` instead
	BackupTime pulumi.StringOutput `pulumi:"backupTime"`
	// The compress type of instance policy. Valid values are `1`, `4`, `8`.
	CompressType pulumi.StringOutput `pulumi:"compressType"`
	// Whether to backup instance log. Valid values are `true`, `false`, Default to `true`. Note: The 'Basic Edition' category Rds instance does not support setting log backup. [What is Basic Edition](https://www.alibabacloud.com/help/doc-detail/48980.htm).
	EnableBackupLog pulumi.BoolOutput `pulumi:"enableBackupLog"`
	// Instance high space usage protection policy. Valid when the `enableBackupLog` is `true`. Valid values are `Enable`, `Disable`.
	HighSpaceUsageProtection pulumi.StringPtrOutput `pulumi:"highSpaceUsageProtection"`
	// The Id of instance that can run database.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// Instance log backup local retention hours. Valid when the `enableBackupLog` is `true`. Valid values: [0-7*24].
	LocalLogRetentionHours pulumi.IntOutput `pulumi:"localLogRetentionHours"`
	// Instance log backup local retention space. Valid when the `enableBackupLog` is `true`. Valid values: [0-50].
	LocalLogRetentionSpace pulumi.IntOutput `pulumi:"localLogRetentionSpace"`
	// It has been deprecated from version 1.68.0, and use field 'enable_backup_log' instead.
	//
	// Deprecated: Attribute 'log_backup' has been deprecated from version 1.68.0. Use `enable_backup_log` instead
	LogBackup pulumi.BoolOutput `pulumi:"logBackup"`
	// Instance log backup frequency. Valid when the instance engine is `SQLServer`. Valid values are `LogInterval`.
	LogBackupFrequency pulumi.StringOutput `pulumi:"logBackupFrequency"`
	// Instance log backup retention days. Valid when the `enableBackupLog` is `1`. Valid values: [7-730]. Default to 7. It cannot be larger than `backupRetentionPeriod`.
	LogBackupRetentionPeriod pulumi.IntOutput `pulumi:"logBackupRetentionPeriod"`
	// It has been deprecated from version 1.69.0, and use field 'log_backup_retention_period' instead.
	//
	// Deprecated: Attribute 'log_retention_period' has been deprecated from version 1.69.0. Use `log_backup_retention_period` instead
	LogRetentionPeriod pulumi.IntOutput `pulumi:"logRetentionPeriod"`
	// DB Instance backup period. Please set at least two days to ensure backing up at least twice a week. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
	PreferredBackupPeriods pulumi.StringArrayOutput `pulumi:"preferredBackupPeriods"`
	// DB instance backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to "02:00Z-03:00Z". China time is 8 hours behind it.
	PreferredBackupTime pulumi.StringPtrOutput `pulumi:"preferredBackupTime"`
	// It has been deprecated from version 1.69.0, and use field 'backup_retention_period' instead.
	//
	// Deprecated: Attribute 'retention_period' has been deprecated from version 1.69.0. Use `backup_retention_period` instead
	RetentionPeriod pulumi.IntOutput `pulumi:"retentionPeriod"`
}

// NewBackupPolicy registers a new resource with the given unique name, arguments, and options.
func NewBackupPolicy(ctx *pulumi.Context,
	name string, args *BackupPolicyArgs, opts ...pulumi.ResourceOption) (*BackupPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	var resource BackupPolicy
	err := ctx.RegisterResource("alicloud:rds/backupPolicy:BackupPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBackupPolicy gets an existing BackupPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBackupPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BackupPolicyState, opts ...pulumi.ResourceOption) (*BackupPolicy, error) {
	var resource BackupPolicy
	err := ctx.ReadResource("alicloud:rds/backupPolicy:BackupPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BackupPolicy resources.
type backupPolicyState struct {
	// Instance archive backup keep count. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. When `archiveBackupKeepPolicy` is `ByMonth` Valid values: [1-31]. When `archiveBackupKeepPolicy` is `ByWeek` Valid values: [1-7].
	ArchiveBackupKeepCount *int `pulumi:"archiveBackupKeepCount"`
	// Instance archive backup keep policy. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values are `ByMonth`, `Disable`, `KeepAll`.
	ArchiveBackupKeepPolicy *string `pulumi:"archiveBackupKeepPolicy"`
	// Instance archive backup retention days. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values: [30-1095], and `archiveBackupRetentionPeriod` must larger than `backupRetentionPeriod` 730.
	ArchiveBackupRetentionPeriod *int `pulumi:"archiveBackupRetentionPeriod"`
	// It has been deprecated from version 1.69.0, and use field 'preferred_backup_period' instead.
	//
	// Deprecated: Attribute 'backup_period' has been deprecated from version 1.69.0. Use `preferred_backup_period` instead
	BackupPeriods []string `pulumi:"backupPeriods"`
	// Instance backup retention days. Valid values: [7-730]. Default to 7. But mysql local disk is unlimited.
	BackupRetentionPeriod *int `pulumi:"backupRetentionPeriod"`
	// It has been deprecated from version 1.69.0, and use field 'preferred_backup_time' instead.
	//
	// Deprecated: Attribute 'backup_time' has been deprecated from version 1.69.0. Use `preferred_backup_time` instead
	BackupTime *string `pulumi:"backupTime"`
	// The compress type of instance policy. Valid values are `1`, `4`, `8`.
	CompressType *string `pulumi:"compressType"`
	// Whether to backup instance log. Valid values are `true`, `false`, Default to `true`. Note: The 'Basic Edition' category Rds instance does not support setting log backup. [What is Basic Edition](https://www.alibabacloud.com/help/doc-detail/48980.htm).
	EnableBackupLog *bool `pulumi:"enableBackupLog"`
	// Instance high space usage protection policy. Valid when the `enableBackupLog` is `true`. Valid values are `Enable`, `Disable`.
	HighSpaceUsageProtection *string `pulumi:"highSpaceUsageProtection"`
	// The Id of instance that can run database.
	InstanceId *string `pulumi:"instanceId"`
	// Instance log backup local retention hours. Valid when the `enableBackupLog` is `true`. Valid values: [0-7*24].
	LocalLogRetentionHours *int `pulumi:"localLogRetentionHours"`
	// Instance log backup local retention space. Valid when the `enableBackupLog` is `true`. Valid values: [0-50].
	LocalLogRetentionSpace *int `pulumi:"localLogRetentionSpace"`
	// It has been deprecated from version 1.68.0, and use field 'enable_backup_log' instead.
	//
	// Deprecated: Attribute 'log_backup' has been deprecated from version 1.68.0. Use `enable_backup_log` instead
	LogBackup *bool `pulumi:"logBackup"`
	// Instance log backup frequency. Valid when the instance engine is `SQLServer`. Valid values are `LogInterval`.
	LogBackupFrequency *string `pulumi:"logBackupFrequency"`
	// Instance log backup retention days. Valid when the `enableBackupLog` is `1`. Valid values: [7-730]. Default to 7. It cannot be larger than `backupRetentionPeriod`.
	LogBackupRetentionPeriod *int `pulumi:"logBackupRetentionPeriod"`
	// It has been deprecated from version 1.69.0, and use field 'log_backup_retention_period' instead.
	//
	// Deprecated: Attribute 'log_retention_period' has been deprecated from version 1.69.0. Use `log_backup_retention_period` instead
	LogRetentionPeriod *int `pulumi:"logRetentionPeriod"`
	// DB Instance backup period. Please set at least two days to ensure backing up at least twice a week. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
	PreferredBackupPeriods []string `pulumi:"preferredBackupPeriods"`
	// DB instance backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to "02:00Z-03:00Z". China time is 8 hours behind it.
	PreferredBackupTime *string `pulumi:"preferredBackupTime"`
	// It has been deprecated from version 1.69.0, and use field 'backup_retention_period' instead.
	//
	// Deprecated: Attribute 'retention_period' has been deprecated from version 1.69.0. Use `backup_retention_period` instead
	RetentionPeriod *int `pulumi:"retentionPeriod"`
}

type BackupPolicyState struct {
	// Instance archive backup keep count. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. When `archiveBackupKeepPolicy` is `ByMonth` Valid values: [1-31]. When `archiveBackupKeepPolicy` is `ByWeek` Valid values: [1-7].
	ArchiveBackupKeepCount pulumi.IntPtrInput
	// Instance archive backup keep policy. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values are `ByMonth`, `Disable`, `KeepAll`.
	ArchiveBackupKeepPolicy pulumi.StringPtrInput
	// Instance archive backup retention days. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values: [30-1095], and `archiveBackupRetentionPeriod` must larger than `backupRetentionPeriod` 730.
	ArchiveBackupRetentionPeriod pulumi.IntPtrInput
	// It has been deprecated from version 1.69.0, and use field 'preferred_backup_period' instead.
	//
	// Deprecated: Attribute 'backup_period' has been deprecated from version 1.69.0. Use `preferred_backup_period` instead
	BackupPeriods pulumi.StringArrayInput
	// Instance backup retention days. Valid values: [7-730]. Default to 7. But mysql local disk is unlimited.
	BackupRetentionPeriod pulumi.IntPtrInput
	// It has been deprecated from version 1.69.0, and use field 'preferred_backup_time' instead.
	//
	// Deprecated: Attribute 'backup_time' has been deprecated from version 1.69.0. Use `preferred_backup_time` instead
	BackupTime pulumi.StringPtrInput
	// The compress type of instance policy. Valid values are `1`, `4`, `8`.
	CompressType pulumi.StringPtrInput
	// Whether to backup instance log. Valid values are `true`, `false`, Default to `true`. Note: The 'Basic Edition' category Rds instance does not support setting log backup. [What is Basic Edition](https://www.alibabacloud.com/help/doc-detail/48980.htm).
	EnableBackupLog pulumi.BoolPtrInput
	// Instance high space usage protection policy. Valid when the `enableBackupLog` is `true`. Valid values are `Enable`, `Disable`.
	HighSpaceUsageProtection pulumi.StringPtrInput
	// The Id of instance that can run database.
	InstanceId pulumi.StringPtrInput
	// Instance log backup local retention hours. Valid when the `enableBackupLog` is `true`. Valid values: [0-7*24].
	LocalLogRetentionHours pulumi.IntPtrInput
	// Instance log backup local retention space. Valid when the `enableBackupLog` is `true`. Valid values: [0-50].
	LocalLogRetentionSpace pulumi.IntPtrInput
	// It has been deprecated from version 1.68.0, and use field 'enable_backup_log' instead.
	//
	// Deprecated: Attribute 'log_backup' has been deprecated from version 1.68.0. Use `enable_backup_log` instead
	LogBackup pulumi.BoolPtrInput
	// Instance log backup frequency. Valid when the instance engine is `SQLServer`. Valid values are `LogInterval`.
	LogBackupFrequency pulumi.StringPtrInput
	// Instance log backup retention days. Valid when the `enableBackupLog` is `1`. Valid values: [7-730]. Default to 7. It cannot be larger than `backupRetentionPeriod`.
	LogBackupRetentionPeriod pulumi.IntPtrInput
	// It has been deprecated from version 1.69.0, and use field 'log_backup_retention_period' instead.
	//
	// Deprecated: Attribute 'log_retention_period' has been deprecated from version 1.69.0. Use `log_backup_retention_period` instead
	LogRetentionPeriod pulumi.IntPtrInput
	// DB Instance backup period. Please set at least two days to ensure backing up at least twice a week. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
	PreferredBackupPeriods pulumi.StringArrayInput
	// DB instance backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to "02:00Z-03:00Z". China time is 8 hours behind it.
	PreferredBackupTime pulumi.StringPtrInput
	// It has been deprecated from version 1.69.0, and use field 'backup_retention_period' instead.
	//
	// Deprecated: Attribute 'retention_period' has been deprecated from version 1.69.0. Use `backup_retention_period` instead
	RetentionPeriod pulumi.IntPtrInput
}

func (BackupPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*backupPolicyState)(nil)).Elem()
}

type backupPolicyArgs struct {
	// Instance archive backup keep count. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. When `archiveBackupKeepPolicy` is `ByMonth` Valid values: [1-31]. When `archiveBackupKeepPolicy` is `ByWeek` Valid values: [1-7].
	ArchiveBackupKeepCount *int `pulumi:"archiveBackupKeepCount"`
	// Instance archive backup keep policy. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values are `ByMonth`, `Disable`, `KeepAll`.
	ArchiveBackupKeepPolicy *string `pulumi:"archiveBackupKeepPolicy"`
	// Instance archive backup retention days. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values: [30-1095], and `archiveBackupRetentionPeriod` must larger than `backupRetentionPeriod` 730.
	ArchiveBackupRetentionPeriod *int `pulumi:"archiveBackupRetentionPeriod"`
	// It has been deprecated from version 1.69.0, and use field 'preferred_backup_period' instead.
	//
	// Deprecated: Attribute 'backup_period' has been deprecated from version 1.69.0. Use `preferred_backup_period` instead
	BackupPeriods []string `pulumi:"backupPeriods"`
	// Instance backup retention days. Valid values: [7-730]. Default to 7. But mysql local disk is unlimited.
	BackupRetentionPeriod *int `pulumi:"backupRetentionPeriod"`
	// It has been deprecated from version 1.69.0, and use field 'preferred_backup_time' instead.
	//
	// Deprecated: Attribute 'backup_time' has been deprecated from version 1.69.0. Use `preferred_backup_time` instead
	BackupTime *string `pulumi:"backupTime"`
	// The compress type of instance policy. Valid values are `1`, `4`, `8`.
	CompressType *string `pulumi:"compressType"`
	// Whether to backup instance log. Valid values are `true`, `false`, Default to `true`. Note: The 'Basic Edition' category Rds instance does not support setting log backup. [What is Basic Edition](https://www.alibabacloud.com/help/doc-detail/48980.htm).
	EnableBackupLog *bool `pulumi:"enableBackupLog"`
	// Instance high space usage protection policy. Valid when the `enableBackupLog` is `true`. Valid values are `Enable`, `Disable`.
	HighSpaceUsageProtection *string `pulumi:"highSpaceUsageProtection"`
	// The Id of instance that can run database.
	InstanceId string `pulumi:"instanceId"`
	// Instance log backup local retention hours. Valid when the `enableBackupLog` is `true`. Valid values: [0-7*24].
	LocalLogRetentionHours *int `pulumi:"localLogRetentionHours"`
	// Instance log backup local retention space. Valid when the `enableBackupLog` is `true`. Valid values: [0-50].
	LocalLogRetentionSpace *int `pulumi:"localLogRetentionSpace"`
	// It has been deprecated from version 1.68.0, and use field 'enable_backup_log' instead.
	//
	// Deprecated: Attribute 'log_backup' has been deprecated from version 1.68.0. Use `enable_backup_log` instead
	LogBackup *bool `pulumi:"logBackup"`
	// Instance log backup frequency. Valid when the instance engine is `SQLServer`. Valid values are `LogInterval`.
	LogBackupFrequency *string `pulumi:"logBackupFrequency"`
	// Instance log backup retention days. Valid when the `enableBackupLog` is `1`. Valid values: [7-730]. Default to 7. It cannot be larger than `backupRetentionPeriod`.
	LogBackupRetentionPeriod *int `pulumi:"logBackupRetentionPeriod"`
	// It has been deprecated from version 1.69.0, and use field 'log_backup_retention_period' instead.
	//
	// Deprecated: Attribute 'log_retention_period' has been deprecated from version 1.69.0. Use `log_backup_retention_period` instead
	LogRetentionPeriod *int `pulumi:"logRetentionPeriod"`
	// DB Instance backup period. Please set at least two days to ensure backing up at least twice a week. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
	PreferredBackupPeriods []string `pulumi:"preferredBackupPeriods"`
	// DB instance backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to "02:00Z-03:00Z". China time is 8 hours behind it.
	PreferredBackupTime *string `pulumi:"preferredBackupTime"`
	// It has been deprecated from version 1.69.0, and use field 'backup_retention_period' instead.
	//
	// Deprecated: Attribute 'retention_period' has been deprecated from version 1.69.0. Use `backup_retention_period` instead
	RetentionPeriod *int `pulumi:"retentionPeriod"`
}

// The set of arguments for constructing a BackupPolicy resource.
type BackupPolicyArgs struct {
	// Instance archive backup keep count. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. When `archiveBackupKeepPolicy` is `ByMonth` Valid values: [1-31]. When `archiveBackupKeepPolicy` is `ByWeek` Valid values: [1-7].
	ArchiveBackupKeepCount pulumi.IntPtrInput
	// Instance archive backup keep policy. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values are `ByMonth`, `Disable`, `KeepAll`.
	ArchiveBackupKeepPolicy pulumi.StringPtrInput
	// Instance archive backup retention days. Valid when the `enableBackupLog` is `true` and instance is mysql local disk. Valid values: [30-1095], and `archiveBackupRetentionPeriod` must larger than `backupRetentionPeriod` 730.
	ArchiveBackupRetentionPeriod pulumi.IntPtrInput
	// It has been deprecated from version 1.69.0, and use field 'preferred_backup_period' instead.
	//
	// Deprecated: Attribute 'backup_period' has been deprecated from version 1.69.0. Use `preferred_backup_period` instead
	BackupPeriods pulumi.StringArrayInput
	// Instance backup retention days. Valid values: [7-730]. Default to 7. But mysql local disk is unlimited.
	BackupRetentionPeriod pulumi.IntPtrInput
	// It has been deprecated from version 1.69.0, and use field 'preferred_backup_time' instead.
	//
	// Deprecated: Attribute 'backup_time' has been deprecated from version 1.69.0. Use `preferred_backup_time` instead
	BackupTime pulumi.StringPtrInput
	// The compress type of instance policy. Valid values are `1`, `4`, `8`.
	CompressType pulumi.StringPtrInput
	// Whether to backup instance log. Valid values are `true`, `false`, Default to `true`. Note: The 'Basic Edition' category Rds instance does not support setting log backup. [What is Basic Edition](https://www.alibabacloud.com/help/doc-detail/48980.htm).
	EnableBackupLog pulumi.BoolPtrInput
	// Instance high space usage protection policy. Valid when the `enableBackupLog` is `true`. Valid values are `Enable`, `Disable`.
	HighSpaceUsageProtection pulumi.StringPtrInput
	// The Id of instance that can run database.
	InstanceId pulumi.StringInput
	// Instance log backup local retention hours. Valid when the `enableBackupLog` is `true`. Valid values: [0-7*24].
	LocalLogRetentionHours pulumi.IntPtrInput
	// Instance log backup local retention space. Valid when the `enableBackupLog` is `true`. Valid values: [0-50].
	LocalLogRetentionSpace pulumi.IntPtrInput
	// It has been deprecated from version 1.68.0, and use field 'enable_backup_log' instead.
	//
	// Deprecated: Attribute 'log_backup' has been deprecated from version 1.68.0. Use `enable_backup_log` instead
	LogBackup pulumi.BoolPtrInput
	// Instance log backup frequency. Valid when the instance engine is `SQLServer`. Valid values are `LogInterval`.
	LogBackupFrequency pulumi.StringPtrInput
	// Instance log backup retention days. Valid when the `enableBackupLog` is `1`. Valid values: [7-730]. Default to 7. It cannot be larger than `backupRetentionPeriod`.
	LogBackupRetentionPeriod pulumi.IntPtrInput
	// It has been deprecated from version 1.69.0, and use field 'log_backup_retention_period' instead.
	//
	// Deprecated: Attribute 'log_retention_period' has been deprecated from version 1.69.0. Use `log_backup_retention_period` instead
	LogRetentionPeriod pulumi.IntPtrInput
	// DB Instance backup period. Please set at least two days to ensure backing up at least twice a week. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]. Default to ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
	PreferredBackupPeriods pulumi.StringArrayInput
	// DB instance backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to "02:00Z-03:00Z". China time is 8 hours behind it.
	PreferredBackupTime pulumi.StringPtrInput
	// It has been deprecated from version 1.69.0, and use field 'backup_retention_period' instead.
	//
	// Deprecated: Attribute 'retention_period' has been deprecated from version 1.69.0. Use `backup_retention_period` instead
	RetentionPeriod pulumi.IntPtrInput
}

func (BackupPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*backupPolicyArgs)(nil)).Elem()
}

type BackupPolicyInput interface {
	pulumi.Input

	ToBackupPolicyOutput() BackupPolicyOutput
	ToBackupPolicyOutputWithContext(ctx context.Context) BackupPolicyOutput
}

func (*BackupPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((*BackupPolicy)(nil))
}

func (i *BackupPolicy) ToBackupPolicyOutput() BackupPolicyOutput {
	return i.ToBackupPolicyOutputWithContext(context.Background())
}

func (i *BackupPolicy) ToBackupPolicyOutputWithContext(ctx context.Context) BackupPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackupPolicyOutput)
}

func (i *BackupPolicy) ToBackupPolicyPtrOutput() BackupPolicyPtrOutput {
	return i.ToBackupPolicyPtrOutputWithContext(context.Background())
}

func (i *BackupPolicy) ToBackupPolicyPtrOutputWithContext(ctx context.Context) BackupPolicyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackupPolicyPtrOutput)
}

type BackupPolicyPtrInput interface {
	pulumi.Input

	ToBackupPolicyPtrOutput() BackupPolicyPtrOutput
	ToBackupPolicyPtrOutputWithContext(ctx context.Context) BackupPolicyPtrOutput
}

type backupPolicyPtrType BackupPolicyArgs

func (*backupPolicyPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**BackupPolicy)(nil))
}

func (i *backupPolicyPtrType) ToBackupPolicyPtrOutput() BackupPolicyPtrOutput {
	return i.ToBackupPolicyPtrOutputWithContext(context.Background())
}

func (i *backupPolicyPtrType) ToBackupPolicyPtrOutputWithContext(ctx context.Context) BackupPolicyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackupPolicyPtrOutput)
}

// BackupPolicyArrayInput is an input type that accepts BackupPolicyArray and BackupPolicyArrayOutput values.
// You can construct a concrete instance of `BackupPolicyArrayInput` via:
//
//          BackupPolicyArray{ BackupPolicyArgs{...} }
type BackupPolicyArrayInput interface {
	pulumi.Input

	ToBackupPolicyArrayOutput() BackupPolicyArrayOutput
	ToBackupPolicyArrayOutputWithContext(context.Context) BackupPolicyArrayOutput
}

type BackupPolicyArray []BackupPolicyInput

func (BackupPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*BackupPolicy)(nil))
}

func (i BackupPolicyArray) ToBackupPolicyArrayOutput() BackupPolicyArrayOutput {
	return i.ToBackupPolicyArrayOutputWithContext(context.Background())
}

func (i BackupPolicyArray) ToBackupPolicyArrayOutputWithContext(ctx context.Context) BackupPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackupPolicyArrayOutput)
}

// BackupPolicyMapInput is an input type that accepts BackupPolicyMap and BackupPolicyMapOutput values.
// You can construct a concrete instance of `BackupPolicyMapInput` via:
//
//          BackupPolicyMap{ "key": BackupPolicyArgs{...} }
type BackupPolicyMapInput interface {
	pulumi.Input

	ToBackupPolicyMapOutput() BackupPolicyMapOutput
	ToBackupPolicyMapOutputWithContext(context.Context) BackupPolicyMapOutput
}

type BackupPolicyMap map[string]BackupPolicyInput

func (BackupPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*BackupPolicy)(nil))
}

func (i BackupPolicyMap) ToBackupPolicyMapOutput() BackupPolicyMapOutput {
	return i.ToBackupPolicyMapOutputWithContext(context.Background())
}

func (i BackupPolicyMap) ToBackupPolicyMapOutputWithContext(ctx context.Context) BackupPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackupPolicyMapOutput)
}

type BackupPolicyOutput struct {
	*pulumi.OutputState
}

func (BackupPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*BackupPolicy)(nil))
}

func (o BackupPolicyOutput) ToBackupPolicyOutput() BackupPolicyOutput {
	return o
}

func (o BackupPolicyOutput) ToBackupPolicyOutputWithContext(ctx context.Context) BackupPolicyOutput {
	return o
}

func (o BackupPolicyOutput) ToBackupPolicyPtrOutput() BackupPolicyPtrOutput {
	return o.ToBackupPolicyPtrOutputWithContext(context.Background())
}

func (o BackupPolicyOutput) ToBackupPolicyPtrOutputWithContext(ctx context.Context) BackupPolicyPtrOutput {
	return o.ApplyT(func(v BackupPolicy) *BackupPolicy {
		return &v
	}).(BackupPolicyPtrOutput)
}

type BackupPolicyPtrOutput struct {
	*pulumi.OutputState
}

func (BackupPolicyPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BackupPolicy)(nil))
}

func (o BackupPolicyPtrOutput) ToBackupPolicyPtrOutput() BackupPolicyPtrOutput {
	return o
}

func (o BackupPolicyPtrOutput) ToBackupPolicyPtrOutputWithContext(ctx context.Context) BackupPolicyPtrOutput {
	return o
}

type BackupPolicyArrayOutput struct{ *pulumi.OutputState }

func (BackupPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]BackupPolicy)(nil))
}

func (o BackupPolicyArrayOutput) ToBackupPolicyArrayOutput() BackupPolicyArrayOutput {
	return o
}

func (o BackupPolicyArrayOutput) ToBackupPolicyArrayOutputWithContext(ctx context.Context) BackupPolicyArrayOutput {
	return o
}

func (o BackupPolicyArrayOutput) Index(i pulumi.IntInput) BackupPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) BackupPolicy {
		return vs[0].([]BackupPolicy)[vs[1].(int)]
	}).(BackupPolicyOutput)
}

type BackupPolicyMapOutput struct{ *pulumi.OutputState }

func (BackupPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]BackupPolicy)(nil))
}

func (o BackupPolicyMapOutput) ToBackupPolicyMapOutput() BackupPolicyMapOutput {
	return o
}

func (o BackupPolicyMapOutput) ToBackupPolicyMapOutputWithContext(ctx context.Context) BackupPolicyMapOutput {
	return o
}

func (o BackupPolicyMapOutput) MapIndex(k pulumi.StringInput) BackupPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) BackupPolicy {
		return vs[0].(map[string]BackupPolicy)[vs[1].(string)]
	}).(BackupPolicyOutput)
}

func init() {
	pulumi.RegisterOutputType(BackupPolicyOutput{})
	pulumi.RegisterOutputType(BackupPolicyPtrOutput{})
	pulumi.RegisterOutputType(BackupPolicyArrayOutput{})
	pulumi.RegisterOutputType(BackupPolicyMapOutput{})
}
