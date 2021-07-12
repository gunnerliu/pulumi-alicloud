// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ECS Auto Snapshot Policy Attachment resource.
//
// For information about ECS Auto Snapshot Policy Attachment and how to use it, see [What is Auto Snapshot Policy Attachment](https://www.alibabacloud.com/help/en/doc-detail/25531.htm).
//
// > **NOTE:** Available in v1.122.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := ecs.NewEcsAutoSnapshotPolicyAttachment(ctx, "example", &ecs.EcsAutoSnapshotPolicyAttachmentArgs{
// 			AutoSnapshotPolicyId: pulumi.String("s-ge465xxxx"),
// 			DiskId:               pulumi.String("d-gw835xxxx"),
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
// ECS Auto Snapshot Policy Attachment can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ecs/ecsAutoSnapshotPolicyAttachment:EcsAutoSnapshotPolicyAttachment example s-abcd12345:d-abcd12345
// ```
type EcsAutoSnapshotPolicyAttachment struct {
	pulumi.CustomResourceState

	// The auto snapshot policy id.
	AutoSnapshotPolicyId pulumi.StringOutput `pulumi:"autoSnapshotPolicyId"`
	// The disk id.
	DiskId pulumi.StringOutput `pulumi:"diskId"`
}

// NewEcsAutoSnapshotPolicyAttachment registers a new resource with the given unique name, arguments, and options.
func NewEcsAutoSnapshotPolicyAttachment(ctx *pulumi.Context,
	name string, args *EcsAutoSnapshotPolicyAttachmentArgs, opts ...pulumi.ResourceOption) (*EcsAutoSnapshotPolicyAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AutoSnapshotPolicyId == nil {
		return nil, errors.New("invalid value for required argument 'AutoSnapshotPolicyId'")
	}
	if args.DiskId == nil {
		return nil, errors.New("invalid value for required argument 'DiskId'")
	}
	var resource EcsAutoSnapshotPolicyAttachment
	err := ctx.RegisterResource("alicloud:ecs/ecsAutoSnapshotPolicyAttachment:EcsAutoSnapshotPolicyAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEcsAutoSnapshotPolicyAttachment gets an existing EcsAutoSnapshotPolicyAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEcsAutoSnapshotPolicyAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EcsAutoSnapshotPolicyAttachmentState, opts ...pulumi.ResourceOption) (*EcsAutoSnapshotPolicyAttachment, error) {
	var resource EcsAutoSnapshotPolicyAttachment
	err := ctx.ReadResource("alicloud:ecs/ecsAutoSnapshotPolicyAttachment:EcsAutoSnapshotPolicyAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EcsAutoSnapshotPolicyAttachment resources.
type ecsAutoSnapshotPolicyAttachmentState struct {
	// The auto snapshot policy id.
	AutoSnapshotPolicyId *string `pulumi:"autoSnapshotPolicyId"`
	// The disk id.
	DiskId *string `pulumi:"diskId"`
}

type EcsAutoSnapshotPolicyAttachmentState struct {
	// The auto snapshot policy id.
	AutoSnapshotPolicyId pulumi.StringPtrInput
	// The disk id.
	DiskId pulumi.StringPtrInput
}

func (EcsAutoSnapshotPolicyAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsAutoSnapshotPolicyAttachmentState)(nil)).Elem()
}

type ecsAutoSnapshotPolicyAttachmentArgs struct {
	// The auto snapshot policy id.
	AutoSnapshotPolicyId string `pulumi:"autoSnapshotPolicyId"`
	// The disk id.
	DiskId string `pulumi:"diskId"`
}

// The set of arguments for constructing a EcsAutoSnapshotPolicyAttachment resource.
type EcsAutoSnapshotPolicyAttachmentArgs struct {
	// The auto snapshot policy id.
	AutoSnapshotPolicyId pulumi.StringInput
	// The disk id.
	DiskId pulumi.StringInput
}

func (EcsAutoSnapshotPolicyAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsAutoSnapshotPolicyAttachmentArgs)(nil)).Elem()
}

type EcsAutoSnapshotPolicyAttachmentInput interface {
	pulumi.Input

	ToEcsAutoSnapshotPolicyAttachmentOutput() EcsAutoSnapshotPolicyAttachmentOutput
	ToEcsAutoSnapshotPolicyAttachmentOutputWithContext(ctx context.Context) EcsAutoSnapshotPolicyAttachmentOutput
}

func (*EcsAutoSnapshotPolicyAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((*EcsAutoSnapshotPolicyAttachment)(nil))
}

func (i *EcsAutoSnapshotPolicyAttachment) ToEcsAutoSnapshotPolicyAttachmentOutput() EcsAutoSnapshotPolicyAttachmentOutput {
	return i.ToEcsAutoSnapshotPolicyAttachmentOutputWithContext(context.Background())
}

func (i *EcsAutoSnapshotPolicyAttachment) ToEcsAutoSnapshotPolicyAttachmentOutputWithContext(ctx context.Context) EcsAutoSnapshotPolicyAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsAutoSnapshotPolicyAttachmentOutput)
}

