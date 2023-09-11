// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cms

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Cloud Monitor Service Monitor Group Instances resource.
//
// For information about Cloud Monitor Service Monitor Group Instances and how to use it, see [What is Monitor Group Instances](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createmonitorgroupinstances).
//
// > **NOTE:** Available since v1.115.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cms"
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
//			defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("192.168.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultMonitorGroup, err := cms.NewMonitorGroup(ctx, "defaultMonitorGroup", &cms.MonitorGroupArgs{
//				MonitorGroupName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			defaultRegions, err := alicloud.GetRegions(ctx, &alicloud.GetRegionsArgs{
//				Current: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = cms.NewMonitorGroupInstances(ctx, "example", &cms.MonitorGroupInstancesArgs{
//				GroupId: defaultMonitorGroup.ID(),
//				Instances: cms.MonitorGroupInstancesInstanceArray{
//					&cms.MonitorGroupInstancesInstanceArgs{
//						InstanceId:   defaultNetwork.ID(),
//						InstanceName: pulumi.String(name),
//						RegionId:     *pulumi.String(defaultRegions.Regions[0].Id),
//						Category:     pulumi.String("vpc"),
//					},
//				},
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
// Cloud Monitor Service Monitor Group Instances can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cms/monitorGroupInstances:MonitorGroupInstances example <group_id>
//
// ```
type MonitorGroupInstances struct {
	pulumi.CustomResourceState

	// The id of Cms Group.
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// Instance information added to the Cms Group. See `instances` below.
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// Instance information added to the Cms Group. See `instances` below.
	Instances []MonitorGroupInstancesInstance `pulumi:"instances"`
}

type MonitorGroupInstancesState struct {
	// The id of Cms Group.
	GroupId pulumi.StringPtrInput
	// Instance information added to the Cms Group. See `instances` below.
	Instances MonitorGroupInstancesInstanceArrayInput
}

func (MonitorGroupInstancesState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorGroupInstancesState)(nil)).Elem()
}

type monitorGroupInstancesArgs struct {
	// The id of Cms Group.
	GroupId string `pulumi:"groupId"`
	// Instance information added to the Cms Group. See `instances` below.
	Instances []MonitorGroupInstancesInstance `pulumi:"instances"`
}

// The set of arguments for constructing a MonitorGroupInstances resource.
type MonitorGroupInstancesArgs struct {
	// The id of Cms Group.
	GroupId pulumi.StringInput
	// Instance information added to the Cms Group. See `instances` below.
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
	return reflect.TypeOf((**MonitorGroupInstances)(nil)).Elem()
}

func (i *MonitorGroupInstances) ToMonitorGroupInstancesOutput() MonitorGroupInstancesOutput {
	return i.ToMonitorGroupInstancesOutputWithContext(context.Background())
}

func (i *MonitorGroupInstances) ToMonitorGroupInstancesOutputWithContext(ctx context.Context) MonitorGroupInstancesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorGroupInstancesOutput)
}

func (i *MonitorGroupInstances) ToOutput(ctx context.Context) pulumix.Output[*MonitorGroupInstances] {
	return pulumix.Output[*MonitorGroupInstances]{
		OutputState: i.ToMonitorGroupInstancesOutputWithContext(ctx).OutputState,
	}
}

// MonitorGroupInstancesArrayInput is an input type that accepts MonitorGroupInstancesArray and MonitorGroupInstancesArrayOutput values.
// You can construct a concrete instance of `MonitorGroupInstancesArrayInput` via:
//
//	MonitorGroupInstancesArray{ MonitorGroupInstancesArgs{...} }
type MonitorGroupInstancesArrayInput interface {
	pulumi.Input

	ToMonitorGroupInstancesArrayOutput() MonitorGroupInstancesArrayOutput
	ToMonitorGroupInstancesArrayOutputWithContext(context.Context) MonitorGroupInstancesArrayOutput
}

type MonitorGroupInstancesArray []MonitorGroupInstancesInput

func (MonitorGroupInstancesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitorGroupInstances)(nil)).Elem()
}

func (i MonitorGroupInstancesArray) ToMonitorGroupInstancesArrayOutput() MonitorGroupInstancesArrayOutput {
	return i.ToMonitorGroupInstancesArrayOutputWithContext(context.Background())
}

func (i MonitorGroupInstancesArray) ToMonitorGroupInstancesArrayOutputWithContext(ctx context.Context) MonitorGroupInstancesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorGroupInstancesArrayOutput)
}

func (i MonitorGroupInstancesArray) ToOutput(ctx context.Context) pulumix.Output[[]*MonitorGroupInstances] {
	return pulumix.Output[[]*MonitorGroupInstances]{
		OutputState: i.ToMonitorGroupInstancesArrayOutputWithContext(ctx).OutputState,
	}
}

