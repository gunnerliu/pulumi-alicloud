// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cms

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This data source provides the CMS Groups of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.101.0+.
func GetAlarmContactGroups(ctx *pulumi.Context, args *GetAlarmContactGroupsArgs, opts ...pulumi.InvokeOption) (*GetAlarmContactGroupsResult, error) {
	var rv GetAlarmContactGroupsResult
	err := ctx.Invoke("alicloud:cms/getAlarmContactGroups:getAlarmContactGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAlarmContactGroups.
type GetAlarmContactGroupsArgs struct {
	// A list of Alarm Contact Group IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Alarm Contact Group name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getAlarmContactGroups.
type GetAlarmContactGroupsResult struct {
	Groups []GetAlarmContactGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}