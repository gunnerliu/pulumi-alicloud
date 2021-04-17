// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ram

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// RAM policy can be imported using the id or name, e.g.
//
// ```sh
//  $ pulumi import alicloud:ram/policy:Policy example my-policy
// ```
type Policy struct {
	pulumi.CustomResourceState

	// The policy attachment count.
	AttachmentCount pulumi.IntOutput `pulumi:"attachmentCount"`
	// The default version of policy.
	DefaultVersion pulumi.StringOutput `pulumi:"defaultVersion"`
	// Description of the RAM policy. This name can have a string of 1 to 1024 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// It has been deprecated from provider version 1.114.0 and `policyDocument` instead.
	//
	// Deprecated: Field 'document' has been deprecated from provider version 1.114.0. New field 'policy_document' instead.
	Document pulumi.StringOutput `pulumi:"document"`
	// This parameter is used for resource destroy. Default value is `false`.
	Force pulumi.BoolPtrOutput `pulumi:"force"`
	// It has been deprecated from provider version 1.114.0 and `policyName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.114.0. New field 'policy_name' instead.
	Name pulumi.StringOutput `pulumi:"name"`
	// Document of the RAM policy. It is required when the `statement` is not specified.
	PolicyDocument pulumi.StringOutput `pulumi:"policyDocument"`
	// Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	PolicyName pulumi.StringOutput `pulumi:"policyName"`
	// The rotation strategy of the policy. You can use this parameter to delete an early policy version. Valid Values: `None`, `DeleteOldestNonDefaultVersionWhenLimitExceeded`. Default to `None`.
	RotateStrategy pulumi.StringPtrOutput `pulumi:"rotateStrategy"`
	// (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Statements of the RAM policy document. It is required when the `document` is not specified.
	//
	// Deprecated: Field 'statement' has been deprecated from version 1.49.0, and use field 'document' to replace.
	Statements PolicyStatementArrayOutput `pulumi:"statements"`
	// The policy type.
	Type pulumi.StringOutput `pulumi:"type"`
	// (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Version of the RAM policy document. Valid value is `1`. Default value is `1`.
	//
	// Deprecated: Field 'version' has been deprecated from version 1.49.0, and use field 'document' to replace.
	Version pulumi.StringPtrOutput `pulumi:"version"`
	// The ID of default version policy.
	VersionId pulumi.StringOutput `pulumi:"versionId"`
}

// NewPolicy registers a new resource with the given unique name, arguments, and options.
func NewPolicy(ctx *pulumi.Context,
	name string, args *PolicyArgs, opts ...pulumi.ResourceOption) (*Policy, error) {
	if args == nil {
		args = &PolicyArgs{}
	}

	var resource Policy
	err := ctx.RegisterResource("alicloud:ram/policy:Policy", name, args, &resource, opts...)
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
	err := ctx.ReadResource("alicloud:ram/policy:Policy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Policy resources.
type policyState struct {
	// The policy attachment count.
	AttachmentCount *int `pulumi:"attachmentCount"`
	// The default version of policy.
	DefaultVersion *string `pulumi:"defaultVersion"`
	// Description of the RAM policy. This name can have a string of 1 to 1024 characters.
	Description *string `pulumi:"description"`
	// It has been deprecated from provider version 1.114.0 and `policyDocument` instead.
	//
	// Deprecated: Field 'document' has been deprecated from provider version 1.114.0. New field 'policy_document' instead.
	Document *string `pulumi:"document"`
	// This parameter is used for resource destroy. Default value is `false`.
	Force *bool `pulumi:"force"`
	// It has been deprecated from provider version 1.114.0 and `policyName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.114.0. New field 'policy_name' instead.
	Name *string `pulumi:"name"`
	// Document of the RAM policy. It is required when the `statement` is not specified.
	PolicyDocument *string `pulumi:"policyDocument"`
	// Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	PolicyName *string `pulumi:"policyName"`
	// The rotation strategy of the policy. You can use this parameter to delete an early policy version. Valid Values: `None`, `DeleteOldestNonDefaultVersionWhenLimitExceeded`. Default to `None`.
	RotateStrategy *string `pulumi:"rotateStrategy"`
	// (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Statements of the RAM policy document. It is required when the `document` is not specified.
	//
	// Deprecated: Field 'statement' has been deprecated from version 1.49.0, and use field 'document' to replace.
	Statements []PolicyStatement `pulumi:"statements"`
	// The policy type.
	Type *string `pulumi:"type"`
	// (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Version of the RAM policy document. Valid value is `1`. Default value is `1`.
	//
	// Deprecated: Field 'version' has been deprecated from version 1.49.0, and use field 'document' to replace.
	Version *string `pulumi:"version"`
	// The ID of default version policy.
	VersionId *string `pulumi:"versionId"`
}

type PolicyState struct {
	// The policy attachment count.
	AttachmentCount pulumi.IntPtrInput
	// The default version of policy.
	DefaultVersion pulumi.StringPtrInput
	// Description of the RAM policy. This name can have a string of 1 to 1024 characters.
	Description pulumi.StringPtrInput
	// It has been deprecated from provider version 1.114.0 and `policyDocument` instead.
	//
	// Deprecated: Field 'document' has been deprecated from provider version 1.114.0. New field 'policy_document' instead.
	Document pulumi.StringPtrInput
	// This parameter is used for resource destroy. Default value is `false`.
	Force pulumi.BoolPtrInput
	// It has been deprecated from provider version 1.114.0 and `policyName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.114.0. New field 'policy_name' instead.
	Name pulumi.StringPtrInput
	// Document of the RAM policy. It is required when the `statement` is not specified.
	PolicyDocument pulumi.StringPtrInput
	// Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	PolicyName pulumi.StringPtrInput
	// The rotation strategy of the policy. You can use this parameter to delete an early policy version. Valid Values: `None`, `DeleteOldestNonDefaultVersionWhenLimitExceeded`. Default to `None`.
	RotateStrategy pulumi.StringPtrInput
	// (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Statements of the RAM policy document. It is required when the `document` is not specified.
	//
	// Deprecated: Field 'statement' has been deprecated from version 1.49.0, and use field 'document' to replace.
	Statements PolicyStatementArrayInput
	// The policy type.
	Type pulumi.StringPtrInput
	// (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Version of the RAM policy document. Valid value is `1`. Default value is `1`.
	//
	// Deprecated: Field 'version' has been deprecated from version 1.49.0, and use field 'document' to replace.
	Version pulumi.StringPtrInput
	// The ID of default version policy.
	VersionId pulumi.StringPtrInput
}

func (PolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*policyState)(nil)).Elem()
}

