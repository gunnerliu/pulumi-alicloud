// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a SSL Certificates Certificate resource.
//
// For information about SSL Certificates Certificate and how to use it, see [What is Certificate](https://www.alibabacloud.com/help/product/28533.html).
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cas.NewServiceCertificate(ctx, "default", &cas.ServiceCertificateArgs{
//				Cert: pulumi.String(`-----BEGIN CERTIFICATE-----
//
// MIIDeDCCAmCgAwIBAgIEN3ZT6zANBgkqhkiG9w0BAQsFADBVMQswCQYDVQQGEwJD
// TjEVMBMGA1UEAwwMKi50ZnRlc3QudG9wMRAwDgYDVQQIDAdCZWlKaW5nMRAwDgYD
// VQQHDAdCZWlKaW5nMQswCQYDVQQKDAJBQTAeFw0yMzA4MjgwNjQ5NDNaFw0yNTA4
// MjcwNjQ5NDNaMFUxCzAJBgNVBAYTAkNOMRUwEwYDVQQDDAwqLnRmdGVzdC50b3Ax
// EDAOBgNVBAgMB0JlaUppbmcxEDAOBgNVBAcMB0JlaUppbmcxCzAJBgNVBAoMAkFB
// MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzkk9NJUH7PLSQK4RRrGQ
// Y5dVsftkhnKh9HhI6yrnlowWIDPS1PZHOU/5gQ7xPUPGdKQV5S7x8wROnAaXEimx
// N4GdQw25pGhRJvlwme9fzJJiSe6lG49NCxmuBiEdJAzPKaTPpK1cG1f1TqdgCfHR
// HAL6Jxb3ylHG2LlTNFLXikubUi5RT6/9C8psr713Zm4HveCI/cx0WdgZ+fmsc9ft
// rkIB1DdyV1kQ51m8r2rLi3J7aC5ggGOiex/VlGSd4e6SOQLpdQEdDbodtOJ4LgVk
// +arFNCMinUWIOPGFzXhdm6lssPbh4MOBrz8c/M9TcF4hoMn5/o/9johZIZ/DOvXt
// ZQIDAQABo1AwTjAdBgNVHQ4EFgQUOnWiddgeZj17IeysatqhE361o5YwHwYDVR0j
// BBgwFoAUOnWiddgeZj17IeysatqhE361o5YwDAYDVR0TBAUwAwEB/zANBgkqhkiG
// 9w0BAQsFAAOCAQEAfh3cnOszHM/5wXjY7BIkmgDOReksS+87ibhBz7T2ddZj+yCF
// 9GdIBzXCiHpQFXpW8a3kc3I7l3nGfMTkmF6ld3ot/6SXP17QKJwxtvUA4ib8QkWD
// S7FT+UcHCUHv42Sh1e5uAlQ5pMSul7iKcR7jwlwZGZ0905HOqrmdyUGJ+Ud2uZWD
// AC0dJF6Bv9VhNtci8Imp05PaPH09deXLZu8LRrKRZFy9qLW5R6Swv7nzxckOAqDk
// TTc40xwvQROekWUyxeJL7xaHuylUHE0bxsiIfx5bZsBizRjprIwGlj85CSPuTZyP
// DPfaiZAN/61h5HNAnxLltOZfqabKYYw7l9LBDg==
// -----END CERTIFICATE-----
//
// `),
//
//	CertificateName: pulumi.String("tf-example"),
//	Key: pulumi.String(`-----BEGIN PRIVATE KEY-----
//
// MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDOST00lQfs8tJA
// rhFGsZBjl1Wx+2SGcqH0eEjrKueWjBYgM9LU9kc5T/mBDvE9Q8Z0pBXlLvHzBE6c
// BpcSKbE3gZ1DDbmkaFEm+XCZ71/MkmJJ7qUbj00LGa4GIR0kDM8ppM+krVwbV/VO
// p2AJ8dEcAvonFvfKUcbYuVM0UteKS5tSLlFPr/0LymyvvXdmbge94Ij9zHRZ2Bn5
// +axz1+2uQgHUN3JXWRDnWbyvasuLcntoLmCAY6J7H9WUZJ3h7pI5Aul1AR0Nuh20
// 4nguBWT5qsU0IyKdRYg48YXNeF2bqWyw9uHgw4GvPxz8z1NwXiGgyfn+j/2OiFkh
// n8M69e1lAgMBAAECggEAevPgTTT+0lYwx2h416ACJboP09O5KQGuUl5XaAPcoTjB
// /1OkOFbKQPjQCAJ1+0QoR2F9w2plv6kziX/MD4FWJXVV3J+TpNCgfhBy8u1gNjiR
// 6Osa8gBJtXIK7ZBTJCeWWoXnVYoWuh2FEupkLck6D+4eV6oy6x4u3QIo+6jc24n9
// dIXQG6/v/Iao34kB0LUdp/4WNaUDvfI6NDhEwchpKE95dtWIDlIN/YhfiYAdjrnl
// YmH2VDbAGgsdEiHP4wLZfjgsGPPDGS0+qBHoSiJGH0E6wWEZdAE4TsYGRFsO86n3
// LfjEPFGfPlcnZe2cTTe3kmyKq/DTjxtu2rh3I8o2CQKBgQD/5Xe7cenaOBefzPlx
// GOEsB+qv49UmzEPOXDNZe9hmAawuuuxPUM+xlE++P+mEgQm1LPT4WWgtFLPVuwmx
// ncxt4CJNZh+ZGFyAZ4dm4M4ZhIBXNonyIP+yGyAJUUVF9Iy3TYcJNiGzv2Rx9JRQ
// XWJMQnTDILmZbmU+ltTea7/zqwKBgQDOXqCqb17MuLt7OcKWSgthm79OlaOdzZvl
// i9qU6VzZKG7Axc5gA9yq6tHp3vWPI4bNdvwqIIa/nzVILjGA5fcYFbRN+7gHwo8s
// rNAgi5PAoKWqQRovyJRY9Eq/sn6l1jbJZAOUAMZMWDm8z89OqK7PNQSIAtfFSneo
// 2QxJkGeTLwKBgGJkafBB8af9b1/7YWISLepPNPbihH/BhMThAMGEdAVs2TaymtA4
// g1OFck/1pSVUtFXcbmjbf8ntruQcYbLQuNz6lFXsUXP9QPwCUrbE85ouL2bZSps2
// AvsJoPzUKe2nBUAp6CUrkjPaAJYsc6ae8X/fAaRRfeu33ef9+OV4yrq3AoGAYFZo
// ZmfrN2Kdkt7Z6dLTEVPlsMfGQ6pyNmxdM9rkzzNC0JcGymfDIb7RE35T3+hTy6La
// AMiCXv3xn6qAzY2NFh87tpPlyymWMOLTnf3Kkcfszlfp45idOBGCu46V9NDVbppT
// 2UmrSIR/H5dbTXsNcAlt/hhlpeInjhkU1VqmH10CgYEA7Kk+QhWq705SczpWjm5J
// 9kHqfFzJLwAWNBduiia0WypgPhLe/4wT1rYQkBtKMVKrgFo7Cvi4YKlrtlDnXyeU
// CIFqfEL5NriQelqrFsvgHsmD+MpvDoSWm5C8IrTubtlNyWUzXSVT4OIwzPobzPqG
// LILJ+e7bLw8RrM0HfgFnl8c=
// -----END PRIVATE KEY-----
//
// `),
//
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
// SSL Certificates Certificate can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cas/serviceCertificate:ServiceCertificate example <id>
//
// ```
type ServiceCertificate struct {
	pulumi.CustomResourceState

	// Cert of the Certificate in which the Certificate will add.
	Cert pulumi.StringOutput `pulumi:"cert"`
	// Name of the Certificate.
	// This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-",
	// and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time.
	// Suffix .sh and .tel are not supported.
	// **NOTE:** One of `certificateName` and `name` must be specified.
	CertificateName pulumi.StringOutput `pulumi:"certificateName"`
	// Key of the Certificate in which the Certificate will add.
	Key pulumi.StringOutput `pulumi:"key"`
	// The lang.
	Lang pulumi.StringPtrOutput `pulumi:"lang"`
	// It has been deprecated from version 1.129.0 and using `certificateName` instead.
	//
	// Deprecated: attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewServiceCertificate registers a new resource with the given unique name, arguments, and options.
func NewServiceCertificate(ctx *pulumi.Context,
	name string, args *ServiceCertificateArgs, opts ...pulumi.ResourceOption) (*ServiceCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Cert == nil {
		return nil, errors.New("invalid value for required argument 'Cert'")
	}
	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceCertificate
	err := ctx.RegisterResource("alicloud:cas/serviceCertificate:ServiceCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceCertificate gets an existing ServiceCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceCertificateState, opts ...pulumi.ResourceOption) (*ServiceCertificate, error) {
	var resource ServiceCertificate
	err := ctx.ReadResource("alicloud:cas/serviceCertificate:ServiceCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceCertificate resources.
type serviceCertificateState struct {
	// Cert of the Certificate in which the Certificate will add.
	Cert *string `pulumi:"cert"`
	// Name of the Certificate.
	// This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-",
	// and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time.
	// Suffix .sh and .tel are not supported.
	// **NOTE:** One of `certificateName` and `name` must be specified.
	CertificateName *string `pulumi:"certificateName"`
	// Key of the Certificate in which the Certificate will add.
	Key *string `pulumi:"key"`
	// The lang.
	Lang *string `pulumi:"lang"`
	// It has been deprecated from version 1.129.0 and using `certificateName` instead.
	//
	// Deprecated: attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.
	Name *string `pulumi:"name"`
}

type ServiceCertificateState struct {
	// Cert of the Certificate in which the Certificate will add.
	Cert pulumi.StringPtrInput
	// Name of the Certificate.
	// This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-",
	// and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time.
	// Suffix .sh and .tel are not supported.
	// **NOTE:** One of `certificateName` and `name` must be specified.
	CertificateName pulumi.StringPtrInput
	// Key of the Certificate in which the Certificate will add.
	Key pulumi.StringPtrInput
	// The lang.
	Lang pulumi.StringPtrInput
	// It has been deprecated from version 1.129.0 and using `certificateName` instead.
	//
	// Deprecated: attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.
	Name pulumi.StringPtrInput
}

func (ServiceCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceCertificateState)(nil)).Elem()
}

type serviceCertificateArgs struct {
	// Cert of the Certificate in which the Certificate will add.
	Cert string `pulumi:"cert"`
	// Name of the Certificate.
	// This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-",
	// and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time.
	// Suffix .sh and .tel are not supported.
	// **NOTE:** One of `certificateName` and `name` must be specified.
	CertificateName *string `pulumi:"certificateName"`
	// Key of the Certificate in which the Certificate will add.
	Key string `pulumi:"key"`
	// The lang.
	Lang *string `pulumi:"lang"`
	// It has been deprecated from version 1.129.0 and using `certificateName` instead.
	//
	// Deprecated: attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a ServiceCertificate resource.
type ServiceCertificateArgs struct {
	// Cert of the Certificate in which the Certificate will add.
	Cert pulumi.StringInput
	// Name of the Certificate.
	// This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-",
	// and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time.
	// Suffix .sh and .tel are not supported.
	// **NOTE:** One of `certificateName` and `name` must be specified.
	CertificateName pulumi.StringPtrInput
	// Key of the Certificate in which the Certificate will add.
	Key pulumi.StringInput
	// The lang.
	Lang pulumi.StringPtrInput
	// It has been deprecated from version 1.129.0 and using `certificateName` instead.
	//
	// Deprecated: attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.
	Name pulumi.StringPtrInput
}

func (ServiceCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceCertificateArgs)(nil)).Elem()
}

type ServiceCertificateInput interface {
	pulumi.Input

	ToServiceCertificateOutput() ServiceCertificateOutput
	ToServiceCertificateOutputWithContext(ctx context.Context) ServiceCertificateOutput
}

func (*ServiceCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceCertificate)(nil)).Elem()
}

func (i *ServiceCertificate) ToServiceCertificateOutput() ServiceCertificateOutput {
	return i.ToServiceCertificateOutputWithContext(context.Background())
}

func (i *ServiceCertificate) ToServiceCertificateOutputWithContext(ctx context.Context) ServiceCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceCertificateOutput)
}

