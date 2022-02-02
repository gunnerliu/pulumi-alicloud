// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package kms

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resouce used to create a secret and store its initial version.
//
// > **NOTE:** Available in 1.76.0+.
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
// 		_, err := kms.NewSecret(ctx, "default", &kms.SecretArgs{
// 			Description:                pulumi.String("from terraform"),
// 			ForceDeleteWithoutRecovery: pulumi.Bool(true),
// 			SecretData:                 pulumi.String("Secret data."),
// 			SecretName:                 pulumi.String("secret-foo"),
// 			VersionId:                  pulumi.String("000000000001"),
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
// KMS secret can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:kms/secret:Secret default secret-foo
// ```
type Secret struct {
	pulumi.CustomResourceState

	// The Alicloud Resource Name (ARN) of the secret.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The description of the secret.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether to enable automatic key rotation.
	EnableAutomaticRotation pulumi.BoolPtrOutput `pulumi:"enableAutomaticRotation"`
	// The ID of the KMS CMK that is used to encrypt the secret value. If you do not specify this parameter, Secrets Manager automatically creates an encryption key to encrypt the secret.
	EncryptionKeyId pulumi.StringPtrOutput `pulumi:"encryptionKeyId"`
	// Specifies whether to forcibly delete the secret. If this parameter is set to true, the secret cannot be recovered. Valid values: true, false. Default to: false.
	ForceDeleteWithoutRecovery pulumi.BoolPtrOutput `pulumi:"forceDeleteWithoutRecovery"`
	// The time when the secret is scheduled to be deleted.
	PlannedDeleteTime pulumi.StringOutput `pulumi:"plannedDeleteTime"`
	// Specifies the recovery period of the secret if you do not forcibly delete it. Default value: 30. It will be ignored when `forceDeleteWithoutRecovery` is true.
	RecoveryWindowInDays pulumi.IntPtrOutput `pulumi:"recoveryWindowInDays"`
	// The time period of automatic rotation. The format is integer[unit], where integer represents the length of time, and unit represents the unit of time. The legal unit units are: d (day), h (hour), m (minute), s (second). 7d or 604800s both indicate a 7-day cycle.
	RotationInterval pulumi.StringPtrOutput `pulumi:"rotationInterval"`
	// The value of the secret that you want to create. Secrets Manager encrypts the secret value and stores it in the initial version.
	SecretData pulumi.StringOutput `pulumi:"secretData"`
	// The type of the secret value. Valid values: text, binary. Default to "text".
	SecretDataType pulumi.StringPtrOutput `pulumi:"secretDataType"`
	// The name of the secret.
	SecretName pulumi.StringOutput `pulumi:"secretName"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The version number of the initial version. Version numbers are unique in each secret object.
	VersionId pulumi.StringOutput `pulumi:"versionId"`
	// ) The stage labels that mark the new secret version. If you do not specify this parameter, Secrets Manager marks it with "ACSCurrent".
	VersionStages pulumi.StringArrayOutput `pulumi:"versionStages"`
}

// NewSecret registers a new resource with the given unique name, arguments, and options.
func NewSecret(ctx *pulumi.Context,
	name string, args *SecretArgs, opts ...pulumi.ResourceOption) (*Secret, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SecretData == nil {
		return nil, errors.New("invalid value for required argument 'SecretData'")
	}
	if args.SecretName == nil {
		return nil, errors.New("invalid value for required argument 'SecretName'")
	}
	if args.VersionId == nil {
		return nil, errors.New("invalid value for required argument 'VersionId'")
	}
	var resource Secret
	err := ctx.RegisterResource("alicloud:kms/secret:Secret", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecret gets an existing Secret resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecret(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretState, opts ...pulumi.ResourceOption) (*Secret, error) {
	var resource Secret
	err := ctx.ReadResource("alicloud:kms/secret:Secret", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Secret resources.
type secretState struct {
	// The Alicloud Resource Name (ARN) of the secret.
	Arn *string `pulumi:"arn"`
	// The description of the secret.
	Description *string `pulumi:"description"`
	// Whether to enable automatic key rotation.
	EnableAutomaticRotation *bool `pulumi:"enableAutomaticRotation"`
	// The ID of the KMS CMK that is used to encrypt the secret value. If you do not specify this parameter, Secrets Manager automatically creates an encryption key to encrypt the secret.
	EncryptionKeyId *string `pulumi:"encryptionKeyId"`
	// Specifies whether to forcibly delete the secret. If this parameter is set to true, the secret cannot be recovered. Valid values: true, false. Default to: false.
	ForceDeleteWithoutRecovery *bool `pulumi:"forceDeleteWithoutRecovery"`
	// The time when the secret is scheduled to be deleted.
	PlannedDeleteTime *string `pulumi:"plannedDeleteTime"`
	// Specifies the recovery period of the secret if you do not forcibly delete it. Default value: 30. It will be ignored when `forceDeleteWithoutRecovery` is true.
	RecoveryWindowInDays *int `pulumi:"recoveryWindowInDays"`
	// The time period of automatic rotation. The format is integer[unit], where integer represents the length of time, and unit represents the unit of time. The legal unit units are: d (day), h (hour), m (minute), s (second). 7d or 604800s both indicate a 7-day cycle.
	RotationInterval *string `pulumi:"rotationInterval"`
	// The value of the secret that you want to create. Secrets Manager encrypts the secret value and stores it in the initial version.
	SecretData *string `pulumi:"secretData"`
	// The type of the secret value. Valid values: text, binary. Default to "text".
	SecretDataType *string `pulumi:"secretDataType"`
	// The name of the secret.
	SecretName *string `pulumi:"secretName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The version number of the initial version. Version numbers are unique in each secret object.
	VersionId *string `pulumi:"versionId"`
	// ) The stage labels that mark the new secret version. If you do not specify this parameter, Secrets Manager marks it with "ACSCurrent".
	VersionStages []string `pulumi:"versionStages"`
}

