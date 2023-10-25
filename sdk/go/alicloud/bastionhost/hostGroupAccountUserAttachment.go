// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bastionhost

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Bastion Host Host Account Attachment resource to add list host accounts into one user and one host group.
//
// > **NOTE:** Available since v1.135.0.
//
// ## Import
//
// Bastion Host Host Account can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:bastionhost/hostGroupAccountUserAttachment:HostGroupAccountUserAttachment example <instance_id>:<user_id>:<host_group_id>
//
// ```
type HostGroupAccountUserAttachment struct {
	pulumi.CustomResourceState

	// A list names of the host account.
	HostAccountNames pulumi.StringArrayOutput `pulumi:"hostAccountNames"`
	// The ID of the host group.
	HostGroupId pulumi.StringOutput `pulumi:"hostGroupId"`
	// The ID of the Bastionhost instance where you want to authorize the user to manage the specified hosts and host accounts.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The ID of the user that you want to authorize to manage the specified hosts and host accounts.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewHostGroupAccountUserAttachment registers a new resource with the given unique name, arguments, and options.
func NewHostGroupAccountUserAttachment(ctx *pulumi.Context,
	name string, args *HostGroupAccountUserAttachmentArgs, opts ...pulumi.ResourceOption) (*HostGroupAccountUserAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.HostAccountNames == nil {
		return nil, errors.New("invalid value for required argument 'HostAccountNames'")
	}
	if args.HostGroupId == nil {
		return nil, errors.New("invalid value for required argument 'HostGroupId'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HostGroupAccountUserAttachment
	err := ctx.RegisterResource("alicloud:bastionhost/hostGroupAccountUserAttachment:HostGroupAccountUserAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHostGroupAccountUserAttachment gets an existing HostGroupAccountUserAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHostGroupAccountUserAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HostGroupAccountUserAttachmentState, opts ...pulumi.ResourceOption) (*HostGroupAccountUserAttachment, error) {
	var resource HostGroupAccountUserAttachment
	err := ctx.ReadResource("alicloud:bastionhost/hostGroupAccountUserAttachment:HostGroupAccountUserAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HostGroupAccountUserAttachment resources.
type hostGroupAccountUserAttachmentState struct {
	// A list names of the host account.
	HostAccountNames []string `pulumi:"hostAccountNames"`
	// The ID of the host group.
	HostGroupId *string `pulumi:"hostGroupId"`
	// The ID of the Bastionhost instance where you want to authorize the user to manage the specified hosts and host accounts.
	InstanceId *string `pulumi:"instanceId"`
	// The ID of the user that you want to authorize to manage the specified hosts and host accounts.
	UserId *string `pulumi:"userId"`
}

type HostGroupAccountUserAttachmentState struct {
	// A list names of the host account.
	HostAccountNames pulumi.StringArrayInput
	// The ID of the host group.
	HostGroupId pulumi.StringPtrInput
	// The ID of the Bastionhost instance where you want to authorize the user to manage the specified hosts and host accounts.
	InstanceId pulumi.StringPtrInput
	// The ID of the user that you want to authorize to manage the specified hosts and host accounts.
	UserId pulumi.StringPtrInput
}

func (HostGroupAccountUserAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*hostGroupAccountUserAttachmentState)(nil)).Elem()
}

type hostGroupAccountUserAttachmentArgs struct {
	// A list names of the host account.
	HostAccountNames []string `pulumi:"hostAccountNames"`
	// The ID of the host group.
	HostGroupId string `pulumi:"hostGroupId"`
	// The ID of the Bastionhost instance where you want to authorize the user to manage the specified hosts and host accounts.
	InstanceId string `pulumi:"instanceId"`
	// The ID of the user that you want to authorize to manage the specified hosts and host accounts.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a HostGroupAccountUserAttachment resource.
type HostGroupAccountUserAttachmentArgs struct {
	// A list names of the host account.
	HostAccountNames pulumi.StringArrayInput
	// The ID of the host group.
	HostGroupId pulumi.StringInput
	// The ID of the Bastionhost instance where you want to authorize the user to manage the specified hosts and host accounts.
	InstanceId pulumi.StringInput
	// The ID of the user that you want to authorize to manage the specified hosts and host accounts.
	UserId pulumi.StringInput
}

func (HostGroupAccountUserAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hostGroupAccountUserAttachmentArgs)(nil)).Elem()
}

type HostGroupAccountUserAttachmentInput interface {
	pulumi.Input

	ToHostGroupAccountUserAttachmentOutput() HostGroupAccountUserAttachmentOutput
	ToHostGroupAccountUserAttachmentOutputWithContext(ctx context.Context) HostGroupAccountUserAttachmentOutput
}

func (*HostGroupAccountUserAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**HostGroupAccountUserAttachment)(nil)).Elem()
}

func (i *HostGroupAccountUserAttachment) ToHostGroupAccountUserAttachmentOutput() HostGroupAccountUserAttachmentOutput {
	return i.ToHostGroupAccountUserAttachmentOutputWithContext(context.Background())
}

func (i *HostGroupAccountUserAttachment) ToHostGroupAccountUserAttachmentOutputWithContext(ctx context.Context) HostGroupAccountUserAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostGroupAccountUserAttachmentOutput)
}

