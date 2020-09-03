// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package slb

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// HTTPS listeners of guaranteed-performance SLB support configuring multiple certificates, allowing you to forward requests with different domain names to different backend servers.
// Please refer to the [documentation](https://www.alibabacloud.com/help/doc-detail/85956.htm?spm=a2c63.p38356.b99.40.1c881563Co8p6w) for details.
//
// > **NOTE:** Available in 1.60.0+
//
// > **NOTE:** The instance with shared loadBalancerSpec doesn't support domainExtension.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/slb"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		instance, err := slb.NewLoadBalancer(ctx, "instance", &slb.LoadBalancerArgs{
// 			InternetChargeType: pulumi.String("PayByTraffic"),
// 			Internet:           pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		foo, err := slb.NewServerCertificate(ctx, "foo", &slb.ServerCertificateArgs{
// 			ServerCertificate: pulumi.String("-----BEGIN CERTIFICATE-----\nMIIDdjCCAl4CCQCcm+erkcKN7DANBgkqhkiG9w0BAQsFADB9MQswCQYDVQQGEwJj\nbjELMAkGA1UECAwCYmoxEDAOBgNVBAcMB2JlaWppbmcxDzANBgNVBAoMBmFsaXl1\nbjELMAkGA1UECwwCc2MxFTATBgNVBAMMDHd3dy50ZXN0LmNvbTEaMBgGCSqGSIb3\nDQEJARYLMTIzQDEyMy5jb20wHhcNMTkwNDI2MDM0ODAxWhcNMjQwNDI1MDM0ODAx\nWjB9MQswCQYDVQQGEwJjbjELMAkGA1UECAwCYmoxEDAOBgNVBAcMB2JlaWppbmcx\nDzANBgNVBAoMBmFsaXl1bjELMAkGA1UECwwCc2MxFTATBgNVBAMMDHd3dy50ZXN0\nLmNvbTEaMBgGCSqGSIb3DQEJARYLMTIzQDEyMy5jb20wggEiMA0GCSqGSIb3DQEB\nAQUAA4IBDwAwggEKAoIBAQDKMKF5qmN/uoMjdH3D8aPRcUOA0s8rZpYhG8zbkF1j\n8gHYoB/FDvM7G7dfVsyjbMwLOxKvAhWvHHSpEz/t7gB+QdwrAMiMJwGmtCnXrh2E\nWiXgalMe1y4a/T5R7q+m4T1zFATf+kbnHWfkSGF4W7b6UBoaH+9StQ95CnqzNf/2\np/Of7+S0XzCxFXw8GIVzZk0xFe6lHJzaq06f3mvzrD+4rpO56tTUvrgTY/n61gsF\nZP7f0CJ2JQh6eNRFOEUSfxKu/Dy/+IsQxorCJY2Q59ZAf3rXrqDN104jw9PlwnLl\nqfZz3RMODN6BWjxE8rvRtT0qMfuAfv1gjBdWZN0hUYBRAgMBAAEwDQYJKoZIhvcN\nAQELBQADggEBAABzo82TxGp5poVkd5pLWj5ACgcBv8Cs6oH9D+4Jz9BmyuBUsQXh\n2aG0hQAe1mU61C9konsl/GTW8umJQ4M4lYEztXXwMf5PlBMGwebM0ZbSGg6jKtZg\nWCgJ3eP/FMmyXGL5Jji5+e09eObhUDVle4tdi0On97zBoz85W02rgWFAqZJwiEAP\nt+c7jX7uOSBq2/38iGStlrX5yB1at/gJXXiA5CL5OtlR3Okvb0/QH37efO1Nu39m\nlFi0ODPAVyXjVypAiLguDxPn6AtDTdk9Iw9B19OD4NrzNRWgSSX5vuxo/VcRcgWk\n3gEe9Ca0ZKN20q9XgthAiFFjl1S9ZgdA6Zc=\n-----END CERTIFICATE-----"),
// 			PrivateKey:        pulumi.String("-----BEGIN RSA PRIVATE KEY-----\nMIIEowIBAAKCAQEAyjCheapjf7qDI3R9w/Gj0XFDgNLPK2aWIRvM25BdY/IB2KAf\nxQ7zOxu3X1bMo2zMCzsSrwIVrxx0qRM/7e4AfkHcKwDIjCcBprQp164dhFol4GpT\nHtcuGv0+Ue6vpuE9cxQE3/pG5x1n5EhheFu2+lAaGh/vUrUPeQp6szX/9qfzn+/k\ntF8wsRV8PBiFc2ZNMRXupRyc2qtOn95r86w/uK6TuerU1L64E2P5+tYLBWT+39Ai\ndiUIenjURThFEn8Srvw8v/iLEMaKwiWNkOfWQH96166gzddOI8PT5cJy5an2c90T\nDgzegVo8RPK70bU9KjH7gH79YIwXVmTdIVGAUQIDAQABAoIBAE1J4a/8biR5S3/W\nG+03BYQeY8tuyjqw8FqfoeOcf9agwAvqybouSNQjeCk9qOQfxq/UWQQFK/zQR9gJ\nv7pX7GBXFK5rkj3g+0SaQhRsPmRFgY0Tl8qGPt2aSKRRNVv5ZeADmwlzRn86QmiF\nMp0rkfqFfDTYWEepZszCML0ouzuxsW/9tq7rvtSjsgATNt31B3vFa3D3JBi31jUh\n5nfR9A3bATze7mQw3byEDiVl5ASRDgYyur403P1fDnMy9DBHZ8NaPOsFF6OBpJal\nBJsG5z00hll5PFN2jfmBQKlvAeU7wfwqdaSnGHOfqf2DeTTaFjIQ4gUhRn/m6pLo\n6kXttLECgYEA9sng0Qz/TcPFfM4tQ1gyvB1cKnnGIwg1FP8sfUjbbEgjaHhA224S\nk3BxtX2Kq6fhTXuwusAFc6OVMAZ76FgrQ5K4Ci7+DTsrF28z4b8td+p+lO/DxgP9\nlTgN+ddsiTOV4fUef9Z3yY0Zr0CnBUMbQYRaV2UIbCdiB0G4V/bt9TsCgYEA0bya\nOo9wGI0RJV0bYP7qwO74Ra1/i1viWbRlS7jU37Q+AZstrlKcQ5CTPzOjKFKMiUzl\n4miWacZ0/q2n+Mvd7NbXGXTLijahnyOYKaHJYyh4oBymfkgAifRstE0Ki9gdvArb\n/I+emC0GvLSyfGN8UUeDJs4NmqdEXGqjo2JOV+MCgYALFv1MR5o9Y1u/hQBRs2fs\nPiGDIx+9OUQxYloccyaxEfjNXAIGGkcpavchIbgWiJ++PJ2vdquIC8TLeK8evL+M\n9M3iX0Q5UfxYvD2HmnCvn9D6Xl/cyRcfGnq+TGjrLW9BzSMGuZt+aiHKV0xqFx7l\nbc4leTvMqGRmURS4lzcQOwKBgQCDzA/i4sYfN25h21tcHXSpnsG3D2rJyQi5NCo/\nZjunA92/JqOTGuiFcLGHEszhhtY3ZXJET1LNz18vtzKJnpqrvOnYXlOVW/U+SqDQ\n8JDb1c/PVZGuY1KrXkR9HLiW3kz5IJ3S3PFdUVYdeTN8BQxXCyg4V12nJJtJs912\ny0zN3wKBgGDS6YttCN6aI4EOABYE8fI1EYQ7vhfiYsaWGWSR1l6bQey7KR6M1ACz\nZzMASNyytVt12yXE4/Emv6/pYqigbDLfL1zQJSLJ3EHJYTh2RxjR+AaGDudYFG/T\nliQ9YXhV5Iu2x1pNwrtFnssDdaaGpfA7l3xC00BL7Z+SAJyI4QKA\n-----END RSA PRIVATE KEY-----"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		https, err := slb.NewListener(ctx, "https", &slb.ListenerArgs{
// 			LoadBalancerId:         instance.ID(),
// 			BackendPort:            pulumi.Int(80),
// 			FrontendPort:           pulumi.Int(443),
// 			Protocol:               pulumi.String("https"),
// 			StickySession:          pulumi.String("on"),
// 			StickySessionType:      pulumi.String("insert"),
// 			Cookie:                 pulumi.String("testslblistenercookie"),
// 			CookieTimeout:          pulumi.Int(86400),
// 			HealthCheck:            pulumi.String("on"),
// 			HealthCheckUri:         pulumi.String("/cons"),
// 			HealthCheckConnectPort: pulumi.Int(20),
// 			HealthyThreshold:       pulumi.Int(8),
// 			UnhealthyThreshold:     pulumi.Int(8),
// 			HealthCheckTimeout:     pulumi.Int(8),
// 			HealthCheckInterval:    pulumi.Int(5),
// 			HealthCheckHttpCode:    pulumi.String("http_2xx,http_3xx"),
// 			Bandwidth:              pulumi.Int(10),
// 			SslCertificateId:       foo.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = slb.NewDomainExtension(ctx, "example1", &slb.DomainExtensionArgs{
// 			LoadBalancerId:      instance.ID(),
// 			FrontendPort:        https.FrontendPort,
// 			Domain:              pulumi.String("www.test.com"),
// 			ServerCertificateId: foo.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type DomainExtension struct {
	pulumi.CustomResourceState

	// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
	DeleteProtectionValidation pulumi.BoolPtrOutput `pulumi:"deleteProtectionValidation"`
	// The domain name,
	Domain pulumi.StringOutput `pulumi:"domain"`
	// The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
	FrontendPort pulumi.IntOutput `pulumi:"frontendPort"`
	// The ID of the SLB instance.
	LoadBalancerId pulumi.StringOutput `pulumi:"loadBalancerId"`
	// The ID of the certificate used by the domain name.
	ServerCertificateId pulumi.StringOutput `pulumi:"serverCertificateId"`
}

