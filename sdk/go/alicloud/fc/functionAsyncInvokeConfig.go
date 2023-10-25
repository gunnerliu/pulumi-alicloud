// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fc

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

//	Manages an asynchronous invocation configuration for a FC Function or Alias.\
//	 For the detailed information, please refer to the [developer guide](https://www.alibabacloud.com/help/en/fc/developer-reference/api-fc-open-2021-04-06-putfunctionasyncinvokeconfig).
//
// > **NOTE:** Available since v1.100.0.
//
// ## Example Usage
//
// ## Import
//
// Function Compute Function Async Invoke Configs can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:fc/functionAsyncInvokeConfig:FunctionAsyncInvokeConfig example my_function
//
// ```
type FunctionAsyncInvokeConfig struct {
	pulumi.CustomResourceState

	// The date this resource was created.
	CreatedTime pulumi.StringOutput `pulumi:"createdTime"`
	// Configuration block with destination configuration. See `destinationConfig` below.
	DestinationConfig FunctionAsyncInvokeConfigDestinationConfigPtrOutput `pulumi:"destinationConfig"`
	// Name of the Function Compute Function.
	FunctionName pulumi.StringOutput `pulumi:"functionName"`
	// The date this resource was last modified.
	LastModifiedTime pulumi.StringOutput `pulumi:"lastModifiedTime"`
	// Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 1 and 2592000 (between 60 and 21600 before v1.167.0).
	MaximumEventAgeInSeconds pulumi.IntPtrOutput `pulumi:"maximumEventAgeInSeconds"`
	// Maximum number of times to retry when the function returns an error. Valid values between 0 and 8 (between 0 and 2 before v1.167.0). Defaults to 2.
	MaximumRetryAttempts pulumi.IntPtrOutput `pulumi:"maximumRetryAttempts"`
	// Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
	Qualifier pulumi.StringPtrOutput `pulumi:"qualifier"`
	// Name of the Function Compute Function, omitting any version or alias qualifier.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// Function Compute async job configuration(also known as Task Mode). valid values true or false, default `false`
	StatefulInvocation pulumi.BoolPtrOutput `pulumi:"statefulInvocation"`
}

