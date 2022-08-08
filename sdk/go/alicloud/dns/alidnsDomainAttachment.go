// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides bind the domain name to the Alidns instance resource.
//
// > **NOTE:** Available in v1.99.0+.
//
// ## Example Usage
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
// 		_, err := dns.NewAlidnsDomainAttachment(ctx, "dns", &dns.AlidnsDomainAttachmentArgs{
// 			DomainNames: pulumi.StringArray{
// 				pulumi.String("test111.abc"),
// 				pulumi.String("test222.abc"),
// 			},
// 			InstanceId: pulumi.String("dns-cn-mp91lyq9xxxx"),
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
// DNS domain attachment can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:dns/alidnsDomainAttachment:AlidnsDomainAttachment example dns-cn-v0h1ldjhxxx
// ```
type AlidnsDomainAttachment struct {
	pulumi.CustomResourceState

	// The domain names bound to the DNS instance.
	DomainNames pulumi.StringArrayOutput `pulumi:"domainNames"`
	// The id of the DNS instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
}

// NewAlidnsDomainAttachment registers a new resource with the given unique name, arguments, and options.
func NewAlidnsDomainAttachment(ctx *pulumi.Context,
	name string, args *AlidnsDomainAttachmentArgs, opts ...pulumi.ResourceOption) (*AlidnsDomainAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DomainNames == nil {
		return nil, errors.New("invalid value for required argument 'DomainNames'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	var resource AlidnsDomainAttachment
	err := ctx.RegisterResource("alicloud:dns/alidnsDomainAttachment:AlidnsDomainAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlidnsDomainAttachment gets an existing AlidnsDomainAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlidnsDomainAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlidnsDomainAttachmentState, opts ...pulumi.ResourceOption) (*AlidnsDomainAttachment, error) {
	var resource AlidnsDomainAttachment
	err := ctx.ReadResource("alicloud:dns/alidnsDomainAttachment:AlidnsDomainAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlidnsDomainAttachment resources.
type alidnsDomainAttachmentState struct {
	// The domain names bound to the DNS instance.
	DomainNames []string `pulumi:"domainNames"`
	// The id of the DNS instance.
	InstanceId *string `pulumi:"instanceId"`
}

type AlidnsDomainAttachmentState struct {
	// The domain names bound to the DNS instance.
	DomainNames pulumi.StringArrayInput
	// The id of the DNS instance.
	InstanceId pulumi.StringPtrInput
}

func (AlidnsDomainAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*alidnsDomainAttachmentState)(nil)).Elem()
}

type alidnsDomainAttachmentArgs struct {
	// The domain names bound to the DNS instance.
	DomainNames []string `pulumi:"domainNames"`
	// The id of the DNS instance.
	InstanceId string `pulumi:"instanceId"`
}

// The set of arguments for constructing a AlidnsDomainAttachment resource.
type AlidnsDomainAttachmentArgs struct {
	// The domain names bound to the DNS instance.
	DomainNames pulumi.StringArrayInput
	// The id of the DNS instance.
	InstanceId pulumi.StringInput
}

func (AlidnsDomainAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alidnsDomainAttachmentArgs)(nil)).Elem()
}

type AlidnsDomainAttachmentInput interface {
	pulumi.Input

	ToAlidnsDomainAttachmentOutput() AlidnsDomainAttachmentOutput
	ToAlidnsDomainAttachmentOutputWithContext(ctx context.Context) AlidnsDomainAttachmentOutput
}

func (*AlidnsDomainAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**AlidnsDomainAttachment)(nil)).Elem()
}

func (i *AlidnsDomainAttachment) ToAlidnsDomainAttachmentOutput() AlidnsDomainAttachmentOutput {
	return i.ToAlidnsDomainAttachmentOutputWithContext(context.Background())
}

func (i *AlidnsDomainAttachment) ToAlidnsDomainAttachmentOutputWithContext(ctx context.Context) AlidnsDomainAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlidnsDomainAttachmentOutput)
}

// AlidnsDomainAttachmentArrayInput is an input type that accepts AlidnsDomainAttachmentArray and AlidnsDomainAttachmentArrayOutput values.
// You can construct a concrete instance of `AlidnsDomainAttachmentArrayInput` via:
//
//          AlidnsDomainAttachmentArray{ AlidnsDomainAttachmentArgs{...} }
type AlidnsDomainAttachmentArrayInput interface {
	pulumi.Input

	ToAlidnsDomainAttachmentArrayOutput() AlidnsDomainAttachmentArrayOutput
	ToAlidnsDomainAttachmentArrayOutputWithContext(context.Context) AlidnsDomainAttachmentArrayOutput
}

type AlidnsDomainAttachmentArray []AlidnsDomainAttachmentInput

func (AlidnsDomainAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlidnsDomainAttachment)(nil)).Elem()
}

