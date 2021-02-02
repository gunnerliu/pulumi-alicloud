// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ram

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a RAM SAML Provider resource.
//
// For information about RAM SAML Provider and how to use it, see [What is SAML Provider](https://www.alibabacloud.com/help/doc-detail/186846.htm).
//
// > **NOTE:** Available in v1.114.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/ram"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := ram.NewSamlProvider(ctx, "example", &ram.SamlProviderArgs{
// 			Description:                 pulumi.String("For Terraform Test"),
// 			EncodedsamlMetadataDocument: pulumi.String("your encodedsaml metadata document"),
// 			SamlProviderName:            pulumi.String("tf-testAcc"),
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
// RAM SAML Provider can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ram/samlProvider:SamlProvider example <saml_provider_name>
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
	return reflect.TypeOf((*SamlProvider)(nil))
}

func (i *SamlProvider) ToSamlProviderOutput() SamlProviderOutput {
	return i.ToSamlProviderOutputWithContext(context.Background())
}

func (i *SamlProvider) ToSamlProviderOutputWithContext(ctx context.Context) SamlProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamlProviderOutput)
}

type SamlProviderOutput struct {
	*pulumi.OutputState
}

func (SamlProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*SamlProvider)(nil))
}

func (o SamlProviderOutput) ToSamlProviderOutput() SamlProviderOutput {
	return o
}

func (o SamlProviderOutput) ToSamlProviderOutputWithContext(ctx context.Context) SamlProviderOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(SamlProviderOutput{})
}