// NewFunctionAsyncInvokeConfig registers a new resource with the given unique name, arguments, and options.
func NewFunctionAsyncInvokeConfig(ctx *pulumi.Context,
	name string, args *FunctionAsyncInvokeConfigArgs, opts ...pulumi.ResourceOption) (*FunctionAsyncInvokeConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FunctionName == nil {
		return nil, errors.New("invalid value for required argument 'FunctionName'")
	}
	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FunctionAsyncInvokeConfig
	err := ctx.RegisterResource("alicloud:fc/functionAsyncInvokeConfig:FunctionAsyncInvokeConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFunctionAsyncInvokeConfig gets an existing FunctionAsyncInvokeConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFunctionAsyncInvokeConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FunctionAsyncInvokeConfigState, opts ...pulumi.ResourceOption) (*FunctionAsyncInvokeConfig, error) {
	var resource FunctionAsyncInvokeConfig
	err := ctx.ReadResource("alicloud:fc/functionAsyncInvokeConfig:FunctionAsyncInvokeConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FunctionAsyncInvokeConfig resources.
type functionAsyncInvokeConfigState struct {
	// The date this resource was created.
	CreatedTime *string `pulumi:"createdTime"`
	// Configuration block with destination configuration. See `destinationConfig` below.
	DestinationConfig *FunctionAsyncInvokeConfigDestinationConfig `pulumi:"destinationConfig"`
	// Name of the Function Compute Function.
	FunctionName *string `pulumi:"functionName"`
	// The date this resource was last modified.
	LastModifiedTime *string `pulumi:"lastModifiedTime"`
	// Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 1 and 2592000 (between 60 and 21600 before v1.167.0).
	MaximumEventAgeInSeconds *int `pulumi:"maximumEventAgeInSeconds"`
	// Maximum number of times to retry when the function returns an error. Valid values between 0 and 8 (between 0 and 2 before v1.167.0). Defaults to 2.
	MaximumRetryAttempts *int `pulumi:"maximumRetryAttempts"`
	// Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
	Qualifier *string `pulumi:"qualifier"`
	// Name of the Function Compute Function, omitting any version or alias qualifier.
	ServiceName *string `pulumi:"serviceName"`
	// Function Compute async job configuration(also known as Task Mode). valid values true or false, default `false`
	StatefulInvocation *bool `pulumi:"statefulInvocation"`
}

type FunctionAsyncInvokeConfigState struct {
	// The date this resource was created.
	CreatedTime pulumi.StringPtrInput
	// Configuration block with destination configuration. See `destinationConfig` below.
	DestinationConfig FunctionAsyncInvokeConfigDestinationConfigPtrInput
	// Name of the Function Compute Function.
	FunctionName pulumi.StringPtrInput
	// The date this resource was last modified.
	LastModifiedTime pulumi.StringPtrInput
	// Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 1 and 2592000 (between 60 and 21600 before v1.167.0).
	MaximumEventAgeInSeconds pulumi.IntPtrInput
	// Maximum number of times to retry when the function returns an error. Valid values between 0 and 8 (between 0 and 2 before v1.167.0). Defaults to 2.
	MaximumRetryAttempts pulumi.IntPtrInput
	// Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
	Qualifier pulumi.StringPtrInput
	// Name of the Function Compute Function, omitting any version or alias qualifier.
	ServiceName pulumi.StringPtrInput
	// Function Compute async job configuration(also known as Task Mode). valid values true or false, default `false`
	StatefulInvocation pulumi.BoolPtrInput
}

func (FunctionAsyncInvokeConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*functionAsyncInvokeConfigState)(nil)).Elem()
}

type functionAsyncInvokeConfigArgs struct {
	// Configuration block with destination configuration. See `destinationConfig` below.
	DestinationConfig *FunctionAsyncInvokeConfigDestinationConfig `pulumi:"destinationConfig"`
	// Name of the Function Compute Function.
	FunctionName string `pulumi:"functionName"`
	// Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 1 and 2592000 (between 60 and 21600 before v1.167.0).
	MaximumEventAgeInSeconds *int `pulumi:"maximumEventAgeInSeconds"`
	// Maximum number of times to retry when the function returns an error. Valid values between 0 and 8 (between 0 and 2 before v1.167.0). Defaults to 2.
	MaximumRetryAttempts *int `pulumi:"maximumRetryAttempts"`
	// Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
	Qualifier *string `pulumi:"qualifier"`
	// Name of the Function Compute Function, omitting any version or alias qualifier.
	ServiceName string `pulumi:"serviceName"`
	// Function Compute async job configuration(also known as Task Mode). valid values true or false, default `false`
	StatefulInvocation *bool `pulumi:"statefulInvocation"`
}

// The set of arguments for constructing a FunctionAsyncInvokeConfig resource.
type FunctionAsyncInvokeConfigArgs struct {
	// Configuration block with destination configuration. See `destinationConfig` below.
	DestinationConfig FunctionAsyncInvokeConfigDestinationConfigPtrInput
	// Name of the Function Compute Function.
	FunctionName pulumi.StringInput
	// Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 1 and 2592000 (between 60 and 21600 before v1.167.0).
	MaximumEventAgeInSeconds pulumi.IntPtrInput
	// Maximum number of times to retry when the function returns an error. Valid values between 0 and 8 (between 0 and 2 before v1.167.0). Defaults to 2.
	MaximumRetryAttempts pulumi.IntPtrInput
	// Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
	Qualifier pulumi.StringPtrInput
	// Name of the Function Compute Function, omitting any version or alias qualifier.
	ServiceName pulumi.StringInput
	// Function Compute async job configuration(also known as Task Mode). valid values true or false, default `false`
	StatefulInvocation pulumi.BoolPtrInput
}

func (FunctionAsyncInvokeConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*functionAsyncInvokeConfigArgs)(nil)).Elem()
}

type FunctionAsyncInvokeConfigInput interface {
	pulumi.Input

	ToFunctionAsyncInvokeConfigOutput() FunctionAsyncInvokeConfigOutput
	ToFunctionAsyncInvokeConfigOutputWithContext(ctx context.Context) FunctionAsyncInvokeConfigOutput
}

func (*FunctionAsyncInvokeConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**FunctionAsyncInvokeConfig)(nil)).Elem()
}

func (i *FunctionAsyncInvokeConfig) ToFunctionAsyncInvokeConfigOutput() FunctionAsyncInvokeConfigOutput {
	return i.ToFunctionAsyncInvokeConfigOutputWithContext(context.Background())
}

func (i *FunctionAsyncInvokeConfig) ToFunctionAsyncInvokeConfigOutputWithContext(ctx context.Context) FunctionAsyncInvokeConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionAsyncInvokeConfigOutput)
}

func (i *FunctionAsyncInvokeConfig) ToOutput(ctx context.Context) pulumix.Output[*FunctionAsyncInvokeConfig] {
	return pulumix.Output[*FunctionAsyncInvokeConfig]{
		OutputState: i.ToFunctionAsyncInvokeConfigOutputWithContext(ctx).OutputState,
	}
}

// FunctionAsyncInvokeConfigArrayInput is an input type that accepts FunctionAsyncInvokeConfigArray and FunctionAsyncInvokeConfigArrayOutput values.
// You can construct a concrete instance of `FunctionAsyncInvokeConfigArrayInput` via:
//
//	FunctionAsyncInvokeConfigArray{ FunctionAsyncInvokeConfigArgs{...} }
type FunctionAsyncInvokeConfigArrayInput interface {
	pulumi.Input

	ToFunctionAsyncInvokeConfigArrayOutput() FunctionAsyncInvokeConfigArrayOutput
	ToFunctionAsyncInvokeConfigArrayOutputWithContext(context.Context) FunctionAsyncInvokeConfigArrayOutput
}

