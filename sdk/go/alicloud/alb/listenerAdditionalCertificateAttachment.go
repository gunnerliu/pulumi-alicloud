// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package alb

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Application Load Balancer (ALB) Listener Additional Certificate Attachment resource.
//
// For information about Application Load Balancer (ALB) Listener Additional Certificate Attachment and how to use it, see [What is Listener Additional Certificate Attachment](https://www.alibabacloud.com/help/en/doc-detail/302356.html).
//
// > **NOTE:** Available in v1.161.0+.
//
// ## Import
//
// Application Load Balancer (ALB) Listener Additional Certificate Attachment can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment example <listener_id>:<certificate_id>
// ```
type ListenerAdditionalCertificateAttachment struct {
	pulumi.CustomResourceState

	// The Certificate ID.
	CertificateId pulumi.StringOutput `pulumi:"certificateId"`
	// The type of the certificate.
	CertificateType pulumi.StringOutput `pulumi:"certificateType"`
	// The ID of the ALB listener.
	ListenerId pulumi.StringOutput `pulumi:"listenerId"`
	// The status of the certificate.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewListenerAdditionalCertificateAttachment registers a new resource with the given unique name, arguments, and options.
func NewListenerAdditionalCertificateAttachment(ctx *pulumi.Context,
	name string, args *ListenerAdditionalCertificateAttachmentArgs, opts ...pulumi.ResourceOption) (*ListenerAdditionalCertificateAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CertificateId == nil {
		return nil, errors.New("invalid value for required argument 'CertificateId'")
	}
	if args.ListenerId == nil {
		return nil, errors.New("invalid value for required argument 'ListenerId'")
	}
	var resource ListenerAdditionalCertificateAttachment
	err := ctx.RegisterResource("alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetListenerAdditionalCertificateAttachment gets an existing ListenerAdditionalCertificateAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetListenerAdditionalCertificateAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ListenerAdditionalCertificateAttachmentState, opts ...pulumi.ResourceOption) (*ListenerAdditionalCertificateAttachment, error) {
	var resource ListenerAdditionalCertificateAttachment
	err := ctx.ReadResource("alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ListenerAdditionalCertificateAttachment resources.
type listenerAdditionalCertificateAttachmentState struct {
	// The Certificate ID.
	CertificateId *string `pulumi:"certificateId"`
	// The type of the certificate.
	CertificateType *string `pulumi:"certificateType"`
	// The ID of the ALB listener.
	ListenerId *string `pulumi:"listenerId"`
	// The status of the certificate.
	Status *string `pulumi:"status"`
}

type ListenerAdditionalCertificateAttachmentState struct {
	// The Certificate ID.
	CertificateId pulumi.StringPtrInput
	// The type of the certificate.
	CertificateType pulumi.StringPtrInput
	// The ID of the ALB listener.
	ListenerId pulumi.StringPtrInput
	// The status of the certificate.
	Status pulumi.StringPtrInput
}

func (ListenerAdditionalCertificateAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*listenerAdditionalCertificateAttachmentState)(nil)).Elem()
}

type listenerAdditionalCertificateAttachmentArgs struct {
	// The Certificate ID.
	CertificateId string `pulumi:"certificateId"`
	// The ID of the ALB listener.
	ListenerId string `pulumi:"listenerId"`
}

// The set of arguments for constructing a ListenerAdditionalCertificateAttachment resource.
type ListenerAdditionalCertificateAttachmentArgs struct {
	// The Certificate ID.
	CertificateId pulumi.StringInput
	// The ID of the ALB listener.
	ListenerId pulumi.StringInput
}

func (ListenerAdditionalCertificateAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*listenerAdditionalCertificateAttachmentArgs)(nil)).Elem()
}

type ListenerAdditionalCertificateAttachmentInput interface {
	pulumi.Input

	ToListenerAdditionalCertificateAttachmentOutput() ListenerAdditionalCertificateAttachmentOutput
	ToListenerAdditionalCertificateAttachmentOutputWithContext(ctx context.Context) ListenerAdditionalCertificateAttachmentOutput
}

func (*ListenerAdditionalCertificateAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**ListenerAdditionalCertificateAttachment)(nil)).Elem()
}

func (i *ListenerAdditionalCertificateAttachment) ToListenerAdditionalCertificateAttachmentOutput() ListenerAdditionalCertificateAttachmentOutput {
	return i.ToListenerAdditionalCertificateAttachmentOutputWithContext(context.Background())
}

func (i *ListenerAdditionalCertificateAttachment) ToListenerAdditionalCertificateAttachmentOutputWithContext(ctx context.Context) ListenerAdditionalCertificateAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerAdditionalCertificateAttachmentOutput)
}

// ListenerAdditionalCertificateAttachmentArrayInput is an input type that accepts ListenerAdditionalCertificateAttachmentArray and ListenerAdditionalCertificateAttachmentArrayOutput values.
// You can construct a concrete instance of `ListenerAdditionalCertificateAttachmentArrayInput` via:
//
//          ListenerAdditionalCertificateAttachmentArray{ ListenerAdditionalCertificateAttachmentArgs{...} }
type ListenerAdditionalCertificateAttachmentArrayInput interface {
	pulumi.Input

	ToListenerAdditionalCertificateAttachmentArrayOutput() ListenerAdditionalCertificateAttachmentArrayOutput
	ToListenerAdditionalCertificateAttachmentArrayOutputWithContext(context.Context) ListenerAdditionalCertificateAttachmentArrayOutput
}

type ListenerAdditionalCertificateAttachmentArray []ListenerAdditionalCertificateAttachmentInput

func (ListenerAdditionalCertificateAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ListenerAdditionalCertificateAttachment)(nil)).Elem()
}

func (i ListenerAdditionalCertificateAttachmentArray) ToListenerAdditionalCertificateAttachmentArrayOutput() ListenerAdditionalCertificateAttachmentArrayOutput {
	return i.ToListenerAdditionalCertificateAttachmentArrayOutputWithContext(context.Background())
}

func (i ListenerAdditionalCertificateAttachmentArray) ToListenerAdditionalCertificateAttachmentArrayOutputWithContext(ctx context.Context) ListenerAdditionalCertificateAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerAdditionalCertificateAttachmentArrayOutput)
}

// ListenerAdditionalCertificateAttachmentMapInput is an input type that accepts ListenerAdditionalCertificateAttachmentMap and ListenerAdditionalCertificateAttachmentMapOutput values.
// You can construct a concrete instance of `ListenerAdditionalCertificateAttachmentMapInput` via:
//
//          ListenerAdditionalCertificateAttachmentMap{ "key": ListenerAdditionalCertificateAttachmentArgs{...} }
type ListenerAdditionalCertificateAttachmentMapInput interface {
	pulumi.Input

	ToListenerAdditionalCertificateAttachmentMapOutput() ListenerAdditionalCertificateAttachmentMapOutput
	ToListenerAdditionalCertificateAttachmentMapOutputWithContext(context.Context) ListenerAdditionalCertificateAttachmentMapOutput
}

type ListenerAdditionalCertificateAttachmentMap map[string]ListenerAdditionalCertificateAttachmentInput

func (ListenerAdditionalCertificateAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ListenerAdditionalCertificateAttachment)(nil)).Elem()
}

func (i ListenerAdditionalCertificateAttachmentMap) ToListenerAdditionalCertificateAttachmentMapOutput() ListenerAdditionalCertificateAttachmentMapOutput {
	return i.ToListenerAdditionalCertificateAttachmentMapOutputWithContext(context.Background())
}

func (i ListenerAdditionalCertificateAttachmentMap) ToListenerAdditionalCertificateAttachmentMapOutputWithContext(ctx context.Context) ListenerAdditionalCertificateAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerAdditionalCertificateAttachmentMapOutput)
}

type ListenerAdditionalCertificateAttachmentOutput struct{ *pulumi.OutputState }

func (ListenerAdditionalCertificateAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ListenerAdditionalCertificateAttachment)(nil)).Elem()
}

func (o ListenerAdditionalCertificateAttachmentOutput) ToListenerAdditionalCertificateAttachmentOutput() ListenerAdditionalCertificateAttachmentOutput {
	return o
}

