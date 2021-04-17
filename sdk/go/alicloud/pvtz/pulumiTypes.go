// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pvtz

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type ZoneAttachmentVpc struct {
	// The region of the vpc. If not set, the current region will instead of.
	RegionId *string `pulumi:"regionId"`
	// The Id of the vpc.
	VpcId string `pulumi:"vpcId"`
}

// ZoneAttachmentVpcInput is an input type that accepts ZoneAttachmentVpcArgs and ZoneAttachmentVpcOutput values.
// You can construct a concrete instance of `ZoneAttachmentVpcInput` via:
//
//          ZoneAttachmentVpcArgs{...}
type ZoneAttachmentVpcInput interface {
	pulumi.Input

	ToZoneAttachmentVpcOutput() ZoneAttachmentVpcOutput
	ToZoneAttachmentVpcOutputWithContext(context.Context) ZoneAttachmentVpcOutput
}

type ZoneAttachmentVpcArgs struct {
	// The region of the vpc. If not set, the current region will instead of.
	RegionId pulumi.StringPtrInput `pulumi:"regionId"`
	// The Id of the vpc.
	VpcId pulumi.StringInput `pulumi:"vpcId"`
}

func (ZoneAttachmentVpcArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ZoneAttachmentVpc)(nil)).Elem()
}

func (i ZoneAttachmentVpcArgs) ToZoneAttachmentVpcOutput() ZoneAttachmentVpcOutput {
	return i.ToZoneAttachmentVpcOutputWithContext(context.Background())
}

func (i ZoneAttachmentVpcArgs) ToZoneAttachmentVpcOutputWithContext(ctx context.Context) ZoneAttachmentVpcOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneAttachmentVpcOutput)
}

// ZoneAttachmentVpcArrayInput is an input type that accepts ZoneAttachmentVpcArray and ZoneAttachmentVpcArrayOutput values.
// You can construct a concrete instance of `ZoneAttachmentVpcArrayInput` via:
//
//          ZoneAttachmentVpcArray{ ZoneAttachmentVpcArgs{...} }
type ZoneAttachmentVpcArrayInput interface {
	pulumi.Input

	ToZoneAttachmentVpcArrayOutput() ZoneAttachmentVpcArrayOutput
	ToZoneAttachmentVpcArrayOutputWithContext(context.Context) ZoneAttachmentVpcArrayOutput
}

type ZoneAttachmentVpcArray []ZoneAttachmentVpcInput

func (ZoneAttachmentVpcArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ZoneAttachmentVpc)(nil)).Elem()
}

func (i ZoneAttachmentVpcArray) ToZoneAttachmentVpcArrayOutput() ZoneAttachmentVpcArrayOutput {
	return i.ToZoneAttachmentVpcArrayOutputWithContext(context.Background())
}

func (i ZoneAttachmentVpcArray) ToZoneAttachmentVpcArrayOutputWithContext(ctx context.Context) ZoneAttachmentVpcArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneAttachmentVpcArrayOutput)
}

type ZoneAttachmentVpcOutput struct{ *pulumi.OutputState }

func (ZoneAttachmentVpcOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ZoneAttachmentVpc)(nil)).Elem()
}

func (o ZoneAttachmentVpcOutput) ToZoneAttachmentVpcOutput() ZoneAttachmentVpcOutput {
	return o
}

func (o ZoneAttachmentVpcOutput) ToZoneAttachmentVpcOutputWithContext(ctx context.Context) ZoneAttachmentVpcOutput {
	return o
}

// The region of the vpc. If not set, the current region will instead of.
func (o ZoneAttachmentVpcOutput) RegionId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ZoneAttachmentVpc) *string { return v.RegionId }).(pulumi.StringPtrOutput)
}

// The Id of the vpc.
func (o ZoneAttachmentVpcOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v ZoneAttachmentVpc) string { return v.VpcId }).(pulumi.StringOutput)
}

type ZoneAttachmentVpcArrayOutput struct{ *pulumi.OutputState }

func (ZoneAttachmentVpcArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ZoneAttachmentVpc)(nil)).Elem()
}

func (o ZoneAttachmentVpcArrayOutput) ToZoneAttachmentVpcArrayOutput() ZoneAttachmentVpcArrayOutput {
	return o
}

func (o ZoneAttachmentVpcArrayOutput) ToZoneAttachmentVpcArrayOutputWithContext(ctx context.Context) ZoneAttachmentVpcArrayOutput {
	return o
}

func (o ZoneAttachmentVpcArrayOutput) Index(i pulumi.IntInput) ZoneAttachmentVpcOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ZoneAttachmentVpc {
		return vs[0].([]ZoneAttachmentVpc)[vs[1].(int)]
	}).(ZoneAttachmentVpcOutput)
}

type GetZoneRecordsRecord struct {
	// ID of the Private Zone Record.
	Id string `pulumi:"id"`
	// Priority of the Private Zone Record.
	Priority int `pulumi:"priority"`
	// RecordId of the Private Zone Record.
	RecordId int `pulumi:"recordId"`
	// Remark of the Private Zone Record.
	Remark string `pulumi:"remark"`
	// Resource record of the Private Zone Record.
	ResourceRecord string `pulumi:"resourceRecord"`
	// Rr of the Private Zone Record.
	Rr string `pulumi:"rr"`
	// Resolve record status. Value:
	// - ENABLE: enable resolution.
	// - DISABLE: pause parsing.
	Status string `pulumi:"status"`
	// Ttl of the Private Zone Record.
	Ttl int `pulumi:"ttl"`
	// Type of the Private Zone Record.
	Type string `pulumi:"type"`
	// Value of the Private Zone Record.
	Value string `pulumi:"value"`
}

// GetZoneRecordsRecordInput is an input type that accepts GetZoneRecordsRecordArgs and GetZoneRecordsRecordOutput values.
// You can construct a concrete instance of `GetZoneRecordsRecordInput` via:
//
//          GetZoneRecordsRecordArgs{...}
type GetZoneRecordsRecordInput interface {
	pulumi.Input

	ToGetZoneRecordsRecordOutput() GetZoneRecordsRecordOutput
	ToGetZoneRecordsRecordOutputWithContext(context.Context) GetZoneRecordsRecordOutput
}

type GetZoneRecordsRecordArgs struct {
	// ID of the Private Zone Record.
	Id pulumi.StringInput `pulumi:"id"`
	// Priority of the Private Zone Record.
	Priority pulumi.IntInput `pulumi:"priority"`
	// RecordId of the Private Zone Record.
	RecordId pulumi.IntInput `pulumi:"recordId"`
	// Remark of the Private Zone Record.
	Remark pulumi.StringInput `pulumi:"remark"`
	// Resource record of the Private Zone Record.
	ResourceRecord pulumi.StringInput `pulumi:"resourceRecord"`
	// Rr of the Private Zone Record.
	Rr pulumi.StringInput `pulumi:"rr"`
	// Resolve record status. Value:
	// - ENABLE: enable resolution.
	// - DISABLE: pause parsing.
	Status pulumi.StringInput `pulumi:"status"`
	// Ttl of the Private Zone Record.
	Ttl pulumi.IntInput `pulumi:"ttl"`
	// Type of the Private Zone Record.
	Type pulumi.StringInput `pulumi:"type"`
	// Value of the Private Zone Record.
	Value pulumi.StringInput `pulumi:"value"`
}

func (GetZoneRecordsRecordArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZoneRecordsRecord)(nil)).Elem()
}

func (i GetZoneRecordsRecordArgs) ToGetZoneRecordsRecordOutput() GetZoneRecordsRecordOutput {
	return i.ToGetZoneRecordsRecordOutputWithContext(context.Background())
}

func (i GetZoneRecordsRecordArgs) ToGetZoneRecordsRecordOutputWithContext(ctx context.Context) GetZoneRecordsRecordOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetZoneRecordsRecordOutput)
}