func (i *HostGroupAccountUserAttachment) ToOutput(ctx context.Context) pulumix.Output[*HostGroupAccountUserAttachment] {
	return pulumix.Output[*HostGroupAccountUserAttachment]{
		OutputState: i.ToHostGroupAccountUserAttachmentOutputWithContext(ctx).OutputState,
	}
}

// HostGroupAccountUserAttachmentArrayInput is an input type that accepts HostGroupAccountUserAttachmentArray and HostGroupAccountUserAttachmentArrayOutput values.
// You can construct a concrete instance of `HostGroupAccountUserAttachmentArrayInput` via:
//
//	HostGroupAccountUserAttachmentArray{ HostGroupAccountUserAttachmentArgs{...} }
type HostGroupAccountUserAttachmentArrayInput interface {
	pulumi.Input

	ToHostGroupAccountUserAttachmentArrayOutput() HostGroupAccountUserAttachmentArrayOutput
	ToHostGroupAccountUserAttachmentArrayOutputWithContext(context.Context) HostGroupAccountUserAttachmentArrayOutput
}

type HostGroupAccountUserAttachmentArray []HostGroupAccountUserAttachmentInput

func (HostGroupAccountUserAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostGroupAccountUserAttachment)(nil)).Elem()
}

func (i HostGroupAccountUserAttachmentArray) ToHostGroupAccountUserAttachmentArrayOutput() HostGroupAccountUserAttachmentArrayOutput {
	return i.ToHostGroupAccountUserAttachmentArrayOutputWithContext(context.Background())
}

func (i HostGroupAccountUserAttachmentArray) ToHostGroupAccountUserAttachmentArrayOutputWithContext(ctx context.Context) HostGroupAccountUserAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostGroupAccountUserAttachmentArrayOutput)
}

func (i HostGroupAccountUserAttachmentArray) ToOutput(ctx context.Context) pulumix.Output[[]*HostGroupAccountUserAttachment] {
	return pulumix.Output[[]*HostGroupAccountUserAttachment]{
		OutputState: i.ToHostGroupAccountUserAttachmentArrayOutputWithContext(ctx).OutputState,
	}
}

// HostGroupAccountUserAttachmentMapInput is an input type that accepts HostGroupAccountUserAttachmentMap and HostGroupAccountUserAttachmentMapOutput values.
// You can construct a concrete instance of `HostGroupAccountUserAttachmentMapInput` via:
//
//	HostGroupAccountUserAttachmentMap{ "key": HostGroupAccountUserAttachmentArgs{...} }
type HostGroupAccountUserAttachmentMapInput interface {
	pulumi.Input

	ToHostGroupAccountUserAttachmentMapOutput() HostGroupAccountUserAttachmentMapOutput
	ToHostGroupAccountUserAttachmentMapOutputWithContext(context.Context) HostGroupAccountUserAttachmentMapOutput
}

type HostGroupAccountUserAttachmentMap map[string]HostGroupAccountUserAttachmentInput

func (HostGroupAccountUserAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostGroupAccountUserAttachment)(nil)).Elem()
}

func (i HostGroupAccountUserAttachmentMap) ToHostGroupAccountUserAttachmentMapOutput() HostGroupAccountUserAttachmentMapOutput {
	return i.ToHostGroupAccountUserAttachmentMapOutputWithContext(context.Background())
}

func (i HostGroupAccountUserAttachmentMap) ToHostGroupAccountUserAttachmentMapOutputWithContext(ctx context.Context) HostGroupAccountUserAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostGroupAccountUserAttachmentMapOutput)
}

func (i HostGroupAccountUserAttachmentMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*HostGroupAccountUserAttachment] {
	return pulumix.Output[map[string]*HostGroupAccountUserAttachment]{
		OutputState: i.ToHostGroupAccountUserAttachmentMapOutputWithContext(ctx).OutputState,
	}
}