func (i *EcsAutoSnapshotPolicyAttachment) ToEcsAutoSnapshotPolicyAttachmentPtrOutput() EcsAutoSnapshotPolicyAttachmentPtrOutput {
	return i.ToEcsAutoSnapshotPolicyAttachmentPtrOutputWithContext(context.Background())
}

func (i *EcsAutoSnapshotPolicyAttachment) ToEcsAutoSnapshotPolicyAttachmentPtrOutputWithContext(ctx context.Context) EcsAutoSnapshotPolicyAttachmentPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsAutoSnapshotPolicyAttachmentPtrOutput)
}

type EcsAutoSnapshotPolicyAttachmentPtrInput interface {
	pulumi.Input

	ToEcsAutoSnapshotPolicyAttachmentPtrOutput() EcsAutoSnapshotPolicyAttachmentPtrOutput
	ToEcsAutoSnapshotPolicyAttachmentPtrOutputWithContext(ctx context.Context) EcsAutoSnapshotPolicyAttachmentPtrOutput
}

type ecsAutoSnapshotPolicyAttachmentPtrType EcsAutoSnapshotPolicyAttachmentArgs

func (*ecsAutoSnapshotPolicyAttachmentPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsAutoSnapshotPolicyAttachment)(nil))
}

func (i *ecsAutoSnapshotPolicyAttachmentPtrType) ToEcsAutoSnapshotPolicyAttachmentPtrOutput() EcsAutoSnapshotPolicyAttachmentPtrOutput {
	return i.ToEcsAutoSnapshotPolicyAttachmentPtrOutputWithContext(context.Background())
}

func (i *ecsAutoSnapshotPolicyAttachmentPtrType) ToEcsAutoSnapshotPolicyAttachmentPtrOutputWithContext(ctx context.Context) EcsAutoSnapshotPolicyAttachmentPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsAutoSnapshotPolicyAttachmentPtrOutput)
}

// EcsAutoSnapshotPolicyAttachmentArrayInput is an input type that accepts EcsAutoSnapshotPolicyAttachmentArray and EcsAutoSnapshotPolicyAttachmentArrayOutput values.
// You can construct a concrete instance of `EcsAutoSnapshotPolicyAttachmentArrayInput` via:
//
//          EcsAutoSnapshotPolicyAttachmentArray{ EcsAutoSnapshotPolicyAttachmentArgs{...} }
type EcsAutoSnapshotPolicyAttachmentArrayInput interface {
	pulumi.Input

	ToEcsAutoSnapshotPolicyAttachmentArrayOutput() EcsAutoSnapshotPolicyAttachmentArrayOutput
	ToEcsAutoSnapshotPolicyAttachmentArrayOutputWithContext(context.Context) EcsAutoSnapshotPolicyAttachmentArrayOutput
}

type EcsAutoSnapshotPolicyAttachmentArray []EcsAutoSnapshotPolicyAttachmentInput

func (EcsAutoSnapshotPolicyAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*EcsAutoSnapshotPolicyAttachment)(nil))
}

func (i EcsAutoSnapshotPolicyAttachmentArray) ToEcsAutoSnapshotPolicyAttachmentArrayOutput() EcsAutoSnapshotPolicyAttachmentArrayOutput {
	return i.ToEcsAutoSnapshotPolicyAttachmentArrayOutputWithContext(context.Background())
}

func (i EcsAutoSnapshotPolicyAttachmentArray) ToEcsAutoSnapshotPolicyAttachmentArrayOutputWithContext(ctx context.Context) EcsAutoSnapshotPolicyAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsAutoSnapshotPolicyAttachmentArrayOutput)
}

// EcsAutoSnapshotPolicyAttachmentMapInput is an input type that accepts EcsAutoSnapshotPolicyAttachmentMap and EcsAutoSnapshotPolicyAttachmentMapOutput values.
// You can construct a concrete instance of `EcsAutoSnapshotPolicyAttachmentMapInput` via:
//
//          EcsAutoSnapshotPolicyAttachmentMap{ "key": EcsAutoSnapshotPolicyAttachmentArgs{...} }
type EcsAutoSnapshotPolicyAttachmentMapInput interface {
	pulumi.Input

	ToEcsAutoSnapshotPolicyAttachmentMapOutput() EcsAutoSnapshotPolicyAttachmentMapOutput
	ToEcsAutoSnapshotPolicyAttachmentMapOutputWithContext(context.Context) EcsAutoSnapshotPolicyAttachmentMapOutput
}

type EcsAutoSnapshotPolicyAttachmentMap map[string]EcsAutoSnapshotPolicyAttachmentInput

func (EcsAutoSnapshotPolicyAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*EcsAutoSnapshotPolicyAttachment)(nil))
}

func (i EcsAutoSnapshotPolicyAttachmentMap) ToEcsAutoSnapshotPolicyAttachmentMapOutput() EcsAutoSnapshotPolicyAttachmentMapOutput {
	return i.ToEcsAutoSnapshotPolicyAttachmentMapOutputWithContext(context.Background())
}