func (o ListenerAdditionalCertificateAttachmentOutput) ToListenerAdditionalCertificateAttachmentOutputWithContext(ctx context.Context) ListenerAdditionalCertificateAttachmentOutput {
	return o
}

// The Certificate ID.
func (o ListenerAdditionalCertificateAttachmentOutput) CertificateId() pulumi.StringOutput {
	return o.ApplyT(func(v *ListenerAdditionalCertificateAttachment) pulumi.StringOutput { return v.CertificateId }).(pulumi.StringOutput)
}

// The type of the certificate.
func (o ListenerAdditionalCertificateAttachmentOutput) CertificateType() pulumi.StringOutput {
	return o.ApplyT(func(v *ListenerAdditionalCertificateAttachment) pulumi.StringOutput { return v.CertificateType }).(pulumi.StringOutput)
}

// The ID of the ALB listener.
func (o ListenerAdditionalCertificateAttachmentOutput) ListenerId() pulumi.StringOutput {
	return o.ApplyT(func(v *ListenerAdditionalCertificateAttachment) pulumi.StringOutput { return v.ListenerId }).(pulumi.StringOutput)
}

// The status of the certificate.
func (o ListenerAdditionalCertificateAttachmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ListenerAdditionalCertificateAttachment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type ListenerAdditionalCertificateAttachmentArrayOutput struct{ *pulumi.OutputState }

func (ListenerAdditionalCertificateAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ListenerAdditionalCertificateAttachment)(nil)).Elem()
}

func (o ListenerAdditionalCertificateAttachmentArrayOutput) ToListenerAdditionalCertificateAttachmentArrayOutput() ListenerAdditionalCertificateAttachmentArrayOutput {
	return o
}

func (o ListenerAdditionalCertificateAttachmentArrayOutput) ToListenerAdditionalCertificateAttachmentArrayOutputWithContext(ctx context.Context) ListenerAdditionalCertificateAttachmentArrayOutput {
	return o
}

func (o ListenerAdditionalCertificateAttachmentArrayOutput) Index(i pulumi.IntInput) ListenerAdditionalCertificateAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ListenerAdditionalCertificateAttachment {
		return vs[0].([]*ListenerAdditionalCertificateAttachment)[vs[1].(int)]
	}).(ListenerAdditionalCertificateAttachmentOutput)
}

type ListenerAdditionalCertificateAttachmentMapOutput struct{ *pulumi.OutputState }

func (ListenerAdditionalCertificateAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ListenerAdditionalCertificateAttachment)(nil)).Elem()
}

func (o ListenerAdditionalCertificateAttachmentMapOutput) ToListenerAdditionalCertificateAttachmentMapOutput() ListenerAdditionalCertificateAttachmentMapOutput {
	return o
}

func (o ListenerAdditionalCertificateAttachmentMapOutput) ToListenerAdditionalCertificateAttachmentMapOutputWithContext(ctx context.Context) ListenerAdditionalCertificateAttachmentMapOutput {
	return o
}

func (o ListenerAdditionalCertificateAttachmentMapOutput) MapIndex(k pulumi.StringInput) ListenerAdditionalCertificateAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ListenerAdditionalCertificateAttachment {
		return vs[0].(map[string]*ListenerAdditionalCertificateAttachment)[vs[1].(string)]
	}).(ListenerAdditionalCertificateAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerAdditionalCertificateAttachmentInput)(nil)).Elem(), &ListenerAdditionalCertificateAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerAdditionalCertificateAttachmentArrayInput)(nil)).Elem(), ListenerAdditionalCertificateAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerAdditionalCertificateAttachmentMapInput)(nil)).Elem(), ListenerAdditionalCertificateAttachmentMap{})
	pulumi.RegisterOutputType(ListenerAdditionalCertificateAttachmentOutput{})
	pulumi.RegisterOutputType(ListenerAdditionalCertificateAttachmentArrayOutput{})
	pulumi.RegisterOutputType(ListenerAdditionalCertificateAttachmentMapOutput{})
}
