// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package bastionhost

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type GetInstancesInstance struct {
	// The instance's remark.
	Description string `pulumi:"description"`
	// The instance's id.
	Id string `pulumi:"id"`
	// The instance's status.
	InstanceStatus string `pulumi:"instanceStatus"`
	LicenseCode    string `pulumi:"licenseCode"`
	// The instance's private domain name.
	PrivateDomain string `pulumi:"privateDomain"`
	// The instance's public domain name.
	PublicDomain string `pulumi:"publicDomain"`
	// The instance's public network access configuration.
	PublicNetworkAccess bool `pulumi:"publicNetworkAccess"`
	// The instance's security group configuration.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// A map of tags assigned to the bastionhost instance. It must be in the format:
	// ```go
	// package main
	//
	// import (
	// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/bastionhost"
	// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	// )
	//
	// func main() {
	// 	pulumi.Run(func(ctx *pulumi.Context) error {
	// 		_, err := bastionhost.GetInstances(ctx, &bastionhost.GetInstancesArgs{
	// 			Tags: map[string]interface{}{
	// 				"tagKey1": "tagValue1",
	// 			},
	// 		}, nil)
	// 		if err != nil {
	// 			return err
	// 		}
	// 		return nil
	// 	})
	// }
	// ```
	Tags map[string]interface{} `pulumi:"tags"`
	// The instance's vSwitch ID.
	UserVswitchId string `pulumi:"userVswitchId"`
}

// GetInstancesInstanceInput is an input type that accepts GetInstancesInstanceArgs and GetInstancesInstanceOutput values.
// You can construct a concrete instance of `GetInstancesInstanceInput` via:
//
//          GetInstancesInstanceArgs{...}
type GetInstancesInstanceInput interface {
	pulumi.Input

	ToGetInstancesInstanceOutput() GetInstancesInstanceOutput
	ToGetInstancesInstanceOutputWithContext(context.Context) GetInstancesInstanceOutput
}

type GetInstancesInstanceArgs struct {
	// The instance's remark.
	Description pulumi.StringInput `pulumi:"description"`
	// The instance's id.
	Id pulumi.StringInput `pulumi:"id"`
	// The instance's status.
	InstanceStatus pulumi.StringInput `pulumi:"instanceStatus"`
	LicenseCode    pulumi.StringInput `pulumi:"licenseCode"`
	// The instance's private domain name.
	PrivateDomain pulumi.StringInput `pulumi:"privateDomain"`
	// The instance's public domain name.
	PublicDomain pulumi.StringInput `pulumi:"publicDomain"`
	// The instance's public network access configuration.
	PublicNetworkAccess pulumi.BoolInput `pulumi:"publicNetworkAccess"`
	// The instance's security group configuration.
	SecurityGroupIds pulumi.StringArrayInput `pulumi:"securityGroupIds"`
	// A map of tags assigned to the bastionhost instance. It must be in the format:
	// ```go
	// package main
	//
	// import (
	// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/bastionhost"
	// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	// )
	//
	// func main() {
	// 	pulumi.Run(func(ctx *pulumi.Context) error {
	// 		_, err := bastionhost.GetInstances(ctx, &bastionhost.GetInstancesArgs{
	// 			Tags: map[string]interface{}{
	// 				"tagKey1": "tagValue1",
	// 			},
	// 		}, nil)
	// 		if err != nil {
	// 			return err
	// 		}
	// 		return nil
	// 	})
	// }
	// ```
	Tags pulumi.MapInput `pulumi:"tags"`
	// The instance's vSwitch ID.
	UserVswitchId pulumi.StringInput `pulumi:"userVswitchId"`
}

func (GetInstancesInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstance)(nil)).Elem()
}

func (i GetInstancesInstanceArgs) ToGetInstancesInstanceOutput() GetInstancesInstanceOutput {
	return i.ToGetInstancesInstanceOutputWithContext(context.Background())
}

func (i GetInstancesInstanceArgs) ToGetInstancesInstanceOutputWithContext(ctx context.Context) GetInstancesInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceOutput)
}

// GetInstancesInstanceArrayInput is an input type that accepts GetInstancesInstanceArray and GetInstancesInstanceArrayOutput values.
// You can construct a concrete instance of `GetInstancesInstanceArrayInput` via:
//
//          GetInstancesInstanceArray{ GetInstancesInstanceArgs{...} }
type GetInstancesInstanceArrayInput interface {
	pulumi.Input

	ToGetInstancesInstanceArrayOutput() GetInstancesInstanceArrayOutput
	ToGetInstancesInstanceArrayOutputWithContext(context.Context) GetInstancesInstanceArrayOutput
}