func (i AlidnsDomainAttachmentArray) ToAlidnsDomainAttachmentArrayOutput() AlidnsDomainAttachmentArrayOutput {
	return i.ToAlidnsDomainAttachmentArrayOutputWithContext(context.Background())
}

func (i AlidnsDomainAttachmentArray) ToAlidnsDomainAttachmentArrayOutputWithContext(ctx context.Context) AlidnsDomainAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlidnsDomainAttachmentArrayOutput)
}

// AlidnsDomainAttachmentMapInput is an input type that accepts AlidnsDomainAttachmentMap and AlidnsDomainAttachmentMapOutput values.
// You can construct a concrete instance of `AlidnsDomainAttachmentMapInput` via:
//
//          AlidnsDomainAttachmentMap{ "key": AlidnsDomainAttachmentArgs{...} }
type AlidnsDomainAttachmentMapInput interface {
	pulumi.Input

	ToAlidnsDomainAttachmentMapOutput() AlidnsDomainAttachmentMapOutput
	ToAlidnsDomainAttachmentMapOutputWithContext(context.Context) AlidnsDomainAttachmentMapOutput
}

type AlidnsDomainAttachmentMap map[string]AlidnsDomainAttachmentInput

func (AlidnsDomainAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlidnsDomainAttachment)(nil)).Elem()
}

func (i AlidnsDomainAttachmentMap) ToAlidnsDomainAttachmentMapOutput() AlidnsDomainAttachmentMapOutput {
	return i.ToAlidnsDomainAttachmentMapOutputWithContext(context.Background())
}

func (i AlidnsDomainAttachmentMap) ToAlidnsDomainAttachmentMapOutputWithContext(ctx context.Context) AlidnsDomainAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlidnsDomainAttachmentMapOutput)
}

type AlidnsDomainAttachmentOutput struct{ *pulumi.OutputState }

func (AlidnsDomainAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AlidnsDomainAttachment)(nil)).Elem()
}

func (o AlidnsDomainAttachmentOutput) ToAlidnsDomainAttachmentOutput() AlidnsDomainAttachmentOutput {
	return o
}

func (o AlidnsDomainAttachmentOutput) ToAlidnsDomainAttachmentOutputWithContext(ctx context.Context) AlidnsDomainAttachmentOutput {
	return o
}

// The domain names bound to the DNS instance.
func (o AlidnsDomainAttachmentOutput) DomainNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AlidnsDomainAttachment) pulumi.StringArrayOutput { return v.DomainNames }).(pulumi.StringArrayOutput)
}

// The id of the DNS instance.
func (o AlidnsDomainAttachmentOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *AlidnsDomainAttachment) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

type AlidnsDomainAttachmentArrayOutput struct{ *pulumi.OutputState }

func (AlidnsDomainAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlidnsDomainAttachment)(nil)).Elem()
}

func (o AlidnsDomainAttachmentArrayOutput) ToAlidnsDomainAttachmentArrayOutput() AlidnsDomainAttachmentArrayOutput {
	return o
}

func (o AlidnsDomainAttachmentArrayOutput) ToAlidnsDomainAttachmentArrayOutputWithContext(ctx context.Context) AlidnsDomainAttachmentArrayOutput {
	return o
}

func (o AlidnsDomainAttachmentArrayOutput) Index(i pulumi.IntInput) AlidnsDomainAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AlidnsDomainAttachment {
		return vs[0].([]*AlidnsDomainAttachment)[vs[1].(int)]
	}).(AlidnsDomainAttachmentOutput)
}

type AlidnsDomainAttachmentMapOutput struct{ *pulumi.OutputState }

func (AlidnsDomainAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlidnsDomainAttachment)(nil)).Elem()
}

func (o AlidnsDomainAttachmentMapOutput) ToAlidnsDomainAttachmentMapOutput() AlidnsDomainAttachmentMapOutput {
	return o
}

func (o AlidnsDomainAttachmentMapOutput) ToAlidnsDomainAttachmentMapOutputWithContext(ctx context.Context) AlidnsDomainAttachmentMapOutput {
	return o
}

func (o AlidnsDomainAttachmentMapOutput) MapIndex(k pulumi.StringInput) AlidnsDomainAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AlidnsDomainAttachment {
		return vs[0].(map[string]*AlidnsDomainAttachment)[vs[1].(string)]
	}).(AlidnsDomainAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AlidnsDomainAttachmentInput)(nil)).Elem(), &AlidnsDomainAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlidnsDomainAttachmentArrayInput)(nil)).Elem(), AlidnsDomainAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlidnsDomainAttachmentMapInput)(nil)).Elem(), AlidnsDomainAttachmentMap{})
	pulumi.RegisterOutputType(AlidnsDomainAttachmentOutput{})
	pulumi.RegisterOutputType(AlidnsDomainAttachmentArrayOutput{})
	pulumi.RegisterOutputType(AlidnsDomainAttachmentMapOutput{})
}