type SecretState struct {
	// The Alicloud Resource Name (ARN) of the secret.
	Arn pulumi.StringPtrInput
	// The description of the secret.
	Description pulumi.StringPtrInput
	// Whether to enable automatic key rotation.
	EnableAutomaticRotation pulumi.BoolPtrInput
	// The ID of the KMS CMK that is used to encrypt the secret value. If you do not specify this parameter, Secrets Manager automatically creates an encryption key to encrypt the secret.
	EncryptionKeyId pulumi.StringPtrInput
	// Specifies whether to forcibly delete the secret. If this parameter is set to true, the secret cannot be recovered. Valid values: true, false. Default to: false.
	ForceDeleteWithoutRecovery pulumi.BoolPtrInput
	// The time when the secret is scheduled to be deleted.
	PlannedDeleteTime pulumi.StringPtrInput
	// Specifies the recovery period of the secret if you do not forcibly delete it. Default value: 30. It will be ignored when `forceDeleteWithoutRecovery` is true.
	RecoveryWindowInDays pulumi.IntPtrInput
	// The time period of automatic rotation. The format is integer[unit], where integer represents the length of time, and unit represents the unit of time. The legal unit units are: d (day), h (hour), m (minute), s (second). 7d or 604800s both indicate a 7-day cycle.
	RotationInterval pulumi.StringPtrInput
	// The value of the secret that you want to create. Secrets Manager encrypts the secret value and stores it in the initial version.
	SecretData pulumi.StringPtrInput
	// The type of the secret value. Valid values: text, binary. Default to "text".
	SecretDataType pulumi.StringPtrInput
	// The name of the secret.
	SecretName pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The version number of the initial version. Version numbers are unique in each secret object.
	VersionId pulumi.StringPtrInput
	// ) The stage labels that mark the new secret version. If you do not specify this parameter, Secrets Manager marks it with "ACSCurrent".
	VersionStages pulumi.StringArrayInput
}

