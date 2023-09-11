// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apigateway

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Api Gateway Plugin resource.
//
// For information about Api Gateway Plugin and how to use it, see [What is Plugin](https://www.alibabacloud.com/help/en/api-gateway/latest/create-an-plugin).
//
// > **NOTE:** Available since v1.187.0.
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
//			_, err := apigateway.NewPlugin(ctx, "default", &apigateway.PluginArgs{
//				Description: pulumi.String("tf_example"),
//				PluginData:  pulumi.String("{\"allowOrigins\": \"api.foo.com\",\"allowMethods\": \"GET,POST,PUT,DELETE,HEAD,OPTIONS,PATCH\",\"allowHeaders\": \"Authorization,Accept,Accept-Ranges,Cache-Control,Range,Date,Content-Type,Content-Length,Content-MD5,User-Agent,X-Ca-Signature,X-Ca-Signature-Headers,X-Ca-Signature-Method,X-Ca-Key,X-Ca-Timestamp,X-Ca-Nonce,X-Ca-Stage,X-Ca-Request-Mode,x-ca-deviceid\",\"exposeHeaders\": \"Content-MD5,Server,Date,Latency,X-Ca-Request-Id,X-Ca-Error-Code,X-Ca-Error-Message\",\"maxAge\": 172800,\"allowCredentials\": true}"),
//				PluginName:  pulumi.String("tf_example"),
//				PluginType:  pulumi.String("cors"),
//				Tags: pulumi.AnyMap{
//					"Created": pulumi.Any("TF"),
//					"For":     pulumi.Any("example"),
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
// Api Gateway Plugin can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:apigateway/plugin:Plugin example <id>
//
// ```
type Plugin struct {
	pulumi.CustomResourceState

	// The description of the plug-in, which cannot exceed 200 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
	PluginData pulumi.StringOutput `pulumi:"pluginData"`
	// The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
	PluginName pulumi.StringOutput `pulumi:"pluginName"`
	// The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
	// - ipControl: indicates IP address-based access control.
	// - trafficControl: indicates throttling.
	// - backendSignature: indicates backend signature.
	// - jwtAuth: indicates JWT (OpenId Connect).
	// - cors: indicates cross-origin resource access (CORS).
	// - caching: indicates caching.
	PluginType pulumi.StringOutput `pulumi:"pluginType"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
}

// NewPlugin registers a new resource with the given unique name, arguments, and options.
func NewPlugin(ctx *pulumi.Context,
	name string, args *PluginArgs, opts ...pulumi.ResourceOption) (*Plugin, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PluginData == nil {
		return nil, errors.New("invalid value for required argument 'PluginData'")
	}
	if args.PluginName == nil {
		return nil, errors.New("invalid value for required argument 'PluginName'")
	}
	if args.PluginType == nil {
		return nil, errors.New("invalid value for required argument 'PluginType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Plugin
	err := ctx.RegisterResource("alicloud:apigateway/plugin:Plugin", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPlugin gets an existing Plugin resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPlugin(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PluginState, opts ...pulumi.ResourceOption) (*Plugin, error) {
	var resource Plugin
	err := ctx.ReadResource("alicloud:apigateway/plugin:Plugin", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Plugin resources.
type pluginState struct {
	// The description of the plug-in, which cannot exceed 200 characters.
	Description *string `pulumi:"description"`
	// The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
	PluginData *string `pulumi:"pluginData"`
	// The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
	PluginName *string `pulumi:"pluginName"`
	// The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
	// - ipControl: indicates IP address-based access control.
	// - trafficControl: indicates throttling.
	// - backendSignature: indicates backend signature.
	// - jwtAuth: indicates JWT (OpenId Connect).
	// - cors: indicates cross-origin resource access (CORS).
	// - caching: indicates caching.
	PluginType *string `pulumi:"pluginType"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

type PluginState struct {
	// The description of the plug-in, which cannot exceed 200 characters.
	Description pulumi.StringPtrInput
	// The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
	PluginData pulumi.StringPtrInput
	// The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
	PluginName pulumi.StringPtrInput
	// The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
	// - ipControl: indicates IP address-based access control.
	// - trafficControl: indicates throttling.
	// - backendSignature: indicates backend signature.
	// - jwtAuth: indicates JWT (OpenId Connect).
	// - cors: indicates cross-origin resource access (CORS).
	// - caching: indicates caching.
	PluginType pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
}

func (PluginState) ElementType() reflect.Type {
	return reflect.TypeOf((*pluginState)(nil)).Elem()
}

type pluginArgs struct {
	// The description of the plug-in, which cannot exceed 200 characters.
	Description *string `pulumi:"description"`
	// The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
	PluginData string `pulumi:"pluginData"`
	// The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
	PluginName string `pulumi:"pluginName"`
	// The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
	// - ipControl: indicates IP address-based access control.
	// - trafficControl: indicates throttling.
	// - backendSignature: indicates backend signature.
	// - jwtAuth: indicates JWT (OpenId Connect).
	// - cors: indicates cross-origin resource access (CORS).
	// - caching: indicates caching.
	PluginType string `pulumi:"pluginType"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// The set of arguments for constructing a Plugin resource.
type PluginArgs struct {
	// The description of the plug-in, which cannot exceed 200 characters.
	Description pulumi.StringPtrInput
	// The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
	PluginData pulumi.StringInput
	// The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
	PluginName pulumi.StringInput
	// The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
	// - ipControl: indicates IP address-based access control.
	// - trafficControl: indicates throttling.
	// - backendSignature: indicates backend signature.
	// - jwtAuth: indicates JWT (OpenId Connect).
	// - cors: indicates cross-origin resource access (CORS).
	// - caching: indicates caching.
	PluginType pulumi.StringInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
}

func (PluginArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pluginArgs)(nil)).Elem()
}

type PluginInput interface {
	pulumi.Input

	ToPluginOutput() PluginOutput
	ToPluginOutputWithContext(ctx context.Context) PluginOutput
}

func (*Plugin) ElementType() reflect.Type {
	return reflect.TypeOf((**Plugin)(nil)).Elem()
}

func (i *Plugin) ToPluginOutput() PluginOutput {
	return i.ToPluginOutputWithContext(context.Background())
}

func (i *Plugin) ToPluginOutputWithContext(ctx context.Context) PluginOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PluginOutput)
}

func (i *Plugin) ToOutput(ctx context.Context) pulumix.Output[*Plugin] {
	return pulumix.Output[*Plugin]{
		OutputState: i.ToPluginOutputWithContext(ctx).OutputState,
	}
}

// PluginArrayInput is an input type that accepts PluginArray and PluginArrayOutput values.
// You can construct a concrete instance of `PluginArrayInput` via:
//
//	PluginArray{ PluginArgs{...} }
type PluginArrayInput interface {
	pulumi.Input

	ToPluginArrayOutput() PluginArrayOutput
	ToPluginArrayOutputWithContext(context.Context) PluginArrayOutput
}

type PluginArray []PluginInput

func (PluginArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Plugin)(nil)).Elem()
}

func (i PluginArray) ToPluginArrayOutput() PluginArrayOutput {
	return i.ToPluginArrayOutputWithContext(context.Background())
}

func (i PluginArray) ToPluginArrayOutputWithContext(ctx context.Context) PluginArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PluginArrayOutput)
}

func (i PluginArray) ToOutput(ctx context.Context) pulumix.Output[[]*Plugin] {
	return pulumix.Output[[]*Plugin]{
		OutputState: i.ToPluginArrayOutputWithContext(ctx).OutputState,
	}
}

// PluginMapInput is an input type that accepts PluginMap and PluginMapOutput values.
// You can construct a concrete instance of `PluginMapInput` via:
//
//	PluginMap{ "key": PluginArgs{...} }
type PluginMapInput interface {
	pulumi.Input

	ToPluginMapOutput() PluginMapOutput
	ToPluginMapOutputWithContext(context.Context) PluginMapOutput
}

type PluginMap map[string]PluginInput

func (PluginMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Plugin)(nil)).Elem()
}

func (i PluginMap) ToPluginMapOutput() PluginMapOutput {
	return i.ToPluginMapOutputWithContext(context.Background())
}

func (i PluginMap) ToPluginMapOutputWithContext(ctx context.Context) PluginMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PluginMapOutput)
}

func (i PluginMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Plugin] {
	return pulumix.Output[map[string]*Plugin]{
		OutputState: i.ToPluginMapOutputWithContext(ctx).OutputState,
	}
}

type PluginOutput struct{ *pulumi.OutputState }

func (PluginOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Plugin)(nil)).Elem()
}

func (o PluginOutput) ToPluginOutput() PluginOutput {
	return o
}

func (o PluginOutput) ToPluginOutputWithContext(ctx context.Context) PluginOutput {
	return o
}

func (o PluginOutput) ToOutput(ctx context.Context) pulumix.Output[*Plugin] {
	return pulumix.Output[*Plugin]{
		OutputState: o.OutputState,
	}
}

// The description of the plug-in, which cannot exceed 200 characters.
func (o PluginOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Plugin) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
func (o PluginOutput) PluginData() pulumi.StringOutput {
	return o.ApplyT(func(v *Plugin) pulumi.StringOutput { return v.PluginData }).(pulumi.StringOutput)
}

// The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
func (o PluginOutput) PluginName() pulumi.StringOutput {
	return o.ApplyT(func(v *Plugin) pulumi.StringOutput { return v.PluginName }).(pulumi.StringOutput)
}

// The type of the plug-in. Valid values: `backendSignature`, `caching`, `cors`, `ipControl`, `jwtAuth`, `trafficControl`.
// - ipControl: indicates IP address-based access control.
// - trafficControl: indicates throttling.
// - backendSignature: indicates backend signature.
// - jwtAuth: indicates JWT (OpenId Connect).
// - cors: indicates cross-origin resource access (CORS).
// - caching: indicates caching.
func (o PluginOutput) PluginType() pulumi.StringOutput {
	return o.ApplyT(func(v *Plugin) pulumi.StringOutput { return v.PluginType }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o PluginOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *Plugin) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

type PluginArrayOutput struct{ *pulumi.OutputState }

func (PluginArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Plugin)(nil)).Elem()
}

func (o PluginArrayOutput) ToPluginArrayOutput() PluginArrayOutput {
	return o
}

func (o PluginArrayOutput) ToPluginArrayOutputWithContext(ctx context.Context) PluginArrayOutput {
	return o
}

func (o PluginArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Plugin] {
	return pulumix.Output[[]*Plugin]{
		OutputState: o.OutputState,
	}
}

func (o PluginArrayOutput) Index(i pulumi.IntInput) PluginOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Plugin {
		return vs[0].([]*Plugin)[vs[1].(int)]
	}).(PluginOutput)
}

type PluginMapOutput struct{ *pulumi.OutputState }

func (PluginMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Plugin)(nil)).Elem()
}

func (o PluginMapOutput) ToPluginMapOutput() PluginMapOutput {
	return o
}

func (o PluginMapOutput) ToPluginMapOutputWithContext(ctx context.Context) PluginMapOutput {
	return o
}

func (o PluginMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Plugin] {
	return pulumix.Output[map[string]*Plugin]{
		OutputState: o.OutputState,
	}
}

func (o PluginMapOutput) MapIndex(k pulumi.StringInput) PluginOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Plugin {
		return vs[0].(map[string]*Plugin)[vs[1].(string)]
	}).(PluginOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PluginInput)(nil)).Elem(), &Plugin{})
	pulumi.RegisterInputType(reflect.TypeOf((*PluginArrayInput)(nil)).Elem(), PluginArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PluginMapInput)(nil)).Elem(), PluginMap{})
	pulumi.RegisterOutputType(PluginOutput{})
	pulumi.RegisterOutputType(PluginArrayOutput{})
	pulumi.RegisterOutputType(PluginMapOutput{})
}
