// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ram

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a RAM Group membership resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/ram"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		group, err := ram.NewGroup(ctx, "group", &ram.GroupArgs{
// 			Comments: pulumi.String("this is a group comments."),
// 			Force:    pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		user, err := ram.NewUser(ctx, "user", &ram.UserArgs{
// 			Comments:    pulumi.String("yoyoyo"),
// 			DisplayName: pulumi.String("user_display_name"),
// 			Email:       pulumi.String("hello.uuu@aaa.com"),
// 			Force:       pulumi.Bool(true),
// 			Mobile:      pulumi.String("86-18688888888"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		user1, err := ram.NewUser(ctx, "user1", &ram.UserArgs{
// 			Comments:    pulumi.String("yoyoyo"),
// 			DisplayName: pulumi.String("user_display_name1"),
// 			Email:       pulumi.String("hello.uuu@aaa.com"),
// 			Force:       pulumi.Bool(true),
// 			Mobile:      pulumi.String("86-18688888889"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ram.NewGroupMembership(ctx, "membership", &ram.GroupMembershipArgs{
// 			GroupName: group.Name,
// 			UserNames: pulumi.StringArray{
// 				user.Name,
// 				user1.Name,
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type GroupMembership struct {
	pulumi.CustomResourceState

	// Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	GroupName pulumi.StringOutput `pulumi:"groupName"`
	// Set of user name which will be added to group. Each name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
	UserNames pulumi.StringArrayOutput `pulumi:"userNames"`
}

// NewGroupMembership registers a new resource with the given unique name, arguments, and options.
func NewGroupMembership(ctx *pulumi.Context,
	name string, args *GroupMembershipArgs, opts ...pulumi.ResourceOption) (*GroupMembership, error) {
	if args == nil || args.GroupName == nil {
		return nil, errors.New("missing required argument 'GroupName'")
	}
	if args == nil || args.UserNames == nil {
		return nil, errors.New("missing required argument 'UserNames'")
	}
	if args == nil {
		args = &GroupMembershipArgs{}
	}
	var resource GroupMembership
	err := ctx.RegisterResource("alicloud:ram/groupMembership:GroupMembership", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGroupMembership gets an existing GroupMembership resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGroupMembership(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GroupMembershipState, opts ...pulumi.ResourceOption) (*GroupMembership, error) {
	var resource GroupMembership
	err := ctx.ReadResource("alicloud:ram/groupMembership:GroupMembership", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GroupMembership resources.
type groupMembershipState struct {
	// Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	GroupName *string `pulumi:"groupName"`
	// Set of user name which will be added to group. Each name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
	UserNames []string `pulumi:"userNames"`
}

type GroupMembershipState struct {
	// Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	GroupName pulumi.StringPtrInput
	// Set of user name which will be added to group. Each name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
	UserNames pulumi.StringArrayInput
}

func (GroupMembershipState) ElementType() reflect.Type {
	return reflect.TypeOf((*groupMembershipState)(nil)).Elem()
}

type groupMembershipArgs struct {
	// Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	GroupName string `pulumi:"groupName"`
	// Set of user name which will be added to group. Each name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
	UserNames []string `pulumi:"userNames"`
}

// The set of arguments for constructing a GroupMembership resource.
type GroupMembershipArgs struct {
	// Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
	GroupName pulumi.StringInput
	// Set of user name which will be added to group. Each name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
	UserNames pulumi.StringArrayInput
}

func (GroupMembershipArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*groupMembershipArgs)(nil)).Elem()
}
