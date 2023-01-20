// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apigateway

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Api Gateway Log Config resource.
//
// For information about Api Gateway Log Config and how to use it, see [What is Log Config](https://help.aliyun.com/document_detail/400392.html).
//
// > **NOTE:** Available in v1.185.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/apigateway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := apigateway.NewLogConfig(ctx, "default", &apigateway.LogConfigArgs{
//				LogType:     pulumi.String("PROVIDER"),
//				SlsLogStore: pulumi.String("example_value"),
//				SlsProject:  pulumi.String("example_value"),
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
// Api Gateway Log Config can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:apigateway/logConfig:LogConfig example <log_type>
//
// ```
type LogConfig struct {
	pulumi.CustomResourceState

	// The type the of log. Valid values: `PROVIDER`.
	LogType pulumi.StringOutput `pulumi:"logType"`
	// The name of the Log Store.
	SlsLogStore pulumi.StringOutput `pulumi:"slsLogStore"`
	// The name of the Project.
	SlsProject pulumi.StringOutput `pulumi:"slsProject"`
}

// NewLogConfig registers a new resource with the given unique name, arguments, and options.
func NewLogConfig(ctx *pulumi.Context,
	name string, args *LogConfigArgs, opts ...pulumi.ResourceOption) (*LogConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LogType == nil {
		return nil, errors.New("invalid value for required argument 'LogType'")
	}
	if args.SlsLogStore == nil {
		return nil, errors.New("invalid value for required argument 'SlsLogStore'")
	}
	if args.SlsProject == nil {
		return nil, errors.New("invalid value for required argument 'SlsProject'")
	}
	var resource LogConfig
	err := ctx.RegisterResource("alicloud:apigateway/logConfig:LogConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogConfig gets an existing LogConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogConfigState, opts ...pulumi.ResourceOption) (*LogConfig, error) {
	var resource LogConfig
	err := ctx.ReadResource("alicloud:apigateway/logConfig:LogConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogConfig resources.
type logConfigState struct {
	// The type the of log. Valid values: `PROVIDER`.
	LogType *string `pulumi:"logType"`
	// The name of the Log Store.
	SlsLogStore *string `pulumi:"slsLogStore"`
	// The name of the Project.
	SlsProject *string `pulumi:"slsProject"`
}

type LogConfigState struct {
	// The type the of log. Valid values: `PROVIDER`.
	LogType pulumi.StringPtrInput
	// The name of the Log Store.
	SlsLogStore pulumi.StringPtrInput
	// The name of the Project.
	SlsProject pulumi.StringPtrInput
}

func (LogConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*logConfigState)(nil)).Elem()
}

type logConfigArgs struct {
	// The type the of log. Valid values: `PROVIDER`.
	LogType string `pulumi:"logType"`
	// The name of the Log Store.
	SlsLogStore string `pulumi:"slsLogStore"`
	// The name of the Project.
	SlsProject string `pulumi:"slsProject"`
}

// The set of arguments for constructing a LogConfig resource.
type LogConfigArgs struct {
	// The type the of log. Valid values: `PROVIDER`.
	LogType pulumi.StringInput
	// The name of the Log Store.
	SlsLogStore pulumi.StringInput
	// The name of the Project.
	SlsProject pulumi.StringInput
}

func (LogConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logConfigArgs)(nil)).Elem()
}

type LogConfigInput interface {
	pulumi.Input

	ToLogConfigOutput() LogConfigOutput
	ToLogConfigOutputWithContext(ctx context.Context) LogConfigOutput
}

func (*LogConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**LogConfig)(nil)).Elem()
}

func (i *LogConfig) ToLogConfigOutput() LogConfigOutput {
	return i.ToLogConfigOutputWithContext(context.Background())
}

func (i *LogConfig) ToLogConfigOutputWithContext(ctx context.Context) LogConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogConfigOutput)
}

// LogConfigArrayInput is an input type that accepts LogConfigArray and LogConfigArrayOutput values.
// You can construct a concrete instance of `LogConfigArrayInput` via:
//
//	LogConfigArray{ LogConfigArgs{...} }
type LogConfigArrayInput interface {
	pulumi.Input

	ToLogConfigArrayOutput() LogConfigArrayOutput
	ToLogConfigArrayOutputWithContext(context.Context) LogConfigArrayOutput
}

