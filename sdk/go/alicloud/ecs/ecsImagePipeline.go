// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ECS Image Pipeline resource.
//
// For information about ECS Image Pipeline and how to use it, see [What is Image Pipeline](https://www.alibabacloud.com/help/en/doc-detail/200427.html).
//
// > **NOTE:** Available in v1.163.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			defaultResourceGroups, err := resourcemanager.GetResourceGroups(ctx, &resourcemanager.GetResourceGroupsArgs{
//				NameRegex: pulumi.StringRef("default"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultImages, err := ecs.GetImages(ctx, &ecs.GetImagesArgs{
//				NameRegex:  pulumi.StringRef("^ubuntu_[0-9]+_[0-9]+_x64*"),
//				MostRecent: pulumi.BoolRef(true),
//				Owners:     pulumi.StringRef("system"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultInstanceTypes, err := ecs.GetInstanceTypes(ctx, &ecs.GetInstanceTypesArgs{
//				ImageId: pulumi.StringRef(defaultImages.Ids[0]),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultAccount, err := alicloud.GetAccount(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String("terraform-example"),
//				CidrBlock: pulumi.String("172.17.3.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
//				VswitchName: pulumi.String("terraform-example"),
//				CidrBlock:   pulumi.String("172.17.3.0/24"),
//				VpcId:       defaultNetwork.ID(),
//				ZoneId:      *pulumi.String(defaultZones.Zones[0].Id),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ecs.NewEcsImagePipeline(ctx, "defaultEcsImagePipeline", &ecs.EcsImagePipelineArgs{
//				AddAccounts: pulumi.StringArray{
//					*pulumi.String(defaultAccount.Id),
//				},
//				BaseImage:               *pulumi.String(defaultImages.Ids[0]),
//				BaseImageType:           pulumi.String("IMAGE"),
//				BuildContent:            pulumi.String("RUN yum update -y"),
//				DeleteInstanceOnFailure: pulumi.Bool(false),
//				ImageName:               pulumi.String("terraform-example"),
//				Description:             pulumi.String("terraform-example"),
//				InstanceType:            *pulumi.String(defaultInstanceTypes.Ids[0]),
//				ResourceGroupId:         *pulumi.String(defaultResourceGroups.Groups[0].Id),
//				InternetMaxBandwidthOut: pulumi.Int(20),
//				SystemDiskSize:          pulumi.Int(40),
//				ToRegionIds: pulumi.StringArray{
//					pulumi.String("cn-qingdao"),
//					pulumi.String("cn-zhangjiakou"),
//				},
//				VswitchId: defaultSwitch.ID(),
//				Tags: pulumi.Map{
//					"Created": pulumi.Any("TF"),
//					"For":     pulumi.Any("Acceptance-test"),
//				},
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
// ECS Image Pipeline can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ecs/ecsImagePipeline:EcsImagePipeline example <id>
//
// ```
type EcsImagePipeline struct {
	pulumi.CustomResourceState

	// The ID of Alibaba Cloud account to which to share the created image.
	AddAccounts pulumi.StringArrayOutput `pulumi:"addAccounts"`
	// The source image. When you set `baseImageType` to `IMAGE`, set `baseImage` to the ID of a custom image. When you set `baseImageType` to `IMAGE_FAMILY`, set `baseImage` to the name of an image family.
	BaseImage pulumi.StringOutput `pulumi:"baseImage"`
	// The type of the source image. Valid values: `IMAGE`, `IMAGE_FAMILY`.
	// - IMAGE: custom image.
	// - IMAGE_FAMILY: image family.
	BaseImageType pulumi.StringOutput `pulumi:"baseImageType"`
	// The content of the image template. The content cannot be greater than 16 KB in size, and can contain up to 127 commands.
	BuildContent pulumi.StringPtrOutput `pulumi:"buildContent"`
	// Specifies whether to release the intermediate instance if the image cannot be created.
	DeleteInstanceOnFailure pulumi.BoolOutput `pulumi:"deleteInstanceOnFailure"`
	// The description of the image template. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`. **Note:** If the intermediate instance cannot be started, the instance is released by default.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name prefix of the image to be created. The prefix must be `2` to `64` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
	ImageName pulumi.StringPtrOutput `pulumi:"imageName"`
	// The instance type of the instance. You can call the DescribeInstanceTypes operation to query instance types. If you do not specify this parameter, an instance type that provides the fewest vCPUs and memory resources is automatically selected. This configuration is subject to resource availability of instance types. For example, the `ecs.g6.large` instance type is selected by default. If available `ecs.g6.large` resources are insufficient, the `ecs.g6.xlarge` instance type is selected.
	InstanceType pulumi.StringPtrOutput `pulumi:"instanceType"`
	// The size of the outbound public bandwidth for the intermediate instance. Unit: `Mbit/s`. Valid values: `0` to `100`. Default value: `0`.
	InternetMaxBandwidthOut pulumi.IntOutput `pulumi:"internetMaxBandwidthOut"`
	// The name of the image template. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The size of the system disk of the intermediate instance. Unit: GiB. Valid values: `20` to `500`. Default value: `40`.
	SystemDiskSize pulumi.IntOutput `pulumi:"systemDiskSize"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The ID of region to which to distribute the created image.
	ToRegionIds pulumi.StringArrayOutput `pulumi:"toRegionIds"`
	// The ID of the vSwitch. If you do not specify this parameter, a virtual private cloud (VPC) and a vSwitch are created by default.
	VswitchId pulumi.StringPtrOutput `pulumi:"vswitchId"`
}

// NewEcsImagePipeline registers a new resource with the given unique name, arguments, and options.
func NewEcsImagePipeline(ctx *pulumi.Context,
	name string, args *EcsImagePipelineArgs, opts ...pulumi.ResourceOption) (*EcsImagePipeline, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BaseImage == nil {
		return nil, errors.New("invalid value for required argument 'BaseImage'")
	}
	if args.BaseImageType == nil {
		return nil, errors.New("invalid value for required argument 'BaseImageType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EcsImagePipeline
	err := ctx.RegisterResource("alicloud:ecs/ecsImagePipeline:EcsImagePipeline", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEcsImagePipeline gets an existing EcsImagePipeline resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEcsImagePipeline(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EcsImagePipelineState, opts ...pulumi.ResourceOption) (*EcsImagePipeline, error) {
	var resource EcsImagePipeline
	err := ctx.ReadResource("alicloud:ecs/ecsImagePipeline:EcsImagePipeline", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EcsImagePipeline resources.
type ecsImagePipelineState struct {
	// The ID of Alibaba Cloud account to which to share the created image.
	AddAccounts []string `pulumi:"addAccounts"`
	// The source image. When you set `baseImageType` to `IMAGE`, set `baseImage` to the ID of a custom image. When you set `baseImageType` to `IMAGE_FAMILY`, set `baseImage` to the name of an image family.
	BaseImage *string `pulumi:"baseImage"`
	// The type of the source image. Valid values: `IMAGE`, `IMAGE_FAMILY`.
	// - IMAGE: custom image.
	// - IMAGE_FAMILY: image family.
	BaseImageType *string `pulumi:"baseImageType"`
	// The content of the image template. The content cannot be greater than 16 KB in size, and can contain up to 127 commands.
	BuildContent *string `pulumi:"buildContent"`
	// Specifies whether to release the intermediate instance if the image cannot be created.
	DeleteInstanceOnFailure *bool `pulumi:"deleteInstanceOnFailure"`
	// The description of the image template. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`. **Note:** If the intermediate instance cannot be started, the instance is released by default.
	Description *string `pulumi:"description"`
	// The name prefix of the image to be created. The prefix must be `2` to `64` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
	ImageName *string `pulumi:"imageName"`
	// The instance type of the instance. You can call the DescribeInstanceTypes operation to query instance types. If you do not specify this parameter, an instance type that provides the fewest vCPUs and memory resources is automatically selected. This configuration is subject to resource availability of instance types. For example, the `ecs.g6.large` instance type is selected by default. If available `ecs.g6.large` resources are insufficient, the `ecs.g6.xlarge` instance type is selected.
	InstanceType *string `pulumi:"instanceType"`
	// The size of the outbound public bandwidth for the intermediate instance. Unit: `Mbit/s`. Valid values: `0` to `100`. Default value: `0`.
	InternetMaxBandwidthOut *int `pulumi:"internetMaxBandwidthOut"`
	// The name of the image template. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
	Name *string `pulumi:"name"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The size of the system disk of the intermediate instance. Unit: GiB. Valid values: `20` to `500`. Default value: `40`.
	SystemDiskSize *int `pulumi:"systemDiskSize"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The ID of region to which to distribute the created image.
	ToRegionIds []string `pulumi:"toRegionIds"`
	// The ID of the vSwitch. If you do not specify this parameter, a virtual private cloud (VPC) and a vSwitch are created by default.
	VswitchId *string `pulumi:"vswitchId"`
}

