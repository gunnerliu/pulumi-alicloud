// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ros

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ROS Stack Instance resource.
//
// For information about ROS Stack Instance and how to use it, see [What is Stack Instance](https://www.alibabacloud.com/help/en/doc-detail/151338.html).
//
// > **NOTE:** Available in v1.145.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ros"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleRegions, err := ros.GetRegions(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			exampleStackGroup, err := ros.NewStackGroup(ctx, "exampleStackGroup", &ros.StackGroupArgs{
//				StackGroupName: pulumi.Any(_var.Name),
//				TemplateBody:   pulumi.String("{\"ROSTemplateFormatVersion\":\"2015-09-01\", \"Parameters\": {\"VpcName\": {\"Type\": \"String\"},\"InstanceType\": {\"Type\": \"String\"}}}"),
//				Description:    pulumi.String("test for stack groups"),
//				Parameters: ros.StackGroupParameterArray{
//					&ros.StackGroupParameterArgs{
//						ParameterKey:   pulumi.String("VpcName"),
//						ParameterValue: pulumi.String("VpcName"),
//					},
//					&ros.StackGroupParameterArgs{
//						ParameterKey:   pulumi.String("InstanceType"),
//						ParameterValue: pulumi.String("InstanceType"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ros.NewStackInstance(ctx, "exampleStackInstance", &ros.StackInstanceArgs{
//				StackGroupName:         exampleStackGroup.StackGroupName,
//				StackInstanceAccountId: pulumi.String("example_value"),
//				StackInstanceRegionId:  *pulumi.String(exampleRegions.Regions[0].RegionId),
//				OperationPreferences:   pulumi.String("{\"FailureToleranceCount\": 1, \"MaxConcurrentCount\": 2}"),
//				ParameterOverrides: ros.StackInstanceParameterOverrideArray{
//					&ros.StackInstanceParameterOverrideArgs{
//						ParameterValue: pulumi.String("VpcName"),
//						ParameterKey:   pulumi.String("VpcName"),
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
// ROS Stack Instance can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ros/stackInstance:StackInstance example <stack_group_name>:<stack_instance_account_id>:<stack_instance_region_id>
//
// ```
type StackInstance struct {
	pulumi.CustomResourceState

	// The operation description.
	OperationDescription pulumi.StringPtrOutput `pulumi:"operationDescription"`
	// The operation preferences. The operation settings. The following fields are supported:
	OperationPreferences pulumi.StringPtrOutput `pulumi:"operationPreferences"`
	// ParameterOverrides. See the following `Block parameterOverrides`.
	ParameterOverrides StackInstanceParameterOverrideArrayOutput `pulumi:"parameterOverrides"`
	// Specifies whether to retain the stack corresponding to the stack instance.Default value `false`. **NOTE:** When `retainStacks` is `true`, the stack is retained. If the stack is retained, the corresponding stack is not deleted when the stack instance is deleted from the stack group.
	RetainStacks pulumi.BoolPtrOutput `pulumi:"retainStacks"`
	// The name of the stack group.
	StackGroupName pulumi.StringOutput `pulumi:"stackGroupName"`
	// The account to which the stack instance belongs.
	StackInstanceAccountId pulumi.StringOutput `pulumi:"stackInstanceAccountId"`
	// The region of the stack instance.
	StackInstanceRegionId pulumi.StringOutput `pulumi:"stackInstanceRegionId"`
	// The status of the stack instance. Valid values: `CURRENT` or `OUTDATED`.
	Status pulumi.StringOutput `pulumi:"status"`
	// The timeout period that is specified for the stack creation request. Default value: `60`. Unit: `minutes`.
	TimeoutInMinutes pulumi.StringPtrOutput `pulumi:"timeoutInMinutes"`
}

