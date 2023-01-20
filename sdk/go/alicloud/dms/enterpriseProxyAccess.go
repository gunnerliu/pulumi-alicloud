// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dms

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DMS Enterprise Proxy Access resource.
//
// For information about DMS Enterprise Proxy Access and how to use it, see [What is Proxy Access](https://www.alibabacloud.com/help/zh/data-management-service/latest/api-doc-dms-enterprise-2018-11-01-api-doc-createproxyaccess).
//
// > **NOTE:** Available in v1.195.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dms.NewEnterpriseProxyAccess(ctx, "default", &dms.EnterpriseProxyAccessArgs{
//				IndepAccount:  pulumi.String("dmstest"),
//				IndepPassword: pulumi.String("PASSWORD-DEMO"),
//				ProxyId:       pulumi.String("1881"),
//				UserId:        pulumi.String("104442"),
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
// DMS Enterprise Proxy Access can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:dms/enterpriseProxyAccess:EnterpriseProxyAccess example <id>
//
// ```
type EnterpriseProxyAccess struct {
	pulumi.CustomResourceState

	// The authorized account of the security agent.
	AccessId pulumi.StringOutput `pulumi:"accessId"`
	// Secure access agent authorization password.
	AccessSecret pulumi.StringOutput `pulumi:"accessSecret"`
	CreateTime   pulumi.StringOutput `pulumi:"createTime"`
	// Database account.
	IndepAccount pulumi.StringPtrOutput `pulumi:"indepAccount"`
	// Database password.
	IndepPassword pulumi.StringPtrOutput `pulumi:"indepPassword"`
	// The ID of the instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The source information of the security access agent permission is enabled, and the return value is as follows:
	// * **Owner Authorization**: The UID of the owner in parentheses.
	// * **Work Order Authorization**: The ticket number in parentheses is the number of the user to apply for permission.
	OriginInfo pulumi.StringOutput `pulumi:"originInfo"`
	// Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
	ProxyAccessId pulumi.StringOutput `pulumi:"proxyAccessId"`
	// The ID of the security agent.
	ProxyId pulumi.StringOutput `pulumi:"proxyId"`
	// The user ID.
	UserId pulumi.StringOutput `pulumi:"userId"`
	// User nickname.
	UserName pulumi.StringOutput `pulumi:"userName"`
	// User UID.
	UserUid pulumi.StringOutput `pulumi:"userUid"`
}

