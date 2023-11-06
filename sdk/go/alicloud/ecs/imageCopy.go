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

// Copies a custom image from one region to another. You can use copied images to perform operations in the target region, such as creating instances (RunInstances) and replacing system disks (ReplaceSystemDisk).
//
// > **NOTE:** You can only copy the custom image when it is in the Available state.
//
// > **NOTE:** You can only copy the image belonging to your Alibaba Cloud account. Images cannot be copied from one account to another.
//
// > **NOTE:** If the copying is not completed, you cannot call DeleteImage to delete the image but you can call CancelCopyImage to cancel the copying.
//
// > **NOTE:** Available in 1.66.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := alicloud.NewProvider(ctx, "sh", &alicloud.ProviderArgs{
//				Region: pulumi.String("cn-shanghai"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = alicloud.NewProvider(ctx, "hz", &alicloud.ProviderArgs{
//				Region: pulumi.String("cn-hangzhou"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("Instance"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultInstanceTypes, err := ecs.GetInstanceTypes(ctx, &ecs.GetInstanceTypesArgs{
//				InstanceTypeFamily: pulumi.StringRef("ecs.sn1ne"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultImages, err := ecs.GetImages(ctx, &ecs.GetImagesArgs{
//				NameRegex: pulumi.StringRef("^ubuntu_[0-9]+_[0-9]+_x64*"),
//				Owners:    pulumi.StringRef("system"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String("terraform-example"),
//				CidrBlock: pulumi.String("172.17.3.0/24"),
//			}, pulumi.Provider(alicloud.Hz))
//			if err != nil {
//				return err
//			}
//			defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
//				VswitchName: pulumi.String("terraform-example"),
//				CidrBlock:   pulumi.String("172.17.3.0/24"),
//				VpcId:       defaultNetwork.ID(),
//				ZoneId:      *pulumi.String(defaultZones.Zones[0].Id),
//			}, pulumi.Provider(alicloud.Hz))
//			if err != nil {
//				return err
//			}
//			defaultSecurityGroup, err := ecs.NewSecurityGroup(ctx, "defaultSecurityGroup", &ecs.SecurityGroupArgs{
//				VpcId: defaultNetwork.ID(),
//			}, pulumi.Provider(alicloud.Hz))
//			if err != nil {
//				return err
//			}
//			defaultInstance, err := ecs.NewInstance(ctx, "defaultInstance", &ecs.InstanceArgs{
//				AvailabilityZone: *pulumi.String(defaultZones.Zones[0].Id),
//				InstanceName:     pulumi.String("terraform-example"),
//				SecurityGroups: pulumi.StringArray{
//					defaultSecurityGroup.ID(),
//				},
//				VswitchId:               defaultSwitch.ID(),
//				InstanceType:            *pulumi.String(defaultInstanceTypes.Ids[0]),
//				ImageId:                 *pulumi.String(defaultImages.Ids[0]),
//				InternetMaxBandwidthOut: pulumi.Int(10),
//			}, pulumi.Provider(alicloud.Hz))
//			if err != nil {
//				return err
//			}
//			defaultImage, err := ecs.NewImage(ctx, "defaultImage", &ecs.ImageArgs{
//				InstanceId:  defaultInstance.ID(),
//				ImageName:   pulumi.String("terraform-example"),
//				Description: pulumi.String("terraform-example"),
//			}, pulumi.Provider(alicloud.Hz))
//			if err != nil {
//				return err
//			}
//			_, err = ecs.NewImageCopy(ctx, "defaultImageCopy", &ecs.ImageCopyArgs{
//				SourceImageId:  defaultImage.ID(),
//				SourceRegionId: pulumi.String("cn-hangzhou"),
//				ImageName:      pulumi.String("terraform-example"),
//				Description:    pulumi.String("terraform-example"),
//				Tags: pulumi.Map{
//					"FinanceDept": pulumi.Any("FinanceDeptJoshua"),
//				},
//			}, pulumi.Provider(alicloud.Sh))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Attributes Reference0
//
//	The following attributes are exported:
//
// * `id` - ID of the image.
//
// ## Import
//
// image can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ecs/imageCopy:ImageCopy default m-uf66871ape***yg1q***
//
// ```
type ImageCopy struct {
	pulumi.CustomResourceState

	DeleteAutoSnapshot pulumi.BoolPtrOutput `pulumi:"deleteAutoSnapshot"`
	// The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Indicates whether to encrypt the image.
	Encrypted pulumi.BoolPtrOutput `pulumi:"encrypted"`
	// Indicates whether to force delete the custom image, Default is `false`.
	// - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
	// - false：Verifies that the image is not currently in use by any other instances before deleting the image.
	Force pulumi.BoolPtrOutput `pulumi:"force"`
	// The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
	ImageName pulumi.StringOutput `pulumi:"imageName"`
	// Key ID used to encrypt the image.
	KmsKeyId pulumi.StringPtrOutput `pulumi:"kmsKeyId"`
	// Deprecated: Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead.
	Name pulumi.StringOutput `pulumi:"name"`
	// The source image ID.
	SourceImageId pulumi.StringOutput `pulumi:"sourceImageId"`
	// The ID of the region to which the source custom image belongs. You can call [DescribeRegions](https://www.alibabacloud.com/help/doc-detail/25609.htm) to view the latest regions of Alibaba Cloud.
	SourceRegionId pulumi.StringOutput `pulumi:"sourceRegionId"`
	// The tag value of an image. The value of N ranges from 1 to 20.
	Tags pulumi.MapOutput `pulumi:"tags"`
}

