// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ram

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This data source provides a list of RAM Roles in an Alibaba Cloud account according to the specified filters.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/ram"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := ".*test.*"
// 		opt1 := "roles.txt"
// 		opt2 := "AliyunACSDefaultAccess"
// 		opt3 := "Custom"
// 		rolesDs, err := ram.GetRoles(ctx, &ram.GetRolesArgs{
// 			NameRegex:  &opt0,
// 			OutputFile: &opt1,
// 			PolicyName: &opt2,
// 			PolicyType: &opt3,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstRoleId", rolesDs.Roles[0].Id)
// 		return nil
// 	})
// }
// ```
func GetRoles(ctx *pulumi.Context, args *GetRolesArgs, opts ...pulumi.InvokeOption) (*GetRolesResult, error) {
	var rv GetRolesResult
	err := ctx.Invoke("alicloud:ram/getRoles:getRoles", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRoles.
type GetRolesArgs struct {
	// - A list of ram role IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by the role name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// Filter results by a specific policy name. If you set this parameter without setting `policyType`, the later will be automatically set to `System`. The resulting roles will be attached to the specified policy.
	PolicyName *string `pulumi:"policyName"`
	// Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policyName` as well.
	PolicyType *string `pulumi:"policyType"`
}

// A collection of values returned by getRoles.
type GetRolesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of ram role IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of ram role names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	PolicyName *string  `pulumi:"policyName"`
	PolicyType *string  `pulumi:"policyType"`
	// A list of roles. Each element contains the following attributes:
	Roles []GetRolesRole `pulumi:"roles"`
}
