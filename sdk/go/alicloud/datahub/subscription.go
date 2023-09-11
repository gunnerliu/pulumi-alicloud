// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datahub

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// The subscription is the basic unit of resource usage in Datahub Service under Publish/Subscribe model. You can manage the relationships between user and topics by using subscriptions. [Refer to details](https://www.alibabacloud.com/help/en/datahub/latest/nerbcz).
//
// > **NOTE:** Available since v1.19.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/datahub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform_example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			exampleProject, err := datahub.NewProject(ctx, "exampleProject", &datahub.ProjectArgs{
//				Comment: pulumi.String("created by terraform"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleTopic, err := datahub.NewTopic(ctx, "exampleTopic", &datahub.TopicArgs{
//				ProjectName: exampleProject.Name,
//				RecordType:  pulumi.String("BLOB"),
//				ShardCount:  pulumi.Int(3),
//				LifeCycle:   pulumi.Int(7),
//				Comment:     pulumi.String("created by terraform"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = datahub.NewSubscription(ctx, "exampleSubscription", &datahub.SubscriptionArgs{
//				ProjectName: exampleProject.Name,
//				TopicName:   exampleTopic.Name,
//				Comment:     pulumi.String("created by terraform"),
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
// Datahub subscription can be imported using the ID, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:datahub/subscription:Subscription example tf_datahub_project:tf_datahub_topic:1539073399567UgCzY
//
// ```
type Subscription struct {
	pulumi.CustomResourceState

	// Comment of the datahub subscription. It cannot be longer than 255 characters.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Create time of the datahub subscription. It is a human-readable string rather than 64-bits UTC.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Last modify time of the datahub subscription. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
	LastModifyTime pulumi.StringOutput `pulumi:"lastModifyTime"`
	// The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	ProjectName pulumi.StringOutput `pulumi:"projectName"`
	// The identidy of the subscription, generate from server side.
	SubId pulumi.StringOutput `pulumi:"subId"`
	// The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	TopicName pulumi.StringOutput `pulumi:"topicName"`
}

// NewSubscription registers a new resource with the given unique name, arguments, and options.
func NewSubscription(ctx *pulumi.Context,
	name string, args *SubscriptionArgs, opts ...pulumi.ResourceOption) (*Subscription, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectName == nil {
		return nil, errors.New("invalid value for required argument 'ProjectName'")
	}
	if args.TopicName == nil {
		return nil, errors.New("invalid value for required argument 'TopicName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Subscription
	err := ctx.RegisterResource("alicloud:datahub/subscription:Subscription", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSubscription gets an existing Subscription resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSubscription(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SubscriptionState, opts ...pulumi.ResourceOption) (*Subscription, error) {
	var resource Subscription
	err := ctx.ReadResource("alicloud:datahub/subscription:Subscription", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Subscription resources.
type subscriptionState struct {
	// Comment of the datahub subscription. It cannot be longer than 255 characters.
	Comment *string `pulumi:"comment"`
	// Create time of the datahub subscription. It is a human-readable string rather than 64-bits UTC.
	CreateTime *string `pulumi:"createTime"`
	// Last modify time of the datahub subscription. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
	LastModifyTime *string `pulumi:"lastModifyTime"`
	// The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	ProjectName *string `pulumi:"projectName"`
	// The identidy of the subscription, generate from server side.
	SubId *string `pulumi:"subId"`
	// The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	TopicName *string `pulumi:"topicName"`
}

type SubscriptionState struct {
	// Comment of the datahub subscription. It cannot be longer than 255 characters.
	Comment pulumi.StringPtrInput
	// Create time of the datahub subscription. It is a human-readable string rather than 64-bits UTC.
	CreateTime pulumi.StringPtrInput
	// Last modify time of the datahub subscription. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
	LastModifyTime pulumi.StringPtrInput
	// The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	ProjectName pulumi.StringPtrInput
	// The identidy of the subscription, generate from server side.
	SubId pulumi.StringPtrInput
	// The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	TopicName pulumi.StringPtrInput
}

func (SubscriptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*subscriptionState)(nil)).Elem()
}

type subscriptionArgs struct {
	// Comment of the datahub subscription. It cannot be longer than 255 characters.
	Comment *string `pulumi:"comment"`
	// The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	ProjectName string `pulumi:"projectName"`
	// The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	TopicName string `pulumi:"topicName"`
}

// The set of arguments for constructing a Subscription resource.
type SubscriptionArgs struct {
	// Comment of the datahub subscription. It cannot be longer than 255 characters.
	Comment pulumi.StringPtrInput
	// The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	ProjectName pulumi.StringInput
	// The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	TopicName pulumi.StringInput
}

func (SubscriptionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*subscriptionArgs)(nil)).Elem()
}

type SubscriptionInput interface {
	pulumi.Input

	ToSubscriptionOutput() SubscriptionOutput
	ToSubscriptionOutputWithContext(ctx context.Context) SubscriptionOutput
}

func (*Subscription) ElementType() reflect.Type {
	return reflect.TypeOf((**Subscription)(nil)).Elem()
}

func (i *Subscription) ToSubscriptionOutput() SubscriptionOutput {
	return i.ToSubscriptionOutputWithContext(context.Background())
}

func (i *Subscription) ToSubscriptionOutputWithContext(ctx context.Context) SubscriptionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionOutput)
}

func (i *Subscription) ToOutput(ctx context.Context) pulumix.Output[*Subscription] {
	return pulumix.Output[*Subscription]{
		OutputState: i.ToSubscriptionOutputWithContext(ctx).OutputState,
	}
}

