// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package kms

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Create an alias for the master key (CMK).
//
// > **NOTE:** Available in v1.77.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/kms"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		thisKey, err := kms.NewKey(ctx, "thisKey", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = kms.NewAlias(ctx, "thisAlias", &kms.AliasArgs{
// 			AliasName: pulumi.String("alias/test_kms_alias"),
// 			KeyId:     thisKey.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// KMS alias can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:kms/alias:Alias example alias/test_kms_alias
// ```
type Alias struct {
	pulumi.CustomResourceState

	// The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
	AliasName pulumi.StringOutput `pulumi:"aliasName"`
	// The id of the key.
	KeyId pulumi.StringOutput `pulumi:"keyId"`
}

// NewAlias registers a new resource with the given unique name, arguments, and options.
func NewAlias(ctx *pulumi.Context,
	name string, args *AliasArgs, opts ...pulumi.ResourceOption) (*Alias, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AliasName == nil {
		return nil, errors.New("invalid value for required argument 'AliasName'")
	}
	if args.KeyId == nil {
		return nil, errors.New("invalid value for required argument 'KeyId'")
	}
	var resource Alias
	err := ctx.RegisterResource("alicloud:kms/alias:Alias", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlias gets an existing Alias resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlias(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AliasState, opts ...pulumi.ResourceOption) (*Alias, error) {
	var resource Alias
	err := ctx.ReadResource("alicloud:kms/alias:Alias", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Alias resources.
type aliasState struct {
	// The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
	AliasName *string `pulumi:"aliasName"`
	// The id of the key.
	KeyId *string `pulumi:"keyId"`
}

type AliasState struct {
	// The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
	AliasName pulumi.StringPtrInput
	// The id of the key.
	KeyId pulumi.StringPtrInput
}

func (AliasState) ElementType() reflect.Type {
	return reflect.TypeOf((*aliasState)(nil)).Elem()
}

type aliasArgs struct {
	// The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
	AliasName string `pulumi:"aliasName"`
	// The id of the key.
	KeyId string `pulumi:"keyId"`
}

// The set of arguments for constructing a Alias resource.
type AliasArgs struct {
	// The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
	AliasName pulumi.StringInput
	// The id of the key.
	KeyId pulumi.StringInput
}

func (AliasArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aliasArgs)(nil)).Elem()
}

type AliasInput interface {
	pulumi.Input

	ToAliasOutput() AliasOutput
	ToAliasOutputWithContext(ctx context.Context) AliasOutput
}

func (*Alias) ElementType() reflect.Type {
	return reflect.TypeOf((**Alias)(nil)).Elem()
}

func (i *Alias) ToAliasOutput() AliasOutput {
	return i.ToAliasOutputWithContext(context.Background())
}

func (i *Alias) ToAliasOutputWithContext(ctx context.Context) AliasOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AliasOutput)
}

// AliasArrayInput is an input type that accepts AliasArray and AliasArrayOutput values.
// You can construct a concrete instance of `AliasArrayInput` via:
//
//          AliasArray{ AliasArgs{...} }
type AliasArrayInput interface {
	pulumi.Input

	ToAliasArrayOutput() AliasArrayOutput
	ToAliasArrayOutputWithContext(context.Context) AliasArrayOutput
}

type AliasArray []AliasInput

func (AliasArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Alias)(nil)).Elem()
}

func (i AliasArray) ToAliasArrayOutput() AliasArrayOutput {
	return i.ToAliasArrayOutputWithContext(context.Background())
}

func (i AliasArray) ToAliasArrayOutputWithContext(ctx context.Context) AliasArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AliasArrayOutput)
}

// AliasMapInput is an input type that accepts AliasMap and AliasMapOutput values.
// You can construct a concrete instance of `AliasMapInput` via:
//
//          AliasMap{ "key": AliasArgs{...} }
type AliasMapInput interface {
	pulumi.Input

	ToAliasMapOutput() AliasMapOutput
	ToAliasMapOutputWithContext(context.Context) AliasMapOutput
}

type AliasMap map[string]AliasInput

func (AliasMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Alias)(nil)).Elem()
}

func (i AliasMap) ToAliasMapOutput() AliasMapOutput {
	return i.ToAliasMapOutputWithContext(context.Background())
}

func (i AliasMap) ToAliasMapOutputWithContext(ctx context.Context) AliasMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AliasMapOutput)
}

type AliasOutput struct{ *pulumi.OutputState }

func (AliasOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Alias)(nil)).Elem()
}

func (o AliasOutput) ToAliasOutput() AliasOutput {
	return o
}

func (o AliasOutput) ToAliasOutputWithContext(ctx context.Context) AliasOutput {
	return o
}

type AliasArrayOutput struct{ *pulumi.OutputState }

func (AliasArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Alias)(nil)).Elem()
}

func (o AliasArrayOutput) ToAliasArrayOutput() AliasArrayOutput {
	return o
}

func (o AliasArrayOutput) ToAliasArrayOutputWithContext(ctx context.Context) AliasArrayOutput {
	return o
}

func (o AliasArrayOutput) Index(i pulumi.IntInput) AliasOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Alias {
		return vs[0].([]*Alias)[vs[1].(int)]
	}).(AliasOutput)
}

type AliasMapOutput struct{ *pulumi.OutputState }

func (AliasMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Alias)(nil)).Elem()
}

func (o AliasMapOutput) ToAliasMapOutput() AliasMapOutput {
	return o
}

func (o AliasMapOutput) ToAliasMapOutputWithContext(ctx context.Context) AliasMapOutput {
	return o
}

func (o AliasMapOutput) MapIndex(k pulumi.StringInput) AliasOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Alias {
		return vs[0].(map[string]*Alias)[vs[1].(string)]
	}).(AliasOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AliasInput)(nil)).Elem(), &Alias{})
	pulumi.RegisterInputType(reflect.TypeOf((*AliasArrayInput)(nil)).Elem(), AliasArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AliasMapInput)(nil)).Elem(), AliasMap{})
	pulumi.RegisterOutputType(AliasOutput{})
	pulumi.RegisterOutputType(AliasArrayOutput{})
	pulumi.RegisterOutputType(AliasMapOutput{})
}
