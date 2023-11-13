// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list of Nat Gateways owned by an Alibaba Cloud account.
//
// > **NOTE:** Available in 1.37.0+.
func GetNatGateways(ctx *pulumi.Context, args *GetNatGatewaysArgs, opts ...pulumi.InvokeOption) (*GetNatGatewaysResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNatGatewaysResult
	err := ctx.Invoke("alicloud:vpc/getNatGateways:getNatGateways", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNatGateways.
type GetNatGatewaysArgs struct {
	// Specifies whether to only precheck the request.
	DryRun *bool `pulumi:"dryRun"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of NAT gateways IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter nat gateways by name.
	NameRegex *string `pulumi:"nameRegex"`
	// The name of NAT gateway.
	NatGatewayName *string `pulumi:"natGatewayName"`
	// The nat type of NAT gateway. Valid values `Enhanced` and `Normal`.
	NatType *string `pulumi:"natType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
	// The payment type of NAT gateway. Valid values `PayAsYouGo` and `Subscription`.
	PaymentType *string `pulumi:"paymentType"`
	// The resource group id of NAT gateway.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The specification of NAT gateway. Valid values `Middle`, `Large`, `Small` and `XLarge.1`. Default value is `Small`.
	Specification *string `pulumi:"specification"`
	// The status of NAT gateway. Valid values `Available`, `Converting`, `Creating`, `Deleting` and `Modifying`.
	Status *string `pulumi:"status"`
	// The tags of NAT gateway.
	Tags map[string]interface{} `pulumi:"tags"`
	// The ID of the VPC.
	VpcId *string `pulumi:"vpcId"`
}

// A collection of values returned by getNatGateways.
type GetNatGatewaysResult struct {
	DryRun        *bool `pulumi:"dryRun"`
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Nat gateways. Each element contains the following attributes:
	Gateways []GetNatGatewaysGateway `pulumi:"gateways"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Optional) A list of Nat gateways IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of Nat gateways names.
	Names []string `pulumi:"names"`
	// The name of the NAT gateway.
	NatGatewayName *string `pulumi:"natGatewayName"`
	// The type of the NAT gateway.
	NatType    *string `pulumi:"natType"`
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
	// The billing method of the NAT gateway.
	PaymentType *string `pulumi:"paymentType"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The specification of the NAT gateway.
	Specification *string `pulumi:"specification"`
	// The status of the NAT gateway.
	Status *string `pulumi:"status"`
	// The tags of NAT gateway.
	Tags       map[string]interface{} `pulumi:"tags"`
	TotalCount int                    `pulumi:"totalCount"`
	// The ID of the VPC.
	VpcId *string `pulumi:"vpcId"`
}

func GetNatGatewaysOutput(ctx *pulumi.Context, args GetNatGatewaysOutputArgs, opts ...pulumi.InvokeOption) GetNatGatewaysResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNatGatewaysResult, error) {
			args := v.(GetNatGatewaysArgs)
			r, err := GetNatGateways(ctx, &args, opts...)
			var s GetNatGatewaysResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNatGatewaysResultOutput)
}

// A collection of arguments for invoking getNatGateways.
type GetNatGatewaysOutputArgs struct {
	// Specifies whether to only precheck the request.
	DryRun pulumi.BoolPtrInput `pulumi:"dryRun"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of NAT gateways IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter nat gateways by name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// The name of NAT gateway.
	NatGatewayName pulumi.StringPtrInput `pulumi:"natGatewayName"`
	// The nat type of NAT gateway. Valid values `Enhanced` and `Normal`.
	NatType pulumi.StringPtrInput `pulumi:"natType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
	// The payment type of NAT gateway. Valid values `PayAsYouGo` and `Subscription`.
	PaymentType pulumi.StringPtrInput `pulumi:"paymentType"`
	// The resource group id of NAT gateway.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// The specification of NAT gateway. Valid values `Middle`, `Large`, `Small` and `XLarge.1`. Default value is `Small`.
	Specification pulumi.StringPtrInput `pulumi:"specification"`
	// The status of NAT gateway. Valid values `Available`, `Converting`, `Creating`, `Deleting` and `Modifying`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The tags of NAT gateway.
	Tags pulumi.MapInput `pulumi:"tags"`
	// The ID of the VPC.
	VpcId pulumi.StringPtrInput `pulumi:"vpcId"`
}

func (GetNatGatewaysOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNatGatewaysArgs)(nil)).Elem()
}

// A collection of values returned by getNatGateways.
type GetNatGatewaysResultOutput struct{ *pulumi.OutputState }

func (GetNatGatewaysResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNatGatewaysResult)(nil)).Elem()
}

func (o GetNatGatewaysResultOutput) ToGetNatGatewaysResultOutput() GetNatGatewaysResultOutput {
	return o
}

func (o GetNatGatewaysResultOutput) ToGetNatGatewaysResultOutputWithContext(ctx context.Context) GetNatGatewaysResultOutput {
	return o
}

func (o GetNatGatewaysResultOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) *bool { return v.DryRun }).(pulumi.BoolPtrOutput)
}

func (o GetNatGatewaysResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// A list of Nat gateways. Each element contains the following attributes:
func (o GetNatGatewaysResultOutput) Gateways() GetNatGatewaysGatewayArrayOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) []GetNatGatewaysGateway { return v.Gateways }).(GetNatGatewaysGatewayArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetNatGatewaysResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Optional) A list of Nat gateways IDs.
func (o GetNatGatewaysResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetNatGatewaysResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of Nat gateways names.
func (o GetNatGatewaysResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

// The name of the NAT gateway.
func (o GetNatGatewaysResultOutput) NatGatewayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) *string { return v.NatGatewayName }).(pulumi.StringPtrOutput)
}

// The type of the NAT gateway.
func (o GetNatGatewaysResultOutput) NatType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) *string { return v.NatType }).(pulumi.StringPtrOutput)
}

func (o GetNatGatewaysResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetNatGatewaysResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetNatGatewaysResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

// The billing method of the NAT gateway.
func (o GetNatGatewaysResultOutput) PaymentType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) *string { return v.PaymentType }).(pulumi.StringPtrOutput)
}

// The ID of the resource group.
func (o GetNatGatewaysResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// The specification of the NAT gateway.
func (o GetNatGatewaysResultOutput) Specification() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) *string { return v.Specification }).(pulumi.StringPtrOutput)
}

// The status of the NAT gateway.
func (o GetNatGatewaysResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// The tags of NAT gateway.
func (o GetNatGatewaysResultOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

func (o GetNatGatewaysResultOutput) TotalCount() pulumi.IntOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) int { return v.TotalCount }).(pulumi.IntOutput)
}

// The ID of the VPC.
func (o GetNatGatewaysResultOutput) VpcId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNatGatewaysResult) *string { return v.VpcId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNatGatewaysResultOutput{})
}
