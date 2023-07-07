// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package alikafka

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an ALIKAFKA consumer group resource, see [What is alikafka consumer group](https://www.alibabacloud.com/help/en/message-queue-for-apache-kafka/latest/api-doc-alikafka-2019-09-16-api-doc-createconsumergroup).
//
// > **NOTE:** Available since v1.56.0.
//
// > **NOTE:**  Only the following regions support create alikafka consumer group.
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
//			_, err = alikafka.NewConsumerGroup(ctx, "defaultConsumerGroup", &alikafka.ConsumerGroupArgs{
//				ConsumerId: pulumi.String(name),
//				InstanceId: defaultInstance.ID(),
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
// ALIKAFKA GROUP can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:alikafka/consumerGroup:ConsumerGroup group alikafka_post-cn-123455abc:consumerId
//
// ```
type ConsumerGroup struct {
	pulumi.CustomResourceState

	// ID of the consumer group. The length cannot exceed 64 characters.
	ConsumerId pulumi.StringOutput `pulumi:"consumerId"`
	// The description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// ID of the ALIKAFKA Instance that owns the groups.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
}

// NewConsumerGroup registers a new resource with the given unique name, arguments, and options.
func NewConsumerGroup(ctx *pulumi.Context,
	name string, args *ConsumerGroupArgs, opts ...pulumi.ResourceOption) (*ConsumerGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConsumerId == nil {
		return nil, errors.New("invalid value for required argument 'ConsumerId'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	var resource ConsumerGroup
	err := ctx.RegisterResource("alicloud:alikafka/consumerGroup:ConsumerGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConsumerGroup gets an existing ConsumerGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConsumerGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConsumerGroupState, opts ...pulumi.ResourceOption) (*ConsumerGroup, error) {
	var resource ConsumerGroup
	err := ctx.ReadResource("alicloud:alikafka/consumerGroup:ConsumerGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConsumerGroup resources.
type consumerGroupState struct {
	// ID of the consumer group. The length cannot exceed 64 characters.
	ConsumerId *string `pulumi:"consumerId"`
	// The description of the resource.
	Description *string `pulumi:"description"`
	// ID of the ALIKAFKA Instance that owns the groups.
	InstanceId *string `pulumi:"instanceId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

type ConsumerGroupState struct {
	// ID of the consumer group. The length cannot exceed 64 characters.
	ConsumerId pulumi.StringPtrInput
	// The description of the resource.
	Description pulumi.StringPtrInput
	// ID of the ALIKAFKA Instance that owns the groups.
	InstanceId pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
}

func (ConsumerGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*consumerGroupState)(nil)).Elem()
}

type consumerGroupArgs struct {
	// ID of the consumer group. The length cannot exceed 64 characters.
	ConsumerId string `pulumi:"consumerId"`
	// The description of the resource.
	Description *string `pulumi:"description"`
	// ID of the ALIKAFKA Instance that owns the groups.
	InstanceId string `pulumi:"instanceId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// The set of arguments for constructing a ConsumerGroup resource.
type ConsumerGroupArgs struct {
	// ID of the consumer group. The length cannot exceed 64 characters.
	ConsumerId pulumi.StringInput
	// The description of the resource.
	Description pulumi.StringPtrInput
	// ID of the ALIKAFKA Instance that owns the groups.
	InstanceId pulumi.StringInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
}

func (ConsumerGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*consumerGroupArgs)(nil)).Elem()
}

type ConsumerGroupInput interface {
	pulumi.Input

	ToConsumerGroupOutput() ConsumerGroupOutput
	ToConsumerGroupOutputWithContext(ctx context.Context) ConsumerGroupOutput
}

func (*ConsumerGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ConsumerGroup)(nil)).Elem()
}

func (i *ConsumerGroup) ToConsumerGroupOutput() ConsumerGroupOutput {
	return i.ToConsumerGroupOutputWithContext(context.Background())
}

func (i *ConsumerGroup) ToConsumerGroupOutputWithContext(ctx context.Context) ConsumerGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConsumerGroupOutput)
}

// ConsumerGroupArrayInput is an input type that accepts ConsumerGroupArray and ConsumerGroupArrayOutput values.
// You can construct a concrete instance of `ConsumerGroupArrayInput` via:
//
//	ConsumerGroupArray{ ConsumerGroupArgs{...} }
type ConsumerGroupArrayInput interface {
	pulumi.Input

	ToConsumerGroupArrayOutput() ConsumerGroupArrayOutput
	ToConsumerGroupArrayOutputWithContext(context.Context) ConsumerGroupArrayOutput
}

type ConsumerGroupArray []ConsumerGroupInput

func (ConsumerGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConsumerGroup)(nil)).Elem()
}

