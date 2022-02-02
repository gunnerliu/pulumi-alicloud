// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package dcdn

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// You can use DCDN to improve the overall performance of your website and accelerate content delivery to improve user experience. For information about Alicloud DCDN Domain and how to use it, see [What is Resource Alicloud DCDN Domain](https://www.alibabacloud.com/help/en/doc-detail/130628.htm).
//
// > **NOTE:** Available in v1.94.0+.
//
// > **NOTE:** You must activate the Dynamic Route for CDN (DCDN) service before you create an accelerated domain.
//
// > **NOTE:** Make sure that you have obtained an Internet content provider (ICP) filling for the accelerated domain.
//
// > **NOTE:** If the origin content is not saved on Alibaba Cloud, the content must be reviewed by Alibaba Cloud. The review will be completed by the next working day after you submit the application.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dcdn"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := dcdn.NewDomain(ctx, "example", &dcdn.DomainArgs{
// 			DomainName: pulumi.String("example.com"),
// 			Scope:      pulumi.String("overseas"),
// 			Sources: dcdn.DomainSourceArray{
// 				&dcdn.DomainSourceArgs{
// 					Content:  pulumi.String("1.1.1.1"),
// 					Port:     pulumi.Int(80),
// 					Priority: pulumi.String("20"),
// 					Type:     pulumi.String("ipaddr"),
// 				},
// 			},
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
// DCDN Domain can be imported using the id or DCDN Domain name, e.g.
//
// ```sh
//  $ pulumi import alicloud:dcdn/domain:Domain example example.com
// ```
type Domain struct {
	pulumi.CustomResourceState

	// Indicates the name of the certificate if the HTTPS protocol is enabled.
	CertName pulumi.StringOutput `pulumi:"certName"`
	// The type of the certificate. Valid values:
	// `free`: a free certificate.
	// `cas`: a certificate purchased from Alibaba Cloud SSL Certificates Service.
	// `upload`: a user uploaded certificate.
	CertType pulumi.StringPtrOutput `pulumi:"certType"`
	// The URL that is used to test the accessibility of the origin.
	CheckUrl pulumi.StringPtrOutput `pulumi:"checkUrl"`
	// The name of the accelerated domain.
	DomainName pulumi.StringOutput `pulumi:"domainName"`
	// Specifies whether to check the certificate name for duplicates. If you set the value to 1, the system does not perform the check and overwrites the information of the existing certificate with the same name.
	ForceSet pulumi.StringPtrOutput `pulumi:"forceSet"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The acceleration region.
	Scope         pulumi.StringPtrOutput `pulumi:"scope"`
	SecurityToken pulumi.StringPtrOutput `pulumi:"securityToken"`
	// The origin information.
	Sources DomainSourceArrayOutput `pulumi:"sources"`
	// The private key. Specify this parameter only if you enable the SSL certificate.
	SslPri pulumi.StringPtrOutput `pulumi:"sslPri"`
	// Indicates whether the SSL certificate is enabled. Valid values: `on` enabled, `off` disabled.
	SslProtocol pulumi.StringPtrOutput `pulumi:"sslProtocol"`
	// Indicates the public key of the certificate if the HTTPS protocol is enabled.
	SslPub pulumi.StringPtrOutput `pulumi:"sslPub"`
	// The status of DCDN Domain. Valid values: `online`, `offline`. Default to `online`.
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// The top-level domain name.
	TopLevelDomain pulumi.StringPtrOutput `pulumi:"topLevelDomain"`
}

// NewDomain registers a new resource with the given unique name, arguments, and options.
func NewDomain(ctx *pulumi.Context,
	name string, args *DomainArgs, opts ...pulumi.ResourceOption) (*Domain, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DomainName == nil {
		return nil, errors.New("invalid value for required argument 'DomainName'")
	}
	if args.Sources == nil {
		return nil, errors.New("invalid value for required argument 'Sources'")
	}
	var resource Domain
	err := ctx.RegisterResource("alicloud:dcdn/domain:Domain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDomain gets an existing Domain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DomainState, opts ...pulumi.ResourceOption) (*Domain, error) {
	var resource Domain
	err := ctx.ReadResource("alicloud:dcdn/domain:Domain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Domain resources.
type domainState struct {
	// Indicates the name of the certificate if the HTTPS protocol is enabled.
	CertName *string `pulumi:"certName"`
	// The type of the certificate. Valid values:
	// `free`: a free certificate.
	// `cas`: a certificate purchased from Alibaba Cloud SSL Certificates Service.
	// `upload`: a user uploaded certificate.
	CertType *string `pulumi:"certType"`
	// The URL that is used to test the accessibility of the origin.
	CheckUrl *string `pulumi:"checkUrl"`
	// The name of the accelerated domain.
	DomainName *string `pulumi:"domainName"`
	// Specifies whether to check the certificate name for duplicates. If you set the value to 1, the system does not perform the check and overwrites the information of the existing certificate with the same name.
	ForceSet *string `pulumi:"forceSet"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The acceleration region.
	Scope         *string `pulumi:"scope"`
	SecurityToken *string `pulumi:"securityToken"`
	// The origin information.
	Sources []DomainSource `pulumi:"sources"`
	// The private key. Specify this parameter only if you enable the SSL certificate.
	SslPri *string `pulumi:"sslPri"`
	// Indicates whether the SSL certificate is enabled. Valid values: `on` enabled, `off` disabled.
	SslProtocol *string `pulumi:"sslProtocol"`
	// Indicates the public key of the certificate if the HTTPS protocol is enabled.
	SslPub *string `pulumi:"sslPub"`
	// The status of DCDN Domain. Valid values: `online`, `offline`. Default to `online`.
	Status *string `pulumi:"status"`
	// The top-level domain name.
	TopLevelDomain *string `pulumi:"topLevelDomain"`
}

