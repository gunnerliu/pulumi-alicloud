// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package resourcemanager

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Resource Manager Resource Directories of the current Alibaba Cloud user.
//
// > **NOTE:**  Available in 1.86.0+.
//
// ## Example Usage
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
//			_default, err := resourcemanager.GetResourceDirectories(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("resourceDirectoryId", _default.Directories[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetResourceDirectories(ctx *pulumi.Context, args *GetResourceDirectoriesArgs, opts ...pulumi.InvokeOption) (*GetResourceDirectoriesResult, error) {
	var rv GetResourceDirectoriesResult
	err := ctx.Invoke("alicloud:resourcemanager/getResourceDirectories:getResourceDirectories", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getResourceDirectories.
type GetResourceDirectoriesArgs struct {
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getResourceDirectories.
type GetResourceDirectoriesResult struct {
	// A list of resource directories. Each element contains the following attributes:
	Directories []GetResourceDirectoriesDirectory `pulumi:"directories"`
	// The provider-assigned unique ID for this managed resource.
	Id         string  `pulumi:"id"`
	OutputFile *string `pulumi:"outputFile"`
}

func GetResourceDirectoriesOutput(ctx *pulumi.Context, args GetResourceDirectoriesOutputArgs, opts ...pulumi.InvokeOption) GetResourceDirectoriesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetResourceDirectoriesResult, error) {
			args := v.(GetResourceDirectoriesArgs)
			r, err := GetResourceDirectories(ctx, &args, opts...)
			var s GetResourceDirectoriesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetResourceDirectoriesResultOutput)
}

// A collection of arguments for invoking getResourceDirectories.
type GetResourceDirectoriesOutputArgs struct {
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetResourceDirectoriesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetResourceDirectoriesArgs)(nil)).Elem()
}

// A collection of values returned by getResourceDirectories.
type GetResourceDirectoriesResultOutput struct{ *pulumi.OutputState }

func (GetResourceDirectoriesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetResourceDirectoriesResult)(nil)).Elem()
}

func (o GetResourceDirectoriesResultOutput) ToGetResourceDirectoriesResultOutput() GetResourceDirectoriesResultOutput {
	return o
}

func (o GetResourceDirectoriesResultOutput) ToGetResourceDirectoriesResultOutputWithContext(ctx context.Context) GetResourceDirectoriesResultOutput {
	return o
}

// A list of resource directories. Each element contains the following attributes:
func (o GetResourceDirectoriesResultOutput) Directories() GetResourceDirectoriesDirectoryArrayOutput {
	return o.ApplyT(func(v GetResourceDirectoriesResult) []GetResourceDirectoriesDirectory { return v.Directories }).(GetResourceDirectoriesDirectoryArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetResourceDirectoriesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetResourceDirectoriesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetResourceDirectoriesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetResourceDirectoriesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetResourceDirectoriesResultOutput{})
}
