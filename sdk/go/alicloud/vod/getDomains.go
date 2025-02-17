// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vod

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Vod Domains of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.136.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vod"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			defaultDomain, err := vod.NewDomain(ctx, "defaultDomain", &vod.DomainArgs{
//				DomainName: pulumi.String("your_domain_name"),
//				Scope:      pulumi.String("domestic"),
//				Sources: vod.DomainSourceArray{
//					&vod.DomainSourceArgs{
//						SourceType:    pulumi.String("domain"),
//						SourceContent: pulumi.String("your_source_content"),
//						SourcePort:    pulumi.String("80"),
//					},
//				},
//				Tags: pulumi.Map{
//					"key1": pulumi.Any("value1"),
//					"key2": pulumi.Any("value2"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			defaultDomains := vod.GetDomainsOutput(ctx, vod.GetDomainsOutputArgs{
//				Ids: pulumi.StringArray{
//					defaultDomain.ID(),
//				},
//				Tags: pulumi.Map{
//					"key1": pulumi.Any("value1"),
//					"key2": pulumi.Any("value2"),
//				},
//			}, nil)
//			ctx.Export("vodDomain", defaultDomains.ApplyT(func(defaultDomains vod.GetDomainsResult) (vod.GetDomainsDomain, error) {
//				return defaultDomains.Domains[0], nil
//			}).(vod.GetDomainsDomainOutput))
//			return nil
//		})
//	}
//
// ```
func GetDomains(ctx *pulumi.Context, args *GetDomainsArgs, opts ...pulumi.InvokeOption) (*GetDomainsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDomainsResult
	err := ctx.Invoke("alicloud:vod/getDomains:getDomains", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDomains.
type GetDomainsArgs struct {
	// The search method. Valid values:
	DomainSearchType *string `pulumi:"domainSearchType"`
	// A list of Domain IDs. Its element value is same as Domain Name.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Domain name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// A collection of values returned by getDomains.
type GetDomainsResult struct {
	DomainSearchType *string            `pulumi:"domainSearchType"`
	Domains          []GetDomainsDomain `pulumi:"domains"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                 `pulumi:"id"`
	Ids        []string               `pulumi:"ids"`
	NameRegex  *string                `pulumi:"nameRegex"`
	Names      []string               `pulumi:"names"`
	OutputFile *string                `pulumi:"outputFile"`
	Status     *string                `pulumi:"status"`
	Tags       map[string]interface{} `pulumi:"tags"`
}

func GetDomainsOutput(ctx *pulumi.Context, args GetDomainsOutputArgs, opts ...pulumi.InvokeOption) GetDomainsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDomainsResult, error) {
			args := v.(GetDomainsArgs)
			r, err := GetDomains(ctx, &args, opts...)
			var s GetDomainsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDomainsResultOutput)
}

// A collection of arguments for invoking getDomains.
type GetDomainsOutputArgs struct {
	// The search method. Valid values:
	DomainSearchType pulumi.StringPtrInput `pulumi:"domainSearchType"`
	// A list of Domain IDs. Its element value is same as Domain Name.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Domain name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the resource.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput `pulumi:"tags"`
}

func (GetDomainsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDomainsArgs)(nil)).Elem()
}

// A collection of values returned by getDomains.
type GetDomainsResultOutput struct{ *pulumi.OutputState }

func (GetDomainsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDomainsResult)(nil)).Elem()
}

func (o GetDomainsResultOutput) ToGetDomainsResultOutput() GetDomainsResultOutput {
	return o
}

func (o GetDomainsResultOutput) ToGetDomainsResultOutputWithContext(ctx context.Context) GetDomainsResultOutput {
	return o
}

func (o GetDomainsResultOutput) DomainSearchType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDomainsResult) *string { return v.DomainSearchType }).(pulumi.StringPtrOutput)
}

func (o GetDomainsResultOutput) Domains() GetDomainsDomainArrayOutput {
	return o.ApplyT(func(v GetDomainsResult) []GetDomainsDomain { return v.Domains }).(GetDomainsDomainArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDomainsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDomainsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDomainsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetDomainsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDomainsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetDomainsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDomainsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetDomainsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDomainsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetDomainsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDomainsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetDomainsResultOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetDomainsResult) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDomainsResultOutput{})
}
