// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ram

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a RAM SAML Provider resource.
//
// For information about RAM SAML Provider and how to use it, see [What is SAML Provider](https://www.alibabacloud.com/help/doc-detail/186846.htm).
//
// > **NOTE:** Available since v1.114.0+.
//
// ## Import
//
// RAM SAML Provider can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ram/samlProvider:SamlProvider example <saml_provider_name>
//
// ```
type SamlProvider struct {
	pulumi.CustomResourceState

	// The Alibaba Cloud Resource Name (ARN) of the IdP.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The description of SAML Provider.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The metadata file, which is Base64 encoded. The file is provided by an IdP that supports SAML 2.0.
	EncodedsamlMetadataDocument pulumi.StringPtrOutput `pulumi:"encodedsamlMetadataDocument"`
	// The name of SAML Provider.
	SamlProviderName pulumi.StringOutput `pulumi:"samlProviderName"`
	// The update time.
	UpdateDate pulumi.StringOutput `pulumi:"updateDate"`
}

// NewSamlProvider registers a new resource with the given unique name, arguments, and options.
func NewSamlProvider(ctx *pulumi.Context,
	name string, args *SamlProviderArgs, opts ...pulumi.ResourceOption) (*SamlProvider, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SamlProviderName == nil {
		return nil, errors.New("invalid value for required argument 'SamlProviderName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SamlProvider
	err := ctx.RegisterResource("alicloud:ram/samlProvider:SamlProvider", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSamlProvider gets an existing SamlProvider resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSamlProvider(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SamlProviderState, opts ...pulumi.ResourceOption) (*SamlProvider, error) {
	var resource SamlProvider
	err := ctx.ReadResource("alicloud:ram/samlProvider:SamlProvider", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SamlProvider resources.
type samlProviderState struct {
	// The Alibaba Cloud Resource Name (ARN) of the IdP.
	Arn *string `pulumi:"arn"`
	// The description of SAML Provider.
	Description *string `pulumi:"description"`
	// The metadata file, which is Base64 encoded. The file is provided by an IdP that supports SAML 2.0.
	EncodedsamlMetadataDocument *string `pulumi:"encodedsamlMetadataDocument"`
	// The name of SAML Provider.
	SamlProviderName *string `pulumi:"samlProviderName"`
	// The update time.
	UpdateDate *string `pulumi:"updateDate"`
}

type SamlProviderState struct {
	// The Alibaba Cloud Resource Name (ARN) of the IdP.
	Arn pulumi.StringPtrInput
	// The description of SAML Provider.
	Description pulumi.StringPtrInput
	// The metadata file, which is Base64 encoded. The file is provided by an IdP that supports SAML 2.0.
	EncodedsamlMetadataDocument pulumi.StringPtrInput
	// The name of SAML Provider.
	SamlProviderName pulumi.StringPtrInput
	// The update time.
	UpdateDate pulumi.StringPtrInput
}

func (SamlProviderState) ElementType() reflect.Type {
	return reflect.TypeOf((*samlProviderState)(nil)).Elem()
}

type samlProviderArgs struct {
	// The description of SAML Provider.
	Description *string `pulumi:"description"`
	// The metadata file, which is Base64 encoded. The file is provided by an IdP that supports SAML 2.0.
	EncodedsamlMetadataDocument *string `pulumi:"encodedsamlMetadataDocument"`
	// The name of SAML Provider.
	SamlProviderName string `pulumi:"samlProviderName"`
}

// The set of arguments for constructing a SamlProvider resource.
type SamlProviderArgs struct {
	// The description of SAML Provider.
	Description pulumi.StringPtrInput
	// The metadata file, which is Base64 encoded. The file is provided by an IdP that supports SAML 2.0.
	EncodedsamlMetadataDocument pulumi.StringPtrInput
	// The name of SAML Provider.
	SamlProviderName pulumi.StringInput
}

func (SamlProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*samlProviderArgs)(nil)).Elem()
}

type SamlProviderInput interface {
	pulumi.Input

	ToSamlProviderOutput() SamlProviderOutput
	ToSamlProviderOutputWithContext(ctx context.Context) SamlProviderOutput
}

func (*SamlProvider) ElementType() reflect.Type {
	return reflect.TypeOf((**SamlProvider)(nil)).Elem()
}

func (i *SamlProvider) ToSamlProviderOutput() SamlProviderOutput {
	return i.ToSamlProviderOutputWithContext(context.Background())
}

func (i *SamlProvider) ToSamlProviderOutputWithContext(ctx context.Context) SamlProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamlProviderOutput)
}

func (i *SamlProvider) ToOutput(ctx context.Context) pulumix.Output[*SamlProvider] {
	return pulumix.Output[*SamlProvider]{
		OutputState: i.ToSamlProviderOutputWithContext(ctx).OutputState,
	}
}

// SamlProviderArrayInput is an input type that accepts SamlProviderArray and SamlProviderArrayOutput values.
// You can construct a concrete instance of `SamlProviderArrayInput` via:
//
//	SamlProviderArray{ SamlProviderArgs{...} }
type SamlProviderArrayInput interface {
	pulumi.Input

	ToSamlProviderArrayOutput() SamlProviderArrayOutput
	ToSamlProviderArrayOutputWithContext(context.Context) SamlProviderArrayOutput
}

type SamlProviderArray []SamlProviderInput

func (SamlProviderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SamlProvider)(nil)).Elem()
}

