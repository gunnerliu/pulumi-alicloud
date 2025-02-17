// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package oos

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Oos Secret Parameters of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.147.0+.
func GetSecretParameters(ctx *pulumi.Context, args *GetSecretParametersArgs, opts ...pulumi.InvokeOption) (*GetSecretParametersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSecretParametersResult
	err := ctx.Invoke("alicloud:oos/getSecretParameters:getSecretParameters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecretParameters.
type GetSecretParametersArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Secret Parameter IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Secret Parameter name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the Resource Group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The name of the encryption parameter.
	SecretParameterName *string `pulumi:"secretParameterName"`
	SortField           *string `pulumi:"sortField"`
	SortOrder           *string `pulumi:"sortOrder"`
	// The tag of the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// A collection of values returned by getSecretParameters.
type GetSecretParametersResult struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id                  string                         `pulumi:"id"`
	Ids                 []string                       `pulumi:"ids"`
	NameRegex           *string                        `pulumi:"nameRegex"`
	Names               []string                       `pulumi:"names"`
	OutputFile          *string                        `pulumi:"outputFile"`
	Parameters          []GetSecretParametersParameter `pulumi:"parameters"`
	ResourceGroupId     *string                        `pulumi:"resourceGroupId"`
	SecretParameterName *string                        `pulumi:"secretParameterName"`
	SortField           *string                        `pulumi:"sortField"`
	SortOrder           *string                        `pulumi:"sortOrder"`
	Tags                map[string]interface{}         `pulumi:"tags"`
}

func GetSecretParametersOutput(ctx *pulumi.Context, args GetSecretParametersOutputArgs, opts ...pulumi.InvokeOption) GetSecretParametersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSecretParametersResult, error) {
			args := v.(GetSecretParametersArgs)
			r, err := GetSecretParameters(ctx, &args, opts...)
			var s GetSecretParametersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSecretParametersResultOutput)
}

// A collection of arguments for invoking getSecretParameters.
type GetSecretParametersOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Secret Parameter IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Secret Parameter name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the Resource Group.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// The name of the encryption parameter.
	SecretParameterName pulumi.StringPtrInput `pulumi:"secretParameterName"`
	SortField           pulumi.StringPtrInput `pulumi:"sortField"`
	SortOrder           pulumi.StringPtrInput `pulumi:"sortOrder"`
	// The tag of the resource.
	Tags pulumi.MapInput `pulumi:"tags"`
}

func (GetSecretParametersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecretParametersArgs)(nil)).Elem()
}

// A collection of values returned by getSecretParameters.
type GetSecretParametersResultOutput struct{ *pulumi.OutputState }

func (GetSecretParametersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecretParametersResult)(nil)).Elem()
}

func (o GetSecretParametersResultOutput) ToGetSecretParametersResultOutput() GetSecretParametersResultOutput {
	return o
}

func (o GetSecretParametersResultOutput) ToGetSecretParametersResultOutputWithContext(ctx context.Context) GetSecretParametersResultOutput {
	return o
}

func (o GetSecretParametersResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetSecretParametersResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSecretParametersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSecretParametersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSecretParametersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSecretParametersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSecretParametersResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecretParametersResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetSecretParametersResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSecretParametersResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetSecretParametersResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecretParametersResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetSecretParametersResultOutput) Parameters() GetSecretParametersParameterArrayOutput {
	return o.ApplyT(func(v GetSecretParametersResult) []GetSecretParametersParameter { return v.Parameters }).(GetSecretParametersParameterArrayOutput)
}

func (o GetSecretParametersResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecretParametersResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

func (o GetSecretParametersResultOutput) SecretParameterName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecretParametersResult) *string { return v.SecretParameterName }).(pulumi.StringPtrOutput)
}

func (o GetSecretParametersResultOutput) SortField() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecretParametersResult) *string { return v.SortField }).(pulumi.StringPtrOutput)
}

func (o GetSecretParametersResultOutput) SortOrder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecretParametersResult) *string { return v.SortOrder }).(pulumi.StringPtrOutput)
}

func (o GetSecretParametersResultOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetSecretParametersResult) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSecretParametersResultOutput{})
}
