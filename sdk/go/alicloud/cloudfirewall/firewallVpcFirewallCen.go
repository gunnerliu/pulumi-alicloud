// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudfirewall

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloud Firewall Vpc Firewall Cen resource.
//
// For information about Cloud Firewall Vpc Firewall Cen and how to use it, see [What is Vpc Firewall Cen](https://www.alibabacloud.com/help/en/cloud-firewall/latest/createvpcfirewallcenconfigure).
//
// > **NOTE:** Available in v1.194.0+.
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
//			_, err := cloudfirewall.NewFirewallVpcFirewallCen(ctx, "default", &cloudfirewall.FirewallVpcFirewallCenArgs{
//				CenId: pulumi.String("cen-cjok7uyb5w2b27573v"),
//				LocalVpc: &cloudfirewall.FirewallVpcFirewallCenLocalVpcArgs{
//					NetworkInstanceId: pulumi.String("vpc-a2d4wzzfuumzuq6uog5w4"),
//				},
//				MemberUid:       pulumi.String("1415189284827022"),
//				Status:          pulumi.String("open"),
//				VpcFirewallName: pulumi.String("tf-test"),
//				VpcRegion:       pulumi.String("ap-south-1"),
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
// Cloud Firewall Vpc Firewall Cen can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cloudfirewall/firewallVpcFirewallCen:FirewallVpcFirewallCen example <id>
//
// ```
type FirewallVpcFirewallCen struct {
	pulumi.CustomResourceState

	// The ID of the CEN instance.
	CenId pulumi.StringOutput `pulumi:"cenId"`
	// Intercommunication type, value: expressconnect: Express Channel cen: Cloud Enterprise Network
	ConnectType pulumi.StringOutput `pulumi:"connectType"`
	// The language type of the requested and received messages. Value:**zh** (default): Chinese.**en**: English.
	Lang pulumi.StringOutput `pulumi:"lang"`
	// The details of the VPC.See the following `Block LocalVpc`.
	LocalVpc FirewallVpcFirewallCenLocalVpcOutput `pulumi:"localVpc"`
	// The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
	MemberUid pulumi.StringPtrOutput `pulumi:"memberUid"`
	// Firewall switch status
	Status pulumi.StringOutput `pulumi:"status"`
	// VPC firewall ID
	VpcFirewallId pulumi.StringOutput `pulumi:"vpcFirewallId"`
	// The name of the VPC firewall instance.
	VpcFirewallName pulumi.StringOutput `pulumi:"vpcFirewallName"`
	// The ID of the region to which the VPC is created.
	VpcRegion pulumi.StringOutput `pulumi:"vpcRegion"`
}