// NewImageCopy registers a new resource with the given unique name, arguments, and options.
func NewImageCopy(ctx *pulumi.Context,
	name string, args *ImageCopyArgs, opts ...pulumi.ResourceOption) (*ImageCopy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SourceImageId == nil {
		return nil, errors.New("invalid value for required argument 'SourceImageId'")
	}
	if args.SourceRegionId == nil {
		return nil, errors.New("invalid value for required argument 'SourceRegionId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ImageCopy
	err := ctx.RegisterResource("alicloud:ecs/imageCopy:ImageCopy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetImageCopy gets an existing ImageCopy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetImageCopy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ImageCopyState, opts ...pulumi.ResourceOption) (*ImageCopy, error) {
	var resource ImageCopy
	err := ctx.ReadResource("alicloud:ecs/imageCopy:ImageCopy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ImageCopy resources.
type imageCopyState struct {
	DeleteAutoSnapshot *bool `pulumi:"deleteAutoSnapshot"`
	// The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
	Description *string `pulumi:"description"`
	// Indicates whether to encrypt the image.
	Encrypted *bool `pulumi:"encrypted"`
	// Indicates whether to force delete the custom image, Default is `false`.
	// - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
	// - false：Verifies that the image is not currently in use by any other instances before deleting the image.
	Force *bool `pulumi:"force"`
	// The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
	ImageName *string `pulumi:"imageName"`
	// Key ID used to encrypt the image.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// Deprecated: Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead.
	Name *string `pulumi:"name"`
	// The source image ID.
	SourceImageId *string `pulumi:"sourceImageId"`
	// The ID of the region to which the source custom image belongs. You can call [DescribeRegions](https://www.alibabacloud.com/help/doc-detail/25609.htm) to view the latest regions of Alibaba Cloud.
	SourceRegionId *string `pulumi:"sourceRegionId"`
	// The tag value of an image. The value of N ranges from 1 to 20.
	Tags map[string]interface{} `pulumi:"tags"`
}

type ImageCopyState struct {
	DeleteAutoSnapshot pulumi.BoolPtrInput
	// The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
	Description pulumi.StringPtrInput
	// Indicates whether to encrypt the image.
	Encrypted pulumi.BoolPtrInput
	// Indicates whether to force delete the custom image, Default is `false`.
	// - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
	// - false：Verifies that the image is not currently in use by any other instances before deleting the image.
	Force pulumi.BoolPtrInput
	// The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
	ImageName pulumi.StringPtrInput
	// Key ID used to encrypt the image.
	KmsKeyId pulumi.StringPtrInput
	// Deprecated: Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead.
	Name pulumi.StringPtrInput
	// The source image ID.
	SourceImageId pulumi.StringPtrInput
	// The ID of the region to which the source custom image belongs. You can call [DescribeRegions](https://www.alibabacloud.com/help/doc-detail/25609.htm) to view the latest regions of Alibaba Cloud.
	SourceRegionId pulumi.StringPtrInput
	// The tag value of an image. The value of N ranges from 1 to 20.
	Tags pulumi.MapInput
}

func (ImageCopyState) ElementType() reflect.Type {
	return reflect.TypeOf((*imageCopyState)(nil)).Elem()
}

type imageCopyArgs struct {
	DeleteAutoSnapshot *bool `pulumi:"deleteAutoSnapshot"`
	// The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
	Description *string `pulumi:"description"`
	// Indicates whether to encrypt the image.
	Encrypted *bool `pulumi:"encrypted"`
	// Indicates whether to force delete the custom image, Default is `false`.
	// - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
	// - false：Verifies that the image is not currently in use by any other instances before deleting the image.
	Force *bool `pulumi:"force"`
	// The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
	ImageName *string `pulumi:"imageName"`
	// Key ID used to encrypt the image.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// Deprecated: Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead.
	Name *string `pulumi:"name"`
	// The source image ID.
	SourceImageId string `pulumi:"sourceImageId"`
	// The ID of the region to which the source custom image belongs. You can call [DescribeRegions](https://www.alibabacloud.com/help/doc-detail/25609.htm) to view the latest regions of Alibaba Cloud.
	SourceRegionId string `pulumi:"sourceRegionId"`
	// The tag value of an image. The value of N ranges from 1 to 20.
	Tags map[string]interface{} `pulumi:"tags"`
}

// The set of arguments for constructing a ImageCopy resource.
type ImageCopyArgs struct {
	DeleteAutoSnapshot pulumi.BoolPtrInput
	// The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
	Description pulumi.StringPtrInput
	// Indicates whether to encrypt the image.
	Encrypted pulumi.BoolPtrInput
	// Indicates whether to force delete the custom image, Default is `false`.
	// - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
	// - false：Verifies that the image is not currently in use by any other instances before deleting the image.
	Force pulumi.BoolPtrInput
	// The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
	ImageName pulumi.StringPtrInput
	// Key ID used to encrypt the image.
	KmsKeyId pulumi.StringPtrInput
	// Deprecated: Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead.
	Name pulumi.StringPtrInput
	// The source image ID.
	SourceImageId pulumi.StringInput
	// The ID of the region to which the source custom image belongs. You can call [DescribeRegions](https://www.alibabacloud.com/help/doc-detail/25609.htm) to view the latest regions of Alibaba Cloud.
	SourceRegionId pulumi.StringInput
	// The tag value of an image. The value of N ranges from 1 to 20.
	Tags pulumi.MapInput
}

func (ImageCopyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*imageCopyArgs)(nil)).Elem()
}

type ImageCopyInput interface {
	pulumi.Input

	ToImageCopyOutput() ImageCopyOutput
	ToImageCopyOutputWithContext(ctx context.Context) ImageCopyOutput
}

func (*ImageCopy) ElementType() reflect.Type {
	return reflect.TypeOf((**ImageCopy)(nil)).Elem()
}

func (i *ImageCopy) ToImageCopyOutput() ImageCopyOutput {
	return i.ToImageCopyOutputWithContext(context.Background())
}

func (i *ImageCopy) ToImageCopyOutputWithContext(ctx context.Context) ImageCopyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageCopyOutput)
}

// ImageCopyArrayInput is an input type that accepts ImageCopyArray and ImageCopyArrayOutput values.
// You can construct a concrete instance of `ImageCopyArrayInput` via:
//
//	ImageCopyArray{ ImageCopyArgs{...} }
type ImageCopyArrayInput interface {
	pulumi.Input

	ToImageCopyArrayOutput() ImageCopyArrayOutput
	ToImageCopyArrayOutputWithContext(context.Context) ImageCopyArrayOutput
}

type ImageCopyArray []ImageCopyInput

func (ImageCopyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ImageCopy)(nil)).Elem()
}

