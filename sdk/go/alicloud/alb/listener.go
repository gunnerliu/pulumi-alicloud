// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package alb

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Application Load Balancer (ALB) Listener resource.
//
// For information about Application Load Balancer (ALB) Listener and how to use it, see [What is Listener](https://www.alibabacloud.com/help/doc-detail/214348.htm).
//
// > **NOTE:** Available in v1.133.0+.
//
// ## Import
//
// Application Load Balancer (ALB) Listener can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:alb/listener:Listener example <id>
// ```
type Listener struct {
	pulumi.CustomResourceState

	// Indicates whether the access log has a custom header field. Valid values: true and false. Default value: false.
	AccessLogRecordCustomizedHeadersEnabled pulumi.BoolOutput `pulumi:"accessLogRecordCustomizedHeadersEnabled"`
	// Xtrace Configuration Information. See the following `Block accessLogTracingConfig`.
	AccessLogTracingConfig ListenerAccessLogTracingConfigPtrOutput `pulumi:"accessLogTracingConfig"`
	// The configurations of the access control lists (ACLs). See the following `Block aclConfig`.
	AclConfig ListenerAclConfigPtrOutput `pulumi:"aclConfig"`
	// The Certificate List. See the following `Block certificates`.
	Certificates ListenerCertificateArrayOutput `pulumi:"certificates"`
	// The Default Rule Action List. See the following `Block defaultActions`.
	DefaultActions ListenerDefaultActionArrayOutput `pulumi:"defaultActions"`
	// The dry run.
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// Whether to Enable Gzip Compression, as a Specific File Type on a Compression. Valid values: `false`, `true`. Default Value: `true`. .
	GzipEnabled pulumi.BoolOutput `pulumi:"gzipEnabled"`
	// Whether to Enable HTTP/2 Features. Valid Values: `True` Or `False`. Default Value: `True`.
	Http2Enabled pulumi.BoolOutput `pulumi:"http2Enabled"`
	// Specify the Connection Idle Timeout Value: `1` to `60`. Unit: Seconds.
	IdleTimeout pulumi.IntOutput `pulumi:"idleTimeout"`
	// The description of the listener. The description must be 2 to 256 characters in length. The name can contain only the characters in the following string: `/^([^\x00-\xff]|[\w.,;/@-]){2,256}$/`.
	ListenerDescription pulumi.StringPtrOutput `pulumi:"listenerDescription"`
	// The ALB Instance Front-End, and Those of the Ports Used. Value: `1` to `65535`.
	ListenerPort pulumi.IntOutput `pulumi:"listenerPort"`
	// Snooping Protocols. Valid Values: `HTTP`, `HTTPS` Or `QUIC`.
	ListenerProtocol pulumi.StringOutput `pulumi:"listenerProtocol"`
	// The ALB Instance Id.
	LoadBalancerId pulumi.StringOutput `pulumi:"loadBalancerId"`
	// Configuration Associated with the QuIC Listening. See the following `Block quicConfig`.
	QuicConfig ListenerQuicConfigOutput `pulumi:"quicConfig"`
	// The Specified Request Timeout Time. Value: `1` to `180`. Unit: Seconds. Default Value: `60`. If the Timeout Time Within the Back-End Server Has Not Answered the ALB Will Give up Waiting, the Client Returns the HTTP 504 Error Code.
	RequestTimeout pulumi.IntOutput `pulumi:"requestTimeout"`
	// Security Policy.
	SecurityPolicyId pulumi.StringOutput `pulumi:"securityPolicyId"`
	// The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
	Status pulumi.StringOutput `pulumi:"status"`
	// xforwardfor Related Attribute Configuration. See the following `Block xforwardedForConfig`.
	XforwardedForConfig ListenerXforwardedForConfigOutput `pulumi:"xforwardedForConfig"`
}

