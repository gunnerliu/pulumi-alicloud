// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package alb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Application Load Balancer (ALB) Listener resource.
//
// For information about Application Load Balancer (ALB) Listener and how to use it, see [What is Listener](https://www.alibabacloud.com/help/en/slb/application-load-balancer/developer-reference/api-alb-2020-06-16-createlistener).
//
// > **NOTE:** Available since v1.133.0.
//
// ## Import
//
// Application Load Balancer (ALB) Listener can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:alb/listener:Listener example <id>
// ```
type Listener struct {
	pulumi.CustomResourceState

	// Indicates whether the access log has a custom header field. Valid values: true and false. Default value: false.
	//
	// > **NOTE:** Only Instances outside the Security Group to Access the Log Switch **accesslogenabled** Open, in Order to Set This Parameter to the **True**.
	AccessLogRecordCustomizedHeadersEnabled pulumi.BoolOutput `pulumi:"accessLogRecordCustomizedHeadersEnabled"`
	// Xtrace Configuration Information. See `accessLogTracingConfig` below for details.
	AccessLogTracingConfig ListenerAccessLogTracingConfigPtrOutput `pulumi:"accessLogTracingConfig"`
	// The configurations of the access control lists (ACLs). See `aclConfig` below for details. **NOTE:** Field `aclConfig` has been deprecated from provider version 1.163.0, and it will be removed in the future version. Please use the new resource `alb.ListenerAclAttachment`.,
	//
	// Deprecated: Field 'acl_config' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_alb_listener_acl_attachment'.
	AclConfig ListenerAclConfigOutput `pulumi:"aclConfig"`
	// The default certificate of the Listener. See `certificates` below for details. **NOTE:** When `listenerProtocol` is `HTTPS`, The default certificate must be set one。
	Certificates ListenerCertificatesPtrOutput `pulumi:"certificates"`
	// The Default Rule Action List. See `defaultActions` below for details.
	DefaultActions ListenerDefaultActionArrayOutput `pulumi:"defaultActions"`
	// The dry run.
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// Whether to Enable Gzip Compression, as a Specific File Type on a Compression. Valid values: `false`, `true`. Default Value: `true`. .
	GzipEnabled pulumi.BoolOutput `pulumi:"gzipEnabled"`
	// Whether to Enable HTTP/2 Features. Valid Values: `True` Or `False`. Default Value: `True`.
	//
	// > **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
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
	// Configuration Associated with the QuIC Listening. See `quicConfig` below for details.
	QuicConfig ListenerQuicConfigOutput `pulumi:"quicConfig"`
	// The Specified Request Timeout Time. Value: `1` to `180`. Unit: Seconds. Default Value: `60`. If the Timeout Time Within the Back-End Server Has Not Answered the ALB Will Give up Waiting, the Client Returns the HTTP 504 Error Code.
	RequestTimeout pulumi.IntOutput `pulumi:"requestTimeout"`
	// Security Policy.
	//
	// > **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
	SecurityPolicyId pulumi.StringOutput `pulumi:"securityPolicyId"`
	// The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
	Status pulumi.StringOutput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The `xForwardFor` Related Attribute Configuration. See `xForwardedForConfig` below for details. **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
	XForwardedForConfig ListenerXForwardedForConfigOutput `pulumi:"xForwardedForConfig"`
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	//
	// > **NOTE:** Only Instances outside the Security Group to Access the Log Switch **accesslogenabled** Open, in Order to Set This Parameter to the **True**.
	AccessLogRecordCustomizedHeadersEnabled *bool `pulumi:"accessLogRecordCustomizedHeadersEnabled"`
	// Xtrace Configuration Information. See `accessLogTracingConfig` below for details.
	AccessLogTracingConfig *ListenerAccessLogTracingConfig `pulumi:"accessLogTracingConfig"`
	// The configurations of the access control lists (ACLs). See `aclConfig` below for details. **NOTE:** Field `aclConfig` has been deprecated from provider version 1.163.0, and it will be removed in the future version. Please use the new resource `alb.ListenerAclAttachment`.,
	//
	// Deprecated: Field 'acl_config' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_alb_listener_acl_attachment'.
	AclConfig *ListenerAclConfig `pulumi:"aclConfig"`
	// The default certificate of the Listener. See `certificates` below for details. **NOTE:** When `listenerProtocol` is `HTTPS`, The default certificate must be set one。
	Certificates *ListenerCertificates `pulumi:"certificates"`
	// The Default Rule Action List. See `defaultActions` below for details.
	DefaultActions []ListenerDefaultAction `pulumi:"defaultActions"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// Whether to Enable Gzip Compression, as a Specific File Type on a Compression. Valid values: `false`, `true`. Default Value: `true`. .
	GzipEnabled *bool `pulumi:"gzipEnabled"`
	// Whether to Enable HTTP/2 Features. Valid Values: `True` Or `False`. Default Value: `True`.
	//
	// > **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
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
	// Configuration Associated with the QuIC Listening. See `quicConfig` below for details.
	QuicConfig *ListenerQuicConfig `pulumi:"quicConfig"`
	// The Specified Request Timeout Time. Value: `1` to `180`. Unit: Seconds. Default Value: `60`. If the Timeout Time Within the Back-End Server Has Not Answered the ALB Will Give up Waiting, the Client Returns the HTTP 504 Error Code.
	RequestTimeout *int `pulumi:"requestTimeout"`
	// Security Policy.
	//
	// > **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
	SecurityPolicyId *string `pulumi:"securityPolicyId"`
	// The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The `xForwardFor` Related Attribute Configuration. See `xForwardedForConfig` below for details. **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
	XForwardedForConfig *ListenerXForwardedForConfig `pulumi:"xForwardedForConfig"`
}

type ListenerState struct {
	// Indicates whether the access log has a custom header field. Valid values: true and false. Default value: false.
	//
	// > **NOTE:** Only Instances outside the Security Group to Access the Log Switch **accesslogenabled** Open, in Order to Set This Parameter to the **True**.
	AccessLogRecordCustomizedHeadersEnabled pulumi.BoolPtrInput
	// Xtrace Configuration Information. See `accessLogTracingConfig` below for details.
	AccessLogTracingConfig ListenerAccessLogTracingConfigPtrInput
	// The configurations of the access control lists (ACLs). See `aclConfig` below for details. **NOTE:** Field `aclConfig` has been deprecated from provider version 1.163.0, and it will be removed in the future version. Please use the new resource `alb.ListenerAclAttachment`.,
	//
	// Deprecated: Field 'acl_config' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_alb_listener_acl_attachment'.
	AclConfig ListenerAclConfigPtrInput
	// The default certificate of the Listener. See `certificates` below for details. **NOTE:** When `listenerProtocol` is `HTTPS`, The default certificate must be set one。
	Certificates ListenerCertificatesPtrInput
	// The Default Rule Action List. See `defaultActions` below for details.
	DefaultActions ListenerDefaultActionArrayInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// Whether to Enable Gzip Compression, as a Specific File Type on a Compression. Valid values: `false`, `true`. Default Value: `true`. .
	GzipEnabled pulumi.BoolPtrInput
	// Whether to Enable HTTP/2 Features. Valid Values: `True` Or `False`. Default Value: `True`.
	//
	// > **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
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
	// Configuration Associated with the QuIC Listening. See `quicConfig` below for details.
	QuicConfig ListenerQuicConfigPtrInput
	// The Specified Request Timeout Time. Value: `1` to `180`. Unit: Seconds. Default Value: `60`. If the Timeout Time Within the Back-End Server Has Not Answered the ALB Will Give up Waiting, the Client Returns the HTTP 504 Error Code.
	RequestTimeout pulumi.IntPtrInput
	// Security Policy.
	//
	// > **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
	SecurityPolicyId pulumi.StringPtrInput
	// The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The `xForwardFor` Related Attribute Configuration. See `xForwardedForConfig` below for details. **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
	XForwardedForConfig ListenerXForwardedForConfigPtrInput
}

func (ListenerState) ElementType() reflect.Type {
	return reflect.TypeOf((*listenerState)(nil)).Elem()
}

type listenerArgs struct {
	// Indicates whether the access log has a custom header field. Valid values: true and false. Default value: false.
	//
	// > **NOTE:** Only Instances outside the Security Group to Access the Log Switch **accesslogenabled** Open, in Order to Set This Parameter to the **True**.
	AccessLogRecordCustomizedHeadersEnabled *bool `pulumi:"accessLogRecordCustomizedHeadersEnabled"`
	// Xtrace Configuration Information. See `accessLogTracingConfig` below for details.
	AccessLogTracingConfig *ListenerAccessLogTracingConfig `pulumi:"accessLogTracingConfig"`
	// The configurations of the access control lists (ACLs). See `aclConfig` below for details. **NOTE:** Field `aclConfig` has been deprecated from provider version 1.163.0, and it will be removed in the future version. Please use the new resource `alb.ListenerAclAttachment`.,
	//
	// Deprecated: Field 'acl_config' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_alb_listener_acl_attachment'.
	AclConfig *ListenerAclConfig `pulumi:"aclConfig"`
	// The default certificate of the Listener. See `certificates` below for details. **NOTE:** When `listenerProtocol` is `HTTPS`, The default certificate must be set one。
	Certificates *ListenerCertificates `pulumi:"certificates"`
	// The Default Rule Action List. See `defaultActions` below for details.
	DefaultActions []ListenerDefaultAction `pulumi:"defaultActions"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// Whether to Enable Gzip Compression, as a Specific File Type on a Compression. Valid values: `false`, `true`. Default Value: `true`. .
	GzipEnabled *bool `pulumi:"gzipEnabled"`
	// Whether to Enable HTTP/2 Features. Valid Values: `True` Or `False`. Default Value: `True`.
	//
	// > **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
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
	// Configuration Associated with the QuIC Listening. See `quicConfig` below for details.
	QuicConfig *ListenerQuicConfig `pulumi:"quicConfig"`
	// The Specified Request Timeout Time. Value: `1` to `180`. Unit: Seconds. Default Value: `60`. If the Timeout Time Within the Back-End Server Has Not Answered the ALB Will Give up Waiting, the Client Returns the HTTP 504 Error Code.
	RequestTimeout *int `pulumi:"requestTimeout"`
	// Security Policy.
	//
	// > **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
	SecurityPolicyId *string `pulumi:"securityPolicyId"`
	// The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The `xForwardFor` Related Attribute Configuration. See `xForwardedForConfig` below for details. **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
	XForwardedForConfig *ListenerXForwardedForConfig `pulumi:"xForwardedForConfig"`
}

