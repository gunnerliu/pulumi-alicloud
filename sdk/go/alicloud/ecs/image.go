// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates a custom image. You can then use a custom image to create ECS instances (RunInstances) or change the system disk for an existing instance (ReplaceSystemDisk).
//
// > **NOTE:**  If you want to create a template from an ECS instance, you can specify the instance ID (InstanceId) to create a custom image. You must make sure that the status of the specified instance is Running or Stopped. After a successful invocation, each disk of the specified instance has a new snapshot created.
//
// > **NOTE:**  If you want to create a custom image based on the system disk of your ECS instance, you can specify one of the system disk snapshots (SnapshotId) to create a custom image. However, the specified snapshot cannot be created on or before July 15, 2013.
//
// > **NOTE:**  If you want to combine snapshots of multiple disks into an image template, you can specify DiskDeviceMapping to create a custom image.
//
// > **NOTE:**  Available in 1.64.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ecs.NewImage(ctx, "default", &ecs.ImageArgs{
//				Architecture:    pulumi.String("x86_64"),
//				Description:     pulumi.String("test-image"),
//				ImageName:       pulumi.String("test-image"),
//				InstanceId:      pulumi.String("i-bp1g6zv0ce8oghu7k***"),
//				Platform:        pulumi.String("CentOS"),
//				ResourceGroupId: pulumi.String("rg-bp67acfmxazb4ph***"),
//				Tags: pulumi.AnyMap{
//					"FinanceDept": pulumi.Any("FinanceDeptJoshua"),
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
//	image can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ecs/image:Image default m-uf66871ape***yg1q***
//
// ```
type Image struct {
	pulumi.CustomResourceState

	// Specifies the architecture of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `i386` , Default is `x8664`.
	Architecture       pulumi.StringPtrOutput `pulumi:"architecture"`
	DeleteAutoSnapshot pulumi.BoolPtrOutput   `pulumi:"deleteAutoSnapshot"`
	// The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Description of the system with disks and snapshots under the image.
	DiskDeviceMappings ImageDiskDeviceMappingArrayOutput `pulumi:"diskDeviceMappings"`
	// Indicates whether to force delete the custom image, Default is `false`.
	// - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
	// - false：Verifies that the image is not currently in use by any other instances before deleting the image.
	Force pulumi.BoolPtrOutput `pulumi:"force"`
	// The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
	ImageName pulumi.StringOutput `pulumi:"imageName"`
	// The instance ID.
	InstanceId pulumi.StringPtrOutput `pulumi:"instanceId"`
	// Deprecated: Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the operating system platform of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image.
	// Valid values: `CentOS`, `Ubuntu`, `SUSE`, `OpenSUSE`, `RedHat`, `Debian`, `CoreOS`, `Aliyun Linux`, `Windows Server 2003`, `Windows Server 2008`, `Windows Server 2012`, `Windows Server 2022`, `Windows 7`, Default is `Others Linux`.
	Platform pulumi.StringPtrOutput `pulumi:"platform"`
	// The ID of the enterprise resource group to which a custom image belongs
	ResourceGroupId pulumi.StringPtrOutput `pulumi:"resourceGroupId"`
	// Specifies a snapshot that is used to create a combined custom image.
	SnapshotId pulumi.StringPtrOutput `pulumi:"snapshotId"`
	// The tag value of an image. The value of N ranges from 1 to 20.
	Tags pulumi.MapOutput `pulumi:"tags"`
}

