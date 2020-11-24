// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package datahub

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// The project is the basic unit of resource management in Datahub Service and is used to isolate and control resources. It contains a set of Topics. You can manage the datahub sources of an application by using projects. [Refer to details](https://help.aliyun.com/document_detail/47440.html).
//
// > **NOTE:** Currently Datahub service only can be supported in the regions: cn-beijing, cn-hangzhou, cn-shanghai, cn-shenzhen,  ap-southeast-1.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/datahub"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := datahub.NewProject(ctx, "example", &datahub.ProjectArgs{
// 			Comment: pulumi.String("created by terraform"),
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
// Datahub project can be imported using the *name* or ID, e.g.
//
// ```sh
//  $ pulumi import alicloud:datahub/project:Project example tf_datahub_project
// ```
type Project struct {
	pulumi.CustomResourceState

	// Comment of the datahub project. It cannot be longer than 255 characters.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Create time of the datahub project. It is a human-readable string rather than 64-bits UTC.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Last modify time of the datahub project. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
	LastModifyTime pulumi.StringOutput `pulumi:"lastModifyTime"`
	// The name of the datahub project. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewProject registers a new resource with the given unique name, arguments, and options.
func NewProject(ctx *pulumi.Context,
	name string, args *ProjectArgs, opts ...pulumi.ResourceOption) (*Project, error) {
	if args == nil {
		args = &ProjectArgs{}
	}
	var resource Project
	err := ctx.RegisterResource("alicloud:datahub/project:Project", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProject gets an existing Project resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectState, opts ...pulumi.ResourceOption) (*Project, error) {
	var resource Project
	err := ctx.ReadResource("alicloud:datahub/project:Project", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Project resources.
type projectState struct {
	// Comment of the datahub project. It cannot be longer than 255 characters.
	Comment *string `pulumi:"comment"`
	// Create time of the datahub project. It is a human-readable string rather than 64-bits UTC.
	CreateTime *string `pulumi:"createTime"`
	// Last modify time of the datahub project. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
	LastModifyTime *string `pulumi:"lastModifyTime"`
	// The name of the datahub project. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	Name *string `pulumi:"name"`
}

type ProjectState struct {
	// Comment of the datahub project. It cannot be longer than 255 characters.
	Comment pulumi.StringPtrInput
	// Create time of the datahub project. It is a human-readable string rather than 64-bits UTC.
	CreateTime pulumi.StringPtrInput
	// Last modify time of the datahub project. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
	LastModifyTime pulumi.StringPtrInput
	// The name of the datahub project. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	Name pulumi.StringPtrInput
}

func (ProjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectState)(nil)).Elem()
}

type projectArgs struct {
	// Comment of the datahub project. It cannot be longer than 255 characters.
	Comment *string `pulumi:"comment"`
	// The name of the datahub project. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a Project resource.
type ProjectArgs struct {
	// Comment of the datahub project. It cannot be longer than 255 characters.
	Comment pulumi.StringPtrInput
	// The name of the datahub project. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	Name pulumi.StringPtrInput
}

func (ProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectArgs)(nil)).Elem()
}

type ProjectInput interface {
	pulumi.Input

	ToProjectOutput() ProjectOutput
	ToProjectOutputWithContext(ctx context.Context) ProjectOutput
}

func (Project) ElementType() reflect.Type {
	return reflect.TypeOf((*Project)(nil)).Elem()
}

func (i Project) ToProjectOutput() ProjectOutput {
	return i.ToProjectOutputWithContext(context.Background())
}

func (i Project) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectOutput)
}

type ProjectOutput struct {
	*pulumi.OutputState
}

func (ProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProjectOutput)(nil)).Elem()
}

func (o ProjectOutput) ToProjectOutput() ProjectOutput {
	return o
}

func (o ProjectOutput) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ProjectOutput{})
}
