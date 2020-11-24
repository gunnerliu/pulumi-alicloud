// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package adb

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// ## Import
//
// ADB backup policy can be imported using the id or cluster id, e.g.
//
// ```sh
//  $ pulumi import alicloud:adb/backupPolicy:BackupPolicy example "am-12345678"
// ```
type BackupPolicy struct {
	pulumi.CustomResourceState

	// Cluster backup retention days, Fixed for 7 days, not modified.
	BackupRetentionPeriod pulumi.StringOutput `pulumi:"backupRetentionPeriod"`
	// The Id of cluster that can run database.
	DbClusterId pulumi.StringOutput `pulumi:"dbClusterId"`
	// ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
	PreferredBackupPeriods pulumi.StringArrayOutput `pulumi:"preferredBackupPeriods"`
	// ADB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. China time is 8 hours behind it.
	PreferredBackupTime pulumi.StringOutput `pulumi:"preferredBackupTime"`
}

// NewBackupPolicy registers a new resource with the given unique name, arguments, and options.
func NewBackupPolicy(ctx *pulumi.Context,
	name string, args *BackupPolicyArgs, opts ...pulumi.ResourceOption) (*BackupPolicy, error) {
	if args == nil || args.DbClusterId == nil {
		return nil, errors.New("missing required argument 'DbClusterId'")
	}
	if args == nil || args.PreferredBackupPeriods == nil {
		return nil, errors.New("missing required argument 'PreferredBackupPeriods'")
	}
	if args == nil || args.PreferredBackupTime == nil {
		return nil, errors.New("missing required argument 'PreferredBackupTime'")
	}
	if args == nil {
		args = &BackupPolicyArgs{}
	}
	var resource BackupPolicy
	err := ctx.RegisterResource("alicloud:adb/backupPolicy:BackupPolicy", name, args, &resource, opts...)
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
	err := ctx.ReadResource("alicloud:adb/backupPolicy:BackupPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BackupPolicy resources.
type backupPolicyState struct {
	// Cluster backup retention days, Fixed for 7 days, not modified.
	BackupRetentionPeriod *string `pulumi:"backupRetentionPeriod"`
	// The Id of cluster that can run database.
	DbClusterId *string `pulumi:"dbClusterId"`
	// ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
	PreferredBackupPeriods []string `pulumi:"preferredBackupPeriods"`
	// ADB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. China time is 8 hours behind it.
	PreferredBackupTime *string `pulumi:"preferredBackupTime"`
}

type BackupPolicyState struct {
	// Cluster backup retention days, Fixed for 7 days, not modified.
	BackupRetentionPeriod pulumi.StringPtrInput
	// The Id of cluster that can run database.
	DbClusterId pulumi.StringPtrInput
	// ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
	PreferredBackupPeriods pulumi.StringArrayInput
	// ADB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. China time is 8 hours behind it.
	PreferredBackupTime pulumi.StringPtrInput
}

func (BackupPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*backupPolicyState)(nil)).Elem()
}

type backupPolicyArgs struct {
	// The Id of cluster that can run database.
	DbClusterId string `pulumi:"dbClusterId"`
	// ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
	PreferredBackupPeriods []string `pulumi:"preferredBackupPeriods"`
	// ADB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. China time is 8 hours behind it.
	PreferredBackupTime string `pulumi:"preferredBackupTime"`
}

// The set of arguments for constructing a BackupPolicy resource.
type BackupPolicyArgs struct {
	// The Id of cluster that can run database.
	DbClusterId pulumi.StringInput
	// ADB Cluster backup period. Valid values: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday].
	PreferredBackupPeriods pulumi.StringArrayInput
	// ADB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. China time is 8 hours behind it.
	PreferredBackupTime pulumi.StringInput
}

func (BackupPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*backupPolicyArgs)(nil)).Elem()
}

type BackupPolicyInput interface {
	pulumi.Input

	ToBackupPolicyOutput() BackupPolicyOutput
	ToBackupPolicyOutputWithContext(ctx context.Context) BackupPolicyOutput
}

func (BackupPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((*BackupPolicy)(nil)).Elem()
}

func (i BackupPolicy) ToBackupPolicyOutput() BackupPolicyOutput {
	return i.ToBackupPolicyOutputWithContext(context.Background())
}

func (i BackupPolicy) ToBackupPolicyOutputWithContext(ctx context.Context) BackupPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BackupPolicyOutput)
}

type BackupPolicyOutput struct {
	*pulumi.OutputState
}

func (BackupPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*BackupPolicyOutput)(nil)).Elem()
}

func (o BackupPolicyOutput) ToBackupPolicyOutput() BackupPolicyOutput {
	return o
}

func (o BackupPolicyOutput) ToBackupPolicyOutputWithContext(ctx context.Context) BackupPolicyOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(BackupPolicyOutput{})
}
