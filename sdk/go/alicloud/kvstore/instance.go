// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package kvstore

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides an ApsaraDB Redis / Memcache instance resource. A DB instance is an isolated database environment in the cloud. It can be associated with IP whitelists and backup configuration which are separate resource providers.
type Instance struct {
	s *pulumi.ResourceState
}

// NewInstance registers a new resource with the given unique name, arguments, and options.
func NewInstance(ctx *pulumi.Context,
	name string, args *InstanceArgs, opts ...pulumi.ResourceOpt) (*Instance, error) {
	if args == nil || args.InstanceClass == nil {
		return nil, errors.New("missing required argument 'InstanceClass'")
	}
	if args == nil || args.Password == nil {
		return nil, errors.New("missing required argument 'Password'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["availabilityZone"] = nil
		inputs["backupId"] = nil
		inputs["engineVersion"] = nil
		inputs["instanceChargeType"] = nil
		inputs["instanceClass"] = nil
		inputs["instanceName"] = nil
		inputs["instanceType"] = nil
		inputs["password"] = nil
		inputs["period"] = nil
		inputs["privateIp"] = nil
		inputs["securityIps"] = nil
		inputs["vswitchId"] = nil
	} else {
		inputs["availabilityZone"] = args.AvailabilityZone
		inputs["backupId"] = args.BackupId
		inputs["engineVersion"] = args.EngineVersion
		inputs["instanceChargeType"] = args.InstanceChargeType
		inputs["instanceClass"] = args.InstanceClass
		inputs["instanceName"] = args.InstanceName
		inputs["instanceType"] = args.InstanceType
		inputs["password"] = args.Password
		inputs["period"] = args.Period
		inputs["privateIp"] = args.PrivateIp
		inputs["securityIps"] = args.SecurityIps
		inputs["vswitchId"] = args.VswitchId
	}
	inputs["connectionDomain"] = nil
	s, err := ctx.RegisterResource("alicloud:kvstore/instance:Instance", name, true, inputs, opts...)
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
		inputs["availabilityZone"] = state.AvailabilityZone
		inputs["backupId"] = state.BackupId
		inputs["connectionDomain"] = state.ConnectionDomain
		inputs["engineVersion"] = state.EngineVersion
		inputs["instanceChargeType"] = state.InstanceChargeType
		inputs["instanceClass"] = state.InstanceClass
		inputs["instanceName"] = state.InstanceName
		inputs["instanceType"] = state.InstanceType
		inputs["password"] = state.Password
		inputs["period"] = state.Period
		inputs["privateIp"] = state.PrivateIp
		inputs["securityIps"] = state.SecurityIps
		inputs["vswitchId"] = state.VswitchId
	}
	s, err := ctx.ReadResource("alicloud:kvstore/instance:Instance", name, id, inputs, opts...)
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

// The Zone to launch the DB instance.
func (r *Instance) AvailabilityZone() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["availabilityZone"])
}

func (r *Instance) BackupId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["backupId"])
}

func (r *Instance) ConnectionDomain() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["connectionDomain"])
}

func (r *Instance) EngineVersion() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["engineVersion"])
}

// Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
func (r *Instance) InstanceChargeType() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["instanceChargeType"])
}

// Type of the applied ApsaraDB for Redis instance.
// For more information, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/61135.htm).
func (r *Instance) InstanceClass() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["instanceClass"])
}

// The name of DB instance. It a string of 2 to 256 characters.
// * `password`- (Required) The password of the DB instance. The password is a string of 8 to 30 characters and must contain uppercase letters, lowercase letters, and numbers.
func (r *Instance) InstanceName() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["instanceName"])
}

// The engine to use: `Redis` or `Memcache`. Defaults to `Redis`
func (r *Instance) InstanceType() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["instanceType"])
}

func (r *Instance) Password() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["password"])
}

// The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
func (r *Instance) Period() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["period"])
}

func (r *Instance) PrivateIp() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["privateIp"])
}

func (r *Instance) SecurityIps() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["securityIps"])
}

// The ID of VSwitch.
// * `engine_version`- (Optional) Engine version. Supported values: 2.8 and 4.0. Default value: 2.8.
// * `security_ips`- (Optional) Set the instance's IP whitelist of the default security group.
// * `private_ip`- (Optional) Set the instance's private IP.
// * `backup_id`- (Optional) If an instance created based on a backup set generated by another instance is valid, this parameter indicates the ID of the generated backup set.
func (r *Instance) VswitchId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["vswitchId"])
}

// Input properties used for looking up and filtering Instance resources.
type InstanceState struct {
	// The Zone to launch the DB instance.
	AvailabilityZone interface{}
	BackupId interface{}
	ConnectionDomain interface{}
	EngineVersion interface{}
	// Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
	InstanceChargeType interface{}
	// Type of the applied ApsaraDB for Redis instance.
	// For more information, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/61135.htm).
	InstanceClass interface{}
	// The name of DB instance. It a string of 2 to 256 characters.
	// * `password`- (Required) The password of the DB instance. The password is a string of 8 to 30 characters and must contain uppercase letters, lowercase letters, and numbers.
	InstanceName interface{}
	// The engine to use: `Redis` or `Memcache`. Defaults to `Redis`
	InstanceType interface{}
	Password interface{}
	// The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
	Period interface{}
	PrivateIp interface{}
	SecurityIps interface{}
	// The ID of VSwitch.
	// * `engine_version`- (Optional) Engine version. Supported values: 2.8 and 4.0. Default value: 2.8.
	// * `security_ips`- (Optional) Set the instance's IP whitelist of the default security group.
	// * `private_ip`- (Optional) Set the instance's private IP.
	// * `backup_id`- (Optional) If an instance created based on a backup set generated by another instance is valid, this parameter indicates the ID of the generated backup set.
	VswitchId interface{}
}

// The set of arguments for constructing a Instance resource.
type InstanceArgs struct {
	// The Zone to launch the DB instance.
	AvailabilityZone interface{}
	BackupId interface{}
	EngineVersion interface{}
	// Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
	InstanceChargeType interface{}
	// Type of the applied ApsaraDB for Redis instance.
	// For more information, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/61135.htm).
	InstanceClass interface{}
	// The name of DB instance. It a string of 2 to 256 characters.
	// * `password`- (Required) The password of the DB instance. The password is a string of 8 to 30 characters and must contain uppercase letters, lowercase letters, and numbers.
	InstanceName interface{}
	// The engine to use: `Redis` or `Memcache`. Defaults to `Redis`
	InstanceType interface{}
	Password interface{}
	// The duration that you will buy DB instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
	Period interface{}
	PrivateIp interface{}
	SecurityIps interface{}
	// The ID of VSwitch.
	// * `engine_version`- (Optional) Engine version. Supported values: 2.8 and 4.0. Default value: 2.8.
	// * `security_ips`- (Optional) Set the instance's IP whitelist of the default security group.
	// * `private_ip`- (Optional) Set the instance's private IP.
	// * `backup_id`- (Optional) If an instance created based on a backup set generated by another instance is valid, this parameter indicates the ID of the generated backup set.
	VswitchId interface{}
}