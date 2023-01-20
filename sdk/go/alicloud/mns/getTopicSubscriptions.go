// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mns

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/mns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			subscriptions, err := mns.GetTopicSubscriptions(ctx, &mns.GetTopicSubscriptionsArgs{
//				NamePrefix: pulumi.StringRef("tf-"),
//				TopicName:  "topic_name",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstTopicSubscriptionId", subscriptions.Subscriptions[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetTopicSubscriptions(ctx *pulumi.Context, args *GetTopicSubscriptionsArgs, opts ...pulumi.InvokeOption) (*GetTopicSubscriptionsResult, error) {
	var rv GetTopicSubscriptionsResult
	err := ctx.Invoke("alicloud:mns/getTopicSubscriptions:getTopicSubscriptions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTopicSubscriptions.
type GetTopicSubscriptionsArgs struct {
	// A string to filter resulting subscriptions of the topic by their name prefixs.
	NamePrefix *string `pulumi:"namePrefix"`
	OutputFile *string `pulumi:"outputFile"`
	// Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
	TopicName string `pulumi:"topicName"`
}

// A collection of values returned by getTopicSubscriptions.
type GetTopicSubscriptionsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string  `pulumi:"id"`
	NamePrefix *string `pulumi:"namePrefix"`
	// A list of subscription names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of subscriptions. Each element contains the following attributes:
	Subscriptions []GetTopicSubscriptionsSubscription `pulumi:"subscriptions"`
	// The topic which The subscription belongs to was named with the name.
	TopicName string `pulumi:"topicName"`
}

func GetTopicSubscriptionsOutput(ctx *pulumi.Context, args GetTopicSubscriptionsOutputArgs, opts ...pulumi.InvokeOption) GetTopicSubscriptionsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetTopicSubscriptionsResult, error) {
			args := v.(GetTopicSubscriptionsArgs)
			r, err := GetTopicSubscriptions(ctx, &args, opts...)
			var s GetTopicSubscriptionsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetTopicSubscriptionsResultOutput)
}

// A collection of arguments for invoking getTopicSubscriptions.
type GetTopicSubscriptionsOutputArgs struct {
	// A string to filter resulting subscriptions of the topic by their name prefixs.
	NamePrefix pulumi.StringPtrInput `pulumi:"namePrefix"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
	TopicName pulumi.StringInput `pulumi:"topicName"`
}

func (GetTopicSubscriptionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTopicSubscriptionsArgs)(nil)).Elem()
}

// A collection of values returned by getTopicSubscriptions.
type GetTopicSubscriptionsResultOutput struct{ *pulumi.OutputState }

func (GetTopicSubscriptionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTopicSubscriptionsResult)(nil)).Elem()
}

func (o GetTopicSubscriptionsResultOutput) ToGetTopicSubscriptionsResultOutput() GetTopicSubscriptionsResultOutput {
	return o
}

func (o GetTopicSubscriptionsResultOutput) ToGetTopicSubscriptionsResultOutputWithContext(ctx context.Context) GetTopicSubscriptionsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetTopicSubscriptionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTopicSubscriptionsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTopicSubscriptionsResultOutput) NamePrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTopicSubscriptionsResult) *string { return v.NamePrefix }).(pulumi.StringPtrOutput)
}

// A list of subscription names.
func (o GetTopicSubscriptionsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTopicSubscriptionsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetTopicSubscriptionsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTopicSubscriptionsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of subscriptions. Each element contains the following attributes:
func (o GetTopicSubscriptionsResultOutput) Subscriptions() GetTopicSubscriptionsSubscriptionArrayOutput {
	return o.ApplyT(func(v GetTopicSubscriptionsResult) []GetTopicSubscriptionsSubscription { return v.Subscriptions }).(GetTopicSubscriptionsSubscriptionArrayOutput)
}

// The topic which The subscription belongs to was named with the name.
func (o GetTopicSubscriptionsResultOutput) TopicName() pulumi.StringOutput {
	return o.ApplyT(func(v GetTopicSubscriptionsResult) string { return v.TopicName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTopicSubscriptionsResultOutput{})
}
