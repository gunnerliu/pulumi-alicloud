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

// Provides a Cloud Monitor Service Hybrid Monitor Sls Task resource.
//
// For information about Cloud Monitor Service Hybrid Monitor Sls Task and how to use it, see [What is Hybrid Monitor Sls Task](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createhybridmonitortask).
//
// > **NOTE:** Available since v1.179.0.
//
// ## Import
//
// Cloud Monitor Service Hybrid Monitor Sls Task can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cms/hybridMonitorSlsTask:HybridMonitorSlsTask example <id>
//
// ```
type HybridMonitorSlsTask struct {
	pulumi.CustomResourceState

	// The label of the monitoring task. See `attachLabels` below.
	AttachLabels HybridMonitorSlsTaskAttachLabelArrayOutput `pulumi:"attachLabels"`
	// The interval at which metrics are collected. Valid values: `15`, `60`(default value). Unit: seconds.
	CollectInterval pulumi.IntOutput `pulumi:"collectInterval"`
	// The type of the collection target, enter the name of the Logstore group.
	CollectTargetType pulumi.StringOutput `pulumi:"collectTargetType"`
	// The description of the metric import task.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the namespace.
	Namespace pulumi.StringOutput `pulumi:"namespace"`
	// The configurations of the logs that are imported from Log Service. See `slsProcessConfig` below.
	SlsProcessConfig HybridMonitorSlsTaskSlsProcessConfigOutput `pulumi:"slsProcessConfig"`
	// The name of the metric import task, enter the name of the metric for logs imported from Log Service.
	TaskName pulumi.StringOutput `pulumi:"taskName"`
}

