// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

func GetSnapshots(ctx *pulumi.Context, args *GetSnapshotsArgs, opts ...pulumi.InvokeOption) (*GetSnapshotsResult, error) {
	var rv GetSnapshotsResult
	err := ctx.Invoke("alicloud:ecs/getSnapshots:getSnapshots", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSnapshots.
type GetSnapshotsArgs struct {
	Category *string `pulumi:"category"`
	DryRun   *bool   `pulumi:"dryRun"`
	// Whether the snapshot is encrypted or not.
	Encrypted *bool `pulumi:"encrypted"`
	// A list of snapshot IDs.
	Ids             []string `pulumi:"ids"`
	KmsKeyId        *string  `pulumi:"kmsKeyId"`
	NameRegex       *string  `pulumi:"nameRegex"`
	OutputFile      *string  `pulumi:"outputFile"`
	ResourceGroupId *string  `pulumi:"resourceGroupId"`
	SnapshotLinkId  *string  `pulumi:"snapshotLinkId"`
	SnapshotName    *string  `pulumi:"snapshotName"`
	SnapshotType    *string  `pulumi:"snapshotType"`
	// Source disk attribute. Value range: `System`,`Data`.
	SourceDiskType *string `pulumi:"sourceDiskType"`
	// The snapshot status. Value range: `progressing`, `accomplished` and `failed`.
	Status *string `pulumi:"status"`
	// A map of tags assigned to the snapshot.
	Tags map[string]interface{} `pulumi:"tags"`
	Type *string                `pulumi:"type"`
	// Whether the snapshots are used to create resources or not. Value range: `image`, `disk`, `imageDisk` and `none`.
	Usage *string `pulumi:"usage"`
}

// A collection of values returned by getSnapshots.
type GetSnapshotsResult struct {
	Category *string `pulumi:"category"`
	DryRun   *bool   `pulumi:"dryRun"`
	// Whether the snapshot is encrypted or not.
	Encrypted *bool `pulumi:"encrypted"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of snapshot IDs.
	Ids       []string `pulumi:"ids"`
	KmsKeyId  *string  `pulumi:"kmsKeyId"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of snapshots names.
	Names           []string `pulumi:"names"`
	OutputFile      *string  `pulumi:"outputFile"`
	ResourceGroupId *string  `pulumi:"resourceGroupId"`
	SnapshotLinkId  *string  `pulumi:"snapshotLinkId"`
	SnapshotName    *string  `pulumi:"snapshotName"`
	SnapshotType    *string  `pulumi:"snapshotType"`
	// A list of snapshots. Each element contains the following attributes:
	Snapshots []GetSnapshotsSnapshot `pulumi:"snapshots"`
	// Source disk attribute. Value range: `System`,`Data`.
	SourceDiskType *string `pulumi:"sourceDiskType"`
	// The snapshot status. Value range: `progressing`, `accomplished` and `failed`.
	Status *string `pulumi:"status"`
	// A map of tags assigned to the snapshot.
	Tags map[string]interface{} `pulumi:"tags"`
	Type *string                `pulumi:"type"`
	// Whether the snapshots are used to create resources or not. Value range: `image`, `disk`, `imageDisk` and `none`.
	Usage *string `pulumi:"usage"`
}
