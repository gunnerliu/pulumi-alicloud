// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudsso

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Using this data source can open Cloud Sso Service automatically.
//
// For information about Cloud SSO and how to use it, see [What is Cloud SSO](https://www.alibabacloud.com/help/en/doc-detail/262819.html).
//
// > **NOTE:** Available in v1.148.0+.
//
// > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cloudsso"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudsso.GetService(ctx, &cloudsso.GetServiceArgs{
//				Enable: "On",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetService(ctx *pulumi.Context, args *GetServiceArgs, opts ...pulumi.InvokeOption) (*GetServiceResult, error) {
	var rv GetServiceResult
	err := ctx.Invoke("alicloud:cloudsso/getService:getService", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getService.
type GetServiceArgs struct {
	// Setting the value to `On` to enable the service. Valid values: `On` or `Off`.
	//
	// > **NOTE:** Setting `enable = "On"` to open the Cloud Sso service that means you have read and agreed the [Cloud Sso Terms of Service](https://help.aliyun.com/document_detail/299998.html). When there is no directory in Cloud SSO, you can set `enable = "Off"` to turn off Cloud SSO as needed. After it is closed, you can also open it at any time.
	Enable string `pulumi:"enable"`
}

// A collection of values returned by getService.
type GetServiceResult struct {
	Enable string `pulumi:"enable"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The current service enable status.
	Status string `pulumi:"status"`
}

func GetServiceOutput(ctx *pulumi.Context, args GetServiceOutputArgs, opts ...pulumi.InvokeOption) GetServiceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServiceResult, error) {
			args := v.(GetServiceArgs)
			r, err := GetService(ctx, &args, opts...)
			var s GetServiceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetServiceResultOutput)
}

// A collection of arguments for invoking getService.
type GetServiceOutputArgs struct {
	// Setting the value to `On` to enable the service. Valid values: `On` or `Off`.
	//
	// > **NOTE:** Setting `enable = "On"` to open the Cloud Sso service that means you have read and agreed the [Cloud Sso Terms of Service](https://help.aliyun.com/document_detail/299998.html). When there is no directory in Cloud SSO, you can set `enable = "Off"` to turn off Cloud SSO as needed. After it is closed, you can also open it at any time.
	Enable pulumi.StringInput `pulumi:"enable"`
}

func (GetServiceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceArgs)(nil)).Elem()
}

// A collection of values returned by getService.
type GetServiceResultOutput struct{ *pulumi.OutputState }

func (GetServiceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceResult)(nil)).Elem()
}

func (o GetServiceResultOutput) ToGetServiceResultOutput() GetServiceResultOutput {
	return o
}

func (o GetServiceResultOutput) ToGetServiceResultOutputWithContext(ctx context.Context) GetServiceResultOutput {
	return o
}

func (o GetServiceResultOutput) Enable() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceResult) string { return v.Enable }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServiceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceResult) string { return v.Id }).(pulumi.StringOutput)
}

// The current service enable status.
func (o GetServiceResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceResult) string { return v.Status }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServiceResultOutput{})
}
