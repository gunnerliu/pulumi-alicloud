// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package edas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides an EDAS instance cluster attachment resource.
//
// > **NOTE:** Available in 1.82.0+
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/edas"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := edas.NewInstanceClusterAttachment(ctx, "_default", &edas.InstanceClusterAttachmentArgs{
// 			ClusterId:   pulumi.Any(_var.Cluster_id),
// 			InstanceIds: _var.Instance_ids,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type InstanceClusterAttachment struct {
	pulumi.CustomResourceState

	// The ID of the cluster that you want to create the application.
	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	// The cluster members map of the resource supplied above. The key is instanceId and the value is cluster_member_id.
	ClusterMemberIds pulumi.StringMapOutput `pulumi:"clusterMemberIds"`
	// The ecu map of the resource supplied above. The key is instanceId and the value is ecu_id.
	EcuMap pulumi.StringMapOutput `pulumi:"ecuMap"`
	// The ID of instance. Type: list.
	InstanceIds pulumi.StringArrayOutput `pulumi:"instanceIds"`
	// The status map of the resource supplied above. The key is instanceId and the values are 1(running) 0(converting) -1(failed) and -2(offline).
	StatusMap pulumi.IntMapOutput `pulumi:"statusMap"`
}

// NewInstanceClusterAttachment registers a new resource with the given unique name, arguments, and options.
func NewInstanceClusterAttachment(ctx *pulumi.Context,
	name string, args *InstanceClusterAttachmentArgs, opts ...pulumi.ResourceOption) (*InstanceClusterAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.InstanceIds == nil {
		return nil, errors.New("invalid value for required argument 'InstanceIds'")
	}
	var resource InstanceClusterAttachment
	err := ctx.RegisterResource("alicloud:edas/instanceClusterAttachment:InstanceClusterAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceClusterAttachment gets an existing InstanceClusterAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceClusterAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceClusterAttachmentState, opts ...pulumi.ResourceOption) (*InstanceClusterAttachment, error) {
	var resource InstanceClusterAttachment
	err := ctx.ReadResource("alicloud:edas/instanceClusterAttachment:InstanceClusterAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceClusterAttachment resources.
type instanceClusterAttachmentState struct {
	// The ID of the cluster that you want to create the application.
	ClusterId *string `pulumi:"clusterId"`
	// The cluster members map of the resource supplied above. The key is instanceId and the value is cluster_member_id.
	ClusterMemberIds map[string]string `pulumi:"clusterMemberIds"`
	// The ecu map of the resource supplied above. The key is instanceId and the value is ecu_id.
	EcuMap map[string]string `pulumi:"ecuMap"`
	// The ID of instance. Type: list.
	InstanceIds []string `pulumi:"instanceIds"`
	// The status map of the resource supplied above. The key is instanceId and the values are 1(running) 0(converting) -1(failed) and -2(offline).
	StatusMap map[string]int `pulumi:"statusMap"`
}

type InstanceClusterAttachmentState struct {
	// The ID of the cluster that you want to create the application.
	ClusterId pulumi.StringPtrInput
	// The cluster members map of the resource supplied above. The key is instanceId and the value is cluster_member_id.
	ClusterMemberIds pulumi.StringMapInput
	// The ecu map of the resource supplied above. The key is instanceId and the value is ecu_id.
	EcuMap pulumi.StringMapInput
	// The ID of instance. Type: list.
	InstanceIds pulumi.StringArrayInput
	// The status map of the resource supplied above. The key is instanceId and the values are 1(running) 0(converting) -1(failed) and -2(offline).
	StatusMap pulumi.IntMapInput
}

func (InstanceClusterAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceClusterAttachmentState)(nil)).Elem()
}

type instanceClusterAttachmentArgs struct {
	// The ID of the cluster that you want to create the application.
	ClusterId string `pulumi:"clusterId"`
	// The ID of instance. Type: list.
	InstanceIds []string `pulumi:"instanceIds"`
}

// The set of arguments for constructing a InstanceClusterAttachment resource.
type InstanceClusterAttachmentArgs struct {
	// The ID of the cluster that you want to create the application.
	ClusterId pulumi.StringInput
	// The ID of instance. Type: list.
	InstanceIds pulumi.StringArrayInput
}

func (InstanceClusterAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceClusterAttachmentArgs)(nil)).Elem()
}

type InstanceClusterAttachmentInput interface {
	pulumi.Input

	ToInstanceClusterAttachmentOutput() InstanceClusterAttachmentOutput
	ToInstanceClusterAttachmentOutputWithContext(ctx context.Context) InstanceClusterAttachmentOutput
}

func (*InstanceClusterAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((*InstanceClusterAttachment)(nil))
}

func (i *InstanceClusterAttachment) ToInstanceClusterAttachmentOutput() InstanceClusterAttachmentOutput {
	return i.ToInstanceClusterAttachmentOutputWithContext(context.Background())
}

func (i *InstanceClusterAttachment) ToInstanceClusterAttachmentOutputWithContext(ctx context.Context) InstanceClusterAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceClusterAttachmentOutput)
}

type InstanceClusterAttachmentOutput struct {
	*pulumi.OutputState
}

func (InstanceClusterAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*InstanceClusterAttachment)(nil))
}

func (o InstanceClusterAttachmentOutput) ToInstanceClusterAttachmentOutput() InstanceClusterAttachmentOutput {
	return o
}

func (o InstanceClusterAttachmentOutput) ToInstanceClusterAttachmentOutputWithContext(ctx context.Context) InstanceClusterAttachmentOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(InstanceClusterAttachmentOutput{})
}
