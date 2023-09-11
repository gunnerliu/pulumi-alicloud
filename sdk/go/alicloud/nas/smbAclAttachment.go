// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Nas Smb Acl resource.
//
// Alibaba Cloud SMB protocol file storage service supports user authentication based on AD domain system and permission access control at the file system level. Connecting and accessing the SMB file system as a domain user can implement the requirements for access control at the file and directory level in the SMB protocol file system. The current Alibaba Cloud SMB protocol file storage service does not support multi-user file and directory-level permission access control, and only provides file system-level authentication and access based on the whitelist mechanism that supports cloud accounts and source IP permission groups control.
// > **NOTE:** Available in 1.186.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/nas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleZones, err := nas.GetZones(ctx, &nas.GetZonesArgs{
//				FileSystemType: pulumi.StringRef("standard"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleFileSystem, err := nas.NewFileSystem(ctx, "exampleFileSystem", &nas.FileSystemArgs{
//				ProtocolType:   pulumi.String("SMB"),
//				StorageType:    pulumi.String("Capacity"),
//				Description:    pulumi.String("terraform-example"),
//				EncryptType:    pulumi.Int(0),
//				FileSystemType: pulumi.String("standard"),
//				ZoneId:         *pulumi.String(exampleZones.Zones[0].ZoneId),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = nas.NewSmbAclAttachment(ctx, "exampleSmbAclAttachment", &nas.SmbAclAttachmentArgs{
//				FileSystemId: exampleFileSystem.ID(),
//				Keytab:       pulumi.String("BQIAAABHAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAAQAIqIx6v7p11oUAAABHAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAAwAIqIx6v7p11oUAAABPAAIADUFMSUFEVEVTVC5DT00ABGNpZnMAGXNtYnNlcnZlcjI0LmFsaWFkdGVzdC5jb20AAAABAAAAAAEAFwAQnQZWB3RAPHU7PMIJyBWePAAAAF8AAgANQUxJQURURVNULkNPTQAEY2lmcwAZc21ic2VydmVyMjQuYWxpYWR0ZXN0LmNvbQAAAAEAAAAAAQASACAGJ7F0s+bcBjf6jD5HlvlRLmPSOW+qDZe0Qk0lQcf8WwAAAE8AAgANQUxJQURURVNULkNPTQAEY2lmcwAZc21ic2VydmVyMjQuYWxpYWR0ZXN0LmNvbQAAAAEAAAAAAQARABDdFmanrSIatnDDhoOXYadj"),
//				KeytabMd5:    pulumi.String("E3CCF7E2416DF04FA958AA4513EA29E8"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type SmbAclAttachment struct {
	pulumi.CustomResourceState

	// The method that is used to authenticate network identities.
	AuthMethod pulumi.StringOutput `pulumi:"authMethod"`
	// Specifies whether to allow anonymous access. Valid values:
	// true: The file system allows anonymous access.
	// false: The file system denies anonymous access. Default value: false.
	EnableAnonymousAccess pulumi.BoolPtrOutput `pulumi:"enableAnonymousAccess"`
	// Specifies whether to enable the ACL feature.
	// true: enables the ACL feature.
	// false: disables the ACL feature.
	Enabled pulumi.StringOutput `pulumi:"enabled"`
	// Specifies whether to enable encryption in transit. Valid values:
	// true: enables encryption in transit.
	// false: disables encryption in transit. Default value: false.
	EncryptData pulumi.BoolPtrOutput `pulumi:"encryptData"`
	// The ID of the file system.
	FileSystemId pulumi.StringOutput `pulumi:"fileSystemId"`
	// The home directory of each user. Each user-specific home directory must meet the following requirements:\
	// Each segment starts with a forward slash (/) or a backslash (\).
	// Each segment does not contain the following special characters: <>":?*.
	// Each segment is 0 to 255 characters in length.
	// The total length is 0 to 32,767 characters.
	// For example, if you create a user named A and the home directory is /home, the file system automatically creates a directory named /home/A when User A logs on to the file system. If the /home/A directory already exists, the file system does not create the directory.
	HomeDirPath pulumi.StringPtrOutput `pulumi:"homeDirPath"`
	// The string that is generated after the system encodes the keytab file by using Base64.
	Keytab pulumi.StringOutput `pulumi:"keytab"`
	// RThe string that is generated after the system encodes the keytab file by using MD5.
	KeytabMd5 pulumi.StringOutput `pulumi:"keytabMd5"`
	// Specifies whether to deny access from non-encrypted clients. Valid values:
	// true: The file system denies access from non-encrypted clients.
	// false: The file system allows access from non-encrypted clients. Default value: false.
	RejectUnencryptedAccess pulumi.BoolPtrOutput `pulumi:"rejectUnencryptedAccess"`
	// The ID of a super admin. The ID must meet the following requirements:
	// The ID starts with S and does not contain letters except S.
	// The ID contains at least three hyphens (-) as delimiters.
	// Example: S-1-5-22 and S-1-5-22-23.
	SuperAdminSid pulumi.StringPtrOutput `pulumi:"superAdminSid"`
}

