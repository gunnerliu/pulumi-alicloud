// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudfirewall

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloud Firewall Control Policy resource.
//
// For information about Cloud Firewall Control Policy and how to use it, see [What is Control Policy](https://www.alibabacloud.com/help/doc-detail/138867.htm).
//
// > **NOTE:** Available in v1.129.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cloudfirewall"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudfirewall.NewControlPolicy(ctx, "example", &cloudfirewall.ControlPolicyArgs{
//				AclAction:       pulumi.String("accept"),
//				ApplicationName: pulumi.String("ANY"),
//				Description:     pulumi.String("example"),
//				Destination:     pulumi.String("100.1.1.0/24"),
//				DestinationType: pulumi.String("net"),
//				Direction:       pulumi.String("out"),
//				Proto:           pulumi.String("ANY"),
//				Source:          pulumi.String("1.2.3.0/24"),
//				SourceType:      pulumi.String("net"),
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
// Cloud Firewall Control Policy can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:cloudfirewall/controlPolicy:ControlPolicy example <acl_uuid>:<direction>
// ```
type ControlPolicy struct {
	pulumi.CustomResourceState

	// The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
	AclAction pulumi.StringOutput `pulumi:"aclAction"`
	// (Available in v1.148.0+) The unique ID of the access control policy.
	AclUuid pulumi.StringOutput `pulumi:"aclUuid"`
	// The application type that the access control policy supports.If `direction` is `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
	ApplicationName pulumi.StringOutput `pulumi:"applicationName"`
	// The description of the access control policy.
	Description pulumi.StringOutput `pulumi:"description"`
	// The destination port defined in the access control policy.
	DestPort pulumi.StringOutput `pulumi:"destPort"`
	// The destination port address book defined in the access control policy.
	DestPortGroup pulumi.StringOutput `pulumi:"destPortGroup"`
	// The destination port type defined in the access control policy. Valid values: `group`, `port`.
	DestPortType pulumi.StringOutput `pulumi:"destPortType"`
	// The destination address defined in the access control policy.
	Destination pulumi.StringOutput `pulumi:"destination"`
	// DestinationType. Valid values: If Direction is `in`, the valid values are `net`, `group`. If `direction` is `out`, the valid values are `net`, `group`, `domain`, `location`.
	DestinationType pulumi.StringOutput `pulumi:"destinationType"`
	// Direction. Valid values: `in`, `out`.
	Direction pulumi.StringOutput `pulumi:"direction"`
	// The ip version.
	IpVersion pulumi.StringPtrOutput `pulumi:"ipVersion"`
	// DestPortGroupPorts. Valid values: `en`, `zh`.
	Lang pulumi.StringPtrOutput `pulumi:"lang"`
	// Proto. Valid values: `  TCP `, `  UDP `, `ANY`, `ICMP`.
	Proto pulumi.StringOutput `pulumi:"proto"`
	// Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values: `true`, `false`.
	Release pulumi.StringOutput `pulumi:"release"`
	// Source.
	Source pulumi.StringOutput `pulumi:"source"`
	// The source ip.
	SourceIp pulumi.StringOutput `pulumi:"sourceIp"`
	// SourceType. Valid values: If `direction` is `in`, the valid values are `net`, `group`, `location`. If `direction` is `out`, the valid values are `net`, `group`.
	SourceType pulumi.StringOutput `pulumi:"sourceType"`
}

