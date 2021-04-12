// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "alicloud:vpc/commonBandwithPackage:CommonBandwithPackage":
		r = &CommonBandwithPackage{}
	case "alicloud:vpc/commonBandwithPackageAttachment:CommonBandwithPackageAttachment":
		r = &CommonBandwithPackageAttachment{}
	case "alicloud:vpc/flowLog:FlowLog":
		r = &FlowLog{}
	case "alicloud:vpc/forwardEntry:ForwardEntry":
		r = &ForwardEntry{}
	case "alicloud:vpc/hAVip:HAVip":
		r = &HAVip{}
	case "alicloud:vpc/hAVipAttachment:HAVipAttachment":
		r = &HAVipAttachment{}
	case "alicloud:vpc/natGateway:NatGateway":
		r = &NatGateway{}
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
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := alicloud.PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
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
		"vpc/natGateway",
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
}
