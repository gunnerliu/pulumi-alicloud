// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a NAS Mount Target resource.
// For information about NAS Mount Target and how to use it, see [Manage NAS Mount Targets](https://www.alibabacloud.com/help/en/doc-detail/27531.htm).
//
// > **NOTE:** Available since v1.34.0.
//
// ## Import
//
// NAS MountTarget can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:nas/mountTarget:MountTarget foo 192094b415:192094b415-luw38.cn-beijing.nas.aliyuncs.com
//
// ```
type MountTarget struct {
	pulumi.CustomResourceState

	// The name of the permission group that applies to the mount target.
	AccessGroupName pulumi.StringPtrOutput `pulumi:"accessGroupName"`
	// The ID of the file system.
	FileSystemId pulumi.StringOutput `pulumi:"fileSystemId"`
	// The IPv4 domain name of the mount target. **NOTE:** Available since v1.161.0.
	MountTargetDomain pulumi.StringOutput `pulumi:"mountTargetDomain"`
	// mount target network type. Valid values: `VPC`. The classic network's mount targets are not supported.
	NetworkType pulumi.StringOutput `pulumi:"networkType"`
	// The ID of security group.
	SecurityGroupId pulumi.StringPtrOutput `pulumi:"securityGroupId"`
	// Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
	Status pulumi.StringOutput `pulumi:"status"`
	// The ID of VPC.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
	// The ID of the VSwitch in the VPC where the mount target resides.
	VswitchId pulumi.StringPtrOutput `pulumi:"vswitchId"`
}

// NewMountTarget registers a new resource with the given unique name, arguments, and options.
func NewMountTarget(ctx *pulumi.Context,
	name string, args *MountTargetArgs, opts ...pulumi.ResourceOption) (*MountTarget, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FileSystemId == nil {
		return nil, errors.New("invalid value for required argument 'FileSystemId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MountTarget
	err := ctx.RegisterResource("alicloud:nas/mountTarget:MountTarget", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMountTarget gets an existing MountTarget resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMountTarget(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MountTargetState, opts ...pulumi.ResourceOption) (*MountTarget, error) {
	var resource MountTarget
	err := ctx.ReadResource("alicloud:nas/mountTarget:MountTarget", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MountTarget resources.
type mountTargetState struct {
	// The name of the permission group that applies to the mount target.
	AccessGroupName *string `pulumi:"accessGroupName"`
	// The ID of the file system.
	FileSystemId *string `pulumi:"fileSystemId"`
	// The IPv4 domain name of the mount target. **NOTE:** Available since v1.161.0.
	MountTargetDomain *string `pulumi:"mountTargetDomain"`
	// mount target network type. Valid values: `VPC`. The classic network's mount targets are not supported.
	NetworkType *string `pulumi:"networkType"`
	// The ID of security group.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
	Status *string `pulumi:"status"`
	// The ID of VPC.
	VpcId *string `pulumi:"vpcId"`
	// The ID of the VSwitch in the VPC where the mount target resides.
	VswitchId *string `pulumi:"vswitchId"`
}

type MountTargetState struct {
	// The name of the permission group that applies to the mount target.
	AccessGroupName pulumi.StringPtrInput
	// The ID of the file system.
	FileSystemId pulumi.StringPtrInput
	// The IPv4 domain name of the mount target. **NOTE:** Available since v1.161.0.
	MountTargetDomain pulumi.StringPtrInput
	// mount target network type. Valid values: `VPC`. The classic network's mount targets are not supported.
	NetworkType pulumi.StringPtrInput
	// The ID of security group.
	SecurityGroupId pulumi.StringPtrInput
	// Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
	Status pulumi.StringPtrInput
	// The ID of VPC.
	VpcId pulumi.StringPtrInput
	// The ID of the VSwitch in the VPC where the mount target resides.
	VswitchId pulumi.StringPtrInput
}

func (MountTargetState) ElementType() reflect.Type {
	return reflect.TypeOf((*mountTargetState)(nil)).Elem()
}

type mountTargetArgs struct {
	// The name of the permission group that applies to the mount target.
	AccessGroupName *string `pulumi:"accessGroupName"`
	// The ID of the file system.
	FileSystemId string `pulumi:"fileSystemId"`
	// mount target network type. Valid values: `VPC`. The classic network's mount targets are not supported.
	NetworkType *string `pulumi:"networkType"`
	// The ID of security group.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
	Status *string `pulumi:"status"`
	// The ID of VPC.
	VpcId *string `pulumi:"vpcId"`
	// The ID of the VSwitch in the VPC where the mount target resides.
	VswitchId *string `pulumi:"vswitchId"`
}

// The set of arguments for constructing a MountTarget resource.
type MountTargetArgs struct {
	// The name of the permission group that applies to the mount target.
	AccessGroupName pulumi.StringPtrInput
	// The ID of the file system.
	FileSystemId pulumi.StringInput
	// mount target network type. Valid values: `VPC`. The classic network's mount targets are not supported.
	NetworkType pulumi.StringPtrInput
	// The ID of security group.
	SecurityGroupId pulumi.StringPtrInput
	// Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
	Status pulumi.StringPtrInput
	// The ID of VPC.
	VpcId pulumi.StringPtrInput
	// The ID of the VSwitch in the VPC where the mount target resides.
	VswitchId pulumi.StringPtrInput
}

func (MountTargetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mountTargetArgs)(nil)).Elem()
}

type MountTargetInput interface {
	pulumi.Input

	ToMountTargetOutput() MountTargetOutput
	ToMountTargetOutputWithContext(ctx context.Context) MountTargetOutput
}

func (*MountTarget) ElementType() reflect.Type {
	return reflect.TypeOf((**MountTarget)(nil)).Elem()
}

func (i *MountTarget) ToMountTargetOutput() MountTargetOutput {
	return i.ToMountTargetOutputWithContext(context.Background())
}

func (i *MountTarget) ToMountTargetOutputWithContext(ctx context.Context) MountTargetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MountTargetOutput)
}

func (i *MountTarget) ToOutput(ctx context.Context) pulumix.Output[*MountTarget] {
	return pulumix.Output[*MountTarget]{
		OutputState: i.ToMountTargetOutputWithContext(ctx).OutputState,
	}
}

// MountTargetArrayInput is an input type that accepts MountTargetArray and MountTargetArrayOutput values.
// You can construct a concrete instance of `MountTargetArrayInput` via:
//
//	MountTargetArray{ MountTargetArgs{...} }
type MountTargetArrayInput interface {
	pulumi.Input

	ToMountTargetArrayOutput() MountTargetArrayOutput
	ToMountTargetArrayOutputWithContext(context.Context) MountTargetArrayOutput
}

type MountTargetArray []MountTargetInput

func (MountTargetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MountTarget)(nil)).Elem()
}

