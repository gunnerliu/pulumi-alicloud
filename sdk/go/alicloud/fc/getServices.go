// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package fc

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Function Compute services of the current Alibaba Cloud user.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/fc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "sample_fc_service"
// 		fcServicesDs, err := fc.GetServices(ctx, &fc.GetServicesArgs{
// 			NameRegex: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstFcServiceName", fcServicesDs.Services[0].Name)
// 		return nil
// 	})
// }
// ```
func GetServices(ctx *pulumi.Context, args *GetServicesArgs, opts ...pulumi.InvokeOption) (*GetServicesResult, error) {
	var rv GetServicesResult
	err := ctx.Invoke("alicloud:fc/getServices:getServices", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServices.
type GetServicesArgs struct {
	// - A list of FC services ids.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by FC service name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getServices.
type GetServicesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of FC services ids.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of FC services names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of FC services. Each element contains the following attributes:
	Services []GetServicesService `pulumi:"services"`
}
