// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides an RDS instance resource. A DB instance is an isolated database environment in the cloud. A DB instance can contain multiple user-created databases.
//
// For information about RDS and how to use it, see [What is ApsaraDB for RDS](https://www.alibabacloud.com/help/en/doc-detail/26092.htm).
//
// ## Example Usage
// ### Create a RDS MySQL instance
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/rds"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		name := "tf-testaccdbinstance"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		creation := "Rds"
// 		if param := cfg.Get("creation"); param != "" {
// 			creation = param
// 		}
// 		opt0 := creation
// 		exampleZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
// 			AvailableResourceCreation: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleNetwork, err := vpc.NewNetwork(ctx, "exampleNetwork", &vpc.NetworkArgs{
// 			CidrBlock: pulumi.String("172.16.0.0/16"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleSwitch, err := vpc.NewSwitch(ctx, "exampleSwitch", &vpc.SwitchArgs{
// 			VpcId:            exampleNetwork.ID(),
// 			CidrBlock:        pulumi.String("172.16.0.0/24"),
// 			AvailabilityZone: pulumi.String(exampleZones.Zones[0].Id),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = rds.NewInstance(ctx, "exampleInstance", &rds.InstanceArgs{
// 			Engine:             pulumi.String("MySQL"),
// 			EngineVersion:      pulumi.String("5.6"),
// 			InstanceType:       pulumi.String("rds.mysql.s2.large"),
// 			InstanceStorage:    pulumi.Int(30),
// 			InstanceChargeType: pulumi.String("Postpaid"),
// 			InstanceName:       pulumi.String(name),
// 			VswitchId:          exampleSwitch.ID(),
// 			MonitoringPeriod:   pulumi.Int(60),
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
// RDS instance can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:rds/instance:Instance example rm-abc12345678
// ```
type Instance struct {
	pulumi.CustomResourceState

	// Whether to renewal a DB instance automatically or not. It is valid when instanceChargeType is `PrePaid`. Default to `false`.
	AutoRenew pulumi.BoolPtrOutput `pulumi:"autoRenew"`
	// Auto-renewal period of an instance, in the unit of the month. It is valid when instanceChargeType is `PrePaid`. Valid value:[1~12], Default to 1.
	AutoRenewPeriod pulumi.IntPtrOutput `pulumi:"autoRenewPeriod"`
	// The upgrade method to use. Valid values:
	// - Auto: Instances are automatically upgraded to a higher minor version.
	// - Manual: Instances are forcibly upgraded to a higher minor version when the current version is unpublished.
	AutoUpgradeMinorVersion pulumi.StringOutput `pulumi:"autoUpgradeMinorVersion"`
	// RDS database connection string.
	ConnectionString pulumi.StringOutput `pulumi:"connectionString"`
	// The storage type of the instance. Valid values:
	// - local_ssd: specifies to use local SSDs. This value is recommended.
	// - cloud_ssd: specifies to use standard SSDs.
	// - cloud_essd: specifies to use enhanced SSDs (ESSDs).
	// - cloud_essd2: specifies to use enhanced SSDs (ESSDs).
	// - cloud_essd3: specifies to use enhanced SSDs (ESSDs).
	DbInstanceStorageType pulumi.StringOutput `pulumi:"dbInstanceStorageType"`
	// Database type. Value options: MySQL, SQLServer, PostgreSQL, and PPAS.
	Engine pulumi.StringOutput `pulumi:"engine"`
	// Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
	EngineVersion pulumi.StringOutput `pulumi:"engineVersion"`
	// Set it to true to make some parameter efficient when modifying them. Default to false.
	ForceRestart pulumi.BoolPtrOutput `pulumi:"forceRestart"`
	// Valid values are `Prepaid`, `Postpaid`, Default to `Postpaid`. Currently, the resource only supports PostPaid to PrePaid.
	InstanceChargeType pulumi.StringPtrOutput `pulumi:"instanceChargeType"`
	// The name of DB instance. It a string of 2 to 256 characters.
	InstanceName pulumi.StringPtrOutput `pulumi:"instanceName"`
	// User-defined DB instance storage space. Value range:
	// - [5, 2000] for MySQL/PostgreSQL/PPAS HA dual node edition;
	// - [20,1000] for MySQL 5.7 basic single node edition;
	// - [10, 2000] for SQL Server 2008R2;
	// - [20,2000] for SQL Server 2012 basic single node edition
	//   Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
	//   Note: There is extra 5 GB storage for SQL Server Instance and it is not in specified `instanceStorage`.
	InstanceStorage pulumi.IntOutput `pulumi:"instanceStorage"`
	// DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
	MaintainTime pulumi.StringOutput `pulumi:"maintainTime"`
	// The monitoring frequency in seconds. Valid values are 5, 60, 300. Defaults to 300.
	MonitoringPeriod pulumi.IntOutput `pulumi:"monitoringPeriod"`
	// Set of parameters needs to be set after DB instance was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/26284.htm) .
	Parameters InstanceParameterArrayOutput `pulumi:"parameters"`
	// The duration that you will buy DB instance (in month). It is valid when instanceChargeType is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
	Period pulumi.IntPtrOutput `pulumi:"period"`
	// RDS database connection port.
	Port pulumi.StringOutput `pulumi:"port"`
	// The ID of resource group which the DB instance belongs.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// It has been deprecated from 1.69.0 and use `securityGroupIds` instead.
	//
	// Deprecated: Attribute `security_group_id` has been deprecated from 1.69.0 and use `security_group_ids` instead.
	SecurityGroupId pulumi.StringOutput `pulumi:"securityGroupId"`
	// , Available in 1.69.0+) The list IDs to join ECS Security Group. At most supports three security groups.
	SecurityGroupIds pulumi.StringArrayOutput `pulumi:"securityGroupIds"`
	// Valid values are `normal`, `safety`, Default to `normal`. support `safety` switch to high security access mode
	SecurityIpMode pulumi.StringPtrOutput `pulumi:"securityIpMode"`
	// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
	SecurityIps pulumi.StringArrayOutput `pulumi:"securityIps"`
	// The sql collector keep time of the instance. Valid values are `30`, `180`, `365`, `1095`, `1825`, Default to `30`.
	SqlCollectorConfigValue pulumi.IntPtrOutput `pulumi:"sqlCollectorConfigValue"`
	// The sql collector status of the instance. Valid values are `Enabled`, `Disabled`, Default to `Disabled`.
	SqlCollectorStatus pulumi.StringOutput `pulumi:"sqlCollectorStatus"`
	// Actions performed on SSL functions, Valid values: `Open`: turn on SSL encryption; `Close`: turn off SSL encryption; `Update`: update SSL certificate. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26254.htm).
	SslAction pulumi.StringOutput `pulumi:"sslAction"`
	// Status of the SSL feature. `Yes`: SSL is turned on; `No`: SSL is turned off.
	SslStatus pulumi.StringOutput `pulumi:"sslStatus"`
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The TDE(Transparent Data Encryption) status. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26256.htm).
	TdeStatus pulumi.StringPtrOutput `pulumi:"tdeStatus"`
	// The virtual switch ID to launch DB instances in one VPC. If there are multiple vswitches, separate them with commas.
	VswitchId pulumi.StringPtrOutput `pulumi:"vswitchId"`
	// The Zone to launch the DB instance. From version 1.8.1, it supports multiple zone.
	// If it is a multi-zone and `vswitchId` is specified, the vswitch must in the one of them.
	// The multiple zone ID can be retrieved by setting `multi` to "true" in the data source `getZones`.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
	// The region ID of the secondary instance if you create a secondary instance. If you set this parameter to the same value as the ZoneId parameter, the instance is deployed in a single zone. Otherwise, the instance is deployed in multiple zones.
	ZoneIdSlaveA pulumi.StringPtrOutput `pulumi:"zoneIdSlaveA"`
	// The region ID of the log instance if you create a log instance. If you set this parameter to the same value as the ZoneId parameter, the instance is deployed in a single zone. Otherwise, the instance is deployed in multiple zones.
	ZoneIdSlaveB pulumi.StringPtrOutput `pulumi:"zoneIdSlaveB"`
}

