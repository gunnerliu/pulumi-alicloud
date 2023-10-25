// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hbr

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Hybrid Backup Recovery (HBR) Replication Vault resource.
//
// For information about Hybrid Backup Recovery (HBR) Replication Vault and how to use it, see [What is Replication Vault](https://www.alibabacloud.com/help/en/doc-detail/345603.html).
//
// > **NOTE:** Available in v1.152.0+.
//
// ## Import
//
// Hybrid Backup Recovery (HBR) Replication Vault can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:hbr/replicationVault:ReplicationVault example <id>
//
// ```
type ReplicationVault struct {
	pulumi.CustomResourceState

	// The description of the backup vault. The description must be 0 to 255 characters in length.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ID of the region where the source vault resides.
	ReplicationSourceRegionId pulumi.StringOutput `pulumi:"replicationSourceRegionId"`
	// The ID of the source vault.
	ReplicationSourceVaultId pulumi.StringOutput `pulumi:"replicationSourceVaultId"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// The name of the backup vault. The name must be 1 to 64 characters in length.
	VaultName pulumi.StringOutput `pulumi:"vaultName"`
	// The storage type of the backup vault. Valid values: `STANDARD`.
	VaultStorageClass pulumi.StringOutput `pulumi:"vaultStorageClass"`
}

// NewReplicationVault registers a new resource with the given unique name, arguments, and options.
func NewReplicationVault(ctx *pulumi.Context,
	name string, args *ReplicationVaultArgs, opts ...pulumi.ResourceOption) (*ReplicationVault, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ReplicationSourceRegionId == nil {
		return nil, errors.New("invalid value for required argument 'ReplicationSourceRegionId'")
	}
	if args.ReplicationSourceVaultId == nil {
		return nil, errors.New("invalid value for required argument 'ReplicationSourceVaultId'")
	}
	if args.VaultName == nil {
		return nil, errors.New("invalid value for required argument 'VaultName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ReplicationVault
	err := ctx.RegisterResource("alicloud:hbr/replicationVault:ReplicationVault", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetReplicationVault gets an existing ReplicationVault resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetReplicationVault(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ReplicationVaultState, opts ...pulumi.ResourceOption) (*ReplicationVault, error) {
	var resource ReplicationVault
	err := ctx.ReadResource("alicloud:hbr/replicationVault:ReplicationVault", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ReplicationVault resources.
type replicationVaultState struct {
	// The description of the backup vault. The description must be 0 to 255 characters in length.
	Description *string `pulumi:"description"`
	// The ID of the region where the source vault resides.
	ReplicationSourceRegionId *string `pulumi:"replicationSourceRegionId"`
	// The ID of the source vault.
	ReplicationSourceVaultId *string `pulumi:"replicationSourceVaultId"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// The name of the backup vault. The name must be 1 to 64 characters in length.
	VaultName *string `pulumi:"vaultName"`
	// The storage type of the backup vault. Valid values: `STANDARD`.
	VaultStorageClass *string `pulumi:"vaultStorageClass"`
}

type ReplicationVaultState struct {
	// The description of the backup vault. The description must be 0 to 255 characters in length.
	Description pulumi.StringPtrInput
	// The ID of the region where the source vault resides.
	ReplicationSourceRegionId pulumi.StringPtrInput
	// The ID of the source vault.
	ReplicationSourceVaultId pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// The name of the backup vault. The name must be 1 to 64 characters in length.
	VaultName pulumi.StringPtrInput
	// The storage type of the backup vault. Valid values: `STANDARD`.
	VaultStorageClass pulumi.StringPtrInput
}

func (ReplicationVaultState) ElementType() reflect.Type {
	return reflect.TypeOf((*replicationVaultState)(nil)).Elem()
}

type replicationVaultArgs struct {
	// The description of the backup vault. The description must be 0 to 255 characters in length.
	Description *string `pulumi:"description"`
	// The ID of the region where the source vault resides.
	ReplicationSourceRegionId string `pulumi:"replicationSourceRegionId"`
	// The ID of the source vault.
	ReplicationSourceVaultId string `pulumi:"replicationSourceVaultId"`
	// The name of the backup vault. The name must be 1 to 64 characters in length.
	VaultName string `pulumi:"vaultName"`
	// The storage type of the backup vault. Valid values: `STANDARD`.
	VaultStorageClass *string `pulumi:"vaultStorageClass"`
}