func (i MountTargetArray) ToMountTargetArrayOutput() MountTargetArrayOutput {
	return i.ToMountTargetArrayOutputWithContext(context.Background())
}

func (i MountTargetArray) ToMountTargetArrayOutputWithContext(ctx context.Context) MountTargetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MountTargetArrayOutput)
}

func (i MountTargetArray) ToOutput(ctx context.Context) pulumix.Output[[]*MountTarget] {
	return pulumix.Output[[]*MountTarget]{
		OutputState: i.ToMountTargetArrayOutputWithContext(ctx).OutputState,
	}
}

// MountTargetMapInput is an input type that accepts MountTargetMap and MountTargetMapOutput values.
// You can construct a concrete instance of `MountTargetMapInput` via:
//
//	MountTargetMap{ "key": MountTargetArgs{...} }
type MountTargetMapInput interface {
	pulumi.Input

	ToMountTargetMapOutput() MountTargetMapOutput
	ToMountTargetMapOutputWithContext(context.Context) MountTargetMapOutput
}

type MountTargetMap map[string]MountTargetInput

func (MountTargetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MountTarget)(nil)).Elem()
}

func (i MountTargetMap) ToMountTargetMapOutput() MountTargetMapOutput {
	return i.ToMountTargetMapOutputWithContext(context.Background())
}

func (i MountTargetMap) ToMountTargetMapOutputWithContext(ctx context.Context) MountTargetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MountTargetMapOutput)
}

