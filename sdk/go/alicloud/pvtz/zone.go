// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pvtz

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// ## Import
//
// Private Zone can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:pvtz/zone:Zone example abc123456
//
// ```
type Zone struct {
	pulumi.CustomResourceState

	// Whether the Private Zone is ptr.
	IsPtr pulumi.BoolOutput `pulumi:"isPtr"`
	// The language. Valid values: "zh", "en", "jp".
	Lang pulumi.StringPtrOutput `pulumi:"lang"`
	// The name of the Private Zone. The `name` has been deprecated from provider version 1.107.0. Please use 'zone_name' instead.
	//
	// Deprecated: Field 'name' has been deprecated from version 1.107.0. Use 'zone_name' instead.
	Name pulumi.StringOutput `pulumi:"name"`
	// The recursive DNS proxy. Valid values:
	// - ZONE: indicates that the recursive DNS proxy is disabled.
	// - RECORD: indicates that the recursive DNS proxy is enabled.
	//   Default to "ZONE".
	ProxyPattern pulumi.StringPtrOutput `pulumi:"proxyPattern"`
	// The count of the Private Zone Record.
	RecordCount pulumi.IntOutput `pulumi:"recordCount"`
	// The remark of the Private Zone.
	Remark pulumi.StringPtrOutput `pulumi:"remark"`
	// The Id of resource group which the Private Zone belongs.
	ResourceGroupId pulumi.StringPtrOutput `pulumi:"resourceGroupId"`
	// The status of the host synchronization task. Valid values:  `ON`,`OFF`. **NOTE:** You can update the `syncStatus` to enable/disable the host synchronization task.
	SyncStatus pulumi.StringPtrOutput `pulumi:"syncStatus"`
	// The IP address of the client.
	UserClientIp pulumi.StringPtrOutput `pulumi:"userClientIp"`
	// The user information of the host synchronization task. The details see Block `userInfo`.
	UserInfos ZoneUserInfoArrayOutput `pulumi:"userInfos"`
	// The zoneName of the Private Zone. The `zoneName` is required when the value of the `name`  is Empty.
	ZoneName pulumi.StringOutput `pulumi:"zoneName"`
}