func (i ImageCopyArray) ToImageCopyArrayOutput() ImageCopyArrayOutput {
	return i.ToImageCopyArrayOutputWithContext(context.Background())
}

func (i ImageCopyArray) ToImageCopyArrayOutputWithContext(ctx context.Context) ImageCopyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageCopyArrayOutput)
}

// ImageCopyMapInput is an input type that accepts ImageCopyMap and ImageCopyMapOutput values.
// You can construct a concrete instance of `ImageCopyMapInput` via:
//
//	ImageCopyMap{ "key": ImageCopyArgs{...} }
type ImageCopyMapInput interface {
	pulumi.Input

	ToImageCopyMapOutput() ImageCopyMapOutput
	ToImageCopyMapOutputWithContext(context.Context) ImageCopyMapOutput
}

type ImageCopyMap map[string]ImageCopyInput

func (ImageCopyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ImageCopy)(nil)).Elem()
}

func (i ImageCopyMap) ToImageCopyMapOutput() ImageCopyMapOutput {
	return i.ToImageCopyMapOutputWithContext(context.Background())
}

func (i ImageCopyMap) ToImageCopyMapOutputWithContext(ctx context.Context) ImageCopyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageCopyMapOutput)
}

type ImageCopyOutput struct{ *pulumi.OutputState }