// NewControlPolicy registers a new resource with the given unique name, arguments, and options.
func NewControlPolicy(ctx *pulumi.Context,
	name string, args *ControlPolicyArgs, opts ...pulumi.ResourceOption) (*ControlPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AclAction == nil {
		return nil, errors.New("invalid value for required argument 'AclAction'")
	}
	if args.ApplicationName == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationName'")
	}
	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.Destination == nil {
		return nil, errors.New("invalid value for required argument 'Destination'")
	}
	if args.DestinationType == nil {
		return nil, errors.New("invalid value for required argument 'DestinationType'")
	}
	if args.Direction == nil {
		return nil, errors.New("invalid value for required argument 'Direction'")
	}
	if args.Proto == nil {
		return nil, errors.New("invalid value for required argument 'Proto'")
	}
	if args.Source == nil {
		return nil, errors.New("invalid value for required argument 'Source'")
	}
	if args.SourceType == nil {
		return nil, errors.New("invalid value for required argument 'SourceType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ControlPolicy
	err := ctx.RegisterResource("alicloud:cloudfirewall/controlPolicy:ControlPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetControlPolicy gets an existing ControlPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetControlPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ControlPolicyState, opts ...pulumi.ResourceOption) (*ControlPolicy, error) {
	var resource ControlPolicy
	err := ctx.ReadResource("alicloud:cloudfirewall/controlPolicy:ControlPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ControlPolicy resources.
type controlPolicyState struct {
	// The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
	AclAction *string `pulumi:"aclAction"`
	// (Available in v1.148.0+) The unique ID of the access control policy.
	AclUuid *string `pulumi:"aclUuid"`
	// The application type that the access control policy supports.If `direction` is `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
	ApplicationName *string `pulumi:"applicationName"`
	// The description of the access control policy.
	Description *string `pulumi:"description"`
	// The destination port defined in the access control policy.
	DestPort *string `pulumi:"destPort"`
	// The destination port address book defined in the access control policy.
	DestPortGroup *string `pulumi:"destPortGroup"`
	// The destination port type defined in the access control policy. Valid values: `group`, `port`.
	DestPortType *string `pulumi:"destPortType"`
	// The destination address defined in the access control policy.
	Destination *string `pulumi:"destination"`
	// DestinationType. Valid values: If Direction is `in`, the valid values are `net`, `group`. If `direction` is `out`, the valid values are `net`, `group`, `domain`, `location`.
	DestinationType *string `pulumi:"destinationType"`
	// Direction. Valid values: `in`, `out`.
	Direction *string `pulumi:"direction"`
	// The ip version.
	IpVersion *string `pulumi:"ipVersion"`
	// DestPortGroupPorts. Valid values: `en`, `zh`.
	Lang *string `pulumi:"lang"`
	// Proto. Valid values: `  TCP `, `  UDP `, `ANY`, `ICMP`.
	Proto *string `pulumi:"proto"`
	// Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values: `true`, `false`.
	Release *string `pulumi:"release"`
	// Source.
	Source *string `pulumi:"source"`
	// The source ip.
	SourceIp *string `pulumi:"sourceIp"`
	// SourceType. Valid values: If `direction` is `in`, the valid values are `net`, `group`, `location`. If `direction` is `out`, the valid values are `net`, `group`.
	SourceType *string `pulumi:"sourceType"`
}

type ControlPolicyState struct {
	// The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
	AclAction pulumi.StringPtrInput
	// (Available in v1.148.0+) The unique ID of the access control policy.
	AclUuid pulumi.StringPtrInput
	// The application type that the access control policy supports.If `direction` is `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
	ApplicationName pulumi.StringPtrInput
	// The description of the access control policy.
	Description pulumi.StringPtrInput
	// The destination port defined in the access control policy.
	DestPort pulumi.StringPtrInput
	// The destination port address book defined in the access control policy.
	DestPortGroup pulumi.StringPtrInput
	// The destination port type defined in the access control policy. Valid values: `group`, `port`.
	DestPortType pulumi.StringPtrInput
	// The destination address defined in the access control policy.
	Destination pulumi.StringPtrInput
	// DestinationType. Valid values: If Direction is `in`, the valid values are `net`, `group`. If `direction` is `out`, the valid values are `net`, `group`, `domain`, `location`.
	DestinationType pulumi.StringPtrInput
	// Direction. Valid values: `in`, `out`.
	Direction pulumi.StringPtrInput
	// The ip version.
	IpVersion pulumi.StringPtrInput
	// DestPortGroupPorts. Valid values: `en`, `zh`.
	Lang pulumi.StringPtrInput
	// Proto. Valid values: `  TCP `, `  UDP `, `ANY`, `ICMP`.
	Proto pulumi.StringPtrInput
	// Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values: `true`, `false`.
	Release pulumi.StringPtrInput
	// Source.
	Source pulumi.StringPtrInput
	// The source ip.
	SourceIp pulumi.StringPtrInput
	// SourceType. Valid values: If `direction` is `in`, the valid values are `net`, `group`, `location`. If `direction` is `out`, the valid values are `net`, `group`.
	SourceType pulumi.StringPtrInput
}

func (ControlPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*controlPolicyState)(nil)).Elem()
}

type controlPolicyArgs struct {
	// The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
	AclAction string `pulumi:"aclAction"`
	// The application type that the access control policy supports.If `direction` is `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
	ApplicationName string `pulumi:"applicationName"`
	// The description of the access control policy.
	Description string `pulumi:"description"`
	// The destination port defined in the access control policy.
	DestPort *string `pulumi:"destPort"`
	// The destination port address book defined in the access control policy.
	DestPortGroup *string `pulumi:"destPortGroup"`
	// The destination port type defined in the access control policy. Valid values: `group`, `port`.
	DestPortType *string `pulumi:"destPortType"`
	// The destination address defined in the access control policy.
	Destination string `pulumi:"destination"`
	// DestinationType. Valid values: If Direction is `in`, the valid values are `net`, `group`. If `direction` is `out`, the valid values are `net`, `group`, `domain`, `location`.
	DestinationType string `pulumi:"destinationType"`
	// Direction. Valid values: `in`, `out`.
	Direction string `pulumi:"direction"`
	// The ip version.
	IpVersion *string `pulumi:"ipVersion"`
	// DestPortGroupPorts. Valid values: `en`, `zh`.
	Lang *string `pulumi:"lang"`
	// Proto. Valid values: `  TCP `, `  UDP `, `ANY`, `ICMP`.
	Proto string `pulumi:"proto"`
	// Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values: `true`, `false`.
	Release *string `pulumi:"release"`
	// Source.
	Source string `pulumi:"source"`
	// The source ip.
	SourceIp *string `pulumi:"sourceIp"`
	// SourceType. Valid values: If `direction` is `in`, the valid values are `net`, `group`, `location`. If `direction` is `out`, the valid values are `net`, `group`.
	SourceType string `pulumi:"sourceType"`
}

// The set of arguments for constructing a ControlPolicy resource.
type ControlPolicyArgs struct {
	// The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
	AclAction pulumi.StringInput
	// The application type that the access control policy supports.If `direction` is `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
	ApplicationName pulumi.StringInput
	// The description of the access control policy.
	Description pulumi.StringInput
	// The destination port defined in the access control policy.
	DestPort pulumi.StringPtrInput
	// The destination port address book defined in the access control policy.
	DestPortGroup pulumi.StringPtrInput
	// The destination port type defined in the access control policy. Valid values: `group`, `port`.
	DestPortType pulumi.StringPtrInput
	// The destination address defined in the access control policy.
	Destination pulumi.StringInput
	// DestinationType. Valid values: If Direction is `in`, the valid values are `net`, `group`. If `direction` is `out`, the valid values are `net`, `group`, `domain`, `location`.
	DestinationType pulumi.StringInput
	// Direction. Valid values: `in`, `out`.
	Direction pulumi.StringInput
	// The ip version.
	IpVersion pulumi.StringPtrInput
	// DestPortGroupPorts. Valid values: `en`, `zh`.
	Lang pulumi.StringPtrInput
	// Proto. Valid values: `  TCP `, `  UDP `, `ANY`, `ICMP`.
	Proto pulumi.StringInput
	// Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values: `true`, `false`.
	Release pulumi.StringPtrInput
	// Source.
	Source pulumi.StringInput
	// The source ip.
	SourceIp pulumi.StringPtrInput
	// SourceType. Valid values: If `direction` is `in`, the valid values are `net`, `group`, `location`. If `direction` is `out`, the valid values are `net`, `group`.
	SourceType pulumi.StringInput
}

func (ControlPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*controlPolicyArgs)(nil)).Elem()
}

