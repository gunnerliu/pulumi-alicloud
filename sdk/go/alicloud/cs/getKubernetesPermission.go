// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cs

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list of Ram user permissions.
//
// > **NOTE:** Available in v1.122.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cs"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ram"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "your_user_name"
// 		usersDs, err := ram.GetUsers(ctx, &ram.GetUsersArgs{
// 			NameRegex: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_default, err := cs.LookupKubernetesPermission(ctx, &cs.LookupKubernetesPermissionArgs{
// 			Uid: usersDs.Users[0].Id,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("permissions", _default.Permissions)
// 		return nil
// 	})
// }
// ```
func LookupKubernetesPermission(ctx *pulumi.Context, args *LookupKubernetesPermissionArgs, opts ...pulumi.InvokeOption) (*LookupKubernetesPermissionResult, error) {
	var rv LookupKubernetesPermissionResult
	err := ctx.Invoke("alicloud:cs/getKubernetesPermission:getKubernetesPermission", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKubernetesPermission.
type LookupKubernetesPermissionArgs struct {
	// A list of user permission.
	Permissions []GetKubernetesPermissionPermission `pulumi:"permissions"`
	// The ID of the RAM user. If you want to query the permissions of a RAM role, specify the ID of the RAM role.
	Uid string `pulumi:"uid"`
}

// A collection of values returned by getKubernetesPermission.
type LookupKubernetesPermissionResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of user permission.
	Permissions []GetKubernetesPermissionPermission `pulumi:"permissions"`
	// The ID of the RAM user. If you want to query the permissions of a RAM role, specify the ID of the RAM role.
	Uid string `pulumi:"uid"`
}
