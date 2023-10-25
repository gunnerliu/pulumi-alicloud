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

// Provides a Cloud Monitor Service Metric Rule Black List resource.
//
// For information about Cloud Monitor Service Metric Rule Black List and how to use it, see [What is Metric Rule Black List](https://www.alibabacloud.com/help/en/cloudmonitor/latest/describemetricruleblacklist).
//
// > **NOTE:** Available since v1.194.0.
//
// ## Import
//
// Cloud Monitor Service Metric Rule Black List can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cms/metricRuleBlackList:MetricRuleBlackList example <id>
//
// ```
type MetricRuleBlackList struct {
	pulumi.CustomResourceState

	// Cloud service classification. For example, Redis includes kvstore_standard, kvstore_sharding, and kvstore_splitrw.
	Category pulumi.StringOutput `pulumi:"category"`
	// The timestamp for creating an alert blacklist policy.Unit: milliseconds.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// The effective time range of the alert blacklist policy.
	EffectiveTime pulumi.StringPtrOutput `pulumi:"effectiveTime"`
	// The start timestamp of the alert blacklist policy.Unit: milliseconds.
	EnableEndTime pulumi.StringPtrOutput `pulumi:"enableEndTime"`
	// The end timestamp of the alert blacklist policy.Unit: milliseconds.
	EnableStartTime pulumi.StringPtrOutput `pulumi:"enableStartTime"`
	// The list of instances of cloud services specified in the alert blacklist policy.
	Instances pulumi.StringArrayOutput `pulumi:"instances"`
	// The status of the alert blacklist policy. Value:-true: enabled.-false: disabled.
	IsEnable pulumi.BoolOutput `pulumi:"isEnable"`
	// The ID of the blacklist policy.
	MetricRuleBlackListId pulumi.StringOutput `pulumi:"metricRuleBlackListId"`
	// The name of the alert blacklist policy.
	MetricRuleBlackListName pulumi.StringOutput `pulumi:"metricRuleBlackListName"`
	// Monitoring metrics in the instance. See `metrics` below.
	Metrics MetricRuleBlackListMetricArrayOutput `pulumi:"metrics"`
	// The data namespace of the cloud service.
	Namespace pulumi.StringOutput `pulumi:"namespace"`
	// The effective range of the alert blacklist policy. Value:-USER: The alert blacklist policy only takes effect in the current Alibaba cloud account.-GROUP: The alert blacklist policy takes effect in the specified application GROUP.
	ScopeType pulumi.StringOutput `pulumi:"scopeType"`
	// Application Group ID list. The format is JSON Array.> This parameter is displayed only when 'ScopeType' is 'GROUP.
	ScopeValues pulumi.StringArrayOutput `pulumi:"scopeValues"`
	// Modify the timestamp of the alert blacklist policy.Unit: milliseconds.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewMetricRuleBlackList registers a new resource with the given unique name, arguments, and options.
func NewMetricRuleBlackList(ctx *pulumi.Context,
	name string, args *MetricRuleBlackListArgs, opts ...pulumi.ResourceOption) (*MetricRuleBlackList, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Category == nil {
		return nil, errors.New("invalid value for required argument 'Category'")
	}
	if args.Instances == nil {
		return nil, errors.New("invalid value for required argument 'Instances'")
	}
	if args.MetricRuleBlackListName == nil {
		return nil, errors.New("invalid value for required argument 'MetricRuleBlackListName'")
	}
	if args.Namespace == nil {
		return nil, errors.New("invalid value for required argument 'Namespace'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MetricRuleBlackList
	err := ctx.RegisterResource("alicloud:cms/metricRuleBlackList:MetricRuleBlackList", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMetricRuleBlackList gets an existing MetricRuleBlackList resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMetricRuleBlackList(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MetricRuleBlackListState, opts ...pulumi.ResourceOption) (*MetricRuleBlackList, error) {
	var resource MetricRuleBlackList
	err := ctx.ReadResource("alicloud:cms/metricRuleBlackList:MetricRuleBlackList", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MetricRuleBlackList resources.
type metricRuleBlackListState struct {
	// Cloud service classification. For example, Redis includes kvstore_standard, kvstore_sharding, and kvstore_splitrw.
	Category *string `pulumi:"category"`
	// The timestamp for creating an alert blacklist policy.Unit: milliseconds.
	CreateTime *string `pulumi:"createTime"`
	// The effective time range of the alert blacklist policy.
	EffectiveTime *string `pulumi:"effectiveTime"`
	// The start timestamp of the alert blacklist policy.Unit: milliseconds.
	EnableEndTime *string `pulumi:"enableEndTime"`
	// The end timestamp of the alert blacklist policy.Unit: milliseconds.
	EnableStartTime *string `pulumi:"enableStartTime"`
	// The list of instances of cloud services specified in the alert blacklist policy.
	Instances []string `pulumi:"instances"`
	// The status of the alert blacklist policy. Value:-true: enabled.-false: disabled.
	IsEnable *bool `pulumi:"isEnable"`
	// The ID of the blacklist policy.
	MetricRuleBlackListId *string `pulumi:"metricRuleBlackListId"`
	// The name of the alert blacklist policy.
	MetricRuleBlackListName *string `pulumi:"metricRuleBlackListName"`
	// Monitoring metrics in the instance. See `metrics` below.
	Metrics []MetricRuleBlackListMetric `pulumi:"metrics"`
	// The data namespace of the cloud service.
	Namespace *string `pulumi:"namespace"`
	// The effective range of the alert blacklist policy. Value:-USER: The alert blacklist policy only takes effect in the current Alibaba cloud account.-GROUP: The alert blacklist policy takes effect in the specified application GROUP.
	ScopeType *string `pulumi:"scopeType"`
	// Application Group ID list. The format is JSON Array.> This parameter is displayed only when 'ScopeType' is 'GROUP.
	ScopeValues []string `pulumi:"scopeValues"`
	// Modify the timestamp of the alert blacklist policy.Unit: milliseconds.
	UpdateTime *string `pulumi:"updateTime"`
}

type MetricRuleBlackListState struct {
	// Cloud service classification. For example, Redis includes kvstore_standard, kvstore_sharding, and kvstore_splitrw.
	Category pulumi.StringPtrInput
	// The timestamp for creating an alert blacklist policy.Unit: milliseconds.
	CreateTime pulumi.StringPtrInput
	// The effective time range of the alert blacklist policy.
	EffectiveTime pulumi.StringPtrInput
	// The start timestamp of the alert blacklist policy.Unit: milliseconds.
	EnableEndTime pulumi.StringPtrInput
	// The end timestamp of the alert blacklist policy.Unit: milliseconds.
	EnableStartTime pulumi.StringPtrInput
	// The list of instances of cloud services specified in the alert blacklist policy.
	Instances pulumi.StringArrayInput
	// The status of the alert blacklist policy. Value:-true: enabled.-false: disabled.
	IsEnable pulumi.BoolPtrInput
	// The ID of the blacklist policy.
	MetricRuleBlackListId pulumi.StringPtrInput
	// The name of the alert blacklist policy.
	MetricRuleBlackListName pulumi.StringPtrInput
	// Monitoring metrics in the instance. See `metrics` below.
	Metrics MetricRuleBlackListMetricArrayInput
	// The data namespace of the cloud service.
	Namespace pulumi.StringPtrInput
	// The effective range of the alert blacklist policy. Value:-USER: The alert blacklist policy only takes effect in the current Alibaba cloud account.-GROUP: The alert blacklist policy takes effect in the specified application GROUP.
	ScopeType pulumi.StringPtrInput
	// Application Group ID list. The format is JSON Array.> This parameter is displayed only when 'ScopeType' is 'GROUP.
	ScopeValues pulumi.StringArrayInput
	// Modify the timestamp of the alert blacklist policy.Unit: milliseconds.
	UpdateTime pulumi.StringPtrInput
}

func (MetricRuleBlackListState) ElementType() reflect.Type {
	return reflect.TypeOf((*metricRuleBlackListState)(nil)).Elem()
}

type metricRuleBlackListArgs struct {
	// Cloud service classification. For example, Redis includes kvstore_standard, kvstore_sharding, and kvstore_splitrw.
	Category string `pulumi:"category"`
	// The effective time range of the alert blacklist policy.
	EffectiveTime *string `pulumi:"effectiveTime"`
	// The start timestamp of the alert blacklist policy.Unit: milliseconds.
	EnableEndTime *string `pulumi:"enableEndTime"`
	// The end timestamp of the alert blacklist policy.Unit: milliseconds.
	EnableStartTime *string `pulumi:"enableStartTime"`
	// The list of instances of cloud services specified in the alert blacklist policy.
	Instances []string `pulumi:"instances"`
	// The status of the alert blacklist policy. Value:-true: enabled.-false: disabled.
	IsEnable *bool `pulumi:"isEnable"`
	// The name of the alert blacklist policy.
	MetricRuleBlackListName string `pulumi:"metricRuleBlackListName"`
	// Monitoring metrics in the instance. See `metrics` below.
	Metrics []MetricRuleBlackListMetric `pulumi:"metrics"`
	// The data namespace of the cloud service.
	Namespace string `pulumi:"namespace"`
	// The effective range of the alert blacklist policy. Value:-USER: The alert blacklist policy only takes effect in the current Alibaba cloud account.-GROUP: The alert blacklist policy takes effect in the specified application GROUP.
	ScopeType *string `pulumi:"scopeType"`
	// Application Group ID list. The format is JSON Array.> This parameter is displayed only when 'ScopeType' is 'GROUP.
	ScopeValues []string `pulumi:"scopeValues"`
}

// The set of arguments for constructing a MetricRuleBlackList resource.
type MetricRuleBlackListArgs struct {
	// Cloud service classification. For example, Redis includes kvstore_standard, kvstore_sharding, and kvstore_splitrw.
	Category pulumi.StringInput
	// The effective time range of the alert blacklist policy.
	EffectiveTime pulumi.StringPtrInput
	// The start timestamp of the alert blacklist policy.Unit: milliseconds.
	EnableEndTime pulumi.StringPtrInput
	// The end timestamp of the alert blacklist policy.Unit: milliseconds.
	EnableStartTime pulumi.StringPtrInput
	// The list of instances of cloud services specified in the alert blacklist policy.
	Instances pulumi.StringArrayInput
	// The status of the alert blacklist policy. Value:-true: enabled.-false: disabled.
	IsEnable pulumi.BoolPtrInput
	// The name of the alert blacklist policy.
	MetricRuleBlackListName pulumi.StringInput
	// Monitoring metrics in the instance. See `metrics` below.
	Metrics MetricRuleBlackListMetricArrayInput
	// The data namespace of the cloud service.
	Namespace pulumi.StringInput
	// The effective range of the alert blacklist policy. Value:-USER: The alert blacklist policy only takes effect in the current Alibaba cloud account.-GROUP: The alert blacklist policy takes effect in the specified application GROUP.
	ScopeType pulumi.StringPtrInput
	// Application Group ID list. The format is JSON Array.> This parameter is displayed only when 'ScopeType' is 'GROUP.
	ScopeValues pulumi.StringArrayInput
}

func (MetricRuleBlackListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*metricRuleBlackListArgs)(nil)).Elem()
}

type MetricRuleBlackListInput interface {
	pulumi.Input

	ToMetricRuleBlackListOutput() MetricRuleBlackListOutput
	ToMetricRuleBlackListOutputWithContext(ctx context.Context) MetricRuleBlackListOutput
}

func (*MetricRuleBlackList) ElementType() reflect.Type {
	return reflect.TypeOf((**MetricRuleBlackList)(nil)).Elem()
}

func (i *MetricRuleBlackList) ToMetricRuleBlackListOutput() MetricRuleBlackListOutput {
	return i.ToMetricRuleBlackListOutputWithContext(context.Background())
}

func (i *MetricRuleBlackList) ToMetricRuleBlackListOutputWithContext(ctx context.Context) MetricRuleBlackListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetricRuleBlackListOutput)
}

func (i *MetricRuleBlackList) ToOutput(ctx context.Context) pulumix.Output[*MetricRuleBlackList] {
	return pulumix.Output[*MetricRuleBlackList]{
		OutputState: i.ToMetricRuleBlackListOutputWithContext(ctx).OutputState,
	}
}

// MetricRuleBlackListArrayInput is an input type that accepts MetricRuleBlackListArray and MetricRuleBlackListArrayOutput values.
// You can construct a concrete instance of `MetricRuleBlackListArrayInput` via:
//
//	MetricRuleBlackListArray{ MetricRuleBlackListArgs{...} }
type MetricRuleBlackListArrayInput interface {
	pulumi.Input

	ToMetricRuleBlackListArrayOutput() MetricRuleBlackListArrayOutput
	ToMetricRuleBlackListArrayOutputWithContext(context.Context) MetricRuleBlackListArrayOutput
}

type MetricRuleBlackListArray []MetricRuleBlackListInput

func (MetricRuleBlackListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MetricRuleBlackList)(nil)).Elem()
}

func (i MetricRuleBlackListArray) ToMetricRuleBlackListArrayOutput() MetricRuleBlackListArrayOutput {
	return i.ToMetricRuleBlackListArrayOutputWithContext(context.Background())
}

func (i MetricRuleBlackListArray) ToMetricRuleBlackListArrayOutputWithContext(ctx context.Context) MetricRuleBlackListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetricRuleBlackListArrayOutput)
}

