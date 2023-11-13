// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kvstore

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the KVStore instance classes resource available info of Alibaba Cloud.
//
// > **NOTE:** Available since v1.49.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/kvstore"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			resourcesZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("KVStore"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			resourcesInstanceClasses, err := kvstore.GetInstanceClasses(ctx, &kvstore.GetInstanceClassesArgs{
//				Engine:             pulumi.StringRef("Redis"),
//				EngineVersion:      pulumi.StringRef("5.0"),
//				InstanceChargeType: pulumi.StringRef("PrePaid"),
//				OutputFile:         pulumi.StringRef("./classes.txt"),
//				ZoneId:             resourcesZones.Zones[0].Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstKvstoreInstanceClass", resourcesInstanceClasses.InstanceClasses)
//			return nil
//		})
//	}
//
// ```
func GetInstanceClasses(ctx *pulumi.Context, args *GetInstanceClassesArgs, opts ...pulumi.InvokeOption) (*GetInstanceClassesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInstanceClassesResult
	err := ctx.Invoke("alicloud:kvstore/getInstanceClasses:getInstanceClasses", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstanceClasses.
type GetInstanceClassesArgs struct {
	// The KVStore instance system architecture required by the user. Valid values: `standard`, `cluster` and `rwsplit`.
	Architecture *string `pulumi:"architecture"`
	// The KVStore instance edition type required by the user. Valid values: `Community` and `Enterprise`.
	EditionType *string `pulumi:"editionType"`
	// Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
	Engine *string `pulumi:"engine"`
	// Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
	EngineVersion *string `pulumi:"engineVersion"`
	// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// The KVStore instance node type required by the user. Valid values: `double`, `single`, `readone`, `readthree` and `readfive`.
	NodeType *string `pulumi:"nodeType"`
	// File name where to save data source results (after running `pulumi up`).
	OutputFile *string `pulumi:"outputFile"`
	// It has been deprecated from 1.68.0.
	//
	// Deprecated: The parameter 'package_type' has been deprecated from 1.68.0.
	PackageType *string `pulumi:"packageType"`
	// It has been deprecated from 1.68.0.
	//
	// Deprecated: The parameter 'performance_type' has been deprecated from 1.68.0.
	PerformanceType *string `pulumi:"performanceType"`
	ProductType     *string `pulumi:"productType"`
	// The KVStore instance series type required by the user. Valid values: `enhancedPerformanceType` and `hybridStorage`.
	SeriesType *string `pulumi:"seriesType"`
	// The number of shard.Valid values: `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`.
	// * productType - (Optional, Available since 1.130.0) The type of the service. Valid values:
	// * Local: an ApsaraDB for Redis instance with a local disk.
	// * OnECS: an ApsaraDB for Redis instance with a standard disk. This type is available only on the Alibaba Cloud China site.
	ShardNumber *int    `pulumi:"shardNumber"`
	SortedBy    *string `pulumi:"sortedBy"`
	// It has been deprecated from 1.68.0.
	//
	// Deprecated: The parameter 'storage_type' has been deprecated from 1.68.0.
	StorageType *string `pulumi:"storageType"`
	// The Zone to launch the KVStore instance.
	ZoneId string `pulumi:"zoneId"`
}

// A collection of values returned by getInstanceClasses.
type GetInstanceClassesResult struct {
	Architecture *string `pulumi:"architecture"`
	// A list of KVStore available instance classes when the `sortedBy` is "Price". include:
	Classes       []GetInstanceClassesClass `pulumi:"classes"`
	EditionType   *string                   `pulumi:"editionType"`
	Engine        *string                   `pulumi:"engine"`
	EngineVersion *string                   `pulumi:"engineVersion"`
	// The provider-assigned unique ID for this managed resource.
	Id                 string  `pulumi:"id"`
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// A list of KVStore available instance classes.
	InstanceClasses []string `pulumi:"instanceClasses"`
	NodeType        *string  `pulumi:"nodeType"`
	OutputFile      *string  `pulumi:"outputFile"`
	// Deprecated: The parameter 'package_type' has been deprecated from 1.68.0.
	PackageType *string `pulumi:"packageType"`
	// Deprecated: The parameter 'performance_type' has been deprecated from 1.68.0.
	PerformanceType *string `pulumi:"performanceType"`
	ProductType     *string `pulumi:"productType"`
	SeriesType      *string `pulumi:"seriesType"`
	ShardNumber     *int    `pulumi:"shardNumber"`
	SortedBy        *string `pulumi:"sortedBy"`
	// Deprecated: The parameter 'storage_type' has been deprecated from 1.68.0.
	StorageType *string `pulumi:"storageType"`
	ZoneId      string  `pulumi:"zoneId"`
}

func GetInstanceClassesOutput(ctx *pulumi.Context, args GetInstanceClassesOutputArgs, opts ...pulumi.InvokeOption) GetInstanceClassesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetInstanceClassesResult, error) {
			args := v.(GetInstanceClassesArgs)
			r, err := GetInstanceClasses(ctx, &args, opts...)
			var s GetInstanceClassesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetInstanceClassesResultOutput)
}

