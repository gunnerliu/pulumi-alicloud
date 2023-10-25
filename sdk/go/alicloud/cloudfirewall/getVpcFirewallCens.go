// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudfirewall

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides Cloud Firewall Vpc Firewall Cen available to the user.[What is Vpc Firewall Cen](https://www.alibabacloud.com/help/en/cloud-firewall/latest/describevpcfirewallcenlist)
//
// > **NOTE:** Available in 1.194.0+
func GetVpcFirewallCens(ctx *pulumi.Context, args *GetVpcFirewallCensArgs, opts ...pulumi.InvokeOption) (*GetVpcFirewallCensResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVpcFirewallCensResult
	err := ctx.Invoke("alicloud:cloudfirewall/getVpcFirewallCens:getVpcFirewallCens", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVpcFirewallCens.
type GetVpcFirewallCensArgs struct {
	// The ID of the CEN instance.
	CenId *string `pulumi:"cenId"`
	// A list of Vpc Firewall Cen IDs.
	Ids []string `pulumi:"ids"`
	// The language type of the requested and received messages. Value:-**zh** (default): Chinese.-**en**: English.
	Lang *string `pulumi:"lang"`
	// The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
	MemberUid *string `pulumi:"memberUid"`
	// The ID of the VPC instance that created the VPC firewall.
	NetworkInstanceId *string `pulumi:"networkInstanceId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
	// Firewall switch status
	Status *string `pulumi:"status"`
	// VPC firewall ID
	VpcFirewallId *string `pulumi:"vpcFirewallId"`
	// The name of the VPC firewall instance.
	VpcFirewallName *string `pulumi:"vpcFirewallName"`
}

// A collection of values returned by getVpcFirewallCens.
type GetVpcFirewallCensResult struct {
	// The ID of the CEN instance.
	CenId *string `pulumi:"cenId"`
	// A list of Vpc Firewall Cen Entries. Each element contains the following attributes:
	Cens []GetVpcFirewallCensCen `pulumi:"cens"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Vpc Firewall Cen IDs.
	Ids  []string `pulumi:"ids"`
	Lang *string  `pulumi:"lang"`
	// The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
	MemberUid *string `pulumi:"memberUid"`
	// The ID of the VPC instance that created the VPC firewall.
	NetworkInstanceId *string `pulumi:"networkInstanceId"`
	OutputFile        *string `pulumi:"outputFile"`
	PageNumber        *int    `pulumi:"pageNumber"`
	PageSize          *int    `pulumi:"pageSize"`
	// Firewall switch status
	Status *string `pulumi:"status"`
	// VPC firewall ID
	VpcFirewallId *string `pulumi:"vpcFirewallId"`
	// The name of the VPC firewall instance.
	VpcFirewallName *string `pulumi:"vpcFirewallName"`
}

func GetVpcFirewallCensOutput(ctx *pulumi.Context, args GetVpcFirewallCensOutputArgs, opts ...pulumi.InvokeOption) GetVpcFirewallCensResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVpcFirewallCensResult, error) {
			args := v.(GetVpcFirewallCensArgs)
			r, err := GetVpcFirewallCens(ctx, &args, opts...)
			var s GetVpcFirewallCensResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVpcFirewallCensResultOutput)
}

// A collection of arguments for invoking getVpcFirewallCens.
type GetVpcFirewallCensOutputArgs struct {
	// The ID of the CEN instance.
	CenId pulumi.StringPtrInput `pulumi:"cenId"`
	// A list of Vpc Firewall Cen IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The language type of the requested and received messages. Value:-**zh** (default): Chinese.-**en**: English.
	Lang pulumi.StringPtrInput `pulumi:"lang"`
	// The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
	MemberUid pulumi.StringPtrInput `pulumi:"memberUid"`
	// The ID of the VPC instance that created the VPC firewall.
	NetworkInstanceId pulumi.StringPtrInput `pulumi:"networkInstanceId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
	// Firewall switch status
	Status pulumi.StringPtrInput `pulumi:"status"`
	// VPC firewall ID
	VpcFirewallId pulumi.StringPtrInput `pulumi:"vpcFirewallId"`
	// The name of the VPC firewall instance.
	VpcFirewallName pulumi.StringPtrInput `pulumi:"vpcFirewallName"`
}

func (GetVpcFirewallCensOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcFirewallCensArgs)(nil)).Elem()
}

// A collection of values returned by getVpcFirewallCens.
type GetVpcFirewallCensResultOutput struct{ *pulumi.OutputState }

func (GetVpcFirewallCensResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcFirewallCensResult)(nil)).Elem()
}

func (o GetVpcFirewallCensResultOutput) ToGetVpcFirewallCensResultOutput() GetVpcFirewallCensResultOutput {
	return o
}

func (o GetVpcFirewallCensResultOutput) ToGetVpcFirewallCensResultOutputWithContext(ctx context.Context) GetVpcFirewallCensResultOutput {
	return o
}

func (o GetVpcFirewallCensResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetVpcFirewallCensResult] {
	return pulumix.Output[GetVpcFirewallCensResult]{
		OutputState: o.OutputState,
	}
}

// The ID of the CEN instance.
func (o GetVpcFirewallCensResultOutput) CenId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFirewallCensResult) *string { return v.CenId }).(pulumi.StringPtrOutput)
}

// A list of Vpc Firewall Cen Entries. Each element contains the following attributes:
func (o GetVpcFirewallCensResultOutput) Cens() GetVpcFirewallCensCenArrayOutput {
	return o.ApplyT(func(v GetVpcFirewallCensResult) []GetVpcFirewallCensCen { return v.Cens }).(GetVpcFirewallCensCenArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetVpcFirewallCensResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcFirewallCensResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of Vpc Firewall Cen IDs.
func (o GetVpcFirewallCensResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVpcFirewallCensResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetVpcFirewallCensResultOutput) Lang() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFirewallCensResult) *string { return v.Lang }).(pulumi.StringPtrOutput)
}

// The UID of the member account (other Alibaba Cloud account) of the current Alibaba cloud account.
func (o GetVpcFirewallCensResultOutput) MemberUid() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFirewallCensResult) *string { return v.MemberUid }).(pulumi.StringPtrOutput)
}

// The ID of the VPC instance that created the VPC firewall.
func (o GetVpcFirewallCensResultOutput) NetworkInstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFirewallCensResult) *string { return v.NetworkInstanceId }).(pulumi.StringPtrOutput)
}

func (o GetVpcFirewallCensResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFirewallCensResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetVpcFirewallCensResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetVpcFirewallCensResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetVpcFirewallCensResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetVpcFirewallCensResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

// Firewall switch status
func (o GetVpcFirewallCensResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFirewallCensResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// VPC firewall ID
func (o GetVpcFirewallCensResultOutput) VpcFirewallId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFirewallCensResult) *string { return v.VpcFirewallId }).(pulumi.StringPtrOutput)
}

// The name of the VPC firewall instance.
func (o GetVpcFirewallCensResultOutput) VpcFirewallName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcFirewallCensResult) *string { return v.VpcFirewallName }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVpcFirewallCensResultOutput{})
}
