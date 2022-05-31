// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the RDS instance classes resource available info of Alibaba Cloud.
//
// > **NOTE:** Available in v1.46.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/rds"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		resources, err := rds.GetInstanceClasses(ctx, &rds.GetInstanceClassesArgs{
// 			Engine:             pulumi.StringRef("MySQL"),
// 			EngineVersion:      pulumi.StringRef("5.6"),
// 			InstanceChargeType: pulumi.StringRef("PostPaid"),
// 			OutputFile:         pulumi.StringRef("./classes.txt"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstDbInstanceClass", resources.InstanceClasses[0].InstanceClass)
// 		return nil
// 	})
// }
// ```
func GetInstanceClasses(ctx *pulumi.Context, args *GetInstanceClassesArgs, opts ...pulumi.InvokeOption) (*GetInstanceClassesResult, error) {
	var rv GetInstanceClassesResult
	err := ctx.Invoke("alicloud:rds/getInstanceClasses:getInstanceClasses", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstanceClasses.
type GetInstanceClassesArgs struct {
	// DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
	Category *string `pulumi:"category"`
	// The commodity code of the instance. Valid values:
	// * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
	// * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
	// * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
	// * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
	// * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
	// * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
	// * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
	// * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
	CommodityCode *string `pulumi:"commodityCode"`
	// The DB instance class type by the user.
	DbInstanceClass *string `pulumi:"dbInstanceClass"`
	// The ID of the instance.
	DbInstanceId *string `pulumi:"dbInstanceId"`
	// The DB instance storage space required by the user. Valid values: "cloudSsd", "localSsd", "cloudEssd", "cloudEssd2", "cloudEssd3".
	DbInstanceStorageType *string `pulumi:"dbInstanceStorageType"`
	// Database type. Valid values:"MySQL", "SQLServer", "PostgreSQL", "PPAS", "MariaDB". If not set, it will match all of engines.
	Engine *string `pulumi:"engine"`
	// Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
	EngineVersion *string `pulumi:"engineVersion"`
	// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// Whether to show multi available zone. Default false to not show multi availability zone.
	MultiZone  *bool   `pulumi:"multiZone"`
	OutputFile *string `pulumi:"outputFile"`
	SortedBy   *string `pulumi:"sortedBy"`
	// It has been deprecated from version 1.134.0+ and using `dbInstanceStorageType` instead.
	StorageType *string `pulumi:"storageType"`
	// The Zone to launch the DB instance.
	ZoneId *string `pulumi:"zoneId"`
}

// A collection of values returned by getInstanceClasses.
type GetInstanceClassesResult struct {
	Category              *string `pulumi:"category"`
	CommodityCode         *string `pulumi:"commodityCode"`
	DbInstanceClass       *string `pulumi:"dbInstanceClass"`
	DbInstanceId          *string `pulumi:"dbInstanceId"`
	DbInstanceStorageType *string `pulumi:"dbInstanceStorageType"`
	Engine                *string `pulumi:"engine"`
	EngineVersion         *string `pulumi:"engineVersion"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Available in 1.60.0+) A list of Rds instance class codes.
	Ids                []string `pulumi:"ids"`
	InstanceChargeType *string  `pulumi:"instanceChargeType"`
	// A list of Rds available resource. Each element contains the following attributes:
	InstanceClasses []GetInstanceClassesInstanceClass `pulumi:"instanceClasses"`
	MultiZone       *bool                             `pulumi:"multiZone"`
	OutputFile      *string                           `pulumi:"outputFile"`
	SortedBy        *string                           `pulumi:"sortedBy"`
	StorageType     *string                           `pulumi:"storageType"`
	ZoneId          *string                           `pulumi:"zoneId"`
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
	// DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
	Category pulumi.StringPtrInput `pulumi:"category"`
	// The commodity code of the instance. Valid values:
	// * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
	// * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
	// * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
	// * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
	// * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
	// * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
	// * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
	// * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
	CommodityCode pulumi.StringPtrInput `pulumi:"commodityCode"`
	// The DB instance class type by the user.
	DbInstanceClass pulumi.StringPtrInput `pulumi:"dbInstanceClass"`
	// The ID of the instance.
	DbInstanceId pulumi.StringPtrInput `pulumi:"dbInstanceId"`
	// The DB instance storage space required by the user. Valid values: "cloudSsd", "localSsd", "cloudEssd", "cloudEssd2", "cloudEssd3".
	DbInstanceStorageType pulumi.StringPtrInput `pulumi:"dbInstanceStorageType"`
	// Database type. Valid values:"MySQL", "SQLServer", "PostgreSQL", "PPAS", "MariaDB". If not set, it will match all of engines.
	Engine pulumi.StringPtrInput `pulumi:"engine"`
	// Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
	EngineVersion pulumi.StringPtrInput `pulumi:"engineVersion"`
	// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
	InstanceChargeType pulumi.StringPtrInput `pulumi:"instanceChargeType"`
	// Whether to show multi available zone. Default false to not show multi availability zone.
	MultiZone  pulumi.BoolPtrInput   `pulumi:"multiZone"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	SortedBy   pulumi.StringPtrInput `pulumi:"sortedBy"`
	// It has been deprecated from version 1.134.0+ and using `dbInstanceStorageType` instead.
	StorageType pulumi.StringPtrInput `pulumi:"storageType"`
	// The Zone to launch the DB instance.
	ZoneId pulumi.StringPtrInput `pulumi:"zoneId"`
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

func (o GetInstanceClassesResultOutput) Category() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.Category }).(pulumi.StringPtrOutput)
}

func (o GetInstanceClassesResultOutput) CommodityCode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.CommodityCode }).(pulumi.StringPtrOutput)
}

func (o GetInstanceClassesResultOutput) DbInstanceClass() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.DbInstanceClass }).(pulumi.StringPtrOutput)
}

func (o GetInstanceClassesResultOutput) DbInstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.DbInstanceId }).(pulumi.StringPtrOutput)
}

func (o GetInstanceClassesResultOutput) DbInstanceStorageType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.DbInstanceStorageType }).(pulumi.StringPtrOutput)
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

// (Available in 1.60.0+) A list of Rds instance class codes.
func (o GetInstanceClassesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetInstanceClassesResultOutput) InstanceChargeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.InstanceChargeType }).(pulumi.StringPtrOutput)
}

// A list of Rds available resource. Each element contains the following attributes:
func (o GetInstanceClassesResultOutput) InstanceClasses() GetInstanceClassesInstanceClassArrayOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) []GetInstanceClassesInstanceClass { return v.InstanceClasses }).(GetInstanceClassesInstanceClassArrayOutput)
}

func (o GetInstanceClassesResultOutput) MultiZone() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *bool { return v.MultiZone }).(pulumi.BoolPtrOutput)
}

func (o GetInstanceClassesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetInstanceClassesResultOutput) SortedBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.SortedBy }).(pulumi.StringPtrOutput)
}

func (o GetInstanceClassesResultOutput) StorageType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.StorageType }).(pulumi.StringPtrOutput)
}

func (o GetInstanceClassesResultOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceClassesResult) *string { return v.ZoneId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstanceClassesResultOutput{})
}
