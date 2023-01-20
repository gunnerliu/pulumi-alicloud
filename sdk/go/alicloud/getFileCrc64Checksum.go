// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package alicloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source compute file crc64 checksum.
//
// > **NOTE:** Available in 1.59.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := alicloud.GetFileCrc64Checksum(ctx, &alicloud.GetFileCrc64ChecksumArgs{
//				Filename: "exampleFileName",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("fileCrc64Checksum", data.Alicloud_file_crc64_checksum.Defualt.Checksum)
//			return nil
//		})
//	}
//
// ```
func GetFileCrc64Checksum(ctx *pulumi.Context, args *GetFileCrc64ChecksumArgs, opts ...pulumi.InvokeOption) (*GetFileCrc64ChecksumResult, error) {
	var rv GetFileCrc64ChecksumResult
	err := ctx.Invoke("alicloud:index/getFileCrc64Checksum:getFileCrc64Checksum", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFileCrc64Checksum.
type GetFileCrc64ChecksumArgs struct {
	// The name of the file to be computed crc64 checksum.
	Filename   string  `pulumi:"filename"`
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getFileCrc64Checksum.
type GetFileCrc64ChecksumResult struct {
	// the file checksum of crc64.
	Checksum string `pulumi:"checksum"`
	Filename string `pulumi:"filename"`
	// The provider-assigned unique ID for this managed resource.
	Id         string  `pulumi:"id"`
	OutputFile *string `pulumi:"outputFile"`
}

func GetFileCrc64ChecksumOutput(ctx *pulumi.Context, args GetFileCrc64ChecksumOutputArgs, opts ...pulumi.InvokeOption) GetFileCrc64ChecksumResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetFileCrc64ChecksumResult, error) {
			args := v.(GetFileCrc64ChecksumArgs)
			r, err := GetFileCrc64Checksum(ctx, &args, opts...)
			var s GetFileCrc64ChecksumResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetFileCrc64ChecksumResultOutput)
}

// A collection of arguments for invoking getFileCrc64Checksum.
type GetFileCrc64ChecksumOutputArgs struct {
	// The name of the file to be computed crc64 checksum.
	Filename   pulumi.StringInput    `pulumi:"filename"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetFileCrc64ChecksumOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFileCrc64ChecksumArgs)(nil)).Elem()
}

// A collection of values returned by getFileCrc64Checksum.
type GetFileCrc64ChecksumResultOutput struct{ *pulumi.OutputState }

func (GetFileCrc64ChecksumResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFileCrc64ChecksumResult)(nil)).Elem()
}

func (o GetFileCrc64ChecksumResultOutput) ToGetFileCrc64ChecksumResultOutput() GetFileCrc64ChecksumResultOutput {
	return o
}

func (o GetFileCrc64ChecksumResultOutput) ToGetFileCrc64ChecksumResultOutputWithContext(ctx context.Context) GetFileCrc64ChecksumResultOutput {
	return o
}

// the file checksum of crc64.
func (o GetFileCrc64ChecksumResultOutput) Checksum() pulumi.StringOutput {
	return o.ApplyT(func(v GetFileCrc64ChecksumResult) string { return v.Checksum }).(pulumi.StringOutput)
}

func (o GetFileCrc64ChecksumResultOutput) Filename() pulumi.StringOutput {
	return o.ApplyT(func(v GetFileCrc64ChecksumResult) string { return v.Filename }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetFileCrc64ChecksumResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFileCrc64ChecksumResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetFileCrc64ChecksumResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetFileCrc64ChecksumResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFileCrc64ChecksumResultOutput{})
}
