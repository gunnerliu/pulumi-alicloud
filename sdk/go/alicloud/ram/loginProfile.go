// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ram

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a RAM User Login Profile resource.
// 
type LoginProfile struct {
	s *pulumi.ResourceState
}

// NewLoginProfile registers a new resource with the given unique name, arguments, and options.
func NewLoginProfile(ctx *pulumi.Context,
	name string, args *LoginProfileArgs, opts ...pulumi.ResourceOpt) (*LoginProfile, error) {
	if args == nil || args.Password == nil {
		return nil, errors.New("missing required argument 'Password'")
	}
	if args == nil || args.UserName == nil {
		return nil, errors.New("missing required argument 'UserName'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["mfaBindRequired"] = nil
		inputs["password"] = nil
		inputs["passwordResetRequired"] = nil
		inputs["userName"] = nil
	} else {
		inputs["mfaBindRequired"] = args.MfaBindRequired
		inputs["password"] = args.Password
		inputs["passwordResetRequired"] = args.PasswordResetRequired
		inputs["userName"] = args.UserName
	}
	s, err := ctx.RegisterResource("alicloud:ram/loginProfile:LoginProfile", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &LoginProfile{s: s}, nil
}

// GetLoginProfile gets an existing LoginProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoginProfile(ctx *pulumi.Context,
	name string, id pulumi.ID, state *LoginProfileState, opts ...pulumi.ResourceOpt) (*LoginProfile, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["mfaBindRequired"] = state.MfaBindRequired
		inputs["password"] = state.Password
		inputs["passwordResetRequired"] = state.PasswordResetRequired
		inputs["userName"] = state.UserName
	}
	s, err := ctx.ReadResource("alicloud:ram/loginProfile:LoginProfile", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &LoginProfile{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *LoginProfile) URN() *pulumi.URNOutput {
	return r.s.URN
}

// ID is this resource's unique identifier assigned by its provider.
func (r *LoginProfile) ID() *pulumi.IDOutput {
	return r.s.ID
}

// This parameter indicates whether the MFA needs to be bind when the user first logs in. Default value is `false`.
func (r *LoginProfile) MfaBindRequired() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["mfaBindRequired"])
}

// Password of the RAM user.
func (r *LoginProfile) Password() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["password"])
}

// This parameter indicates whether the password needs to be reset when the user first logs in. Default value is `false`.
func (r *LoginProfile) PasswordResetRequired() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["passwordResetRequired"])
}

// Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
func (r *LoginProfile) UserName() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["userName"])
}

// Input properties used for looking up and filtering LoginProfile resources.
type LoginProfileState struct {
	// This parameter indicates whether the MFA needs to be bind when the user first logs in. Default value is `false`.
	MfaBindRequired interface{}
	// Password of the RAM user.
	Password interface{}
	// This parameter indicates whether the password needs to be reset when the user first logs in. Default value is `false`.
	PasswordResetRequired interface{}
	// Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
	UserName interface{}
}

// The set of arguments for constructing a LoginProfile resource.
type LoginProfileArgs struct {
	// This parameter indicates whether the MFA needs to be bind when the user first logs in. Default value is `false`.
	MfaBindRequired interface{}
	// Password of the RAM user.
	Password interface{}
	// This parameter indicates whether the password needs to be reset when the user first logs in. Default value is `false`.
	PasswordResetRequired interface{}
	// Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
	UserName interface{}
}