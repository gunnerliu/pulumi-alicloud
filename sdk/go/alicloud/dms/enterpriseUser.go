// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dms

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DMS Enterprise User resource. For information about Alidms Enterprise User and how to use it, see [What is Resource Alidms Enterprise User](https://www.alibabacloud.com/help/en/dms/developer-reference/api-dms-enterprise-2018-11-01-registeruser).
//
// > **NOTE:** Available since v1.90.0.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dms"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ram"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tfexamplename"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultUser, err := ram.NewUser(ctx, "defaultUser", &ram.UserArgs{
//				DisplayName: pulumi.String(name),
//				Mobile:      pulumi.String("86-18688888888"),
//				Email:       pulumi.String("hello.uuu@aaa.com"),
//				Comments:    pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = dms.NewEnterpriseUser(ctx, "defaultEnterpriseUser", &dms.EnterpriseUserArgs{
//				Uid:      defaultUser.ID(),
//				UserName: pulumi.String(name),
//				RoleNames: pulumi.StringArray{
//					pulumi.String("DBA"),
//				},
//				Mobile: pulumi.String("86-18688888888"),
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
// DMS Enterprise User can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:dms/enterpriseUser:EnterpriseUser example 24356xxx
//
// ```
type EnterpriseUser struct {
	pulumi.CustomResourceState

	// Maximum number of inquiries on the day.
	MaxExecuteCount pulumi.IntPtrOutput `pulumi:"maxExecuteCount"`
	// Query the maximum number of rows on the day.
	MaxResultCount pulumi.IntPtrOutput `pulumi:"maxResultCount"`
	// The DingTalk number or mobile number of the user.
	Mobile pulumi.StringPtrOutput `pulumi:"mobile"`
	// It has been deprecated from 1.100.0 and use `userName` instead.
	//
	// Deprecated: Field 'nick_name' has been deprecated from version 1.100.0. Use 'user_name' instead.
	NickName pulumi.StringOutput `pulumi:"nickName"`
	// The roles that the user plays.
	RoleNames pulumi.StringArrayOutput `pulumi:"roleNames"`
	// The state of DMS Enterprise User. Valid values: `NORMAL`, `DISABLE`.
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// The tenant ID.
	Tid pulumi.IntPtrOutput `pulumi:"tid"`
	// The Alibaba Cloud unique ID (UID) of the user to add.
	Uid pulumi.StringOutput `pulumi:"uid"`
	// The nickname of the user.
	UserName pulumi.StringOutput `pulumi:"userName"`
}

// NewEnterpriseUser registers a new resource with the given unique name, arguments, and options.
func NewEnterpriseUser(ctx *pulumi.Context,
	name string, args *EnterpriseUserArgs, opts ...pulumi.ResourceOption) (*EnterpriseUser, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Uid == nil {
		return nil, errors.New("invalid value for required argument 'Uid'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EnterpriseUser
	err := ctx.RegisterResource("alicloud:dms/enterpriseUser:EnterpriseUser", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEnterpriseUser gets an existing EnterpriseUser resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEnterpriseUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EnterpriseUserState, opts ...pulumi.ResourceOption) (*EnterpriseUser, error) {
	var resource EnterpriseUser
	err := ctx.ReadResource("alicloud:dms/enterpriseUser:EnterpriseUser", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EnterpriseUser resources.
type enterpriseUserState struct {
	// Maximum number of inquiries on the day.
	MaxExecuteCount *int `pulumi:"maxExecuteCount"`
	// Query the maximum number of rows on the day.
	MaxResultCount *int `pulumi:"maxResultCount"`
	// The DingTalk number or mobile number of the user.
	Mobile *string `pulumi:"mobile"`
	// It has been deprecated from 1.100.0 and use `userName` instead.
	//
	// Deprecated: Field 'nick_name' has been deprecated from version 1.100.0. Use 'user_name' instead.
	NickName *string `pulumi:"nickName"`
	// The roles that the user plays.
	RoleNames []string `pulumi:"roleNames"`
	// The state of DMS Enterprise User. Valid values: `NORMAL`, `DISABLE`.
	Status *string `pulumi:"status"`
	// The tenant ID.
	Tid *int `pulumi:"tid"`
	// The Alibaba Cloud unique ID (UID) of the user to add.
	Uid *string `pulumi:"uid"`
	// The nickname of the user.
	UserName *string `pulumi:"userName"`
}

type EnterpriseUserState struct {
	// Maximum number of inquiries on the day.
	MaxExecuteCount pulumi.IntPtrInput
	// Query the maximum number of rows on the day.
	MaxResultCount pulumi.IntPtrInput
	// The DingTalk number or mobile number of the user.
	Mobile pulumi.StringPtrInput
	// It has been deprecated from 1.100.0 and use `userName` instead.
	//
	// Deprecated: Field 'nick_name' has been deprecated from version 1.100.0. Use 'user_name' instead.
	NickName pulumi.StringPtrInput
	// The roles that the user plays.
	RoleNames pulumi.StringArrayInput
	// The state of DMS Enterprise User. Valid values: `NORMAL`, `DISABLE`.
	Status pulumi.StringPtrInput
	// The tenant ID.
	Tid pulumi.IntPtrInput
	// The Alibaba Cloud unique ID (UID) of the user to add.
	Uid pulumi.StringPtrInput
	// The nickname of the user.
	UserName pulumi.StringPtrInput
}

func (EnterpriseUserState) ElementType() reflect.Type {
	return reflect.TypeOf((*enterpriseUserState)(nil)).Elem()
}

type enterpriseUserArgs struct {
	// Maximum number of inquiries on the day.
	MaxExecuteCount *int `pulumi:"maxExecuteCount"`
	// Query the maximum number of rows on the day.
	MaxResultCount *int `pulumi:"maxResultCount"`
	// The DingTalk number or mobile number of the user.
	Mobile *string `pulumi:"mobile"`
	// It has been deprecated from 1.100.0 and use `userName` instead.
	//
	// Deprecated: Field 'nick_name' has been deprecated from version 1.100.0. Use 'user_name' instead.
	NickName *string `pulumi:"nickName"`
	// The roles that the user plays.
	RoleNames []string `pulumi:"roleNames"`
	// The state of DMS Enterprise User. Valid values: `NORMAL`, `DISABLE`.
	Status *string `pulumi:"status"`
	// The tenant ID.
	Tid *int `pulumi:"tid"`
	// The Alibaba Cloud unique ID (UID) of the user to add.
	Uid string `pulumi:"uid"`
	// The nickname of the user.
	UserName *string `pulumi:"userName"`
}

// The set of arguments for constructing a EnterpriseUser resource.
type EnterpriseUserArgs struct {
	// Maximum number of inquiries on the day.
	MaxExecuteCount pulumi.IntPtrInput
	// Query the maximum number of rows on the day.
	MaxResultCount pulumi.IntPtrInput
	// The DingTalk number or mobile number of the user.
	Mobile pulumi.StringPtrInput
	// It has been deprecated from 1.100.0 and use `userName` instead.
	//
	// Deprecated: Field 'nick_name' has been deprecated from version 1.100.0. Use 'user_name' instead.
	NickName pulumi.StringPtrInput
	// The roles that the user plays.
	RoleNames pulumi.StringArrayInput
	// The state of DMS Enterprise User. Valid values: `NORMAL`, `DISABLE`.
	Status pulumi.StringPtrInput
	// The tenant ID.
	Tid pulumi.IntPtrInput
	// The Alibaba Cloud unique ID (UID) of the user to add.
	Uid pulumi.StringInput
	// The nickname of the user.
	UserName pulumi.StringPtrInput
}

func (EnterpriseUserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*enterpriseUserArgs)(nil)).Elem()
}

type EnterpriseUserInput interface {
	pulumi.Input

	ToEnterpriseUserOutput() EnterpriseUserOutput
	ToEnterpriseUserOutputWithContext(ctx context.Context) EnterpriseUserOutput
}

func (*EnterpriseUser) ElementType() reflect.Type {
	return reflect.TypeOf((**EnterpriseUser)(nil)).Elem()
}

func (i *EnterpriseUser) ToEnterpriseUserOutput() EnterpriseUserOutput {
	return i.ToEnterpriseUserOutputWithContext(context.Background())
}

func (i *EnterpriseUser) ToEnterpriseUserOutputWithContext(ctx context.Context) EnterpriseUserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnterpriseUserOutput)
}

// EnterpriseUserArrayInput is an input type that accepts EnterpriseUserArray and EnterpriseUserArrayOutput values.
// You can construct a concrete instance of `EnterpriseUserArrayInput` via:
//
//	EnterpriseUserArray{ EnterpriseUserArgs{...} }
type EnterpriseUserArrayInput interface {
	pulumi.Input

	ToEnterpriseUserArrayOutput() EnterpriseUserArrayOutput
	ToEnterpriseUserArrayOutputWithContext(context.Context) EnterpriseUserArrayOutput
}

type EnterpriseUserArray []EnterpriseUserInput

func (EnterpriseUserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnterpriseUser)(nil)).Elem()
}

