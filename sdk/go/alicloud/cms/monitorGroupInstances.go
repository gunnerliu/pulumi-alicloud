// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cms

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Cloud Monitor Service Monitor Group Instances resource.
//
// For information about Cloud Monitor Service Monitor Group Instances and how to use it, see [What is Monitor Group Instances](https://www.alibabacloud.com/help/en/doc-detail/115031.htm).
//
// > **NOTE:** Available in v1.115.0+.
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
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
// 			VpcName:   pulumi.String("tf-testacc-vpcname"),
// 			CidrBlock: pulumi.String("192.168.0.0/16"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultMonitorGroup, err := cms.NewMonitorGroup(ctx, "defaultMonitorGroup", &cms.MonitorGroupArgs{
// 			MonitorGroupName: pulumi.String("tf-testaccmonitorgroup"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cms.NewMonitorGroupInstances(ctx, "example", &cms.MonitorGroupInstancesArgs{
// 			GroupId: defaultMonitorGroup.ID(),
// 			Instances: cms.MonitorGroupInstancesInstanceArray{
// 				&cms.MonitorGroupInstancesInstanceArgs{
// 					InstanceId:   defaultNetwork.ID(),
// 					InstanceName: pulumi.String("tf-testacc-vpcname"),
// 					RegionId:     pulumi.String("cn-hangzhou"),
// 					Category:     pulumi.String("vpc"),
// 				},
// 			},
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
// Cloud Monitor Service Monitor Group Instances can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:cms/monitorGroupInstances:MonitorGroupInstances example <group_id>
// ```
type MonitorGroupInstances struct {
	pulumi.CustomResourceState

	// The id of Cms Group.
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// Instance information added to the Cms Group.
	Instances MonitorGroupInstancesInstanceArrayOutput `pulumi:"instances"`
}

// NewMonitorGroupInstances registers a new resource with the given unique name, arguments, and options.
func NewMonitorGroupInstances(ctx *pulumi.Context,
	name string, args *MonitorGroupInstancesArgs, opts ...pulumi.ResourceOption) (*MonitorGroupInstances, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GroupId == nil {
		return nil, errors.New("invalid value for required argument 'GroupId'")
	}
	if args.Instances == nil {
		return nil, errors.New("invalid value for required argument 'Instances'")
	}
	var resource MonitorGroupInstances
	err := ctx.RegisterResource("alicloud:cms/monitorGroupInstances:MonitorGroupInstances", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMonitorGroupInstances gets an existing MonitorGroupInstances resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMonitorGroupInstances(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MonitorGroupInstancesState, opts ...pulumi.ResourceOption) (*MonitorGroupInstances, error) {
	var resource MonitorGroupInstances
	err := ctx.ReadResource("alicloud:cms/monitorGroupInstances:MonitorGroupInstances", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MonitorGroupInstances resources.
type monitorGroupInstancesState struct {
	// The id of Cms Group.
	GroupId *string `pulumi:"groupId"`
	// Instance information added to the Cms Group.
	Instances []MonitorGroupInstancesInstance `pulumi:"instances"`
}

type MonitorGroupInstancesState struct {
	// The id of Cms Group.
	GroupId pulumi.StringPtrInput
	// Instance information added to the Cms Group.
	Instances MonitorGroupInstancesInstanceArrayInput
}

func (MonitorGroupInstancesState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorGroupInstancesState)(nil)).Elem()
}

type monitorGroupInstancesArgs struct {
	// The id of Cms Group.
	GroupId string `pulumi:"groupId"`
	// Instance information added to the Cms Group.
	Instances []MonitorGroupInstancesInstance `pulumi:"instances"`
}

// The set of arguments for constructing a MonitorGroupInstances resource.
type MonitorGroupInstancesArgs struct {
	// The id of Cms Group.
	GroupId pulumi.StringInput
	// Instance information added to the Cms Group.
	Instances MonitorGroupInstancesInstanceArrayInput
}

func (MonitorGroupInstancesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorGroupInstancesArgs)(nil)).Elem()
}

