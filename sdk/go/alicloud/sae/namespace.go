// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sae

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Serverless App Engine (SAE) Namespace resource.
//
// For information about SAE Namespace and how to use it, see [What is Namespace](https://www.alibabacloud.com/help/en/sae/latest/createnamespace).
//
// > **NOTE:** Available since v1.129.0.
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
//	"fmt"
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/sae"
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
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
//			defaultRegions, err := alicloud.GetRegions(ctx, &alicloud.GetRegionsArgs{
//				Current: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultRandomInteger, err := random.NewRandomInteger(ctx, "defaultRandomInteger", &random.RandomIntegerArgs{
//				Max: pulumi.Int(99999),
//				Min: pulumi.Int(10000),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = sae.NewNamespace(ctx, "example", &sae.NamespaceArgs{
//				NamespaceId: defaultRandomInteger.Result.ApplyT(func(result int) (string, error) {
//					return fmt.Sprintf("%v:example%v", defaultRegions.Regions[0].Id, result), nil
//				}).(pulumi.StringOutput),
//				NamespaceName:           pulumi.String(name),
//				NamespaceDescription:    pulumi.String(name),
//				EnableMicroRegistration: pulumi.Bool(false),
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
// Serverless App Engine (SAE) Namespace can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:sae/namespace:Namespace example <namespace_id>
//
// ```
type Namespace struct {
	pulumi.CustomResourceState

	// Specifies whether to enable the SAE built-in registry. If you do not use the built-in registry, you can set `enableMicroRegistration` to `false` to accelerate the creation of the namespace. Default value: `true`. Valid values:
	EnableMicroRegistration pulumi.BoolOutput `pulumi:"enableMicroRegistration"`
	// The Description of Namespace.
	NamespaceDescription pulumi.StringPtrOutput `pulumi:"namespaceDescription"`
	// The ID of the Namespace. It can contain 2 to 32 lowercase characters. The value is in format `{RegionId}:{namespace}`.
	NamespaceId pulumi.StringOutput `pulumi:"namespaceId"`
	// The Name of Namespace.
	NamespaceName pulumi.StringOutput `pulumi:"namespaceName"`
	// The short ID of the Namespace. You do not need to specify a region ID. The value of `namespaceShortId` can be up to 20 characters in length and can contain only lowercase letters and digits.
	NamespaceShortId pulumi.StringOutput `pulumi:"namespaceShortId"`
}