// NewSmbAclAttachment registers a new resource with the given unique name, arguments, and options.
func NewSmbAclAttachment(ctx *pulumi.Context,
	name string, args *SmbAclAttachmentArgs, opts ...pulumi.ResourceOption) (*SmbAclAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FileSystemId == nil {
		return nil, errors.New("invalid value for required argument 'FileSystemId'")
	}
	if args.Keytab == nil {
		return nil, errors.New("invalid value for required argument 'Keytab'")
	}
	if args.KeytabMd5 == nil {
		return nil, errors.New("invalid value for required argument 'KeytabMd5'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SmbAclAttachment
	err := ctx.RegisterResource("alicloud:nas/smbAclAttachment:SmbAclAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSmbAclAttachment gets an existing SmbAclAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSmbAclAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SmbAclAttachmentState, opts ...pulumi.ResourceOption) (*SmbAclAttachment, error) {
	var resource SmbAclAttachment
	err := ctx.ReadResource("alicloud:nas/smbAclAttachment:SmbAclAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SmbAclAttachment resources.
type smbAclAttachmentState struct {
	// The method that is used to authenticate network identities.
	AuthMethod *string `pulumi:"authMethod"`
	// Specifies whether to allow anonymous access. Valid values:
	// true: The file system allows anonymous access.
	// false: The file system denies anonymous access. Default value: false.
	EnableAnonymousAccess *bool `pulumi:"enableAnonymousAccess"`
	// Specifies whether to enable the ACL feature.
	// true: enables the ACL feature.
	// false: disables the ACL feature.
	Enabled *string `pulumi:"enabled"`
	// Specifies whether to enable encryption in transit. Valid values:
	// true: enables encryption in transit.
	// false: disables encryption in transit. Default value: false.
	EncryptData *bool `pulumi:"encryptData"`
	// The ID of the file system.
	FileSystemId *string `pulumi:"fileSystemId"`
	// The home directory of each user. Each user-specific home directory must meet the following requirements:\
	// Each segment starts with a forward slash (/) or a backslash (\).
	// Each segment does not contain the following special characters: <>":?*.
	// Each segment is 0 to 255 characters in length.
	// The total length is 0 to 32,767 characters.
	// For example, if you create a user named A and the home directory is /home, the file system automatically creates a directory named /home/A when User A logs on to the file system. If the /home/A directory already exists, the file system does not create the directory.
	HomeDirPath *string `pulumi:"homeDirPath"`
	// The string that is generated after the system encodes the keytab file by using Base64.
	Keytab *string `pulumi:"keytab"`
	// RThe string that is generated after the system encodes the keytab file by using MD5.
	KeytabMd5 *string `pulumi:"keytabMd5"`
	// Specifies whether to deny access from non-encrypted clients. Valid values:
	// true: The file system denies access from non-encrypted clients.
	// false: The file system allows access from non-encrypted clients. Default value: false.
	RejectUnencryptedAccess *bool `pulumi:"rejectUnencryptedAccess"`
	// The ID of a super admin. The ID must meet the following requirements:
	// The ID starts with S and does not contain letters except S.
	// The ID contains at least three hyphens (-) as delimiters.
	// Example: S-1-5-22 and S-1-5-22-23.
	SuperAdminSid *string `pulumi:"superAdminSid"`
}

type SmbAclAttachmentState struct {
	// The method that is used to authenticate network identities.
	AuthMethod pulumi.StringPtrInput
	// Specifies whether to allow anonymous access. Valid values:
	// true: The file system allows anonymous access.
	// false: The file system denies anonymous access. Default value: false.
	EnableAnonymousAccess pulumi.BoolPtrInput
	// Specifies whether to enable the ACL feature.
	// true: enables the ACL feature.
	// false: disables the ACL feature.
	Enabled pulumi.StringPtrInput
	// Specifies whether to enable encryption in transit. Valid values:
	// true: enables encryption in transit.
	// false: disables encryption in transit. Default value: false.
	EncryptData pulumi.BoolPtrInput
	// The ID of the file system.
	FileSystemId pulumi.StringPtrInput
	// The home directory of each user. Each user-specific home directory must meet the following requirements:\
	// Each segment starts with a forward slash (/) or a backslash (\).
	// Each segment does not contain the following special characters: <>":?*.
	// Each segment is 0 to 255 characters in length.
	// The total length is 0 to 32,767 characters.
	// For example, if you create a user named A and the home directory is /home, the file system automatically creates a directory named /home/A when User A logs on to the file system. If the /home/A directory already exists, the file system does not create the directory.
	HomeDirPath pulumi.StringPtrInput
	// The string that is generated after the system encodes the keytab file by using Base64.
	Keytab pulumi.StringPtrInput
	// RThe string that is generated after the system encodes the keytab file by using MD5.
	KeytabMd5 pulumi.StringPtrInput
	// Specifies whether to deny access from non-encrypted clients. Valid values:
	// true: The file system denies access from non-encrypted clients.
	// false: The file system allows access from non-encrypted clients. Default value: false.
	RejectUnencryptedAccess pulumi.BoolPtrInput
	// The ID of a super admin. The ID must meet the following requirements:
	// The ID starts with S and does not contain letters except S.
	// The ID contains at least three hyphens (-) as delimiters.
	// Example: S-1-5-22 and S-1-5-22-23.
	SuperAdminSid pulumi.StringPtrInput
}

func (SmbAclAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*smbAclAttachmentState)(nil)).Elem()
}

type smbAclAttachmentArgs struct {
	// Specifies whether to allow anonymous access. Valid values:
	// true: The file system allows anonymous access.
	// false: The file system denies anonymous access. Default value: false.
	EnableAnonymousAccess *bool `pulumi:"enableAnonymousAccess"`
	// Specifies whether to enable encryption in transit. Valid values:
	// true: enables encryption in transit.
	// false: disables encryption in transit. Default value: false.
	EncryptData *bool `pulumi:"encryptData"`
	// The ID of the file system.
	FileSystemId string `pulumi:"fileSystemId"`
	// The home directory of each user. Each user-specific home directory must meet the following requirements:\
	// Each segment starts with a forward slash (/) or a backslash (\).
	// Each segment does not contain the following special characters: <>":?*.
	// Each segment is 0 to 255 characters in length.
	// The total length is 0 to 32,767 characters.
	// For example, if you create a user named A and the home directory is /home, the file system automatically creates a directory named /home/A when User A logs on to the file system. If the /home/A directory already exists, the file system does not create the directory.
	HomeDirPath *string `pulumi:"homeDirPath"`
	// The string that is generated after the system encodes the keytab file by using Base64.
	Keytab string `pulumi:"keytab"`
	// RThe string that is generated after the system encodes the keytab file by using MD5.
	KeytabMd5 string `pulumi:"keytabMd5"`
	// Specifies whether to deny access from non-encrypted clients. Valid values:
	// true: The file system denies access from non-encrypted clients.
	// false: The file system allows access from non-encrypted clients. Default value: false.
	RejectUnencryptedAccess *bool `pulumi:"rejectUnencryptedAccess"`
	// The ID of a super admin. The ID must meet the following requirements:
	// The ID starts with S and does not contain letters except S.
	// The ID contains at least three hyphens (-) as delimiters.
	// Example: S-1-5-22 and S-1-5-22-23.
	SuperAdminSid *string `pulumi:"superAdminSid"`
}

// The set of arguments for constructing a SmbAclAttachment resource.
type SmbAclAttachmentArgs struct {
	// Specifies whether to allow anonymous access. Valid values:
	// true: The file system allows anonymous access.
	// false: The file system denies anonymous access. Default value: false.
	EnableAnonymousAccess pulumi.BoolPtrInput
	// Specifies whether to enable encryption in transit. Valid values:
	// true: enables encryption in transit.
	// false: disables encryption in transit. Default value: false.
	EncryptData pulumi.BoolPtrInput
	// The ID of the file system.
	FileSystemId pulumi.StringInput
	// The home directory of each user. Each user-specific home directory must meet the following requirements:\
	// Each segment starts with a forward slash (/) or a backslash (\).
	// Each segment does not contain the following special characters: <>":?*.
	// Each segment is 0 to 255 characters in length.
	// The total length is 0 to 32,767 characters.
	// For example, if you create a user named A and the home directory is /home, the file system automatically creates a directory named /home/A when User A logs on to the file system. If the /home/A directory already exists, the file system does not create the directory.
	HomeDirPath pulumi.StringPtrInput
	// The string that is generated after the system encodes the keytab file by using Base64.
	Keytab pulumi.StringInput
	// RThe string that is generated after the system encodes the keytab file by using MD5.
	KeytabMd5 pulumi.StringInput
	// Specifies whether to deny access from non-encrypted clients. Valid values:
	// true: The file system denies access from non-encrypted clients.
	// false: The file system allows access from non-encrypted clients. Default value: false.
	RejectUnencryptedAccess pulumi.BoolPtrInput
	// The ID of a super admin. The ID must meet the following requirements:
	// The ID starts with S and does not contain letters except S.
	// The ID contains at least three hyphens (-) as delimiters.
	// Example: S-1-5-22 and S-1-5-22-23.
	SuperAdminSid pulumi.StringPtrInput
}

func (SmbAclAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*smbAclAttachmentArgs)(nil)).Elem()
}

type SmbAclAttachmentInput interface {
	pulumi.Input

	ToSmbAclAttachmentOutput() SmbAclAttachmentOutput
	ToSmbAclAttachmentOutputWithContext(ctx context.Context) SmbAclAttachmentOutput
}

func (*SmbAclAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**SmbAclAttachment)(nil)).Elem()
}

