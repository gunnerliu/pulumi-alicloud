// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package servicemesh

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Service Mesh Extension Providers of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.191.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/servicemesh"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := servicemesh.GetExtensionProviders(ctx, &servicemesh.GetExtensionProvidersArgs{
//				Ids: []string{
//					"example_id",
//				},
//				ServiceMeshId: "example_service_mesh_id",
//				Type:          "httpextauth",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("serviceMeshExtensionProvidersId1", ids.Providers[0].Id)
//			nameRegex, err := servicemesh.GetExtensionProviders(ctx, &servicemesh.GetExtensionProvidersArgs{
//				NameRegex:     pulumi.StringRef("^my-ServiceMeshExtensionProvider"),
//				ServiceMeshId: "example_service_mesh_id",
//				Type:          "httpextauth",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("serviceMeshExtensionProvidersId2", nameRegex.Providers[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetExtensionProviders(ctx *pulumi.Context, args *GetExtensionProvidersArgs, opts ...pulumi.InvokeOption) (*GetExtensionProvidersResult, error) {
	var rv GetExtensionProvidersResult
	err := ctx.Invoke("alicloud:servicemesh/getExtensionProviders:getExtensionProviders", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getExtensionProviders.
type GetExtensionProvidersArgs struct {
	// A list of Service Mesh Extension Provider IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Service Mesh Extension Provider name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the Service Mesh.
	ServiceMeshId string `pulumi:"serviceMeshId"`
	// The type of the Service Mesh Extension Provider. Valid values: `httpextauth`, `grpcextauth`.
	Type string `pulumi:"type"`
}

// A collection of values returned by getExtensionProviders.
type GetExtensionProvidersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id        string   `pulumi:"id"`
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of Extension Provider names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of Service Mesh Extension Providers. Each element contains the following attributes:
	Providers []GetExtensionProvidersProvider `pulumi:"providers"`
	// The ID of the Service Mesh.
	ServiceMeshId string `pulumi:"serviceMeshId"`
	// The type of the Service Mesh Extension Provider.
	Type string `pulumi:"type"`
}

func GetExtensionProvidersOutput(ctx *pulumi.Context, args GetExtensionProvidersOutputArgs, opts ...pulumi.InvokeOption) GetExtensionProvidersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetExtensionProvidersResult, error) {
			args := v.(GetExtensionProvidersArgs)
			r, err := GetExtensionProviders(ctx, &args, opts...)
			var s GetExtensionProvidersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetExtensionProvidersResultOutput)
}

// A collection of arguments for invoking getExtensionProviders.
type GetExtensionProvidersOutputArgs struct {
	// A list of Service Mesh Extension Provider IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Service Mesh Extension Provider name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the Service Mesh.
	ServiceMeshId pulumi.StringInput `pulumi:"serviceMeshId"`
	// The type of the Service Mesh Extension Provider. Valid values: `httpextauth`, `grpcextauth`.
	Type pulumi.StringInput `pulumi:"type"`
}

func (GetExtensionProvidersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetExtensionProvidersArgs)(nil)).Elem()
}

// A collection of values returned by getExtensionProviders.
type GetExtensionProvidersResultOutput struct{ *pulumi.OutputState }

func (GetExtensionProvidersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetExtensionProvidersResult)(nil)).Elem()
}

func (o GetExtensionProvidersResultOutput) ToGetExtensionProvidersResultOutput() GetExtensionProvidersResultOutput {
	return o
}

func (o GetExtensionProvidersResultOutput) ToGetExtensionProvidersResultOutputWithContext(ctx context.Context) GetExtensionProvidersResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetExtensionProvidersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetExtensionProvidersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetExtensionProvidersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetExtensionProvidersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetExtensionProvidersResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetExtensionProvidersResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of Extension Provider names.
func (o GetExtensionProvidersResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetExtensionProvidersResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetExtensionProvidersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetExtensionProvidersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of Service Mesh Extension Providers. Each element contains the following attributes:
func (o GetExtensionProvidersResultOutput) Providers() GetExtensionProvidersProviderArrayOutput {
	return o.ApplyT(func(v GetExtensionProvidersResult) []GetExtensionProvidersProvider { return v.Providers }).(GetExtensionProvidersProviderArrayOutput)
}

// The ID of the Service Mesh.
func (o GetExtensionProvidersResultOutput) ServiceMeshId() pulumi.StringOutput {
	return o.ApplyT(func(v GetExtensionProvidersResult) string { return v.ServiceMeshId }).(pulumi.StringOutput)
}

// The type of the Service Mesh Extension Provider.
func (o GetExtensionProvidersResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetExtensionProvidersResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetExtensionProvidersResultOutput{})
}
