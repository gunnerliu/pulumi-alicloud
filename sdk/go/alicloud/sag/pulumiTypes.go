// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sag

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type GetAclsAcl struct {
	// The ID of the ACL. For example "acl-xxx".
	Id string `pulumi:"id"`
	// The name of the Acl.
	Name string `pulumi:"name"`
}

// GetAclsAclInput is an input type that accepts GetAclsAclArgs and GetAclsAclOutput values.
// You can construct a concrete instance of `GetAclsAclInput` via:
//
//	GetAclsAclArgs{...}
type GetAclsAclInput interface {
	pulumi.Input

	ToGetAclsAclOutput() GetAclsAclOutput
	ToGetAclsAclOutputWithContext(context.Context) GetAclsAclOutput
}

type GetAclsAclArgs struct {
	// The ID of the ACL. For example "acl-xxx".
	Id pulumi.StringInput `pulumi:"id"`
	// The name of the Acl.
	Name pulumi.StringInput `pulumi:"name"`
}

func (GetAclsAclArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAclsAcl)(nil)).Elem()
}

func (i GetAclsAclArgs) ToGetAclsAclOutput() GetAclsAclOutput {
	return i.ToGetAclsAclOutputWithContext(context.Background())
}

func (i GetAclsAclArgs) ToGetAclsAclOutputWithContext(ctx context.Context) GetAclsAclOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAclsAclOutput)
}

// GetAclsAclArrayInput is an input type that accepts GetAclsAclArray and GetAclsAclArrayOutput values.
// You can construct a concrete instance of `GetAclsAclArrayInput` via:
//
//	GetAclsAclArray{ GetAclsAclArgs{...} }
type GetAclsAclArrayInput interface {
	pulumi.Input

	ToGetAclsAclArrayOutput() GetAclsAclArrayOutput
	ToGetAclsAclArrayOutputWithContext(context.Context) GetAclsAclArrayOutput
}

type GetAclsAclArray []GetAclsAclInput

func (GetAclsAclArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAclsAcl)(nil)).Elem()
}

func (i GetAclsAclArray) ToGetAclsAclArrayOutput() GetAclsAclArrayOutput {
	return i.ToGetAclsAclArrayOutputWithContext(context.Background())
}

func (i GetAclsAclArray) ToGetAclsAclArrayOutputWithContext(ctx context.Context) GetAclsAclArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetAclsAclArrayOutput)
}

type GetAclsAclOutput struct{ *pulumi.OutputState }

func (GetAclsAclOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAclsAcl)(nil)).Elem()
}

func (o GetAclsAclOutput) ToGetAclsAclOutput() GetAclsAclOutput {
	return o
}

func (o GetAclsAclOutput) ToGetAclsAclOutputWithContext(ctx context.Context) GetAclsAclOutput {
	return o
}

// The ID of the ACL. For example "acl-xxx".
func (o GetAclsAclOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAclsAcl) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the Acl.
func (o GetAclsAclOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetAclsAcl) string { return v.Name }).(pulumi.StringOutput)
}

type GetAclsAclArrayOutput struct{ *pulumi.OutputState }

func (GetAclsAclArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetAclsAcl)(nil)).Elem()
}

func (o GetAclsAclArrayOutput) ToGetAclsAclArrayOutput() GetAclsAclArrayOutput {
	return o
}

func (o GetAclsAclArrayOutput) ToGetAclsAclArrayOutputWithContext(ctx context.Context) GetAclsAclArrayOutput {
	return o
}

func (o GetAclsAclArrayOutput) Index(i pulumi.IntInput) GetAclsAclOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetAclsAcl {
		return vs[0].([]GetAclsAcl)[vs[1].(int)]
	}).(GetAclsAclOutput)
}

