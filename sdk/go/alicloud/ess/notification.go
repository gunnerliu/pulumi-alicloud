// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ess

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a ESS notification resource. More about Ess notification, see [Autoscaling Notification](https://www.alibabacloud.com/help/doc-detail/71114.htm).
//
// > **NOTE:** Available in 1.55.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/ess"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/mns"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		name := fmt.Sprintf("%v%v%v", "tf-testAccEssNotification-", "%", "d")
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		opt0 := true
// 		defaultRegions, err := alicloud.GetRegions(ctx, &alicloud.GetRegionsArgs{
// 			Current: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultAccount, err := alicloud.GetAccount(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt1 := "cloud_efficiency"
// 		opt2 := "VSwitch"
// 		defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
// 			AvailableDiskCategory:     &opt1,
// 			AvailableResourceCreation: &opt2,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
// 			VpcName:   pulumi.String(name),
// 			CidrBlock: pulumi.String("172.16.0.0/16"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
// 			VpcId:            defaultNetwork.ID(),
// 			CidrBlock:        pulumi.String("172.16.0.0/24"),
// 			AvailabilityZone: pulumi.String(defaultZones.Zones[0].Id),
// 			VswitchName:      pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultScalingGroup, err := ess.NewScalingGroup(ctx, "defaultScalingGroup", &ess.ScalingGroupArgs{
// 			MinSize:          pulumi.Int(1),
// 			MaxSize:          pulumi.Int(1),
// 			ScalingGroupName: pulumi.String(name),
// 			RemovalPolicies: pulumi.StringArray{
// 				pulumi.String("OldestInstance"),
// 				pulumi.String("NewestInstance"),
// 			},
// 			VswitchIds: pulumi.StringArray{
// 				defaultSwitch.ID(),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultQueue, err := mns.NewQueue(ctx, "defaultQueue", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ess.NewNotification(ctx, "defaultNotification", &ess.NotificationArgs{
// 			ScalingGroupId: defaultScalingGroup.ID(),
// 			NotificationTypes: pulumi.StringArray{
// 				pulumi.String("AUTOSCALING:SCALE_OUT_SUCCESS"),
// 				pulumi.String("AUTOSCALING:SCALE_OUT_ERROR"),
// 			},
// 			NotificationArn: defaultQueue.Name.ApplyT(func(name string) (string, error) {
// 				return fmt.Sprintf("%v%v%v%v%v%v", "acs:ess:", defaultRegions.Regions[0].Id, ":", defaultAccount.Id, ":queue/", name), nil
// 			}).(pulumi.StringOutput),
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
// Ess notification can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ess/notification:Notification example 'scaling_group_id:notification_arn'
// ```
type Notification struct {
	pulumi.CustomResourceState

	// The Alibaba Cloud Resource Name (ARN) of the notification object, The value must be in `acs:ess:{region}:{account-id}:{resource-relative-id}` format.
	// * region: the region ID of the scaling group. For more information, see `Regions and zones`
	// * account-id: the ID of your account.
	// * resource-relative-id: the notification method. Valid values : `cloudmonitor`, MNS queue: `queue/{queuename}`, Replace the queuename with the specific MNS queue name, MNS topic: `topic/{topicname}`, Replace the topicname with the specific MNS topic name.
	NotificationArn pulumi.StringOutput `pulumi:"notificationArn"`
	// The notification types of Auto Scaling events and resource changes. Supported notification types: 'AUTOSCALING:SCALE_OUT_SUCCESS', 'AUTOSCALING:SCALE_IN_SUCCESS', 'AUTOSCALING:SCALE_OUT_ERROR', 'AUTOSCALING:SCALE_IN_ERROR', 'AUTOSCALING:SCALE_REJECT', 'AUTOSCALING:SCALE_OUT_START', 'AUTOSCALING:SCALE_IN_START', 'AUTOSCALING:SCHEDULE_TASK_EXPIRING'.
	NotificationTypes pulumi.StringArrayOutput `pulumi:"notificationTypes"`
	// The ID of the Auto Scaling group.
	ScalingGroupId pulumi.StringOutput `pulumi:"scalingGroupId"`
}

// NewNotification registers a new resource with the given unique name, arguments, and options.
func NewNotification(ctx *pulumi.Context,
	name string, args *NotificationArgs, opts ...pulumi.ResourceOption) (*Notification, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NotificationArn == nil {
		return nil, errors.New("invalid value for required argument 'NotificationArn'")
	}
	if args.NotificationTypes == nil {
		return nil, errors.New("invalid value for required argument 'NotificationTypes'")
	}
	if args.ScalingGroupId == nil {
		return nil, errors.New("invalid value for required argument 'ScalingGroupId'")
	}
	var resource Notification
	err := ctx.RegisterResource("alicloud:ess/notification:Notification", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNotification gets an existing Notification resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNotification(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NotificationState, opts ...pulumi.ResourceOption) (*Notification, error) {
	var resource Notification
	err := ctx.ReadResource("alicloud:ess/notification:Notification", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Notification resources.
type notificationState struct {
	// The Alibaba Cloud Resource Name (ARN) of the notification object, The value must be in `acs:ess:{region}:{account-id}:{resource-relative-id}` format.
	// * region: the region ID of the scaling group. For more information, see `Regions and zones`
	// * account-id: the ID of your account.
	// * resource-relative-id: the notification method. Valid values : `cloudmonitor`, MNS queue: `queue/{queuename}`, Replace the queuename with the specific MNS queue name, MNS topic: `topic/{topicname}`, Replace the topicname with the specific MNS topic name.
	NotificationArn *string `pulumi:"notificationArn"`
	// The notification types of Auto Scaling events and resource changes. Supported notification types: 'AUTOSCALING:SCALE_OUT_SUCCESS', 'AUTOSCALING:SCALE_IN_SUCCESS', 'AUTOSCALING:SCALE_OUT_ERROR', 'AUTOSCALING:SCALE_IN_ERROR', 'AUTOSCALING:SCALE_REJECT', 'AUTOSCALING:SCALE_OUT_START', 'AUTOSCALING:SCALE_IN_START', 'AUTOSCALING:SCHEDULE_TASK_EXPIRING'.
	NotificationTypes []string `pulumi:"notificationTypes"`
	// The ID of the Auto Scaling group.
	ScalingGroupId *string `pulumi:"scalingGroupId"`
}

type NotificationState struct {
	// The Alibaba Cloud Resource Name (ARN) of the notification object, The value must be in `acs:ess:{region}:{account-id}:{resource-relative-id}` format.
	// * region: the region ID of the scaling group. For more information, see `Regions and zones`
	// * account-id: the ID of your account.
	// * resource-relative-id: the notification method. Valid values : `cloudmonitor`, MNS queue: `queue/{queuename}`, Replace the queuename with the specific MNS queue name, MNS topic: `topic/{topicname}`, Replace the topicname with the specific MNS topic name.
	NotificationArn pulumi.StringPtrInput
	// The notification types of Auto Scaling events and resource changes. Supported notification types: 'AUTOSCALING:SCALE_OUT_SUCCESS', 'AUTOSCALING:SCALE_IN_SUCCESS', 'AUTOSCALING:SCALE_OUT_ERROR', 'AUTOSCALING:SCALE_IN_ERROR', 'AUTOSCALING:SCALE_REJECT', 'AUTOSCALING:SCALE_OUT_START', 'AUTOSCALING:SCALE_IN_START', 'AUTOSCALING:SCHEDULE_TASK_EXPIRING'.
	NotificationTypes pulumi.StringArrayInput
	// The ID of the Auto Scaling group.
	ScalingGroupId pulumi.StringPtrInput
}

func (NotificationState) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationState)(nil)).Elem()
}

type notificationArgs struct {
	// The Alibaba Cloud Resource Name (ARN) of the notification object, The value must be in `acs:ess:{region}:{account-id}:{resource-relative-id}` format.
	// * region: the region ID of the scaling group. For more information, see `Regions and zones`
	// * account-id: the ID of your account.
	// * resource-relative-id: the notification method. Valid values : `cloudmonitor`, MNS queue: `queue/{queuename}`, Replace the queuename with the specific MNS queue name, MNS topic: `topic/{topicname}`, Replace the topicname with the specific MNS topic name.
	NotificationArn string `pulumi:"notificationArn"`
	// The notification types of Auto Scaling events and resource changes. Supported notification types: 'AUTOSCALING:SCALE_OUT_SUCCESS', 'AUTOSCALING:SCALE_IN_SUCCESS', 'AUTOSCALING:SCALE_OUT_ERROR', 'AUTOSCALING:SCALE_IN_ERROR', 'AUTOSCALING:SCALE_REJECT', 'AUTOSCALING:SCALE_OUT_START', 'AUTOSCALING:SCALE_IN_START', 'AUTOSCALING:SCHEDULE_TASK_EXPIRING'.
	NotificationTypes []string `pulumi:"notificationTypes"`
	// The ID of the Auto Scaling group.
	ScalingGroupId string `pulumi:"scalingGroupId"`
}

// The set of arguments for constructing a Notification resource.
type NotificationArgs struct {
	// The Alibaba Cloud Resource Name (ARN) of the notification object, The value must be in `acs:ess:{region}:{account-id}:{resource-relative-id}` format.
	// * region: the region ID of the scaling group. For more information, see `Regions and zones`
	// * account-id: the ID of your account.
	// * resource-relative-id: the notification method. Valid values : `cloudmonitor`, MNS queue: `queue/{queuename}`, Replace the queuename with the specific MNS queue name, MNS topic: `topic/{topicname}`, Replace the topicname with the specific MNS topic name.
	NotificationArn pulumi.StringInput
	// The notification types of Auto Scaling events and resource changes. Supported notification types: 'AUTOSCALING:SCALE_OUT_SUCCESS', 'AUTOSCALING:SCALE_IN_SUCCESS', 'AUTOSCALING:SCALE_OUT_ERROR', 'AUTOSCALING:SCALE_IN_ERROR', 'AUTOSCALING:SCALE_REJECT', 'AUTOSCALING:SCALE_OUT_START', 'AUTOSCALING:SCALE_IN_START', 'AUTOSCALING:SCHEDULE_TASK_EXPIRING'.
	NotificationTypes pulumi.StringArrayInput
	// The ID of the Auto Scaling group.
	ScalingGroupId pulumi.StringInput
}

func (NotificationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationArgs)(nil)).Elem()
}