// NewStackInstance registers a new resource with the given unique name, arguments, and options.
func NewStackInstance(ctx *pulumi.Context,
	name string, args *StackInstanceArgs, opts ...pulumi.ResourceOption) (*StackInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.StackGroupName == nil {
		return nil, errors.New("invalid value for required argument 'StackGroupName'")
	}
	if args.StackInstanceAccountId == nil {
		return nil, errors.New("invalid value for required argument 'StackInstanceAccountId'")
	}
	if args.StackInstanceRegionId == nil {
		return nil, errors.New("invalid value for required argument 'StackInstanceRegionId'")
	}
	if args.ParameterOverrides != nil {
		args.ParameterOverrides = pulumi.ToSecret(args.ParameterOverrides).(StackInstanceParameterOverrideArrayInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"parameterOverrides",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StackInstance
	err := ctx.RegisterResource("alicloud:ros/stackInstance:StackInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStackInstance gets an existing StackInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStackInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StackInstanceState, opts ...pulumi.ResourceOption) (*StackInstance, error) {
	var resource StackInstance
	err := ctx.ReadResource("alicloud:ros/stackInstance:StackInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StackInstance resources.
type stackInstanceState struct {
	// The operation description.
	OperationDescription *string `pulumi:"operationDescription"`
	// The operation preferences. The operation settings. The following fields are supported:
	OperationPreferences *string `pulumi:"operationPreferences"`
	// ParameterOverrides. See the following `Block parameterOverrides`.
	ParameterOverrides []StackInstanceParameterOverride `pulumi:"parameterOverrides"`
	// Specifies whether to retain the stack corresponding to the stack instance.Default value `false`. **NOTE:** When `retainStacks` is `true`, the stack is retained. If the stack is retained, the corresponding stack is not deleted when the stack instance is deleted from the stack group.
	RetainStacks *bool `pulumi:"retainStacks"`
	// The name of the stack group.
	StackGroupName *string `pulumi:"stackGroupName"`
	// The account to which the stack instance belongs.
	StackInstanceAccountId *string `pulumi:"stackInstanceAccountId"`
	// The region of the stack instance.
	StackInstanceRegionId *string `pulumi:"stackInstanceRegionId"`
	// The status of the stack instance. Valid values: `CURRENT` or `OUTDATED`.
	Status *string `pulumi:"status"`
	// The timeout period that is specified for the stack creation request. Default value: `60`. Unit: `minutes`.
	TimeoutInMinutes *string `pulumi:"timeoutInMinutes"`
}

type StackInstanceState struct {
	// The operation description.
	OperationDescription pulumi.StringPtrInput
	// The operation preferences. The operation settings. The following fields are supported:
	OperationPreferences pulumi.StringPtrInput
	// ParameterOverrides. See the following `Block parameterOverrides`.
	ParameterOverrides StackInstanceParameterOverrideArrayInput
	// Specifies whether to retain the stack corresponding to the stack instance.Default value `false`. **NOTE:** When `retainStacks` is `true`, the stack is retained. If the stack is retained, the corresponding stack is not deleted when the stack instance is deleted from the stack group.
	RetainStacks pulumi.BoolPtrInput
	// The name of the stack group.
	StackGroupName pulumi.StringPtrInput
	// The account to which the stack instance belongs.
	StackInstanceAccountId pulumi.StringPtrInput
	// The region of the stack instance.
	StackInstanceRegionId pulumi.StringPtrInput
	// The status of the stack instance. Valid values: `CURRENT` or `OUTDATED`.
	Status pulumi.StringPtrInput
	// The timeout period that is specified for the stack creation request. Default value: `60`. Unit: `minutes`.
	TimeoutInMinutes pulumi.StringPtrInput
}

func (StackInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*stackInstanceState)(nil)).Elem()
}

type stackInstanceArgs struct {
	// The operation description.
	OperationDescription *string `pulumi:"operationDescription"`
	// The operation preferences. The operation settings. The following fields are supported:
	OperationPreferences *string `pulumi:"operationPreferences"`
	// ParameterOverrides. See the following `Block parameterOverrides`.
	ParameterOverrides []StackInstanceParameterOverride `pulumi:"parameterOverrides"`
	// Specifies whether to retain the stack corresponding to the stack instance.Default value `false`. **NOTE:** When `retainStacks` is `true`, the stack is retained. If the stack is retained, the corresponding stack is not deleted when the stack instance is deleted from the stack group.
	RetainStacks *bool `pulumi:"retainStacks"`
	// The name of the stack group.
	StackGroupName string `pulumi:"stackGroupName"`
	// The account to which the stack instance belongs.
	StackInstanceAccountId string `pulumi:"stackInstanceAccountId"`
	// The region of the stack instance.
	StackInstanceRegionId string `pulumi:"stackInstanceRegionId"`
	// The timeout period that is specified for the stack creation request. Default value: `60`. Unit: `minutes`.
	TimeoutInMinutes *string `pulumi:"timeoutInMinutes"`
}

// The set of arguments for constructing a StackInstance resource.
type StackInstanceArgs struct {
	// The operation description.
	OperationDescription pulumi.StringPtrInput
	// The operation preferences. The operation settings. The following fields are supported:
	OperationPreferences pulumi.StringPtrInput
	// ParameterOverrides. See the following `Block parameterOverrides`.
	ParameterOverrides StackInstanceParameterOverrideArrayInput
	// Specifies whether to retain the stack corresponding to the stack instance.Default value `false`. **NOTE:** When `retainStacks` is `true`, the stack is retained. If the stack is retained, the corresponding stack is not deleted when the stack instance is deleted from the stack group.
	RetainStacks pulumi.BoolPtrInput
	// The name of the stack group.
	StackGroupName pulumi.StringInput
	// The account to which the stack instance belongs.
	StackInstanceAccountId pulumi.StringInput
	// The region of the stack instance.
	StackInstanceRegionId pulumi.StringInput
	// The timeout period that is specified for the stack creation request. Default value: `60`. Unit: `minutes`.
	TimeoutInMinutes pulumi.StringPtrInput
}

func (StackInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*stackInstanceArgs)(nil)).Elem()
}

type StackInstanceInput interface {
	pulumi.Input

	ToStackInstanceOutput() StackInstanceOutput
	ToStackInstanceOutputWithContext(ctx context.Context) StackInstanceOutput
}

func (*StackInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**StackInstance)(nil)).Elem()
}

