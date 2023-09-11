// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package arms

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a ARMS Prometheus Monitoring resource. Including serviceMonitor, podMonitor, customJob, probe and other four types of monitoring.
//
// For information about ARMS Prometheus Monitoring and how to use it, see [What is Prometheus Monitoring](https://www.alibabacloud.com/help/en/arms/developer-reference/api-arms-2019-08-08-dir-managed-service-for-prometheus/).
//
// > **NOTE:** Available since v1.209.0.
//
// ## Import
//
// ARMS Prometheus Monitoring can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:arms/prometheusMonitoring:PrometheusMonitoring example <cluster_id>:<monitoring_name>:<type>
//
// ```
type PrometheusMonitoring struct {
	pulumi.CustomResourceState

	// The ID of the prometheus instance.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// Yaml configuration for monitoring.
	ConfigYaml pulumi.StringOutput `pulumi:"configYaml"`
	// The name of the resource.
	MonitoringName pulumi.StringOutput `pulumi:"monitoringName"`
	// Valid values: `stop`, `run`.
	Status pulumi.StringOutput `pulumi:"status"`
	// Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewPrometheusMonitoring registers a new resource with the given unique name, arguments, and options.
func NewPrometheusMonitoring(ctx *pulumi.Context,
	name string, args *PrometheusMonitoringArgs, opts ...pulumi.ResourceOption) (*PrometheusMonitoring, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.ConfigYaml == nil {
		return nil, errors.New("invalid value for required argument 'ConfigYaml'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PrometheusMonitoring
	err := ctx.RegisterResource("alicloud:arms/prometheusMonitoring:PrometheusMonitoring", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrometheusMonitoring gets an existing PrometheusMonitoring resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrometheusMonitoring(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrometheusMonitoringState, opts ...pulumi.ResourceOption) (*PrometheusMonitoring, error) {
	var resource PrometheusMonitoring
	err := ctx.ReadResource("alicloud:arms/prometheusMonitoring:PrometheusMonitoring", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrometheusMonitoring resources.
type prometheusMonitoringState struct {
	// The ID of the prometheus instance.
	ClusterId *string `pulumi:"clusterId"`
	// Yaml configuration for monitoring.
	ConfigYaml *string `pulumi:"configYaml"`
	// The name of the resource.
	MonitoringName *string `pulumi:"monitoringName"`
	// Valid values: `stop`, `run`.
	Status *string `pulumi:"status"`
	// Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
	Type *string `pulumi:"type"`
}

type PrometheusMonitoringState struct {
	// The ID of the prometheus instance.
	ClusterId pulumi.StringPtrInput
	// Yaml configuration for monitoring.
	ConfigYaml pulumi.StringPtrInput
	// The name of the resource.
	MonitoringName pulumi.StringPtrInput
	// Valid values: `stop`, `run`.
	Status pulumi.StringPtrInput
	// Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
	Type pulumi.StringPtrInput
}

func (PrometheusMonitoringState) ElementType() reflect.Type {
	return reflect.TypeOf((*prometheusMonitoringState)(nil)).Elem()
}

type prometheusMonitoringArgs struct {
	// The ID of the prometheus instance.
	ClusterId string `pulumi:"clusterId"`
	// Yaml configuration for monitoring.
	ConfigYaml string `pulumi:"configYaml"`
	// Valid values: `stop`, `run`.
	Status *string `pulumi:"status"`
	// Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a PrometheusMonitoring resource.
type PrometheusMonitoringArgs struct {
	// The ID of the prometheus instance.
	ClusterId pulumi.StringInput
	// Yaml configuration for monitoring.
	ConfigYaml pulumi.StringInput
	// Valid values: `stop`, `run`.
	Status pulumi.StringPtrInput
	// Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
	Type pulumi.StringInput
}

func (PrometheusMonitoringArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*prometheusMonitoringArgs)(nil)).Elem()
}

type PrometheusMonitoringInput interface {
	pulumi.Input

	ToPrometheusMonitoringOutput() PrometheusMonitoringOutput
	ToPrometheusMonitoringOutputWithContext(ctx context.Context) PrometheusMonitoringOutput
}

func (*PrometheusMonitoring) ElementType() reflect.Type {
	return reflect.TypeOf((**PrometheusMonitoring)(nil)).Elem()
}

func (i *PrometheusMonitoring) ToPrometheusMonitoringOutput() PrometheusMonitoringOutput {
	return i.ToPrometheusMonitoringOutputWithContext(context.Background())
}

func (i *PrometheusMonitoring) ToPrometheusMonitoringOutputWithContext(ctx context.Context) PrometheusMonitoringOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrometheusMonitoringOutput)
}

func (i *PrometheusMonitoring) ToOutput(ctx context.Context) pulumix.Output[*PrometheusMonitoring] {
	return pulumix.Output[*PrometheusMonitoring]{
		OutputState: i.ToPrometheusMonitoringOutputWithContext(ctx).OutputState,
	}
}

// PrometheusMonitoringArrayInput is an input type that accepts PrometheusMonitoringArray and PrometheusMonitoringArrayOutput values.
// You can construct a concrete instance of `PrometheusMonitoringArrayInput` via:
//
//	PrometheusMonitoringArray{ PrometheusMonitoringArgs{...} }
type PrometheusMonitoringArrayInput interface {
	pulumi.Input

	ToPrometheusMonitoringArrayOutput() PrometheusMonitoringArrayOutput
	ToPrometheusMonitoringArrayOutputWithContext(context.Context) PrometheusMonitoringArrayOutput
}

type PrometheusMonitoringArray []PrometheusMonitoringInput

func (PrometheusMonitoringArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrometheusMonitoring)(nil)).Elem()
}

func (i PrometheusMonitoringArray) ToPrometheusMonitoringArrayOutput() PrometheusMonitoringArrayOutput {
	return i.ToPrometheusMonitoringArrayOutputWithContext(context.Background())
}

func (i PrometheusMonitoringArray) ToPrometheusMonitoringArrayOutputWithContext(ctx context.Context) PrometheusMonitoringArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrometheusMonitoringArrayOutput)
}