// GetZoneRecordsRecordArrayInput is an input type that accepts GetZoneRecordsRecordArray and GetZoneRecordsRecordArrayOutput values.
// You can construct a concrete instance of `GetZoneRecordsRecordArrayInput` via:
//
//          GetZoneRecordsRecordArray{ GetZoneRecordsRecordArgs{...} }
type GetZoneRecordsRecordArrayInput interface {
	pulumi.Input

	ToGetZoneRecordsRecordArrayOutput() GetZoneRecordsRecordArrayOutput
	ToGetZoneRecordsRecordArrayOutputWithContext(context.Context) GetZoneRecordsRecordArrayOutput
}

type GetZoneRecordsRecordArray []GetZoneRecordsRecordInput

func (GetZoneRecordsRecordArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetZoneRecordsRecord)(nil)).Elem()
}

func (i GetZoneRecordsRecordArray) ToGetZoneRecordsRecordArrayOutput() GetZoneRecordsRecordArrayOutput {
	return i.ToGetZoneRecordsRecordArrayOutputWithContext(context.Background())
}

func (i GetZoneRecordsRecordArray) ToGetZoneRecordsRecordArrayOutputWithContext(ctx context.Context) GetZoneRecordsRecordArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetZoneRecordsRecordArrayOutput)
}

type GetZoneRecordsRecordOutput struct{ *pulumi.OutputState }

func (GetZoneRecordsRecordOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZoneRecordsRecord)(nil)).Elem()
}

func (o GetZoneRecordsRecordOutput) ToGetZoneRecordsRecordOutput() GetZoneRecordsRecordOutput {
	return o
}

func (o GetZoneRecordsRecordOutput) ToGetZoneRecordsRecordOutputWithContext(ctx context.Context) GetZoneRecordsRecordOutput {
	return o
}

// ID of the Private Zone Record.
func (o GetZoneRecordsRecordOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetZoneRecordsRecord) string { return v.Id }).(pulumi.StringOutput)
}

// Priority of the Private Zone Record.
func (o GetZoneRecordsRecordOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v GetZoneRecordsRecord) int { return v.Priority }).(pulumi.IntOutput)
}

// RecordId of the Private Zone Record.
func (o GetZoneRecordsRecordOutput) RecordId() pulumi.IntOutput {
	return o.ApplyT(func(v GetZoneRecordsRecord) int { return v.RecordId }).(pulumi.IntOutput)
}

// Remark of the Private Zone Record.
func (o GetZoneRecordsRecordOutput) Remark() pulumi.StringOutput {
	return o.ApplyT(func(v GetZoneRecordsRecord) string { return v.Remark }).(pulumi.StringOutput)
}

// Resource record of the Private Zone Record.
func (o GetZoneRecordsRecordOutput) ResourceRecord() pulumi.StringOutput {
	return o.ApplyT(func(v GetZoneRecordsRecord) string { return v.ResourceRecord }).(pulumi.StringOutput)
}

// Rr of the Private Zone Record.
func (o GetZoneRecordsRecordOutput) Rr() pulumi.StringOutput {
	return o.ApplyT(func(v GetZoneRecordsRecord) string { return v.Rr }).(pulumi.StringOutput)
}

// Resolve record status. Value:
// - ENABLE: enable resolution.
// - DISABLE: pause parsing.
func (o GetZoneRecordsRecordOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetZoneRecordsRecord) string { return v.Status }).(pulumi.StringOutput)
}

// Ttl of the Private Zone Record.
func (o GetZoneRecordsRecordOutput) Ttl() pulumi.IntOutput {
	return o.ApplyT(func(v GetZoneRecordsRecord) int { return v.Ttl }).(pulumi.IntOutput)
}

// Type of the Private Zone Record.
func (o GetZoneRecordsRecordOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetZoneRecordsRecord) string { return v.Type }).(pulumi.StringOutput)
}

// Value of the Private Zone Record.
func (o GetZoneRecordsRecordOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v GetZoneRecordsRecord) string { return v.Value }).(pulumi.StringOutput)
}