type EcsImagePipelineState struct {
	// The ID of Alibaba Cloud account to which to share the created image.
	AddAccounts pulumi.StringArrayInput
	// The source image. When you set `baseImageType` to `IMAGE`, set `baseImage` to the ID of a custom image. When you set `baseImageType` to `IMAGE_FAMILY`, set `baseImage` to the name of an image family.
	BaseImage pulumi.StringPtrInput
	// The type of the source image. Valid values: `IMAGE`, `IMAGE_FAMILY`.
	// - IMAGE: custom image.
	// - IMAGE_FAMILY: image family.
	BaseImageType pulumi.StringPtrInput
	// The content of the image template. The content cannot be greater than 16 KB in size, and can contain up to 127 commands.
	BuildContent pulumi.StringPtrInput
	// Specifies whether to release the intermediate instance if the image cannot be created.
	DeleteInstanceOnFailure pulumi.BoolPtrInput
	// The description of the image template. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`. **Note:** If the intermediate instance cannot be started, the instance is released by default.
	Description pulumi.StringPtrInput
	// The name prefix of the image to be created. The prefix must be `2` to `64` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
	ImageName pulumi.StringPtrInput
	// The instance type of the instance. You can call the DescribeInstanceTypes operation to query instance types. If you do not specify this parameter, an instance type that provides the fewest vCPUs and memory resources is automatically selected. This configuration is subject to resource availability of instance types. For example, the `ecs.g6.large` instance type is selected by default. If available `ecs.g6.large` resources are insufficient, the `ecs.g6.xlarge` instance type is selected.
	InstanceType pulumi.StringPtrInput
	// The size of the outbound public bandwidth for the intermediate instance. Unit: `Mbit/s`. Valid values: `0` to `100`. Default value: `0`.
	InternetMaxBandwidthOut pulumi.IntPtrInput
	// The name of the image template. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
	Name pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The size of the system disk of the intermediate instance. Unit: GiB. Valid values: `20` to `500`. Default value: `40`.
	SystemDiskSize pulumi.IntPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The ID of region to which to distribute the created image.
	ToRegionIds pulumi.StringArrayInput
	// The ID of the vSwitch. If you do not specify this parameter, a virtual private cloud (VPC) and a vSwitch are created by default.
	VswitchId pulumi.StringPtrInput
}

