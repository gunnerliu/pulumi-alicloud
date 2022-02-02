// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// The disk attachment can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ecs/diskAttachment:DiskAttachment example d-abc12345678:i-abc12355
// ```
type DiskAttachment struct {
	pulumi.CustomResourceState

	Bootable           pulumi.BoolPtrOutput `pulumi:"bootable"`
	DeleteWithInstance pulumi.BoolPtrOutput `pulumi:"deleteWithInstance"`
	Device             pulumi.StringOutput  `pulumi:"device"`
	// ID of the Disk to be attached.
	DiskId pulumi.StringOutput `pulumi:"diskId"`
	// ID of the Instance to attach to.
	InstanceId  pulumi.StringOutput    `pulumi:"instanceId"`
	KeyPairName pulumi.StringPtrOutput `pulumi:"keyPairName"`
	Password    pulumi.StringPtrOutput `pulumi:"password"`
}

// NewDiskAttachment registers a new resource with the given unique name, arguments, and options.
func NewDiskAttachment(ctx *pulumi.Context,
	name string, args *DiskAttachmentArgs, opts ...pulumi.ResourceOption) (*DiskAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DiskId == nil {
		return nil, errors.New("invalid value for required argument 'DiskId'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	var resource DiskAttachment
	err := ctx.RegisterResource("alicloud:ecs/diskAttachment:DiskAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDiskAttachment gets an existing DiskAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDiskAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DiskAttachmentState, opts ...pulumi.ResourceOption) (*DiskAttachment, error) {
	var resource DiskAttachment
	err := ctx.ReadResource("alicloud:ecs/diskAttachment:DiskAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DiskAttachment resources.
type diskAttachmentState struct {
	Bootable           *bool   `pulumi:"bootable"`
	DeleteWithInstance *bool   `pulumi:"deleteWithInstance"`
	Device             *string `pulumi:"device"`
	// ID of the Disk to be attached.
	DiskId *string `pulumi:"diskId"`
	// ID of the Instance to attach to.
	InstanceId  *string `pulumi:"instanceId"`
	KeyPairName *string `pulumi:"keyPairName"`
	Password    *string `pulumi:"password"`
}

type DiskAttachmentState struct {
	Bootable           pulumi.BoolPtrInput
	DeleteWithInstance pulumi.BoolPtrInput
	Device             pulumi.StringPtrInput
	// ID of the Disk to be attached.
	DiskId pulumi.StringPtrInput
	// ID of the Instance to attach to.
	InstanceId  pulumi.StringPtrInput
	KeyPairName pulumi.StringPtrInput
	Password    pulumi.StringPtrInput
}

func (DiskAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*diskAttachmentState)(nil)).Elem()
}

type diskAttachmentArgs struct {
	Bootable           *bool `pulumi:"bootable"`
	DeleteWithInstance *bool `pulumi:"deleteWithInstance"`
	// ID of the Disk to be attached.
	DiskId string `pulumi:"diskId"`
	// ID of the Instance to attach to.
	InstanceId  string  `pulumi:"instanceId"`
	KeyPairName *string `pulumi:"keyPairName"`
	Password    *string `pulumi:"password"`
}

// The set of arguments for constructing a DiskAttachment resource.
type DiskAttachmentArgs struct {
	Bootable           pulumi.BoolPtrInput
	DeleteWithInstance pulumi.BoolPtrInput
	// ID of the Disk to be attached.
	DiskId pulumi.StringInput
	// ID of the Instance to attach to.
	InstanceId  pulumi.StringInput
	KeyPairName pulumi.StringPtrInput
	Password    pulumi.StringPtrInput
}

func (DiskAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*diskAttachmentArgs)(nil)).Elem()
}

type DiskAttachmentInput interface {
	pulumi.Input

	ToDiskAttachmentOutput() DiskAttachmentOutput
	ToDiskAttachmentOutputWithContext(ctx context.Context) DiskAttachmentOutput
}

func (*DiskAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**DiskAttachment)(nil)).Elem()
}

func (i *DiskAttachment) ToDiskAttachmentOutput() DiskAttachmentOutput {
	return i.ToDiskAttachmentOutputWithContext(context.Background())
}

func (i *DiskAttachment) ToDiskAttachmentOutputWithContext(ctx context.Context) DiskAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskAttachmentOutput)
}