func (i PrometheusMonitoringArray) ToOutput(ctx context.Context) pulumix.Output[[]*PrometheusMonitoring] {
	return pulumix.Output[[]*PrometheusMonitoring]{
		OutputState: i.ToPrometheusMonitoringArrayOutputWithContext(ctx).OutputState,
	}
}

// PrometheusMonitoringMapInput is an input type that accepts PrometheusMonitoringMap and PrometheusMonitoringMapOutput values.
// You can construct a concrete instance of `PrometheusMonitoringMapInput` via:
//
//	PrometheusMonitoringMap{ "key": PrometheusMonitoringArgs{...} }
type PrometheusMonitoringMapInput interface {
	pulumi.Input

	ToPrometheusMonitoringMapOutput() PrometheusMonitoringMapOutput
	ToPrometheusMonitoringMapOutputWithContext(context.Context) PrometheusMonitoringMapOutput
}

type PrometheusMonitoringMap map[string]PrometheusMonitoringInput

func (PrometheusMonitoringMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrometheusMonitoring)(nil)).Elem()
}

func (i PrometheusMonitoringMap) ToPrometheusMonitoringMapOutput() PrometheusMonitoringMapOutput {
	return i.ToPrometheusMonitoringMapOutputWithContext(context.Background())
}

func (i PrometheusMonitoringMap) ToPrometheusMonitoringMapOutputWithContext(ctx context.Context) PrometheusMonitoringMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrometheusMonitoringMapOutput)
}

func (i PrometheusMonitoringMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*PrometheusMonitoring] {
	return pulumix.Output[map[string]*PrometheusMonitoring]{
		OutputState: i.ToPrometheusMonitoringMapOutputWithContext(ctx).OutputState,
	}
}

type PrometheusMonitoringOutput struct{ *pulumi.OutputState }

