// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ess

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides available scheduled task resources.
//
// > **NOTE:** Available in 1.72.0+
func GetScheduledTasks(ctx *pulumi.Context, args *GetScheduledTasksArgs, opts ...pulumi.InvokeOption) (*GetScheduledTasksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetScheduledTasksResult
	err := ctx.Invoke("alicloud:ess/getScheduledTasks:getScheduledTasks", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getScheduledTasks.
type GetScheduledTasksArgs struct {
	// A list of scheduled task IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter resulting scheduled tasks by name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The operation to be performed when a scheduled task is triggered.
	ScheduledAction *string `pulumi:"scheduledAction"`
	// The id of the scheduled task.
	ScheduledTaskId *string `pulumi:"scheduledTaskId"`
}

// A collection of values returned by getScheduledTasks.
type GetScheduledTasksResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of scheduled task ids.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of scheduled task names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// The operation to be performed when a scheduled task is triggered.
	ScheduledAction *string `pulumi:"scheduledAction"`
	ScheduledTaskId *string `pulumi:"scheduledTaskId"`
	// A list of scheduled tasks. Each element contains the following attributes:
	Tasks []GetScheduledTasksTask `pulumi:"tasks"`
}

func GetScheduledTasksOutput(ctx *pulumi.Context, args GetScheduledTasksOutputArgs, opts ...pulumi.InvokeOption) GetScheduledTasksResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetScheduledTasksResult, error) {
			args := v.(GetScheduledTasksArgs)
			r, err := GetScheduledTasks(ctx, &args, opts...)
			var s GetScheduledTasksResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetScheduledTasksResultOutput)
}

// A collection of arguments for invoking getScheduledTasks.
type GetScheduledTasksOutputArgs struct {
	// A list of scheduled task IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter resulting scheduled tasks by name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The operation to be performed when a scheduled task is triggered.
	ScheduledAction pulumi.StringPtrInput `pulumi:"scheduledAction"`
	// The id of the scheduled task.
	ScheduledTaskId pulumi.StringPtrInput `pulumi:"scheduledTaskId"`
}

func (GetScheduledTasksOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetScheduledTasksArgs)(nil)).Elem()
}

// A collection of values returned by getScheduledTasks.
type GetScheduledTasksResultOutput struct{ *pulumi.OutputState }

func (GetScheduledTasksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetScheduledTasksResult)(nil)).Elem()
}

func (o GetScheduledTasksResultOutput) ToGetScheduledTasksResultOutput() GetScheduledTasksResultOutput {
	return o
}

func (o GetScheduledTasksResultOutput) ToGetScheduledTasksResultOutputWithContext(ctx context.Context) GetScheduledTasksResultOutput {
	return o
}

func (o GetScheduledTasksResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetScheduledTasksResult] {
	return pulumix.Output[GetScheduledTasksResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetScheduledTasksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetScheduledTasksResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of scheduled task ids.
func (o GetScheduledTasksResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetScheduledTasksResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetScheduledTasksResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetScheduledTasksResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of scheduled task names.
func (o GetScheduledTasksResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetScheduledTasksResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetScheduledTasksResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetScheduledTasksResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The operation to be performed when a scheduled task is triggered.
func (o GetScheduledTasksResultOutput) ScheduledAction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetScheduledTasksResult) *string { return v.ScheduledAction }).(pulumi.StringPtrOutput)
}

func (o GetScheduledTasksResultOutput) ScheduledTaskId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetScheduledTasksResult) *string { return v.ScheduledTaskId }).(pulumi.StringPtrOutput)
}

// A list of scheduled tasks. Each element contains the following attributes:
func (o GetScheduledTasksResultOutput) Tasks() GetScheduledTasksTaskArrayOutput {
	return o.ApplyT(func(v GetScheduledTasksResult) []GetScheduledTasksTask { return v.Tasks }).(GetScheduledTasksTaskArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetScheduledTasksResultOutput{})
}
