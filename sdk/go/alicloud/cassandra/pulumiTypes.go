// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cassandra

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

var _ = internal.GetEnvOrDefault

type GetBackupPlansPlan struct {
	// Specifies whether to activate the backup plan.
	Active bool `pulumi:"active"`
	// The backup cycle. Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.
	BackupPeriod string `pulumi:"backupPeriod"`
	// The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
	BackupTime string `pulumi:"backupTime"`
	// The ID of the cluster for the backup.
	ClusterId string `pulumi:"clusterId"`
	// The time when the backup plan was created.
	CreateTime string `pulumi:"createTime"`
	// The ID of the data center for the backup in the cluster.
	DataCenterId string `pulumi:"dataCenterId"`
	// The ID of the Backup Plan.
	Id string `pulumi:"id"`
	// The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days.
	RetentionPeriod int `pulumi:"retentionPeriod"`
}

// GetBackupPlansPlanInput is an input type that accepts GetBackupPlansPlanArgs and GetBackupPlansPlanOutput values.
// You can construct a concrete instance of `GetBackupPlansPlanInput` via:
//
//	GetBackupPlansPlanArgs{...}
type GetBackupPlansPlanInput interface {
	pulumi.Input

	ToGetBackupPlansPlanOutput() GetBackupPlansPlanOutput
	ToGetBackupPlansPlanOutputWithContext(context.Context) GetBackupPlansPlanOutput
}

type GetBackupPlansPlanArgs struct {
	// Specifies whether to activate the backup plan.
	Active pulumi.BoolInput `pulumi:"active"`
	// The backup cycle. Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.
	BackupPeriod pulumi.StringInput `pulumi:"backupPeriod"`
	// The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
	BackupTime pulumi.StringInput `pulumi:"backupTime"`
	// The ID of the cluster for the backup.
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// The time when the backup plan was created.
	CreateTime pulumi.StringInput `pulumi:"createTime"`
	// The ID of the data center for the backup in the cluster.
	DataCenterId pulumi.StringInput `pulumi:"dataCenterId"`
	// The ID of the Backup Plan.
	Id pulumi.StringInput `pulumi:"id"`
	// The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days.
	RetentionPeriod pulumi.IntInput `pulumi:"retentionPeriod"`
}

func (GetBackupPlansPlanArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBackupPlansPlan)(nil)).Elem()
}

func (i GetBackupPlansPlanArgs) ToGetBackupPlansPlanOutput() GetBackupPlansPlanOutput {
	return i.ToGetBackupPlansPlanOutputWithContext(context.Background())
}

func (i GetBackupPlansPlanArgs) ToGetBackupPlansPlanOutputWithContext(ctx context.Context) GetBackupPlansPlanOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetBackupPlansPlanOutput)
}

func (i GetBackupPlansPlanArgs) ToOutput(ctx context.Context) pulumix.Output[GetBackupPlansPlan] {
	return pulumix.Output[GetBackupPlansPlan]{
		OutputState: i.ToGetBackupPlansPlanOutputWithContext(ctx).OutputState,
	}
}

// GetBackupPlansPlanArrayInput is an input type that accepts GetBackupPlansPlanArray and GetBackupPlansPlanArrayOutput values.
// You can construct a concrete instance of `GetBackupPlansPlanArrayInput` via:
//
//	GetBackupPlansPlanArray{ GetBackupPlansPlanArgs{...} }
type GetBackupPlansPlanArrayInput interface {
	pulumi.Input

	ToGetBackupPlansPlanArrayOutput() GetBackupPlansPlanArrayOutput
	ToGetBackupPlansPlanArrayOutputWithContext(context.Context) GetBackupPlansPlanArrayOutput
}

type GetBackupPlansPlanArray []GetBackupPlansPlanInput

func (GetBackupPlansPlanArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetBackupPlansPlan)(nil)).Elem()
}