// NewImage registers a new resource with the given unique name, arguments, and options.
func NewImage(ctx *pulumi.Context,
	name string, args *ImageArgs, opts ...pulumi.ResourceOption) (*Image, error) {
	if args == nil {
		args = &ImageArgs{}
	}

	var resource Image
	err := ctx.RegisterResource("alicloud:ecs/image:Image", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetImage gets an existing Image resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetImage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ImageState, opts ...pulumi.ResourceOption) (*Image, error) {
	var resource Image
	err := ctx.ReadResource("alicloud:ecs/image:Image", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Image resources.
type imageState struct {
	// Specifies the architecture of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `i386` , Default is `x8664`.
	Architecture       *string `pulumi:"architecture"`
	DeleteAutoSnapshot *bool   `pulumi:"deleteAutoSnapshot"`
	// The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
	Description *string `pulumi:"description"`
	// Description of the system with disks and snapshots under the image.
	DiskDeviceMappings []ImageDiskDeviceMapping `pulumi:"diskDeviceMappings"`
	// Indicates whether to force delete the custom image, Default is `false`.
	// - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
	// - false：Verifies that the image is not currently in use by any other instances before deleting the image.
	Force *bool `pulumi:"force"`
	// The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
	ImageName *string `pulumi:"imageName"`
	// The instance ID.
	InstanceId *string `pulumi:"instanceId"`
	// Deprecated: Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead.
	Name *string `pulumi:"name"`
	// Specifies the operating system platform of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image.
	// Valid values: `CentOS`, `Ubuntu`, `SUSE`, `OpenSUSE`, `RedHat`, `Debian`, `CoreOS`, `Aliyun Linux`, `Windows Server 2003`, `Windows Server 2008`, `Windows Server 2012`, `Windows Server 2022`, `Windows 7`, Default is `Others Linux`.
	Platform *string `pulumi:"platform"`
	// The ID of the enterprise resource group to which a custom image belongs
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Specifies a snapshot that is used to create a combined custom image.
	SnapshotId *string `pulumi:"snapshotId"`
	// The tag value of an image. The value of N ranges from 1 to 20.
	Tags map[string]interface{} `pulumi:"tags"`
}

type ImageState struct {
	// Specifies the architecture of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `i386` , Default is `x8664`.
	Architecture       pulumi.StringPtrInput
	DeleteAutoSnapshot pulumi.BoolPtrInput
	// The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
	Description pulumi.StringPtrInput
	// Description of the system with disks and snapshots under the image.
	DiskDeviceMappings ImageDiskDeviceMappingArrayInput
	// Indicates whether to force delete the custom image, Default is `false`.
	// - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
	// - false：Verifies that the image is not currently in use by any other instances before deleting the image.
	Force pulumi.BoolPtrInput
	// The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
	ImageName pulumi.StringPtrInput
	// The instance ID.
	InstanceId pulumi.StringPtrInput
	// Deprecated: Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead.
	Name pulumi.StringPtrInput
	// Specifies the operating system platform of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image.
	// Valid values: `CentOS`, `Ubuntu`, `SUSE`, `OpenSUSE`, `RedHat`, `Debian`, `CoreOS`, `Aliyun Linux`, `Windows Server 2003`, `Windows Server 2008`, `Windows Server 2012`, `Windows Server 2022`, `Windows 7`, Default is `Others Linux`.
	Platform pulumi.StringPtrInput
	// The ID of the enterprise resource group to which a custom image belongs
	ResourceGroupId pulumi.StringPtrInput
	// Specifies a snapshot that is used to create a combined custom image.
	SnapshotId pulumi.StringPtrInput
	// The tag value of an image. The value of N ranges from 1 to 20.
	Tags pulumi.MapInput
}

func (ImageState) ElementType() reflect.Type {
	return reflect.TypeOf((*imageState)(nil)).Elem()
}

type imageArgs struct {
	// Specifies the architecture of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `i386` , Default is `x8664`.
	Architecture       *string `pulumi:"architecture"`
	DeleteAutoSnapshot *bool   `pulumi:"deleteAutoSnapshot"`
	// The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
	Description *string `pulumi:"description"`
	// Description of the system with disks and snapshots under the image.
	DiskDeviceMappings []ImageDiskDeviceMapping `pulumi:"diskDeviceMappings"`
	// Indicates whether to force delete the custom image, Default is `false`.
	// - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
	// - false：Verifies that the image is not currently in use by any other instances before deleting the image.
	Force *bool `pulumi:"force"`
	// The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
	ImageName *string `pulumi:"imageName"`
	// The instance ID.
	InstanceId *string `pulumi:"instanceId"`
	// Deprecated: Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead.
	Name *string `pulumi:"name"`
	// Specifies the operating system platform of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image.
	// Valid values: `CentOS`, `Ubuntu`, `SUSE`, `OpenSUSE`, `RedHat`, `Debian`, `CoreOS`, `Aliyun Linux`, `Windows Server 2003`, `Windows Server 2008`, `Windows Server 2012`, `Windows Server 2022`, `Windows 7`, Default is `Others Linux`.
	Platform *string `pulumi:"platform"`
	// The ID of the enterprise resource group to which a custom image belongs
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Specifies a snapshot that is used to create a combined custom image.
	SnapshotId *string `pulumi:"snapshotId"`
	// The tag value of an image. The value of N ranges from 1 to 20.
	Tags map[string]interface{} `pulumi:"tags"`
}

// The set of arguments for constructing a Image resource.
type ImageArgs struct {
	// Specifies the architecture of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `i386` , Default is `x8664`.
	Architecture       pulumi.StringPtrInput
	DeleteAutoSnapshot pulumi.BoolPtrInput
	// The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
	Description pulumi.StringPtrInput
	// Description of the system with disks and snapshots under the image.
	DiskDeviceMappings ImageDiskDeviceMappingArrayInput
	// Indicates whether to force delete the custom image, Default is `false`.
	// - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
	// - false：Verifies that the image is not currently in use by any other instances before deleting the image.
	Force pulumi.BoolPtrInput
	// The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
	ImageName pulumi.StringPtrInput
	// The instance ID.
	InstanceId pulumi.StringPtrInput
	// Deprecated: Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead.
	Name pulumi.StringPtrInput
	// Specifies the operating system platform of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image.
	// Valid values: `CentOS`, `Ubuntu`, `SUSE`, `OpenSUSE`, `RedHat`, `Debian`, `CoreOS`, `Aliyun Linux`, `Windows Server 2003`, `Windows Server 2008`, `Windows Server 2012`, `Windows Server 2022`, `Windows 7`, Default is `Others Linux`.
	Platform pulumi.StringPtrInput
	// The ID of the enterprise resource group to which a custom image belongs
	ResourceGroupId pulumi.StringPtrInput
	// Specifies a snapshot that is used to create a combined custom image.
	SnapshotId pulumi.StringPtrInput
	// The tag value of an image. The value of N ranges from 1 to 20.
	Tags pulumi.MapInput
}

func (ImageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*imageArgs)(nil)).Elem()
}

type ImageInput interface {
	pulumi.Input

	ToImageOutput() ImageOutput
	ToImageOutputWithContext(ctx context.Context) ImageOutput
}

func (*Image) ElementType() reflect.Type {
	return reflect.TypeOf((**Image)(nil)).Elem()
}

func (i *Image) ToImageOutput() ImageOutput {
	return i.ToImageOutputWithContext(context.Background())
}

func (i *Image) ToImageOutputWithContext(ctx context.Context) ImageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageOutput)
}

