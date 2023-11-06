// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kms

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/kms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			key, err := kms.NewKey(ctx, "key", &kms.KeyArgs{
//				Description: pulumi.String("example key"),
//				IsEnabled:   pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = kms.NewCiphertext(ctx, "encrypted", &kms.CiphertextArgs{
//				KeyId:     key.ID(),
//				Plaintext: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type Ciphertext struct {
	pulumi.CustomResourceState

	// The ciphertext of the data key encrypted with the primary CMK version.
	CiphertextBlob pulumi.StringOutput `pulumi:"ciphertextBlob"`
	// The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
	EncryptionContext pulumi.StringMapOutput `pulumi:"encryptionContext"`
	// The globally unique ID of the CMK.
	KeyId pulumi.StringOutput `pulumi:"keyId"`
	// The plaintext to be encrypted which must be encoded in Base64.
	Plaintext pulumi.StringOutput `pulumi:"plaintext"`
}

// NewCiphertext registers a new resource with the given unique name, arguments, and options.
func NewCiphertext(ctx *pulumi.Context,
	name string, args *CiphertextArgs, opts ...pulumi.ResourceOption) (*Ciphertext, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.KeyId == nil {
		return nil, errors.New("invalid value for required argument 'KeyId'")
	}
	if args.Plaintext == nil {
		return nil, errors.New("invalid value for required argument 'Plaintext'")
	}
	if args.Plaintext != nil {
		args.Plaintext = pulumi.ToSecret(args.Plaintext).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"plaintext",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Ciphertext
	err := ctx.RegisterResource("alicloud:kms/ciphertext:Ciphertext", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCiphertext gets an existing Ciphertext resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCiphertext(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CiphertextState, opts ...pulumi.ResourceOption) (*Ciphertext, error) {
	var resource Ciphertext
	err := ctx.ReadResource("alicloud:kms/ciphertext:Ciphertext", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ciphertext resources.
type ciphertextState struct {
	// The ciphertext of the data key encrypted with the primary CMK version.
	CiphertextBlob *string `pulumi:"ciphertextBlob"`
	// The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
	EncryptionContext map[string]string `pulumi:"encryptionContext"`
	// The globally unique ID of the CMK.
	KeyId *string `pulumi:"keyId"`
	// The plaintext to be encrypted which must be encoded in Base64.
	Plaintext *string `pulumi:"plaintext"`
}

type CiphertextState struct {
	// The ciphertext of the data key encrypted with the primary CMK version.
	CiphertextBlob pulumi.StringPtrInput
	// The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
	EncryptionContext pulumi.StringMapInput
	// The globally unique ID of the CMK.
	KeyId pulumi.StringPtrInput
	// The plaintext to be encrypted which must be encoded in Base64.
	Plaintext pulumi.StringPtrInput
}

func (CiphertextState) ElementType() reflect.Type {
	return reflect.TypeOf((*ciphertextState)(nil)).Elem()
}

type ciphertextArgs struct {
	// The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
	EncryptionContext map[string]string `pulumi:"encryptionContext"`
	// The globally unique ID of the CMK.
	KeyId string `pulumi:"keyId"`
	// The plaintext to be encrypted which must be encoded in Base64.
	Plaintext string `pulumi:"plaintext"`
}

// The set of arguments for constructing a Ciphertext resource.
type CiphertextArgs struct {
	// The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
	EncryptionContext pulumi.StringMapInput
	// The globally unique ID of the CMK.
	KeyId pulumi.StringInput
	// The plaintext to be encrypted which must be encoded in Base64.
	Plaintext pulumi.StringInput
}

func (CiphertextArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ciphertextArgs)(nil)).Elem()
}

type CiphertextInput interface {
	pulumi.Input

	ToCiphertextOutput() CiphertextOutput
	ToCiphertextOutputWithContext(ctx context.Context) CiphertextOutput
}

func (*Ciphertext) ElementType() reflect.Type {
	return reflect.TypeOf((**Ciphertext)(nil)).Elem()
}

func (i *Ciphertext) ToCiphertextOutput() CiphertextOutput {
	return i.ToCiphertextOutputWithContext(context.Background())
}

func (i *Ciphertext) ToCiphertextOutputWithContext(ctx context.Context) CiphertextOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CiphertextOutput)
}

// CiphertextArrayInput is an input type that accepts CiphertextArray and CiphertextArrayOutput values.
// You can construct a concrete instance of `CiphertextArrayInput` via:
//
//	CiphertextArray{ CiphertextArgs{...} }
type CiphertextArrayInput interface {
	pulumi.Input

	ToCiphertextArrayOutput() CiphertextArrayOutput
	ToCiphertextArrayOutputWithContext(context.Context) CiphertextArrayOutput
}

type CiphertextArray []CiphertextInput

func (CiphertextArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ciphertext)(nil)).Elem()
}

