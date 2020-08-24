// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This data source provides CEN Bandwidth Packages available to the user.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/cen"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "cen-id1"
// 		opt1 := "^foo"
// 		bwp, err := cen.GetBandwidthPackages(ctx, &cen.GetBandwidthPackagesArgs{
// 			InstanceId: &opt0,
// 			NameRegex:  &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstCenBandwidthPackageId", bwp.Packages[0].Id)
// 		return nil
// 	})
// }
// ```
func GetBandwidthPackages(ctx *pulumi.Context, args *GetBandwidthPackagesArgs, opts ...pulumi.InvokeOption) (*GetBandwidthPackagesResult, error) {
	var rv GetBandwidthPackagesResult
	err := ctx.Invoke("alicloud:cen/getBandwidthPackages:getBandwidthPackages", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBandwidthPackages.
type GetBandwidthPackagesArgs struct {
	// Limit search to a list of specific CEN Bandwidth Package IDs.
	Ids []string `pulumi:"ids"`
	// ID of a CEN instance.
	InstanceId *string `pulumi:"instanceId"`
	// A regex string to filter CEN Bandwidth Package by name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getBandwidthPackages.
type GetBandwidthPackagesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id  string   `pulumi:"id"`
	Ids []string `pulumi:"ids"`
	// ID of CEN instance that owns the CEN Bandwidth Package.
	InstanceId *string  `pulumi:"instanceId"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of CEN bandwidth package. Each element contains the following attributes:
	Packages []GetBandwidthPackagesPackage `pulumi:"packages"`
}