// NewNamespace registers a new resource with the given unique name, arguments, and options.
func NewNamespace(ctx *pulumi.Context,
	name string, args *NamespaceArgs, opts ...pulumi.ResourceOption) (*Namespace, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NamespaceName == nil {
		return nil, errors.New("invalid value for required argument 'NamespaceName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Namespace
	err := ctx.RegisterResource("alicloud:sae/namespace:Namespace", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNamespace gets an existing Namespace resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNamespace(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NamespaceState, opts ...pulumi.ResourceOption) (*Namespace, error) {
	var resource Namespace
	err := ctx.ReadResource("alicloud:sae/namespace:Namespace", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Namespace resources.
type namespaceState struct {
	// Specifies whether to enable the SAE built-in registry. If you do not use the built-in registry, you can set `enableMicroRegistration` to `false` to accelerate the creation of the namespace. Default value: `true`. Valid values:
	EnableMicroRegistration *bool `pulumi:"enableMicroRegistration"`
	// The Description of Namespace.
	NamespaceDescription *string `pulumi:"namespaceDescription"`
	// The ID of the Namespace. It can contain 2 to 32 lowercase characters. The value is in format `{RegionId}:{namespace}`.
	NamespaceId *string `pulumi:"namespaceId"`
	// The Name of Namespace.
	NamespaceName *string `pulumi:"namespaceName"`
	// The short ID of the Namespace. You do not need to specify a region ID. The value of `namespaceShortId` can be up to 20 characters in length and can contain only lowercase letters and digits.
	NamespaceShortId *string `pulumi:"namespaceShortId"`
}

type NamespaceState struct {
	// Specifies whether to enable the SAE built-in registry. If you do not use the built-in registry, you can set `enableMicroRegistration` to `false` to accelerate the creation of the namespace. Default value: `true`. Valid values:
	EnableMicroRegistration pulumi.BoolPtrInput
	// The Description of Namespace.
	NamespaceDescription pulumi.StringPtrInput
	// The ID of the Namespace. It can contain 2 to 32 lowercase characters. The value is in format `{RegionId}:{namespace}`.
	NamespaceId pulumi.StringPtrInput
	// The Name of Namespace.
	NamespaceName pulumi.StringPtrInput
	// The short ID of the Namespace. You do not need to specify a region ID. The value of `namespaceShortId` can be up to 20 characters in length and can contain only lowercase letters and digits.
	NamespaceShortId pulumi.StringPtrInput
}

func (NamespaceState) ElementType() reflect.Type {
	return reflect.TypeOf((*namespaceState)(nil)).Elem()
}

type namespaceArgs struct {
	// Specifies whether to enable the SAE built-in registry. If you do not use the built-in registry, you can set `enableMicroRegistration` to `false` to accelerate the creation of the namespace. Default value: `true`. Valid values:
	EnableMicroRegistration *bool `pulumi:"enableMicroRegistration"`
	// The Description of Namespace.
	NamespaceDescription *string `pulumi:"namespaceDescription"`
	// The ID of the Namespace. It can contain 2 to 32 lowercase characters. The value is in format `{RegionId}:{namespace}`.
	NamespaceId *string `pulumi:"namespaceId"`
	// The Name of Namespace.
	NamespaceName string `pulumi:"namespaceName"`
	// The short ID of the Namespace. You do not need to specify a region ID. The value of `namespaceShortId` can be up to 20 characters in length and can contain only lowercase letters and digits.
	NamespaceShortId *string `pulumi:"namespaceShortId"`
}

// The set of arguments for constructing a Namespace resource.
type NamespaceArgs struct {
	// Specifies whether to enable the SAE built-in registry. If you do not use the built-in registry, you can set `enableMicroRegistration` to `false` to accelerate the creation of the namespace. Default value: `true`. Valid values:
	EnableMicroRegistration pulumi.BoolPtrInput
	// The Description of Namespace.
	NamespaceDescription pulumi.StringPtrInput
	// The ID of the Namespace. It can contain 2 to 32 lowercase characters. The value is in format `{RegionId}:{namespace}`.
	NamespaceId pulumi.StringPtrInput
	// The Name of Namespace.
	NamespaceName pulumi.StringInput
	// The short ID of the Namespace. You do not need to specify a region ID. The value of `namespaceShortId` can be up to 20 characters in length and can contain only lowercase letters and digits.
	NamespaceShortId pulumi.StringPtrInput
}

func (NamespaceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*namespaceArgs)(nil)).Elem()
}

type NamespaceInput interface {
	pulumi.Input

	ToNamespaceOutput() NamespaceOutput
	ToNamespaceOutputWithContext(ctx context.Context) NamespaceOutput
}

func (*Namespace) ElementType() reflect.Type {
	return reflect.TypeOf((**Namespace)(nil)).Elem()
}

func (i *Namespace) ToNamespaceOutput() NamespaceOutput {
	return i.ToNamespaceOutputWithContext(context.Background())
}

func (i *Namespace) ToNamespaceOutputWithContext(ctx context.Context) NamespaceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceOutput)
}

func (i *Namespace) ToOutput(ctx context.Context) pulumix.Output[*Namespace] {
	return pulumix.Output[*Namespace]{
		OutputState: i.ToNamespaceOutputWithContext(ctx).OutputState,
	}
}

// NamespaceArrayInput is an input type that accepts NamespaceArray and NamespaceArrayOutput values.
// You can construct a concrete instance of `NamespaceArrayInput` via:
//
//	NamespaceArray{ NamespaceArgs{...} }
type NamespaceArrayInput interface {
	pulumi.Input

	ToNamespaceArrayOutput() NamespaceArrayOutput
	ToNamespaceArrayOutputWithContext(context.Context) NamespaceArrayOutput
}

type NamespaceArray []NamespaceInput

func (NamespaceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Namespace)(nil)).Elem()
}

func (i NamespaceArray) ToNamespaceArrayOutput() NamespaceArrayOutput {
	return i.ToNamespaceArrayOutputWithContext(context.Background())
}

func (i NamespaceArray) ToNamespaceArrayOutputWithContext(ctx context.Context) NamespaceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceArrayOutput)
}

func (i NamespaceArray) ToOutput(ctx context.Context) pulumix.Output[[]*Namespace] {
	return pulumix.Output[[]*Namespace]{
		OutputState: i.ToNamespaceArrayOutputWithContext(ctx).OutputState,
	}
}

// NamespaceMapInput is an input type that accepts NamespaceMap and NamespaceMapOutput values.
// You can construct a concrete instance of `NamespaceMapInput` via:
//
//	NamespaceMap{ "key": NamespaceArgs{...} }
type NamespaceMapInput interface {
	pulumi.Input

	ToNamespaceMapOutput() NamespaceMapOutput
	ToNamespaceMapOutputWithContext(context.Context) NamespaceMapOutput
}

