// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cassandra

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cassandra cluster resource supports replica set clusters only. The Cassandra provides stable, reliable, and automatic scalable database services.
// It offers a full range of database solutions, such as disaster recovery, backup, recovery, monitoring, and alarms.
// You can see detail product introduction [here](https://www.alibabacloud.com/help/product/49055.htm).
//
// > **NOTE:**  Available in 1.88.0+.
//
// > **NOTE:**  The following regions support create Vpc network Cassandra cluster.
// The official website mark more regions. Or you can call [DescribeRegions](https://help.aliyun.com/document_detail/157540.html).
//
// > **NOTE:**  Create Cassandra cluster or change cluster type and storage would cost 30 minutes. Please make full preparation.
//
// ## Example Usage
// ### Create a cassandra cluster
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cassandra"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cassandra.NewCluster(ctx, "_default", &cassandra.ClusterArgs{
// 			AutoRenew:         pulumi.Bool(false),
// 			ClusterName:       pulumi.String("cassandra-cluster-name-tf"),
// 			DataCenterName:    pulumi.String("dc-1"),
// 			DiskSize:          pulumi.Int(160),
// 			DiskType:          pulumi.String("cloud_ssd"),
// 			InstanceType:      pulumi.String("cassandra.c.large"),
// 			IpWhite:           pulumi.String("127.0.0.1"),
// 			MaintainEndTime:   pulumi.String("20:00Z"),
// 			MaintainStartTime: pulumi.String("18:00Z"),
// 			MajorVersion:      pulumi.String("3.11"),
// 			NodeCount:         pulumi.Int(2),
// 			PayType:           pulumi.String("PayAsYouGo"),
// 			VswitchId:         pulumi.String("vsw-xxxx"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// This is a example for class netType cluster. You can find more detail with the examples/cassandra_cluster dir.
//
// ## Import
//
// Cassandra cluster can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:cassandra/cluster:Cluster example cds-wz9sr400dd7xxxxx
// ```
type Cluster struct {
	pulumi.CustomResourceState

	// Auto renew of dataCenter-1,`true` or `false`. System default to `false`, valid when payType = PrePaid.
	AutoRenew pulumi.BoolPtrOutput `pulumi:"autoRenew"`
	// Period of dataCenter-1 auto renew, if auto renew is `true`, one of `1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60`, valid when payType = Subscription. Unit: month.
	AutoRenewPeriod pulumi.IntPtrOutput `pulumi:"autoRenewPeriod"`
	// Cassandra cluster name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
	ClusterName pulumi.StringPtrOutput `pulumi:"clusterName"`
	// Cassandra dataCenter-1 name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
	DataCenterName pulumi.StringPtrOutput `pulumi:"dataCenterName"`
	// User-defined Cassandra dataCenter-1 one node's storage space.Unit: GB. Value range:
	// - Custom storage space; value range: [160, 2000].
	// - 80-GB increments.
	DiskSize pulumi.IntPtrOutput `pulumi:"diskSize"`
	// The disk type of Cassandra dataCenter-1. Valid values are `cloudSsd`, `cloudEfficiency`, `localHddPro`, `localSsdPro`, localDisk size is fixed.
	DiskType     pulumi.StringPtrOutput `pulumi:"diskType"`
	EnablePublic pulumi.BoolPtrOutput   `pulumi:"enablePublic"`
	// Instance specification. See [Instance specifications](https://help.aliyun.com/document_detail/157445.html). Or you can call describeInstanceType api.
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// Set the instance's IP whitelist in VPC network.
	IpWhite pulumi.StringOutput `pulumi:"ipWhite"`
	// The end time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
	MaintainEndTime pulumi.StringPtrOutput `pulumi:"maintainEndTime"`
	// The start time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
	MaintainStartTime pulumi.StringPtrOutput `pulumi:"maintainStartTime"`
	// Cassandra major version. Now only support version `3.11`.
	MajorVersion pulumi.StringOutput `pulumi:"majorVersion"`
	// The node count of Cassandra dataCenter-1 default to 2.
	NodeCount pulumi.IntOutput       `pulumi:"nodeCount"`
	Password  pulumi.StringPtrOutput `pulumi:"password"`
	// The pay type of Cassandra dataCenter-1. Valid values are `Subscription`, `PayAsYouGo`,System default to `PayAsYouGo`.
	PayType      pulumi.StringOutput      `pulumi:"payType"`
	Period       pulumi.IntPtrOutput      `pulumi:"period"`
	PeriodUnit   pulumi.StringPtrOutput   `pulumi:"periodUnit"`
	PublicPoints pulumi.StringArrayOutput `pulumi:"publicPoints"`
	// A list of security group ids to associate with.
	SecurityGroups pulumi.StringArrayOutput `pulumi:"securityGroups"`
	Status         pulumi.StringOutput      `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The vswitchId of dataCenter-1, can not empty.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
	// The Zone to launch the Cassandra cluster. If vswitchId is not empty, this zoneId can be "" or consistent.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewCluster registers a new resource with the given unique name, arguments, and options.
func NewCluster(ctx *pulumi.Context,
	name string, args *ClusterArgs, opts ...pulumi.ResourceOption) (*Cluster, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceType == nil {
		return nil, errors.New("invalid value for required argument 'InstanceType'")
	}
	if args.MajorVersion == nil {
		return nil, errors.New("invalid value for required argument 'MajorVersion'")
	}
	if args.NodeCount == nil {
		return nil, errors.New("invalid value for required argument 'NodeCount'")
	}
	if args.PayType == nil {
		return nil, errors.New("invalid value for required argument 'PayType'")
	}
	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	var resource Cluster
	err := ctx.RegisterResource("alicloud:cassandra/cluster:Cluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCluster gets an existing Cluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterState, opts ...pulumi.ResourceOption) (*Cluster, error) {
	var resource Cluster
	err := ctx.ReadResource("alicloud:cassandra/cluster:Cluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Cluster resources.
type clusterState struct {
	// Auto renew of dataCenter-1,`true` or `false`. System default to `false`, valid when payType = PrePaid.
	AutoRenew *bool `pulumi:"autoRenew"`
	// Period of dataCenter-1 auto renew, if auto renew is `true`, one of `1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60`, valid when payType = Subscription. Unit: month.
	AutoRenewPeriod *int `pulumi:"autoRenewPeriod"`
	// Cassandra cluster name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
	ClusterName *string `pulumi:"clusterName"`
	// Cassandra dataCenter-1 name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
	DataCenterName *string `pulumi:"dataCenterName"`
	// User-defined Cassandra dataCenter-1 one node's storage space.Unit: GB. Value range:
	// - Custom storage space; value range: [160, 2000].
	// - 80-GB increments.
	DiskSize *int `pulumi:"diskSize"`
	// The disk type of Cassandra dataCenter-1. Valid values are `cloudSsd`, `cloudEfficiency`, `localHddPro`, `localSsdPro`, localDisk size is fixed.
	DiskType     *string `pulumi:"diskType"`
	EnablePublic *bool   `pulumi:"enablePublic"`
	// Instance specification. See [Instance specifications](https://help.aliyun.com/document_detail/157445.html). Or you can call describeInstanceType api.
	InstanceType *string `pulumi:"instanceType"`
	// Set the instance's IP whitelist in VPC network.
	IpWhite *string `pulumi:"ipWhite"`
	// The end time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
	MaintainEndTime *string `pulumi:"maintainEndTime"`
	// The start time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
	MaintainStartTime *string `pulumi:"maintainStartTime"`
	// Cassandra major version. Now only support version `3.11`.
	MajorVersion *string `pulumi:"majorVersion"`
	// The node count of Cassandra dataCenter-1 default to 2.
	NodeCount *int    `pulumi:"nodeCount"`
	Password  *string `pulumi:"password"`
	// The pay type of Cassandra dataCenter-1. Valid values are `Subscription`, `PayAsYouGo`,System default to `PayAsYouGo`.
	PayType      *string  `pulumi:"payType"`
	Period       *int     `pulumi:"period"`
	PeriodUnit   *string  `pulumi:"periodUnit"`
	PublicPoints []string `pulumi:"publicPoints"`
	// A list of security group ids to associate with.
	SecurityGroups []string `pulumi:"securityGroups"`
	Status         *string  `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The vswitchId of dataCenter-1, can not empty.
	VswitchId *string `pulumi:"vswitchId"`
	// The Zone to launch the Cassandra cluster. If vswitchId is not empty, this zoneId can be "" or consistent.
	ZoneId *string `pulumi:"zoneId"`
}

