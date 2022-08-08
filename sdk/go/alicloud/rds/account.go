// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/rds"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		creation := "Rds"
// 		if param := cfg.Get("creation"); param != "" {
// 			creation = param
// 		}
// 		name := "dbaccountmysql"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		defaultZones, err := alicloud.GetZones(ctx, &GetZonesArgs{
// 			AvailableResourceCreation: pulumi.StringRef(creation),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
// 			VpcName:   pulumi.String(name),
// 			CidrBlock: pulumi.String("172.16.0.0/16"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
// 			VpcId:       defaultNetwork.ID(),
// 			CidrBlock:   pulumi.String("172.16.0.0/24"),
// 			ZoneId:      pulumi.String(defaultZones.Zones[0].Id),
// 			VswitchName: pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		instance, err := rds.NewInstance(ctx, "instance", &rds.InstanceArgs{
// 			Engine:          pulumi.String("MySQL"),
// 			EngineVersion:   pulumi.String("5.6"),
// 			InstanceType:    pulumi.String("rds.mysql.s1.small"),
// 			InstanceStorage: pulumi.Int(10),
// 			VswitchId:       defaultSwitch.ID(),
// 			InstanceName:    pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = rds.NewAccount(ctx, "account", &rds.AccountArgs{
// 			InstanceId: instance.ID(),
// 			Password:   pulumi.String("Test12345"),
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
// RDS account can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:rds/account:Account example "rm-12345:tf_account"
// ```
type Account struct {
	pulumi.CustomResourceState

	AccountDescription pulumi.StringOutput `pulumi:"accountDescription"`
	AccountName        pulumi.StringOutput `pulumi:"accountName"`
	AccountPassword    pulumi.StringOutput `pulumi:"accountPassword"`
	AccountType        pulumi.StringOutput `pulumi:"accountType"`
	DbInstanceId       pulumi.StringOutput `pulumi:"dbInstanceId"`
	// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
	//
	// Deprecated: Field 'description' has been deprecated from provider version 1.120.0. New field 'account_description' instead.
	Description pulumi.StringOutput `pulumi:"description"`
	// The Id of instance in which account belongs.
	//
	// Deprecated: Field 'instance_id' has been deprecated from provider version 1.120.0. New field 'db_instance_id' instead.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// An KMS encrypts password used to a db account. If the `password` is filled in, this field will be ignored.
	KmsEncryptedPassword pulumi.StringPtrOutput `pulumi:"kmsEncryptedPassword"`
	// An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a db account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
	KmsEncryptionContext pulumi.MapOutput `pulumi:"kmsEncryptionContext"`
	// Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.120.0. New field 'account_name' instead.
	Name pulumi.StringOutput `pulumi:"name"`
	// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters. You have to specify one of `password` and `kmsEncryptedPassword` fields.
	//
	// Deprecated: Field 'password' has been deprecated from provider version 1.120.0. New field 'account_password' instead.
	Password pulumi.StringOutput `pulumi:"password"`
	Status   pulumi.StringOutput `pulumi:"status"`
	// Privilege type of account.
	// - Normal: Common privilege.
	// - Super: High privilege.
	//
	// Deprecated: Field 'type' has been deprecated from provider version 1.120.0. New field 'account_type' instead.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewAccount registers a new resource with the given unique name, arguments, and options.
func NewAccount(ctx *pulumi.Context,
	name string, args *AccountArgs, opts ...pulumi.ResourceOption) (*Account, error) {
	if args == nil {
		args = &AccountArgs{}
	}

	var resource Account
	err := ctx.RegisterResource("alicloud:rds/account:Account", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccount gets an existing Account resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccount(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccountState, opts ...pulumi.ResourceOption) (*Account, error) {
	var resource Account
	err := ctx.ReadResource("alicloud:rds/account:Account", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Account resources.
type accountState struct {
	AccountDescription *string `pulumi:"accountDescription"`
	AccountName        *string `pulumi:"accountName"`
	AccountPassword    *string `pulumi:"accountPassword"`
	AccountType        *string `pulumi:"accountType"`
	DbInstanceId       *string `pulumi:"dbInstanceId"`
	// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
	//
	// Deprecated: Field 'description' has been deprecated from provider version 1.120.0. New field 'account_description' instead.
	Description *string `pulumi:"description"`
	// The Id of instance in which account belongs.
	//
	// Deprecated: Field 'instance_id' has been deprecated from provider version 1.120.0. New field 'db_instance_id' instead.
	InstanceId *string `pulumi:"instanceId"`
	// An KMS encrypts password used to a db account. If the `password` is filled in, this field will be ignored.
	KmsEncryptedPassword *string `pulumi:"kmsEncryptedPassword"`
	// An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a db account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
	KmsEncryptionContext map[string]interface{} `pulumi:"kmsEncryptionContext"`
	// Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.120.0. New field 'account_name' instead.
	Name *string `pulumi:"name"`
	// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters. You have to specify one of `password` and `kmsEncryptedPassword` fields.
	//
	// Deprecated: Field 'password' has been deprecated from provider version 1.120.0. New field 'account_password' instead.
	Password *string `pulumi:"password"`
	Status   *string `pulumi:"status"`
	// Privilege type of account.
	// - Normal: Common privilege.
	// - Super: High privilege.
	//
	// Deprecated: Field 'type' has been deprecated from provider version 1.120.0. New field 'account_type' instead.
	Type *string `pulumi:"type"`
}

type AccountState struct {
	AccountDescription pulumi.StringPtrInput
	AccountName        pulumi.StringPtrInput
	AccountPassword    pulumi.StringPtrInput
	AccountType        pulumi.StringPtrInput
	DbInstanceId       pulumi.StringPtrInput
	// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
	//
	// Deprecated: Field 'description' has been deprecated from provider version 1.120.0. New field 'account_description' instead.
	Description pulumi.StringPtrInput
	// The Id of instance in which account belongs.
	//
	// Deprecated: Field 'instance_id' has been deprecated from provider version 1.120.0. New field 'db_instance_id' instead.
	InstanceId pulumi.StringPtrInput
	// An KMS encrypts password used to a db account. If the `password` is filled in, this field will be ignored.
	KmsEncryptedPassword pulumi.StringPtrInput
	// An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a db account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
	KmsEncryptionContext pulumi.MapInput
	// Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.120.0. New field 'account_name' instead.
	Name pulumi.StringPtrInput
	// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters. You have to specify one of `password` and `kmsEncryptedPassword` fields.
	//
	// Deprecated: Field 'password' has been deprecated from provider version 1.120.0. New field 'account_password' instead.
	Password pulumi.StringPtrInput
	Status   pulumi.StringPtrInput
	// Privilege type of account.
	// - Normal: Common privilege.
	// - Super: High privilege.
	//
	// Deprecated: Field 'type' has been deprecated from provider version 1.120.0. New field 'account_type' instead.
	Type pulumi.StringPtrInput
}

func (AccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*accountState)(nil)).Elem()
}

type accountArgs struct {
	AccountDescription *string `pulumi:"accountDescription"`
	AccountName        *string `pulumi:"accountName"`
	AccountPassword    *string `pulumi:"accountPassword"`
	AccountType        *string `pulumi:"accountType"`
	DbInstanceId       *string `pulumi:"dbInstanceId"`
	// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
	//
	// Deprecated: Field 'description' has been deprecated from provider version 1.120.0. New field 'account_description' instead.
	Description *string `pulumi:"description"`
	// The Id of instance in which account belongs.
	//
	// Deprecated: Field 'instance_id' has been deprecated from provider version 1.120.0. New field 'db_instance_id' instead.
	InstanceId *string `pulumi:"instanceId"`
	// An KMS encrypts password used to a db account. If the `password` is filled in, this field will be ignored.
	KmsEncryptedPassword *string `pulumi:"kmsEncryptedPassword"`
	// An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a db account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
	KmsEncryptionContext map[string]interface{} `pulumi:"kmsEncryptionContext"`
	// Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.120.0. New field 'account_name' instead.
	Name *string `pulumi:"name"`
	// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters. You have to specify one of `password` and `kmsEncryptedPassword` fields.
	//
	// Deprecated: Field 'password' has been deprecated from provider version 1.120.0. New field 'account_password' instead.
	Password *string `pulumi:"password"`
	// Privilege type of account.
	// - Normal: Common privilege.
	// - Super: High privilege.
	//
	// Deprecated: Field 'type' has been deprecated from provider version 1.120.0. New field 'account_type' instead.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a Account resource.
type AccountArgs struct {
	AccountDescription pulumi.StringPtrInput
	AccountName        pulumi.StringPtrInput
	AccountPassword    pulumi.StringPtrInput
	AccountType        pulumi.StringPtrInput
	DbInstanceId       pulumi.StringPtrInput
	// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
	//
	// Deprecated: Field 'description' has been deprecated from provider version 1.120.0. New field 'account_description' instead.
	Description pulumi.StringPtrInput
	// The Id of instance in which account belongs.
	//
	// Deprecated: Field 'instance_id' has been deprecated from provider version 1.120.0. New field 'db_instance_id' instead.
	InstanceId pulumi.StringPtrInput
	// An KMS encrypts password used to a db account. If the `password` is filled in, this field will be ignored.
	KmsEncryptedPassword pulumi.StringPtrInput
	// An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a db account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
	KmsEncryptionContext pulumi.MapInput
	// Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.120.0. New field 'account_name' instead.
	Name pulumi.StringPtrInput
	// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters. You have to specify one of `password` and `kmsEncryptedPassword` fields.
	//
	// Deprecated: Field 'password' has been deprecated from provider version 1.120.0. New field 'account_password' instead.
	Password pulumi.StringPtrInput
	// Privilege type of account.
	// - Normal: Common privilege.
	// - Super: High privilege.
	//
	// Deprecated: Field 'type' has been deprecated from provider version 1.120.0. New field 'account_type' instead.
	Type pulumi.StringPtrInput
}

func (AccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accountArgs)(nil)).Elem()
}

type AccountInput interface {
	pulumi.Input

	ToAccountOutput() AccountOutput
	ToAccountOutputWithContext(ctx context.Context) AccountOutput
}

func (*Account) ElementType() reflect.Type {
	return reflect.TypeOf((**Account)(nil)).Elem()
}

func (i *Account) ToAccountOutput() AccountOutput {
	return i.ToAccountOutputWithContext(context.Background())
}

func (i *Account) ToAccountOutputWithContext(ctx context.Context) AccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountOutput)
}

