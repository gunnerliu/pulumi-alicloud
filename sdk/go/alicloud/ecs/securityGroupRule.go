// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a security group rule resource.
// Represents a single `ingress` or `egress` group rule, which can be added to external Security Groups.
//
// > **NOTE:**  `nicType` should set to `intranet` when security group type is `vpc` or specifying the `sourceSecurityGroupId`. In this situation it does not distinguish between intranet and internet, the rule is effective on them both.
//
// > **NOTE:** Available since v0.1.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ecs.NewSecurityGroup(ctx, "default", nil)
//			if err != nil {
//				return err
//			}
//			_, err = ecs.NewSecurityGroupRule(ctx, "allowAllTcp", &ecs.SecurityGroupRuleArgs{
//				Type:            pulumi.String("ingress"),
//				IpProtocol:      pulumi.String("tcp"),
//				NicType:         pulumi.String("internet"),
//				Policy:          pulumi.String("accept"),
//				PortRange:       pulumi.String("1/65535"),
//				Priority:        pulumi.Int(1),
//				SecurityGroupId: _default.ID(),
//				CidrIp:          pulumi.String("0.0.0.0/0"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Module Support
//
// You can use the existing security-group module
// to create a security group and add several rules one-click.
type SecurityGroupRule struct {
	pulumi.CustomResourceState

	// The target IP address range. The default value is 0.0.0.0/0 (which means no restriction will be applied). Other supported formats include 10.159.6.18/12. Only IPv4 is supported.
	CidrIp pulumi.StringPtrOutput `pulumi:"cidrIp"`
	// The description of the security group rule. The description can be up to 1 to 512 characters in length. Defaults to null.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
	IpProtocol pulumi.StringOutput `pulumi:"ipProtocol"`
	// Source IPv6 CIDR address block that requires access. Supports IP address ranges in CIDR format and IPv6 format. **NOTE:** This parameter cannot be set at the same time as the `cidrIp` parameter.
	//
	// > **NOTE:**  You must specify one of the following field: `cidrIp`,`sourceSecurityGroupId`,`prefixListId`,`ipv6CidrIp`.
	Ipv6CidrIp pulumi.StringPtrOutput `pulumi:"ipv6CidrIp"`
	// Network type, can be either `internet` or `intranet`, the default value is `internet`.
	NicType pulumi.StringOutput `pulumi:"nicType"`
	// Authorization policy, can be either `accept` or `drop`, the default value is `accept`.
	Policy pulumi.StringPtrOutput `pulumi:"policy"`
	// The range of port numbers relevant to the IP protocol. Default to "-1/-1". When the protocol is tcp or udp, each side port number range from 1 to 65535 and '-1/-1' will be invalid.
	// For example, `1/200` means that the range of the port numbers is 1-200. Other protocols' 'port_range' can only be "-1/-1", and other values will be invalid.
	PortRange pulumi.StringPtrOutput `pulumi:"portRange"`
	// The ID of the source/destination prefix list to which you want to control access. **NOTE:** If you specify `cidrIp`,`sourceSecurityGroupId`,`ipv6CidrIp` parameter, this parameter is ignored.
	PrefixListId pulumi.StringOutput `pulumi:"prefixListId"`
	// Authorization policy priority, with parameter values: `1-100`, default value: 1.
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// The security group to apply this rule to.
	SecurityGroupId pulumi.StringOutput `pulumi:"securityGroupId"`
	// The Alibaba Cloud user account Id of the target security group when security groups are authorized across accounts.  This parameter is invalid if `cidrIp` has already been set.
	SourceGroupOwnerAccount pulumi.StringPtrOutput `pulumi:"sourceGroupOwnerAccount"`
	// The target security group ID within the same region. If this field is specified, the `nicType` can only select `intranet`.
	SourceSecurityGroupId pulumi.StringPtrOutput `pulumi:"sourceSecurityGroupId"`
	// The type of rule being created. Valid options are `ingress` (inbound) or `egress` (outbound).
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewSecurityGroupRule registers a new resource with the given unique name, arguments, and options.
func NewSecurityGroupRule(ctx *pulumi.Context,
	name string, args *SecurityGroupRuleArgs, opts ...pulumi.ResourceOption) (*SecurityGroupRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.IpProtocol == nil {
		return nil, errors.New("invalid value for required argument 'IpProtocol'")
	}
	if args.SecurityGroupId == nil {
		return nil, errors.New("invalid value for required argument 'SecurityGroupId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SecurityGroupRule
	err := ctx.RegisterResource("alicloud:ecs/securityGroupRule:SecurityGroupRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecurityGroupRule gets an existing SecurityGroupRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecurityGroupRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecurityGroupRuleState, opts ...pulumi.ResourceOption) (*SecurityGroupRule, error) {
	var resource SecurityGroupRule
	err := ctx.ReadResource("alicloud:ecs/securityGroupRule:SecurityGroupRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecurityGroupRule resources.
type securityGroupRuleState struct {
	// The target IP address range. The default value is 0.0.0.0/0 (which means no restriction will be applied). Other supported formats include 10.159.6.18/12. Only IPv4 is supported.
	CidrIp *string `pulumi:"cidrIp"`
	// The description of the security group rule. The description can be up to 1 to 512 characters in length. Defaults to null.
	Description *string `pulumi:"description"`
	// The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
	IpProtocol *string `pulumi:"ipProtocol"`
	// Source IPv6 CIDR address block that requires access. Supports IP address ranges in CIDR format and IPv6 format. **NOTE:** This parameter cannot be set at the same time as the `cidrIp` parameter.
	//
	// > **NOTE:**  You must specify one of the following field: `cidrIp`,`sourceSecurityGroupId`,`prefixListId`,`ipv6CidrIp`.
	Ipv6CidrIp *string `pulumi:"ipv6CidrIp"`
	// Network type, can be either `internet` or `intranet`, the default value is `internet`.
	NicType *string `pulumi:"nicType"`
	// Authorization policy, can be either `accept` or `drop`, the default value is `accept`.
	Policy *string `pulumi:"policy"`
	// The range of port numbers relevant to the IP protocol. Default to "-1/-1". When the protocol is tcp or udp, each side port number range from 1 to 65535 and '-1/-1' will be invalid.
	// For example, `1/200` means that the range of the port numbers is 1-200. Other protocols' 'port_range' can only be "-1/-1", and other values will be invalid.
	PortRange *string `pulumi:"portRange"`
	// The ID of the source/destination prefix list to which you want to control access. **NOTE:** If you specify `cidrIp`,`sourceSecurityGroupId`,`ipv6CidrIp` parameter, this parameter is ignored.
	PrefixListId *string `pulumi:"prefixListId"`
	// Authorization policy priority, with parameter values: `1-100`, default value: 1.
	Priority *int `pulumi:"priority"`
	// The security group to apply this rule to.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// The Alibaba Cloud user account Id of the target security group when security groups are authorized across accounts.  This parameter is invalid if `cidrIp` has already been set.
	SourceGroupOwnerAccount *string `pulumi:"sourceGroupOwnerAccount"`
	// The target security group ID within the same region. If this field is specified, the `nicType` can only select `intranet`.
	SourceSecurityGroupId *string `pulumi:"sourceSecurityGroupId"`
	// The type of rule being created. Valid options are `ingress` (inbound) or `egress` (outbound).
	Type *string `pulumi:"type"`
}

type SecurityGroupRuleState struct {
	// The target IP address range. The default value is 0.0.0.0/0 (which means no restriction will be applied). Other supported formats include 10.159.6.18/12. Only IPv4 is supported.
	CidrIp pulumi.StringPtrInput
	// The description of the security group rule. The description can be up to 1 to 512 characters in length. Defaults to null.
	Description pulumi.StringPtrInput
	// The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
	IpProtocol pulumi.StringPtrInput
	// Source IPv6 CIDR address block that requires access. Supports IP address ranges in CIDR format and IPv6 format. **NOTE:** This parameter cannot be set at the same time as the `cidrIp` parameter.
	//
	// > **NOTE:**  You must specify one of the following field: `cidrIp`,`sourceSecurityGroupId`,`prefixListId`,`ipv6CidrIp`.
	Ipv6CidrIp pulumi.StringPtrInput
	// Network type, can be either `internet` or `intranet`, the default value is `internet`.
	NicType pulumi.StringPtrInput
	// Authorization policy, can be either `accept` or `drop`, the default value is `accept`.
	Policy pulumi.StringPtrInput
	// The range of port numbers relevant to the IP protocol. Default to "-1/-1". When the protocol is tcp or udp, each side port number range from 1 to 65535 and '-1/-1' will be invalid.
	// For example, `1/200` means that the range of the port numbers is 1-200. Other protocols' 'port_range' can only be "-1/-1", and other values will be invalid.
	PortRange pulumi.StringPtrInput
	// The ID of the source/destination prefix list to which you want to control access. **NOTE:** If you specify `cidrIp`,`sourceSecurityGroupId`,`ipv6CidrIp` parameter, this parameter is ignored.
	PrefixListId pulumi.StringPtrInput
	// Authorization policy priority, with parameter values: `1-100`, default value: 1.
	Priority pulumi.IntPtrInput
	// The security group to apply this rule to.
	SecurityGroupId pulumi.StringPtrInput
	// The Alibaba Cloud user account Id of the target security group when security groups are authorized across accounts.  This parameter is invalid if `cidrIp` has already been set.
	SourceGroupOwnerAccount pulumi.StringPtrInput
	// The target security group ID within the same region. If this field is specified, the `nicType` can only select `intranet`.
	SourceSecurityGroupId pulumi.StringPtrInput
	// The type of rule being created. Valid options are `ingress` (inbound) or `egress` (outbound).
	Type pulumi.StringPtrInput
}

func (SecurityGroupRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*securityGroupRuleState)(nil)).Elem()
}

type securityGroupRuleArgs struct {
	// The target IP address range. The default value is 0.0.0.0/0 (which means no restriction will be applied). Other supported formats include 10.159.6.18/12. Only IPv4 is supported.
	CidrIp *string `pulumi:"cidrIp"`
	// The description of the security group rule. The description can be up to 1 to 512 characters in length. Defaults to null.
	Description *string `pulumi:"description"`
	// The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
	IpProtocol string `pulumi:"ipProtocol"`
	// Source IPv6 CIDR address block that requires access. Supports IP address ranges in CIDR format and IPv6 format. **NOTE:** This parameter cannot be set at the same time as the `cidrIp` parameter.
	//
	// > **NOTE:**  You must specify one of the following field: `cidrIp`,`sourceSecurityGroupId`,`prefixListId`,`ipv6CidrIp`.
	Ipv6CidrIp *string `pulumi:"ipv6CidrIp"`
	// Network type, can be either `internet` or `intranet`, the default value is `internet`.
	NicType *string `pulumi:"nicType"`
	// Authorization policy, can be either `accept` or `drop`, the default value is `accept`.
	Policy *string `pulumi:"policy"`
	// The range of port numbers relevant to the IP protocol. Default to "-1/-1". When the protocol is tcp or udp, each side port number range from 1 to 65535 and '-1/-1' will be invalid.
	// For example, `1/200` means that the range of the port numbers is 1-200. Other protocols' 'port_range' can only be "-1/-1", and other values will be invalid.
	PortRange *string `pulumi:"portRange"`
	// The ID of the source/destination prefix list to which you want to control access. **NOTE:** If you specify `cidrIp`,`sourceSecurityGroupId`,`ipv6CidrIp` parameter, this parameter is ignored.
	PrefixListId *string `pulumi:"prefixListId"`
	// Authorization policy priority, with parameter values: `1-100`, default value: 1.
	Priority *int `pulumi:"priority"`
	// The security group to apply this rule to.
	SecurityGroupId string `pulumi:"securityGroupId"`
	// The Alibaba Cloud user account Id of the target security group when security groups are authorized across accounts.  This parameter is invalid if `cidrIp` has already been set.
	SourceGroupOwnerAccount *string `pulumi:"sourceGroupOwnerAccount"`
	// The target security group ID within the same region. If this field is specified, the `nicType` can only select `intranet`.
	SourceSecurityGroupId *string `pulumi:"sourceSecurityGroupId"`
	// The type of rule being created. Valid options are `ingress` (inbound) or `egress` (outbound).
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a SecurityGroupRule resource.
type SecurityGroupRuleArgs struct {
	// The target IP address range. The default value is 0.0.0.0/0 (which means no restriction will be applied). Other supported formats include 10.159.6.18/12. Only IPv4 is supported.
	CidrIp pulumi.StringPtrInput
	// The description of the security group rule. The description can be up to 1 to 512 characters in length. Defaults to null.
	Description pulumi.StringPtrInput
	// The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
	IpProtocol pulumi.StringInput
	// Source IPv6 CIDR address block that requires access. Supports IP address ranges in CIDR format and IPv6 format. **NOTE:** This parameter cannot be set at the same time as the `cidrIp` parameter.
	//
	// > **NOTE:**  You must specify one of the following field: `cidrIp`,`sourceSecurityGroupId`,`prefixListId`,`ipv6CidrIp`.
	Ipv6CidrIp pulumi.StringPtrInput
	// Network type, can be either `internet` or `intranet`, the default value is `internet`.
	NicType pulumi.StringPtrInput
	// Authorization policy, can be either `accept` or `drop`, the default value is `accept`.
	Policy pulumi.StringPtrInput
	// The range of port numbers relevant to the IP protocol. Default to "-1/-1". When the protocol is tcp or udp, each side port number range from 1 to 65535 and '-1/-1' will be invalid.
	// For example, `1/200` means that the range of the port numbers is 1-200. Other protocols' 'port_range' can only be "-1/-1", and other values will be invalid.
	PortRange pulumi.StringPtrInput
	// The ID of the source/destination prefix list to which you want to control access. **NOTE:** If you specify `cidrIp`,`sourceSecurityGroupId`,`ipv6CidrIp` parameter, this parameter is ignored.
	PrefixListId pulumi.StringPtrInput
	// Authorization policy priority, with parameter values: `1-100`, default value: 1.
	Priority pulumi.IntPtrInput
	// The security group to apply this rule to.
	SecurityGroupId pulumi.StringInput
	// The Alibaba Cloud user account Id of the target security group when security groups are authorized across accounts.  This parameter is invalid if `cidrIp` has already been set.
	SourceGroupOwnerAccount pulumi.StringPtrInput
	// The target security group ID within the same region. If this field is specified, the `nicType` can only select `intranet`.
	SourceSecurityGroupId pulumi.StringPtrInput
	// The type of rule being created. Valid options are `ingress` (inbound) or `egress` (outbound).
	Type pulumi.StringInput
}

func (SecurityGroupRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*securityGroupRuleArgs)(nil)).Elem()
}

type SecurityGroupRuleInput interface {
	pulumi.Input

	ToSecurityGroupRuleOutput() SecurityGroupRuleOutput
	ToSecurityGroupRuleOutputWithContext(ctx context.Context) SecurityGroupRuleOutput
}

func (*SecurityGroupRule) ElementType() reflect.Type {
	return reflect.TypeOf((**SecurityGroupRule)(nil)).Elem()
}

func (i *SecurityGroupRule) ToSecurityGroupRuleOutput() SecurityGroupRuleOutput {
	return i.ToSecurityGroupRuleOutputWithContext(context.Background())
}

func (i *SecurityGroupRule) ToSecurityGroupRuleOutputWithContext(ctx context.Context) SecurityGroupRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityGroupRuleOutput)
}

// SecurityGroupRuleArrayInput is an input type that accepts SecurityGroupRuleArray and SecurityGroupRuleArrayOutput values.
// You can construct a concrete instance of `SecurityGroupRuleArrayInput` via:
//
//	SecurityGroupRuleArray{ SecurityGroupRuleArgs{...} }
type SecurityGroupRuleArrayInput interface {
	pulumi.Input

	ToSecurityGroupRuleArrayOutput() SecurityGroupRuleArrayOutput
	ToSecurityGroupRuleArrayOutputWithContext(context.Context) SecurityGroupRuleArrayOutput
}

type SecurityGroupRuleArray []SecurityGroupRuleInput

func (SecurityGroupRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecurityGroupRule)(nil)).Elem()
}

