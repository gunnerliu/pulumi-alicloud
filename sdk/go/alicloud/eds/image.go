// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package eds

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ECD Image resource.
//
// For information about ECD Image and how to use it, see [What is Image](https://help.aliyun.com/document_detail/188382.html).
//
// > **NOTE:** Available in v1.146.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/eds"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		defaultSimpleOfficeSite, err := eds.NewSimpleOfficeSite(ctx, "defaultSimpleOfficeSite", &eds.SimpleOfficeSiteArgs{
// 			CidrBlock:         pulumi.String("172.16.0.0/12"),
// 			DesktopAccessType: pulumi.String("Internet"),
// 			OfficeSiteName:    pulumi.String("your_simple_office_site_name"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		opt0 := "SYSTEM"
// 		defaultBundles, err := eds.GetBundles(ctx, &eds.GetBundlesArgs{
// 			BundleType: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultEcdPolicyGroup, err := eds.NewEcdPolicyGroup(ctx, "defaultEcdPolicyGroup", &eds.EcdPolicyGroupArgs{
// 			PolicyGroupName: pulumi.String("your_policy_group_name"),
// 			Clipboard:       pulumi.String("readwrite"),
// 			LocalDrive:      pulumi.String("read"),
// 			AuthorizeAccessPolicyRules: eds.EcdPolicyGroupAuthorizeAccessPolicyRuleArray{
// 				&eds.EcdPolicyGroupAuthorizeAccessPolicyRuleArgs{
// 					Description: pulumi.String("example_value"),
// 					CidrIp:      pulumi.String("1.2.3.4/24"),
// 				},
// 			},
// 			AuthorizeSecurityPolicyRules: eds.EcdPolicyGroupAuthorizeSecurityPolicyRuleArray{
// 				&eds.EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs{
// 					Type:        pulumi.String("inflow"),
// 					Policy:      pulumi.String("accept"),
// 					Description: pulumi.String("example_value"),
// 					PortRange:   pulumi.String("80/80"),
// 					IpProtocol:  pulumi.String("TCP"),
// 					Priority:    pulumi.String("1"),
// 					CidrIp:      pulumi.String("0.0.0.0/0"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultDesktop, err := eds.NewDesktop(ctx, "defaultDesktop", &eds.DesktopArgs{
// 			OfficeSiteId:  defaultSimpleOfficeSite.ID(),
// 			PolicyGroupId: defaultEcdPolicyGroup.ID(),
// 			BundleId:      pulumi.String(defaultBundles.Bundles[1].Id),
// 			DesktopName:   pulumi.String("your_desktop_name"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = eds.NewImage(ctx, "defaultImage", &eds.ImageArgs{
// 			ImageName:   pulumi.String("your_image_name"),
// 			DesktopId:   defaultDesktop.ID(),
// 			Description: pulumi.String("example_value"),
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
// ECD Image can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:eds/image:Image example <id>
// ```
type Image struct {
	pulumi.CustomResourceState

	// The description of the image.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The desktop id of the desktop.
	DesktopId pulumi.StringOutput `pulumi:"desktopId"`
	// The name of the image.
	ImageName pulumi.StringPtrOutput `pulumi:"imageName"`
	// The status of the image. Valid values: `Creating`, `Available`, `CreateFailed`.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewImage registers a new resource with the given unique name, arguments, and options.
func NewImage(ctx *pulumi.Context,
	name string, args *ImageArgs, opts ...pulumi.ResourceOption) (*Image, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DesktopId == nil {
		return nil, errors.New("invalid value for required argument 'DesktopId'")
	}
	var resource Image
	err := ctx.RegisterResource("alicloud:eds/image:Image", name, args, &resource, opts...)
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
	err := ctx.ReadResource("alicloud:eds/image:Image", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Image resources.
type imageState struct {
	// The description of the image.
	Description *string `pulumi:"description"`
	// The desktop id of the desktop.
	DesktopId *string `pulumi:"desktopId"`
	// The name of the image.
	ImageName *string `pulumi:"imageName"`
	// The status of the image. Valid values: `Creating`, `Available`, `CreateFailed`.
	Status *string `pulumi:"status"`
}

type ImageState struct {
	// The description of the image.
	Description pulumi.StringPtrInput
	// The desktop id of the desktop.
	DesktopId pulumi.StringPtrInput
	// The name of the image.
	ImageName pulumi.StringPtrInput
	// The status of the image. Valid values: `Creating`, `Available`, `CreateFailed`.
	Status pulumi.StringPtrInput
}

func (ImageState) ElementType() reflect.Type {
	return reflect.TypeOf((*imageState)(nil)).Elem()
}

type imageArgs struct {
	// The description of the image.
	Description *string `pulumi:"description"`
	// The desktop id of the desktop.
	DesktopId string `pulumi:"desktopId"`
	// The name of the image.
	ImageName *string `pulumi:"imageName"`
}

// The set of arguments for constructing a Image resource.
type ImageArgs struct {
	// The description of the image.
	Description pulumi.StringPtrInput
	// The desktop id of the desktop.
	DesktopId pulumi.StringInput
	// The name of the image.
	ImageName pulumi.StringPtrInput
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
//          ImageArray{ ImageArgs{...} }
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
//          ImageMap{ "key": ImageArgs{...} }
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
