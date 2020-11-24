// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package kvstore

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a KVStore Account resource.
//
// For information about KVStore Account and how to use it, see [What is Account](https://www.alibabacloud.com/help/doc-detail/95973.htm).
//
// > **NOTE:** Available in 1.66.0+
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/kvstore"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		creation := "KVStore"
// 		if param := cfg.Get("creation"); param != "" {
// 			creation = param
// 		}
// 		name := "kvstoreinstancevpc"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		opt0 := creation
// 		defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
// 			AvailableResourceCreation: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
// 			CidrBlock: pulumi.String("172.16.0.0/16"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
// 			VpcId:            defaultNetwork.ID(),
// 			CidrBlock:        pulumi.String("172.16.0.0/24"),
// 			AvailabilityZone: pulumi.String(defaultZones.Zones[0].Id),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultInstance, err := kvstore.NewInstance(ctx, "defaultInstance", &kvstore.InstanceArgs{
// 			InstanceClass: pulumi.String("redis.master.small.default"),
// 			InstanceName:  pulumi.String(name),
// 			VswitchId:     defaultSwitch.ID(),
// 			PrivateIp:     pulumi.String("172.16.0.10"),
// 			SecurityIps: pulumi.StringArray{
// 				pulumi.String("10.0.0.1"),
// 			},
// 			InstanceType:  pulumi.String("Redis"),
// 			EngineVersion: pulumi.String("4.0"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = kvstore.NewAccount(ctx, "example", &kvstore.AccountArgs{
// 			AccountName:     pulumi.String("tftestnormal"),
// 			AccountPassword: pulumi.String("YourPassword_123"),
// 			InstanceId:      defaultInstance.ID(),
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
// KVStore account can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:kvstore/account:Account example <instance_id>:<account_name>
// ```
type Account struct {
	pulumi.CustomResourceState

	// The name of the account. The name must be 1 to 16 characters in length and contain lowercase letters, digits, and underscores (_). It must start with a lowercase letter.
	AccountName pulumi.StringOutput `pulumi:"accountName"`
	// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters. You have to specify one of `accountPassword` and `kmsEncryptedPassword` fields.
	AccountPassword pulumi.StringPtrOutput `pulumi:"accountPassword"`
	// The privilege of account access database. Valid values:
	// - RoleReadOnly: This value is only for Redis and Memcache
	// - RoleReadWrite: This value is only for Redis and Memcache
	// - RoleRepl: This value supports instance to read, write, and open SYNC / PSYNC commands.
	//   Only for Redis which engine version is 4.0 and architecture type is standard
	AccountPrivilege pulumi.StringPtrOutput `pulumi:"accountPrivilege"`
	// Privilege type of account.
	// - Normal: Common privilege.
	//   Default to Normal.
	AccountType pulumi.StringPtrOutput `pulumi:"accountType"`
	// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The Id of instance in which account belongs (The engine version of instance must be 4.0 or 4.0+).
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// An KMS encrypts password used to a KVStore account. If the `accountPassword` is filled in, this field will be ignored.
	KmsEncryptedPassword pulumi.StringPtrOutput `pulumi:"kmsEncryptedPassword"`
	// An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a KVStore account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
	KmsEncryptionContext pulumi.MapOutput `pulumi:"kmsEncryptionContext"`
	// The status of KVStore Account.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewAccount registers a new resource with the given unique name, arguments, and options.
func NewAccount(ctx *pulumi.Context,
	name string, args *AccountArgs, opts ...pulumi.ResourceOption) (*Account, error) {
	if args == nil || args.AccountName == nil {
		return nil, errors.New("missing required argument 'AccountName'")
	}
	if args == nil || args.InstanceId == nil {
		return nil, errors.New("missing required argument 'InstanceId'")
	}
	if args == nil {
		args = &AccountArgs{}
	}
	var resource Account
	err := ctx.RegisterResource("alicloud:kvstore/account:Account", name, args, &resource, opts...)
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
	err := ctx.ReadResource("alicloud:kvstore/account:Account", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Account resources.
type accountState struct {
	// The name of the account. The name must be 1 to 16 characters in length and contain lowercase letters, digits, and underscores (_). It must start with a lowercase letter.
	AccountName *string `pulumi:"accountName"`
	// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters. You have to specify one of `accountPassword` and `kmsEncryptedPassword` fields.
	AccountPassword *string `pulumi:"accountPassword"`
	// The privilege of account access database. Valid values:
	// - RoleReadOnly: This value is only for Redis and Memcache
	// - RoleReadWrite: This value is only for Redis and Memcache
	// - RoleRepl: This value supports instance to read, write, and open SYNC / PSYNC commands.
	//   Only for Redis which engine version is 4.0 and architecture type is standard
	AccountPrivilege *string `pulumi:"accountPrivilege"`
	// Privilege type of account.
	// - Normal: Common privilege.
	//   Default to Normal.
	AccountType *string `pulumi:"accountType"`
	// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
	Description *string `pulumi:"description"`
	// The Id of instance in which account belongs (The engine version of instance must be 4.0 or 4.0+).
	InstanceId *string `pulumi:"instanceId"`
	// An KMS encrypts password used to a KVStore account. If the `accountPassword` is filled in, this field will be ignored.
	KmsEncryptedPassword *string `pulumi:"kmsEncryptedPassword"`
	// An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a KVStore account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
	KmsEncryptionContext map[string]interface{} `pulumi:"kmsEncryptionContext"`
	// The status of KVStore Account.
	Status *string `pulumi:"status"`
}

type AccountState struct {
	// The name of the account. The name must be 1 to 16 characters in length and contain lowercase letters, digits, and underscores (_). It must start with a lowercase letter.
	AccountName pulumi.StringPtrInput
	// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters. You have to specify one of `accountPassword` and `kmsEncryptedPassword` fields.
	AccountPassword pulumi.StringPtrInput
	// The privilege of account access database. Valid values:
	// - RoleReadOnly: This value is only for Redis and Memcache
	// - RoleReadWrite: This value is only for Redis and Memcache
	// - RoleRepl: This value supports instance to read, write, and open SYNC / PSYNC commands.
	//   Only for Redis which engine version is 4.0 and architecture type is standard
	AccountPrivilege pulumi.StringPtrInput
	// Privilege type of account.
	// - Normal: Common privilege.
	//   Default to Normal.
	AccountType pulumi.StringPtrInput
	// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
	Description pulumi.StringPtrInput
	// The Id of instance in which account belongs (The engine version of instance must be 4.0 or 4.0+).
	InstanceId pulumi.StringPtrInput
	// An KMS encrypts password used to a KVStore account. If the `accountPassword` is filled in, this field will be ignored.
	KmsEncryptedPassword pulumi.StringPtrInput
	// An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a KVStore account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
	KmsEncryptionContext pulumi.MapInput
	// The status of KVStore Account.
	Status pulumi.StringPtrInput
}

func (AccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*accountState)(nil)).Elem()
}

type accountArgs struct {
	// The name of the account. The name must be 1 to 16 characters in length and contain lowercase letters, digits, and underscores (_). It must start with a lowercase letter.
	AccountName string `pulumi:"accountName"`
	// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters. You have to specify one of `accountPassword` and `kmsEncryptedPassword` fields.
	AccountPassword *string `pulumi:"accountPassword"`
	// The privilege of account access database. Valid values:
	// - RoleReadOnly: This value is only for Redis and Memcache
	// - RoleReadWrite: This value is only for Redis and Memcache
	// - RoleRepl: This value supports instance to read, write, and open SYNC / PSYNC commands.
	//   Only for Redis which engine version is 4.0 and architecture type is standard
	AccountPrivilege *string `pulumi:"accountPrivilege"`
	// Privilege type of account.
	// - Normal: Common privilege.
	//   Default to Normal.
	AccountType *string `pulumi:"accountType"`
	// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
	Description *string `pulumi:"description"`
	// The Id of instance in which account belongs (The engine version of instance must be 4.0 or 4.0+).
	InstanceId string `pulumi:"instanceId"`
	// An KMS encrypts password used to a KVStore account. If the `accountPassword` is filled in, this field will be ignored.
	KmsEncryptedPassword *string `pulumi:"kmsEncryptedPassword"`
	// An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a KVStore account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
	KmsEncryptionContext map[string]interface{} `pulumi:"kmsEncryptionContext"`
}

// The set of arguments for constructing a Account resource.
type AccountArgs struct {
	// The name of the account. The name must be 1 to 16 characters in length and contain lowercase letters, digits, and underscores (_). It must start with a lowercase letter.
	AccountName pulumi.StringInput
	// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters. You have to specify one of `accountPassword` and `kmsEncryptedPassword` fields.
	AccountPassword pulumi.StringPtrInput
	// The privilege of account access database. Valid values:
	// - RoleReadOnly: This value is only for Redis and Memcache
	// - RoleReadWrite: This value is only for Redis and Memcache
	// - RoleRepl: This value supports instance to read, write, and open SYNC / PSYNC commands.
	//   Only for Redis which engine version is 4.0 and architecture type is standard
	AccountPrivilege pulumi.StringPtrInput
	// Privilege type of account.
	// - Normal: Common privilege.
	//   Default to Normal.
	AccountType pulumi.StringPtrInput
	// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
	Description pulumi.StringPtrInput
	// The Id of instance in which account belongs (The engine version of instance must be 4.0 or 4.0+).
	InstanceId pulumi.StringInput
	// An KMS encrypts password used to a KVStore account. If the `accountPassword` is filled in, this field will be ignored.
	KmsEncryptedPassword pulumi.StringPtrInput
	// An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a KVStore account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
	KmsEncryptionContext pulumi.MapInput
}

func (AccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accountArgs)(nil)).Elem()
}

type AccountInput interface {
	pulumi.Input

	ToAccountOutput() AccountOutput
	ToAccountOutputWithContext(ctx context.Context) AccountOutput
}

func (Account) ElementType() reflect.Type {
	return reflect.TypeOf((*Account)(nil)).Elem()
}

func (i Account) ToAccountOutput() AccountOutput {
	return i.ToAccountOutputWithContext(context.Background())
}

func (i Account) ToAccountOutputWithContext(ctx context.Context) AccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountOutput)
}

type AccountOutput struct {
	*pulumi.OutputState
}

func (AccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AccountOutput)(nil)).Elem()
}

func (o AccountOutput) ToAccountOutput() AccountOutput {
	return o
}

func (o AccountOutput) ToAccountOutputWithContext(ctx context.Context) AccountOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(AccountOutput{})
}
