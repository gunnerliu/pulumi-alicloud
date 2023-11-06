// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides DMS Enterprise Proxy Access available to the user.[What is Proxy Access](https://next.api.alibabacloud.com/document/dms-enterprise/2018-11-01/CreateProxyAccess)
//
// > **NOTE:** Available since v1.195.0.
//
// ## Example Usage
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
//			defaultEnterpriseProxyAccess, err := dms.NewEnterpriseProxyAccess(ctx, "defaultEnterpriseProxyAccess", &dms.EnterpriseProxyAccessArgs{
//				IndepPassword: pulumi.String("PASSWORD-DEMO"),
//				ProxyId:       pulumi.String("1881"),
//				IndepAccount:  pulumi.String("dmstest"),
//				UserId:        pulumi.String("104442"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultEnterpriseProxyAccesses := dms.GetEnterpriseProxyAccessesOutput(ctx, dms.GetEnterpriseProxyAccessesOutputArgs{
//				Ids: pulumi.StringArray{
//					defaultEnterpriseProxyAccess.ID(),
//				},
//				ProxyId: pulumi.String("1881"),
//			}, nil)
//			ctx.Export("alicloudDmsProxyAccesesExampleId", defaultEnterpriseProxyAccesses.ApplyT(func(defaultEnterpriseProxyAccesses dms.GetEnterpriseProxyAccessesResult) (*string, error) {
//				return &defaultEnterpriseProxyAccesses.Accesses[0].Id, nil
//			}).(pulumi.StringPtrOutput))
//			return nil
//		})
//	}
//
// ```
func GetEnterpriseProxyAccesses(ctx *pulumi.Context, args *GetEnterpriseProxyAccessesArgs, opts ...pulumi.InvokeOption) (*GetEnterpriseProxyAccessesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEnterpriseProxyAccessesResult
	err := ctx.Invoke("alicloud:dms/getEnterpriseProxyAccesses:getEnterpriseProxyAccesses", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEnterpriseProxyAccesses.
type GetEnterpriseProxyAccessesArgs struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Proxy Access IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the security agent.
	ProxyId string `pulumi:"proxyId"`
}

// A collection of values returned by getEnterpriseProxyAccesses.
type GetEnterpriseProxyAccessesResult struct {
	// A list of Proxy Access Entries. Each element contains the following attributes:
	Accesses      []GetEnterpriseProxyAccessesAccess `pulumi:"accesses"`
	EnableDetails *bool                              `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Proxy Access IDs.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// The ID of the security agent.
	ProxyId string `pulumi:"proxyId"`
}

func GetEnterpriseProxyAccessesOutput(ctx *pulumi.Context, args GetEnterpriseProxyAccessesOutputArgs, opts ...pulumi.InvokeOption) GetEnterpriseProxyAccessesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEnterpriseProxyAccessesResult, error) {
			args := v.(GetEnterpriseProxyAccessesArgs)
			r, err := GetEnterpriseProxyAccesses(ctx, &args, opts...)
			var s GetEnterpriseProxyAccessesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEnterpriseProxyAccessesResultOutput)
}

// A collection of arguments for invoking getEnterpriseProxyAccesses.
type GetEnterpriseProxyAccessesOutputArgs struct {
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Proxy Access IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the security agent.
	ProxyId pulumi.StringInput `pulumi:"proxyId"`
}

func (GetEnterpriseProxyAccessesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEnterpriseProxyAccessesArgs)(nil)).Elem()
}

// A collection of values returned by getEnterpriseProxyAccesses.
type GetEnterpriseProxyAccessesResultOutput struct{ *pulumi.OutputState }

func (GetEnterpriseProxyAccessesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEnterpriseProxyAccessesResult)(nil)).Elem()
}

func (o GetEnterpriseProxyAccessesResultOutput) ToGetEnterpriseProxyAccessesResultOutput() GetEnterpriseProxyAccessesResultOutput {
	return o
}

func (o GetEnterpriseProxyAccessesResultOutput) ToGetEnterpriseProxyAccessesResultOutputWithContext(ctx context.Context) GetEnterpriseProxyAccessesResultOutput {
	return o
}

// A list of Proxy Access Entries. Each element contains the following attributes:
func (o GetEnterpriseProxyAccessesResultOutput) Accesses() GetEnterpriseProxyAccessesAccessArrayOutput {
	return o.ApplyT(func(v GetEnterpriseProxyAccessesResult) []GetEnterpriseProxyAccessesAccess { return v.Accesses }).(GetEnterpriseProxyAccessesAccessArrayOutput)
}

func (o GetEnterpriseProxyAccessesResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetEnterpriseProxyAccessesResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEnterpriseProxyAccessesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEnterpriseProxyAccessesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of Proxy Access IDs.
func (o GetEnterpriseProxyAccessesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEnterpriseProxyAccessesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetEnterpriseProxyAccessesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEnterpriseProxyAccessesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The ID of the security agent.
func (o GetEnterpriseProxyAccessesResultOutput) ProxyId() pulumi.StringOutput {
	return o.ApplyT(func(v GetEnterpriseProxyAccessesResult) string { return v.ProxyId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEnterpriseProxyAccessesResultOutput{})
}