type NotificationInput interface {
	pulumi.Input

	ToNotificationOutput() NotificationOutput
	ToNotificationOutputWithContext(ctx context.Context) NotificationOutput
}

func (*Notification) ElementType() reflect.Type {
	return reflect.TypeOf((*Notification)(nil))
}

func (i *Notification) ToNotificationOutput() NotificationOutput {
	return i.ToNotificationOutputWithContext(context.Background())
}

func (i *Notification) ToNotificationOutputWithContext(ctx context.Context) NotificationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationOutput)
}

func (i *Notification) ToNotificationPtrOutput() NotificationPtrOutput {
	return i.ToNotificationPtrOutputWithContext(context.Background())
}

func (i *Notification) ToNotificationPtrOutputWithContext(ctx context.Context) NotificationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPtrOutput)
}

type NotificationPtrInput interface {
	pulumi.Input

	ToNotificationPtrOutput() NotificationPtrOutput
	ToNotificationPtrOutputWithContext(ctx context.Context) NotificationPtrOutput
}

type notificationPtrType NotificationArgs

func (*notificationPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Notification)(nil))
}

func (i *notificationPtrType) ToNotificationPtrOutput() NotificationPtrOutput {
	return i.ToNotificationPtrOutputWithContext(context.Background())
}

func (i *notificationPtrType) ToNotificationPtrOutputWithContext(ctx context.Context) NotificationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPtrOutput)
}

