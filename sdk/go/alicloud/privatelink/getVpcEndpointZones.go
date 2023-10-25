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

// This data source provides the Privatelink Vpc Endpoint Zones of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.111.0+.
func GetVpcEndpointZones(ctx *pulumi.Context, args *GetVpcEndpointZonesArgs, opts ...pulumi.InvokeOption) (*GetVpcEndpointZonesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVpcEndpointZonesResult
	err := ctx.Invoke("alicloud:privatelink/getVpcEndpointZones:getVpcEndpointZones", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVpcEndpointZones.
type GetVpcEndpointZonesArgs struct {
	// The ID of the Vpc Endpoint.
	EndpointId string `pulumi:"endpointId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The Status of Vpc Endpoint Zone..
	Status *string `pulumi:"status"`
}

// A collection of values returned by getVpcEndpointZones.
type GetVpcEndpointZonesResult struct {
	EndpointId string `pulumi:"endpointId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                    `pulumi:"id"`
	Ids        []string                  `pulumi:"ids"`
	OutputFile *string                   `pulumi:"outputFile"`
	Status     *string                   `pulumi:"status"`
	Zones      []GetVpcEndpointZonesZone `pulumi:"zones"`
}

func GetVpcEndpointZonesOutput(ctx *pulumi.Context, args GetVpcEndpointZonesOutputArgs, opts ...pulumi.InvokeOption) GetVpcEndpointZonesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVpcEndpointZonesResult, error) {
			args := v.(GetVpcEndpointZonesArgs)
			r, err := GetVpcEndpointZones(ctx, &args, opts...)
			var s GetVpcEndpointZonesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVpcEndpointZonesResultOutput)
}

// A collection of arguments for invoking getVpcEndpointZones.
type GetVpcEndpointZonesOutputArgs struct {
	// The ID of the Vpc Endpoint.
	EndpointId pulumi.StringInput `pulumi:"endpointId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The Status of Vpc Endpoint Zone..
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetVpcEndpointZonesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcEndpointZonesArgs)(nil)).Elem()
}

// A collection of values returned by getVpcEndpointZones.
type GetVpcEndpointZonesResultOutput struct{ *pulumi.OutputState }

func (GetVpcEndpointZonesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcEndpointZonesResult)(nil)).Elem()
}

func (o GetVpcEndpointZonesResultOutput) ToGetVpcEndpointZonesResultOutput() GetVpcEndpointZonesResultOutput {
	return o
}

func (o GetVpcEndpointZonesResultOutput) ToGetVpcEndpointZonesResultOutputWithContext(ctx context.Context) GetVpcEndpointZonesResultOutput {
	return o
}

func (o GetVpcEndpointZonesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetVpcEndpointZonesResult] {
	return pulumix.Output[GetVpcEndpointZonesResult]{
		OutputState: o.OutputState,
	}
}

func (o GetVpcEndpointZonesResultOutput) EndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcEndpointZonesResult) string { return v.EndpointId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetVpcEndpointZonesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcEndpointZonesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetVpcEndpointZonesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVpcEndpointZonesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetVpcEndpointZonesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointZonesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetVpcEndpointZonesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcEndpointZonesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetVpcEndpointZonesResultOutput) Zones() GetVpcEndpointZonesZoneArrayOutput {
	return o.ApplyT(func(v GetVpcEndpointZonesResult) []GetVpcEndpointZonesZone { return v.Zones }).(GetVpcEndpointZonesZoneArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVpcEndpointZonesResultOutput{})
}
