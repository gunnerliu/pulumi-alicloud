// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databasefilesystem

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DBFS Instance Attachment resource.
//
// For information about DBFS Instance Attachment and how to use it.
//
// > **NOTE:** Available since v1.156.0.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/databasefilesystem"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			zoneId := "cn-hangzhou-i"
//			exampleInstanceTypes, err := ecs.GetInstanceTypes(ctx, &ecs.GetInstanceTypesArgs{
//				AvailabilityZone:   pulumi.StringRef(zoneId),
//				InstanceTypeFamily: pulumi.StringRef("ecs.g7se"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleImages, err := ecs.GetImages(ctx, &ecs.GetImagesArgs{
//				InstanceType: pulumi.StringRef(exampleInstanceTypes.InstanceTypes[len(exampleInstanceTypes.InstanceTypes)-1].Id),
//				NameRegex:    pulumi.StringRef("^aliyun_2"),
//				Owners:       pulumi.StringRef("system"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleNetwork, err := vpc.NewNetwork(ctx, "exampleNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("10.4.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSwitch, err := vpc.NewSwitch(ctx, "exampleSwitch", &vpc.SwitchArgs{
//				VswitchName: pulumi.String(name),
//				CidrBlock:   pulumi.String("10.4.0.0/24"),
//				VpcId:       exampleNetwork.ID(),
//				ZoneId:      pulumi.String(zoneId),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSecurityGroup, err := ecs.NewSecurityGroup(ctx, "exampleSecurityGroup", &ecs.SecurityGroupArgs{
//				VpcId: exampleNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleInstance, err := ecs.NewInstance(ctx, "exampleInstance", &ecs.InstanceArgs{
//				AvailabilityZone: pulumi.String(zoneId),
//				InstanceName:     pulumi.String(name),
//				ImageId:          *pulumi.String(exampleImages.Images[1].Id),
//				InstanceType:     exampleInstanceTypes.InstanceTypes[len(exampleInstanceTypes.InstanceTypes)-1].Id,
//				SecurityGroups: pulumi.StringArray{
//					exampleSecurityGroup.ID(),
//				},
//				VswitchId:          exampleSwitch.ID(),
//				SystemDiskCategory: pulumi.String("cloud_essd"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databasefilesystem.NewInstance(ctx, "exampleDatabasefilesystem/instanceInstance", &databasefilesystem.InstanceArgs{
//				Category:         pulumi.String("standard"),
//				ZoneId:           pulumi.String(zoneId),
//				PerformanceLevel: pulumi.String("PL1"),
//				InstanceName:     pulumi.String(name),
//				Size:             pulumi.Int(100),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databasefilesystem.NewInstanceAttachment(ctx, "exampleInstanceAttachment", &databasefilesystem.InstanceAttachmentArgs{
//				EcsId:      exampleInstance.ID(),
//				InstanceId: exampleDatabasefilesystem / instanceInstance.Id,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// DBFS Instance Attachment can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:databasefilesystem/instanceAttachment:InstanceAttachment example <instance_id>:<ecs_id>
// ```
type InstanceAttachment struct {
	pulumi.CustomResourceState

	// The ID of the ECS instance.
	EcsId pulumi.StringOutput `pulumi:"ecsId"`
	// The ID of the database file system.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The status of Database file system. Valid values: `attached`, `attaching`, `unattached`, `detaching`.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewInstanceAttachment registers a new resource with the given unique name, arguments, and options.
func NewInstanceAttachment(ctx *pulumi.Context,
	name string, args *InstanceAttachmentArgs, opts ...pulumi.ResourceOption) (*InstanceAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EcsId == nil {
		return nil, errors.New("invalid value for required argument 'EcsId'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InstanceAttachment
	err := ctx.RegisterResource("alicloud:databasefilesystem/instanceAttachment:InstanceAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceAttachment gets an existing InstanceAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceAttachmentState, opts ...pulumi.ResourceOption) (*InstanceAttachment, error) {
	var resource InstanceAttachment
	err := ctx.ReadResource("alicloud:databasefilesystem/instanceAttachment:InstanceAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceAttachment resources.
type instanceAttachmentState struct {
	// The ID of the ECS instance.
	EcsId *string `pulumi:"ecsId"`
	// The ID of the database file system.
	InstanceId *string `pulumi:"instanceId"`
	// The status of Database file system. Valid values: `attached`, `attaching`, `unattached`, `detaching`.
	Status *string `pulumi:"status"`
}

type InstanceAttachmentState struct {
	// The ID of the ECS instance.
	EcsId pulumi.StringPtrInput
	// The ID of the database file system.
	InstanceId pulumi.StringPtrInput
	// The status of Database file system. Valid values: `attached`, `attaching`, `unattached`, `detaching`.
	Status pulumi.StringPtrInput
}

func (InstanceAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceAttachmentState)(nil)).Elem()
}

type instanceAttachmentArgs struct {
	// The ID of the ECS instance.
	EcsId string `pulumi:"ecsId"`
	// The ID of the database file system.
	InstanceId string `pulumi:"instanceId"`
}

// The set of arguments for constructing a InstanceAttachment resource.
type InstanceAttachmentArgs struct {
	// The ID of the ECS instance.
	EcsId pulumi.StringInput
	// The ID of the database file system.
	InstanceId pulumi.StringInput
}

func (InstanceAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceAttachmentArgs)(nil)).Elem()
}

type InstanceAttachmentInput interface {
	pulumi.Input

	ToInstanceAttachmentOutput() InstanceAttachmentOutput
	ToInstanceAttachmentOutputWithContext(ctx context.Context) InstanceAttachmentOutput
}

func (*InstanceAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceAttachment)(nil)).Elem()
}

