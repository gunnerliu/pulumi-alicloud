// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ros

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ROS Stack resource.
//
// For information about ROS Stack and how to use it, see [What is Stack](https://www.alibabacloud.com/help/en/doc-detail/132086.htm).
//
// > **NOTE:** Available in v1.106.0+.
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
// 		_, err := ros.NewStack(ctx, "example", &ros.StackArgs{
// 			StackName: pulumi.String("tf-testaccstack"),
// 			StackPolicyBody: pulumi.String(fmt.Sprintf(`    {
//     	"Statement": [{
//     		"Action": "Update:Delete",
//     		"Resource": "*",
//     		"Effect": "Allow",
//     		"Principal": "*"
//     	}]
//     }
//
// `)),
// 			TemplateBody: pulumi.String(fmt.Sprintf("    {\n    	\"ROSTemplateFormatVersion\": \"2015-09-01\"\n    }\n    \n")),
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
// ROS Stack can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ros/stack:Stack example <stack_id>
// ```
type Stack struct {
	pulumi.CustomResourceState

	// Specifies whether to delete the stack after it is created.
	CreateOption pulumi.StringPtrOutput `pulumi:"createOption"`
	// Specifies whether to enable deletion protection on the stack. Valid values: `Disabled`, `Enabled`. Default to: `Disabled`
	DeletionProtection pulumi.StringPtrOutput `pulumi:"deletionProtection"`
	// Specifies whether to disable rollback on stack creation failure. Default to: `false`.
	DisableRollback pulumi.BoolPtrOutput `pulumi:"disableRollback"`
	// The callback URL for receiving stack event N. Only HTTP POST is supported. Maximum value of N: 5.
	NotificationUrls pulumi.StringArrayOutput `pulumi:"notificationUrls"`
	// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
	Parameters StackParameterArrayOutput `pulumi:"parameters"`
	// The name of the RAM role. ROS assumes the specified RAM role to create the stack and call API operations by using the credentials of the role.
	RamRoleName pulumi.StringPtrOutput `pulumi:"ramRoleName"`
	// Specifies whether to enable replacement update after a resource attribute that does not support modification update is changed. Modification update keeps the physical ID of the resource unchanged. However, the resource is deleted and then recreated, and its physical ID is changed if replacement update is enabled.
	ReplacementOption pulumi.StringPtrOutput `pulumi:"replacementOption"`
	// The retain all resources.
	RetainAllResources pulumi.BoolPtrOutput `pulumi:"retainAllResources"`
	// Specifies whether to retain the resources in the stack.
	RetainResources pulumi.StringArrayOutput `pulumi:"retainResources"`
	// The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
	StackName pulumi.StringOutput `pulumi:"stackName"`
	// The structure that contains the stack policy body. The stack policy body must be 1 to 16,384 bytes in length.
	StackPolicyBody pulumi.StringPtrOutput `pulumi:"stackPolicyBody"`
	// The structure that contains the body of the temporary overriding stack policy. The stack policy body must be 1 to 16,384 bytes in length.
	StackPolicyDuringUpdateBody pulumi.StringPtrOutput `pulumi:"stackPolicyDuringUpdateBody"`
	// The URL of the file that contains the temporary overriding stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	StackPolicyDuringUpdateUrl pulumi.StringPtrOutput `pulumi:"stackPolicyDuringUpdateUrl"`
	// The URL of the file that contains the stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	StackPolicyUrl pulumi.StringPtrOutput `pulumi:"stackPolicyUrl"`
	// The status of Stack.
	Status pulumi.StringOutput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
	TemplateBody pulumi.StringPtrOutput `pulumi:"templateBody"`
	// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	TemplateUrl pulumi.StringPtrOutput `pulumi:"templateUrl"`
	// The version of the template.
	TemplateVersion pulumi.StringPtrOutput `pulumi:"templateVersion"`
	// The timeout period that is specified for the stack creation request. Default to: `60`.
	TimeoutInMinutes pulumi.IntPtrOutput `pulumi:"timeoutInMinutes"`
	// Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request.
	UsePreviousParameters pulumi.BoolPtrOutput `pulumi:"usePreviousParameters"`
}

