// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ens

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ENS Image resource.
//
// For information about ENS Image and how to use it, see [What is Image](https://www.alibabacloud.com/help/en/).
//
// > **NOTE:** Available since v1.216.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ens"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultInstance, err := ens.NewInstance(ctx, "defaultInstance", &ens.InstanceArgs{
//				SystemDisk: &ens.InstanceSystemDiskArgs{
//					Size: pulumi.Int(20),
//				},
//				ScheduleAreaLevel:       pulumi.String("Region"),
//				ImageId:                 pulumi.String("centos_6_08_64_20G_alibase_20171208"),
//				PaymentType:             pulumi.String("PayAsYouGo"),
//				Password:                pulumi.String("12345678ABCabc"),
//				Amount:                  pulumi.Int(1),
//				InternetMaxBandwidthOut: pulumi.Int(10),
//				PublicIpIdentification:  pulumi.Bool(true),
//				EnsRegionId:             pulumi.String("cn-chenzhou-telecom_unicom_cmcc"),
//				PeriodUnit:              pulumi.String("Month"),
//				InstanceType:            pulumi.String("ens.sn1.stiny"),
//				Status:                  pulumi.String("Stopped"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ens.NewImage(ctx, "defaultImage", &ens.ImageArgs{
//				ImageName:              pulumi.String(name),
//				InstanceId:             defaultInstance.ID(),
//				DeleteAfterImageUpload: pulumi.String("false"),
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
// ENS Image can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ens/image:Image example <id>
//
// ```
type Image struct {
	pulumi.CustomResourceState

	// Image creation time.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Whether the instance is automatically released after the image is packaged and uploaded successfully, only the build machine is supported.  Optional values: true: When the instance is released, the image is released together with the instance. false: When the instance is released, the image is retained and is not released together with the instance. Empty means false by default.
	DeleteAfterImageUpload pulumi.StringPtrOutput `pulumi:"deleteAfterImageUpload"`
	// Image Name.
	ImageName pulumi.StringOutput `pulumi:"imageName"`
	// The ID of the instance corresponding to the image.
	InstanceId pulumi.StringPtrOutput `pulumi:"instanceId"`
	// Mirror Status  Optional values: Creating: Creating Packing: Packing Uploading: Uploading Pack_failed: Packing failed Upload_failed: Upload failed Available: Only images in the Available state can be used and operated. Unavailable: Not available Copying: Copying.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewImage registers a new resource with the given unique name, arguments, and options.
func NewImage(ctx *pulumi.Context,
	name string, args *ImageArgs, opts ...pulumi.ResourceOption) (*Image, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ImageName == nil {
		return nil, errors.New("invalid value for required argument 'ImageName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Image
	err := ctx.RegisterResource("alicloud:ens/image:Image", name, args, &resource, opts...)
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
	err := ctx.ReadResource("alicloud:ens/image:Image", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Image resources.
type imageState struct {
	// Image creation time.
	CreateTime *string `pulumi:"createTime"`
	// Whether the instance is automatically released after the image is packaged and uploaded successfully, only the build machine is supported.  Optional values: true: When the instance is released, the image is released together with the instance. false: When the instance is released, the image is retained and is not released together with the instance. Empty means false by default.
	DeleteAfterImageUpload *string `pulumi:"deleteAfterImageUpload"`
	// Image Name.
	ImageName *string `pulumi:"imageName"`
	// The ID of the instance corresponding to the image.
	InstanceId *string `pulumi:"instanceId"`
	// Mirror Status  Optional values: Creating: Creating Packing: Packing Uploading: Uploading Pack_failed: Packing failed Upload_failed: Upload failed Available: Only images in the Available state can be used and operated. Unavailable: Not available Copying: Copying.
	Status *string `pulumi:"status"`
}

type ImageState struct {
	// Image creation time.
	CreateTime pulumi.StringPtrInput
	// Whether the instance is automatically released after the image is packaged and uploaded successfully, only the build machine is supported.  Optional values: true: When the instance is released, the image is released together with the instance. false: When the instance is released, the image is retained and is not released together with the instance. Empty means false by default.
	DeleteAfterImageUpload pulumi.StringPtrInput
	// Image Name.
	ImageName pulumi.StringPtrInput
	// The ID of the instance corresponding to the image.
	InstanceId pulumi.StringPtrInput
	// Mirror Status  Optional values: Creating: Creating Packing: Packing Uploading: Uploading Pack_failed: Packing failed Upload_failed: Upload failed Available: Only images in the Available state can be used and operated. Unavailable: Not available Copying: Copying.
	Status pulumi.StringPtrInput
}

func (ImageState) ElementType() reflect.Type {
	return reflect.TypeOf((*imageState)(nil)).Elem()
}

type imageArgs struct {
	// Whether the instance is automatically released after the image is packaged and uploaded successfully, only the build machine is supported.  Optional values: true: When the instance is released, the image is released together with the instance. false: When the instance is released, the image is retained and is not released together with the instance. Empty means false by default.
	DeleteAfterImageUpload *string `pulumi:"deleteAfterImageUpload"`
	// Image Name.
	ImageName string `pulumi:"imageName"`
	// The ID of the instance corresponding to the image.
	InstanceId *string `pulumi:"instanceId"`
}

// The set of arguments for constructing a Image resource.
type ImageArgs struct {
	// Whether the instance is automatically released after the image is packaged and uploaded successfully, only the build machine is supported.  Optional values: true: When the instance is released, the image is released together with the instance. false: When the instance is released, the image is retained and is not released together with the instance. Empty means false by default.
	DeleteAfterImageUpload pulumi.StringPtrInput
	// Image Name.
	ImageName pulumi.StringInput
	// The ID of the instance corresponding to the image.
	InstanceId pulumi.StringPtrInput
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

// Image creation time.
func (o ImageOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Image) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Whether the instance is automatically released after the image is packaged and uploaded successfully, only the build machine is supported.  Optional values: true: When the instance is released, the image is released together with the instance. false: When the instance is released, the image is retained and is not released together with the instance. Empty means false by default.
func (o ImageOutput) DeleteAfterImageUpload() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Image) pulumi.StringPtrOutput { return v.DeleteAfterImageUpload }).(pulumi.StringPtrOutput)
}

// Image Name.
func (o ImageOutput) ImageName() pulumi.StringOutput {
	return o.ApplyT(func(v *Image) pulumi.StringOutput { return v.ImageName }).(pulumi.StringOutput)
}

// The ID of the instance corresponding to the image.
func (o ImageOutput) InstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Image) pulumi.StringPtrOutput { return v.InstanceId }).(pulumi.StringPtrOutput)
}

// Mirror Status  Optional values: Creating: Creating Packing: Packing Uploading: Uploading Pack_failed: Packing failed Upload_failed: Upload failed Available: Only images in the Available state can be used and operated. Unavailable: Not available Copying: Copying.
func (o ImageOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Image) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
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