type ClusterState struct {
	// Auto renew of dataCenter-1,`true` or `false`. System default to `false`, valid when payType = PrePaid.
	AutoRenew pulumi.BoolPtrInput
	// Period of dataCenter-1 auto renew, if auto renew is `true`, one of `1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60`, valid when payType = Subscription. Unit: month.
	AutoRenewPeriod pulumi.IntPtrInput
	// Cassandra cluster name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
	ClusterName pulumi.StringPtrInput
	// Cassandra dataCenter-1 name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
	DataCenterName pulumi.StringPtrInput
	// User-defined Cassandra dataCenter-1 one node's storage space.Unit: GB. Value range:
	// - Custom storage space; value range: [160, 2000].
	// - 80-GB increments.
	DiskSize pulumi.IntPtrInput
	// The disk type of Cassandra dataCenter-1. Valid values are `cloudSsd`, `cloudEfficiency`, `localHddPro`, `localSsdPro`, localDisk size is fixed.
	DiskType     pulumi.StringPtrInput
	EnablePublic pulumi.BoolPtrInput
	// Instance specification. See [Instance specifications](https://help.aliyun.com/document_detail/157445.html). Or you can call describeInstanceType api.
	InstanceType pulumi.StringPtrInput
	// Set the instance's IP whitelist in VPC network.
	IpWhite pulumi.StringPtrInput
	// The end time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
	MaintainEndTime pulumi.StringPtrInput
	// The start time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
	MaintainStartTime pulumi.StringPtrInput
	// Cassandra major version. Now only support version `3.11`.
	MajorVersion pulumi.StringPtrInput
	// The node count of Cassandra dataCenter-1 default to 2.
	NodeCount pulumi.IntPtrInput
	Password  pulumi.StringPtrInput
	// The pay type of Cassandra dataCenter-1. Valid values are `Subscription`, `PayAsYouGo`,System default to `PayAsYouGo`.
	PayType      pulumi.StringPtrInput
	Period       pulumi.IntPtrInput
	PeriodUnit   pulumi.StringPtrInput
	PublicPoints pulumi.StringArrayInput
	// A list of security group ids to associate with.
	SecurityGroups pulumi.StringArrayInput
	Status         pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The vswitchId of dataCenter-1, can not empty.
	VswitchId pulumi.StringPtrInput
	// The Zone to launch the Cassandra cluster. If vswitchId is not empty, this zoneId can be "" or consistent.
	ZoneId pulumi.StringPtrInput
}

