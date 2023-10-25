// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ess

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Attaches several ECS instances to a specified scaling group or remove them from it.
//
// > **NOTE:** ECS instances can be attached or remove only when the scaling group is active, and it has no scaling activity in progress.
//
// > **NOTE:** There are two types ECS instances in a scaling group: "AutoCreated" and "Attached". The total number of them can not larger than the scaling group "MaxSize".
//
// > **NOTE:** Available since v1.6.0.
//
// ## Import
//
// ESS attachment can be imported using the id or scaling group id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ess/attachment:Attachment example asg-abc123456
//
// ```
type Attachment struct {
	pulumi.CustomResourceState

	// Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
	//
	// > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.
	//
	// > **NOTE:** Restrictions on attaching ECS instances:
	//
	// - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
	// - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
	// - The attached ECS instances must in the running state.
	// - The attached ECS instances has not been attached to other scaling groups.
	// - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
	Force pulumi.BoolPtrOutput `pulumi:"force"`
	// ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
	InstanceIds pulumi.StringArrayOutput `pulumi:"instanceIds"`
	// ID of the scaling group of a scaling configuration.
	ScalingGroupId pulumi.StringOutput `pulumi:"scalingGroupId"`
}

// NewAttachment registers a new resource with the given unique name, arguments, and options.
func NewAttachment(ctx *pulumi.Context,
	name string, args *AttachmentArgs, opts ...pulumi.ResourceOption) (*Attachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceIds == nil {
		return nil, errors.New("invalid value for required argument 'InstanceIds'")
	}
	if args.ScalingGroupId == nil {
		return nil, errors.New("invalid value for required argument 'ScalingGroupId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Attachment
	err := ctx.RegisterResource("alicloud:ess/attachment:Attachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAttachment gets an existing Attachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AttachmentState, opts ...pulumi.ResourceOption) (*Attachment, error) {
	var resource Attachment
	err := ctx.ReadResource("alicloud:ess/attachment:Attachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Attachment resources.
type attachmentState struct {
	// Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
	//
	// > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.
	//
	// > **NOTE:** Restrictions on attaching ECS instances:
	//
	// - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
	// - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
	// - The attached ECS instances must in the running state.
	// - The attached ECS instances has not been attached to other scaling groups.
	// - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
	Force *bool `pulumi:"force"`
	// ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
	InstanceIds []string `pulumi:"instanceIds"`
	// ID of the scaling group of a scaling configuration.
	ScalingGroupId *string `pulumi:"scalingGroupId"`
}

type AttachmentState struct {
	// Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
	//
	// > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.
	//
	// > **NOTE:** Restrictions on attaching ECS instances:
	//
	// - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
	// - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
	// - The attached ECS instances must in the running state.
	// - The attached ECS instances has not been attached to other scaling groups.
	// - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
	Force pulumi.BoolPtrInput
	// ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
	InstanceIds pulumi.StringArrayInput
	// ID of the scaling group of a scaling configuration.
	ScalingGroupId pulumi.StringPtrInput
}

func (AttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*attachmentState)(nil)).Elem()
}

type attachmentArgs struct {
	// Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
	//
	// > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.
	//
	// > **NOTE:** Restrictions on attaching ECS instances:
	//
	// - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
	// - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
	// - The attached ECS instances must in the running state.
	// - The attached ECS instances has not been attached to other scaling groups.
	// - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
	Force *bool `pulumi:"force"`
	// ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
	InstanceIds []string `pulumi:"instanceIds"`
	// ID of the scaling group of a scaling configuration.
	ScalingGroupId string `pulumi:"scalingGroupId"`
}

// The set of arguments for constructing a Attachment resource.
type AttachmentArgs struct {
	// Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
	//
	// > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.
	//
	// > **NOTE:** Restrictions on attaching ECS instances:
	//
	// - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
	// - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
	// - The attached ECS instances must in the running state.
	// - The attached ECS instances has not been attached to other scaling groups.
	// - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
	Force pulumi.BoolPtrInput
	// ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
	InstanceIds pulumi.StringArrayInput
	// ID of the scaling group of a scaling configuration.
	ScalingGroupId pulumi.StringInput
}

func (AttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*attachmentArgs)(nil)).Elem()
}

type AttachmentInput interface {
	pulumi.Input

	ToAttachmentOutput() AttachmentOutput
	ToAttachmentOutputWithContext(ctx context.Context) AttachmentOutput
}

func (*Attachment) ElementType() reflect.Type {
	return reflect.TypeOf((**Attachment)(nil)).Elem()
}

func (i *Attachment) ToAttachmentOutput() AttachmentOutput {
	return i.ToAttachmentOutputWithContext(context.Background())
}

func (i *Attachment) ToAttachmentOutputWithContext(ctx context.Context) AttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AttachmentOutput)
}

func (i *Attachment) ToOutput(ctx context.Context) pulumix.Output[*Attachment] {
	return pulumix.Output[*Attachment]{
		OutputState: i.ToAttachmentOutputWithContext(ctx).OutputState,
	}
}

