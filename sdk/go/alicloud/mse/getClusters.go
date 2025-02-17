// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mse

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list of MSE Clusters in an Alibaba Cloud account according to the specified filters.
//
// > **NOTE:** Available in v1.94.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/mse"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := mse.GetClusters(ctx, &mse.GetClustersArgs{
//				Ids: []string{
//					"mse-cn-0d9xxxx",
//				},
//				Status: pulumi.StringRef("INIT_SUCCESS"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("clusterId", example.Clusters[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetClusters(ctx *pulumi.Context, args *GetClustersArgs, opts ...pulumi.InvokeOption) (*GetClustersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetClustersResult
	err := ctx.Invoke("alicloud:mse/getClusters:getClusters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusters.
type GetClustersArgs struct {
	// The alias name of MSE Cluster.
	ClusterAliasName *string `pulumi:"clusterAliasName"`
	EnableDetails    *bool   `pulumi:"enableDetails"`
	// A list of MSE Cluster ids.
	Ids []string `pulumi:"ids"`
	// A regex string to filter the results by the cluster alias name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile  *string `pulumi:"outputFile"`
	RequestPars *string `pulumi:"requestPars"`
	// The status of MSE Cluster. Valid: `DESTROY_FAILED`, `DESTROY_ING`, `DESTROY_SUCCESS`, `INIT_FAILED`, `INIT_ING`, `INIT_SUCCESS`, `INIT_TIME_OUT`, `RESTART_FAILED`, `RESTART_ING`, `RESTART_SUCCESS`, `SCALE_FAILED`, `SCALE_ING`, `SCALE_SUCCESS`
	Status *string `pulumi:"status"`
}

// A collection of values returned by getClusters.
type GetClustersResult struct {
	ClusterAliasName *string `pulumi:"clusterAliasName"`
	// A list of MSE Clusters. Each element contains the following attributes:
	Clusters      []GetClustersCluster `pulumi:"clusters"`
	EnableDetails *bool                `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of MSE Cluster ids.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of MSE Cluster names.
	Names       []string `pulumi:"names"`
	OutputFile  *string  `pulumi:"outputFile"`
	RequestPars *string  `pulumi:"requestPars"`
	// The status of MSE Cluster.
	Status *string `pulumi:"status"`
}

func GetClustersOutput(ctx *pulumi.Context, args GetClustersOutputArgs, opts ...pulumi.InvokeOption) GetClustersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetClustersResult, error) {
			args := v.(GetClustersArgs)
			r, err := GetClusters(ctx, &args, opts...)
			var s GetClustersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetClustersResultOutput)
}

// A collection of arguments for invoking getClusters.
type GetClustersOutputArgs struct {
	// The alias name of MSE Cluster.
	ClusterAliasName pulumi.StringPtrInput `pulumi:"clusterAliasName"`
	EnableDetails    pulumi.BoolPtrInput   `pulumi:"enableDetails"`
	// A list of MSE Cluster ids.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter the results by the cluster alias name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile  pulumi.StringPtrInput `pulumi:"outputFile"`
	RequestPars pulumi.StringPtrInput `pulumi:"requestPars"`
	// The status of MSE Cluster. Valid: `DESTROY_FAILED`, `DESTROY_ING`, `DESTROY_SUCCESS`, `INIT_FAILED`, `INIT_ING`, `INIT_SUCCESS`, `INIT_TIME_OUT`, `RESTART_FAILED`, `RESTART_ING`, `RESTART_SUCCESS`, `SCALE_FAILED`, `SCALE_ING`, `SCALE_SUCCESS`
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetClustersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClustersArgs)(nil)).Elem()
}

// A collection of values returned by getClusters.
type GetClustersResultOutput struct{ *pulumi.OutputState }

func (GetClustersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClustersResult)(nil)).Elem()
}

func (o GetClustersResultOutput) ToGetClustersResultOutput() GetClustersResultOutput {
	return o
}

func (o GetClustersResultOutput) ToGetClustersResultOutputWithContext(ctx context.Context) GetClustersResultOutput {
	return o
}

func (o GetClustersResultOutput) ClusterAliasName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.ClusterAliasName }).(pulumi.StringPtrOutput)
}

// A list of MSE Clusters. Each element contains the following attributes:
func (o GetClustersResultOutput) Clusters() GetClustersClusterArrayOutput {
	return o.ApplyT(func(v GetClustersResult) []GetClustersCluster { return v.Clusters }).(GetClustersClusterArrayOutput)
}

func (o GetClustersResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetClustersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetClustersResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of MSE Cluster ids.
func (o GetClustersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetClustersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetClustersResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of MSE Cluster names.
func (o GetClustersResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetClustersResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetClustersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetClustersResultOutput) RequestPars() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.RequestPars }).(pulumi.StringPtrOutput)
}

// The status of MSE Cluster.
func (o GetClustersResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetClustersResultOutput{})
}