// The set of arguments for constructing a Listener resource.
type ListenerArgs struct {
	// Indicates whether the access log has a custom header field. Valid values: true and false. Default value: false.
	//
	// > **NOTE:** Only Instances outside the Security Group to Access the Log Switch **accesslogenabled** Open, in Order to Set This Parameter to the **True**.
	AccessLogRecordCustomizedHeadersEnabled pulumi.BoolPtrInput
	// Xtrace Configuration Information. See `accessLogTracingConfig` below for details.
	AccessLogTracingConfig ListenerAccessLogTracingConfigPtrInput
	// The configurations of the access control lists (ACLs). See `aclConfig` below for details. **NOTE:** Field `aclConfig` has been deprecated from provider version 1.163.0, and it will be removed in the future version. Please use the new resource `alb.ListenerAclAttachment`.,
	//
	// Deprecated: Field 'acl_config' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_alb_listener_acl_attachment'.
	AclConfig ListenerAclConfigPtrInput
	// The default certificate of the Listener. See `certificates` below for details. **NOTE:** When `listenerProtocol` is `HTTPS`, The default certificate must be set one。
	Certificates ListenerCertificatesPtrInput
	// The Default Rule Action List. See `defaultActions` below for details.
	DefaultActions ListenerDefaultActionArrayInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// Whether to Enable Gzip Compression, as a Specific File Type on a Compression. Valid values: `false`, `true`. Default Value: `true`. .
	GzipEnabled pulumi.BoolPtrInput
	// Whether to Enable HTTP/2 Features. Valid Values: `True` Or `False`. Default Value: `True`.
	//
	// > **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
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
	// Configuration Associated with the QuIC Listening. See `quicConfig` below for details.
	QuicConfig ListenerQuicConfigPtrInput
	// The Specified Request Timeout Time. Value: `1` to `180`. Unit: Seconds. Default Value: `60`. If the Timeout Time Within the Back-End Server Has Not Answered the ALB Will Give up Waiting, the Client Returns the HTTP 504 Error Code.
	RequestTimeout pulumi.IntPtrInput
	// Security Policy.
	//
	// > **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
	SecurityPolicyId pulumi.StringPtrInput
	// The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The `xForwardFor` Related Attribute Configuration. See `xForwardedForConfig` below for details. **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
	XForwardedForConfig ListenerXForwardedForConfigPtrInput
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
	return reflect.TypeOf((**Listener)(nil)).Elem()
}

