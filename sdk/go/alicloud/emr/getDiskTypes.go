// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package emr

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// The `emr.getDiskTypes` data source provides a collection of data disk and 
// system disk types available in Alibaba Cloud account when create a emr cluster.
// 
// > **NOTE:** Available in 1.60.0+
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/emr_disk_types.html.markdown.
func LookupDiskTypes(ctx *pulumi.Context, args *GetDiskTypesArgs) (*GetDiskTypesResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["clusterType"] = args.ClusterType
		inputs["destinationResource"] = args.DestinationResource
		inputs["instanceChargeType"] = args.InstanceChargeType
		inputs["instanceType"] = args.InstanceType
		inputs["outputFile"] = args.OutputFile
		inputs["zoneId"] = args.ZoneId
	}
	outputs, err := ctx.Invoke("alicloud:emr/getDiskTypes:getDiskTypes", inputs)
	if err != nil {
		return nil, err
	}
	return &GetDiskTypesResult{
		ClusterType: outputs["clusterType"],
		DestinationResource: outputs["destinationResource"],
		Ids: outputs["ids"],
		InstanceChargeType: outputs["instanceChargeType"],
		InstanceType: outputs["instanceType"],
		OutputFile: outputs["outputFile"],
		Types: outputs["types"],
		ZoneId: outputs["zoneId"],
		Id: outputs["id"],
	}, nil
}

// A collection of arguments for invoking getDiskTypes.
type GetDiskTypesArgs struct {
	// The cluster type of the emr cluster instance. Possible values: `HADOOP`, `KAFKA`, `ZOOKEEPER`, `DRUID`.
	ClusterType interface{}
	// The destination resource of emr cluster instance
	DestinationResource interface{}
	// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
	InstanceChargeType interface{}
	// The ecs instance type of create emr cluster instance.
	InstanceType interface{}
	OutputFile interface{}
	// The Zone to create emr cluster instance.
	ZoneId interface{}
}

// A collection of values returned by getDiskTypes.
type GetDiskTypesResult struct {
	ClusterType interface{}
	DestinationResource interface{}
	// A list of data disk and system disk type IDs. 
	Ids interface{}
	InstanceChargeType interface{}
	InstanceType interface{}
	OutputFile interface{}
	// A list of emr instance types. Each element contains the following attributes:
	Types interface{}
	ZoneId interface{}
	// id is the provider-assigned unique ID for this managed resource.
	Id interface{}
}