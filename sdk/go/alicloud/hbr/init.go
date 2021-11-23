// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hbr

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
	case "alicloud:hbr/ecsBackupClient:EcsBackupClient":
		r = &EcsBackupClient{}
	case "alicloud:hbr/ecsBackupPlan:EcsBackupPlan":
		r = &EcsBackupPlan{}
	case "alicloud:hbr/nasBackupPlan:NasBackupPlan":
		r = &NasBackupPlan{}
	case "alicloud:hbr/ossBackupPlan:OssBackupPlan":
		r = &OssBackupPlan{}
	case "alicloud:hbr/restoreJob:RestoreJob":
		r = &RestoreJob{}
	case "alicloud:hbr/serverBackupPlan:ServerBackupPlan":
		r = &ServerBackupPlan{}
	case "alicloud:hbr/vault:Vault":
		r = &Vault{}
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
		"hbr/ecsBackupClient",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"hbr/ecsBackupPlan",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"hbr/nasBackupPlan",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"hbr/ossBackupPlan",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"hbr/restoreJob",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"hbr/serverBackupPlan",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"hbr/vault",
		&module{version},
	)
}
