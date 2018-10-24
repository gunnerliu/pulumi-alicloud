// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides an RDS account resource and used to manage databases. A RDS instance supports multiple database account.
type Account struct {
	s *pulumi.ResourceState
}

// NewAccount registers a new resource with the given unique name, arguments, and options.
func NewAccount(ctx *pulumi.Context,
	name string, args *AccountArgs, opts ...pulumi.ResourceOpt) (*Account, error) {
	if args == nil || args.InstanceId == nil {
		return nil, errors.New("missing required argument 'InstanceId'")
	}
	if args == nil || args.Password == nil {
		return nil, errors.New("missing required argument 'Password'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["description"] = nil
		inputs["instanceId"] = nil
		inputs["name"] = nil
		inputs["password"] = nil
		inputs["type"] = nil
	} else {
		inputs["description"] = args.Description
		inputs["instanceId"] = args.InstanceId
		inputs["name"] = args.Name
		inputs["password"] = args.Password
		inputs["type"] = args.Type
	}
	s, err := ctx.RegisterResource("alicloud:rds/account:Account", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Account{s: s}, nil
}

// GetAccount gets an existing Account resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccount(ctx *pulumi.Context,
	name string, id pulumi.ID, state *AccountState, opts ...pulumi.ResourceOpt) (*Account, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["description"] = state.Description
		inputs["instanceId"] = state.InstanceId
		inputs["name"] = state.Name
		inputs["password"] = state.Password
		inputs["type"] = state.Type
	}
	s, err := ctx.ReadResource("alicloud:rds/account:Account", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Account{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Account) URN() *pulumi.URNOutput {
	return r.s.URN
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Account) ID() *pulumi.IDOutput {
	return r.s.ID
}

// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
func (r *Account) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

// The Id of instance in which account belongs.
func (r *Account) InstanceId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["instanceId"])
}

// Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
func (r *Account) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters.
func (r *Account) Password() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["password"])
}

// Privilege type of account.
// - Normal: Common privilege.
// - Super: High privilege.
func (r *Account) Type() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["type"])
}

// Input properties used for looking up and filtering Account resources.
type AccountState struct {
	// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
	Description interface{}
	// The Id of instance in which account belongs.
	InstanceId interface{}
	// Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
	Name interface{}
	// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters.
	Password interface{}
	// Privilege type of account.
	// - Normal: Common privilege.
	// - Super: High privilege.
	Type interface{}
}

// The set of arguments for constructing a Account resource.
type AccountArgs struct {
	// Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
	Description interface{}
	// The Id of instance in which account belongs.
	InstanceId interface{}
	// Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
	Name interface{}
	// Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters.
	Password interface{}
	// Privilege type of account.
	// - Normal: Common privilege.
	// - Super: High privilege.
	Type interface{}
}