func (i MetricRuleBlackListArray) ToOutput(ctx context.Context) pulumix.Output[[]*MetricRuleBlackList] {
	return pulumix.Output[[]*MetricRuleBlackList]{
		OutputState: i.ToMetricRuleBlackListArrayOutputWithContext(ctx).OutputState,
	}
}

// MetricRuleBlackListMapInput is an input type that accepts MetricRuleBlackListMap and MetricRuleBlackListMapOutput values.
// You can construct a concrete instance of `MetricRuleBlackListMapInput` via:
//
//	MetricRuleBlackListMap{ "key": MetricRuleBlackListArgs{...} }
type MetricRuleBlackListMapInput interface {
	pulumi.Input

	ToMetricRuleBlackListMapOutput() MetricRuleBlackListMapOutput
	ToMetricRuleBlackListMapOutputWithContext(context.Context) MetricRuleBlackListMapOutput
}

type MetricRuleBlackListMap map[string]MetricRuleBlackListInput

func (MetricRuleBlackListMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MetricRuleBlackList)(nil)).Elem()
}

func (i MetricRuleBlackListMap) ToMetricRuleBlackListMapOutput() MetricRuleBlackListMapOutput {
	return i.ToMetricRuleBlackListMapOutputWithContext(context.Background())
}

func (i MetricRuleBlackListMap) ToMetricRuleBlackListMapOutputWithContext(ctx context.Context) MetricRuleBlackListMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetricRuleBlackListMapOutput)
}