// NewZone registers a new resource with the given unique name, arguments, and options.
func NewZone(ctx *pulumi.Context,
	name string, args *ZoneArgs, opts ...pulumi.ResourceOption) (*Zone, error) {
	if args == nil {
		args = &ZoneArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Zone
	err := ctx.RegisterResource("alicloud:pvtz/zone:Zone", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZone gets an existing Zone resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZone(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZoneState, opts ...pulumi.ResourceOption) (*Zone, error) {
	var resource Zone
	err := ctx.ReadResource("alicloud:pvtz/zone:Zone", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Zone resources.
type zoneState struct {
	// Whether the Private Zone is ptr.
	IsPtr *bool `pulumi:"isPtr"`
	// The language. Valid values: "zh", "en", "jp".
	Lang *string `pulumi:"lang"`
	// The name of the Private Zone. The `name` has been deprecated from provider version 1.107.0. Please use 'zone_name' instead.
	//
	// Deprecated: Field 'name' has been deprecated from version 1.107.0. Use 'zone_name' instead.
	Name *string `pulumi:"name"`
	// The recursive DNS proxy. Valid values:
	// - ZONE: indicates that the recursive DNS proxy is disabled.
	// - RECORD: indicates that the recursive DNS proxy is enabled.
	//   Default to "ZONE".
	ProxyPattern *string `pulumi:"proxyPattern"`
	// The count of the Private Zone Record.
	RecordCount *int `pulumi:"recordCount"`
	// The remark of the Private Zone.
	Remark *string `pulumi:"remark"`
	// The Id of resource group which the Private Zone belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the host synchronization task. Valid values:  `ON`,`OFF`. **NOTE:** You can update the `syncStatus` to enable/disable the host synchronization task.
	SyncStatus *string `pulumi:"syncStatus"`
	// The IP address of the client.
	UserClientIp *string `pulumi:"userClientIp"`
	// The user information of the host synchronization task. The details see Block `userInfo`.
	UserInfos []ZoneUserInfo `pulumi:"userInfos"`
	// The zoneName of the Private Zone. The `zoneName` is required when the value of the `name`  is Empty.
	ZoneName *string `pulumi:"zoneName"`
}

type ZoneState struct {
	// Whether the Private Zone is ptr.
	IsPtr pulumi.BoolPtrInput
	// The language. Valid values: "zh", "en", "jp".
	Lang pulumi.StringPtrInput
	// The name of the Private Zone. The `name` has been deprecated from provider version 1.107.0. Please use 'zone_name' instead.
	//
	// Deprecated: Field 'name' has been deprecated from version 1.107.0. Use 'zone_name' instead.
	Name pulumi.StringPtrInput
	// The recursive DNS proxy. Valid values:
	// - ZONE: indicates that the recursive DNS proxy is disabled.
	// - RECORD: indicates that the recursive DNS proxy is enabled.
	//   Default to "ZONE".
	ProxyPattern pulumi.StringPtrInput
	// The count of the Private Zone Record.
	RecordCount pulumi.IntPtrInput
	// The remark of the Private Zone.
	Remark pulumi.StringPtrInput
	// The Id of resource group which the Private Zone belongs.
	ResourceGroupId pulumi.StringPtrInput
	// The status of the host synchronization task. Valid values:  `ON`,`OFF`. **NOTE:** You can update the `syncStatus` to enable/disable the host synchronization task.
	SyncStatus pulumi.StringPtrInput
	// The IP address of the client.
	UserClientIp pulumi.StringPtrInput
	// The user information of the host synchronization task. The details see Block `userInfo`.
	UserInfos ZoneUserInfoArrayInput
	// The zoneName of the Private Zone. The `zoneName` is required when the value of the `name`  is Empty.
	ZoneName pulumi.StringPtrInput
}

func (ZoneState) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneState)(nil)).Elem()
}

type zoneArgs struct {
	// The language. Valid values: "zh", "en", "jp".
	Lang *string `pulumi:"lang"`
	// The name of the Private Zone. The `name` has been deprecated from provider version 1.107.0. Please use 'zone_name' instead.
	//
	// Deprecated: Field 'name' has been deprecated from version 1.107.0. Use 'zone_name' instead.
	Name *string `pulumi:"name"`
	// The recursive DNS proxy. Valid values:
	// - ZONE: indicates that the recursive DNS proxy is disabled.
	// - RECORD: indicates that the recursive DNS proxy is enabled.
	//   Default to "ZONE".
	ProxyPattern *string `pulumi:"proxyPattern"`
	// The remark of the Private Zone.
	Remark *string `pulumi:"remark"`
	// The Id of resource group which the Private Zone belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the host synchronization task. Valid values:  `ON`,`OFF`. **NOTE:** You can update the `syncStatus` to enable/disable the host synchronization task.
	SyncStatus *string `pulumi:"syncStatus"`
	// The IP address of the client.
	UserClientIp *string `pulumi:"userClientIp"`
	// The user information of the host synchronization task. The details see Block `userInfo`.
	UserInfos []ZoneUserInfo `pulumi:"userInfos"`
	// The zoneName of the Private Zone. The `zoneName` is required when the value of the `name`  is Empty.
	ZoneName *string `pulumi:"zoneName"`
}

// The set of arguments for constructing a Zone resource.
type ZoneArgs struct {
	// The language. Valid values: "zh", "en", "jp".
	Lang pulumi.StringPtrInput
	// The name of the Private Zone. The `name` has been deprecated from provider version 1.107.0. Please use 'zone_name' instead.
	//
	// Deprecated: Field 'name' has been deprecated from version 1.107.0. Use 'zone_name' instead.
	Name pulumi.StringPtrInput
	// The recursive DNS proxy. Valid values:
	// - ZONE: indicates that the recursive DNS proxy is disabled.
	// - RECORD: indicates that the recursive DNS proxy is enabled.
	//   Default to "ZONE".
	ProxyPattern pulumi.StringPtrInput
	// The remark of the Private Zone.
	Remark pulumi.StringPtrInput
	// The Id of resource group which the Private Zone belongs.
	ResourceGroupId pulumi.StringPtrInput
	// The status of the host synchronization task. Valid values:  `ON`,`OFF`. **NOTE:** You can update the `syncStatus` to enable/disable the host synchronization task.
	SyncStatus pulumi.StringPtrInput
	// The IP address of the client.
	UserClientIp pulumi.StringPtrInput
	// The user information of the host synchronization task. The details see Block `userInfo`.
	UserInfos ZoneUserInfoArrayInput
	// The zoneName of the Private Zone. The `zoneName` is required when the value of the `name`  is Empty.
	ZoneName pulumi.StringPtrInput
}

func (ZoneArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneArgs)(nil)).Elem()
}