type GetZoneRecordsRecordArrayOutput struct{ *pulumi.OutputState }

func (GetZoneRecordsRecordArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetZoneRecordsRecord)(nil)).Elem()
}

func (o GetZoneRecordsRecordArrayOutput) ToGetZoneRecordsRecordArrayOutput() GetZoneRecordsRecordArrayOutput {
	return o
}

func (o GetZoneRecordsRecordArrayOutput) ToGetZoneRecordsRecordArrayOutputWithContext(ctx context.Context) GetZoneRecordsRecordArrayOutput {
	return o
}

func (o GetZoneRecordsRecordArrayOutput) Index(i pulumi.IntInput) GetZoneRecordsRecordOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetZoneRecordsRecord {
		return vs[0].([]GetZoneRecordsRecord)[vs[1].(int)]
	}).(GetZoneRecordsRecordOutput)
}

type GetZonesZone struct {
	// List of the VPCs is bound to the Private Zone:
	BindVpcs []GetZonesZoneBindVpc `pulumi:"bindVpcs"`
	// Time of create of the Private Zone.
	CreateTimestamp int    `pulumi:"createTimestamp"`
	CreationTime    string `pulumi:"creationTime"`
	// ID of the Private Zone.
	Id string `pulumi:"id"`
	// Whether the Private Zone is ptr.
	IsPtr bool `pulumi:"isPtr"`
	// Name of the Private Zone.
	Name string `pulumi:"name"`
	// The recursive DNS proxy.
	ProxyPattern string `pulumi:"proxyPattern"`
	// Count of the Private Zone Record.
	RecordCount int `pulumi:"recordCount"`
	// Remark of the Private Zone.
	Remark string `pulumi:"remark"`
	// resource_group_id for zone resourceGroupId.
	ResourceGroupId string `pulumi:"resourceGroupId"`
	// Whether to turn on secondary DNS.
	SlaveDns   bool   `pulumi:"slaveDns"`
	UpdateTime string `pulumi:"updateTime"`
	// Time of update of the Private Zone.
	UpdateTimestamp int `pulumi:"updateTimestamp"`
	// ZoneId of the Private Zone.
	ZoneId string `pulumi:"zoneId"`
	// ZoneName of the Private Zone.
	ZoneName string `pulumi:"zoneName"`
}

// GetZonesZoneInput is an input type that accepts GetZonesZoneArgs and GetZonesZoneOutput values.
// You can construct a concrete instance of `GetZonesZoneInput` via:
//
//          GetZonesZoneArgs{...}
type GetZonesZoneInput interface {
	pulumi.Input

	ToGetZonesZoneOutput() GetZonesZoneOutput
	ToGetZonesZoneOutputWithContext(context.Context) GetZonesZoneOutput
}

type GetZonesZoneArgs struct {
	// List of the VPCs is bound to the Private Zone:
	BindVpcs GetZonesZoneBindVpcArrayInput `pulumi:"bindVpcs"`
	// Time of create of the Private Zone.
	CreateTimestamp pulumi.IntInput    `pulumi:"createTimestamp"`
	CreationTime    pulumi.StringInput `pulumi:"creationTime"`
	// ID of the Private Zone.
	Id pulumi.StringInput `pulumi:"id"`
	// Whether the Private Zone is ptr.
	IsPtr pulumi.BoolInput `pulumi:"isPtr"`
	// Name of the Private Zone.
	Name pulumi.StringInput `pulumi:"name"`
	// The recursive DNS proxy.
	ProxyPattern pulumi.StringInput `pulumi:"proxyPattern"`
	// Count of the Private Zone Record.
	RecordCount pulumi.IntInput `pulumi:"recordCount"`
	// Remark of the Private Zone.
	Remark pulumi.StringInput `pulumi:"remark"`
	// resource_group_id for zone resourceGroupId.
	ResourceGroupId pulumi.StringInput `pulumi:"resourceGroupId"`
	// Whether to turn on secondary DNS.
	SlaveDns   pulumi.BoolInput   `pulumi:"slaveDns"`
	UpdateTime pulumi.StringInput `pulumi:"updateTime"`
	// Time of update of the Private Zone.
	UpdateTimestamp pulumi.IntInput `pulumi:"updateTimestamp"`
	// ZoneId of the Private Zone.
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
	// ZoneName of the Private Zone.
	ZoneName pulumi.StringInput `pulumi:"zoneName"`
}

