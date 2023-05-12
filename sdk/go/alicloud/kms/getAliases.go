// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list of KMS aliases in an Alibaba Cloud account according to the specified filters.
//
// > **NOTE:** Available in v1.79.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/kms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := kms.GetAliases(ctx, &kms.GetAliasesArgs{
//				Ids: []string{
//					"d89e8a53-b708-41aa-8c67-6873axxx",
//				},
//				NameRegex: pulumi.StringRef("alias/tf-testKmsAlias_123"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstKeyId", data.Alicloud_kms_keys.Kms_keys_ds.Keys[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetAliases(ctx *pulumi.Context, args *GetAliasesArgs, opts ...pulumi.InvokeOption) (*GetAliasesResult, error) {
	var rv GetAliasesResult
	err := ctx.Invoke("alicloud:kms/getAliases:getAliases", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAliases.
type GetAliasesArgs struct {
	// A list of KMS aliases IDs. The value is same as KMS alias_name.
	Ids []string `pulumi:"ids"`
	// A regex string to filter the results by the KMS alias name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getAliases.
type GetAliasesResult struct {
	// A list of KMS User alias. Each element contains the following attributes:
	Aliases []GetAliasesAlias `pulumi:"aliases"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of kms aliases IDs. The value is same as KMS alias_name.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of KMS alias name.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetAliasesOutput(ctx *pulumi.Context, args GetAliasesOutputArgs, opts ...pulumi.InvokeOption) GetAliasesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAliasesResult, error) {
			args := v.(GetAliasesArgs)
			r, err := GetAliases(ctx, &args, opts...)
			var s GetAliasesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAliasesResultOutput)
}

// A collection of arguments for invoking getAliases.
type GetAliasesOutputArgs struct {
	// A list of KMS aliases IDs. The value is same as KMS alias_name.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter the results by the KMS alias name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetAliasesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAliasesArgs)(nil)).Elem()
}

// A collection of values returned by getAliases.
type GetAliasesResultOutput struct{ *pulumi.OutputState }

func (GetAliasesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAliasesResult)(nil)).Elem()
}

func (o GetAliasesResultOutput) ToGetAliasesResultOutput() GetAliasesResultOutput {
	return o
}

func (o GetAliasesResultOutput) ToGetAliasesResultOutputWithContext(ctx context.Context) GetAliasesResultOutput {
	return o
}

// A list of KMS User alias. Each element contains the following attributes:
func (o GetAliasesResultOutput) Aliases() GetAliasesAliasArrayOutput {
	return o.ApplyT(func(v GetAliasesResult) []GetAliasesAlias { return v.Aliases }).(GetAliasesAliasArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAliasesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAliasesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of kms aliases IDs. The value is same as KMS alias_name.
func (o GetAliasesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAliasesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetAliasesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAliasesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of KMS alias name.
func (o GetAliasesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAliasesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetAliasesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAliasesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAliasesResultOutput{})
}
