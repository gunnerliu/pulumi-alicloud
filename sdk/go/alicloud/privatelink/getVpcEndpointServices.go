// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package privatelink

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Privatelink Vpc Endpoint Services of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.109.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/privatelink"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "the_resource_name"
// 		example, err := privatelink.GetVpcEndpointServices(ctx, &privatelink.GetVpcEndpointServicesArgs{
// 			Ids: []string{
// 				"example_value",
// 			},
// 			NameRegex: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstPrivatelinkVpcEndpointServiceId", example.Services[0].Id)
// 		return nil
// 	})
// }
// ```
func GetVpcEndpointServices(ctx *pulumi.Context, args *GetVpcEndpointServicesArgs, opts ...pulumi.InvokeOption) (*GetVpcEndpointServicesResult, error) {
	var rv GetVpcEndpointServicesResult
	err := ctx.Invoke("alicloud:privatelink/getVpcEndpointServices:getVpcEndpointServices", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVpcEndpointServices.
type GetVpcEndpointServicesArgs struct {
	// Whether to automatically accept terminal node connections..
	AutoAcceptConnection *bool `pulumi:"autoAcceptConnection"`
	// A list of Vpc Endpoint Service IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Vpc Endpoint Service name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// The business status of the terminal node service..
	ServiceBusinessStatus *string `pulumi:"serviceBusinessStatus"`
	// The Status of Vpc Endpoint Service.
	Status *string `pulumi:"status"`
	// The name of Vpc Endpoint Service.
	VpcEndpointServiceName *string `pulumi:"vpcEndpointServiceName"`
}

// A collection of values returned by getVpcEndpointServices.
type GetVpcEndpointServicesResult struct {
	AutoAcceptConnection *bool `pulumi:"autoAcceptConnection"`
	// The provider-assigned unique ID for this managed resource.
	Id                     string                          `pulumi:"id"`
	Ids                    []string                        `pulumi:"ids"`
	NameRegex              *string                         `pulumi:"nameRegex"`
	Names                  []string                        `pulumi:"names"`
	OutputFile             *string                         `pulumi:"outputFile"`
	ServiceBusinessStatus  *string                         `pulumi:"serviceBusinessStatus"`
	Services               []GetVpcEndpointServicesService `pulumi:"services"`
	Status                 *string                         `pulumi:"status"`
	VpcEndpointServiceName *string                         `pulumi:"vpcEndpointServiceName"`
}