type GetInstancesInstanceArray []GetInstancesInstanceInput

func (GetInstancesInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstance)(nil)).Elem()
}

func (i GetInstancesInstanceArray) ToGetInstancesInstanceArrayOutput() GetInstancesInstanceArrayOutput {
	return i.ToGetInstancesInstanceArrayOutputWithContext(context.Background())
}

func (i GetInstancesInstanceArray) ToGetInstancesInstanceArrayOutputWithContext(ctx context.Context) GetInstancesInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetInstancesInstanceArrayOutput)
}

type GetInstancesInstanceOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesInstance)(nil)).Elem()
}

func (o GetInstancesInstanceOutput) ToGetInstancesInstanceOutput() GetInstancesInstanceOutput {
	return o
}

func (o GetInstancesInstanceOutput) ToGetInstancesInstanceOutputWithContext(ctx context.Context) GetInstancesInstanceOutput {
	return o
}

// The instance's remark.
func (o GetInstancesInstanceOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.Description }).(pulumi.StringOutput)
}

// The instance's id.
func (o GetInstancesInstanceOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.Id }).(pulumi.StringOutput)
}

// The instance's status.
func (o GetInstancesInstanceOutput) InstanceStatus() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.InstanceStatus }).(pulumi.StringOutput)
}

func (o GetInstancesInstanceOutput) LicenseCode() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.LicenseCode }).(pulumi.StringOutput)
}

// The instance's private domain name.
func (o GetInstancesInstanceOutput) PrivateDomain() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.PrivateDomain }).(pulumi.StringOutput)
}

// The instance's public domain name.
func (o GetInstancesInstanceOutput) PublicDomain() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.PublicDomain }).(pulumi.StringOutput)
}

// The instance's public network access configuration.
func (o GetInstancesInstanceOutput) PublicNetworkAccess() pulumi.BoolOutput {
	return o.ApplyT(func(v GetInstancesInstance) bool { return v.PublicNetworkAccess }).(pulumi.BoolOutput)
}

// The instance's security group configuration.
func (o GetInstancesInstanceOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetInstancesInstance) []string { return v.SecurityGroupIds }).(pulumi.StringArrayOutput)
}

// A map of tags assigned to the bastionhost instance. It must be in the format:
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/bastionhost"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := bastionhost.GetInstances(ctx, &bastionhost.GetInstancesArgs{
// 			Tags: map[string]interface{}{
// 				"tagKey1": "tagValue1",
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func (o GetInstancesInstanceOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetInstancesInstance) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

// The instance's vSwitch ID.
func (o GetInstancesInstanceOutput) UserVswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesInstance) string { return v.UserVswitchId }).(pulumi.StringOutput)
}

type GetInstancesInstanceArrayOutput struct{ *pulumi.OutputState }

func (GetInstancesInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetInstancesInstance)(nil)).Elem()
}

func (o GetInstancesInstanceArrayOutput) ToGetInstancesInstanceArrayOutput() GetInstancesInstanceArrayOutput {
	return o
}

func (o GetInstancesInstanceArrayOutput) ToGetInstancesInstanceArrayOutputWithContext(ctx context.Context) GetInstancesInstanceArrayOutput {
	return o
}

func (o GetInstancesInstanceArrayOutput) Index(i pulumi.IntInput) GetInstancesInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetInstancesInstance {
		return vs[0].([]GetInstancesInstance)[vs[1].(int)]
	}).(GetInstancesInstanceOutput)
}

type GetUserGroupsGroup struct {
	// Specify the New Group of Remark Information. Supports up to 500 Characters.
	Comment string `pulumi:"comment"`
	// The ID of the User Group.
	Id string `pulumi:"id"`
	// Specify the New Group of the Bastion Host of Instance Id.
	InstanceId string `pulumi:"instanceId"`
	// The User Group ID.
	UserGroupId string `pulumi:"userGroupId"`
	// Specify the New Group Name. Supports up to 128 Characters.
	UserGroupName string `pulumi:"userGroupName"`
}

// GetUserGroupsGroupInput is an input type that accepts GetUserGroupsGroupArgs and GetUserGroupsGroupOutput values.
// You can construct a concrete instance of `GetUserGroupsGroupInput` via:
//
//          GetUserGroupsGroupArgs{...}
type GetUserGroupsGroupInput interface {
	pulumi.Input

	ToGetUserGroupsGroupOutput() GetUserGroupsGroupOutput
	ToGetUserGroupsGroupOutputWithContext(context.Context) GetUserGroupsGroupOutput
}

