// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cen

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
	case "alicloud:cen/bandwidthLimit:BandwidthLimit":
		r = &BandwidthLimit{}
	case "alicloud:cen/bandwidthPackage:BandwidthPackage":
		r = &BandwidthPackage{}
	case "alicloud:cen/bandwidthPackageAttachment:BandwidthPackageAttachment":
		r = &BandwidthPackageAttachment{}
	case "alicloud:cen/flowLog:FlowLog":
		r = &FlowLog{}
	case "alicloud:cen/instance:Instance":
		r = &Instance{}
	case "alicloud:cen/instanceAttachment:InstanceAttachment":
		r = &InstanceAttachment{}
	case "alicloud:cen/instanceGrant:InstanceGrant":
		r = &InstanceGrant{}
	case "alicloud:cen/privateZone:PrivateZone":
		r = &PrivateZone{}
	case "alicloud:cen/routeEntry:RouteEntry":
		r = &RouteEntry{}
	case "alicloud:cen/routeMap:RouteMap":
		r = &RouteMap{}
	case "alicloud:cen/routeService:RouteService":
		r = &RouteService{}
	case "alicloud:cen/vbrHealthCheck:VbrHealthCheck":
		r = &VbrHealthCheck{}
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
		"cen/bandwidthLimit",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cen/bandwidthPackage",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cen/bandwidthPackageAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cen/flowLog",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cen/instance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cen/instanceAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cen/instanceGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cen/privateZone",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cen/routeEntry",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cen/routeMap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cen/routeService",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cen/vbrHealthCheck",
		&module{version},
	)
}