func (EcsImagePipelineState) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsImagePipelineState)(nil)).Elem()
}

type ecsImagePipelineArgs struct {
	// The ID of Alibaba Cloud account to which to share the created image.
	AddAccounts []string `pulumi:"addAccounts"`
	// The source image. When you set `baseImageType` to `IMAGE`, set `baseImage` to the ID of a custom image. When you set `baseImageType` to `IMAGE_FAMILY`, set `baseImage` to the name of an image family.
	BaseImage string `pulumi:"baseImage"`
	// The type of the source image. Valid values: `IMAGE`, `IMAGE_FAMILY`.
	// - IMAGE: custom image.
	// - IMAGE_FAMILY: image family.
	BaseImageType string `pulumi:"baseImageType"`
	// The content of the image template. The content cannot be greater than 16 KB in size, and can contain up to 127 commands.
	BuildContent *string `pulumi:"buildContent"`
	// Specifies whether to release the intermediate instance if the image cannot be created.
	DeleteInstanceOnFailure *bool `pulumi:"deleteInstanceOnFailure"`
	// The description of the image template. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`. **Note:** If the intermediate instance cannot be started, the instance is released by default.
	Description *string `pulumi:"description"`
	// The name prefix of the image to be created. The prefix must be `2` to `64` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
	ImageName *string `pulumi:"imageName"`
	// The instance type of the instance. You can call the DescribeInstanceTypes operation to query instance types. If you do not specify this parameter, an instance type that provides the fewest vCPUs and memory resources is automatically selected. This configuration is subject to resource availability of instance types. For example, the `ecs.g6.large` instance type is selected by default. If available `ecs.g6.large` resources are insufficient, the `ecs.g6.xlarge` instance type is selected.
	InstanceType *string `pulumi:"instanceType"`
	// The size of the outbound public bandwidth for the intermediate instance. Unit: `Mbit/s`. Valid values: `0` to `100`. Default value: `0`.
	InternetMaxBandwidthOut *int `pulumi:"internetMaxBandwidthOut"`
	// The name of the image template. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
	Name *string `pulumi:"name"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The size of the system disk of the intermediate instance. Unit: GiB. Valid values: `20` to `500`. Default value: `40`.
	SystemDiskSize *int `pulumi:"systemDiskSize"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The ID of region to which to distribute the created image.
	ToRegionIds []string `pulumi:"toRegionIds"`
	// The ID of the vSwitch. If you do not specify this parameter, a virtual private cloud (VPC) and a vSwitch are created by default.
	VswitchId *string `pulumi:"vswitchId"`
}

