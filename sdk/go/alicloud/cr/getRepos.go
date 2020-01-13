// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cr

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// This data source provides a list Container Registry repositories on Alibaba Cloud.
// 
// > **NOTE:** Available in v1.35.0+
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/cr_repos.html.markdown.
func LookupRepos(ctx *pulumi.Context, args *GetReposArgs) (*GetReposResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["enableDetails"] = args.EnableDetails
		inputs["nameRegex"] = args.NameRegex
		inputs["namespace"] = args.Namespace
		inputs["outputFile"] = args.OutputFile
	}
	outputs, err := ctx.Invoke("alicloud:cr/getRepos:getRepos", inputs)
	if err != nil {
		return nil, err
	}
	return &GetReposResult{
		EnableDetails: outputs["enableDetails"],
		Ids: outputs["ids"],
		NameRegex: outputs["nameRegex"],
		Names: outputs["names"],
		Namespace: outputs["namespace"],
		OutputFile: outputs["outputFile"],
		Repos: outputs["repos"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getRepos.
type GetReposArgs struct {
	// Boolean, false by default, only repository attributes are exported. Set to true if domain list and tags belong to this repository are needed. See `tags` in attributes.
	EnableDetails interface{}
	// A regex string to filter results by repository name.
	NameRegex interface{}
	// Name of container registry namespace where the repositories are located in.
	Namespace interface{}
	OutputFile interface{}
}

// A collection of values returned by getRepos.
type GetReposResult struct {
	EnableDetails interface{}
	// A list of matched Container Registry Repositories. Its element is set to `names`.
	Ids interface{}
	NameRegex interface{}
	// A list of repository names.
	Names interface{}
	// Name of container registry namespace where repo is located.
	Namespace interface{}
	OutputFile interface{}
	// A list of matched Container Registry Namespaces. Each element contains the following attributes:
	Repos interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}