// NewEnterpriseProxyAccess registers a new resource with the given unique name, arguments, and options.
func NewEnterpriseProxyAccess(ctx *pulumi.Context,
	name string, args *EnterpriseProxyAccessArgs, opts ...pulumi.ResourceOption) (*EnterpriseProxyAccess, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProxyId == nil {
		return nil, errors.New("invalid value for required argument 'ProxyId'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	if args.IndepPassword != nil {
		args.IndepPassword = pulumi.ToSecret(args.IndepPassword).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"accessSecret",
		"indepPassword",
	})
	opts = append(opts, secrets)
	var resource EnterpriseProxyAccess
	err := ctx.RegisterResource("alicloud:dms/enterpriseProxyAccess:EnterpriseProxyAccess", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEnterpriseProxyAccess gets an existing EnterpriseProxyAccess resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEnterpriseProxyAccess(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EnterpriseProxyAccessState, opts ...pulumi.ResourceOption) (*EnterpriseProxyAccess, error) {
	var resource EnterpriseProxyAccess
	err := ctx.ReadResource("alicloud:dms/enterpriseProxyAccess:EnterpriseProxyAccess", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EnterpriseProxyAccess resources.
type enterpriseProxyAccessState struct {
	// The authorized account of the security agent.
	AccessId *string `pulumi:"accessId"`
	// Secure access agent authorization password.
	AccessSecret *string `pulumi:"accessSecret"`
	CreateTime   *string `pulumi:"createTime"`
	// Database account.
	IndepAccount *string `pulumi:"indepAccount"`
	// Database password.
	IndepPassword *string `pulumi:"indepPassword"`
	// The ID of the instance.
	InstanceId *string `pulumi:"instanceId"`
	// The source information of the security access agent permission is enabled, and the return value is as follows:
	// * **Owner Authorization**: The UID of the owner in parentheses.
	// * **Work Order Authorization**: The ticket number in parentheses is the number of the user to apply for permission.
	OriginInfo *string `pulumi:"originInfo"`
	// Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
	ProxyAccessId *string `pulumi:"proxyAccessId"`
	// The ID of the security agent.
	ProxyId *string `pulumi:"proxyId"`
	// The user ID.
	UserId *string `pulumi:"userId"`
	// User nickname.
	UserName *string `pulumi:"userName"`
	// User UID.
	UserUid *string `pulumi:"userUid"`
}

type EnterpriseProxyAccessState struct {
	// The authorized account of the security agent.
	AccessId pulumi.StringPtrInput
	// Secure access agent authorization password.
	AccessSecret pulumi.StringPtrInput
	CreateTime   pulumi.StringPtrInput
	// Database account.
	IndepAccount pulumi.StringPtrInput
	// Database password.
	IndepPassword pulumi.StringPtrInput
	// The ID of the instance.
	InstanceId pulumi.StringPtrInput
	// The source information of the security access agent permission is enabled, and the return value is as follows:
	// * **Owner Authorization**: The UID of the owner in parentheses.
	// * **Work Order Authorization**: The ticket number in parentheses is the number of the user to apply for permission.
	OriginInfo pulumi.StringPtrInput
	// Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
	ProxyAccessId pulumi.StringPtrInput
	// The ID of the security agent.
	ProxyId pulumi.StringPtrInput
	// The user ID.
	UserId pulumi.StringPtrInput
	// User nickname.
	UserName pulumi.StringPtrInput
	// User UID.
	UserUid pulumi.StringPtrInput
}

func (EnterpriseProxyAccessState) ElementType() reflect.Type {
	return reflect.TypeOf((*enterpriseProxyAccessState)(nil)).Elem()
}

type enterpriseProxyAccessArgs struct {
	// Database account.
	IndepAccount *string `pulumi:"indepAccount"`
	// Database password.
	IndepPassword *string `pulumi:"indepPassword"`
	// Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
	ProxyAccessId *string `pulumi:"proxyAccessId"`
	// The ID of the security agent.
	ProxyId string `pulumi:"proxyId"`
	// The user ID.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a EnterpriseProxyAccess resource.
type EnterpriseProxyAccessArgs struct {
	// Database account.
	IndepAccount pulumi.StringPtrInput
	// Database password.
	IndepPassword pulumi.StringPtrInput
	// Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
	ProxyAccessId pulumi.StringPtrInput
	// The ID of the security agent.
	ProxyId pulumi.StringInput
	// The user ID.
	UserId pulumi.StringInput
}

func (EnterpriseProxyAccessArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*enterpriseProxyAccessArgs)(nil)).Elem()
}

type EnterpriseProxyAccessInput interface {
	pulumi.Input

	ToEnterpriseProxyAccessOutput() EnterpriseProxyAccessOutput
	ToEnterpriseProxyAccessOutputWithContext(ctx context.Context) EnterpriseProxyAccessOutput
}

func (*EnterpriseProxyAccess) ElementType() reflect.Type {
	return reflect.TypeOf((**EnterpriseProxyAccess)(nil)).Elem()
}

func (i *EnterpriseProxyAccess) ToEnterpriseProxyAccessOutput() EnterpriseProxyAccessOutput {
	return i.ToEnterpriseProxyAccessOutputWithContext(context.Background())
}

func (i *EnterpriseProxyAccess) ToEnterpriseProxyAccessOutputWithContext(ctx context.Context) EnterpriseProxyAccessOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnterpriseProxyAccessOutput)
}

// EnterpriseProxyAccessArrayInput is an input type that accepts EnterpriseProxyAccessArray and EnterpriseProxyAccessArrayOutput values.
// You can construct a concrete instance of `EnterpriseProxyAccessArrayInput` via:
//
//	EnterpriseProxyAccessArray{ EnterpriseProxyAccessArgs{...} }
type EnterpriseProxyAccessArrayInput interface {
	pulumi.Input

	ToEnterpriseProxyAccessArrayOutput() EnterpriseProxyAccessArrayOutput
	ToEnterpriseProxyAccessArrayOutputWithContext(context.Context) EnterpriseProxyAccessArrayOutput
}

type EnterpriseProxyAccessArray []EnterpriseProxyAccessInput

func (EnterpriseProxyAccessArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnterpriseProxyAccess)(nil)).Elem()
}