type policyArgs struct {
	// Description of the RAM policy. This name can have a string of 1 to 1024 characters.
	Description *string `pulumi:"description"`
	// It has been deprecated from provider version 1.114.0 and `policyDocument` instead.
	//
	// Deprecated: Field 'document' has been deprecated from provider version 1.114.0. New field 'policy_document' instead.
	Document *string `pulumi:"document"`
	// This parameter is used for resource destroy. Default value is `false`.
	Force *bool `pulumi:"force"`
	// It has been deprecated from provider version 1.114.0 and `policyName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.114.0. New field 'policy_name' instead.
	Name *string `pulumi:"name"`
	// Document of the RAM policy. It is required when the `statement` is not specified.
	PolicyDocument *string `pulumi:"policyDocument"`
	// Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	PolicyName *string `pulumi:"policyName"`
	// The rotation strategy of the policy. You can use this parameter to delete an early policy version. Valid Values: `None`, `DeleteOldestNonDefaultVersionWhenLimitExceeded`. Default to `None`.
	RotateStrategy *string `pulumi:"rotateStrategy"`
	// (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Statements of the RAM policy document. It is required when the `document` is not specified.
	//
	// Deprecated: Field 'statement' has been deprecated from version 1.49.0, and use field 'document' to replace.
	Statements []PolicyStatement `pulumi:"statements"`
	// (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Version of the RAM policy document. Valid value is `1`. Default value is `1`.
	//
	// Deprecated: Field 'version' has been deprecated from version 1.49.0, and use field 'document' to replace.
	Version *string `pulumi:"version"`
}

// The set of arguments for constructing a Policy resource.
type PolicyArgs struct {
	// Description of the RAM policy. This name can have a string of 1 to 1024 characters.
	Description pulumi.StringPtrInput
	// It has been deprecated from provider version 1.114.0 and `policyDocument` instead.
	//
	// Deprecated: Field 'document' has been deprecated from provider version 1.114.0. New field 'policy_document' instead.
	Document pulumi.StringPtrInput
	// This parameter is used for resource destroy. Default value is `false`.
	Force pulumi.BoolPtrInput
	// It has been deprecated from provider version 1.114.0 and `policyName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.114.0. New field 'policy_name' instead.
	Name pulumi.StringPtrInput
	// Document of the RAM policy. It is required when the `statement` is not specified.
	PolicyDocument pulumi.StringPtrInput
	// Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	PolicyName pulumi.StringPtrInput
	// The rotation strategy of the policy. You can use this parameter to delete an early policy version. Valid Values: `None`, `DeleteOldestNonDefaultVersionWhenLimitExceeded`. Default to `None`.
	RotateStrategy pulumi.StringPtrInput
	// (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Statements of the RAM policy document. It is required when the `document` is not specified.
	//
	// Deprecated: Field 'statement' has been deprecated from version 1.49.0, and use field 'document' to replace.
	Statements PolicyStatementArrayInput
	// (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Version of the RAM policy document. Valid value is `1`. Default value is `1`.
	//
	// Deprecated: Field 'version' has been deprecated from version 1.49.0, and use field 'document' to replace.
	Version pulumi.StringPtrInput
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
	return reflect.TypeOf((*Policy)(nil))
}

