// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpn

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// The VPN connections data source lists lots of VPN connections resource information owned by an Alicloud account.
func GetConnections(ctx *pulumi.Context, args *GetConnectionsArgs, opts ...pulumi.InvokeOption) (*GetConnectionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetConnectionsResult
	err := ctx.Invoke("alicloud:vpn/getConnections:getConnections", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnections.
type GetConnectionsArgs struct {
	// Use the VPN customer gateway ID as the search key.
	CustomerGatewayId *string `pulumi:"customerGatewayId"`
	// IDs of the VPN connections.
	Ids []string `pulumi:"ids"`
	// A regex string of VPN connection name.
	NameRegex *string `pulumi:"nameRegex"`
	// Save the result to the file.
	OutputFile *string `pulumi:"outputFile"`
	// Use the VPN gateway ID as the search key.
	VpnGatewayId *string `pulumi:"vpnGatewayId"`
}

// A collection of values returned by getConnections.
type GetConnectionsResult struct {
	// A list of VPN connections. Each element contains the following attributes:
	Connections []GetConnectionsConnection `pulumi:"connections"`
	// ID of the VPN customer gateway.
	CustomerGatewayId *string `pulumi:"customerGatewayId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Optional) IDs of the VPN connections.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// (Optional) names of the VPN connections.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// ID of the VPN gateway.
	VpnGatewayId *string `pulumi:"vpnGatewayId"`
}

func GetConnectionsOutput(ctx *pulumi.Context, args GetConnectionsOutputArgs, opts ...pulumi.InvokeOption) GetConnectionsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetConnectionsResult, error) {
			args := v.(GetConnectionsArgs)
			r, err := GetConnections(ctx, &args, opts...)
			var s GetConnectionsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetConnectionsResultOutput)
}

// A collection of arguments for invoking getConnections.
type GetConnectionsOutputArgs struct {
	// Use the VPN customer gateway ID as the search key.
	CustomerGatewayId pulumi.StringPtrInput `pulumi:"customerGatewayId"`
	// IDs of the VPN connections.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string of VPN connection name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// Save the result to the file.
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Use the VPN gateway ID as the search key.
	VpnGatewayId pulumi.StringPtrInput `pulumi:"vpnGatewayId"`
}

func (GetConnectionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConnectionsArgs)(nil)).Elem()
}

// A collection of values returned by getConnections.
type GetConnectionsResultOutput struct{ *pulumi.OutputState }

func (GetConnectionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConnectionsResult)(nil)).Elem()
}

func (o GetConnectionsResultOutput) ToGetConnectionsResultOutput() GetConnectionsResultOutput {
	return o
}

func (o GetConnectionsResultOutput) ToGetConnectionsResultOutputWithContext(ctx context.Context) GetConnectionsResultOutput {
	return o
}

func (o GetConnectionsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetConnectionsResult] {
	return pulumix.Output[GetConnectionsResult]{
		OutputState: o.OutputState,
	}
}

// A list of VPN connections. Each element contains the following attributes:
func (o GetConnectionsResultOutput) Connections() GetConnectionsConnectionArrayOutput {
	return o.ApplyT(func(v GetConnectionsResult) []GetConnectionsConnection { return v.Connections }).(GetConnectionsConnectionArrayOutput)
}

// ID of the VPN customer gateway.
func (o GetConnectionsResultOutput) CustomerGatewayId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetConnectionsResult) *string { return v.CustomerGatewayId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetConnectionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetConnectionsResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Optional) IDs of the VPN connections.
func (o GetConnectionsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetConnectionsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetConnectionsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetConnectionsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// (Optional) names of the VPN connections.
func (o GetConnectionsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetConnectionsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetConnectionsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetConnectionsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// ID of the VPN gateway.
func (o GetConnectionsResultOutput) VpnGatewayId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetConnectionsResult) *string { return v.VpnGatewayId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetConnectionsResultOutput{})
}