// A collection of arguments for invoking getInstanceClasses.
type GetInstanceClassesOutputArgs struct {
	// The KVStore instance system architecture required by the user. Valid values: `standard`, `cluster` and `rwsplit`.
	Architecture pulumi.StringPtrInput `pulumi:"architecture"`
	// The KVStore instance edition type required by the user. Valid values: `Community` and `Enterprise`.
	EditionType pulumi.StringPtrInput `pulumi:"editionType"`
	// Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
	Engine pulumi.StringPtrInput `pulumi:"engine"`
	// Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
	EngineVersion pulumi.StringPtrInput `pulumi:"engineVersion"`
	// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
	InstanceChargeType pulumi.StringPtrInput `pulumi:"instanceChargeType"`
	// The KVStore instance node type required by the user. Valid values: `double`, `single`, `readone`, `readthree` and `readfive`.
	NodeType pulumi.StringPtrInput `pulumi:"nodeType"`
	// File name where to save data source results (after running `pulumi up`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// It has been deprecated from 1.68.0.
	//
	// Deprecated: The parameter 'package_type' has been deprecated from 1.68.0.
	PackageType pulumi.StringPtrInput `pulumi:"packageType"`
	// It has been deprecated from 1.68.0.
	//
	// Deprecated: The parameter 'performance_type' has been deprecated from 1.68.0.
	PerformanceType pulumi.StringPtrInput `pulumi:"performanceType"`
	ProductType     pulumi.StringPtrInput `pulumi:"productType"`
	// The KVStore instance series type required by the user. Valid values: `enhancedPerformanceType` and `hybridStorage`.
	SeriesType pulumi.StringPtrInput `pulumi:"seriesType"`
	// The number of shard.Valid values: `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`.
	// * productType - (Optional, Available since 1.130.0) The type of the service. Valid values:
	// * Local: an ApsaraDB for Redis instance with a local disk.
	// * OnECS: an ApsaraDB for Redis instance with a standard disk. This type is available only on the Alibaba Cloud China site.
	ShardNumber pulumi.IntPtrInput    `pulumi:"shardNumber"`
	SortedBy    pulumi.StringPtrInput `pulumi:"sortedBy"`
	// It has been deprecated from 1.68.0.
	//
	// Deprecated: The parameter 'storage_type' has been deprecated from 1.68.0.
	StorageType pulumi.StringPtrInput `pulumi:"storageType"`
	// The Zone to launch the KVStore instance.
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
}

func (GetInstanceClassesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceClassesArgs)(nil)).Elem()
}

// A collection of values returned by getInstanceClasses.
type GetInstanceClassesResultOutput struct{ *pulumi.OutputState }

func (GetInstanceClassesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceClassesResult)(nil)).Elem()
}

func (o GetInstanceClassesResultOutput) ToGetInstanceClassesResultOutput() GetInstanceClassesResultOutput {
	return o
}

func (o GetInstanceClassesResultOutput) ToGetInstanceClassesResultOutputWithContext(ctx context.Context) GetInstanceClassesResultOutput {
	return o
}

func (o GetInstanceClassesResultOutput) Architecture() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.Architecture }).(pulumi.StringPtrOutput)
}

// A list of KVStore available instance classes when the `sortedBy` is "Price". include:
func (o GetInstanceClassesResultOutput) Classes() GetInstanceClassesClassArrayOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) []GetInstanceClassesClass { return v.Classes }).(GetInstanceClassesClassArrayOutput)
}

func (o GetInstanceClassesResultOutput) EditionType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.EditionType }).(pulumi.StringPtrOutput)
}

func (o GetInstanceClassesResultOutput) Engine() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.Engine }).(pulumi.StringPtrOutput)
}

func (o GetInstanceClassesResultOutput) EngineVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.EngineVersion }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetInstanceClassesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetInstanceClassesResultOutput) InstanceChargeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.InstanceChargeType }).(pulumi.StringPtrOutput)
}

// A list of KVStore available instance classes.
func (o GetInstanceClassesResultOutput) InstanceClasses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) []string { return v.InstanceClasses }).(pulumi.StringArrayOutput)
}

func (o GetInstanceClassesResultOutput) NodeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.NodeType }).(pulumi.StringPtrOutput)
}

func (o GetInstanceClassesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// Deprecated: The parameter 'package_type' has been deprecated from 1.68.0.
func (o GetInstanceClassesResultOutput) PackageType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.PackageType }).(pulumi.StringPtrOutput)
}

// Deprecated: The parameter 'performance_type' has been deprecated from 1.68.0.
func (o GetInstanceClassesResultOutput) PerformanceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.PerformanceType }).(pulumi.StringPtrOutput)
}

func (o GetInstanceClassesResultOutput) ProductType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.ProductType }).(pulumi.StringPtrOutput)
}

func (o GetInstanceClassesResultOutput) SeriesType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.SeriesType }).(pulumi.StringPtrOutput)
}

func (o GetInstanceClassesResultOutput) ShardNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *int { return v.ShardNumber }).(pulumi.IntPtrOutput)
}

func (o GetInstanceClassesResultOutput) SortedBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.SortedBy }).(pulumi.StringPtrOutput)
}

// Deprecated: The parameter 'storage_type' has been deprecated from 1.68.0.
func (o GetInstanceClassesResultOutput) StorageType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.StorageType }).(pulumi.StringPtrOutput)
}

func (o GetInstanceClassesResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstanceClassesResultOutput{})
}