func (i EnterpriseProxyAccessArray) ToEnterpriseProxyAccessArrayOutput() EnterpriseProxyAccessArrayOutput {
	return i.ToEnterpriseProxyAccessArrayOutputWithContext(context.Background())
}

func (i EnterpriseProxyAccessArray) ToEnterpriseProxyAccessArrayOutputWithContext(ctx context.Context) EnterpriseProxyAccessArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnterpriseProxyAccessArrayOutput)
}

// EnterpriseProxyAccessMapInput is an input type that accepts EnterpriseProxyAccessMap and EnterpriseProxyAccessMapOutput values.
// You can construct a concrete instance of `EnterpriseProxyAccessMapInput` via:
//
//	EnterpriseProxyAccessMap{ "key": EnterpriseProxyAccessArgs{...} }
type EnterpriseProxyAccessMapInput interface {
	pulumi.Input

	ToEnterpriseProxyAccessMapOutput() EnterpriseProxyAccessMapOutput
	ToEnterpriseProxyAccessMapOutputWithContext(context.Context) EnterpriseProxyAccessMapOutput
}

type EnterpriseProxyAccessMap map[string]EnterpriseProxyAccessInput

func (EnterpriseProxyAccessMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnterpriseProxyAccess)(nil)).Elem()
}

func (i EnterpriseProxyAccessMap) ToEnterpriseProxyAccessMapOutput() EnterpriseProxyAccessMapOutput {
	return i.ToEnterpriseProxyAccessMapOutputWithContext(context.Background())
}

func (i EnterpriseProxyAccessMap) ToEnterpriseProxyAccessMapOutputWithContext(ctx context.Context) EnterpriseProxyAccessMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnterpriseProxyAccessMapOutput)
}

type EnterpriseProxyAccessOutput struct{ *pulumi.OutputState }

func (EnterpriseProxyAccessOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EnterpriseProxyAccess)(nil)).Elem()
}

func (o EnterpriseProxyAccessOutput) ToEnterpriseProxyAccessOutput() EnterpriseProxyAccessOutput {
	return o
}

func (o EnterpriseProxyAccessOutput) ToEnterpriseProxyAccessOutputWithContext(ctx context.Context) EnterpriseProxyAccessOutput {
	return o
}

// The authorized account of the security agent.
func (o EnterpriseProxyAccessOutput) AccessId() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseProxyAccess) pulumi.StringOutput { return v.AccessId }).(pulumi.StringOutput)
}

// Secure access agent authorization password.
func (o EnterpriseProxyAccessOutput) AccessSecret() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseProxyAccess) pulumi.StringOutput { return v.AccessSecret }).(pulumi.StringOutput)
}

func (o EnterpriseProxyAccessOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseProxyAccess) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Database account.
func (o EnterpriseProxyAccessOutput) IndepAccount() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnterpriseProxyAccess) pulumi.StringPtrOutput { return v.IndepAccount }).(pulumi.StringPtrOutput)
}

