// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package arms

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ARMS Env Service Monitor resource. ServiceMonitor for the arms environment.
//
// For information about ARMS Env Service Monitor and how to use it, see [What is Env Service Monitor](https://www.alibabacloud.com/help/en/arms/developer-reference/api-arms-2019-08-08-createenvservicemonitor).
//
// > **NOTE:** Available since v1.212.0.
//
// ## Import
//
// ARMS Env Service Monitor can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:arms/envServiceMonitor:EnvServiceMonitor example <environment_id>:<namespace>:<env_service_monitor_name>
//
// ```
type EnvServiceMonitor struct {
	pulumi.CustomResourceState

	// Language environment, default is Chinese zh | en.
	AliyunLang pulumi.StringPtrOutput `pulumi:"aliyunLang"`
	// Yaml configuration string.
	ConfigYaml pulumi.StringOutput `pulumi:"configYaml"`
	// The name of the resource.
	EnvServiceMonitorName pulumi.StringOutput `pulumi:"envServiceMonitorName"`
	// Environment id.
	EnvironmentId pulumi.StringOutput `pulumi:"environmentId"`
	// The namespace where the resource is located.
	Namespace pulumi.StringOutput `pulumi:"namespace"`
	// Status: run, stop.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewEnvServiceMonitor registers a new resource with the given unique name, arguments, and options.
func NewEnvServiceMonitor(ctx *pulumi.Context,
	name string, args *EnvServiceMonitorArgs, opts ...pulumi.ResourceOption) (*EnvServiceMonitor, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigYaml == nil {
		return nil, errors.New("invalid value for required argument 'ConfigYaml'")
	}
	if args.EnvironmentId == nil {
		return nil, errors.New("invalid value for required argument 'EnvironmentId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EnvServiceMonitor
	err := ctx.RegisterResource("alicloud:arms/envServiceMonitor:EnvServiceMonitor", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEnvServiceMonitor gets an existing EnvServiceMonitor resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEnvServiceMonitor(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EnvServiceMonitorState, opts ...pulumi.ResourceOption) (*EnvServiceMonitor, error) {
	var resource EnvServiceMonitor
	err := ctx.ReadResource("alicloud:arms/envServiceMonitor:EnvServiceMonitor", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EnvServiceMonitor resources.
type envServiceMonitorState struct {
	// Language environment, default is Chinese zh | en.
	AliyunLang *string `pulumi:"aliyunLang"`
	// Yaml configuration string.
	ConfigYaml *string `pulumi:"configYaml"`
	// The name of the resource.
	EnvServiceMonitorName *string `pulumi:"envServiceMonitorName"`
	// Environment id.
	EnvironmentId *string `pulumi:"environmentId"`
	// The namespace where the resource is located.
	Namespace *string `pulumi:"namespace"`
	// Status: run, stop.
	Status *string `pulumi:"status"`
}

type EnvServiceMonitorState struct {
	// Language environment, default is Chinese zh | en.
	AliyunLang pulumi.StringPtrInput
	// Yaml configuration string.
	ConfigYaml pulumi.StringPtrInput
	// The name of the resource.
	EnvServiceMonitorName pulumi.StringPtrInput
	// Environment id.
	EnvironmentId pulumi.StringPtrInput
	// The namespace where the resource is located.
	Namespace pulumi.StringPtrInput
	// Status: run, stop.
	Status pulumi.StringPtrInput
}

func (EnvServiceMonitorState) ElementType() reflect.Type {
	return reflect.TypeOf((*envServiceMonitorState)(nil)).Elem()
}

type envServiceMonitorArgs struct {
	// Language environment, default is Chinese zh | en.
	AliyunLang *string `pulumi:"aliyunLang"`
	// Yaml configuration string.
	ConfigYaml string `pulumi:"configYaml"`
	// Environment id.
	EnvironmentId string `pulumi:"environmentId"`
}

// The set of arguments for constructing a EnvServiceMonitor resource.
type EnvServiceMonitorArgs struct {
	// Language environment, default is Chinese zh | en.
	AliyunLang pulumi.StringPtrInput
	// Yaml configuration string.
	ConfigYaml pulumi.StringInput
	// Environment id.
	EnvironmentId pulumi.StringInput
}

func (EnvServiceMonitorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*envServiceMonitorArgs)(nil)).Elem()
}

type EnvServiceMonitorInput interface {
	pulumi.Input

	ToEnvServiceMonitorOutput() EnvServiceMonitorOutput
	ToEnvServiceMonitorOutputWithContext(ctx context.Context) EnvServiceMonitorOutput
}

func (*EnvServiceMonitor) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvServiceMonitor)(nil)).Elem()
}

func (i *EnvServiceMonitor) ToEnvServiceMonitorOutput() EnvServiceMonitorOutput {
	return i.ToEnvServiceMonitorOutputWithContext(context.Background())
}

func (i *EnvServiceMonitor) ToEnvServiceMonitorOutputWithContext(ctx context.Context) EnvServiceMonitorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvServiceMonitorOutput)
}

// EnvServiceMonitorArrayInput is an input type that accepts EnvServiceMonitorArray and EnvServiceMonitorArrayOutput values.
// You can construct a concrete instance of `EnvServiceMonitorArrayInput` via:
//
//	EnvServiceMonitorArray{ EnvServiceMonitorArgs{...} }
type EnvServiceMonitorArrayInput interface {
	pulumi.Input

	ToEnvServiceMonitorArrayOutput() EnvServiceMonitorArrayOutput
	ToEnvServiceMonitorArrayOutputWithContext(context.Context) EnvServiceMonitorArrayOutput
}

