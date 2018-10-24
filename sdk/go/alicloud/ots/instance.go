// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ots

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// This resource will help you to manager a [Table Store](https://www.alibabacloud.com/help/doc-detail/27280.htm) Instance.
// It is foundation of creating data table.
type Instance struct {
	s *pulumi.ResourceState
}

// NewInstance registers a new resource with the given unique name, arguments, and options.
func NewInstance(ctx *pulumi.Context,
	name string, args *InstanceArgs, opts ...pulumi.ResourceOpt) (*Instance, error) {
	if args == nil || args.Description == nil {
		return nil, errors.New("missing required argument 'Description'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["accessedBy"] = nil
		inputs["description"] = nil
		inputs["instanceType"] = nil
		inputs["name"] = nil
		inputs["tags"] = nil
	} else {
		inputs["accessedBy"] = args.AccessedBy
		inputs["description"] = args.Description
		inputs["instanceType"] = args.InstanceType
		inputs["name"] = args.Name
		inputs["tags"] = args.Tags
	}
	s, err := ctx.RegisterResource("alicloud:ots/instance:Instance", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Instance{s: s}, nil
}

// GetInstance gets an existing Instance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstance(ctx *pulumi.Context,
	name string, id pulumi.ID, state *InstanceState, opts ...pulumi.ResourceOpt) (*Instance, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["accessedBy"] = state.AccessedBy
		inputs["description"] = state.Description
		inputs["instanceType"] = state.InstanceType
		inputs["name"] = state.Name
		inputs["tags"] = state.Tags
	}
	s, err := ctx.ReadResource("alicloud:ots/instance:Instance", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Instance{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Instance) URN() *pulumi.URNOutput {
	return r.s.URN
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Instance) ID() *pulumi.IDOutput {
	return r.s.ID
}

// The network limitation of accessing instance. Valid values:
func (r *Instance) AccessedBy() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["accessedBy"])
}

// The description of the instance.
func (r *Instance) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

// The type of instance. Valid values are "Capacity" and "HighPerformance". Default to "HighPerformance".
func (r *Instance) InstanceType() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["instanceType"])
}

// The name of the instance.
func (r *Instance) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// A mapping of tags to assign to the instance.
func (r *Instance) Tags() *pulumi.MapOutput {
	return (*pulumi.MapOutput)(r.s.State["tags"])
}

// Input properties used for looking up and filtering Instance resources.
type InstanceState struct {
	// The network limitation of accessing instance. Valid values:
	AccessedBy interface{}
	// The description of the instance.
	Description interface{}
	// The type of instance. Valid values are "Capacity" and "HighPerformance". Default to "HighPerformance".
	InstanceType interface{}
	// The name of the instance.
	Name interface{}
	// A mapping of tags to assign to the instance.
	Tags interface{}
}

// The set of arguments for constructing a Instance resource.
type InstanceArgs struct {
	// The network limitation of accessing instance. Valid values:
	AccessedBy interface{}
	// The description of the instance.
	Description interface{}
	// The type of instance. Valid values are "Capacity" and "HighPerformance". Default to "HighPerformance".
	InstanceType interface{}
	// The name of the instance.
	Name interface{}
	// A mapping of tags to assign to the instance.
	Tags interface{}
}