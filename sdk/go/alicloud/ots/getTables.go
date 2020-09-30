// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ots

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This data source provides the ots tables of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.40.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/ots"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "sample-table"
// 		opt1 := "tables.txt"
// 		tablesDs, err := ots.GetTables(ctx, &ots.GetTablesArgs{
// 			InstanceName: "sample-instance",
// 			NameRegex:    &opt0,
// 			OutputFile:   &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstTableId", tablesDs.Tables[0].Id)
// 		return nil
// 	})
// }
// ```
func GetTables(ctx *pulumi.Context, args *GetTablesArgs, opts ...pulumi.InvokeOption) (*GetTablesResult, error) {
	var rv GetTablesResult
	err := ctx.Invoke("alicloud:ots/getTables:getTables", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTables.
type GetTablesArgs struct {
	// A list of table IDs.
	Ids []string `pulumi:"ids"`
	// The name of OTS instance.
	InstanceName string `pulumi:"instanceName"`
	// A regex string to filter results by table name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getTables.
type GetTablesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of table IDs.
	Ids []string `pulumi:"ids"`
	// The OTS instance name.
	InstanceName string  `pulumi:"instanceName"`
	NameRegex    *string `pulumi:"nameRegex"`
	// A list of table names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of tables. Each element contains the following attributes:
	Tables []GetTablesTable `pulumi:"tables"`
}