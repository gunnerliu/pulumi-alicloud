// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kvstore

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Assigns a RAM role to ApsaraDB for Redis.
//
// The log management feature of ApsaraDB for Redis requires the resources of [Log Service](https://www.alibabacloud.com/help/doc-detail/48869.htm).
// To use the log management feature of ApsaraDB for Redis, you can call this operation to associate the RAM role named AliyunServiceRoleForKvstore with the ApsaraDB for Redis instance.
// For more information, see [Associated RAM roles of ApsaraDB for Redis](https://www.alibabacloud.com/help/doc-detail/184337.htm)
//
// > **NOTE:** Available since v1.128.0
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/kvstore"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := kvstore.GetPermission(ctx, &kvstore.GetPermissionArgs{
//				Enable: pulumi.StringRef("On"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetPermission(ctx *pulumi.Context, args *GetPermissionArgs, opts ...pulumi.InvokeOption) (*GetPermissionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPermissionResult
	err := ctx.Invoke("alicloud:kvstore/getPermission:getPermission", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPermission.
type GetPermissionArgs struct {
	// Setting the value to `On` to assigns a RAM role to ApsaraDB for Redis. If has been enabled, return the result. Valid values: "On" or "Off". Default to "Off".
	Enable *string `pulumi:"enable"`
}

// A collection of values returned by getPermission.
type GetPermissionResult struct {
	Enable *string `pulumi:"enable"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The current service enable status.
	Status string `pulumi:"status"`
}

func GetPermissionOutput(ctx *pulumi.Context, args GetPermissionOutputArgs, opts ...pulumi.InvokeOption) GetPermissionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPermissionResult, error) {
			args := v.(GetPermissionArgs)
			r, err := GetPermission(ctx, &args, opts...)
			var s GetPermissionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPermissionResultOutput)
}

// A collection of arguments for invoking getPermission.
type GetPermissionOutputArgs struct {
	// Setting the value to `On` to assigns a RAM role to ApsaraDB for Redis. If has been enabled, return the result. Valid values: "On" or "Off". Default to "Off".
	Enable pulumi.StringPtrInput `pulumi:"enable"`
}

func (GetPermissionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPermissionArgs)(nil)).Elem()
}

// A collection of values returned by getPermission.
type GetPermissionResultOutput struct{ *pulumi.OutputState }

func (GetPermissionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPermissionResult)(nil)).Elem()
}

func (o GetPermissionResultOutput) ToGetPermissionResultOutput() GetPermissionResultOutput {
	return o
}

func (o GetPermissionResultOutput) ToGetPermissionResultOutputWithContext(ctx context.Context) GetPermissionResultOutput {
	return o
}

func (o GetPermissionResultOutput) Enable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPermissionResult) *string { return v.Enable }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPermissionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPermissionResult) string { return v.Id }).(pulumi.StringOutput)
}

// The current service enable status.
func (o GetPermissionResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetPermissionResult) string { return v.Status }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPermissionResultOutput{})
}
