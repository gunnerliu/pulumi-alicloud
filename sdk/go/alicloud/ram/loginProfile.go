// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ram

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a RAM User Login Profile resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ram"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		user, err := ram.NewUser(ctx, "user", &ram.UserArgs{
// 			DisplayName: pulumi.String("user_display_name"),
// 			Mobile:      pulumi.String("86-18688888888"),
// 			Email:       pulumi.String("hello.uuu@aaa.com"),
// 			Comments:    pulumi.String("yoyoyo"),
// 			Force:       pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ram.NewLoginProfile(ctx, "profile", &ram.LoginProfileArgs{
// 			UserName: user.Name,
// 			Password: pulumi.String("Yourpassword1234"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// RAM login profile can be imported using the id or user name, e.g.
//
// ```sh
//  $ pulumi import alicloud:ram/loginProfile:LoginProfile example my-login
// ```
type LoginProfile struct {
	pulumi.CustomResourceState

	// This parameter indicates whether the MFA needs to be bind when the user first logs in. Default value is `false`.
	MfaBindRequired pulumi.BoolPtrOutput `pulumi:"mfaBindRequired"`
	// Password of the RAM user.
	Password pulumi.StringOutput `pulumi:"password"`
	// This parameter indicates whether the password needs to be reset when the user first logs in. Default value is `false`.
	PasswordResetRequired pulumi.BoolPtrOutput `pulumi:"passwordResetRequired"`
	// Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
	UserName pulumi.StringOutput `pulumi:"userName"`
}

// NewLoginProfile registers a new resource with the given unique name, arguments, and options.
func NewLoginProfile(ctx *pulumi.Context,
	name string, args *LoginProfileArgs, opts ...pulumi.ResourceOption) (*LoginProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Password == nil {
		return nil, errors.New("invalid value for required argument 'Password'")
	}
	if args.UserName == nil {
		return nil, errors.New("invalid value for required argument 'UserName'")
	}
	var resource LoginProfile
	err := ctx.RegisterResource("alicloud:ram/loginProfile:LoginProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoginProfile gets an existing LoginProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoginProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoginProfileState, opts ...pulumi.ResourceOption) (*LoginProfile, error) {
	var resource LoginProfile
	err := ctx.ReadResource("alicloud:ram/loginProfile:LoginProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoginProfile resources.
type loginProfileState struct {
	// This parameter indicates whether the MFA needs to be bind when the user first logs in. Default value is `false`.
	MfaBindRequired *bool `pulumi:"mfaBindRequired"`
	// Password of the RAM user.
	Password *string `pulumi:"password"`
	// This parameter indicates whether the password needs to be reset when the user first logs in. Default value is `false`.
	PasswordResetRequired *bool `pulumi:"passwordResetRequired"`
	// Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
	UserName *string `pulumi:"userName"`
}

type LoginProfileState struct {
	// This parameter indicates whether the MFA needs to be bind when the user first logs in. Default value is `false`.
	MfaBindRequired pulumi.BoolPtrInput
	// Password of the RAM user.
	Password pulumi.StringPtrInput
	// This parameter indicates whether the password needs to be reset when the user first logs in. Default value is `false`.
	PasswordResetRequired pulumi.BoolPtrInput
	// Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
	UserName pulumi.StringPtrInput
}

func (LoginProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*loginProfileState)(nil)).Elem()
}

type loginProfileArgs struct {
	// This parameter indicates whether the MFA needs to be bind when the user first logs in. Default value is `false`.
	MfaBindRequired *bool `pulumi:"mfaBindRequired"`
	// Password of the RAM user.
	Password string `pulumi:"password"`
	// This parameter indicates whether the password needs to be reset when the user first logs in. Default value is `false`.
	PasswordResetRequired *bool `pulumi:"passwordResetRequired"`
	// Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
	UserName string `pulumi:"userName"`
}

// The set of arguments for constructing a LoginProfile resource.
type LoginProfileArgs struct {
	// This parameter indicates whether the MFA needs to be bind when the user first logs in. Default value is `false`.
	MfaBindRequired pulumi.BoolPtrInput
	// Password of the RAM user.
	Password pulumi.StringInput
	// This parameter indicates whether the password needs to be reset when the user first logs in. Default value is `false`.
	PasswordResetRequired pulumi.BoolPtrInput
	// Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
	UserName pulumi.StringInput
}

func (LoginProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loginProfileArgs)(nil)).Elem()
}