func (i *StackInstance) ToStackInstanceOutput() StackInstanceOutput {
	return i.ToStackInstanceOutputWithContext(context.Background())
}

func (i *StackInstance) ToStackInstanceOutputWithContext(ctx context.Context) StackInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackInstanceOutput)
}

// StackInstanceArrayInput is an input type that accepts StackInstanceArray and StackInstanceArrayOutput values.
// You can construct a concrete instance of `StackInstanceArrayInput` via:
//
//	StackInstanceArray{ StackInstanceArgs{...} }
type StackInstanceArrayInput interface {
	pulumi.Input

	ToStackInstanceArrayOutput() StackInstanceArrayOutput
	ToStackInstanceArrayOutputWithContext(context.Context) StackInstanceArrayOutput
}

type StackInstanceArray []StackInstanceInput

func (StackInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StackInstance)(nil)).Elem()
}

func (i StackInstanceArray) ToStackInstanceArrayOutput() StackInstanceArrayOutput {
	return i.ToStackInstanceArrayOutputWithContext(context.Background())
}

func (i StackInstanceArray) ToStackInstanceArrayOutputWithContext(ctx context.Context) StackInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackInstanceArrayOutput)
}

// StackInstanceMapInput is an input type that accepts StackInstanceMap and StackInstanceMapOutput values.
// You can construct a concrete instance of `StackInstanceMapInput` via:
//
//	StackInstanceMap{ "key": StackInstanceArgs{...} }
type StackInstanceMapInput interface {
	pulumi.Input

	ToStackInstanceMapOutput() StackInstanceMapOutput
	ToStackInstanceMapOutputWithContext(context.Context) StackInstanceMapOutput
}

type StackInstanceMap map[string]StackInstanceInput

func (StackInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StackInstance)(nil)).Elem()
}

func (i StackInstanceMap) ToStackInstanceMapOutput() StackInstanceMapOutput {
	return i.ToStackInstanceMapOutputWithContext(context.Background())
}

func (i StackInstanceMap) ToStackInstanceMapOutputWithContext(ctx context.Context) StackInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackInstanceMapOutput)
}

type StackInstanceOutput struct{ *pulumi.OutputState }

func (StackInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StackInstance)(nil)).Elem()
}

