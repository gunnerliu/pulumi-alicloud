// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eventbridge

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Event Bridge Event Buses of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.129.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/eventbridge"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := eventbridge.GetEventBuses(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("eventBridgeEventBusId1", ids.Buses[0].Id)
//			nameRegex, err := eventbridge.GetEventBuses(ctx, &eventbridge.GetEventBusesArgs{
//				NameRegex: pulumi.StringRef("^my-EventBus"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("eventBridgeEventBusId2", nameRegex.Buses[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetEventBuses(ctx *pulumi.Context, args *GetEventBusesArgs, opts ...pulumi.InvokeOption) (*GetEventBusesResult, error) {
	var rv GetEventBusesResult
	err := ctx.Invoke("alicloud:eventbridge/getEventBuses:getEventBuses", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEventBuses.
type GetEventBusesArgs struct {
	// The event bus type.
	EventBusType *string `pulumi:"eventBusType"`
	// A list of Event Bus IDs. Its element value is same as Event Bus Name.
	Ids []string `pulumi:"ids"`
	// The name prefix.
	NamePrefix *string `pulumi:"namePrefix"`
	// A regex string to filter results by Event Bus name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getEventBuses.
type GetEventBusesResult struct {
	Buses        []GetEventBusesBus `pulumi:"buses"`
	EventBusType *string            `pulumi:"eventBusType"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NamePrefix *string  `pulumi:"namePrefix"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetEventBusesOutput(ctx *pulumi.Context, args GetEventBusesOutputArgs, opts ...pulumi.InvokeOption) GetEventBusesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEventBusesResult, error) {
			args := v.(GetEventBusesArgs)
			r, err := GetEventBuses(ctx, &args, opts...)
			var s GetEventBusesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEventBusesResultOutput)
}

// A collection of arguments for invoking getEventBuses.
type GetEventBusesOutputArgs struct {
	// The event bus type.
	EventBusType pulumi.StringPtrInput `pulumi:"eventBusType"`
	// A list of Event Bus IDs. Its element value is same as Event Bus Name.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The name prefix.
	NamePrefix pulumi.StringPtrInput `pulumi:"namePrefix"`
	// A regex string to filter results by Event Bus name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetEventBusesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEventBusesArgs)(nil)).Elem()
}

// A collection of values returned by getEventBuses.
type GetEventBusesResultOutput struct{ *pulumi.OutputState }

func (GetEventBusesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEventBusesResult)(nil)).Elem()
}

func (o GetEventBusesResultOutput) ToGetEventBusesResultOutput() GetEventBusesResultOutput {
	return o
}

func (o GetEventBusesResultOutput) ToGetEventBusesResultOutputWithContext(ctx context.Context) GetEventBusesResultOutput {
	return o
}

func (o GetEventBusesResultOutput) Buses() GetEventBusesBusArrayOutput {
	return o.ApplyT(func(v GetEventBusesResult) []GetEventBusesBus { return v.Buses }).(GetEventBusesBusArrayOutput)
}

func (o GetEventBusesResultOutput) EventBusType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventBusesResult) *string { return v.EventBusType }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEventBusesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventBusesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetEventBusesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEventBusesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetEventBusesResultOutput) NamePrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventBusesResult) *string { return v.NamePrefix }).(pulumi.StringPtrOutput)
}

func (o GetEventBusesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventBusesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetEventBusesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEventBusesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetEventBusesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventBusesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEventBusesResultOutput{})
}