func (i ConsumerGroupArray) ToConsumerGroupArrayOutput() ConsumerGroupArrayOutput {
	return i.ToConsumerGroupArrayOutputWithContext(context.Background())
}

func (i ConsumerGroupArray) ToConsumerGroupArrayOutputWithContext(ctx context.Context) ConsumerGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConsumerGroupArrayOutput)
}

// ConsumerGroupMapInput is an input type that accepts ConsumerGroupMap and ConsumerGroupMapOutput values.
// You can construct a concrete instance of `ConsumerGroupMapInput` via:
//
//	ConsumerGroupMap{ "key": ConsumerGroupArgs{...} }
type ConsumerGroupMapInput interface {
	pulumi.Input

	ToConsumerGroupMapOutput() ConsumerGroupMapOutput
	ToConsumerGroupMapOutputWithContext(context.Context) ConsumerGroupMapOutput
}

type ConsumerGroupMap map[string]ConsumerGroupInput

func (ConsumerGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConsumerGroup)(nil)).Elem()
}

func (i ConsumerGroupMap) ToConsumerGroupMapOutput() ConsumerGroupMapOutput {
	return i.ToConsumerGroupMapOutputWithContext(context.Background())
}

func (i ConsumerGroupMap) ToConsumerGroupMapOutputWithContext(ctx context.Context) ConsumerGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConsumerGroupMapOutput)
}

type ConsumerGroupOutput struct{ *pulumi.OutputState }

func (ConsumerGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConsumerGroup)(nil)).Elem()
}

func (o ConsumerGroupOutput) ToConsumerGroupOutput() ConsumerGroupOutput {
	return o
}

func (o ConsumerGroupOutput) ToConsumerGroupOutputWithContext(ctx context.Context) ConsumerGroupOutput {
	return o
}

// ID of the consumer group. The length cannot exceed 64 characters.
func (o ConsumerGroupOutput) ConsumerId() pulumi.StringOutput {
	return o.ApplyT(func(v *ConsumerGroup) pulumi.StringOutput { return v.ConsumerId }).(pulumi.StringOutput)
}

// The description of the resource.
func (o ConsumerGroupOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ConsumerGroup) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// ID of the ALIKAFKA Instance that owns the groups.
func (o ConsumerGroupOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *ConsumerGroup) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o ConsumerGroupOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *ConsumerGroup) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

type ConsumerGroupArrayOutput struct{ *pulumi.OutputState }

func (ConsumerGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConsumerGroup)(nil)).Elem()
}

func (o ConsumerGroupArrayOutput) ToConsumerGroupArrayOutput() ConsumerGroupArrayOutput {
	return o
}

func (o ConsumerGroupArrayOutput) ToConsumerGroupArrayOutputWithContext(ctx context.Context) ConsumerGroupArrayOutput {
	return o
}

func (o ConsumerGroupArrayOutput) Index(i pulumi.IntInput) ConsumerGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConsumerGroup {
		return vs[0].([]*ConsumerGroup)[vs[1].(int)]
	}).(ConsumerGroupOutput)
}

type ConsumerGroupMapOutput struct{ *pulumi.OutputState }

func (ConsumerGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConsumerGroup)(nil)).Elem()
}

func (o ConsumerGroupMapOutput) ToConsumerGroupMapOutput() ConsumerGroupMapOutput {
	return o
}

func (o ConsumerGroupMapOutput) ToConsumerGroupMapOutputWithContext(ctx context.Context) ConsumerGroupMapOutput {
	return o
}

func (o ConsumerGroupMapOutput) MapIndex(k pulumi.StringInput) ConsumerGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConsumerGroup {
		return vs[0].(map[string]*ConsumerGroup)[vs[1].(string)]
	}).(ConsumerGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConsumerGroupInput)(nil)).Elem(), &ConsumerGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConsumerGroupArrayInput)(nil)).Elem(), ConsumerGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConsumerGroupMapInput)(nil)).Elem(), ConsumerGroupMap{})
	pulumi.RegisterOutputType(ConsumerGroupOutput{})
	pulumi.RegisterOutputType(ConsumerGroupArrayOutput{})
	pulumi.RegisterOutputType(ConsumerGroupMapOutput{})
}