// NewHybridMonitorSlsTask registers a new resource with the given unique name, arguments, and options.
func NewHybridMonitorSlsTask(ctx *pulumi.Context,
	name string, args *HybridMonitorSlsTaskArgs, opts ...pulumi.ResourceOption) (*HybridMonitorSlsTask, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CollectTargetType == nil {
		return nil, errors.New("invalid value for required argument 'CollectTargetType'")
	}
	if args.Namespace == nil {
		return nil, errors.New("invalid value for required argument 'Namespace'")
	}
	if args.SlsProcessConfig == nil {
		return nil, errors.New("invalid value for required argument 'SlsProcessConfig'")
	}
	if args.TaskName == nil {
		return nil, errors.New("invalid value for required argument 'TaskName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HybridMonitorSlsTask
	err := ctx.RegisterResource("alicloud:cms/hybridMonitorSlsTask:HybridMonitorSlsTask", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHybridMonitorSlsTask gets an existing HybridMonitorSlsTask resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHybridMonitorSlsTask(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HybridMonitorSlsTaskState, opts ...pulumi.ResourceOption) (*HybridMonitorSlsTask, error) {
	var resource HybridMonitorSlsTask
	err := ctx.ReadResource("alicloud:cms/hybridMonitorSlsTask:HybridMonitorSlsTask", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HybridMonitorSlsTask resources.
type hybridMonitorSlsTaskState struct {
	// The label of the monitoring task. See `attachLabels` below.
	AttachLabels []HybridMonitorSlsTaskAttachLabel `pulumi:"attachLabels"`
	// The interval at which metrics are collected. Valid values: `15`, `60`(default value). Unit: seconds.
	CollectInterval *int `pulumi:"collectInterval"`
	// The type of the collection target, enter the name of the Logstore group.
	CollectTargetType *string `pulumi:"collectTargetType"`
	// The description of the metric import task.
	Description *string `pulumi:"description"`
	// The name of the namespace.
	Namespace *string `pulumi:"namespace"`
	// The configurations of the logs that are imported from Log Service. See `slsProcessConfig` below.
	SlsProcessConfig *HybridMonitorSlsTaskSlsProcessConfig `pulumi:"slsProcessConfig"`
	// The name of the metric import task, enter the name of the metric for logs imported from Log Service.
	TaskName *string `pulumi:"taskName"`
}

type HybridMonitorSlsTaskState struct {
	// The label of the monitoring task. See `attachLabels` below.
	AttachLabels HybridMonitorSlsTaskAttachLabelArrayInput
	// The interval at which metrics are collected. Valid values: `15`, `60`(default value). Unit: seconds.
	CollectInterval pulumi.IntPtrInput
	// The type of the collection target, enter the name of the Logstore group.
	CollectTargetType pulumi.StringPtrInput
	// The description of the metric import task.
	Description pulumi.StringPtrInput
	// The name of the namespace.
	Namespace pulumi.StringPtrInput
	// The configurations of the logs that are imported from Log Service. See `slsProcessConfig` below.
	SlsProcessConfig HybridMonitorSlsTaskSlsProcessConfigPtrInput
	// The name of the metric import task, enter the name of the metric for logs imported from Log Service.
	TaskName pulumi.StringPtrInput
}

func (HybridMonitorSlsTaskState) ElementType() reflect.Type {
	return reflect.TypeOf((*hybridMonitorSlsTaskState)(nil)).Elem()
}

type hybridMonitorSlsTaskArgs struct {
	// The label of the monitoring task. See `attachLabels` below.
	AttachLabels []HybridMonitorSlsTaskAttachLabel `pulumi:"attachLabels"`
	// The interval at which metrics are collected. Valid values: `15`, `60`(default value). Unit: seconds.
	CollectInterval *int `pulumi:"collectInterval"`
	// The type of the collection target, enter the name of the Logstore group.
	CollectTargetType string `pulumi:"collectTargetType"`
	// The description of the metric import task.
	Description *string `pulumi:"description"`
	// The name of the namespace.
	Namespace string `pulumi:"namespace"`
	// The configurations of the logs that are imported from Log Service. See `slsProcessConfig` below.
	SlsProcessConfig HybridMonitorSlsTaskSlsProcessConfig `pulumi:"slsProcessConfig"`
	// The name of the metric import task, enter the name of the metric for logs imported from Log Service.
	TaskName string `pulumi:"taskName"`
}

// The set of arguments for constructing a HybridMonitorSlsTask resource.
type HybridMonitorSlsTaskArgs struct {
	// The label of the monitoring task. See `attachLabels` below.
	AttachLabels HybridMonitorSlsTaskAttachLabelArrayInput
	// The interval at which metrics are collected. Valid values: `15`, `60`(default value). Unit: seconds.
	CollectInterval pulumi.IntPtrInput
	// The type of the collection target, enter the name of the Logstore group.
	CollectTargetType pulumi.StringInput
	// The description of the metric import task.
	Description pulumi.StringPtrInput
	// The name of the namespace.
	Namespace pulumi.StringInput
	// The configurations of the logs that are imported from Log Service. See `slsProcessConfig` below.
	SlsProcessConfig HybridMonitorSlsTaskSlsProcessConfigInput
	// The name of the metric import task, enter the name of the metric for logs imported from Log Service.
	TaskName pulumi.StringInput
}

func (HybridMonitorSlsTaskArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hybridMonitorSlsTaskArgs)(nil)).Elem()
}

type HybridMonitorSlsTaskInput interface {
	pulumi.Input

	ToHybridMonitorSlsTaskOutput() HybridMonitorSlsTaskOutput
	ToHybridMonitorSlsTaskOutputWithContext(ctx context.Context) HybridMonitorSlsTaskOutput
}

func (*HybridMonitorSlsTask) ElementType() reflect.Type {
	return reflect.TypeOf((**HybridMonitorSlsTask)(nil)).Elem()
}

func (i *HybridMonitorSlsTask) ToHybridMonitorSlsTaskOutput() HybridMonitorSlsTaskOutput {
	return i.ToHybridMonitorSlsTaskOutputWithContext(context.Background())
}

func (i *HybridMonitorSlsTask) ToHybridMonitorSlsTaskOutputWithContext(ctx context.Context) HybridMonitorSlsTaskOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HybridMonitorSlsTaskOutput)
}

func (i *HybridMonitorSlsTask) ToOutput(ctx context.Context) pulumix.Output[*HybridMonitorSlsTask] {
	return pulumix.Output[*HybridMonitorSlsTask]{
		OutputState: i.ToHybridMonitorSlsTaskOutputWithContext(ctx).OutputState,
	}
}

// HybridMonitorSlsTaskArrayInput is an input type that accepts HybridMonitorSlsTaskArray and HybridMonitorSlsTaskArrayOutput values.
// You can construct a concrete instance of `HybridMonitorSlsTaskArrayInput` via:
//
//	HybridMonitorSlsTaskArray{ HybridMonitorSlsTaskArgs{...} }
type HybridMonitorSlsTaskArrayInput interface {
	pulumi.Input

	ToHybridMonitorSlsTaskArrayOutput() HybridMonitorSlsTaskArrayOutput
	ToHybridMonitorSlsTaskArrayOutputWithContext(context.Context) HybridMonitorSlsTaskArrayOutput
}

type HybridMonitorSlsTaskArray []HybridMonitorSlsTaskInput

func (HybridMonitorSlsTaskArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HybridMonitorSlsTask)(nil)).Elem()
}

