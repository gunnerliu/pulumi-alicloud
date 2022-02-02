// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ECS Session Manager Status resource.
//
// For information about ECS Session Manager Status and how to use it, see [What is Session Manager Status](https://www.alibabacloud.com/help/zh/doc-detail/337915.html).
//
// > **NOTE:** Available in v1.148.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := ecs.NewEcsSessionManagerStatus(ctx, "default", &ecs.EcsSessionManagerStatusArgs{
// 			SessionManagerStatusName: pulumi.String("sessionManagerStatus"),
// 			Status:                   pulumi.String("Disabled"),
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
// ECS Session Manager Status can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ecs/ecsSessionManagerStatus:EcsSessionManagerStatus example <session_manager_status_name>
// ```
type EcsSessionManagerStatus struct {
	pulumi.CustomResourceState

	// The name of the resource. Valid values: `sessionManagerStatus`.
	SessionManagerStatusName pulumi.StringOutput `pulumi:"sessionManagerStatusName"`
	// The status of the resource. Valid values: `Disabled`, `Enabled`.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewEcsSessionManagerStatus registers a new resource with the given unique name, arguments, and options.
func NewEcsSessionManagerStatus(ctx *pulumi.Context,
	name string, args *EcsSessionManagerStatusArgs, opts ...pulumi.ResourceOption) (*EcsSessionManagerStatus, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SessionManagerStatusName == nil {
		return nil, errors.New("invalid value for required argument 'SessionManagerStatusName'")
	}
	if args.Status == nil {
		return nil, errors.New("invalid value for required argument 'Status'")
	}
	var resource EcsSessionManagerStatus
	err := ctx.RegisterResource("alicloud:ecs/ecsSessionManagerStatus:EcsSessionManagerStatus", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEcsSessionManagerStatus gets an existing EcsSessionManagerStatus resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEcsSessionManagerStatus(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EcsSessionManagerStatusState, opts ...pulumi.ResourceOption) (*EcsSessionManagerStatus, error) {
	var resource EcsSessionManagerStatus
	err := ctx.ReadResource("alicloud:ecs/ecsSessionManagerStatus:EcsSessionManagerStatus", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EcsSessionManagerStatus resources.
type ecsSessionManagerStatusState struct {
	// The name of the resource. Valid values: `sessionManagerStatus`.
	SessionManagerStatusName *string `pulumi:"sessionManagerStatusName"`
	// The status of the resource. Valid values: `Disabled`, `Enabled`.
	Status *string `pulumi:"status"`
}

type EcsSessionManagerStatusState struct {
	// The name of the resource. Valid values: `sessionManagerStatus`.
	SessionManagerStatusName pulumi.StringPtrInput
	// The status of the resource. Valid values: `Disabled`, `Enabled`.
	Status pulumi.StringPtrInput
}

func (EcsSessionManagerStatusState) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsSessionManagerStatusState)(nil)).Elem()
}

type ecsSessionManagerStatusArgs struct {
	// The name of the resource. Valid values: `sessionManagerStatus`.
	SessionManagerStatusName string `pulumi:"sessionManagerStatusName"`
	// The status of the resource. Valid values: `Disabled`, `Enabled`.
	Status string `pulumi:"status"`
}

// The set of arguments for constructing a EcsSessionManagerStatus resource.
type EcsSessionManagerStatusArgs struct {
	// The name of the resource. Valid values: `sessionManagerStatus`.
	SessionManagerStatusName pulumi.StringInput
	// The status of the resource. Valid values: `Disabled`, `Enabled`.
	Status pulumi.StringInput
}

func (EcsSessionManagerStatusArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsSessionManagerStatusArgs)(nil)).Elem()
}

type EcsSessionManagerStatusInput interface {
	pulumi.Input

	ToEcsSessionManagerStatusOutput() EcsSessionManagerStatusOutput
	ToEcsSessionManagerStatusOutputWithContext(ctx context.Context) EcsSessionManagerStatusOutput
}

func (*EcsSessionManagerStatus) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsSessionManagerStatus)(nil)).Elem()
}

func (i *EcsSessionManagerStatus) ToEcsSessionManagerStatusOutput() EcsSessionManagerStatusOutput {
	return i.ToEcsSessionManagerStatusOutputWithContext(context.Background())
}

func (i *EcsSessionManagerStatus) ToEcsSessionManagerStatusOutputWithContext(ctx context.Context) EcsSessionManagerStatusOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsSessionManagerStatusOutput)
}

// EcsSessionManagerStatusArrayInput is an input type that accepts EcsSessionManagerStatusArray and EcsSessionManagerStatusArrayOutput values.
// You can construct a concrete instance of `EcsSessionManagerStatusArrayInput` via:
//
//          EcsSessionManagerStatusArray{ EcsSessionManagerStatusArgs{...} }
type EcsSessionManagerStatusArrayInput interface {
	pulumi.Input

	ToEcsSessionManagerStatusArrayOutput() EcsSessionManagerStatusArrayOutput
	ToEcsSessionManagerStatusArrayOutputWithContext(context.Context) EcsSessionManagerStatusArrayOutput
}

