// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ess

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Attaches/Detaches vserver groups to a specified scaling group.
//
// > **NOTE:** The load balancer of which vserver groups belongs to must be in `active` status.
//
// > **NOTE:** If scaling group's network type is `VPC`, the vserver groups must be in the same `VPC`.
//
// > **NOTE:** A scaling group can have at most 5 vserver groups attached by default.
//
// > **NOTE:** Vserver groups and the default group of loadbalancer share the same backend server quota.
//
// > **NOTE:** When attach vserver groups to scaling group, existing ECS instances will be added to vserver groups; Instead, ECS instances will be removed from vserver group when detach.
//
// > **NOTE:** Detach action will be executed before attach action.
//
// > **NOTE:** Vserver group is defined uniquely by `loadbalancerId`, `vserverGroupId`, `port`.
//
// > **NOTE:** Modifing `weight` attribute means detach vserver group first and then, attach with new weight parameter.
//
// > **NOTE:** Resource `ess.ScalingGroupVServerGroups` is available in 1.53.0+.
//
// ## Block vserverGroup
//
// the vserverGroup supports the following:
//
// * `loadbalancerId` - (Required) Loadbalancer server ID of VServer Group.
// * `vserverAttributes` - (Required) A list of VServer Group attributes. See Block vserverAttribute below for details.
//
// ## Block vserverAttribute
//
// * `vserverGroupId` - (Required) ID of VServer Group.
// * `port` - (Required) - The port will be used for VServer Group backend server.
// * `weight` - (Required) The weight of an ECS instance attached to the VServer Group.
//
// ## Import
//
// ESS vserver groups can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups example abc123456
// ```
type ScalingGroupVServerGroups struct {
	pulumi.CustomResourceState

	// If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
	Force pulumi.BoolPtrOutput `pulumi:"force"`
	// ID of the scaling group.
	ScalingGroupId pulumi.StringOutput `pulumi:"scalingGroupId"`
	// A list of vserver groups attached on scaling group. See Block vserverGroup below for details.
	VserverGroups ScalingGroupVServerGroupsVserverGroupArrayOutput `pulumi:"vserverGroups"`
}

