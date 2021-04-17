// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package resourcemanager

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Resource Manager Policies of the current Alibaba Cloud user.
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
// 		opt0 := "tftest"
// 		opt1 := "Custom"
// 		example, err := resourcemanager.GetPolicies(ctx, &resourcemanager.GetPoliciesArgs{
// 			DescriptionRegex: "tftest_policy",
// 			NameRegex:        &opt0,
// 			PolicyType:       &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstPolicyId", example.Policies[0].Id)
// 		return nil
// 	})
// }
// ```
func GetPolicies(ctx *pulumi.Context, args *GetPoliciesArgs, opts ...pulumi.InvokeOption) (*GetPoliciesResult, error) {
	var rv GetPoliciesResult
	err := ctx.Invoke("alicloud:resourcemanager/getPolicies:getPolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPolicies.
type GetPoliciesArgs struct {
	// A list of Resource Manager Policy IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by policy name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// The type of the policy. If you do not specify this parameter, the system lists all types of policies. Valid values: `Custom` and `System`.
	PolicyType *string `pulumi:"policyType"`
}

// A collection of values returned by getPolicies.
type GetPoliciesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of policy IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of policy names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of policies. Each element contains the following attributes:
	Policies   []GetPoliciesPolicy `pulumi:"policies"`
	PolicyType *string             `pulumi:"policyType"`
}
