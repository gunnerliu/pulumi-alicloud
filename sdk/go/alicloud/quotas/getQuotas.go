// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package quotas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Quotas Quotas of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.115.0+.
func GetQuotas(ctx *pulumi.Context, args *GetQuotasArgs, opts ...pulumi.InvokeOption) (*GetQuotasResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
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
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
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

func GetQuotasOutput(ctx *pulumi.Context, args GetQuotasOutputArgs, opts ...pulumi.InvokeOption) GetQuotasResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetQuotasResult, error) {
			args := v.(GetQuotasArgs)
			r, err := GetQuotas(ctx, &args, opts...)
			var s GetQuotasResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetQuotasResultOutput)
}

// A collection of arguments for invoking getQuotas.
type GetQuotasOutputArgs struct {
	// The dimensions.
	Dimensions GetQuotasDimensionArrayInput `pulumi:"dimensions"`
	// The group code.
	GroupCode pulumi.StringPtrInput `pulumi:"groupCode"`
	// The key word.
	KeyWord pulumi.StringPtrInput `pulumi:"keyWord"`
	// A regex string to filter results by Quota name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The product code.
	ProductCode pulumi.StringInput `pulumi:"productCode"`
	// The quota action code.
	QuotaActionCode pulumi.StringPtrInput `pulumi:"quotaActionCode"`
	// The category of quota. Valid Values: `FlowControl` and `CommonQuota`.
	QuotaCategory pulumi.StringPtrInput `pulumi:"quotaCategory"`
	// Cloud service ECS specification quota supports setting sorting fields. Valid Values: `TIME`, `TOTAL` and `RESERVED`.
	SortField pulumi.StringPtrInput `pulumi:"sortField"`
	// Ranking of cloud service ECS specification quota support. Valid Values: `Ascending` and `Descending`.
	SortOrder pulumi.StringPtrInput `pulumi:"sortOrder"`
}

func (GetQuotasOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetQuotasArgs)(nil)).Elem()
}

// A collection of values returned by getQuotas.
type GetQuotasResultOutput struct{ *pulumi.OutputState }

func (GetQuotasResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetQuotasResult)(nil)).Elem()
}

func (o GetQuotasResultOutput) ToGetQuotasResultOutput() GetQuotasResultOutput {
	return o
}

func (o GetQuotasResultOutput) ToGetQuotasResultOutputWithContext(ctx context.Context) GetQuotasResultOutput {
	return o
}

func (o GetQuotasResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetQuotasResult] {
	return pulumix.Output[GetQuotasResult]{
		OutputState: o.OutputState,
	}
}

func (o GetQuotasResultOutput) Dimensions() GetQuotasDimensionArrayOutput {
	return o.ApplyT(func(v GetQuotasResult) []GetQuotasDimension { return v.Dimensions }).(GetQuotasDimensionArrayOutput)
}

func (o GetQuotasResultOutput) GroupCode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetQuotasResult) *string { return v.GroupCode }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetQuotasResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetQuotasResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetQuotasResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetQuotasResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetQuotasResultOutput) KeyWord() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetQuotasResult) *string { return v.KeyWord }).(pulumi.StringPtrOutput)
}

func (o GetQuotasResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetQuotasResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetQuotasResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetQuotasResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetQuotasResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetQuotasResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetQuotasResultOutput) ProductCode() pulumi.StringOutput {
	return o.ApplyT(func(v GetQuotasResult) string { return v.ProductCode }).(pulumi.StringOutput)
}

func (o GetQuotasResultOutput) QuotaActionCode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetQuotasResult) *string { return v.QuotaActionCode }).(pulumi.StringPtrOutput)
}

func (o GetQuotasResultOutput) QuotaCategory() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetQuotasResult) *string { return v.QuotaCategory }).(pulumi.StringPtrOutput)
}

func (o GetQuotasResultOutput) Quotas() GetQuotasQuotaArrayOutput {
	return o.ApplyT(func(v GetQuotasResult) []GetQuotasQuota { return v.Quotas }).(GetQuotasQuotaArrayOutput)
}

func (o GetQuotasResultOutput) SortField() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetQuotasResult) *string { return v.SortField }).(pulumi.StringPtrOutput)
}

func (o GetQuotasResultOutput) SortOrder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetQuotasResult) *string { return v.SortOrder }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetQuotasResultOutput{})
}
