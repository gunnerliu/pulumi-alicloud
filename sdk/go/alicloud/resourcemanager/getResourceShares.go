// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package resourcemanager

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Resource Manager Resource Shares of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.111.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := resourcemanager.GetResourceShares(ctx, &resourcemanager.GetResourceSharesArgs{
//				ResourceShareOwner: "Self",
//				Ids: []string{
//					"example_value",
//				},
//				NameRegex: pulumi.StringRef("the_resource_name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstResourceManagerResourceShareId", example.Shares[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetResourceShares(ctx *pulumi.Context, args *GetResourceSharesArgs, opts ...pulumi.InvokeOption) (*GetResourceSharesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetResourceSharesResult
	err := ctx.Invoke("alicloud:resourcemanager/getResourceShares:getResourceShares", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getResourceShares.
type GetResourceSharesArgs struct {
	// A list of Resource Share IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Resource Share name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The name of resource share.
	ResourceShareName *string `pulumi:"resourceShareName"`
	// The owner of resource share.
	ResourceShareOwner string `pulumi:"resourceShareOwner"`
	// The status of resource share.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getResourceShares.
type GetResourceSharesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id                 string                   `pulumi:"id"`
	Ids                []string                 `pulumi:"ids"`
	NameRegex          *string                  `pulumi:"nameRegex"`
	Names              []string                 `pulumi:"names"`
	OutputFile         *string                  `pulumi:"outputFile"`
	ResourceShareName  *string                  `pulumi:"resourceShareName"`
	ResourceShareOwner string                   `pulumi:"resourceShareOwner"`
	Shares             []GetResourceSharesShare `pulumi:"shares"`
	Status             *string                  `pulumi:"status"`
}

func GetResourceSharesOutput(ctx *pulumi.Context, args GetResourceSharesOutputArgs, opts ...pulumi.InvokeOption) GetResourceSharesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetResourceSharesResult, error) {
			args := v.(GetResourceSharesArgs)
			r, err := GetResourceShares(ctx, &args, opts...)
			var s GetResourceSharesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetResourceSharesResultOutput)
}

// A collection of arguments for invoking getResourceShares.
type GetResourceSharesOutputArgs struct {
	// A list of Resource Share IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Resource Share name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The name of resource share.
	ResourceShareName pulumi.StringPtrInput `pulumi:"resourceShareName"`
	// The owner of resource share.
	ResourceShareOwner pulumi.StringInput `pulumi:"resourceShareOwner"`
	// The status of resource share.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetResourceSharesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetResourceSharesArgs)(nil)).Elem()
}

// A collection of values returned by getResourceShares.
type GetResourceSharesResultOutput struct{ *pulumi.OutputState }

func (GetResourceSharesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetResourceSharesResult)(nil)).Elem()
}

func (o GetResourceSharesResultOutput) ToGetResourceSharesResultOutput() GetResourceSharesResultOutput {
	return o
}

func (o GetResourceSharesResultOutput) ToGetResourceSharesResultOutputWithContext(ctx context.Context) GetResourceSharesResultOutput {
	return o
}

func (o GetResourceSharesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetResourceSharesResult] {
	return pulumix.Output[GetResourceSharesResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetResourceSharesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetResourceSharesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetResourceSharesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetResourceSharesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetResourceSharesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetResourceSharesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetResourceSharesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetResourceSharesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetResourceSharesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetResourceSharesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetResourceSharesResultOutput) ResourceShareName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetResourceSharesResult) *string { return v.ResourceShareName }).(pulumi.StringPtrOutput)
}

func (o GetResourceSharesResultOutput) ResourceShareOwner() pulumi.StringOutput {
	return o.ApplyT(func(v GetResourceSharesResult) string { return v.ResourceShareOwner }).(pulumi.StringOutput)
}

func (o GetResourceSharesResultOutput) Shares() GetResourceSharesShareArrayOutput {
	return o.ApplyT(func(v GetResourceSharesResult) []GetResourceSharesShare { return v.Shares }).(GetResourceSharesShareArrayOutput)
}

func (o GetResourceSharesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetResourceSharesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetResourceSharesResultOutput{})
}
