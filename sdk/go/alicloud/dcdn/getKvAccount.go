// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dcdn

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides DCDN kv account available to the user.[What is DCDN Kv Account](https://www.alibabacloud.com/help/en/dcdn/developer-reference/api-dcdn-2018-01-15-describedcdnkvaccount)
//
// > **NOTE:** Available since v1.198.0.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dcdn"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dcdn.GetKvAccount(ctx, &dcdn.GetKvAccountArgs{
//				Status: pulumi.StringRef("online"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetKvAccount(ctx *pulumi.Context, args *GetKvAccountArgs, opts ...pulumi.InvokeOption) (*GetKvAccountResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetKvAccountResult
	err := ctx.Invoke("alicloud:dcdn/getKvAccount:getKvAccount", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKvAccount.
type GetKvAccountArgs struct {
	// The status of the KV feature for your account. Valid values: `online`, `offline`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getKvAccount.
type GetKvAccountResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The current kv account enable status.
	Status string `pulumi:"status"`
}

func GetKvAccountOutput(ctx *pulumi.Context, args GetKvAccountOutputArgs, opts ...pulumi.InvokeOption) GetKvAccountResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetKvAccountResult, error) {
			args := v.(GetKvAccountArgs)
			r, err := GetKvAccount(ctx, &args, opts...)
			var s GetKvAccountResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetKvAccountResultOutput)
}

// A collection of arguments for invoking getKvAccount.
type GetKvAccountOutputArgs struct {
	// The status of the KV feature for your account. Valid values: `online`, `offline`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetKvAccountOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKvAccountArgs)(nil)).Elem()
}

// A collection of values returned by getKvAccount.
type GetKvAccountResultOutput struct{ *pulumi.OutputState }

func (GetKvAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKvAccountResult)(nil)).Elem()
}

func (o GetKvAccountResultOutput) ToGetKvAccountResultOutput() GetKvAccountResultOutput {
	return o
}

func (o GetKvAccountResultOutput) ToGetKvAccountResultOutputWithContext(ctx context.Context) GetKvAccountResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetKvAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetKvAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

// The current kv account enable status.
func (o GetKvAccountResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetKvAccountResult) string { return v.Status }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetKvAccountResultOutput{})
}