func (i *SmbAclAttachment) ToSmbAclAttachmentOutput() SmbAclAttachmentOutput {
	return i.ToSmbAclAttachmentOutputWithContext(context.Background())
}

func (i *SmbAclAttachment) ToSmbAclAttachmentOutputWithContext(ctx context.Context) SmbAclAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmbAclAttachmentOutput)
}

func (i *SmbAclAttachment) ToOutput(ctx context.Context) pulumix.Output[*SmbAclAttachment] {
	return pulumix.Output[*SmbAclAttachment]{
		OutputState: i.ToSmbAclAttachmentOutputWithContext(ctx).OutputState,
	}
}

// SmbAclAttachmentArrayInput is an input type that accepts SmbAclAttachmentArray and SmbAclAttachmentArrayOutput values.
// You can construct a concrete instance of `SmbAclAttachmentArrayInput` via:
//
//	SmbAclAttachmentArray{ SmbAclAttachmentArgs{...} }
type SmbAclAttachmentArrayInput interface {
	pulumi.Input

	ToSmbAclAttachmentArrayOutput() SmbAclAttachmentArrayOutput
	ToSmbAclAttachmentArrayOutputWithContext(context.Context) SmbAclAttachmentArrayOutput
}

type SmbAclAttachmentArray []SmbAclAttachmentInput

