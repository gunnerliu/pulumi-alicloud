// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetRdsParameterGroups(ctx *pulumi.Context, args *GetRdsParameterGroupsArgs, opts ...pulumi.InvokeOption) (*GetRdsParameterGroupsResult, error) {
	var rv GetRdsParameterGroupsResult
	err := ctx.Invoke("alicloud:rds/getRdsParameterGroups:getRdsParameterGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRdsParameterGroups.
type GetRdsParameterGroupsArgs struct {
	EnableDetails *bool    `pulumi:"enableDetails"`
	Ids           []string `pulumi:"ids"`
	NameRegex     *string  `pulumi:"nameRegex"`
	OutputFile    *string  `pulumi:"outputFile"`
}

// A collection of values returned by getRdsParameterGroups.
type GetRdsParameterGroupsResult struct {
	EnableDetails *bool                        `pulumi:"enableDetails"`
	Groups        []GetRdsParameterGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}
