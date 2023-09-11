// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eds

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a ECD Desktop resource.
//
// For information about ECD Desktop and how to use it, see [What is Desktop](https://www.alibabacloud.com/help/en/elastic-desktop-service/latest/api-doc-ecd-2020-09-30-api-doc-createdesktops)
//
// > **NOTE:** Available since v1.144.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/eds"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultSimpleOfficeSite, err := eds.NewSimpleOfficeSite(ctx, "defaultSimpleOfficeSite", &eds.SimpleOfficeSiteArgs{
//				CidrBlock:         pulumi.String("172.16.0.0/12"),
//				EnableAdminAccess: pulumi.Bool(true),
//				DesktopAccessType: pulumi.String("Internet"),
//				OfficeSiteName:    pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			defaultEcdPolicyGroup, err := eds.NewEcdPolicyGroup(ctx, "defaultEcdPolicyGroup", &eds.EcdPolicyGroupArgs{
//				PolicyGroupName: pulumi.String(name),
//				Clipboard:       pulumi.String("read"),
//				LocalDrive:      pulumi.String("read"),
//				UsbRedirect:     pulumi.String("off"),
//				Watermark:       pulumi.String("off"),
//				AuthorizeAccessPolicyRules: eds.EcdPolicyGroupAuthorizeAccessPolicyRuleArray{
//					&eds.EcdPolicyGroupAuthorizeAccessPolicyRuleArgs{
//						Description: pulumi.String(name),
//						CidrIp:      pulumi.String("1.2.3.45/24"),
//					},
//				},
//				AuthorizeSecurityPolicyRules: eds.EcdPolicyGroupAuthorizeSecurityPolicyRuleArray{
//					&eds.EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs{
//						Type:        pulumi.String("inflow"),
//						Policy:      pulumi.String("accept"),
//						Description: pulumi.String(name),
//						PortRange:   pulumi.String("80/80"),
//						IpProtocol:  pulumi.String("TCP"),
//						Priority:    pulumi.String("1"),
//						CidrIp:      pulumi.String("1.2.3.4/24"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			defaultBundles, err := eds.GetBundles(ctx, &eds.GetBundlesArgs{
//				BundleType: pulumi.StringRef("SYSTEM"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = eds.NewDesktop(ctx, "defaultDesktop", &eds.DesktopArgs{
//				OfficeSiteId:  defaultSimpleOfficeSite.ID(),
//				PolicyGroupId: defaultEcdPolicyGroup.ID(),
//				BundleId:      *pulumi.String(defaultBundles.Bundles[1].Id),
//				DesktopName:   pulumi.String(name),
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
// ECD Desktop can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:eds/desktop:Desktop example <id>
//
// ```
type Desktop struct {
	pulumi.CustomResourceState

	// The amount of the Desktop.
	Amount pulumi.IntPtrOutput `pulumi:"amount"`
	// The auto-pay of the Desktop whether to pay automatically. values: `true`, `false`.
	AutoPay pulumi.BoolPtrOutput `pulumi:"autoPay"`
	// The auto-renewal of the Desktop whether to renew automatically. It takes effect only when the parameter ChargeType is set to PrePaid. values: `true`, `false`.
	AutoRenew pulumi.BoolPtrOutput `pulumi:"autoRenew"`
	// The bundle id of the Desktop.
	BundleId pulumi.StringOutput `pulumi:"bundleId"`
	// The desktop name of the Desktop.
	DesktopName pulumi.StringPtrOutput `pulumi:"desktopName"`
	// The desktop type of the Desktop.
	DesktopType pulumi.StringOutput `pulumi:"desktopType"`
	// The desktop end user id of the Desktop.
	EndUserIds pulumi.StringArrayOutput `pulumi:"endUserIds"`
	// The hostname of the Desktop.
	HostName pulumi.StringPtrOutput `pulumi:"hostName"`
	// The ID of the Simple Office Site.
	OfficeSiteId pulumi.StringOutput `pulumi:"officeSiteId"`
	// The payment type of the Desktop. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// The period of the Desktop.
	Period pulumi.IntPtrOutput `pulumi:"period"`
	// The period unit of the Desktop.
	PeriodUnit pulumi.StringPtrOutput `pulumi:"periodUnit"`
	// The policy group id of the Desktop.
	PolicyGroupId pulumi.StringOutput `pulumi:"policyGroupId"`
	// The root disk size gib of the Desktop.
	RootDiskSizeGib pulumi.IntPtrOutput `pulumi:"rootDiskSizeGib"`
	// The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
	Status pulumi.StringOutput `pulumi:"status"`
	// The stopped mode of the Desktop.
	StoppedMode pulumi.StringOutput `pulumi:"stoppedMode"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The user assign mode of the Desktop. Valid values: `ALL`, `PER_USER`. Default to `ALL`.
	UserAssignMode pulumi.StringOutput `pulumi:"userAssignMode"`
	// The user disk size gib of the Desktop.
	UserDiskSizeGib pulumi.IntPtrOutput `pulumi:"userDiskSizeGib"`
}

// NewDesktop registers a new resource with the given unique name, arguments, and options.
func NewDesktop(ctx *pulumi.Context,
	name string, args *DesktopArgs, opts ...pulumi.ResourceOption) (*Desktop, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BundleId == nil {
		return nil, errors.New("invalid value for required argument 'BundleId'")
	}
	if args.OfficeSiteId == nil {
		return nil, errors.New("invalid value for required argument 'OfficeSiteId'")
	}
	if args.PolicyGroupId == nil {
		return nil, errors.New("invalid value for required argument 'PolicyGroupId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Desktop
	err := ctx.RegisterResource("alicloud:eds/desktop:Desktop", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDesktop gets an existing Desktop resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDesktop(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DesktopState, opts ...pulumi.ResourceOption) (*Desktop, error) {
	var resource Desktop
	err := ctx.ReadResource("alicloud:eds/desktop:Desktop", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Desktop resources.
type desktopState struct {
	// The amount of the Desktop.
	Amount *int `pulumi:"amount"`
	// The auto-pay of the Desktop whether to pay automatically. values: `true`, `false`.
	AutoPay *bool `pulumi:"autoPay"`
	// The auto-renewal of the Desktop whether to renew automatically. It takes effect only when the parameter ChargeType is set to PrePaid. values: `true`, `false`.
	AutoRenew *bool `pulumi:"autoRenew"`
	// The bundle id of the Desktop.
	BundleId *string `pulumi:"bundleId"`
	// The desktop name of the Desktop.
	DesktopName *string `pulumi:"desktopName"`
	// The desktop type of the Desktop.
	DesktopType *string `pulumi:"desktopType"`
	// The desktop end user id of the Desktop.
	EndUserIds []string `pulumi:"endUserIds"`
	// The hostname of the Desktop.
	HostName *string `pulumi:"hostName"`
	// The ID of the Simple Office Site.
	OfficeSiteId *string `pulumi:"officeSiteId"`
	// The payment type of the Desktop. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
	PaymentType *string `pulumi:"paymentType"`
	// The period of the Desktop.
	Period *int `pulumi:"period"`
	// The period unit of the Desktop.
	PeriodUnit *string `pulumi:"periodUnit"`
	// The policy group id of the Desktop.
	PolicyGroupId *string `pulumi:"policyGroupId"`
	// The root disk size gib of the Desktop.
	RootDiskSizeGib *int `pulumi:"rootDiskSizeGib"`
	// The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
	Status *string `pulumi:"status"`
	// The stopped mode of the Desktop.
	StoppedMode *string `pulumi:"stoppedMode"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The user assign mode of the Desktop. Valid values: `ALL`, `PER_USER`. Default to `ALL`.
	UserAssignMode *string `pulumi:"userAssignMode"`
	// The user disk size gib of the Desktop.
	UserDiskSizeGib *int `pulumi:"userDiskSizeGib"`
}