func (SecretState) ElementType() reflect.Type {
	return reflect.TypeOf((*secretState)(nil)).Elem()
}

type secretArgs struct {
	// The description of the secret.
	Description *string `pulumi:"description"`
	// Whether to enable automatic key rotation.
	EnableAutomaticRotation *bool `pulumi:"enableAutomaticRotation"`
	// The ID of the KMS CMK that is used to encrypt the secret value. If you do not specify this parameter, Secrets Manager automatically creates an encryption key to encrypt the secret.
	EncryptionKeyId *string `pulumi:"encryptionKeyId"`
	// Specifies whether to forcibly delete the secret. If this parameter is set to true, the secret cannot be recovered. Valid values: true, false. Default to: false.
	ForceDeleteWithoutRecovery *bool `pulumi:"forceDeleteWithoutRecovery"`
	// Specifies the recovery period of the secret if you do not forcibly delete it. Default value: 30. It will be ignored when `forceDeleteWithoutRecovery` is true.
	RecoveryWindowInDays *int `pulumi:"recoveryWindowInDays"`
	// The time period of automatic rotation. The format is integer[unit], where integer represents the length of time, and unit represents the unit of time. The legal unit units are: d (day), h (hour), m (minute), s (second). 7d or 604800s both indicate a 7-day cycle.
	RotationInterval *string `pulumi:"rotationInterval"`
	// The value of the secret that you want to create. Secrets Manager encrypts the secret value and stores it in the initial version.
	SecretData string `pulumi:"secretData"`
	// The type of the secret value. Valid values: text, binary. Default to "text".
	SecretDataType *string `pulumi:"secretDataType"`
	// The name of the secret.
	SecretName string `pulumi:"secretName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The version number of the initial version. Version numbers are unique in each secret object.
	VersionId string `pulumi:"versionId"`
	// ) The stage labels that mark the new secret version. If you do not specify this parameter, Secrets Manager marks it with "ACSCurrent".
	VersionStages []string `pulumi:"versionStages"`
}

// The set of arguments for constructing a Secret resource.
type SecretArgs struct {
	// The description of the secret.
	Description pulumi.StringPtrInput
	// Whether to enable automatic key rotation.
	EnableAutomaticRotation pulumi.BoolPtrInput
	// The ID of the KMS CMK that is used to encrypt the secret value. If you do not specify this parameter, Secrets Manager automatically creates an encryption key to encrypt the secret.
	EncryptionKeyId pulumi.StringPtrInput
	// Specifies whether to forcibly delete the secret. If this parameter is set to true, the secret cannot be recovered. Valid values: true, false. Default to: false.
	ForceDeleteWithoutRecovery pulumi.BoolPtrInput
	// Specifies the recovery period of the secret if you do not forcibly delete it. Default value: 30. It will be ignored when `forceDeleteWithoutRecovery` is true.
	RecoveryWindowInDays pulumi.IntPtrInput
	// The time period of automatic rotation. The format is integer[unit], where integer represents the length of time, and unit represents the unit of time. The legal unit units are: d (day), h (hour), m (minute), s (second). 7d or 604800s both indicate a 7-day cycle.
	RotationInterval pulumi.StringPtrInput
	// The value of the secret that you want to create. Secrets Manager encrypts the secret value and stores it in the initial version.
	SecretData pulumi.StringInput
	// The type of the secret value. Valid values: text, binary. Default to "text".
	SecretDataType pulumi.StringPtrInput
	// The name of the secret.
	SecretName pulumi.StringInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The version number of the initial version. Version numbers are unique in each secret object.
	VersionId pulumi.StringInput
	// ) The stage labels that mark the new secret version. If you do not specify this parameter, Secrets Manager marks it with "ACSCurrent".
	VersionStages pulumi.StringArrayInput
}

func (SecretArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secretArgs)(nil)).Elem()
}

type SecretInput interface {
	pulumi.Input

	ToSecretOutput() SecretOutput
	ToSecretOutputWithContext(ctx context.Context) SecretOutput
}

func (*Secret) ElementType() reflect.Type {
	return reflect.TypeOf((**Secret)(nil)).Elem()
}

func (i *Secret) ToSecretOutput() SecretOutput {
	return i.ToSecretOutputWithContext(context.Background())
}

func (i *Secret) ToSecretOutputWithContext(ctx context.Context) SecretOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretOutput)
}

// SecretArrayInput is an input type that accepts SecretArray and SecretArrayOutput values.
// You can construct a concrete instance of `SecretArrayInput` via:
//
//          SecretArray{ SecretArgs{...} }
type SecretArrayInput interface {
	pulumi.Input

	ToSecretArrayOutput() SecretArrayOutput
	ToSecretArrayOutputWithContext(context.Context) SecretArrayOutput
}

type SecretArray []SecretInput

func (SecretArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Secret)(nil)).Elem()
}

func (i SecretArray) ToSecretArrayOutput() SecretArrayOutput {
	return i.ToSecretArrayOutputWithContext(context.Background())
}

func (i SecretArray) ToSecretArrayOutputWithContext(ctx context.Context) SecretArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretArrayOutput)
}

// SecretMapInput is an input type that accepts SecretMap and SecretMapOutput values.
// You can construct a concrete instance of `SecretMapInput` via:
//
//          SecretMap{ "key": SecretArgs{...} }
type SecretMapInput interface {
	pulumi.Input

	ToSecretMapOutput() SecretMapOutput
	ToSecretMapOutputWithContext(context.Context) SecretMapOutput
}

type SecretMap map[string]SecretInput

func (SecretMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Secret)(nil)).Elem()
}

func (i SecretMap) ToSecretMapOutput() SecretMapOutput {
	return i.ToSecretMapOutputWithContext(context.Background())
}

func (i SecretMap) ToSecretMapOutputWithContext(ctx context.Context) SecretMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretMapOutput)
}

type SecretOutput struct{ *pulumi.OutputState }

func (SecretOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Secret)(nil)).Elem()
}

func (o SecretOutput) ToSecretOutput() SecretOutput {
	return o
}

func (o SecretOutput) ToSecretOutputWithContext(ctx context.Context) SecretOutput {
	return o
}

type SecretArrayOutput struct{ *pulumi.OutputState }

func (SecretArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Secret)(nil)).Elem()
}

func (o SecretArrayOutput) ToSecretArrayOutput() SecretArrayOutput {
	return o
}

func (o SecretArrayOutput) ToSecretArrayOutputWithContext(ctx context.Context) SecretArrayOutput {
	return o
}

func (o SecretArrayOutput) Index(i pulumi.IntInput) SecretOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Secret {
		return vs[0].([]*Secret)[vs[1].(int)]
	}).(SecretOutput)
}

type SecretMapOutput struct{ *pulumi.OutputState }

func (SecretMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Secret)(nil)).Elem()
}

func (o SecretMapOutput) ToSecretMapOutput() SecretMapOutput {
	return o
}

func (o SecretMapOutput) ToSecretMapOutputWithContext(ctx context.Context) SecretMapOutput {
	return o
}

func (o SecretMapOutput) MapIndex(k pulumi.StringInput) SecretOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Secret {
		return vs[0].(map[string]*Secret)[vs[1].(string)]
	}).(SecretOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecretInput)(nil)).Elem(), &Secret{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretArrayInput)(nil)).Elem(), SecretArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretMapInput)(nil)).Elem(), SecretMap{})
	pulumi.RegisterOutputType(SecretOutput{})
	pulumi.RegisterOutputType(SecretArrayOutput{})
	pulumi.RegisterOutputType(SecretMapOutput{})
}
