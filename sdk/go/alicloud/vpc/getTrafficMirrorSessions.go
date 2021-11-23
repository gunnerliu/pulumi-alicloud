// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Vpc Traffic Mirror Sessions of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.142.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		ids, err := vpc.GetTrafficMirrorSessions(ctx, &vpc.GetTrafficMirrorSessionsArgs{
// 			Ids: []string{
// 				"example_id",
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("vpcTrafficMirrorSessionId1", ids.Sessions[0].Id)
// 		opt0 := "^my-TrafficMirrorSession"
// 		nameRegex, err := vpc.GetTrafficMirrorSessions(ctx, &vpc.GetTrafficMirrorSessionsArgs{
// 			NameRegex: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("vpcTrafficMirrorSessionId2", nameRegex.Sessions[0].Id)
// 		opt1 := false
// 		enabled, err := vpc.GetTrafficMirrorSessions(ctx, &vpc.GetTrafficMirrorSessionsArgs{
// 			Ids: []string{
// 				"example_id",
// 			},
// 			Enabled: &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("vpcTrafficMirrorSessionId3", enabled.Sessions[0].Id)
// 		opt2 := 1
// 		priority, err := vpc.GetTrafficMirrorSessions(ctx, &vpc.GetTrafficMirrorSessionsArgs{
// 			Ids: []string{
// 				"example_id",
// 			},
// 			Priority: &opt2,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("vpcTrafficMirrorSessionId4", priority.Sessions[0].Id)
// 		opt3 := "example_value"
// 		filterId, err := vpc.GetTrafficMirrorSessions(ctx, &vpc.GetTrafficMirrorSessionsArgs{
// 			Ids: []string{
// 				"example_id",
// 			},
// 			TrafficMirrorFilterId: &opt3,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("vpcTrafficMirrorSessionId5", filterId.Sessions[0].Id)
// 		opt4 := "example_value"
// 		sessionName, err := vpc.GetTrafficMirrorSessions(ctx, &vpc.GetTrafficMirrorSessionsArgs{
// 			Ids: []string{
// 				"example_id",
// 			},
// 			TrafficMirrorSessionName: &opt4,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("vpcTrafficMirrorSessionId6", sessionName.Sessions[0].Id)
// 		opt5 := "example_value"
// 		sourceId, err := vpc.GetTrafficMirrorSessions(ctx, &vpc.GetTrafficMirrorSessionsArgs{
// 			Ids: []string{
// 				"example_id",
// 			},
// 			TrafficMirrorSourceId: &opt5,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("vpcTrafficMirrorSessionId7", sourceId.Sessions[0].Id)
// 		opt6 := "example_value"
// 		targetId, err := vpc.GetTrafficMirrorSessions(ctx, &vpc.GetTrafficMirrorSessionsArgs{
// 			Ids: []string{
// 				"example_id",
// 			},
// 			TrafficMirrorTargetId: &opt6,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("vpcTrafficMirrorSessionId8", targetId.Sessions[0].Id)
// 		opt7 := "Created"
// 		status, err := vpc.GetTrafficMirrorSessions(ctx, &vpc.GetTrafficMirrorSessionsArgs{
// 			Ids: []string{
// 				"example_id",
// 			},
// 			Status: &opt7,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("vpcTrafficMirrorSessionId9", status.Sessions[0].Id)
// 		return nil
// 	})
// }
// ```
func GetTrafficMirrorSessions(ctx *pulumi.Context, args *GetTrafficMirrorSessionsArgs, opts ...pulumi.InvokeOption) (*GetTrafficMirrorSessionsResult, error) {
	var rv GetTrafficMirrorSessionsResult
	err := ctx.Invoke("alicloud:vpc/getTrafficMirrorSessions:getTrafficMirrorSessions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTrafficMirrorSessions.
type GetTrafficMirrorSessionsArgs struct {
	// Indicates whether traffic mirror sessions are enabled. default to `false`.
	Enabled *bool `pulumi:"enabled"`
	// A list of Traffic Mirror Session IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Traffic Mirror Session name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// The priority of the traffic mirror session. A smaller value indicates a higher priority.
	Priority *int `pulumi:"priority"`
	// The state of the traffic mirror session. Valid values: `Creating`, `Created`, `Modifying` and `Deleting`.
	Status *string `pulumi:"status"`
	// The ID of the filter.
	TrafficMirrorFilterId *string `pulumi:"trafficMirrorFilterId"`
	// The name of the traffic mirror session.
	TrafficMirrorSessionName *string `pulumi:"trafficMirrorSessionName"`
	// The ID of the mirror source. You can specify only an elastic network interface (ENI) as the mirror source.
	TrafficMirrorSourceId *string `pulumi:"trafficMirrorSourceId"`
	// The ID of the mirror destination. You can specify only an ENI or a Server Load Balancer (SLB) instance as a mirror destination.
	TrafficMirrorTargetId *string `pulumi:"trafficMirrorTargetId"`
}

// A collection of values returned by getTrafficMirrorSessions.
type GetTrafficMirrorSessionsResult struct {
	Enabled *bool `pulumi:"enabled"`
	// The provider-assigned unique ID for this managed resource.
	Id                       string                            `pulumi:"id"`
	Ids                      []string                          `pulumi:"ids"`
	NameRegex                *string                           `pulumi:"nameRegex"`
	Names                    []string                          `pulumi:"names"`
	OutputFile               *string                           `pulumi:"outputFile"`
	Priority                 *int                              `pulumi:"priority"`
	Sessions                 []GetTrafficMirrorSessionsSession `pulumi:"sessions"`
	Status                   *string                           `pulumi:"status"`
	TrafficMirrorFilterId    *string                           `pulumi:"trafficMirrorFilterId"`
	TrafficMirrorSessionName *string                           `pulumi:"trafficMirrorSessionName"`
	TrafficMirrorSourceId    *string                           `pulumi:"trafficMirrorSourceId"`
	TrafficMirrorTargetId    *string                           `pulumi:"trafficMirrorTargetId"`
}

func GetTrafficMirrorSessionsOutput(ctx *pulumi.Context, args GetTrafficMirrorSessionsOutputArgs, opts ...pulumi.InvokeOption) GetTrafficMirrorSessionsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetTrafficMirrorSessionsResult, error) {
			args := v.(GetTrafficMirrorSessionsArgs)
			r, err := GetTrafficMirrorSessions(ctx, &args, opts...)
			return *r, err
		}).(GetTrafficMirrorSessionsResultOutput)
}