// NewListener registers a new resource with the given unique name, arguments, and options.
func NewListener(ctx *pulumi.Context,
	name string, args *ListenerArgs, opts ...pulumi.ResourceOption) (*Listener, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ListenerPort == nil {
		return nil, errors.New("invalid value for required argument 'ListenerPort'")
	}
	if args.ListenerProtocol == nil {
		return nil, errors.New("invalid value for required argument 'ListenerProtocol'")
	}
	if args.LoadBalancerId == nil {
		return nil, errors.New("invalid value for required argument 'LoadBalancerId'")
	}
	var resource Listener
	err := ctx.RegisterResource("alicloud:alb/listener:Listener", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetListener gets an existing Listener resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetListener(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ListenerState, opts ...pulumi.ResourceOption) (*Listener, error) {
	var resource Listener
	err := ctx.ReadResource("alicloud:alb/listener:Listener", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Listener resources.
type listenerState struct {
	// Indicates whether the access log has a custom header field. Valid values: true and false. Default value: false.
	AccessLogRecordCustomizedHeadersEnabled *bool `pulumi:"accessLogRecordCustomizedHeadersEnabled"`
	// Xtrace Configuration Information. See the following `Block accessLogTracingConfig`.
	AccessLogTracingConfig *ListenerAccessLogTracingConfig `pulumi:"accessLogTracingConfig"`
	// The configurations of the access control lists (ACLs). See the following `Block aclConfig`.
	AclConfig *ListenerAclConfig `pulumi:"aclConfig"`
	// The Certificate List. See the following `Block certificates`.
	Certificates []ListenerCertificate `pulumi:"certificates"`
	// The Default Rule Action List. See the following `Block defaultActions`.
	DefaultActions []ListenerDefaultAction `pulumi:"defaultActions"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// Whether to Enable Gzip Compression, as a Specific File Type on a Compression. Valid values: `false`, `true`. Default Value: `true`. .
	GzipEnabled *bool `pulumi:"gzipEnabled"`
	// Whether to Enable HTTP/2 Features. Valid Values: `True` Or `False`. Default Value: `True`.
	Http2Enabled *bool `pulumi:"http2Enabled"`
	// Specify the Connection Idle Timeout Value: `1` to `60`. Unit: Seconds.
	IdleTimeout *int `pulumi:"idleTimeout"`
	// The description of the listener. The description must be 2 to 256 characters in length. The name can contain only the characters in the following string: `/^([^\x00-\xff]|[\w.,;/@-]){2,256}$/`.
	ListenerDescription *string `pulumi:"listenerDescription"`
	// The ALB Instance Front-End, and Those of the Ports Used. Value: `1` to `65535`.
	ListenerPort *int `pulumi:"listenerPort"`
	// Snooping Protocols. Valid Values: `HTTP`, `HTTPS` Or `QUIC`.
	ListenerProtocol *string `pulumi:"listenerProtocol"`
	// The ALB Instance Id.
	LoadBalancerId *string `pulumi:"loadBalancerId"`
	// Configuration Associated with the QuIC Listening. See the following `Block quicConfig`.
	QuicConfig *ListenerQuicConfig `pulumi:"quicConfig"`
	// The Specified Request Timeout Time. Value: `1` to `180`. Unit: Seconds. Default Value: `60`. If the Timeout Time Within the Back-End Server Has Not Answered the ALB Will Give up Waiting, the Client Returns the HTTP 504 Error Code.
	RequestTimeout *int `pulumi:"requestTimeout"`
	// Security Policy.
	SecurityPolicyId *string `pulumi:"securityPolicyId"`
	// The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
	Status *string `pulumi:"status"`
	// xforwardfor Related Attribute Configuration. See the following `Block xforwardedForConfig`.
	XforwardedForConfig *ListenerXforwardedForConfig `pulumi:"xforwardedForConfig"`
}

type ListenerState struct {
	// Indicates whether the access log has a custom header field. Valid values: true and false. Default value: false.
	AccessLogRecordCustomizedHeadersEnabled pulumi.BoolPtrInput
	// Xtrace Configuration Information. See the following `Block accessLogTracingConfig`.
	AccessLogTracingConfig ListenerAccessLogTracingConfigPtrInput
	// The configurations of the access control lists (ACLs). See the following `Block aclConfig`.
	AclConfig ListenerAclConfigPtrInput
	// The Certificate List. See the following `Block certificates`.
	Certificates ListenerCertificateArrayInput
	// The Default Rule Action List. See the following `Block defaultActions`.
	DefaultActions ListenerDefaultActionArrayInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// Whether to Enable Gzip Compression, as a Specific File Type on a Compression. Valid values: `false`, `true`. Default Value: `true`. .
	GzipEnabled pulumi.BoolPtrInput
	// Whether to Enable HTTP/2 Features. Valid Values: `True` Or `False`. Default Value: `True`.
	Http2Enabled pulumi.BoolPtrInput
	// Specify the Connection Idle Timeout Value: `1` to `60`. Unit: Seconds.
	IdleTimeout pulumi.IntPtrInput
	// The description of the listener. The description must be 2 to 256 characters in length. The name can contain only the characters in the following string: `/^([^\x00-\xff]|[\w.,;/@-]){2,256}$/`.
	ListenerDescription pulumi.StringPtrInput
	// The ALB Instance Front-End, and Those of the Ports Used. Value: `1` to `65535`.
	ListenerPort pulumi.IntPtrInput
	// Snooping Protocols. Valid Values: `HTTP`, `HTTPS` Or `QUIC`.
	ListenerProtocol pulumi.StringPtrInput
	// The ALB Instance Id.
	LoadBalancerId pulumi.StringPtrInput
	// Configuration Associated with the QuIC Listening. See the following `Block quicConfig`.
	QuicConfig ListenerQuicConfigPtrInput
	// The Specified Request Timeout Time. Value: `1` to `180`. Unit: Seconds. Default Value: `60`. If the Timeout Time Within the Back-End Server Has Not Answered the ALB Will Give up Waiting, the Client Returns the HTTP 504 Error Code.
	RequestTimeout pulumi.IntPtrInput
	// Security Policy.
	SecurityPolicyId pulumi.StringPtrInput
	// The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
	Status pulumi.StringPtrInput
	// xforwardfor Related Attribute Configuration. See the following `Block xforwardedForConfig`.
	XforwardedForConfig ListenerXforwardedForConfigPtrInput
}

func (ListenerState) ElementType() reflect.Type {
	return reflect.TypeOf((*listenerState)(nil)).Elem()
}

type listenerArgs struct {
	// Indicates whether the access log has a custom header field. Valid values: true and false. Default value: false.
	AccessLogRecordCustomizedHeadersEnabled *bool `pulumi:"accessLogRecordCustomizedHeadersEnabled"`
	// Xtrace Configuration Information. See the following `Block accessLogTracingConfig`.
	AccessLogTracingConfig *ListenerAccessLogTracingConfig `pulumi:"accessLogTracingConfig"`
	// The configurations of the access control lists (ACLs). See the following `Block aclConfig`.
	AclConfig *ListenerAclConfig `pulumi:"aclConfig"`
	// The Certificate List. See the following `Block certificates`.
	Certificates []ListenerCertificate `pulumi:"certificates"`
	// The Default Rule Action List. See the following `Block defaultActions`.
	DefaultActions []ListenerDefaultAction `pulumi:"defaultActions"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// Whether to Enable Gzip Compression, as a Specific File Type on a Compression. Valid values: `false`, `true`. Default Value: `true`. .
	GzipEnabled *bool `pulumi:"gzipEnabled"`
	// Whether to Enable HTTP/2 Features. Valid Values: `True` Or `False`. Default Value: `True`.
	Http2Enabled *bool `pulumi:"http2Enabled"`
	// Specify the Connection Idle Timeout Value: `1` to `60`. Unit: Seconds.
	IdleTimeout *int `pulumi:"idleTimeout"`
	// The description of the listener. The description must be 2 to 256 characters in length. The name can contain only the characters in the following string: `/^([^\x00-\xff]|[\w.,;/@-]){2,256}$/`.
	ListenerDescription *string `pulumi:"listenerDescription"`
	// The ALB Instance Front-End, and Those of the Ports Used. Value: `1` to `65535`.
	ListenerPort int `pulumi:"listenerPort"`
	// Snooping Protocols. Valid Values: `HTTP`, `HTTPS` Or `QUIC`.
	ListenerProtocol string `pulumi:"listenerProtocol"`
	// The ALB Instance Id.
	LoadBalancerId string `pulumi:"loadBalancerId"`
	// Configuration Associated with the QuIC Listening. See the following `Block quicConfig`.
	QuicConfig *ListenerQuicConfig `pulumi:"quicConfig"`
	// The Specified Request Timeout Time. Value: `1` to `180`. Unit: Seconds. Default Value: `60`. If the Timeout Time Within the Back-End Server Has Not Answered the ALB Will Give up Waiting, the Client Returns the HTTP 504 Error Code.
	RequestTimeout *int `pulumi:"requestTimeout"`
	// Security Policy.
	SecurityPolicyId *string `pulumi:"securityPolicyId"`
	// The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
	Status *string `pulumi:"status"`
	// xforwardfor Related Attribute Configuration. See the following `Block xforwardedForConfig`.
	XforwardedForConfig *ListenerXforwardedForConfig `pulumi:"xforwardedForConfig"`
}

// The set of arguments for constructing a Listener resource.
type ListenerArgs struct {
	// Indicates whether the access log has a custom header field. Valid values: true and false. Default value: false.
	AccessLogRecordCustomizedHeadersEnabled pulumi.BoolPtrInput
	// Xtrace Configuration Information. See the following `Block accessLogTracingConfig`.
	AccessLogTracingConfig ListenerAccessLogTracingConfigPtrInput
	// The configurations of the access control lists (ACLs). See the following `Block aclConfig`.
	AclConfig ListenerAclConfigPtrInput
	// The Certificate List. See the following `Block certificates`.
	Certificates ListenerCertificateArrayInput
	// The Default Rule Action List. See the following `Block defaultActions`.
	DefaultActions ListenerDefaultActionArrayInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// Whether to Enable Gzip Compression, as a Specific File Type on a Compression. Valid values: `false`, `true`. Default Value: `true`. .
	GzipEnabled pulumi.BoolPtrInput
	// Whether to Enable HTTP/2 Features. Valid Values: `True` Or `False`. Default Value: `True`.
	Http2Enabled pulumi.BoolPtrInput
	// Specify the Connection Idle Timeout Value: `1` to `60`. Unit: Seconds.
	IdleTimeout pulumi.IntPtrInput
	// The description of the listener. The description must be 2 to 256 characters in length. The name can contain only the characters in the following string: `/^([^\x00-\xff]|[\w.,;/@-]){2,256}$/`.
	ListenerDescription pulumi.StringPtrInput
	// The ALB Instance Front-End, and Those of the Ports Used. Value: `1` to `65535`.
	ListenerPort pulumi.IntInput
	// Snooping Protocols. Valid Values: `HTTP`, `HTTPS` Or `QUIC`.
	ListenerProtocol pulumi.StringInput
	// The ALB Instance Id.
	LoadBalancerId pulumi.StringInput
	// Configuration Associated with the QuIC Listening. See the following `Block quicConfig`.
	QuicConfig ListenerQuicConfigPtrInput
	// The Specified Request Timeout Time. Value: `1` to `180`. Unit: Seconds. Default Value: `60`. If the Timeout Time Within the Back-End Server Has Not Answered the ALB Will Give up Waiting, the Client Returns the HTTP 504 Error Code.
	RequestTimeout pulumi.IntPtrInput
	// Security Policy.
	SecurityPolicyId pulumi.StringPtrInput
	// The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
	Status pulumi.StringPtrInput
	// xforwardfor Related Attribute Configuration. See the following `Block xforwardedForConfig`.
	XforwardedForConfig ListenerXforwardedForConfigPtrInput
}

func (ListenerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*listenerArgs)(nil)).Elem()
}

type ListenerInput interface {
	pulumi.Input

	ToListenerOutput() ListenerOutput
	ToListenerOutputWithContext(ctx context.Context) ListenerOutput
}

func (*Listener) ElementType() reflect.Type {
	return reflect.TypeOf((*Listener)(nil))
}

func (i *Listener) ToListenerOutput() ListenerOutput {
	return i.ToListenerOutputWithContext(context.Background())
}

func (i *Listener) ToListenerOutputWithContext(ctx context.Context) ListenerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerOutput)
}

