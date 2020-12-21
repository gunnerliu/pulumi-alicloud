// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package alicloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type ProviderAssumeRole struct {
	Policy            *string `pulumi:"policy"`
	RoleArn           string  `pulumi:"roleArn"`
	SessionExpiration *int    `pulumi:"sessionExpiration"`
	SessionName       *string `pulumi:"sessionName"`
}

// ProviderAssumeRoleInput is an input type that accepts ProviderAssumeRoleArgs and ProviderAssumeRoleOutput values.
// You can construct a concrete instance of `ProviderAssumeRoleInput` via:
//
//          ProviderAssumeRoleArgs{...}
type ProviderAssumeRoleInput interface {
	pulumi.Input

	ToProviderAssumeRoleOutput() ProviderAssumeRoleOutput
	ToProviderAssumeRoleOutputWithContext(context.Context) ProviderAssumeRoleOutput
}

type ProviderAssumeRoleArgs struct {
	Policy            pulumi.StringPtrInput `pulumi:"policy"`
	RoleArn           pulumi.StringInput    `pulumi:"roleArn"`
	SessionExpiration pulumi.IntPtrInput    `pulumi:"sessionExpiration"`
	SessionName       pulumi.StringPtrInput `pulumi:"sessionName"`
}

func (ProviderAssumeRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderAssumeRole)(nil)).Elem()
}

func (i ProviderAssumeRoleArgs) ToProviderAssumeRoleOutput() ProviderAssumeRoleOutput {
	return i.ToProviderAssumeRoleOutputWithContext(context.Background())
}

func (i ProviderAssumeRoleArgs) ToProviderAssumeRoleOutputWithContext(ctx context.Context) ProviderAssumeRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderAssumeRoleOutput)
}

func (i ProviderAssumeRoleArgs) ToProviderAssumeRolePtrOutput() ProviderAssumeRolePtrOutput {
	return i.ToProviderAssumeRolePtrOutputWithContext(context.Background())
}

func (i ProviderAssumeRoleArgs) ToProviderAssumeRolePtrOutputWithContext(ctx context.Context) ProviderAssumeRolePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderAssumeRoleOutput).ToProviderAssumeRolePtrOutputWithContext(ctx)
}

// ProviderAssumeRolePtrInput is an input type that accepts ProviderAssumeRoleArgs, ProviderAssumeRolePtr and ProviderAssumeRolePtrOutput values.
// You can construct a concrete instance of `ProviderAssumeRolePtrInput` via:
//
//          ProviderAssumeRoleArgs{...}
//
//  or:
//
//          nil
type ProviderAssumeRolePtrInput interface {
	pulumi.Input

	ToProviderAssumeRolePtrOutput() ProviderAssumeRolePtrOutput
	ToProviderAssumeRolePtrOutputWithContext(context.Context) ProviderAssumeRolePtrOutput
}

type providerAssumeRolePtrType ProviderAssumeRoleArgs

func ProviderAssumeRolePtr(v *ProviderAssumeRoleArgs) ProviderAssumeRolePtrInput {
	return (*providerAssumeRolePtrType)(v)
}

func (*providerAssumeRolePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ProviderAssumeRole)(nil)).Elem()
}

func (i *providerAssumeRolePtrType) ToProviderAssumeRolePtrOutput() ProviderAssumeRolePtrOutput {
	return i.ToProviderAssumeRolePtrOutputWithContext(context.Background())
}

func (i *providerAssumeRolePtrType) ToProviderAssumeRolePtrOutputWithContext(ctx context.Context) ProviderAssumeRolePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderAssumeRolePtrOutput)
}

type ProviderAssumeRoleOutput struct{ *pulumi.OutputState }

func (ProviderAssumeRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderAssumeRole)(nil)).Elem()
}

func (o ProviderAssumeRoleOutput) ToProviderAssumeRoleOutput() ProviderAssumeRoleOutput {
	return o
}