func (i *InstanceAttachment) ToInstanceAttachmentOutput() InstanceAttachmentOutput {
	return i.ToInstanceAttachmentOutputWithContext(context.Background())
}

func (i *InstanceAttachment) ToInstanceAttachmentOutputWithContext(ctx context.Context) InstanceAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceAttachmentOutput)
}

// InstanceAttachmentArrayInput is an input type that accepts InstanceAttachmentArray and InstanceAttachmentArrayOutput values.
// You can construct a concrete instance of `InstanceAttachmentArrayInput` via:
//
//	InstanceAttachmentArray{ InstanceAttachmentArgs{...} }
type InstanceAttachmentArrayInput interface {
	pulumi.Input

	ToInstanceAttachmentArrayOutput() InstanceAttachmentArrayOutput
	ToInstanceAttachmentArrayOutputWithContext(context.Context) InstanceAttachmentArrayOutput
}

type InstanceAttachmentArray []InstanceAttachmentInput

func (InstanceAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceAttachment)(nil)).Elem()
}

func (i InstanceAttachmentArray) ToInstanceAttachmentArrayOutput() InstanceAttachmentArrayOutput {
	return i.ToInstanceAttachmentArrayOutputWithContext(context.Background())
}

func (i InstanceAttachmentArray) ToInstanceAttachmentArrayOutputWithContext(ctx context.Context) InstanceAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceAttachmentArrayOutput)
}

// InstanceAttachmentMapInput is an input type that accepts InstanceAttachmentMap and InstanceAttachmentMapOutput values.
// You can construct a concrete instance of `InstanceAttachmentMapInput` via:
//
//	InstanceAttachmentMap{ "key": InstanceAttachmentArgs{...} }
type InstanceAttachmentMapInput interface {
	pulumi.Input

	ToInstanceAttachmentMapOutput() InstanceAttachmentMapOutput
	ToInstanceAttachmentMapOutputWithContext(context.Context) InstanceAttachmentMapOutput
}

type InstanceAttachmentMap map[string]InstanceAttachmentInput

func (InstanceAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceAttachment)(nil)).Elem()
}

func (i InstanceAttachmentMap) ToInstanceAttachmentMapOutput() InstanceAttachmentMapOutput {
	return i.ToInstanceAttachmentMapOutputWithContext(context.Background())
}

func (i InstanceAttachmentMap) ToInstanceAttachmentMapOutputWithContext(ctx context.Context) InstanceAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceAttachmentMapOutput)
}

type InstanceAttachmentOutput struct{ *pulumi.OutputState }

func (InstanceAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceAttachment)(nil)).Elem()
}

func (o InstanceAttachmentOutput) ToInstanceAttachmentOutput() InstanceAttachmentOutput {
	return o
}

func (o InstanceAttachmentOutput) ToInstanceAttachmentOutputWithContext(ctx context.Context) InstanceAttachmentOutput {
	return o
}

// The ID of the ECS instance.
func (o InstanceAttachmentOutput) EcsId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceAttachment) pulumi.StringOutput { return v.EcsId }).(pulumi.StringOutput)
}

// The ID of the database file system.
func (o InstanceAttachmentOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceAttachment) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The status of Database file system. Valid values: `attached`, `attaching`, `unattached`, `detaching`.
func (o InstanceAttachmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceAttachment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type InstanceAttachmentArrayOutput struct{ *pulumi.OutputState }

func (InstanceAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceAttachment)(nil)).Elem()
}

func (o InstanceAttachmentArrayOutput) ToInstanceAttachmentArrayOutput() InstanceAttachmentArrayOutput {
	return o
}

func (o InstanceAttachmentArrayOutput) ToInstanceAttachmentArrayOutputWithContext(ctx context.Context) InstanceAttachmentArrayOutput {
	return o
}

func (o InstanceAttachmentArrayOutput) Index(i pulumi.IntInput) InstanceAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceAttachment {
		return vs[0].([]*InstanceAttachment)[vs[1].(int)]
	}).(InstanceAttachmentOutput)
}

type InstanceAttachmentMapOutput struct{ *pulumi.OutputState }

func (InstanceAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceAttachment)(nil)).Elem()
}

func (o InstanceAttachmentMapOutput) ToInstanceAttachmentMapOutput() InstanceAttachmentMapOutput {
	return o
}

func (o InstanceAttachmentMapOutput) ToInstanceAttachmentMapOutputWithContext(ctx context.Context) InstanceAttachmentMapOutput {
	return o
}

func (o InstanceAttachmentMapOutput) MapIndex(k pulumi.StringInput) InstanceAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceAttachment {
		return vs[0].(map[string]*InstanceAttachment)[vs[1].(string)]
	}).(InstanceAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceAttachmentInput)(nil)).Elem(), &InstanceAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceAttachmentArrayInput)(nil)).Elem(), InstanceAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceAttachmentMapInput)(nil)).Elem(), InstanceAttachmentMap{})
	pulumi.RegisterOutputType(InstanceAttachmentOutput{})
	pulumi.RegisterOutputType(InstanceAttachmentArrayOutput{})
	pulumi.RegisterOutputType(InstanceAttachmentMapOutput{})
}