type ZoneInput interface {
	pulumi.Input

	ToZoneOutput() ZoneOutput
	ToZoneOutputWithContext(ctx context.Context) ZoneOutput
}

func (*Zone) ElementType() reflect.Type {
	return reflect.TypeOf((**Zone)(nil)).Elem()
}

func (i *Zone) ToZoneOutput() ZoneOutput {
	return i.ToZoneOutputWithContext(context.Background())
}

func (i *Zone) ToZoneOutputWithContext(ctx context.Context) ZoneOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneOutput)
}

func (i *Zone) ToOutput(ctx context.Context) pulumix.Output[*Zone] {
	return pulumix.Output[*Zone]{
		OutputState: i.ToZoneOutputWithContext(ctx).OutputState,
	}
}

// ZoneArrayInput is an input type that accepts ZoneArray and ZoneArrayOutput values.
// You can construct a concrete instance of `ZoneArrayInput` via:
//
//	ZoneArray{ ZoneArgs{...} }
type ZoneArrayInput interface {
	pulumi.Input

	ToZoneArrayOutput() ZoneArrayOutput
	ToZoneArrayOutputWithContext(context.Context) ZoneArrayOutput
}

type ZoneArray []ZoneInput

func (ZoneArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Zone)(nil)).Elem()
}

func (i ZoneArray) ToZoneArrayOutput() ZoneArrayOutput {
	return i.ToZoneArrayOutputWithContext(context.Background())
}

func (i ZoneArray) ToZoneArrayOutputWithContext(ctx context.Context) ZoneArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneArrayOutput)
}

func (i ZoneArray) ToOutput(ctx context.Context) pulumix.Output[[]*Zone] {
	return pulumix.Output[[]*Zone]{
		OutputState: i.ToZoneArrayOutputWithContext(ctx).OutputState,
	}
}

// ZoneMapInput is an input type that accepts ZoneMap and ZoneMapOutput values.
// You can construct a concrete instance of `ZoneMapInput` via:
//
//	ZoneMap{ "key": ZoneArgs{...} }
type ZoneMapInput interface {
	pulumi.Input

	ToZoneMapOutput() ZoneMapOutput
	ToZoneMapOutputWithContext(context.Context) ZoneMapOutput
}

type ZoneMap map[string]ZoneInput

func (ZoneMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Zone)(nil)).Elem()
}

func (i ZoneMap) ToZoneMapOutput() ZoneMapOutput {
	return i.ToZoneMapOutputWithContext(context.Background())
}

func (i ZoneMap) ToZoneMapOutputWithContext(ctx context.Context) ZoneMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneMapOutput)
}

func (i ZoneMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Zone] {
	return pulumix.Output[map[string]*Zone]{
		OutputState: i.ToZoneMapOutputWithContext(ctx).OutputState,
	}
}

type ZoneOutput struct{ *pulumi.OutputState }

func (ZoneOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Zone)(nil)).Elem()
}

func (o ZoneOutput) ToZoneOutput() ZoneOutput {
	return o
}

func (o ZoneOutput) ToZoneOutputWithContext(ctx context.Context) ZoneOutput {
	return o
}

func (o ZoneOutput) ToOutput(ctx context.Context) pulumix.Output[*Zone] {
	return pulumix.Output[*Zone]{
		OutputState: o.OutputState,
	}
}

// Whether the Private Zone is ptr.
func (o ZoneOutput) IsPtr() pulumi.BoolOutput {
	return o.ApplyT(func(v *Zone) pulumi.BoolOutput { return v.IsPtr }).(pulumi.BoolOutput)
}