func (i MountTargetMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*MountTarget] {
	return pulumix.Output[map[string]*MountTarget]{
		OutputState: i.ToMountTargetMapOutputWithContext(ctx).OutputState,
	}
}

type MountTargetOutput struct{ *pulumi.OutputState }

func (MountTargetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MountTarget)(nil)).Elem()
}

func (o MountTargetOutput) ToMountTargetOutput() MountTargetOutput {
	return o
}

func (o MountTargetOutput) ToMountTargetOutputWithContext(ctx context.Context) MountTargetOutput {
	return o
}

func (o MountTargetOutput) ToOutput(ctx context.Context) pulumix.Output[*MountTarget] {
	return pulumix.Output[*MountTarget]{
		OutputState: o.OutputState,
	}
}

// The name of the permission group that applies to the mount target.
func (o MountTargetOutput) AccessGroupName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringPtrOutput { return v.AccessGroupName }).(pulumi.StringPtrOutput)
}

// The ID of the file system.
func (o MountTargetOutput) FileSystemId() pulumi.StringOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringOutput { return v.FileSystemId }).(pulumi.StringOutput)
}

// The IPv4 domain name of the mount target. **NOTE:** Available since v1.161.0.
func (o MountTargetOutput) MountTargetDomain() pulumi.StringOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringOutput { return v.MountTargetDomain }).(pulumi.StringOutput)
}

// mount target network type. Valid values: `VPC`. The classic network's mount targets are not supported.
func (o MountTargetOutput) NetworkType() pulumi.StringOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringOutput { return v.NetworkType }).(pulumi.StringOutput)
}

// The ID of security group.
func (o MountTargetOutput) SecurityGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringPtrOutput { return v.SecurityGroupId }).(pulumi.StringPtrOutput)
}

// Whether the MountTarget is active. The status of the mount target. Valid values: `Active` and `Inactive`, Default value is `Active`. Before you mount a file system, make sure that the mount target is in the Active state.
func (o MountTargetOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The ID of VPC.
func (o MountTargetOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

// The ID of the VSwitch in the VPC where the mount target resides.
func (o MountTargetOutput) VswitchId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MountTarget) pulumi.StringPtrOutput { return v.VswitchId }).(pulumi.StringPtrOutput)
}

type MountTargetArrayOutput struct{ *pulumi.OutputState }

func (MountTargetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MountTarget)(nil)).Elem()
}

func (o MountTargetArrayOutput) ToMountTargetArrayOutput() MountTargetArrayOutput {
	return o
}

func (o MountTargetArrayOutput) ToMountTargetArrayOutputWithContext(ctx context.Context) MountTargetArrayOutput {
	return o
}

func (o MountTargetArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*MountTarget] {
	return pulumix.Output[[]*MountTarget]{
		OutputState: o.OutputState,
	}
}

func (o MountTargetArrayOutput) Index(i pulumi.IntInput) MountTargetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MountTarget {
		return vs[0].([]*MountTarget)[vs[1].(int)]
	}).(MountTargetOutput)
}

type MountTargetMapOutput struct{ *pulumi.OutputState }

func (MountTargetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MountTarget)(nil)).Elem()
}

func (o MountTargetMapOutput) ToMountTargetMapOutput() MountTargetMapOutput {
	return o
}

func (o MountTargetMapOutput) ToMountTargetMapOutputWithContext(ctx context.Context) MountTargetMapOutput {
	return o
}

func (o MountTargetMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*MountTarget] {
	return pulumix.Output[map[string]*MountTarget]{
		OutputState: o.OutputState,
	}
}

func (o MountTargetMapOutput) MapIndex(k pulumi.StringInput) MountTargetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MountTarget {
		return vs[0].(map[string]*MountTarget)[vs[1].(string)]
	}).(MountTargetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MountTargetInput)(nil)).Elem(), &MountTarget{})
	pulumi.RegisterInputType(reflect.TypeOf((*MountTargetArrayInput)(nil)).Elem(), MountTargetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MountTargetMapInput)(nil)).Elem(), MountTargetMap{})
	pulumi.RegisterOutputType(MountTargetOutput{})
	pulumi.RegisterOutputType(MountTargetArrayOutput{})
	pulumi.RegisterOutputType(MountTargetMapOutput{})
}