func (i *Listener) ToListenerPtrOutput() ListenerPtrOutput {
	return i.ToListenerPtrOutputWithContext(context.Background())
}

func (i *Listener) ToListenerPtrOutputWithContext(ctx context.Context) ListenerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerPtrOutput)
}

type ListenerPtrInput interface {
	pulumi.Input

	ToListenerPtrOutput() ListenerPtrOutput
	ToListenerPtrOutputWithContext(ctx context.Context) ListenerPtrOutput
}

type listenerPtrType ListenerArgs

func (*listenerPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Listener)(nil))
}

func (i *listenerPtrType) ToListenerPtrOutput() ListenerPtrOutput {
	return i.ToListenerPtrOutputWithContext(context.Background())
}

func (i *listenerPtrType) ToListenerPtrOutputWithContext(ctx context.Context) ListenerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerPtrOutput)
}

// ListenerArrayInput is an input type that accepts ListenerArray and ListenerArrayOutput values.
// You can construct a concrete instance of `ListenerArrayInput` via:
//
//          ListenerArray{ ListenerArgs{...} }
type ListenerArrayInput interface {
	pulumi.Input

	ToListenerArrayOutput() ListenerArrayOutput
	ToListenerArrayOutputWithContext(context.Context) ListenerArrayOutput
}

