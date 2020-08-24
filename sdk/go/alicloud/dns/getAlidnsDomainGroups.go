// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This data source provides a list of Alidns Domain Groups in an Alibaba Cloud account according to the specified filters.
//
// > **NOTE:**  Available in 1.85.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/dns"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		example, err := dns.GetAlidnsDomainGroups(ctx, &dns.GetAlidnsDomainGroupsArgs{
// 			Ids: []string{
// 				"c5ef2bc43064445787adf182af2****",
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstDomainGroupId", example.Groups[0].Id)
// 		return nil
// 	})
// }
// ```
func GetAlidnsDomainGroups(ctx *pulumi.Context, args *GetAlidnsDomainGroupsArgs, opts ...pulumi.InvokeOption) (*GetAlidnsDomainGroupsResult, error) {
	var rv GetAlidnsDomainGroupsResult
	err := ctx.Invoke("alicloud:dns/getAlidnsDomainGroups:getAlidnsDomainGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAlidnsDomainGroups.
type GetAlidnsDomainGroupsArgs struct {
	// A list of instance IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by the domain group name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getAlidnsDomainGroups.
type GetAlidnsDomainGroupsResult struct {
	// A list of instances. Each element contains the following attributes:
	Groups []GetAlidnsDomainGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of instance IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of domain group names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}