func (i GetBackupPlansPlanArray) ToGetBackupPlansPlanArrayOutput() GetBackupPlansPlanArrayOutput {
	return i.ToGetBackupPlansPlanArrayOutputWithContext(context.Background())
}

func (i GetBackupPlansPlanArray) ToGetBackupPlansPlanArrayOutputWithContext(ctx context.Context) GetBackupPlansPlanArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetBackupPlansPlanArrayOutput)
}

func (i GetBackupPlansPlanArray) ToOutput(ctx context.Context) pulumix.Output[[]GetBackupPlansPlan] {
	return pulumix.Output[[]GetBackupPlansPlan]{
		OutputState: i.ToGetBackupPlansPlanArrayOutputWithContext(ctx).OutputState,
	}
}

type GetBackupPlansPlanOutput struct{ *pulumi.OutputState }

func (GetBackupPlansPlanOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBackupPlansPlan)(nil)).Elem()
}

func (o GetBackupPlansPlanOutput) ToGetBackupPlansPlanOutput() GetBackupPlansPlanOutput {
	return o
}

func (o GetBackupPlansPlanOutput) ToGetBackupPlansPlanOutputWithContext(ctx context.Context) GetBackupPlansPlanOutput {
	return o
}

func (o GetBackupPlansPlanOutput) ToOutput(ctx context.Context) pulumix.Output[GetBackupPlansPlan] {
	return pulumix.Output[GetBackupPlansPlan]{
		OutputState: o.OutputState,
	}
}

// Specifies whether to activate the backup plan.
func (o GetBackupPlansPlanOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v GetBackupPlansPlan) bool { return v.Active }).(pulumi.BoolOutput)
}

// The backup cycle. Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.
func (o GetBackupPlansPlanOutput) BackupPeriod() pulumi.StringOutput {
	return o.ApplyT(func(v GetBackupPlansPlan) string { return v.BackupPeriod }).(pulumi.StringOutput)
}

// The start time of the backup task each day. The time is displayed in UTC and denoted by Z.
func (o GetBackupPlansPlanOutput) BackupTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetBackupPlansPlan) string { return v.BackupTime }).(pulumi.StringOutput)
}

// The ID of the cluster for the backup.
func (o GetBackupPlansPlanOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetBackupPlansPlan) string { return v.ClusterId }).(pulumi.StringOutput)
}

// The time when the backup plan was created.
func (o GetBackupPlansPlanOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetBackupPlansPlan) string { return v.CreateTime }).(pulumi.StringOutput)
}

// The ID of the data center for the backup in the cluster.
func (o GetBackupPlansPlanOutput) DataCenterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetBackupPlansPlan) string { return v.DataCenterId }).(pulumi.StringOutput)
}

// The ID of the Backup Plan.
func (o GetBackupPlansPlanOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBackupPlansPlan) string { return v.Id }).(pulumi.StringOutput)
}

// The duration for which you want to retain the backup. Valid values: 1 to 30. Unit: days.
func (o GetBackupPlansPlanOutput) RetentionPeriod() pulumi.IntOutput {
	return o.ApplyT(func(v GetBackupPlansPlan) int { return v.RetentionPeriod }).(pulumi.IntOutput)
}

type GetBackupPlansPlanArrayOutput struct{ *pulumi.OutputState }

func (GetBackupPlansPlanArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetBackupPlansPlan)(nil)).Elem()
}

func (o GetBackupPlansPlanArrayOutput) ToGetBackupPlansPlanArrayOutput() GetBackupPlansPlanArrayOutput {
	return o
}

func (o GetBackupPlansPlanArrayOutput) ToGetBackupPlansPlanArrayOutputWithContext(ctx context.Context) GetBackupPlansPlanArrayOutput {
	return o
}

func (o GetBackupPlansPlanArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]GetBackupPlansPlan] {
	return pulumix.Output[[]GetBackupPlansPlan]{
		OutputState: o.OutputState,
	}
}