func (SmbAclAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmbAclAttachment)(nil)).Elem()
}

func (i SmbAclAttachmentArray) ToSmbAclAttachmentArrayOutput() SmbAclAttachmentArrayOutput {
	return i.ToSmbAclAttachmentArrayOutputWithContext(context.Background())
}

func (i SmbAclAttachmentArray) ToSmbAclAttachmentArrayOutputWithContext(ctx context.Context) SmbAclAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmbAclAttachmentArrayOutput)
}

func (i SmbAclAttachmentArray) ToOutput(ctx context.Context) pulumix.Output[[]*SmbAclAttachment] {
	return pulumix.Output[[]*SmbAclAttachment]{
		OutputState: i.ToSmbAclAttachmentArrayOutputWithContext(ctx).OutputState,
	}
}

// SmbAclAttachmentMapInput is an input type that accepts SmbAclAttachmentMap and SmbAclAttachmentMapOutput values.
// You can construct a concrete instance of `SmbAclAttachmentMapInput` via:
//
//	SmbAclAttachmentMap{ "key": SmbAclAttachmentArgs{...} }
type SmbAclAttachmentMapInput interface {
	pulumi.Input

	ToSmbAclAttachmentMapOutput() SmbAclAttachmentMapOutput
	ToSmbAclAttachmentMapOutputWithContext(context.Context) SmbAclAttachmentMapOutput
}