type DesktopState struct {
	// The amount of the Desktop.
	Amount pulumi.IntPtrInput
	// The auto-pay of the Desktop whether to pay automatically. values: `true`, `false`.
	AutoPay pulumi.BoolPtrInput
	// The auto-renewal of the Desktop whether to renew automatically. It takes effect only when the parameter ChargeType is set to PrePaid. values: `true`, `false`.
	AutoRenew pulumi.BoolPtrInput
	// The bundle id of the Desktop.
	BundleId pulumi.StringPtrInput
	// The desktop name of the Desktop.
	DesktopName pulumi.StringPtrInput
	// The desktop type of the Desktop.
	DesktopType pulumi.StringPtrInput
	// The desktop end user id of the Desktop.
	EndUserIds pulumi.StringArrayInput
	// The hostname of the Desktop.
	HostName pulumi.StringPtrInput
	// The ID of the Simple Office Site.
	OfficeSiteId pulumi.StringPtrInput
	// The payment type of the Desktop. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
	PaymentType pulumi.StringPtrInput
	// The period of the Desktop.
	Period pulumi.IntPtrInput
	// The period unit of the Desktop.
	PeriodUnit pulumi.StringPtrInput
	// The policy group id of the Desktop.
	PolicyGroupId pulumi.StringPtrInput
	// The root disk size gib of the Desktop.
	RootDiskSizeGib pulumi.IntPtrInput
	// The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
	Status pulumi.StringPtrInput
	// The stopped mode of the Desktop.
	StoppedMode pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The user assign mode of the Desktop. Valid values: `ALL`, `PER_USER`. Default to `ALL`.
	UserAssignMode pulumi.StringPtrInput
	// The user disk size gib of the Desktop.
	UserDiskSizeGib pulumi.IntPtrInput
}

