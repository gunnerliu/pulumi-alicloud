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

// The topic is the basic unit of Datahub data source and is used to define one kind of data or stream. It contains a set of subscriptions. You can manage the datahub source of an application by using topics. [Refer to details](https://www.alibabacloud.com/help/en/datahub/latest/nerbcz).
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
//			name := "tf_example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			example, err := datahub.NewProject(ctx, "example", &datahub.ProjectArgs{
//				Comment: pulumi.String("created by terraform"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = datahub.NewTopic(ctx, "exampleBlob", &datahub.TopicArgs{
//				ProjectName: example.Name,
//				RecordType:  pulumi.String("BLOB"),
//				ShardCount:  pulumi.Int(3),
//				LifeCycle:   pulumi.Int(7),
//				Comment:     pulumi.String("created by terraform"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = datahub.NewTopic(ctx, "exampleTuple", &datahub.TopicArgs{
//				ProjectName: example.Name,
//				RecordType:  pulumi.String("TUPLE"),
//				RecordSchema: pulumi.AnyMap{
//					"bigint_field":    pulumi.Any("BIGINT"),
//					"timestamp_field": pulumi.Any("TIMESTAMP"),
//					"string_field":    pulumi.Any("STRING"),
//					"double_field":    pulumi.Any("DOUBLE"),
//					"boolean_field":   pulumi.Any("BOOLEAN"),
//				},
//				ShardCount: pulumi.Int(3),
//				LifeCycle:  pulumi.Int(7),
//				Comment:    pulumi.String("created by terraform"),
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
// Datahub topic can be imported using the ID, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:datahub/topic:Topic example tf_datahub_project:tf_datahub_topic
//
// ```
type Topic struct {
	pulumi.CustomResourceState

	// Comment of the datahub topic. It cannot be longer than 255 characters.
	//
	// **Notes:** Currently `lifeCycle` can not be modified and it will be supported in the next future.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Create time of the datahub topic. It is a human-readable string rather than 64-bits UTC.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Last modify time of the datahub topic. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
	LastModifyTime pulumi.StringOutput `pulumi:"lastModifyTime"`
	// How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
	LifeCycle pulumi.IntPtrOutput `pulumi:"lifeCycle"`
	// The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the datahub project that this topic belongs to. It is case-insensitive.
	ProjectName pulumi.StringOutput `pulumi:"projectName"`
	// Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
	// - BIGINT
	// - STRING
	// - BOOLEAN
	// - DOUBLE
	// - TIMESTAMP
	RecordSchema pulumi.MapOutput `pulumi:"recordSchema"`
	// The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
	RecordType pulumi.StringPtrOutput `pulumi:"recordType"`
	// The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
	ShardCount pulumi.IntPtrOutput `pulumi:"shardCount"`
}