func (GetZonesZoneArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesZone)(nil)).Elem()
}

func (i GetZonesZoneArgs) ToGetZonesZoneOutput() GetZonesZoneOutput {
	return i.ToGetZonesZoneOutputWithContext(context.Background())
}

func (i GetZonesZoneArgs) ToGetZonesZoneOutputWithContext(ctx context.Context) GetZonesZoneOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetZonesZoneOutput)
}

// GetZonesZoneArrayInput is an input type that accepts GetZonesZoneArray and GetZonesZoneArrayOutput values.
// You can construct a concrete instance of `GetZonesZoneArrayInput` via:
//
//          GetZonesZoneArray{ GetZonesZoneArgs{...} }
type GetZonesZoneArrayInput interface {
	pulumi.Input

	ToGetZonesZoneArrayOutput() GetZonesZoneArrayOutput
	ToGetZonesZoneArrayOutputWithContext(context.Context) GetZonesZoneArrayOutput
}

type GetZonesZoneArray []GetZonesZoneInput

func (GetZonesZoneArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetZonesZone)(nil)).Elem()
}

func (i GetZonesZoneArray) ToGetZonesZoneArrayOutput() GetZonesZoneArrayOutput {
	return i.ToGetZonesZoneArrayOutputWithContext(context.Background())
}

func (i GetZonesZoneArray) ToGetZonesZoneArrayOutputWithContext(ctx context.Context) GetZonesZoneArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetZonesZoneArrayOutput)
}

type GetZonesZoneOutput struct{ *pulumi.OutputState }

func (GetZonesZoneOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesZone)(nil)).Elem()
}

func (o GetZonesZoneOutput) ToGetZonesZoneOutput() GetZonesZoneOutput {
	return o
}

func (o GetZonesZoneOutput) ToGetZonesZoneOutputWithContext(ctx context.Context) GetZonesZoneOutput {
	return o
}

// List of the VPCs is bound to the Private Zone:
func (o GetZonesZoneOutput) BindVpcs() GetZonesZoneBindVpcArrayOutput {
	return o.ApplyT(func(v GetZonesZone) []GetZonesZoneBindVpc { return v.BindVpcs }).(GetZonesZoneBindVpcArrayOutput)
}

// Time of create of the Private Zone.
func (o GetZonesZoneOutput) CreateTimestamp() pulumi.IntOutput {
	return o.ApplyT(func(v GetZonesZone) int { return v.CreateTimestamp }).(pulumi.IntOutput)
}

func (o GetZonesZoneOutput) CreationTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZone) string { return v.CreationTime }).(pulumi.StringOutput)
}

// ID of the Private Zone.
func (o GetZonesZoneOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZone) string { return v.Id }).(pulumi.StringOutput)
}

// Whether the Private Zone is ptr.
func (o GetZonesZoneOutput) IsPtr() pulumi.BoolOutput {
	return o.ApplyT(func(v GetZonesZone) bool { return v.IsPtr }).(pulumi.BoolOutput)
}

// Name of the Private Zone.
func (o GetZonesZoneOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZone) string { return v.Name }).(pulumi.StringOutput)
}

// The recursive DNS proxy.
func (o GetZonesZoneOutput) ProxyPattern() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZone) string { return v.ProxyPattern }).(pulumi.StringOutput)
}

// Count of the Private Zone Record.
func (o GetZonesZoneOutput) RecordCount() pulumi.IntOutput {
	return o.ApplyT(func(v GetZonesZone) int { return v.RecordCount }).(pulumi.IntOutput)
}

