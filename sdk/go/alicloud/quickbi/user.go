// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package quickbi

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Quick BI User resource.
//
// For information about Quick BI User and how to use it, see [What is User](https://www.alibabacloud.com/help/doc-detail/33813.htm).
//
// > **NOTE:** Available in v1.136.0+.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/quickbi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := quickbi.NewUser(ctx, "example", &quickbi.UserArgs{
//				AccountName:   pulumi.String("example_value"),
//				AdminUser:     pulumi.Bool(false),
//				AuthAdminUser: pulumi.Bool(false),
//				NickName:      pulumi.String("example_value"),
//				UserType:      pulumi.String("Analyst"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Quick BI User can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:quickbi/user:User example <id>
//
// ```
type User struct {
	pulumi.CustomResourceState

	// Alibaba Cloud account ID.
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// An Alibaba Cloud account, Alibaba Cloud name.
	AccountName pulumi.StringOutput `pulumi:"accountName"`
	// Whether it is the administrator. Valid values: `true` and `false`.
	AdminUser pulumi.BoolOutput `pulumi:"adminUser"`
	// Whether this is a permissions administrator. Valid values: `false`, `true`.
	AuthAdminUser pulumi.BoolOutput `pulumi:"authAdminUser"`
	// The nickname of the user.
	NickName pulumi.StringOutput `pulumi:"nickName"`
	// The members of the organization of the type of role separately. Valid values: `Analyst`, `Developer` and `Visitor`.
	UserType pulumi.StringOutput `pulumi:"userType"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountName == nil {
		return nil, errors.New("invalid value for required argument 'AccountName'")
	}
	if args.AdminUser == nil {
		return nil, errors.New("invalid value for required argument 'AdminUser'")
	}
	if args.AuthAdminUser == nil {
		return nil, errors.New("invalid value for required argument 'AuthAdminUser'")
	}
	if args.NickName == nil {
		return nil, errors.New("invalid value for required argument 'NickName'")
	}
	if args.UserType == nil {
		return nil, errors.New("invalid value for required argument 'UserType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource User
	err := ctx.RegisterResource("alicloud:quickbi/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("alicloud:quickbi/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	// Alibaba Cloud account ID.
	AccountId *string `pulumi:"accountId"`
	// An Alibaba Cloud account, Alibaba Cloud name.
	AccountName *string `pulumi:"accountName"`
	// Whether it is the administrator. Valid values: `true` and `false`.
	AdminUser *bool `pulumi:"adminUser"`
	// Whether this is a permissions administrator. Valid values: `false`, `true`.
	AuthAdminUser *bool `pulumi:"authAdminUser"`
	// The nickname of the user.
	NickName *string `pulumi:"nickName"`
	// The members of the organization of the type of role separately. Valid values: `Analyst`, `Developer` and `Visitor`.
	UserType *string `pulumi:"userType"`
}

type UserState struct {
	// Alibaba Cloud account ID.
	AccountId pulumi.StringPtrInput
	// An Alibaba Cloud account, Alibaba Cloud name.
	AccountName pulumi.StringPtrInput
	// Whether it is the administrator. Valid values: `true` and `false`.
	AdminUser pulumi.BoolPtrInput
	// Whether this is a permissions administrator. Valid values: `false`, `true`.
	AuthAdminUser pulumi.BoolPtrInput
	// The nickname of the user.
	NickName pulumi.StringPtrInput
	// The members of the organization of the type of role separately. Valid values: `Analyst`, `Developer` and `Visitor`.
	UserType pulumi.StringPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	// Alibaba Cloud account ID.
	AccountId *string `pulumi:"accountId"`
	// An Alibaba Cloud account, Alibaba Cloud name.
	AccountName string `pulumi:"accountName"`
	// Whether it is the administrator. Valid values: `true` and `false`.
	AdminUser bool `pulumi:"adminUser"`
	// Whether this is a permissions administrator. Valid values: `false`, `true`.
	AuthAdminUser bool `pulumi:"authAdminUser"`
	// The nickname of the user.
	NickName string `pulumi:"nickName"`
	// The members of the organization of the type of role separately. Valid values: `Analyst`, `Developer` and `Visitor`.
	UserType string `pulumi:"userType"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	// Alibaba Cloud account ID.
	AccountId pulumi.StringPtrInput
	// An Alibaba Cloud account, Alibaba Cloud name.
	AccountName pulumi.StringInput
	// Whether it is the administrator. Valid values: `true` and `false`.
	AdminUser pulumi.BoolInput
	// Whether this is a permissions administrator. Valid values: `false`, `true`.
	AuthAdminUser pulumi.BoolInput
	// The nickname of the user.
	NickName pulumi.StringInput
	// The members of the organization of the type of role separately. Valid values: `Analyst`, `Developer` and `Visitor`.
	UserType pulumi.StringInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

// UserArrayInput is an input type that accepts UserArray and UserArrayOutput values.
// You can construct a concrete instance of `UserArrayInput` via:
//
//	UserArray{ UserArgs{...} }
type UserArrayInput interface {
	pulumi.Input

	ToUserArrayOutput() UserArrayOutput
	ToUserArrayOutputWithContext(context.Context) UserArrayOutput
}

type UserArray []UserInput

func (UserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (i UserArray) ToUserArrayOutput() UserArrayOutput {
	return i.ToUserArrayOutputWithContext(context.Background())
}

func (i UserArray) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserArrayOutput)
}

