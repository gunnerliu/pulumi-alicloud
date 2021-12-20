// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudsso

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
	case "alicloud:cloudsso/accessConfiguration:AccessConfiguration":
		r = &AccessConfiguration{}
	case "alicloud:cloudsso/accessConfigurationProvisioning:AccessConfigurationProvisioning":
		r = &AccessConfigurationProvisioning{}
	case "alicloud:cloudsso/accessManagement:AccessManagement":
		r = &AccessManagement{}
	case "alicloud:cloudsso/directory:Directory":
		r = &Directory{}
	case "alicloud:cloudsso/group:Group":
		r = &Group{}
	case "alicloud:cloudsso/scimServerCredential:ScimServerCredential":
		r = &ScimServerCredential{}
	case "alicloud:cloudsso/user:User":
		r = &User{}
	case "alicloud:cloudsso/userAttachment:UserAttachment":
		r = &UserAttachment{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := alicloud.PkgVersion()
	if err != nil {
		fmt.Printf("failed to determine package version. defaulting to v1: %v\n", err)
	}
	pulumi.RegisterResourceModule(
		"alicloud",
		"cloudsso/accessConfiguration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cloudsso/accessConfigurationProvisioning",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cloudsso/accessManagement",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cloudsso/directory",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cloudsso/group",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cloudsso/scimServerCredential",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cloudsso/user",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cloudsso/userAttachment",
		&module{version},
	)
}
