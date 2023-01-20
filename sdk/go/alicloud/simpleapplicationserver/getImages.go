// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package simpleapplicationserver

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetImages(ctx *pulumi.Context, args *GetImagesArgs, opts ...pulumi.InvokeOption) (*GetImagesResult, error) {
	var rv GetImagesResult
	err := ctx.Invoke("alicloud:simpleapplicationserver/getImages:getImages", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getImages.
type GetImagesArgs struct {
	Ids []string `pulumi:"ids"`
	// The type of the image. Valid values: `app`, `custom`, `system`.
	ImageType  *string `pulumi:"imageType"`
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// The platform of Plan supported.
	Platform *string `pulumi:"platform"`
}

// A collection of values returned by getImages.
type GetImagesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string           `pulumi:"id"`
	Ids        []string         `pulumi:"ids"`
	ImageType  *string          `pulumi:"imageType"`
	Images     []GetImagesImage `pulumi:"images"`
	NameRegex  *string          `pulumi:"nameRegex"`
	Names      []string         `pulumi:"names"`
	OutputFile *string          `pulumi:"outputFile"`
	Platform   *string          `pulumi:"platform"`
}

func GetImagesOutput(ctx *pulumi.Context, args GetImagesOutputArgs, opts ...pulumi.InvokeOption) GetImagesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetImagesResult, error) {
			args := v.(GetImagesArgs)
			r, err := GetImages(ctx, &args, opts...)
			var s GetImagesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetImagesResultOutput)
}

// A collection of arguments for invoking getImages.
type GetImagesOutputArgs struct {
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The type of the image. Valid values: `app`, `custom`, `system`.
	ImageType  pulumi.StringPtrInput `pulumi:"imageType"`
	NameRegex  pulumi.StringPtrInput `pulumi:"nameRegex"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The platform of Plan supported.
	Platform pulumi.StringPtrInput `pulumi:"platform"`
}

func (GetImagesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetImagesArgs)(nil)).Elem()
}

// A collection of values returned by getImages.
type GetImagesResultOutput struct{ *pulumi.OutputState }

func (GetImagesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetImagesResult)(nil)).Elem()
}

func (o GetImagesResultOutput) ToGetImagesResultOutput() GetImagesResultOutput {
	return o
}

func (o GetImagesResultOutput) ToGetImagesResultOutputWithContext(ctx context.Context) GetImagesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetImagesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetImagesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetImagesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetImagesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetImagesResultOutput) ImageType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetImagesResult) *string { return v.ImageType }).(pulumi.StringPtrOutput)
}

func (o GetImagesResultOutput) Images() GetImagesImageArrayOutput {
	return o.ApplyT(func(v GetImagesResult) []GetImagesImage { return v.Images }).(GetImagesImageArrayOutput)
}

func (o GetImagesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetImagesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetImagesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetImagesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetImagesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetImagesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetImagesResultOutput) Platform() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetImagesResult) *string { return v.Platform }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetImagesResultOutput{})
}
