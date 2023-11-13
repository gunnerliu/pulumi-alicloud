// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cfg

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Config Aggregators of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.124.0+.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cfg"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := cfg.GetAggregators(ctx, &cfg.GetAggregatorsArgs{
//				Ids: []string{
//					"ca-3ce2626622af0005****",
//				},
//				NameRegex: pulumi.StringRef("the_resource_name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstConfigAggregatorId", example.Aggregators[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetAggregators(ctx *pulumi.Context, args *GetAggregatorsArgs, opts ...pulumi.InvokeOption) (*GetAggregatorsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAggregatorsResult
	err := ctx.Invoke("alicloud:cfg/getAggregators:getAggregators", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAggregators.
type GetAggregatorsArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of aggregator ids.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by aggregator name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the resource. Valid Values:  `0`: creating `1`: normal `2`: deleting.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getAggregators.
type GetAggregatorsResult struct {
	// A list of config aggregators. Each element contains the following attributes:
	Aggregators   []GetAggregatorsAggregator `pulumi:"aggregators"`
	EnableDetails *bool                      `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id        string   `pulumi:"id"`
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of Aggregator names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of the resource.
	Status *string `pulumi:"status"`
}

func GetAggregatorsOutput(ctx *pulumi.Context, args GetAggregatorsOutputArgs, opts ...pulumi.InvokeOption) GetAggregatorsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAggregatorsResult, error) {
			args := v.(GetAggregatorsArgs)
			r, err := GetAggregators(ctx, &args, opts...)
			var s GetAggregatorsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAggregatorsResultOutput)
}

// A collection of arguments for invoking getAggregators.
type GetAggregatorsOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of aggregator ids.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by aggregator name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the resource. Valid Values:  `0`: creating `1`: normal `2`: deleting.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetAggregatorsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAggregatorsArgs)(nil)).Elem()
}

// A collection of values returned by getAggregators.
type GetAggregatorsResultOutput struct{ *pulumi.OutputState }

func (GetAggregatorsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAggregatorsResult)(nil)).Elem()
}

func (o GetAggregatorsResultOutput) ToGetAggregatorsResultOutput() GetAggregatorsResultOutput {
	return o
}

func (o GetAggregatorsResultOutput) ToGetAggregatorsResultOutputWithContext(ctx context.Context) GetAggregatorsResultOutput {
	return o
}

// A list of config aggregators. Each element contains the following attributes:
func (o GetAggregatorsResultOutput) Aggregators() GetAggregatorsAggregatorArrayOutput {
	return o.ApplyT(func(v GetAggregatorsResult) []GetAggregatorsAggregator { return v.Aggregators }).(GetAggregatorsAggregatorArrayOutput)
}

func (o GetAggregatorsResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetAggregatorsResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAggregatorsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAggregatorsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAggregatorsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAggregatorsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetAggregatorsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAggregatorsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of Aggregator names.
func (o GetAggregatorsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAggregatorsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetAggregatorsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAggregatorsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The status of the resource.
func (o GetAggregatorsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAggregatorsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAggregatorsResultOutput{})
}