type EcsSessionManagerStatusArray []EcsSessionManagerStatusInput

func (EcsSessionManagerStatusArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsSessionManagerStatus)(nil)).Elem()
}

func (i EcsSessionManagerStatusArray) ToEcsSessionManagerStatusArrayOutput() EcsSessionManagerStatusArrayOutput {
	return i.ToEcsSessionManagerStatusArrayOutputWithContext(context.Background())
}

func (i EcsSessionManagerStatusArray) ToEcsSessionManagerStatusArrayOutputWithContext(ctx context.Context) EcsSessionManagerStatusArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsSessionManagerStatusArrayOutput)
}

// EcsSessionManagerStatusMapInput is an input type that accepts EcsSessionManagerStatusMap and EcsSessionManagerStatusMapOutput values.
// You can construct a concrete instance of `EcsSessionManagerStatusMapInput` via:
//
//          EcsSessionManagerStatusMap{ "key": EcsSessionManagerStatusArgs{...} }
type EcsSessionManagerStatusMapInput interface {
	pulumi.Input

	ToEcsSessionManagerStatusMapOutput() EcsSessionManagerStatusMapOutput
	ToEcsSessionManagerStatusMapOutputWithContext(context.Context) EcsSessionManagerStatusMapOutput
}

type EcsSessionManagerStatusMap map[string]EcsSessionManagerStatusInput

func (EcsSessionManagerStatusMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsSessionManagerStatus)(nil)).Elem()
}

func (i EcsSessionManagerStatusMap) ToEcsSessionManagerStatusMapOutput() EcsSessionManagerStatusMapOutput {
	return i.ToEcsSessionManagerStatusMapOutputWithContext(context.Background())
}

func (i EcsSessionManagerStatusMap) ToEcsSessionManagerStatusMapOutputWithContext(ctx context.Context) EcsSessionManagerStatusMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsSessionManagerStatusMapOutput)
}

type EcsSessionManagerStatusOutput struct{ *pulumi.OutputState }

func (EcsSessionManagerStatusOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsSessionManagerStatus)(nil)).Elem()
}

func (o EcsSessionManagerStatusOutput) ToEcsSessionManagerStatusOutput() EcsSessionManagerStatusOutput {
	return o
}

func (o EcsSessionManagerStatusOutput) ToEcsSessionManagerStatusOutputWithContext(ctx context.Context) EcsSessionManagerStatusOutput {
	return o
}

type EcsSessionManagerStatusArrayOutput struct{ *pulumi.OutputState }

func (EcsSessionManagerStatusArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsSessionManagerStatus)(nil)).Elem()
}

func (o EcsSessionManagerStatusArrayOutput) ToEcsSessionManagerStatusArrayOutput() EcsSessionManagerStatusArrayOutput {
	return o
}

func (o EcsSessionManagerStatusArrayOutput) ToEcsSessionManagerStatusArrayOutputWithContext(ctx context.Context) EcsSessionManagerStatusArrayOutput {
	return o
}

func (o EcsSessionManagerStatusArrayOutput) Index(i pulumi.IntInput) EcsSessionManagerStatusOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EcsSessionManagerStatus {
		return vs[0].([]*EcsSessionManagerStatus)[vs[1].(int)]
	}).(EcsSessionManagerStatusOutput)
}

type EcsSessionManagerStatusMapOutput struct{ *pulumi.OutputState }

func (EcsSessionManagerStatusMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsSessionManagerStatus)(nil)).Elem()
}

func (o EcsSessionManagerStatusMapOutput) ToEcsSessionManagerStatusMapOutput() EcsSessionManagerStatusMapOutput {
	return o
}

func (o EcsSessionManagerStatusMapOutput) ToEcsSessionManagerStatusMapOutputWithContext(ctx context.Context) EcsSessionManagerStatusMapOutput {
	return o
}

func (o EcsSessionManagerStatusMapOutput) MapIndex(k pulumi.StringInput) EcsSessionManagerStatusOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EcsSessionManagerStatus {
		return vs[0].(map[string]*EcsSessionManagerStatus)[vs[1].(string)]
	}).(EcsSessionManagerStatusOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EcsSessionManagerStatusInput)(nil)).Elem(), &EcsSessionManagerStatus{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsSessionManagerStatusArrayInput)(nil)).Elem(), EcsSessionManagerStatusArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsSessionManagerStatusMapInput)(nil)).Elem(), EcsSessionManagerStatusMap{})
	pulumi.RegisterOutputType(EcsSessionManagerStatusOutput{})
	pulumi.RegisterOutputType(EcsSessionManagerStatusArrayOutput{})
	pulumi.RegisterOutputType(EcsSessionManagerStatusMapOutput{})
}