func (i *Listener) ToListenerOutput() ListenerOutput {
	return i.ToListenerOutputWithContext(context.Background())
}

func (i *Listener) ToListenerOutputWithContext(ctx context.Context) ListenerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerOutput)
}

// ListenerArrayInput is an input type that accepts ListenerArray and ListenerArrayOutput values.
// You can construct a concrete instance of `ListenerArrayInput` via:
//
//	ListenerArray{ ListenerArgs{...} }
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
//	ListenerMap{ "key": ListenerArgs{...} }
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
	return reflect.TypeOf((**Listener)(nil)).Elem()
}

func (o ListenerOutput) ToListenerOutput() ListenerOutput {
	return o
}

func (o ListenerOutput) ToListenerOutputWithContext(ctx context.Context) ListenerOutput {
	return o
}

// Indicates whether the access log has a custom header field. Valid values: true and false. Default value: false.
//
// > **NOTE:** Only Instances outside the Security Group to Access the Log Switch **accesslogenabled** Open, in Order to Set This Parameter to the **True**.
func (o ListenerOutput) AccessLogRecordCustomizedHeadersEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Listener) pulumi.BoolOutput { return v.AccessLogRecordCustomizedHeadersEnabled }).(pulumi.BoolOutput)
}

// Xtrace Configuration Information. See `accessLogTracingConfig` below for details.
func (o ListenerOutput) AccessLogTracingConfig() ListenerAccessLogTracingConfigPtrOutput {
	return o.ApplyT(func(v *Listener) ListenerAccessLogTracingConfigPtrOutput { return v.AccessLogTracingConfig }).(ListenerAccessLogTracingConfigPtrOutput)
}

