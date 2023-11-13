// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eventbridge

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Event Bridge Event Sources of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.130.0+.
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
//			example, err := eventbridge.GetEventSources(ctx, &eventbridge.GetEventSourcesArgs{
//				Ids: []string{
//					"example_value",
//				},
//				NameRegex: pulumi.StringRef("the_resource_name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstEventBridgeEventSourceId", example.Sources[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetEventSources(ctx *pulumi.Context, args *GetEventSourcesArgs, opts ...pulumi.InvokeOption) (*GetEventSourcesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEventSourcesResult
	err := ctx.Invoke("alicloud:eventbridge/getEventSources:getEventSources", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEventSources.
type GetEventSourcesArgs struct {
	// A list of Event Source IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Event Source name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getEventSources.
type GetEventSourcesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string                  `pulumi:"id"`
	Ids        []string                `pulumi:"ids"`
	NameRegex  *string                 `pulumi:"nameRegex"`
	Names      []string                `pulumi:"names"`
	OutputFile *string                 `pulumi:"outputFile"`
	Sources    []GetEventSourcesSource `pulumi:"sources"`
}

func GetEventSourcesOutput(ctx *pulumi.Context, args GetEventSourcesOutputArgs, opts ...pulumi.InvokeOption) GetEventSourcesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEventSourcesResult, error) {
			args := v.(GetEventSourcesArgs)
			r, err := GetEventSources(ctx, &args, opts...)
			var s GetEventSourcesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEventSourcesResultOutput)
}

// A collection of arguments for invoking getEventSources.
type GetEventSourcesOutputArgs struct {
	// A list of Event Source IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Event Source name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetEventSourcesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEventSourcesArgs)(nil)).Elem()
}

// A collection of values returned by getEventSources.
type GetEventSourcesResultOutput struct{ *pulumi.OutputState }

func (GetEventSourcesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEventSourcesResult)(nil)).Elem()
}

func (o GetEventSourcesResultOutput) ToGetEventSourcesResultOutput() GetEventSourcesResultOutput {
	return o
}

func (o GetEventSourcesResultOutput) ToGetEventSourcesResultOutputWithContext(ctx context.Context) GetEventSourcesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetEventSourcesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventSourcesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetEventSourcesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEventSourcesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetEventSourcesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventSourcesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetEventSourcesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEventSourcesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetEventSourcesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventSourcesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetEventSourcesResultOutput) Sources() GetEventSourcesSourceArrayOutput {
	return o.ApplyT(func(v GetEventSourcesResult) []GetEventSourcesSource { return v.Sources }).(GetEventSourcesSourceArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEventSourcesResultOutput{})
}
