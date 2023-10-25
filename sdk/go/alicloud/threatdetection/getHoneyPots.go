// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package threatdetection

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides Threat Detection Honey Pot available to the user.[What is Honey Pot](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-createhoneypot)
//
// > **NOTE:** Available since v1.195.0.
func GetHoneyPots(ctx *pulumi.Context, args *GetHoneyPotsArgs, opts ...pulumi.InvokeOption) (*GetHoneyPotsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetHoneyPotsResult
	err := ctx.Invoke("alicloud:threatdetection/getHoneyPots:getHoneyPots", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHoneyPots.
type GetHoneyPotsArgs struct {
	// Honeypot ID.
	HoneypotId *string `pulumi:"honeypotId"`
	// Honeypot custom name.
	HoneypotName *string `pulumi:"honeypotName"`
	// A list of Honey Pot IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by honey pot name.
	NameRegex *string `pulumi:"nameRegex"`
	// The ID of the honeypot management node.
	NodeId *string `pulumi:"nodeId"`
	// The name of the honeypot management node.
	NodeName *string `pulumi:"nodeName"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getHoneyPots.
type GetHoneyPotsResult struct {
	// Honeypot ID.
	HoneypotId *string `pulumi:"honeypotId"`
	// Honeypot custom name.
	HoneypotName *string `pulumi:"honeypotName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Honey Pot IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// The ID of the honeypot management node.
	NodeId     *string `pulumi:"nodeId"`
	NodeName   *string `pulumi:"nodeName"`
	OutputFile *string `pulumi:"outputFile"`
	// A list of Honey Pot Entries. Each element contains the following attributes:
	Pots []GetHoneyPotsPot `pulumi:"pots"`
}

func GetHoneyPotsOutput(ctx *pulumi.Context, args GetHoneyPotsOutputArgs, opts ...pulumi.InvokeOption) GetHoneyPotsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetHoneyPotsResult, error) {
			args := v.(GetHoneyPotsArgs)
			r, err := GetHoneyPots(ctx, &args, opts...)
			var s GetHoneyPotsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetHoneyPotsResultOutput)
}

// A collection of arguments for invoking getHoneyPots.
type GetHoneyPotsOutputArgs struct {
	// Honeypot ID.
	HoneypotId pulumi.StringPtrInput `pulumi:"honeypotId"`
	// Honeypot custom name.
	HoneypotName pulumi.StringPtrInput `pulumi:"honeypotName"`
	// A list of Honey Pot IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by honey pot name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// The ID of the honeypot management node.
	NodeId pulumi.StringPtrInput `pulumi:"nodeId"`
	// The name of the honeypot management node.
	NodeName pulumi.StringPtrInput `pulumi:"nodeName"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetHoneyPotsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHoneyPotsArgs)(nil)).Elem()
}

// A collection of values returned by getHoneyPots.
type GetHoneyPotsResultOutput struct{ *pulumi.OutputState }

func (GetHoneyPotsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHoneyPotsResult)(nil)).Elem()
}

func (o GetHoneyPotsResultOutput) ToGetHoneyPotsResultOutput() GetHoneyPotsResultOutput {
	return o
}

func (o GetHoneyPotsResultOutput) ToGetHoneyPotsResultOutputWithContext(ctx context.Context) GetHoneyPotsResultOutput {
	return o
}

func (o GetHoneyPotsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetHoneyPotsResult] {
	return pulumix.Output[GetHoneyPotsResult]{
		OutputState: o.OutputState,
	}
}

// Honeypot ID.
func (o GetHoneyPotsResultOutput) HoneypotId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHoneyPotsResult) *string { return v.HoneypotId }).(pulumi.StringPtrOutput)
}

// Honeypot custom name.
func (o GetHoneyPotsResultOutput) HoneypotName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHoneyPotsResult) *string { return v.HoneypotName }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetHoneyPotsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetHoneyPotsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of Honey Pot IDs.
func (o GetHoneyPotsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHoneyPotsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetHoneyPotsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHoneyPotsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// The ID of the honeypot management node.
func (o GetHoneyPotsResultOutput) NodeId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHoneyPotsResult) *string { return v.NodeId }).(pulumi.StringPtrOutput)
}

func (o GetHoneyPotsResultOutput) NodeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHoneyPotsResult) *string { return v.NodeName }).(pulumi.StringPtrOutput)
}

func (o GetHoneyPotsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHoneyPotsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of Honey Pot Entries. Each element contains the following attributes:
func (o GetHoneyPotsResultOutput) Pots() GetHoneyPotsPotArrayOutput {
	return o.ApplyT(func(v GetHoneyPotsResult) []GetHoneyPotsPot { return v.Pots }).(GetHoneyPotsPotArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetHoneyPotsResultOutput{})
}
