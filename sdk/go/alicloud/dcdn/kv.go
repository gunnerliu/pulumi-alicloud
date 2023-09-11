// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dcdn

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Dcdn Kv resource.
//
// For information about Dcdn Kv and how to use it, see [What is Kv](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/putdcdnkv).
//
// > **NOTE:** Available since v1.198.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dcdn"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultKvNamespace, err := dcdn.NewKvNamespace(ctx, "defaultKvNamespace", &dcdn.KvNamespaceArgs{
//				Description: pulumi.String(name),
//				Namespace:   pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = dcdn.NewKv(ctx, "defaultKv", &dcdn.KvArgs{
//				Value:     pulumi.String("example-value"),
//				Key:       pulumi.String(name),
//				Namespace: defaultKvNamespace.Namespace,
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
// Dcdn Kv can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:dcdn/kv:Kv example <namespace>:<key>
//
// ```
type Kv struct {
	pulumi.CustomResourceState

	// The name of the key to Put, the longest 512, cannot contain spaces.
	Key pulumi.StringOutput `pulumi:"key"`
	// The name specified when the customer calls PutDcdnKvNamespace.
	Namespace pulumi.StringOutput `pulumi:"namespace"`
	// The content of key, up to 2M(2*1000*1000).
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewKv registers a new resource with the given unique name, arguments, and options.
func NewKv(ctx *pulumi.Context,
	name string, args *KvArgs, opts ...pulumi.ResourceOption) (*Kv, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.Namespace == nil {
		return nil, errors.New("invalid value for required argument 'Namespace'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Kv
	err := ctx.RegisterResource("alicloud:dcdn/kv:Kv", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKv gets an existing Kv resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKv(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KvState, opts ...pulumi.ResourceOption) (*Kv, error) {
	var resource Kv
	err := ctx.ReadResource("alicloud:dcdn/kv:Kv", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Kv resources.
type kvState struct {
	// The name of the key to Put, the longest 512, cannot contain spaces.
	Key *string `pulumi:"key"`
	// The name specified when the customer calls PutDcdnKvNamespace.
	Namespace *string `pulumi:"namespace"`
	// The content of key, up to 2M(2*1000*1000).
	Value *string `pulumi:"value"`
}

type KvState struct {
	// The name of the key to Put, the longest 512, cannot contain spaces.
	Key pulumi.StringPtrInput
	// The name specified when the customer calls PutDcdnKvNamespace.
	Namespace pulumi.StringPtrInput
	// The content of key, up to 2M(2*1000*1000).
	Value pulumi.StringPtrInput
}

func (KvState) ElementType() reflect.Type {
	return reflect.TypeOf((*kvState)(nil)).Elem()
}

type kvArgs struct {
	// The name of the key to Put, the longest 512, cannot contain spaces.
	Key string `pulumi:"key"`
	// The name specified when the customer calls PutDcdnKvNamespace.
	Namespace string `pulumi:"namespace"`
	// The content of key, up to 2M(2*1000*1000).
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a Kv resource.
type KvArgs struct {
	// The name of the key to Put, the longest 512, cannot contain spaces.
	Key pulumi.StringInput
	// The name specified when the customer calls PutDcdnKvNamespace.
	Namespace pulumi.StringInput
	// The content of key, up to 2M(2*1000*1000).
	Value pulumi.StringInput
}

func (KvArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kvArgs)(nil)).Elem()
}

type KvInput interface {
	pulumi.Input

	ToKvOutput() KvOutput
	ToKvOutputWithContext(ctx context.Context) KvOutput
}

func (*Kv) ElementType() reflect.Type {
	return reflect.TypeOf((**Kv)(nil)).Elem()
}

func (i *Kv) ToKvOutput() KvOutput {
	return i.ToKvOutputWithContext(context.Background())
}

func (i *Kv) ToKvOutputWithContext(ctx context.Context) KvOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KvOutput)
}

func (i *Kv) ToOutput(ctx context.Context) pulumix.Output[*Kv] {
	return pulumix.Output[*Kv]{
		OutputState: i.ToKvOutputWithContext(ctx).OutputState,
	}
}

// KvArrayInput is an input type that accepts KvArray and KvArrayOutput values.
// You can construct a concrete instance of `KvArrayInput` via:
//
//	KvArray{ KvArgs{...} }
type KvArrayInput interface {
	pulumi.Input

	ToKvArrayOutput() KvArrayOutput
	ToKvArrayOutputWithContext(context.Context) KvArrayOutput
}

type KvArray []KvInput

func (KvArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Kv)(nil)).Elem()
}

func (i KvArray) ToKvArrayOutput() KvArrayOutput {
	return i.ToKvArrayOutputWithContext(context.Background())
}

func (i KvArray) ToKvArrayOutputWithContext(ctx context.Context) KvArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KvArrayOutput)
}