// NewFirewallVpcFirewallCen registers a new resource with the given unique name, arguments, and options.
func NewFirewallVpcFirewallCen(ctx *pulumi.Context,
	name string, args *FirewallVpcFirewallCenArgs, opts ...pulumi.ResourceOption) (*FirewallVpcFirewallCen, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CenId == nil {
		return nil, errors.New("invalid value for required argument 'CenId'")
	}
	if args.LocalVpc == nil {
		return nil, errors.New("invalid value for required argument 'LocalVpc'")
	}
	if args.Status == nil {
		return nil, errors.New("invalid value for required argument 'Status'")
	}
	if args.VpcFirewallName == nil {
		return nil, errors.New("invalid value for required argument 'VpcFirewallName'")
	}
	if args.VpcRegion == nil {
		return nil, errors.New("invalid value for required argument 'VpcRegion'")
	}
	var resource FirewallVpcFirewallCen
	err := ctx.RegisterResource("alicloud:cloudfirewall/firewallVpcFirewallCen:FirewallVpcFirewallCen", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFirewallVpcFirewallCen gets an existing FirewallVpcFirewallCen resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFirewallVpcFirewallCen(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FirewallVpcFirewallCenState, opts ...pulumi.ResourceOption) (*FirewallVpcFirewallCen, error) {
	var resource FirewallVpcFirewallCen
	err := ctx.ReadResource("alicloud:cloudfirewall/firewallVpcFirewallCen:FirewallVpcFirewallCen", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FirewallVpcFirewallCen resources.
type firewallVpcFirewallCenState struct {
	// The ID of the CEN instance.
	CenId *string `pulumi:"cenId"`
	// Intercommunication type, value: expressconnect: Express Channel cen: Cloud Enterprise Network
	ConnectType *string `pulumi:"connectType"`
	// The language type of the requested and received messages. Value:**zh** (default): Chinese.**en**: English.
	Lang *string `pulumi:"lang"`
	// The details of the VPC.See the following `Block LocalVpc`.
	LocalVpc *FirewallVpcFirewallCenLocalVpc `pulumi:"localVpc"`
	// The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
	MemberUid *string `pulumi:"memberUid"`
	// Firewall switch status
	Status *string `pulumi:"status"`
	// VPC firewall ID
	VpcFirewallId *string `pulumi:"vpcFirewallId"`
	// The name of the VPC firewall instance.
	VpcFirewallName *string `pulumi:"vpcFirewallName"`
	// The ID of the region to which the VPC is created.
	VpcRegion *string `pulumi:"vpcRegion"`
}

type FirewallVpcFirewallCenState struct {
	// The ID of the CEN instance.
	CenId pulumi.StringPtrInput
	// Intercommunication type, value: expressconnect: Express Channel cen: Cloud Enterprise Network
	ConnectType pulumi.StringPtrInput
	// The language type of the requested and received messages. Value:**zh** (default): Chinese.**en**: English.
	Lang pulumi.StringPtrInput
	// The details of the VPC.See the following `Block LocalVpc`.
	LocalVpc FirewallVpcFirewallCenLocalVpcPtrInput
	// The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
	MemberUid pulumi.StringPtrInput
	// Firewall switch status
	Status pulumi.StringPtrInput
	// VPC firewall ID
	VpcFirewallId pulumi.StringPtrInput
	// The name of the VPC firewall instance.
	VpcFirewallName pulumi.StringPtrInput
	// The ID of the region to which the VPC is created.
	VpcRegion pulumi.StringPtrInput
}

func (FirewallVpcFirewallCenState) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallVpcFirewallCenState)(nil)).Elem()
}

type firewallVpcFirewallCenArgs struct {
	// The ID of the CEN instance.
	CenId string `pulumi:"cenId"`
	// The language type of the requested and received messages. Value:**zh** (default): Chinese.**en**: English.
	Lang *string `pulumi:"lang"`
	// The details of the VPC.See the following `Block LocalVpc`.
	LocalVpc FirewallVpcFirewallCenLocalVpc `pulumi:"localVpc"`
	// The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
	MemberUid *string `pulumi:"memberUid"`
	// Firewall switch status
	Status string `pulumi:"status"`
	// The name of the VPC firewall instance.
	VpcFirewallName string `pulumi:"vpcFirewallName"`
	// The ID of the region to which the VPC is created.
	VpcRegion string `pulumi:"vpcRegion"`
}

// The set of arguments for constructing a FirewallVpcFirewallCen resource.
type FirewallVpcFirewallCenArgs struct {
	// The ID of the CEN instance.
	CenId pulumi.StringInput
	// The language type of the requested and received messages. Value:**zh** (default): Chinese.**en**: English.
	Lang pulumi.StringPtrInput
	// The details of the VPC.See the following `Block LocalVpc`.
	LocalVpc FirewallVpcFirewallCenLocalVpcInput
	// The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
	MemberUid pulumi.StringPtrInput
	// Firewall switch status
	Status pulumi.StringInput
	// The name of the VPC firewall instance.
	VpcFirewallName pulumi.StringInput
	// The ID of the region to which the VPC is created.
	VpcRegion pulumi.StringInput
}

func (FirewallVpcFirewallCenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallVpcFirewallCenArgs)(nil)).Elem()
}

type FirewallVpcFirewallCenInput interface {
	pulumi.Input

	ToFirewallVpcFirewallCenOutput() FirewallVpcFirewallCenOutput
	ToFirewallVpcFirewallCenOutputWithContext(ctx context.Context) FirewallVpcFirewallCenOutput
}