func (i MetricRuleBlackListMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*MetricRuleBlackList] {
	return pulumix.Output[map[string]*MetricRuleBlackList]{
		OutputState: i.ToMetricRuleBlackListMapOutputWithContext(ctx).OutputState,
	}
}

type MetricRuleBlackListOutput struct{ *pulumi.OutputState }

func (MetricRuleBlackListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MetricRuleBlackList)(nil)).Elem()
}

func (o MetricRuleBlackListOutput) ToMetricRuleBlackListOutput() MetricRuleBlackListOutput {
	return o
}

func (o MetricRuleBlackListOutput) ToMetricRuleBlackListOutputWithContext(ctx context.Context) MetricRuleBlackListOutput {
	return o
}

func (o MetricRuleBlackListOutput) ToOutput(ctx context.Context) pulumix.Output[*MetricRuleBlackList] {
	return pulumix.Output[*MetricRuleBlackList]{
		OutputState: o.OutputState,
	}
}

// Cloud service classification. For example, Redis includes kvstore_standard, kvstore_sharding, and kvstore_splitrw.
func (o MetricRuleBlackListOutput) Category() pulumi.StringOutput {
	return o.ApplyT(func(v *MetricRuleBlackList) pulumi.StringOutput { return v.Category }).(pulumi.StringOutput)
}