// The configurations of the access control lists (ACLs). See `aclConfig` below for details. **NOTE:** Field `aclConfig` has been deprecated from provider version 1.163.0, and it will be removed in the future version. Please use the new resource `alb.ListenerAclAttachment`.,
//
// Deprecated: Field 'acl_config' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_alb_listener_acl_attachment'.
func (o ListenerOutput) AclConfig() ListenerAclConfigOutput {
	return o.ApplyT(func(v *Listener) ListenerAclConfigOutput { return v.AclConfig }).(ListenerAclConfigOutput)
}

// The default certificate of the Listener. See `certificates` below for details. **NOTE:** When `listenerProtocol` is `HTTPS`, The default certificate must be set one。
func (o ListenerOutput) Certificates() ListenerCertificatesPtrOutput {
	return o.ApplyT(func(v *Listener) ListenerCertificatesPtrOutput { return v.Certificates }).(ListenerCertificatesPtrOutput)
}

// The Default Rule Action List. See `defaultActions` below for details.
func (o ListenerOutput) DefaultActions() ListenerDefaultActionArrayOutput {
	return o.ApplyT(func(v *Listener) ListenerDefaultActionArrayOutput { return v.DefaultActions }).(ListenerDefaultActionArrayOutput)
}

// The dry run.
func (o ListenerOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Listener) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// Whether to Enable Gzip Compression, as a Specific File Type on a Compression. Valid values: `false`, `true`. Default Value: `true`. .
func (o ListenerOutput) GzipEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Listener) pulumi.BoolOutput { return v.GzipEnabled }).(pulumi.BoolOutput)
}

// Whether to Enable HTTP/2 Features. Valid Values: `True` Or `False`. Default Value: `True`.
//
// > **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
func (o ListenerOutput) Http2Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Listener) pulumi.BoolOutput { return v.Http2Enabled }).(pulumi.BoolOutput)
}

// Specify the Connection Idle Timeout Value: `1` to `60`. Unit: Seconds.
func (o ListenerOutput) IdleTimeout() pulumi.IntOutput {
	return o.ApplyT(func(v *Listener) pulumi.IntOutput { return v.IdleTimeout }).(pulumi.IntOutput)
}

