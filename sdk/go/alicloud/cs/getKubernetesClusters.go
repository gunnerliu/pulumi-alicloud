// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list Container Service Kubernetes Clusters on Alibaba Cloud.
//
// > **NOTE:** Available in v1.34.0+.
//
// > **NOTE:** From version 1.177.0+, We supported batch export of clusters' kube config information by `kubeConfigFilePrefix`.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			k8sClusters, err := cs.GetKubernetesClusters(ctx, &cs.GetKubernetesClustersArgs{
//				KubeConfigFilePrefix: pulumi.StringRef("~/.kube/k8s"),
//				NameRegex:            pulumi.StringRef("my-first-k8s"),
//				OutputFile:           pulumi.StringRef("my-first-k8s-json"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("output", k8sClusters.Clusters)
//			return nil
//		})
//	}
//
// ```
func GetKubernetesClusters(ctx *pulumi.Context, args *GetKubernetesClustersArgs, opts ...pulumi.InvokeOption) (*GetKubernetesClustersResult, error) {
	var rv GetKubernetesClustersResult
	err := ctx.Invoke("alicloud:cs/getKubernetesClusters:getKubernetesClusters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKubernetesClusters.
type GetKubernetesClustersArgs struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// Cluster IDs to filter.
	Ids []string `pulumi:"ids"`
	// The path prefix of kube config. You could store kube config in a specified directory by specifying this field, like `~/.kube/k8s`, then it will be named with `~/.kube/k8s-clusterID-kubeconfig`. From version 1.187.0+, kubeConfig will not export kubeConfig if this field is not set.
	KubeConfigFilePrefix *string `pulumi:"kubeConfigFilePrefix"`
	// A regex string to filter results by cluster name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getKubernetesClusters.
type GetKubernetesClustersResult struct {
	// A list of matched Kubernetes clusters. Each element contains the following attributes:
	Clusters      []GetKubernetesClustersCluster `pulumi:"clusters"`
	EnableDetails *bool                          `pulumi:"enableDetails"`
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

func GetKubernetesClustersOutput(ctx *pulumi.Context, args GetKubernetesClustersOutputArgs, opts ...pulumi.InvokeOption) GetKubernetesClustersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetKubernetesClustersResult, error) {
			args := v.(GetKubernetesClustersArgs)
			r, err := GetKubernetesClusters(ctx, &args, opts...)
			var s GetKubernetesClustersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetKubernetesClustersResultOutput)
}

// A collection of arguments for invoking getKubernetesClusters.
type GetKubernetesClustersOutputArgs struct {
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// Cluster IDs to filter.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The path prefix of kube config. You could store kube config in a specified directory by specifying this field, like `~/.kube/k8s`, then it will be named with `~/.kube/k8s-clusterID-kubeconfig`. From version 1.187.0+, kubeConfig will not export kubeConfig if this field is not set.
	KubeConfigFilePrefix pulumi.StringPtrInput `pulumi:"kubeConfigFilePrefix"`
	// A regex string to filter results by cluster name.
	NameRegex  pulumi.StringPtrInput `pulumi:"nameRegex"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetKubernetesClustersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKubernetesClustersArgs)(nil)).Elem()
}

// A collection of values returned by getKubernetesClusters.
type GetKubernetesClustersResultOutput struct{ *pulumi.OutputState }

func (GetKubernetesClustersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKubernetesClustersResult)(nil)).Elem()
}

func (o GetKubernetesClustersResultOutput) ToGetKubernetesClustersResultOutput() GetKubernetesClustersResultOutput {
	return o
}

func (o GetKubernetesClustersResultOutput) ToGetKubernetesClustersResultOutputWithContext(ctx context.Context) GetKubernetesClustersResultOutput {
	return o
}

// A list of matched Kubernetes clusters. Each element contains the following attributes:
func (o GetKubernetesClustersResultOutput) Clusters() GetKubernetesClustersClusterArrayOutput {
	return o.ApplyT(func(v GetKubernetesClustersResult) []GetKubernetesClustersCluster { return v.Clusters }).(GetKubernetesClustersClusterArrayOutput)
}

func (o GetKubernetesClustersResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetKubernetesClustersResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetKubernetesClustersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetKubernetesClustersResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of matched Kubernetes clusters' ids.
func (o GetKubernetesClustersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetKubernetesClustersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetKubernetesClustersResultOutput) KubeConfigFilePrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetKubernetesClustersResult) *string { return v.KubeConfigFilePrefix }).(pulumi.StringPtrOutput)
}

func (o GetKubernetesClustersResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetKubernetesClustersResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of matched Kubernetes clusters' names.
func (o GetKubernetesClustersResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetKubernetesClustersResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetKubernetesClustersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetKubernetesClustersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetKubernetesClustersResultOutput{})
}
