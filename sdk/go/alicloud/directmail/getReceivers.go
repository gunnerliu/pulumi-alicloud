// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package directmail

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Direct Mail Receiverses of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.125.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/directmail"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "the_resource_name"
// 		example, err := directmail.LookupReceivers(ctx, &directmail.LookupReceiversArgs{
// 			Ids: []string{
// 				"ca73b1e4fb0df7c935a5097a****",
// 			},
// 			NameRegex: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstDirectMailReceiversId", example.Receiverses[0].Id)
// 		return nil
// 	})
// }
// ```
func LookupReceivers(ctx *pulumi.Context, args *LookupReceiversArgs, opts ...pulumi.InvokeOption) (*LookupReceiversResult, error) {
	var rv LookupReceiversResult
	err := ctx.Invoke("alicloud:directmail/getReceivers:getReceivers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getReceivers.
type LookupReceiversArgs struct {
	// A list of Receivers IDs.
	Ids []string `pulumi:"ids"`
	// The key word.
	KeyWord *string `pulumi:"keyWord"`
	// A regex string to filter results by Receivers name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// The status of the resource.
	Status *int `pulumi:"status"`
}

// A collection of values returned by getReceivers.
type LookupReceiversResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id          string                   `pulumi:"id"`
	Ids         []string                 `pulumi:"ids"`
	KeyWord     *string                  `pulumi:"keyWord"`
	NameRegex   *string                  `pulumi:"nameRegex"`
	Names       []string                 `pulumi:"names"`
	OutputFile  *string                  `pulumi:"outputFile"`
	Receiverses []GetReceiversReceiverse `pulumi:"receiverses"`
	Status      *int                     `pulumi:"status"`
}