type DomainState struct {
	// Indicates the name of the certificate if the HTTPS protocol is enabled.
	CertName pulumi.StringPtrInput
	// The type of the certificate. Valid values:
	// `free`: a free certificate.
	// `cas`: a certificate purchased from Alibaba Cloud SSL Certificates Service.
	// `upload`: a user uploaded certificate.
	CertType pulumi.StringPtrInput
	// The URL that is used to test the accessibility of the origin.
	CheckUrl pulumi.StringPtrInput
	// The name of the accelerated domain.
	DomainName pulumi.StringPtrInput
	// Specifies whether to check the certificate name for duplicates. If you set the value to 1, the system does not perform the check and overwrites the information of the existing certificate with the same name.
	ForceSet pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The acceleration region.
	Scope         pulumi.StringPtrInput
	SecurityToken pulumi.StringPtrInput
	// The origin information.
	Sources DomainSourceArrayInput
	// The private key. Specify this parameter only if you enable the SSL certificate.
	SslPri pulumi.StringPtrInput
	// Indicates whether the SSL certificate is enabled. Valid values: `on` enabled, `off` disabled.
	SslProtocol pulumi.StringPtrInput
	// Indicates the public key of the certificate if the HTTPS protocol is enabled.
	SslPub pulumi.StringPtrInput
	// The status of DCDN Domain. Valid values: `online`, `offline`. Default to `online`.
	Status pulumi.StringPtrInput
	// The top-level domain name.
	TopLevelDomain pulumi.StringPtrInput
}

func (DomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*domainState)(nil)).Elem()
}