func (o GetBackupPlansPlanArrayOutput) Index(i pulumi.IntInput) GetBackupPlansPlanOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetBackupPlansPlan {
		return vs[0].([]GetBackupPlansPlan)[vs[1].(int)]
	}).(GetBackupPlansPlanOutput)
}

type GetClustersCluster struct {
	// The ID of the Cassandra cluster.
	ClusterId string `pulumi:"clusterId"`
	// The name of the Cassandra cluster.
	ClusterName string `pulumi:"clusterName"`
	CreatedTime string `pulumi:"createdTime"`
	// The count of data centers
	DataCenterCount int `pulumi:"dataCenterCount"`
	// The expire time of the cluster.
	ExpireTime string `pulumi:"expireTime"`
	// The ID of the Cassandra cluster.
	Id string `pulumi:"id"`
	// The lock mode of the cluster.
	LockMode string `pulumi:"lockMode"`
	// The major version of the cluster.
	MajorVersion string `pulumi:"majorVersion"`
	// The minor version of the cluster.
	MinorVersion string `pulumi:"minorVersion"`
	// Billing method. Value options are `Subscription` for Pay-As-You-Go and `PayAsYouGo` for yearly or monthly subscription.
	PayType string `pulumi:"payType"`
	// Status of the cluster.
	Status string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// GetClustersClusterInput is an input type that accepts GetClustersClusterArgs and GetClustersClusterOutput values.
// You can construct a concrete instance of `GetClustersClusterInput` via:
//
//	GetClustersClusterArgs{...}
type GetClustersClusterInput interface {
	pulumi.Input

	ToGetClustersClusterOutput() GetClustersClusterOutput
	ToGetClustersClusterOutputWithContext(context.Context) GetClustersClusterOutput
}

type GetClustersClusterArgs struct {
	// The ID of the Cassandra cluster.
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// The name of the Cassandra cluster.
	ClusterName pulumi.StringInput `pulumi:"clusterName"`
	CreatedTime pulumi.StringInput `pulumi:"createdTime"`
	// The count of data centers
	DataCenterCount pulumi.IntInput `pulumi:"dataCenterCount"`
	// The expire time of the cluster.
	ExpireTime pulumi.StringInput `pulumi:"expireTime"`
	// The ID of the Cassandra cluster.
	Id pulumi.StringInput `pulumi:"id"`
	// The lock mode of the cluster.
	LockMode pulumi.StringInput `pulumi:"lockMode"`
	// The major version of the cluster.
	MajorVersion pulumi.StringInput `pulumi:"majorVersion"`
	// The minor version of the cluster.
	MinorVersion pulumi.StringInput `pulumi:"minorVersion"`
	// Billing method. Value options are `Subscription` for Pay-As-You-Go and `PayAsYouGo` for yearly or monthly subscription.
	PayType pulumi.StringInput `pulumi:"payType"`
	// Status of the cluster.
	Status pulumi.StringInput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput `pulumi:"tags"`
}

func (GetClustersClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClustersCluster)(nil)).Elem()
}

func (i GetClustersClusterArgs) ToGetClustersClusterOutput() GetClustersClusterOutput {
	return i.ToGetClustersClusterOutputWithContext(context.Background())
}

func (i GetClustersClusterArgs) ToGetClustersClusterOutputWithContext(ctx context.Context) GetClustersClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetClustersClusterOutput)
}

func (i GetClustersClusterArgs) ToOutput(ctx context.Context) pulumix.Output[GetClustersCluster] {
	return pulumix.Output[GetClustersCluster]{
		OutputState: i.ToGetClustersClusterOutputWithContext(ctx).OutputState,
	}
}

// GetClustersClusterArrayInput is an input type that accepts GetClustersClusterArray and GetClustersClusterArrayOutput values.
// You can construct a concrete instance of `GetClustersClusterArrayInput` via:
//
//	GetClustersClusterArray{ GetClustersClusterArgs{...} }
type GetClustersClusterArrayInput interface {
	pulumi.Input

	ToGetClustersClusterArrayOutput() GetClustersClusterArrayOutput
	ToGetClustersClusterArrayOutputWithContext(context.Context) GetClustersClusterArrayOutput
}

