// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Vpc Flow Logs of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.122.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := vpc.GetVpcFlowLogs(ctx, &vpc.GetVpcFlowLogsArgs{
//				Ids: []string{
//					"example_value",
//				},
//				NameRegex: pulumi.StringRef("the_resource_name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstVpcFlowLogId", example.Logs[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetVpcFlowLogs(ctx *pulumi.Context, args *GetVpcFlowLogsArgs, opts ...pulumi.InvokeOption) (*GetVpcFlowLogsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVpcFlowLogsResult
	err := ctx.Invoke("alicloud:vpc/getVpcFlowLogs:getVpcFlowLogs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVpcFlowLogs.
type GetVpcFlowLogsArgs struct {
	// The Description of flow log.
	Description *string `pulumi:"description"`
	// The flow log name.
	FlowLogName *string `pulumi:"flowLogName"`
	// A list of Flow Log IDs.
	Ids []string `pulumi:"ids"`
	// The log store name.
	LogStoreName *string `pulumi:"logStoreName"`
	// A regex string to filter results by Flow Log name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The project name.
	ProjectName *string `pulumi:"projectName"`
	// The resource id.
	ResourceId *string `pulumi:"resourceId"`
	// The resource type.
	ResourceType *string `pulumi:"resourceType"`
	// The status of flow log.
	Status *string `pulumi:"status"`
	// The traffic type.
	TrafficType *string `pulumi:"trafficType"`
}

// A collection of values returned by getVpcFlowLogs.
type GetVpcFlowLogsResult struct {
	Description *string `pulumi:"description"`
	FlowLogName *string `pulumi:"flowLogName"`
	// The provider-assigned unique ID for this managed resource.
	Id           string              `pulumi:"id"`
	Ids          []string            `pulumi:"ids"`
	LogStoreName *string             `pulumi:"logStoreName"`
	Logs         []GetVpcFlowLogsLog `pulumi:"logs"`
	NameRegex    *string             `pulumi:"nameRegex"`
	Names        []string            `pulumi:"names"`
	OutputFile   *string             `pulumi:"outputFile"`
	ProjectName  *string             `pulumi:"projectName"`
	ResourceId   *string             `pulumi:"resourceId"`
	ResourceType *string             `pulumi:"resourceType"`
	Status       *string             `pulumi:"status"`
	TrafficType  *string             `pulumi:"trafficType"`
}

func GetVpcFlowLogsOutput(ctx *pulumi.Context, args GetVpcFlowLogsOutputArgs, opts ...pulumi.InvokeOption) GetVpcFlowLogsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVpcFlowLogsResult, error) {
			args := v.(GetVpcFlowLogsArgs)
			r, err := GetVpcFlowLogs(ctx, &args, opts...)
			var s GetVpcFlowLogsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVpcFlowLogsResultOutput)
}

// A collection of arguments for invoking getVpcFlowLogs.
type GetVpcFlowLogsOutputArgs struct {
	// The Description of flow log.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// The flow log name.
	FlowLogName pulumi.StringPtrInput `pulumi:"flowLogName"`
	// A list of Flow Log IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The log store name.
	LogStoreName pulumi.StringPtrInput `pulumi:"logStoreName"`
	// A regex string to filter results by Flow Log name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The project name.
	ProjectName pulumi.StringPtrInput `pulumi:"projectName"`
	// The resource id.
	ResourceId pulumi.StringPtrInput `pulumi:"resourceId"`
	// The resource type.
	ResourceType pulumi.StringPtrInput `pulumi:"resourceType"`
	// The status of flow log.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The traffic type.
	TrafficType pulumi.StringPtrInput `pulumi:"trafficType"`
}

func (GetVpcFlowLogsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcFlowLogsArgs)(nil)).Elem()
}

// A collection of values returned by getVpcFlowLogs.
type GetVpcFlowLogsResultOutput struct{ *pulumi.OutputState }

func (GetVpcFlowLogsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcFlowLogsResult)(nil)).Elem()
}

func (o GetVpcFlowLogsResultOutput) ToGetVpcFlowLogsResultOutput() GetVpcFlowLogsResultOutput {
	return o
}

func (o GetVpcFlowLogsResultOutput) ToGetVpcFlowLogsResultOutputWithContext(ctx context.Context) GetVpcFlowLogsResultOutput {
	return o
}

func (o GetVpcFlowLogsResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFlowLogsResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

func (o GetVpcFlowLogsResultOutput) FlowLogName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFlowLogsResult) *string { return v.FlowLogName }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetVpcFlowLogsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcFlowLogsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetVpcFlowLogsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVpcFlowLogsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetVpcFlowLogsResultOutput) LogStoreName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFlowLogsResult) *string { return v.LogStoreName }).(pulumi.StringPtrOutput)
}

func (o GetVpcFlowLogsResultOutput) Logs() GetVpcFlowLogsLogArrayOutput {
	return o.ApplyT(func(v GetVpcFlowLogsResult) []GetVpcFlowLogsLog { return v.Logs }).(GetVpcFlowLogsLogArrayOutput)
}

func (o GetVpcFlowLogsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFlowLogsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetVpcFlowLogsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVpcFlowLogsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetVpcFlowLogsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFlowLogsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetVpcFlowLogsResultOutput) ProjectName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFlowLogsResult) *string { return v.ProjectName }).(pulumi.StringPtrOutput)
}

func (o GetVpcFlowLogsResultOutput) ResourceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFlowLogsResult) *string { return v.ResourceId }).(pulumi.StringPtrOutput)
}

func (o GetVpcFlowLogsResultOutput) ResourceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFlowLogsResult) *string { return v.ResourceType }).(pulumi.StringPtrOutput)
}

func (o GetVpcFlowLogsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFlowLogsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetVpcFlowLogsResultOutput) TrafficType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFlowLogsResult) *string { return v.TrafficType }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVpcFlowLogsResultOutput{})
}