// NotificationArrayInput is an input type that accepts NotificationArray and NotificationArrayOutput values.
// You can construct a concrete instance of `NotificationArrayInput` via:
//
//          NotificationArray{ NotificationArgs{...} }
type NotificationArrayInput interface {
	pulumi.Input

	ToNotificationArrayOutput() NotificationArrayOutput
	ToNotificationArrayOutputWithContext(context.Context) NotificationArrayOutput
}

type NotificationArray []NotificationInput

func (NotificationArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Notification)(nil))
}

func (i NotificationArray) ToNotificationArrayOutput() NotificationArrayOutput {
	return i.ToNotificationArrayOutputWithContext(context.Background())
}

func (i NotificationArray) ToNotificationArrayOutputWithContext(ctx context.Context) NotificationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationArrayOutput)
}

// NotificationMapInput is an input type that accepts NotificationMap and NotificationMapOutput values.
// You can construct a concrete instance of `NotificationMapInput` via:
//
//          NotificationMap{ "key": NotificationArgs{...} }
type NotificationMapInput interface {
	pulumi.Input

	ToNotificationMapOutput() NotificationMapOutput
	ToNotificationMapOutputWithContext(context.Context) NotificationMapOutput
}

type NotificationMap map[string]NotificationInput

func (NotificationMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Notification)(nil))
}

