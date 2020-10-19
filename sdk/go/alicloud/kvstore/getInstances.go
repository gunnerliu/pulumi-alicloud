// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package kvstore

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// The `kvstore.getInstances` data source provides a collection of kvstore instances available in Alicloud account.
// Filters support regular expression for the instance name, searches by tags, and other filters which are listed below.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/kvstore"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "testname"
// 		_default, err := kvstore.GetInstances(ctx, &kvstore.GetInstancesArgs{
// 			NameRegex: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstInstanceName", _default.Instances[0].Name)
// 		return nil
// 	})
// }
// ```
func GetInstances(ctx *pulumi.Context, args *GetInstancesArgs, opts ...pulumi.InvokeOption) (*GetInstancesResult, error) {
	var rv GetInstancesResult
	err := ctx.Invoke("alicloud:kvstore/getInstances:getInstances", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstances.
type GetInstancesArgs struct {
	// The type of the architecture. Valid values: `cluster`, `standard` and `SplitRW`.
	ArchitectureType *string `pulumi:"architectureType"`
	// Used to retrieve instances belong to specified `vswitch` resources.
	EditionType *string `pulumi:"editionType"`
	// Default to `false`. Set it to true can output more details.
	EnableDetails *bool `pulumi:"enableDetails"`
	// The engine version. Valid values: `2.8`, `4.0`, `5.0`, `6.0`.
	EngineVersion *string `pulumi:"engineVersion"`
	// The expiration status of the instance.
	Expired *string `pulumi:"expired"`
	// Whether to create a distributed cache.
	GlobalInstance *bool `pulumi:"globalInstance"`
	// A list of KVStore DBInstance IDs.
	Ids []string `pulumi:"ids"`
	// Type of the applied ApsaraDB for Redis instance. For more information, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/61135.htm).
	InstanceClass *string `pulumi:"instanceClass"`
	// The engine type of the KVStore DBInstance. Options are `Memcache`, and `Redis`. If no value is specified, all types are returned.
	InstanceType *string `pulumi:"instanceType"`
	// A regex string to apply to the instance name.
	NameRegex *string `pulumi:"nameRegex"`
	// The type of the network. Valid values: `CLASSIC`, `VPC`.
	NetworkType *string `pulumi:"networkType"`
	OutputFile  *string `pulumi:"outputFile"`
	// The payment type. Valid values: `PostPaid`, `PrePaid`.
	PaymentType *string `pulumi:"paymentType"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The name of the instance.
	SearchKey *string `pulumi:"searchKey"`
	// The status of the KVStore DBInstance. Valid values: `Changing`, `CleaningUpExpiredData`, `Creating`, `Flushing`, `HASwitching`, `Inactive`, `MajorVersionUpgrading`, `Migrating`, `NetworkModifying`, `Normal`, `Rebooting`, `SSLModifying`, `Transforming`, `ZoneMigrating`.
	Status *string `pulumi:"status"`
	// Query the instance bound to the tag. The format of the incoming value is `json` string, including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `{"key1":"value1"}`.
	Tags map[string]interface{} `pulumi:"tags"`
	// Used to retrieve instances belong to specified VPC.
	VpcId *string `pulumi:"vpcId"`
	// Used to retrieve instances belong to specified `vswitch` resources.
	VswitchId *string `pulumi:"vswitchId"`
	// The ID of the zone.
	ZoneId *string `pulumi:"zoneId"`
}

// A collection of values returned by getInstances.
type GetInstancesResult struct {
	ArchitectureType *string `pulumi:"architectureType"`
	EditionType      *string `pulumi:"editionType"`
	EnableDetails    *bool   `pulumi:"enableDetails"`
	// The engine version of the instance.
	EngineVersion  *string `pulumi:"engineVersion"`
	Expired        *string `pulumi:"expired"`
	GlobalInstance *bool   `pulumi:"globalInstance"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of KVStore Instance IDs.
	Ids           []string `pulumi:"ids"`
	InstanceClass *string  `pulumi:"instanceClass"`
	// (Optional) Database type. Valid Values: `Memcache`, `Redis`. If no value is specified, all types are returned.
	// * `instanceClass`- (Optional) Type of the applied ApsaraDB for instance.
	//   For more information, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/61135.htm).
	InstanceType *string `pulumi:"instanceType"`
	// A list of KVStore Instances. Its every element contains the following attributes:
	Instances []GetInstancesInstance `pulumi:"instances"`
	NameRegex *string                `pulumi:"nameRegex"`
	// A list of KVStore Instance names.
	Names []string `pulumi:"names"`
	// The network type of the instance.
	NetworkType *string `pulumi:"networkType"`
	OutputFile  *string `pulumi:"outputFile"`
	// Billing method. Valid Values: `PostPaid` for  Pay-As-You-Go and `PrePaid` for subscription.
	PaymentType     *string `pulumi:"paymentType"`
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	SearchKey       *string `pulumi:"searchKey"`
	// Status of the instance.
	Status *string                `pulumi:"status"`
	Tags   map[string]interface{} `pulumi:"tags"`
	// VPC ID the instance belongs to.
	VpcId *string `pulumi:"vpcId"`
	// VSwitch ID the instance belongs to.
	VswitchId *string `pulumi:"vswitchId"`
	// The ID of zone.
	ZoneId *string `pulumi:"zoneId"`
}