func (o ProviderAssumeRoleOutput) ToProviderAssumeRoleOutputWithContext(ctx context.Context) ProviderAssumeRoleOutput {
	return o
}

func (o ProviderAssumeRoleOutput) ToProviderAssumeRolePtrOutput() ProviderAssumeRolePtrOutput {
	return o.ToProviderAssumeRolePtrOutputWithContext(context.Background())
}

func (o ProviderAssumeRoleOutput) ToProviderAssumeRolePtrOutputWithContext(ctx context.Context) ProviderAssumeRolePtrOutput {
	return o.ApplyT(func(v ProviderAssumeRole) *ProviderAssumeRole {
		return &v
	}).(ProviderAssumeRolePtrOutput)
}
func (o ProviderAssumeRoleOutput) Policy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderAssumeRole) *string { return v.Policy }).(pulumi.StringPtrOutput)
}

func (o ProviderAssumeRoleOutput) RoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v ProviderAssumeRole) string { return v.RoleArn }).(pulumi.StringOutput)
}

func (o ProviderAssumeRoleOutput) SessionExpiration() pulumi.IntPtrOutput {
	return o.ApplyT(func(v ProviderAssumeRole) *int { return v.SessionExpiration }).(pulumi.IntPtrOutput)
}

func (o ProviderAssumeRoleOutput) SessionName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderAssumeRole) *string { return v.SessionName }).(pulumi.StringPtrOutput)
}

type ProviderAssumeRolePtrOutput struct{ *pulumi.OutputState }

func (ProviderAssumeRolePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProviderAssumeRole)(nil)).Elem()
}

func (o ProviderAssumeRolePtrOutput) ToProviderAssumeRolePtrOutput() ProviderAssumeRolePtrOutput {
	return o
}

func (o ProviderAssumeRolePtrOutput) ToProviderAssumeRolePtrOutputWithContext(ctx context.Context) ProviderAssumeRolePtrOutput {
	return o
}

func (o ProviderAssumeRolePtrOutput) Elem() ProviderAssumeRoleOutput {
	return o.ApplyT(func(v *ProviderAssumeRole) ProviderAssumeRole { return *v }).(ProviderAssumeRoleOutput)
}

func (o ProviderAssumeRolePtrOutput) Policy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderAssumeRole) *string {
		if v == nil {
			return nil
		}
		return v.Policy
	}).(pulumi.StringPtrOutput)
}

func (o ProviderAssumeRolePtrOutput) RoleArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderAssumeRole) *string {
		if v == nil {
			return nil
		}
		return &v.RoleArn
	}).(pulumi.StringPtrOutput)
}

func (o ProviderAssumeRolePtrOutput) SessionExpiration() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ProviderAssumeRole) *int {
		if v == nil {
			return nil
		}
		return v.SessionExpiration
	}).(pulumi.IntPtrOutput)
}

func (o ProviderAssumeRolePtrOutput) SessionName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderAssumeRole) *string {
		if v == nil {
			return nil
		}
		return v.SessionName
	}).(pulumi.StringPtrOutput)
}

