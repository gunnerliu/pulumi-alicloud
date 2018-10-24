// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ram

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a RAM role attachment resource to bind role for several ECS instances.
type RoleAttachment struct {
	s *pulumi.ResourceState
}

// NewRoleAttachment registers a new resource with the given unique name, arguments, and options.
func NewRoleAttachment(ctx *pulumi.Context,
	name string, args *RoleAttachmentArgs, opts ...pulumi.ResourceOpt) (*RoleAttachment, error) {
	if args == nil || args.InstanceIds == nil {
		return nil, errors.New("missing required argument 'InstanceIds'")
	}
	if args == nil || args.RoleName == nil {
		return nil, errors.New("missing required argument 'RoleName'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["instanceIds"] = nil
		inputs["roleName"] = nil
	} else {
		inputs["instanceIds"] = args.InstanceIds
		inputs["roleName"] = args.RoleName
	}
	s, err := ctx.RegisterResource("alicloud:ram/roleAttachment:RoleAttachment", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &RoleAttachment{s: s}, nil
}

// GetRoleAttachment gets an existing RoleAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRoleAttachment(ctx *pulumi.Context,
	name string, id pulumi.ID, state *RoleAttachmentState, opts ...pulumi.ResourceOpt) (*RoleAttachment, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["instanceIds"] = state.InstanceIds
		inputs["roleName"] = state.RoleName
	}
	s, err := ctx.ReadResource("alicloud:ram/roleAttachment:RoleAttachment", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &RoleAttachment{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *RoleAttachment) URN() *pulumi.URNOutput {
	return r.s.URN
}

// ID is this resource's unique identifier assigned by its provider.
func (r *RoleAttachment) ID() *pulumi.IDOutput {
	return r.s.ID
}

// The list of ECS instance's IDs.
func (r *RoleAttachment) InstanceIds() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["instanceIds"])
}

// The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
func (r *RoleAttachment) RoleName() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["roleName"])
}

// Input properties used for looking up and filtering RoleAttachment resources.
type RoleAttachmentState struct {
	// The list of ECS instance's IDs.
	InstanceIds interface{}
	// The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
	RoleName interface{}
}

// The set of arguments for constructing a RoleAttachment resource.
type RoleAttachmentArgs struct {
	// The list of ECS instance's IDs.
	InstanceIds interface{}
	// The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
	RoleName interface{}
}