type ControlPolicyInput interface {
	pulumi.Input

	ToControlPolicyOutput() ControlPolicyOutput
	ToControlPolicyOutputWithContext(ctx context.Context) ControlPolicyOutput
}

func (*ControlPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ControlPolicy)(nil)).Elem()
}

func (i *ControlPolicy) ToControlPolicyOutput() ControlPolicyOutput {
	return i.ToControlPolicyOutputWithContext(context.Background())
}

func (i *ControlPolicy) ToControlPolicyOutputWithContext(ctx context.Context) ControlPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ControlPolicyOutput)
}

// ControlPolicyArrayInput is an input type that accepts ControlPolicyArray and ControlPolicyArrayOutput values.
// You can construct a concrete instance of `ControlPolicyArrayInput` via:
//
//	ControlPolicyArray{ ControlPolicyArgs{...} }
type ControlPolicyArrayInput interface {
	pulumi.Input

	ToControlPolicyArrayOutput() ControlPolicyArrayOutput
	ToControlPolicyArrayOutputWithContext(context.Context) ControlPolicyArrayOutput
}

type ControlPolicyArray []ControlPolicyInput

func (ControlPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ControlPolicy)(nil)).Elem()
}

func (i ControlPolicyArray) ToControlPolicyArrayOutput() ControlPolicyArrayOutput {
	return i.ToControlPolicyArrayOutputWithContext(context.Background())
}

