// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package emr

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The `emr.getDiskTypes` data source provides a collection of data disk and
// system disk types available in Alibaba Cloud account when create a emr cluster.
//
// > **NOTE:** Available in 1.60.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/emr"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := emr.GetDiskTypes(ctx, &emr.GetDiskTypesArgs{
//				ClusterType:         "HADOOP",
//				DestinationResource: "DataDisk",
//				InstanceChargeType:  "PostPaid",
//				InstanceType:        "ecs.g5.xlarge",
//				ZoneId:              pulumi.StringRef("cn-huhehaote-a"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("dataDiskType", _default.Types[0].Value)
//			return nil
//		})
//	}
//
// ```
func GetDiskTypes(ctx *pulumi.Context, args *GetDiskTypesArgs, opts ...pulumi.InvokeOption) (*GetDiskTypesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDiskTypesResult
	err := ctx.Invoke("alicloud:emr/getDiskTypes:getDiskTypes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDiskTypes.
type GetDiskTypesArgs struct {
	// The cluster type of the emr cluster instance. Possible values: `HADOOP`, `KAFKA`, `ZOOKEEPER`, `DRUID`.
	ClusterType string `pulumi:"clusterType"`
	// The destination resource of emr cluster instance
	DestinationResource string `pulumi:"destinationResource"`
	// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
	InstanceChargeType string `pulumi:"instanceChargeType"`
	// The ecs instance type of create emr cluster instance.
	InstanceType string `pulumi:"instanceType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The Zone to create emr cluster instance.
	ZoneId *string `pulumi:"zoneId"`
}

// A collection of values returned by getDiskTypes.
type GetDiskTypesResult struct {
	ClusterType         string `pulumi:"clusterType"`
	DestinationResource string `pulumi:"destinationResource"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of data disk and system disk type IDs.
	Ids                []string `pulumi:"ids"`
	InstanceChargeType string   `pulumi:"instanceChargeType"`
	InstanceType       string   `pulumi:"instanceType"`
	OutputFile         *string  `pulumi:"outputFile"`
	// A list of emr instance types. Each element contains the following attributes:
	Types  []GetDiskTypesType `pulumi:"types"`
	ZoneId *string            `pulumi:"zoneId"`
}

func GetDiskTypesOutput(ctx *pulumi.Context, args GetDiskTypesOutputArgs, opts ...pulumi.InvokeOption) GetDiskTypesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDiskTypesResult, error) {
			args := v.(GetDiskTypesArgs)
			r, err := GetDiskTypes(ctx, &args, opts...)
			var s GetDiskTypesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDiskTypesResultOutput)
}

// A collection of arguments for invoking getDiskTypes.
type GetDiskTypesOutputArgs struct {
	// The cluster type of the emr cluster instance. Possible values: `HADOOP`, `KAFKA`, `ZOOKEEPER`, `DRUID`.
	ClusterType pulumi.StringInput `pulumi:"clusterType"`
	// The destination resource of emr cluster instance
	DestinationResource pulumi.StringInput `pulumi:"destinationResource"`
	// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
	InstanceChargeType pulumi.StringInput `pulumi:"instanceChargeType"`
	// The ecs instance type of create emr cluster instance.
	InstanceType pulumi.StringInput `pulumi:"instanceType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The Zone to create emr cluster instance.
	ZoneId pulumi.StringPtrInput `pulumi:"zoneId"`
}

func (GetDiskTypesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDiskTypesArgs)(nil)).Elem()
}

// A collection of values returned by getDiskTypes.
type GetDiskTypesResultOutput struct{ *pulumi.OutputState }

func (GetDiskTypesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDiskTypesResult)(nil)).Elem()
}

func (o GetDiskTypesResultOutput) ToGetDiskTypesResultOutput() GetDiskTypesResultOutput {
	return o
}

func (o GetDiskTypesResultOutput) ToGetDiskTypesResultOutputWithContext(ctx context.Context) GetDiskTypesResultOutput {
	return o
}

func (o GetDiskTypesResultOutput) ClusterType() pulumi.StringOutput {
	return o.ApplyT(func(v GetDiskTypesResult) string { return v.ClusterType }).(pulumi.StringOutput)
}

func (o GetDiskTypesResultOutput) DestinationResource() pulumi.StringOutput {
	return o.ApplyT(func(v GetDiskTypesResult) string { return v.DestinationResource }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDiskTypesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDiskTypesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of data disk and system disk type IDs.
func (o GetDiskTypesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDiskTypesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetDiskTypesResultOutput) InstanceChargeType() pulumi.StringOutput {
	return o.ApplyT(func(v GetDiskTypesResult) string { return v.InstanceChargeType }).(pulumi.StringOutput)
}

func (o GetDiskTypesResultOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v GetDiskTypesResult) string { return v.InstanceType }).(pulumi.StringOutput)
}

func (o GetDiskTypesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDiskTypesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of emr instance types. Each element contains the following attributes:
func (o GetDiskTypesResultOutput) Types() GetDiskTypesTypeArrayOutput {
	return o.ApplyT(func(v GetDiskTypesResult) []GetDiskTypesType { return v.Types }).(GetDiskTypesTypeArrayOutput)
}

func (o GetDiskTypesResultOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDiskTypesResult) *string { return v.ZoneId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDiskTypesResultOutput{})
}