type ProviderEndpoint struct {
	Actiontrail     *string `pulumi:"actiontrail"`
	Adb             *string `pulumi:"adb"`
	Alidns          *string `pulumi:"alidns"`
	Alikafka        *string `pulumi:"alikafka"`
	Apigateway      *string `pulumi:"apigateway"`
	Bssopenapi      *string `pulumi:"bssopenapi"`
	Cas             *string `pulumi:"cas"`
	Cassandra       *string `pulumi:"cassandra"`
	Cbn             *string `pulumi:"cbn"`
	Cdn             *string `pulumi:"cdn"`
	Cen             *string `pulumi:"cen"`
	Cms             *string `pulumi:"cms"`
	Config          *string `pulumi:"config"`
	Cr              *string `pulumi:"cr"`
	Cs              *string `pulumi:"cs"`
	Datahub         *string `pulumi:"datahub"`
	Dcdn            *string `pulumi:"dcdn"`
	Ddosbgp         *string `pulumi:"ddosbgp"`
	Ddoscoo         *string `pulumi:"ddoscoo"`
	Dds             *string `pulumi:"dds"`
	DmsEnterprise   *string `pulumi:"dmsEnterprise"`
	Dns             *string `pulumi:"dns"`
	Drds            *string `pulumi:"drds"`
	Eci             *string `pulumi:"eci"`
	Ecs             *string `pulumi:"ecs"`
	Elasticsearch   *string `pulumi:"elasticsearch"`
	Emr             *string `pulumi:"emr"`
	Ess             *string `pulumi:"ess"`
	Fc              *string `pulumi:"fc"`
	Fnf             *string `pulumi:"fnf"`
	Gpdb            *string `pulumi:"gpdb"`
	Kms             *string `pulumi:"kms"`
	Kvstore         *string `pulumi:"kvstore"`
	Location        *string `pulumi:"location"`
	Log             *string `pulumi:"log"`
	Market          *string `pulumi:"market"`
	Maxcompute      *string `pulumi:"maxcompute"`
	Mns             *string `pulumi:"mns"`
	Mse             *string `pulumi:"mse"`
	Nas             *string `pulumi:"nas"`
	Ons             *string `pulumi:"ons"`
	Oos             *string `pulumi:"oos"`
	Oss             *string `pulumi:"oss"`
	Ots             *string `pulumi:"ots"`
	Polardb         *string `pulumi:"polardb"`
	Privatelink     *string `pulumi:"privatelink"`
	Pvtz            *string `pulumi:"pvtz"`
	RKvstore        *string `pulumi:"rKvstore"`
	Ram             *string `pulumi:"ram"`
	Rds             *string `pulumi:"rds"`
	Resourcemanager *string `pulumi:"resourcemanager"`
	Ros             *string `pulumi:"ros"`
	Slb             *string `pulumi:"slb"`
	Sts             *string `pulumi:"sts"`
	Vpc             *string `pulumi:"vpc"`
	WafOpenapi      *string `pulumi:"wafOpenapi"`
}

// ProviderEndpointInput is an input type that accepts ProviderEndpointArgs and ProviderEndpointOutput values.
// You can construct a concrete instance of `ProviderEndpointInput` via:
//
//          ProviderEndpointArgs{...}
type ProviderEndpointInput interface {
	pulumi.Input

	ToProviderEndpointOutput() ProviderEndpointOutput
	ToProviderEndpointOutputWithContext(context.Context) ProviderEndpointOutput
}