// NewInstance registers a new resource with the given unique name, arguments, and options.
func NewInstance(ctx *pulumi.Context,
	name string, args *InstanceArgs, opts ...pulumi.ResourceOption) (*Instance, error) {
	if args == nil || args.Engine == nil {
		return nil, errors.New("missing required argument 'Engine'")
	}
	if args == nil || args.EngineVersion == nil {
		return nil, errors.New("missing required argument 'EngineVersion'")
	}
	if args == nil || args.InstanceStorage == nil {
		return nil, errors.New("missing required argument 'InstanceStorage'")
	}
	if args == nil || args.InstanceType == nil {
		return nil, errors.New("missing required argument 'InstanceType'")
	}
	if args == nil {
		args = &InstanceArgs{}
	}
	var resource Instance
	err := ctx.RegisterResource("alicloud:rds/instance:Instance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstance gets an existing Instance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceState, opts ...pulumi.ResourceOption) (*Instance, error) {
	var resource Instance
	err := ctx.ReadResource("alicloud:rds/instance:Instance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Instance resources.
type instanceState struct {
	// Whether to renewal a DB instance automatically or not. It is valid when instanceChargeType is `PrePaid`. Default to `false`.
	AutoRenew *bool `pulumi:"autoRenew"`
	// Auto-renewal period of an instance, in the unit of the month. It is valid when instanceChargeType is `PrePaid`. Valid value:[1~12], Default to 1.
	AutoRenewPeriod *int `pulumi:"autoRenewPeriod"`
	// The upgrade method to use. Valid values:
	// - Auto: Instances are automatically upgraded to a higher minor version.
	// - Manual: Instances are forcibly upgraded to a higher minor version when the current version is unpublished.
	AutoUpgradeMinorVersion *string `pulumi:"autoUpgradeMinorVersion"`
	// RDS database connection string.
	ConnectionString *string `pulumi:"connectionString"`
	// The storage type of the instance. Valid values:
	// - local_ssd: specifies to use local SSDs. This value is recommended.
	// - cloud_ssd: specifies to use standard SSDs.
	// - cloud_essd: specifies to use enhanced SSDs (ESSDs).
	// - cloud_essd2: specifies to use enhanced SSDs (ESSDs).
	// - cloud_essd3: specifies to use enhanced SSDs (ESSDs).
	DbInstanceStorageType *string `pulumi:"dbInstanceStorageType"`
	// Database type. Value options: MySQL, SQLServer, PostgreSQL, and PPAS.
	Engine *string `pulumi:"engine"`
	// Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
	EngineVersion *string `pulumi:"engineVersion"`
	// Set it to true to make some parameter efficient when modifying them. Default to false.
	ForceRestart *bool `pulumi:"forceRestart"`
	// Valid values are `Prepaid`, `Postpaid`, Default to `Postpaid`. Currently, the resource only supports PostPaid to PrePaid.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// The name of DB instance. It a string of 2 to 256 characters.
	InstanceName *string `pulumi:"instanceName"`
	// User-defined DB instance storage space. Value range:
	// - [5, 2000] for MySQL/PostgreSQL/PPAS HA dual node edition;
	// - [20,1000] for MySQL 5.7 basic single node edition;
	// - [10, 2000] for SQL Server 2008R2;
	// - [20,2000] for SQL Server 2012 basic single node edition
	//   Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
	//   Note: There is extra 5 GB storage for SQL Server Instance and it is not in specified `instanceStorage`.
	InstanceStorage *int `pulumi:"instanceStorage"`
	// DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
	InstanceType *string `pulumi:"instanceType"`
	// Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
	MaintainTime *string `pulumi:"maintainTime"`
	// The monitoring frequency in seconds. Valid values are 5, 60, 300. Defaults to 300.
	MonitoringPeriod *int `pulumi:"monitoringPeriod"`
	// Set of parameters needs to be set after DB instance was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/26284.htm) .
	Parameters []InstanceParameter `pulumi:"parameters"`
	// The duration that you will buy DB instance (in month). It is valid when instanceChargeType is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
	Period *int `pulumi:"period"`
	// RDS database connection port.
	Port *string `pulumi:"port"`
	// The ID of resource group which the DB instance belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// It has been deprecated from 1.69.0 and use `securityGroupIds` instead.
	//
	// Deprecated: Attribute `security_group_id` has been deprecated from 1.69.0 and use `security_group_ids` instead.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// , Available in 1.69.0+) The list IDs to join ECS Security Group. At most supports three security groups.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// Valid values are `normal`, `safety`, Default to `normal`. support `safety` switch to high security access mode
	SecurityIpMode *string `pulumi:"securityIpMode"`
	// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
	SecurityIps []string `pulumi:"securityIps"`
	// The sql collector keep time of the instance. Valid values are `30`, `180`, `365`, `1095`, `1825`, Default to `30`.
	SqlCollectorConfigValue *int `pulumi:"sqlCollectorConfigValue"`
	// The sql collector status of the instance. Valid values are `Enabled`, `Disabled`, Default to `Disabled`.
	SqlCollectorStatus *string `pulumi:"sqlCollectorStatus"`
	// Actions performed on SSL functions, Valid values: `Open`: turn on SSL encryption; `Close`: turn off SSL encryption; `Update`: update SSL certificate. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26254.htm).
	SslAction *string `pulumi:"sslAction"`
	// Status of the SSL feature. `Yes`: SSL is turned on; `No`: SSL is turned off.
	SslStatus *string `pulumi:"sslStatus"`
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags map[string]interface{} `pulumi:"tags"`
	// The TDE(Transparent Data Encryption) status. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26256.htm).
	TdeStatus *string `pulumi:"tdeStatus"`
	// The virtual switch ID to launch DB instances in one VPC. If there are multiple vswitches, separate them with commas.
	VswitchId *string `pulumi:"vswitchId"`
	// The Zone to launch the DB instance. From version 1.8.1, it supports multiple zone.
	// If it is a multi-zone and `vswitchId` is specified, the vswitch must in the one of them.
	// The multiple zone ID can be retrieved by setting `multi` to "true" in the data source `getZones`.
	ZoneId *string `pulumi:"zoneId"`
	// The region ID of the secondary instance if you create a secondary instance. If you set this parameter to the same value as the ZoneId parameter, the instance is deployed in a single zone. Otherwise, the instance is deployed in multiple zones.
	ZoneIdSlaveA *string `pulumi:"zoneIdSlaveA"`
	// The region ID of the log instance if you create a log instance. If you set this parameter to the same value as the ZoneId parameter, the instance is deployed in a single zone. Otherwise, the instance is deployed in multiple zones.
	ZoneIdSlaveB *string `pulumi:"zoneIdSlaveB"`
}

type InstanceState struct {
	// Whether to renewal a DB instance automatically or not. It is valid when instanceChargeType is `PrePaid`. Default to `false`.
	AutoRenew pulumi.BoolPtrInput
	// Auto-renewal period of an instance, in the unit of the month. It is valid when instanceChargeType is `PrePaid`. Valid value:[1~12], Default to 1.
	AutoRenewPeriod pulumi.IntPtrInput
	// The upgrade method to use. Valid values:
	// - Auto: Instances are automatically upgraded to a higher minor version.
	// - Manual: Instances are forcibly upgraded to a higher minor version when the current version is unpublished.
	AutoUpgradeMinorVersion pulumi.StringPtrInput
	// RDS database connection string.
	ConnectionString pulumi.StringPtrInput
	// The storage type of the instance. Valid values:
	// - local_ssd: specifies to use local SSDs. This value is recommended.
	// - cloud_ssd: specifies to use standard SSDs.
	// - cloud_essd: specifies to use enhanced SSDs (ESSDs).
	// - cloud_essd2: specifies to use enhanced SSDs (ESSDs).
	// - cloud_essd3: specifies to use enhanced SSDs (ESSDs).
	DbInstanceStorageType pulumi.StringPtrInput
	// Database type. Value options: MySQL, SQLServer, PostgreSQL, and PPAS.
	Engine pulumi.StringPtrInput
	// Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
	EngineVersion pulumi.StringPtrInput
	// Set it to true to make some parameter efficient when modifying them. Default to false.
	ForceRestart pulumi.BoolPtrInput
	// Valid values are `Prepaid`, `Postpaid`, Default to `Postpaid`. Currently, the resource only supports PostPaid to PrePaid.
	InstanceChargeType pulumi.StringPtrInput
	// The name of DB instance. It a string of 2 to 256 characters.
	InstanceName pulumi.StringPtrInput
	// User-defined DB instance storage space. Value range:
	// - [5, 2000] for MySQL/PostgreSQL/PPAS HA dual node edition;
	// - [20,1000] for MySQL 5.7 basic single node edition;
	// - [10, 2000] for SQL Server 2008R2;
	// - [20,2000] for SQL Server 2012 basic single node edition
	//   Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
	//   Note: There is extra 5 GB storage for SQL Server Instance and it is not in specified `instanceStorage`.
	InstanceStorage pulumi.IntPtrInput
	// DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
	InstanceType pulumi.StringPtrInput
	// Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
	MaintainTime pulumi.StringPtrInput
	// The monitoring frequency in seconds. Valid values are 5, 60, 300. Defaults to 300.
	MonitoringPeriod pulumi.IntPtrInput
	// Set of parameters needs to be set after DB instance was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/26284.htm) .
	Parameters InstanceParameterArrayInput
	// The duration that you will buy DB instance (in month). It is valid when instanceChargeType is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
	Period pulumi.IntPtrInput
	// RDS database connection port.
	Port pulumi.StringPtrInput
	// The ID of resource group which the DB instance belongs.
	ResourceGroupId pulumi.StringPtrInput
	// It has been deprecated from 1.69.0 and use `securityGroupIds` instead.
	//
	// Deprecated: Attribute `security_group_id` has been deprecated from 1.69.0 and use `security_group_ids` instead.
	SecurityGroupId pulumi.StringPtrInput
	// , Available in 1.69.0+) The list IDs to join ECS Security Group. At most supports three security groups.
	SecurityGroupIds pulumi.StringArrayInput
	// Valid values are `normal`, `safety`, Default to `normal`. support `safety` switch to high security access mode
	SecurityIpMode pulumi.StringPtrInput
	// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
	SecurityIps pulumi.StringArrayInput
	// The sql collector keep time of the instance. Valid values are `30`, `180`, `365`, `1095`, `1825`, Default to `30`.
	SqlCollectorConfigValue pulumi.IntPtrInput
	// The sql collector status of the instance. Valid values are `Enabled`, `Disabled`, Default to `Disabled`.
	SqlCollectorStatus pulumi.StringPtrInput
	// Actions performed on SSL functions, Valid values: `Open`: turn on SSL encryption; `Close`: turn off SSL encryption; `Update`: update SSL certificate. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26254.htm).
	SslAction pulumi.StringPtrInput
	// Status of the SSL feature. `Yes`: SSL is turned on; `No`: SSL is turned off.
	SslStatus pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags pulumi.MapInput
	// The TDE(Transparent Data Encryption) status. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26256.htm).
	TdeStatus pulumi.StringPtrInput
	// The virtual switch ID to launch DB instances in one VPC. If there are multiple vswitches, separate them with commas.
	VswitchId pulumi.StringPtrInput
	// The Zone to launch the DB instance. From version 1.8.1, it supports multiple zone.
	// If it is a multi-zone and `vswitchId` is specified, the vswitch must in the one of them.
	// The multiple zone ID can be retrieved by setting `multi` to "true" in the data source `getZones`.
	ZoneId pulumi.StringPtrInput
	// The region ID of the secondary instance if you create a secondary instance. If you set this parameter to the same value as the ZoneId parameter, the instance is deployed in a single zone. Otherwise, the instance is deployed in multiple zones.
	ZoneIdSlaveA pulumi.StringPtrInput
	// The region ID of the log instance if you create a log instance. If you set this parameter to the same value as the ZoneId parameter, the instance is deployed in a single zone. Otherwise, the instance is deployed in multiple zones.
	ZoneIdSlaveB pulumi.StringPtrInput
}

func (InstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceState)(nil)).Elem()
}

type instanceArgs struct {
	// Whether to renewal a DB instance automatically or not. It is valid when instanceChargeType is `PrePaid`. Default to `false`.
	AutoRenew *bool `pulumi:"autoRenew"`
	// Auto-renewal period of an instance, in the unit of the month. It is valid when instanceChargeType is `PrePaid`. Valid value:[1~12], Default to 1.
	AutoRenewPeriod *int `pulumi:"autoRenewPeriod"`
	// The upgrade method to use. Valid values:
	// - Auto: Instances are automatically upgraded to a higher minor version.
	// - Manual: Instances are forcibly upgraded to a higher minor version when the current version is unpublished.
	AutoUpgradeMinorVersion *string `pulumi:"autoUpgradeMinorVersion"`
	// The storage type of the instance. Valid values:
	// - local_ssd: specifies to use local SSDs. This value is recommended.
	// - cloud_ssd: specifies to use standard SSDs.
	// - cloud_essd: specifies to use enhanced SSDs (ESSDs).
	// - cloud_essd2: specifies to use enhanced SSDs (ESSDs).
	// - cloud_essd3: specifies to use enhanced SSDs (ESSDs).
	DbInstanceStorageType *string `pulumi:"dbInstanceStorageType"`
	// Database type. Value options: MySQL, SQLServer, PostgreSQL, and PPAS.
	Engine string `pulumi:"engine"`
	// Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
	EngineVersion string `pulumi:"engineVersion"`
	// Set it to true to make some parameter efficient when modifying them. Default to false.
	ForceRestart *bool `pulumi:"forceRestart"`
	// Valid values are `Prepaid`, `Postpaid`, Default to `Postpaid`. Currently, the resource only supports PostPaid to PrePaid.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// The name of DB instance. It a string of 2 to 256 characters.
	InstanceName *string `pulumi:"instanceName"`
	// User-defined DB instance storage space. Value range:
	// - [5, 2000] for MySQL/PostgreSQL/PPAS HA dual node edition;
	// - [20,1000] for MySQL 5.7 basic single node edition;
	// - [10, 2000] for SQL Server 2008R2;
	// - [20,2000] for SQL Server 2012 basic single node edition
	//   Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
	//   Note: There is extra 5 GB storage for SQL Server Instance and it is not in specified `instanceStorage`.
	InstanceStorage int `pulumi:"instanceStorage"`
	// DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
	InstanceType string `pulumi:"instanceType"`
	// Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
	MaintainTime *string `pulumi:"maintainTime"`
	// The monitoring frequency in seconds. Valid values are 5, 60, 300. Defaults to 300.
	MonitoringPeriod *int `pulumi:"monitoringPeriod"`
	// Set of parameters needs to be set after DB instance was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/26284.htm) .
	Parameters []InstanceParameter `pulumi:"parameters"`
	// The duration that you will buy DB instance (in month). It is valid when instanceChargeType is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
	Period *int `pulumi:"period"`
	// The ID of resource group which the DB instance belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// It has been deprecated from 1.69.0 and use `securityGroupIds` instead.
	//
	// Deprecated: Attribute `security_group_id` has been deprecated from 1.69.0 and use `security_group_ids` instead.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// , Available in 1.69.0+) The list IDs to join ECS Security Group. At most supports three security groups.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// Valid values are `normal`, `safety`, Default to `normal`. support `safety` switch to high security access mode
	SecurityIpMode *string `pulumi:"securityIpMode"`
	// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
	SecurityIps []string `pulumi:"securityIps"`
	// The sql collector keep time of the instance. Valid values are `30`, `180`, `365`, `1095`, `1825`, Default to `30`.
	SqlCollectorConfigValue *int `pulumi:"sqlCollectorConfigValue"`
	// The sql collector status of the instance. Valid values are `Enabled`, `Disabled`, Default to `Disabled`.
	SqlCollectorStatus *string `pulumi:"sqlCollectorStatus"`
	// Actions performed on SSL functions, Valid values: `Open`: turn on SSL encryption; `Close`: turn off SSL encryption; `Update`: update SSL certificate. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26254.htm).
	SslAction *string `pulumi:"sslAction"`
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags map[string]interface{} `pulumi:"tags"`
	// The TDE(Transparent Data Encryption) status. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26256.htm).
	TdeStatus *string `pulumi:"tdeStatus"`
	// The virtual switch ID to launch DB instances in one VPC. If there are multiple vswitches, separate them with commas.
	VswitchId *string `pulumi:"vswitchId"`
	// The Zone to launch the DB instance. From version 1.8.1, it supports multiple zone.
	// If it is a multi-zone and `vswitchId` is specified, the vswitch must in the one of them.
	// The multiple zone ID can be retrieved by setting `multi` to "true" in the data source `getZones`.
	ZoneId *string `pulumi:"zoneId"`
	// The region ID of the secondary instance if you create a secondary instance. If you set this parameter to the same value as the ZoneId parameter, the instance is deployed in a single zone. Otherwise, the instance is deployed in multiple zones.
	ZoneIdSlaveA *string `pulumi:"zoneIdSlaveA"`
	// The region ID of the log instance if you create a log instance. If you set this parameter to the same value as the ZoneId parameter, the instance is deployed in a single zone. Otherwise, the instance is deployed in multiple zones.
	ZoneIdSlaveB *string `pulumi:"zoneIdSlaveB"`
}

// The set of arguments for constructing a Instance resource.
type InstanceArgs struct {
	// Whether to renewal a DB instance automatically or not. It is valid when instanceChargeType is `PrePaid`. Default to `false`.
	AutoRenew pulumi.BoolPtrInput
	// Auto-renewal period of an instance, in the unit of the month. It is valid when instanceChargeType is `PrePaid`. Valid value:[1~12], Default to 1.
	AutoRenewPeriod pulumi.IntPtrInput
	// The upgrade method to use. Valid values:
	// - Auto: Instances are automatically upgraded to a higher minor version.
	// - Manual: Instances are forcibly upgraded to a higher minor version when the current version is unpublished.
	AutoUpgradeMinorVersion pulumi.StringPtrInput
	// The storage type of the instance. Valid values:
	// - local_ssd: specifies to use local SSDs. This value is recommended.
	// - cloud_ssd: specifies to use standard SSDs.
	// - cloud_essd: specifies to use enhanced SSDs (ESSDs).
	// - cloud_essd2: specifies to use enhanced SSDs (ESSDs).
	// - cloud_essd3: specifies to use enhanced SSDs (ESSDs).
	DbInstanceStorageType pulumi.StringPtrInput
	// Database type. Value options: MySQL, SQLServer, PostgreSQL, and PPAS.
	Engine pulumi.StringInput
	// Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
	EngineVersion pulumi.StringInput
	// Set it to true to make some parameter efficient when modifying them. Default to false.
	ForceRestart pulumi.BoolPtrInput
	// Valid values are `Prepaid`, `Postpaid`, Default to `Postpaid`. Currently, the resource only supports PostPaid to PrePaid.
	InstanceChargeType pulumi.StringPtrInput
	// The name of DB instance. It a string of 2 to 256 characters.
	InstanceName pulumi.StringPtrInput
	// User-defined DB instance storage space. Value range:
	// - [5, 2000] for MySQL/PostgreSQL/PPAS HA dual node edition;
	// - [20,1000] for MySQL 5.7 basic single node edition;
	// - [10, 2000] for SQL Server 2008R2;
	// - [20,2000] for SQL Server 2012 basic single node edition
	//   Increase progressively at a rate of 5 GB. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
	//   Note: There is extra 5 GB storage for SQL Server Instance and it is not in specified `instanceStorage`.
	InstanceStorage pulumi.IntInput
	// DB Instance type. For details, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/26312.htm).
	InstanceType pulumi.StringInput
	// Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
	MaintainTime pulumi.StringPtrInput
	// The monitoring frequency in seconds. Valid values are 5, 60, 300. Defaults to 300.
	MonitoringPeriod pulumi.IntPtrInput
	// Set of parameters needs to be set after DB instance was launched. Available parameters can refer to the latest docs [View database parameter templates](https://www.alibabacloud.com/help/doc-detail/26284.htm) .
	Parameters InstanceParameterArrayInput
	// The duration that you will buy DB instance (in month). It is valid when instanceChargeType is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
	Period pulumi.IntPtrInput
	// The ID of resource group which the DB instance belongs.
	ResourceGroupId pulumi.StringPtrInput
	// It has been deprecated from 1.69.0 and use `securityGroupIds` instead.
	//
	// Deprecated: Attribute `security_group_id` has been deprecated from 1.69.0 and use `security_group_ids` instead.
	SecurityGroupId pulumi.StringPtrInput
	// , Available in 1.69.0+) The list IDs to join ECS Security Group. At most supports three security groups.
	SecurityGroupIds pulumi.StringArrayInput
	// Valid values are `normal`, `safety`, Default to `normal`. support `safety` switch to high security access mode
	SecurityIpMode pulumi.StringPtrInput
	// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
	SecurityIps pulumi.StringArrayInput
	// The sql collector keep time of the instance. Valid values are `30`, `180`, `365`, `1095`, `1825`, Default to `30`.
	SqlCollectorConfigValue pulumi.IntPtrInput
	// The sql collector status of the instance. Valid values are `Enabled`, `Disabled`, Default to `Disabled`.
	SqlCollectorStatus pulumi.StringPtrInput
	// Actions performed on SSL functions, Valid values: `Open`: turn on SSL encryption; `Close`: turn off SSL encryption; `Update`: update SSL certificate. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26254.htm).
	SslAction pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
	// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
	Tags pulumi.MapInput
	// The TDE(Transparent Data Encryption) status. See more [engine and engineVersion limitation](https://www.alibabacloud.com/help/zh/doc-detail/26256.htm).
	TdeStatus pulumi.StringPtrInput
	// The virtual switch ID to launch DB instances in one VPC. If there are multiple vswitches, separate them with commas.
	VswitchId pulumi.StringPtrInput
	// The Zone to launch the DB instance. From version 1.8.1, it supports multiple zone.
	// If it is a multi-zone and `vswitchId` is specified, the vswitch must in the one of them.
	// The multiple zone ID can be retrieved by setting `multi` to "true" in the data source `getZones`.
	ZoneId pulumi.StringPtrInput
	// The region ID of the secondary instance if you create a secondary instance. If you set this parameter to the same value as the ZoneId parameter, the instance is deployed in a single zone. Otherwise, the instance is deployed in multiple zones.
	ZoneIdSlaveA pulumi.StringPtrInput
	// The region ID of the log instance if you create a log instance. If you set this parameter to the same value as the ZoneId parameter, the instance is deployed in a single zone. Otherwise, the instance is deployed in multiple zones.
	ZoneIdSlaveB pulumi.StringPtrInput
}

func (InstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceArgs)(nil)).Elem()
}

type InstanceInput interface {
	pulumi.Input

	ToInstanceOutput() InstanceOutput
	ToInstanceOutputWithContext(ctx context.Context) InstanceOutput
}

func (Instance) ElementType() reflect.Type {
	return reflect.TypeOf((*Instance)(nil)).Elem()
}

func (i Instance) ToInstanceOutput() InstanceOutput {
	return i.ToInstanceOutputWithContext(context.Background())
}

func (i Instance) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceOutput)
}

type InstanceOutput struct {
	*pulumi.OutputState
}

func (InstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*InstanceOutput)(nil)).Elem()
}

func (o InstanceOutput) ToInstanceOutput() InstanceOutput {
	return o
}

func (o InstanceOutput) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(InstanceOutput{})
}