func (DesktopState) ElementType() reflect.Type {
	return reflect.TypeOf((*desktopState)(nil)).Elem()
}

type desktopArgs struct {
	// The amount of the Desktop.
	Amount *int `pulumi:"amount"`
	// The auto-pay of the Desktop whether to pay automatically. values: `true`, `false`.
	AutoPay *bool `pulumi:"autoPay"`
	// The auto-renewal of the Desktop whether to renew automatically. It takes effect only when the parameter ChargeType is set to PrePaid. values: `true`, `false`.
	AutoRenew *bool `pulumi:"autoRenew"`
	// The bundle id of the Desktop.
	BundleId string `pulumi:"bundleId"`
	// The desktop name of the Desktop.
	DesktopName *string `pulumi:"desktopName"`
	// The desktop type of the Desktop.
	DesktopType *string `pulumi:"desktopType"`
	// The desktop end user id of the Desktop.
	EndUserIds []string `pulumi:"endUserIds"`
	// The hostname of the Desktop.
	HostName *string `pulumi:"hostName"`
	// The ID of the Simple Office Site.
	OfficeSiteId string `pulumi:"officeSiteId"`
	// The payment type of the Desktop. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
	PaymentType *string `pulumi:"paymentType"`
	// The period of the Desktop.
	Period *int `pulumi:"period"`
	// The period unit of the Desktop.
	PeriodUnit *string `pulumi:"periodUnit"`
	// The policy group id of the Desktop.
	PolicyGroupId string `pulumi:"policyGroupId"`
	// The root disk size gib of the Desktop.
	RootDiskSizeGib *int `pulumi:"rootDiskSizeGib"`
	// The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
	Status *string `pulumi:"status"`
	// The stopped mode of the Desktop.
	StoppedMode *string `pulumi:"stoppedMode"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The user assign mode of the Desktop. Valid values: `ALL`, `PER_USER`. Default to `ALL`.
	UserAssignMode *string `pulumi:"userAssignMode"`
	// The user disk size gib of the Desktop.
	UserDiskSizeGib *int `pulumi:"userDiskSizeGib"`
}

// The set of arguments for constructing a Desktop resource.
type DesktopArgs struct {
	// The amount of the Desktop.
	Amount pulumi.IntPtrInput
	// The auto-pay of the Desktop whether to pay automatically. values: `true`, `false`.
	AutoPay pulumi.BoolPtrInput
	// The auto-renewal of the Desktop whether to renew automatically. It takes effect only when the parameter ChargeType is set to PrePaid. values: `true`, `false`.
	AutoRenew pulumi.BoolPtrInput
	// The bundle id of the Desktop.
	BundleId pulumi.StringInput
	// The desktop name of the Desktop.
	DesktopName pulumi.StringPtrInput
	// The desktop type of the Desktop.
	DesktopType pulumi.StringPtrInput
	// The desktop end user id of the Desktop.
	EndUserIds pulumi.StringArrayInput
	// The hostname of the Desktop.
	HostName pulumi.StringPtrInput
	// The ID of the Simple Office Site.
	OfficeSiteId pulumi.StringInput
	// The payment type of the Desktop. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
	PaymentType pulumi.StringPtrInput
	// The period of the Desktop.
	Period pulumi.IntPtrInput
	// The period unit of the Desktop.
	PeriodUnit pulumi.StringPtrInput
	// The policy group id of the Desktop.
	PolicyGroupId pulumi.StringInput
	// The root disk size gib of the Desktop.
	RootDiskSizeGib pulumi.IntPtrInput
	// The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
	Status pulumi.StringPtrInput
	// The stopped mode of the Desktop.
	StoppedMode pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The user assign mode of the Desktop. Valid values: `ALL`, `PER_USER`. Default to `ALL`.
	UserAssignMode pulumi.StringPtrInput
	// The user disk size gib of the Desktop.
	UserDiskSizeGib pulumi.IntPtrInput
}

func (DesktopArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*desktopArgs)(nil)).Elem()
}

type DesktopInput interface {
	pulumi.Input

	ToDesktopOutput() DesktopOutput
	ToDesktopOutputWithContext(ctx context.Context) DesktopOutput
}

func (*Desktop) ElementType() reflect.Type {
	return reflect.TypeOf((**Desktop)(nil)).Elem()
}

func (i *Desktop) ToDesktopOutput() DesktopOutput {
	return i.ToDesktopOutputWithContext(context.Background())
}

func (i *Desktop) ToDesktopOutputWithContext(ctx context.Context) DesktopOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DesktopOutput)
}

func (i *Desktop) ToOutput(ctx context.Context) pulumix.Output[*Desktop] {
	return pulumix.Output[*Desktop]{
		OutputState: i.ToDesktopOutputWithContext(ctx).OutputState,
	}
}

// DesktopArrayInput is an input type that accepts DesktopArray and DesktopArrayOutput values.
// You can construct a concrete instance of `DesktopArrayInput` via:
//
//	DesktopArray{ DesktopArgs{...} }
type DesktopArrayInput interface {
	pulumi.Input

	ToDesktopArrayOutput() DesktopArrayOutput
	ToDesktopArrayOutputWithContext(context.Context) DesktopArrayOutput
}

type DesktopArray []DesktopInput

func (DesktopArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Desktop)(nil)).Elem()
}

func (i DesktopArray) ToDesktopArrayOutput() DesktopArrayOutput {
	return i.ToDesktopArrayOutputWithContext(context.Background())
}

func (i DesktopArray) ToDesktopArrayOutputWithContext(ctx context.Context) DesktopArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DesktopArrayOutput)
}

func (i DesktopArray) ToOutput(ctx context.Context) pulumix.Output[[]*Desktop] {
	return pulumix.Output[[]*Desktop]{
		OutputState: i.ToDesktopArrayOutputWithContext(ctx).OutputState,
	}
}

// DesktopMapInput is an input type that accepts DesktopMap and DesktopMapOutput values.
// You can construct a concrete instance of `DesktopMapInput` via:
//
//	DesktopMap{ "key": DesktopArgs{...} }
type DesktopMapInput interface {
	pulumi.Input

	ToDesktopMapOutput() DesktopMapOutput
	ToDesktopMapOutputWithContext(context.Context) DesktopMapOutput
}

type DesktopMap map[string]DesktopInput

func (DesktopMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Desktop)(nil)).Elem()
}

func (i DesktopMap) ToDesktopMapOutput() DesktopMapOutput {
	return i.ToDesktopMapOutputWithContext(context.Background())
}

func (i DesktopMap) ToDesktopMapOutputWithContext(ctx context.Context) DesktopMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DesktopMapOutput)
}

func (i DesktopMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Desktop] {
	return pulumix.Output[map[string]*Desktop]{
		OutputState: i.ToDesktopMapOutputWithContext(ctx).OutputState,
	}
}

type DesktopOutput struct{ *pulumi.OutputState }

func (DesktopOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Desktop)(nil)).Elem()
}

func (o DesktopOutput) ToDesktopOutput() DesktopOutput {
	return o
}

func (o DesktopOutput) ToDesktopOutputWithContext(ctx context.Context) DesktopOutput {
	return o
}

func (o DesktopOutput) ToOutput(ctx context.Context) pulumix.Output[*Desktop] {
	return pulumix.Output[*Desktop]{
		OutputState: o.OutputState,
	}
}

// The amount of the Desktop.
func (o DesktopOutput) Amount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Desktop) pulumi.IntPtrOutput { return v.Amount }).(pulumi.IntPtrOutput)
}

// The auto-pay of the Desktop whether to pay automatically. values: `true`, `false`.
func (o DesktopOutput) AutoPay() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Desktop) pulumi.BoolPtrOutput { return v.AutoPay }).(pulumi.BoolPtrOutput)
}

// The auto-renewal of the Desktop whether to renew automatically. It takes effect only when the parameter ChargeType is set to PrePaid. values: `true`, `false`.
func (o DesktopOutput) AutoRenew() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Desktop) pulumi.BoolPtrOutput { return v.AutoRenew }).(pulumi.BoolPtrOutput)
}

// The bundle id of the Desktop.
func (o DesktopOutput) BundleId() pulumi.StringOutput {
	return o.ApplyT(func(v *Desktop) pulumi.StringOutput { return v.BundleId }).(pulumi.StringOutput)
}

// The desktop name of the Desktop.
func (o DesktopOutput) DesktopName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Desktop) pulumi.StringPtrOutput { return v.DesktopName }).(pulumi.StringPtrOutput)
}

// The desktop type of the Desktop.
func (o DesktopOutput) DesktopType() pulumi.StringOutput {
	return o.ApplyT(func(v *Desktop) pulumi.StringOutput { return v.DesktopType }).(pulumi.StringOutput)
}

// The desktop end user id of the Desktop.
func (o DesktopOutput) EndUserIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Desktop) pulumi.StringArrayOutput { return v.EndUserIds }).(pulumi.StringArrayOutput)
}

// The hostname of the Desktop.
func (o DesktopOutput) HostName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Desktop) pulumi.StringPtrOutput { return v.HostName }).(pulumi.StringPtrOutput)
}

// The ID of the Simple Office Site.
func (o DesktopOutput) OfficeSiteId() pulumi.StringOutput {
	return o.ApplyT(func(v *Desktop) pulumi.StringOutput { return v.OfficeSiteId }).(pulumi.StringOutput)
}

// The payment type of the Desktop. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
func (o DesktopOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v *Desktop) pulumi.StringOutput { return v.PaymentType }).(pulumi.StringOutput)
}

// The period of the Desktop.
func (o DesktopOutput) Period() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Desktop) pulumi.IntPtrOutput { return v.Period }).(pulumi.IntPtrOutput)
}

// The period unit of the Desktop.
func (o DesktopOutput) PeriodUnit() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Desktop) pulumi.StringPtrOutput { return v.PeriodUnit }).(pulumi.StringPtrOutput)
}

// The policy group id of the Desktop.
func (o DesktopOutput) PolicyGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Desktop) pulumi.StringOutput { return v.PolicyGroupId }).(pulumi.StringOutput)
}

// The root disk size gib of the Desktop.
func (o DesktopOutput) RootDiskSizeGib() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Desktop) pulumi.IntPtrOutput { return v.RootDiskSizeGib }).(pulumi.IntPtrOutput)
}

// The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
func (o DesktopOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Desktop) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The stopped mode of the Desktop.
func (o DesktopOutput) StoppedMode() pulumi.StringOutput {
	return o.ApplyT(func(v *Desktop) pulumi.StringOutput { return v.StoppedMode }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o DesktopOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *Desktop) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// The user assign mode of the Desktop. Valid values: `ALL`, `PER_USER`. Default to `ALL`.
func (o DesktopOutput) UserAssignMode() pulumi.StringOutput {
	return o.ApplyT(func(v *Desktop) pulumi.StringOutput { return v.UserAssignMode }).(pulumi.StringOutput)
}

// The user disk size gib of the Desktop.
func (o DesktopOutput) UserDiskSizeGib() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Desktop) pulumi.IntPtrOutput { return v.UserDiskSizeGib }).(pulumi.IntPtrOutput)
}

type DesktopArrayOutput struct{ *pulumi.OutputState }

func (DesktopArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Desktop)(nil)).Elem()
}

func (o DesktopArrayOutput) ToDesktopArrayOutput() DesktopArrayOutput {
	return o
}

func (o DesktopArrayOutput) ToDesktopArrayOutputWithContext(ctx context.Context) DesktopArrayOutput {
	return o
}

func (o DesktopArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Desktop] {
	return pulumix.Output[[]*Desktop]{
		OutputState: o.OutputState,
	}
}

func (o DesktopArrayOutput) Index(i pulumi.IntInput) DesktopOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Desktop {
		return vs[0].([]*Desktop)[vs[1].(int)]
	}).(DesktopOutput)
}

type DesktopMapOutput struct{ *pulumi.OutputState }

func (DesktopMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Desktop)(nil)).Elem()
}

func (o DesktopMapOutput) ToDesktopMapOutput() DesktopMapOutput {
	return o
}

func (o DesktopMapOutput) ToDesktopMapOutputWithContext(ctx context.Context) DesktopMapOutput {
	return o
}

func (o DesktopMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Desktop] {
	return pulumix.Output[map[string]*Desktop]{
		OutputState: o.OutputState,
	}
}

func (o DesktopMapOutput) MapIndex(k pulumi.StringInput) DesktopOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Desktop {
		return vs[0].(map[string]*Desktop)[vs[1].(string)]
	}).(DesktopOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DesktopInput)(nil)).Elem(), &Desktop{})
	pulumi.RegisterInputType(reflect.TypeOf((*DesktopArrayInput)(nil)).Elem(), DesktopArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DesktopMapInput)(nil)).Elem(), DesktopMap{})
	pulumi.RegisterOutputType(DesktopOutput{})
	pulumi.RegisterOutputType(DesktopArrayOutput{})
	pulumi.RegisterOutputType(DesktopMapOutput{})
}
