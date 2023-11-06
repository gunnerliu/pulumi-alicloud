// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sag

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Smartag Flow Logs of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.168.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/sag"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := sag.GetSmartagFlowLogs(ctx, &sag.GetSmartagFlowLogsArgs{
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("smartagFlowLogId1", ids.Logs[0].Id)
//			nameRegex, err := sag.GetSmartagFlowLogs(ctx, &sag.GetSmartagFlowLogsArgs{
//				NameRegex: pulumi.StringRef("^my-FlowLog"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("smartagFlowLogId2", nameRegex.Logs[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetSmartagFlowLogs(ctx *pulumi.Context, args *GetSmartagFlowLogsArgs, opts ...pulumi.InvokeOption) (*GetSmartagFlowLogsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSmartagFlowLogsResult
	err := ctx.Invoke("alicloud:sag/getSmartagFlowLogs:getSmartagFlowLogs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSmartagFlowLogs.
type GetSmartagFlowLogsArgs struct {
	// The description of the flow log.
	Description *string `pulumi:"description"`
	// A list of Flow Log IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Flow Log name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
	// The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getSmartagFlowLogs.
type GetSmartagFlowLogsResult struct {
	Description *string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                  `pulumi:"id"`
	Ids        []string                `pulumi:"ids"`
	Logs       []GetSmartagFlowLogsLog `pulumi:"logs"`
	NameRegex  *string                 `pulumi:"nameRegex"`
	Names      []string                `pulumi:"names"`
	OutputFile *string                 `pulumi:"outputFile"`
	PageNumber *int                    `pulumi:"pageNumber"`
	PageSize   *int                    `pulumi:"pageSize"`
	Status     *string                 `pulumi:"status"`
}

func GetSmartagFlowLogsOutput(ctx *pulumi.Context, args GetSmartagFlowLogsOutputArgs, opts ...pulumi.InvokeOption) GetSmartagFlowLogsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSmartagFlowLogsResult, error) {
			args := v.(GetSmartagFlowLogsArgs)
			r, err := GetSmartagFlowLogs(ctx, &args, opts...)
			var s GetSmartagFlowLogsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSmartagFlowLogsResultOutput)
}

// A collection of arguments for invoking getSmartagFlowLogs.
type GetSmartagFlowLogsOutputArgs struct {
	// The description of the flow log.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// A list of Flow Log IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Flow Log name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
	// The status of the flow log. Valid values:  `Active`: The flow log is enabled. `Inactive`: The flow log is disabled.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetSmartagFlowLogsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmartagFlowLogsArgs)(nil)).Elem()
}

// A collection of values returned by getSmartagFlowLogs.
type GetSmartagFlowLogsResultOutput struct{ *pulumi.OutputState }

func (GetSmartagFlowLogsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSmartagFlowLogsResult)(nil)).Elem()
}

func (o GetSmartagFlowLogsResultOutput) ToGetSmartagFlowLogsResultOutput() GetSmartagFlowLogsResultOutput {
	return o
}

func (o GetSmartagFlowLogsResultOutput) ToGetSmartagFlowLogsResultOutputWithContext(ctx context.Context) GetSmartagFlowLogsResultOutput {
	return o
}

func (o GetSmartagFlowLogsResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSmartagFlowLogsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSmartagFlowLogsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSmartagFlowLogsResultOutput) Logs() GetSmartagFlowLogsLogArrayOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsResult) []GetSmartagFlowLogsLog { return v.Logs }).(GetSmartagFlowLogsLogArrayOutput)
}

func (o GetSmartagFlowLogsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetSmartagFlowLogsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetSmartagFlowLogsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetSmartagFlowLogsResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetSmartagFlowLogsResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func (o GetSmartagFlowLogsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSmartagFlowLogsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSmartagFlowLogsResultOutput{})
}
