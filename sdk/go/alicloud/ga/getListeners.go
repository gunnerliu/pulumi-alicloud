// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ga

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Global Accelerator (GA) Listeners of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.111.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ga"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := ga.GetListeners(ctx, &ga.GetListenersArgs{
//				AcceleratorId: "example_value",
//				Ids: []string{
//					"example_value",
//				},
//				NameRegex: pulumi.StringRef("the_resource_name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstGaListenerId", example.Listeners[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetListeners(ctx *pulumi.Context, args *GetListenersArgs, opts ...pulumi.InvokeOption) (*GetListenersResult, error) {
	var rv GetListenersResult
	err := ctx.Invoke("alicloud:ga/getListeners:getListeners", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getListeners.
type GetListenersArgs struct {
	// The accelerator id.
	AcceleratorId string `pulumi:"acceleratorId"`
	// A list of Listener IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Listener name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the listener.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getListeners.
type GetListenersResult struct {
	AcceleratorId string `pulumi:"acceleratorId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                 `pulumi:"id"`
	Ids        []string               `pulumi:"ids"`
	Listeners  []GetListenersListener `pulumi:"listeners"`
	NameRegex  *string                `pulumi:"nameRegex"`
	Names      []string               `pulumi:"names"`
	OutputFile *string                `pulumi:"outputFile"`
	Status     *string                `pulumi:"status"`
}

func GetListenersOutput(ctx *pulumi.Context, args GetListenersOutputArgs, opts ...pulumi.InvokeOption) GetListenersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetListenersResult, error) {
			args := v.(GetListenersArgs)
			r, err := GetListeners(ctx, &args, opts...)
			var s GetListenersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetListenersResultOutput)
}

// A collection of arguments for invoking getListeners.
type GetListenersOutputArgs struct {
	// The accelerator id.
	AcceleratorId pulumi.StringInput `pulumi:"acceleratorId"`
	// A list of Listener IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Listener name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the listener.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetListenersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetListenersArgs)(nil)).Elem()
}

// A collection of values returned by getListeners.
type GetListenersResultOutput struct{ *pulumi.OutputState }

func (GetListenersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetListenersResult)(nil)).Elem()
}

func (o GetListenersResultOutput) ToGetListenersResultOutput() GetListenersResultOutput {
	return o
}

func (o GetListenersResultOutput) ToGetListenersResultOutputWithContext(ctx context.Context) GetListenersResultOutput {
	return o
}

func (o GetListenersResultOutput) AcceleratorId() pulumi.StringOutput {
	return o.ApplyT(func(v GetListenersResult) string { return v.AcceleratorId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetListenersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetListenersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetListenersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetListenersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetListenersResultOutput) Listeners() GetListenersListenerArrayOutput {
	return o.ApplyT(func(v GetListenersResult) []GetListenersListener { return v.Listeners }).(GetListenersListenerArrayOutput)
}

func (o GetListenersResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetListenersResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetListenersResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetListenersResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetListenersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetListenersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetListenersResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetListenersResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetListenersResultOutput{})
}