type FunctionAsyncInvokeConfigArray []FunctionAsyncInvokeConfigInput

func (FunctionAsyncInvokeConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FunctionAsyncInvokeConfig)(nil)).Elem()
}

func (i FunctionAsyncInvokeConfigArray) ToFunctionAsyncInvokeConfigArrayOutput() FunctionAsyncInvokeConfigArrayOutput {
	return i.ToFunctionAsyncInvokeConfigArrayOutputWithContext(context.Background())
}

func (i FunctionAsyncInvokeConfigArray) ToFunctionAsyncInvokeConfigArrayOutputWithContext(ctx context.Context) FunctionAsyncInvokeConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionAsyncInvokeConfigArrayOutput)
}

func (i FunctionAsyncInvokeConfigArray) ToOutput(ctx context.Context) pulumix.Output[[]*FunctionAsyncInvokeConfig] {
	return pulumix.Output[[]*FunctionAsyncInvokeConfig]{
		OutputState: i.ToFunctionAsyncInvokeConfigArrayOutputWithContext(ctx).OutputState,
	}
}

// FunctionAsyncInvokeConfigMapInput is an input type that accepts FunctionAsyncInvokeConfigMap and FunctionAsyncInvokeConfigMapOutput values.
// You can construct a concrete instance of `FunctionAsyncInvokeConfigMapInput` via:
//
//	FunctionAsyncInvokeConfigMap{ "key": FunctionAsyncInvokeConfigArgs{...} }
type FunctionAsyncInvokeConfigMapInput interface {
	pulumi.Input

	ToFunctionAsyncInvokeConfigMapOutput() FunctionAsyncInvokeConfigMapOutput
	ToFunctionAsyncInvokeConfigMapOutputWithContext(context.Context) FunctionAsyncInvokeConfigMapOutput
}

type FunctionAsyncInvokeConfigMap map[string]FunctionAsyncInvokeConfigInput

func (FunctionAsyncInvokeConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FunctionAsyncInvokeConfig)(nil)).Elem()
}

func (i FunctionAsyncInvokeConfigMap) ToFunctionAsyncInvokeConfigMapOutput() FunctionAsyncInvokeConfigMapOutput {
	return i.ToFunctionAsyncInvokeConfigMapOutputWithContext(context.Background())
}

func (i FunctionAsyncInvokeConfigMap) ToFunctionAsyncInvokeConfigMapOutputWithContext(ctx context.Context) FunctionAsyncInvokeConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionAsyncInvokeConfigMapOutput)
}

func (i FunctionAsyncInvokeConfigMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*FunctionAsyncInvokeConfig] {
	return pulumix.Output[map[string]*FunctionAsyncInvokeConfig]{
		OutputState: i.ToFunctionAsyncInvokeConfigMapOutputWithContext(ctx).OutputState,
	}
}

type FunctionAsyncInvokeConfigOutput struct{ *pulumi.OutputState }

func (FunctionAsyncInvokeConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FunctionAsyncInvokeConfig)(nil)).Elem()
}

func (o FunctionAsyncInvokeConfigOutput) ToFunctionAsyncInvokeConfigOutput() FunctionAsyncInvokeConfigOutput {
	return o
}

func (o FunctionAsyncInvokeConfigOutput) ToFunctionAsyncInvokeConfigOutputWithContext(ctx context.Context) FunctionAsyncInvokeConfigOutput {
	return o
}

func (o FunctionAsyncInvokeConfigOutput) ToOutput(ctx context.Context) pulumix.Output[*FunctionAsyncInvokeConfig] {
	return pulumix.Output[*FunctionAsyncInvokeConfig]{
		OutputState: o.OutputState,
	}
}

// The date this resource was created.
func (o FunctionAsyncInvokeConfigOutput) CreatedTime() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionAsyncInvokeConfig) pulumi.StringOutput { return v.CreatedTime }).(pulumi.StringOutput)
}

// Configuration block with destination configuration. See `destinationConfig` below.
func (o FunctionAsyncInvokeConfigOutput) DestinationConfig() FunctionAsyncInvokeConfigDestinationConfigPtrOutput {
	return o.ApplyT(func(v *FunctionAsyncInvokeConfig) FunctionAsyncInvokeConfigDestinationConfigPtrOutput {
		return v.DestinationConfig
	}).(FunctionAsyncInvokeConfigDestinationConfigPtrOutput)
}

