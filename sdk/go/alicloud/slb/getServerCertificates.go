// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package slb

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the server certificate list.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/slb"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		sampleDs, err := slb.GetServerCertificates(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstSlbServerCertificateId", sampleDs.Certificates[0].Id)
// 		return nil
// 	})
// }
// ```
func GetServerCertificates(ctx *pulumi.Context, args *GetServerCertificatesArgs, opts ...pulumi.InvokeOption) (*GetServerCertificatesResult, error) {
	var rv GetServerCertificatesResult
	err := ctx.Invoke("alicloud:slb/getServerCertificates:getServerCertificates", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServerCertificates.
type GetServerCertificatesArgs struct {
	// A list of server certificates IDs to filter results.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by server certificate name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// The Id of resource group which the slb server certificates belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// A collection of values returned by getServerCertificates.
type GetServerCertificatesResult struct {
	// A list of SLB server certificates. Each element contains the following attributes:
	Certificates []GetServerCertificatesCertificate `pulumi:"certificates"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of SLB server certificates IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of SLB server certificates names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// The Id of resource group which the slb server certificates belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// (Available in v1.66.0+) A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}