// The timestamp for creating an alert blacklist policy.Unit: milliseconds.
func (o MetricRuleBlackListOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *MetricRuleBlackList) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// The effective time range of the alert blacklist policy.
func (o MetricRuleBlackListOutput) EffectiveTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MetricRuleBlackList) pulumi.StringPtrOutput { return v.EffectiveTime }).(pulumi.StringPtrOutput)
}

// The start timestamp of the alert blacklist policy.Unit: milliseconds.
func (o MetricRuleBlackListOutput) EnableEndTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MetricRuleBlackList) pulumi.StringPtrOutput { return v.EnableEndTime }).(pulumi.StringPtrOutput)
}

// The end timestamp of the alert blacklist policy.Unit: milliseconds.
func (o MetricRuleBlackListOutput) EnableStartTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MetricRuleBlackList) pulumi.StringPtrOutput { return v.EnableStartTime }).(pulumi.StringPtrOutput)
}

// The list of instances of cloud services specified in the alert blacklist policy.
func (o MetricRuleBlackListOutput) Instances() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MetricRuleBlackList) pulumi.StringArrayOutput { return v.Instances }).(pulumi.StringArrayOutput)
}

// The status of the alert blacklist policy. Value:-true: enabled.-false: disabled.
func (o MetricRuleBlackListOutput) IsEnable() pulumi.BoolOutput {
	return o.ApplyT(func(v *MetricRuleBlackList) pulumi.BoolOutput { return v.IsEnable }).(pulumi.BoolOutput)
}

// The ID of the blacklist policy.
func (o MetricRuleBlackListOutput) MetricRuleBlackListId() pulumi.StringOutput {
	return o.ApplyT(func(v *MetricRuleBlackList) pulumi.StringOutput { return v.MetricRuleBlackListId }).(pulumi.StringOutput)
}