func (i ControlPolicyArray) ToControlPolicyArrayOutputWithContext(ctx context.Context) ControlPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ControlPolicyArrayOutput)
}

// ControlPolicyMapInput is an input type that accepts ControlPolicyMap and ControlPolicyMapOutput values.
// You can construct a concrete instance of `ControlPolicyMapInput` via:
//
//	ControlPolicyMap{ "key": ControlPolicyArgs{...} }
type ControlPolicyMapInput interface {
	pulumi.Input

	ToControlPolicyMapOutput() ControlPolicyMapOutput
	ToControlPolicyMapOutputWithContext(context.Context) ControlPolicyMapOutput
}

type ControlPolicyMap map[string]ControlPolicyInput

func (ControlPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ControlPolicy)(nil)).Elem()
}

func (i ControlPolicyMap) ToControlPolicyMapOutput() ControlPolicyMapOutput {
	return i.ToControlPolicyMapOutputWithContext(context.Background())
}

func (i ControlPolicyMap) ToControlPolicyMapOutputWithContext(ctx context.Context) ControlPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ControlPolicyMapOutput)
}

type ControlPolicyOutput struct{ *pulumi.OutputState }

func (ControlPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ControlPolicy)(nil)).Elem()
}

func (o ControlPolicyOutput) ToControlPolicyOutput() ControlPolicyOutput {
	return o
}

func (o ControlPolicyOutput) ToControlPolicyOutputWithContext(ctx context.Context) ControlPolicyOutput {
	return o
}

// The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
func (o ControlPolicyOutput) AclAction() pulumi.StringOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringOutput { return v.AclAction }).(pulumi.StringOutput)
}

// (Available in v1.148.0+) The unique ID of the access control policy.
func (o ControlPolicyOutput) AclUuid() pulumi.StringOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringOutput { return v.AclUuid }).(pulumi.StringOutput)
}

// The application type that the access control policy supports.If `direction` is `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
func (o ControlPolicyOutput) ApplicationName() pulumi.StringOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringOutput { return v.ApplicationName }).(pulumi.StringOutput)
}

// The description of the access control policy.
func (o ControlPolicyOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The destination port defined in the access control policy.
func (o ControlPolicyOutput) DestPort() pulumi.StringOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringOutput { return v.DestPort }).(pulumi.StringOutput)
}

// The destination port address book defined in the access control policy.
func (o ControlPolicyOutput) DestPortGroup() pulumi.StringOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringOutput { return v.DestPortGroup }).(pulumi.StringOutput)
}

