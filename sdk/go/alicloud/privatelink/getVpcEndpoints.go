// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package privatelink

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Privatelink Vpc Endpoints of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.109.0+.
func GetVpcEndpoints(ctx *pulumi.Context, args *GetVpcEndpointsArgs, opts ...pulumi.InvokeOption) (*GetVpcEndpointsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVpcEndpointsResult
	err := ctx.Invoke("alicloud:privatelink/getVpcEndpoints:getVpcEndpoints", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVpcEndpoints.
type GetVpcEndpointsArgs struct {
	// The status of Connection.
	ConnectionStatus *string `pulumi:"connectionStatus"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Vpc Endpoint IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Vpc Endpoint name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The name of the terminal node service associated with the terminal node.
	ServiceName *string `pulumi:"serviceName"`
	// The status of Vpc Endpoint.
	Status *string `pulumi:"status"`
	// The name of Vpc Endpoint.
	VpcEndpointName *string `pulumi:"vpcEndpointName"`
	// The private network to which the terminal node belongs.
	VpcId *string `pulumi:"vpcId"`
}

// A collection of values returned by getVpcEndpoints.
type GetVpcEndpointsResult struct {
	ConnectionStatus *string                   `pulumi:"connectionStatus"`
	EnableDetails    *bool                     `pulumi:"enableDetails"`
	Endpoints        []GetVpcEndpointsEndpoint `pulumi:"endpoints"`
	// The provider-assigned unique ID for this managed resource.
	Id              string   `pulumi:"id"`
	Ids             []string `pulumi:"ids"`
	NameRegex       *string  `pulumi:"nameRegex"`
	Names           []string `pulumi:"names"`
	OutputFile      *string  `pulumi:"outputFile"`
	ServiceName     *string  `pulumi:"serviceName"`
	Status          *string  `pulumi:"status"`
	VpcEndpointName *string  `pulumi:"vpcEndpointName"`
	VpcId           *string  `pulumi:"vpcId"`
}

func GetVpcEndpointsOutput(ctx *pulumi.Context, args GetVpcEndpointsOutputArgs, opts ...pulumi.InvokeOption) GetVpcEndpointsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVpcEndpointsResult, error) {
			args := v.(GetVpcEndpointsArgs)
			r, err := GetVpcEndpoints(ctx, &args, opts...)
			var s GetVpcEndpointsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVpcEndpointsResultOutput)
}

// A collection of arguments for invoking getVpcEndpoints.
type GetVpcEndpointsOutputArgs struct {
	// The status of Connection.
	ConnectionStatus pulumi.StringPtrInput `pulumi:"connectionStatus"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Vpc Endpoint IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Vpc Endpoint name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The name of the terminal node service associated with the terminal node.
	ServiceName pulumi.StringPtrInput `pulumi:"serviceName"`
	// The status of Vpc Endpoint.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The name of Vpc Endpoint.
	VpcEndpointName pulumi.StringPtrInput `pulumi:"vpcEndpointName"`
	// The private network to which the terminal node belongs.
	VpcId pulumi.StringPtrInput `pulumi:"vpcId"`
}

func (GetVpcEndpointsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcEndpointsArgs)(nil)).Elem()
}

// A collection of values returned by getVpcEndpoints.
type GetVpcEndpointsResultOutput struct{ *pulumi.OutputState }

func (GetVpcEndpointsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcEndpointsResult)(nil)).Elem()
}

func (o GetVpcEndpointsResultOutput) ToGetVpcEndpointsResultOutput() GetVpcEndpointsResultOutput {
	return o
}

func (o GetVpcEndpointsResultOutput) ToGetVpcEndpointsResultOutputWithContext(ctx context.Context) GetVpcEndpointsResultOutput {
	return o
}

func (o GetVpcEndpointsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetVpcEndpointsResult] {
	return pulumix.Output[GetVpcEndpointsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetVpcEndpointsResultOutput) ConnectionStatus() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointsResult) *string { return v.ConnectionStatus }).(pulumi.StringPtrOutput)
}

func (o GetVpcEndpointsResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointsResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

func (o GetVpcEndpointsResultOutput) Endpoints() GetVpcEndpointsEndpointArrayOutput {
	return o.ApplyT(func(v GetVpcEndpointsResult) []GetVpcEndpointsEndpoint { return v.Endpoints }).(GetVpcEndpointsEndpointArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetVpcEndpointsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcEndpointsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetVpcEndpointsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVpcEndpointsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetVpcEndpointsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetVpcEndpointsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVpcEndpointsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetVpcEndpointsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetVpcEndpointsResultOutput) ServiceName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointsResult) *string { return v.ServiceName }).(pulumi.StringPtrOutput)
}

func (o GetVpcEndpointsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetVpcEndpointsResultOutput) VpcEndpointName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointsResult) *string { return v.VpcEndpointName }).(pulumi.StringPtrOutput)
}

func (o GetVpcEndpointsResultOutput) VpcId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointsResult) *string { return v.VpcId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVpcEndpointsResultOutput{})
}