func (ClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterState)(nil)).Elem()
}

type clusterArgs struct {
	// Auto renew of dataCenter-1,`true` or `false`. System default to `false`, valid when payType = PrePaid.
	AutoRenew *bool `pulumi:"autoRenew"`
	// Period of dataCenter-1 auto renew, if auto renew is `true`, one of `1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60`, valid when payType = Subscription. Unit: month.
	AutoRenewPeriod *int `pulumi:"autoRenewPeriod"`
	// Cassandra cluster name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
	ClusterName *string `pulumi:"clusterName"`
	// Cassandra dataCenter-1 name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
	DataCenterName *string `pulumi:"dataCenterName"`
	// User-defined Cassandra dataCenter-1 one node's storage space.Unit: GB. Value range:
	// - Custom storage space; value range: [160, 2000].
	// - 80-GB increments.
	DiskSize *int `pulumi:"diskSize"`
	// The disk type of Cassandra dataCenter-1. Valid values are `cloudSsd`, `cloudEfficiency`, `localHddPro`, `localSsdPro`, localDisk size is fixed.
	DiskType     *string `pulumi:"diskType"`
	EnablePublic *bool   `pulumi:"enablePublic"`
	// Instance specification. See [Instance specifications](https://help.aliyun.com/document_detail/157445.html). Or you can call describeInstanceType api.
	InstanceType string `pulumi:"instanceType"`
	// Set the instance's IP whitelist in VPC network.
	IpWhite *string `pulumi:"ipWhite"`
	// The end time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
	MaintainEndTime *string `pulumi:"maintainEndTime"`
	// The start time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
	MaintainStartTime *string `pulumi:"maintainStartTime"`
	// Cassandra major version. Now only support version `3.11`.
	MajorVersion string `pulumi:"majorVersion"`
	// The node count of Cassandra dataCenter-1 default to 2.
	NodeCount int     `pulumi:"nodeCount"`
	Password  *string `pulumi:"password"`
	// The pay type of Cassandra dataCenter-1. Valid values are `Subscription`, `PayAsYouGo`,System default to `PayAsYouGo`.
	PayType    string  `pulumi:"payType"`
	Period     *int    `pulumi:"period"`
	PeriodUnit *string `pulumi:"periodUnit"`
	// A list of security group ids to associate with.
	SecurityGroups []string `pulumi:"securityGroups"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The vswitchId of dataCenter-1, can not empty.
	VswitchId string `pulumi:"vswitchId"`
	// The Zone to launch the Cassandra cluster. If vswitchId is not empty, this zoneId can be "" or consistent.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a Cluster resource.
type ClusterArgs struct {
	// Auto renew of dataCenter-1,`true` or `false`. System default to `false`, valid when payType = PrePaid.
	AutoRenew pulumi.BoolPtrInput
	// Period of dataCenter-1 auto renew, if auto renew is `true`, one of `1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60`, valid when payType = Subscription. Unit: month.
	AutoRenewPeriod pulumi.IntPtrInput
	// Cassandra cluster name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
	ClusterName pulumi.StringPtrInput
	// Cassandra dataCenter-1 name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
	DataCenterName pulumi.StringPtrInput
	// User-defined Cassandra dataCenter-1 one node's storage space.Unit: GB. Value range:
	// - Custom storage space; value range: [160, 2000].
	// - 80-GB increments.
	DiskSize pulumi.IntPtrInput
	// The disk type of Cassandra dataCenter-1. Valid values are `cloudSsd`, `cloudEfficiency`, `localHddPro`, `localSsdPro`, localDisk size is fixed.
	DiskType     pulumi.StringPtrInput
	EnablePublic pulumi.BoolPtrInput
	// Instance specification. See [Instance specifications](https://help.aliyun.com/document_detail/157445.html). Or you can call describeInstanceType api.
	InstanceType pulumi.StringInput
	// Set the instance's IP whitelist in VPC network.
	IpWhite pulumi.StringPtrInput
	// The end time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
	MaintainEndTime pulumi.StringPtrInput
	// The start time of the operation and maintenance time period of the cluster, in the format of HH:mmZ (UTC time).
	MaintainStartTime pulumi.StringPtrInput
	// Cassandra major version. Now only support version `3.11`.
	MajorVersion pulumi.StringInput
	// The node count of Cassandra dataCenter-1 default to 2.
	NodeCount pulumi.IntInput
	Password  pulumi.StringPtrInput
	// The pay type of Cassandra dataCenter-1. Valid values are `Subscription`, `PayAsYouGo`,System default to `PayAsYouGo`.
	PayType    pulumi.StringInput
	Period     pulumi.IntPtrInput
	PeriodUnit pulumi.StringPtrInput
	// A list of security group ids to associate with.
	SecurityGroups pulumi.StringArrayInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The vswitchId of dataCenter-1, can not empty.
	VswitchId pulumi.StringInput
	// The Zone to launch the Cassandra cluster. If vswitchId is not empty, this zoneId can be "" or consistent.
	ZoneId pulumi.StringPtrInput
}

func (ClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterArgs)(nil)).Elem()
}

type ClusterInput interface {
	pulumi.Input

	ToClusterOutput() ClusterOutput
	ToClusterOutputWithContext(ctx context.Context) ClusterOutput
}

func (*Cluster) ElementType() reflect.Type {
	return reflect.TypeOf((*Cluster)(nil))
}

func (i *Cluster) ToClusterOutput() ClusterOutput {
	return i.ToClusterOutputWithContext(context.Background())
}

func (i *Cluster) ToClusterOutputWithContext(ctx context.Context) ClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterOutput)
}

func (i *Cluster) ToClusterPtrOutput() ClusterPtrOutput {
	return i.ToClusterPtrOutputWithContext(context.Background())
}

func (i *Cluster) ToClusterPtrOutputWithContext(ctx context.Context) ClusterPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterPtrOutput)
}

type ClusterPtrInput interface {
	pulumi.Input

	ToClusterPtrOutput() ClusterPtrOutput
	ToClusterPtrOutputWithContext(ctx context.Context) ClusterPtrOutput
}

type clusterPtrType ClusterArgs

func (*clusterPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Cluster)(nil))
}

func (i *clusterPtrType) ToClusterPtrOutput() ClusterPtrOutput {
	return i.ToClusterPtrOutputWithContext(context.Background())
}

func (i *clusterPtrType) ToClusterPtrOutputWithContext(ctx context.Context) ClusterPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterPtrOutput)
}

// ClusterArrayInput is an input type that accepts ClusterArray and ClusterArrayOutput values.
// You can construct a concrete instance of `ClusterArrayInput` via:
//
//          ClusterArray{ ClusterArgs{...} }
type ClusterArrayInput interface {
	pulumi.Input

	ToClusterArrayOutput() ClusterArrayOutput
	ToClusterArrayOutputWithContext(context.Context) ClusterArrayOutput
}

type ClusterArray []ClusterInput

func (ClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Cluster)(nil))
}

func (i ClusterArray) ToClusterArrayOutput() ClusterArrayOutput {
	return i.ToClusterArrayOutputWithContext(context.Background())
}

func (i ClusterArray) ToClusterArrayOutputWithContext(ctx context.Context) ClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterArrayOutput)
}

// ClusterMapInput is an input type that accepts ClusterMap and ClusterMapOutput values.
// You can construct a concrete instance of `ClusterMapInput` via:
//
//          ClusterMap{ "key": ClusterArgs{...} }
type ClusterMapInput interface {
	pulumi.Input

	ToClusterMapOutput() ClusterMapOutput
	ToClusterMapOutputWithContext(context.Context) ClusterMapOutput
}

type ClusterMap map[string]ClusterInput

func (ClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Cluster)(nil))
}

func (i ClusterMap) ToClusterMapOutput() ClusterMapOutput {
	return i.ToClusterMapOutputWithContext(context.Background())
}

func (i ClusterMap) ToClusterMapOutputWithContext(ctx context.Context) ClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterMapOutput)
}

type ClusterOutput struct {
	*pulumi.OutputState
}

func (ClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Cluster)(nil))
}

func (o ClusterOutput) ToClusterOutput() ClusterOutput {
	return o
}

func (o ClusterOutput) ToClusterOutputWithContext(ctx context.Context) ClusterOutput {
	return o
}

func (o ClusterOutput) ToClusterPtrOutput() ClusterPtrOutput {
	return o.ToClusterPtrOutputWithContext(context.Background())
}

func (o ClusterOutput) ToClusterPtrOutputWithContext(ctx context.Context) ClusterPtrOutput {
	return o.ApplyT(func(v Cluster) *Cluster {
		return &v
	}).(ClusterPtrOutput)
}

type ClusterPtrOutput struct {
	*pulumi.OutputState
}

func (ClusterPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Cluster)(nil))
}

func (o ClusterPtrOutput) ToClusterPtrOutput() ClusterPtrOutput {
	return o
}

func (o ClusterPtrOutput) ToClusterPtrOutputWithContext(ctx context.Context) ClusterPtrOutput {
	return o
}

type ClusterArrayOutput struct{ *pulumi.OutputState }

func (ClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Cluster)(nil))
}

func (o ClusterArrayOutput) ToClusterArrayOutput() ClusterArrayOutput {
	return o
}

func (o ClusterArrayOutput) ToClusterArrayOutputWithContext(ctx context.Context) ClusterArrayOutput {
	return o
}

func (o ClusterArrayOutput) Index(i pulumi.IntInput) ClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Cluster {
		return vs[0].([]Cluster)[vs[1].(int)]
	}).(ClusterOutput)
}

type ClusterMapOutput struct{ *pulumi.OutputState }

func (ClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Cluster)(nil))
}

func (o ClusterMapOutput) ToClusterMapOutput() ClusterMapOutput {
	return o
}

func (o ClusterMapOutput) ToClusterMapOutputWithContext(ctx context.Context) ClusterMapOutput {
	return o
}

func (o ClusterMapOutput) MapIndex(k pulumi.StringInput) ClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Cluster {
		return vs[0].(map[string]Cluster)[vs[1].(string)]
	}).(ClusterOutput)
}

func init() {
	pulumi.RegisterOutputType(ClusterOutput{})
	pulumi.RegisterOutputType(ClusterPtrOutput{})
	pulumi.RegisterOutputType(ClusterArrayOutput{})
	pulumi.RegisterOutputType(ClusterMapOutput{})
}
