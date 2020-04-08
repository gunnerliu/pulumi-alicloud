// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package gpdb

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// This data source provides availability zones for Gpdb that can be accessed by an Alibaba Cloud account within the region configured in the provider.
//
// > **NOTE:** Available in v1.73.0+.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/gpdb_zones.html.markdown.
func GetZones(ctx *pulumi.Context, args *GetZonesArgs, opts ...pulumi.InvokeOption) (*GetZonesResult, error) {
	var rv GetZonesResult
	err := ctx.Invoke("alicloud:gpdb/getZones:getZones", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZones.
type GetZonesArgs struct {
	// Indicate whether the zones can be used in a multi AZ configuration. Default to `false`. Multi AZ is usually used to launch Gpdb instances.
	Multi      *bool   `pulumi:"multi"`
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getZones.
type GetZonesResult struct {
	// id is the provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of zone IDs.
	Ids        []string `pulumi:"ids"`
	Multi      *bool    `pulumi:"multi"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of availability zones. Each element contains the following attributes:
	Zones []GetZonesZone `pulumi:"zones"`
}