// NewStack registers a new resource with the given unique name, arguments, and options.
func NewStack(ctx *pulumi.Context,
	name string, args *StackArgs, opts ...pulumi.ResourceOption) (*Stack, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.StackName == nil {
		return nil, errors.New("invalid value for required argument 'StackName'")
	}
	var resource Stack
	err := ctx.RegisterResource("alicloud:ros/stack:Stack", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStack gets an existing Stack resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStack(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StackState, opts ...pulumi.ResourceOption) (*Stack, error) {
	var resource Stack
	err := ctx.ReadResource("alicloud:ros/stack:Stack", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Stack resources.
type stackState struct {
	// Specifies whether to delete the stack after it is created.
	CreateOption *string `pulumi:"createOption"`
	// Specifies whether to enable deletion protection on the stack. Valid values: `Disabled`, `Enabled`. Default to: `Disabled`
	DeletionProtection *string `pulumi:"deletionProtection"`
	// Specifies whether to disable rollback on stack creation failure. Default to: `false`.
	DisableRollback *bool `pulumi:"disableRollback"`
	// The callback URL for receiving stack event N. Only HTTP POST is supported. Maximum value of N: 5.
	NotificationUrls []string `pulumi:"notificationUrls"`
	// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
	Parameters []StackParameter `pulumi:"parameters"`
	// The name of the RAM role. ROS assumes the specified RAM role to create the stack and call API operations by using the credentials of the role.
	RamRoleName *string `pulumi:"ramRoleName"`
	// Specifies whether to enable replacement update after a resource attribute that does not support modification update is changed. Modification update keeps the physical ID of the resource unchanged. However, the resource is deleted and then recreated, and its physical ID is changed if replacement update is enabled.
	ReplacementOption *string `pulumi:"replacementOption"`
	// The retain all resources.
	RetainAllResources *bool `pulumi:"retainAllResources"`
	// Specifies whether to retain the resources in the stack.
	RetainResources []string `pulumi:"retainResources"`
	// The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
	StackName *string `pulumi:"stackName"`
	// The structure that contains the stack policy body. The stack policy body must be 1 to 16,384 bytes in length.
	StackPolicyBody *string `pulumi:"stackPolicyBody"`
	// The structure that contains the body of the temporary overriding stack policy. The stack policy body must be 1 to 16,384 bytes in length.
	StackPolicyDuringUpdateBody *string `pulumi:"stackPolicyDuringUpdateBody"`
	// The URL of the file that contains the temporary overriding stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	StackPolicyDuringUpdateUrl *string `pulumi:"stackPolicyDuringUpdateUrl"`
	// The URL of the file that contains the stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	StackPolicyUrl *string `pulumi:"stackPolicyUrl"`
	// The status of Stack.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
	TemplateBody *string `pulumi:"templateBody"`
	// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	TemplateUrl *string `pulumi:"templateUrl"`
	// The version of the template.
	TemplateVersion *string `pulumi:"templateVersion"`
	// The timeout period that is specified for the stack creation request. Default to: `60`.
	TimeoutInMinutes *int `pulumi:"timeoutInMinutes"`
	// Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request.
	UsePreviousParameters *bool `pulumi:"usePreviousParameters"`
}

type StackState struct {
	// Specifies whether to delete the stack after it is created.
	CreateOption pulumi.StringPtrInput
	// Specifies whether to enable deletion protection on the stack. Valid values: `Disabled`, `Enabled`. Default to: `Disabled`
	DeletionProtection pulumi.StringPtrInput
	// Specifies whether to disable rollback on stack creation failure. Default to: `false`.
	DisableRollback pulumi.BoolPtrInput
	// The callback URL for receiving stack event N. Only HTTP POST is supported. Maximum value of N: 5.
	NotificationUrls pulumi.StringArrayInput
	// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
	Parameters StackParameterArrayInput
	// The name of the RAM role. ROS assumes the specified RAM role to create the stack and call API operations by using the credentials of the role.
	RamRoleName pulumi.StringPtrInput
	// Specifies whether to enable replacement update after a resource attribute that does not support modification update is changed. Modification update keeps the physical ID of the resource unchanged. However, the resource is deleted and then recreated, and its physical ID is changed if replacement update is enabled.
	ReplacementOption pulumi.StringPtrInput
	// The retain all resources.
	RetainAllResources pulumi.BoolPtrInput
	// Specifies whether to retain the resources in the stack.
	RetainResources pulumi.StringArrayInput
	// The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
	StackName pulumi.StringPtrInput
	// The structure that contains the stack policy body. The stack policy body must be 1 to 16,384 bytes in length.
	StackPolicyBody pulumi.StringPtrInput
	// The structure that contains the body of the temporary overriding stack policy. The stack policy body must be 1 to 16,384 bytes in length.
	StackPolicyDuringUpdateBody pulumi.StringPtrInput
	// The URL of the file that contains the temporary overriding stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	StackPolicyDuringUpdateUrl pulumi.StringPtrInput
	// The URL of the file that contains the stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	StackPolicyUrl pulumi.StringPtrInput
	// The status of Stack.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
	TemplateBody pulumi.StringPtrInput
	// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	TemplateUrl pulumi.StringPtrInput
	// The version of the template.
	TemplateVersion pulumi.StringPtrInput
	// The timeout period that is specified for the stack creation request. Default to: `60`.
	TimeoutInMinutes pulumi.IntPtrInput
	// Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request.
	UsePreviousParameters pulumi.BoolPtrInput
}

func (StackState) ElementType() reflect.Type {
	return reflect.TypeOf((*stackState)(nil)).Elem()
}

type stackArgs struct {
	// Specifies whether to delete the stack after it is created.
	CreateOption *string `pulumi:"createOption"`
	// Specifies whether to enable deletion protection on the stack. Valid values: `Disabled`, `Enabled`. Default to: `Disabled`
	DeletionProtection *string `pulumi:"deletionProtection"`
	// Specifies whether to disable rollback on stack creation failure. Default to: `false`.
	DisableRollback *bool `pulumi:"disableRollback"`
	// The callback URL for receiving stack event N. Only HTTP POST is supported. Maximum value of N: 5.
	NotificationUrls []string `pulumi:"notificationUrls"`
	// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
	Parameters []StackParameter `pulumi:"parameters"`
	// The name of the RAM role. ROS assumes the specified RAM role to create the stack and call API operations by using the credentials of the role.
	RamRoleName *string `pulumi:"ramRoleName"`
	// Specifies whether to enable replacement update after a resource attribute that does not support modification update is changed. Modification update keeps the physical ID of the resource unchanged. However, the resource is deleted and then recreated, and its physical ID is changed if replacement update is enabled.
	ReplacementOption *string `pulumi:"replacementOption"`
	// The retain all resources.
	RetainAllResources *bool `pulumi:"retainAllResources"`
	// Specifies whether to retain the resources in the stack.
	RetainResources []string `pulumi:"retainResources"`
	// The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
	StackName string `pulumi:"stackName"`
	// The structure that contains the stack policy body. The stack policy body must be 1 to 16,384 bytes in length.
	StackPolicyBody *string `pulumi:"stackPolicyBody"`
	// The structure that contains the body of the temporary overriding stack policy. The stack policy body must be 1 to 16,384 bytes in length.
	StackPolicyDuringUpdateBody *string `pulumi:"stackPolicyDuringUpdateBody"`
	// The URL of the file that contains the temporary overriding stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	StackPolicyDuringUpdateUrl *string `pulumi:"stackPolicyDuringUpdateUrl"`
	// The URL of the file that contains the stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	StackPolicyUrl *string `pulumi:"stackPolicyUrl"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
	TemplateBody *string `pulumi:"templateBody"`
	// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	TemplateUrl *string `pulumi:"templateUrl"`
	// The version of the template.
	TemplateVersion *string `pulumi:"templateVersion"`
	// The timeout period that is specified for the stack creation request. Default to: `60`.
	TimeoutInMinutes *int `pulumi:"timeoutInMinutes"`
	// Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request.
	UsePreviousParameters *bool `pulumi:"usePreviousParameters"`
}

// The set of arguments for constructing a Stack resource.
type StackArgs struct {
	// Specifies whether to delete the stack after it is created.
	CreateOption pulumi.StringPtrInput
	// Specifies whether to enable deletion protection on the stack. Valid values: `Disabled`, `Enabled`. Default to: `Disabled`
	DeletionProtection pulumi.StringPtrInput
	// Specifies whether to disable rollback on stack creation failure. Default to: `false`.
	DisableRollback pulumi.BoolPtrInput
	// The callback URL for receiving stack event N. Only HTTP POST is supported. Maximum value of N: 5.
	NotificationUrls pulumi.StringArrayInput
	// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
	Parameters StackParameterArrayInput
	// The name of the RAM role. ROS assumes the specified RAM role to create the stack and call API operations by using the credentials of the role.
	RamRoleName pulumi.StringPtrInput
	// Specifies whether to enable replacement update after a resource attribute that does not support modification update is changed. Modification update keeps the physical ID of the resource unchanged. However, the resource is deleted and then recreated, and its physical ID is changed if replacement update is enabled.
	ReplacementOption pulumi.StringPtrInput
	// The retain all resources.
	RetainAllResources pulumi.BoolPtrInput
	// Specifies whether to retain the resources in the stack.
	RetainResources pulumi.StringArrayInput
	// The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
	StackName pulumi.StringInput
	// The structure that contains the stack policy body. The stack policy body must be 1 to 16,384 bytes in length.
	StackPolicyBody pulumi.StringPtrInput
	// The structure that contains the body of the temporary overriding stack policy. The stack policy body must be 1 to 16,384 bytes in length.
	StackPolicyDuringUpdateBody pulumi.StringPtrInput
	// The URL of the file that contains the temporary overriding stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	StackPolicyDuringUpdateUrl pulumi.StringPtrInput
	// The URL of the file that contains the stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	StackPolicyUrl pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
	TemplateBody pulumi.StringPtrInput
	// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	TemplateUrl pulumi.StringPtrInput
	// The version of the template.
	TemplateVersion pulumi.StringPtrInput
	// The timeout period that is specified for the stack creation request. Default to: `60`.
	TimeoutInMinutes pulumi.IntPtrInput
	// Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request.
	UsePreviousParameters pulumi.BoolPtrInput
}

func (StackArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*stackArgs)(nil)).Elem()
}

type StackInput interface {
	pulumi.Input

	ToStackOutput() StackOutput
	ToStackOutputWithContext(ctx context.Context) StackOutput
}

func (*Stack) ElementType() reflect.Type {
	return reflect.TypeOf((**Stack)(nil)).Elem()
}

func (i *Stack) ToStackOutput() StackOutput {
	return i.ToStackOutputWithContext(context.Background())
}

func (i *Stack) ToStackOutputWithContext(ctx context.Context) StackOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackOutput)
}