// AttachmentArrayInput is an input type that accepts AttachmentArray and AttachmentArrayOutput values.
// You can construct a concrete instance of `AttachmentArrayInput` via:
//
//	AttachmentArray{ AttachmentArgs{...} }
type AttachmentArrayInput interface {
	pulumi.Input

	ToAttachmentArrayOutput() AttachmentArrayOutput
	ToAttachmentArrayOutputWithContext(context.Context) AttachmentArrayOutput
}

type AttachmentArray []AttachmentInput

func (AttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Attachment)(nil)).Elem()
}

func (i AttachmentArray) ToAttachmentArrayOutput() AttachmentArrayOutput {
	return i.ToAttachmentArrayOutputWithContext(context.Background())
}

func (i AttachmentArray) ToAttachmentArrayOutputWithContext(ctx context.Context) AttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AttachmentArrayOutput)
}

func (i AttachmentArray) ToOutput(ctx context.Context) pulumix.Output[[]*Attachment] {
	return pulumix.Output[[]*Attachment]{
		OutputState: i.ToAttachmentArrayOutputWithContext(ctx).OutputState,
	}
}

// AttachmentMapInput is an input type that accepts AttachmentMap and AttachmentMapOutput values.
// You can construct a concrete instance of `AttachmentMapInput` via:
//
//	AttachmentMap{ "key": AttachmentArgs{...} }
type AttachmentMapInput interface {
	pulumi.Input

	ToAttachmentMapOutput() AttachmentMapOutput
	ToAttachmentMapOutputWithContext(context.Context) AttachmentMapOutput
}

type AttachmentMap map[string]AttachmentInput

func (AttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Attachment)(nil)).Elem()
}

func (i AttachmentMap) ToAttachmentMapOutput() AttachmentMapOutput {
	return i.ToAttachmentMapOutputWithContext(context.Background())
}

func (i AttachmentMap) ToAttachmentMapOutputWithContext(ctx context.Context) AttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AttachmentMapOutput)
}

func (i AttachmentMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Attachment] {
	return pulumix.Output[map[string]*Attachment]{
		OutputState: i.ToAttachmentMapOutputWithContext(ctx).OutputState,
	}
}

type AttachmentOutput struct{ *pulumi.OutputState }

func (AttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Attachment)(nil)).Elem()
}

func (o AttachmentOutput) ToAttachmentOutput() AttachmentOutput {
	return o
}

func (o AttachmentOutput) ToAttachmentOutputWithContext(ctx context.Context) AttachmentOutput {
	return o
}

func (o AttachmentOutput) ToOutput(ctx context.Context) pulumix.Output[*Attachment] {
	return pulumix.Output[*Attachment]{
		OutputState: o.OutputState,
	}
}

// Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
//
// > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.
//
// > **NOTE:** Restrictions on attaching ECS instances:
//
// - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
// - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
// - The attached ECS instances must in the running state.
// - The attached ECS instances has not been attached to other scaling groups.
// - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
func (o AttachmentOutput) Force() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Attachment) pulumi.BoolPtrOutput { return v.Force }).(pulumi.BoolPtrOutput)
}

// ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
func (o AttachmentOutput) InstanceIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Attachment) pulumi.StringArrayOutput { return v.InstanceIds }).(pulumi.StringArrayOutput)
}

// ID of the scaling group of a scaling configuration.
func (o AttachmentOutput) ScalingGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Attachment) pulumi.StringOutput { return v.ScalingGroupId }).(pulumi.StringOutput)
}

type AttachmentArrayOutput struct{ *pulumi.OutputState }

func (AttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Attachment)(nil)).Elem()
}

func (o AttachmentArrayOutput) ToAttachmentArrayOutput() AttachmentArrayOutput {
	return o
}

func (o AttachmentArrayOutput) ToAttachmentArrayOutputWithContext(ctx context.Context) AttachmentArrayOutput {
	return o
}

func (o AttachmentArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Attachment] {
	return pulumix.Output[[]*Attachment]{
		OutputState: o.OutputState,
	}
}

func (o AttachmentArrayOutput) Index(i pulumi.IntInput) AttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Attachment {
		return vs[0].([]*Attachment)[vs[1].(int)]
	}).(AttachmentOutput)
}

type AttachmentMapOutput struct{ *pulumi.OutputState }

func (AttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Attachment)(nil)).Elem()
}

func (o AttachmentMapOutput) ToAttachmentMapOutput() AttachmentMapOutput {
	return o
}

func (o AttachmentMapOutput) ToAttachmentMapOutputWithContext(ctx context.Context) AttachmentMapOutput {
	return o
}

func (o AttachmentMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Attachment] {
	return pulumix.Output[map[string]*Attachment]{
		OutputState: o.OutputState,
	}
}

func (o AttachmentMapOutput) MapIndex(k pulumi.StringInput) AttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Attachment {
		return vs[0].(map[string]*Attachment)[vs[1].(string)]
	}).(AttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AttachmentInput)(nil)).Elem(), &Attachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*AttachmentArrayInput)(nil)).Elem(), AttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AttachmentMapInput)(nil)).Elem(), AttachmentMap{})
	pulumi.RegisterOutputType(AttachmentOutput{})
	pulumi.RegisterOutputType(AttachmentArrayOutput{})
	pulumi.RegisterOutputType(AttachmentMapOutput{})
}