type GetClustersClusterArray []GetClustersClusterInput

func (GetClustersClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetClustersCluster)(nil)).Elem()
}

func (i GetClustersClusterArray) ToGetClustersClusterArrayOutput() GetClustersClusterArrayOutput {
	return i.ToGetClustersClusterArrayOutputWithContext(context.Background())
}

func (i GetClustersClusterArray) ToGetClustersClusterArrayOutputWithContext(ctx context.Context) GetClustersClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetClustersClusterArrayOutput)
}

func (i GetClustersClusterArray) ToOutput(ctx context.Context) pulumix.Output[[]GetClustersCluster] {
	return pulumix.Output[[]GetClustersCluster]{
		OutputState: i.ToGetClustersClusterArrayOutputWithContext(ctx).OutputState,
	}
}

type GetClustersClusterOutput struct{ *pulumi.OutputState }

func (GetClustersClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClustersCluster)(nil)).Elem()
}

func (o GetClustersClusterOutput) ToGetClustersClusterOutput() GetClustersClusterOutput {
	return o
}

func (o GetClustersClusterOutput) ToGetClustersClusterOutputWithContext(ctx context.Context) GetClustersClusterOutput {
	return o
}

func (o GetClustersClusterOutput) ToOutput(ctx context.Context) pulumix.Output[GetClustersCluster] {
	return pulumix.Output[GetClustersCluster]{
		OutputState: o.OutputState,
	}
}

// The ID of the Cassandra cluster.
func (o GetClustersClusterOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetClustersCluster) string { return v.ClusterId }).(pulumi.StringOutput)
}

// The name of the Cassandra cluster.
func (o GetClustersClusterOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v GetClustersCluster) string { return v.ClusterName }).(pulumi.StringOutput)
}

func (o GetClustersClusterOutput) CreatedTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetClustersCluster) string { return v.CreatedTime }).(pulumi.StringOutput)
}

// The count of data centers
func (o GetClustersClusterOutput) DataCenterCount() pulumi.IntOutput {
	return o.ApplyT(func(v GetClustersCluster) int { return v.DataCenterCount }).(pulumi.IntOutput)
}

// The expire time of the cluster.
func (o GetClustersClusterOutput) ExpireTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetClustersCluster) string { return v.ExpireTime }).(pulumi.StringOutput)
}

// The ID of the Cassandra cluster.
func (o GetClustersClusterOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetClustersCluster) string { return v.Id }).(pulumi.StringOutput)
}

// The lock mode of the cluster.
func (o GetClustersClusterOutput) LockMode() pulumi.StringOutput {
	return o.ApplyT(func(v GetClustersCluster) string { return v.LockMode }).(pulumi.StringOutput)
}

// The major version of the cluster.
func (o GetClustersClusterOutput) MajorVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetClustersCluster) string { return v.MajorVersion }).(pulumi.StringOutput)
}

// The minor version of the cluster.
func (o GetClustersClusterOutput) MinorVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetClustersCluster) string { return v.MinorVersion }).(pulumi.StringOutput)
}

// Billing method. Value options are `Subscription` for Pay-As-You-Go and `PayAsYouGo` for yearly or monthly subscription.
func (o GetClustersClusterOutput) PayType() pulumi.StringOutput {
	return o.ApplyT(func(v GetClustersCluster) string { return v.PayType }).(pulumi.StringOutput)
}

// Status of the cluster.
func (o GetClustersClusterOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetClustersCluster) string { return v.Status }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o GetClustersClusterOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetClustersCluster) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

type GetClustersClusterArrayOutput struct{ *pulumi.OutputState }

func (GetClustersClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetClustersCluster)(nil)).Elem()
}

func (o GetClustersClusterArrayOutput) ToGetClustersClusterArrayOutput() GetClustersClusterArrayOutput {
	return o
}

