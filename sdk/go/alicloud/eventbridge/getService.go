// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eventbridge

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Using this data source can open Event Bridge service automatically. If the service has been opened, it will return opened.
//
// For information about Event Bridge and how to use it, see [What is Event Bridge](https://www.alibabacloud.com/help/en/doc-detail/163239.htm).
//
// > **NOTE:** Available in v1.126.0+
//
// > **NOTE:** This data source supports `cn-shanghai`, `cn-hangzhou` and `ap-southeast-1` regions.
func GetService(ctx *pulumi.Context, args *GetServiceArgs, opts ...pulumi.InvokeOption) (*GetServiceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServiceResult
	err := ctx.Invoke("alicloud:eventbridge/getService:getService", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getService.
type GetServiceArgs struct {
	// Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
	//
	// > **NOTE:** Setting `enable = "On"` to open the Event Bridge service that means you have read and agreed the [Event Bridge Terms of Service](https://help.aliyun.com/document_detail/163911.html). The service can not closed once it is opened.
	Enable *string `pulumi:"enable"`
}

// A collection of values returned by getService.
type GetServiceResult struct {
	Enable *string `pulumi:"enable"`
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
	// Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
	//
	// > **NOTE:** Setting `enable = "On"` to open the Event Bridge service that means you have read and agreed the [Event Bridge Terms of Service](https://help.aliyun.com/document_detail/163911.html). The service can not closed once it is opened.
	Enable pulumi.StringPtrInput `pulumi:"enable"`
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

func (o GetServiceResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetServiceResult] {
	return pulumix.Output[GetServiceResult]{
		OutputState: o.OutputState,
	}
}

func (o GetServiceResultOutput) Enable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServiceResult) *string { return v.Enable }).(pulumi.StringPtrOutput)
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