func (i EcsAutoSnapshotPolicyAttachmentMap) ToEcsAutoSnapshotPolicyAttachmentMapOutputWithContext(ctx context.Context) EcsAutoSnapshotPolicyAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsAutoSnapshotPolicyAttachmentMapOutput)
}

type EcsAutoSnapshotPolicyAttachmentOutput struct {
	*pulumi.OutputState
}

func (EcsAutoSnapshotPolicyAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*EcsAutoSnapshotPolicyAttachment)(nil))
}

func (o EcsAutoSnapshotPolicyAttachmentOutput) ToEcsAutoSnapshotPolicyAttachmentOutput() EcsAutoSnapshotPolicyAttachmentOutput {
	return o
}

func (o EcsAutoSnapshotPolicyAttachmentOutput) ToEcsAutoSnapshotPolicyAttachmentOutputWithContext(ctx context.Context) EcsAutoSnapshotPolicyAttachmentOutput {
	return o
}

func (o EcsAutoSnapshotPolicyAttachmentOutput) ToEcsAutoSnapshotPolicyAttachmentPtrOutput() EcsAutoSnapshotPolicyAttachmentPtrOutput {
	return o.ToEcsAutoSnapshotPolicyAttachmentPtrOutputWithContext(context.Background())
}

func (o EcsAutoSnapshotPolicyAttachmentOutput) ToEcsAutoSnapshotPolicyAttachmentPtrOutputWithContext(ctx context.Context) EcsAutoSnapshotPolicyAttachmentPtrOutput {
	return o.ApplyT(func(v EcsAutoSnapshotPolicyAttachment) *EcsAutoSnapshotPolicyAttachment {
		return &v
	}).(EcsAutoSnapshotPolicyAttachmentPtrOutput)
}

type EcsAutoSnapshotPolicyAttachmentPtrOutput struct {
	*pulumi.OutputState
}

func (EcsAutoSnapshotPolicyAttachmentPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsAutoSnapshotPolicyAttachment)(nil))
}

func (o EcsAutoSnapshotPolicyAttachmentPtrOutput) ToEcsAutoSnapshotPolicyAttachmentPtrOutput() EcsAutoSnapshotPolicyAttachmentPtrOutput {
	return o
}

func (o EcsAutoSnapshotPolicyAttachmentPtrOutput) ToEcsAutoSnapshotPolicyAttachmentPtrOutputWithContext(ctx context.Context) EcsAutoSnapshotPolicyAttachmentPtrOutput {
	return o
}

type EcsAutoSnapshotPolicyAttachmentArrayOutput struct{ *pulumi.OutputState }

func (EcsAutoSnapshotPolicyAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]EcsAutoSnapshotPolicyAttachment)(nil))
}

func (o EcsAutoSnapshotPolicyAttachmentArrayOutput) ToEcsAutoSnapshotPolicyAttachmentArrayOutput() EcsAutoSnapshotPolicyAttachmentArrayOutput {
	return o
}

func (o EcsAutoSnapshotPolicyAttachmentArrayOutput) ToEcsAutoSnapshotPolicyAttachmentArrayOutputWithContext(ctx context.Context) EcsAutoSnapshotPolicyAttachmentArrayOutput {
	return o
}

func (o EcsAutoSnapshotPolicyAttachmentArrayOutput) Index(i pulumi.IntInput) EcsAutoSnapshotPolicyAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) EcsAutoSnapshotPolicyAttachment {
		return vs[0].([]EcsAutoSnapshotPolicyAttachment)[vs[1].(int)]
	}).(EcsAutoSnapshotPolicyAttachmentOutput)
}

type EcsAutoSnapshotPolicyAttachmentMapOutput struct{ *pulumi.OutputState }

func (EcsAutoSnapshotPolicyAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]EcsAutoSnapshotPolicyAttachment)(nil))
}

func (o EcsAutoSnapshotPolicyAttachmentMapOutput) ToEcsAutoSnapshotPolicyAttachmentMapOutput() EcsAutoSnapshotPolicyAttachmentMapOutput {
	return o
}

func (o EcsAutoSnapshotPolicyAttachmentMapOutput) ToEcsAutoSnapshotPolicyAttachmentMapOutputWithContext(ctx context.Context) EcsAutoSnapshotPolicyAttachmentMapOutput {
	return o
}

func (o EcsAutoSnapshotPolicyAttachmentMapOutput) MapIndex(k pulumi.StringInput) EcsAutoSnapshotPolicyAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) EcsAutoSnapshotPolicyAttachment {
		return vs[0].(map[string]EcsAutoSnapshotPolicyAttachment)[vs[1].(string)]
	}).(EcsAutoSnapshotPolicyAttachmentOutput)
}

func init() {
	pulumi.RegisterOutputType(EcsAutoSnapshotPolicyAttachmentOutput{})
	pulumi.RegisterOutputType(EcsAutoSnapshotPolicyAttachmentPtrOutput{})
	pulumi.RegisterOutputType(EcsAutoSnapshotPolicyAttachmentArrayOutput{})
	pulumi.RegisterOutputType(EcsAutoSnapshotPolicyAttachmentMapOutput{})
}