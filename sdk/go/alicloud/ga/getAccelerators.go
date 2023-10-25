// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ga

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Global Accelerator (GA) Accelerators of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.111.0+.
func GetAccelerators(ctx *pulumi.Context, args *GetAcceleratorsArgs, opts ...pulumi.InvokeOption) (*GetAcceleratorsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAcceleratorsResult
	err := ctx.Invoke("alicloud:ga/getAccelerators:getAccelerators", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccelerators.
type GetAcceleratorsArgs struct {
	// A list of Accelerator IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Accelerator name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the GA instance.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getAccelerators.
type GetAcceleratorsResult struct {
	Accelerators []GetAcceleratorsAccelerator `pulumi:"accelerators"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	Status     *string  `pulumi:"status"`
}

func GetAcceleratorsOutput(ctx *pulumi.Context, args GetAcceleratorsOutputArgs, opts ...pulumi.InvokeOption) GetAcceleratorsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAcceleratorsResult, error) {
			args := v.(GetAcceleratorsArgs)
			r, err := GetAccelerators(ctx, &args, opts...)
			var s GetAcceleratorsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAcceleratorsResultOutput)
}

// A collection of arguments for invoking getAccelerators.
type GetAcceleratorsOutputArgs struct {
	// A list of Accelerator IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Accelerator name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the GA instance.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetAcceleratorsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAcceleratorsArgs)(nil)).Elem()
}

// A collection of values returned by getAccelerators.
type GetAcceleratorsResultOutput struct{ *pulumi.OutputState }

func (GetAcceleratorsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAcceleratorsResult)(nil)).Elem()
}

func (o GetAcceleratorsResultOutput) ToGetAcceleratorsResultOutput() GetAcceleratorsResultOutput {
	return o
}

func (o GetAcceleratorsResultOutput) ToGetAcceleratorsResultOutputWithContext(ctx context.Context) GetAcceleratorsResultOutput {
	return o
}

func (o GetAcceleratorsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetAcceleratorsResult] {
	return pulumix.Output[GetAcceleratorsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetAcceleratorsResultOutput) Accelerators() GetAcceleratorsAcceleratorArrayOutput {
	return o.ApplyT(func(v GetAcceleratorsResult) []GetAcceleratorsAccelerator { return v.Accelerators }).(GetAcceleratorsAcceleratorArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAcceleratorsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAcceleratorsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAcceleratorsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAcceleratorsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetAcceleratorsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAcceleratorsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetAcceleratorsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAcceleratorsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetAcceleratorsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAcceleratorsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetAcceleratorsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAcceleratorsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAcceleratorsResultOutput{})
}
