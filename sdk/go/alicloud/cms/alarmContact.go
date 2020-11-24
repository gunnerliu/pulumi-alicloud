// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cms

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Creates or modifies an alarm contact. For information about alarm contact and how to use it, see [What is alarm contact](https://www.alibabacloud.com/help/en/doc-detail/114923.htm).
//
// > **NOTE:** Available in v1.99.0+.
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
// 		_, err := cms.NewAlarmContact(ctx, "example", &cms.AlarmContactArgs{
// 			AlarmContactName: pulumi.String("zhangsan"),
// 			ChannelsMail:     pulumi.String("terraform.test.com"),
// 			Describe:         pulumi.String("For Test"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
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
// 		_, err := cms.NewAlarmContact(ctx, "example", &cms.AlarmContactArgs{
// 			AlarmContactName: pulumi.String("zhangsan"),
// 			Describe:         pulumi.String("For Test"),
// 			ChannelsMail:     pulumi.String("terraform.test.com"),
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
// Alarm contact can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:cms/alarmContact:AlarmContact example abc12345
// ```
type AlarmContact struct {
	pulumi.CustomResourceState

	// The name of the alarm contact.
	AlarmContactName pulumi.StringOutput `pulumi:"alarmContactName"`
	// The TradeManager ID of the alarm contact.
	ChannelsAliim pulumi.StringPtrOutput `pulumi:"channelsAliim"`
	// The webhook URL of the DingTalk chatbot.
	ChannelsDingWebHook pulumi.StringPtrOutput `pulumi:"channelsDingWebHook"`
	// The email address of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
	ChannelsMail pulumi.StringPtrOutput `pulumi:"channelsMail"`
	// The phone number of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
	ChannelsSms pulumi.StringPtrOutput `pulumi:"channelsSms"`
	// The description of the alarm contact.
	Describe pulumi.StringOutput `pulumi:"describe"`
	// The language type of the alarm. Valid values: `en`, `zh-cn`.
	Lang pulumi.StringPtrOutput `pulumi:"lang"`
}

// NewAlarmContact registers a new resource with the given unique name, arguments, and options.
func NewAlarmContact(ctx *pulumi.Context,
	name string, args *AlarmContactArgs, opts ...pulumi.ResourceOption) (*AlarmContact, error) {
	if args == nil || args.AlarmContactName == nil {
		return nil, errors.New("missing required argument 'AlarmContactName'")
	}
	if args == nil || args.Describe == nil {
		return nil, errors.New("missing required argument 'Describe'")
	}
	if args == nil {
		args = &AlarmContactArgs{}
	}
	var resource AlarmContact
	err := ctx.RegisterResource("alicloud:cms/alarmContact:AlarmContact", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlarmContact gets an existing AlarmContact resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlarmContact(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlarmContactState, opts ...pulumi.ResourceOption) (*AlarmContact, error) {
	var resource AlarmContact
	err := ctx.ReadResource("alicloud:cms/alarmContact:AlarmContact", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlarmContact resources.
type alarmContactState struct {
	// The name of the alarm contact.
	AlarmContactName *string `pulumi:"alarmContactName"`
	// The TradeManager ID of the alarm contact.
	ChannelsAliim *string `pulumi:"channelsAliim"`
	// The webhook URL of the DingTalk chatbot.
	ChannelsDingWebHook *string `pulumi:"channelsDingWebHook"`
	// The email address of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
	ChannelsMail *string `pulumi:"channelsMail"`
	// The phone number of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
	ChannelsSms *string `pulumi:"channelsSms"`
	// The description of the alarm contact.
	Describe *string `pulumi:"describe"`
	// The language type of the alarm. Valid values: `en`, `zh-cn`.
	Lang *string `pulumi:"lang"`
}

type AlarmContactState struct {
	// The name of the alarm contact.
	AlarmContactName pulumi.StringPtrInput
	// The TradeManager ID of the alarm contact.
	ChannelsAliim pulumi.StringPtrInput
	// The webhook URL of the DingTalk chatbot.
	ChannelsDingWebHook pulumi.StringPtrInput
	// The email address of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
	ChannelsMail pulumi.StringPtrInput
	// The phone number of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
	ChannelsSms pulumi.StringPtrInput
	// The description of the alarm contact.
	Describe pulumi.StringPtrInput
	// The language type of the alarm. Valid values: `en`, `zh-cn`.
	Lang pulumi.StringPtrInput
}

func (AlarmContactState) ElementType() reflect.Type {
	return reflect.TypeOf((*alarmContactState)(nil)).Elem()
}

type alarmContactArgs struct {
	// The name of the alarm contact.
	AlarmContactName string `pulumi:"alarmContactName"`
	// The TradeManager ID of the alarm contact.
	ChannelsAliim *string `pulumi:"channelsAliim"`
	// The webhook URL of the DingTalk chatbot.
	ChannelsDingWebHook *string `pulumi:"channelsDingWebHook"`
	// The email address of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
	ChannelsMail *string `pulumi:"channelsMail"`
	// The phone number of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
	ChannelsSms *string `pulumi:"channelsSms"`
	// The description of the alarm contact.
	Describe string `pulumi:"describe"`
	// The language type of the alarm. Valid values: `en`, `zh-cn`.
	Lang *string `pulumi:"lang"`
}

// The set of arguments for constructing a AlarmContact resource.
type AlarmContactArgs struct {
	// The name of the alarm contact.
	AlarmContactName pulumi.StringInput
	// The TradeManager ID of the alarm contact.
	ChannelsAliim pulumi.StringPtrInput
	// The webhook URL of the DingTalk chatbot.
	ChannelsDingWebHook pulumi.StringPtrInput
	// The email address of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
	ChannelsMail pulumi.StringPtrInput
	// The phone number of the alarm contact. After you add or modify an email address, the recipient receives an email that contains an activation link. The system adds the recipient to the list of alarm contacts only after the recipient activates the email address.
	ChannelsSms pulumi.StringPtrInput
	// The description of the alarm contact.
	Describe pulumi.StringInput
	// The language type of the alarm. Valid values: `en`, `zh-cn`.
	Lang pulumi.StringPtrInput
}

func (AlarmContactArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alarmContactArgs)(nil)).Elem()
}

type AlarmContactInput interface {
	pulumi.Input

	ToAlarmContactOutput() AlarmContactOutput
	ToAlarmContactOutputWithContext(ctx context.Context) AlarmContactOutput
}

func (AlarmContact) ElementType() reflect.Type {
	return reflect.TypeOf((*AlarmContact)(nil)).Elem()
}

func (i AlarmContact) ToAlarmContactOutput() AlarmContactOutput {
	return i.ToAlarmContactOutputWithContext(context.Background())
}

func (i AlarmContact) ToAlarmContactOutputWithContext(ctx context.Context) AlarmContactOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlarmContactOutput)
}

type AlarmContactOutput struct {
	*pulumi.OutputState
}

func (AlarmContactOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AlarmContactOutput)(nil)).Elem()
}

func (o AlarmContactOutput) ToAlarmContactOutput() AlarmContactOutput {
	return o
}

func (o AlarmContactOutput) ToAlarmContactOutputWithContext(ctx context.Context) AlarmContactOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(AlarmContactOutput{})
}
