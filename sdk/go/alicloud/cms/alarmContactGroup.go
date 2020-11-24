// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cms

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a CMS Alarm Contact Group resource.
//
// For information about CMS Alarm Contact Group and how to use it, see [What is Alarm Contact Group](https://www.alibabacloud.com/help/en/doc-detail/114929.htm).
//
// > **NOTE:** Available in v1.101.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/cms"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cms.NewAlarmContactGroup(ctx, "example", &cms.AlarmContactGroupArgs{
// 			AlarmContactGroupName: pulumi.String("tf-test"),
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
// CMS Alarm Contact Group can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:cms/alarmContactGroup:AlarmContactGroup example tf-testacc123
// ```
type AlarmContactGroup struct {
	pulumi.CustomResourceState

	// The name of the alarm group.
	AlarmContactGroupName pulumi.StringOutput `pulumi:"alarmContactGroupName"`
	// The name of the alert contact.
	Contacts pulumi.StringArrayOutput `pulumi:"contacts"`
	// The description of the alert group.
	Describe pulumi.StringPtrOutput `pulumi:"describe"`
	// Whether to open weekly subscription.
	EnableSubscribed pulumi.BoolOutput `pulumi:"enableSubscribed"`
}

// NewAlarmContactGroup registers a new resource with the given unique name, arguments, and options.
func NewAlarmContactGroup(ctx *pulumi.Context,
	name string, args *AlarmContactGroupArgs, opts ...pulumi.ResourceOption) (*AlarmContactGroup, error) {
	if args == nil || args.AlarmContactGroupName == nil {
		return nil, errors.New("missing required argument 'AlarmContactGroupName'")
	}
	if args == nil {
		args = &AlarmContactGroupArgs{}
	}
	var resource AlarmContactGroup
	err := ctx.RegisterResource("alicloud:cms/alarmContactGroup:AlarmContactGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlarmContactGroup gets an existing AlarmContactGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlarmContactGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlarmContactGroupState, opts ...pulumi.ResourceOption) (*AlarmContactGroup, error) {
	var resource AlarmContactGroup
	err := ctx.ReadResource("alicloud:cms/alarmContactGroup:AlarmContactGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlarmContactGroup resources.
type alarmContactGroupState struct {
	// The name of the alarm group.
	AlarmContactGroupName *string `pulumi:"alarmContactGroupName"`
	// The name of the alert contact.
	Contacts []string `pulumi:"contacts"`
	// The description of the alert group.
	Describe *string `pulumi:"describe"`
	// Whether to open weekly subscription.
	EnableSubscribed *bool `pulumi:"enableSubscribed"`
}

type AlarmContactGroupState struct {
	// The name of the alarm group.
	AlarmContactGroupName pulumi.StringPtrInput
	// The name of the alert contact.
	Contacts pulumi.StringArrayInput
	// The description of the alert group.
	Describe pulumi.StringPtrInput
	// Whether to open weekly subscription.
	EnableSubscribed pulumi.BoolPtrInput
}

func (AlarmContactGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*alarmContactGroupState)(nil)).Elem()
}

type alarmContactGroupArgs struct {
	// The name of the alarm group.
	AlarmContactGroupName string `pulumi:"alarmContactGroupName"`
	// The name of the alert contact.
	Contacts []string `pulumi:"contacts"`
	// The description of the alert group.
	Describe *string `pulumi:"describe"`
	// Whether to open weekly subscription.
	EnableSubscribed *bool `pulumi:"enableSubscribed"`
}

// The set of arguments for constructing a AlarmContactGroup resource.
type AlarmContactGroupArgs struct {
	// The name of the alarm group.
	AlarmContactGroupName pulumi.StringInput
	// The name of the alert contact.
	Contacts pulumi.StringArrayInput
	// The description of the alert group.
	Describe pulumi.StringPtrInput
	// Whether to open weekly subscription.
	EnableSubscribed pulumi.BoolPtrInput
}

func (AlarmContactGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alarmContactGroupArgs)(nil)).Elem()
}

type AlarmContactGroupInput interface {
	pulumi.Input

	ToAlarmContactGroupOutput() AlarmContactGroupOutput
	ToAlarmContactGroupOutputWithContext(ctx context.Context) AlarmContactGroupOutput
}

func (AlarmContactGroup) ElementType() reflect.Type {
	return reflect.TypeOf((*AlarmContactGroup)(nil)).Elem()
}

func (i AlarmContactGroup) ToAlarmContactGroupOutput() AlarmContactGroupOutput {
	return i.ToAlarmContactGroupOutputWithContext(context.Background())
}

func (i AlarmContactGroup) ToAlarmContactGroupOutputWithContext(ctx context.Context) AlarmContactGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlarmContactGroupOutput)
}

type AlarmContactGroupOutput struct {
	*pulumi.OutputState
}

func (AlarmContactGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AlarmContactGroupOutput)(nil)).Elem()
}

func (o AlarmContactGroupOutput) ToAlarmContactGroupOutput() AlarmContactGroupOutput {
	return o
}

func (o AlarmContactGroupOutput) ToAlarmContactGroupOutputWithContext(ctx context.Context) AlarmContactGroupOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(AlarmContactGroupOutput{})
}
