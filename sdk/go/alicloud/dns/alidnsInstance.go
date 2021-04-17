// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Create an Alidns Instance resource.
//
// > **NOTE:** Available in v1.95.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dns"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := dns.NewAlidnsInstance(ctx, "example", &dns.AlidnsInstanceArgs{
// 			DnsSecurity:   pulumi.String("no"),
// 			DomainNumbers: pulumi.String("2"),
// 			Period:        pulumi.Int(1),
// 			RenewPeriod:   pulumi.Int(1),
// 			RenewalStatus: pulumi.String("ManualRenewal"),
// 			VersionCode:   pulumi.String("version_personal"),
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
// DNS instance be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:dns/alidnsInstance:AlidnsInstance example dns-cn-v0h1ldjhfff
// ```
type AlidnsInstance struct {
	pulumi.CustomResourceState

	// Alidns security level. Valid values: `no`, `basic`, `advanced`.
	DnsSecurity pulumi.StringOutput `pulumi:"dnsSecurity"`
	// Number of domain names bound.
	DomainNumbers pulumi.StringOutput `pulumi:"domainNumbers"`
	// The billing method of the Alidns instance. Valid values: `Subscription`. Default to `Subscription`.
	PaymentType pulumi.StringPtrOutput `pulumi:"paymentType"`
	// Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
	Period pulumi.IntPtrOutput `pulumi:"period"`
	// Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
	RenewPeriod pulumi.IntPtrOutput `pulumi:"renewPeriod"`
	// Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
	RenewalStatus pulumi.StringPtrOutput `pulumi:"renewalStatus"`
	// Paid package version. Valid values: `versionPersonal`, `versionEnterpriseBasic`, `versionEnterpriseAdvanced`.
	VersionCode pulumi.StringOutput `pulumi:"versionCode"`
	// Paid package version name.
	VersionName pulumi.StringOutput `pulumi:"versionName"`
}

// NewAlidnsInstance registers a new resource with the given unique name, arguments, and options.
func NewAlidnsInstance(ctx *pulumi.Context,
	name string, args *AlidnsInstanceArgs, opts ...pulumi.ResourceOption) (*AlidnsInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DnsSecurity == nil {
		return nil, errors.New("invalid value for required argument 'DnsSecurity'")
	}
	if args.DomainNumbers == nil {
		return nil, errors.New("invalid value for required argument 'DomainNumbers'")
	}
	if args.VersionCode == nil {
		return nil, errors.New("invalid value for required argument 'VersionCode'")
	}
	var resource AlidnsInstance
	err := ctx.RegisterResource("alicloud:dns/alidnsInstance:AlidnsInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlidnsInstance gets an existing AlidnsInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlidnsInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlidnsInstanceState, opts ...pulumi.ResourceOption) (*AlidnsInstance, error) {
	var resource AlidnsInstance
	err := ctx.ReadResource("alicloud:dns/alidnsInstance:AlidnsInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlidnsInstance resources.
type alidnsInstanceState struct {
	// Alidns security level. Valid values: `no`, `basic`, `advanced`.
	DnsSecurity *string `pulumi:"dnsSecurity"`
	// Number of domain names bound.
	DomainNumbers *string `pulumi:"domainNumbers"`
	// The billing method of the Alidns instance. Valid values: `Subscription`. Default to `Subscription`.
	PaymentType *string `pulumi:"paymentType"`
	// Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
	Period *int `pulumi:"period"`
	// Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
	RenewPeriod *int `pulumi:"renewPeriod"`
	// Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
	RenewalStatus *string `pulumi:"renewalStatus"`
	// Paid package version. Valid values: `versionPersonal`, `versionEnterpriseBasic`, `versionEnterpriseAdvanced`.
	VersionCode *string `pulumi:"versionCode"`
	// Paid package version name.
	VersionName *string `pulumi:"versionName"`
}

type AlidnsInstanceState struct {
	// Alidns security level. Valid values: `no`, `basic`, `advanced`.
	DnsSecurity pulumi.StringPtrInput
	// Number of domain names bound.
	DomainNumbers pulumi.StringPtrInput
	// The billing method of the Alidns instance. Valid values: `Subscription`. Default to `Subscription`.
	PaymentType pulumi.StringPtrInput
	// Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
	Period pulumi.IntPtrInput
	// Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
	RenewPeriod pulumi.IntPtrInput
	// Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
	RenewalStatus pulumi.StringPtrInput
	// Paid package version. Valid values: `versionPersonal`, `versionEnterpriseBasic`, `versionEnterpriseAdvanced`.
	VersionCode pulumi.StringPtrInput
	// Paid package version name.
	VersionName pulumi.StringPtrInput
}

func (AlidnsInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*alidnsInstanceState)(nil)).Elem()
}

type alidnsInstanceArgs struct {
	// Alidns security level. Valid values: `no`, `basic`, `advanced`.
	DnsSecurity string `pulumi:"dnsSecurity"`
	// Number of domain names bound.
	DomainNumbers string `pulumi:"domainNumbers"`
	// The billing method of the Alidns instance. Valid values: `Subscription`. Default to `Subscription`.
	PaymentType *string `pulumi:"paymentType"`
	// Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
	Period *int `pulumi:"period"`
	// Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
	RenewPeriod *int `pulumi:"renewPeriod"`
	// Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
	RenewalStatus *string `pulumi:"renewalStatus"`
	// Paid package version. Valid values: `versionPersonal`, `versionEnterpriseBasic`, `versionEnterpriseAdvanced`.
	VersionCode string `pulumi:"versionCode"`
}

// The set of arguments for constructing a AlidnsInstance resource.
type AlidnsInstanceArgs struct {
	// Alidns security level. Valid values: `no`, `basic`, `advanced`.
	DnsSecurity pulumi.StringInput
	// Number of domain names bound.
	DomainNumbers pulumi.StringInput
	// The billing method of the Alidns instance. Valid values: `Subscription`. Default to `Subscription`.
	PaymentType pulumi.StringPtrInput
	// Creating a pre-paid instance, it must be set, the unit is month, please enter an integer multiple of 12 for annually paid products.
	Period pulumi.IntPtrInput
	// Automatic renewal period, the unit is month. When setting RenewalStatus to AutoRenewal, it must be set.
	RenewPeriod pulumi.IntPtrInput
	// Automatic renewal status. Valid values: `AutoRenewal`, `ManualRenewal`, default to `ManualRenewal`.
	RenewalStatus pulumi.StringPtrInput
	// Paid package version. Valid values: `versionPersonal`, `versionEnterpriseBasic`, `versionEnterpriseAdvanced`.
	VersionCode pulumi.StringInput
}

func (AlidnsInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alidnsInstanceArgs)(nil)).Elem()
}