type HostGroupAccountUserAttachmentOutput struct{ *pulumi.OutputState }

func (HostGroupAccountUserAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HostGroupAccountUserAttachment)(nil)).Elem()
}

func (o HostGroupAccountUserAttachmentOutput) ToHostGroupAccountUserAttachmentOutput() HostGroupAccountUserAttachmentOutput {
	return o
}

func (o HostGroupAccountUserAttachmentOutput) ToHostGroupAccountUserAttachmentOutputWithContext(ctx context.Context) HostGroupAccountUserAttachmentOutput {
	return o
}

func (o HostGroupAccountUserAttachmentOutput) ToOutput(ctx context.Context) pulumix.Output[*HostGroupAccountUserAttachment] {
	return pulumix.Output[*HostGroupAccountUserAttachment]{
		OutputState: o.OutputState,
	}
}

// A list names of the host account.
func (o HostGroupAccountUserAttachmentOutput) HostAccountNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *HostGroupAccountUserAttachment) pulumi.StringArrayOutput { return v.HostAccountNames }).(pulumi.StringArrayOutput)
}

// The ID of the host group.
func (o HostGroupAccountUserAttachmentOutput) HostGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *HostGroupAccountUserAttachment) pulumi.StringOutput { return v.HostGroupId }).(pulumi.StringOutput)
}

// The ID of the Bastionhost instance where you want to authorize the user to manage the specified hosts and host accounts.
func (o HostGroupAccountUserAttachmentOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *HostGroupAccountUserAttachment) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The ID of the user that you want to authorize to manage the specified hosts and host accounts.
func (o HostGroupAccountUserAttachmentOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *HostGroupAccountUserAttachment) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type HostGroupAccountUserAttachmentArrayOutput struct{ *pulumi.OutputState }

func (HostGroupAccountUserAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostGroupAccountUserAttachment)(nil)).Elem()
}

func (o HostGroupAccountUserAttachmentArrayOutput) ToHostGroupAccountUserAttachmentArrayOutput() HostGroupAccountUserAttachmentArrayOutput {
	return o
}

func (o HostGroupAccountUserAttachmentArrayOutput) ToHostGroupAccountUserAttachmentArrayOutputWithContext(ctx context.Context) HostGroupAccountUserAttachmentArrayOutput {
	return o
}

func (o HostGroupAccountUserAttachmentArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*HostGroupAccountUserAttachment] {
	return pulumix.Output[[]*HostGroupAccountUserAttachment]{
		OutputState: o.OutputState,
	}
}

func (o HostGroupAccountUserAttachmentArrayOutput) Index(i pulumi.IntInput) HostGroupAccountUserAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HostGroupAccountUserAttachment {
		return vs[0].([]*HostGroupAccountUserAttachment)[vs[1].(int)]
	}).(HostGroupAccountUserAttachmentOutput)
}

type HostGroupAccountUserAttachmentMapOutput struct{ *pulumi.OutputState }

func (HostGroupAccountUserAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostGroupAccountUserAttachment)(nil)).Elem()
}

func (o HostGroupAccountUserAttachmentMapOutput) ToHostGroupAccountUserAttachmentMapOutput() HostGroupAccountUserAttachmentMapOutput {
	return o
}

func (o HostGroupAccountUserAttachmentMapOutput) ToHostGroupAccountUserAttachmentMapOutputWithContext(ctx context.Context) HostGroupAccountUserAttachmentMapOutput {
	return o
}

func (o HostGroupAccountUserAttachmentMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*HostGroupAccountUserAttachment] {
	return pulumix.Output[map[string]*HostGroupAccountUserAttachment]{
		OutputState: o.OutputState,
	}
}

func (o HostGroupAccountUserAttachmentMapOutput) MapIndex(k pulumi.StringInput) HostGroupAccountUserAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HostGroupAccountUserAttachment {
		return vs[0].(map[string]*HostGroupAccountUserAttachment)[vs[1].(string)]
	}).(HostGroupAccountUserAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HostGroupAccountUserAttachmentInput)(nil)).Elem(), &HostGroupAccountUserAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostGroupAccountUserAttachmentArrayInput)(nil)).Elem(), HostGroupAccountUserAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostGroupAccountUserAttachmentMapInput)(nil)).Elem(), HostGroupAccountUserAttachmentMap{})
	pulumi.RegisterOutputType(HostGroupAccountUserAttachmentOutput{})
	pulumi.RegisterOutputType(HostGroupAccountUserAttachmentArrayOutput{})
	pulumi.RegisterOutputType(HostGroupAccountUserAttachmentMapOutput{})
}
