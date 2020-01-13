// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package rocketmq

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides an ONS instance resource.
// 
// For more information about how to use it, see [RocketMQ Instance Management API](https://www.alibabacloud.com/help/doc-detail/106354.html). 
// 
// > **NOTE:** The number of instances in the same region cannot exceed 8. At present, the resource does not support region "mq-internet-access" and "ap-southeast-5". 
// 
// > **NOTE:** Available in 1.51.0+
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/ons_instance.html.markdown.
type Instance struct {
	s *pulumi.ResourceState
}

// NewInstance registers a new resource with the given unique name, arguments, and options.
func NewInstance(ctx *pulumi.Context,
	name string, args *InstanceArgs, opts ...pulumi.ResourceOpt) (*Instance, error) {
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["name"] = nil
		inputs["remark"] = nil
	} else {
		inputs["name"] = args.Name
		inputs["remark"] = args.Remark
	}
	inputs["instanceStatus"] = nil
	inputs["instanceType"] = nil
	inputs["releaseTime"] = nil
	s, err := ctx.RegisterResource("alicloud:rocketmq/instance:Instance", name, true, inputs, opts...)
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
		inputs["instanceStatus"] = state.InstanceStatus
		inputs["instanceType"] = state.InstanceType
		inputs["name"] = state.Name
		inputs["releaseTime"] = state.ReleaseTime
		inputs["remark"] = state.Remark
	}
	s, err := ctx.ReadResource("alicloud:rocketmq/instance:Instance", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Instance{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Instance) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Instance) ID() pulumi.IDOutput {
	return r.s.ID()
}

// The status of instance. 1 represents the platinum edition instance is in deployment. 2 represents the postpaid edition instance are overdue. 5 represents the postpaid or platinum edition instance is in service. 7 represents the platinum version instance is in upgrade and the service is available.
func (r *Instance) InstanceStatus() pulumi.IntOutput {
	return (pulumi.IntOutput)(r.s.State["instanceStatus"])
}

// The edition of instance. 1 represents the postPaid edition, and 2 represents the platinum edition.
func (r *Instance) InstanceType() pulumi.IntOutput {
	return (pulumi.IntOutput)(r.s.State["instanceType"])
}

// Two instances on a single account in the same region cannot have the same name. The length must be 3 to 64 characters. Chinese characters, English letters digits and hyphen are allowed.
func (r *Instance) Name() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["name"])
}

// Platinum edition instance expiration time.
func (r *Instance) ReleaseTime() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["releaseTime"])
}

// This attribute is a concise description of instance. The length cannot exceed 128.
func (r *Instance) Remark() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["remark"])
}

// Input properties used for looking up and filtering Instance resources.
type InstanceState struct {
	// The status of instance. 1 represents the platinum edition instance is in deployment. 2 represents the postpaid edition instance are overdue. 5 represents the postpaid or platinum edition instance is in service. 7 represents the platinum version instance is in upgrade and the service is available.
	InstanceStatus interface{}
	// The edition of instance. 1 represents the postPaid edition, and 2 represents the platinum edition.
	InstanceType interface{}
	// Two instances on a single account in the same region cannot have the same name. The length must be 3 to 64 characters. Chinese characters, English letters digits and hyphen are allowed.
	Name interface{}
	// Platinum edition instance expiration time.
	ReleaseTime interface{}
	// This attribute is a concise description of instance. The length cannot exceed 128.
	Remark interface{}
}

// The set of arguments for constructing a Instance resource.
type InstanceArgs struct {
	// Two instances on a single account in the same region cannot have the same name. The length must be 3 to 64 characters. Chinese characters, English letters digits and hyphen are allowed.
	Name interface{}
	// This attribute is a concise description of instance. The length cannot exceed 128.
	Remark interface{}
}