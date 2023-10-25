// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides a list Container Service Serverless Kubernetes Clusters on Alibaba Cloud.
//
// > **NOTE:** Available in 1.58.0+
//
// > **NOTE:** From version 1.177.0+, We supported batch export of clusters' kube config information by `kubeConfigFilePrefix`.
func GetServerlessKubernetesClusters(ctx *pulumi.Context, args *GetServerlessKubernetesClustersArgs, opts ...pulumi.InvokeOption) (*GetServerlessKubernetesClustersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServerlessKubernetesClustersResult
	err := ctx.Invoke("alicloud:cs/getServerlessKubernetesClusters:getServerlessKubernetesClusters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServerlessKubernetesClusters.
type GetServerlessKubernetesClustersArgs struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// Cluster IDs to filter.
	Ids []string `pulumi:"ids"`
	// The path prefix of kube config. You could store kube config in a specified directory by specifying this field, like `~/.kube/serverless`, then it will be named with `~/.kube/serverless-clusterID-kubeconfig`. From version 1.187.0+, kubeConfig will not export kubeConfig if this field is not set.
	KubeConfigFilePrefix *string `pulumi:"kubeConfigFilePrefix"`
	// A regex string to filter results by cluster name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getServerlessKubernetesClusters.
type GetServerlessKubernetesClustersResult struct {
	// A list of matched Kubernetes clusters. Each element contains the following attributes:
	Clusters      []GetServerlessKubernetesClustersCluster `pulumi:"clusters"`
	EnableDetails *bool                                    `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of matched Kubernetes clusters' ids.
	Ids                  []string `pulumi:"ids"`
	KubeConfigFilePrefix *string  `pulumi:"kubeConfigFilePrefix"`
	NameRegex            *string  `pulumi:"nameRegex"`
	// A list of matched Kubernetes clusters' names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetServerlessKubernetesClustersOutput(ctx *pulumi.Context, args GetServerlessKubernetesClustersOutputArgs, opts ...pulumi.InvokeOption) GetServerlessKubernetesClustersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServerlessKubernetesClustersResult, error) {
			args := v.(GetServerlessKubernetesClustersArgs)
			r, err := GetServerlessKubernetesClusters(ctx, &args, opts...)
			var s GetServerlessKubernetesClustersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetServerlessKubernetesClustersResultOutput)
}

// A collection of arguments for invoking getServerlessKubernetesClusters.
type GetServerlessKubernetesClustersOutputArgs struct {
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// Cluster IDs to filter.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The path prefix of kube config. You could store kube config in a specified directory by specifying this field, like `~/.kube/serverless`, then it will be named with `~/.kube/serverless-clusterID-kubeconfig`. From version 1.187.0+, kubeConfig will not export kubeConfig if this field is not set.
	KubeConfigFilePrefix pulumi.StringPtrInput `pulumi:"kubeConfigFilePrefix"`
	// A regex string to filter results by cluster name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetServerlessKubernetesClustersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerlessKubernetesClustersArgs)(nil)).Elem()
}

// A collection of values returned by getServerlessKubernetesClusters.
type GetServerlessKubernetesClustersResultOutput struct{ *pulumi.OutputState }

func (GetServerlessKubernetesClustersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerlessKubernetesClustersResult)(nil)).Elem()
}

func (o GetServerlessKubernetesClustersResultOutput) ToGetServerlessKubernetesClustersResultOutput() GetServerlessKubernetesClustersResultOutput {
	return o
}

func (o GetServerlessKubernetesClustersResultOutput) ToGetServerlessKubernetesClustersResultOutputWithContext(ctx context.Context) GetServerlessKubernetesClustersResultOutput {
	return o
}

func (o GetServerlessKubernetesClustersResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetServerlessKubernetesClustersResult] {
	return pulumix.Output[GetServerlessKubernetesClustersResult]{
		OutputState: o.OutputState,
	}
}

// A list of matched Kubernetes clusters. Each element contains the following attributes:
func (o GetServerlessKubernetesClustersResultOutput) Clusters() GetServerlessKubernetesClustersClusterArrayOutput {
	return o.ApplyT(func(v GetServerlessKubernetesClustersResult) []GetServerlessKubernetesClustersCluster {
		return v.Clusters
	}).(GetServerlessKubernetesClustersClusterArrayOutput)
}

func (o GetServerlessKubernetesClustersResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetServerlessKubernetesClustersResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServerlessKubernetesClustersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServerlessKubernetesClustersResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of matched Kubernetes clusters' ids.
func (o GetServerlessKubernetesClustersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServerlessKubernetesClustersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetServerlessKubernetesClustersResultOutput) KubeConfigFilePrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerlessKubernetesClustersResult) *string { return v.KubeConfigFilePrefix }).(pulumi.StringPtrOutput)
}

func (o GetServerlessKubernetesClustersResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerlessKubernetesClustersResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of matched Kubernetes clusters' names.
func (o GetServerlessKubernetesClustersResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServerlessKubernetesClustersResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetServerlessKubernetesClustersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerlessKubernetesClustersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServerlessKubernetesClustersResultOutput{})
}