type GetUserGroupsGroupArgs struct {
	// Specify the New Group of Remark Information. Supports up to 500 Characters.
	Comment pulumi.StringInput `pulumi:"comment"`
	// The ID of the User Group.
	Id pulumi.StringInput `pulumi:"id"`
	// Specify the New Group of the Bastion Host of Instance Id.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// The User Group ID.
	UserGroupId pulumi.StringInput `pulumi:"userGroupId"`
	// Specify the New Group Name. Supports up to 128 Characters.
	UserGroupName pulumi.StringInput `pulumi:"userGroupName"`
}

func (GetUserGroupsGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUserGroupsGroup)(nil)).Elem()
}

func (i GetUserGroupsGroupArgs) ToGetUserGroupsGroupOutput() GetUserGroupsGroupOutput {
	return i.ToGetUserGroupsGroupOutputWithContext(context.Background())
}

func (i GetUserGroupsGroupArgs) ToGetUserGroupsGroupOutputWithContext(ctx context.Context) GetUserGroupsGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetUserGroupsGroupOutput)
}

// GetUserGroupsGroupArrayInput is an input type that accepts GetUserGroupsGroupArray and GetUserGroupsGroupArrayOutput values.
// You can construct a concrete instance of `GetUserGroupsGroupArrayInput` via:
//
//          GetUserGroupsGroupArray{ GetUserGroupsGroupArgs{...} }
type GetUserGroupsGroupArrayInput interface {
	pulumi.Input

	ToGetUserGroupsGroupArrayOutput() GetUserGroupsGroupArrayOutput
	ToGetUserGroupsGroupArrayOutputWithContext(context.Context) GetUserGroupsGroupArrayOutput
}

type GetUserGroupsGroupArray []GetUserGroupsGroupInput

func (GetUserGroupsGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetUserGroupsGroup)(nil)).Elem()
}

func (i GetUserGroupsGroupArray) ToGetUserGroupsGroupArrayOutput() GetUserGroupsGroupArrayOutput {
	return i.ToGetUserGroupsGroupArrayOutputWithContext(context.Background())
}

func (i GetUserGroupsGroupArray) ToGetUserGroupsGroupArrayOutputWithContext(ctx context.Context) GetUserGroupsGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetUserGroupsGroupArrayOutput)
}

type GetUserGroupsGroupOutput struct{ *pulumi.OutputState }

func (GetUserGroupsGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUserGroupsGroup)(nil)).Elem()
}

func (o GetUserGroupsGroupOutput) ToGetUserGroupsGroupOutput() GetUserGroupsGroupOutput {
	return o
}

func (o GetUserGroupsGroupOutput) ToGetUserGroupsGroupOutputWithContext(ctx context.Context) GetUserGroupsGroupOutput {
	return o
}

// Specify the New Group of Remark Information. Supports up to 500 Characters.
func (o GetUserGroupsGroupOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserGroupsGroup) string { return v.Comment }).(pulumi.StringOutput)
}

// The ID of the User Group.
func (o GetUserGroupsGroupOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserGroupsGroup) string { return v.Id }).(pulumi.StringOutput)
}

// Specify the New Group of the Bastion Host of Instance Id.
func (o GetUserGroupsGroupOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserGroupsGroup) string { return v.InstanceId }).(pulumi.StringOutput)
}

// The User Group ID.
func (o GetUserGroupsGroupOutput) UserGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserGroupsGroup) string { return v.UserGroupId }).(pulumi.StringOutput)
}

// Specify the New Group Name. Supports up to 128 Characters.
func (o GetUserGroupsGroupOutput) UserGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserGroupsGroup) string { return v.UserGroupName }).(pulumi.StringOutput)
}

type GetUserGroupsGroupArrayOutput struct{ *pulumi.OutputState }

func (GetUserGroupsGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetUserGroupsGroup)(nil)).Elem()
}

func (o GetUserGroupsGroupArrayOutput) ToGetUserGroupsGroupArrayOutput() GetUserGroupsGroupArrayOutput {
	return o
}

func (o GetUserGroupsGroupArrayOutput) ToGetUserGroupsGroupArrayOutputWithContext(ctx context.Context) GetUserGroupsGroupArrayOutput {
	return o
}

func (o GetUserGroupsGroupArrayOutput) Index(i pulumi.IntInput) GetUserGroupsGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetUserGroupsGroup {
		return vs[0].([]GetUserGroupsGroup)[vs[1].(int)]
	}).(GetUserGroupsGroupOutput)
}

