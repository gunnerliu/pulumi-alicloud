// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package oos

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Oos Applications of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.145.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/oos"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := oos.GetApplications(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("oosApplicationId1", ids.Applications[0].Id)
//			nameRegex, err := oos.GetApplications(ctx, &oos.GetApplicationsArgs{
//				NameRegex: pulumi.StringRef("^my-Application"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("oosApplicationId2", nameRegex.Applications[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetApplications(ctx *pulumi.Context, args *GetApplicationsArgs, opts ...pulumi.InvokeOption) (*GetApplicationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetApplicationsResult
	err := ctx.Invoke("alicloud:oos/getApplications:getApplications", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplications.
type GetApplicationsArgs struct {
	// A list of Application IDs. Its element value is same as Application Name.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Application name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The tag of the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// A collection of values returned by getApplications.
type GetApplicationsResult struct {
	Applications []GetApplicationsApplication `pulumi:"applications"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                 `pulumi:"id"`
	Ids        []string               `pulumi:"ids"`
	NameRegex  *string                `pulumi:"nameRegex"`
	Names      []string               `pulumi:"names"`
	OutputFile *string                `pulumi:"outputFile"`
	Tags       map[string]interface{} `pulumi:"tags"`
}

func GetApplicationsOutput(ctx *pulumi.Context, args GetApplicationsOutputArgs, opts ...pulumi.InvokeOption) GetApplicationsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetApplicationsResult, error) {
			args := v.(GetApplicationsArgs)
			r, err := GetApplications(ctx, &args, opts...)
			var s GetApplicationsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetApplicationsResultOutput)
}

// A collection of arguments for invoking getApplications.
type GetApplicationsOutputArgs struct {
	// A list of Application IDs. Its element value is same as Application Name.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Application name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The tag of the resource.
	Tags pulumi.MapInput `pulumi:"tags"`
}

func (GetApplicationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetApplicationsArgs)(nil)).Elem()
}

// A collection of values returned by getApplications.
type GetApplicationsResultOutput struct{ *pulumi.OutputState }

func (GetApplicationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetApplicationsResult)(nil)).Elem()
}

func (o GetApplicationsResultOutput) ToGetApplicationsResultOutput() GetApplicationsResultOutput {
	return o
}

func (o GetApplicationsResultOutput) ToGetApplicationsResultOutputWithContext(ctx context.Context) GetApplicationsResultOutput {
	return o
}

func (o GetApplicationsResultOutput) Applications() GetApplicationsApplicationArrayOutput {
	return o.ApplyT(func(v GetApplicationsResult) []GetApplicationsApplication { return v.Applications }).(GetApplicationsApplicationArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetApplicationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetApplicationsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetApplicationsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetApplicationsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetApplicationsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApplicationsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetApplicationsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetApplicationsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetApplicationsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApplicationsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetApplicationsResultOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetApplicationsResult) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetApplicationsResultOutput{})
}
