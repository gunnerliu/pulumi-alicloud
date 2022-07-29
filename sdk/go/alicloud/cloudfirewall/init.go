// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudfirewall

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
	case "alicloud:cloudfirewall/addressBook:AddressBook":
		r = &AddressBook{}
	case "alicloud:cloudfirewall/controlPolicy:ControlPolicy":
		r = &ControlPolicy{}
	case "alicloud:cloudfirewall/controlPolicyOrder:ControlPolicyOrder":
		r = &ControlPolicyOrder{}
	case "alicloud:cloudfirewall/instance:Instance":
		r = &Instance{}
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
		"cloudfirewall/addressBook",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cloudfirewall/controlPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cloudfirewall/controlPolicyOrder",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"cloudfirewall/instance",
		&module{version},
	)
}