func (o StackInstanceOutput) ToStackInstanceOutput() StackInstanceOutput {
	return o
}

func (o StackInstanceOutput) ToStackInstanceOutputWithContext(ctx context.Context) StackInstanceOutput {
	return o
}

// The operation description.
func (o StackInstanceOutput) OperationDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StackInstance) pulumi.StringPtrOutput { return v.OperationDescription }).(pulumi.StringPtrOutput)
}

// The operation preferences. The operation settings. The following fields are supported:
func (o StackInstanceOutput) OperationPreferences() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StackInstance) pulumi.StringPtrOutput { return v.OperationPreferences }).(pulumi.StringPtrOutput)
}

// ParameterOverrides. See the following `Block parameterOverrides`.
func (o StackInstanceOutput) ParameterOverrides() StackInstanceParameterOverrideArrayOutput {
	return o.ApplyT(func(v *StackInstance) StackInstanceParameterOverrideArrayOutput { return v.ParameterOverrides }).(StackInstanceParameterOverrideArrayOutput)
}

// Specifies whether to retain the stack corresponding to the stack instance.Default value `false`. **NOTE:** When `retainStacks` is `true`, the stack is retained. If the stack is retained, the corresponding stack is not deleted when the stack instance is deleted from the stack group.
func (o StackInstanceOutput) RetainStacks() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *StackInstance) pulumi.BoolPtrOutput { return v.RetainStacks }).(pulumi.BoolPtrOutput)
}

// The name of the stack group.
func (o StackInstanceOutput) StackGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *StackInstance) pulumi.StringOutput { return v.StackGroupName }).(pulumi.StringOutput)
}

// The account to which the stack instance belongs.
func (o StackInstanceOutput) StackInstanceAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *StackInstance) pulumi.StringOutput { return v.StackInstanceAccountId }).(pulumi.StringOutput)
}

// The region of the stack instance.
func (o StackInstanceOutput) StackInstanceRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *StackInstance) pulumi.StringOutput { return v.StackInstanceRegionId }).(pulumi.StringOutput)
}

// The status of the stack instance. Valid values: `CURRENT` or `OUTDATED`.
func (o StackInstanceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *StackInstance) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The timeout period that is specified for the stack creation request. Default value: `60`. Unit: `minutes`.
func (o StackInstanceOutput) TimeoutInMinutes() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StackInstance) pulumi.StringPtrOutput { return v.TimeoutInMinutes }).(pulumi.StringPtrOutput)
}

type StackInstanceArrayOutput struct{ *pulumi.OutputState }

func (StackInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StackInstance)(nil)).Elem()
}

func (o StackInstanceArrayOutput) ToStackInstanceArrayOutput() StackInstanceArrayOutput {
	return o
}

func (o StackInstanceArrayOutput) ToStackInstanceArrayOutputWithContext(ctx context.Context) StackInstanceArrayOutput {
	return o
}

func (o StackInstanceArrayOutput) Index(i pulumi.IntInput) StackInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StackInstance {
		return vs[0].([]*StackInstance)[vs[1].(int)]
	}).(StackInstanceOutput)
}

type StackInstanceMapOutput struct{ *pulumi.OutputState }

func (StackInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StackInstance)(nil)).Elem()
}

func (o StackInstanceMapOutput) ToStackInstanceMapOutput() StackInstanceMapOutput {
	return o
}

func (o StackInstanceMapOutput) ToStackInstanceMapOutputWithContext(ctx context.Context) StackInstanceMapOutput {
	return o
}

func (o StackInstanceMapOutput) MapIndex(k pulumi.StringInput) StackInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StackInstance {
		return vs[0].(map[string]*StackInstance)[vs[1].(string)]
	}).(StackInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StackInstanceInput)(nil)).Elem(), &StackInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*StackInstanceArrayInput)(nil)).Elem(), StackInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StackInstanceMapInput)(nil)).Elem(), StackInstanceMap{})
	pulumi.RegisterOutputType(StackInstanceOutput{})
	pulumi.RegisterOutputType(StackInstanceArrayOutput{})
	pulumi.RegisterOutputType(StackInstanceMapOutput{})
}