type ProviderEndpointArgs struct {
	Actiontrail     pulumi.StringPtrInput `pulumi:"actiontrail"`
	Adb             pulumi.StringPtrInput `pulumi:"adb"`
	Alidns          pulumi.StringPtrInput `pulumi:"alidns"`
	Alikafka        pulumi.StringPtrInput `pulumi:"alikafka"`
	Apigateway      pulumi.StringPtrInput `pulumi:"apigateway"`
	Bssopenapi      pulumi.StringPtrInput `pulumi:"bssopenapi"`
	Cas             pulumi.StringPtrInput `pulumi:"cas"`
	Cassandra       pulumi.StringPtrInput `pulumi:"cassandra"`
	Cbn             pulumi.StringPtrInput `pulumi:"cbn"`
	Cdn             pulumi.StringPtrInput `pulumi:"cdn"`
	Cen             pulumi.StringPtrInput `pulumi:"cen"`
	Cms             pulumi.StringPtrInput `pulumi:"cms"`
	Config          pulumi.StringPtrInput `pulumi:"config"`
	Cr              pulumi.StringPtrInput `pulumi:"cr"`
	Cs              pulumi.StringPtrInput `pulumi:"cs"`
	Datahub         pulumi.StringPtrInput `pulumi:"datahub"`
	Dcdn            pulumi.StringPtrInput `pulumi:"dcdn"`
	Ddosbgp         pulumi.StringPtrInput `pulumi:"ddosbgp"`
	Ddoscoo         pulumi.StringPtrInput `pulumi:"ddoscoo"`
	Dds             pulumi.StringPtrInput `pulumi:"dds"`
	DmsEnterprise   pulumi.StringPtrInput `pulumi:"dmsEnterprise"`
	Dns             pulumi.StringPtrInput `pulumi:"dns"`
	Drds            pulumi.StringPtrInput `pulumi:"drds"`
	Eci             pulumi.StringPtrInput `pulumi:"eci"`
	Ecs             pulumi.StringPtrInput `pulumi:"ecs"`
	Elasticsearch   pulumi.StringPtrInput `pulumi:"elasticsearch"`
	Emr             pulumi.StringPtrInput `pulumi:"emr"`
	Ess             pulumi.StringPtrInput `pulumi:"ess"`
	Fc              pulumi.StringPtrInput `pulumi:"fc"`
	Fnf             pulumi.StringPtrInput `pulumi:"fnf"`
	Gpdb            pulumi.StringPtrInput `pulumi:"gpdb"`
	Kms             pulumi.StringPtrInput `pulumi:"kms"`
	Kvstore         pulumi.StringPtrInput `pulumi:"kvstore"`
	Location        pulumi.StringPtrInput `pulumi:"location"`
	Log             pulumi.StringPtrInput `pulumi:"log"`
	Market          pulumi.StringPtrInput `pulumi:"market"`
	Maxcompute      pulumi.StringPtrInput `pulumi:"maxcompute"`
	Mns             pulumi.StringPtrInput `pulumi:"mns"`
	Mse             pulumi.StringPtrInput `pulumi:"mse"`
	Nas             pulumi.StringPtrInput `pulumi:"nas"`
	Ons             pulumi.StringPtrInput `pulumi:"ons"`
	Oos             pulumi.StringPtrInput `pulumi:"oos"`
	Oss             pulumi.StringPtrInput `pulumi:"oss"`
	Ots             pulumi.StringPtrInput `pulumi:"ots"`
	Polardb         pulumi.StringPtrInput `pulumi:"polardb"`
	Privatelink     pulumi.StringPtrInput `pulumi:"privatelink"`
	Pvtz            pulumi.StringPtrInput `pulumi:"pvtz"`
	RKvstore        pulumi.StringPtrInput `pulumi:"rKvstore"`
	Ram             pulumi.StringPtrInput `pulumi:"ram"`
	Rds             pulumi.StringPtrInput `pulumi:"rds"`
	Resourcemanager pulumi.StringPtrInput `pulumi:"resourcemanager"`
	Ros             pulumi.StringPtrInput `pulumi:"ros"`
	Slb             pulumi.StringPtrInput `pulumi:"slb"`
	Sts             pulumi.StringPtrInput `pulumi:"sts"`
	Vpc             pulumi.StringPtrInput `pulumi:"vpc"`
	WafOpenapi      pulumi.StringPtrInput `pulumi:"wafOpenapi"`
}

func (ProviderEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderEndpoint)(nil)).Elem()
}

func (i ProviderEndpointArgs) ToProviderEndpointOutput() ProviderEndpointOutput {
	return i.ToProviderEndpointOutputWithContext(context.Background())
}

func (i ProviderEndpointArgs) ToProviderEndpointOutputWithContext(ctx context.Context) ProviderEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderEndpointOutput)
}

// ProviderEndpointArrayInput is an input type that accepts ProviderEndpointArray and ProviderEndpointArrayOutput values.
// You can construct a concrete instance of `ProviderEndpointArrayInput` via:
//
//          ProviderEndpointArray{ ProviderEndpointArgs{...} }
type ProviderEndpointArrayInput interface {
	pulumi.Input

	ToProviderEndpointArrayOutput() ProviderEndpointArrayOutput
	ToProviderEndpointArrayOutputWithContext(context.Context) ProviderEndpointArrayOutput
}

type ProviderEndpointArray []ProviderEndpointInput