type SmbAclAttachmentMap map[string]SmbAclAttachmentInput

func (SmbAclAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmbAclAttachment)(nil)).Elem()
}

func (i SmbAclAttachmentMap) ToSmbAclAttachmentMapOutput() SmbAclAttachmentMapOutput {
	return i.ToSmbAclAttachmentMapOutputWithContext(context.Background())
}

func (i SmbAclAttachmentMap) ToSmbAclAttachmentMapOutputWithContext(ctx context.Context) SmbAclAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SmbAclAttachmentMapOutput)
}

func (i SmbAclAttachmentMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*SmbAclAttachment] {
	return pulumix.Output[map[string]*SmbAclAttachment]{
		OutputState: i.ToSmbAclAttachmentMapOutputWithContext(ctx).OutputState,
	}
}

type SmbAclAttachmentOutput struct{ *pulumi.OutputState }

func (SmbAclAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SmbAclAttachment)(nil)).Elem()
}

func (o SmbAclAttachmentOutput) ToSmbAclAttachmentOutput() SmbAclAttachmentOutput {
	return o
}

func (o SmbAclAttachmentOutput) ToSmbAclAttachmentOutputWithContext(ctx context.Context) SmbAclAttachmentOutput {
	return o
}

func (o SmbAclAttachmentOutput) ToOutput(ctx context.Context) pulumix.Output[*SmbAclAttachment] {
	return pulumix.Output[*SmbAclAttachment]{
		OutputState: o.OutputState,
	}
}

// The method that is used to authenticate network identities.
func (o SmbAclAttachmentOutput) AuthMethod() pulumi.StringOutput {
	return o.ApplyT(func(v *SmbAclAttachment) pulumi.StringOutput { return v.AuthMethod }).(pulumi.StringOutput)
}

// Specifies whether to allow anonymous access. Valid values:
// true: The file system allows anonymous access.
// false: The file system denies anonymous access. Default value: false.
func (o SmbAclAttachmentOutput) EnableAnonymousAccess() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SmbAclAttachment) pulumi.BoolPtrOutput { return v.EnableAnonymousAccess }).(pulumi.BoolPtrOutput)
}

// Specifies whether to enable the ACL feature.
// true: enables the ACL feature.
// false: disables the ACL feature.
func (o SmbAclAttachmentOutput) Enabled() pulumi.StringOutput {
	return o.ApplyT(func(v *SmbAclAttachment) pulumi.StringOutput { return v.Enabled }).(pulumi.StringOutput)
}

// Specifies whether to enable encryption in transit. Valid values:
// true: enables encryption in transit.
// false: disables encryption in transit. Default value: false.
func (o SmbAclAttachmentOutput) EncryptData() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SmbAclAttachment) pulumi.BoolPtrOutput { return v.EncryptData }).(pulumi.BoolPtrOutput)
}

// The ID of the file system.
func (o SmbAclAttachmentOutput) FileSystemId() pulumi.StringOutput {
	return o.ApplyT(func(v *SmbAclAttachment) pulumi.StringOutput { return v.FileSystemId }).(pulumi.StringOutput)
}