type GetUsersUser struct {
	// Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
	Comment string `pulumi:"comment"`
	// Specify the New Created the User's Display Name. Supports up to 128 Characters.
	DisplayName string `pulumi:"displayName"`
	// Specify the New User's Mailbox.
	Email string `pulumi:"email"`
	// The ID of the User.
	Id string `pulumi:"id"`
	// You Want to Query the User the Bastion Host ID of.
	InstanceId string `pulumi:"instanceId"`
	// Specify the New of the User That Created a Different Mobile Phone Number from Your.
	Mobile string `pulumi:"mobile"`
	// Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN Value: CN: Mainland China (+86) HK: hong Kong, China (+852) Mo: Macau, China (+853) TW: Taiwan, China (+886) ru: Russian (+7) SG: Singapore (+65) My: malaysia (+60) ID: Indonesia (+62) De: Germany (+49) AU: Australia (+61) US: United States (+1) AE: dubai (+971) JP: Japan (+81) Introducing the Long-Range GB: United Kingdom (+44) in: India (+91) KR: South Korea (+82) Ph: philippines (+63) Ch: Switzerland (+41) Se: Sweden (+46).
	MobileCountryCode string `pulumi:"mobileCountryCode"`
	// Specify the New of the User That Created the Source. Valid Values: Local: Local User RAM: Ram User.
	Source string `pulumi:"source"`
	// Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
	SourceUserId string `pulumi:"sourceUserId"`
	// The status of the resource.
	Status string `pulumi:"status"`
	// The User ID.
	UserId string `pulumi:"userId"`
	// Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
	UserName string `pulumi:"userName"`
}

// GetUsersUserInput is an input type that accepts GetUsersUserArgs and GetUsersUserOutput values.
// You can construct a concrete instance of `GetUsersUserInput` via:
//
//          GetUsersUserArgs{...}
type GetUsersUserInput interface {
	pulumi.Input

	ToGetUsersUserOutput() GetUsersUserOutput
	ToGetUsersUserOutputWithContext(context.Context) GetUsersUserOutput
}

type GetUsersUserArgs struct {
	// Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
	Comment pulumi.StringInput `pulumi:"comment"`
	// Specify the New Created the User's Display Name. Supports up to 128 Characters.
	DisplayName pulumi.StringInput `pulumi:"displayName"`
	// Specify the New User's Mailbox.
	Email pulumi.StringInput `pulumi:"email"`
	// The ID of the User.
	Id pulumi.StringInput `pulumi:"id"`
	// You Want to Query the User the Bastion Host ID of.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// Specify the New of the User That Created a Different Mobile Phone Number from Your.
	Mobile pulumi.StringInput `pulumi:"mobile"`
	// Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN Value: CN: Mainland China (+86) HK: hong Kong, China (+852) Mo: Macau, China (+853) TW: Taiwan, China (+886) ru: Russian (+7) SG: Singapore (+65) My: malaysia (+60) ID: Indonesia (+62) De: Germany (+49) AU: Australia (+61) US: United States (+1) AE: dubai (+971) JP: Japan (+81) Introducing the Long-Range GB: United Kingdom (+44) in: India (+91) KR: South Korea (+82) Ph: philippines (+63) Ch: Switzerland (+41) Se: Sweden (+46).
	MobileCountryCode pulumi.StringInput `pulumi:"mobileCountryCode"`
	// Specify the New of the User That Created the Source. Valid Values: Local: Local User RAM: Ram User.
	Source pulumi.StringInput `pulumi:"source"`
	// Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
	SourceUserId pulumi.StringInput `pulumi:"sourceUserId"`
	// The status of the resource.
	Status pulumi.StringInput `pulumi:"status"`
	// The User ID.
	UserId pulumi.StringInput `pulumi:"userId"`
	// Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
	UserName pulumi.StringInput `pulumi:"userName"`
}

func (GetUsersUserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUsersUser)(nil)).Elem()
}

func (i GetUsersUserArgs) ToGetUsersUserOutput() GetUsersUserOutput {
	return i.ToGetUsersUserOutputWithContext(context.Background())
}

func (i GetUsersUserArgs) ToGetUsersUserOutputWithContext(ctx context.Context) GetUsersUserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetUsersUserOutput)
}

// GetUsersUserArrayInput is an input type that accepts GetUsersUserArray and GetUsersUserArrayOutput values.
// You can construct a concrete instance of `GetUsersUserArrayInput` via:
//
//          GetUsersUserArray{ GetUsersUserArgs{...} }
type GetUsersUserArrayInput interface {
	pulumi.Input

	ToGetUsersUserArrayOutput() GetUsersUserArrayOutput
	ToGetUsersUserArrayOutputWithContext(context.Context) GetUsersUserArrayOutput
}