// StackArrayInput is an input type that accepts StackArray and StackArrayOutput values.
// You can construct a concrete instance of `StackArrayInput` via:
//
//          StackArray{ StackArgs{...} }
type StackArrayInput interface {
	pulumi.Input

	ToStackArrayOutput() StackArrayOutput
	ToStackArrayOutputWithContext(context.Context) StackArrayOutput
}

type StackArray []StackInput

func (StackArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Stack)(nil)).Elem()
}

func (i StackArray) ToStackArrayOutput() StackArrayOutput {
	return i.ToStackArrayOutputWithContext(context.Background())
}

func (i StackArray) ToStackArrayOutputWithContext(ctx context.Context) StackArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackArrayOutput)
}

// StackMapInput is an input type that accepts StackMap and StackMapOutput values.
// You can construct a concrete instance of `StackMapInput` via:
//
//          StackMap{ "key": StackArgs{...} }
type StackMapInput interface {
	pulumi.Input

	ToStackMapOutput() StackMapOutput
	ToStackMapOutputWithContext(context.Context) StackMapOutput
}

type StackMap map[string]StackInput

func (StackMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Stack)(nil)).Elem()
}

func (i StackMap) ToStackMapOutput() StackMapOutput {
	return i.ToStackMapOutputWithContext(context.Background())
}

