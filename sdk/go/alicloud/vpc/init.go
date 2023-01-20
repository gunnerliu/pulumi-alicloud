// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "alicloud:vpc/bgpGroup:BgpGroup":
		r = &BgpGroup{}
	case "alicloud:vpc/bgpNetwork:BgpNetwork":
		r = &BgpNetwork{}
	case "alicloud:vpc/bgpPeer:BgpPeer":
		r = &BgpPeer{}
	case "alicloud:vpc/commonBandwithPackage:CommonBandwithPackage":
		r = &CommonBandwithPackage{}
	case "alicloud:vpc/commonBandwithPackageAttachment:CommonBandwithPackageAttachment":
		r = &CommonBandwithPackageAttachment{}
	case "alicloud:vpc/dhcpOptionsSet:DhcpOptionsSet":
		r = &DhcpOptionsSet{}
	case "alicloud:vpc/dhcpOptionsSetAttachment:DhcpOptionsSetAttachment":
		r = &DhcpOptionsSetAttachment{}
	case "alicloud:vpc/flowLog:FlowLog":
		r = &FlowLog{}
	case "alicloud:vpc/forwardEntry:ForwardEntry":
		r = &ForwardEntry{}
	case "alicloud:vpc/gatewayRouteTableAttachment:GatewayRouteTableAttachment":
		r = &GatewayRouteTableAttachment{}
	case "alicloud:vpc/hAVip:HAVip":
		r = &HAVip{}
	case "alicloud:vpc/hAVipAttachment:HAVipAttachment":
		r = &HAVipAttachment{}
	case "alicloud:vpc/ipv4CidrBlock:Ipv4CidrBlock":
		r = &Ipv4CidrBlock{}
	case "alicloud:vpc/ipv4Gateway:Ipv4Gateway":
		r = &Ipv4Gateway{}
	case "alicloud:vpc/ipv6EgressRule:Ipv6EgressRule":
		r = &Ipv6EgressRule{}
	case "alicloud:vpc/ipv6Gateway:Ipv6Gateway":
		r = &Ipv6Gateway{}
	case "alicloud:vpc/ipv6InternetBandwidth:Ipv6InternetBandwidth":
		r = &Ipv6InternetBandwidth{}
	case "alicloud:vpc/natGateway:NatGateway":
		r = &NatGateway{}
	case "alicloud:vpc/natIp:NatIp":
		r = &NatIp{}
	case "alicloud:vpc/natIpCidr:NatIpCidr":
		r = &NatIpCidr{}
	case "alicloud:vpc/network:Network":
		r = &Network{}
	case "alicloud:vpc/networkAcl:NetworkAcl":
		r = &NetworkAcl{}
	case "alicloud:vpc/networkAclAttachment:NetworkAclAttachment":
		r = &NetworkAclAttachment{}
	case "alicloud:vpc/networkAclEntries:NetworkAclEntries":
		r = &NetworkAclEntries{}
	case "alicloud:vpc/networkInterface:NetworkInterface":
		r = &NetworkInterface{}
	case "alicloud:vpc/networkInterfaceAttachment:NetworkInterfaceAttachment":
		r = &NetworkInterfaceAttachment{}
	case "alicloud:vpc/peerConnection:PeerConnection":
		r = &PeerConnection{}
	case "alicloud:vpc/peerConnectionAccepter:PeerConnectionAccepter":
		r = &PeerConnectionAccepter{}
	case "alicloud:vpc/prefixList:PrefixList":
		r = &PrefixList{}
	case "alicloud:vpc/publicIpAddressPool:PublicIpAddressPool":
		r = &PublicIpAddressPool{}
	case "alicloud:vpc/publicIpAddressPoolCidrBlock:PublicIpAddressPoolCidrBlock":
		r = &PublicIpAddressPoolCidrBlock{}
	case "alicloud:vpc/routeEntry:RouteEntry":
		r = &RouteEntry{}
	case "alicloud:vpc/routeTable:RouteTable":
		r = &RouteTable{}
	case "alicloud:vpc/routeTableAttachment:RouteTableAttachment":
		r = &RouteTableAttachment{}
	case "alicloud:vpc/routerInterface:RouterInterface":
		r = &RouterInterface{}
	case "alicloud:vpc/routerInterfaceConnection:RouterInterfaceConnection":
		r = &RouterInterfaceConnection{}
	case "alicloud:vpc/snatEntry:SnatEntry":
		r = &SnatEntry{}
	case "alicloud:vpc/subnet:Subnet":
		r = &Subnet{}
	case "alicloud:vpc/switch:Switch":
		r = &Switch{}
	case "alicloud:vpc/trafficMirrorFilter:TrafficMirrorFilter":
		r = &TrafficMirrorFilter{}
	case "alicloud:vpc/trafficMirrorFilterEgressRule:TrafficMirrorFilterEgressRule":
		r = &TrafficMirrorFilterEgressRule{}
	case "alicloud:vpc/trafficMirrorFilterIngressRule:TrafficMirrorFilterIngressRule":
		r = &TrafficMirrorFilterIngressRule{}
	case "alicloud:vpc/trafficMirrorSession:TrafficMirrorSession":
		r = &TrafficMirrorSession{}
	case "alicloud:vpc/vbrHa:VbrHa":
		r = &VbrHa{}
	case "alicloud:vpc/vpcNetworkAclAttachment:VpcNetworkAclAttachment":
		r = &VpcNetworkAclAttachment{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := alicloud.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/bgpGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/bgpNetwork",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/bgpPeer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/commonBandwithPackage",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/commonBandwithPackageAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/dhcpOptionsSet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/dhcpOptionsSetAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/flowLog",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/forwardEntry",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/gatewayRouteTableAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/hAVip",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/hAVipAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/ipv4CidrBlock",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/ipv4Gateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/ipv6EgressRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/ipv6Gateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/ipv6InternetBandwidth",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/natGateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/natIp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/natIpCidr",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/network",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/networkAcl",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/networkAclAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/networkAclEntries",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/networkInterface",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/networkInterfaceAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/peerConnection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/peerConnectionAccepter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/prefixList",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/publicIpAddressPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/publicIpAddressPoolCidrBlock",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/routeEntry",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/routeTable",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/routeTableAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/routerInterface",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/routerInterfaceConnection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/snatEntry",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/subnet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/switch",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/trafficMirrorFilter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/trafficMirrorFilterEgressRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/trafficMirrorFilterIngressRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/trafficMirrorSession",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/vbrHa",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"vpc/vpcNetworkAclAttachment",
		&module{version},
	)
}