// DiskAttachmentArrayInput is an input type that accepts DiskAttachmentArray and DiskAttachmentArrayOutput values.
// You can construct a concrete instance of `DiskAttachmentArrayInput` via:
//
//          DiskAttachmentArray{ DiskAttachmentArgs{...} }
type DiskAttachmentArrayInput interface {
	pulumi.Input

	ToDiskAttachmentArrayOutput() DiskAttachmentArrayOutput
	ToDiskAttachmentArrayOutputWithContext(context.Context) DiskAttachmentArrayOutput
}

type DiskAttachmentArray []DiskAttachmentInput

func (DiskAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DiskAttachment)(nil)).Elem()
}

func (i DiskAttachmentArray) ToDiskAttachmentArrayOutput() DiskAttachmentArrayOutput {
	return i.ToDiskAttachmentArrayOutputWithContext(context.Background())
}

func (i DiskAttachmentArray) ToDiskAttachmentArrayOutputWithContext(ctx context.Context) DiskAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskAttachmentArrayOutput)
}

// DiskAttachmentMapInput is an input type that accepts DiskAttachmentMap and DiskAttachmentMapOutput values.
// You can construct a concrete instance of `DiskAttachmentMapInput` via:
//
//          DiskAttachmentMap{ "key": DiskAttachmentArgs{...} }
type DiskAttachmentMapInput interface {
	pulumi.Input

	ToDiskAttachmentMapOutput() DiskAttachmentMapOutput
	ToDiskAttachmentMapOutputWithContext(context.Context) DiskAttachmentMapOutput
}

type DiskAttachmentMap map[string]DiskAttachmentInput

func (DiskAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DiskAttachment)(nil)).Elem()
}

func (i DiskAttachmentMap) ToDiskAttachmentMapOutput() DiskAttachmentMapOutput {
	return i.ToDiskAttachmentMapOutputWithContext(context.Background())
}

func (i DiskAttachmentMap) ToDiskAttachmentMapOutputWithContext(ctx context.Context) DiskAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskAttachmentMapOutput)
}

type DiskAttachmentOutput struct{ *pulumi.OutputState }

func (DiskAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DiskAttachment)(nil)).Elem()
}

func (o DiskAttachmentOutput) ToDiskAttachmentOutput() DiskAttachmentOutput {
	return o
}

func (o DiskAttachmentOutput) ToDiskAttachmentOutputWithContext(ctx context.Context) DiskAttachmentOutput {
	return o
}

type DiskAttachmentArrayOutput struct{ *pulumi.OutputState }

func (DiskAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DiskAttachment)(nil)).Elem()
}

func (o DiskAttachmentArrayOutput) ToDiskAttachmentArrayOutput() DiskAttachmentArrayOutput {
	return o
}

func (o DiskAttachmentArrayOutput) ToDiskAttachmentArrayOutputWithContext(ctx context.Context) DiskAttachmentArrayOutput {
	return o
}

func (o DiskAttachmentArrayOutput) Index(i pulumi.IntInput) DiskAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DiskAttachment {
		return vs[0].([]*DiskAttachment)[vs[1].(int)]
	}).(DiskAttachmentOutput)
}

type DiskAttachmentMapOutput struct{ *pulumi.OutputState }

func (DiskAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DiskAttachment)(nil)).Elem()
}

func (o DiskAttachmentMapOutput) ToDiskAttachmentMapOutput() DiskAttachmentMapOutput {
	return o
}

func (o DiskAttachmentMapOutput) ToDiskAttachmentMapOutputWithContext(ctx context.Context) DiskAttachmentMapOutput {
	return o
}

func (o DiskAttachmentMapOutput) MapIndex(k pulumi.StringInput) DiskAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DiskAttachment {
		return vs[0].(map[string]*DiskAttachment)[vs[1].(string)]
	}).(DiskAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DiskAttachmentInput)(nil)).Elem(), &DiskAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskAttachmentArrayInput)(nil)).Elem(), DiskAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskAttachmentMapInput)(nil)).Elem(), DiskAttachmentMap{})
	pulumi.RegisterOutputType(DiskAttachmentOutput{})
	pulumi.RegisterOutputType(DiskAttachmentArrayOutput{})
	pulumi.RegisterOutputType(DiskAttachmentMapOutput{})
}
