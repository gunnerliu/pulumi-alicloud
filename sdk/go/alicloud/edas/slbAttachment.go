// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package edas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Binds SLB to an EDAS application.
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
// 		_, err := edas.NewSlbAttachment(ctx, "_default", &edas.SlbAttachmentArgs{
// 			AppId:          pulumi.Any(_var.App_id),
// 			SlbId:          pulumi.Any(_var.Slb_id),
// 			SlbIp:          pulumi.Any(_var.Slb_ip),
// 			Type:           pulumi.Any(_var.Type),
// 			ListenerPort:   pulumi.Any(_var.Listener_port),
// 			VserverGroupId: pulumi.Any(_var.Vserver_group_id),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type SlbAttachment struct {
	pulumi.CustomResourceState

	// The ID of the applicaton to which you want to bind an SLB instance.
	AppId pulumi.StringOutput `pulumi:"appId"`
	// The listening port for the bound SLB instance.
	ListenerPort pulumi.IntPtrOutput `pulumi:"listenerPort"`
	// The ID of the SLB instance that is going to be bound.
	SlbId pulumi.StringOutput `pulumi:"slbId"`
	// The IP address that is allocated to the bound SLB instance.
	SlbIp pulumi.StringOutput `pulumi:"slbIp"`
	// Running Status of SLB instance. Inactive：The instance is stopped, and listener will not monitor and foward traffic. Active：The instance is running. After the instance is created, the default state is active. Locked：The instance is locked, the instance has been owed or locked by Alibaba Cloud. Expired: The instance has expired.
	SlbStatus pulumi.StringOutput `pulumi:"slbStatus"`
	// The type of the bound SLB instance.
	Type pulumi.StringOutput `pulumi:"type"`
	// The ID of the virtual server (VServer) group associated with the intranet SLB instance.
	VserverGroupId pulumi.StringPtrOutput `pulumi:"vserverGroupId"`
	// VPC related vswitch ID.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
}

// NewSlbAttachment registers a new resource with the given unique name, arguments, and options.
func NewSlbAttachment(ctx *pulumi.Context,
	name string, args *SlbAttachmentArgs, opts ...pulumi.ResourceOption) (*SlbAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppId == nil {
		return nil, errors.New("invalid value for required argument 'AppId'")
	}
	if args.SlbId == nil {
		return nil, errors.New("invalid value for required argument 'SlbId'")
	}
	if args.SlbIp == nil {
		return nil, errors.New("invalid value for required argument 'SlbIp'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource SlbAttachment
	err := ctx.RegisterResource("alicloud:edas/slbAttachment:SlbAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSlbAttachment gets an existing SlbAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSlbAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SlbAttachmentState, opts ...pulumi.ResourceOption) (*SlbAttachment, error) {
	var resource SlbAttachment
	err := ctx.ReadResource("alicloud:edas/slbAttachment:SlbAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SlbAttachment resources.
type slbAttachmentState struct {
	// The ID of the applicaton to which you want to bind an SLB instance.
	AppId *string `pulumi:"appId"`
	// The listening port for the bound SLB instance.
	ListenerPort *int `pulumi:"listenerPort"`
	// The ID of the SLB instance that is going to be bound.
	SlbId *string `pulumi:"slbId"`
	// The IP address that is allocated to the bound SLB instance.
	SlbIp *string `pulumi:"slbIp"`
	// Running Status of SLB instance. Inactive：The instance is stopped, and listener will not monitor and foward traffic. Active：The instance is running. After the instance is created, the default state is active. Locked：The instance is locked, the instance has been owed or locked by Alibaba Cloud. Expired: The instance has expired.
	SlbStatus *string `pulumi:"slbStatus"`
	// The type of the bound SLB instance.
	Type *string `pulumi:"type"`
	// The ID of the virtual server (VServer) group associated with the intranet SLB instance.
	VserverGroupId *string `pulumi:"vserverGroupId"`
	// VPC related vswitch ID.
	VswitchId *string `pulumi:"vswitchId"`
}

type SlbAttachmentState struct {
	// The ID of the applicaton to which you want to bind an SLB instance.
	AppId pulumi.StringPtrInput
	// The listening port for the bound SLB instance.
	ListenerPort pulumi.IntPtrInput
	// The ID of the SLB instance that is going to be bound.
	SlbId pulumi.StringPtrInput
	// The IP address that is allocated to the bound SLB instance.
	SlbIp pulumi.StringPtrInput
	// Running Status of SLB instance. Inactive：The instance is stopped, and listener will not monitor and foward traffic. Active：The instance is running. After the instance is created, the default state is active. Locked：The instance is locked, the instance has been owed or locked by Alibaba Cloud. Expired: The instance has expired.
	SlbStatus pulumi.StringPtrInput
	// The type of the bound SLB instance.
	Type pulumi.StringPtrInput
	// The ID of the virtual server (VServer) group associated with the intranet SLB instance.
	VserverGroupId pulumi.StringPtrInput
	// VPC related vswitch ID.
	VswitchId pulumi.StringPtrInput
}

func (SlbAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*slbAttachmentState)(nil)).Elem()
}

type slbAttachmentArgs struct {
	// The ID of the applicaton to which you want to bind an SLB instance.
	AppId string `pulumi:"appId"`
	// The listening port for the bound SLB instance.
	ListenerPort *int `pulumi:"listenerPort"`
	// The ID of the SLB instance that is going to be bound.
	SlbId string `pulumi:"slbId"`
	// The IP address that is allocated to the bound SLB instance.
	SlbIp string `pulumi:"slbIp"`
	// The type of the bound SLB instance.
	Type string `pulumi:"type"`
	// The ID of the virtual server (VServer) group associated with the intranet SLB instance.
	VserverGroupId *string `pulumi:"vserverGroupId"`
}

// The set of arguments for constructing a SlbAttachment resource.
type SlbAttachmentArgs struct {
	// The ID of the applicaton to which you want to bind an SLB instance.
	AppId pulumi.StringInput
	// The listening port for the bound SLB instance.
	ListenerPort pulumi.IntPtrInput
	// The ID of the SLB instance that is going to be bound.
	SlbId pulumi.StringInput
	// The IP address that is allocated to the bound SLB instance.
	SlbIp pulumi.StringInput
	// The type of the bound SLB instance.
	Type pulumi.StringInput
	// The ID of the virtual server (VServer) group associated with the intranet SLB instance.
	VserverGroupId pulumi.StringPtrInput
}

func (SlbAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*slbAttachmentArgs)(nil)).Elem()
}

type SlbAttachmentInput interface {
	pulumi.Input

	ToSlbAttachmentOutput() SlbAttachmentOutput
	ToSlbAttachmentOutputWithContext(ctx context.Context) SlbAttachmentOutput
}

func (*SlbAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((*SlbAttachment)(nil))
}

func (i *SlbAttachment) ToSlbAttachmentOutput() SlbAttachmentOutput {
	return i.ToSlbAttachmentOutputWithContext(context.Background())
}

func (i *SlbAttachment) ToSlbAttachmentOutputWithContext(ctx context.Context) SlbAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SlbAttachmentOutput)
}

type SlbAttachmentOutput struct {
	*pulumi.OutputState
}

func (SlbAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*SlbAttachment)(nil))
}

func (o SlbAttachmentOutput) ToSlbAttachmentOutput() SlbAttachmentOutput {
	return o
}

func (o SlbAttachmentOutput) ToSlbAttachmentOutputWithContext(ctx context.Context) SlbAttachmentOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(SlbAttachmentOutput{})
}
