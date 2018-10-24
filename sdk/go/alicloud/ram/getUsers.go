// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ram

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// This data source provides a list of RAM users in an Alibaba Cloud account according to the specified filters.
func LookupUsers(ctx *pulumi.Context, args *GetUsersArgs) (*GetUsersResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["groupName"] = args.GroupName
		inputs["nameRegex"] = args.NameRegex
		inputs["outputFile"] = args.OutputFile
		inputs["policyName"] = args.PolicyName
		inputs["policyType"] = args.PolicyType
	}
	outputs, err := ctx.Invoke("alicloud:ram/getUsers:getUsers", inputs)
	if err != nil {
		return nil, err
	}
	return &GetUsersResult{
		Users: outputs["users"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getUsers.
type GetUsersArgs struct {
	// Filter results by a specific group name. Returned users are in the specified group. 
	GroupName interface{}
	// A regex string to filter resulting users by their names.
	NameRegex interface{}
	// File name where to save data source results (after running `terraform plan`).
	OutputFile interface{}
	// Filter results by a specific policy name. If you set this parameter without setting `policy_type`, the later will be automatically set to `System`. Returned users are attached to the specified policy.
	PolicyName interface{}
	// Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
	PolicyType interface{}
}

// A collection of values returned by getUsers.
type GetUsersResult struct {
	// A list of users. Each element contains the following attributes:
	Users interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}