type NamespaceMap map[string]NamespaceInput

func (NamespaceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Namespace)(nil)).Elem()
}

func (i NamespaceMap) ToNamespaceMapOutput() NamespaceMapOutput {
	return i.ToNamespaceMapOutputWithContext(context.Background())
}

func (i NamespaceMap) ToNamespaceMapOutputWithContext(ctx context.Context) NamespaceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceMapOutput)
}

func (i NamespaceMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Namespace] {
	return pulumix.Output[map[string]*Namespace]{
		OutputState: i.ToNamespaceMapOutputWithContext(ctx).OutputState,
	}
}

type NamespaceOutput struct{ *pulumi.OutputState }

func (NamespaceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Namespace)(nil)).Elem()
}

func (o NamespaceOutput) ToNamespaceOutput() NamespaceOutput {
	return o
}

func (o NamespaceOutput) ToNamespaceOutputWithContext(ctx context.Context) NamespaceOutput {
	return o
}

func (o NamespaceOutput) ToOutput(ctx context.Context) pulumix.Output[*Namespace] {
	return pulumix.Output[*Namespace]{
		OutputState: o.OutputState,
	}
}

// Specifies whether to enable the SAE built-in registry. If you do not use the built-in registry, you can set `enableMicroRegistration` to `false` to accelerate the creation of the namespace. Default value: `true`. Valid values:
func (o NamespaceOutput) EnableMicroRegistration() pulumi.BoolOutput {
	return o.ApplyT(func(v *Namespace) pulumi.BoolOutput { return v.EnableMicroRegistration }).(pulumi.BoolOutput)
}

// The Description of Namespace.
func (o NamespaceOutput) NamespaceDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Namespace) pulumi.StringPtrOutput { return v.NamespaceDescription }).(pulumi.StringPtrOutput)
}

// The ID of the Namespace. It can contain 2 to 32 lowercase characters. The value is in format `{RegionId}:{namespace}`.
func (o NamespaceOutput) NamespaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Namespace) pulumi.StringOutput { return v.NamespaceId }).(pulumi.StringOutput)
}

// The Name of Namespace.
func (o NamespaceOutput) NamespaceName() pulumi.StringOutput {
	return o.ApplyT(func(v *Namespace) pulumi.StringOutput { return v.NamespaceName }).(pulumi.StringOutput)
}

// The short ID of the Namespace. You do not need to specify a region ID. The value of `namespaceShortId` can be up to 20 characters in length and can contain only lowercase letters and digits.
func (o NamespaceOutput) NamespaceShortId() pulumi.StringOutput {
	return o.ApplyT(func(v *Namespace) pulumi.StringOutput { return v.NamespaceShortId }).(pulumi.StringOutput)
}

type NamespaceArrayOutput struct{ *pulumi.OutputState }

func (NamespaceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Namespace)(nil)).Elem()
}

func (o NamespaceArrayOutput) ToNamespaceArrayOutput() NamespaceArrayOutput {
	return o
}

func (o NamespaceArrayOutput) ToNamespaceArrayOutputWithContext(ctx context.Context) NamespaceArrayOutput {
	return o
}

func (o NamespaceArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Namespace] {
	return pulumix.Output[[]*Namespace]{
		OutputState: o.OutputState,
	}
}

func (o NamespaceArrayOutput) Index(i pulumi.IntInput) NamespaceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Namespace {
		return vs[0].([]*Namespace)[vs[1].(int)]
	}).(NamespaceOutput)
}

type NamespaceMapOutput struct{ *pulumi.OutputState }

func (NamespaceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Namespace)(nil)).Elem()
}

func (o NamespaceMapOutput) ToNamespaceMapOutput() NamespaceMapOutput {
	return o
}

func (o NamespaceMapOutput) ToNamespaceMapOutputWithContext(ctx context.Context) NamespaceMapOutput {
	return o
}

func (o NamespaceMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Namespace] {
	return pulumix.Output[map[string]*Namespace]{
		OutputState: o.OutputState,
	}
}

func (o NamespaceMapOutput) MapIndex(k pulumi.StringInput) NamespaceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Namespace {
		return vs[0].(map[string]*Namespace)[vs[1].(string)]
	}).(NamespaceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NamespaceInput)(nil)).Elem(), &Namespace{})
	pulumi.RegisterInputType(reflect.TypeOf((*NamespaceArrayInput)(nil)).Elem(), NamespaceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NamespaceMapInput)(nil)).Elem(), NamespaceMap{})
	pulumi.RegisterOutputType(NamespaceOutput{})
	pulumi.RegisterOutputType(NamespaceArrayOutput{})
	pulumi.RegisterOutputType(NamespaceMapOutput{})
}