func (*FirewallVpcFirewallCen) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallVpcFirewallCen)(nil)).Elem()
}

func (i *FirewallVpcFirewallCen) ToFirewallVpcFirewallCenOutput() FirewallVpcFirewallCenOutput {
	return i.ToFirewallVpcFirewallCenOutputWithContext(context.Background())
}

func (i *FirewallVpcFirewallCen) ToFirewallVpcFirewallCenOutputWithContext(ctx context.Context) FirewallVpcFirewallCenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallVpcFirewallCenOutput)
}

// FirewallVpcFirewallCenArrayInput is an input type that accepts FirewallVpcFirewallCenArray and FirewallVpcFirewallCenArrayOutput values.
// You can construct a concrete instance of `FirewallVpcFirewallCenArrayInput` via:
//
//	FirewallVpcFirewallCenArray{ FirewallVpcFirewallCenArgs{...} }
type FirewallVpcFirewallCenArrayInput interface {
	pulumi.Input

	ToFirewallVpcFirewallCenArrayOutput() FirewallVpcFirewallCenArrayOutput
	ToFirewallVpcFirewallCenArrayOutputWithContext(context.Context) FirewallVpcFirewallCenArrayOutput
}

type FirewallVpcFirewallCenArray []FirewallVpcFirewallCenInput

func (FirewallVpcFirewallCenArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirewallVpcFirewallCen)(nil)).Elem()
}

func (i FirewallVpcFirewallCenArray) ToFirewallVpcFirewallCenArrayOutput() FirewallVpcFirewallCenArrayOutput {
	return i.ToFirewallVpcFirewallCenArrayOutputWithContext(context.Background())
}

func (i FirewallVpcFirewallCenArray) ToFirewallVpcFirewallCenArrayOutputWithContext(ctx context.Context) FirewallVpcFirewallCenArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallVpcFirewallCenArrayOutput)
}

// FirewallVpcFirewallCenMapInput is an input type that accepts FirewallVpcFirewallCenMap and FirewallVpcFirewallCenMapOutput values.
// You can construct a concrete instance of `FirewallVpcFirewallCenMapInput` via:
//
//	FirewallVpcFirewallCenMap{ "key": FirewallVpcFirewallCenArgs{...} }
type FirewallVpcFirewallCenMapInput interface {
	pulumi.Input

	ToFirewallVpcFirewallCenMapOutput() FirewallVpcFirewallCenMapOutput
	ToFirewallVpcFirewallCenMapOutputWithContext(context.Context) FirewallVpcFirewallCenMapOutput
}

type FirewallVpcFirewallCenMap map[string]FirewallVpcFirewallCenInput

func (FirewallVpcFirewallCenMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirewallVpcFirewallCen)(nil)).Elem()
}

func (i FirewallVpcFirewallCenMap) ToFirewallVpcFirewallCenMapOutput() FirewallVpcFirewallCenMapOutput {
	return i.ToFirewallVpcFirewallCenMapOutputWithContext(context.Background())
}

func (i FirewallVpcFirewallCenMap) ToFirewallVpcFirewallCenMapOutputWithContext(ctx context.Context) FirewallVpcFirewallCenMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallVpcFirewallCenMapOutput)
}

type FirewallVpcFirewallCenOutput struct{ *pulumi.OutputState }

func (FirewallVpcFirewallCenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallVpcFirewallCen)(nil)).Elem()
}

func (o FirewallVpcFirewallCenOutput) ToFirewallVpcFirewallCenOutput() FirewallVpcFirewallCenOutput {
	return o
}

func (o FirewallVpcFirewallCenOutput) ToFirewallVpcFirewallCenOutputWithContext(ctx context.Context) FirewallVpcFirewallCenOutput {
	return o
}

// The ID of the CEN instance.
func (o FirewallVpcFirewallCenOutput) CenId() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallVpcFirewallCen) pulumi.StringOutput { return v.CenId }).(pulumi.StringOutput)
}

// Intercommunication type, value: expressconnect: Express Channel cen: Cloud Enterprise Network
func (o FirewallVpcFirewallCenOutput) ConnectType() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallVpcFirewallCen) pulumi.StringOutput { return v.ConnectType }).(pulumi.StringOutput)
}