type MonitorGroupInstancesInput interface {
	pulumi.Input

	ToMonitorGroupInstancesOutput() MonitorGroupInstancesOutput
	ToMonitorGroupInstancesOutputWithContext(ctx context.Context) MonitorGroupInstancesOutput
}

func (*MonitorGroupInstances) ElementType() reflect.Type {
	return reflect.TypeOf((*MonitorGroupInstances)(nil))
}

func (i *MonitorGroupInstances) ToMonitorGroupInstancesOutput() MonitorGroupInstancesOutput {
	return i.ToMonitorGroupInstancesOutputWithContext(context.Background())
}

func (i *MonitorGroupInstances) ToMonitorGroupInstancesOutputWithContext(ctx context.Context) MonitorGroupInstancesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorGroupInstancesOutput)
}

func (i *MonitorGroupInstances) ToMonitorGroupInstancesPtrOutput() MonitorGroupInstancesPtrOutput {
	return i.ToMonitorGroupInstancesPtrOutputWithContext(context.Background())
}

func (i *MonitorGroupInstances) ToMonitorGroupInstancesPtrOutputWithContext(ctx context.Context) MonitorGroupInstancesPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorGroupInstancesPtrOutput)
}

type MonitorGroupInstancesPtrInput interface {
	pulumi.Input

	ToMonitorGroupInstancesPtrOutput() MonitorGroupInstancesPtrOutput
	ToMonitorGroupInstancesPtrOutputWithContext(ctx context.Context) MonitorGroupInstancesPtrOutput
}

type monitorGroupInstancesPtrType MonitorGroupInstancesArgs

func (*monitorGroupInstancesPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitorGroupInstances)(nil))
}

func (i *monitorGroupInstancesPtrType) ToMonitorGroupInstancesPtrOutput() MonitorGroupInstancesPtrOutput {
	return i.ToMonitorGroupInstancesPtrOutputWithContext(context.Background())
}

func (i *monitorGroupInstancesPtrType) ToMonitorGroupInstancesPtrOutputWithContext(ctx context.Context) MonitorGroupInstancesPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorGroupInstancesPtrOutput)
}

// MonitorGroupInstancesArrayInput is an input type that accepts MonitorGroupInstancesArray and MonitorGroupInstancesArrayOutput values.
// You can construct a concrete instance of `MonitorGroupInstancesArrayInput` via:
//
//          MonitorGroupInstancesArray{ MonitorGroupInstancesArgs{...} }
type MonitorGroupInstancesArrayInput interface {
	pulumi.Input

	ToMonitorGroupInstancesArrayOutput() MonitorGroupInstancesArrayOutput
	ToMonitorGroupInstancesArrayOutputWithContext(context.Context) MonitorGroupInstancesArrayOutput
}

type MonitorGroupInstancesArray []MonitorGroupInstancesInput

func (MonitorGroupInstancesArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*MonitorGroupInstances)(nil))
}

func (i MonitorGroupInstancesArray) ToMonitorGroupInstancesArrayOutput() MonitorGroupInstancesArrayOutput {
	return i.ToMonitorGroupInstancesArrayOutputWithContext(context.Background())
}

func (i MonitorGroupInstancesArray) ToMonitorGroupInstancesArrayOutputWithContext(ctx context.Context) MonitorGroupInstancesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorGroupInstancesArrayOutput)
}

// MonitorGroupInstancesMapInput is an input type that accepts MonitorGroupInstancesMap and MonitorGroupInstancesMapOutput values.
// You can construct a concrete instance of `MonitorGroupInstancesMapInput` via:
//
//          MonitorGroupInstancesMap{ "key": MonitorGroupInstancesArgs{...} }
type MonitorGroupInstancesMapInput interface {
	pulumi.Input

	ToMonitorGroupInstancesMapOutput() MonitorGroupInstancesMapOutput
	ToMonitorGroupInstancesMapOutputWithContext(context.Context) MonitorGroupInstancesMapOutput
}

type MonitorGroupInstancesMap map[string]MonitorGroupInstancesInput

