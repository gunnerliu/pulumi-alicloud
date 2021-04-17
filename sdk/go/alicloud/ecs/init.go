// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

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
	case "alicloud:ecs/autoProvisioningGroup:AutoProvisioningGroup":
		r = &AutoProvisioningGroup{}
	case "alicloud:ecs/autoSnapshotPolicy:AutoSnapshotPolicy":
		r = &AutoSnapshotPolicy{}
	case "alicloud:ecs/command:Command":
		r = &Command{}
	case "alicloud:ecs/copyImage:CopyImage":
		r = &CopyImage{}
	case "alicloud:ecs/dedicatedHost:DedicatedHost":
		r = &DedicatedHost{}
	case "alicloud:ecs/disk:Disk":
		r = &Disk{}
	case "alicloud:ecs/diskAttachment:DiskAttachment":
		r = &DiskAttachment{}
	case "alicloud:ecs/ecsKeyPair:EcsKeyPair":
		r = &EcsKeyPair{}
	case "alicloud:ecs/ecsKeyPairAttachment:EcsKeyPairAttachment":
		r = &EcsKeyPairAttachment{}
	case "alicloud:ecs/ecsLaunchTemplate:EcsLaunchTemplate":
		r = &EcsLaunchTemplate{}
	case "alicloud:ecs/ecsSnapshot:EcsSnapshot":
		r = &EcsSnapshot{}
	case "alicloud:ecs/eip:Eip":
		r = &Eip{}
	case "alicloud:ecs/eipAssociation:EipAssociation":
		r = &EipAssociation{}
	case "alicloud:ecs/hpcCluster:HpcCluster":
		r = &HpcCluster{}
	case "alicloud:ecs/image:Image":
		r = &Image{}
	case "alicloud:ecs/imageCopy:ImageCopy":
		r = &ImageCopy{}
	case "alicloud:ecs/imageExport:ImageExport":
		r = &ImageExport{}
	case "alicloud:ecs/imageImport:ImageImport":
		r = &ImageImport{}
	case "alicloud:ecs/imageSharePermission:ImageSharePermission":
		r = &ImageSharePermission{}
	case "alicloud:ecs/instance:Instance":
		r = &Instance{}
	case "alicloud:ecs/keyPair:KeyPair":
		r = &KeyPair{}
	case "alicloud:ecs/keyPairAttachment:KeyPairAttachment":
		r = &KeyPairAttachment{}
	case "alicloud:ecs/launchTemplate:LaunchTemplate":
		r = &LaunchTemplate{}
	case "alicloud:ecs/reservedInstance:ReservedInstance":
		r = &ReservedInstance{}
	case "alicloud:ecs/securityGroup:SecurityGroup":
		r = &SecurityGroup{}
	case "alicloud:ecs/securityGroupRule:SecurityGroupRule":
		r = &SecurityGroupRule{}
	case "alicloud:ecs/snapshot:Snapshot":
		r = &Snapshot{}
	case "alicloud:ecs/snapshotPolicy:SnapshotPolicy":
		r = &SnapshotPolicy{}
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
		"ecs/autoProvisioningGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/autoSnapshotPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/command",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/copyImage",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/dedicatedHost",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/disk",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/diskAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/ecsKeyPair",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/ecsKeyPairAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/ecsLaunchTemplate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/ecsSnapshot",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/eip",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/eipAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/hpcCluster",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/image",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/imageCopy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/imageExport",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/imageImport",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/imageSharePermission",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/instance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/keyPair",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/keyPairAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/launchTemplate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/reservedInstance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/securityGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/securityGroupRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/snapshot",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"ecs/snapshotPolicy",
		&module{version},
	)
}
