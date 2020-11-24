// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cassandra

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Cassandra dataCenter resource supports replica set dataCenters only. The Cassandra provides stable, reliable, and automatic scalable database services.
// It offers a full range of database solutions, such as disaster recovery, backup, recovery, monitoring, and alarms.
// You can see detail product introduction [here](https://www.alibabacloud.com/help/product/49055.htm).
//
// > **NOTE:**  Available in 1.88.0+.
//
// > **NOTE:**  Create a cassandra dataCenter need a clusterId,so need create a cassandra cluster first.
//
// > **NOTE:**  The following regions support create Vpc network Cassandra cluster.
// The official website mark  more regions. Or you can call [DescribeRegions](https://help.aliyun.com/document_detail/157540.html).
//
// > **NOTE:**  Create Cassandra dataCenter or change dataCenter type and storage would cost 30 minutes. Please make full preparation.
//
// ## Example Usage
// ### Create a cassandra dataCenter
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/cassandra"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		defaultCluster, err := cassandra.NewCluster(ctx, "defaultCluster", &cassandra.ClusterArgs{
// 			ClusterName:       pulumi.String("cassandra-cluster-name-tf"),
// 			DataCenterName:    pulumi.String("dc-1"),
// 			AutoRenew:         pulumi.Bool(false),
// 			InstanceType:      pulumi.String("cassandra.c.large"),
// 			MajorVersion:      pulumi.String("3.11"),
// 			NodeCount:         pulumi.Int(2),
// 			PayType:           pulumi.String("PayAsYouGo"),
// 			VswitchId:         pulumi.String("vsw-xxxx1"),
// 			DiskSize:          pulumi.Int(160),
// 			DiskType:          pulumi.String("cloud_ssd"),
// 			MaintainStartTime: pulumi.String("18:00Z"),
// 			MaintainEndTime:   pulumi.String("20:00Z"),
// 			IpWhite:           pulumi.String("127.0.0.1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cassandra.NewDataCenter(ctx, "defaultDataCenter", &cassandra.DataCenterArgs{
// 			ClusterId:      defaultCluster.ID(),
// 			DataCenterName: pulumi.String("dc-2"),
// 			AutoRenew:      pulumi.Bool(false),
// 			InstanceType:   pulumi.String("cassandra.c.large"),
// 			NodeCount:      pulumi.Int(2),
// 			PayType:        pulumi.String("PayAsYouGo"),
// 			VswitchId:      pulumi.String("vsw-xxxx2"),
// 			DiskSize:       pulumi.Int(160),
// 			DiskType:       pulumi.String("cloud_ssd"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// This is a example for class netType dataCenter. You can find more detail with the examples/cassandra_data_center dir.
//
// ## Import
//
// If you need full function, please import Cassandra cluster first. Cassandra dataCenter can be imported using the dcId:clusterId, e.g.
//
// ```sh
//  $ pulumi import alicloud:cassandra/dataCenter:DataCenter dc_2 cn-shenxxxx-x:cds-wz933ryoaurxxxxx
// ```
type DataCenter struct {
	pulumi.CustomResourceState

	// Auto renew of dataCenter-2,`true` or `false`. System default to `false`, valid when payType = Subscription.
	AutoRenew pulumi.BoolPtrOutput `pulumi:"autoRenew"`
	// Period of dataCenter-2 auto renew, if auto renew is `true`, one of `1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60`, valid when payType = Subscription. Unit: month.
	AutoRenewPeriod pulumi.IntPtrOutput `pulumi:"autoRenewPeriod"`
	// Cassandra cluster id of dataCenter-2 belongs to.
	ClusterId    pulumi.StringOutput `pulumi:"clusterId"`
	DataCenterId pulumi.StringOutput `pulumi:"dataCenterId"`
	// Cassandra dataCenter-2 name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
	DataCenterName pulumi.StringPtrOutput `pulumi:"dataCenterName"`
	// User-defined Cassandra dataCenter one core node's storage space.Unit: GB. Value range:
	// - Custom storage space; value range: [160, 2000].
	// - 80-GB increments.
	DiskSize pulumi.IntPtrOutput `pulumi:"diskSize"`
	// The disk type of Cassandra dataCenter-2. Valid values are `cloudSsd`, `cloudEfficiency`, `localHddPro`, `localSsdPro`, localDisk size is fixed.
	DiskType     pulumi.StringPtrOutput `pulumi:"diskType"`
	EnablePublic pulumi.BoolPtrOutput   `pulumi:"enablePublic"`
	// Instance specification. See [Instance specifications](https://help.aliyun.com/document_detail/157445.html). Or you can call describeInstanceType api.
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// The node count of Cassandra dataCenter-2, default to 2.
	NodeCount pulumi.IntOutput `pulumi:"nodeCount"`
	// The pay type of Cassandra dataCenter-2. Valid values are `Subscription`, `PayAsYouGo`. System default to `PayAsYouGo`.
	PayType      pulumi.StringOutput      `pulumi:"payType"`
	Period       pulumi.IntPtrOutput      `pulumi:"period"`
	PeriodUnit   pulumi.StringPtrOutput   `pulumi:"periodUnit"`
	PublicPoints pulumi.StringArrayOutput `pulumi:"publicPoints"`
	Status       pulumi.StringOutput      `pulumi:"status"`
	// The vswitchId of dataCenter-2, mast different of vswitch_id(dc-1), can not empty.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
	// The Zone to launch the Cassandra dataCenter-2. If vswitchId is not empty, this zoneId can be "" or consistent.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewDataCenter registers a new resource with the given unique name, arguments, and options.
func NewDataCenter(ctx *pulumi.Context,
	name string, args *DataCenterArgs, opts ...pulumi.ResourceOption) (*DataCenter, error) {
	if args == nil || args.ClusterId == nil {
		return nil, errors.New("missing required argument 'ClusterId'")
	}
	if args == nil || args.InstanceType == nil {
		return nil, errors.New("missing required argument 'InstanceType'")
	}
	if args == nil || args.NodeCount == nil {
		return nil, errors.New("missing required argument 'NodeCount'")
	}
	if args == nil || args.PayType == nil {
		return nil, errors.New("missing required argument 'PayType'")
	}
	if args == nil || args.VswitchId == nil {
		return nil, errors.New("missing required argument 'VswitchId'")
	}
	if args == nil {
		args = &DataCenterArgs{}
	}
	var resource DataCenter
	err := ctx.RegisterResource("alicloud:cassandra/dataCenter:DataCenter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDataCenter gets an existing DataCenter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDataCenter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DataCenterState, opts ...pulumi.ResourceOption) (*DataCenter, error) {
	var resource DataCenter
	err := ctx.ReadResource("alicloud:cassandra/dataCenter:DataCenter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DataCenter resources.
type dataCenterState struct {
	// Auto renew of dataCenter-2,`true` or `false`. System default to `false`, valid when payType = Subscription.
	AutoRenew *bool `pulumi:"autoRenew"`
	// Period of dataCenter-2 auto renew, if auto renew is `true`, one of `1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60`, valid when payType = Subscription. Unit: month.
	AutoRenewPeriod *int `pulumi:"autoRenewPeriod"`
	// Cassandra cluster id of dataCenter-2 belongs to.
	ClusterId    *string `pulumi:"clusterId"`
	DataCenterId *string `pulumi:"dataCenterId"`
	// Cassandra dataCenter-2 name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
	DataCenterName *string `pulumi:"dataCenterName"`
	// User-defined Cassandra dataCenter one core node's storage space.Unit: GB. Value range:
	// - Custom storage space; value range: [160, 2000].
	// - 80-GB increments.
	DiskSize *int `pulumi:"diskSize"`
	// The disk type of Cassandra dataCenter-2. Valid values are `cloudSsd`, `cloudEfficiency`, `localHddPro`, `localSsdPro`, localDisk size is fixed.
	DiskType     *string `pulumi:"diskType"`
	EnablePublic *bool   `pulumi:"enablePublic"`
	// Instance specification. See [Instance specifications](https://help.aliyun.com/document_detail/157445.html). Or you can call describeInstanceType api.
	InstanceType *string `pulumi:"instanceType"`
	// The node count of Cassandra dataCenter-2, default to 2.
	NodeCount *int `pulumi:"nodeCount"`
	// The pay type of Cassandra dataCenter-2. Valid values are `Subscription`, `PayAsYouGo`. System default to `PayAsYouGo`.
	PayType      *string  `pulumi:"payType"`
	Period       *int     `pulumi:"period"`
	PeriodUnit   *string  `pulumi:"periodUnit"`
	PublicPoints []string `pulumi:"publicPoints"`
	Status       *string  `pulumi:"status"`
	// The vswitchId of dataCenter-2, mast different of vswitch_id(dc-1), can not empty.
	VswitchId *string `pulumi:"vswitchId"`
	// The Zone to launch the Cassandra dataCenter-2. If vswitchId is not empty, this zoneId can be "" or consistent.
	ZoneId *string `pulumi:"zoneId"`
}

type DataCenterState struct {
	// Auto renew of dataCenter-2,`true` or `false`. System default to `false`, valid when payType = Subscription.
	AutoRenew pulumi.BoolPtrInput
	// Period of dataCenter-2 auto renew, if auto renew is `true`, one of `1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60`, valid when payType = Subscription. Unit: month.
	AutoRenewPeriod pulumi.IntPtrInput
	// Cassandra cluster id of dataCenter-2 belongs to.
	ClusterId    pulumi.StringPtrInput
	DataCenterId pulumi.StringPtrInput
	// Cassandra dataCenter-2 name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
	DataCenterName pulumi.StringPtrInput
	// User-defined Cassandra dataCenter one core node's storage space.Unit: GB. Value range:
	// - Custom storage space; value range: [160, 2000].
	// - 80-GB increments.
	DiskSize pulumi.IntPtrInput
	// The disk type of Cassandra dataCenter-2. Valid values are `cloudSsd`, `cloudEfficiency`, `localHddPro`, `localSsdPro`, localDisk size is fixed.
	DiskType     pulumi.StringPtrInput
	EnablePublic pulumi.BoolPtrInput
	// Instance specification. See [Instance specifications](https://help.aliyun.com/document_detail/157445.html). Or you can call describeInstanceType api.
	InstanceType pulumi.StringPtrInput
	// The node count of Cassandra dataCenter-2, default to 2.
	NodeCount pulumi.IntPtrInput
	// The pay type of Cassandra dataCenter-2. Valid values are `Subscription`, `PayAsYouGo`. System default to `PayAsYouGo`.
	PayType      pulumi.StringPtrInput
	Period       pulumi.IntPtrInput
	PeriodUnit   pulumi.StringPtrInput
	PublicPoints pulumi.StringArrayInput
	Status       pulumi.StringPtrInput
	// The vswitchId of dataCenter-2, mast different of vswitch_id(dc-1), can not empty.
	VswitchId pulumi.StringPtrInput
	// The Zone to launch the Cassandra dataCenter-2. If vswitchId is not empty, this zoneId can be "" or consistent.
	ZoneId pulumi.StringPtrInput
}

func (DataCenterState) ElementType() reflect.Type {
	return reflect.TypeOf((*dataCenterState)(nil)).Elem()
}

type dataCenterArgs struct {
	// Auto renew of dataCenter-2,`true` or `false`. System default to `false`, valid when payType = Subscription.
	AutoRenew *bool `pulumi:"autoRenew"`
	// Period of dataCenter-2 auto renew, if auto renew is `true`, one of `1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60`, valid when payType = Subscription. Unit: month.
	AutoRenewPeriod *int `pulumi:"autoRenewPeriod"`
	// Cassandra cluster id of dataCenter-2 belongs to.
	ClusterId string `pulumi:"clusterId"`
	// Cassandra dataCenter-2 name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
	DataCenterName *string `pulumi:"dataCenterName"`
	// User-defined Cassandra dataCenter one core node's storage space.Unit: GB. Value range:
	// - Custom storage space; value range: [160, 2000].
	// - 80-GB increments.
	DiskSize *int `pulumi:"diskSize"`
	// The disk type of Cassandra dataCenter-2. Valid values are `cloudSsd`, `cloudEfficiency`, `localHddPro`, `localSsdPro`, localDisk size is fixed.
	DiskType     *string `pulumi:"diskType"`
	EnablePublic *bool   `pulumi:"enablePublic"`
	// Instance specification. See [Instance specifications](https://help.aliyun.com/document_detail/157445.html). Or you can call describeInstanceType api.
	InstanceType string `pulumi:"instanceType"`
	// The node count of Cassandra dataCenter-2, default to 2.
	NodeCount int `pulumi:"nodeCount"`
	// The pay type of Cassandra dataCenter-2. Valid values are `Subscription`, `PayAsYouGo`. System default to `PayAsYouGo`.
	PayType    string  `pulumi:"payType"`
	Period     *int    `pulumi:"period"`
	PeriodUnit *string `pulumi:"periodUnit"`
	// The vswitchId of dataCenter-2, mast different of vswitch_id(dc-1), can not empty.
	VswitchId string `pulumi:"vswitchId"`
	// The Zone to launch the Cassandra dataCenter-2. If vswitchId is not empty, this zoneId can be "" or consistent.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a DataCenter resource.
type DataCenterArgs struct {
	// Auto renew of dataCenter-2,`true` or `false`. System default to `false`, valid when payType = Subscription.
	AutoRenew pulumi.BoolPtrInput
	// Period of dataCenter-2 auto renew, if auto renew is `true`, one of `1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 60`, valid when payType = Subscription. Unit: month.
	AutoRenewPeriod pulumi.IntPtrInput
	// Cassandra cluster id of dataCenter-2 belongs to.
	ClusterId pulumi.StringInput
	// Cassandra dataCenter-2 name. Length must be 2~128 characters long. Only Chinese characters, English letters, numbers, period `.`, underline `_`, or dash `-` are permitted.
	DataCenterName pulumi.StringPtrInput
	// User-defined Cassandra dataCenter one core node's storage space.Unit: GB. Value range:
	// - Custom storage space; value range: [160, 2000].
	// - 80-GB increments.
	DiskSize pulumi.IntPtrInput
	// The disk type of Cassandra dataCenter-2. Valid values are `cloudSsd`, `cloudEfficiency`, `localHddPro`, `localSsdPro`, localDisk size is fixed.
	DiskType     pulumi.StringPtrInput
	EnablePublic pulumi.BoolPtrInput
	// Instance specification. See [Instance specifications](https://help.aliyun.com/document_detail/157445.html). Or you can call describeInstanceType api.
	InstanceType pulumi.StringInput
	// The node count of Cassandra dataCenter-2, default to 2.
	NodeCount pulumi.IntInput
	// The pay type of Cassandra dataCenter-2. Valid values are `Subscription`, `PayAsYouGo`. System default to `PayAsYouGo`.
	PayType    pulumi.StringInput
	Period     pulumi.IntPtrInput
	PeriodUnit pulumi.StringPtrInput
	// The vswitchId of dataCenter-2, mast different of vswitch_id(dc-1), can not empty.
	VswitchId pulumi.StringInput
	// The Zone to launch the Cassandra dataCenter-2. If vswitchId is not empty, this zoneId can be "" or consistent.
	ZoneId pulumi.StringPtrInput
}

func (DataCenterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dataCenterArgs)(nil)).Elem()
}

type DataCenterInput interface {
	pulumi.Input

	ToDataCenterOutput() DataCenterOutput
	ToDataCenterOutputWithContext(ctx context.Context) DataCenterOutput
}

func (DataCenter) ElementType() reflect.Type {
	return reflect.TypeOf((*DataCenter)(nil)).Elem()
}

func (i DataCenter) ToDataCenterOutput() DataCenterOutput {
	return i.ToDataCenterOutputWithContext(context.Background())
}

func (i DataCenter) ToDataCenterOutputWithContext(ctx context.Context) DataCenterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataCenterOutput)
}

type DataCenterOutput struct {
	*pulumi.OutputState
}

func (DataCenterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DataCenterOutput)(nil)).Elem()
}

func (o DataCenterOutput) ToDataCenterOutput() DataCenterOutput {
	return o
}

func (o DataCenterOutput) ToDataCenterOutputWithContext(ctx context.Context) DataCenterOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(DataCenterOutput{})
}
