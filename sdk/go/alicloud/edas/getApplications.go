// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package edas

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This data source provides a list of EDAS application in an Alibaba Cloud account according to the specified filters.
//
// > **NOTE:** Available in 1.82.0+
func GetApplications(ctx *pulumi.Context, args *GetApplicationsArgs, opts ...pulumi.InvokeOption) (*GetApplicationsResult, error) {
	var rv GetApplicationsResult
	err := ctx.Invoke("alicloud:edas/getApplications:getApplications", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplications.
type GetApplicationsArgs struct {
	// An ids string to filter results by the application id.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by the application name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getApplications.
type GetApplicationsResult struct {
	// A list of applications.
	Applications []GetApplicationsApplication `pulumi:"applications"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of application IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of applications names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}