// MonitorGroupInstancesMapInput is an input type that accepts MonitorGroupInstancesMap and MonitorGroupInstancesMapOutput values.
// You can construct a concrete instance of `MonitorGroupInstancesMapInput` via:
//
//	MonitorGroupInstancesMap{ "key": MonitorGroupInstancesArgs{...} }
type MonitorGroupInstancesMapInput interface {
	pulumi.Input

	ToMonitorGroupInstancesMapOutput() MonitorGroupInstancesMapOutput
	ToMonitorGroupInstancesMapOutputWithContext(context.Context) MonitorGroupInstancesMapOutput
}

type MonitorGroupInstancesMap map[string]MonitorGroupInstancesInput

func (MonitorGroupInstancesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitorGroupInstances)(nil)).Elem()
}

func (i MonitorGroupInstancesMap) ToMonitorGroupInstancesMapOutput() MonitorGroupInstancesMapOutput {
	return i.ToMonitorGroupInstancesMapOutputWithContext(context.Background())
}

func (i MonitorGroupInstancesMap) ToMonitorGroupInstancesMapOutputWithContext(ctx context.Context) MonitorGroupInstancesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorGroupInstancesMapOutput)
}

func (i MonitorGroupInstancesMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*MonitorGroupInstances] {
	return pulumix.Output[map[string]*MonitorGroupInstances]{
		OutputState: i.ToMonitorGroupInstancesMapOutputWithContext(ctx).OutputState,
	}
}

type MonitorGroupInstancesOutput struct{ *pulumi.OutputState }

func (MonitorGroupInstancesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitorGroupInstances)(nil)).Elem()
}

func (o MonitorGroupInstancesOutput) ToMonitorGroupInstancesOutput() MonitorGroupInstancesOutput {
	return o
}

func (o MonitorGroupInstancesOutput) ToMonitorGroupInstancesOutputWithContext(ctx context.Context) MonitorGroupInstancesOutput {
	return o
}

func (o MonitorGroupInstancesOutput) ToOutput(ctx context.Context) pulumix.Output[*MonitorGroupInstances] {
	return pulumix.Output[*MonitorGroupInstances]{
		OutputState: o.OutputState,
	}
}

// The id of Cms Group.
func (o MonitorGroupInstancesOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorGroupInstances) pulumi.StringOutput { return v.GroupId }).(pulumi.StringOutput)
}

// Instance information added to the Cms Group. See `instances` below.
func (o MonitorGroupInstancesOutput) Instances() MonitorGroupInstancesInstanceArrayOutput {
	return o.ApplyT(func(v *MonitorGroupInstances) MonitorGroupInstancesInstanceArrayOutput { return v.Instances }).(MonitorGroupInstancesInstanceArrayOutput)
}

type MonitorGroupInstancesArrayOutput struct{ *pulumi.OutputState }

func (MonitorGroupInstancesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitorGroupInstances)(nil)).Elem()
}

func (o MonitorGroupInstancesArrayOutput) ToMonitorGroupInstancesArrayOutput() MonitorGroupInstancesArrayOutput {
	return o
}

func (o MonitorGroupInstancesArrayOutput) ToMonitorGroupInstancesArrayOutputWithContext(ctx context.Context) MonitorGroupInstancesArrayOutput {
	return o
}

func (o MonitorGroupInstancesArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*MonitorGroupInstances] {
	return pulumix.Output[[]*MonitorGroupInstances]{
		OutputState: o.OutputState,
	}
}

func (o MonitorGroupInstancesArrayOutput) Index(i pulumi.IntInput) MonitorGroupInstancesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MonitorGroupInstances {
		return vs[0].([]*MonitorGroupInstances)[vs[1].(int)]
	}).(MonitorGroupInstancesOutput)
}

type MonitorGroupInstancesMapOutput struct{ *pulumi.OutputState }

func (MonitorGroupInstancesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitorGroupInstances)(nil)).Elem()
}

func (o MonitorGroupInstancesMapOutput) ToMonitorGroupInstancesMapOutput() MonitorGroupInstancesMapOutput {
	return o
}

func (o MonitorGroupInstancesMapOutput) ToMonitorGroupInstancesMapOutputWithContext(ctx context.Context) MonitorGroupInstancesMapOutput {
	return o
}

func (o MonitorGroupInstancesMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*MonitorGroupInstances] {
	return pulumix.Output[map[string]*MonitorGroupInstances]{
		OutputState: o.OutputState,
	}
}

func (o MonitorGroupInstancesMapOutput) MapIndex(k pulumi.StringInput) MonitorGroupInstancesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MonitorGroupInstances {
		return vs[0].(map[string]*MonitorGroupInstances)[vs[1].(string)]
	}).(MonitorGroupInstancesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorGroupInstancesInput)(nil)).Elem(), &MonitorGroupInstances{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorGroupInstancesArrayInput)(nil)).Elem(), MonitorGroupInstancesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorGroupInstancesMapInput)(nil)).Elem(), MonitorGroupInstancesMap{})
	pulumi.RegisterOutputType(MonitorGroupInstancesOutput{})
	pulumi.RegisterOutputType(MonitorGroupInstancesArrayOutput{})
	pulumi.RegisterOutputType(MonitorGroupInstancesMapOutput{})
}