func (i NotificationMap) ToNotificationMapOutput() NotificationMapOutput {
	return i.ToNotificationMapOutputWithContext(context.Background())
}

func (i NotificationMap) ToNotificationMapOutputWithContext(ctx context.Context) NotificationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationMapOutput)
}

type NotificationOutput struct {
	*pulumi.OutputState
}

func (NotificationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Notification)(nil))
}

func (o NotificationOutput) ToNotificationOutput() NotificationOutput {
	return o
}

func (o NotificationOutput) ToNotificationOutputWithContext(ctx context.Context) NotificationOutput {
	return o
}

func (o NotificationOutput) ToNotificationPtrOutput() NotificationPtrOutput {
	return o.ToNotificationPtrOutputWithContext(context.Background())
}

func (o NotificationOutput) ToNotificationPtrOutputWithContext(ctx context.Context) NotificationPtrOutput {
	return o.ApplyT(func(v Notification) *Notification {
		return &v
	}).(NotificationPtrOutput)
}

type NotificationPtrOutput struct {
	*pulumi.OutputState
}

func (NotificationPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Notification)(nil))
}

func (o NotificationPtrOutput) ToNotificationPtrOutput() NotificationPtrOutput {
	return o
}

func (o NotificationPtrOutput) ToNotificationPtrOutputWithContext(ctx context.Context) NotificationPtrOutput {
	return o
}

type NotificationArrayOutput struct{ *pulumi.OutputState }

func (NotificationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Notification)(nil))
}

func (o NotificationArrayOutput) ToNotificationArrayOutput() NotificationArrayOutput {
	return o
}

func (o NotificationArrayOutput) ToNotificationArrayOutputWithContext(ctx context.Context) NotificationArrayOutput {
	return o
}

func (o NotificationArrayOutput) Index(i pulumi.IntInput) NotificationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Notification {
		return vs[0].([]Notification)[vs[1].(int)]
	}).(NotificationOutput)
}

type NotificationMapOutput struct{ *pulumi.OutputState }

func (NotificationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Notification)(nil))
}

func (o NotificationMapOutput) ToNotificationMapOutput() NotificationMapOutput {
	return o
}

func (o NotificationMapOutput) ToNotificationMapOutputWithContext(ctx context.Context) NotificationMapOutput {
	return o
}

func (o NotificationMapOutput) MapIndex(k pulumi.StringInput) NotificationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Notification {
		return vs[0].(map[string]Notification)[vs[1].(string)]
	}).(NotificationOutput)
}

func init() {
	pulumi.RegisterOutputType(NotificationOutput{})
	pulumi.RegisterOutputType(NotificationPtrOutput{})
	pulumi.RegisterOutputType(NotificationArrayOutput{})
	pulumi.RegisterOutputType(NotificationMapOutput{})
}