type ListenerArray []ListenerInput

func (ListenerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Listener)(nil)).Elem()
}

func (i ListenerArray) ToListenerArrayOutput() ListenerArrayOutput {
	return i.ToListenerArrayOutputWithContext(context.Background())
}

func (i ListenerArray) ToListenerArrayOutputWithContext(ctx context.Context) ListenerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerArrayOutput)
}

// ListenerMapInput is an input type that accepts ListenerMap and ListenerMapOutput values.
// You can construct a concrete instance of `ListenerMapInput` via:
//
//          ListenerMap{ "key": ListenerArgs{...} }
type ListenerMapInput interface {
	pulumi.Input

	ToListenerMapOutput() ListenerMapOutput
	ToListenerMapOutputWithContext(context.Context) ListenerMapOutput
}

type ListenerMap map[string]ListenerInput

func (ListenerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Listener)(nil)).Elem()
}

func (i ListenerMap) ToListenerMapOutput() ListenerMapOutput {
	return i.ToListenerMapOutputWithContext(context.Background())
}

func (i ListenerMap) ToListenerMapOutputWithContext(ctx context.Context) ListenerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerMapOutput)
}

type ListenerOutput struct{ *pulumi.OutputState }

func (ListenerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Listener)(nil))
}

func (o ListenerOutput) ToListenerOutput() ListenerOutput {
	return o
}

