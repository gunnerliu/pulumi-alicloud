// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package alb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Alb Health Check Templates of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.134.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/alb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := alb.GetHealthCheckTemplates(ctx, &alb.GetHealthCheckTemplatesArgs{
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("albHealthCheckTemplateId1", ids.Templates[0].Id)
//			nameRegex, err := alb.GetHealthCheckTemplates(ctx, &alb.GetHealthCheckTemplatesArgs{
//				NameRegex: pulumi.StringRef("^my-HealthCheckTemplate"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("albHealthCheckTemplateId2", nameRegex.Templates[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetHealthCheckTemplates(ctx *pulumi.Context, args *GetHealthCheckTemplatesArgs, opts ...pulumi.InvokeOption) (*GetHealthCheckTemplatesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetHealthCheckTemplatesResult
	err := ctx.Invoke("alicloud:alb/getHealthCheckTemplates:getHealthCheckTemplates", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHealthCheckTemplates.
type GetHealthCheckTemplatesArgs struct {
	// The health check template ids.
	HealthCheckTemplateIds []string `pulumi:"healthCheckTemplateIds"`
	// The name of the health check template.  The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
	HealthCheckTemplateName *string `pulumi:"healthCheckTemplateName"`
	// A list of Health Check Template IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Health Check Template name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getHealthCheckTemplates.
type GetHealthCheckTemplatesResult struct {
	HealthCheckTemplateIds  []string `pulumi:"healthCheckTemplateIds"`
	HealthCheckTemplateName *string  `pulumi:"healthCheckTemplateName"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                            `pulumi:"id"`
	Ids        []string                          `pulumi:"ids"`
	NameRegex  *string                           `pulumi:"nameRegex"`
	Names      []string                          `pulumi:"names"`
	OutputFile *string                           `pulumi:"outputFile"`
	Templates  []GetHealthCheckTemplatesTemplate `pulumi:"templates"`
}

func GetHealthCheckTemplatesOutput(ctx *pulumi.Context, args GetHealthCheckTemplatesOutputArgs, opts ...pulumi.InvokeOption) GetHealthCheckTemplatesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetHealthCheckTemplatesResult, error) {
			args := v.(GetHealthCheckTemplatesArgs)
			r, err := GetHealthCheckTemplates(ctx, &args, opts...)
			var s GetHealthCheckTemplatesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetHealthCheckTemplatesResultOutput)
}

// A collection of arguments for invoking getHealthCheckTemplates.
type GetHealthCheckTemplatesOutputArgs struct {
	// The health check template ids.
	HealthCheckTemplateIds pulumi.StringArrayInput `pulumi:"healthCheckTemplateIds"`
	// The name of the health check template.  The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
	HealthCheckTemplateName pulumi.StringPtrInput `pulumi:"healthCheckTemplateName"`
	// A list of Health Check Template IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Health Check Template name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetHealthCheckTemplatesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHealthCheckTemplatesArgs)(nil)).Elem()
}

// A collection of values returned by getHealthCheckTemplates.
type GetHealthCheckTemplatesResultOutput struct{ *pulumi.OutputState }

func (GetHealthCheckTemplatesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHealthCheckTemplatesResult)(nil)).Elem()
}

func (o GetHealthCheckTemplatesResultOutput) ToGetHealthCheckTemplatesResultOutput() GetHealthCheckTemplatesResultOutput {
	return o
}

func (o GetHealthCheckTemplatesResultOutput) ToGetHealthCheckTemplatesResultOutputWithContext(ctx context.Context) GetHealthCheckTemplatesResultOutput {
	return o
}

func (o GetHealthCheckTemplatesResultOutput) HealthCheckTemplateIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHealthCheckTemplatesResult) []string { return v.HealthCheckTemplateIds }).(pulumi.StringArrayOutput)
}

func (o GetHealthCheckTemplatesResultOutput) HealthCheckTemplateName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHealthCheckTemplatesResult) *string { return v.HealthCheckTemplateName }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetHealthCheckTemplatesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetHealthCheckTemplatesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetHealthCheckTemplatesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHealthCheckTemplatesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetHealthCheckTemplatesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHealthCheckTemplatesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetHealthCheckTemplatesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHealthCheckTemplatesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetHealthCheckTemplatesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHealthCheckTemplatesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetHealthCheckTemplatesResultOutput) Templates() GetHealthCheckTemplatesTemplateArrayOutput {
	return o.ApplyT(func(v GetHealthCheckTemplatesResult) []GetHealthCheckTemplatesTemplate { return v.Templates }).(GetHealthCheckTemplatesTemplateArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetHealthCheckTemplatesResultOutput{})
}