func (PrometheusMonitoringOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PrometheusMonitoring)(nil)).Elem()
}

func (o PrometheusMonitoringOutput) ToPrometheusMonitoringOutput() PrometheusMonitoringOutput {
	return o
}

func (o PrometheusMonitoringOutput) ToPrometheusMonitoringOutputWithContext(ctx context.Context) PrometheusMonitoringOutput {
	return o
}

func (o PrometheusMonitoringOutput) ToOutput(ctx context.Context) pulumix.Output[*PrometheusMonitoring] {
	return pulumix.Output[*PrometheusMonitoring]{
		OutputState: o.OutputState,
	}
}

// The ID of the prometheus instance.
func (o PrometheusMonitoringOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *PrometheusMonitoring) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

// Yaml configuration for monitoring.
func (o PrometheusMonitoringOutput) ConfigYaml() pulumi.StringOutput {
	return o.ApplyT(func(v *PrometheusMonitoring) pulumi.StringOutput { return v.ConfigYaml }).(pulumi.StringOutput)
}

// The name of the resource.
func (o PrometheusMonitoringOutput) MonitoringName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrometheusMonitoring) pulumi.StringOutput { return v.MonitoringName }).(pulumi.StringOutput)
}

// Valid values: `stop`, `run`.
func (o PrometheusMonitoringOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *PrometheusMonitoring) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
func (o PrometheusMonitoringOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *PrometheusMonitoring) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type PrometheusMonitoringArrayOutput struct{ *pulumi.OutputState }

func (PrometheusMonitoringArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrometheusMonitoring)(nil)).Elem()
}

func (o PrometheusMonitoringArrayOutput) ToPrometheusMonitoringArrayOutput() PrometheusMonitoringArrayOutput {
	return o
}

func (o PrometheusMonitoringArrayOutput) ToPrometheusMonitoringArrayOutputWithContext(ctx context.Context) PrometheusMonitoringArrayOutput {
	return o
}

func (o PrometheusMonitoringArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*PrometheusMonitoring] {
	return pulumix.Output[[]*PrometheusMonitoring]{
		OutputState: o.OutputState,
	}
}

func (o PrometheusMonitoringArrayOutput) Index(i pulumi.IntInput) PrometheusMonitoringOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PrometheusMonitoring {
		return vs[0].([]*PrometheusMonitoring)[vs[1].(int)]
	}).(PrometheusMonitoringOutput)
}

type PrometheusMonitoringMapOutput struct{ *pulumi.OutputState }

func (PrometheusMonitoringMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrometheusMonitoring)(nil)).Elem()
}

func (o PrometheusMonitoringMapOutput) ToPrometheusMonitoringMapOutput() PrometheusMonitoringMapOutput {
	return o
}

func (o PrometheusMonitoringMapOutput) ToPrometheusMonitoringMapOutputWithContext(ctx context.Context) PrometheusMonitoringMapOutput {
	return o
}

func (o PrometheusMonitoringMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*PrometheusMonitoring] {
	return pulumix.Output[map[string]*PrometheusMonitoring]{
		OutputState: o.OutputState,
	}
}

func (o PrometheusMonitoringMapOutput) MapIndex(k pulumi.StringInput) PrometheusMonitoringOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PrometheusMonitoring {
		return vs[0].(map[string]*PrometheusMonitoring)[vs[1].(string)]
	}).(PrometheusMonitoringOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PrometheusMonitoringInput)(nil)).Elem(), &PrometheusMonitoring{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrometheusMonitoringArrayInput)(nil)).Elem(), PrometheusMonitoringArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrometheusMonitoringMapInput)(nil)).Elem(), PrometheusMonitoringMap{})
	pulumi.RegisterOutputType(PrometheusMonitoringOutput{})
	pulumi.RegisterOutputType(PrometheusMonitoringArrayOutput{})
	pulumi.RegisterOutputType(PrometheusMonitoringMapOutput{})
}
