// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package kvstore

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This data source can query the public IP of the specified KVStore DBInstance.
//
// > **NOTE:** Available in v1.101.0+.
func GetConnections(ctx *pulumi.Context, args *GetConnectionsArgs, opts ...pulumi.InvokeOption) (*GetConnectionsResult, error) {
	var rv GetConnectionsResult
	err := ctx.Invoke("alicloud:kvstore/getConnections:getConnections", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnections.
type GetConnectionsArgs struct {
	// A list of KVStore DBInstance ids, only support one item.
	Ids        string  `pulumi:"ids"`
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getConnections.
type GetConnectionsResult struct {
	// Public network details of the specified resource. contains the following attributes:
	Connections []GetConnectionsConnection `pulumi:"connections"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of KVStore DBInstance ids.
	Ids        string  `pulumi:"ids"`
	OutputFile *string `pulumi:"outputFile"`
}
