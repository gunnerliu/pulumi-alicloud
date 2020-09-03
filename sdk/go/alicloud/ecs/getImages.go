// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This data source provides available image resources. It contains user's private images, system images provided by Alibaba Cloud,
// other public images and the ones available on the image market.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/ecs"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "^centos_6"
// 		opt1 := "system"
// 		imagesDs, err := ecs.GetImages(ctx, &ecs.GetImagesArgs{
// 			NameRegex: &opt0,
// 			Owners:    &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstImageId", imagesDs.Images[0].Id)
// 		return nil
// 	})
// }
// ```
func GetImages(ctx *pulumi.Context, args *GetImagesArgs, opts ...pulumi.InvokeOption) (*GetImagesResult, error) {
	var rv GetImagesResult
	err := ctx.Invoke("alicloud:ecs/getImages:getImages", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getImages.
type GetImagesArgs struct {
	// The scenario in which the image will be used. Default value: `CreateEcs`. Valid values:
	// * `CreateEcs`: instance creation.
	// * `ChangeOS`: replacement of the system disk or operating system.
	ActionType *string `pulumi:"actionType"`
	// The image architecture. Valid values: `i386` and `x8664`.
	Architecture *string `pulumi:"architecture"`
	// Specifies whether the image is running on an ECS instance. Default value: `false`. Valid values:
	// * `true`: The validity of the request is checked but resources are not queried. Check items include whether your AccessKey pair is valid, whether RAM users are authorized, and whether the required parameters are specified. If the check fails, the corresponding error message is returned. If the check succeeds, the DryRunOperation error code is returned.
	// * `false`: The validity of the request is checked, and a 2XX HTTP status code is returned and resources are queried if the check succeeds.
	DryRun *bool `pulumi:"dryRun"`
	// The name of the image family. You can set this parameter to query images of the specified image family. This parameter is empty by default.
	ImageFamily *string `pulumi:"imageFamily"`
	// The instance type for which the image can be used.
	InstanceType *string `pulumi:"instanceType"`
	// Specifies whether the image supports cloud-init.
	IsSupportCloudInit *bool `pulumi:"isSupportCloudInit"`
	// Specifies whether the image can be used on I/O optimized instances.
	IsSupportIoOptimized *bool `pulumi:"isSupportIoOptimized"`
	// If more than one result are returned, select the most recent one.
	MostRecent *bool `pulumi:"mostRecent"`
	// A regex string to filter resulting images by name.
	NameRegex *string `pulumi:"nameRegex"`
	// The operating system type of the image. Valid values: `windows` and `linux`.
	OsType     *string `pulumi:"osType"`
	OutputFile *string `pulumi:"outputFile"`
	// Filter results by a specific image owner. Valid items are `system`, `self`, `others`, `marketplace`.
	Owners *string `pulumi:"owners"`
	// The ID of the resource group to which the custom image belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The ID of the snapshot used to create the custom image.
	SnapshotId *string `pulumi:"snapshotId"`
	// The status of the image. The following values are available, Separate multiple parameter values by using commas (,). Default value: `Available`. Valid values:
	// * `Creating`: The image is being created.
	// * `Waiting`: The image is waiting to be processed.
	// * `Available`: The image is available.
	// * `UnAvailable`: The image is unavailable.
	// * `CreateFailed`: The image failed to be created.
	// * `Deprecated`: The image is discontinued.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// Specifies whether to check the validity of the request without actually making the request. Valid values:
	// * `instance`: The image is already in use and running on an ECS instance.
	// * `none`: The image is not in use.
	Usage *string `pulumi:"usage"`
}

// A collection of values returned by getImages.
type GetImagesResult struct {
	ActionType *string `pulumi:"actionType"`
	// Platform type of the image system: i386 or x86_64.
	Architecture *string `pulumi:"architecture"`
	DryRun       *bool   `pulumi:"dryRun"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of image IDs.
	Ids         []string `pulumi:"ids"`
	ImageFamily *string  `pulumi:"imageFamily"`
	// A list of images. Each element contains the following attributes:
	Images               []GetImagesImage `pulumi:"images"`
	InstanceType         *string          `pulumi:"instanceType"`
	IsSupportCloudInit   *bool            `pulumi:"isSupportCloudInit"`
	IsSupportIoOptimized *bool            `pulumi:"isSupportIoOptimized"`
	MostRecent           *bool            `pulumi:"mostRecent"`
	NameRegex            *string          `pulumi:"nameRegex"`
	OsType               *string          `pulumi:"osType"`
	OutputFile           *string          `pulumi:"outputFile"`
	Owners               *string          `pulumi:"owners"`
	ResourceGroupId      *string          `pulumi:"resourceGroupId"`
	// Snapshot ID.
	SnapshotId *string `pulumi:"snapshotId"`
	// Status of the image. Possible values: `UnAvailable`, `Available`, `Creating` and `CreateFailed`.
	Status *string                `pulumi:"status"`
	Tags   map[string]interface{} `pulumi:"tags"`
	Usage  *string                `pulumi:"usage"`
}