type GetSmartagFlowLogsLog struct {
	// The time interval at which log data of active connections is collected. Valid values: 60 to 6000. Default value: 300. Unit: second.
	ActiveAging int `pulumi:"activeAging"`
	// The description of the flow log.
	Description string `pulumi:"description"`
	// The ID of the flow log.
	FlowLogId string `pulumi:"flowLogId"`
	// The name of the flow log.
	FlowLogName string `pulumi:"flowLogName"`
	// The ID of the Flow Log.
	Id string `pulumi:"id"`
	// The time interval at which log data of inactive connections is connected. Valid values: 10 to 600. Default value: 15. Unit: second.
	InactiveAging int `pulumi:"inactiveAging"`
	// The name of the Log Service Logstore.
	LogstoreName string `pulumi:"logstoreName"`
	// The IP address of the NetFlow collector where the flow log is stored.
	NetflowServerIp string `pulumi:"netflowServerIp"`
	// The port of the NetFlow collector. Default value: 9995.
	NetflowServerPort int `pulumi:"netflowServerPort"`
	// The NetFlow version. Default value: V9.
	NetflowVersion string `pulumi:"netflowVersion"`
	// The location where the flow log is stored. Valid values:  sls: The flow log is stored in Log Service. netflow: The flow log is stored on a NetFlow collector. all: The flow log is stored both in Log Service and on a NetFlow collector.
	OutputType string `pulumi:"outputType"`
	// The name of the Log Service project.
	ProjectName string `pulumi:"projectName"`
	// The ID of the resource group.
	ResourceGroupId string `pulumi:"resourceGroupId"`
	// The ID of the region where Log Service is deployed.
	SlsRegionId string `pulumi:"slsRegionId"`
	// The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
	Status string `pulumi:"status"`
	// The number of Smart Access gateway (SAG) instances with which the flow log is associated.
	TotalSagNum int `pulumi:"totalSagNum"`
}

// GetSmartagFlowLogsLogInput is an input type that accepts GetSmartagFlowLogsLogArgs and GetSmartagFlowLogsLogOutput values.
// You can construct a concrete instance of `GetSmartagFlowLogsLogInput` via:
//
//	GetSmartagFlowLogsLogArgs{...}
type GetSmartagFlowLogsLogInput interface {
	pulumi.Input

	ToGetSmartagFlowLogsLogOutput() GetSmartagFlowLogsLogOutput
	ToGetSmartagFlowLogsLogOutputWithContext(context.Context) GetSmartagFlowLogsLogOutput
}