func (i SecurityGroupRuleArray) ToSecurityGroupRuleArrayOutput() SecurityGroupRuleArrayOutput {
	return i.ToSecurityGroupRuleArrayOutputWithContext(context.Background())
}

func (i SecurityGroupRuleArray) ToSecurityGroupRuleArrayOutputWithContext(ctx context.Context) SecurityGroupRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityGroupRuleArrayOutput)
}

// SecurityGroupRuleMapInput is an input type that accepts SecurityGroupRuleMap and SecurityGroupRuleMapOutput values.
// You can construct a concrete instance of `SecurityGroupRuleMapInput` via:
//
//	SecurityGroupRuleMap{ "key": SecurityGroupRuleArgs{...} }
type SecurityGroupRuleMapInput interface {
	pulumi.Input

	ToSecurityGroupRuleMapOutput() SecurityGroupRuleMapOutput
	ToSecurityGroupRuleMapOutputWithContext(context.Context) SecurityGroupRuleMapOutput
}

type SecurityGroupRuleMap map[string]SecurityGroupRuleInput

func (SecurityGroupRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecurityGroupRule)(nil)).Elem()
}

func (i SecurityGroupRuleMap) ToSecurityGroupRuleMapOutput() SecurityGroupRuleMapOutput {
	return i.ToSecurityGroupRuleMapOutputWithContext(context.Background())
}