// NewDomainExtension registers a new resource with the given unique name, arguments, and options.
func NewDomainExtension(ctx *pulumi.Context,
	name string, args *DomainExtensionArgs, opts ...pulumi.ResourceOption) (*DomainExtension, error) {
	if args == nil || args.Domain == nil {
		return nil, errors.New("missing required argument 'Domain'")
	}
	if args == nil || args.FrontendPort == nil {
		return nil, errors.New("missing required argument 'FrontendPort'")
	}
	if args == nil || args.LoadBalancerId == nil {
		return nil, errors.New("missing required argument 'LoadBalancerId'")
	}
	if args == nil || args.ServerCertificateId == nil {
		return nil, errors.New("missing required argument 'ServerCertificateId'")
	}
	if args == nil {
		args = &DomainExtensionArgs{}
	}
	var resource DomainExtension
	err := ctx.RegisterResource("alicloud:slb/domainExtension:DomainExtension", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDomainExtension gets an existing DomainExtension resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDomainExtension(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DomainExtensionState, opts ...pulumi.ResourceOption) (*DomainExtension, error) {
	var resource DomainExtension
	err := ctx.ReadResource("alicloud:slb/domainExtension:DomainExtension", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DomainExtension resources.
type domainExtensionState struct {
	// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
	DeleteProtectionValidation *bool `pulumi:"deleteProtectionValidation"`
	// The domain name,
	Domain *string `pulumi:"domain"`
	// The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
	FrontendPort *int `pulumi:"frontendPort"`
	// The ID of the SLB instance.
	LoadBalancerId *string `pulumi:"loadBalancerId"`
	// The ID of the certificate used by the domain name.
	ServerCertificateId *string `pulumi:"serverCertificateId"`
}

type DomainExtensionState struct {
	// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
	DeleteProtectionValidation pulumi.BoolPtrInput
	// The domain name,
	Domain pulumi.StringPtrInput
	// The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
	FrontendPort pulumi.IntPtrInput
	// The ID of the SLB instance.
	LoadBalancerId pulumi.StringPtrInput
	// The ID of the certificate used by the domain name.
	ServerCertificateId pulumi.StringPtrInput
}

func (DomainExtensionState) ElementType() reflect.Type {
	return reflect.TypeOf((*domainExtensionState)(nil)).Elem()
}

type domainExtensionArgs struct {
	// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
	DeleteProtectionValidation *bool `pulumi:"deleteProtectionValidation"`
	// The domain name,
	Domain string `pulumi:"domain"`
	// The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
	FrontendPort int `pulumi:"frontendPort"`
	// The ID of the SLB instance.
	LoadBalancerId string `pulumi:"loadBalancerId"`
	// The ID of the certificate used by the domain name.
	ServerCertificateId string `pulumi:"serverCertificateId"`
}

// The set of arguments for constructing a DomainExtension resource.
type DomainExtensionArgs struct {
	// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
	DeleteProtectionValidation pulumi.BoolPtrInput
	// The domain name,
	Domain pulumi.StringInput
	// The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
	FrontendPort pulumi.IntInput
	// The ID of the SLB instance.
	LoadBalancerId pulumi.StringInput
	// The ID of the certificate used by the domain name.
	ServerCertificateId pulumi.StringInput
}

func (DomainExtensionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*domainExtensionArgs)(nil)).Elem()
}