// ServiceCertificateArrayInput is an input type that accepts ServiceCertificateArray and ServiceCertificateArrayOutput values.
// You can construct a concrete instance of `ServiceCertificateArrayInput` via:
//
//	ServiceCertificateArray{ ServiceCertificateArgs{...} }
type ServiceCertificateArrayInput interface {
	pulumi.Input

	ToServiceCertificateArrayOutput() ServiceCertificateArrayOutput
	ToServiceCertificateArrayOutputWithContext(context.Context) ServiceCertificateArrayOutput
}

type ServiceCertificateArray []ServiceCertificateInput

func (ServiceCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceCertificate)(nil)).Elem()
}

func (i ServiceCertificateArray) ToServiceCertificateArrayOutput() ServiceCertificateArrayOutput {
	return i.ToServiceCertificateArrayOutputWithContext(context.Background())
}

func (i ServiceCertificateArray) ToServiceCertificateArrayOutputWithContext(ctx context.Context) ServiceCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceCertificateArrayOutput)
}

// ServiceCertificateMapInput is an input type that accepts ServiceCertificateMap and ServiceCertificateMapOutput values.
// You can construct a concrete instance of `ServiceCertificateMapInput` via:
//
//	ServiceCertificateMap{ "key": ServiceCertificateArgs{...} }
type ServiceCertificateMapInput interface {
	pulumi.Input

	ToServiceCertificateMapOutput() ServiceCertificateMapOutput
	ToServiceCertificateMapOutputWithContext(context.Context) ServiceCertificateMapOutput
}

