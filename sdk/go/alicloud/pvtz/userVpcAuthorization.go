// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pvtz

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Private Zone User Vpc Authorization resource.
//
// > **NOTE:** Available since v1.138.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/pvtz"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			authorizedUserId := float64(123456789)
//			if param := cfg.GetFloat64("authorizedUserId"); param != 0 {
//				authorizedUserId = param
//			}
//			_, err := pvtz.NewUserVpcAuthorization(ctx, "example", &pvtz.UserVpcAuthorizationArgs{
//				AuthorizedUserId: pulumi.Float64(authorizedUserId),
//				AuthChannel:      pulumi.String("RESOURCE_DIRECTORY"),
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
// Private Zone User Vpc Authorization can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:pvtz/userVpcAuthorization:UserVpcAuthorization example <authorized_user_id>:<auth_type>
//
// ```
type UserVpcAuthorization struct {
	pulumi.CustomResourceState

	// The auth channel. Valid values: `RESOURCE_DIRECTORY`.
	AuthChannel pulumi.StringPtrOutput `pulumi:"authChannel"`
	// The type of Authorization. Valid values: `NORMAL` and `CLOUD_PRODUCT`.
	AuthType pulumi.StringPtrOutput `pulumi:"authType"`
	// The primary account ID of the user who authorizes the resource.
	AuthorizedUserId pulumi.StringOutput `pulumi:"authorizedUserId"`
}

// NewUserVpcAuthorization registers a new resource with the given unique name, arguments, and options.
func NewUserVpcAuthorization(ctx *pulumi.Context,
	name string, args *UserVpcAuthorizationArgs, opts ...pulumi.ResourceOption) (*UserVpcAuthorization, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AuthorizedUserId == nil {
		return nil, errors.New("invalid value for required argument 'AuthorizedUserId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UserVpcAuthorization
	err := ctx.RegisterResource("alicloud:pvtz/userVpcAuthorization:UserVpcAuthorization", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserVpcAuthorization gets an existing UserVpcAuthorization resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserVpcAuthorization(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserVpcAuthorizationState, opts ...pulumi.ResourceOption) (*UserVpcAuthorization, error) {
	var resource UserVpcAuthorization
	err := ctx.ReadResource("alicloud:pvtz/userVpcAuthorization:UserVpcAuthorization", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserVpcAuthorization resources.
type userVpcAuthorizationState struct {
	// The auth channel. Valid values: `RESOURCE_DIRECTORY`.
	AuthChannel *string `pulumi:"authChannel"`
	// The type of Authorization. Valid values: `NORMAL` and `CLOUD_PRODUCT`.
	AuthType *string `pulumi:"authType"`
	// The primary account ID of the user who authorizes the resource.
	AuthorizedUserId *string `pulumi:"authorizedUserId"`
}

type UserVpcAuthorizationState struct {
	// The auth channel. Valid values: `RESOURCE_DIRECTORY`.
	AuthChannel pulumi.StringPtrInput
	// The type of Authorization. Valid values: `NORMAL` and `CLOUD_PRODUCT`.
	AuthType pulumi.StringPtrInput
	// The primary account ID of the user who authorizes the resource.
	AuthorizedUserId pulumi.StringPtrInput
}

func (UserVpcAuthorizationState) ElementType() reflect.Type {
	return reflect.TypeOf((*userVpcAuthorizationState)(nil)).Elem()
}

type userVpcAuthorizationArgs struct {
	// The auth channel. Valid values: `RESOURCE_DIRECTORY`.
	AuthChannel *string `pulumi:"authChannel"`
	// The type of Authorization. Valid values: `NORMAL` and `CLOUD_PRODUCT`.
	AuthType *string `pulumi:"authType"`
	// The primary account ID of the user who authorizes the resource.
	AuthorizedUserId string `pulumi:"authorizedUserId"`
}

// The set of arguments for constructing a UserVpcAuthorization resource.
type UserVpcAuthorizationArgs struct {
	// The auth channel. Valid values: `RESOURCE_DIRECTORY`.
	AuthChannel pulumi.StringPtrInput
	// The type of Authorization. Valid values: `NORMAL` and `CLOUD_PRODUCT`.
	AuthType pulumi.StringPtrInput
	// The primary account ID of the user who authorizes the resource.
	AuthorizedUserId pulumi.StringInput
}

func (UserVpcAuthorizationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userVpcAuthorizationArgs)(nil)).Elem()
}

type UserVpcAuthorizationInput interface {
	pulumi.Input

	ToUserVpcAuthorizationOutput() UserVpcAuthorizationOutput
	ToUserVpcAuthorizationOutputWithContext(ctx context.Context) UserVpcAuthorizationOutput
}

func (*UserVpcAuthorization) ElementType() reflect.Type {
	return reflect.TypeOf((**UserVpcAuthorization)(nil)).Elem()
}

func (i *UserVpcAuthorization) ToUserVpcAuthorizationOutput() UserVpcAuthorizationOutput {
	return i.ToUserVpcAuthorizationOutputWithContext(context.Background())
}

func (i *UserVpcAuthorization) ToUserVpcAuthorizationOutputWithContext(ctx context.Context) UserVpcAuthorizationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserVpcAuthorizationOutput)
}

// UserVpcAuthorizationArrayInput is an input type that accepts UserVpcAuthorizationArray and UserVpcAuthorizationArrayOutput values.
// You can construct a concrete instance of `UserVpcAuthorizationArrayInput` via:
//
//	UserVpcAuthorizationArray{ UserVpcAuthorizationArgs{...} }
type UserVpcAuthorizationArrayInput interface {
	pulumi.Input

	ToUserVpcAuthorizationArrayOutput() UserVpcAuthorizationArrayOutput
	ToUserVpcAuthorizationArrayOutputWithContext(context.Context) UserVpcAuthorizationArrayOutput
}

type UserVpcAuthorizationArray []UserVpcAuthorizationInput

func (UserVpcAuthorizationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserVpcAuthorization)(nil)).Elem()
}