// NewScalingGroupVServerGroups registers a new resource with the given unique name, arguments, and options.
func NewScalingGroupVServerGroups(ctx *pulumi.Context,
	name string, args *ScalingGroupVServerGroupsArgs, opts ...pulumi.ResourceOption) (*ScalingGroupVServerGroups, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ScalingGroupId == nil {
		return nil, errors.New("invalid value for required argument 'ScalingGroupId'")
	}
	if args.VserverGroups == nil {
		return nil, errors.New("invalid value for required argument 'VserverGroups'")
	}
	var resource ScalingGroupVServerGroups
	err := ctx.RegisterResource("alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetScalingGroupVServerGroups gets an existing ScalingGroupVServerGroups resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetScalingGroupVServerGroups(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ScalingGroupVServerGroupsState, opts ...pulumi.ResourceOption) (*ScalingGroupVServerGroups, error) {
	var resource ScalingGroupVServerGroups
	err := ctx.ReadResource("alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ScalingGroupVServerGroups resources.
type scalingGroupVServerGroupsState struct {
	// If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
	Force *bool `pulumi:"force"`
	// ID of the scaling group.
	ScalingGroupId *string `pulumi:"scalingGroupId"`
	// A list of vserver groups attached on scaling group. See Block vserverGroup below for details.
	VserverGroups []ScalingGroupVServerGroupsVserverGroup `pulumi:"vserverGroups"`
}

type ScalingGroupVServerGroupsState struct {
	// If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
	Force pulumi.BoolPtrInput
	// ID of the scaling group.
	ScalingGroupId pulumi.StringPtrInput
	// A list of vserver groups attached on scaling group. See Block vserverGroup below for details.
	VserverGroups ScalingGroupVServerGroupsVserverGroupArrayInput
}

func (ScalingGroupVServerGroupsState) ElementType() reflect.Type {
	return reflect.TypeOf((*scalingGroupVServerGroupsState)(nil)).Elem()
}

type scalingGroupVServerGroupsArgs struct {
	// If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
	Force *bool `pulumi:"force"`
	// ID of the scaling group.
	ScalingGroupId string `pulumi:"scalingGroupId"`
	// A list of vserver groups attached on scaling group. See Block vserverGroup below for details.
	VserverGroups []ScalingGroupVServerGroupsVserverGroup `pulumi:"vserverGroups"`
}

// The set of arguments for constructing a ScalingGroupVServerGroups resource.
type ScalingGroupVServerGroupsArgs struct {
	// If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
	Force pulumi.BoolPtrInput
	// ID of the scaling group.
	ScalingGroupId pulumi.StringInput
	// A list of vserver groups attached on scaling group. See Block vserverGroup below for details.
	VserverGroups ScalingGroupVServerGroupsVserverGroupArrayInput
}

func (ScalingGroupVServerGroupsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*scalingGroupVServerGroupsArgs)(nil)).Elem()
}

type ScalingGroupVServerGroupsInput interface {
	pulumi.Input

	ToScalingGroupVServerGroupsOutput() ScalingGroupVServerGroupsOutput
	ToScalingGroupVServerGroupsOutputWithContext(ctx context.Context) ScalingGroupVServerGroupsOutput
}

func (*ScalingGroupVServerGroups) ElementType() reflect.Type {
	return reflect.TypeOf((**ScalingGroupVServerGroups)(nil)).Elem()
}

func (i *ScalingGroupVServerGroups) ToScalingGroupVServerGroupsOutput() ScalingGroupVServerGroupsOutput {
	return i.ToScalingGroupVServerGroupsOutputWithContext(context.Background())
}

func (i *ScalingGroupVServerGroups) ToScalingGroupVServerGroupsOutputWithContext(ctx context.Context) ScalingGroupVServerGroupsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScalingGroupVServerGroupsOutput)
}

// ScalingGroupVServerGroupsArrayInput is an input type that accepts ScalingGroupVServerGroupsArray and ScalingGroupVServerGroupsArrayOutput values.
// You can construct a concrete instance of `ScalingGroupVServerGroupsArrayInput` via:
//
//          ScalingGroupVServerGroupsArray{ ScalingGroupVServerGroupsArgs{...} }
type ScalingGroupVServerGroupsArrayInput interface {
	pulumi.Input

	ToScalingGroupVServerGroupsArrayOutput() ScalingGroupVServerGroupsArrayOutput
	ToScalingGroupVServerGroupsArrayOutputWithContext(context.Context) ScalingGroupVServerGroupsArrayOutput
}

type ScalingGroupVServerGroupsArray []ScalingGroupVServerGroupsInput

func (ScalingGroupVServerGroupsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ScalingGroupVServerGroups)(nil)).Elem()
}

func (i ScalingGroupVServerGroupsArray) ToScalingGroupVServerGroupsArrayOutput() ScalingGroupVServerGroupsArrayOutput {
	return i.ToScalingGroupVServerGroupsArrayOutputWithContext(context.Background())
}

func (i ScalingGroupVServerGroupsArray) ToScalingGroupVServerGroupsArrayOutputWithContext(ctx context.Context) ScalingGroupVServerGroupsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScalingGroupVServerGroupsArrayOutput)
}

// ScalingGroupVServerGroupsMapInput is an input type that accepts ScalingGroupVServerGroupsMap and ScalingGroupVServerGroupsMapOutput values.
// You can construct a concrete instance of `ScalingGroupVServerGroupsMapInput` via:
//
//          ScalingGroupVServerGroupsMap{ "key": ScalingGroupVServerGroupsArgs{...} }
type ScalingGroupVServerGroupsMapInput interface {
	pulumi.Input

	ToScalingGroupVServerGroupsMapOutput() ScalingGroupVServerGroupsMapOutput
	ToScalingGroupVServerGroupsMapOutputWithContext(context.Context) ScalingGroupVServerGroupsMapOutput
}