type AlidnsInstanceInput interface {
	pulumi.Input

	ToAlidnsInstanceOutput() AlidnsInstanceOutput
	ToAlidnsInstanceOutputWithContext(ctx context.Context) AlidnsInstanceOutput
}

func (*AlidnsInstance) ElementType() reflect.Type {
	return reflect.TypeOf((*AlidnsInstance)(nil))
}

func (i *AlidnsInstance) ToAlidnsInstanceOutput() AlidnsInstanceOutput {
	return i.ToAlidnsInstanceOutputWithContext(context.Background())
}

func (i *AlidnsInstance) ToAlidnsInstanceOutputWithContext(ctx context.Context) AlidnsInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlidnsInstanceOutput)
}

func (i *AlidnsInstance) ToAlidnsInstancePtrOutput() AlidnsInstancePtrOutput {
	return i.ToAlidnsInstancePtrOutputWithContext(context.Background())
}

func (i *AlidnsInstance) ToAlidnsInstancePtrOutputWithContext(ctx context.Context) AlidnsInstancePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlidnsInstancePtrOutput)
}

type AlidnsInstancePtrInput interface {
	pulumi.Input

	ToAlidnsInstancePtrOutput() AlidnsInstancePtrOutput
	ToAlidnsInstancePtrOutputWithContext(ctx context.Context) AlidnsInstancePtrOutput
}

type alidnsInstancePtrType AlidnsInstanceArgs

func (*alidnsInstancePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AlidnsInstance)(nil))
}

func (i *alidnsInstancePtrType) ToAlidnsInstancePtrOutput() AlidnsInstancePtrOutput {
	return i.ToAlidnsInstancePtrOutputWithContext(context.Background())
}

func (i *alidnsInstancePtrType) ToAlidnsInstancePtrOutputWithContext(ctx context.Context) AlidnsInstancePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlidnsInstancePtrOutput)
}

// AlidnsInstanceArrayInput is an input type that accepts AlidnsInstanceArray and AlidnsInstanceArrayOutput values.
// You can construct a concrete instance of `AlidnsInstanceArrayInput` via:
//
//          AlidnsInstanceArray{ AlidnsInstanceArgs{...} }
type AlidnsInstanceArrayInput interface {
	pulumi.Input

	ToAlidnsInstanceArrayOutput() AlidnsInstanceArrayOutput
	ToAlidnsInstanceArrayOutputWithContext(context.Context) AlidnsInstanceArrayOutput
}

type AlidnsInstanceArray []AlidnsInstanceInput

func (AlidnsInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AlidnsInstance)(nil))
}

