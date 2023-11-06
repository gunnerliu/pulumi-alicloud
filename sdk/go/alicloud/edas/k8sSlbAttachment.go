// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package edas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Binds SLBs to an EDAS k8s application.
//
// For information about EDAS k8s slb attachment and how to use it, see [What is k8s slb attachment](https://www.alibabacloud.com/help/en/enterprise-distributed-application-service/latest/bindk8sslb).
//
// > **NOTE:** Available since v1.194.0.
//
// ## Import
//
// Slb information of EDAS k8s application can be imported using the ID of an EDAS k8s application. e.g.
//
// ```sh
//
//	$ pulumi import alicloud:edas/k8sSlbAttachment:K8sSlbAttachment example <EDAS k8s app id>
//
// ```
type K8sSlbAttachment struct {
	pulumi.CustomResourceState

	// The ID of the EDAS k8s application to which you want to bind SLB instances.
	AppId pulumi.StringOutput `pulumi:"appId"`
	// The configurations of SLB attachment, which is supported for multiple configurations. See `slbConfigs` below.
	SlbConfigs K8sSlbAttachmentSlbConfigArrayOutput `pulumi:"slbConfigs"`
}

// NewK8sSlbAttachment registers a new resource with the given unique name, arguments, and options.
func NewK8sSlbAttachment(ctx *pulumi.Context,
	name string, args *K8sSlbAttachmentArgs, opts ...pulumi.ResourceOption) (*K8sSlbAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppId == nil {
		return nil, errors.New("invalid value for required argument 'AppId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource K8sSlbAttachment
	err := ctx.RegisterResource("alicloud:edas/k8sSlbAttachment:K8sSlbAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetK8sSlbAttachment gets an existing K8sSlbAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetK8sSlbAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *K8sSlbAttachmentState, opts ...pulumi.ResourceOption) (*K8sSlbAttachment, error) {
	var resource K8sSlbAttachment
	err := ctx.ReadResource("alicloud:edas/k8sSlbAttachment:K8sSlbAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering K8sSlbAttachment resources.
type k8sSlbAttachmentState struct {
	// The ID of the EDAS k8s application to which you want to bind SLB instances.
	AppId *string `pulumi:"appId"`
	// The configurations of SLB attachment, which is supported for multiple configurations. See `slbConfigs` below.
	SlbConfigs []K8sSlbAttachmentSlbConfig `pulumi:"slbConfigs"`
}

type K8sSlbAttachmentState struct {
	// The ID of the EDAS k8s application to which you want to bind SLB instances.
	AppId pulumi.StringPtrInput
	// The configurations of SLB attachment, which is supported for multiple configurations. See `slbConfigs` below.
	SlbConfigs K8sSlbAttachmentSlbConfigArrayInput
}

func (K8sSlbAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*k8sSlbAttachmentState)(nil)).Elem()
}

type k8sSlbAttachmentArgs struct {
	// The ID of the EDAS k8s application to which you want to bind SLB instances.
	AppId string `pulumi:"appId"`
	// The configurations of SLB attachment, which is supported for multiple configurations. See `slbConfigs` below.
	SlbConfigs []K8sSlbAttachmentSlbConfig `pulumi:"slbConfigs"`
}

// The set of arguments for constructing a K8sSlbAttachment resource.
type K8sSlbAttachmentArgs struct {
	// The ID of the EDAS k8s application to which you want to bind SLB instances.
	AppId pulumi.StringInput
	// The configurations of SLB attachment, which is supported for multiple configurations. See `slbConfigs` below.
	SlbConfigs K8sSlbAttachmentSlbConfigArrayInput
}

func (K8sSlbAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*k8sSlbAttachmentArgs)(nil)).Elem()
}

type K8sSlbAttachmentInput interface {
	pulumi.Input

	ToK8sSlbAttachmentOutput() K8sSlbAttachmentOutput
	ToK8sSlbAttachmentOutputWithContext(ctx context.Context) K8sSlbAttachmentOutput
}

func (*K8sSlbAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**K8sSlbAttachment)(nil)).Elem()
}

func (i *K8sSlbAttachment) ToK8sSlbAttachmentOutput() K8sSlbAttachmentOutput {
	return i.ToK8sSlbAttachmentOutputWithContext(context.Background())
}

func (i *K8sSlbAttachment) ToK8sSlbAttachmentOutputWithContext(ctx context.Context) K8sSlbAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(K8sSlbAttachmentOutput)
}

// K8sSlbAttachmentArrayInput is an input type that accepts K8sSlbAttachmentArray and K8sSlbAttachmentArrayOutput values.
// You can construct a concrete instance of `K8sSlbAttachmentArrayInput` via:
//
//	K8sSlbAttachmentArray{ K8sSlbAttachmentArgs{...} }
type K8sSlbAttachmentArrayInput interface {
	pulumi.Input

	ToK8sSlbAttachmentArrayOutput() K8sSlbAttachmentArrayOutput
	ToK8sSlbAttachmentArrayOutputWithContext(context.Context) K8sSlbAttachmentArrayOutput
}