// ImageArrayInput is an input type that accepts ImageArray and ImageArrayOutput values.
// You can construct a concrete instance of `ImageArrayInput` via:
//
//	ImageArray{ ImageArgs{...} }
type ImageArrayInput interface {
	pulumi.Input

	ToImageArrayOutput() ImageArrayOutput
	ToImageArrayOutputWithContext(context.Context) ImageArrayOutput
}

type ImageArray []ImageInput

func (ImageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Image)(nil)).Elem()
}

func (i ImageArray) ToImageArrayOutput() ImageArrayOutput {
	return i.ToImageArrayOutputWithContext(context.Background())
}

func (i ImageArray) ToImageArrayOutputWithContext(ctx context.Context) ImageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageArrayOutput)
}

// ImageMapInput is an input type that accepts ImageMap and ImageMapOutput values.
// You can construct a concrete instance of `ImageMapInput` via:
//
//	ImageMap{ "key": ImageArgs{...} }
type ImageMapInput interface {
	pulumi.Input

	ToImageMapOutput() ImageMapOutput
	ToImageMapOutputWithContext(context.Context) ImageMapOutput
}

type ImageMap map[string]ImageInput

func (ImageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Image)(nil)).Elem()
}

func (i ImageMap) ToImageMapOutput() ImageMapOutput {
	return i.ToImageMapOutputWithContext(context.Background())
}

func (i ImageMap) ToImageMapOutputWithContext(ctx context.Context) ImageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageMapOutput)
}

type ImageOutput struct{ *pulumi.OutputState }

