// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package resourcemanager

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This data source provides the Resource Manager Handshakes of the current Alibaba Cloud user.
//
// > **NOTE:**  Available in 1.86.0+.
func GetHandshakes(ctx *pulumi.Context, args *GetHandshakesArgs, opts ...pulumi.InvokeOption) (*GetHandshakesResult, error) {
	var rv GetHandshakesResult
	err := ctx.Invoke("alicloud:resourcemanager/getHandshakes:getHandshakes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHandshakes.
type GetHandshakesArgs struct {
	// A list of Resource Manager Handshake IDs.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
}

// A collection of values returned by getHandshakes.
type GetHandshakesResult struct {
	// A list of Resource Manager Handshakes. Each element contains the following attributes:
	Handshakes []GetHandshakesHandshake `pulumi:"handshakes"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Resource Manager Handshake IDs.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
}