// The language. Valid values: "zh", "en", "jp".
func (o ZoneOutput) Lang() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringPtrOutput { return v.Lang }).(pulumi.StringPtrOutput)
}

// The name of the Private Zone. The `name` has been deprecated from provider version 1.107.0. Please use 'zone_name' instead.
//
// Deprecated: Field 'name' has been deprecated from version 1.107.0. Use 'zone_name' instead.
func (o ZoneOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The recursive DNS proxy. Valid values:
//   - ZONE: indicates that the recursive DNS proxy is disabled.
//   - RECORD: indicates that the recursive DNS proxy is enabled.
//     Default to "ZONE".
func (o ZoneOutput) ProxyPattern() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringPtrOutput { return v.ProxyPattern }).(pulumi.StringPtrOutput)
}

// The count of the Private Zone Record.
func (o ZoneOutput) RecordCount() pulumi.IntOutput {
	return o.ApplyT(func(v *Zone) pulumi.IntOutput { return v.RecordCount }).(pulumi.IntOutput)
}

// The remark of the Private Zone.
func (o ZoneOutput) Remark() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringPtrOutput { return v.Remark }).(pulumi.StringPtrOutput)
}

// The Id of resource group which the Private Zone belongs.
func (o ZoneOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringPtrOutput { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// The status of the host synchronization task. Valid values:  `ON`,`OFF`. **NOTE:** You can update the `syncStatus` to enable/disable the host synchronization task.
func (o ZoneOutput) SyncStatus() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringPtrOutput { return v.SyncStatus }).(pulumi.StringPtrOutput)
}

// The IP address of the client.
func (o ZoneOutput) UserClientIp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringPtrOutput { return v.UserClientIp }).(pulumi.StringPtrOutput)
}

// The user information of the host synchronization task. The details see Block `userInfo`.
func (o ZoneOutput) UserInfos() ZoneUserInfoArrayOutput {
	return o.ApplyT(func(v *Zone) ZoneUserInfoArrayOutput { return v.UserInfos }).(ZoneUserInfoArrayOutput)
}

// The zoneName of the Private Zone. The `zoneName` is required when the value of the `name`  is Empty.
func (o ZoneOutput) ZoneName() pulumi.StringOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringOutput { return v.ZoneName }).(pulumi.StringOutput)
}

type ZoneArrayOutput struct{ *pulumi.OutputState }

func (ZoneArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Zone)(nil)).Elem()
}

func (o ZoneArrayOutput) ToZoneArrayOutput() ZoneArrayOutput {
	return o
}

func (o ZoneArrayOutput) ToZoneArrayOutputWithContext(ctx context.Context) ZoneArrayOutput {
	return o
}

func (o ZoneArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Zone] {
	return pulumix.Output[[]*Zone]{
		OutputState: o.OutputState,
	}
}

func (o ZoneArrayOutput) Index(i pulumi.IntInput) ZoneOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Zone {
		return vs[0].([]*Zone)[vs[1].(int)]
	}).(ZoneOutput)
}

type ZoneMapOutput struct{ *pulumi.OutputState }

func (ZoneMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Zone)(nil)).Elem()
}

func (o ZoneMapOutput) ToZoneMapOutput() ZoneMapOutput {
	return o
}

func (o ZoneMapOutput) ToZoneMapOutputWithContext(ctx context.Context) ZoneMapOutput {
	return o
}

func (o ZoneMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Zone] {
	return pulumix.Output[map[string]*Zone]{
		OutputState: o.OutputState,
	}
}

func (o ZoneMapOutput) MapIndex(k pulumi.StringInput) ZoneOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Zone {
		return vs[0].(map[string]*Zone)[vs[1].(string)]
	}).(ZoneOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneInput)(nil)).Elem(), &Zone{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneArrayInput)(nil)).Elem(), ZoneArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneMapInput)(nil)).Elem(), ZoneMap{})
	pulumi.RegisterOutputType(ZoneOutput{})
	pulumi.RegisterOutputType(ZoneArrayOutput{})
	pulumi.RegisterOutputType(ZoneMapOutput{})
}