type ScalingGroupVServerGroupsMap map[string]ScalingGroupVServerGroupsInput

func (ScalingGroupVServerGroupsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ScalingGroupVServerGroups)(nil)).Elem()
}

func (i ScalingGroupVServerGroupsMap) ToScalingGroupVServerGroupsMapOutput() ScalingGroupVServerGroupsMapOutput {
	return i.ToScalingGroupVServerGroupsMapOutputWithContext(context.Background())
}

func (i ScalingGroupVServerGroupsMap) ToScalingGroupVServerGroupsMapOutputWithContext(ctx context.Context) ScalingGroupVServerGroupsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScalingGroupVServerGroupsMapOutput)
}

type ScalingGroupVServerGroupsOutput struct{ *pulumi.OutputState }

func (ScalingGroupVServerGroupsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ScalingGroupVServerGroups)(nil)).Elem()
}

func (o ScalingGroupVServerGroupsOutput) ToScalingGroupVServerGroupsOutput() ScalingGroupVServerGroupsOutput {
	return o
}

func (o ScalingGroupVServerGroupsOutput) ToScalingGroupVServerGroupsOutputWithContext(ctx context.Context) ScalingGroupVServerGroupsOutput {
	return o
}

type ScalingGroupVServerGroupsArrayOutput struct{ *pulumi.OutputState }

func (ScalingGroupVServerGroupsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ScalingGroupVServerGroups)(nil)).Elem()
}

func (o ScalingGroupVServerGroupsArrayOutput) ToScalingGroupVServerGroupsArrayOutput() ScalingGroupVServerGroupsArrayOutput {
	return o
}

func (o ScalingGroupVServerGroupsArrayOutput) ToScalingGroupVServerGroupsArrayOutputWithContext(ctx context.Context) ScalingGroupVServerGroupsArrayOutput {
	return o
}

func (o ScalingGroupVServerGroupsArrayOutput) Index(i pulumi.IntInput) ScalingGroupVServerGroupsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ScalingGroupVServerGroups {
		return vs[0].([]*ScalingGroupVServerGroups)[vs[1].(int)]
	}).(ScalingGroupVServerGroupsOutput)
}

type ScalingGroupVServerGroupsMapOutput struct{ *pulumi.OutputState }

func (ScalingGroupVServerGroupsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ScalingGroupVServerGroups)(nil)).Elem()
}

func (o ScalingGroupVServerGroupsMapOutput) ToScalingGroupVServerGroupsMapOutput() ScalingGroupVServerGroupsMapOutput {
	return o
}

func (o ScalingGroupVServerGroupsMapOutput) ToScalingGroupVServerGroupsMapOutputWithContext(ctx context.Context) ScalingGroupVServerGroupsMapOutput {
	return o
}

func (o ScalingGroupVServerGroupsMapOutput) MapIndex(k pulumi.StringInput) ScalingGroupVServerGroupsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ScalingGroupVServerGroups {
		return vs[0].(map[string]*ScalingGroupVServerGroups)[vs[1].(string)]
	}).(ScalingGroupVServerGroupsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ScalingGroupVServerGroupsInput)(nil)).Elem(), &ScalingGroupVServerGroups{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScalingGroupVServerGroupsArrayInput)(nil)).Elem(), ScalingGroupVServerGroupsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScalingGroupVServerGroupsMapInput)(nil)).Elem(), ScalingGroupVServerGroupsMap{})
	pulumi.RegisterOutputType(ScalingGroupVServerGroupsOutput{})
	pulumi.RegisterOutputType(ScalingGroupVServerGroupsArrayOutput{})
	pulumi.RegisterOutputType(ScalingGroupVServerGroupsMapOutput{})
}
