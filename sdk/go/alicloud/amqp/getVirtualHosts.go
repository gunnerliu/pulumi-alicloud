// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package amqp

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Amqp Virtual Hosts of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.126.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/amqp"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := amqp.GetVirtualHosts(ctx, &amqp.GetVirtualHostsArgs{
//				InstanceId: "amqp-abc12345",
//				Ids: []string{
//					"my-VirtualHost-1",
//					"my-VirtualHost-2",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("amqpVirtualHostId1", ids.Hosts[0].Id)
//			nameRegex, err := amqp.GetVirtualHosts(ctx, &amqp.GetVirtualHostsArgs{
//				InstanceId: "amqp-abc12345",
//				NameRegex:  pulumi.StringRef("^my-VirtualHost"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("amqpVirtualHostId2", nameRegex.Hosts[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetVirtualHosts(ctx *pulumi.Context, args *GetVirtualHostsArgs, opts ...pulumi.InvokeOption) (*GetVirtualHostsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVirtualHostsResult
	err := ctx.Invoke("alicloud:amqp/getVirtualHosts:getVirtualHosts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVirtualHosts.
type GetVirtualHostsArgs struct {
	// A list of Virtual Host IDs. Its element value is same as Virtual Host Name.
	Ids []string `pulumi:"ids"`
	// InstanceId.
	InstanceId string `pulumi:"instanceId"`
	// A regex string to filter results by Virtual Host name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getVirtualHosts.
type GetVirtualHostsResult struct {
	Hosts []GetVirtualHostsHost `pulumi:"hosts"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	InstanceId string   `pulumi:"instanceId"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetVirtualHostsOutput(ctx *pulumi.Context, args GetVirtualHostsOutputArgs, opts ...pulumi.InvokeOption) GetVirtualHostsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVirtualHostsResult, error) {
			args := v.(GetVirtualHostsArgs)
			r, err := GetVirtualHosts(ctx, &args, opts...)
			var s GetVirtualHostsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVirtualHostsResultOutput)
}

// A collection of arguments for invoking getVirtualHosts.
type GetVirtualHostsOutputArgs struct {
	// A list of Virtual Host IDs. Its element value is same as Virtual Host Name.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// InstanceId.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// A regex string to filter results by Virtual Host name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetVirtualHostsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVirtualHostsArgs)(nil)).Elem()
}

// A collection of values returned by getVirtualHosts.
type GetVirtualHostsResultOutput struct{ *pulumi.OutputState }

func (GetVirtualHostsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVirtualHostsResult)(nil)).Elem()
}

func (o GetVirtualHostsResultOutput) ToGetVirtualHostsResultOutput() GetVirtualHostsResultOutput {
	return o
}

func (o GetVirtualHostsResultOutput) ToGetVirtualHostsResultOutputWithContext(ctx context.Context) GetVirtualHostsResultOutput {
	return o
}

func (o GetVirtualHostsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetVirtualHostsResult] {
	return pulumix.Output[GetVirtualHostsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetVirtualHostsResultOutput) Hosts() GetVirtualHostsHostArrayOutput {
	return o.ApplyT(func(v GetVirtualHostsResult) []GetVirtualHostsHost { return v.Hosts }).(GetVirtualHostsHostArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetVirtualHostsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVirtualHostsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetVirtualHostsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVirtualHostsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetVirtualHostsResultOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetVirtualHostsResult) string { return v.InstanceId }).(pulumi.StringOutput)
}

func (o GetVirtualHostsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVirtualHostsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetVirtualHostsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVirtualHostsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetVirtualHostsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVirtualHostsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVirtualHostsResultOutput{})
}