// The name of the alert blacklist policy.
func (o MetricRuleBlackListOutput) MetricRuleBlackListName() pulumi.StringOutput {
	return o.ApplyT(func(v *MetricRuleBlackList) pulumi.StringOutput { return v.MetricRuleBlackListName }).(pulumi.StringOutput)
}

// Monitoring metrics in the instance. See `metrics` below.
func (o MetricRuleBlackListOutput) Metrics() MetricRuleBlackListMetricArrayOutput {
	return o.ApplyT(func(v *MetricRuleBlackList) MetricRuleBlackListMetricArrayOutput { return v.Metrics }).(MetricRuleBlackListMetricArrayOutput)
}

// The data namespace of the cloud service.
func (o MetricRuleBlackListOutput) Namespace() pulumi.StringOutput {
	return o.ApplyT(func(v *MetricRuleBlackList) pulumi.StringOutput { return v.Namespace }).(pulumi.StringOutput)
}

// The effective range of the alert blacklist policy. Value:-USER: The alert blacklist policy only takes effect in the current Alibaba cloud account.-GROUP: The alert blacklist policy takes effect in the specified application GROUP.
func (o MetricRuleBlackListOutput) ScopeType() pulumi.StringOutput {
	return o.ApplyT(func(v *MetricRuleBlackList) pulumi.StringOutput { return v.ScopeType }).(pulumi.StringOutput)
}

// Application Group ID list. The format is JSON Array.> This parameter is displayed only when 'ScopeType' is 'GROUP.
func (o MetricRuleBlackListOutput) ScopeValues() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MetricRuleBlackList) pulumi.StringArrayOutput { return v.ScopeValues }).(pulumi.StringArrayOutput)
}

// Modify the timestamp of the alert blacklist policy.Unit: milliseconds.
func (o MetricRuleBlackListOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *MetricRuleBlackList) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type MetricRuleBlackListArrayOutput struct{ *pulumi.OutputState }

func (MetricRuleBlackListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MetricRuleBlackList)(nil)).Elem()
}

func (o MetricRuleBlackListArrayOutput) ToMetricRuleBlackListArrayOutput() MetricRuleBlackListArrayOutput {
	return o
}

func (o MetricRuleBlackListArrayOutput) ToMetricRuleBlackListArrayOutputWithContext(ctx context.Context) MetricRuleBlackListArrayOutput {
	return o
}

func (o MetricRuleBlackListArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*MetricRuleBlackList] {
	return pulumix.Output[[]*MetricRuleBlackList]{
		OutputState: o.OutputState,
	}
}

func (o MetricRuleBlackListArrayOutput) Index(i pulumi.IntInput) MetricRuleBlackListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MetricRuleBlackList {
		return vs[0].([]*MetricRuleBlackList)[vs[1].(int)]
	}).(MetricRuleBlackListOutput)
}

type MetricRuleBlackListMapOutput struct{ *pulumi.OutputState }

func (MetricRuleBlackListMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MetricRuleBlackList)(nil)).Elem()
}

func (o MetricRuleBlackListMapOutput) ToMetricRuleBlackListMapOutput() MetricRuleBlackListMapOutput {
	return o
}

func (o MetricRuleBlackListMapOutput) ToMetricRuleBlackListMapOutputWithContext(ctx context.Context) MetricRuleBlackListMapOutput {
	return o
}

func (o MetricRuleBlackListMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*MetricRuleBlackList] {
	return pulumix.Output[map[string]*MetricRuleBlackList]{
		OutputState: o.OutputState,
	}
}

func (o MetricRuleBlackListMapOutput) MapIndex(k pulumi.StringInput) MetricRuleBlackListOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MetricRuleBlackList {
		return vs[0].(map[string]*MetricRuleBlackList)[vs[1].(string)]
	}).(MetricRuleBlackListOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MetricRuleBlackListInput)(nil)).Elem(), &MetricRuleBlackList{})
	pulumi.RegisterInputType(reflect.TypeOf((*MetricRuleBlackListArrayInput)(nil)).Elem(), MetricRuleBlackListArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MetricRuleBlackListMapInput)(nil)).Elem(), MetricRuleBlackListMap{})
	pulumi.RegisterOutputType(MetricRuleBlackListOutput{})
	pulumi.RegisterOutputType(MetricRuleBlackListArrayOutput{})
	pulumi.RegisterOutputType(MetricRuleBlackListMapOutput{})
}