func (i CiphertextArray) ToCiphertextArrayOutput() CiphertextArrayOutput {
	return i.ToCiphertextArrayOutputWithContext(context.Background())
}

func (i CiphertextArray) ToCiphertextArrayOutputWithContext(ctx context.Context) CiphertextArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CiphertextArrayOutput)
}

// CiphertextMapInput is an input type that accepts CiphertextMap and CiphertextMapOutput values.
// You can construct a concrete instance of `CiphertextMapInput` via:
//
//	CiphertextMap{ "key": CiphertextArgs{...} }
type CiphertextMapInput interface {
	pulumi.Input

	ToCiphertextMapOutput() CiphertextMapOutput
	ToCiphertextMapOutputWithContext(context.Context) CiphertextMapOutput
}

type CiphertextMap map[string]CiphertextInput

func (CiphertextMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ciphertext)(nil)).Elem()
}

func (i CiphertextMap) ToCiphertextMapOutput() CiphertextMapOutput {
	return i.ToCiphertextMapOutputWithContext(context.Background())
}

func (i CiphertextMap) ToCiphertextMapOutputWithContext(ctx context.Context) CiphertextMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CiphertextMapOutput)
}

type CiphertextOutput struct{ *pulumi.OutputState }

func (CiphertextOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Ciphertext)(nil)).Elem()
}

func (o CiphertextOutput) ToCiphertextOutput() CiphertextOutput {
	return o
}

func (o CiphertextOutput) ToCiphertextOutputWithContext(ctx context.Context) CiphertextOutput {
	return o
}

// The ciphertext of the data key encrypted with the primary CMK version.
func (o CiphertextOutput) CiphertextBlob() pulumi.StringOutput {
	return o.ApplyT(func(v *Ciphertext) pulumi.StringOutput { return v.CiphertextBlob }).(pulumi.StringOutput)
}

// The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
func (o CiphertextOutput) EncryptionContext() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Ciphertext) pulumi.StringMapOutput { return v.EncryptionContext }).(pulumi.StringMapOutput)
}

// The globally unique ID of the CMK.
func (o CiphertextOutput) KeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *Ciphertext) pulumi.StringOutput { return v.KeyId }).(pulumi.StringOutput)
}

// The plaintext to be encrypted which must be encoded in Base64.
func (o CiphertextOutput) Plaintext() pulumi.StringOutput {
	return o.ApplyT(func(v *Ciphertext) pulumi.StringOutput { return v.Plaintext }).(pulumi.StringOutput)
}

type CiphertextArrayOutput struct{ *pulumi.OutputState }

func (CiphertextArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ciphertext)(nil)).Elem()
}

func (o CiphertextArrayOutput) ToCiphertextArrayOutput() CiphertextArrayOutput {
	return o
}

func (o CiphertextArrayOutput) ToCiphertextArrayOutputWithContext(ctx context.Context) CiphertextArrayOutput {
	return o
}

func (o CiphertextArrayOutput) Index(i pulumi.IntInput) CiphertextOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Ciphertext {
		return vs[0].([]*Ciphertext)[vs[1].(int)]
	}).(CiphertextOutput)
}

type CiphertextMapOutput struct{ *pulumi.OutputState }

func (CiphertextMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ciphertext)(nil)).Elem()
}

func (o CiphertextMapOutput) ToCiphertextMapOutput() CiphertextMapOutput {
	return o
}

func (o CiphertextMapOutput) ToCiphertextMapOutputWithContext(ctx context.Context) CiphertextMapOutput {
	return o
}

func (o CiphertextMapOutput) MapIndex(k pulumi.StringInput) CiphertextOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Ciphertext {
		return vs[0].(map[string]*Ciphertext)[vs[1].(string)]
	}).(CiphertextOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CiphertextInput)(nil)).Elem(), &Ciphertext{})
	pulumi.RegisterInputType(reflect.TypeOf((*CiphertextArrayInput)(nil)).Elem(), CiphertextArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CiphertextMapInput)(nil)).Elem(), CiphertextMap{})
	pulumi.RegisterOutputType(CiphertextOutput{})
	pulumi.RegisterOutputType(CiphertextArrayOutput{})
	pulumi.RegisterOutputType(CiphertextMapOutput{})
}
