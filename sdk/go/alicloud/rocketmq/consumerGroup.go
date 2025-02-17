// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rocketmq

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a RocketMQ Consumer Group resource.
//
// For information about RocketMQ Consumer Group and how to use it, see [What is Consumer Group](https://www.alibabacloud.com/help/en/apsaramq-for-rocketmq/cloud-message-queue-rocketmq-5-x-series/developer-reference/api-rocketmq-2022-08-01-createconsumergroup).
//
// > **NOTE:** Available since v1.212.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/rocketmq"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			createVpc, err := vpc.NewNetwork(ctx, "createVpc", &vpc.NetworkArgs{
//				Description: pulumi.String("example"),
//				CidrBlock:   pulumi.String("172.16.0.0/12"),
//				VpcName:     pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			createVswitch, err := vpc.NewSwitch(ctx, "createVswitch", &vpc.SwitchArgs{
//				Description: pulumi.String("example"),
//				VpcId:       createVpc.ID(),
//				ZoneId:      *pulumi.String(defaultZones.Zones[0].Id),
//				CidrBlock:   pulumi.String("172.16.0.0/24"),
//				VswitchName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			createInstance, err := rocketmq.NewRocketMQInstance(ctx, "createInstance", &rocketmq.RocketMQInstanceArgs{
//				AutoRenewPeriod: pulumi.Int(1),
//				ProductInfo: &rocketmq.RocketMQInstanceProductInfoArgs{
//					MsgProcessSpec:       pulumi.String("rmq.p2.4xlarge"),
//					SendReceiveRatio:     pulumi.Float64(0.3),
//					MessageRetentionTime: pulumi.Int(70),
//				},
//				NetworkInfo: &rocketmq.RocketMQInstanceNetworkInfoArgs{
//					VpcInfo: &rocketmq.RocketMQInstanceNetworkInfoVpcInfoArgs{
//						VpcId:     createVpc.ID(),
//						VswitchId: createVswitch.ID(),
//					},
//					InternetInfo: &rocketmq.RocketMQInstanceNetworkInfoInternetInfoArgs{
//						InternetSpec:     pulumi.String("enable"),
//						FlowOutType:      pulumi.String("payByBandwidth"),
//						FlowOutBandwidth: pulumi.Int(30),
//					},
//				},
//				Period:        pulumi.Int(1),
//				SubSeriesCode: pulumi.String("cluster_ha"),
//				Remark:        pulumi.String("example"),
//				InstanceName:  pulumi.String(name),
//				ServiceCode:   pulumi.String("rmq"),
//				SeriesCode:    pulumi.String("professional"),
//				PaymentType:   pulumi.String("PayAsYouGo"),
//				PeriodUnit:    pulumi.String("Month"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = rocketmq.NewConsumerGroup(ctx, "defaultConsumerGroup", &rocketmq.ConsumerGroupArgs{
//				ConsumerGroupId: pulumi.String(name),
//				InstanceId:      createInstance.ID(),
//				ConsumeRetryPolicy: &rocketmq.ConsumerGroupConsumeRetryPolicyArgs{
//					RetryPolicy:   pulumi.String("DefaultRetryPolicy"),
//					MaxRetryTimes: pulumi.Int(10),
//				},
//				DeliveryOrderType: pulumi.String("Concurrently"),
//				Remark:            pulumi.String("example"),
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
// RocketMQ Consumer Group can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:rocketmq/consumerGroup:ConsumerGroup example <instance_id>:<consumer_group_id>
// ```
type ConsumerGroup struct {
	pulumi.CustomResourceState

	// Consumption retry strategy. See `consumeRetryPolicy` below.
	ConsumeRetryPolicy ConsumerGroupConsumeRetryPolicyOutput `pulumi:"consumeRetryPolicy"`
	// The first ID of the resource.
	ConsumerGroupId pulumi.StringOutput `pulumi:"consumerGroupId"`
	// The creation time of the resource.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Delivery order.
	DeliveryOrderType pulumi.StringPtrOutput `pulumi:"deliveryOrderType"`
	// Instance ID.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// Custom remarks.
	Remark pulumi.StringPtrOutput `pulumi:"remark"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewConsumerGroup registers a new resource with the given unique name, arguments, and options.
func NewConsumerGroup(ctx *pulumi.Context,
	name string, args *ConsumerGroupArgs, opts ...pulumi.ResourceOption) (*ConsumerGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConsumeRetryPolicy == nil {
		return nil, errors.New("invalid value for required argument 'ConsumeRetryPolicy'")
	}
	if args.ConsumerGroupId == nil {
		return nil, errors.New("invalid value for required argument 'ConsumerGroupId'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ConsumerGroup
	err := ctx.RegisterResource("alicloud:rocketmq/consumerGroup:ConsumerGroup", name, args, &resource, opts...)
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
	err := ctx.ReadResource("alicloud:rocketmq/consumerGroup:ConsumerGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConsumerGroup resources.
type consumerGroupState struct {
	// Consumption retry strategy. See `consumeRetryPolicy` below.
	ConsumeRetryPolicy *ConsumerGroupConsumeRetryPolicy `pulumi:"consumeRetryPolicy"`
	// The first ID of the resource.
	ConsumerGroupId *string `pulumi:"consumerGroupId"`
	// The creation time of the resource.
	CreateTime *string `pulumi:"createTime"`
	// Delivery order.
	DeliveryOrderType *string `pulumi:"deliveryOrderType"`
	// Instance ID.
	InstanceId *string `pulumi:"instanceId"`
	// Custom remarks.
	Remark *string `pulumi:"remark"`
	// The status of the resource.
	Status *string `pulumi:"status"`
}

type ConsumerGroupState struct {
	// Consumption retry strategy. See `consumeRetryPolicy` below.
	ConsumeRetryPolicy ConsumerGroupConsumeRetryPolicyPtrInput
	// The first ID of the resource.
	ConsumerGroupId pulumi.StringPtrInput
	// The creation time of the resource.
	CreateTime pulumi.StringPtrInput
	// Delivery order.
	DeliveryOrderType pulumi.StringPtrInput
	// Instance ID.
	InstanceId pulumi.StringPtrInput
	// Custom remarks.
	Remark pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
}

func (ConsumerGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*consumerGroupState)(nil)).Elem()
}

type consumerGroupArgs struct {
	// Consumption retry strategy. See `consumeRetryPolicy` below.
	ConsumeRetryPolicy ConsumerGroupConsumeRetryPolicy `pulumi:"consumeRetryPolicy"`
	// The first ID of the resource.
	ConsumerGroupId string `pulumi:"consumerGroupId"`
	// Delivery order.
	DeliveryOrderType *string `pulumi:"deliveryOrderType"`
	// Instance ID.
	InstanceId string `pulumi:"instanceId"`
	// Custom remarks.
	Remark *string `pulumi:"remark"`
}

// The set of arguments for constructing a ConsumerGroup resource.
type ConsumerGroupArgs struct {
	// Consumption retry strategy. See `consumeRetryPolicy` below.
	ConsumeRetryPolicy ConsumerGroupConsumeRetryPolicyInput
	// The first ID of the resource.
	ConsumerGroupId pulumi.StringInput
	// Delivery order.
	DeliveryOrderType pulumi.StringPtrInput
	// Instance ID.
	InstanceId pulumi.StringInput
	// Custom remarks.
	Remark pulumi.StringPtrInput
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

// Consumption retry strategy. See `consumeRetryPolicy` below.
func (o ConsumerGroupOutput) ConsumeRetryPolicy() ConsumerGroupConsumeRetryPolicyOutput {
	return o.ApplyT(func(v *ConsumerGroup) ConsumerGroupConsumeRetryPolicyOutput { return v.ConsumeRetryPolicy }).(ConsumerGroupConsumeRetryPolicyOutput)
}

// The first ID of the resource.
func (o ConsumerGroupOutput) ConsumerGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *ConsumerGroup) pulumi.StringOutput { return v.ConsumerGroupId }).(pulumi.StringOutput)
}

// The creation time of the resource.
func (o ConsumerGroupOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *ConsumerGroup) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Delivery order.
func (o ConsumerGroupOutput) DeliveryOrderType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ConsumerGroup) pulumi.StringPtrOutput { return v.DeliveryOrderType }).(pulumi.StringPtrOutput)
}

// Instance ID.
func (o ConsumerGroupOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *ConsumerGroup) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// Custom remarks.
func (o ConsumerGroupOutput) Remark() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ConsumerGroup) pulumi.StringPtrOutput { return v.Remark }).(pulumi.StringPtrOutput)
}

// The status of the resource.
func (o ConsumerGroupOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ConsumerGroup) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
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