// Database password.
func (o EnterpriseProxyAccessOutput) IndepPassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnterpriseProxyAccess) pulumi.StringPtrOutput { return v.IndepPassword }).(pulumi.StringPtrOutput)
}

// The ID of the instance.
func (o EnterpriseProxyAccessOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseProxyAccess) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The source information of the security access agent permission is enabled, and the return value is as follows:
// * **Owner Authorization**: The UID of the owner in parentheses.
// * **Work Order Authorization**: The ticket number in parentheses is the number of the user to apply for permission.
func (o EnterpriseProxyAccessOutput) OriginInfo() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseProxyAccess) pulumi.StringOutput { return v.OriginInfo }).(pulumi.StringOutput)
}

// Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
func (o EnterpriseProxyAccessOutput) ProxyAccessId() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseProxyAccess) pulumi.StringOutput { return v.ProxyAccessId }).(pulumi.StringOutput)
}

// The ID of the security agent.
func (o EnterpriseProxyAccessOutput) ProxyId() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseProxyAccess) pulumi.StringOutput { return v.ProxyId }).(pulumi.StringOutput)
}

// The user ID.
func (o EnterpriseProxyAccessOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseProxyAccess) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

// User nickname.
func (o EnterpriseProxyAccessOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseProxyAccess) pulumi.StringOutput { return v.UserName }).(pulumi.StringOutput)
}

// User UID.
func (o EnterpriseProxyAccessOutput) UserUid() pulumi.StringOutput {
	return o.ApplyT(func(v *EnterpriseProxyAccess) pulumi.StringOutput { return v.UserUid }).(pulumi.StringOutput)
}

type EnterpriseProxyAccessArrayOutput struct{ *pulumi.OutputState }

func (EnterpriseProxyAccessArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnterpriseProxyAccess)(nil)).Elem()
}

func (o EnterpriseProxyAccessArrayOutput) ToEnterpriseProxyAccessArrayOutput() EnterpriseProxyAccessArrayOutput {
	return o
}

func (o EnterpriseProxyAccessArrayOutput) ToEnterpriseProxyAccessArrayOutputWithContext(ctx context.Context) EnterpriseProxyAccessArrayOutput {
	return o
}

func (o EnterpriseProxyAccessArrayOutput) Index(i pulumi.IntInput) EnterpriseProxyAccessOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EnterpriseProxyAccess {
		return vs[0].([]*EnterpriseProxyAccess)[vs[1].(int)]
	}).(EnterpriseProxyAccessOutput)
}

type EnterpriseProxyAccessMapOutput struct{ *pulumi.OutputState }

func (EnterpriseProxyAccessMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnterpriseProxyAccess)(nil)).Elem()
}

func (o EnterpriseProxyAccessMapOutput) ToEnterpriseProxyAccessMapOutput() EnterpriseProxyAccessMapOutput {
	return o
}

func (o EnterpriseProxyAccessMapOutput) ToEnterpriseProxyAccessMapOutputWithContext(ctx context.Context) EnterpriseProxyAccessMapOutput {
	return o
}

func (o EnterpriseProxyAccessMapOutput) MapIndex(k pulumi.StringInput) EnterpriseProxyAccessOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EnterpriseProxyAccess {
		return vs[0].(map[string]*EnterpriseProxyAccess)[vs[1].(string)]
	}).(EnterpriseProxyAccessOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EnterpriseProxyAccessInput)(nil)).Elem(), &EnterpriseProxyAccess{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnterpriseProxyAccessArrayInput)(nil)).Elem(), EnterpriseProxyAccessArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnterpriseProxyAccessMapInput)(nil)).Elem(), EnterpriseProxyAccessMap{})
	pulumi.RegisterOutputType(EnterpriseProxyAccessOutput{})
	pulumi.RegisterOutputType(EnterpriseProxyAccessArrayOutput{})
	pulumi.RegisterOutputType(EnterpriseProxyAccessMapOutput{})
}