func (i *Policy) ToPolicyOutput() PolicyOutput {
	return i.ToPolicyOutputWithContext(context.Background())
}

func (i *Policy) ToPolicyOutputWithContext(ctx context.Context) PolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyOutput)
}

func (i *Policy) ToPolicyPtrOutput() PolicyPtrOutput {
	return i.ToPolicyPtrOutputWithContext(context.Background())
}

func (i *Policy) ToPolicyPtrOutputWithContext(ctx context.Context) PolicyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyPtrOutput)
}

type PolicyPtrInput interface {
	pulumi.Input

	ToPolicyPtrOutput() PolicyPtrOutput
	ToPolicyPtrOutputWithContext(ctx context.Context) PolicyPtrOutput
}

type policyPtrType PolicyArgs

func (*policyPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Policy)(nil))
}

func (i *policyPtrType) ToPolicyPtrOutput() PolicyPtrOutput {
	return i.ToPolicyPtrOutputWithContext(context.Background())
}

func (i *policyPtrType) ToPolicyPtrOutputWithContext(ctx context.Context) PolicyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyPtrOutput)
}

// PolicyArrayInput is an input type that accepts PolicyArray and PolicyArrayOutput values.
// You can construct a concrete instance of `PolicyArrayInput` via:
//
//          PolicyArray{ PolicyArgs{...} }
type PolicyArrayInput interface {
	pulumi.Input

	ToPolicyArrayOutput() PolicyArrayOutput
	ToPolicyArrayOutputWithContext(context.Context) PolicyArrayOutput
}

type PolicyArray []PolicyInput

func (PolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Policy)(nil))
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
//          PolicyMap{ "key": PolicyArgs{...} }
type PolicyMapInput interface {
	pulumi.Input

	ToPolicyMapOutput() PolicyMapOutput
	ToPolicyMapOutputWithContext(context.Context) PolicyMapOutput
}

type PolicyMap map[string]PolicyInput

func (PolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Policy)(nil))
}

func (i PolicyMap) ToPolicyMapOutput() PolicyMapOutput {
	return i.ToPolicyMapOutputWithContext(context.Background())
}

func (i PolicyMap) ToPolicyMapOutputWithContext(ctx context.Context) PolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicyMapOutput)
}

type PolicyOutput struct {
	*pulumi.OutputState
}

func (PolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Policy)(nil))
}

func (o PolicyOutput) ToPolicyOutput() PolicyOutput {
	return o
}

func (o PolicyOutput) ToPolicyOutputWithContext(ctx context.Context) PolicyOutput {
	return o
}

func (o PolicyOutput) ToPolicyPtrOutput() PolicyPtrOutput {
	return o.ToPolicyPtrOutputWithContext(context.Background())
}

func (o PolicyOutput) ToPolicyPtrOutputWithContext(ctx context.Context) PolicyPtrOutput {
	return o.ApplyT(func(v Policy) *Policy {
		return &v
	}).(PolicyPtrOutput)
}

type PolicyPtrOutput struct {
	*pulumi.OutputState
}

func (PolicyPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Policy)(nil))
}

func (o PolicyPtrOutput) ToPolicyPtrOutput() PolicyPtrOutput {
	return o
}

func (o PolicyPtrOutput) ToPolicyPtrOutputWithContext(ctx context.Context) PolicyPtrOutput {
	return o
}

type PolicyArrayOutput struct{ *pulumi.OutputState }

func (PolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Policy)(nil))
}

func (o PolicyArrayOutput) ToPolicyArrayOutput() PolicyArrayOutput {
	return o
}

func (o PolicyArrayOutput) ToPolicyArrayOutputWithContext(ctx context.Context) PolicyArrayOutput {
	return o
}

func (o PolicyArrayOutput) Index(i pulumi.IntInput) PolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Policy {
		return vs[0].([]Policy)[vs[1].(int)]
	}).(PolicyOutput)
}

type PolicyMapOutput struct{ *pulumi.OutputState }

func (PolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Policy)(nil))
}

func (o PolicyMapOutput) ToPolicyMapOutput() PolicyMapOutput {
	return o
}

func (o PolicyMapOutput) ToPolicyMapOutputWithContext(ctx context.Context) PolicyMapOutput {
	return o
}

func (o PolicyMapOutput) MapIndex(k pulumi.StringInput) PolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Policy {
		return vs[0].(map[string]Policy)[vs[1].(string)]
	}).(PolicyOutput)
}

func init() {
	pulumi.RegisterOutputType(PolicyOutput{})
	pulumi.RegisterOutputType(PolicyPtrOutput{})
	pulumi.RegisterOutputType(PolicyArrayOutput{})
	pulumi.RegisterOutputType(PolicyMapOutput{})
}