func (ImageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Image)(nil)).Elem()
}

func (o ImageOutput) ToImageOutput() ImageOutput {
	return o
}

func (o ImageOutput) ToImageOutputWithContext(ctx context.Context) ImageOutput {
	return o
}

// Specifies the architecture of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `i386` , Default is `x8664`.
func (o ImageOutput) Architecture() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Image) pulumi.StringPtrOutput { return v.Architecture }).(pulumi.StringPtrOutput)
}

func (o ImageOutput) DeleteAutoSnapshot() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Image) pulumi.BoolPtrOutput { return v.DeleteAutoSnapshot }).(pulumi.BoolPtrOutput)
}

// The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
func (o ImageOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Image) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Description of the system with disks and snapshots under the image.
func (o ImageOutput) DiskDeviceMappings() ImageDiskDeviceMappingArrayOutput {
	return o.ApplyT(func(v *Image) ImageDiskDeviceMappingArrayOutput { return v.DiskDeviceMappings }).(ImageDiskDeviceMappingArrayOutput)
}

// Indicates whether to force delete the custom image, Default is `false`.
// - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
// - false：Verifies that the image is not currently in use by any other instances before deleting the image.
func (o ImageOutput) Force() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Image) pulumi.BoolPtrOutput { return v.Force }).(pulumi.BoolPtrOutput)
}

// The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
func (o ImageOutput) ImageName() pulumi.StringOutput {
	return o.ApplyT(func(v *Image) pulumi.StringOutput { return v.ImageName }).(pulumi.StringOutput)
}

// The instance ID.
func (o ImageOutput) InstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Image) pulumi.StringPtrOutput { return v.InstanceId }).(pulumi.StringPtrOutput)
}

// Deprecated: Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead.
func (o ImageOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Image) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the operating system platform of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image.
// Valid values: `CentOS`, `Ubuntu`, `SUSE`, `OpenSUSE`, `RedHat`, `Debian`, `CoreOS`, `Aliyun Linux`, `Windows Server 2003`, `Windows Server 2008`, `Windows Server 2012`, `Windows Server 2022`, `Windows 7`, Default is `Others Linux`.
func (o ImageOutput) Platform() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Image) pulumi.StringPtrOutput { return v.Platform }).(pulumi.StringPtrOutput)
}

// The ID of the enterprise resource group to which a custom image belongs
func (o ImageOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Image) pulumi.StringPtrOutput { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// Specifies a snapshot that is used to create a combined custom image.
func (o ImageOutput) SnapshotId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Image) pulumi.StringPtrOutput { return v.SnapshotId }).(pulumi.StringPtrOutput)
}

// The tag value of an image. The value of N ranges from 1 to 20.
func (o ImageOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *Image) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

type ImageArrayOutput struct{ *pulumi.OutputState }

func (ImageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Image)(nil)).Elem()
}

func (o ImageArrayOutput) ToImageArrayOutput() ImageArrayOutput {
	return o
}

func (o ImageArrayOutput) ToImageArrayOutputWithContext(ctx context.Context) ImageArrayOutput {
	return o
}

func (o ImageArrayOutput) Index(i pulumi.IntInput) ImageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Image {
		return vs[0].([]*Image)[vs[1].(int)]
	}).(ImageOutput)
}

type ImageMapOutput struct{ *pulumi.OutputState }

func (ImageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Image)(nil)).Elem()
}

func (o ImageMapOutput) ToImageMapOutput() ImageMapOutput {
	return o
}

func (o ImageMapOutput) ToImageMapOutputWithContext(ctx context.Context) ImageMapOutput {
	return o
}

func (o ImageMapOutput) MapIndex(k pulumi.StringInput) ImageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Image {
		return vs[0].(map[string]*Image)[vs[1].(string)]
	}).(ImageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ImageInput)(nil)).Elem(), &Image{})
	pulumi.RegisterInputType(reflect.TypeOf((*ImageArrayInput)(nil)).Elem(), ImageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ImageMapInput)(nil)).Elem(), ImageMap{})
	pulumi.RegisterOutputType(ImageOutput{})
	pulumi.RegisterOutputType(ImageArrayOutput{})
	pulumi.RegisterOutputType(ImageMapOutput{})
}
