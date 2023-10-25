// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mse

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Mse Gateways of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.157.0+.
func GetGateways(ctx *pulumi.Context, args *GetGatewaysArgs, opts ...pulumi.InvokeOption) (*GetGatewaysResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGatewaysResult
	err := ctx.Invoke("alicloud:mse/getGateways:getGateways", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGateways.
type GetGatewaysArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// The name of the Gateway.
	GatewayName *string `pulumi:"gatewayName"`
	// A list of Gateway IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Gateway name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the gateway.
	Status *string `pulumi:"status"`
	// The ID of the vpc.
	VpcId *string `pulumi:"vpcId"`
}

// A collection of values returned by getGateways.
type GetGatewaysResult struct {
	EnableDetails *bool                `pulumi:"enableDetails"`
	GatewayName   *string              `pulumi:"gatewayName"`
	Gateways      []GetGatewaysGateway `pulumi:"gateways"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	Status     *string  `pulumi:"status"`
	VpcId      *string  `pulumi:"vpcId"`
}

func GetGatewaysOutput(ctx *pulumi.Context, args GetGatewaysOutputArgs, opts ...pulumi.InvokeOption) GetGatewaysResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetGatewaysResult, error) {
			args := v.(GetGatewaysArgs)
			r, err := GetGateways(ctx, &args, opts...)
			var s GetGatewaysResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetGatewaysResultOutput)
}

// A collection of arguments for invoking getGateways.
type GetGatewaysOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// The name of the Gateway.
	GatewayName pulumi.StringPtrInput `pulumi:"gatewayName"`
	// A list of Gateway IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Gateway name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the gateway.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The ID of the vpc.
	VpcId pulumi.StringPtrInput `pulumi:"vpcId"`
}

func (GetGatewaysOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewaysArgs)(nil)).Elem()
}

// A collection of values returned by getGateways.
type GetGatewaysResultOutput struct{ *pulumi.OutputState }

func (GetGatewaysResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewaysResult)(nil)).Elem()
}

func (o GetGatewaysResultOutput) ToGetGatewaysResultOutput() GetGatewaysResultOutput {
	return o
}

func (o GetGatewaysResultOutput) ToGetGatewaysResultOutputWithContext(ctx context.Context) GetGatewaysResultOutput {
	return o
}

func (o GetGatewaysResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetGatewaysResult] {
	return pulumix.Output[GetGatewaysResult]{
		OutputState: o.OutputState,
	}
}

func (o GetGatewaysResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

func (o GetGatewaysResultOutput) GatewayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *string { return v.GatewayName }).(pulumi.StringPtrOutput)
}

func (o GetGatewaysResultOutput) Gateways() GetGatewaysGatewayArrayOutput {
	return o.ApplyT(func(v GetGatewaysResult) []GetGatewaysGateway { return v.Gateways }).(GetGatewaysGatewayArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGatewaysResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGatewaysResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetGatewaysResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetGatewaysResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetGatewaysResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetGatewaysResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetGatewaysResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetGatewaysResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetGatewaysResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetGatewaysResultOutput) VpcId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewaysResult) *string { return v.VpcId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGatewaysResultOutput{})
}