func (i SecurityGroupRuleMap) ToSecurityGroupRuleMapOutputWithContext(ctx context.Context) SecurityGroupRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityGroupRuleMapOutput)
}

type SecurityGroupRuleOutput struct{ *pulumi.OutputState }

func (SecurityGroupRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecurityGroupRule)(nil)).Elem()
}

func (o SecurityGroupRuleOutput) ToSecurityGroupRuleOutput() SecurityGroupRuleOutput {
	return o
}

func (o SecurityGroupRuleOutput) ToSecurityGroupRuleOutputWithContext(ctx context.Context) SecurityGroupRuleOutput {
	return o
}

// The target IP address range. The default value is 0.0.0.0/0 (which means no restriction will be applied). Other supported formats include 10.159.6.18/12. Only IPv4 is supported.
func (o SecurityGroupRuleOutput) CidrIp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringPtrOutput { return v.CidrIp }).(pulumi.StringPtrOutput)
}

// The description of the security group rule. The description can be up to 1 to 512 characters in length. Defaults to null.
func (o SecurityGroupRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
func (o SecurityGroupRuleOutput) IpProtocol() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringOutput { return v.IpProtocol }).(pulumi.StringOutput)
}

// Source IPv6 CIDR address block that requires access. Supports IP address ranges in CIDR format and IPv6 format. **NOTE:** This parameter cannot be set at the same time as the `cidrIp` parameter.
//
// > **NOTE:**  You must specify one of the following field: `cidrIp`,`sourceSecurityGroupId`,`prefixListId`,`ipv6CidrIp`.
func (o SecurityGroupRuleOutput) Ipv6CidrIp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringPtrOutput { return v.Ipv6CidrIp }).(pulumi.StringPtrOutput)
}

