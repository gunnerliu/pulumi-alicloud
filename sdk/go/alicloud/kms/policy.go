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

// Provides a KMS Policy resource. Permission policies which can be bound to the Application Access Points.
//
// For information about KMS Policy and how to use it, see [What is Policy](https://www.alibabacloud.com/help/zh/key-management-service/latest/api-createpolicy).
//
// > **NOTE:** Available since v1.210.0.
//
// ## Import
//
// KMS Policy can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:kms/policy:Policy example <id>
//
// ```
type Policy struct {
	pulumi.CustomResourceState

	// Network Rules in JSON struct.
	AccessControlRules pulumi.StringOutput `pulumi:"accessControlRules"`
	// Description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// KMS instance .
	KmsInstanceId pulumi.StringOutput `pulumi:"kmsInstanceId"`
	// Allowed permissions (RBAC)Optional values:"RbacPermission/Template/CryptoServiceKeyUser" and "RbacPermission/Template/CryptoServiceSecretUser".
	Permissions pulumi.StringArrayOutput `pulumi:"permissions"`
	// Policy Name.
	PolicyName pulumi.StringOutput `pulumi:"policyName"`
	// The resources that the permission policy allows to access.Use "key/${KeyId}" or "key/*"  to specify a key or all keys.Use "secret/${SecretName}" or "secret/*" to specify a secret or all secrets.
	Resources pulumi.StringArrayOutput `pulumi:"resources"`
}

// NewPolicy registers a new resource with the given unique name, arguments, and options.
func NewPolicy(ctx *pulumi.Context,
	name string, args *PolicyArgs, opts ...pulumi.ResourceOption) (*Policy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessControlRules == nil {
		return nil, errors.New("invalid value for required argument 'AccessControlRules'")
	}
	if args.KmsInstanceId == nil {
		return nil, errors.New("invalid value for required argument 'KmsInstanceId'")
	}
	if args.Permissions == nil {
		return nil, errors.New("invalid value for required argument 'Permissions'")
	}
	if args.PolicyName == nil {
		return nil, errors.New("invalid value for required argument 'PolicyName'")
	}
	if args.Resources == nil {
		return nil, errors.New("invalid value for required argument 'Resources'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Policy
	err := ctx.RegisterResource("alicloud:kms/policy:Policy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPolicy gets an existing Policy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PolicyState, opts ...pulumi.ResourceOption) (*Policy, error) {
	var resource Policy
	err := ctx.ReadResource("alicloud:kms/policy:Policy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Policy resources.
type policyState struct {
	// Network Rules in JSON struct.
	AccessControlRules *string `pulumi:"accessControlRules"`
	// Description.
	Description *string `pulumi:"description"`
	// KMS instance .
	KmsInstanceId *string `pulumi:"kmsInstanceId"`
	// Allowed permissions (RBAC)Optional values:"RbacPermission/Template/CryptoServiceKeyUser" and "RbacPermission/Template/CryptoServiceSecretUser".
	Permissions []string `pulumi:"permissions"`
	// Policy Name.
	PolicyName *string `pulumi:"policyName"`
	// The resources that the permission policy allows to access.Use "key/${KeyId}" or "key/*"  to specify a key or all keys.Use "secret/${SecretName}" or "secret/*" to specify a secret or all secrets.
	Resources []string `pulumi:"resources"`
}

type PolicyState struct {
	// Network Rules in JSON struct.
	AccessControlRules pulumi.StringPtrInput
	// Description.
	Description pulumi.StringPtrInput
	// KMS instance .
	KmsInstanceId pulumi.StringPtrInput
	// Allowed permissions (RBAC)Optional values:"RbacPermission/Template/CryptoServiceKeyUser" and "RbacPermission/Template/CryptoServiceSecretUser".
	Permissions pulumi.StringArrayInput
	// Policy Name.
	PolicyName pulumi.StringPtrInput
	// The resources that the permission policy allows to access.Use "key/${KeyId}" or "key/*"  to specify a key or all keys.Use "secret/${SecretName}" or "secret/*" to specify a secret or all secrets.
	Resources pulumi.StringArrayInput
}

func (PolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*policyState)(nil)).Elem()
}

type policyArgs struct {
	// Network Rules in JSON struct.
	AccessControlRules string `pulumi:"accessControlRules"`
	// Description.
	Description *string `pulumi:"description"`
	// KMS instance .
	KmsInstanceId string `pulumi:"kmsInstanceId"`
	// Allowed permissions (RBAC)Optional values:"RbacPermission/Template/CryptoServiceKeyUser" and "RbacPermission/Template/CryptoServiceSecretUser".
	Permissions []string `pulumi:"permissions"`
	// Policy Name.
	PolicyName string `pulumi:"policyName"`
	// The resources that the permission policy allows to access.Use "key/${KeyId}" or "key/*"  to specify a key or all keys.Use "secret/${SecretName}" or "secret/*" to specify a secret or all secrets.
	Resources []string `pulumi:"resources"`
}

// The set of arguments for constructing a Policy resource.
type PolicyArgs struct {
	// Network Rules in JSON struct.
	AccessControlRules pulumi.StringInput
	// Description.
	Description pulumi.StringPtrInput
	// KMS instance .
	KmsInstanceId pulumi.StringInput
	// Allowed permissions (RBAC)Optional values:"RbacPermission/Template/CryptoServiceKeyUser" and "RbacPermission/Template/CryptoServiceSecretUser".
	Permissions pulumi.StringArrayInput
	// Policy Name.
	PolicyName pulumi.StringInput
	// The resources that the permission policy allows to access.Use "key/${KeyId}" or "key/*"  to specify a key or all keys.Use "secret/${SecretName}" or "secret/*" to specify a secret or all secrets.
	Resources pulumi.StringArrayInput
}

func (PolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*policyArgs)(nil)).Elem()
}

type PolicyInput interface {
	pulumi.Input

	ToPolicyOutput() PolicyOutput
	ToPolicyOutputWithContext(ctx context.Context) PolicyOutput
}

func (*Policy) ElementType() reflect.Type {
	return reflect.TypeOf((**Policy)(nil)).Elem()
}

func (i *Policy) ToPolicyOutput() PolicyOutput {
	return i.ToPolicyOutputWithContext(context.Background())
}

func (i *Policy) ToPolicyOutputWithContext(ctx context.Context) PolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyOutput)
}

