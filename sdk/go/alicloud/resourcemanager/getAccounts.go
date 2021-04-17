// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package resourcemanager

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Resource Manager Accounts of the current Alibaba Cloud user.
//
// > **NOTE:**  Available in 1.86.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_default, err := resourcemanager.GetAccounts(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstAccountId", _default.Accounts[0].Id)
// 		return nil
// 	})
// }
// ```
func GetAccounts(ctx *pulumi.Context, args *GetAccountsArgs, opts ...pulumi.InvokeOption) (*GetAccountsResult, error) {
	var rv GetAccountsResult
	err := ctx.Invoke("alicloud:resourcemanager/getAccounts:getAccounts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccounts.
type GetAccountsArgs struct {
	// A list of account IDs.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of account, valid values: `CreateCancelled`, `CreateExpired`, `CreateFailed`, `CreateSuccess`, `CreateVerifying`, `InviteSuccess`, `PromoteCancelled`, `PromoteExpired`, `PromoteFailed`, `PromoteSuccess`, and `PromoteVerifying`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getAccounts.
type GetAccountsResult struct {
	// A list of accounts. Each element contains the following attributes:
	Accounts []GetAccountsAccount `pulumi:"accounts"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of account IDs.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of the member account.
	Status *string `pulumi:"status"`
}
