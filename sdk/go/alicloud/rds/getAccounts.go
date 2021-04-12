// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This data source provides the Rds Accounts of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.120.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/rds"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "the_resource_name"
// 		example, err := rds.GetAccounts(ctx, &rds.GetAccountsArgs{
// 			DbInstanceId: "example_value",
// 			NameRegex:    &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstRdsAccountId", example.Accounts[0].Id)
// 		return nil
// 	})
// }
// ```
func GetAccounts(ctx *pulumi.Context, args *GetAccountsArgs, opts ...pulumi.InvokeOption) (*GetAccountsResult, error) {
	var rv GetAccountsResult
	err := ctx.Invoke("alicloud:rds/getAccounts:getAccounts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccounts.
type GetAccountsArgs struct {
	// The db instance id.
	DbInstanceId string `pulumi:"dbInstanceId"`
	// A list of Account IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Account name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// The status of the resource.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getAccounts.
type GetAccountsResult struct {
	Accounts     []GetAccountsAccount `pulumi:"accounts"`
	DbInstanceId string               `pulumi:"dbInstanceId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	Status     *string  `pulumi:"status"`
}