type ServiceCertificateMap map[string]ServiceCertificateInput

func (ServiceCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceCertificate)(nil)).Elem()
}

func (i ServiceCertificateMap) ToServiceCertificateMapOutput() ServiceCertificateMapOutput {
	return i.ToServiceCertificateMapOutputWithContext(context.Background())
}

func (i ServiceCertificateMap) ToServiceCertificateMapOutputWithContext(ctx context.Context) ServiceCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceCertificateMapOutput)
}

type ServiceCertificateOutput struct{ *pulumi.OutputState }

func (ServiceCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceCertificate)(nil)).Elem()
}

func (o ServiceCertificateOutput) ToServiceCertificateOutput() ServiceCertificateOutput {
	return o
}

func (o ServiceCertificateOutput) ToServiceCertificateOutputWithContext(ctx context.Context) ServiceCertificateOutput {
	return o
}

// Cert of the Certificate in which the Certificate will add.
func (o ServiceCertificateOutput) Cert() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceCertificate) pulumi.StringOutput { return v.Cert }).(pulumi.StringOutput)
}

// Name of the Certificate.
// This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-",
// and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time.
// Suffix .sh and .tel are not supported.
// **NOTE:** One of `certificateName` and `name` must be specified.
func (o ServiceCertificateOutput) CertificateName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceCertificate) pulumi.StringOutput { return v.CertificateName }).(pulumi.StringOutput)
}