func (o GetClustersClusterArrayOutput) ToGetClustersClusterArrayOutputWithContext(ctx context.Context) GetClustersClusterArrayOutput {
	return o
}

func (o GetClustersClusterArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]GetClustersCluster] {
	return pulumix.Output[[]GetClustersCluster]{
		OutputState: o.OutputState,
	}
}

func (o GetClustersClusterArrayOutput) Index(i pulumi.IntInput) GetClustersClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetClustersCluster {
		return vs[0].([]GetClustersCluster)[vs[1].(int)]
	}).(GetClustersClusterOutput)
}

type GetDataCentersCenter struct {
	// The cluster id of dataCenters belongs to.
	ClusterId string `pulumi:"clusterId"`
	// The commodity ID of the Cassandra dataCenter.
	CommodityInstance string `pulumi:"commodityInstance"`
	CreatedTime       string `pulumi:"createdTime"`
	// The id of the Cassandra dataCenter.
	DataCenterId string `pulumi:"dataCenterId"`
	// The name of the Cassandra dataCenter.
	DataCenterName string `pulumi:"dataCenterName"`
	// One node disk size, unit:GB.
	DiskSize int `pulumi:"diskSize"`
	// Cloud_ssd or cloud_efficiency.
	DiskType string `pulumi:"diskType"`
	// The expire time of the dataCenter.
	ExpireTime string `pulumi:"expireTime"`
	// The instance type of the Cassandra dataCenter, eg: cassandra.c.large.
	InstanceType string `pulumi:"instanceType"`
	// The lock mode of the dataCenter.
	LockMode string `pulumi:"lockMode"`
	// The node count of dataCenter.
	NodeCount int `pulumi:"nodeCount"`
	// Billing method. Value options are `Subscription` for Pay-As-You-Go and `PayAsYouGo` for yearly or monthly subscription.
	PayType string `pulumi:"payType"`
	// Status of the dataCenter.
	Status string `pulumi:"status"`
	// VPC ID the dataCenter belongs to.
	VpcId string `pulumi:"vpcId"`
	// VSwitch ID the dataCenter belongs to.
	VswitchId string `pulumi:"vswitchId"`
	// Zone ID the dataCenter belongs to.
	ZoneId string `pulumi:"zoneId"`
}

// GetDataCentersCenterInput is an input type that accepts GetDataCentersCenterArgs and GetDataCentersCenterOutput values.
// You can construct a concrete instance of `GetDataCentersCenterInput` via:
//
//	GetDataCentersCenterArgs{...}
type GetDataCentersCenterInput interface {
	pulumi.Input

	ToGetDataCentersCenterOutput() GetDataCentersCenterOutput
	ToGetDataCentersCenterOutputWithContext(context.Context) GetDataCentersCenterOutput
}

type GetDataCentersCenterArgs struct {
	// The cluster id of dataCenters belongs to.
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// The commodity ID of the Cassandra dataCenter.
	CommodityInstance pulumi.StringInput `pulumi:"commodityInstance"`
	CreatedTime       pulumi.StringInput `pulumi:"createdTime"`
	// The id of the Cassandra dataCenter.
	DataCenterId pulumi.StringInput `pulumi:"dataCenterId"`
	// The name of the Cassandra dataCenter.
	DataCenterName pulumi.StringInput `pulumi:"dataCenterName"`
	// One node disk size, unit:GB.
	DiskSize pulumi.IntInput `pulumi:"diskSize"`
	// Cloud_ssd or cloud_efficiency.
	DiskType pulumi.StringInput `pulumi:"diskType"`
	// The expire time of the dataCenter.
	ExpireTime pulumi.StringInput `pulumi:"expireTime"`
	// The instance type of the Cassandra dataCenter, eg: cassandra.c.large.
	InstanceType pulumi.StringInput `pulumi:"instanceType"`
	// The lock mode of the dataCenter.
	LockMode pulumi.StringInput `pulumi:"lockMode"`
	// The node count of dataCenter.
	NodeCount pulumi.IntInput `pulumi:"nodeCount"`
	// Billing method. Value options are `Subscription` for Pay-As-You-Go and `PayAsYouGo` for yearly or monthly subscription.
	PayType pulumi.StringInput `pulumi:"payType"`
	// Status of the dataCenter.
	Status pulumi.StringInput `pulumi:"status"`
	// VPC ID the dataCenter belongs to.
	VpcId pulumi.StringInput `pulumi:"vpcId"`
	// VSwitch ID the dataCenter belongs to.
	VswitchId pulumi.StringInput `pulumi:"vswitchId"`
	// Zone ID the dataCenter belongs to.
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
}

