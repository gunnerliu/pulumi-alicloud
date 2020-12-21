// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ros

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a ROS Stack Group resource.
//
// For information about ROS Stack Group and how to use it, see [What is Stack Group](https://www.alibabacloud.com/help/en/doc-detail/151333.htm).
//
// > **NOTE:** Available in v1.107.0+.
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
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/ros"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := ros.NewStackGroup(ctx, "example", &ros.StackGroupArgs{
// 			StackGroupName: pulumi.String("example_value"),
// 			TemplateBody: pulumi.String(fmt.Sprintf("%v%v%v%v", "    {\n", "    	\"ROSTemplateFormatVersion\": \"2015-09-01\"\n", "    }\n", "    \n")),
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
// ROS Stack Group can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ros/stackGroup:StackGroup example <stack_group_name>
// ```
type StackGroup struct {
	pulumi.CustomResourceState

	// The list of target account IDs, in JSON format. A maximum of 20 accounts can be specified.
	AccountIds pulumi.StringPtrOutput `pulumi:"accountIds"`
	// The name of the RAM administrator role assumed by ROS. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
	AdministrationRoleName pulumi.StringOutput `pulumi:"administrationRoleName"`
	// The description of the stack group.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the RAM execution role assumed by the administrator role. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
	ExecutionRoleName pulumi.StringOutput `pulumi:"executionRoleName"`
	// The description of the operation.
	OperationDescription pulumi.StringPtrOutput `pulumi:"operationDescription"`
	// The operation settings, in JSON format.
	OperationPreferences pulumi.StringPtrOutput `pulumi:"operationPreferences"`
	// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
	Parameters StackGroupParameterArrayOutput `pulumi:"parameters"`
	// The list of target regions, in JSON format. A maximum of 20 accounts can be specified.
	RegionIds pulumi.StringPtrOutput `pulumi:"regionIds"`
	// The id of Stack Group.
	StackGroupId pulumi.StringOutput `pulumi:"stackGroupId"`
	// The name of the stack group. The name must be unique in a region.
	StackGroupName pulumi.StringOutput `pulumi:"stackGroupName"`
	// The status of Stack Group.
	Status pulumi.StringOutput `pulumi:"status"`
	// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
	TemplateBody pulumi.StringPtrOutput `pulumi:"templateBody"`
	// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	TemplateUrl pulumi.StringPtrOutput `pulumi:"templateUrl"`
	// The version of the template.
	TemplateVersion pulumi.StringPtrOutput `pulumi:"templateVersion"`
}