// Key of the Certificate in which the Certificate will add.
func (o ServiceCertificateOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceCertificate) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// The lang.
func (o ServiceCertificateOutput) Lang() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceCertificate) pulumi.StringPtrOutput { return v.Lang }).(pulumi.StringPtrOutput)
}

// It has been deprecated from version 1.129.0 and using `certificateName` instead.
//
// Deprecated: attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead.
func (o ServiceCertificateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceCertificate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type ServiceCertificateArrayOutput struct{ *pulumi.OutputState }

func (ServiceCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceCertificate)(nil)).Elem()
}

func (o ServiceCertificateArrayOutput) ToServiceCertificateArrayOutput() ServiceCertificateArrayOutput {
	return o
}

func (o ServiceCertificateArrayOutput) ToServiceCertificateArrayOutputWithContext(ctx context.Context) ServiceCertificateArrayOutput {
	return o
}

func (o ServiceCertificateArrayOutput) Index(i pulumi.IntInput) ServiceCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceCertificate {
		return vs[0].([]*ServiceCertificate)[vs[1].(int)]
	}).(ServiceCertificateOutput)
}

type ServiceCertificateMapOutput struct{ *pulumi.OutputState }

func (ServiceCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceCertificate)(nil)).Elem()
}

func (o ServiceCertificateMapOutput) ToServiceCertificateMapOutput() ServiceCertificateMapOutput {
	return o
}

func (o ServiceCertificateMapOutput) ToServiceCertificateMapOutputWithContext(ctx context.Context) ServiceCertificateMapOutput {
	return o
}

func (o ServiceCertificateMapOutput) MapIndex(k pulumi.StringInput) ServiceCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceCertificate {
		return vs[0].(map[string]*ServiceCertificate)[vs[1].(string)]
	}).(ServiceCertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceCertificateInput)(nil)).Elem(), &ServiceCertificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceCertificateArrayInput)(nil)).Elem(), ServiceCertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceCertificateMapInput)(nil)).Elem(), ServiceCertificateMap{})
	pulumi.RegisterOutputType(ServiceCertificateOutput{})
	pulumi.RegisterOutputType(ServiceCertificateArrayOutput{})
	pulumi.RegisterOutputType(ServiceCertificateMapOutput{})
}
