// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ehpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Ehpc Job Templates of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.133.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ehpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ehpc.NewJobTemplate(ctx, "default", &ehpc.JobTemplateArgs{
//				JobTemplateName: pulumi.String("example_value"),
//				CommandLine:     pulumi.String("./LammpsTest/lammps.pbs"),
//			})
//			if err != nil {
//				return err
//			}
//			ids := ehpc.GetJobTemplatesOutput(ctx, ehpc.GetJobTemplatesOutputArgs{
//				Ids: pulumi.StringArray{
//					_default.ID(),
//				},
//			}, nil)
//			ctx.Export("ehpcJobTemplateId1", ids.ApplyT(func(ids ehpc.GetJobTemplatesResult) (*string, error) {
//				return &ids.Id, nil
//			}).(pulumi.StringPtrOutput))
//			return nil
//		})
//	}
//
// ```
func GetJobTemplates(ctx *pulumi.Context, args *GetJobTemplatesArgs, opts ...pulumi.InvokeOption) (*GetJobTemplatesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetJobTemplatesResult
	err := ctx.Invoke("alicloud:ehpc/getJobTemplates:getJobTemplates", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getJobTemplates.
type GetJobTemplatesArgs struct {
	// A list of Job Template IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getJobTemplates.
type GetJobTemplatesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string                    `pulumi:"id"`
	Ids        []string                  `pulumi:"ids"`
	OutputFile *string                   `pulumi:"outputFile"`
	Templates  []GetJobTemplatesTemplate `pulumi:"templates"`
}

func GetJobTemplatesOutput(ctx *pulumi.Context, args GetJobTemplatesOutputArgs, opts ...pulumi.InvokeOption) GetJobTemplatesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetJobTemplatesResult, error) {
			args := v.(GetJobTemplatesArgs)
			r, err := GetJobTemplates(ctx, &args, opts...)
			var s GetJobTemplatesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetJobTemplatesResultOutput)
}

// A collection of arguments for invoking getJobTemplates.
type GetJobTemplatesOutputArgs struct {
	// A list of Job Template IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetJobTemplatesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetJobTemplatesArgs)(nil)).Elem()
}

// A collection of values returned by getJobTemplates.
type GetJobTemplatesResultOutput struct{ *pulumi.OutputState }

func (GetJobTemplatesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetJobTemplatesResult)(nil)).Elem()
}

func (o GetJobTemplatesResultOutput) ToGetJobTemplatesResultOutput() GetJobTemplatesResultOutput {
	return o
}

func (o GetJobTemplatesResultOutput) ToGetJobTemplatesResultOutputWithContext(ctx context.Context) GetJobTemplatesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetJobTemplatesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetJobTemplatesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetJobTemplatesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetJobTemplatesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetJobTemplatesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetJobTemplatesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetJobTemplatesResultOutput) Templates() GetJobTemplatesTemplateArrayOutput {
	return o.ApplyT(func(v GetJobTemplatesResult) []GetJobTemplatesTemplate { return v.Templates }).(GetJobTemplatesTemplateArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetJobTemplatesResultOutput{})
}
