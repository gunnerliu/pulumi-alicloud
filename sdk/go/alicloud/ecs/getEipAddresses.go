// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Eip Addresses of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.126.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "the_resource_name"
// 		example, err := ecs.GetEipAddresses(ctx, &ecs.GetEipAddressesArgs{
// 			Ids: []string{
// 				"eip-bp1jvx5ki6c********",
// 			},
// 			NameRegex: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstEipAddressId", example.Addresses[0].Id)
// 		return nil
// 	})
// }
// ```
func GetEipAddresses(ctx *pulumi.Context, args *GetEipAddressesArgs, opts ...pulumi.InvokeOption) (*GetEipAddressesResult, error) {
	var rv GetEipAddressesResult
	err := ctx.Invoke("alicloud:ecs/getEipAddresses:getEipAddresses", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEipAddresses.
type GetEipAddressesArgs struct {
	// The name of the EIP.
	AddressName *string `pulumi:"addressName"`
	// The associated instance id.
	AssociatedInstanceId *string `pulumi:"associatedInstanceId"`
	// The associated instance type.
	AssociatedInstanceType *string `pulumi:"associatedInstanceType"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// Default to `tue`. Set it to `false` can hidden the `tags` to output.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Address IDs.
	Ids []string `pulumi:"ids"`
	// The include reservation data. Valid values: `BGP` and `BGP_PRO`.
	IncludeReservationData *bool `pulumi:"includeReservationData"`
	// The IP address of the EIP.
	IpAddress *string `pulumi:"ipAddress"`
	// Deprecated: Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be remove in the future version. Please use the new attribute 'ip_address' instead.
	IpAddresses []string `pulumi:"ipAddresses"`
	// The Internet service provider (ISP).
	Isp *string `pulumi:"isp"`
	// The lock reason.
	LockReason *string `pulumi:"lockReason"`
	// A regex string to filter results by Address name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// The billing method of the EIP.
	PaymentType *string `pulumi:"paymentType"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The IDs of the contiguous EIPs.
	SegmentInstanceId *string `pulumi:"segmentInstanceId"`
	// The status of the EIP.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// A collection of values returned by getEipAddresses.
type GetEipAddressesResult struct {
	AddressName            *string                  `pulumi:"addressName"`
	Addresses              []GetEipAddressesAddress `pulumi:"addresses"`
	AssociatedInstanceId   *string                  `pulumi:"associatedInstanceId"`
	AssociatedInstanceType *string                  `pulumi:"associatedInstanceType"`
	DryRun                 *bool                    `pulumi:"dryRun"`
	// Deprecated: Field 'eips' has been deprecated from provider version 1.126.0 and it will be remove in the future version. Please use the new attribute 'addresses' instead.
	Eips          []GetEipAddressesEip `pulumi:"eips"`
	EnableDetails *bool                `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id                     string   `pulumi:"id"`
	Ids                    []string `pulumi:"ids"`
	IncludeReservationData *bool    `pulumi:"includeReservationData"`
	IpAddress              *string  `pulumi:"ipAddress"`
	// Deprecated: Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be remove in the future version. Please use the new attribute 'ip_address' instead.
	IpAddresses       []string               `pulumi:"ipAddresses"`
	Isp               *string                `pulumi:"isp"`
	LockReason        *string                `pulumi:"lockReason"`
	NameRegex         *string                `pulumi:"nameRegex"`
	Names             []string               `pulumi:"names"`
	OutputFile        *string                `pulumi:"outputFile"`
	PaymentType       *string                `pulumi:"paymentType"`
	ResourceGroupId   *string                `pulumi:"resourceGroupId"`
	SegmentInstanceId *string                `pulumi:"segmentInstanceId"`
	Status            *string                `pulumi:"status"`
	Tags              map[string]interface{} `pulumi:"tags"`
}
