// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package resourcemanager

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
	case "alicloud:resourcemanager/account:Account":
		r = &Account{}
	case "alicloud:resourcemanager/controlPolicy:ControlPolicy":
		r = &ControlPolicy{}
	case "alicloud:resourcemanager/controlPolicyAttachment:ControlPolicyAttachment":
		r = &ControlPolicyAttachment{}
	case "alicloud:resourcemanager/folder:Folder":
		r = &Folder{}
	case "alicloud:resourcemanager/handshake:Handshake":
		r = &Handshake{}
	case "alicloud:resourcemanager/policy:Policy":
		r = &Policy{}
	case "alicloud:resourcemanager/policyAttachment:PolicyAttachment":
		r = &PolicyAttachment{}
	case "alicloud:resourcemanager/policyVersion:PolicyVersion":
		r = &PolicyVersion{}
	case "alicloud:resourcemanager/resourceDirectory:ResourceDirectory":
		r = &ResourceDirectory{}
	case "alicloud:resourcemanager/resourceGroup:ResourceGroup":
		r = &ResourceGroup{}
	case "alicloud:resourcemanager/resourceShare:ResourceShare":
		r = &ResourceShare{}
	case "alicloud:resourcemanager/role:Role":
		r = &Role{}
	case "alicloud:resourcemanager/sharedResource:SharedResource":
		r = &SharedResource{}
	case "alicloud:resourcemanager/sharedTarget:SharedTarget":
		r = &SharedTarget{}
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
		"resourcemanager/account",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"resourcemanager/controlPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"resourcemanager/controlPolicyAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"resourcemanager/folder",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"resourcemanager/handshake",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"resourcemanager/policy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"resourcemanager/policyAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"resourcemanager/policyVersion",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"resourcemanager/resourceDirectory",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"resourcemanager/resourceGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"resourcemanager/resourceShare",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"resourcemanager/role",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"resourcemanager/sharedResource",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"resourcemanager/sharedTarget",
		&module{version},
	)
}