// SubscriptionArrayInput is an input type that accepts SubscriptionArray and SubscriptionArrayOutput values.
// You can construct a concrete instance of `SubscriptionArrayInput` via:
//
//	SubscriptionArray{ SubscriptionArgs{...} }
type SubscriptionArrayInput interface {
	pulumi.Input

	ToSubscriptionArrayOutput() SubscriptionArrayOutput
	ToSubscriptionArrayOutputWithContext(context.Context) SubscriptionArrayOutput
}

type SubscriptionArray []SubscriptionInput

func (SubscriptionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Subscription)(nil)).Elem()
}

func (i SubscriptionArray) ToSubscriptionArrayOutput() SubscriptionArrayOutput {
	return i.ToSubscriptionArrayOutputWithContext(context.Background())
}

func (i SubscriptionArray) ToSubscriptionArrayOutputWithContext(ctx context.Context) SubscriptionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionArrayOutput)
}

func (i SubscriptionArray) ToOutput(ctx context.Context) pulumix.Output[[]*Subscription] {
	return pulumix.Output[[]*Subscription]{
		OutputState: i.ToSubscriptionArrayOutputWithContext(ctx).OutputState,
	}
}

// SubscriptionMapInput is an input type that accepts SubscriptionMap and SubscriptionMapOutput values.
// You can construct a concrete instance of `SubscriptionMapInput` via:
//
//	SubscriptionMap{ "key": SubscriptionArgs{...} }
type SubscriptionMapInput interface {
	pulumi.Input

	ToSubscriptionMapOutput() SubscriptionMapOutput
	ToSubscriptionMapOutputWithContext(context.Context) SubscriptionMapOutput
}

type SubscriptionMap map[string]SubscriptionInput

func (SubscriptionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Subscription)(nil)).Elem()
}

func (i SubscriptionMap) ToSubscriptionMapOutput() SubscriptionMapOutput {
	return i.ToSubscriptionMapOutputWithContext(context.Background())
}

func (i SubscriptionMap) ToSubscriptionMapOutputWithContext(ctx context.Context) SubscriptionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionMapOutput)
}

func (i SubscriptionMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Subscription] {
	return pulumix.Output[map[string]*Subscription]{
		OutputState: i.ToSubscriptionMapOutputWithContext(ctx).OutputState,
	}
}

type SubscriptionOutput struct{ *pulumi.OutputState }

func (SubscriptionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Subscription)(nil)).Elem()
}

func (o SubscriptionOutput) ToSubscriptionOutput() SubscriptionOutput {
	return o
}

func (o SubscriptionOutput) ToSubscriptionOutputWithContext(ctx context.Context) SubscriptionOutput {
	return o
}

func (o SubscriptionOutput) ToOutput(ctx context.Context) pulumix.Output[*Subscription] {
	return pulumix.Output[*Subscription]{
		OutputState: o.OutputState,
	}
}

// Comment of the datahub subscription. It cannot be longer than 255 characters.
func (o SubscriptionOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Create time of the datahub subscription. It is a human-readable string rather than 64-bits UTC.
func (o SubscriptionOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Last modify time of the datahub subscription. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
func (o SubscriptionOutput) LastModifyTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringOutput { return v.LastModifyTime }).(pulumi.StringOutput)
}

// The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
func (o SubscriptionOutput) ProjectName() pulumi.StringOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringOutput { return v.ProjectName }).(pulumi.StringOutput)
}

// The identidy of the subscription, generate from server side.
func (o SubscriptionOutput) SubId() pulumi.StringOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringOutput { return v.SubId }).(pulumi.StringOutput)
}

// The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
func (o SubscriptionOutput) TopicName() pulumi.StringOutput {
	return o.ApplyT(func(v *Subscription) pulumi.StringOutput { return v.TopicName }).(pulumi.StringOutput)
}

type SubscriptionArrayOutput struct{ *pulumi.OutputState }

func (SubscriptionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Subscription)(nil)).Elem()
}

func (o SubscriptionArrayOutput) ToSubscriptionArrayOutput() SubscriptionArrayOutput {
	return o
}

func (o SubscriptionArrayOutput) ToSubscriptionArrayOutputWithContext(ctx context.Context) SubscriptionArrayOutput {
	return o
}

func (o SubscriptionArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Subscription] {
	return pulumix.Output[[]*Subscription]{
		OutputState: o.OutputState,
	}
}

func (o SubscriptionArrayOutput) Index(i pulumi.IntInput) SubscriptionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Subscription {
		return vs[0].([]*Subscription)[vs[1].(int)]
	}).(SubscriptionOutput)
}

type SubscriptionMapOutput struct{ *pulumi.OutputState }

func (SubscriptionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Subscription)(nil)).Elem()
}

func (o SubscriptionMapOutput) ToSubscriptionMapOutput() SubscriptionMapOutput {
	return o
}

func (o SubscriptionMapOutput) ToSubscriptionMapOutputWithContext(ctx context.Context) SubscriptionMapOutput {
	return o
}

func (o SubscriptionMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Subscription] {
	return pulumix.Output[map[string]*Subscription]{
		OutputState: o.OutputState,
	}
}

func (o SubscriptionMapOutput) MapIndex(k pulumi.StringInput) SubscriptionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Subscription {
		return vs[0].(map[string]*Subscription)[vs[1].(string)]
	}).(SubscriptionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionInput)(nil)).Elem(), &Subscription{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionArrayInput)(nil)).Elem(), SubscriptionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionMapInput)(nil)).Elem(), SubscriptionMap{})
	pulumi.RegisterOutputType(SubscriptionOutput{})
	pulumi.RegisterOutputType(SubscriptionArrayOutput{})
	pulumi.RegisterOutputType(SubscriptionMapOutput{})
}
