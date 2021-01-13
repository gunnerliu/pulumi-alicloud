// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package resourcemanager

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This data source provides the Resource Manager Shared Targets of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.111.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/resourcemanager"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		example, err := resourcemanager.GetSharedTargets(ctx, &resourcemanager.GetSharedTargetsArgs{
// 			Ids: []string{
// 				"15681091********",
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstResourceManagerSharedTargetId", example.Targets[0].Id)
// 		return nil
// 	})
// }
// ```
func GetSharedTargets(ctx *pulumi.Context, args *GetSharedTargetsArgs, opts ...pulumi.InvokeOption) (*GetSharedTargetsResult, error) {
	var rv GetSharedTargetsResult
	err := ctx.Invoke("alicloud:resourcemanager/getSharedTargets:getSharedTargets", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSharedTargets.
type GetSharedTargetsArgs struct {
	// A list of Shared Target IDs.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// The resource shared ID of resource manager.
	ResourceShareId *string `pulumi:"resourceShareId"`
	// The status of shared target.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getSharedTargets.
type GetSharedTargetsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id              string                   `pulumi:"id"`
	Ids             []string                 `pulumi:"ids"`
	OutputFile      *string                  `pulumi:"outputFile"`
	ResourceShareId *string                  `pulumi:"resourceShareId"`
	Status          *string                  `pulumi:"status"`
	Targets         []GetSharedTargetsTarget `pulumi:"targets"`
}