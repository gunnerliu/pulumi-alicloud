// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides metadata of kubernetes cluster addons.
//
// > **NOTE:** Available in 1.166.0+.
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
//			_, err := cs.GetKubernetesAddonMetadata(ctx, &cs.GetKubernetesAddonMetadataArgs{
//				ClusterId: _var.Cluster_id,
//				Name:      "nginx-ingress-controller",
//				Version:   "v1.1.2-aliyun.2",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("addonConfigSchema", data.Alicloud_cs_kubernetes_addons.Default.Config_schema)
//			return nil
//		})
//	}
//
// ```
func GetKubernetesAddonMetadata(ctx *pulumi.Context, args *GetKubernetesAddonMetadataArgs, opts ...pulumi.InvokeOption) (*GetKubernetesAddonMetadataResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetKubernetesAddonMetadataResult
	err := ctx.Invoke("alicloud:cs/getKubernetesAddonMetadata:getKubernetesAddonMetadata", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKubernetesAddonMetadata.
type GetKubernetesAddonMetadataArgs struct {
	// The id of kubernetes cluster.
	ClusterId string `pulumi:"clusterId"`
	// The name of the cluster addon. You can get a list of available addons that the cluster can install by using data source `cs.getKubernetesAddons`.
	Name string `pulumi:"name"`
	// The version of the cluster addon.
	Version string `pulumi:"version"`
}

// A collection of values returned by getKubernetesAddonMetadata.
type GetKubernetesAddonMetadataResult struct {
	ClusterId string `pulumi:"clusterId"`
	// The addon configuration that can be customized. The returned format is the standard json schema. If return empty, it means that the addon does not support custom configuration yet.
	ConfigSchema string `pulumi:"configSchema"`
	// The provider-assigned unique ID for this managed resource.
	Id      string `pulumi:"id"`
	Name    string `pulumi:"name"`
	Version string `pulumi:"version"`
}

func GetKubernetesAddonMetadataOutput(ctx *pulumi.Context, args GetKubernetesAddonMetadataOutputArgs, opts ...pulumi.InvokeOption) GetKubernetesAddonMetadataResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetKubernetesAddonMetadataResult, error) {
			args := v.(GetKubernetesAddonMetadataArgs)
			r, err := GetKubernetesAddonMetadata(ctx, &args, opts...)
			var s GetKubernetesAddonMetadataResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetKubernetesAddonMetadataResultOutput)
}

// A collection of arguments for invoking getKubernetesAddonMetadata.
type GetKubernetesAddonMetadataOutputArgs struct {
	// The id of kubernetes cluster.
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// The name of the cluster addon. You can get a list of available addons that the cluster can install by using data source `cs.getKubernetesAddons`.
	Name pulumi.StringInput `pulumi:"name"`
	// The version of the cluster addon.
	Version pulumi.StringInput `pulumi:"version"`
}

func (GetKubernetesAddonMetadataOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKubernetesAddonMetadataArgs)(nil)).Elem()
}

// A collection of values returned by getKubernetesAddonMetadata.
type GetKubernetesAddonMetadataResultOutput struct{ *pulumi.OutputState }

func (GetKubernetesAddonMetadataResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKubernetesAddonMetadataResult)(nil)).Elem()
}

func (o GetKubernetesAddonMetadataResultOutput) ToGetKubernetesAddonMetadataResultOutput() GetKubernetesAddonMetadataResultOutput {
	return o
}

func (o GetKubernetesAddonMetadataResultOutput) ToGetKubernetesAddonMetadataResultOutputWithContext(ctx context.Context) GetKubernetesAddonMetadataResultOutput {
	return o
}

func (o GetKubernetesAddonMetadataResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetKubernetesAddonMetadataResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

// The addon configuration that can be customized. The returned format is the standard json schema. If return empty, it means that the addon does not support custom configuration yet.
func (o GetKubernetesAddonMetadataResultOutput) ConfigSchema() pulumi.StringOutput {
	return o.ApplyT(func(v GetKubernetesAddonMetadataResult) string { return v.ConfigSchema }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetKubernetesAddonMetadataResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetKubernetesAddonMetadataResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetKubernetesAddonMetadataResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetKubernetesAddonMetadataResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetKubernetesAddonMetadataResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v GetKubernetesAddonMetadataResult) string { return v.Version }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetKubernetesAddonMetadataResultOutput{})
}
