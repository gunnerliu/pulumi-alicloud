// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package alb

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ALB Security Policy resource.
//
// For information about ALB Security Policy and how to use it, see [What is Security Policy](https://www.alibabacloud.com/help/doc-detail/213607.htm).
//
// > **NOTE:** Available in v1.130.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/alb"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		name := "testAccSecurityPolicy"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		_, err := alb.NewSecurityPolicy(ctx, "default", &alb.SecurityPolicyArgs{
// 			SecurityPolicyName: pulumi.String(name),
// 			TlsVersions: pulumi.StringArray{
// 				pulumi.String("TLSv1.0"),
// 			},
// 			Ciphers: pulumi.StringArray{
// 				pulumi.String("ECDHE-ECDSA-AES128-SHA"),
// 				pulumi.String("AES256-SHA"),
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
// ALB Security Policy can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:alb/securityPolicy:SecurityPolicy example <id>
// ```
type SecurityPolicy struct {
	pulumi.CustomResourceState

	// The supported cipher suites, which are determined by the TLS protocol version.The specified cipher suites must be supported by at least one TLS protocol version that you select.
	Ciphers pulumi.StringArrayOutput `pulumi:"ciphers"`
	// The dry run.
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
	SecurityPolicyName pulumi.StringOutput `pulumi:"securityPolicyName"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	Tags   pulumi.MapOutput    `pulumi:"tags"`
	// The TLS protocol versions that are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
	TlsVersions pulumi.StringArrayOutput `pulumi:"tlsVersions"`
}

// NewSecurityPolicy registers a new resource with the given unique name, arguments, and options.
func NewSecurityPolicy(ctx *pulumi.Context,
	name string, args *SecurityPolicyArgs, opts ...pulumi.ResourceOption) (*SecurityPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Ciphers == nil {
		return nil, errors.New("invalid value for required argument 'Ciphers'")
	}
	if args.SecurityPolicyName == nil {
		return nil, errors.New("invalid value for required argument 'SecurityPolicyName'")
	}
	if args.TlsVersions == nil {
		return nil, errors.New("invalid value for required argument 'TlsVersions'")
	}
	var resource SecurityPolicy
	err := ctx.RegisterResource("alicloud:alb/securityPolicy:SecurityPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecurityPolicy gets an existing SecurityPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecurityPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecurityPolicyState, opts ...pulumi.ResourceOption) (*SecurityPolicy, error) {
	var resource SecurityPolicy
	err := ctx.ReadResource("alicloud:alb/securityPolicy:SecurityPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecurityPolicy resources.
type securityPolicyState struct {
	// The supported cipher suites, which are determined by the TLS protocol version.The specified cipher suites must be supported by at least one TLS protocol version that you select.
	Ciphers []string `pulumi:"ciphers"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
	SecurityPolicyName *string `pulumi:"securityPolicyName"`
	// The status of the resource.
	Status *string                `pulumi:"status"`
	Tags   map[string]interface{} `pulumi:"tags"`
	// The TLS protocol versions that are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
	TlsVersions []string `pulumi:"tlsVersions"`
}

type SecurityPolicyState struct {
	// The supported cipher suites, which are determined by the TLS protocol version.The specified cipher suites must be supported by at least one TLS protocol version that you select.
	Ciphers pulumi.StringArrayInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
	SecurityPolicyName pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	Tags   pulumi.MapInput
	// The TLS protocol versions that are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
	TlsVersions pulumi.StringArrayInput
}

func (SecurityPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*securityPolicyState)(nil)).Elem()
}