func (GetDataCentersCenterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDataCentersCenter)(nil)).Elem()
}

func (i GetDataCentersCenterArgs) ToGetDataCentersCenterOutput() GetDataCentersCenterOutput {
	return i.ToGetDataCentersCenterOutputWithContext(context.Background())
}

func (i GetDataCentersCenterArgs) ToGetDataCentersCenterOutputWithContext(ctx context.Context) GetDataCentersCenterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetDataCentersCenterOutput)
}

func (i GetDataCentersCenterArgs) ToOutput(ctx context.Context) pulumix.Output[GetDataCentersCenter] {
	return pulumix.Output[GetDataCentersCenter]{
		OutputState: i.ToGetDataCentersCenterOutputWithContext(ctx).OutputState,
	}
}

// GetDataCentersCenterArrayInput is an input type that accepts GetDataCentersCenterArray and GetDataCentersCenterArrayOutput values.
// You can construct a concrete instance of `GetDataCentersCenterArrayInput` via:
//
//	GetDataCentersCenterArray{ GetDataCentersCenterArgs{...} }
type GetDataCentersCenterArrayInput interface {
	pulumi.Input

	ToGetDataCentersCenterArrayOutput() GetDataCentersCenterArrayOutput
	ToGetDataCentersCenterArrayOutputWithContext(context.Context) GetDataCentersCenterArrayOutput
}

type GetDataCentersCenterArray []GetDataCentersCenterInput

func (GetDataCentersCenterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetDataCentersCenter)(nil)).Elem()
}

func (i GetDataCentersCenterArray) ToGetDataCentersCenterArrayOutput() GetDataCentersCenterArrayOutput {
	return i.ToGetDataCentersCenterArrayOutputWithContext(context.Background())
}

func (i GetDataCentersCenterArray) ToGetDataCentersCenterArrayOutputWithContext(ctx context.Context) GetDataCentersCenterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetDataCentersCenterArrayOutput)
}

func (i GetDataCentersCenterArray) ToOutput(ctx context.Context) pulumix.Output[[]GetDataCentersCenter] {
	return pulumix.Output[[]GetDataCentersCenter]{
		OutputState: i.ToGetDataCentersCenterArrayOutputWithContext(ctx).OutputState,
	}
}

type GetDataCentersCenterOutput struct{ *pulumi.OutputState }

func (GetDataCentersCenterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDataCentersCenter)(nil)).Elem()
}

func (o GetDataCentersCenterOutput) ToGetDataCentersCenterOutput() GetDataCentersCenterOutput {
	return o
}

func (o GetDataCentersCenterOutput) ToGetDataCentersCenterOutputWithContext(ctx context.Context) GetDataCentersCenterOutput {
	return o
}

func (o GetDataCentersCenterOutput) ToOutput(ctx context.Context) pulumix.Output[GetDataCentersCenter] {
	return pulumix.Output[GetDataCentersCenter]{
		OutputState: o.OutputState,
	}
}

// The cluster id of dataCenters belongs to.
func (o GetDataCentersCenterOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataCentersCenter) string { return v.ClusterId }).(pulumi.StringOutput)
}

// The commodity ID of the Cassandra dataCenter.
func (o GetDataCentersCenterOutput) CommodityInstance() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataCentersCenter) string { return v.CommodityInstance }).(pulumi.StringOutput)
}