type LogConfigArray []LogConfigInput

func (LogConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogConfig)(nil)).Elem()
}

func (i LogConfigArray) ToLogConfigArrayOutput() LogConfigArrayOutput {
	return i.ToLogConfigArrayOutputWithContext(context.Background())
}

func (i LogConfigArray) ToLogConfigArrayOutputWithContext(ctx context.Context) LogConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogConfigArrayOutput)
}

// LogConfigMapInput is an input type that accepts LogConfigMap and LogConfigMapOutput values.
// You can construct a concrete instance of `LogConfigMapInput` via:
//
//	LogConfigMap{ "key": LogConfigArgs{...} }
type LogConfigMapInput interface {
	pulumi.Input

	ToLogConfigMapOutput() LogConfigMapOutput
	ToLogConfigMapOutputWithContext(context.Context) LogConfigMapOutput
}

type LogConfigMap map[string]LogConfigInput

func (LogConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogConfig)(nil)).Elem()
}

func (i LogConfigMap) ToLogConfigMapOutput() LogConfigMapOutput {
	return i.ToLogConfigMapOutputWithContext(context.Background())
}

func (i LogConfigMap) ToLogConfigMapOutputWithContext(ctx context.Context) LogConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogConfigMapOutput)
}

type LogConfigOutput struct{ *pulumi.OutputState }

func (LogConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogConfig)(nil)).Elem()
}

func (o LogConfigOutput) ToLogConfigOutput() LogConfigOutput {
	return o
}

func (o LogConfigOutput) ToLogConfigOutputWithContext(ctx context.Context) LogConfigOutput {
	return o
}

// The type the of log. Valid values: `PROVIDER`.
func (o LogConfigOutput) LogType() pulumi.StringOutput {
	return o.ApplyT(func(v *LogConfig) pulumi.StringOutput { return v.LogType }).(pulumi.StringOutput)
}

// The name of the Log Store.
func (o LogConfigOutput) SlsLogStore() pulumi.StringOutput {
	return o.ApplyT(func(v *LogConfig) pulumi.StringOutput { return v.SlsLogStore }).(pulumi.StringOutput)
}

// The name of the Project.
func (o LogConfigOutput) SlsProject() pulumi.StringOutput {
	return o.ApplyT(func(v *LogConfig) pulumi.StringOutput { return v.SlsProject }).(pulumi.StringOutput)
}

type LogConfigArrayOutput struct{ *pulumi.OutputState }

func (LogConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogConfig)(nil)).Elem()
}

func (o LogConfigArrayOutput) ToLogConfigArrayOutput() LogConfigArrayOutput {
	return o
}

func (o LogConfigArrayOutput) ToLogConfigArrayOutputWithContext(ctx context.Context) LogConfigArrayOutput {
	return o
}

func (o LogConfigArrayOutput) Index(i pulumi.IntInput) LogConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogConfig {
		return vs[0].([]*LogConfig)[vs[1].(int)]
	}).(LogConfigOutput)
}

type LogConfigMapOutput struct{ *pulumi.OutputState }

func (LogConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogConfig)(nil)).Elem()
}

func (o LogConfigMapOutput) ToLogConfigMapOutput() LogConfigMapOutput {
	return o
}

func (o LogConfigMapOutput) ToLogConfigMapOutputWithContext(ctx context.Context) LogConfigMapOutput {
	return o
}

func (o LogConfigMapOutput) MapIndex(k pulumi.StringInput) LogConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogConfig {
		return vs[0].(map[string]*LogConfig)[vs[1].(string)]
	}).(LogConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogConfigInput)(nil)).Elem(), &LogConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogConfigArrayInput)(nil)).Elem(), LogConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogConfigMapInput)(nil)).Elem(), LogConfigMap{})
	pulumi.RegisterOutputType(LogConfigOutput{})
	pulumi.RegisterOutputType(LogConfigArrayOutput{})
	pulumi.RegisterOutputType(LogConfigMapOutput{})
}