type securityPolicyArgs struct {
	// The supported cipher suites, which are determined by the TLS protocol version.The specified cipher suites must be supported by at least one TLS protocol version that you select.
	Ciphers []string `pulumi:"ciphers"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
	SecurityPolicyName string                 `pulumi:"securityPolicyName"`
	Tags               map[string]interface{} `pulumi:"tags"`
	// The TLS protocol versions that are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
	TlsVersions []string `pulumi:"tlsVersions"`
}

// The set of arguments for constructing a SecurityPolicy resource.
type SecurityPolicyArgs struct {
	// The supported cipher suites, which are determined by the TLS protocol version.The specified cipher suites must be supported by at least one TLS protocol version that you select.
	Ciphers pulumi.StringArrayInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
	SecurityPolicyName pulumi.StringInput
	Tags               pulumi.MapInput
	// The TLS protocol versions that are supported. Valid values: TLSv1.0, TLSv1.1, TLSv1.2 and TLSv1.3.
	TlsVersions pulumi.StringArrayInput
}

func (SecurityPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*securityPolicyArgs)(nil)).Elem()
}

type SecurityPolicyInput interface {
	pulumi.Input

	ToSecurityPolicyOutput() SecurityPolicyOutput
	ToSecurityPolicyOutputWithContext(ctx context.Context) SecurityPolicyOutput
}

func (*SecurityPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**SecurityPolicy)(nil)).Elem()
}

func (i *SecurityPolicy) ToSecurityPolicyOutput() SecurityPolicyOutput {
	return i.ToSecurityPolicyOutputWithContext(context.Background())
}

func (i *SecurityPolicy) ToSecurityPolicyOutputWithContext(ctx context.Context) SecurityPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityPolicyOutput)
}

// SecurityPolicyArrayInput is an input type that accepts SecurityPolicyArray and SecurityPolicyArrayOutput values.
// You can construct a concrete instance of `SecurityPolicyArrayInput` via:
//
//          SecurityPolicyArray{ SecurityPolicyArgs{...} }
type SecurityPolicyArrayInput interface {
	pulumi.Input

	ToSecurityPolicyArrayOutput() SecurityPolicyArrayOutput
	ToSecurityPolicyArrayOutputWithContext(context.Context) SecurityPolicyArrayOutput
}

type SecurityPolicyArray []SecurityPolicyInput

func (SecurityPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecurityPolicy)(nil)).Elem()
}

func (i SecurityPolicyArray) ToSecurityPolicyArrayOutput() SecurityPolicyArrayOutput {
	return i.ToSecurityPolicyArrayOutputWithContext(context.Background())
}

func (i SecurityPolicyArray) ToSecurityPolicyArrayOutputWithContext(ctx context.Context) SecurityPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityPolicyArrayOutput)
}

// SecurityPolicyMapInput is an input type that accepts SecurityPolicyMap and SecurityPolicyMapOutput values.
// You can construct a concrete instance of `SecurityPolicyMapInput` via:
//
//          SecurityPolicyMap{ "key": SecurityPolicyArgs{...} }
type SecurityPolicyMapInput interface {
	pulumi.Input

	ToSecurityPolicyMapOutput() SecurityPolicyMapOutput
	ToSecurityPolicyMapOutputWithContext(context.Context) SecurityPolicyMapOutput
}

type SecurityPolicyMap map[string]SecurityPolicyInput

func (SecurityPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecurityPolicy)(nil)).Elem()
}

func (i SecurityPolicyMap) ToSecurityPolicyMapOutput() SecurityPolicyMapOutput {
	return i.ToSecurityPolicyMapOutputWithContext(context.Background())
}

func (i SecurityPolicyMap) ToSecurityPolicyMapOutputWithContext(ctx context.Context) SecurityPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityPolicyMapOutput)
}

type SecurityPolicyOutput struct{ *pulumi.OutputState }

func (SecurityPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecurityPolicy)(nil)).Elem()
}

func (o SecurityPolicyOutput) ToSecurityPolicyOutput() SecurityPolicyOutput {
	return o
}

func (o SecurityPolicyOutput) ToSecurityPolicyOutputWithContext(ctx context.Context) SecurityPolicyOutput {
	return o
}

type SecurityPolicyArrayOutput struct{ *pulumi.OutputState }

func (SecurityPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecurityPolicy)(nil)).Elem()
}

func (o SecurityPolicyArrayOutput) ToSecurityPolicyArrayOutput() SecurityPolicyArrayOutput {
	return o
}

func (o SecurityPolicyArrayOutput) ToSecurityPolicyArrayOutputWithContext(ctx context.Context) SecurityPolicyArrayOutput {
	return o
}

func (o SecurityPolicyArrayOutput) Index(i pulumi.IntInput) SecurityPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecurityPolicy {
		return vs[0].([]*SecurityPolicy)[vs[1].(int)]
	}).(SecurityPolicyOutput)
}

type SecurityPolicyMapOutput struct{ *pulumi.OutputState }

func (SecurityPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecurityPolicy)(nil)).Elem()
}

func (o SecurityPolicyMapOutput) ToSecurityPolicyMapOutput() SecurityPolicyMapOutput {
	return o
}

func (o SecurityPolicyMapOutput) ToSecurityPolicyMapOutputWithContext(ctx context.Context) SecurityPolicyMapOutput {
	return o
}

func (o SecurityPolicyMapOutput) MapIndex(k pulumi.StringInput) SecurityPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecurityPolicy {
		return vs[0].(map[string]*SecurityPolicy)[vs[1].(string)]
	}).(SecurityPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityPolicyInput)(nil)).Elem(), &SecurityPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityPolicyArrayInput)(nil)).Elem(), SecurityPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityPolicyMapInput)(nil)).Elem(), SecurityPolicyMap{})
	pulumi.RegisterOutputType(SecurityPolicyOutput{})
	pulumi.RegisterOutputType(SecurityPolicyArrayOutput{})
	pulumi.RegisterOutputType(SecurityPolicyMapOutput{})
}