// The description of the listener. The description must be 2 to 256 characters in length. The name can contain only the characters in the following string: `/^([^\x00-\xff]|[\w.,;/@-]){2,256}$/`.
func (o ListenerOutput) ListenerDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Listener) pulumi.StringPtrOutput { return v.ListenerDescription }).(pulumi.StringPtrOutput)
}

// The ALB Instance Front-End, and Those of the Ports Used. Value: `1` to `65535`.
func (o ListenerOutput) ListenerPort() pulumi.IntOutput {
	return o.ApplyT(func(v *Listener) pulumi.IntOutput { return v.ListenerPort }).(pulumi.IntOutput)
}

// Snooping Protocols. Valid Values: `HTTP`, `HTTPS` Or `QUIC`.
func (o ListenerOutput) ListenerProtocol() pulumi.StringOutput {
	return o.ApplyT(func(v *Listener) pulumi.StringOutput { return v.ListenerProtocol }).(pulumi.StringOutput)
}

// The ALB Instance Id.
func (o ListenerOutput) LoadBalancerId() pulumi.StringOutput {
	return o.ApplyT(func(v *Listener) pulumi.StringOutput { return v.LoadBalancerId }).(pulumi.StringOutput)
}

// Configuration Associated with the QuIC Listening. See `quicConfig` below for details.
func (o ListenerOutput) QuicConfig() ListenerQuicConfigOutput {
	return o.ApplyT(func(v *Listener) ListenerQuicConfigOutput { return v.QuicConfig }).(ListenerQuicConfigOutput)
}

// The Specified Request Timeout Time. Value: `1` to `180`. Unit: Seconds. Default Value: `60`. If the Timeout Time Within the Back-End Server Has Not Answered the ALB Will Give up Waiting, the Client Returns the HTTP 504 Error Code.
func (o ListenerOutput) RequestTimeout() pulumi.IntOutput {
	return o.ApplyT(func(v *Listener) pulumi.IntOutput { return v.RequestTimeout }).(pulumi.IntOutput)
}

// Security Policy.
//
// > **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
func (o ListenerOutput) SecurityPolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v *Listener) pulumi.StringOutput { return v.SecurityPolicyId }).(pulumi.StringOutput)
}

// The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
func (o ListenerOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Listener) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o ListenerOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *Listener) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// The `xForwardFor` Related Attribute Configuration. See `xForwardedForConfig` below for details. **NOTE:** The attribute is valid when the attribute `listenerProtocol` is `HTTPS`.
func (o ListenerOutput) XForwardedForConfig() ListenerXForwardedForConfigOutput {
	return o.ApplyT(func(v *Listener) ListenerXForwardedForConfigOutput { return v.XForwardedForConfig }).(ListenerXForwardedForConfigOutput)
}

type ListenerArrayOutput struct{ *pulumi.OutputState }

func (ListenerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Listener)(nil)).Elem()
}

func (o ListenerArrayOutput) ToListenerArrayOutput() ListenerArrayOutput {
	return o
}

func (o ListenerArrayOutput) ToListenerArrayOutputWithContext(ctx context.Context) ListenerArrayOutput {
	return o
}

func (o ListenerArrayOutput) Index(i pulumi.IntInput) ListenerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Listener {
		return vs[0].([]*Listener)[vs[1].(int)]
	}).(ListenerOutput)
}

type ListenerMapOutput struct{ *pulumi.OutputState }

func (ListenerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Listener)(nil)).Elem()
}

func (o ListenerMapOutput) ToListenerMapOutput() ListenerMapOutput {
	return o
}

func (o ListenerMapOutput) ToListenerMapOutputWithContext(ctx context.Context) ListenerMapOutput {
	return o
}

func (o ListenerMapOutput) MapIndex(k pulumi.StringInput) ListenerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Listener {
		return vs[0].(map[string]*Listener)[vs[1].(string)]
	}).(ListenerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerInput)(nil)).Elem(), &Listener{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerArrayInput)(nil)).Elem(), ListenerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerMapInput)(nil)).Elem(), ListenerMap{})
	pulumi.RegisterOutputType(ListenerOutput{})
	pulumi.RegisterOutputType(ListenerArrayOutput{})
	pulumi.RegisterOutputType(ListenerMapOutput{})
}