// NewStackGroup registers a new resource with the given unique name, arguments, and options.
func NewStackGroup(ctx *pulumi.Context,
	name string, args *StackGroupArgs, opts ...pulumi.ResourceOption) (*StackGroup, error) {
	if args == nil || args.StackGroupName == nil {
		return nil, errors.New("missing required argument 'StackGroupName'")
	}
	if args == nil {
		args = &StackGroupArgs{}
	}
	var resource StackGroup
	err := ctx.RegisterResource("alicloud:ros/stackGroup:StackGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStackGroup gets an existing StackGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStackGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StackGroupState, opts ...pulumi.ResourceOption) (*StackGroup, error) {
	var resource StackGroup
	err := ctx.ReadResource("alicloud:ros/stackGroup:StackGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StackGroup resources.
type stackGroupState struct {
	// The list of target account IDs, in JSON format. A maximum of 20 accounts can be specified.
	AccountIds *string `pulumi:"accountIds"`
	// The name of the RAM administrator role assumed by ROS. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
	AdministrationRoleName *string `pulumi:"administrationRoleName"`
	// The description of the stack group.
	Description *string `pulumi:"description"`
	// The name of the RAM execution role assumed by the administrator role. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
	ExecutionRoleName *string `pulumi:"executionRoleName"`
	// The description of the operation.
	OperationDescription *string `pulumi:"operationDescription"`
	// The operation settings, in JSON format.
	OperationPreferences *string `pulumi:"operationPreferences"`
	// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
	Parameters []StackGroupParameter `pulumi:"parameters"`
	// The list of target regions, in JSON format. A maximum of 20 accounts can be specified.
	RegionIds *string `pulumi:"regionIds"`
	// The id of Stack Group.
	StackGroupId *string `pulumi:"stackGroupId"`
	// The name of the stack group. The name must be unique in a region.
	StackGroupName *string `pulumi:"stackGroupName"`
	// The status of Stack Group.
	Status *string `pulumi:"status"`
	// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
	TemplateBody *string `pulumi:"templateBody"`
	// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	TemplateUrl *string `pulumi:"templateUrl"`
	// The version of the template.
	TemplateVersion *string `pulumi:"templateVersion"`
}

type StackGroupState struct {
	// The list of target account IDs, in JSON format. A maximum of 20 accounts can be specified.
	AccountIds pulumi.StringPtrInput
	// The name of the RAM administrator role assumed by ROS. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
	AdministrationRoleName pulumi.StringPtrInput
	// The description of the stack group.
	Description pulumi.StringPtrInput
	// The name of the RAM execution role assumed by the administrator role. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
	ExecutionRoleName pulumi.StringPtrInput
	// The description of the operation.
	OperationDescription pulumi.StringPtrInput
	// The operation settings, in JSON format.
	OperationPreferences pulumi.StringPtrInput
	// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
	Parameters StackGroupParameterArrayInput
	// The list of target regions, in JSON format. A maximum of 20 accounts can be specified.
	RegionIds pulumi.StringPtrInput
	// The id of Stack Group.
	StackGroupId pulumi.StringPtrInput
	// The name of the stack group. The name must be unique in a region.
	StackGroupName pulumi.StringPtrInput
	// The status of Stack Group.
	Status pulumi.StringPtrInput
	// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
	TemplateBody pulumi.StringPtrInput
	// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	TemplateUrl pulumi.StringPtrInput
	// The version of the template.
	TemplateVersion pulumi.StringPtrInput
}

func (StackGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*stackGroupState)(nil)).Elem()
}

type stackGroupArgs struct {
	// The list of target account IDs, in JSON format. A maximum of 20 accounts can be specified.
	AccountIds *string `pulumi:"accountIds"`
	// The name of the RAM administrator role assumed by ROS. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
	AdministrationRoleName *string `pulumi:"administrationRoleName"`
	// The description of the stack group.
	Description *string `pulumi:"description"`
	// The name of the RAM execution role assumed by the administrator role. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
	ExecutionRoleName *string `pulumi:"executionRoleName"`
	// The description of the operation.
	OperationDescription *string `pulumi:"operationDescription"`
	// The operation settings, in JSON format.
	OperationPreferences *string `pulumi:"operationPreferences"`
	// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
	Parameters []StackGroupParameter `pulumi:"parameters"`
	// The list of target regions, in JSON format. A maximum of 20 accounts can be specified.
	RegionIds *string `pulumi:"regionIds"`
	// The name of the stack group. The name must be unique in a region.
	StackGroupName string `pulumi:"stackGroupName"`
	// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
	TemplateBody *string `pulumi:"templateBody"`
	// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	TemplateUrl *string `pulumi:"templateUrl"`
	// The version of the template.
	TemplateVersion *string `pulumi:"templateVersion"`
}

// The set of arguments for constructing a StackGroup resource.
type StackGroupArgs struct {
	// The list of target account IDs, in JSON format. A maximum of 20 accounts can be specified.
	AccountIds pulumi.StringPtrInput
	// The name of the RAM administrator role assumed by ROS. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
	AdministrationRoleName pulumi.StringPtrInput
	// The description of the stack group.
	Description pulumi.StringPtrInput
	// The name of the RAM execution role assumed by the administrator role. ROS assumes this role to perform operations on the stack corresponding to the stack instance in the stack group.
	ExecutionRoleName pulumi.StringPtrInput
	// The description of the operation.
	OperationDescription pulumi.StringPtrInput
	// The operation settings, in JSON format.
	OperationPreferences pulumi.StringPtrInput
	// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
	Parameters StackGroupParameterArrayInput
	// The list of target regions, in JSON format. A maximum of 20 accounts can be specified.
	RegionIds pulumi.StringPtrInput
	// The name of the stack group. The name must be unique in a region.
	StackGroupName pulumi.StringInput
	// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
	TemplateBody pulumi.StringPtrInput
	// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
	TemplateUrl pulumi.StringPtrInput
	// The version of the template.
	TemplateVersion pulumi.StringPtrInput
}

func (StackGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*stackGroupArgs)(nil)).Elem()
}

type StackGroupInput interface {
	pulumi.Input

	ToStackGroupOutput() StackGroupOutput
	ToStackGroupOutputWithContext(ctx context.Context) StackGroupOutput
}

func (StackGroup) ElementType() reflect.Type {
	return reflect.TypeOf((*StackGroup)(nil)).Elem()
}

func (i StackGroup) ToStackGroupOutput() StackGroupOutput {
	return i.ToStackGroupOutputWithContext(context.Background())
}

func (i StackGroup) ToStackGroupOutputWithContext(ctx context.Context) StackGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackGroupOutput)
}

type StackGroupOutput struct {
	*pulumi.OutputState
}

func (StackGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*StackGroupOutput)(nil)).Elem()
}

func (o StackGroupOutput) ToStackGroupOutput() StackGroupOutput {
	return o
}

func (o StackGroupOutput) ToStackGroupOutputWithContext(ctx context.Context) StackGroupOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(StackGroupOutput{})
}