func (i HybridMonitorSlsTaskArray) ToHybridMonitorSlsTaskArrayOutput() HybridMonitorSlsTaskArrayOutput {
	return i.ToHybridMonitorSlsTaskArrayOutputWithContext(context.Background())
}

func (i HybridMonitorSlsTaskArray) ToHybridMonitorSlsTaskArrayOutputWithContext(ctx context.Context) HybridMonitorSlsTaskArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HybridMonitorSlsTaskArrayOutput)
}

func (i HybridMonitorSlsTaskArray) ToOutput(ctx context.Context) pulumix.Output[[]*HybridMonitorSlsTask] {
	return pulumix.Output[[]*HybridMonitorSlsTask]{
		OutputState: i.ToHybridMonitorSlsTaskArrayOutputWithContext(ctx).OutputState,
	}
}

// HybridMonitorSlsTaskMapInput is an input type that accepts HybridMonitorSlsTaskMap and HybridMonitorSlsTaskMapOutput values.
// You can construct a concrete instance of `HybridMonitorSlsTaskMapInput` via:
//
//	HybridMonitorSlsTaskMap{ "key": HybridMonitorSlsTaskArgs{...} }
type HybridMonitorSlsTaskMapInput interface {
	pulumi.Input

	ToHybridMonitorSlsTaskMapOutput() HybridMonitorSlsTaskMapOutput
	ToHybridMonitorSlsTaskMapOutputWithContext(context.Context) HybridMonitorSlsTaskMapOutput
}

type HybridMonitorSlsTaskMap map[string]HybridMonitorSlsTaskInput

func (HybridMonitorSlsTaskMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HybridMonitorSlsTask)(nil)).Elem()
}

func (i HybridMonitorSlsTaskMap) ToHybridMonitorSlsTaskMapOutput() HybridMonitorSlsTaskMapOutput {
	return i.ToHybridMonitorSlsTaskMapOutputWithContext(context.Background())
}

func (i HybridMonitorSlsTaskMap) ToHybridMonitorSlsTaskMapOutputWithContext(ctx context.Context) HybridMonitorSlsTaskMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HybridMonitorSlsTaskMapOutput)
}

func (i HybridMonitorSlsTaskMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*HybridMonitorSlsTask] {
	return pulumix.Output[map[string]*HybridMonitorSlsTask]{
		OutputState: i.ToHybridMonitorSlsTaskMapOutputWithContext(ctx).OutputState,
	}
}

type HybridMonitorSlsTaskOutput struct{ *pulumi.OutputState }

func (HybridMonitorSlsTaskOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HybridMonitorSlsTask)(nil)).Elem()
}

func (o HybridMonitorSlsTaskOutput) ToHybridMonitorSlsTaskOutput() HybridMonitorSlsTaskOutput {
	return o
}

func (o HybridMonitorSlsTaskOutput) ToHybridMonitorSlsTaskOutputWithContext(ctx context.Context) HybridMonitorSlsTaskOutput {
	return o
}

func (o HybridMonitorSlsTaskOutput) ToOutput(ctx context.Context) pulumix.Output[*HybridMonitorSlsTask] {
	return pulumix.Output[*HybridMonitorSlsTask]{
		OutputState: o.OutputState,
	}
}

// The label of the monitoring task. See `attachLabels` below.
func (o HybridMonitorSlsTaskOutput) AttachLabels() HybridMonitorSlsTaskAttachLabelArrayOutput {
	return o.ApplyT(func(v *HybridMonitorSlsTask) HybridMonitorSlsTaskAttachLabelArrayOutput { return v.AttachLabels }).(HybridMonitorSlsTaskAttachLabelArrayOutput)
}

// The interval at which metrics are collected. Valid values: `15`, `60`(default value). Unit: seconds.
func (o HybridMonitorSlsTaskOutput) CollectInterval() pulumi.IntOutput {
	return o.ApplyT(func(v *HybridMonitorSlsTask) pulumi.IntOutput { return v.CollectInterval }).(pulumi.IntOutput)
}