// PolicyArrayInput is an input type that accepts PolicyArray and PolicyArrayOutput values.
// You can construct a concrete instance of `PolicyArrayInput` via:
//
//	PolicyArray{ PolicyArgs{...} }
type PolicyArrayInput interface {
	pulumi.Input

	ToPolicyArrayOutput() PolicyArrayOutput
	ToPolicyArrayOutputWithContext(context.Context) PolicyArrayOutput
}

type PolicyArray []PolicyInput

func (PolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Policy)(nil)).Elem()
}

func (i PolicyArray) ToPolicyArrayOutput() PolicyArrayOutput {
	return i.ToPolicyArrayOutputWithContext(context.Background())
}

func (i PolicyArray) ToPolicyArrayOutputWithContext(ctx context.Context) PolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyArrayOutput)
}

// PolicyMapInput is an input type that accepts PolicyMap and PolicyMapOutput values.
// You can construct a concrete instance of `PolicyMapInput` via:
//
//	PolicyMap{ "key": PolicyArgs{...} }
type PolicyMapInput interface {
	pulumi.Input

	ToPolicyMapOutput() PolicyMapOutput
	ToPolicyMapOutputWithContext(context.Context) PolicyMapOutput
}

type PolicyMap map[string]PolicyInput

func (PolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Policy)(nil)).Elem()
}

func (i PolicyMap) ToPolicyMapOutput() PolicyMapOutput {
	return i.ToPolicyMapOutputWithContext(context.Background())
}

func (i PolicyMap) ToPolicyMapOutputWithContext(ctx context.Context) PolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyMapOutput)
}

type PolicyOutput struct{ *pulumi.OutputState }

func (PolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Policy)(nil)).Elem()
}

func (o PolicyOutput) ToPolicyOutput() PolicyOutput {
	return o
}

func (o PolicyOutput) ToPolicyOutputWithContext(ctx context.Context) PolicyOutput {
	return o
}

// Network Rules in JSON struct.
func (o PolicyOutput) AccessControlRules() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.AccessControlRules }).(pulumi.StringOutput)
}

// Description.
func (o PolicyOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// KMS instance .
func (o PolicyOutput) KmsInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.KmsInstanceId }).(pulumi.StringOutput)
}

// Allowed permissions (RBAC)Optional values:"RbacPermission/Template/CryptoServiceKeyUser" and "RbacPermission/Template/CryptoServiceSecretUser".
func (o PolicyOutput) Permissions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringArrayOutput { return v.Permissions }).(pulumi.StringArrayOutput)
}

// Policy Name.
func (o PolicyOutput) PolicyName() pulumi.StringOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringOutput { return v.PolicyName }).(pulumi.StringOutput)
}

// The resources that the permission policy allows to access.Use "key/${KeyId}" or "key/*"  to specify a key or all keys.Use "secret/${SecretName}" or "secret/*" to specify a secret or all secrets.
func (o PolicyOutput) Resources() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Policy) pulumi.StringArrayOutput { return v.Resources }).(pulumi.StringArrayOutput)
}

type PolicyArrayOutput struct{ *pulumi.OutputState }

func (PolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Policy)(nil)).Elem()
}

func (o PolicyArrayOutput) ToPolicyArrayOutput() PolicyArrayOutput {
	return o
}

func (o PolicyArrayOutput) ToPolicyArrayOutputWithContext(ctx context.Context) PolicyArrayOutput {
	return o
}

func (o PolicyArrayOutput) Index(i pulumi.IntInput) PolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Policy {
		return vs[0].([]*Policy)[vs[1].(int)]
	}).(PolicyOutput)
}

type PolicyMapOutput struct{ *pulumi.OutputState }

func (PolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Policy)(nil)).Elem()
}

func (o PolicyMapOutput) ToPolicyMapOutput() PolicyMapOutput {
	return o
}

func (o PolicyMapOutput) ToPolicyMapOutputWithContext(ctx context.Context) PolicyMapOutput {
	return o
}

func (o PolicyMapOutput) MapIndex(k pulumi.StringInput) PolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Policy {
		return vs[0].(map[string]*Policy)[vs[1].(string)]
	}).(PolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyInput)(nil)).Elem(), &Policy{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyArrayInput)(nil)).Elem(), PolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicyMapInput)(nil)).Elem(), PolicyMap{})
	pulumi.RegisterOutputType(PolicyOutput{})
	pulumi.RegisterOutputType(PolicyArrayOutput{})
	pulumi.RegisterOutputType(PolicyMapOutput{})
}
