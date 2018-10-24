// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package oss

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// This data source provides the OSS buckets of the current Alibaba Cloud user.
func LookupBuckets(ctx *pulumi.Context, args *GetBucketsArgs) (*GetBucketsResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["nameRegex"] = args.NameRegex
		inputs["outputFile"] = args.OutputFile
	}
	outputs, err := ctx.Invoke("alicloud:oss/getBuckets:getBuckets", inputs)
	if err != nil {
		return nil, err
	}
	return &GetBucketsResult{
		Buckets: outputs["buckets"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getBuckets.
type GetBucketsArgs struct {
	// A regex string to filter results by bucket name.
	NameRegex interface{}
	// File name where to save data source results (after running `terraform plan`).
	OutputFile interface{}
}

// A collection of values returned by getBuckets.
type GetBucketsResult struct {
	// A list of buckets. Each element contains the following attributes:
	Buckets interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}