// The type of the collection target, enter the name of the Logstore group.
func (o HybridMonitorSlsTaskOutput) CollectTargetType() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridMonitorSlsTask) pulumi.StringOutput { return v.CollectTargetType }).(pulumi.StringOutput)
}

// The description of the metric import task.
func (o HybridMonitorSlsTaskOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HybridMonitorSlsTask) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the namespace.
func (o HybridMonitorSlsTaskOutput) Namespace() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridMonitorSlsTask) pulumi.StringOutput { return v.Namespace }).(pulumi.StringOutput)
}

// The configurations of the logs that are imported from Log Service. See `slsProcessConfig` below.
func (o HybridMonitorSlsTaskOutput) SlsProcessConfig() HybridMonitorSlsTaskSlsProcessConfigOutput {
	return o.ApplyT(func(v *HybridMonitorSlsTask) HybridMonitorSlsTaskSlsProcessConfigOutput { return v.SlsProcessConfig }).(HybridMonitorSlsTaskSlsProcessConfigOutput)
}

// The name of the metric import task, enter the name of the metric for logs imported from Log Service.
func (o HybridMonitorSlsTaskOutput) TaskName() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridMonitorSlsTask) pulumi.StringOutput { return v.TaskName }).(pulumi.StringOutput)
}

type HybridMonitorSlsTaskArrayOutput struct{ *pulumi.OutputState }

func (HybridMonitorSlsTaskArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HybridMonitorSlsTask)(nil)).Elem()
}

func (o HybridMonitorSlsTaskArrayOutput) ToHybridMonitorSlsTaskArrayOutput() HybridMonitorSlsTaskArrayOutput {
	return o
}

func (o HybridMonitorSlsTaskArrayOutput) ToHybridMonitorSlsTaskArrayOutputWithContext(ctx context.Context) HybridMonitorSlsTaskArrayOutput {
	return o
}

func (o HybridMonitorSlsTaskArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*HybridMonitorSlsTask] {
	return pulumix.Output[[]*HybridMonitorSlsTask]{
		OutputState: o.OutputState,
	}
}

func (o HybridMonitorSlsTaskArrayOutput) Index(i pulumi.IntInput) HybridMonitorSlsTaskOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HybridMonitorSlsTask {
		return vs[0].([]*HybridMonitorSlsTask)[vs[1].(int)]
	}).(HybridMonitorSlsTaskOutput)
}

type HybridMonitorSlsTaskMapOutput struct{ *pulumi.OutputState }

func (HybridMonitorSlsTaskMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HybridMonitorSlsTask)(nil)).Elem()
}

func (o HybridMonitorSlsTaskMapOutput) ToHybridMonitorSlsTaskMapOutput() HybridMonitorSlsTaskMapOutput {
	return o
}

func (o HybridMonitorSlsTaskMapOutput) ToHybridMonitorSlsTaskMapOutputWithContext(ctx context.Context) HybridMonitorSlsTaskMapOutput {
	return o
}

func (o HybridMonitorSlsTaskMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*HybridMonitorSlsTask] {
	return pulumix.Output[map[string]*HybridMonitorSlsTask]{
		OutputState: o.OutputState,
	}
}

func (o HybridMonitorSlsTaskMapOutput) MapIndex(k pulumi.StringInput) HybridMonitorSlsTaskOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HybridMonitorSlsTask {
		return vs[0].(map[string]*HybridMonitorSlsTask)[vs[1].(string)]
	}).(HybridMonitorSlsTaskOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HybridMonitorSlsTaskInput)(nil)).Elem(), &HybridMonitorSlsTask{})
	pulumi.RegisterInputType(reflect.TypeOf((*HybridMonitorSlsTaskArrayInput)(nil)).Elem(), HybridMonitorSlsTaskArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HybridMonitorSlsTaskMapInput)(nil)).Elem(), HybridMonitorSlsTaskMap{})
	pulumi.RegisterOutputType(HybridMonitorSlsTaskOutput{})
	pulumi.RegisterOutputType(HybridMonitorSlsTaskArrayOutput{})
	pulumi.RegisterOutputType(HybridMonitorSlsTaskMapOutput{})
}
