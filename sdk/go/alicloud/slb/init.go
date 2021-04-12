// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package slb

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
	case "alicloud:slb/acl:Acl":
		r = &Acl{}
	case "alicloud:slb/attachment:Attachment":
		r = &Attachment{}
	case "alicloud:slb/backendServer:BackendServer":
		r = &BackendServer{}
	case "alicloud:slb/caCertificate:CaCertificate":
		r = &CaCertificate{}
	case "alicloud:slb/domainExtension:DomainExtension":
		r = &DomainExtension{}
	case "alicloud:slb/listener:Listener":
		r = &Listener{}
	case "alicloud:slb/loadBalancer:LoadBalancer":
		r = &LoadBalancer{}
	case "alicloud:slb/masterSlaveServerGroup:MasterSlaveServerGroup":
		r = &MasterSlaveServerGroup{}
	case "alicloud:slb/rule:Rule":
		r = &Rule{}
	case "alicloud:slb/serverCertificate:ServerCertificate":
		r = &ServerCertificate{}
	case "alicloud:slb/serverGroup:ServerGroup":
		r = &ServerGroup{}
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
		"slb/acl",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"slb/attachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"slb/backendServer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"slb/caCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"slb/domainExtension",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"slb/listener",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"slb/loadBalancer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"slb/masterSlaveServerGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"slb/rule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"slb/serverCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"slb/serverGroup",
		&module{version},
	)
}