func (o GetDataCentersCenterOutput) CreatedTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataCentersCenter) string { return v.CreatedTime }).(pulumi.StringOutput)
}

// The id of the Cassandra dataCenter.
func (o GetDataCentersCenterOutput) DataCenterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataCentersCenter) string { return v.DataCenterId }).(pulumi.StringOutput)
}

// The name of the Cassandra dataCenter.
func (o GetDataCentersCenterOutput) DataCenterName() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataCentersCenter) string { return v.DataCenterName }).(pulumi.StringOutput)
}

// One node disk size, unit:GB.
func (o GetDataCentersCenterOutput) DiskSize() pulumi.IntOutput {
	return o.ApplyT(func(v GetDataCentersCenter) int { return v.DiskSize }).(pulumi.IntOutput)
}

// Cloud_ssd or cloud_efficiency.
func (o GetDataCentersCenterOutput) DiskType() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataCentersCenter) string { return v.DiskType }).(pulumi.StringOutput)
}

// The expire time of the dataCenter.
func (o GetDataCentersCenterOutput) ExpireTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataCentersCenter) string { return v.ExpireTime }).(pulumi.StringOutput)
}

// The instance type of the Cassandra dataCenter, eg: cassandra.c.large.
func (o GetDataCentersCenterOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataCentersCenter) string { return v.InstanceType }).(pulumi.StringOutput)
}

// The lock mode of the dataCenter.
func (o GetDataCentersCenterOutput) LockMode() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataCentersCenter) string { return v.LockMode }).(pulumi.StringOutput)
}

// The node count of dataCenter.
func (o GetDataCentersCenterOutput) NodeCount() pulumi.IntOutput {
	return o.ApplyT(func(v GetDataCentersCenter) int { return v.NodeCount }).(pulumi.IntOutput)
}

// Billing method. Value options are `Subscription` for Pay-As-You-Go and `PayAsYouGo` for yearly or monthly subscription.
func (o GetDataCentersCenterOutput) PayType() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataCentersCenter) string { return v.PayType }).(pulumi.StringOutput)
}

// Status of the dataCenter.
func (o GetDataCentersCenterOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataCentersCenter) string { return v.Status }).(pulumi.StringOutput)
}

// VPC ID the dataCenter belongs to.
func (o GetDataCentersCenterOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataCentersCenter) string { return v.VpcId }).(pulumi.StringOutput)
}

// VSwitch ID the dataCenter belongs to.
func (o GetDataCentersCenterOutput) VswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataCentersCenter) string { return v.VswitchId }).(pulumi.StringOutput)
}

// Zone ID the dataCenter belongs to.
func (o GetDataCentersCenterOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataCentersCenter) string { return v.ZoneId }).(pulumi.StringOutput)
}

type GetDataCentersCenterArrayOutput struct{ *pulumi.OutputState }

func (GetDataCentersCenterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetDataCentersCenter)(nil)).Elem()
}

func (o GetDataCentersCenterArrayOutput) ToGetDataCentersCenterArrayOutput() GetDataCentersCenterArrayOutput {
	return o
}

func (o GetDataCentersCenterArrayOutput) ToGetDataCentersCenterArrayOutputWithContext(ctx context.Context) GetDataCentersCenterArrayOutput {
	return o
}

func (o GetDataCentersCenterArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]GetDataCentersCenter] {
	return pulumix.Output[[]GetDataCentersCenter]{
		OutputState: o.OutputState,
	}
}

func (o GetDataCentersCenterArrayOutput) Index(i pulumi.IntInput) GetDataCentersCenterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetDataCentersCenter {
		return vs[0].([]GetDataCentersCenter)[vs[1].(int)]
	}).(GetDataCentersCenterOutput)
}

type GetZonesZone struct {
	// ID of the zone.
	Id string `pulumi:"id"`
	// A list of zone ids in which the multi zone.
	MultiZoneIds []string `pulumi:"multiZoneIds"`
}

