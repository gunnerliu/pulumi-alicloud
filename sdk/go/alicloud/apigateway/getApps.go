// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package apigateway

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the apps of the current Alibaba Cloud user.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/apigateway"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "outapps"
// 		dataApigatway, err := apigateway.GetApps(ctx, &apigateway.GetAppsArgs{
// 			OutputFile: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstAppId", dataApigatway.Apps[0].Id)
// 		return nil
// 	})
// }
// ```
func GetApps(ctx *pulumi.Context, args *GetAppsArgs, opts ...pulumi.InvokeOption) (*GetAppsResult, error) {
	var rv GetAppsResult
	err := ctx.Invoke("alicloud:apigateway/getApps:getApps", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApps.
type GetAppsArgs struct {
	// A list of app IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter apps by name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// A collection of values returned by getApps.
type GetAppsResult struct {
	// A list of apps. Each element contains the following attributes:
	Apps []GetAppsApp `pulumi:"apps"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of app IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of app names.
	Names      []string               `pulumi:"names"`
	OutputFile *string                `pulumi:"outputFile"`
	Tags       map[string]interface{} `pulumi:"tags"`
}
