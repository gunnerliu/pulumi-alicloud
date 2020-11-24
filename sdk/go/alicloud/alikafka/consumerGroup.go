// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package alikafka

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides an ALIKAFKA consumer group resource.
//
// > **NOTE:** Available in 1.56.0+
//
// > **NOTE:**  Only the following regions support create alikafka consumer group.
// [`cn-hangzhou`,`cn-beijing`,`cn-shenzhen`,`cn-shanghai`,`cn-qingdao`,`cn-hongkong`,`cn-huhehaote`,`cn-zhangjiakou`,`ap-southeast-1`,`ap-south-1`,`ap-southeast-5`]
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/alikafka"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		consumerId := "CID-alikafkaGroupDatasourceName"
// 		if param := cfg.Get("consumerId"); param != "" {
// 			consumerId = param
// 		}
// 		opt0 := "VSwitch"
// 		defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
// 			AvailableResourceCreation: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
// 			CidrBlock: pulumi.String("172.16.0.0/12"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
// 			VpcId:            defaultNetwork.ID(),
// 			CidrBlock:        pulumi.String("172.16.0.0/24"),
// 			AvailabilityZone: pulumi.String(defaultZones.Zones[0].Id),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultInstance, err := alikafka.NewInstance(ctx, "defaultInstance", &alikafka.InstanceArgs{
// 			TopicQuota: pulumi.Int(50),
// 			DiskType:   pulumi.Int(1),
// 			DiskSize:   pulumi.Int(500),
// 			DeployType: pulumi.Int(5),
// 			IoMax:      pulumi.Int(20),
// 			VswitchId:  defaultSwitch.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = alikafka.NewConsumerGroup(ctx, "defaultConsumerGroup", &alikafka.ConsumerGroupArgs{
// 			ConsumerId: pulumi.String(consumerId),
// 			InstanceId: defaultInstance.ID(),
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
// ALIKAFKA GROUP can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:alikafka/consumerGroup:ConsumerGroup group alikafka_post-cn-123455abc:consumerId
// ```
type ConsumerGroup struct {
	pulumi.CustomResourceState

	// ID of the consumer group. The length cannot exceed 64 characters.
	ConsumerId pulumi.StringOutput `pulumi:"consumerId"`
	// ID of the ALIKAFKA Instance that owns the groups.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
}

// NewConsumerGroup registers a new resource with the given unique name, arguments, and options.
func NewConsumerGroup(ctx *pulumi.Context,
	name string, args *ConsumerGroupArgs, opts ...pulumi.ResourceOption) (*ConsumerGroup, error) {
	if args == nil || args.ConsumerId == nil {
		return nil, errors.New("missing required argument 'ConsumerId'")
	}
	if args == nil || args.InstanceId == nil {
		return nil, errors.New("missing required argument 'InstanceId'")
	}
	if args == nil {
		args = &ConsumerGroupArgs{}
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
	// ID of the ALIKAFKA Instance that owns the groups.
	InstanceId *string `pulumi:"instanceId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

type ConsumerGroupState struct {
	// ID of the consumer group. The length cannot exceed 64 characters.
	ConsumerId pulumi.StringPtrInput
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
	// ID of the ALIKAFKA Instance that owns the groups.
	InstanceId string `pulumi:"instanceId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// The set of arguments for constructing a ConsumerGroup resource.
type ConsumerGroupArgs struct {
	// ID of the consumer group. The length cannot exceed 64 characters.
	ConsumerId pulumi.StringInput
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

func (ConsumerGroup) ElementType() reflect.Type {
	return reflect.TypeOf((*ConsumerGroup)(nil)).Elem()
}

func (i ConsumerGroup) ToConsumerGroupOutput() ConsumerGroupOutput {
	return i.ToConsumerGroupOutputWithContext(context.Background())
}

func (i ConsumerGroup) ToConsumerGroupOutputWithContext(ctx context.Context) ConsumerGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConsumerGroupOutput)
}

type ConsumerGroupOutput struct {
	*pulumi.OutputState
}

func (ConsumerGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ConsumerGroupOutput)(nil)).Elem()
}

func (o ConsumerGroupOutput) ToConsumerGroupOutput() ConsumerGroupOutput {
	return o
}

func (o ConsumerGroupOutput) ToConsumerGroupOutputWithContext(ctx context.Context) ConsumerGroupOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ConsumerGroupOutput{})
}
