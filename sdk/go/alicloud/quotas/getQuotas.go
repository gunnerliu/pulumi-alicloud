// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package quotas

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This data source provides the Quotas Quotas of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.115.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/quotas"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "专有宿主机总数量上限"
// 		example, err := quotas.GetQuotas(ctx, &quotas.GetQuotasArgs{
// 			ProductCode: "ecs",
// 			NameRegex:   &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstQuotasQuotaId", example.Quotas[0].Id)
// 		return nil
// 	})
// }
// ```
func GetQuotas(ctx *pulumi.Context, args *GetQuotasArgs, opts ...pulumi.InvokeOption) (*GetQuotasResult, error) {
	var rv GetQuotasResult
	err := ctx.Invoke("alicloud:quotas/getQuotas:getQuotas", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getQuotas.
type GetQuotasArgs struct {
	// The dimensions.
	Dimensions []GetQuotasDimension `pulumi:"dimensions"`
	// The group code.
	GroupCode *string `pulumi:"groupCode"`
	// The key word.
	KeyWord *string `pulumi:"keyWord"`
	// A regex string to filter results by Quota name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// The product code.
	ProductCode string `pulumi:"productCode"`
	// The quota action code.
	QuotaActionCode *string `pulumi:"quotaActionCode"`
	// The category of quota. Valid Values: `FlowControl` and `CommonQuota`.
	QuotaCategory *string `pulumi:"quotaCategory"`
	// Cloud service ECS specification quota supports setting sorting fields. Valid Values: `TIME`, `TOTAL` and `RESERVED`.
	SortField *string `pulumi:"sortField"`
	// Ranking of cloud service ECS specification quota support. Valid Values: `Ascending` and `Descending`.
	SortOrder *string `pulumi:"sortOrder"`
}

// A collection of values returned by getQuotas.
type GetQuotasResult struct {
	Dimensions []GetQuotasDimension `pulumi:"dimensions"`
	GroupCode  *string              `pulumi:"groupCode"`
	// The provider-assigned unique ID for this managed resource.
	Id              string           `pulumi:"id"`
	Ids             []string         `pulumi:"ids"`
	KeyWord         *string          `pulumi:"keyWord"`
	NameRegex       *string          `pulumi:"nameRegex"`
	Names           []string         `pulumi:"names"`
	OutputFile      *string          `pulumi:"outputFile"`
	ProductCode     string           `pulumi:"productCode"`
	QuotaActionCode *string          `pulumi:"quotaActionCode"`
	QuotaCategory   *string          `pulumi:"quotaCategory"`
	Quotas          []GetQuotasQuota `pulumi:"quotas"`
	SortField       *string          `pulumi:"sortField"`
	SortOrder       *string          `pulumi:"sortOrder"`
}