// Network type, can be either `internet` or `intranet`, the default value is `internet`.
func (o SecurityGroupRuleOutput) NicType() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringOutput { return v.NicType }).(pulumi.StringOutput)
}

// Authorization policy, can be either `accept` or `drop`, the default value is `accept`.
func (o SecurityGroupRuleOutput) Policy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringPtrOutput { return v.Policy }).(pulumi.StringPtrOutput)
}

// The range of port numbers relevant to the IP protocol. Default to "-1/-1". When the protocol is tcp or udp, each side port number range from 1 to 65535 and '-1/-1' will be invalid.
// For example, `1/200` means that the range of the port numbers is 1-200. Other protocols' 'port_range' can only be "-1/-1", and other values will be invalid.
func (o SecurityGroupRuleOutput) PortRange() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringPtrOutput { return v.PortRange }).(pulumi.StringPtrOutput)
}

// The ID of the source/destination prefix list to which you want to control access. **NOTE:** If you specify `cidrIp`,`sourceSecurityGroupId`,`ipv6CidrIp` parameter, this parameter is ignored.
func (o SecurityGroupRuleOutput) PrefixListId() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringOutput { return v.PrefixListId }).(pulumi.StringOutput)
}

// Authorization policy priority, with parameter values: `1-100`, default value: 1.
func (o SecurityGroupRuleOutput) Priority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.IntPtrOutput { return v.Priority }).(pulumi.IntPtrOutput)
}