// The set of arguments for constructing a ReplicationVault resource.
type ReplicationVaultArgs struct {
	// The description of the backup vault. The description must be 0 to 255 characters in length.
	Description pulumi.StringPtrInput
	// The ID of the region where the source vault resides.
	ReplicationSourceRegionId pulumi.StringInput
	// The ID of the source vault.
	ReplicationSourceVaultId pulumi.StringInput
	// The name of the backup vault. The name must be 1 to 64 characters in length.
	VaultName pulumi.StringInput
	// The storage type of the backup vault. Valid values: `STANDARD`.
	VaultStorageClass pulumi.StringPtrInput
}

func (ReplicationVaultArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*replicationVaultArgs)(nil)).Elem()
}

type ReplicationVaultInput interface {
	pulumi.Input

	ToReplicationVaultOutput() ReplicationVaultOutput
	ToReplicationVaultOutputWithContext(ctx context.Context) ReplicationVaultOutput
}

func (*ReplicationVault) ElementType() reflect.Type {
	return reflect.TypeOf((**ReplicationVault)(nil)).Elem()
}

func (i *ReplicationVault) ToReplicationVaultOutput() ReplicationVaultOutput {
	return i.ToReplicationVaultOutputWithContext(context.Background())
}

func (i *ReplicationVault) ToReplicationVaultOutputWithContext(ctx context.Context) ReplicationVaultOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReplicationVaultOutput)
}

func (i *ReplicationVault) ToOutput(ctx context.Context) pulumix.Output[*ReplicationVault] {
	return pulumix.Output[*ReplicationVault]{
		OutputState: i.ToReplicationVaultOutputWithContext(ctx).OutputState,
	}
}

// ReplicationVaultArrayInput is an input type that accepts ReplicationVaultArray and ReplicationVaultArrayOutput values.
// You can construct a concrete instance of `ReplicationVaultArrayInput` via:
//
//	ReplicationVaultArray{ ReplicationVaultArgs{...} }
type ReplicationVaultArrayInput interface {
	pulumi.Input

	ToReplicationVaultArrayOutput() ReplicationVaultArrayOutput
	ToReplicationVaultArrayOutputWithContext(context.Context) ReplicationVaultArrayOutput
}

type ReplicationVaultArray []ReplicationVaultInput

func (ReplicationVaultArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReplicationVault)(nil)).Elem()
}

func (i ReplicationVaultArray) ToReplicationVaultArrayOutput() ReplicationVaultArrayOutput {
	return i.ToReplicationVaultArrayOutputWithContext(context.Background())
}

func (i ReplicationVaultArray) ToReplicationVaultArrayOutputWithContext(ctx context.Context) ReplicationVaultArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReplicationVaultArrayOutput)
}

func (i ReplicationVaultArray) ToOutput(ctx context.Context) pulumix.Output[[]*ReplicationVault] {
	return pulumix.Output[[]*ReplicationVault]{
		OutputState: i.ToReplicationVaultArrayOutputWithContext(ctx).OutputState,
	}
}

// ReplicationVaultMapInput is an input type that accepts ReplicationVaultMap and ReplicationVaultMapOutput values.
// You can construct a concrete instance of `ReplicationVaultMapInput` via:
//
//	ReplicationVaultMap{ "key": ReplicationVaultArgs{...} }
type ReplicationVaultMapInput interface {
	pulumi.Input

	ToReplicationVaultMapOutput() ReplicationVaultMapOutput
	ToReplicationVaultMapOutputWithContext(context.Context) ReplicationVaultMapOutput
}

type ReplicationVaultMap map[string]ReplicationVaultInput

func (ReplicationVaultMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReplicationVault)(nil)).Elem()
}

func (i ReplicationVaultMap) ToReplicationVaultMapOutput() ReplicationVaultMapOutput {
	return i.ToReplicationVaultMapOutputWithContext(context.Background())
}

func (i ReplicationVaultMap) ToReplicationVaultMapOutputWithContext(ctx context.Context) ReplicationVaultMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReplicationVaultMapOutput)
}

func (i ReplicationVaultMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*ReplicationVault] {
	return pulumix.Output[map[string]*ReplicationVault]{
		OutputState: i.ToReplicationVaultMapOutputWithContext(ctx).OutputState,
	}
}