func (i AlidnsInstanceArray) ToAlidnsInstanceArrayOutput() AlidnsInstanceArrayOutput {
	return i.ToAlidnsInstanceArrayOutputWithContext(context.Background())
}

func (i AlidnsInstanceArray) ToAlidnsInstanceArrayOutputWithContext(ctx context.Context) AlidnsInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlidnsInstanceArrayOutput)
}

// AlidnsInstanceMapInput is an input type that accepts AlidnsInstanceMap and AlidnsInstanceMapOutput values.
// You can construct a concrete instance of `AlidnsInstanceMapInput` via:
//
//          AlidnsInstanceMap{ "key": AlidnsInstanceArgs{...} }
type AlidnsInstanceMapInput interface {
	pulumi.Input

	ToAlidnsInstanceMapOutput() AlidnsInstanceMapOutput
	ToAlidnsInstanceMapOutputWithContext(context.Context) AlidnsInstanceMapOutput
}

type AlidnsInstanceMap map[string]AlidnsInstanceInput

func (AlidnsInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AlidnsInstance)(nil))
}

func (i AlidnsInstanceMap) ToAlidnsInstanceMapOutput() AlidnsInstanceMapOutput {
	return i.ToAlidnsInstanceMapOutputWithContext(context.Background())
}

func (i AlidnsInstanceMap) ToAlidnsInstanceMapOutputWithContext(ctx context.Context) AlidnsInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlidnsInstanceMapOutput)
}

type AlidnsInstanceOutput struct {
	*pulumi.OutputState
}

func (AlidnsInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AlidnsInstance)(nil))
}

func (o AlidnsInstanceOutput) ToAlidnsInstanceOutput() AlidnsInstanceOutput {
	return o
}

func (o AlidnsInstanceOutput) ToAlidnsInstanceOutputWithContext(ctx context.Context) AlidnsInstanceOutput {
	return o
}

func (o AlidnsInstanceOutput) ToAlidnsInstancePtrOutput() AlidnsInstancePtrOutput {
	return o.ToAlidnsInstancePtrOutputWithContext(context.Background())
}

func (o AlidnsInstanceOutput) ToAlidnsInstancePtrOutputWithContext(ctx context.Context) AlidnsInstancePtrOutput {
	return o.ApplyT(func(v AlidnsInstance) *AlidnsInstance {
		return &v
	}).(AlidnsInstancePtrOutput)
}

type AlidnsInstancePtrOutput struct {
	*pulumi.OutputState
}

func (AlidnsInstancePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AlidnsInstance)(nil))
}

func (o AlidnsInstancePtrOutput) ToAlidnsInstancePtrOutput() AlidnsInstancePtrOutput {
	return o
}

func (o AlidnsInstancePtrOutput) ToAlidnsInstancePtrOutputWithContext(ctx context.Context) AlidnsInstancePtrOutput {
	return o
}

type AlidnsInstanceArrayOutput struct{ *pulumi.OutputState }

func (AlidnsInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AlidnsInstance)(nil))
}

func (o AlidnsInstanceArrayOutput) ToAlidnsInstanceArrayOutput() AlidnsInstanceArrayOutput {
	return o
}

func (o AlidnsInstanceArrayOutput) ToAlidnsInstanceArrayOutputWithContext(ctx context.Context) AlidnsInstanceArrayOutput {
	return o
}

func (o AlidnsInstanceArrayOutput) Index(i pulumi.IntInput) AlidnsInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AlidnsInstance {
		return vs[0].([]AlidnsInstance)[vs[1].(int)]
	}).(AlidnsInstanceOutput)
}

type AlidnsInstanceMapOutput struct{ *pulumi.OutputState }

func (AlidnsInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AlidnsInstance)(nil))
}

func (o AlidnsInstanceMapOutput) ToAlidnsInstanceMapOutput() AlidnsInstanceMapOutput {
	return o
}

func (o AlidnsInstanceMapOutput) ToAlidnsInstanceMapOutputWithContext(ctx context.Context) AlidnsInstanceMapOutput {
	return o
}

func (o AlidnsInstanceMapOutput) MapIndex(k pulumi.StringInput) AlidnsInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AlidnsInstance {
		return vs[0].(map[string]AlidnsInstance)[vs[1].(string)]
	}).(AlidnsInstanceOutput)
}

func init() {
	pulumi.RegisterOutputType(AlidnsInstanceOutput{})
	pulumi.RegisterOutputType(AlidnsInstancePtrOutput{})
	pulumi.RegisterOutputType(AlidnsInstanceArrayOutput{})
	pulumi.RegisterOutputType(AlidnsInstanceMapOutput{})
}
