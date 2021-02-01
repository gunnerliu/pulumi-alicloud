// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package apigateway

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
	case "alicloud:apigateway/api:Api":
		r, err = NewApi(ctx, name, nil, pulumi.URN_(urn))
	case "alicloud:apigateway/app:App":
		r, err = NewApp(ctx, name, nil, pulumi.URN_(urn))
	case "alicloud:apigateway/appAttachment:AppAttachment":
		r, err = NewAppAttachment(ctx, name, nil, pulumi.URN_(urn))
	case "alicloud:apigateway/group:Group":
		r, err = NewGroup(ctx, name, nil, pulumi.URN_(urn))
	case "alicloud:apigateway/vpcAccess:VpcAccess":
		r, err = NewVpcAccess(ctx, name, nil, pulumi.URN_(urn))
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	return
}

func init() {
	version, err := alicloud.PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
	pulumi.RegisterResourceModule(
		"alicloud",
		"apigateway/api",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"apigateway/app",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"apigateway/appAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"apigateway/group",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"alicloud",
		"apigateway/vpcAccess",
		&module{version},
	)
}