func (i KvArray) ToOutput(ctx context.Context) pulumix.Output[[]*Kv] {
	return pulumix.Output[[]*Kv]{
		OutputState: i.ToKvArrayOutputWithContext(ctx).OutputState,
	}
}

// KvMapInput is an input type that accepts KvMap and KvMapOutput values.
// You can construct a concrete instance of `KvMapInput` via:
//
//	KvMap{ "key": KvArgs{...} }
type KvMapInput interface {
	pulumi.Input

	ToKvMapOutput() KvMapOutput
	ToKvMapOutputWithContext(context.Context) KvMapOutput
}

type KvMap map[string]KvInput

func (KvMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Kv)(nil)).Elem()
}

func (i KvMap) ToKvMapOutput() KvMapOutput {
	return i.ToKvMapOutputWithContext(context.Background())
}

func (i KvMap) ToKvMapOutputWithContext(ctx context.Context) KvMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KvMapOutput)
}

func (i KvMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Kv] {
	return pulumix.Output[map[string]*Kv]{
		OutputState: i.ToKvMapOutputWithContext(ctx).OutputState,
	}
}

type KvOutput struct{ *pulumi.OutputState }

func (KvOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Kv)(nil)).Elem()
}

func (o KvOutput) ToKvOutput() KvOutput {
	return o
}

func (o KvOutput) ToKvOutputWithContext(ctx context.Context) KvOutput {
	return o
}

func (o KvOutput) ToOutput(ctx context.Context) pulumix.Output[*Kv] {
	return pulumix.Output[*Kv]{
		OutputState: o.OutputState,
	}
}

// The name of the key to Put, the longest 512, cannot contain spaces.
func (o KvOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *Kv) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// The name specified when the customer calls PutDcdnKvNamespace.
func (o KvOutput) Namespace() pulumi.StringOutput {
	return o.ApplyT(func(v *Kv) pulumi.StringOutput { return v.Namespace }).(pulumi.StringOutput)
}

// The content of key, up to 2M(2*1000*1000).
func (o KvOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *Kv) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

type KvArrayOutput struct{ *pulumi.OutputState }

func (KvArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Kv)(nil)).Elem()
}

func (o KvArrayOutput) ToKvArrayOutput() KvArrayOutput {
	return o
}

func (o KvArrayOutput) ToKvArrayOutputWithContext(ctx context.Context) KvArrayOutput {
	return o
}

func (o KvArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Kv] {
	return pulumix.Output[[]*Kv]{
		OutputState: o.OutputState,
	}
}

func (o KvArrayOutput) Index(i pulumi.IntInput) KvOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Kv {
		return vs[0].([]*Kv)[vs[1].(int)]
	}).(KvOutput)
}

type KvMapOutput struct{ *pulumi.OutputState }

func (KvMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Kv)(nil)).Elem()
}

func (o KvMapOutput) ToKvMapOutput() KvMapOutput {
	return o
}

func (o KvMapOutput) ToKvMapOutputWithContext(ctx context.Context) KvMapOutput {
	return o
}

func (o KvMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Kv] {
	return pulumix.Output[map[string]*Kv]{
		OutputState: o.OutputState,
	}
}

func (o KvMapOutput) MapIndex(k pulumi.StringInput) KvOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Kv {
		return vs[0].(map[string]*Kv)[vs[1].(string)]
	}).(KvOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KvInput)(nil)).Elem(), &Kv{})
	pulumi.RegisterInputType(reflect.TypeOf((*KvArrayInput)(nil)).Elem(), KvArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KvMapInput)(nil)).Elem(), KvMap{})
	pulumi.RegisterOutputType(KvOutput{})
	pulumi.RegisterOutputType(KvArrayOutput{})
	pulumi.RegisterOutputType(KvMapOutput{})
}
