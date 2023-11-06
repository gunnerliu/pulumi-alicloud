// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package slb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the domain extensions associated with a server load balancer listener.
//
// > **NOTE:** Available in 1.60.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/slb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := slb.GetDomainExtensions(ctx, &slb.GetDomainExtensionsArgs{
//				FrontendPort: "fake-port",
//				Ids: []string{
//					"fake-de-id",
//				},
//				LoadBalancerId: "fake-lb-id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetDomainExtensions(ctx *pulumi.Context, args *GetDomainExtensionsArgs, opts ...pulumi.InvokeOption) (*GetDomainExtensionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDomainExtensionsResult
	err := ctx.Invoke("alicloud:slb/getDomainExtensions:getDomainExtensions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDomainExtensions.
type GetDomainExtensionsArgs struct {
	// The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
	FrontendPort int `pulumi:"frontendPort"`
	// IDs of the SLB domain extensions.
	Ids []string `pulumi:"ids"`
	// The ID of the SLB instance.
	LoadBalancerId string  `pulumi:"loadBalancerId"`
	OutputFile     *string `pulumi:"outputFile"`
}

// A collection of values returned by getDomainExtensions.
type GetDomainExtensionsResult struct {
	// A list of SLB domain extension. Each element contains the following attributes:
	Extensions   []GetDomainExtensionsExtension `pulumi:"extensions"`
	FrontendPort int                            `pulumi:"frontendPort"`
	// The provider-assigned unique ID for this managed resource.
	Id             string   `pulumi:"id"`
	Ids            []string `pulumi:"ids"`
	LoadBalancerId string   `pulumi:"loadBalancerId"`
	OutputFile     *string  `pulumi:"outputFile"`
}

func GetDomainExtensionsOutput(ctx *pulumi.Context, args GetDomainExtensionsOutputArgs, opts ...pulumi.InvokeOption) GetDomainExtensionsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDomainExtensionsResult, error) {
			args := v.(GetDomainExtensionsArgs)
			r, err := GetDomainExtensions(ctx, &args, opts...)
			var s GetDomainExtensionsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDomainExtensionsResultOutput)
}

// A collection of arguments for invoking getDomainExtensions.
type GetDomainExtensionsOutputArgs struct {
	// The frontend port used by the HTTPS listener of the SLB instance. Valid values: 1–65535.
	FrontendPort pulumi.IntInput `pulumi:"frontendPort"`
	// IDs of the SLB domain extensions.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The ID of the SLB instance.
	LoadBalancerId pulumi.StringInput    `pulumi:"loadBalancerId"`
	OutputFile     pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetDomainExtensionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDomainExtensionsArgs)(nil)).Elem()
}

// A collection of values returned by getDomainExtensions.
type GetDomainExtensionsResultOutput struct{ *pulumi.OutputState }

func (GetDomainExtensionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDomainExtensionsResult)(nil)).Elem()
}

func (o GetDomainExtensionsResultOutput) ToGetDomainExtensionsResultOutput() GetDomainExtensionsResultOutput {
	return o
}

func (o GetDomainExtensionsResultOutput) ToGetDomainExtensionsResultOutputWithContext(ctx context.Context) GetDomainExtensionsResultOutput {
	return o
}

// A list of SLB domain extension. Each element contains the following attributes:
func (o GetDomainExtensionsResultOutput) Extensions() GetDomainExtensionsExtensionArrayOutput {
	return o.ApplyT(func(v GetDomainExtensionsResult) []GetDomainExtensionsExtension { return v.Extensions }).(GetDomainExtensionsExtensionArrayOutput)
}

func (o GetDomainExtensionsResultOutput) FrontendPort() pulumi.IntOutput {
	return o.ApplyT(func(v GetDomainExtensionsResult) int { return v.FrontendPort }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDomainExtensionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainExtensionsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDomainExtensionsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDomainExtensionsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetDomainExtensionsResultOutput) LoadBalancerId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainExtensionsResult) string { return v.LoadBalancerId }).(pulumi.StringOutput)
}

func (o GetDomainExtensionsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDomainExtensionsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDomainExtensionsResultOutput{})
}