func (i EnterpriseUserArray) ToEnterpriseUserArrayOutput() EnterpriseUserArrayOutput {
	return i.ToEnterpriseUserArrayOutputWithContext(context.Background())
}

func (i EnterpriseUserArray) ToEnterpriseUserArrayOutputWithContext(ctx context.Context) EnterpriseUserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnterpriseUserArrayOutput)
}

// EnterpriseUserMapInput is an input type that accepts EnterpriseUserMap and EnterpriseUserMapOutput values.
// You can construct a concrete instance of `EnterpriseUserMapInput` via:
//
//	EnterpriseUserMap{ "key": EnterpriseUserArgs{...} }
type EnterpriseUserMapInput interface {
	pulumi.Input

	ToEnterpriseUserMapOutput() EnterpriseUserMapOutput
	ToEnterpriseUserMapOutputWithContext(context.Context) EnterpriseUserMapOutput
}

type EnterpriseUserMap map[string]EnterpriseUserInput

func (EnterpriseUserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnterpriseUser)(nil)).Elem()
}

func (i EnterpriseUserMap) ToEnterpriseUserMapOutput() EnterpriseUserMapOutput {
	return i.ToEnterpriseUserMapOutputWithContext(context.Background())
}

func (i EnterpriseUserMap) ToEnterpriseUserMapOutputWithContext(ctx context.Context) EnterpriseUserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnterpriseUserMapOutput)
}

