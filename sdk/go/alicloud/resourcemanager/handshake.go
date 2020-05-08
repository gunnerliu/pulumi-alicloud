// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package resourcemanager

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Resource Manager handshake resource. You can invite accounts to join a resource directory for unified management.
// For information about Resource Manager handshake and how to use it, see [What is Resource Manager handshake](https://www.alibabacloud.com/help/en/doc-detail/135287.htm).
//
// > **NOTE:** Available in v1.82.0+.
type Handshake struct {
	pulumi.CustomResourceState

	// The expiration time of the invitation.
	ExpireTime pulumi.StringOutput `pulumi:"expireTime"`
	// Resource account master account ID.
	MasterAccountId pulumi.StringOutput `pulumi:"masterAccountId"`
	// The name of the main account of the resource directory.
	MasterAccountName pulumi.StringOutput `pulumi:"masterAccountName"`
	// The modification time of the invitation.
	ModifyTime pulumi.StringOutput `pulumi:"modifyTime"`
	// Remarks. The maximum length is 1024 characters.
	Note pulumi.StringPtrOutput `pulumi:"note"`
	// Resource directory ID.
	ResourceDirectoryId pulumi.StringOutput `pulumi:"resourceDirectoryId"`
	// Invitation status. Valid values: `Pending` waiting for confirmation, `Accepted`, `Cancelled`, `Declined`, `Expired`.
	Status pulumi.StringOutput `pulumi:"status"`
	// Invited account ID or login email.
	TargetEntity pulumi.StringOutput `pulumi:"targetEntity"`
	// Type of account being invited. Valid values: `Account`, `Email`.
	TargetType pulumi.StringOutput `pulumi:"targetType"`
}

// NewHandshake registers a new resource with the given unique name, arguments, and options.
func NewHandshake(ctx *pulumi.Context,
	name string, args *HandshakeArgs, opts ...pulumi.ResourceOption) (*Handshake, error) {
	if args == nil || args.TargetEntity == nil {
		return nil, errors.New("missing required argument 'TargetEntity'")
	}
	if args == nil || args.TargetType == nil {
		return nil, errors.New("missing required argument 'TargetType'")
	}
	if args == nil {
		args = &HandshakeArgs{}
	}
	var resource Handshake
	err := ctx.RegisterResource("alicloud:resourcemanager/handshake:Handshake", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHandshake gets an existing Handshake resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHandshake(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HandshakeState, opts ...pulumi.ResourceOption) (*Handshake, error) {
	var resource Handshake
	err := ctx.ReadResource("alicloud:resourcemanager/handshake:Handshake", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Handshake resources.
type handshakeState struct {
	// The expiration time of the invitation.
	ExpireTime *string `pulumi:"expireTime"`
	// Resource account master account ID.
	MasterAccountId *string `pulumi:"masterAccountId"`
	// The name of the main account of the resource directory.
	MasterAccountName *string `pulumi:"masterAccountName"`
	// The modification time of the invitation.
	ModifyTime *string `pulumi:"modifyTime"`
	// Remarks. The maximum length is 1024 characters.
	Note *string `pulumi:"note"`
	// Resource directory ID.
	ResourceDirectoryId *string `pulumi:"resourceDirectoryId"`
	// Invitation status. Valid values: `Pending` waiting for confirmation, `Accepted`, `Cancelled`, `Declined`, `Expired`.
	Status *string `pulumi:"status"`
	// Invited account ID or login email.
	TargetEntity *string `pulumi:"targetEntity"`
	// Type of account being invited. Valid values: `Account`, `Email`.
	TargetType *string `pulumi:"targetType"`
}

type HandshakeState struct {
	// The expiration time of the invitation.
	ExpireTime pulumi.StringPtrInput
	// Resource account master account ID.
	MasterAccountId pulumi.StringPtrInput
	// The name of the main account of the resource directory.
	MasterAccountName pulumi.StringPtrInput
	// The modification time of the invitation.
	ModifyTime pulumi.StringPtrInput
	// Remarks. The maximum length is 1024 characters.
	Note pulumi.StringPtrInput
	// Resource directory ID.
	ResourceDirectoryId pulumi.StringPtrInput
	// Invitation status. Valid values: `Pending` waiting for confirmation, `Accepted`, `Cancelled`, `Declined`, `Expired`.
	Status pulumi.StringPtrInput
	// Invited account ID or login email.
	TargetEntity pulumi.StringPtrInput
	// Type of account being invited. Valid values: `Account`, `Email`.
	TargetType pulumi.StringPtrInput
}

func (HandshakeState) ElementType() reflect.Type {
	return reflect.TypeOf((*handshakeState)(nil)).Elem()
}

type handshakeArgs struct {
	// Remarks. The maximum length is 1024 characters.
	Note *string `pulumi:"note"`
	// Invited account ID or login email.
	TargetEntity string `pulumi:"targetEntity"`
	// Type of account being invited. Valid values: `Account`, `Email`.
	TargetType string `pulumi:"targetType"`
}

// The set of arguments for constructing a Handshake resource.
type HandshakeArgs struct {
	// Remarks. The maximum length is 1024 characters.
	Note pulumi.StringPtrInput
	// Invited account ID or login email.
	TargetEntity pulumi.StringInput
	// Type of account being invited. Valid values: `Account`, `Email`.
	TargetType pulumi.StringInput
}

func (HandshakeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*handshakeArgs)(nil)).Elem()
}