// The home directory of each user. Each user-specific home directory must meet the following requirements:\
// Each segment starts with a forward slash (/) or a backslash (\).
// Each segment does not contain the following special characters: <>":?*.
// Each segment is 0 to 255 characters in length.
// The total length is 0 to 32,767 characters.
// For example, if you create a user named A and the home directory is /home, the file system automatically creates a directory named /home/A when User A logs on to the file system. If the /home/A directory already exists, the file system does not create the directory.
func (o SmbAclAttachmentOutput) HomeDirPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SmbAclAttachment) pulumi.StringPtrOutput { return v.HomeDirPath }).(pulumi.StringPtrOutput)
}

// The string that is generated after the system encodes the keytab file by using Base64.
func (o SmbAclAttachmentOutput) Keytab() pulumi.StringOutput {
	return o.ApplyT(func(v *SmbAclAttachment) pulumi.StringOutput { return v.Keytab }).(pulumi.StringOutput)
}

// RThe string that is generated after the system encodes the keytab file by using MD5.
func (o SmbAclAttachmentOutput) KeytabMd5() pulumi.StringOutput {
	return o.ApplyT(func(v *SmbAclAttachment) pulumi.StringOutput { return v.KeytabMd5 }).(pulumi.StringOutput)
}

// Specifies whether to deny access from non-encrypted clients. Valid values:
// true: The file system denies access from non-encrypted clients.
// false: The file system allows access from non-encrypted clients. Default value: false.
func (o SmbAclAttachmentOutput) RejectUnencryptedAccess() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SmbAclAttachment) pulumi.BoolPtrOutput { return v.RejectUnencryptedAccess }).(pulumi.BoolPtrOutput)
}

// The ID of a super admin. The ID must meet the following requirements:
// The ID starts with S and does not contain letters except S.
// The ID contains at least three hyphens (-) as delimiters.
// Example: S-1-5-22 and S-1-5-22-23.
func (o SmbAclAttachmentOutput) SuperAdminSid() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SmbAclAttachment) pulumi.StringPtrOutput { return v.SuperAdminSid }).(pulumi.StringPtrOutput)
}

type SmbAclAttachmentArrayOutput struct{ *pulumi.OutputState }

func (SmbAclAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SmbAclAttachment)(nil)).Elem()
}

func (o SmbAclAttachmentArrayOutput) ToSmbAclAttachmentArrayOutput() SmbAclAttachmentArrayOutput {
	return o
}

func (o SmbAclAttachmentArrayOutput) ToSmbAclAttachmentArrayOutputWithContext(ctx context.Context) SmbAclAttachmentArrayOutput {
	return o
}

func (o SmbAclAttachmentArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*SmbAclAttachment] {
	return pulumix.Output[[]*SmbAclAttachment]{
		OutputState: o.OutputState,
	}
}

func (o SmbAclAttachmentArrayOutput) Index(i pulumi.IntInput) SmbAclAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SmbAclAttachment {
		return vs[0].([]*SmbAclAttachment)[vs[1].(int)]
	}).(SmbAclAttachmentOutput)
}

type SmbAclAttachmentMapOutput struct{ *pulumi.OutputState }

func (SmbAclAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SmbAclAttachment)(nil)).Elem()
}

func (o SmbAclAttachmentMapOutput) ToSmbAclAttachmentMapOutput() SmbAclAttachmentMapOutput {
	return o
}

func (o SmbAclAttachmentMapOutput) ToSmbAclAttachmentMapOutputWithContext(ctx context.Context) SmbAclAttachmentMapOutput {
	return o
}

func (o SmbAclAttachmentMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*SmbAclAttachment] {
	return pulumix.Output[map[string]*SmbAclAttachment]{
		OutputState: o.OutputState,
	}
}

func (o SmbAclAttachmentMapOutput) MapIndex(k pulumi.StringInput) SmbAclAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SmbAclAttachment {
		return vs[0].(map[string]*SmbAclAttachment)[vs[1].(string)]
	}).(SmbAclAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SmbAclAttachmentInput)(nil)).Elem(), &SmbAclAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmbAclAttachmentArrayInput)(nil)).Elem(), SmbAclAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SmbAclAttachmentMapInput)(nil)).Elem(), SmbAclAttachmentMap{})
	pulumi.RegisterOutputType(SmbAclAttachmentOutput{})
	pulumi.RegisterOutputType(SmbAclAttachmentArrayOutput{})
	pulumi.RegisterOutputType(SmbAclAttachmentMapOutput{})
}