type EnterpriseUserOutput struct{ *pulumi.OutputState }

func (EnterpriseUserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EnterpriseUser)(nil)).Elem()
}

func (o EnterpriseUserOutput) ToEnterpriseUserOutput() EnterpriseUserOutput {
	return o
}

func (o EnterpriseUserOutput) ToEnterpriseUserOutputWithContext(ctx context.Context) EnterpriseUserOutput {
	return o
}

// Maximum number of inquiries on the day.
func (o EnterpriseUserOutput) MaxExecuteCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *EnterpriseUser) pulumi.IntPtrOutput { return v.MaxExecuteCount }).(pulumi.IntPtrOutput)
}

// Query the maximum number of rows on the day.
func (o EnterpriseUserOutput) MaxResultCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *EnterpriseUser) pulumi.IntPtrOutput { return v.MaxResultCount }).(pulumi.IntPtrOutput)
}

// The DingTalk number or mobile number of the user.
func (o EnterpriseUserOutput) Mobile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnterpriseUser) pulumi.StringPtrOutput { return v.Mobile }).(pulumi.StringPtrOutput)
}

// It has been deprecated from 1.100.0 and use `userName` instead.
//
// Deprecated: Field 'nick_name' has been deprecated from version 1.100.0. Use 'user_name' instead.
func (o EnterpriseUserOutput) NickName() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseUser) pulumi.StringOutput { return v.NickName }).(pulumi.StringOutput)
}

// The roles that the user plays.
func (o EnterpriseUserOutput) RoleNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *EnterpriseUser) pulumi.StringArrayOutput { return v.RoleNames }).(pulumi.StringArrayOutput)
}

// The state of DMS Enterprise User. Valid values: `NORMAL`, `DISABLE`.
func (o EnterpriseUserOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnterpriseUser) pulumi.StringPtrOutput { return v.Status }).(pulumi.StringPtrOutput)
}

// The tenant ID.
func (o EnterpriseUserOutput) Tid() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *EnterpriseUser) pulumi.IntPtrOutput { return v.Tid }).(pulumi.IntPtrOutput)
}

// The Alibaba Cloud unique ID (UID) of the user to add.
func (o EnterpriseUserOutput) Uid() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseUser) pulumi.StringOutput { return v.Uid }).(pulumi.StringOutput)
}

// The nickname of the user.
func (o EnterpriseUserOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseUser) pulumi.StringOutput { return v.UserName }).(pulumi.StringOutput)
}

type EnterpriseUserArrayOutput struct{ *pulumi.OutputState }

func (EnterpriseUserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnterpriseUser)(nil)).Elem()
}

func (o EnterpriseUserArrayOutput) ToEnterpriseUserArrayOutput() EnterpriseUserArrayOutput {
	return o
}

func (o EnterpriseUserArrayOutput) ToEnterpriseUserArrayOutputWithContext(ctx context.Context) EnterpriseUserArrayOutput {
	return o
}

func (o EnterpriseUserArrayOutput) Index(i pulumi.IntInput) EnterpriseUserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EnterpriseUser {
		return vs[0].([]*EnterpriseUser)[vs[1].(int)]
	}).(EnterpriseUserOutput)
}

type EnterpriseUserMapOutput struct{ *pulumi.OutputState }

func (EnterpriseUserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnterpriseUser)(nil)).Elem()
}

func (o EnterpriseUserMapOutput) ToEnterpriseUserMapOutput() EnterpriseUserMapOutput {
	return o
}

func (o EnterpriseUserMapOutput) ToEnterpriseUserMapOutputWithContext(ctx context.Context) EnterpriseUserMapOutput {
	return o
}

func (o EnterpriseUserMapOutput) MapIndex(k pulumi.StringInput) EnterpriseUserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EnterpriseUser {
		return vs[0].(map[string]*EnterpriseUser)[vs[1].(string)]
	}).(EnterpriseUserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EnterpriseUserInput)(nil)).Elem(), &EnterpriseUser{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnterpriseUserArrayInput)(nil)).Elem(), EnterpriseUserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnterpriseUserMapInput)(nil)).Elem(), EnterpriseUserMap{})
	pulumi.RegisterOutputType(EnterpriseUserOutput{})
	pulumi.RegisterOutputType(EnterpriseUserArrayOutput{})
	pulumi.RegisterOutputType(EnterpriseUserMapOutput{})
}
