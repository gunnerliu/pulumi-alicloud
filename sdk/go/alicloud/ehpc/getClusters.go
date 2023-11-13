// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ehpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Ehpc Clusters of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.173.0+.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ehpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := ehpc.GetClusters(ctx, &ehpc.GetClustersArgs{
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("ehpcClusterId1", ids.Clusters[0].Id)
//			nameRegex, err := ehpc.GetClusters(ctx, &ehpc.GetClustersArgs{
//				NameRegex: pulumi.StringRef("^my-Cluster"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("ehpcClusterId2", nameRegex.Clusters[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetClusters(ctx *pulumi.Context, args *GetClustersArgs, opts ...pulumi.InvokeOption) (*GetClustersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetClustersResult
	err := ctx.Invoke("alicloud:ehpc/getClusters:getClusters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusters.
type GetClustersArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Cluster IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Cluster name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the resource.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getClusters.
type GetClustersResult struct {
	Clusters      []GetClustersCluster `pulumi:"clusters"`
	EnableDetails *bool                `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	Status     *string  `pulumi:"status"`
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
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Cluster IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Cluster name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the resource.
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

func (o GetClustersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetClustersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetClustersResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetClustersResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetClustersResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetClustersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetClustersResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetClustersResultOutput{})
}
