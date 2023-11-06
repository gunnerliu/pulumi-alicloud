// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package slb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the CA certificate list.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/slb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			sampleDs, err := slb.GetCaCertificates(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstSlbCaCertificateId", sampleDs.Certificates[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetCaCertificates(ctx *pulumi.Context, args *GetCaCertificatesArgs, opts ...pulumi.InvokeOption) (*GetCaCertificatesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetCaCertificatesResult
	err := ctx.Invoke("alicloud:slb/getCaCertificates:getCaCertificates", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCaCertificates.
type GetCaCertificatesArgs struct {
	// A list of ca certificates IDs to filter results.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by ca certificate name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The Id of resource group which ca certificates belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// A collection of values returned by getCaCertificates.
type GetCaCertificatesResult struct {
	// A list of SLB ca certificates. Each element contains the following attributes:
	Certificates []GetCaCertificatesCertificate `pulumi:"certificates"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of SLB ca certificates IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of SLB ca certificates names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// The resource group Id of CA certificate.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// (Available in v1.66.0+) A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

func GetCaCertificatesOutput(ctx *pulumi.Context, args GetCaCertificatesOutputArgs, opts ...pulumi.InvokeOption) GetCaCertificatesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetCaCertificatesResult, error) {
			args := v.(GetCaCertificatesArgs)
			r, err := GetCaCertificates(ctx, &args, opts...)
			var s GetCaCertificatesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetCaCertificatesResultOutput)
}

// A collection of arguments for invoking getCaCertificates.
type GetCaCertificatesOutputArgs struct {
	// A list of ca certificates IDs to filter results.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by ca certificate name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The Id of resource group which ca certificates belongs.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput `pulumi:"tags"`
}

func (GetCaCertificatesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCaCertificatesArgs)(nil)).Elem()
}

// A collection of values returned by getCaCertificates.
type GetCaCertificatesResultOutput struct{ *pulumi.OutputState }

func (GetCaCertificatesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCaCertificatesResult)(nil)).Elem()
}

func (o GetCaCertificatesResultOutput) ToGetCaCertificatesResultOutput() GetCaCertificatesResultOutput {
	return o
}

func (o GetCaCertificatesResultOutput) ToGetCaCertificatesResultOutputWithContext(ctx context.Context) GetCaCertificatesResultOutput {
	return o
}

// A list of SLB ca certificates. Each element contains the following attributes:
func (o GetCaCertificatesResultOutput) Certificates() GetCaCertificatesCertificateArrayOutput {
	return o.ApplyT(func(v GetCaCertificatesResult) []GetCaCertificatesCertificate { return v.Certificates }).(GetCaCertificatesCertificateArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetCaCertificatesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCaCertificatesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of SLB ca certificates IDs.
func (o GetCaCertificatesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetCaCertificatesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetCaCertificatesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCaCertificatesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of SLB ca certificates names.
func (o GetCaCertificatesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetCaCertificatesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetCaCertificatesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCaCertificatesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The resource group Id of CA certificate.
func (o GetCaCertificatesResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCaCertificatesResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// (Available in v1.66.0+) A mapping of tags to assign to the resource.
func (o GetCaCertificatesResultOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetCaCertificatesResult) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCaCertificatesResultOutput{})
}