// AccountArrayInput is an input type that accepts AccountArray and AccountArrayOutput values.
// You can construct a concrete instance of `AccountArrayInput` via:
//
//          AccountArray{ AccountArgs{...} }
type AccountArrayInput interface {
	pulumi.Input

	ToAccountArrayOutput() AccountArrayOutput
	ToAccountArrayOutputWithContext(context.Context) AccountArrayOutput
}

type AccountArray []AccountInput

func (AccountArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Account)(nil)).Elem()
}

func (i AccountArray) ToAccountArrayOutput() AccountArrayOutput {
	return i.ToAccountArrayOutputWithContext(context.Background())
}

func (i AccountArray) ToAccountArrayOutputWithContext(ctx context.Context) AccountArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountArrayOutput)
}

// AccountMapInput is an input type that accepts AccountMap and AccountMapOutput values.
// You can construct a concrete instance of `AccountMapInput` via:
//
//          AccountMap{ "key": AccountArgs{...} }
type AccountMapInput interface {
	pulumi.Input

	ToAccountMapOutput() AccountMapOutput
	ToAccountMapOutputWithContext(context.Context) AccountMapOutput
}

type AccountMap map[string]AccountInput

func (AccountMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Account)(nil)).Elem()
}

func (i AccountMap) ToAccountMapOutput() AccountMapOutput {
	return i.ToAccountMapOutputWithContext(context.Background())
}