// The destination port type defined in the access control policy. Valid values: `group`, `port`.
func (o ControlPolicyOutput) DestPortType() pulumi.StringOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringOutput { return v.DestPortType }).(pulumi.StringOutput)
}

// The destination address defined in the access control policy.
func (o ControlPolicyOutput) Destination() pulumi.StringOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringOutput { return v.Destination }).(pulumi.StringOutput)
}

// DestinationType. Valid values: If Direction is `in`, the valid values are `net`, `group`. If `direction` is `out`, the valid values are `net`, `group`, `domain`, `location`.
func (o ControlPolicyOutput) DestinationType() pulumi.StringOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringOutput { return v.DestinationType }).(pulumi.StringOutput)
}

// Direction. Valid values: `in`, `out`.
func (o ControlPolicyOutput) Direction() pulumi.StringOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringOutput { return v.Direction }).(pulumi.StringOutput)
}

// The ip version.
func (o ControlPolicyOutput) IpVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringPtrOutput { return v.IpVersion }).(pulumi.StringPtrOutput)
}

// DestPortGroupPorts. Valid values: `en`, `zh`.
func (o ControlPolicyOutput) Lang() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringPtrOutput { return v.Lang }).(pulumi.StringPtrOutput)
}

// Proto. Valid values: `  TCP `, `  UDP `, `ANY`, `ICMP`.
func (o ControlPolicyOutput) Proto() pulumi.StringOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringOutput { return v.Proto }).(pulumi.StringOutput)
}

// Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values: `true`, `false`.
func (o ControlPolicyOutput) Release() pulumi.StringOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringOutput { return v.Release }).(pulumi.StringOutput)
}

// Source.
func (o ControlPolicyOutput) Source() pulumi.StringOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringOutput { return v.Source }).(pulumi.StringOutput)
}

// The source ip.
func (o ControlPolicyOutput) SourceIp() pulumi.StringOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringOutput { return v.SourceIp }).(pulumi.StringOutput)
}

// SourceType. Valid values: If `direction` is `in`, the valid values are `net`, `group`, `location`. If `direction` is `out`, the valid values are `net`, `group`.
func (o ControlPolicyOutput) SourceType() pulumi.StringOutput {
	return o.ApplyT(func(v *ControlPolicy) pulumi.StringOutput { return v.SourceType }).(pulumi.StringOutput)
}

type ControlPolicyArrayOutput struct{ *pulumi.OutputState }

func (ControlPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ControlPolicy)(nil)).Elem()
}

func (o ControlPolicyArrayOutput) ToControlPolicyArrayOutput() ControlPolicyArrayOutput {
	return o
}

func (o ControlPolicyArrayOutput) ToControlPolicyArrayOutputWithContext(ctx context.Context) ControlPolicyArrayOutput {
	return o
}

func (o ControlPolicyArrayOutput) Index(i pulumi.IntInput) ControlPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ControlPolicy {
		return vs[0].([]*ControlPolicy)[vs[1].(int)]
	}).(ControlPolicyOutput)
}

type ControlPolicyMapOutput struct{ *pulumi.OutputState }

func (ControlPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ControlPolicy)(nil)).Elem()
}

func (o ControlPolicyMapOutput) ToControlPolicyMapOutput() ControlPolicyMapOutput {
	return o
}

func (o ControlPolicyMapOutput) ToControlPolicyMapOutputWithContext(ctx context.Context) ControlPolicyMapOutput {
	return o
}

func (o ControlPolicyMapOutput) MapIndex(k pulumi.StringInput) ControlPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ControlPolicy {
		return vs[0].(map[string]*ControlPolicy)[vs[1].(string)]
	}).(ControlPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ControlPolicyInput)(nil)).Elem(), &ControlPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ControlPolicyArrayInput)(nil)).Elem(), ControlPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ControlPolicyMapInput)(nil)).Elem(), ControlPolicyMap{})
	pulumi.RegisterOutputType(ControlPolicyOutput{})
	pulumi.RegisterOutputType(ControlPolicyArrayOutput{})
	pulumi.RegisterOutputType(ControlPolicyMapOutput{})
}