// NewTopic registers a new resource with the given unique name, arguments, and options.
func NewTopic(ctx *pulumi.Context,
	name string, args *TopicArgs, opts ...pulumi.ResourceOption) (*Topic, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectName == nil {
		return nil, errors.New("invalid value for required argument 'ProjectName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Topic
	err := ctx.RegisterResource("alicloud:datahub/topic:Topic", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTopic gets an existing Topic resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTopic(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TopicState, opts ...pulumi.ResourceOption) (*Topic, error) {
	var resource Topic
	err := ctx.ReadResource("alicloud:datahub/topic:Topic", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Topic resources.
type topicState struct {
	// Comment of the datahub topic. It cannot be longer than 255 characters.
	//
	// **Notes:** Currently `lifeCycle` can not be modified and it will be supported in the next future.
	Comment *string `pulumi:"comment"`
	// Create time of the datahub topic. It is a human-readable string rather than 64-bits UTC.
	CreateTime *string `pulumi:"createTime"`
	// Last modify time of the datahub topic. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
	LastModifyTime *string `pulumi:"lastModifyTime"`
	// How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
	LifeCycle *int `pulumi:"lifeCycle"`
	// The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	Name *string `pulumi:"name"`
	// The name of the datahub project that this topic belongs to. It is case-insensitive.
	ProjectName *string `pulumi:"projectName"`
	// Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
	// - BIGINT
	// - STRING
	// - BOOLEAN
	// - DOUBLE
	// - TIMESTAMP
	RecordSchema map[string]interface{} `pulumi:"recordSchema"`
	// The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
	RecordType *string `pulumi:"recordType"`
	// The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
	ShardCount *int `pulumi:"shardCount"`
}

type TopicState struct {
	// Comment of the datahub topic. It cannot be longer than 255 characters.
	//
	// **Notes:** Currently `lifeCycle` can not be modified and it will be supported in the next future.
	Comment pulumi.StringPtrInput
	// Create time of the datahub topic. It is a human-readable string rather than 64-bits UTC.
	CreateTime pulumi.StringPtrInput
	// Last modify time of the datahub topic. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
	LastModifyTime pulumi.StringPtrInput
	// How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
	LifeCycle pulumi.IntPtrInput
	// The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	Name pulumi.StringPtrInput
	// The name of the datahub project that this topic belongs to. It is case-insensitive.
	ProjectName pulumi.StringPtrInput
	// Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
	// - BIGINT
	// - STRING
	// - BOOLEAN
	// - DOUBLE
	// - TIMESTAMP
	RecordSchema pulumi.MapInput
	// The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
	RecordType pulumi.StringPtrInput
	// The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
	ShardCount pulumi.IntPtrInput
}

func (TopicState) ElementType() reflect.Type {
	return reflect.TypeOf((*topicState)(nil)).Elem()
}

type topicArgs struct {
	// Comment of the datahub topic. It cannot be longer than 255 characters.
	//
	// **Notes:** Currently `lifeCycle` can not be modified and it will be supported in the next future.
	Comment *string `pulumi:"comment"`
	// How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
	LifeCycle *int `pulumi:"lifeCycle"`
	// The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	Name *string `pulumi:"name"`
	// The name of the datahub project that this topic belongs to. It is case-insensitive.
	ProjectName string `pulumi:"projectName"`
	// Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
	// - BIGINT
	// - STRING
	// - BOOLEAN
	// - DOUBLE
	// - TIMESTAMP
	RecordSchema map[string]interface{} `pulumi:"recordSchema"`
	// The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
	RecordType *string `pulumi:"recordType"`
	// The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
	ShardCount *int `pulumi:"shardCount"`
}

// The set of arguments for constructing a Topic resource.
type TopicArgs struct {
	// Comment of the datahub topic. It cannot be longer than 255 characters.
	//
	// **Notes:** Currently `lifeCycle` can not be modified and it will be supported in the next future.
	Comment pulumi.StringPtrInput
	// How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
	LifeCycle pulumi.IntPtrInput
	// The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
	Name pulumi.StringPtrInput
	// The name of the datahub project that this topic belongs to. It is case-insensitive.
	ProjectName pulumi.StringInput
	// Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
	// - BIGINT
	// - STRING
	// - BOOLEAN
	// - DOUBLE
	// - TIMESTAMP
	RecordSchema pulumi.MapInput
	// The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
	RecordType pulumi.StringPtrInput
	// The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
	ShardCount pulumi.IntPtrInput
}

func (TopicArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*topicArgs)(nil)).Elem()
}

type TopicInput interface {
	pulumi.Input

	ToTopicOutput() TopicOutput
	ToTopicOutputWithContext(ctx context.Context) TopicOutput
}

func (*Topic) ElementType() reflect.Type {
	return reflect.TypeOf((**Topic)(nil)).Elem()
}

func (i *Topic) ToTopicOutput() TopicOutput {
	return i.ToTopicOutputWithContext(context.Background())
}

func (i *Topic) ToTopicOutputWithContext(ctx context.Context) TopicOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicOutput)
}

func (i *Topic) ToOutput(ctx context.Context) pulumix.Output[*Topic] {
	return pulumix.Output[*Topic]{
		OutputState: i.ToTopicOutputWithContext(ctx).OutputState,
	}
}

// TopicArrayInput is an input type that accepts TopicArray and TopicArrayOutput values.
// You can construct a concrete instance of `TopicArrayInput` via:
//
//	TopicArray{ TopicArgs{...} }
type TopicArrayInput interface {
	pulumi.Input

	ToTopicArrayOutput() TopicArrayOutput
	ToTopicArrayOutputWithContext(context.Context) TopicArrayOutput
}

type TopicArray []TopicInput

func (TopicArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Topic)(nil)).Elem()
}

func (i TopicArray) ToTopicArrayOutput() TopicArrayOutput {
	return i.ToTopicArrayOutputWithContext(context.Background())
}

func (i TopicArray) ToTopicArrayOutputWithContext(ctx context.Context) TopicArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicArrayOutput)
}

func (i TopicArray) ToOutput(ctx context.Context) pulumix.Output[[]*Topic] {
	return pulumix.Output[[]*Topic]{
		OutputState: i.ToTopicArrayOutputWithContext(ctx).OutputState,
	}
}

// TopicMapInput is an input type that accepts TopicMap and TopicMapOutput values.
// You can construct a concrete instance of `TopicMapInput` via:
//
//	TopicMap{ "key": TopicArgs{...} }
type TopicMapInput interface {
	pulumi.Input

	ToTopicMapOutput() TopicMapOutput
	ToTopicMapOutputWithContext(context.Context) TopicMapOutput
}