type ReplicationVaultOutput struct{ *pulumi.OutputState }

func (ReplicationVaultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ReplicationVault)(nil)).Elem()
}

func (o ReplicationVaultOutput) ToReplicationVaultOutput() ReplicationVaultOutput {
	return o
}

func (o ReplicationVaultOutput) ToReplicationVaultOutputWithContext(ctx context.Context) ReplicationVaultOutput {
	return o
}

func (o ReplicationVaultOutput) ToOutput(ctx context.Context) pulumix.Output[*ReplicationVault] {
	return pulumix.Output[*ReplicationVault]{
		OutputState: o.OutputState,
	}
}

// The description of the backup vault. The description must be 0 to 255 characters in length.
func (o ReplicationVaultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ReplicationVault) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ID of the region where the source vault resides.
func (o ReplicationVaultOutput) ReplicationSourceRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *ReplicationVault) pulumi.StringOutput { return v.ReplicationSourceRegionId }).(pulumi.StringOutput)
}

// The ID of the source vault.
func (o ReplicationVaultOutput) ReplicationSourceVaultId() pulumi.StringOutput {
	return o.ApplyT(func(v *ReplicationVault) pulumi.StringOutput { return v.ReplicationSourceVaultId }).(pulumi.StringOutput)
}

// The status of the resource.
func (o ReplicationVaultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ReplicationVault) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The name of the backup vault. The name must be 1 to 64 characters in length.
func (o ReplicationVaultOutput) VaultName() pulumi.StringOutput {
	return o.ApplyT(func(v *ReplicationVault) pulumi.StringOutput { return v.VaultName }).(pulumi.StringOutput)
}

// The storage type of the backup vault. Valid values: `STANDARD`.
func (o ReplicationVaultOutput) VaultStorageClass() pulumi.StringOutput {
	return o.ApplyT(func(v *ReplicationVault) pulumi.StringOutput { return v.VaultStorageClass }).(pulumi.StringOutput)
}

type ReplicationVaultArrayOutput struct{ *pulumi.OutputState }

func (ReplicationVaultArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ReplicationVault)(nil)).Elem()
}

func (o ReplicationVaultArrayOutput) ToReplicationVaultArrayOutput() ReplicationVaultArrayOutput {
	return o
}

func (o ReplicationVaultArrayOutput) ToReplicationVaultArrayOutputWithContext(ctx context.Context) ReplicationVaultArrayOutput {
	return o
}

func (o ReplicationVaultArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*ReplicationVault] {
	return pulumix.Output[[]*ReplicationVault]{
		OutputState: o.OutputState,
	}
}

func (o ReplicationVaultArrayOutput) Index(i pulumi.IntInput) ReplicationVaultOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ReplicationVault {
		return vs[0].([]*ReplicationVault)[vs[1].(int)]
	}).(ReplicationVaultOutput)
}

type ReplicationVaultMapOutput struct{ *pulumi.OutputState }

func (ReplicationVaultMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ReplicationVault)(nil)).Elem()
}

func (o ReplicationVaultMapOutput) ToReplicationVaultMapOutput() ReplicationVaultMapOutput {
	return o
}

func (o ReplicationVaultMapOutput) ToReplicationVaultMapOutputWithContext(ctx context.Context) ReplicationVaultMapOutput {
	return o
}

func (o ReplicationVaultMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*ReplicationVault] {
	return pulumix.Output[map[string]*ReplicationVault]{
		OutputState: o.OutputState,
	}
}

func (o ReplicationVaultMapOutput) MapIndex(k pulumi.StringInput) ReplicationVaultOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ReplicationVault {
		return vs[0].(map[string]*ReplicationVault)[vs[1].(string)]
	}).(ReplicationVaultOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ReplicationVaultInput)(nil)).Elem(), &ReplicationVault{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReplicationVaultArrayInput)(nil)).Elem(), ReplicationVaultArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReplicationVaultMapInput)(nil)).Elem(), ReplicationVaultMap{})
	pulumi.RegisterOutputType(ReplicationVaultOutput{})
	pulumi.RegisterOutputType(ReplicationVaultArrayOutput{})
	pulumi.RegisterOutputType(ReplicationVaultMapOutput{})
}