// GetZonesZoneInput is an input type that accepts GetZonesZoneArgs and GetZonesZoneOutput values.
// You can construct a concrete instance of `GetZonesZoneInput` via:
//
//	GetZonesZoneArgs{...}
type GetZonesZoneInput interface {
	pulumi.Input

	ToGetZonesZoneOutput() GetZonesZoneOutput
	ToGetZonesZoneOutputWithContext(context.Context) GetZonesZoneOutput
}

type GetZonesZoneArgs struct {
	// ID of the zone.
	Id pulumi.StringInput `pulumi:"id"`
	// A list of zone ids in which the multi zone.
	MultiZoneIds pulumi.StringArrayInput `pulumi:"multiZoneIds"`
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

func (i GetZonesZoneArgs) ToOutput(ctx context.Context) pulumix.Output[GetZonesZone] {
	return pulumix.Output[GetZonesZone]{
		OutputState: i.ToGetZonesZoneOutputWithContext(ctx).OutputState,
	}
}

// GetZonesZoneArrayInput is an input type that accepts GetZonesZoneArray and GetZonesZoneArrayOutput values.
// You can construct a concrete instance of `GetZonesZoneArrayInput` via:
//
//	GetZonesZoneArray{ GetZonesZoneArgs{...} }
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

func (i GetZonesZoneArray) ToOutput(ctx context.Context) pulumix.Output[[]GetZonesZone] {
	return pulumix.Output[[]GetZonesZone]{
		OutputState: i.ToGetZonesZoneArrayOutputWithContext(ctx).OutputState,
	}
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

func (o GetZonesZoneOutput) ToOutput(ctx context.Context) pulumix.Output[GetZonesZone] {
	return pulumix.Output[GetZonesZone]{
		OutputState: o.OutputState,
	}
}

// ID of the zone.
func (o GetZonesZoneOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesZone) string { return v.Id }).(pulumi.StringOutput)
}

// A list of zone ids in which the multi zone.
func (o GetZonesZoneOutput) MultiZoneIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetZonesZone) []string { return v.MultiZoneIds }).(pulumi.StringArrayOutput)
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

func (o GetZonesZoneArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]GetZonesZone] {
	return pulumix.Output[[]GetZonesZone]{
		OutputState: o.OutputState,
	}
}

func (o GetZonesZoneArrayOutput) Index(i pulumi.IntInput) GetZonesZoneOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetZonesZone {
		return vs[0].([]GetZonesZone)[vs[1].(int)]
	}).(GetZonesZoneOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GetBackupPlansPlanInput)(nil)).Elem(), GetBackupPlansPlanArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetBackupPlansPlanArrayInput)(nil)).Elem(), GetBackupPlansPlanArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetClustersClusterInput)(nil)).Elem(), GetClustersClusterArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetClustersClusterArrayInput)(nil)).Elem(), GetClustersClusterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetDataCentersCenterInput)(nil)).Elem(), GetDataCentersCenterArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetDataCentersCenterArrayInput)(nil)).Elem(), GetDataCentersCenterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetZonesZoneInput)(nil)).Elem(), GetZonesZoneArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetZonesZoneArrayInput)(nil)).Elem(), GetZonesZoneArray{})
	pulumi.RegisterOutputType(GetBackupPlansPlanOutput{})
	pulumi.RegisterOutputType(GetBackupPlansPlanArrayOutput{})
	pulumi.RegisterOutputType(GetClustersClusterOutput{})
	pulumi.RegisterOutputType(GetClustersClusterArrayOutput{})
	pulumi.RegisterOutputType(GetDataCentersCenterOutput{})
	pulumi.RegisterOutputType(GetDataCentersCenterArrayOutput{})
	pulumi.RegisterOutputType(GetZonesZoneOutput{})
	pulumi.RegisterOutputType(GetZonesZoneArrayOutput{})
}
