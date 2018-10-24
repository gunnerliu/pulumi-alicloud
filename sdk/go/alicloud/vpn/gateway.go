// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vpn

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a VPN gateway resource.
// 
// ~> **NOTE:** Terraform will auto build vpn instance  while it uses `alicloud_vpn_gateway` to build a vpn resource.
type Gateway struct {
	s *pulumi.ResourceState
}

// NewGateway registers a new resource with the given unique name, arguments, and options.
func NewGateway(ctx *pulumi.Context,
	name string, args *GatewayArgs, opts ...pulumi.ResourceOpt) (*Gateway, error) {
	if args == nil || args.Bandwidth == nil {
		return nil, errors.New("missing required argument 'Bandwidth'")
	}
	if args == nil || args.VpcId == nil {
		return nil, errors.New("missing required argument 'VpcId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["bandwidth"] = nil
		inputs["description"] = nil
		inputs["enableIpsec"] = nil
		inputs["enableSsl"] = nil
		inputs["instanceChargeType"] = nil
		inputs["name"] = nil
		inputs["period"] = nil
		inputs["sslConnections"] = nil
		inputs["vpcId"] = nil
	} else {
		inputs["bandwidth"] = args.Bandwidth
		inputs["description"] = args.Description
		inputs["enableIpsec"] = args.EnableIpsec
		inputs["enableSsl"] = args.EnableSsl
		inputs["instanceChargeType"] = args.InstanceChargeType
		inputs["name"] = args.Name
		inputs["period"] = args.Period
		inputs["sslConnections"] = args.SslConnections
		inputs["vpcId"] = args.VpcId
	}
	inputs["businessStatus"] = nil
	inputs["internetIp"] = nil
	inputs["status"] = nil
	s, err := ctx.RegisterResource("alicloud:vpn/gateway:Gateway", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Gateway{s: s}, nil
}

// GetGateway gets an existing Gateway resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGateway(ctx *pulumi.Context,
	name string, id pulumi.ID, state *GatewayState, opts ...pulumi.ResourceOpt) (*Gateway, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["bandwidth"] = state.Bandwidth
		inputs["businessStatus"] = state.BusinessStatus
		inputs["description"] = state.Description
		inputs["enableIpsec"] = state.EnableIpsec
		inputs["enableSsl"] = state.EnableSsl
		inputs["instanceChargeType"] = state.InstanceChargeType
		inputs["internetIp"] = state.InternetIp
		inputs["name"] = state.Name
		inputs["period"] = state.Period
		inputs["sslConnections"] = state.SslConnections
		inputs["status"] = state.Status
		inputs["vpcId"] = state.VpcId
	}
	s, err := ctx.ReadResource("alicloud:vpn/gateway:Gateway", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Gateway{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Gateway) URN() *pulumi.URNOutput {
	return r.s.URN
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Gateway) ID() *pulumi.IDOutput {
	return r.s.ID
}

// The value should be 10 or 100 if the user is postpaid, otherwise it can be 5, 10, 20, 50, 100.
// It can't be changed by terraform.
func (r *Gateway) Bandwidth() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["bandwidth"])
}

// The business status of the VPN gateway.
func (r *Gateway) BusinessStatus() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["businessStatus"])
}

// The description of the VPN instance.
func (r *Gateway) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

// Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
func (r *Gateway) EnableIpsec() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["enableIpsec"])
}

// Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
func (r *Gateway) EnableSsl() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["enableSsl"])
}

// The charge type for instance.
func (r *Gateway) InstanceChargeType() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["instanceChargeType"])
}

// The internet ip of the VPN.
func (r *Gateway) InternetIp() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["internetIp"])
}

// The name of the VPN. Defaults to null.
func (r *Gateway) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// The filed is only required while the InstanceChargeType is prepaid.
func (r *Gateway) Period() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["period"])
}

// The max connections of SSL VPN.
func (r *Gateway) SslConnections() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["sslConnections"])
}

// The status of the VPN gateway.
func (r *Gateway) Status() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["status"])
}

// The VPN belongs the vpc_id, the field can't be changed.
func (r *Gateway) VpcId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["vpcId"])
}

// Input properties used for looking up and filtering Gateway resources.
type GatewayState struct {
	// The value should be 10 or 100 if the user is postpaid, otherwise it can be 5, 10, 20, 50, 100.
	// It can't be changed by terraform.
	Bandwidth interface{}
	// The business status of the VPN gateway.
	BusinessStatus interface{}
	// The description of the VPN instance.
	Description interface{}
	// Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
	EnableIpsec interface{}
	// Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
	EnableSsl interface{}
	// The charge type for instance.
	InstanceChargeType interface{}
	// The internet ip of the VPN.
	InternetIp interface{}
	// The name of the VPN. Defaults to null.
	Name interface{}
	// The filed is only required while the InstanceChargeType is prepaid.
	Period interface{}
	// The max connections of SSL VPN.
	SslConnections interface{}
	// The status of the VPN gateway.
	Status interface{}
	// The VPN belongs the vpc_id, the field can't be changed.
	VpcId interface{}
}

// The set of arguments for constructing a Gateway resource.
type GatewayArgs struct {
	// The value should be 10 or 100 if the user is postpaid, otherwise it can be 5, 10, 20, 50, 100.
	// It can't be changed by terraform.
	Bandwidth interface{}
	// The description of the VPN instance.
	Description interface{}
	// Enable or Disable IPSec VPN. At least one type of VPN should be enabled.
	EnableIpsec interface{}
	// Enable or Disable SSL VPN.  At least one type of VPN should be enabled.
	EnableSsl interface{}
	// The charge type for instance.
	InstanceChargeType interface{}
	// The name of the VPN. Defaults to null.
	Name interface{}
	// The filed is only required while the InstanceChargeType is prepaid.
	Period interface{}
	// The max connections of SSL VPN.
	SslConnections interface{}
	// The VPN belongs the vpc_id, the field can't be changed.
	VpcId interface{}
}