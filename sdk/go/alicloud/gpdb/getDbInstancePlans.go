// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gpdb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Gpdb Db Instance Plans of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.189.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/gpdb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := gpdb.GetDbInstancePlans(ctx, &gpdb.GetDbInstancePlansArgs{
//				DbInstanceId: "example_value",
//				Ids: []string{
//					"example_value",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("gpdbDbInstancePlanId1", ids.Plans[0].Id)
//			nameRegex, err := gpdb.GetDbInstancePlans(ctx, &gpdb.GetDbInstancePlansArgs{
//				DbInstanceId: "example_value",
//				NameRegex:    pulumi.StringRef("^my-DBInstancePlan"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("gpdbDbInstancePlanId2", nameRegex.Plans[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetDbInstancePlans(ctx *pulumi.Context, args *GetDbInstancePlansArgs, opts ...pulumi.InvokeOption) (*GetDbInstancePlansResult, error) {
	var rv GetDbInstancePlansResult
	err := ctx.Invoke("alicloud:gpdb/getDbInstancePlans:getDbInstancePlans", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDbInstancePlans.
type GetDbInstancePlansArgs struct {
	// The ID of the Database instance.
	DbInstanceId string `pulumi:"dbInstanceId"`
	// A list of DB Instance Plan IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by DB Instance Plan name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// Plan scheduling type. Valid values: `Postpone`, `Regular`.
	PlanScheduleType *string `pulumi:"planScheduleType"`
	// The type of the Plan. Valid values: `PauseResume`, `Resize`.
	PlanType *string `pulumi:"planType"`
	// The Status of the Plan.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getDbInstancePlans.
type GetDbInstancePlansResult struct {
	DbInstanceId string `pulumi:"dbInstanceId"`
	// The provider-assigned unique ID for this managed resource.
	Id               string                   `pulumi:"id"`
	Ids              []string                 `pulumi:"ids"`
	NameRegex        *string                  `pulumi:"nameRegex"`
	Names            []string                 `pulumi:"names"`
	OutputFile       *string                  `pulumi:"outputFile"`
	PlanScheduleType *string                  `pulumi:"planScheduleType"`
	PlanType         *string                  `pulumi:"planType"`
	Plans            []GetDbInstancePlansPlan `pulumi:"plans"`
	Status           *string                  `pulumi:"status"`
}

func GetDbInstancePlansOutput(ctx *pulumi.Context, args GetDbInstancePlansOutputArgs, opts ...pulumi.InvokeOption) GetDbInstancePlansResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDbInstancePlansResult, error) {
			args := v.(GetDbInstancePlansArgs)
			r, err := GetDbInstancePlans(ctx, &args, opts...)
			var s GetDbInstancePlansResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDbInstancePlansResultOutput)
}

// A collection of arguments for invoking getDbInstancePlans.
type GetDbInstancePlansOutputArgs struct {
	// The ID of the Database instance.
	DbInstanceId pulumi.StringInput `pulumi:"dbInstanceId"`
	// A list of DB Instance Plan IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by DB Instance Plan name.
	NameRegex  pulumi.StringPtrInput `pulumi:"nameRegex"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Plan scheduling type. Valid values: `Postpone`, `Regular`.
	PlanScheduleType pulumi.StringPtrInput `pulumi:"planScheduleType"`
	// The type of the Plan. Valid values: `PauseResume`, `Resize`.
	PlanType pulumi.StringPtrInput `pulumi:"planType"`
	// The Status of the Plan.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetDbInstancePlansOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDbInstancePlansArgs)(nil)).Elem()
}

// A collection of values returned by getDbInstancePlans.
type GetDbInstancePlansResultOutput struct{ *pulumi.OutputState }

func (GetDbInstancePlansResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDbInstancePlansResult)(nil)).Elem()
}

func (o GetDbInstancePlansResultOutput) ToGetDbInstancePlansResultOutput() GetDbInstancePlansResultOutput {
	return o
}

func (o GetDbInstancePlansResultOutput) ToGetDbInstancePlansResultOutputWithContext(ctx context.Context) GetDbInstancePlansResultOutput {
	return o
}

func (o GetDbInstancePlansResultOutput) DbInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancePlansResult) string { return v.DbInstanceId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDbInstancePlansResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDbInstancePlansResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDbInstancePlansResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDbInstancePlansResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetDbInstancePlansResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDbInstancePlansResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetDbInstancePlansResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDbInstancePlansResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetDbInstancePlansResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDbInstancePlansResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetDbInstancePlansResultOutput) PlanScheduleType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDbInstancePlansResult) *string { return v.PlanScheduleType }).(pulumi.StringPtrOutput)
}

func (o GetDbInstancePlansResultOutput) PlanType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDbInstancePlansResult) *string { return v.PlanType }).(pulumi.StringPtrOutput)
}

func (o GetDbInstancePlansResultOutput) Plans() GetDbInstancePlansPlanArrayOutput {
	return o.ApplyT(func(v GetDbInstancePlansResult) []GetDbInstancePlansPlan { return v.Plans }).(GetDbInstancePlansPlanArrayOutput)
}

func (o GetDbInstancePlansResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDbInstancePlansResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDbInstancePlansResultOutput{})
}