type K8sSlbAttachmentArray []K8sSlbAttachmentInput

func (K8sSlbAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*K8sSlbAttachment)(nil)).Elem()
}

func (i K8sSlbAttachmentArray) ToK8sSlbAttachmentArrayOutput() K8sSlbAttachmentArrayOutput {
	return i.ToK8sSlbAttachmentArrayOutputWithContext(context.Background())
}

func (i K8sSlbAttachmentArray) ToK8sSlbAttachmentArrayOutputWithContext(ctx context.Context) K8sSlbAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(K8sSlbAttachmentArrayOutput)
}

// K8sSlbAttachmentMapInput is an input type that accepts K8sSlbAttachmentMap and K8sSlbAttachmentMapOutput values.
// You can construct a concrete instance of `K8sSlbAttachmentMapInput` via:
//
//	K8sSlbAttachmentMap{ "key": K8sSlbAttachmentArgs{...} }
type K8sSlbAttachmentMapInput interface {
	pulumi.Input

	ToK8sSlbAttachmentMapOutput() K8sSlbAttachmentMapOutput
	ToK8sSlbAttachmentMapOutputWithContext(context.Context) K8sSlbAttachmentMapOutput
}

type K8sSlbAttachmentMap map[string]K8sSlbAttachmentInput

func (K8sSlbAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*K8sSlbAttachment)(nil)).Elem()
}

func (i K8sSlbAttachmentMap) ToK8sSlbAttachmentMapOutput() K8sSlbAttachmentMapOutput {
	return i.ToK8sSlbAttachmentMapOutputWithContext(context.Background())
}

func (i K8sSlbAttachmentMap) ToK8sSlbAttachmentMapOutputWithContext(ctx context.Context) K8sSlbAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(K8sSlbAttachmentMapOutput)
}

type K8sSlbAttachmentOutput struct{ *pulumi.OutputState }

func (K8sSlbAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**K8sSlbAttachment)(nil)).Elem()
}

func (o K8sSlbAttachmentOutput) ToK8sSlbAttachmentOutput() K8sSlbAttachmentOutput {
	return o
}

func (o K8sSlbAttachmentOutput) ToK8sSlbAttachmentOutputWithContext(ctx context.Context) K8sSlbAttachmentOutput {
	return o
}

// The ID of the EDAS k8s application to which you want to bind SLB instances.
func (o K8sSlbAttachmentOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v *K8sSlbAttachment) pulumi.StringOutput { return v.AppId }).(pulumi.StringOutput)
}

// The configurations of SLB attachment, which is supported for multiple configurations. See `slbConfigs` below.
func (o K8sSlbAttachmentOutput) SlbConfigs() K8sSlbAttachmentSlbConfigArrayOutput {
	return o.ApplyT(func(v *K8sSlbAttachment) K8sSlbAttachmentSlbConfigArrayOutput { return v.SlbConfigs }).(K8sSlbAttachmentSlbConfigArrayOutput)
}

type K8sSlbAttachmentArrayOutput struct{ *pulumi.OutputState }

func (K8sSlbAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*K8sSlbAttachment)(nil)).Elem()
}

func (o K8sSlbAttachmentArrayOutput) ToK8sSlbAttachmentArrayOutput() K8sSlbAttachmentArrayOutput {
	return o
}

func (o K8sSlbAttachmentArrayOutput) ToK8sSlbAttachmentArrayOutputWithContext(ctx context.Context) K8sSlbAttachmentArrayOutput {
	return o
}

func (o K8sSlbAttachmentArrayOutput) Index(i pulumi.IntInput) K8sSlbAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *K8sSlbAttachment {
		return vs[0].([]*K8sSlbAttachment)[vs[1].(int)]
	}).(K8sSlbAttachmentOutput)
}

type K8sSlbAttachmentMapOutput struct{ *pulumi.OutputState }

func (K8sSlbAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*K8sSlbAttachment)(nil)).Elem()
}

func (o K8sSlbAttachmentMapOutput) ToK8sSlbAttachmentMapOutput() K8sSlbAttachmentMapOutput {
	return o
}

func (o K8sSlbAttachmentMapOutput) ToK8sSlbAttachmentMapOutputWithContext(ctx context.Context) K8sSlbAttachmentMapOutput {
	return o
}

func (o K8sSlbAttachmentMapOutput) MapIndex(k pulumi.StringInput) K8sSlbAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *K8sSlbAttachment {
		return vs[0].(map[string]*K8sSlbAttachment)[vs[1].(string)]
	}).(K8sSlbAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*K8sSlbAttachmentInput)(nil)).Elem(), &K8sSlbAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*K8sSlbAttachmentArrayInput)(nil)).Elem(), K8sSlbAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*K8sSlbAttachmentMapInput)(nil)).Elem(), K8sSlbAttachmentMap{})
	pulumi.RegisterOutputType(K8sSlbAttachmentOutput{})
	pulumi.RegisterOutputType(K8sSlbAttachmentArrayOutput{})
	pulumi.RegisterOutputType(K8sSlbAttachmentMapOutput{})
}
