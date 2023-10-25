// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Cen Transit Router Prefix List Associations of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.188.0+.
func GetTransitRouterPrefixListAssociations(ctx *pulumi.Context, args *GetTransitRouterPrefixListAssociationsArgs, opts ...pulumi.InvokeOption) (*GetTransitRouterPrefixListAssociationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTransitRouterPrefixListAssociationsResult
	err := ctx.Invoke("alicloud:cen/getTransitRouterPrefixListAssociations:getTransitRouterPrefixListAssociations", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTransitRouterPrefixListAssociations.
type GetTransitRouterPrefixListAssociationsArgs struct {
	// A list of Cen Transit Router Prefix List Association IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the Alibaba Cloud account to which the prefix list belongs.
	OwnerUid   *int `pulumi:"ownerUid"`
	PageNumber *int `pulumi:"pageNumber"`
	PageSize   *int `pulumi:"pageSize"`
	// The ID of the prefix list.
	PrefixListId *string `pulumi:"prefixListId"`
	// The status of the prefix list.
	Status *string `pulumi:"status"`
	// The ID of the transit router.
	TransitRouterId string `pulumi:"transitRouterId"`
	// The ID of the route table of the transit router.
	TransitRouterTableId string `pulumi:"transitRouterTableId"`
}

// A collection of values returned by getTransitRouterPrefixListAssociations.
type GetTransitRouterPrefixListAssociationsResult struct {
	Associations []GetTransitRouterPrefixListAssociationsAssociation `pulumi:"associations"`
	// The provider-assigned unique ID for this managed resource.
	Id                   string   `pulumi:"id"`
	Ids                  []string `pulumi:"ids"`
	OutputFile           *string  `pulumi:"outputFile"`
	OwnerUid             *int     `pulumi:"ownerUid"`
	PageNumber           *int     `pulumi:"pageNumber"`
	PageSize             *int     `pulumi:"pageSize"`
	PrefixListId         *string  `pulumi:"prefixListId"`
	Status               *string  `pulumi:"status"`
	TransitRouterId      string   `pulumi:"transitRouterId"`
	TransitRouterTableId string   `pulumi:"transitRouterTableId"`
}

func GetTransitRouterPrefixListAssociationsOutput(ctx *pulumi.Context, args GetTransitRouterPrefixListAssociationsOutputArgs, opts ...pulumi.InvokeOption) GetTransitRouterPrefixListAssociationsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetTransitRouterPrefixListAssociationsResult, error) {
			args := v.(GetTransitRouterPrefixListAssociationsArgs)
			r, err := GetTransitRouterPrefixListAssociations(ctx, &args, opts...)
			var s GetTransitRouterPrefixListAssociationsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetTransitRouterPrefixListAssociationsResultOutput)
}

// A collection of arguments for invoking getTransitRouterPrefixListAssociations.
type GetTransitRouterPrefixListAssociationsOutputArgs struct {
	// A list of Cen Transit Router Prefix List Association IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the Alibaba Cloud account to which the prefix list belongs.
	OwnerUid   pulumi.IntPtrInput `pulumi:"ownerUid"`
	PageNumber pulumi.IntPtrInput `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput `pulumi:"pageSize"`
	// The ID of the prefix list.
	PrefixListId pulumi.StringPtrInput `pulumi:"prefixListId"`
	// The status of the prefix list.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The ID of the transit router.
	TransitRouterId pulumi.StringInput `pulumi:"transitRouterId"`
	// The ID of the route table of the transit router.
	TransitRouterTableId pulumi.StringInput `pulumi:"transitRouterTableId"`
}

func (GetTransitRouterPrefixListAssociationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterPrefixListAssociationsArgs)(nil)).Elem()
}

// A collection of values returned by getTransitRouterPrefixListAssociations.
type GetTransitRouterPrefixListAssociationsResultOutput struct{ *pulumi.OutputState }

func (GetTransitRouterPrefixListAssociationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterPrefixListAssociationsResult)(nil)).Elem()
}

func (o GetTransitRouterPrefixListAssociationsResultOutput) ToGetTransitRouterPrefixListAssociationsResultOutput() GetTransitRouterPrefixListAssociationsResultOutput {
	return o
}

func (o GetTransitRouterPrefixListAssociationsResultOutput) ToGetTransitRouterPrefixListAssociationsResultOutputWithContext(ctx context.Context) GetTransitRouterPrefixListAssociationsResultOutput {
	return o
}

func (o GetTransitRouterPrefixListAssociationsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetTransitRouterPrefixListAssociationsResult] {
	return pulumix.Output[GetTransitRouterPrefixListAssociationsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetTransitRouterPrefixListAssociationsResultOutput) Associations() GetTransitRouterPrefixListAssociationsAssociationArrayOutput {
	return o.ApplyT(func(v GetTransitRouterPrefixListAssociationsResult) []GetTransitRouterPrefixListAssociationsAssociation {
		return v.Associations
	}).(GetTransitRouterPrefixListAssociationsAssociationArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetTransitRouterPrefixListAssociationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransitRouterPrefixListAssociationsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTransitRouterPrefixListAssociationsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTransitRouterPrefixListAssociationsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetTransitRouterPrefixListAssociationsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterPrefixListAssociationsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetTransitRouterPrefixListAssociationsResultOutput) OwnerUid() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetTransitRouterPrefixListAssociationsResult) *int { return v.OwnerUid }).(pulumi.IntPtrOutput)
}

func (o GetTransitRouterPrefixListAssociationsResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetTransitRouterPrefixListAssociationsResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetTransitRouterPrefixListAssociationsResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetTransitRouterPrefixListAssociationsResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func (o GetTransitRouterPrefixListAssociationsResultOutput) PrefixListId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterPrefixListAssociationsResult) *string { return v.PrefixListId }).(pulumi.StringPtrOutput)
}

func (o GetTransitRouterPrefixListAssociationsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterPrefixListAssociationsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetTransitRouterPrefixListAssociationsResultOutput) TransitRouterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransitRouterPrefixListAssociationsResult) string { return v.TransitRouterId }).(pulumi.StringOutput)
}

func (o GetTransitRouterPrefixListAssociationsResultOutput) TransitRouterTableId() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransitRouterPrefixListAssociationsResult) string { return v.TransitRouterTableId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTransitRouterPrefixListAssociationsResultOutput{})
}
