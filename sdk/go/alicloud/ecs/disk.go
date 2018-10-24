// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a ECS disk resource.
// 
// ~> **NOTE:** One of `size` or `snapshot_id` is required when specifying an ECS disk. If all of them be specified, `size` must more than the size of snapshot which `snapshot_id` represents. Currently, `alicloud_disk` doesn't resize disk.
type Disk struct {
	s *pulumi.ResourceState
}

// NewDisk registers a new resource with the given unique name, arguments, and options.
func NewDisk(ctx *pulumi.Context,
	name string, args *DiskArgs, opts ...pulumi.ResourceOpt) (*Disk, error) {
	if args == nil || args.AvailabilityZone == nil {
		return nil, errors.New("missing required argument 'AvailabilityZone'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["availabilityZone"] = nil
		inputs["category"] = nil
		inputs["description"] = nil
		inputs["encrypted"] = nil
		inputs["name"] = nil
		inputs["size"] = nil
		inputs["snapshotId"] = nil
		inputs["tags"] = nil
	} else {
		inputs["availabilityZone"] = args.AvailabilityZone
		inputs["category"] = args.Category
		inputs["description"] = args.Description
		inputs["encrypted"] = args.Encrypted
		inputs["name"] = args.Name
		inputs["size"] = args.Size
		inputs["snapshotId"] = args.SnapshotId
		inputs["tags"] = args.Tags
	}
	inputs["status"] = nil
	s, err := ctx.RegisterResource("alicloud:ecs/disk:Disk", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Disk{s: s}, nil
}

// GetDisk gets an existing Disk resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDisk(ctx *pulumi.Context,
	name string, id pulumi.ID, state *DiskState, opts ...pulumi.ResourceOpt) (*Disk, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["availabilityZone"] = state.AvailabilityZone
		inputs["category"] = state.Category
		inputs["description"] = state.Description
		inputs["encrypted"] = state.Encrypted
		inputs["name"] = state.Name
		inputs["size"] = state.Size
		inputs["snapshotId"] = state.SnapshotId
		inputs["status"] = state.Status
		inputs["tags"] = state.Tags
	}
	s, err := ctx.ReadResource("alicloud:ecs/disk:Disk", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Disk{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Disk) URN() *pulumi.URNOutput {
	return r.s.URN
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Disk) ID() *pulumi.IDOutput {
	return r.s.ID
}

// The Zone to create the disk in.
func (r *Disk) AvailabilityZone() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["availabilityZone"])
}

// Category of the disk. Valid values are `cloud`, `cloud_efficiency` and `cloud_ssd`. Default is `cloud_efficiency`.
func (r *Disk) Category() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["category"])
}

// Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
func (r *Disk) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

// If true, the disk will be encrypted
func (r *Disk) Encrypted() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["encrypted"])
}

// Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
func (r *Disk) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// The size of the disk in GiBs, and it value range: 20 ~ 32768.
func (r *Disk) Size() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["size"])
}

// A snapshot to base the disk off of. If it is specified, `size` will be invalid and the disk size is equals to the snapshot size.
func (r *Disk) SnapshotId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["snapshotId"])
}

// The disk status.
func (r *Disk) Status() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["status"])
}

// A mapping of tags to assign to the resource.
func (r *Disk) Tags() *pulumi.MapOutput {
	return (*pulumi.MapOutput)(r.s.State["tags"])
}

// Input properties used for looking up and filtering Disk resources.
type DiskState struct {
	// The Zone to create the disk in.
	AvailabilityZone interface{}
	// Category of the disk. Valid values are `cloud`, `cloud_efficiency` and `cloud_ssd`. Default is `cloud_efficiency`.
	Category interface{}
	// Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
	Description interface{}
	// If true, the disk will be encrypted
	Encrypted interface{}
	// Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
	Name interface{}
	// The size of the disk in GiBs, and it value range: 20 ~ 32768.
	Size interface{}
	// A snapshot to base the disk off of. If it is specified, `size` will be invalid and the disk size is equals to the snapshot size.
	SnapshotId interface{}
	// The disk status.
	Status interface{}
	// A mapping of tags to assign to the resource.
	Tags interface{}
}

// The set of arguments for constructing a Disk resource.
type DiskArgs struct {
	// The Zone to create the disk in.
	AvailabilityZone interface{}
	// Category of the disk. Valid values are `cloud`, `cloud_efficiency` and `cloud_ssd`. Default is `cloud_efficiency`.
	Category interface{}
	// Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
	Description interface{}
	// If true, the disk will be encrypted
	Encrypted interface{}
	// Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
	Name interface{}
	// The size of the disk in GiBs, and it value range: 20 ~ 32768.
	Size interface{}
	// A snapshot to base the disk off of. If it is specified, `size` will be invalid and the disk size is equals to the snapshot size.
	SnapshotId interface{}
	// A mapping of tags to assign to the resource.
	Tags interface{}
}