type GetUsersUserArray []GetUsersUserInput

func (GetUsersUserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetUsersUser)(nil)).Elem()
}

func (i GetUsersUserArray) ToGetUsersUserArrayOutput() GetUsersUserArrayOutput {
	return i.ToGetUsersUserArrayOutputWithContext(context.Background())
}

func (i GetUsersUserArray) ToGetUsersUserArrayOutputWithContext(ctx context.Context) GetUsersUserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetUsersUserArrayOutput)
}

type GetUsersUserOutput struct{ *pulumi.OutputState }

func (GetUsersUserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUsersUser)(nil)).Elem()
}

func (o GetUsersUserOutput) ToGetUsersUserOutput() GetUsersUserOutput {
	return o
}

func (o GetUsersUserOutput) ToGetUsersUserOutputWithContext(ctx context.Context) GetUsersUserOutput {
	return o
}

// Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
func (o GetUsersUserOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersUser) string { return v.Comment }).(pulumi.StringOutput)
}

// Specify the New Created the User's Display Name. Supports up to 128 Characters.
func (o GetUsersUserOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersUser) string { return v.DisplayName }).(pulumi.StringOutput)
}

// Specify the New User's Mailbox.
func (o GetUsersUserOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersUser) string { return v.Email }).(pulumi.StringOutput)
}

// The ID of the User.
func (o GetUsersUserOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersUser) string { return v.Id }).(pulumi.StringOutput)
}

// You Want to Query the User the Bastion Host ID of.
func (o GetUsersUserOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersUser) string { return v.InstanceId }).(pulumi.StringOutput)
}

// Specify the New of the User That Created a Different Mobile Phone Number from Your.
func (o GetUsersUserOutput) Mobile() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersUser) string { return v.Mobile }).(pulumi.StringOutput)
}

// Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN Value: CN: Mainland China (+86) HK: hong Kong, China (+852) Mo: Macau, China (+853) TW: Taiwan, China (+886) ru: Russian (+7) SG: Singapore (+65) My: malaysia (+60) ID: Indonesia (+62) De: Germany (+49) AU: Australia (+61) US: United States (+1) AE: dubai (+971) JP: Japan (+81) Introducing the Long-Range GB: United Kingdom (+44) in: India (+91) KR: South Korea (+82) Ph: philippines (+63) Ch: Switzerland (+41) Se: Sweden (+46).
func (o GetUsersUserOutput) MobileCountryCode() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersUser) string { return v.MobileCountryCode }).(pulumi.StringOutput)
}

// Specify the New of the User That Created the Source. Valid Values: Local: Local User RAM: Ram User.
func (o GetUsersUserOutput) Source() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersUser) string { return v.Source }).(pulumi.StringOutput)
}

// Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
func (o GetUsersUserOutput) SourceUserId() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersUser) string { return v.SourceUserId }).(pulumi.StringOutput)
}

// The status of the resource.
func (o GetUsersUserOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersUser) string { return v.Status }).(pulumi.StringOutput)
}

// The User ID.
func (o GetUsersUserOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersUser) string { return v.UserId }).(pulumi.StringOutput)
}

// Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
func (o GetUsersUserOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersUser) string { return v.UserName }).(pulumi.StringOutput)
}

type GetUsersUserArrayOutput struct{ *pulumi.OutputState }

func (GetUsersUserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetUsersUser)(nil)).Elem()
}

func (o GetUsersUserArrayOutput) ToGetUsersUserArrayOutput() GetUsersUserArrayOutput {
	return o
}

func (o GetUsersUserArrayOutput) ToGetUsersUserArrayOutputWithContext(ctx context.Context) GetUsersUserArrayOutput {
	return o
}

func (o GetUsersUserArrayOutput) Index(i pulumi.IntInput) GetUsersUserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetUsersUser {
		return vs[0].([]GetUsersUser)[vs[1].(int)]
	}).(GetUsersUserOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstancesInstanceOutput{})
	pulumi.RegisterOutputType(GetInstancesInstanceArrayOutput{})
	pulumi.RegisterOutputType(GetUserGroupsGroupOutput{})
	pulumi.RegisterOutputType(GetUserGroupsGroupArrayOutput{})
	pulumi.RegisterOutputType(GetUsersUserOutput{})
	pulumi.RegisterOutputType(GetUsersUserArrayOutput{})
}