func (ImageCopyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ImageCopy)(nil)).Elem()
}

func (o ImageCopyOutput) ToImageCopyOutput() ImageCopyOutput {
	return o
}

func (o ImageCopyOutput) ToImageCopyOutputWithContext(ctx context.Context) ImageCopyOutput {
	return o
}

func (o ImageCopyOutput) DeleteAutoSnapshot() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ImageCopy) pulumi.BoolPtrOutput { return v.DeleteAutoSnapshot }).(pulumi.BoolPtrOutput)
}

// The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
func (o ImageCopyOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ImageCopy) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Indicates whether to encrypt the image.
func (o ImageCopyOutput) Encrypted() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ImageCopy) pulumi.BoolPtrOutput { return v.Encrypted }).(pulumi.BoolPtrOutput)
}

// Indicates whether to force delete the custom image, Default is `false`.
// - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
// - false：Verifies that the image is not currently in use by any other instances before deleting the image.
func (o ImageCopyOutput) Force() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ImageCopy) pulumi.BoolPtrOutput { return v.Force }).(pulumi.BoolPtrOutput)
}

// The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
func (o ImageCopyOutput) ImageName() pulumi.StringOutput {
	return o.ApplyT(func(v *ImageCopy) pulumi.StringOutput { return v.ImageName }).(pulumi.StringOutput)
}

// Key ID used to encrypt the image.
func (o ImageCopyOutput) KmsKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ImageCopy) pulumi.StringPtrOutput { return v.KmsKeyId }).(pulumi.StringPtrOutput)
}

// Deprecated: Attribute 'name' has been deprecated from version 1.69.0. Use `image_name` instead.
func (o ImageCopyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ImageCopy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The source image ID.
func (o ImageCopyOutput) SourceImageId() pulumi.StringOutput {
	return o.ApplyT(func(v *ImageCopy) pulumi.StringOutput { return v.SourceImageId }).(pulumi.StringOutput)
}

// The ID of the region to which the source custom image belongs. You can call [DescribeRegions](https://www.alibabacloud.com/help/doc-detail/25609.htm) to view the latest regions of Alibaba Cloud.
func (o ImageCopyOutput) SourceRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *ImageCopy) pulumi.StringOutput { return v.SourceRegionId }).(pulumi.StringOutput)
}

// The tag value of an image. The value of N ranges from 1 to 20.
func (o ImageCopyOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *ImageCopy) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

type ImageCopyArrayOutput struct{ *pulumi.OutputState }

func (ImageCopyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ImageCopy)(nil)).Elem()
}

func (o ImageCopyArrayOutput) ToImageCopyArrayOutput() ImageCopyArrayOutput {
	return o
}

func (o ImageCopyArrayOutput) ToImageCopyArrayOutputWithContext(ctx context.Context) ImageCopyArrayOutput {
	return o
}

func (o ImageCopyArrayOutput) Index(i pulumi.IntInput) ImageCopyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ImageCopy {
		return vs[0].([]*ImageCopy)[vs[1].(int)]
	}).(ImageCopyOutput)
}

type ImageCopyMapOutput struct{ *pulumi.OutputState }

func (ImageCopyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ImageCopy)(nil)).Elem()
}

func (o ImageCopyMapOutput) ToImageCopyMapOutput() ImageCopyMapOutput {
	return o
}

func (o ImageCopyMapOutput) ToImageCopyMapOutputWithContext(ctx context.Context) ImageCopyMapOutput {
	return o
}

func (o ImageCopyMapOutput) MapIndex(k pulumi.StringInput) ImageCopyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ImageCopy {
		return vs[0].(map[string]*ImageCopy)[vs[1].(string)]
	}).(ImageCopyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ImageCopyInput)(nil)).Elem(), &ImageCopy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ImageCopyArrayInput)(nil)).Elem(), ImageCopyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ImageCopyMapInput)(nil)).Elem(), ImageCopyMap{})
	pulumi.RegisterOutputType(ImageCopyOutput{})
	pulumi.RegisterOutputType(ImageCopyArrayOutput{})
	pulumi.RegisterOutputType(ImageCopyMapOutput{})
}
