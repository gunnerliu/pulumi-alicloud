// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package adb

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
	case "alicloud:adb/account:Account":
		r = &Account{}
	case "alicloud:adb/backupPolicy:BackupPolicy":
		r = &BackupPolicy{}
	case "alicloud:adb/cluster:Cluster":
		r = &Cluster{}
	case "alicloud:adb/connection:Connection":
		r = &Connection{}
	case "alicloud:adb/dBCluster:DBCluster":
		r = &DBCluster{}
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
		"adb/account",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"adb/backupPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"adb/cluster",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"adb/connection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"adb/dBCluster",
		&module{version},
	)
}