func (i StackMap) ToStackMapOutputWithContext(ctx context.Context) StackMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackMapOutput)
}

type StackOutput struct{ *pulumi.OutputState }

func (StackOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Stack)(nil)).Elem()
}

func (o StackOutput) ToStackOutput() StackOutput {
	return o
}

func (o StackOutput) ToStackOutputWithContext(ctx context.Context) StackOutput {
	return o
}

// Specifies whether to delete the stack after it is created.
func (o StackOutput) CreateOption() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.CreateOption }).(pulumi.StringPtrOutput)
}

// Specifies whether to enable deletion protection on the stack. Valid values: `Disabled`, `Enabled`. Default to: `Disabled`
func (o StackOutput) DeletionProtection() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.DeletionProtection }).(pulumi.StringPtrOutput)
}

// Specifies whether to disable rollback on stack creation failure. Default to: `false`.
func (o StackOutput) DisableRollback() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.BoolPtrOutput { return v.DisableRollback }).(pulumi.BoolPtrOutput)
}

// The callback URL for receiving stack event N. Only HTTP POST is supported. Maximum value of N: 5.
func (o StackOutput) NotificationUrls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringArrayOutput { return v.NotificationUrls }).(pulumi.StringArrayOutput)
}

// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
func (o StackOutput) Parameters() StackParameterArrayOutput {
	return o.ApplyT(func(v *Stack) StackParameterArrayOutput { return v.Parameters }).(StackParameterArrayOutput)
}