func (o ListenerOutput) ToListenerOutputWithContext(ctx context.Context) ListenerOutput {
	return o
}

func (o ListenerOutput) ToListenerPtrOutput() ListenerPtrOutput {
	return o.ToListenerPtrOutputWithContext(context.Background())
}

func (o ListenerOutput) ToListenerPtrOutputWithContext(ctx context.Context) ListenerPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v Listener) *Listener {
		return &v
	}).(ListenerPtrOutput)
}

type ListenerPtrOutput struct{ *pulumi.OutputState }

func (ListenerPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Listener)(nil))
}

func (o ListenerPtrOutput) ToListenerPtrOutput() ListenerPtrOutput {
	return o
}

func (o ListenerPtrOutput) ToListenerPtrOutputWithContext(ctx context.Context) ListenerPtrOutput {
	return o
}

func (o ListenerPtrOutput) Elem() ListenerOutput {
	return o.ApplyT(func(v *Listener) Listener {
		if v != nil {
			return *v
		}
		var ret Listener
		return ret
	}).(ListenerOutput)
}

type ListenerArrayOutput struct{ *pulumi.OutputState }

func (ListenerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Listener)(nil))
}

func (o ListenerArrayOutput) ToListenerArrayOutput() ListenerArrayOutput {
	return o
}

func (o ListenerArrayOutput) ToListenerArrayOutputWithContext(ctx context.Context) ListenerArrayOutput {
	return o
}

func (o ListenerArrayOutput) Index(i pulumi.IntInput) ListenerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Listener {
		return vs[0].([]Listener)[vs[1].(int)]
	}).(ListenerOutput)
}

type ListenerMapOutput struct{ *pulumi.OutputState }

func (ListenerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Listener)(nil))
}

func (o ListenerMapOutput) ToListenerMapOutput() ListenerMapOutput {
	return o
}

func (o ListenerMapOutput) ToListenerMapOutputWithContext(ctx context.Context) ListenerMapOutput {
	return o
}

func (o ListenerMapOutput) MapIndex(k pulumi.StringInput) ListenerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Listener {
		return vs[0].(map[string]Listener)[vs[1].(string)]
	}).(ListenerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerInput)(nil)).Elem(), &Listener{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerPtrInput)(nil)).Elem(), &Listener{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerArrayInput)(nil)).Elem(), ListenerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerMapInput)(nil)).Elem(), ListenerMap{})
	pulumi.RegisterOutputType(ListenerOutput{})
	pulumi.RegisterOutputType(ListenerPtrOutput{})
	pulumi.RegisterOutputType(ListenerArrayOutput{})
	pulumi.RegisterOutputType(ListenerMapOutput{})
}