func (i UserVpcAuthorizationArray) ToUserVpcAuthorizationArrayOutput() UserVpcAuthorizationArrayOutput {
	return i.ToUserVpcAuthorizationArrayOutputWithContext(context.Background())
}

func (i UserVpcAuthorizationArray) ToUserVpcAuthorizationArrayOutputWithContext(ctx context.Context) UserVpcAuthorizationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserVpcAuthorizationArrayOutput)
}

// UserVpcAuthorizationMapInput is an input type that accepts UserVpcAuthorizationMap and UserVpcAuthorizationMapOutput values.
// You can construct a concrete instance of `UserVpcAuthorizationMapInput` via:
//
//	UserVpcAuthorizationMap{ "key": UserVpcAuthorizationArgs{...} }
type UserVpcAuthorizationMapInput interface {
	pulumi.Input

	ToUserVpcAuthorizationMapOutput() UserVpcAuthorizationMapOutput
	ToUserVpcAuthorizationMapOutputWithContext(context.Context) UserVpcAuthorizationMapOutput
}

type UserVpcAuthorizationMap map[string]UserVpcAuthorizationInput

func (UserVpcAuthorizationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserVpcAuthorization)(nil)).Elem()
}

func (i UserVpcAuthorizationMap) ToUserVpcAuthorizationMapOutput() UserVpcAuthorizationMapOutput {
	return i.ToUserVpcAuthorizationMapOutputWithContext(context.Background())
}

func (i UserVpcAuthorizationMap) ToUserVpcAuthorizationMapOutputWithContext(ctx context.Context) UserVpcAuthorizationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserVpcAuthorizationMapOutput)
}

type UserVpcAuthorizationOutput struct{ *pulumi.OutputState }

func (UserVpcAuthorizationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserVpcAuthorization)(nil)).Elem()
}

func (o UserVpcAuthorizationOutput) ToUserVpcAuthorizationOutput() UserVpcAuthorizationOutput {
	return o
}

func (o UserVpcAuthorizationOutput) ToUserVpcAuthorizationOutputWithContext(ctx context.Context) UserVpcAuthorizationOutput {
	return o
}

// The auth channel. Valid values: `RESOURCE_DIRECTORY`.
func (o UserVpcAuthorizationOutput) AuthChannel() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *UserVpcAuthorization) pulumi.StringPtrOutput { return v.AuthChannel }).(pulumi.StringPtrOutput)
}

// The type of Authorization. Valid values: `NORMAL` and `CLOUD_PRODUCT`.
func (o UserVpcAuthorizationOutput) AuthType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *UserVpcAuthorization) pulumi.StringPtrOutput { return v.AuthType }).(pulumi.StringPtrOutput)
}

// The primary account ID of the user who authorizes the resource.
func (o UserVpcAuthorizationOutput) AuthorizedUserId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserVpcAuthorization) pulumi.StringOutput { return v.AuthorizedUserId }).(pulumi.StringOutput)
}

type UserVpcAuthorizationArrayOutput struct{ *pulumi.OutputState }

func (UserVpcAuthorizationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserVpcAuthorization)(nil)).Elem()
}

func (o UserVpcAuthorizationArrayOutput) ToUserVpcAuthorizationArrayOutput() UserVpcAuthorizationArrayOutput {
	return o
}

func (o UserVpcAuthorizationArrayOutput) ToUserVpcAuthorizationArrayOutputWithContext(ctx context.Context) UserVpcAuthorizationArrayOutput {
	return o
}

func (o UserVpcAuthorizationArrayOutput) Index(i pulumi.IntInput) UserVpcAuthorizationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserVpcAuthorization {
		return vs[0].([]*UserVpcAuthorization)[vs[1].(int)]
	}).(UserVpcAuthorizationOutput)
}

type UserVpcAuthorizationMapOutput struct{ *pulumi.OutputState }

func (UserVpcAuthorizationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserVpcAuthorization)(nil)).Elem()
}

func (o UserVpcAuthorizationMapOutput) ToUserVpcAuthorizationMapOutput() UserVpcAuthorizationMapOutput {
	return o
}

func (o UserVpcAuthorizationMapOutput) ToUserVpcAuthorizationMapOutputWithContext(ctx context.Context) UserVpcAuthorizationMapOutput {
	return o
}

func (o UserVpcAuthorizationMapOutput) MapIndex(k pulumi.StringInput) UserVpcAuthorizationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserVpcAuthorization {
		return vs[0].(map[string]*UserVpcAuthorization)[vs[1].(string)]
	}).(UserVpcAuthorizationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserVpcAuthorizationInput)(nil)).Elem(), &UserVpcAuthorization{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserVpcAuthorizationArrayInput)(nil)).Elem(), UserVpcAuthorizationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserVpcAuthorizationMapInput)(nil)).Elem(), UserVpcAuthorizationMap{})
	pulumi.RegisterOutputType(UserVpcAuthorizationOutput{})
	pulumi.RegisterOutputType(UserVpcAuthorizationArrayOutput{})
	pulumi.RegisterOutputType(UserVpcAuthorizationMapOutput{})
}