// A collection of arguments for invoking getTrafficMirrorSessions.
type GetTrafficMirrorSessionsOutputArgs struct {
	// Indicates whether traffic mirror sessions are enabled. default to `false`.
	Enabled pulumi.BoolPtrInput `pulumi:"enabled"`
	// A list of Traffic Mirror Session IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Traffic Mirror Session name.
	NameRegex  pulumi.StringPtrInput `pulumi:"nameRegex"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The priority of the traffic mirror session. A smaller value indicates a higher priority.
	Priority pulumi.IntPtrInput `pulumi:"priority"`
	// The state of the traffic mirror session. Valid values: `Creating`, `Created`, `Modifying` and `Deleting`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The ID of the filter.
	TrafficMirrorFilterId pulumi.StringPtrInput `pulumi:"trafficMirrorFilterId"`
	// The name of the traffic mirror session.
	TrafficMirrorSessionName pulumi.StringPtrInput `pulumi:"trafficMirrorSessionName"`
	// The ID of the mirror source. You can specify only an elastic network interface (ENI) as the mirror source.
	TrafficMirrorSourceId pulumi.StringPtrInput `pulumi:"trafficMirrorSourceId"`
	// The ID of the mirror destination. You can specify only an ENI or a Server Load Balancer (SLB) instance as a mirror destination.
	TrafficMirrorTargetId pulumi.StringPtrInput `pulumi:"trafficMirrorTargetId"`
}

func (GetTrafficMirrorSessionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTrafficMirrorSessionsArgs)(nil)).Elem()
}

// A collection of values returned by getTrafficMirrorSessions.
type GetTrafficMirrorSessionsResultOutput struct{ *pulumi.OutputState }

func (GetTrafficMirrorSessionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTrafficMirrorSessionsResult)(nil)).Elem()
}

func (o GetTrafficMirrorSessionsResultOutput) ToGetTrafficMirrorSessionsResultOutput() GetTrafficMirrorSessionsResultOutput {
	return o
}

func (o GetTrafficMirrorSessionsResultOutput) ToGetTrafficMirrorSessionsResultOutputWithContext(ctx context.Context) GetTrafficMirrorSessionsResultOutput {
	return o
}

func (o GetTrafficMirrorSessionsResultOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetTrafficMirrorSessionsResult) *bool { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetTrafficMirrorSessionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTrafficMirrorSessionsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTrafficMirrorSessionsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTrafficMirrorSessionsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetTrafficMirrorSessionsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrafficMirrorSessionsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetTrafficMirrorSessionsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTrafficMirrorSessionsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetTrafficMirrorSessionsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrafficMirrorSessionsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetTrafficMirrorSessionsResultOutput) Priority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetTrafficMirrorSessionsResult) *int { return v.Priority }).(pulumi.IntPtrOutput)
}

func (o GetTrafficMirrorSessionsResultOutput) Sessions() GetTrafficMirrorSessionsSessionArrayOutput {
	return o.ApplyT(func(v GetTrafficMirrorSessionsResult) []GetTrafficMirrorSessionsSession { return v.Sessions }).(GetTrafficMirrorSessionsSessionArrayOutput)
}

func (o GetTrafficMirrorSessionsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrafficMirrorSessionsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetTrafficMirrorSessionsResultOutput) TrafficMirrorFilterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrafficMirrorSessionsResult) *string { return v.TrafficMirrorFilterId }).(pulumi.StringPtrOutput)
}

func (o GetTrafficMirrorSessionsResultOutput) TrafficMirrorSessionName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrafficMirrorSessionsResult) *string { return v.TrafficMirrorSessionName }).(pulumi.StringPtrOutput)
}

func (o GetTrafficMirrorSessionsResultOutput) TrafficMirrorSourceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrafficMirrorSessionsResult) *string { return v.TrafficMirrorSourceId }).(pulumi.StringPtrOutput)
}

func (o GetTrafficMirrorSessionsResultOutput) TrafficMirrorTargetId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTrafficMirrorSessionsResult) *string { return v.TrafficMirrorTargetId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTrafficMirrorSessionsResultOutput{})
}