// The security group to apply this rule to.
func (o SecurityGroupRuleOutput) SecurityGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringOutput { return v.SecurityGroupId }).(pulumi.StringOutput)
}

// The Alibaba Cloud user account Id of the target security group when security groups are authorized across accounts.  This parameter is invalid if `cidrIp` has already been set.
func (o SecurityGroupRuleOutput) SourceGroupOwnerAccount() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringPtrOutput { return v.SourceGroupOwnerAccount }).(pulumi.StringPtrOutput)
}

// The target security group ID within the same region. If this field is specified, the `nicType` can only select `intranet`.
func (o SecurityGroupRuleOutput) SourceSecurityGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringPtrOutput { return v.SourceSecurityGroupId }).(pulumi.StringPtrOutput)
}

// The type of rule being created. Valid options are `ingress` (inbound) or `egress` (outbound).
func (o SecurityGroupRuleOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityGroupRule) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type SecurityGroupRuleArrayOutput struct{ *pulumi.OutputState }

func (SecurityGroupRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecurityGroupRule)(nil)).Elem()
}

func (o SecurityGroupRuleArrayOutput) ToSecurityGroupRuleArrayOutput() SecurityGroupRuleArrayOutput {
	return o
}

func (o SecurityGroupRuleArrayOutput) ToSecurityGroupRuleArrayOutputWithContext(ctx context.Context) SecurityGroupRuleArrayOutput {
	return o
}