type GetSmartagFlowLogsLogArgs struct {
	// The time interval at which log data of active connections is collected. Valid values: 60 to 6000. Default value: 300. Unit: second.
	ActiveAging pulumi.IntInput `pulumi:"activeAging"`
	// The description of the flow log.
	Description pulumi.StringInput `pulumi:"description"`
	// The ID of the flow log.
	FlowLogId pulumi.StringInput `pulumi:"flowLogId"`
	// The name of the flow log.
	FlowLogName pulumi.StringInput `pulumi:"flowLogName"`
	// The ID of the Flow Log.
	Id pulumi.StringInput `pulumi:"id"`
	// The time interval at which log data of inactive connections is connected. Valid values: 10 to 600. Default value: 15. Unit: second.
	InactiveAging pulumi.IntInput `pulumi:"inactiveAging"`
	// The name of the Log Service Logstore.
	LogstoreName pulumi.StringInput `pulumi:"logstoreName"`
	// The IP address of the NetFlow collector where the flow log is stored.
	NetflowServerIp pulumi.StringInput `pulumi:"netflowServerIp"`
	// The port of the NetFlow collector. Default value: 9995.
	NetflowServerPort pulumi.IntInput `pulumi:"netflowServerPort"`
	// The NetFlow version. Default value: V9.
	NetflowVersion pulumi.StringInput `pulumi:"netflowVersion"`
	// The location where the flow log is stored. Valid values:  sls: The flow log is stored in Log Service. netflow: The flow log is stored on a NetFlow collector. all: The flow log is stored both in Log Service and on a NetFlow collector.
	OutputType pulumi.StringInput `pulumi:"outputType"`
	// The name of the Log Service project.
	ProjectName pulumi.StringInput `pulumi:"projectName"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringInput `pulumi:"resourceGroupId"`
	// The ID of the region where Log Service is deployed.
	SlsRegionId pulumi.StringInput `pulumi:"slsRegionId"`
	// The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
	Status pulumi.StringInput `pulumi:"status"`
	// The number of Smart Access gateway (SAG) instances with which the flow log is associated.
	TotalSagNum pulumi.IntInput `pulumi:"totalSagNum"`
}

func (GetSmartagFlowLogsLogArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmartagFlowLogsLog)(nil)).Elem()
}

func (i GetSmartagFlowLogsLogArgs) ToGetSmartagFlowLogsLogOutput() GetSmartagFlowLogsLogOutput {
	return i.ToGetSmartagFlowLogsLogOutputWithContext(context.Background())
}

func (i GetSmartagFlowLogsLogArgs) ToGetSmartagFlowLogsLogOutputWithContext(ctx context.Context) GetSmartagFlowLogsLogOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetSmartagFlowLogsLogOutput)
}

// GetSmartagFlowLogsLogArrayInput is an input type that accepts GetSmartagFlowLogsLogArray and GetSmartagFlowLogsLogArrayOutput values.
// You can construct a concrete instance of `GetSmartagFlowLogsLogArrayInput` via:
//
//	GetSmartagFlowLogsLogArray{ GetSmartagFlowLogsLogArgs{...} }
type GetSmartagFlowLogsLogArrayInput interface {
	pulumi.Input

	ToGetSmartagFlowLogsLogArrayOutput() GetSmartagFlowLogsLogArrayOutput
	ToGetSmartagFlowLogsLogArrayOutputWithContext(context.Context) GetSmartagFlowLogsLogArrayOutput
}

type GetSmartagFlowLogsLogArray []GetSmartagFlowLogsLogInput

func (GetSmartagFlowLogsLogArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetSmartagFlowLogsLog)(nil)).Elem()
}

func (i GetSmartagFlowLogsLogArray) ToGetSmartagFlowLogsLogArrayOutput() GetSmartagFlowLogsLogArrayOutput {
	return i.ToGetSmartagFlowLogsLogArrayOutputWithContext(context.Background())
}

func (i GetSmartagFlowLogsLogArray) ToGetSmartagFlowLogsLogArrayOutputWithContext(ctx context.Context) GetSmartagFlowLogsLogArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetSmartagFlowLogsLogArrayOutput)
}

type GetSmartagFlowLogsLogOutput struct{ *pulumi.OutputState }

func (GetSmartagFlowLogsLogOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmartagFlowLogsLog)(nil)).Elem()
}

func (o GetSmartagFlowLogsLogOutput) ToGetSmartagFlowLogsLogOutput() GetSmartagFlowLogsLogOutput {
	return o
}

func (o GetSmartagFlowLogsLogOutput) ToGetSmartagFlowLogsLogOutputWithContext(ctx context.Context) GetSmartagFlowLogsLogOutput {
	return o
}

// The time interval at which log data of active connections is collected. Valid values: 60 to 6000. Default value: 300. Unit: second.
func (o GetSmartagFlowLogsLogOutput) ActiveAging() pulumi.IntOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) int { return v.ActiveAging }).(pulumi.IntOutput)
}

// The description of the flow log.
func (o GetSmartagFlowLogsLogOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) string { return v.Description }).(pulumi.StringOutput)
}

// The ID of the flow log.
func (o GetSmartagFlowLogsLogOutput) FlowLogId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) string { return v.FlowLogId }).(pulumi.StringOutput)
}

// The name of the flow log.
func (o GetSmartagFlowLogsLogOutput) FlowLogName() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) string { return v.FlowLogName }).(pulumi.StringOutput)
}

// The ID of the Flow Log.
func (o GetSmartagFlowLogsLogOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) string { return v.Id }).(pulumi.StringOutput)
}

// The time interval at which log data of inactive connections is connected. Valid values: 10 to 600. Default value: 15. Unit: second.
func (o GetSmartagFlowLogsLogOutput) InactiveAging() pulumi.IntOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) int { return v.InactiveAging }).(pulumi.IntOutput)
}

// The name of the Log Service Logstore.
func (o GetSmartagFlowLogsLogOutput) LogstoreName() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) string { return v.LogstoreName }).(pulumi.StringOutput)
}

// The IP address of the NetFlow collector where the flow log is stored.
func (o GetSmartagFlowLogsLogOutput) NetflowServerIp() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) string { return v.NetflowServerIp }).(pulumi.StringOutput)
}

// The port of the NetFlow collector. Default value: 9995.
func (o GetSmartagFlowLogsLogOutput) NetflowServerPort() pulumi.IntOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) int { return v.NetflowServerPort }).(pulumi.IntOutput)
}

// The NetFlow version. Default value: V9.
func (o GetSmartagFlowLogsLogOutput) NetflowVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) string { return v.NetflowVersion }).(pulumi.StringOutput)
}

// The location where the flow log is stored. Valid values:  sls: The flow log is stored in Log Service. netflow: The flow log is stored on a NetFlow collector. all: The flow log is stored both in Log Service and on a NetFlow collector.
func (o GetSmartagFlowLogsLogOutput) OutputType() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) string { return v.OutputType }).(pulumi.StringOutput)
}

// The name of the Log Service project.
func (o GetSmartagFlowLogsLogOutput) ProjectName() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) string { return v.ProjectName }).(pulumi.StringOutput)
}

// The ID of the resource group.
func (o GetSmartagFlowLogsLogOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) string { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The ID of the region where Log Service is deployed.
func (o GetSmartagFlowLogsLogOutput) SlsRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) string { return v.SlsRegionId }).(pulumi.StringOutput)
}

// The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
func (o GetSmartagFlowLogsLogOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) string { return v.Status }).(pulumi.StringOutput)
}

// The number of Smart Access gateway (SAG) instances with which the flow log is associated.
func (o GetSmartagFlowLogsLogOutput) TotalSagNum() pulumi.IntOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsLog) int { return v.TotalSagNum }).(pulumi.IntOutput)
}

type GetSmartagFlowLogsLogArrayOutput struct{ *pulumi.OutputState }

func (GetSmartagFlowLogsLogArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetSmartagFlowLogsLog)(nil)).Elem()
}

func (o GetSmartagFlowLogsLogArrayOutput) ToGetSmartagFlowLogsLogArrayOutput() GetSmartagFlowLogsLogArrayOutput {
	return o
}

func (o GetSmartagFlowLogsLogArrayOutput) ToGetSmartagFlowLogsLogArrayOutputWithContext(ctx context.Context) GetSmartagFlowLogsLogArrayOutput {
	return o
}

func (o GetSmartagFlowLogsLogArrayOutput) Index(i pulumi.IntInput) GetSmartagFlowLogsLogOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetSmartagFlowLogsLog {
		return vs[0].([]GetSmartagFlowLogsLog)[vs[1].(int)]
	}).(GetSmartagFlowLogsLogOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GetAclsAclInput)(nil)).Elem(), GetAclsAclArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetAclsAclArrayInput)(nil)).Elem(), GetAclsAclArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetSmartagFlowLogsLogInput)(nil)).Elem(), GetSmartagFlowLogsLogArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetSmartagFlowLogsLogArrayInput)(nil)).Elem(), GetSmartagFlowLogsLogArray{})
	pulumi.RegisterOutputType(GetAclsAclOutput{})
	pulumi.RegisterOutputType(GetAclsAclArrayOutput{})
	pulumi.RegisterOutputType(GetSmartagFlowLogsLogOutput{})
	pulumi.RegisterOutputType(GetSmartagFlowLogsLogArrayOutput{})
}