// The set of arguments for constructing a EcsImagePipeline resource.
type EcsImagePipelineArgs struct {
	// The ID of Alibaba Cloud account to which to share the created image.
	AddAccounts pulumi.StringArrayInput
	// The source image. When you set `baseImageType` to `IMAGE`, set `baseImage` to the ID of a custom image. When you set `baseImageType` to `IMAGE_FAMILY`, set `baseImage` to the name of an image family.
	BaseImage pulumi.StringInput
	// The type of the source image. Valid values: `IMAGE`, `IMAGE_FAMILY`.
	// - IMAGE: custom image.
	// - IMAGE_FAMILY: image family.
	BaseImageType pulumi.StringInput
	// The content of the image template. The content cannot be greater than 16 KB in size, and can contain up to 127 commands.
	BuildContent pulumi.StringPtrInput
	// Specifies whether to release the intermediate instance if the image cannot be created.
	DeleteInstanceOnFailure pulumi.BoolPtrInput
	// The description of the image template. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`. **Note:** If the intermediate instance cannot be started, the instance is released by default.
	Description pulumi.StringPtrInput
	// The name prefix of the image to be created. The prefix must be `2` to `64` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
	ImageName pulumi.StringPtrInput
	// The instance type of the instance. You can call the DescribeInstanceTypes operation to query instance types. If you do not specify this parameter, an instance type that provides the fewest vCPUs and memory resources is automatically selected. This configuration is subject to resource availability of instance types. For example, the `ecs.g6.large` instance type is selected by default. If available `ecs.g6.large` resources are insufficient, the `ecs.g6.xlarge` instance type is selected.
	InstanceType pulumi.StringPtrInput
	// The size of the outbound public bandwidth for the intermediate instance. Unit: `Mbit/s`. Valid values: `0` to `100`. Default value: `0`.
	InternetMaxBandwidthOut pulumi.IntPtrInput
	// The name of the image template. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
	Name pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The size of the system disk of the intermediate instance. Unit: GiB. Valid values: `20` to `500`. Default value: `40`.
	SystemDiskSize pulumi.IntPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The ID of region to which to distribute the created image.
	ToRegionIds pulumi.StringArrayInput
	// The ID of the vSwitch. If you do not specify this parameter, a virtual private cloud (VPC) and a vSwitch are created by default.
	VswitchId pulumi.StringPtrInput
}

func (EcsImagePipelineArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsImagePipelineArgs)(nil)).Elem()
}

type EcsImagePipelineInput interface {
	pulumi.Input

	ToEcsImagePipelineOutput() EcsImagePipelineOutput
	ToEcsImagePipelineOutputWithContext(ctx context.Context) EcsImagePipelineOutput
}

func (*EcsImagePipeline) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsImagePipeline)(nil)).Elem()
}

func (i *EcsImagePipeline) ToEcsImagePipelineOutput() EcsImagePipelineOutput {
	return i.ToEcsImagePipelineOutputWithContext(context.Background())
}

func (i *EcsImagePipeline) ToEcsImagePipelineOutputWithContext(ctx context.Context) EcsImagePipelineOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsImagePipelineOutput)
}