// Name of the Function Compute Function.
func (o FunctionAsyncInvokeConfigOutput) FunctionName() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionAsyncInvokeConfig) pulumi.StringOutput { return v.FunctionName }).(pulumi.StringOutput)
}

// The date this resource was last modified.
func (o FunctionAsyncInvokeConfigOutput) LastModifiedTime() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionAsyncInvokeConfig) pulumi.StringOutput { return v.LastModifiedTime }).(pulumi.StringOutput)
}

// Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 1 and 2592000 (between 60 and 21600 before v1.167.0).
func (o FunctionAsyncInvokeConfigOutput) MaximumEventAgeInSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FunctionAsyncInvokeConfig) pulumi.IntPtrOutput { return v.MaximumEventAgeInSeconds }).(pulumi.IntPtrOutput)
}

// Maximum number of times to retry when the function returns an error. Valid values between 0 and 8 (between 0 and 2 before v1.167.0). Defaults to 2.
func (o FunctionAsyncInvokeConfigOutput) MaximumRetryAttempts() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FunctionAsyncInvokeConfig) pulumi.IntPtrOutput { return v.MaximumRetryAttempts }).(pulumi.IntPtrOutput)
}

// Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
func (o FunctionAsyncInvokeConfigOutput) Qualifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FunctionAsyncInvokeConfig) pulumi.StringPtrOutput { return v.Qualifier }).(pulumi.StringPtrOutput)
}

// Name of the Function Compute Function, omitting any version or alias qualifier.
func (o FunctionAsyncInvokeConfigOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionAsyncInvokeConfig) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

// Function Compute async job configuration(also known as Task Mode). valid values true or false, default `false`
func (o FunctionAsyncInvokeConfigOutput) StatefulInvocation() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FunctionAsyncInvokeConfig) pulumi.BoolPtrOutput { return v.StatefulInvocation }).(pulumi.BoolPtrOutput)
}

type FunctionAsyncInvokeConfigArrayOutput struct{ *pulumi.OutputState }

func (FunctionAsyncInvokeConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FunctionAsyncInvokeConfig)(nil)).Elem()
}

func (o FunctionAsyncInvokeConfigArrayOutput) ToFunctionAsyncInvokeConfigArrayOutput() FunctionAsyncInvokeConfigArrayOutput {
	return o
}

func (o FunctionAsyncInvokeConfigArrayOutput) ToFunctionAsyncInvokeConfigArrayOutputWithContext(ctx context.Context) FunctionAsyncInvokeConfigArrayOutput {
	return o
}

func (o FunctionAsyncInvokeConfigArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*FunctionAsyncInvokeConfig] {
	return pulumix.Output[[]*FunctionAsyncInvokeConfig]{
		OutputState: o.OutputState,
	}
}

func (o FunctionAsyncInvokeConfigArrayOutput) Index(i pulumi.IntInput) FunctionAsyncInvokeConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FunctionAsyncInvokeConfig {
		return vs[0].([]*FunctionAsyncInvokeConfig)[vs[1].(int)]
	}).(FunctionAsyncInvokeConfigOutput)
}

type FunctionAsyncInvokeConfigMapOutput struct{ *pulumi.OutputState }

func (FunctionAsyncInvokeConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FunctionAsyncInvokeConfig)(nil)).Elem()
}

func (o FunctionAsyncInvokeConfigMapOutput) ToFunctionAsyncInvokeConfigMapOutput() FunctionAsyncInvokeConfigMapOutput {
	return o
}

func (o FunctionAsyncInvokeConfigMapOutput) ToFunctionAsyncInvokeConfigMapOutputWithContext(ctx context.Context) FunctionAsyncInvokeConfigMapOutput {
	return o
}

func (o FunctionAsyncInvokeConfigMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*FunctionAsyncInvokeConfig] {
	return pulumix.Output[map[string]*FunctionAsyncInvokeConfig]{
		OutputState: o.OutputState,
	}
}

func (o FunctionAsyncInvokeConfigMapOutput) MapIndex(k pulumi.StringInput) FunctionAsyncInvokeConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FunctionAsyncInvokeConfig {
		return vs[0].(map[string]*FunctionAsyncInvokeConfig)[vs[1].(string)]
	}).(FunctionAsyncInvokeConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionAsyncInvokeConfigInput)(nil)).Elem(), &FunctionAsyncInvokeConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionAsyncInvokeConfigArrayInput)(nil)).Elem(), FunctionAsyncInvokeConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionAsyncInvokeConfigMapInput)(nil)).Elem(), FunctionAsyncInvokeConfigMap{})
	pulumi.RegisterOutputType(FunctionAsyncInvokeConfigOutput{})
	pulumi.RegisterOutputType(FunctionAsyncInvokeConfigArrayOutput{})
	pulumi.RegisterOutputType(FunctionAsyncInvokeConfigMapOutput{})
}
