// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apigateway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Api Gateway Log Configs of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.185.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/apigateway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := apigateway.GetLogConfigs(ctx, &apigateway.GetLogConfigsArgs{
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("apiGatewayLogConfigId1", ids.Configs[0].Id)
//			logType, err := apigateway.GetLogConfigs(ctx, &apigateway.GetLogConfigsArgs{
//				LogType: pulumi.StringRef("PROVIDER"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("apiGatewayLogConfigId2", logType.Configs[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetLogConfigs(ctx *pulumi.Context, args *GetLogConfigsArgs, opts ...pulumi.InvokeOption) (*GetLogConfigsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLogConfigsResult
	err := ctx.Invoke("alicloud:apigateway/getLogConfigs:getLogConfigs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLogConfigs.
type GetLogConfigsArgs struct {
	// A list of Log Config IDs.
	Ids []string `pulumi:"ids"`
	// The type the of log.
	LogType *string `pulumi:"logType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getLogConfigs.
type GetLogConfigsResult struct {
	Configs []GetLogConfigsConfig `pulumi:"configs"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	LogType    *string  `pulumi:"logType"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetLogConfigsOutput(ctx *pulumi.Context, args GetLogConfigsOutputArgs, opts ...pulumi.InvokeOption) GetLogConfigsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetLogConfigsResult, error) {
			args := v.(GetLogConfigsArgs)
			r, err := GetLogConfigs(ctx, &args, opts...)
			var s GetLogConfigsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetLogConfigsResultOutput)
}

// A collection of arguments for invoking getLogConfigs.
type GetLogConfigsOutputArgs struct {
	// A list of Log Config IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The type the of log.
	LogType pulumi.StringPtrInput `pulumi:"logType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetLogConfigsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLogConfigsArgs)(nil)).Elem()
}

// A collection of values returned by getLogConfigs.
type GetLogConfigsResultOutput struct{ *pulumi.OutputState }

func (GetLogConfigsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLogConfigsResult)(nil)).Elem()
}

func (o GetLogConfigsResultOutput) ToGetLogConfigsResultOutput() GetLogConfigsResultOutput {
	return o
}

func (o GetLogConfigsResultOutput) ToGetLogConfigsResultOutputWithContext(ctx context.Context) GetLogConfigsResultOutput {
	return o
}

func (o GetLogConfigsResultOutput) Configs() GetLogConfigsConfigArrayOutput {
	return o.ApplyT(func(v GetLogConfigsResult) []GetLogConfigsConfig { return v.Configs }).(GetLogConfigsConfigArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetLogConfigsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLogConfigsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetLogConfigsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetLogConfigsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetLogConfigsResultOutput) LogType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLogConfigsResult) *string { return v.LogType }).(pulumi.StringPtrOutput)
}

func (o GetLogConfigsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLogConfigsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLogConfigsResultOutput{})
}
