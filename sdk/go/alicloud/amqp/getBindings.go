// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package amqp

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Amqp Bindings of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.135.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/amqp"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := amqp.GetBindings(ctx, &amqp.GetBindingsArgs{
// 			InstanceId:      "amqp-cn-xxxxx",
// 			VirtualHostName: "my-vh",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetBindings(ctx *pulumi.Context, args *GetBindingsArgs, opts ...pulumi.InvokeOption) (*GetBindingsResult, error) {
	var rv GetBindingsResult
	err := ctx.Invoke("alicloud:amqp/getBindings:getBindings", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBindings.
type GetBindingsArgs struct {
	// Instance Id.
	InstanceId string  `pulumi:"instanceId"`
	OutputFile *string `pulumi:"outputFile"`
	// Virtualhost Name.
	VirtualHostName string `pulumi:"virtualHostName"`
}

// A collection of values returned by getBindings.
type GetBindingsResult struct {
	Bindings []GetBindingsBinding `pulumi:"bindings"`
	// The provider-assigned unique ID for this managed resource.
	Id              string   `pulumi:"id"`
	Ids             []string `pulumi:"ids"`
	InstanceId      string   `pulumi:"instanceId"`
	OutputFile      *string  `pulumi:"outputFile"`
	VirtualHostName string   `pulumi:"virtualHostName"`
}

func GetBindingsOutput(ctx *pulumi.Context, args GetBindingsOutputArgs, opts ...pulumi.InvokeOption) GetBindingsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetBindingsResult, error) {
			args := v.(GetBindingsArgs)
			r, err := GetBindings(ctx, &args, opts...)
			return *r, err
		}).(GetBindingsResultOutput)
}

// A collection of arguments for invoking getBindings.
type GetBindingsOutputArgs struct {
	// Instance Id.
	InstanceId pulumi.StringInput    `pulumi:"instanceId"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Virtualhost Name.
	VirtualHostName pulumi.StringInput `pulumi:"virtualHostName"`
}

func (GetBindingsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBindingsArgs)(nil)).Elem()
}

// A collection of values returned by getBindings.
type GetBindingsResultOutput struct{ *pulumi.OutputState }

func (GetBindingsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBindingsResult)(nil)).Elem()
}

func (o GetBindingsResultOutput) ToGetBindingsResultOutput() GetBindingsResultOutput {
	return o
}

func (o GetBindingsResultOutput) ToGetBindingsResultOutputWithContext(ctx context.Context) GetBindingsResultOutput {
	return o
}

func (o GetBindingsResultOutput) Bindings() GetBindingsBindingArrayOutput {
	return o.ApplyT(func(v GetBindingsResult) []GetBindingsBinding { return v.Bindings }).(GetBindingsBindingArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetBindingsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBindingsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetBindingsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetBindingsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetBindingsResultOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetBindingsResult) string { return v.InstanceId }).(pulumi.StringOutput)
}

func (o GetBindingsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBindingsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetBindingsResultOutput) VirtualHostName() pulumi.StringOutput {
	return o.ApplyT(func(v GetBindingsResult) string { return v.VirtualHostName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetBindingsResultOutput{})
}