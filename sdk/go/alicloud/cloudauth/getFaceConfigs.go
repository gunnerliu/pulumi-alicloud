// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudauth

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Cloudauth Face Configs of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.137.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cloudauth"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			defaultFaceConfig, err := cloudauth.NewFaceConfig(ctx, "defaultFaceConfig", &cloudauth.FaceConfigArgs{
//				BizName: pulumi.String("example-value"),
//				BizType: pulumi.String("example-value"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultFaceConfigs := cloudauth.GetFaceConfigsOutput(ctx, cloudauth.GetFaceConfigsOutputArgs{
//				Ids: pulumi.StringArray{
//					defaultFaceConfig.ID(),
//				},
//				NameRegex: defaultFaceConfig.BizName,
//			}, nil)
//			ctx.Export("faceConfig", defaultFaceConfigs.ApplyT(func(defaultFaceConfigs cloudauth.GetFaceConfigsResult) (cloudauth.GetFaceConfigsConfig, error) {
//				return defaultFaceConfigs.Configs[0], nil
//			}).(cloudauth.GetFaceConfigsConfigOutput))
//			return nil
//		})
//	}
//
// ```
func GetFaceConfigs(ctx *pulumi.Context, args *GetFaceConfigsArgs, opts ...pulumi.InvokeOption) (*GetFaceConfigsResult, error) {
	var rv GetFaceConfigsResult
	err := ctx.Invoke("alicloud:cloudauth/getFaceConfigs:getFaceConfigs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFaceConfigs.
type GetFaceConfigsArgs struct {
	// A list of Face Config IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by biz_name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getFaceConfigs.
type GetFaceConfigsResult struct {
	Configs []GetFaceConfigsConfig `pulumi:"configs"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetFaceConfigsOutput(ctx *pulumi.Context, args GetFaceConfigsOutputArgs, opts ...pulumi.InvokeOption) GetFaceConfigsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetFaceConfigsResult, error) {
			args := v.(GetFaceConfigsArgs)
			r, err := GetFaceConfigs(ctx, &args, opts...)
			var s GetFaceConfigsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetFaceConfigsResultOutput)
}

// A collection of arguments for invoking getFaceConfigs.
type GetFaceConfigsOutputArgs struct {
	// A list of Face Config IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by biz_name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetFaceConfigsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFaceConfigsArgs)(nil)).Elem()
}

// A collection of values returned by getFaceConfigs.
type GetFaceConfigsResultOutput struct{ *pulumi.OutputState }

func (GetFaceConfigsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFaceConfigsResult)(nil)).Elem()
}

func (o GetFaceConfigsResultOutput) ToGetFaceConfigsResultOutput() GetFaceConfigsResultOutput {
	return o
}

func (o GetFaceConfigsResultOutput) ToGetFaceConfigsResultOutputWithContext(ctx context.Context) GetFaceConfigsResultOutput {
	return o
}

func (o GetFaceConfigsResultOutput) Configs() GetFaceConfigsConfigArrayOutput {
	return o.ApplyT(func(v GetFaceConfigsResult) []GetFaceConfigsConfig { return v.Configs }).(GetFaceConfigsConfigArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetFaceConfigsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFaceConfigsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetFaceConfigsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetFaceConfigsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetFaceConfigsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetFaceConfigsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetFaceConfigsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetFaceConfigsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetFaceConfigsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetFaceConfigsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFaceConfigsResultOutput{})
}
