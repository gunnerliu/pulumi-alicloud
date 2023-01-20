// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package threatdetection

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides Threat Detection Asset available to the user.[What is Asset](https://www.alibabacloud.com/help/en/security-center/latest/api-doc-sas-2018-12-03-api-doc-describecloudcenterinstances)
//
// > **NOTE:** Available in 1.195.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/threatdetection"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := threatdetection.GetAssets(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("alicloudThreatDetectionAssetExampleId", _default.Assets[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetAssets(ctx *pulumi.Context, args *GetAssetsArgs, opts ...pulumi.InvokeOption) (*GetAssetsResult, error) {
	var rv GetAssetsResult
	err := ctx.Invoke("alicloud:threatdetection/getAssets:getAssets", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAssets.
type GetAssetsArgs struct {
	// Set the conditions for searching assets. This parameter is in JSON format. Note the case when you enter the parameter. **NOTE:** You can search for assets by using conditions such as the instance ID, instance name, VPC ID, region, and public IP address of the asset.
	Criteria *string `pulumi:"criteria"`
	// A list of Asset IDs.
	Ids []string `pulumi:"ids"`
	// Set asset importance. Value:
	// - **2**: Significant assets
	// - **1**: General assets
	// - **0**: Test asset
	Importance *int `pulumi:"importance"`
	// Set the logical relationship between multiple search conditions. The default value is **OR**. Valid values:
	// - **OR**: indicates that the relationship between multiple search conditions is **OR**.
	// - **AND**: indicates that the relationship between multiple search conditions is **AND**.
	LogicalExp *string `pulumi:"logicalExp"`
	// The type of asset to query. Value:
	// - **ecs**: server.
	// - **cloud_product**: Cloud product.
	MachineTypes *string `pulumi:"machineTypes"`
	// Specifies whether to internationalize the name of the default group. Default value: false
	NoGroupTrace *bool   `pulumi:"noGroupTrace"`
	OutputFile   *string `pulumi:"outputFile"`
	PageNumber   *int    `pulumi:"pageNumber"`
	PageSize     *int    `pulumi:"pageSize"`
}

// A collection of values returned by getAssets.
type GetAssetsResult struct {
	// A list of Asset Entries. Each element contains the following attributes:
	Assets   []GetAssetsAsset `pulumi:"assets"`
	Criteria *string          `pulumi:"criteria"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Asset IDs.
	Ids          []string `pulumi:"ids"`
	Importance   *int     `pulumi:"importance"`
	LogicalExp   *string  `pulumi:"logicalExp"`
	MachineTypes *string  `pulumi:"machineTypes"`
	NoGroupTrace *bool    `pulumi:"noGroupTrace"`
	OutputFile   *string  `pulumi:"outputFile"`
	PageNumber   *int     `pulumi:"pageNumber"`
	PageSize     *int     `pulumi:"pageSize"`
}

func GetAssetsOutput(ctx *pulumi.Context, args GetAssetsOutputArgs, opts ...pulumi.InvokeOption) GetAssetsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAssetsResult, error) {
			args := v.(GetAssetsArgs)
			r, err := GetAssets(ctx, &args, opts...)
			var s GetAssetsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAssetsResultOutput)
}

// A collection of arguments for invoking getAssets.
type GetAssetsOutputArgs struct {
	// Set the conditions for searching assets. This parameter is in JSON format. Note the case when you enter the parameter. **NOTE:** You can search for assets by using conditions such as the instance ID, instance name, VPC ID, region, and public IP address of the asset.
	Criteria pulumi.StringPtrInput `pulumi:"criteria"`
	// A list of Asset IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// Set asset importance. Value:
	// - **2**: Significant assets
	// - **1**: General assets
	// - **0**: Test asset
	Importance pulumi.IntPtrInput `pulumi:"importance"`
	// Set the logical relationship between multiple search conditions. The default value is **OR**. Valid values:
	// - **OR**: indicates that the relationship between multiple search conditions is **OR**.
	// - **AND**: indicates that the relationship between multiple search conditions is **AND**.
	LogicalExp pulumi.StringPtrInput `pulumi:"logicalExp"`
	// The type of asset to query. Value:
	// - **ecs**: server.
	// - **cloud_product**: Cloud product.
	MachineTypes pulumi.StringPtrInput `pulumi:"machineTypes"`
	// Specifies whether to internationalize the name of the default group. Default value: false
	NoGroupTrace pulumi.BoolPtrInput   `pulumi:"noGroupTrace"`
	OutputFile   pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber   pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize     pulumi.IntPtrInput    `pulumi:"pageSize"`
}

func (GetAssetsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAssetsArgs)(nil)).Elem()
}

// A collection of values returned by getAssets.
type GetAssetsResultOutput struct{ *pulumi.OutputState }

func (GetAssetsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAssetsResult)(nil)).Elem()
}

func (o GetAssetsResultOutput) ToGetAssetsResultOutput() GetAssetsResultOutput {
	return o
}

func (o GetAssetsResultOutput) ToGetAssetsResultOutputWithContext(ctx context.Context) GetAssetsResultOutput {
	return o
}

// A list of Asset Entries. Each element contains the following attributes:
func (o GetAssetsResultOutput) Assets() GetAssetsAssetArrayOutput {
	return o.ApplyT(func(v GetAssetsResult) []GetAssetsAsset { return v.Assets }).(GetAssetsAssetArrayOutput)
}

func (o GetAssetsResultOutput) Criteria() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAssetsResult) *string { return v.Criteria }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAssetsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAssetsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of Asset IDs.
func (o GetAssetsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAssetsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetAssetsResultOutput) Importance() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetAssetsResult) *int { return v.Importance }).(pulumi.IntPtrOutput)
}

func (o GetAssetsResultOutput) LogicalExp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAssetsResult) *string { return v.LogicalExp }).(pulumi.StringPtrOutput)
}

func (o GetAssetsResultOutput) MachineTypes() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAssetsResult) *string { return v.MachineTypes }).(pulumi.StringPtrOutput)
}

func (o GetAssetsResultOutput) NoGroupTrace() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetAssetsResult) *bool { return v.NoGroupTrace }).(pulumi.BoolPtrOutput)
}

func (o GetAssetsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAssetsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetAssetsResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetAssetsResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetAssetsResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetAssetsResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAssetsResultOutput{})
}