type EnvServiceMonitorArray []EnvServiceMonitorInput

func (EnvServiceMonitorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnvServiceMonitor)(nil)).Elem()
}

func (i EnvServiceMonitorArray) ToEnvServiceMonitorArrayOutput() EnvServiceMonitorArrayOutput {
	return i.ToEnvServiceMonitorArrayOutputWithContext(context.Background())
}

func (i EnvServiceMonitorArray) ToEnvServiceMonitorArrayOutputWithContext(ctx context.Context) EnvServiceMonitorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvServiceMonitorArrayOutput)
}

// EnvServiceMonitorMapInput is an input type that accepts EnvServiceMonitorMap and EnvServiceMonitorMapOutput values.
// You can construct a concrete instance of `EnvServiceMonitorMapInput` via:
//
//	EnvServiceMonitorMap{ "key": EnvServiceMonitorArgs{...} }
type EnvServiceMonitorMapInput interface {
	pulumi.Input

	ToEnvServiceMonitorMapOutput() EnvServiceMonitorMapOutput
	ToEnvServiceMonitorMapOutputWithContext(context.Context) EnvServiceMonitorMapOutput
}

type EnvServiceMonitorMap map[string]EnvServiceMonitorInput

func (EnvServiceMonitorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnvServiceMonitor)(nil)).Elem()
}

func (i EnvServiceMonitorMap) ToEnvServiceMonitorMapOutput() EnvServiceMonitorMapOutput {
	return i.ToEnvServiceMonitorMapOutputWithContext(context.Background())
}

func (i EnvServiceMonitorMap) ToEnvServiceMonitorMapOutputWithContext(ctx context.Context) EnvServiceMonitorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvServiceMonitorMapOutput)
}

type EnvServiceMonitorOutput struct{ *pulumi.OutputState }

func (EnvServiceMonitorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvServiceMonitor)(nil)).Elem()
}

func (o EnvServiceMonitorOutput) ToEnvServiceMonitorOutput() EnvServiceMonitorOutput {
	return o
}

func (o EnvServiceMonitorOutput) ToEnvServiceMonitorOutputWithContext(ctx context.Context) EnvServiceMonitorOutput {
	return o
}

// Language environment, default is Chinese zh | en.
func (o EnvServiceMonitorOutput) AliyunLang() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnvServiceMonitor) pulumi.StringPtrOutput { return v.AliyunLang }).(pulumi.StringPtrOutput)
}

// Yaml configuration string.
func (o EnvServiceMonitorOutput) ConfigYaml() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvServiceMonitor) pulumi.StringOutput { return v.ConfigYaml }).(pulumi.StringOutput)
}

// The name of the resource.
func (o EnvServiceMonitorOutput) EnvServiceMonitorName() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvServiceMonitor) pulumi.StringOutput { return v.EnvServiceMonitorName }).(pulumi.StringOutput)
}

// Environment id.
func (o EnvServiceMonitorOutput) EnvironmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvServiceMonitor) pulumi.StringOutput { return v.EnvironmentId }).(pulumi.StringOutput)
}

// The namespace where the resource is located.
func (o EnvServiceMonitorOutput) Namespace() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvServiceMonitor) pulumi.StringOutput { return v.Namespace }).(pulumi.StringOutput)
}

// Status: run, stop.
func (o EnvServiceMonitorOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvServiceMonitor) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type EnvServiceMonitorArrayOutput struct{ *pulumi.OutputState }

func (EnvServiceMonitorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnvServiceMonitor)(nil)).Elem()
}

func (o EnvServiceMonitorArrayOutput) ToEnvServiceMonitorArrayOutput() EnvServiceMonitorArrayOutput {
	return o
}

func (o EnvServiceMonitorArrayOutput) ToEnvServiceMonitorArrayOutputWithContext(ctx context.Context) EnvServiceMonitorArrayOutput {
	return o
}

func (o EnvServiceMonitorArrayOutput) Index(i pulumi.IntInput) EnvServiceMonitorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EnvServiceMonitor {
		return vs[0].([]*EnvServiceMonitor)[vs[1].(int)]
	}).(EnvServiceMonitorOutput)
}

type EnvServiceMonitorMapOutput struct{ *pulumi.OutputState }

func (EnvServiceMonitorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnvServiceMonitor)(nil)).Elem()
}

func (o EnvServiceMonitorMapOutput) ToEnvServiceMonitorMapOutput() EnvServiceMonitorMapOutput {
	return o
}

func (o EnvServiceMonitorMapOutput) ToEnvServiceMonitorMapOutputWithContext(ctx context.Context) EnvServiceMonitorMapOutput {
	return o
}

func (o EnvServiceMonitorMapOutput) MapIndex(k pulumi.StringInput) EnvServiceMonitorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EnvServiceMonitor {
		return vs[0].(map[string]*EnvServiceMonitor)[vs[1].(string)]
	}).(EnvServiceMonitorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EnvServiceMonitorInput)(nil)).Elem(), &EnvServiceMonitor{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvServiceMonitorArrayInput)(nil)).Elem(), EnvServiceMonitorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvServiceMonitorMapInput)(nil)).Elem(), EnvServiceMonitorMap{})
	pulumi.RegisterOutputType(EnvServiceMonitorOutput{})
	pulumi.RegisterOutputType(EnvServiceMonitorArrayOutput{})
	pulumi.RegisterOutputType(EnvServiceMonitorMapOutput{})
}
