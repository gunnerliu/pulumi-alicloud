// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Dms Enterprise Proxies of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.188.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := dms.GetEnterpriseProxies(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("dmsEnterpriseProxyId1", ids.Proxies[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetEnterpriseProxies(ctx *pulumi.Context, args *GetEnterpriseProxiesArgs, opts ...pulumi.InvokeOption) (*GetEnterpriseProxiesResult, error) {
	var rv GetEnterpriseProxiesResult
	err := ctx.Invoke("alicloud:dms/getEnterpriseProxies:getEnterpriseProxies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEnterpriseProxies.
type GetEnterpriseProxiesArgs struct {
	// A list of Proxy IDs.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// The ID of the tenant.
	Tid *string `pulumi:"tid"`
}

// A collection of values returned by getEnterpriseProxies.
type GetEnterpriseProxiesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string                      `pulumi:"id"`
	Ids        []string                    `pulumi:"ids"`
	OutputFile *string                     `pulumi:"outputFile"`
	Proxies    []GetEnterpriseProxiesProxy `pulumi:"proxies"`
	Tid        *string                     `pulumi:"tid"`
}

func GetEnterpriseProxiesOutput(ctx *pulumi.Context, args GetEnterpriseProxiesOutputArgs, opts ...pulumi.InvokeOption) GetEnterpriseProxiesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEnterpriseProxiesResult, error) {
			args := v.(GetEnterpriseProxiesArgs)
			r, err := GetEnterpriseProxies(ctx, &args, opts...)
			var s GetEnterpriseProxiesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEnterpriseProxiesResultOutput)
}

// A collection of arguments for invoking getEnterpriseProxies.
type GetEnterpriseProxiesOutputArgs struct {
	// A list of Proxy IDs.
	Ids        pulumi.StringArrayInput `pulumi:"ids"`
	OutputFile pulumi.StringPtrInput   `pulumi:"outputFile"`
	// The ID of the tenant.
	Tid pulumi.StringPtrInput `pulumi:"tid"`
}

func (GetEnterpriseProxiesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEnterpriseProxiesArgs)(nil)).Elem()
}

// A collection of values returned by getEnterpriseProxies.
type GetEnterpriseProxiesResultOutput struct{ *pulumi.OutputState }

func (GetEnterpriseProxiesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEnterpriseProxiesResult)(nil)).Elem()
}

func (o GetEnterpriseProxiesResultOutput) ToGetEnterpriseProxiesResultOutput() GetEnterpriseProxiesResultOutput {
	return o
}

func (o GetEnterpriseProxiesResultOutput) ToGetEnterpriseProxiesResultOutputWithContext(ctx context.Context) GetEnterpriseProxiesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetEnterpriseProxiesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEnterpriseProxiesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetEnterpriseProxiesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEnterpriseProxiesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetEnterpriseProxiesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEnterpriseProxiesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetEnterpriseProxiesResultOutput) Proxies() GetEnterpriseProxiesProxyArrayOutput {
	return o.ApplyT(func(v GetEnterpriseProxiesResult) []GetEnterpriseProxiesProxy { return v.Proxies }).(GetEnterpriseProxiesProxyArrayOutput)
}

func (o GetEnterpriseProxiesResultOutput) Tid() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEnterpriseProxiesResult) *string { return v.Tid }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEnterpriseProxiesResultOutput{})
}
