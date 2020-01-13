// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package slb

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// A Load Balancer Server Certificate is an ssl Certificate used by the listener of the protocol https.
// 
// For information about slb and how to use it, see [What is Server Load Balancer](https://www.alibabacloud.com/help/doc-detail/27539.htm).
// 
// For information about Server Certificate and how to use it, see [Configure Server Certificate](https://www.alibabacloud.com/help/doc-detail/85968.htm).
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/slb_server_certificate.html.markdown.
type ServerCertificate struct {
	s *pulumi.ResourceState
}

// NewServerCertificate registers a new resource with the given unique name, arguments, and options.
func NewServerCertificate(ctx *pulumi.Context,
	name string, args *ServerCertificateArgs, opts ...pulumi.ResourceOpt) (*ServerCertificate, error) {
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["alicloudCertifacteId"] = nil
		inputs["alicloudCertifacteName"] = nil
		inputs["alicloudCertificateId"] = nil
		inputs["alicloudCertificateName"] = nil
		inputs["alicloudCertificateRegionId"] = nil
		inputs["name"] = nil
		inputs["privateKey"] = nil
		inputs["resourceGroupId"] = nil
		inputs["serverCertificate"] = nil
		inputs["tags"] = nil
	} else {
		inputs["alicloudCertifacteId"] = args.AlicloudCertifacteId
		inputs["alicloudCertifacteName"] = args.AlicloudCertifacteName
		inputs["alicloudCertificateId"] = args.AlicloudCertificateId
		inputs["alicloudCertificateName"] = args.AlicloudCertificateName
		inputs["alicloudCertificateRegionId"] = args.AlicloudCertificateRegionId
		inputs["name"] = args.Name
		inputs["privateKey"] = args.PrivateKey
		inputs["resourceGroupId"] = args.ResourceGroupId
		inputs["serverCertificate"] = args.ServerCertificate
		inputs["tags"] = args.Tags
	}
	s, err := ctx.RegisterResource("alicloud:slb/serverCertificate:ServerCertificate", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &ServerCertificate{s: s}, nil
}

// GetServerCertificate gets an existing ServerCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServerCertificate(ctx *pulumi.Context,
	name string, id pulumi.ID, state *ServerCertificateState, opts ...pulumi.ResourceOpt) (*ServerCertificate, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["alicloudCertifacteId"] = state.AlicloudCertifacteId
		inputs["alicloudCertifacteName"] = state.AlicloudCertifacteName
		inputs["alicloudCertificateId"] = state.AlicloudCertificateId
		inputs["alicloudCertificateName"] = state.AlicloudCertificateName
		inputs["alicloudCertificateRegionId"] = state.AlicloudCertificateRegionId
		inputs["name"] = state.Name
		inputs["privateKey"] = state.PrivateKey
		inputs["resourceGroupId"] = state.ResourceGroupId
		inputs["serverCertificate"] = state.ServerCertificate
		inputs["tags"] = state.Tags
	}
	s, err := ctx.ReadResource("alicloud:slb/serverCertificate:ServerCertificate", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &ServerCertificate{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *ServerCertificate) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *ServerCertificate) ID() pulumi.IDOutput {
	return r.s.ID()
}

func (r *ServerCertificate) AlicloudCertifacteId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["alicloudCertifacteId"])
}

func (r *ServerCertificate) AlicloudCertifacteName() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["alicloudCertifacteName"])
}

// an id of server certificate ssued/proxied by alibaba cloud. but it is not supported on the international site of alibaba cloud now.
func (r *ServerCertificate) AlicloudCertificateId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["alicloudCertificateId"])
}

// the name of the certificate specified by `alicloudCertificateId`.but it is not supported on the international site of alibaba cloud now.
func (r *ServerCertificate) AlicloudCertificateName() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["alicloudCertificateName"])
}

// the region of the certificate specified by `alicloudCertificateId`. but it is not supported on the international site of alibaba cloud now.
func (r *ServerCertificate) AlicloudCertificateRegionId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["alicloudCertificateRegionId"])
}

// Name of the Server Certificate.
func (r *ServerCertificate) Name() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["name"])
}

// the content of privat key of the ssl certificate specified by `serverCertificate`. where `alicloudCertificateId` is null, it is required, otherwise it is ignored.
func (r *ServerCertificate) PrivateKey() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["privateKey"])
}

// The Id of resource group which the slb server certificate belongs.
func (r *ServerCertificate) ResourceGroupId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["resourceGroupId"])
}

// the content of the ssl certificate. where `alicloudCertificateId` is null, it is required, otherwise it is ignored.
func (r *ServerCertificate) ServerCertificate() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["serverCertificate"])
}

// A mapping of tags to assign to the resource.
func (r *ServerCertificate) Tags() pulumi.MapOutput {
	return (pulumi.MapOutput)(r.s.State["tags"])
}

// Input properties used for looking up and filtering ServerCertificate resources.
type ServerCertificateState struct {
	AlicloudCertifacteId interface{}
	AlicloudCertifacteName interface{}
	// an id of server certificate ssued/proxied by alibaba cloud. but it is not supported on the international site of alibaba cloud now.
	AlicloudCertificateId interface{}
	// the name of the certificate specified by `alicloudCertificateId`.but it is not supported on the international site of alibaba cloud now.
	AlicloudCertificateName interface{}
	// the region of the certificate specified by `alicloudCertificateId`. but it is not supported on the international site of alibaba cloud now.
	AlicloudCertificateRegionId interface{}
	// Name of the Server Certificate.
	Name interface{}
	// the content of privat key of the ssl certificate specified by `serverCertificate`. where `alicloudCertificateId` is null, it is required, otherwise it is ignored.
	PrivateKey interface{}
	// The Id of resource group which the slb server certificate belongs.
	ResourceGroupId interface{}
	// the content of the ssl certificate. where `alicloudCertificateId` is null, it is required, otherwise it is ignored.
	ServerCertificate interface{}
	// A mapping of tags to assign to the resource.
	Tags interface{}
}

// The set of arguments for constructing a ServerCertificate resource.
type ServerCertificateArgs struct {
	AlicloudCertifacteId interface{}
	AlicloudCertifacteName interface{}
	// an id of server certificate ssued/proxied by alibaba cloud. but it is not supported on the international site of alibaba cloud now.
	AlicloudCertificateId interface{}
	// the name of the certificate specified by `alicloudCertificateId`.but it is not supported on the international site of alibaba cloud now.
	AlicloudCertificateName interface{}
	// the region of the certificate specified by `alicloudCertificateId`. but it is not supported on the international site of alibaba cloud now.
	AlicloudCertificateRegionId interface{}
	// Name of the Server Certificate.
	Name interface{}
	// the content of privat key of the ssl certificate specified by `serverCertificate`. where `alicloudCertificateId` is null, it is required, otherwise it is ignored.
	PrivateKey interface{}
	// The Id of resource group which the slb server certificate belongs.
	ResourceGroupId interface{}
	// the content of the ssl certificate. where `alicloudCertificateId` is null, it is required, otherwise it is ignored.
	ServerCertificate interface{}
	// A mapping of tags to assign to the resource.
	Tags interface{}
}