// EcsImagePipelineArrayInput is an input type that accepts EcsImagePipelineArray and EcsImagePipelineArrayOutput values.
// You can construct a concrete instance of `EcsImagePipelineArrayInput` via:
//
//	EcsImagePipelineArray{ EcsImagePipelineArgs{...} }
type EcsImagePipelineArrayInput interface {
	pulumi.Input

	ToEcsImagePipelineArrayOutput() EcsImagePipelineArrayOutput
	ToEcsImagePipelineArrayOutputWithContext(context.Context) EcsImagePipelineArrayOutput
}

type EcsImagePipelineArray []EcsImagePipelineInput

func (EcsImagePipelineArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsImagePipeline)(nil)).Elem()
}

func (i EcsImagePipelineArray) ToEcsImagePipelineArrayOutput() EcsImagePipelineArrayOutput {
	return i.ToEcsImagePipelineArrayOutputWithContext(context.Background())
}

func (i EcsImagePipelineArray) ToEcsImagePipelineArrayOutputWithContext(ctx context.Context) EcsImagePipelineArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsImagePipelineArrayOutput)
}

// EcsImagePipelineMapInput is an input type that accepts EcsImagePipelineMap and EcsImagePipelineMapOutput values.
// You can construct a concrete instance of `EcsImagePipelineMapInput` via:
//
//	EcsImagePipelineMap{ "key": EcsImagePipelineArgs{...} }
type EcsImagePipelineMapInput interface {
	pulumi.Input

	ToEcsImagePipelineMapOutput() EcsImagePipelineMapOutput
	ToEcsImagePipelineMapOutputWithContext(context.Context) EcsImagePipelineMapOutput
}

type EcsImagePipelineMap map[string]EcsImagePipelineInput

func (EcsImagePipelineMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsImagePipeline)(nil)).Elem()
}

func (i EcsImagePipelineMap) ToEcsImagePipelineMapOutput() EcsImagePipelineMapOutput {
	return i.ToEcsImagePipelineMapOutputWithContext(context.Background())
}

func (i EcsImagePipelineMap) ToEcsImagePipelineMapOutputWithContext(ctx context.Context) EcsImagePipelineMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsImagePipelineMapOutput)
}

type EcsImagePipelineOutput struct{ *pulumi.OutputState }

func (EcsImagePipelineOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsImagePipeline)(nil)).Elem()
}

func (o EcsImagePipelineOutput) ToEcsImagePipelineOutput() EcsImagePipelineOutput {
	return o
}

func (o EcsImagePipelineOutput) ToEcsImagePipelineOutputWithContext(ctx context.Context) EcsImagePipelineOutput {
	return o
}

// The ID of Alibaba Cloud account to which to share the created image.
func (o EcsImagePipelineOutput) AddAccounts() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *EcsImagePipeline) pulumi.StringArrayOutput { return v.AddAccounts }).(pulumi.StringArrayOutput)
}

// The source image. When you set `baseImageType` to `IMAGE`, set `baseImage` to the ID of a custom image. When you set `baseImageType` to `IMAGE_FAMILY`, set `baseImage` to the name of an image family.
func (o EcsImagePipelineOutput) BaseImage() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsImagePipeline) pulumi.StringOutput { return v.BaseImage }).(pulumi.StringOutput)
}

// The type of the source image. Valid values: `IMAGE`, `IMAGE_FAMILY`.
// - IMAGE: custom image.
// - IMAGE_FAMILY: image family.
func (o EcsImagePipelineOutput) BaseImageType() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsImagePipeline) pulumi.StringOutput { return v.BaseImageType }).(pulumi.StringOutput)
}

// The content of the image template. The content cannot be greater than 16 KB in size, and can contain up to 127 commands.
func (o EcsImagePipelineOutput) BuildContent() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsImagePipeline) pulumi.StringPtrOutput { return v.BuildContent }).(pulumi.StringPtrOutput)
}

// Specifies whether to release the intermediate instance if the image cannot be created.
func (o EcsImagePipelineOutput) DeleteInstanceOnFailure() pulumi.BoolOutput {
	return o.ApplyT(func(v *EcsImagePipeline) pulumi.BoolOutput { return v.DeleteInstanceOnFailure }).(pulumi.BoolOutput)
}

// The description of the image template. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`. **Note:** If the intermediate instance cannot be started, the instance is released by default.
func (o EcsImagePipelineOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsImagePipeline) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name prefix of the image to be created. The prefix must be `2` to `64` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
func (o EcsImagePipelineOutput) ImageName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsImagePipeline) pulumi.StringPtrOutput { return v.ImageName }).(pulumi.StringPtrOutput)
}