// The name of the RAM role. ROS assumes the specified RAM role to create the stack and call API operations by using the credentials of the role.
func (o StackOutput) RamRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.RamRoleName }).(pulumi.StringPtrOutput)
}

// Specifies whether to enable replacement update after a resource attribute that does not support modification update is changed. Modification update keeps the physical ID of the resource unchanged. However, the resource is deleted and then recreated, and its physical ID is changed if replacement update is enabled.
func (o StackOutput) ReplacementOption() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.ReplacementOption }).(pulumi.StringPtrOutput)
}

// The retain all resources.
func (o StackOutput) RetainAllResources() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.BoolPtrOutput { return v.RetainAllResources }).(pulumi.BoolPtrOutput)
}

// Specifies whether to retain the resources in the stack.
func (o StackOutput) RetainResources() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringArrayOutput { return v.RetainResources }).(pulumi.StringArrayOutput)
}

// The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
func (o StackOutput) StackName() pulumi.StringOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringOutput { return v.StackName }).(pulumi.StringOutput)
}

// The structure that contains the stack policy body. The stack policy body must be 1 to 16,384 bytes in length.
func (o StackOutput) StackPolicyBody() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.StackPolicyBody }).(pulumi.StringPtrOutput)
}

// The structure that contains the body of the temporary overriding stack policy. The stack policy body must be 1 to 16,384 bytes in length.
func (o StackOutput) StackPolicyDuringUpdateBody() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.StackPolicyDuringUpdateBody }).(pulumi.StringPtrOutput)
}

// The URL of the file that contains the temporary overriding stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
func (o StackOutput) StackPolicyDuringUpdateUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.StackPolicyDuringUpdateUrl }).(pulumi.StringPtrOutput)
}

// The URL of the file that contains the stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
func (o StackOutput) StackPolicyUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.StackPolicyUrl }).(pulumi.StringPtrOutput)
}

// The status of Stack.
func (o StackOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o StackOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *Stack) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
func (o StackOutput) TemplateBody() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.TemplateBody }).(pulumi.StringPtrOutput)
}

// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
func (o StackOutput) TemplateUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.TemplateUrl }).(pulumi.StringPtrOutput)
}

// The version of the template.
func (o StackOutput) TemplateVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.StringPtrOutput { return v.TemplateVersion }).(pulumi.StringPtrOutput)
}

// The timeout period that is specified for the stack creation request. Default to: `60`.
func (o StackOutput) TimeoutInMinutes() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.IntPtrOutput { return v.TimeoutInMinutes }).(pulumi.IntPtrOutput)
}

// Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request.
func (o StackOutput) UsePreviousParameters() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Stack) pulumi.BoolPtrOutput { return v.UsePreviousParameters }).(pulumi.BoolPtrOutput)
}

type StackArrayOutput struct{ *pulumi.OutputState }

func (StackArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Stack)(nil)).Elem()
}

func (o StackArrayOutput) ToStackArrayOutput() StackArrayOutput {
	return o
}

func (o StackArrayOutput) ToStackArrayOutputWithContext(ctx context.Context) StackArrayOutput {
	return o
}

func (o StackArrayOutput) Index(i pulumi.IntInput) StackOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Stack {
		return vs[0].([]*Stack)[vs[1].(int)]
	}).(StackOutput)
}

type StackMapOutput struct{ *pulumi.OutputState }

func (StackMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Stack)(nil)).Elem()
}

func (o StackMapOutput) ToStackMapOutput() StackMapOutput {
	return o
}

func (o StackMapOutput) ToStackMapOutputWithContext(ctx context.Context) StackMapOutput {
	return o
}

func (o StackMapOutput) MapIndex(k pulumi.StringInput) StackOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Stack {
		return vs[0].(map[string]*Stack)[vs[1].(string)]
	}).(StackOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StackInput)(nil)).Elem(), &Stack{})
	pulumi.RegisterInputType(reflect.TypeOf((*StackArrayInput)(nil)).Elem(), StackArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StackMapInput)(nil)).Elem(), StackMap{})
	pulumi.RegisterOutputType(StackOutput{})
	pulumi.RegisterOutputType(StackArrayOutput{})
	pulumi.RegisterOutputType(StackMapOutput{})
}