func (ProviderEndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ProviderEndpoint)(nil)).Elem()
}

func (i ProviderEndpointArray) ToProviderEndpointArrayOutput() ProviderEndpointArrayOutput {
	return i.ToProviderEndpointArrayOutputWithContext(context.Background())
}

func (i ProviderEndpointArray) ToProviderEndpointArrayOutputWithContext(ctx context.Context) ProviderEndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderEndpointArrayOutput)
}

type ProviderEndpointOutput struct{ *pulumi.OutputState }

func (ProviderEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderEndpoint)(nil)).Elem()
}

func (o ProviderEndpointOutput) ToProviderEndpointOutput() ProviderEndpointOutput {
	return o
}

func (o ProviderEndpointOutput) ToProviderEndpointOutputWithContext(ctx context.Context) ProviderEndpointOutput {
	return o
}

func (o ProviderEndpointOutput) Actiontrail() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Actiontrail }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Adb() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Adb }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Alidns() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Alidns }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Alikafka() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Alikafka }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Apigateway() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Apigateway }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Bssopenapi() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Bssopenapi }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Cas() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Cas }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Cassandra() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Cassandra }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Cbn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Cbn }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Cdn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Cdn }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Cen() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Cen }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Cms() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Cms }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Config() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Config }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Cr() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Cr }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Cs() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Cs }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Datahub() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Datahub }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Dcdn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Dcdn }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Ddosbgp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Ddosbgp }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Ddoscoo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Ddoscoo }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Dds() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Dds }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) DmsEnterprise() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.DmsEnterprise }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Dns() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Dns }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Drds() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Drds }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Eci() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Eci }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Ecs() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Ecs }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Elasticsearch() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Elasticsearch }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Emr() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Emr }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Ess() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Ess }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Fc() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Fc }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Fnf() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Fnf }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Gpdb() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Gpdb }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Kms() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Kms }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Kvstore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Kvstore }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Location() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Location }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Log() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Log }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Market() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Market }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Maxcompute() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Maxcompute }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Mns() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Mns }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Mse() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Mse }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Nas() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Nas }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Ons() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Ons }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Oos() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Oos }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Oss() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Oss }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Ots() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Ots }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Polardb() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Polardb }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Privatelink() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Privatelink }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Pvtz() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Pvtz }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) RKvstore() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.RKvstore }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Ram() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Ram }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Rds() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Rds }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Resourcemanager() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Resourcemanager }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Ros() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Ros }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Slb() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Slb }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Sts() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Sts }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) Vpc() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.Vpc }).(pulumi.StringPtrOutput)
}

func (o ProviderEndpointOutput) WafOpenapi() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderEndpoint) *string { return v.WafOpenapi }).(pulumi.StringPtrOutput)
}

type ProviderEndpointArrayOutput struct{ *pulumi.OutputState }

func (ProviderEndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ProviderEndpoint)(nil)).Elem()
}

func (o ProviderEndpointArrayOutput) ToProviderEndpointArrayOutput() ProviderEndpointArrayOutput {
	return o
}

func (o ProviderEndpointArrayOutput) ToProviderEndpointArrayOutputWithContext(ctx context.Context) ProviderEndpointArrayOutput {
	return o
}

func (o ProviderEndpointArrayOutput) Index(i pulumi.IntInput) ProviderEndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ProviderEndpoint {
		return vs[0].([]ProviderEndpoint)[vs[1].(int)]
	}).(ProviderEndpointOutput)
}

type GetRegionsRegion struct {
	// ID of the region.
	Id string `pulumi:"id"`
	// Name of the region in the local language.
	LocalName string `pulumi:"localName"`
	RegionId  string `pulumi:"regionId"`
}

// GetRegionsRegionInput is an input type that accepts GetRegionsRegionArgs and GetRegionsRegionOutput values.
// You can construct a concrete instance of `GetRegionsRegionInput` via:
//
//          GetRegionsRegionArgs{...}
type GetRegionsRegionInput interface {
	pulumi.Input

	ToGetRegionsRegionOutput() GetRegionsRegionOutput
	ToGetRegionsRegionOutputWithContext(context.Context) GetRegionsRegionOutput
}

