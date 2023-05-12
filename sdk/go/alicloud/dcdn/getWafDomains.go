// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dcdn

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Dcdn Waf Domains of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.185.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dcdn"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := dcdn.GetWafDomains(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("dcdnWafDomainId1", ids.Domains[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetWafDomains(ctx *pulumi.Context, args *GetWafDomainsArgs, opts ...pulumi.InvokeOption) (*GetWafDomainsResult, error) {
	var rv GetWafDomainsResult
	err := ctx.Invoke("alicloud:dcdn/getWafDomains:getWafDomains", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWafDomains.
type GetWafDomainsArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Waf Domain IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The query conditions. You can filter domain names by name. Fuzzy match is supported `QueryArgs={"DomainName":"Accelerated domain name"}`.
	QueryArgs *string `pulumi:"queryArgs"`
}

// A collection of values returned by getWafDomains.
type GetWafDomainsResult struct {
	Domains       []GetWafDomainsDomain `pulumi:"domains"`
	EnableDetails *bool                 `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	QueryArgs  *string  `pulumi:"queryArgs"`
}

func GetWafDomainsOutput(ctx *pulumi.Context, args GetWafDomainsOutputArgs, opts ...pulumi.InvokeOption) GetWafDomainsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetWafDomainsResult, error) {
			args := v.(GetWafDomainsArgs)
			r, err := GetWafDomains(ctx, &args, opts...)
			var s GetWafDomainsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetWafDomainsResultOutput)
}

// A collection of arguments for invoking getWafDomains.
type GetWafDomainsOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Waf Domain IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The query conditions. You can filter domain names by name. Fuzzy match is supported `QueryArgs={"DomainName":"Accelerated domain name"}`.
	QueryArgs pulumi.StringPtrInput `pulumi:"queryArgs"`
}

func (GetWafDomainsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWafDomainsArgs)(nil)).Elem()
}

// A collection of values returned by getWafDomains.
type GetWafDomainsResultOutput struct{ *pulumi.OutputState }

func (GetWafDomainsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWafDomainsResult)(nil)).Elem()
}

func (o GetWafDomainsResultOutput) ToGetWafDomainsResultOutput() GetWafDomainsResultOutput {
	return o
}

func (o GetWafDomainsResultOutput) ToGetWafDomainsResultOutputWithContext(ctx context.Context) GetWafDomainsResultOutput {
	return o
}

func (o GetWafDomainsResultOutput) Domains() GetWafDomainsDomainArrayOutput {
	return o.ApplyT(func(v GetWafDomainsResult) []GetWafDomainsDomain { return v.Domains }).(GetWafDomainsDomainArrayOutput)
}

func (o GetWafDomainsResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetWafDomainsResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetWafDomainsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWafDomainsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetWafDomainsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetWafDomainsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetWafDomainsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWafDomainsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetWafDomainsResultOutput) QueryArgs() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWafDomainsResult) *string { return v.QueryArgs }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWafDomainsResultOutput{})
}