func (o SecurityGroupRuleArrayOutput) Index(i pulumi.IntInput) SecurityGroupRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecurityGroupRule {
		return vs[0].([]*SecurityGroupRule)[vs[1].(int)]
	}).(SecurityGroupRuleOutput)
}

type SecurityGroupRuleMapOutput struct{ *pulumi.OutputState }

func (SecurityGroupRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecurityGroupRule)(nil)).Elem()
}

func (o SecurityGroupRuleMapOutput) ToSecurityGroupRuleMapOutput() SecurityGroupRuleMapOutput {
	return o
}

func (o SecurityGroupRuleMapOutput) ToSecurityGroupRuleMapOutputWithContext(ctx context.Context) SecurityGroupRuleMapOutput {
	return o
}

func (o SecurityGroupRuleMapOutput) MapIndex(k pulumi.StringInput) SecurityGroupRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecurityGroupRule {
		return vs[0].(map[string]*SecurityGroupRule)[vs[1].(string)]
	}).(SecurityGroupRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityGroupRuleInput)(nil)).Elem(), &SecurityGroupRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityGroupRuleArrayInput)(nil)).Elem(), SecurityGroupRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityGroupRuleMapInput)(nil)).Elem(), SecurityGroupRuleMap{})
	pulumi.RegisterOutputType(SecurityGroupRuleOutput{})
	pulumi.RegisterOutputType(SecurityGroupRuleArrayOutput{})
	pulumi.RegisterOutputType(SecurityGroupRuleMapOutput{})
}
