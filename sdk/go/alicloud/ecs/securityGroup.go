// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/security_group.html.markdown.
type SecurityGroup struct {
	s *pulumi.ResourceState
}

// NewSecurityGroup registers a new resource with the given unique name, arguments, and options.
func NewSecurityGroup(ctx *pulumi.Context,
	name string, args *SecurityGroupArgs, opts ...pulumi.ResourceOpt) (*SecurityGroup, error) {
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["description"] = nil
		inputs["innerAccess"] = nil
		inputs["innerAccessPolicy"] = nil
		inputs["name"] = nil
		inputs["resourceGroupId"] = nil
		inputs["securityGroupType"] = nil
		inputs["tags"] = nil
		inputs["vpcId"] = nil
	} else {
		inputs["description"] = args.Description
		inputs["innerAccess"] = args.InnerAccess
		inputs["innerAccessPolicy"] = args.InnerAccessPolicy
		inputs["name"] = args.Name
		inputs["resourceGroupId"] = args.ResourceGroupId
		inputs["securityGroupType"] = args.SecurityGroupType
		inputs["tags"] = args.Tags
		inputs["vpcId"] = args.VpcId
	}
	s, err := ctx.RegisterResource("alicloud:ecs/securityGroup:SecurityGroup", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &SecurityGroup{s: s}, nil
}

// GetSecurityGroup gets an existing SecurityGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecurityGroup(ctx *pulumi.Context,
	name string, id pulumi.ID, state *SecurityGroupState, opts ...pulumi.ResourceOpt) (*SecurityGroup, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["description"] = state.Description
		inputs["innerAccess"] = state.InnerAccess
		inputs["innerAccessPolicy"] = state.InnerAccessPolicy
		inputs["name"] = state.Name
		inputs["resourceGroupId"] = state.ResourceGroupId
		inputs["securityGroupType"] = state.SecurityGroupType
		inputs["tags"] = state.Tags
		inputs["vpcId"] = state.VpcId
	}
	s, err := ctx.ReadResource("alicloud:ecs/securityGroup:SecurityGroup", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &SecurityGroup{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *SecurityGroup) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *SecurityGroup) ID() pulumi.IDOutput {
	return r.s.ID()
}

// The security group description. Defaults to null.
func (r *SecurityGroup) Description() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["description"])
}

// Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
func (r *SecurityGroup) InnerAccess() pulumi.BoolOutput {
	return (pulumi.BoolOutput)(r.s.State["innerAccess"])
}

// Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
func (r *SecurityGroup) InnerAccessPolicy() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["innerAccessPolicy"])
}

// The name of the security group. Defaults to null.
func (r *SecurityGroup) Name() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["name"])
}

// The Id of resource group which the securityGroup belongs.
func (r *SecurityGroup) ResourceGroupId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["resourceGroupId"])
}

// The type of the security group. Valid values:
// `normal`: basic security group.
// `enterprise`: advanced security group For more information.
func (r *SecurityGroup) SecurityGroupType() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["securityGroupType"])
}

// A mapping of tags to assign to the resource.
func (r *SecurityGroup) Tags() pulumi.MapOutput {
	return (pulumi.MapOutput)(r.s.State["tags"])
}

// The VPC ID.	
func (r *SecurityGroup) VpcId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["vpcId"])
}

// Input properties used for looking up and filtering SecurityGroup resources.
type SecurityGroupState struct {
	// The security group description. Defaults to null.
	Description interface{}
	// Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
	InnerAccess interface{}
	// Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
	InnerAccessPolicy interface{}
	// The name of the security group. Defaults to null.
	Name interface{}
	// The Id of resource group which the securityGroup belongs.
	ResourceGroupId interface{}
	// The type of the security group. Valid values:
	// `normal`: basic security group.
	// `enterprise`: advanced security group For more information.
	SecurityGroupType interface{}
	// A mapping of tags to assign to the resource.
	Tags interface{}
	// The VPC ID.	
	VpcId interface{}
}

// The set of arguments for constructing a SecurityGroup resource.
type SecurityGroupArgs struct {
	// The security group description. Defaults to null.
	Description interface{}
	// Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
	InnerAccess interface{}
	// Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
	InnerAccessPolicy interface{}
	// The name of the security group. Defaults to null.
	Name interface{}
	// The Id of resource group which the securityGroup belongs.
	ResourceGroupId interface{}
	// The type of the security group. Valid values:
	// `normal`: basic security group.
	// `enterprise`: advanced security group For more information.
	SecurityGroupType interface{}
	// A mapping of tags to assign to the resource.
	Tags interface{}
	// The VPC ID.	
	VpcId interface{}
}