type GetRegionsRegionArgs struct {
	// ID of the region.
	Id pulumi.StringInput `pulumi:"id"`
	// Name of the region in the local language.
	LocalName pulumi.StringInput `pulumi:"localName"`
	RegionId  pulumi.StringInput `pulumi:"regionId"`
}

func (GetRegionsRegionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRegionsRegion)(nil)).Elem()
}

func (i GetRegionsRegionArgs) ToGetRegionsRegionOutput() GetRegionsRegionOutput {
	return i.ToGetRegionsRegionOutputWithContext(context.Background())
}

func (i GetRegionsRegionArgs) ToGetRegionsRegionOutputWithContext(ctx context.Context) GetRegionsRegionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetRegionsRegionOutput)
}

// GetRegionsRegionArrayInput is an input type that accepts GetRegionsRegionArray and GetRegionsRegionArrayOutput values.
// You can construct a concrete instance of `GetRegionsRegionArrayInput` via:
//
//          GetRegionsRegionArray{ GetRegionsRegionArgs{...} }
type GetRegionsRegionArrayInput interface {
	pulumi.Input

	ToGetRegionsRegionArrayOutput() GetRegionsRegionArrayOutput
	ToGetRegionsRegionArrayOutputWithContext(context.Context) GetRegionsRegionArrayOutput
}

type GetRegionsRegionArray []GetRegionsRegionInput

func (GetRegionsRegionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetRegionsRegion)(nil)).Elem()
}

func (i GetRegionsRegionArray) ToGetRegionsRegionArrayOutput() GetRegionsRegionArrayOutput {
	return i.ToGetRegionsRegionArrayOutputWithContext(context.Background())
}

func (i GetRegionsRegionArray) ToGetRegionsRegionArrayOutputWithContext(ctx context.Context) GetRegionsRegionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetRegionsRegionArrayOutput)
}

type GetRegionsRegionOutput struct{ *pulumi.OutputState }

func (GetRegionsRegionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRegionsRegion)(nil)).Elem()
}

func (o GetRegionsRegionOutput) ToGetRegionsRegionOutput() GetRegionsRegionOutput {
	return o
}

func (o GetRegionsRegionOutput) ToGetRegionsRegionOutputWithContext(ctx context.Context) GetRegionsRegionOutput {
	return o
}

// ID of the region.
func (o GetRegionsRegionOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegionsRegion) string { return v.Id }).(pulumi.StringOutput)
}

// Name of the region in the local language.
func (o GetRegionsRegionOutput) LocalName() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegionsRegion) string { return v.LocalName }).(pulumi.StringOutput)
}

func (o GetRegionsRegionOutput) RegionId() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegionsRegion) string { return v.RegionId }).(pulumi.StringOutput)
}

type GetRegionsRegionArrayOutput struct{ *pulumi.OutputState }

func (GetRegionsRegionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetRegionsRegion)(nil)).Elem()
}

func (o GetRegionsRegionArrayOutput) ToGetRegionsRegionArrayOutput() GetRegionsRegionArrayOutput {
	return o
}

func (o GetRegionsRegionArrayOutput) ToGetRegionsRegionArrayOutputWithContext(ctx context.Context) GetRegionsRegionArrayOutput {
	return o
}

func (o GetRegionsRegionArrayOutput) Index(i pulumi.IntInput) GetRegionsRegionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetRegionsRegion {
		return vs[0].([]GetRegionsRegion)[vs[1].(int)]
	}).(GetRegionsRegionOutput)
}

