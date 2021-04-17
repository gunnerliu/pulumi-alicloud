// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package adb

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a AnalyticDB for MySQL (ADB) DBCluster resource.
//
// For information about AnalyticDB for MySQL (ADB) DBCluster and how to use it, see [What is DBCluster](https://www.alibabacloud.com/help/en/doc-detail/190519.htm).
//
// > **NOTE:** Available in v1.121.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/adb"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		name := "adbClusterconfig"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		creation := "ADB"
// 		if param := cfg.Get("creation"); param != "" {
// 			creation = param
// 		}
// 		opt0 := creation
// 		defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
// 			AvailableResourceCreation: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
// 			VpcName:   pulumi.String(name),
// 			CidrBlock: pulumi.String("172.16.0.0/16"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
// 			VpcId:            defaultNetwork.ID(),
// 			CidrBlock:        pulumi.String("172.16.0.0/24"),
// 			AvailabilityZone: pulumi.String(defaultZones.Zones[0].Id),
// 			VswitchName:      pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = adb.NewDBCluster(ctx, "this", &adb.DBClusterArgs{
// 			DbClusterCategory: pulumi.String("Cluster"),
// 			DbClusterClass:    pulumi.String("C8"),
// 			DbNodeCount:       pulumi.Int(4),
// 			DbNodeStorage:     pulumi.Int(400),
// 			Mode:              pulumi.String("reserver"),
// 			DbClusterVersion:  pulumi.String("3.0"),
// 			PaymentType:       pulumi.String("PayAsYouGo"),
// 			VswitchId:         defaultSwitch.ID(),
// 			Description:       pulumi.String("Test new adb again."),
// 			MaintainTime:      pulumi.String("23:00Z-00:00Z"),
// 			Tags: pulumi.StringMap{
// 				"Created": pulumi.String("TF-update"),
// 				"For":     pulumi.String("acceptance-test-update"),
// 			},
// 			ResourceGroupId: pulumi.String("rg-aek2s7ylxx6****"),
// 			SecurityIps: pulumi.StringArray{
// 				pulumi.String("10.168.1.12"),
// 				pulumi.String("10.168.1.11"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// AnalyticDB for MySQL (ADB) DBCluster can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:adb/dBCluster:DBCluster example <id>
// ```
type DBCluster struct {
	pulumi.CustomResourceState

	// Auto-renewal period of an cluster, in the unit of the month. It is valid when `paymentType` is `Subscription`. Valid values: `1`, `2`, `3`, `6`, `12`, `24`, `36`. Default to `1`.
	AutoRenewPeriod pulumi.IntPtrOutput `pulumi:"autoRenewPeriod"`
	// The specifications of computing resources in elastic mode. The increase of resources can speed up queries. AnalyticDB for MySQL automatically scales computing resources. For more information, see [ComputeResource](https://www.alibabacloud.com/help/en/doc-detail/144851.htm)
	ComputeResource pulumi.StringPtrOutput `pulumi:"computeResource"`
	// The endpoint of the cluster.
	ConnectionString pulumi.StringOutput `pulumi:"connectionString"`
	// The db cluster category. Valid values: `Basic`, `Cluster`, `MixedStorage`.
	DbClusterCategory pulumi.StringOutput `pulumi:"dbClusterCategory"`
	// The db cluster class. For more information, see [DBClusterClass](https://help.aliyun.com/document_detail/190519.html)
	DbClusterClass pulumi.StringPtrOutput `pulumi:"dbClusterClass"`
	// The db cluster version. Value options: `3.0`, Default to `3.0`.
	DbClusterVersion pulumi.StringPtrOutput `pulumi:"dbClusterVersion"`
	// The db node class.
	DbNodeClass pulumi.StringOutput `pulumi:"dbNodeClass"`
	// The db node count.
	DbNodeCount pulumi.IntPtrOutput `pulumi:"dbNodeCount"`
	// The db node storage.
	DbNodeStorage pulumi.IntPtrOutput `pulumi:"dbNodeStorage"`
	// The description of DBCluster.
	Description pulumi.StringOutput `pulumi:"description"`
	// The elastic io resource.
	ElasticIoResource pulumi.IntPtrOutput `pulumi:"elasticIoResource"`
	// The maintenance window of the cluster. Format: hh:mmZ-hh:mmZ.
	MaintainTime pulumi.StringOutput `pulumi:"maintainTime"`
	// The mode of the cluster. Valid values: `reserver`, `flexible`.
	Mode pulumi.StringPtrOutput `pulumi:"mode"`
	// The modify type.
	ModifyType pulumi.StringPtrOutput `pulumi:"modifyType"`
	// Field `payType` has been deprecated. New field `paymentType` instead.
	PayType pulumi.StringOutput `pulumi:"payType"`
	// The payment type of the resource. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// The duration that you will buy DB cluster (in month). It is valid when `paymentType` is `Subscription`. Valid values: [1~9], 12, 24, 36. Default to 1.
	Period pulumi.IntPtrOutput `pulumi:"period"`
	// Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
	RenewalStatus pulumi.StringPtrOutput `pulumi:"renewalStatus"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// List of IP addresses allowed to access all databases of an cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
	SecurityIps pulumi.StringArrayOutput `pulumi:"securityIps"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The vswitch id.
	VswitchId pulumi.StringPtrOutput `pulumi:"vswitchId"`
	// The zone ID of the resource.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewDBCluster registers a new resource with the given unique name, arguments, and options.
func NewDBCluster(ctx *pulumi.Context,
	name string, args *DBClusterArgs, opts ...pulumi.ResourceOption) (*DBCluster, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DbClusterCategory == nil {
		return nil, errors.New("invalid value for required argument 'DbClusterCategory'")
	}
	var resource DBCluster
	err := ctx.RegisterResource("alicloud:adb/dBCluster:DBCluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDBCluster gets an existing DBCluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDBCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DBClusterState, opts ...pulumi.ResourceOption) (*DBCluster, error) {
	var resource DBCluster
	err := ctx.ReadResource("alicloud:adb/dBCluster:DBCluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DBCluster resources.
type dbclusterState struct {
	// Auto-renewal period of an cluster, in the unit of the month. It is valid when `paymentType` is `Subscription`. Valid values: `1`, `2`, `3`, `6`, `12`, `24`, `36`. Default to `1`.
	AutoRenewPeriod *int `pulumi:"autoRenewPeriod"`
	// The specifications of computing resources in elastic mode. The increase of resources can speed up queries. AnalyticDB for MySQL automatically scales computing resources. For more information, see [ComputeResource](https://www.alibabacloud.com/help/en/doc-detail/144851.htm)
	ComputeResource *string `pulumi:"computeResource"`
	// The endpoint of the cluster.
	ConnectionString *string `pulumi:"connectionString"`
	// The db cluster category. Valid values: `Basic`, `Cluster`, `MixedStorage`.
	DbClusterCategory *string `pulumi:"dbClusterCategory"`
	// The db cluster class. For more information, see [DBClusterClass](https://help.aliyun.com/document_detail/190519.html)
	DbClusterClass *string `pulumi:"dbClusterClass"`
	// The db cluster version. Value options: `3.0`, Default to `3.0`.
	DbClusterVersion *string `pulumi:"dbClusterVersion"`
	// The db node class.
	DbNodeClass *string `pulumi:"dbNodeClass"`
	// The db node count.
	DbNodeCount *int `pulumi:"dbNodeCount"`
	// The db node storage.
	DbNodeStorage *int `pulumi:"dbNodeStorage"`
	// The description of DBCluster.
	Description *string `pulumi:"description"`
	// The elastic io resource.
	ElasticIoResource *int `pulumi:"elasticIoResource"`
	// The maintenance window of the cluster. Format: hh:mmZ-hh:mmZ.
	MaintainTime *string `pulumi:"maintainTime"`
	// The mode of the cluster. Valid values: `reserver`, `flexible`.
	Mode *string `pulumi:"mode"`
	// The modify type.
	ModifyType *string `pulumi:"modifyType"`
	// Field `payType` has been deprecated. New field `paymentType` instead.
	PayType *string `pulumi:"payType"`
	// The payment type of the resource. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
	PaymentType *string `pulumi:"paymentType"`
	// The duration that you will buy DB cluster (in month). It is valid when `paymentType` is `Subscription`. Valid values: [1~9], 12, 24, 36. Default to 1.
	Period *int `pulumi:"period"`
	// Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
	RenewalStatus *string `pulumi:"renewalStatus"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// List of IP addresses allowed to access all databases of an cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
	SecurityIps []string `pulumi:"securityIps"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags map[string]interface{} `pulumi:"tags"`
	// The vswitch id.
	VswitchId *string `pulumi:"vswitchId"`
	// The zone ID of the resource.
	ZoneId *string `pulumi:"zoneId"`
}

type DBClusterState struct {
	// Auto-renewal period of an cluster, in the unit of the month. It is valid when `paymentType` is `Subscription`. Valid values: `1`, `2`, `3`, `6`, `12`, `24`, `36`. Default to `1`.
	AutoRenewPeriod pulumi.IntPtrInput
	// The specifications of computing resources in elastic mode. The increase of resources can speed up queries. AnalyticDB for MySQL automatically scales computing resources. For more information, see [ComputeResource](https://www.alibabacloud.com/help/en/doc-detail/144851.htm)
	ComputeResource pulumi.StringPtrInput
	// The endpoint of the cluster.
	ConnectionString pulumi.StringPtrInput
	// The db cluster category. Valid values: `Basic`, `Cluster`, `MixedStorage`.
	DbClusterCategory pulumi.StringPtrInput
	// The db cluster class. For more information, see [DBClusterClass](https://help.aliyun.com/document_detail/190519.html)
	DbClusterClass pulumi.StringPtrInput
	// The db cluster version. Value options: `3.0`, Default to `3.0`.
	DbClusterVersion pulumi.StringPtrInput
	// The db node class.
	DbNodeClass pulumi.StringPtrInput
	// The db node count.
	DbNodeCount pulumi.IntPtrInput
	// The db node storage.
	DbNodeStorage pulumi.IntPtrInput
	// The description of DBCluster.
	Description pulumi.StringPtrInput
	// The elastic io resource.
	ElasticIoResource pulumi.IntPtrInput
	// The maintenance window of the cluster. Format: hh:mmZ-hh:mmZ.
	MaintainTime pulumi.StringPtrInput
	// The mode of the cluster. Valid values: `reserver`, `flexible`.
	Mode pulumi.StringPtrInput
	// The modify type.
	ModifyType pulumi.StringPtrInput
	// Field `payType` has been deprecated. New field `paymentType` instead.
	PayType pulumi.StringPtrInput
	// The payment type of the resource. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
	PaymentType pulumi.StringPtrInput
	// The duration that you will buy DB cluster (in month). It is valid when `paymentType` is `Subscription`. Valid values: [1~9], 12, 24, 36. Default to 1.
	Period pulumi.IntPtrInput
	// Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
	RenewalStatus pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// List of IP addresses allowed to access all databases of an cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
	SecurityIps pulumi.StringArrayInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags pulumi.MapInput
	// The vswitch id.
	VswitchId pulumi.StringPtrInput
	// The zone ID of the resource.
	ZoneId pulumi.StringPtrInput
}

func (DBClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*dbclusterState)(nil)).Elem()
}

type dbclusterArgs struct {
	// Auto-renewal period of an cluster, in the unit of the month. It is valid when `paymentType` is `Subscription`. Valid values: `1`, `2`, `3`, `6`, `12`, `24`, `36`. Default to `1`.
	AutoRenewPeriod *int `pulumi:"autoRenewPeriod"`
	// The specifications of computing resources in elastic mode. The increase of resources can speed up queries. AnalyticDB for MySQL automatically scales computing resources. For more information, see [ComputeResource](https://www.alibabacloud.com/help/en/doc-detail/144851.htm)
	ComputeResource *string `pulumi:"computeResource"`
	// The db cluster category. Valid values: `Basic`, `Cluster`, `MixedStorage`.
	DbClusterCategory string `pulumi:"dbClusterCategory"`
	// The db cluster class. For more information, see [DBClusterClass](https://help.aliyun.com/document_detail/190519.html)
	DbClusterClass *string `pulumi:"dbClusterClass"`
	// The db cluster version. Value options: `3.0`, Default to `3.0`.
	DbClusterVersion *string `pulumi:"dbClusterVersion"`
	// The db node class.
	DbNodeClass *string `pulumi:"dbNodeClass"`
	// The db node count.
	DbNodeCount *int `pulumi:"dbNodeCount"`
	// The db node storage.
	DbNodeStorage *int `pulumi:"dbNodeStorage"`
	// The description of DBCluster.
	Description *string `pulumi:"description"`
	// The elastic io resource.
	ElasticIoResource *int `pulumi:"elasticIoResource"`
	// The maintenance window of the cluster. Format: hh:mmZ-hh:mmZ.
	MaintainTime *string `pulumi:"maintainTime"`
	// The mode of the cluster. Valid values: `reserver`, `flexible`.
	Mode *string `pulumi:"mode"`
	// The modify type.
	ModifyType *string `pulumi:"modifyType"`
	// Field `payType` has been deprecated. New field `paymentType` instead.
	PayType *string `pulumi:"payType"`
	// The payment type of the resource. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
	PaymentType *string `pulumi:"paymentType"`
	// The duration that you will buy DB cluster (in month). It is valid when `paymentType` is `Subscription`. Valid values: [1~9], 12, 24, 36. Default to 1.
	Period *int `pulumi:"period"`
	// Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
	RenewalStatus *string `pulumi:"renewalStatus"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// List of IP addresses allowed to access all databases of an cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
	SecurityIps []string `pulumi:"securityIps"`
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags map[string]interface{} `pulumi:"tags"`
	// The vswitch id.
	VswitchId *string `pulumi:"vswitchId"`
	// The zone ID of the resource.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a DBCluster resource.
type DBClusterArgs struct {
	// Auto-renewal period of an cluster, in the unit of the month. It is valid when `paymentType` is `Subscription`. Valid values: `1`, `2`, `3`, `6`, `12`, `24`, `36`. Default to `1`.
	AutoRenewPeriod pulumi.IntPtrInput
	// The specifications of computing resources in elastic mode. The increase of resources can speed up queries. AnalyticDB for MySQL automatically scales computing resources. For more information, see [ComputeResource](https://www.alibabacloud.com/help/en/doc-detail/144851.htm)
	ComputeResource pulumi.StringPtrInput
	// The db cluster category. Valid values: `Basic`, `Cluster`, `MixedStorage`.
	DbClusterCategory pulumi.StringInput
	// The db cluster class. For more information, see [DBClusterClass](https://help.aliyun.com/document_detail/190519.html)
	DbClusterClass pulumi.StringPtrInput
	// The db cluster version. Value options: `3.0`, Default to `3.0`.
	DbClusterVersion pulumi.StringPtrInput
	// The db node class.
	DbNodeClass pulumi.StringPtrInput
	// The db node count.
	DbNodeCount pulumi.IntPtrInput
	// The db node storage.
	DbNodeStorage pulumi.IntPtrInput
	// The description of DBCluster.
	Description pulumi.StringPtrInput
	// The elastic io resource.
	ElasticIoResource pulumi.IntPtrInput
	// The maintenance window of the cluster. Format: hh:mmZ-hh:mmZ.
	MaintainTime pulumi.StringPtrInput
	// The mode of the cluster. Valid values: `reserver`, `flexible`.
	Mode pulumi.StringPtrInput
	// The modify type.
	ModifyType pulumi.StringPtrInput
	// Field `payType` has been deprecated. New field `paymentType` instead.
	PayType pulumi.StringPtrInput
	// The payment type of the resource. Valid values are `PayAsYouGo` and `Subscription`. Default to `PayAsYouGo`.
	PaymentType pulumi.StringPtrInput
	// The duration that you will buy DB cluster (in month). It is valid when `paymentType` is `Subscription`. Valid values: [1~9], 12, 24, 36. Default to 1.
	Period pulumi.IntPtrInput
	// Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
	RenewalStatus pulumi.StringPtrInput
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput
	// List of IP addresses allowed to access all databases of an cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
	SecurityIps pulumi.StringArrayInput
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags pulumi.MapInput
	// The vswitch id.
	VswitchId pulumi.StringPtrInput
	// The zone ID of the resource.
	ZoneId pulumi.StringPtrInput
}

func (DBClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dbclusterArgs)(nil)).Elem()
}

type DBClusterInput interface {
	pulumi.Input

	ToDBClusterOutput() DBClusterOutput
	ToDBClusterOutputWithContext(ctx context.Context) DBClusterOutput
}

func (*DBCluster) ElementType() reflect.Type {
	return reflect.TypeOf((*DBCluster)(nil))
}

func (i *DBCluster) ToDBClusterOutput() DBClusterOutput {
	return i.ToDBClusterOutputWithContext(context.Background())
}

func (i *DBCluster) ToDBClusterOutputWithContext(ctx context.Context) DBClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DBClusterOutput)
}

func (i *DBCluster) ToDBClusterPtrOutput() DBClusterPtrOutput {
	return i.ToDBClusterPtrOutputWithContext(context.Background())
}

func (i *DBCluster) ToDBClusterPtrOutputWithContext(ctx context.Context) DBClusterPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DBClusterPtrOutput)
}

type DBClusterPtrInput interface {
	pulumi.Input

	ToDBClusterPtrOutput() DBClusterPtrOutput
	ToDBClusterPtrOutputWithContext(ctx context.Context) DBClusterPtrOutput
}

type dbclusterPtrType DBClusterArgs

func (*dbclusterPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**DBCluster)(nil))
}

func (i *dbclusterPtrType) ToDBClusterPtrOutput() DBClusterPtrOutput {
	return i.ToDBClusterPtrOutputWithContext(context.Background())
}

func (i *dbclusterPtrType) ToDBClusterPtrOutputWithContext(ctx context.Context) DBClusterPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DBClusterPtrOutput)
}

// DBClusterArrayInput is an input type that accepts DBClusterArray and DBClusterArrayOutput values.
// You can construct a concrete instance of `DBClusterArrayInput` via:
//
//          DBClusterArray{ DBClusterArgs{...} }
type DBClusterArrayInput interface {
	pulumi.Input

	ToDBClusterArrayOutput() DBClusterArrayOutput
	ToDBClusterArrayOutputWithContext(context.Context) DBClusterArrayOutput
}

type DBClusterArray []DBClusterInput

func (DBClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*DBCluster)(nil))
}

func (i DBClusterArray) ToDBClusterArrayOutput() DBClusterArrayOutput {
	return i.ToDBClusterArrayOutputWithContext(context.Background())
}

func (i DBClusterArray) ToDBClusterArrayOutputWithContext(ctx context.Context) DBClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DBClusterArrayOutput)
}

// DBClusterMapInput is an input type that accepts DBClusterMap and DBClusterMapOutput values.
// You can construct a concrete instance of `DBClusterMapInput` via:
//
//          DBClusterMap{ "key": DBClusterArgs{...} }
type DBClusterMapInput interface {
	pulumi.Input

	ToDBClusterMapOutput() DBClusterMapOutput
	ToDBClusterMapOutputWithContext(context.Context) DBClusterMapOutput
}

type DBClusterMap map[string]DBClusterInput

func (DBClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*DBCluster)(nil))
}

func (i DBClusterMap) ToDBClusterMapOutput() DBClusterMapOutput {
	return i.ToDBClusterMapOutputWithContext(context.Background())
}

func (i DBClusterMap) ToDBClusterMapOutputWithContext(ctx context.Context) DBClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DBClusterMapOutput)
}

type DBClusterOutput struct {
	*pulumi.OutputState
}

func (DBClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DBCluster)(nil))
}

func (o DBClusterOutput) ToDBClusterOutput() DBClusterOutput {
	return o
}

func (o DBClusterOutput) ToDBClusterOutputWithContext(ctx context.Context) DBClusterOutput {
	return o
}

func (o DBClusterOutput) ToDBClusterPtrOutput() DBClusterPtrOutput {
	return o.ToDBClusterPtrOutputWithContext(context.Background())
}

func (o DBClusterOutput) ToDBClusterPtrOutputWithContext(ctx context.Context) DBClusterPtrOutput {
	return o.ApplyT(func(v DBCluster) *DBCluster {
		return &v
	}).(DBClusterPtrOutput)
}

type DBClusterPtrOutput struct {
	*pulumi.OutputState
}

func (DBClusterPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DBCluster)(nil))
}

func (o DBClusterPtrOutput) ToDBClusterPtrOutput() DBClusterPtrOutput {
	return o
}

func (o DBClusterPtrOutput) ToDBClusterPtrOutputWithContext(ctx context.Context) DBClusterPtrOutput {
	return o
}

type DBClusterArrayOutput struct{ *pulumi.OutputState }

func (DBClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]DBCluster)(nil))
}

func (o DBClusterArrayOutput) ToDBClusterArrayOutput() DBClusterArrayOutput {
	return o
}

func (o DBClusterArrayOutput) ToDBClusterArrayOutputWithContext(ctx context.Context) DBClusterArrayOutput {
	return o
}

func (o DBClusterArrayOutput) Index(i pulumi.IntInput) DBClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) DBCluster {
		return vs[0].([]DBCluster)[vs[1].(int)]
	}).(DBClusterOutput)
}

type DBClusterMapOutput struct{ *pulumi.OutputState }

func (DBClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]DBCluster)(nil))
}

func (o DBClusterMapOutput) ToDBClusterMapOutput() DBClusterMapOutput {
	return o
}

func (o DBClusterMapOutput) ToDBClusterMapOutputWithContext(ctx context.Context) DBClusterMapOutput {
	return o
}

func (o DBClusterMapOutput) MapIndex(k pulumi.StringInput) DBClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) DBCluster {
		return vs[0].(map[string]DBCluster)[vs[1].(string)]
	}).(DBClusterOutput)
}

func init() {
	pulumi.RegisterOutputType(DBClusterOutput{})
	pulumi.RegisterOutputType(DBClusterPtrOutput{})
	pulumi.RegisterOutputType(DBClusterArrayOutput{})
	pulumi.RegisterOutputType(DBClusterMapOutput{})
}
