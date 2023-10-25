// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package clickhouse

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Click House DBCluster of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.134.0+.
func GetDbClusters(ctx *pulumi.Context, args *GetDbClustersArgs, opts ...pulumi.InvokeOption) (*GetDbClustersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDbClustersResult
	err := ctx.Invoke("alicloud:clickhouse/getDbClusters:getDbClusters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDbClusters.
type GetDbClustersArgs struct {
	// The DBCluster description.
	DbClusterDescription *string `pulumi:"dbClusterDescription"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of DBCluster IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the DBCluster. Valid values: `Running`,`Creating`,`Deleting`,`Restarting`,`Preparing`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getDbClusters.
type GetDbClustersResult struct {
	Clusters             []GetDbClustersCluster `pulumi:"clusters"`
	DbClusterDescription *string                `pulumi:"dbClusterDescription"`
	EnableDetails        *bool                  `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	Status     *string  `pulumi:"status"`
}

func GetDbClustersOutput(ctx *pulumi.Context, args GetDbClustersOutputArgs, opts ...pulumi.InvokeOption) GetDbClustersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDbClustersResult, error) {
			args := v.(GetDbClustersArgs)
			r, err := GetDbClusters(ctx, &args, opts...)
			var s GetDbClustersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDbClustersResultOutput)
}

// A collection of arguments for invoking getDbClusters.
type GetDbClustersOutputArgs struct {
	// The DBCluster description.
	DbClusterDescription pulumi.StringPtrInput `pulumi:"dbClusterDescription"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of DBCluster IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the DBCluster. Valid values: `Running`,`Creating`,`Deleting`,`Restarting`,`Preparing`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetDbClustersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDbClustersArgs)(nil)).Elem()
}

// A collection of values returned by getDbClusters.
type GetDbClustersResultOutput struct{ *pulumi.OutputState }

func (GetDbClustersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDbClustersResult)(nil)).Elem()
}

func (o GetDbClustersResultOutput) ToGetDbClustersResultOutput() GetDbClustersResultOutput {
	return o
}

func (o GetDbClustersResultOutput) ToGetDbClustersResultOutputWithContext(ctx context.Context) GetDbClustersResultOutput {
	return o
}

func (o GetDbClustersResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetDbClustersResult] {
	return pulumix.Output[GetDbClustersResult]{
		OutputState: o.OutputState,
	}
}

func (o GetDbClustersResultOutput) Clusters() GetDbClustersClusterArrayOutput {
	return o.ApplyT(func(v GetDbClustersResult) []GetDbClustersCluster { return v.Clusters }).(GetDbClustersClusterArrayOutput)
}

func (o GetDbClustersResultOutput) DbClusterDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDbClustersResult) *string { return v.DbClusterDescription }).(pulumi.StringPtrOutput)
}

func (o GetDbClustersResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetDbClustersResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDbClustersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbClustersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDbClustersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDbClustersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetDbClustersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDbClustersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetDbClustersResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDbClustersResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDbClustersResultOutput{})
}