type LoginProfileInput interface {
	pulumi.Input

	ToLoginProfileOutput() LoginProfileOutput
	ToLoginProfileOutputWithContext(ctx context.Context) LoginProfileOutput
}

func (*LoginProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**LoginProfile)(nil)).Elem()
}

func (i *LoginProfile) ToLoginProfileOutput() LoginProfileOutput {
	return i.ToLoginProfileOutputWithContext(context.Background())
}

func (i *LoginProfile) ToLoginProfileOutputWithContext(ctx context.Context) LoginProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoginProfileOutput)
}

// LoginProfileArrayInput is an input type that accepts LoginProfileArray and LoginProfileArrayOutput values.
// You can construct a concrete instance of `LoginProfileArrayInput` via:
//
//          LoginProfileArray{ LoginProfileArgs{...} }
type LoginProfileArrayInput interface {
	pulumi.Input

	ToLoginProfileArrayOutput() LoginProfileArrayOutput
	ToLoginProfileArrayOutputWithContext(context.Context) LoginProfileArrayOutput
}

type LoginProfileArray []LoginProfileInput

func (LoginProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoginProfile)(nil)).Elem()
}

func (i LoginProfileArray) ToLoginProfileArrayOutput() LoginProfileArrayOutput {
	return i.ToLoginProfileArrayOutputWithContext(context.Background())
}

func (i LoginProfileArray) ToLoginProfileArrayOutputWithContext(ctx context.Context) LoginProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoginProfileArrayOutput)
}

// LoginProfileMapInput is an input type that accepts LoginProfileMap and LoginProfileMapOutput values.
// You can construct a concrete instance of `LoginProfileMapInput` via:
//
//          LoginProfileMap{ "key": LoginProfileArgs{...} }
type LoginProfileMapInput interface {
	pulumi.Input

	ToLoginProfileMapOutput() LoginProfileMapOutput
	ToLoginProfileMapOutputWithContext(context.Context) LoginProfileMapOutput
}

type LoginProfileMap map[string]LoginProfileInput

func (LoginProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoginProfile)(nil)).Elem()
}

func (i LoginProfileMap) ToLoginProfileMapOutput() LoginProfileMapOutput {
	return i.ToLoginProfileMapOutputWithContext(context.Background())
}

func (i LoginProfileMap) ToLoginProfileMapOutputWithContext(ctx context.Context) LoginProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoginProfileMapOutput)
}

type LoginProfileOutput struct{ *pulumi.OutputState }

func (LoginProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoginProfile)(nil)).Elem()
}

func (o LoginProfileOutput) ToLoginProfileOutput() LoginProfileOutput {
	return o
}

func (o LoginProfileOutput) ToLoginProfileOutputWithContext(ctx context.Context) LoginProfileOutput {
	return o
}

type LoginProfileArrayOutput struct{ *pulumi.OutputState }

func (LoginProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoginProfile)(nil)).Elem()
}

func (o LoginProfileArrayOutput) ToLoginProfileArrayOutput() LoginProfileArrayOutput {
	return o
}

func (o LoginProfileArrayOutput) ToLoginProfileArrayOutputWithContext(ctx context.Context) LoginProfileArrayOutput {
	return o
}

func (o LoginProfileArrayOutput) Index(i pulumi.IntInput) LoginProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoginProfile {
		return vs[0].([]*LoginProfile)[vs[1].(int)]
	}).(LoginProfileOutput)
}

type LoginProfileMapOutput struct{ *pulumi.OutputState }

func (LoginProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoginProfile)(nil)).Elem()
}

func (o LoginProfileMapOutput) ToLoginProfileMapOutput() LoginProfileMapOutput {
	return o
}

func (o LoginProfileMapOutput) ToLoginProfileMapOutputWithContext(ctx context.Context) LoginProfileMapOutput {
	return o
}

func (o LoginProfileMapOutput) MapIndex(k pulumi.StringInput) LoginProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoginProfile {
		return vs[0].(map[string]*LoginProfile)[vs[1].(string)]
	}).(LoginProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoginProfileInput)(nil)).Elem(), &LoginProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoginProfileArrayInput)(nil)).Elem(), LoginProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoginProfileMapInput)(nil)).Elem(), LoginProfileMap{})
	pulumi.RegisterOutputType(LoginProfileOutput{})
	pulumi.RegisterOutputType(LoginProfileArrayOutput{})
	pulumi.RegisterOutputType(LoginProfileMapOutput{})
}