// UserMapInput is an input type that accepts UserMap and UserMapOutput values.
// You can construct a concrete instance of `UserMapInput` via:
//
//	UserMap{ "key": UserArgs{...} }
type UserMapInput interface {
	pulumi.Input

	ToUserMapOutput() UserMapOutput
	ToUserMapOutputWithContext(context.Context) UserMapOutput
}

type UserMap map[string]UserInput

func (UserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (i UserMap) ToUserMapOutput() UserMapOutput {
	return i.ToUserMapOutputWithContext(context.Background())
}

func (i UserMap) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMapOutput)
}

type UserOutput struct{ *pulumi.OutputState }

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

// Alibaba Cloud account ID.
func (o UserOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// An Alibaba Cloud account, Alibaba Cloud name.
func (o UserOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.AccountName }).(pulumi.StringOutput)
}

// Whether it is the administrator. Valid values: `true` and `false`.
func (o UserOutput) AdminUser() pulumi.BoolOutput {
	return o.ApplyT(func(v *User) pulumi.BoolOutput { return v.AdminUser }).(pulumi.BoolOutput)
}

// Whether this is a permissions administrator. Valid values: `false`, `true`.
func (o UserOutput) AuthAdminUser() pulumi.BoolOutput {
	return o.ApplyT(func(v *User) pulumi.BoolOutput { return v.AuthAdminUser }).(pulumi.BoolOutput)
}

// The nickname of the user.
func (o UserOutput) NickName() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.NickName }).(pulumi.StringOutput)
}

// The members of the organization of the type of role separately. Valid values: `Analyst`, `Developer` and `Visitor`.
func (o UserOutput) UserType() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.UserType }).(pulumi.StringOutput)
}

type UserArrayOutput struct{ *pulumi.OutputState }

func (UserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (o UserArrayOutput) ToUserArrayOutput() UserArrayOutput {
	return o
}

func (o UserArrayOutput) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return o
}

func (o UserArrayOutput) Index(i pulumi.IntInput) UserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *User {
		return vs[0].([]*User)[vs[1].(int)]
	}).(UserOutput)
}

type UserMapOutput struct{ *pulumi.OutputState }

func (UserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (o UserMapOutput) ToUserMapOutput() UserMapOutput {
	return o
}

func (o UserMapOutput) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return o
}

func (o UserMapOutput) MapIndex(k pulumi.StringInput) UserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *User {
		return vs[0].(map[string]*User)[vs[1].(string)]
	}).(UserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInput)(nil)).Elem(), &User{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserArrayInput)(nil)).Elem(), UserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMapInput)(nil)).Elem(), UserMap{})
	pulumi.RegisterOutputType(UserOutput{})
	pulumi.RegisterOutputType(UserArrayOutput{})
	pulumi.RegisterOutputType(UserMapOutput{})
}
