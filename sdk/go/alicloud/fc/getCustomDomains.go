// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package fc

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This data source provides the Function Compute custom domains of the current Alibaba Cloud user.
//
// > **NOTE:** Available in 1.98.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/fc"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "sample_fc_custom_domain"
// 		_, err := fc.GetCustomDomains(ctx, &fc.GetCustomDomainsArgs{
// 			NameRegex: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstFcCustomDomainName", data.Alicloud_fc_custom_domains.Fc_domains_ds.Domains[0].Domain_name)
// 		return nil
// 	})
// }
// ```
func GetCustomDomains(ctx *pulumi.Context, args *GetCustomDomainsArgs, opts ...pulumi.InvokeOption) (*GetCustomDomainsResult, error) {
	var rv GetCustomDomainsResult
	err := ctx.Invoke("alicloud:fc/getCustomDomains:getCustomDomains", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCustomDomains.
type GetCustomDomainsArgs struct {
	// A list of functions ids.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Function Compute custom domain name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getCustomDomains.
type GetCustomDomainsResult struct {
	// A list of custom domains, including the following attributes:
	Domains []GetCustomDomainsDomain `pulumi:"domains"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of custom domain ids.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of custom domain names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}
