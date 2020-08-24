// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cas

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This data source provides a list of CAS Certificates in an Alibaba Cloud account according to the specified filters.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/cas"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "^cas"
// 		opt1 := fmt.Sprintf("%v%v", path.Module, "/cas_certificates.json")
// 		certs, err := cas.GetCertificates(ctx, &cas.GetCertificatesArgs{
// 			NameRegex:  &opt0,
// 			OutputFile: &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("cert", certs.Certificates[0].Id)
// 		return nil
// 	})
// }
// ```
func GetCertificates(ctx *pulumi.Context, args *GetCertificatesArgs, opts ...pulumi.InvokeOption) (*GetCertificatesResult, error) {
	var rv GetCertificatesResult
	err := ctx.Invoke("alicloud:cas/getCertificates:getCertificates", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCertificates.
type GetCertificatesArgs struct {
	// A list of cert IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by the certificate name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getCertificates.
type GetCertificatesResult struct {
	// A list of apis. Each element contains the following attributes:
	Certificates []GetCertificatesCertificate `pulumi:"certificates"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of cert IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of cert names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}
