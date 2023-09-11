// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sae

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Sae Ingresses of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.137.0+.
func GetIngresses(ctx *pulumi.Context, args *GetIngressesArgs, opts ...pulumi.InvokeOption) (*GetIngressesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetIngressesResult
	err := ctx.Invoke("alicloud:sae/getIngresses:getIngresses", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIngresses.
type GetIngressesArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Ingress IDs.
	Ids []string `pulumi:"ids"`
	// The Id of Namespace.It can contain 2 to 32 characters.The value is in format {RegionId}:{namespace}.
	NamespaceId string `pulumi:"namespaceId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getIngresses.
type GetIngressesResult struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id          string                `pulumi:"id"`
	Ids         []string              `pulumi:"ids"`
	Ingresses   []GetIngressesIngress `pulumi:"ingresses"`
	NamespaceId string                `pulumi:"namespaceId"`
	OutputFile  *string               `pulumi:"outputFile"`
}

func GetIngressesOutput(ctx *pulumi.Context, args GetIngressesOutputArgs, opts ...pulumi.InvokeOption) GetIngressesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetIngressesResult, error) {
			args := v.(GetIngressesArgs)
			r, err := GetIngresses(ctx, &args, opts...)
			var s GetIngressesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetIngressesResultOutput)
}

// A collection of arguments for invoking getIngresses.
type GetIngressesOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Ingress IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The Id of Namespace.It can contain 2 to 32 characters.The value is in format {RegionId}:{namespace}.
	NamespaceId pulumi.StringInput `pulumi:"namespaceId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetIngressesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIngressesArgs)(nil)).Elem()
}

// A collection of values returned by getIngresses.
type GetIngressesResultOutput struct{ *pulumi.OutputState }

func (GetIngressesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIngressesResult)(nil)).Elem()
}

func (o GetIngressesResultOutput) ToGetIngressesResultOutput() GetIngressesResultOutput {
	return o
}

func (o GetIngressesResultOutput) ToGetIngressesResultOutputWithContext(ctx context.Context) GetIngressesResultOutput {
	return o
}

func (o GetIngressesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetIngressesResult] {
	return pulumix.Output[GetIngressesResult]{
		OutputState: o.OutputState,
	}
}

func (o GetIngressesResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetIngressesResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetIngressesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetIngressesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetIngressesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetIngressesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetIngressesResultOutput) Ingresses() GetIngressesIngressArrayOutput {
	return o.ApplyT(func(v GetIngressesResult) []GetIngressesIngress { return v.Ingresses }).(GetIngressesIngressArrayOutput)
}

func (o GetIngressesResultOutput) NamespaceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetIngressesResult) string { return v.NamespaceId }).(pulumi.StringOutput)
}

func (o GetIngressesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetIngressesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetIngressesResultOutput{})
}