// The language type of the requested and received messages. Value:**zh** (default): Chinese.**en**: English.
func (o FirewallVpcFirewallCenOutput) Lang() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallVpcFirewallCen) pulumi.StringOutput { return v.Lang }).(pulumi.StringOutput)
}

// The details of the VPC.See the following `Block LocalVpc`.
func (o FirewallVpcFirewallCenOutput) LocalVpc() FirewallVpcFirewallCenLocalVpcOutput {
	return o.ApplyT(func(v *FirewallVpcFirewallCen) FirewallVpcFirewallCenLocalVpcOutput { return v.LocalVpc }).(FirewallVpcFirewallCenLocalVpcOutput)
}

// The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
func (o FirewallVpcFirewallCenOutput) MemberUid() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FirewallVpcFirewallCen) pulumi.StringPtrOutput { return v.MemberUid }).(pulumi.StringPtrOutput)
}

// Firewall switch status
func (o FirewallVpcFirewallCenOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallVpcFirewallCen) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// VPC firewall ID
func (o FirewallVpcFirewallCenOutput) VpcFirewallId() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallVpcFirewallCen) pulumi.StringOutput { return v.VpcFirewallId }).(pulumi.StringOutput)
}

// The name of the VPC firewall instance.
func (o FirewallVpcFirewallCenOutput) VpcFirewallName() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallVpcFirewallCen) pulumi.StringOutput { return v.VpcFirewallName }).(pulumi.StringOutput)
}

// The ID of the region to which the VPC is created.
func (o FirewallVpcFirewallCenOutput) VpcRegion() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallVpcFirewallCen) pulumi.StringOutput { return v.VpcRegion }).(pulumi.StringOutput)
}

type FirewallVpcFirewallCenArrayOutput struct{ *pulumi.OutputState }

func (FirewallVpcFirewallCenArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirewallVpcFirewallCen)(nil)).Elem()
}

func (o FirewallVpcFirewallCenArrayOutput) ToFirewallVpcFirewallCenArrayOutput() FirewallVpcFirewallCenArrayOutput {
	return o
}

func (o FirewallVpcFirewallCenArrayOutput) ToFirewallVpcFirewallCenArrayOutputWithContext(ctx context.Context) FirewallVpcFirewallCenArrayOutput {
	return o
}

func (o FirewallVpcFirewallCenArrayOutput) Index(i pulumi.IntInput) FirewallVpcFirewallCenOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FirewallVpcFirewallCen {
		return vs[0].([]*FirewallVpcFirewallCen)[vs[1].(int)]
	}).(FirewallVpcFirewallCenOutput)
}

type FirewallVpcFirewallCenMapOutput struct{ *pulumi.OutputState }

func (FirewallVpcFirewallCenMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirewallVpcFirewallCen)(nil)).Elem()
}

func (o FirewallVpcFirewallCenMapOutput) ToFirewallVpcFirewallCenMapOutput() FirewallVpcFirewallCenMapOutput {
	return o
}

func (o FirewallVpcFirewallCenMapOutput) ToFirewallVpcFirewallCenMapOutputWithContext(ctx context.Context) FirewallVpcFirewallCenMapOutput {
	return o
}

func (o FirewallVpcFirewallCenMapOutput) MapIndex(k pulumi.StringInput) FirewallVpcFirewallCenOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FirewallVpcFirewallCen {
		return vs[0].(map[string]*FirewallVpcFirewallCen)[vs[1].(string)]
	}).(FirewallVpcFirewallCenOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallVpcFirewallCenInput)(nil)).Elem(), &FirewallVpcFirewallCen{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallVpcFirewallCenArrayInput)(nil)).Elem(), FirewallVpcFirewallCenArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallVpcFirewallCenMapInput)(nil)).Elem(), FirewallVpcFirewallCenMap{})
	pulumi.RegisterOutputType(FirewallVpcFirewallCenOutput{})
	pulumi.RegisterOutputType(FirewallVpcFirewallCenArrayOutput{})
	pulumi.RegisterOutputType(FirewallVpcFirewallCenMapOutput{})
}