type TopicMap map[string]TopicInput

func (TopicMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Topic)(nil)).Elem()
}

func (i TopicMap) ToTopicMapOutput() TopicMapOutput {
	return i.ToTopicMapOutputWithContext(context.Background())
}

func (i TopicMap) ToTopicMapOutputWithContext(ctx context.Context) TopicMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicMapOutput)
}

func (i TopicMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Topic] {
	return pulumix.Output[map[string]*Topic]{
		OutputState: i.ToTopicMapOutputWithContext(ctx).OutputState,
	}
}

type TopicOutput struct{ *pulumi.OutputState }

func (TopicOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Topic)(nil)).Elem()
}

func (o TopicOutput) ToTopicOutput() TopicOutput {
	return o
}

func (o TopicOutput) ToTopicOutputWithContext(ctx context.Context) TopicOutput {
	return o
}

func (o TopicOutput) ToOutput(ctx context.Context) pulumix.Output[*Topic] {
	return pulumix.Output[*Topic]{
		OutputState: o.OutputState,
	}
}

// Comment of the datahub topic. It cannot be longer than 255 characters.
//
// **Notes:** Currently `lifeCycle` can not be modified and it will be supported in the next future.
func (o TopicOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Topic) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Create time of the datahub topic. It is a human-readable string rather than 64-bits UTC.
func (o TopicOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Topic) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Last modify time of the datahub topic. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
func (o TopicOutput) LastModifyTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Topic) pulumi.StringOutput { return v.LastModifyTime }).(pulumi.StringOutput)
}

// How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
func (o TopicOutput) LifeCycle() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Topic) pulumi.IntPtrOutput { return v.LifeCycle }).(pulumi.IntPtrOutput)
}

// The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
func (o TopicOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Topic) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the datahub project that this topic belongs to. It is case-insensitive.
func (o TopicOutput) ProjectName() pulumi.StringOutput {
	return o.ApplyT(func(v *Topic) pulumi.StringOutput { return v.ProjectName }).(pulumi.StringOutput)
}

// Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
// - BIGINT
// - STRING
// - BOOLEAN
// - DOUBLE
// - TIMESTAMP
func (o TopicOutput) RecordSchema() pulumi.MapOutput {
	return o.ApplyT(func(v *Topic) pulumi.MapOutput { return v.RecordSchema }).(pulumi.MapOutput)
}

// The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
func (o TopicOutput) RecordType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Topic) pulumi.StringPtrOutput { return v.RecordType }).(pulumi.StringPtrOutput)
}

// The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
func (o TopicOutput) ShardCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Topic) pulumi.IntPtrOutput { return v.ShardCount }).(pulumi.IntPtrOutput)
}

type TopicArrayOutput struct{ *pulumi.OutputState }

func (TopicArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Topic)(nil)).Elem()
}

func (o TopicArrayOutput) ToTopicArrayOutput() TopicArrayOutput {
	return o
}

func (o TopicArrayOutput) ToTopicArrayOutputWithContext(ctx context.Context) TopicArrayOutput {
	return o
}

func (o TopicArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Topic] {
	return pulumix.Output[[]*Topic]{
		OutputState: o.OutputState,
	}
}

func (o TopicArrayOutput) Index(i pulumi.IntInput) TopicOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Topic {
		return vs[0].([]*Topic)[vs[1].(int)]
	}).(TopicOutput)
}

type TopicMapOutput struct{ *pulumi.OutputState }

func (TopicMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Topic)(nil)).Elem()
}

func (o TopicMapOutput) ToTopicMapOutput() TopicMapOutput {
	return o
}

func (o TopicMapOutput) ToTopicMapOutputWithContext(ctx context.Context) TopicMapOutput {
	return o
}

func (o TopicMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Topic] {
	return pulumix.Output[map[string]*Topic]{
		OutputState: o.OutputState,
	}
}

func (o TopicMapOutput) MapIndex(k pulumi.StringInput) TopicOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Topic {
		return vs[0].(map[string]*Topic)[vs[1].(string)]
	}).(TopicOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TopicInput)(nil)).Elem(), &Topic{})
	pulumi.RegisterInputType(reflect.TypeOf((*TopicArrayInput)(nil)).Elem(), TopicArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TopicMapInput)(nil)).Elem(), TopicMap{})
	pulumi.RegisterOutputType(TopicOutput{})
	pulumi.RegisterOutputType(TopicArrayOutput{})
	pulumi.RegisterOutputType(TopicMapOutput{})
}
