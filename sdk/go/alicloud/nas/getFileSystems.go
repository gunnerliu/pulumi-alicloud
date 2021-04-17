// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package nas

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides FileSystems available to the user.
//
// > **NOTE**: Available in 1.35.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/nas"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "NFS"
// 		fs, err := nas.GetFileSystems(ctx, &nas.GetFileSystemsArgs{
// 			Description:  alicloud_nas_file_system.Foo.Description,
// 			ProtocolType: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("alicloudNasFileSystemsId", fs.Systems[0].Id)
// 		return nil
// 	})
// }
// ```
func GetFileSystems(ctx *pulumi.Context, args *GetFileSystemsArgs, opts ...pulumi.InvokeOption) (*GetFileSystemsResult, error) {
	var rv GetFileSystemsResult
	err := ctx.Invoke("alicloud:nas/getFileSystems:getFileSystems", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFileSystems.
type GetFileSystemsArgs struct {
	// A regex string to filter the results by the ：FileSystem description.
	DescriptionRegex *string `pulumi:"descriptionRegex"`
	// A list of FileSystemId.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// Filter results by a specific ProtocolType. Valid values: `NFS` and `SMB`.
	ProtocolType *string `pulumi:"protocolType"`
	// Filter results by a specific StorageType. Valid values: `Capacity` and `Performance`.
	StorageType *string `pulumi:"storageType"`
}

// A collection of values returned by getFileSystems.
type GetFileSystemsResult struct {
	DescriptionRegex *string `pulumi:"descriptionRegex"`
	// A list of FileSystem descriptions.
	Descriptions []string `pulumi:"descriptions"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of FileSystem Id.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// ProtocolType block of the FileSystem
	ProtocolType *string `pulumi:"protocolType"`
	// StorageType block of the FileSystem.
	StorageType *string `pulumi:"storageType"`
	// A list of VPCs. Each element contains the following attributes:
	Systems []GetFileSystemsSystem `pulumi:"systems"`
}