type GetZonesZone struct {
	// Set of supported disk categories.
	AvailableDiskCategories []string `pulumi:"availableDiskCategories"`
	// Allowed instance types.
	AvailableInstanceTypes []string `pulumi:"availableInstanceTypes"`
	// Filter the results by a specific resource type.
	// Valid values: `Instance`, `Disk`, `VSwitch`, `Rds`, `KVStore`, `FunctionCompute`, `Elasticsearch`, `Slb`.
	AvailableResourceCreations []string `pulumi:"availableResourceCreations"`
	// ID of the zone.
	Id string `pulumi:"id"`
	// Name of the zone in the local language.
	LocalName string `pulumi:"localName"`
	// A list of zone ids in which the multi zone.
	MultiZoneIds []string `pulumi:"multiZoneIds"`
	// A list of slb slave zone ids in which the slb master zone.
	SlbSlaveZoneIds []string `pulumi:"slbSlaveZoneIds"`
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
	// Set of supported disk categories.
	AvailableDiskCategories pulumi.StringArrayInput `pulumi:"availableDiskCategories"`
	// Allowed instance types.
	AvailableInstanceTypes pulumi.StringArrayInput `pulumi:"availableInstanceTypes"`
	// Filter the results by a specific resource type.
	// Valid values: `Instance`, `Disk`, `VSwitch`, `Rds`, `KVStore`, `FunctionCompute`, `Elasticsearch`, `Slb`.
	AvailableResourceCreations pulumi.StringArrayInput `pulumi:"availableResourceCreations"`
	// ID of the zone.
	Id pulumi.StringInput `pulumi:"id"`
	// Name of the zone in the local language.
	LocalName pulumi.StringInput `pulumi:"localName"`
	// A list of zone ids in which the multi zone.
	MultiZoneIds pulumi.StringArrayInput `pulumi:"multiZoneIds"`
	// A list of slb slave zone ids in which the slb master zone.
	SlbSlaveZoneIds pulumi.StringArrayInput `pulumi:"slbSlaveZoneIds"`
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

// Set of supported disk categories.
func (o GetZonesZoneOutput) AvailableDiskCategories() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetZonesZone) []string { return v.AvailableDiskCategories }).(pulumi.StringArrayOutput)
}

// Allowed instance types.
func (o GetZonesZoneOutput) AvailableInstanceTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetZonesZone) []string { return v.AvailableInstanceTypes }).(pulumi.StringArrayOutput)
}

// Filter the results by a specific resource type.
// Valid values: `Instance`, `Disk`, `VSwitch`, `Rds`, `KVStore`, `FunctionCompute`, `Elasticsearch`, `Slb`.
func (o GetZonesZoneOutput) AvailableResourceCreations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetZonesZone) []string { return v.AvailableResourceCreations }).(pulumi.StringArrayOutput)
}

// ID of the zone.
func (o GetZonesZoneOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZone) string { return v.Id }).(pulumi.StringOutput)
}

// Name of the zone in the local language.
func (o GetZonesZoneOutput) LocalName() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZone) string { return v.LocalName }).(pulumi.StringOutput)
}

// A list of zone ids in which the multi zone.
func (o GetZonesZoneOutput) MultiZoneIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetZonesZone) []string { return v.MultiZoneIds }).(pulumi.StringArrayOutput)
}

// A list of slb slave zone ids in which the slb master zone.
func (o GetZonesZoneOutput) SlbSlaveZoneIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetZonesZone) []string { return v.SlbSlaveZoneIds }).(pulumi.StringArrayOutput)
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

func init() {
	pulumi.RegisterOutputType(ProviderAssumeRoleOutput{})
	pulumi.RegisterOutputType(ProviderAssumeRolePtrOutput{})
	pulumi.RegisterOutputType(ProviderEndpointOutput{})
	pulumi.RegisterOutputType(ProviderEndpointArrayOutput{})
	pulumi.RegisterOutputType(GetRegionsRegionOutput{})
	pulumi.RegisterOutputType(GetRegionsRegionArrayOutput{})
	pulumi.RegisterOutputType(GetZonesZoneOutput{})
	pulumi.RegisterOutputType(GetZonesZoneArrayOutput{})
}
