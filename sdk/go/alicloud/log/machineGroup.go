// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package log

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Log Service manages all the ECS instances whose logs need to be collected by using the Logtail client in the form of machine groups.
//  [Refer to details](https://www.alibabacloud.com/help/doc-detail/28966.htm)
type MachineGroup struct {
	s *pulumi.ResourceState
}

// NewMachineGroup registers a new resource with the given unique name, arguments, and options.
func NewMachineGroup(ctx *pulumi.Context,
	name string, args *MachineGroupArgs, opts ...pulumi.ResourceOpt) (*MachineGroup, error) {
	if args == nil || args.IdentifyLists == nil {
		return nil, errors.New("missing required argument 'IdentifyLists'")
	}
	if args == nil || args.Project == nil {
		return nil, errors.New("missing required argument 'Project'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["identifyLists"] = nil
		inputs["identifyType"] = nil
		inputs["name"] = nil
		inputs["project"] = nil
		inputs["topic"] = nil
	} else {
		inputs["identifyLists"] = args.IdentifyLists
		inputs["identifyType"] = args.IdentifyType
		inputs["name"] = args.Name
		inputs["project"] = args.Project
		inputs["topic"] = args.Topic
	}
	s, err := ctx.RegisterResource("alicloud:log/machineGroup:MachineGroup", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &MachineGroup{s: s}, nil
}

// GetMachineGroup gets an existing MachineGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMachineGroup(ctx *pulumi.Context,
	name string, id pulumi.ID, state *MachineGroupState, opts ...pulumi.ResourceOpt) (*MachineGroup, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["identifyLists"] = state.IdentifyLists
		inputs["identifyType"] = state.IdentifyType
		inputs["name"] = state.Name
		inputs["project"] = state.Project
		inputs["topic"] = state.Topic
	}
	s, err := ctx.ReadResource("alicloud:log/machineGroup:MachineGroup", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &MachineGroup{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *MachineGroup) URN() *pulumi.URNOutput {
	return r.s.URN
}

// ID is this resource's unique identifier assigned by its provider.
func (r *MachineGroup) ID() *pulumi.IDOutput {
	return r.s.ID
}

// The machine identification.
func (r *MachineGroup) IdentifyLists() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["identifyLists"])
}

// The machine identification type, including IP and user-defined identity. Valid values are "ip" and "userdefined". Default to "ip".
// * `identify_list`-  The specific machine identification, which can be an IP address or user-defined identity.
func (r *MachineGroup) IdentifyType() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["identifyType"])
}

// The machine group name, which is unique in the same project.
func (r *MachineGroup) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// The project name to the machine group belongs.
func (r *MachineGroup) Project() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["project"])
}

// The topic of a machine group.
func (r *MachineGroup) Topic() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["topic"])
}

// Input properties used for looking up and filtering MachineGroup resources.
type MachineGroupState struct {
	// The machine identification.
	IdentifyLists interface{}
	// The machine identification type, including IP and user-defined identity. Valid values are "ip" and "userdefined". Default to "ip".
	// * `identify_list`-  The specific machine identification, which can be an IP address or user-defined identity.
	IdentifyType interface{}
	// The machine group name, which is unique in the same project.
	Name interface{}
	// The project name to the machine group belongs.
	Project interface{}
	// The topic of a machine group.
	Topic interface{}
}

// The set of arguments for constructing a MachineGroup resource.
type MachineGroupArgs struct {
	// The machine identification.
	IdentifyLists interface{}
	// The machine identification type, including IP and user-defined identity. Valid values are "ip" and "userdefined". Default to "ip".
	// * `identify_list`-  The specific machine identification, which can be an IP address or user-defined identity.
	IdentifyType interface{}
	// The machine group name, which is unique in the same project.
	Name interface{}
	// The project name to the machine group belongs.
	Project interface{}
	// The topic of a machine group.
	Topic interface{}
}