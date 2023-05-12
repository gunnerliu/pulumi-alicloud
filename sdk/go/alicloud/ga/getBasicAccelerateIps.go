// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ga

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Global Accelerator (GA) Basic Accelerate IPs of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.194.0+.
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
//			ids, err := ga.GetBasicAccelerateIps(ctx, &ga.GetBasicAccelerateIpsArgs{
//				Ids: []string{
//					"example_id",
//				},
//				IpSetId: "example_ip_set_id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("gaBasicAccelerateIpId1", ids.Ips[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetBasicAccelerateIps(ctx *pulumi.Context, args *GetBasicAccelerateIpsArgs, opts ...pulumi.InvokeOption) (*GetBasicAccelerateIpsResult, error) {
	var rv GetBasicAccelerateIpsResult
	err := ctx.Invoke("alicloud:ga/getBasicAccelerateIps:getBasicAccelerateIps", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBasicAccelerateIps.
type GetBasicAccelerateIpsArgs struct {
	// The address of the Basic Accelerate IP.
	AccelerateIpAddress *string `pulumi:"accelerateIpAddress"`
	// The id of the Basic Accelerate IP.
	AccelerateIpId *string `pulumi:"accelerateIpId"`
	// A list of Global Accelerator Basic Accelerate IP IDs.
	Ids []string `pulumi:"ids"`
	// The ID of the Basic Ip Set.
	IpSetId string `pulumi:"ipSetId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the Global Accelerator Basic Accelerate IP instance. Valid Value: `active`, `binding`, `bound`, `unbinding`, `deleting`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getBasicAccelerateIps.
type GetBasicAccelerateIpsResult struct {
	// The address of the Basic Accelerate IP.
	AccelerateIpAddress *string `pulumi:"accelerateIpAddress"`
	// The id of the Basic Accelerate IP.
	AccelerateIpId *string `pulumi:"accelerateIpId"`
	// The provider-assigned unique ID for this managed resource.
	Id  string   `pulumi:"id"`
	Ids []string `pulumi:"ids"`
	// The ID of the Basic Ip Set.
	IpSetId string `pulumi:"ipSetId"`
	// A list of Global Accelerator Basic Accelerate IPs. Each element contains the following attributes:
	Ips        []GetBasicAccelerateIpsIp `pulumi:"ips"`
	OutputFile *string                   `pulumi:"outputFile"`
	// The status of the Basic Accelerate IP instance.
	Status *string `pulumi:"status"`
}

func GetBasicAccelerateIpsOutput(ctx *pulumi.Context, args GetBasicAccelerateIpsOutputArgs, opts ...pulumi.InvokeOption) GetBasicAccelerateIpsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetBasicAccelerateIpsResult, error) {
			args := v.(GetBasicAccelerateIpsArgs)
			r, err := GetBasicAccelerateIps(ctx, &args, opts...)
			var s GetBasicAccelerateIpsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetBasicAccelerateIpsResultOutput)
}

// A collection of arguments for invoking getBasicAccelerateIps.
type GetBasicAccelerateIpsOutputArgs struct {
	// The address of the Basic Accelerate IP.
	AccelerateIpAddress pulumi.StringPtrInput `pulumi:"accelerateIpAddress"`
	// The id of the Basic Accelerate IP.
	AccelerateIpId pulumi.StringPtrInput `pulumi:"accelerateIpId"`
	// A list of Global Accelerator Basic Accelerate IP IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The ID of the Basic Ip Set.
	IpSetId pulumi.StringInput `pulumi:"ipSetId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the Global Accelerator Basic Accelerate IP instance. Valid Value: `active`, `binding`, `bound`, `unbinding`, `deleting`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetBasicAccelerateIpsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBasicAccelerateIpsArgs)(nil)).Elem()
}

// A collection of values returned by getBasicAccelerateIps.
type GetBasicAccelerateIpsResultOutput struct{ *pulumi.OutputState }

func (GetBasicAccelerateIpsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBasicAccelerateIpsResult)(nil)).Elem()
}

func (o GetBasicAccelerateIpsResultOutput) ToGetBasicAccelerateIpsResultOutput() GetBasicAccelerateIpsResultOutput {
	return o
}

func (o GetBasicAccelerateIpsResultOutput) ToGetBasicAccelerateIpsResultOutputWithContext(ctx context.Context) GetBasicAccelerateIpsResultOutput {
	return o
}

// The address of the Basic Accelerate IP.
func (o GetBasicAccelerateIpsResultOutput) AccelerateIpAddress() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBasicAccelerateIpsResult) *string { return v.AccelerateIpAddress }).(pulumi.StringPtrOutput)
}

// The id of the Basic Accelerate IP.
func (o GetBasicAccelerateIpsResultOutput) AccelerateIpId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBasicAccelerateIpsResult) *string { return v.AccelerateIpId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetBasicAccelerateIpsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBasicAccelerateIpsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetBasicAccelerateIpsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetBasicAccelerateIpsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// The ID of the Basic Ip Set.
func (o GetBasicAccelerateIpsResultOutput) IpSetId() pulumi.StringOutput {
	return o.ApplyT(func(v GetBasicAccelerateIpsResult) string { return v.IpSetId }).(pulumi.StringOutput)
}

// A list of Global Accelerator Basic Accelerate IPs. Each element contains the following attributes:
func (o GetBasicAccelerateIpsResultOutput) Ips() GetBasicAccelerateIpsIpArrayOutput {
	return o.ApplyT(func(v GetBasicAccelerateIpsResult) []GetBasicAccelerateIpsIp { return v.Ips }).(GetBasicAccelerateIpsIpArrayOutput)
}

func (o GetBasicAccelerateIpsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBasicAccelerateIpsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The status of the Basic Accelerate IP instance.
func (o GetBasicAccelerateIpsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBasicAccelerateIpsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetBasicAccelerateIpsResultOutput{})
}