type domainArgs struct {
	// Indicates the name of the certificate if the HTTPS protocol is enabled.
	CertName *string `pulumi:"certName"`
	// The type of the certificate. Valid values:
	// `free`: a free certificate.
	// `cas`: a certificate purchased from Alibaba Cloud SSL Certificates Service.
	// `upload`: a user uploaded certificate.
	CertType *string `pulumi:"certType"`
	// The URL that is used to test the accessibility of the origin.
	CheckUrl *string `pulumi:"checkUrl"`
	// The name of the accelerated domain.
	DomainName string `pulumi:"domainName"`
	// Specifies whether to check the certificate name for duplicates. If you set the value to 1, the system does not perform the check and overwrites the information of the existing certificate with the same name.
	ForceSet *string `pulumi:"forceSet"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The acceleration region.
	Scope         *string `pulumi:"scope"`
	SecurityToken *string `pulumi:"securityToken"`
	// The origin information.
	Sources []DomainSource `pulumi:"sources"`
	// The private key. Specify this parameter only if you enable the SSL certificate.
	SslPri *string `pulumi:"sslPri"`
	// Indicates whether the SSL certificate is enabled. Valid values: `on` enabled, `off` disabled.
	SslProtocol *string `pulumi:"sslProtocol"`
	// Indicates the public key of the certificate if the HTTPS protocol is enabled.
	SslPub *string `pulumi:"sslPub"`
	// The status of DCDN Domain. Valid values: `online`, `offline`. Default to `online`.
	Status *string `pulumi:"status"`
	// The top-level domain name.
	TopLevelDomain *string `pulumi:"topLevelDomain"`
}

// The set of arguments for constructing a Domain resource.
type DomainArgs struct {
	// Indicates the name of the certificate if the HTTPS protocol is enabled.
	CertName pulumi.StringPtrInput
	// The type of the certificate. Valid values:
	// `free`: a free certificate.
	// `cas`: a certificate purchased from Alibaba Cloud SSL Certificates Service.
	// `upload`: a user uploaded certificate.
	CertType pulumi.StringPtrInput
	// The URL that is used to test the accessibility of the origin.
	CheckUrl pulumi.StringPtrInput
	// The name of the accelerated domain.
	DomainName pulumi.StringInput
	// Specifies whether to check the certificate name for duplicates. If you set the value to 1, the system does not perform the check and overwrites the information of the existing certificate with the same name.
	ForceSet pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The acceleration region.
	Scope         pulumi.StringPtrInput
	SecurityToken pulumi.StringPtrInput
	// The origin information.
	Sources DomainSourceArrayInput
	// The private key. Specify this parameter only if you enable the SSL certificate.
	SslPri pulumi.StringPtrInput
	// Indicates whether the SSL certificate is enabled. Valid values: `on` enabled, `off` disabled.
	SslProtocol pulumi.StringPtrInput
	// Indicates the public key of the certificate if the HTTPS protocol is enabled.
	SslPub pulumi.StringPtrInput
	// The status of DCDN Domain. Valid values: `online`, `offline`. Default to `online`.
	Status pulumi.StringPtrInput
	// The top-level domain name.
	TopLevelDomain pulumi.StringPtrInput
}

func (DomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*domainArgs)(nil)).Elem()
}

type DomainInput interface {
	pulumi.Input

	ToDomainOutput() DomainOutput
	ToDomainOutputWithContext(ctx context.Context) DomainOutput
}

func (*Domain) ElementType() reflect.Type {
	return reflect.TypeOf((**Domain)(nil)).Elem()
}

func (i *Domain) ToDomainOutput() DomainOutput {
	return i.ToDomainOutputWithContext(context.Background())
}

func (i *Domain) ToDomainOutputWithContext(ctx context.Context) DomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainOutput)
}

// DomainArrayInput is an input type that accepts DomainArray and DomainArrayOutput values.
// You can construct a concrete instance of `DomainArrayInput` via:
//
//          DomainArray{ DomainArgs{...} }
type DomainArrayInput interface {
	pulumi.Input

	ToDomainArrayOutput() DomainArrayOutput
	ToDomainArrayOutputWithContext(context.Context) DomainArrayOutput
}

type DomainArray []DomainInput

func (DomainArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Domain)(nil)).Elem()
}

func (i DomainArray) ToDomainArrayOutput() DomainArrayOutput {
	return i.ToDomainArrayOutputWithContext(context.Background())
}

func (i DomainArray) ToDomainArrayOutputWithContext(ctx context.Context) DomainArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainArrayOutput)
}

// DomainMapInput is an input type that accepts DomainMap and DomainMapOutput values.
// You can construct a concrete instance of `DomainMapInput` via:
//
//          DomainMap{ "key": DomainArgs{...} }
type DomainMapInput interface {
	pulumi.Input

	ToDomainMapOutput() DomainMapOutput
	ToDomainMapOutputWithContext(context.Context) DomainMapOutput
}

type DomainMap map[string]DomainInput

func (DomainMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Domain)(nil)).Elem()
}

func (i DomainMap) ToDomainMapOutput() DomainMapOutput {
	return i.ToDomainMapOutputWithContext(context.Background())
}

func (i DomainMap) ToDomainMapOutputWithContext(ctx context.Context) DomainMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainMapOutput)
}

type DomainOutput struct{ *pulumi.OutputState }

func (DomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Domain)(nil)).Elem()
}

func (o DomainOutput) ToDomainOutput() DomainOutput {
	return o
}

func (o DomainOutput) ToDomainOutputWithContext(ctx context.Context) DomainOutput {
	return o
}

type DomainArrayOutput struct{ *pulumi.OutputState }

func (DomainArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Domain)(nil)).Elem()
}

func (o DomainArrayOutput) ToDomainArrayOutput() DomainArrayOutput {
	return o
}

func (o DomainArrayOutput) ToDomainArrayOutputWithContext(ctx context.Context) DomainArrayOutput {
	return o
}

func (o DomainArrayOutput) Index(i pulumi.IntInput) DomainOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Domain {
		return vs[0].([]*Domain)[vs[1].(int)]
	}).(DomainOutput)
}

type DomainMapOutput struct{ *pulumi.OutputState }

func (DomainMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Domain)(nil)).Elem()
}

func (o DomainMapOutput) ToDomainMapOutput() DomainMapOutput {
	return o
}

func (o DomainMapOutput) ToDomainMapOutputWithContext(ctx context.Context) DomainMapOutput {
	return o
}

func (o DomainMapOutput) MapIndex(k pulumi.StringInput) DomainOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Domain {
		return vs[0].(map[string]*Domain)[vs[1].(string)]
	}).(DomainOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DomainInput)(nil)).Elem(), &Domain{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainArrayInput)(nil)).Elem(), DomainArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainMapInput)(nil)).Elem(), DomainMap{})
	pulumi.RegisterOutputType(DomainOutput{})
	pulumi.RegisterOutputType(DomainArrayOutput{})
	pulumi.RegisterOutputType(DomainMapOutput{})
}
