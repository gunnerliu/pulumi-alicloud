// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cassandra

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// The `cassandra.getDataCenters` data source provides a collection of Cassandra Data Centers available in Alicloud account.
// Filters support regular expression for the cluster name or ids.
//
// > **NOTE:**  Available in 1.88.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/cassandra"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "tf_testAccCassandra_dc"
// 		_, err := cassandra.GetDataCenters(ctx, &cassandra.GetDataCentersArgs{
// 			ClusterId: "cds-xxxxx",
// 			NameRegex: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetDataCenters(ctx *pulumi.Context, args *GetDataCentersArgs, opts ...pulumi.InvokeOption) (*GetDataCentersResult, error) {
	var rv GetDataCentersResult
	err := ctx.Invoke("alicloud:cassandra/getDataCenters:getDataCenters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDataCenters.
type GetDataCentersArgs struct {
	// The cluster id of dataCenters belongs to.
	ClusterId string `pulumi:"clusterId"`
	// The list of Cassandra data center ids.
	Ids []string `pulumi:"ids"`
	// A regex string to apply to the cluster name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getDataCenters.
type GetDataCentersResult struct {
	// A list of Cassandra data centers. Its every element contains the following attributes:
	Centers []GetDataCentersCenter `pulumi:"centers"`
	// The ID of the Cassandra cluster.
	ClusterId string `pulumi:"clusterId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The list of Cassandra data center ids.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// The name list of Cassandra data centers.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}