// Remark of the Private Zone.
func (o GetZonesZoneOutput) Remark() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZone) string { return v.Remark }).(pulumi.StringOutput)
}

// resource_group_id for zone resourceGroupId.
func (o GetZonesZoneOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZone) string { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// Whether to turn on secondary DNS.
func (o GetZonesZoneOutput) SlaveDns() pulumi.BoolOutput {
	return o.ApplyT(func(v GetZonesZone) bool { return v.SlaveDns }).(pulumi.BoolOutput)
}

func (o GetZonesZoneOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZone) string { return v.UpdateTime }).(pulumi.StringOutput)
}

// Time of update of the Private Zone.
func (o GetZonesZoneOutput) UpdateTimestamp() pulumi.IntOutput {
	return o.ApplyT(func(v GetZonesZone) int { return v.UpdateTimestamp }).(pulumi.IntOutput)
}

// ZoneId of the Private Zone.
func (o GetZonesZoneOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZone) string { return v.ZoneId }).(pulumi.StringOutput)
}

// ZoneName of the Private Zone.
func (o GetZonesZoneOutput) ZoneName() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZone) string { return v.ZoneName }).(pulumi.StringOutput)
}

type GetZonesZoneArrayOutput struct{ *pulumi.OutputState }

func (GetZonesZoneArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetZonesZone)(nil)).Elem()
}

func (o GetZonesZoneArrayOutput) ToGetZonesZoneArrayOutput() GetZonesZoneArrayOutput {
	return o
}

func (o GetZonesZoneArrayOutput) ToGetZonesZoneArrayOutputWithContext(ctx context.Context) GetZonesZoneArrayOutput {
	return o
}

func (o GetZonesZoneArrayOutput) Index(i pulumi.IntInput) GetZonesZoneOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetZonesZone {
		return vs[0].([]GetZonesZone)[vs[1].(int)]
	}).(GetZonesZoneOutput)
}

type GetZonesZoneBindVpc struct {
	// Binding the regionId of VPC.
	RegionId string `pulumi:"regionId"`
	// Binding the regionName of VPC.
	RegionName string `pulumi:"regionName"`
	// Binding the vpcId of VPC.
	VpcId   string `pulumi:"vpcId"`
	VpcName string `pulumi:"vpcName"`
}

// GetZonesZoneBindVpcInput is an input type that accepts GetZonesZoneBindVpcArgs and GetZonesZoneBindVpcOutput values.
// You can construct a concrete instance of `GetZonesZoneBindVpcInput` via:
//
//          GetZonesZoneBindVpcArgs{...}
type GetZonesZoneBindVpcInput interface {
	pulumi.Input

	ToGetZonesZoneBindVpcOutput() GetZonesZoneBindVpcOutput
	ToGetZonesZoneBindVpcOutputWithContext(context.Context) GetZonesZoneBindVpcOutput
}

type GetZonesZoneBindVpcArgs struct {
	// Binding the regionId of VPC.
	RegionId pulumi.StringInput `pulumi:"regionId"`
	// Binding the regionName of VPC.
	RegionName pulumi.StringInput `pulumi:"regionName"`
	// Binding the vpcId of VPC.
	VpcId   pulumi.StringInput `pulumi:"vpcId"`
	VpcName pulumi.StringInput `pulumi:"vpcName"`
}

func (GetZonesZoneBindVpcArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesZoneBindVpc)(nil)).Elem()
}

func (i GetZonesZoneBindVpcArgs) ToGetZonesZoneBindVpcOutput() GetZonesZoneBindVpcOutput {
	return i.ToGetZonesZoneBindVpcOutputWithContext(context.Background())
}

func (i GetZonesZoneBindVpcArgs) ToGetZonesZoneBindVpcOutputWithContext(ctx context.Context) GetZonesZoneBindVpcOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetZonesZoneBindVpcOutput)
}

