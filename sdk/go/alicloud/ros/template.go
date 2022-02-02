// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ros

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ROS Template resource.
//
// For information about ROS Template and how to use it, see [What is Template](https://www.alibabacloud.com/help/en/doc-detail/141851.htm).
//
// > **NOTE:** Available in v1.108.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ros"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := ros.NewTemplate(ctx, "example", &ros.TemplateArgs{
// 			TemplateBody: pulumi.String(fmt.Sprintf("%v%v%v%v", "    {\n", "    	\"ROSTemplateFormatVersion\": \"2015-09-01\"\n", "    }\n", "    \n")),
// 			TemplateName: pulumi.String("example_value"),
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
// ROS Template can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ros/template:Template example <template_id>
// ```
type Template struct {
	pulumi.CustomResourceState

	// The description of the template. The description can be up to 256 characters in length.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
	TemplateBody pulumi.StringPtrOutput `pulumi:"templateBody"`
	// The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
	TemplateName pulumi.StringOutput `pulumi:"templateName"`
	// The template url.
	TemplateUrl pulumi.StringPtrOutput `pulumi:"templateUrl"`
}

// NewTemplate registers a new resource with the given unique name, arguments, and options.
func NewTemplate(ctx *pulumi.Context,
	name string, args *TemplateArgs, opts ...pulumi.ResourceOption) (*Template, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.TemplateName == nil {
		return nil, errors.New("invalid value for required argument 'TemplateName'")
	}
	var resource Template
	err := ctx.RegisterResource("alicloud:ros/template:Template", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTemplate gets an existing Template resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TemplateState, opts ...pulumi.ResourceOption) (*Template, error) {
	var resource Template
	err := ctx.ReadResource("alicloud:ros/template:Template", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Template resources.
type templateState struct {
	// The description of the template. The description can be up to 256 characters in length.
	Description *string `pulumi:"description"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
	TemplateBody *string `pulumi:"templateBody"`
	// The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
	TemplateName *string `pulumi:"templateName"`
	// The template url.
	TemplateUrl *string `pulumi:"templateUrl"`
}

type TemplateState struct {
	// The description of the template. The description can be up to 256 characters in length.
	Description pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
	TemplateBody pulumi.StringPtrInput
	// The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
	TemplateName pulumi.StringPtrInput
	// The template url.
	TemplateUrl pulumi.StringPtrInput
}

func (TemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*templateState)(nil)).Elem()
}

type templateArgs struct {
	// The description of the template. The description can be up to 256 characters in length.
	Description *string `pulumi:"description"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
	TemplateBody *string `pulumi:"templateBody"`
	// The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
	TemplateName string `pulumi:"templateName"`
	// The template url.
	TemplateUrl *string `pulumi:"templateUrl"`
}

// The set of arguments for constructing a Template resource.
type TemplateArgs struct {
	// The description of the template. The description can be up to 256 characters in length.
	Description pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.  If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.  You must specify one of the TemplateBody and TemplateURL parameters, but you cannot specify both of them.
	TemplateBody pulumi.StringPtrInput
	// The name of the template. The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
	TemplateName pulumi.StringInput
	// The template url.
	TemplateUrl pulumi.StringPtrInput
}

func (TemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*templateArgs)(nil)).Elem()
}

type TemplateInput interface {
	pulumi.Input

	ToTemplateOutput() TemplateOutput
	ToTemplateOutputWithContext(ctx context.Context) TemplateOutput
}

func (*Template) ElementType() reflect.Type {
	return reflect.TypeOf((**Template)(nil)).Elem()
}

func (i *Template) ToTemplateOutput() TemplateOutput {
	return i.ToTemplateOutputWithContext(context.Background())
}

func (i *Template) ToTemplateOutputWithContext(ctx context.Context) TemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TemplateOutput)
}

// TemplateArrayInput is an input type that accepts TemplateArray and TemplateArrayOutput values.
// You can construct a concrete instance of `TemplateArrayInput` via:
//
//          TemplateArray{ TemplateArgs{...} }
type TemplateArrayInput interface {
	pulumi.Input

	ToTemplateArrayOutput() TemplateArrayOutput
	ToTemplateArrayOutputWithContext(context.Context) TemplateArrayOutput
}

type TemplateArray []TemplateInput

func (TemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Template)(nil)).Elem()
}

func (i TemplateArray) ToTemplateArrayOutput() TemplateArrayOutput {
	return i.ToTemplateArrayOutputWithContext(context.Background())
}

func (i TemplateArray) ToTemplateArrayOutputWithContext(ctx context.Context) TemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TemplateArrayOutput)
}

// TemplateMapInput is an input type that accepts TemplateMap and TemplateMapOutput values.
// You can construct a concrete instance of `TemplateMapInput` via:
//
//          TemplateMap{ "key": TemplateArgs{...} }
type TemplateMapInput interface {
	pulumi.Input

	ToTemplateMapOutput() TemplateMapOutput
	ToTemplateMapOutputWithContext(context.Context) TemplateMapOutput
}

type TemplateMap map[string]TemplateInput

func (TemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Template)(nil)).Elem()
}

func (i TemplateMap) ToTemplateMapOutput() TemplateMapOutput {
	return i.ToTemplateMapOutputWithContext(context.Background())
}

func (i TemplateMap) ToTemplateMapOutputWithContext(ctx context.Context) TemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TemplateMapOutput)
}

type TemplateOutput struct{ *pulumi.OutputState }

func (TemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Template)(nil)).Elem()
}

func (o TemplateOutput) ToTemplateOutput() TemplateOutput {
	return o
}

func (o TemplateOutput) ToTemplateOutputWithContext(ctx context.Context) TemplateOutput {
	return o
}

type TemplateArrayOutput struct{ *pulumi.OutputState }

func (TemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Template)(nil)).Elem()
}

func (o TemplateArrayOutput) ToTemplateArrayOutput() TemplateArrayOutput {
	return o
}

func (o TemplateArrayOutput) ToTemplateArrayOutputWithContext(ctx context.Context) TemplateArrayOutput {
	return o
}

func (o TemplateArrayOutput) Index(i pulumi.IntInput) TemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Template {
		return vs[0].([]*Template)[vs[1].(int)]
	}).(TemplateOutput)
}

type TemplateMapOutput struct{ *pulumi.OutputState }

func (TemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Template)(nil)).Elem()
}

func (o TemplateMapOutput) ToTemplateMapOutput() TemplateMapOutput {
	return o
}

func (o TemplateMapOutput) ToTemplateMapOutputWithContext(ctx context.Context) TemplateMapOutput {
	return o
}

func (o TemplateMapOutput) MapIndex(k pulumi.StringInput) TemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Template {
		return vs[0].(map[string]*Template)[vs[1].(string)]
	}).(TemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TemplateInput)(nil)).Elem(), &Template{})
	pulumi.RegisterInputType(reflect.TypeOf((*TemplateArrayInput)(nil)).Elem(), TemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TemplateMapInput)(nil)).Elem(), TemplateMap{})
	pulumi.RegisterOutputType(TemplateOutput{})
	pulumi.RegisterOutputType(TemplateArrayOutput{})
	pulumi.RegisterOutputType(TemplateMapOutput{})
}
