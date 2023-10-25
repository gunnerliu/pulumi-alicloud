// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eipanycast

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Eipanycast Anycast Eip Addresses of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.113.0+.
func GetAnycastEipAddresses(ctx *pulumi.Context, args *GetAnycastEipAddressesArgs, opts ...pulumi.InvokeOption) (*GetAnycastEipAddressesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAnycastEipAddressesResult
	err := ctx.Invoke("alicloud:eipanycast/getAnycastEipAddresses:getAnycastEipAddresses", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAnycastEipAddresses.
type GetAnycastEipAddressesArgs struct {
	// Anycast EIP instance name.
	AnycastEipAddressName *string `pulumi:"anycastEipAddressName"`
	// The bind instance ids.
	BindInstanceIds []string `pulumi:"bindInstanceIds"`
	// The business status of the Anycast EIP instance. -`Normal`: Normal state. -`FinancialLocked`: The status of arrears locked.
	BusinessStatus *string `pulumi:"businessStatus"`
	// A list of Anycast Eip Address IDs.
	Ids []string `pulumi:"ids"`
	// The billing method of Anycast EIP instance. `PayByBandwidth`: refers to the method of billing based on traffic.
	InternetChargeType *string `pulumi:"internetChargeType"`
	// Anycast EIP instance IP address.
	IpAddress *string `pulumi:"ipAddress"`
	// A regex string to filter results by Anycast Eip Address name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The payment model of Anycast EIP instance. "PostPaid": Refers to the post-paid mode.
	PaymentType *string `pulumi:"paymentType"`
	// Anycast EIP instance access area. "international": Refers to areas outside of Mainland China.
	ServiceLocation *string `pulumi:"serviceLocation"`
	// IP status。- `Associating`, `Unassociating`, `Allocated`, `Associated`, `Modifying`, `Releasing`, `Released`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getAnycastEipAddresses.
type GetAnycastEipAddressesResult struct {
	Addresses             []GetAnycastEipAddressesAddress `pulumi:"addresses"`
	AnycastEipAddressName *string                         `pulumi:"anycastEipAddressName"`
	BindInstanceIds       []string                        `pulumi:"bindInstanceIds"`
	BusinessStatus        *string                         `pulumi:"businessStatus"`
	// The provider-assigned unique ID for this managed resource.
	Id                 string   `pulumi:"id"`
	Ids                []string `pulumi:"ids"`
	InternetChargeType *string  `pulumi:"internetChargeType"`
	IpAddress          *string  `pulumi:"ipAddress"`
	NameRegex          *string  `pulumi:"nameRegex"`
	Names              []string `pulumi:"names"`
	OutputFile         *string  `pulumi:"outputFile"`
	PaymentType        *string  `pulumi:"paymentType"`
	ServiceLocation    *string  `pulumi:"serviceLocation"`
	Status             *string  `pulumi:"status"`
}

func GetAnycastEipAddressesOutput(ctx *pulumi.Context, args GetAnycastEipAddressesOutputArgs, opts ...pulumi.InvokeOption) GetAnycastEipAddressesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAnycastEipAddressesResult, error) {
			args := v.(GetAnycastEipAddressesArgs)
			r, err := GetAnycastEipAddresses(ctx, &args, opts...)
			var s GetAnycastEipAddressesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAnycastEipAddressesResultOutput)
}

// A collection of arguments for invoking getAnycastEipAddresses.
type GetAnycastEipAddressesOutputArgs struct {
	// Anycast EIP instance name.
	AnycastEipAddressName pulumi.StringPtrInput `pulumi:"anycastEipAddressName"`
	// The bind instance ids.
	BindInstanceIds pulumi.StringArrayInput `pulumi:"bindInstanceIds"`
	// The business status of the Anycast EIP instance. -`Normal`: Normal state. -`FinancialLocked`: The status of arrears locked.
	BusinessStatus pulumi.StringPtrInput `pulumi:"businessStatus"`
	// A list of Anycast Eip Address IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The billing method of Anycast EIP instance. `PayByBandwidth`: refers to the method of billing based on traffic.
	InternetChargeType pulumi.StringPtrInput `pulumi:"internetChargeType"`
	// Anycast EIP instance IP address.
	IpAddress pulumi.StringPtrInput `pulumi:"ipAddress"`
	// A regex string to filter results by Anycast Eip Address name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The payment model of Anycast EIP instance. "PostPaid": Refers to the post-paid mode.
	PaymentType pulumi.StringPtrInput `pulumi:"paymentType"`
	// Anycast EIP instance access area. "international": Refers to areas outside of Mainland China.
	ServiceLocation pulumi.StringPtrInput `pulumi:"serviceLocation"`
	// IP status。- `Associating`, `Unassociating`, `Allocated`, `Associated`, `Modifying`, `Releasing`, `Released`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetAnycastEipAddressesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAnycastEipAddressesArgs)(nil)).Elem()
}

// A collection of values returned by getAnycastEipAddresses.
type GetAnycastEipAddressesResultOutput struct{ *pulumi.OutputState }

func (GetAnycastEipAddressesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAnycastEipAddressesResult)(nil)).Elem()
}

func (o GetAnycastEipAddressesResultOutput) ToGetAnycastEipAddressesResultOutput() GetAnycastEipAddressesResultOutput {
	return o
}

func (o GetAnycastEipAddressesResultOutput) ToGetAnycastEipAddressesResultOutputWithContext(ctx context.Context) GetAnycastEipAddressesResultOutput {
	return o
}

func (o GetAnycastEipAddressesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetAnycastEipAddressesResult] {
	return pulumix.Output[GetAnycastEipAddressesResult]{
		OutputState: o.OutputState,
	}
}

func (o GetAnycastEipAddressesResultOutput) Addresses() GetAnycastEipAddressesAddressArrayOutput {
	return o.ApplyT(func(v GetAnycastEipAddressesResult) []GetAnycastEipAddressesAddress { return v.Addresses }).(GetAnycastEipAddressesAddressArrayOutput)
}

func (o GetAnycastEipAddressesResultOutput) AnycastEipAddressName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAnycastEipAddressesResult) *string { return v.AnycastEipAddressName }).(pulumi.StringPtrOutput)
}

func (o GetAnycastEipAddressesResultOutput) BindInstanceIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAnycastEipAddressesResult) []string { return v.BindInstanceIds }).(pulumi.StringArrayOutput)
}

func (o GetAnycastEipAddressesResultOutput) BusinessStatus() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAnycastEipAddressesResult) *string { return v.BusinessStatus }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAnycastEipAddressesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAnycastEipAddressesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAnycastEipAddressesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAnycastEipAddressesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetAnycastEipAddressesResultOutput) InternetChargeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAnycastEipAddressesResult) *string { return v.InternetChargeType }).(pulumi.StringPtrOutput)
}

func (o GetAnycastEipAddressesResultOutput) IpAddress() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAnycastEipAddressesResult) *string { return v.IpAddress }).(pulumi.StringPtrOutput)
}

func (o GetAnycastEipAddressesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAnycastEipAddressesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetAnycastEipAddressesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAnycastEipAddressesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetAnycastEipAddressesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAnycastEipAddressesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetAnycastEipAddressesResultOutput) PaymentType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAnycastEipAddressesResult) *string { return v.PaymentType }).(pulumi.StringPtrOutput)
}

func (o GetAnycastEipAddressesResultOutput) ServiceLocation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAnycastEipAddressesResult) *string { return v.ServiceLocation }).(pulumi.StringPtrOutput)
}

func (o GetAnycastEipAddressesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAnycastEipAddressesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAnycastEipAddressesResultOutput{})
}