// The instance type of the instance. You can call the DescribeInstanceTypes operation to query instance types. If you do not specify this parameter, an instance type that provides the fewest vCPUs and memory resources is automatically selected. This configuration is subject to resource availability of instance types. For example, the `ecs.g6.large` instance type is selected by default. If available `ecs.g6.large` resources are insufficient, the `ecs.g6.xlarge` instance type is selected.
func (o EcsImagePipelineOutput) InstanceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsImagePipeline) pulumi.StringPtrOutput { return v.InstanceType }).(pulumi.StringPtrOutput)
}

// The size of the outbound public bandwidth for the intermediate instance. Unit: `Mbit/s`. Valid values: `0` to `100`. Default value: `0`.
func (o EcsImagePipelineOutput) InternetMaxBandwidthOut() pulumi.IntOutput {
	return o.ApplyT(func(v *EcsImagePipeline) pulumi.IntOutput { return v.InternetMaxBandwidthOut }).(pulumi.IntOutput)
}

// The name of the image template. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.),and hyphens (-).
func (o EcsImagePipelineOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsImagePipeline) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the resource group.
func (o EcsImagePipelineOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsImagePipeline) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The size of the system disk of the intermediate instance. Unit: GiB. Valid values: `20` to `500`. Default value: `40`.
func (o EcsImagePipelineOutput) SystemDiskSize() pulumi.IntOutput {
	return o.ApplyT(func(v *EcsImagePipeline) pulumi.IntOutput { return v.SystemDiskSize }).(pulumi.IntOutput)
}

// A mapping of tags to assign to the resource.
func (o EcsImagePipelineOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *EcsImagePipeline) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// The ID of region to which to distribute the created image.
func (o EcsImagePipelineOutput) ToRegionIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *EcsImagePipeline) pulumi.StringArrayOutput { return v.ToRegionIds }).(pulumi.StringArrayOutput)
}

// The ID of the vSwitch. If you do not specify this parameter, a virtual private cloud (VPC) and a vSwitch are created by default.
func (o EcsImagePipelineOutput) VswitchId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsImagePipeline) pulumi.StringPtrOutput { return v.VswitchId }).(pulumi.StringPtrOutput)
}

type EcsImagePipelineArrayOutput struct{ *pulumi.OutputState }

func (EcsImagePipelineArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsImagePipeline)(nil)).Elem()
}

func (o EcsImagePipelineArrayOutput) ToEcsImagePipelineArrayOutput() EcsImagePipelineArrayOutput {
	return o
}

func (o EcsImagePipelineArrayOutput) ToEcsImagePipelineArrayOutputWithContext(ctx context.Context) EcsImagePipelineArrayOutput {
	return o
}

func (o EcsImagePipelineArrayOutput) Index(i pulumi.IntInput) EcsImagePipelineOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EcsImagePipeline {
		return vs[0].([]*EcsImagePipeline)[vs[1].(int)]
	}).(EcsImagePipelineOutput)
}

type EcsImagePipelineMapOutput struct{ *pulumi.OutputState }

func (EcsImagePipelineMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsImagePipeline)(nil)).Elem()
}

func (o EcsImagePipelineMapOutput) ToEcsImagePipelineMapOutput() EcsImagePipelineMapOutput {
	return o
}

func (o EcsImagePipelineMapOutput) ToEcsImagePipelineMapOutputWithContext(ctx context.Context) EcsImagePipelineMapOutput {
	return o
}

func (o EcsImagePipelineMapOutput) MapIndex(k pulumi.StringInput) EcsImagePipelineOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EcsImagePipeline {
		return vs[0].(map[string]*EcsImagePipeline)[vs[1].(string)]
	}).(EcsImagePipelineOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EcsImagePipelineInput)(nil)).Elem(), &EcsImagePipeline{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsImagePipelineArrayInput)(nil)).Elem(), EcsImagePipelineArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsImagePipelineMapInput)(nil)).Elem(), EcsImagePipelineMap{})
	pulumi.RegisterOutputType(EcsImagePipelineOutput{})
	pulumi.RegisterOutputType(EcsImagePipelineArrayOutput{})
	pulumi.RegisterOutputType(EcsImagePipelineMapOutput{})
}
