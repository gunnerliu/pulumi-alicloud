// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pvtz

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides Private Zone Records resource information owned by an Alibaba Cloud account.
func GetZoneRecords(ctx *pulumi.Context, args *GetZoneRecordsArgs, opts ...pulumi.InvokeOption) (*GetZoneRecordsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetZoneRecordsResult
	err := ctx.Invoke("alicloud:pvtz/getZoneRecords:getZoneRecords", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZoneRecords.
type GetZoneRecordsArgs struct {
	// A list of Private Zone Record IDs.
	Ids []string `pulumi:"ids"`
	// Keyword for record rr and value.
	Keyword *string `pulumi:"keyword"`
	// User language.
	Lang *string `pulumi:"lang"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// Search mode. Value:
	// - LIKE: fuzzy search.
	// - EXACT: precise search. It is not filled in by default.
	SearchMode *string `pulumi:"searchMode"`
	// Resolve record status. Value:
	// - ENABLE: enable resolution.
	// - DISABLE: pause parsing.
	Status *string `pulumi:"status"`
	// It is not filled in by default, and queries the current zone resolution records. Fill in "ecs" to query the host name record list under the VPC associated with the current zone.
	Tag *string `pulumi:"tag"`
	// User ip.
	UserClientIp *string `pulumi:"userClientIp"`
	// ID of the Private Zone.
	ZoneId string `pulumi:"zoneId"`
}

// A collection of values returned by getZoneRecords.
type GetZoneRecordsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Private Zone Record IDs.
	Ids        []string `pulumi:"ids"`
	Keyword    *string  `pulumi:"keyword"`
	Lang       *string  `pulumi:"lang"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of zone records. Each element contains the following attributes:
	Records    []GetZoneRecordsRecord `pulumi:"records"`
	SearchMode *string                `pulumi:"searchMode"`
	// Status of the Private Zone Record.
	Status       *string `pulumi:"status"`
	Tag          *string `pulumi:"tag"`
	UserClientIp *string `pulumi:"userClientIp"`
	ZoneId       string  `pulumi:"zoneId"`
}

func GetZoneRecordsOutput(ctx *pulumi.Context, args GetZoneRecordsOutputArgs, opts ...pulumi.InvokeOption) GetZoneRecordsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetZoneRecordsResult, error) {
			args := v.(GetZoneRecordsArgs)
			r, err := GetZoneRecords(ctx, &args, opts...)
			var s GetZoneRecordsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetZoneRecordsResultOutput)
}

// A collection of arguments for invoking getZoneRecords.
type GetZoneRecordsOutputArgs struct {
	// A list of Private Zone Record IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// Keyword for record rr and value.
	Keyword pulumi.StringPtrInput `pulumi:"keyword"`
	// User language.
	Lang pulumi.StringPtrInput `pulumi:"lang"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Search mode. Value:
	// - LIKE: fuzzy search.
	// - EXACT: precise search. It is not filled in by default.
	SearchMode pulumi.StringPtrInput `pulumi:"searchMode"`
	// Resolve record status. Value:
	// - ENABLE: enable resolution.
	// - DISABLE: pause parsing.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// It is not filled in by default, and queries the current zone resolution records. Fill in "ecs" to query the host name record list under the VPC associated with the current zone.
	Tag pulumi.StringPtrInput `pulumi:"tag"`
	// User ip.
	UserClientIp pulumi.StringPtrInput `pulumi:"userClientIp"`
	// ID of the Private Zone.
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
}

func (GetZoneRecordsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZoneRecordsArgs)(nil)).Elem()
}

// A collection of values returned by getZoneRecords.
type GetZoneRecordsResultOutput struct{ *pulumi.OutputState }

func (GetZoneRecordsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZoneRecordsResult)(nil)).Elem()
}

func (o GetZoneRecordsResultOutput) ToGetZoneRecordsResultOutput() GetZoneRecordsResultOutput {
	return o
}

func (o GetZoneRecordsResultOutput) ToGetZoneRecordsResultOutputWithContext(ctx context.Context) GetZoneRecordsResultOutput {
	return o
}

func (o GetZoneRecordsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetZoneRecordsResult] {
	return pulumix.Output[GetZoneRecordsResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetZoneRecordsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetZoneRecordsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of Private Zone Record IDs.
func (o GetZoneRecordsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetZoneRecordsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetZoneRecordsResultOutput) Keyword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZoneRecordsResult) *string { return v.Keyword }).(pulumi.StringPtrOutput)
}

func (o GetZoneRecordsResultOutput) Lang() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZoneRecordsResult) *string { return v.Lang }).(pulumi.StringPtrOutput)
}

func (o GetZoneRecordsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZoneRecordsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of zone records. Each element contains the following attributes:
func (o GetZoneRecordsResultOutput) Records() GetZoneRecordsRecordArrayOutput {
	return o.ApplyT(func(v GetZoneRecordsResult) []GetZoneRecordsRecord { return v.Records }).(GetZoneRecordsRecordArrayOutput)
}

func (o GetZoneRecordsResultOutput) SearchMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZoneRecordsResult) *string { return v.SearchMode }).(pulumi.StringPtrOutput)
}

// Status of the Private Zone Record.
func (o GetZoneRecordsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZoneRecordsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetZoneRecordsResultOutput) Tag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZoneRecordsResult) *string { return v.Tag }).(pulumi.StringPtrOutput)
}

func (o GetZoneRecordsResultOutput) UserClientIp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZoneRecordsResult) *string { return v.UserClientIp }).(pulumi.StringPtrOutput)
}

func (o GetZoneRecordsResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v GetZoneRecordsResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetZoneRecordsResultOutput{})
}