// GetZonesZoneBindVpcArrayInput is an input type that accepts GetZonesZoneBindVpcArray and GetZonesZoneBindVpcArrayOutput values.
// You can construct a concrete instance of `GetZonesZoneBindVpcArrayInput` via:
//
//          GetZonesZoneBindVpcArray{ GetZonesZoneBindVpcArgs{...} }
type GetZonesZoneBindVpcArrayInput interface {
	pulumi.Input

	ToGetZonesZoneBindVpcArrayOutput() GetZonesZoneBindVpcArrayOutput
	ToGetZonesZoneBindVpcArrayOutputWithContext(context.Context) GetZonesZoneBindVpcArrayOutput
}

type GetZonesZoneBindVpcArray []GetZonesZoneBindVpcInput

func (GetZonesZoneBindVpcArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetZonesZoneBindVpc)(nil)).Elem()
}

func (i GetZonesZoneBindVpcArray) ToGetZonesZoneBindVpcArrayOutput() GetZonesZoneBindVpcArrayOutput {
	return i.ToGetZonesZoneBindVpcArrayOutputWithContext(context.Background())
}

func (i GetZonesZoneBindVpcArray) ToGetZonesZoneBindVpcArrayOutputWithContext(ctx context.Context) GetZonesZoneBindVpcArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetZonesZoneBindVpcArrayOutput)
}

type GetZonesZoneBindVpcOutput struct{ *pulumi.OutputState }

func (GetZonesZoneBindVpcOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesZoneBindVpc)(nil)).Elem()
}

func (o GetZonesZoneBindVpcOutput) ToGetZonesZoneBindVpcOutput() GetZonesZoneBindVpcOutput {
	return o
}

func (o GetZonesZoneBindVpcOutput) ToGetZonesZoneBindVpcOutputWithContext(ctx context.Context) GetZonesZoneBindVpcOutput {
	return o
}

// Binding the regionId of VPC.
func (o GetZonesZoneBindVpcOutput) RegionId() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZoneBindVpc) string { return v.RegionId }).(pulumi.StringOutput)
}

// Binding the regionName of VPC.
func (o GetZonesZoneBindVpcOutput) RegionName() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZoneBindVpc) string { return v.RegionName }).(pulumi.StringOutput)
}

// Binding the vpcId of VPC.
func (o GetZonesZoneBindVpcOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZoneBindVpc) string { return v.VpcId }).(pulumi.StringOutput)
}

func (o GetZonesZoneBindVpcOutput) VpcName() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZoneBindVpc) string { return v.VpcName }).(pulumi.StringOutput)
}

type GetZonesZoneBindVpcArrayOutput struct{ *pulumi.OutputState }

func (GetZonesZoneBindVpcArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetZonesZoneBindVpc)(nil)).Elem()
}

func (o GetZonesZoneBindVpcArrayOutput) ToGetZonesZoneBindVpcArrayOutput() GetZonesZoneBindVpcArrayOutput {
	return o
}

func (o GetZonesZoneBindVpcArrayOutput) ToGetZonesZoneBindVpcArrayOutputWithContext(ctx context.Context) GetZonesZoneBindVpcArrayOutput {
	return o
}

func (o GetZonesZoneBindVpcArrayOutput) Index(i pulumi.IntInput) GetZonesZoneBindVpcOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetZonesZoneBindVpc {
		return vs[0].([]GetZonesZoneBindVpc)[vs[1].(int)]
	}).(GetZonesZoneBindVpcOutput)
}

func init() {
	pulumi.RegisterOutputType(ZoneAttachmentVpcOutput{})
	pulumi.RegisterOutputType(ZoneAttachmentVpcArrayOutput{})
	pulumi.RegisterOutputType(GetZoneRecordsRecordOutput{})
	pulumi.RegisterOutputType(GetZoneRecordsRecordArrayOutput{})
	pulumi.RegisterOutputType(GetZonesZoneOutput{})
	pulumi.RegisterOutputType(GetZonesZoneArrayOutput{})
	pulumi.RegisterOutputType(GetZonesZoneBindVpcOutput{})
	pulumi.RegisterOutputType(GetZonesZoneBindVpcArrayOutput{})
}