func (i AccountMap) ToAccountMapOutputWithContext(ctx context.Context) AccountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountMapOutput)
}

type AccountOutput struct{ *pulumi.OutputState }

func (AccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Account)(nil)).Elem()
}

func (o AccountOutput) ToAccountOutput() AccountOutput {
	return o
}

func (o AccountOutput) ToAccountOutputWithContext(ctx context.Context) AccountOutput {
	return o
}

func (o AccountOutput) AccountDescription() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.AccountDescription }).(pulumi.StringOutput)
}

func (o AccountOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.AccountName }).(pulumi.StringOutput)
}

func (o AccountOutput) AccountPassword() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.AccountPassword }).(pulumi.StringOutput)
}

func (o AccountOutput) AccountType() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.AccountType }).(pulumi.StringOutput)
}

func (o AccountOutput) DbInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.DbInstanceId }).(pulumi.StringOutput)
}

// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
//
// Deprecated: Field 'description' has been deprecated from provider version 1.120.0. New field 'account_description' instead.
func (o AccountOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The Id of instance in which account belongs.
//
// Deprecated: Field 'instance_id' has been deprecated from provider version 1.120.0. New field 'db_instance_id' instead.
func (o AccountOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// An KMS encrypts password used to a db account. If the `password` is filled in, this field will be ignored.
func (o AccountOutput) KmsEncryptedPassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.KmsEncryptedPassword }).(pulumi.StringPtrOutput)
}

