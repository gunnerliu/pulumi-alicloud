// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package edas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a EDAS Namespace resource.
//
// For information about EDAS Namespace and how to use it, see [What is Namespace](https://www.alibabacloud.com/help/en/enterprise-distributed-application-service/latest/insertorupdateregion).
//
// > **NOTE:** Available since v1.173.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/edas"
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
//			_, err = edas.NewNamespace(ctx, "defaultNamespace", &edas.NamespaceArgs{
//				DebugEnable:        pulumi.Bool(false),
//				Description:        pulumi.String(name),
//				NamespaceLogicalId: pulumi.String(fmt.Sprintf("%v:example", defaultRegions.Regions[0].Id)),
//				NamespaceName:      pulumi.String(name),
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
// EDAS Namespace can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:edas/namespace:Namespace example <id>
//
// ```
type Namespace struct {
	pulumi.CustomResourceState

	// Specifies whether to enable remote debugging.
	DebugEnable pulumi.BoolOutput `pulumi:"debugEnable"`
	// The description of the namespace, The description can be up to `128` characters in length.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ID of the namespace.
	// - The ID of a custom namespace is in the `region ID:namespace identifier` format. An example is `cn-beijing:tdy218`.
	// - The ID of the default namespace is in the `region ID` format. An example is cn-beijing.
	NamespaceLogicalId pulumi.StringOutput `pulumi:"namespaceLogicalId"`
	// The name of the namespace, The name can be up to `63` characters in length.
	NamespaceName pulumi.StringOutput `pulumi:"namespaceName"`
}

// NewNamespace registers a new resource with the given unique name, arguments, and options.
func NewNamespace(ctx *pulumi.Context,
	name string, args *NamespaceArgs, opts ...pulumi.ResourceOption) (*Namespace, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NamespaceLogicalId == nil {
		return nil, errors.New("invalid value for required argument 'NamespaceLogicalId'")
	}
	if args.NamespaceName == nil {
		return nil, errors.New("invalid value for required argument 'NamespaceName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Namespace
	err := ctx.RegisterResource("alicloud:edas/namespace:Namespace", name, args, &resource, opts...)
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
	err := ctx.ReadResource("alicloud:edas/namespace:Namespace", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Namespace resources.
type namespaceState struct {
	// Specifies whether to enable remote debugging.
	DebugEnable *bool `pulumi:"debugEnable"`
	// The description of the namespace, The description can be up to `128` characters in length.
	Description *string `pulumi:"description"`
	// The ID of the namespace.
	// - The ID of a custom namespace is in the `region ID:namespace identifier` format. An example is `cn-beijing:tdy218`.
	// - The ID of the default namespace is in the `region ID` format. An example is cn-beijing.
	NamespaceLogicalId *string `pulumi:"namespaceLogicalId"`
	// The name of the namespace, The name can be up to `63` characters in length.
	NamespaceName *string `pulumi:"namespaceName"`
}

type NamespaceState struct {
	// Specifies whether to enable remote debugging.
	DebugEnable pulumi.BoolPtrInput
	// The description of the namespace, The description can be up to `128` characters in length.
	Description pulumi.StringPtrInput
	// The ID of the namespace.
	// - The ID of a custom namespace is in the `region ID:namespace identifier` format. An example is `cn-beijing:tdy218`.
	// - The ID of the default namespace is in the `region ID` format. An example is cn-beijing.
	NamespaceLogicalId pulumi.StringPtrInput
	// The name of the namespace, The name can be up to `63` characters in length.
	NamespaceName pulumi.StringPtrInput
}

func (NamespaceState) ElementType() reflect.Type {
	return reflect.TypeOf((*namespaceState)(nil)).Elem()
}

type namespaceArgs struct {
	// Specifies whether to enable remote debugging.
	DebugEnable *bool `pulumi:"debugEnable"`
	// The description of the namespace, The description can be up to `128` characters in length.
	Description *string `pulumi:"description"`
	// The ID of the namespace.
	// - The ID of a custom namespace is in the `region ID:namespace identifier` format. An example is `cn-beijing:tdy218`.
	// - The ID of the default namespace is in the `region ID` format. An example is cn-beijing.
	NamespaceLogicalId string `pulumi:"namespaceLogicalId"`
	// The name of the namespace, The name can be up to `63` characters in length.
	NamespaceName string `pulumi:"namespaceName"`
}

// The set of arguments for constructing a Namespace resource.
type NamespaceArgs struct {
	// Specifies whether to enable remote debugging.
	DebugEnable pulumi.BoolPtrInput
	// The description of the namespace, The description can be up to `128` characters in length.
	Description pulumi.StringPtrInput
	// The ID of the namespace.
	// - The ID of a custom namespace is in the `region ID:namespace identifier` format. An example is `cn-beijing:tdy218`.
	// - The ID of the default namespace is in the `region ID` format. An example is cn-beijing.
	NamespaceLogicalId pulumi.StringInput
	// The name of the namespace, The name can be up to `63` characters in length.
	NamespaceName pulumi.StringInput
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

// Specifies whether to enable remote debugging.
func (o NamespaceOutput) DebugEnable() pulumi.BoolOutput {
	return o.ApplyT(func(v *Namespace) pulumi.BoolOutput { return v.DebugEnable }).(pulumi.BoolOutput)
}

// The description of the namespace, The description can be up to `128` characters in length.
func (o NamespaceOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Namespace) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ID of the namespace.
// - The ID of a custom namespace is in the `region ID:namespace identifier` format. An example is `cn-beijing:tdy218`.
// - The ID of the default namespace is in the `region ID` format. An example is cn-beijing.
func (o NamespaceOutput) NamespaceLogicalId() pulumi.StringOutput {
	return o.ApplyT(func(v *Namespace) pulumi.StringOutput { return v.NamespaceLogicalId }).(pulumi.StringOutput)
}

// The name of the namespace, The name can be up to `63` characters in length.
func (o NamespaceOutput) NamespaceName() pulumi.StringOutput {
	return o.ApplyT(func(v *Namespace) pulumi.StringOutput { return v.NamespaceName }).(pulumi.StringOutput)
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