func (MonitorGroupInstancesMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*MonitorGroupInstances)(nil))
}

func (i MonitorGroupInstancesMap) ToMonitorGroupInstancesMapOutput() MonitorGroupInstancesMapOutput {
	return i.ToMonitorGroupInstancesMapOutputWithContext(context.Background())
}

func (i MonitorGroupInstancesMap) ToMonitorGroupInstancesMapOutputWithContext(ctx context.Context) MonitorGroupInstancesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorGroupInstancesMapOutput)
}

type MonitorGroupInstancesOutput struct {
	*pulumi.OutputState
}

func (MonitorGroupInstancesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*MonitorGroupInstances)(nil))
}

func (o MonitorGroupInstancesOutput) ToMonitorGroupInstancesOutput() MonitorGroupInstancesOutput {
	return o
}

func (o MonitorGroupInstancesOutput) ToMonitorGroupInstancesOutputWithContext(ctx context.Context) MonitorGroupInstancesOutput {
	return o
}

func (o MonitorGroupInstancesOutput) ToMonitorGroupInstancesPtrOutput() MonitorGroupInstancesPtrOutput {
	return o.ToMonitorGroupInstancesPtrOutputWithContext(context.Background())
}

func (o MonitorGroupInstancesOutput) ToMonitorGroupInstancesPtrOutputWithContext(ctx context.Context) MonitorGroupInstancesPtrOutput {
	return o.ApplyT(func(v MonitorGroupInstances) *MonitorGroupInstances {
		return &v
	}).(MonitorGroupInstancesPtrOutput)
}

type MonitorGroupInstancesPtrOutput struct {
	*pulumi.OutputState
}

func (MonitorGroupInstancesPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitorGroupInstances)(nil))
}

func (o MonitorGroupInstancesPtrOutput) ToMonitorGroupInstancesPtrOutput() MonitorGroupInstancesPtrOutput {
	return o
}

func (o MonitorGroupInstancesPtrOutput) ToMonitorGroupInstancesPtrOutputWithContext(ctx context.Context) MonitorGroupInstancesPtrOutput {
	return o
}

type MonitorGroupInstancesArrayOutput struct{ *pulumi.OutputState }

func (MonitorGroupInstancesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]MonitorGroupInstances)(nil))
}

func (o MonitorGroupInstancesArrayOutput) ToMonitorGroupInstancesArrayOutput() MonitorGroupInstancesArrayOutput {
	return o
}

func (o MonitorGroupInstancesArrayOutput) ToMonitorGroupInstancesArrayOutputWithContext(ctx context.Context) MonitorGroupInstancesArrayOutput {
	return o
}

func (o MonitorGroupInstancesArrayOutput) Index(i pulumi.IntInput) MonitorGroupInstancesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) MonitorGroupInstances {
		return vs[0].([]MonitorGroupInstances)[vs[1].(int)]
	}).(MonitorGroupInstancesOutput)
}

type MonitorGroupInstancesMapOutput struct{ *pulumi.OutputState }

func (MonitorGroupInstancesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]MonitorGroupInstances)(nil))
}

func (o MonitorGroupInstancesMapOutput) ToMonitorGroupInstancesMapOutput() MonitorGroupInstancesMapOutput {
	return o
}

func (o MonitorGroupInstancesMapOutput) ToMonitorGroupInstancesMapOutputWithContext(ctx context.Context) MonitorGroupInstancesMapOutput {
	return o
}

func (o MonitorGroupInstancesMapOutput) MapIndex(k pulumi.StringInput) MonitorGroupInstancesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) MonitorGroupInstances {
		return vs[0].(map[string]MonitorGroupInstances)[vs[1].(string)]
	}).(MonitorGroupInstancesOutput)
}

func init() {
	pulumi.RegisterOutputType(MonitorGroupInstancesOutput{})
	pulumi.RegisterOutputType(MonitorGroupInstancesPtrOutput{})
	pulumi.RegisterOutputType(MonitorGroupInstancesArrayOutput{})
	pulumi.RegisterOutputType(MonitorGroupInstancesMapOutput{})
}