// An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a db account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
func (o AccountOutput) KmsEncryptionContext() pulumi.MapOutput {
	return o.ApplyT(func(v *Account) pulumi.MapOutput { return v.KmsEncryptionContext }).(pulumi.MapOutput)
}

// Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
//
// Deprecated: Field 'name' has been deprecated from provider version 1.120.0. New field 'account_name' instead.
func (o AccountOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters. You have to specify one of `password` and `kmsEncryptedPassword` fields.
//
// Deprecated: Field 'password' has been deprecated from provider version 1.120.0. New field 'account_password' instead.
func (o AccountOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

func (o AccountOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Privilege type of account.
// - Normal: Common privilege.
// - Super: High privilege.
//
// Deprecated: Field 'type' has been deprecated from provider version 1.120.0. New field 'account_type' instead.
func (o AccountOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type AccountArrayOutput struct{ *pulumi.OutputState }

func (AccountArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Account)(nil)).Elem()
}

func (o AccountArrayOutput) ToAccountArrayOutput() AccountArrayOutput {
	return o
}

func (o AccountArrayOutput) ToAccountArrayOutputWithContext(ctx context.Context) AccountArrayOutput {
	return o
}

func (o AccountArrayOutput) Index(i pulumi.IntInput) AccountOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Account {
		return vs[0].([]*Account)[vs[1].(int)]
	}).(AccountOutput)
}

type AccountMapOutput struct{ *pulumi.OutputState }

func (AccountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Account)(nil)).Elem()
}

func (o AccountMapOutput) ToAccountMapOutput() AccountMapOutput {
	return o
}

func (o AccountMapOutput) ToAccountMapOutputWithContext(ctx context.Context) AccountMapOutput {
	return o
}

func (o AccountMapOutput) MapIndex(k pulumi.StringInput) AccountOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Account {
		return vs[0].(map[string]*Account)[vs[1].(string)]
	}).(AccountOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccountInput)(nil)).Elem(), &Account{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountArrayInput)(nil)).Elem(), AccountArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountMapInput)(nil)).Elem(), AccountMap{})
	pulumi.RegisterOutputType(AccountOutput{})
	pulumi.RegisterOutputType(AccountArrayOutput{})
	pulumi.RegisterOutputType(AccountMapOutput{})
}
