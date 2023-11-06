// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eflo

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides Eflo Vpd available to the user.[What is Vpd](https://help.aliyun.com/document_detail/604976.html)
//
// > **NOTE:** Available in 1.201.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/eflo"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// _default, err := eflo.GetVpds(ctx, &eflo.GetVpdsArgs{
// Ids: interface{}{
// alicloud_eflo_vpd.Default.Id,
// },
// NameRegex: pulumi.StringRef(alicloud_eflo_vpd.Default.Name),
// VpdName: pulumi.StringRef("RMC-Terraform-Test"),
// }, nil);
// if err != nil {
// return err
// }
// ctx.Export("alicloudEfloVpdExampleId", _default.Vpds[0].Id)
// return nil
// })
// }
// ```
func GetVpds(ctx *pulumi.Context, args *GetVpdsArgs, opts ...pulumi.InvokeOption) (*GetVpdsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVpdsResult
	err := ctx.Invoke("alicloud:eflo/getVpds:getVpds", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVpds.
type GetVpdsArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Vpd IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Group Metric Rule name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
	// The Resource group id
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The Vpd status. Valid values: `Available`, `Not Available`, `Executing`, `Deleting`,
	Status *string `pulumi:"status"`
	// The id of the vpd.
	VpdId *string `pulumi:"vpdId"`
	// The Name of the VPD.
	VpdName *string `pulumi:"vpdName"`
}

// A collection of values returned by getVpds.
type GetVpdsResult struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Vpd IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of name of Vpds.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	PageNumber *int     `pulumi:"pageNumber"`
	PageSize   *int     `pulumi:"pageSize"`
	// Resource group id
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The Vpd status.
	Status *string `pulumi:"status"`
	// The id of the vpd.
	VpdId *string `pulumi:"vpdId"`
	// The Name of the VPD.
	VpdName *string `pulumi:"vpdName"`
	// A list of Vpd Entries. Each element contains the following attributes:
	Vpds []GetVpdsVpd `pulumi:"vpds"`
}

func GetVpdsOutput(ctx *pulumi.Context, args GetVpdsOutputArgs, opts ...pulumi.InvokeOption) GetVpdsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVpdsResult, error) {
			args := v.(GetVpdsArgs)
			r, err := GetVpds(ctx, &args, opts...)
			var s GetVpdsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVpdsResultOutput)
}

// A collection of arguments for invoking getVpds.
type GetVpdsOutputArgs struct {
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Vpd IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Group Metric Rule name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
	// The Resource group id
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// The Vpd status. Valid values: `Available`, `Not Available`, `Executing`, `Deleting`,
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The id of the vpd.
	VpdId pulumi.StringPtrInput `pulumi:"vpdId"`
	// The Name of the VPD.
	VpdName pulumi.StringPtrInput `pulumi:"vpdName"`
}

func (GetVpdsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpdsArgs)(nil)).Elem()
}

// A collection of values returned by getVpds.
type GetVpdsResultOutput struct{ *pulumi.OutputState }

func (GetVpdsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpdsResult)(nil)).Elem()
}

func (o GetVpdsResultOutput) ToGetVpdsResultOutput() GetVpdsResultOutput {
	return o
}

func (o GetVpdsResultOutput) ToGetVpdsResultOutputWithContext(ctx context.Context) GetVpdsResultOutput {
	return o
}

func (o GetVpdsResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetVpdsResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetVpdsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpdsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of Vpd IDs.
func (o GetVpdsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVpdsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetVpdsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpdsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of name of Vpds.
func (o GetVpdsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVpdsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetVpdsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpdsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetVpdsResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetVpdsResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetVpdsResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetVpdsResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

// Resource group id
func (o GetVpdsResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpdsResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// The Vpd status.
func (o GetVpdsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpdsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// The id of the vpd.
func (o GetVpdsResultOutput) VpdId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpdsResult) *string { return v.VpdId }).(pulumi.StringPtrOutput)
}

// The Name of the VPD.
func (o GetVpdsResultOutput) VpdName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpdsResult) *string { return v.VpdName }).(pulumi.StringPtrOutput)
}

// A list of Vpd Entries. Each element contains the following attributes:
func (o GetVpdsResultOutput) Vpds() GetVpdsVpdArrayOutput {
	return o.ApplyT(func(v GetVpdsResult) []GetVpdsVpd { return v.Vpds }).(GetVpdsVpdArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVpdsResultOutput{})
}