func (i SamlProviderArray) ToSamlProviderArrayOutput() SamlProviderArrayOutput {
	return i.ToSamlProviderArrayOutputWithContext(context.Background())
}

func (i SamlProviderArray) ToSamlProviderArrayOutputWithContext(ctx context.Context) SamlProviderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamlProviderArrayOutput)
}

func (i SamlProviderArray) ToOutput(ctx context.Context) pulumix.Output[[]*SamlProvider] {
	return pulumix.Output[[]*SamlProvider]{
		OutputState: i.ToSamlProviderArrayOutputWithContext(ctx).OutputState,
	}
}

// SamlProviderMapInput is an input type that accepts SamlProviderMap and SamlProviderMapOutput values.
// You can construct a concrete instance of `SamlProviderMapInput` via:
//
//	SamlProviderMap{ "key": SamlProviderArgs{...} }
type SamlProviderMapInput interface {
	pulumi.Input

	ToSamlProviderMapOutput() SamlProviderMapOutput
	ToSamlProviderMapOutputWithContext(context.Context) SamlProviderMapOutput
}

type SamlProviderMap map[string]SamlProviderInput

func (SamlProviderMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SamlProvider)(nil)).Elem()
}

func (i SamlProviderMap) ToSamlProviderMapOutput() SamlProviderMapOutput {
	return i.ToSamlProviderMapOutputWithContext(context.Background())
}

func (i SamlProviderMap) ToSamlProviderMapOutputWithContext(ctx context.Context) SamlProviderMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamlProviderMapOutput)
}

func (i SamlProviderMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*SamlProvider] {
	return pulumix.Output[map[string]*SamlProvider]{
		OutputState: i.ToSamlProviderMapOutputWithContext(ctx).OutputState,
	}
}

type SamlProviderOutput struct{ *pulumi.OutputState }

func (SamlProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SamlProvider)(nil)).Elem()
}

func (o SamlProviderOutput) ToSamlProviderOutput() SamlProviderOutput {
	return o
}

func (o SamlProviderOutput) ToSamlProviderOutputWithContext(ctx context.Context) SamlProviderOutput {
	return o
}

func (o SamlProviderOutput) ToOutput(ctx context.Context) pulumix.Output[*SamlProvider] {
	return pulumix.Output[*SamlProvider]{
		OutputState: o.OutputState,
	}
}

// The Alibaba Cloud Resource Name (ARN) of the IdP.
func (o SamlProviderOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *SamlProvider) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The description of SAML Provider.
func (o SamlProviderOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SamlProvider) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The metadata file, which is Base64 encoded. The file is provided by an IdP that supports SAML 2.0.
func (o SamlProviderOutput) EncodedsamlMetadataDocument() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SamlProvider) pulumi.StringPtrOutput { return v.EncodedsamlMetadataDocument }).(pulumi.StringPtrOutput)
}

// The name of SAML Provider.
func (o SamlProviderOutput) SamlProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v *SamlProvider) pulumi.StringOutput { return v.SamlProviderName }).(pulumi.StringOutput)
}

// The update time.
func (o SamlProviderOutput) UpdateDate() pulumi.StringOutput {
	return o.ApplyT(func(v *SamlProvider) pulumi.StringOutput { return v.UpdateDate }).(pulumi.StringOutput)
}

type SamlProviderArrayOutput struct{ *pulumi.OutputState }

func (SamlProviderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SamlProvider)(nil)).Elem()
}

func (o SamlProviderArrayOutput) ToSamlProviderArrayOutput() SamlProviderArrayOutput {
	return o
}

func (o SamlProviderArrayOutput) ToSamlProviderArrayOutputWithContext(ctx context.Context) SamlProviderArrayOutput {
	return o
}

func (o SamlProviderArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*SamlProvider] {
	return pulumix.Output[[]*SamlProvider]{
		OutputState: o.OutputState,
	}
}

func (o SamlProviderArrayOutput) Index(i pulumi.IntInput) SamlProviderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SamlProvider {
		return vs[0].([]*SamlProvider)[vs[1].(int)]
	}).(SamlProviderOutput)
}

type SamlProviderMapOutput struct{ *pulumi.OutputState }

func (SamlProviderMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SamlProvider)(nil)).Elem()
}

func (o SamlProviderMapOutput) ToSamlProviderMapOutput() SamlProviderMapOutput {
	return o
}

func (o SamlProviderMapOutput) ToSamlProviderMapOutputWithContext(ctx context.Context) SamlProviderMapOutput {
	return o
}

func (o SamlProviderMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*SamlProvider] {
	return pulumix.Output[map[string]*SamlProvider]{
		OutputState: o.OutputState,
	}
}

func (o SamlProviderMapOutput) MapIndex(k pulumi.StringInput) SamlProviderOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SamlProvider {
		return vs[0].(map[string]*SamlProvider)[vs[1].(string)]
	}).(SamlProviderOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SamlProviderInput)(nil)).Elem(), &SamlProvider{})
	pulumi.RegisterInputType(reflect.TypeOf((*SamlProviderArrayInput)(nil)).Elem(), SamlProviderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SamlProviderMapInput)(nil)).Elem(), SamlProviderMap{})
	pulumi.RegisterOutputType(SamlProviderOutput{})
	pulumi.RegisterOutputType(SamlProviderArrayOutput{})
	pulumi.RegisterOutputType(SamlProviderMapOutput{})
}
