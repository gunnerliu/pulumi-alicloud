// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cfg

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Config Aggregate Compliance Packs of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.124.0+.
func GetAggregateCompliancePacks(ctx *pulumi.Context, args *GetAggregateCompliancePacksArgs, opts ...pulumi.InvokeOption) (*GetAggregateCompliancePacksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAggregateCompliancePacksResult
	err := ctx.Invoke("alicloud:cfg/getAggregateCompliancePacks:getAggregateCompliancePacks", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAggregateCompliancePacks.
type GetAggregateCompliancePacksArgs struct {
	// The ID of aggregator.
	AggregatorId string `pulumi:"aggregatorId"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Aggregate Compliance Pack IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Aggregate Compliance Pack name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the resource. Valid values `ACTIVE`, `CREATING`, `INACTIVE`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getAggregateCompliancePacks.
type GetAggregateCompliancePacksResult struct {
	AggregatorId  string `pulumi:"aggregatorId"`
	EnableDetails *bool  `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id        string   `pulumi:"id"`
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of Config Aggregate Compliance Pack names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of Config Aggregate Compliance Packs. Each element contains the following attributes:
	Packs []GetAggregateCompliancePacksPack `pulumi:"packs"`
	// The status of the resource.
	Status *string `pulumi:"status"`
}

func GetAggregateCompliancePacksOutput(ctx *pulumi.Context, args GetAggregateCompliancePacksOutputArgs, opts ...pulumi.InvokeOption) GetAggregateCompliancePacksResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAggregateCompliancePacksResult, error) {
			args := v.(GetAggregateCompliancePacksArgs)
			r, err := GetAggregateCompliancePacks(ctx, &args, opts...)
			var s GetAggregateCompliancePacksResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAggregateCompliancePacksResultOutput)
}

// A collection of arguments for invoking getAggregateCompliancePacks.
type GetAggregateCompliancePacksOutputArgs struct {
	// The ID of aggregator.
	AggregatorId pulumi.StringInput `pulumi:"aggregatorId"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Aggregate Compliance Pack IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Aggregate Compliance Pack name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the resource. Valid values `ACTIVE`, `CREATING`, `INACTIVE`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetAggregateCompliancePacksOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAggregateCompliancePacksArgs)(nil)).Elem()
}

// A collection of values returned by getAggregateCompliancePacks.
type GetAggregateCompliancePacksResultOutput struct{ *pulumi.OutputState }

func (GetAggregateCompliancePacksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAggregateCompliancePacksResult)(nil)).Elem()
}

func (o GetAggregateCompliancePacksResultOutput) ToGetAggregateCompliancePacksResultOutput() GetAggregateCompliancePacksResultOutput {
	return o
}

func (o GetAggregateCompliancePacksResultOutput) ToGetAggregateCompliancePacksResultOutputWithContext(ctx context.Context) GetAggregateCompliancePacksResultOutput {
	return o
}

func (o GetAggregateCompliancePacksResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetAggregateCompliancePacksResult] {
	return pulumix.Output[GetAggregateCompliancePacksResult]{
		OutputState: o.OutputState,
	}
}

func (o GetAggregateCompliancePacksResultOutput) AggregatorId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAggregateCompliancePacksResult) string { return v.AggregatorId }).(pulumi.StringOutput)
}

func (o GetAggregateCompliancePacksResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetAggregateCompliancePacksResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAggregateCompliancePacksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAggregateCompliancePacksResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAggregateCompliancePacksResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAggregateCompliancePacksResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetAggregateCompliancePacksResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAggregateCompliancePacksResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of Config Aggregate Compliance Pack names.
func (o GetAggregateCompliancePacksResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAggregateCompliancePacksResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetAggregateCompliancePacksResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAggregateCompliancePacksResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of Config Aggregate Compliance Packs. Each element contains the following attributes:
func (o GetAggregateCompliancePacksResultOutput) Packs() GetAggregateCompliancePacksPackArrayOutput {
	return o.ApplyT(func(v GetAggregateCompliancePacksResult) []GetAggregateCompliancePacksPack { return v.Packs }).(GetAggregateCompliancePacksPackArrayOutput)
}

// The status of the resource.
func (o GetAggregateCompliancePacksResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAggregateCompliancePacksResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAggregateCompliancePacksResultOutput{})
}
