// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package alikafka

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides an ALIKAFKA topic resource, see [What is Alikafka topic ](https://www.alibabacloud.com/help/en/message-queue-for-apache-kafka/latest/api-doc-alikafka-2019-09-16-api-doc-createtopic).
//
// > **NOTE:** Available since v1.56.0.
//
// > **NOTE:**  Only the following regions support create alikafka topic.
// [`cn-hangzhou`,`cn-beijing`,`cn-shenzhen`,`cn-shanghai`,`cn-qingdao`,`cn-hongkong`,`cn-huhehaote`,`cn-zhangjiakou`,`cn-chengdu`,`cn-heyuan`,`ap-southeast-1`,`ap-southeast-3`,`ap-southeast-5`,`ap-south-1`,`ap-northeast-1`,`eu-central-1`,`eu-west-1`,`us-west-1`,`us-east-1`]
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/alikafka"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
//				CidrBlock: pulumi.String("172.16.0.0/12"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
//				VpcId:     defaultNetwork.ID(),
//				CidrBlock: pulumi.String("172.16.0.0/24"),
//				ZoneId:    *pulumi.String(defaultZones.Zones[0].Id),
//			})
//			if err != nil {
//				return err
//			}
//			defaultInstance, err := alikafka.NewInstance(ctx, "defaultInstance", &alikafka.InstanceArgs{
//				PartitionNum: pulumi.Int(50),
//				DiskType:     pulumi.Int(1),
//				DiskSize:     pulumi.Int(500),
//				DeployType:   pulumi.Int(5),
//				IoMax:        pulumi.Int(20),
//				VswitchId:    defaultSwitch.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = alikafka.NewTopic(ctx, "defaultTopic", &alikafka.TopicArgs{
//				InstanceId:   defaultInstance.ID(),
//				Topic:        pulumi.String("example-topic"),
//				LocalTopic:   pulumi.Bool(false),
//				CompactTopic: pulumi.Bool(false),
//				PartitionNum: pulumi.Int(12),
//				Remark:       pulumi.String("dafault_kafka_topic_remark"),
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
// ALIKAFKA TOPIC can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:alikafka/topic:Topic topic alikafka_post-cn-123455abc:topicName
//
// ```
type Topic struct {
	pulumi.CustomResourceState

	// Whether the topic is compactTopic or not. Compact topic must be a localTopic.
	CompactTopic pulumi.BoolPtrOutput `pulumi:"compactTopic"`
	// InstanceId of your Kafka resource, the topic will create in this instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// Whether the topic is localTopic or not.
	LocalTopic pulumi.BoolPtrOutput `pulumi:"localTopic"`
	// The number of partitions of the topic. The number should between 1 and 48.
	PartitionNum pulumi.IntPtrOutput `pulumi:"partitionNum"`
	// This attribute is a concise description of topic. The length cannot exceed 64.
	Remark pulumi.StringOutput `pulumi:"remark"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 64 characters.
	Topic pulumi.StringOutput `pulumi:"topic"`
}

// NewTopic registers a new resource with the given unique name, arguments, and options.
func NewTopic(ctx *pulumi.Context,
	name string, args *TopicArgs, opts ...pulumi.ResourceOption) (*Topic, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.Remark == nil {
		return nil, errors.New("invalid value for required argument 'Remark'")
	}
	if args.Topic == nil {
		return nil, errors.New("invalid value for required argument 'Topic'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Topic
	err := ctx.RegisterResource("alicloud:alikafka/topic:Topic", name, args, &resource, opts...)
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
	err := ctx.ReadResource("alicloud:alikafka/topic:Topic", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Topic resources.
type topicState struct {
	// Whether the topic is compactTopic or not. Compact topic must be a localTopic.
	CompactTopic *bool `pulumi:"compactTopic"`
	// InstanceId of your Kafka resource, the topic will create in this instance.
	InstanceId *string `pulumi:"instanceId"`
	// Whether the topic is localTopic or not.
	LocalTopic *bool `pulumi:"localTopic"`
	// The number of partitions of the topic. The number should between 1 and 48.
	PartitionNum *int `pulumi:"partitionNum"`
	// This attribute is a concise description of topic. The length cannot exceed 64.
	Remark *string `pulumi:"remark"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 64 characters.
	Topic *string `pulumi:"topic"`
}

type TopicState struct {
	// Whether the topic is compactTopic or not. Compact topic must be a localTopic.
	CompactTopic pulumi.BoolPtrInput
	// InstanceId of your Kafka resource, the topic will create in this instance.
	InstanceId pulumi.StringPtrInput
	// Whether the topic is localTopic or not.
	LocalTopic pulumi.BoolPtrInput
	// The number of partitions of the topic. The number should between 1 and 48.
	PartitionNum pulumi.IntPtrInput
	// This attribute is a concise description of topic. The length cannot exceed 64.
	Remark pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 64 characters.
	Topic pulumi.StringPtrInput
}

func (TopicState) ElementType() reflect.Type {
	return reflect.TypeOf((*topicState)(nil)).Elem()
}

type topicArgs struct {
	// Whether the topic is compactTopic or not. Compact topic must be a localTopic.
	CompactTopic *bool `pulumi:"compactTopic"`
	// InstanceId of your Kafka resource, the topic will create in this instance.
	InstanceId string `pulumi:"instanceId"`
	// Whether the topic is localTopic or not.
	LocalTopic *bool `pulumi:"localTopic"`
	// The number of partitions of the topic. The number should between 1 and 48.
	PartitionNum *int `pulumi:"partitionNum"`
	// This attribute is a concise description of topic. The length cannot exceed 64.
	Remark string `pulumi:"remark"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 64 characters.
	Topic string `pulumi:"topic"`
}

// The set of arguments for constructing a Topic resource.
type TopicArgs struct {
	// Whether the topic is compactTopic or not. Compact topic must be a localTopic.
	CompactTopic pulumi.BoolPtrInput
	// InstanceId of your Kafka resource, the topic will create in this instance.
	InstanceId pulumi.StringInput
	// Whether the topic is localTopic or not.
	LocalTopic pulumi.BoolPtrInput
	// The number of partitions of the topic. The number should between 1 and 48.
	PartitionNum pulumi.IntPtrInput
	// This attribute is a concise description of topic. The length cannot exceed 64.
	Remark pulumi.StringInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 64 characters.
	Topic pulumi.StringInput
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

// Whether the topic is compactTopic or not. Compact topic must be a localTopic.
func (o TopicOutput) CompactTopic() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Topic) pulumi.BoolPtrOutput { return v.CompactTopic }).(pulumi.BoolPtrOutput)
}

// InstanceId of your Kafka resource, the topic will create in this instance.
func (o TopicOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Topic) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// Whether the topic is localTopic or not.
func (o TopicOutput) LocalTopic() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Topic) pulumi.BoolPtrOutput { return v.LocalTopic }).(pulumi.BoolPtrOutput)
}

// The number of partitions of the topic. The number should between 1 and 48.
func (o TopicOutput) PartitionNum() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Topic) pulumi.IntPtrOutput { return v.PartitionNum }).(pulumi.IntPtrOutput)
}

// This attribute is a concise description of topic. The length cannot exceed 64.
func (o TopicOutput) Remark() pulumi.StringOutput {
	return o.ApplyT(func(v *Topic) pulumi.StringOutput { return v.Remark }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o TopicOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *Topic) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// Name of the topic. Two topics on a single instance cannot have the same name. The length cannot exceed 64 characters.
func (o TopicOutput) Topic() pulumi.StringOutput {
	return o.ApplyT(func(v *Topic) pulumi.StringOutput { return v.Topic }).(pulumi.StringOutput)
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
