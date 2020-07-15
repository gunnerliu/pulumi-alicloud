// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci
{
    /// <summary>
    /// An ECI Image Cache can help user to solve the time-consuming problem of image pull. For information about Alicloud ECI Image Cache and how to use it, see [What is Resource Alicloud ECI Image Cache](https://www.alibabacloud.com/help/doc-detail/146891.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.89.0+.
    /// 
    /// &gt; **NOTE:** Each image cache corresponds to a snapshot, and the user does not delete the snapshot directly, otherwise the cache will fail.
    /// 
    /// ## Example Usage
    /// 
    /// 
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new AliCloud.Eci.ImageCache("example", new AliCloud.Eci.ImageCacheArgs
    ///         {
    ///             EipInstanceId = "eip-uf60c7cqb2pcrkgxhxxxx",
    ///             ImageCacheName = "tf-test",
    ///             Images = 
    ///             {
    ///                 "registry.cn-beijing.aliyuncs.com/sceneplatform/sae-image-xxxx:latest",
    ///             },
    ///             SecurityGroupId = "sg-2zeef68b66fxxxx",
    ///             VswitchId = "vsw-2zef9k7ng82xxxx",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class ImageCache : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the container group job that is used to create the image cache.
        /// * `status` -The status of the image cache.
        /// </summary>
        [Output("containerGroupId")]
        public Output<string> ContainerGroupId { get; private set; } = null!;

        /// <summary>
        /// The instance ID of the Elastic IP Address (EIP). If you want to pull images from the Internet, you must specify an EIP to make sure that the container group can access the Internet. You can also configure the network address translation (NAT) gateway. We recommend that you configure the NAT gateway for the Internet access. Refer to [Public Network Access Method](https://help.aliyun.com/document_detail/99146.html)
        /// </summary>
        [Output("eipInstanceId")]
        public Output<string?> EipInstanceId { get; private set; } = null!;

        /// <summary>
        /// The name of the image cache.
        /// </summary>
        [Output("imageCacheName")]
        public Output<string> ImageCacheName { get; private set; } = null!;

        /// <summary>
        /// The size of the image cache. Default to `20`. Unit: GiB.
        /// </summary>
        [Output("imageCacheSize")]
        public Output<int?> ImageCacheSize { get; private set; } = null!;

        /// <summary>
        /// The Image Registry parameters about the image to be cached.
        /// </summary>
        [Output("imageRegistryCredentials")]
        public Output<ImmutableArray<Outputs.ImageCacheImageRegistryCredential>> ImageRegistryCredentials { get; private set; } = null!;

        /// <summary>
        /// The images to be cached. The image name must be versioned.
        /// </summary>
        [Output("images")]
        public Output<ImmutableArray<string>> Images { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string?> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The retention days of the image cache. Once the image cache expires, it will be cleared. By default, the image cache never expires. Note: The image cache that fails to be created is retained for only one day.
        /// </summary>
        [Output("retentionDays")]
        public Output<int?> RetentionDays { get; private set; } = null!;

        /// <summary>
        /// The ID of the security group. You do not need to specify the same security group as the container group.
        /// </summary>
        [Output("securityGroupId")]
        public Output<string> SecurityGroupId { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The ID of the VSwitch. You do not need to specify the same VSwitch as the container group.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;

        /// <summary>
        /// The zone id to cache image.
        /// </summary>
        [Output("zoneId")]
        public Output<string?> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ImageCache resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ImageCache(string name, ImageCacheArgs args, CustomResourceOptions? options = null)
            : base("alicloud:eci/imageCache:ImageCache", name, args ?? new ImageCacheArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ImageCache(string name, Input<string> id, ImageCacheState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:eci/imageCache:ImageCache", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ImageCache resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ImageCache Get(string name, Input<string> id, ImageCacheState? state = null, CustomResourceOptions? options = null)
        {
            return new ImageCache(name, id, state, options);
        }
    }

    public sealed class ImageCacheArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The instance ID of the Elastic IP Address (EIP). If you want to pull images from the Internet, you must specify an EIP to make sure that the container group can access the Internet. You can also configure the network address translation (NAT) gateway. We recommend that you configure the NAT gateway for the Internet access. Refer to [Public Network Access Method](https://help.aliyun.com/document_detail/99146.html)
        /// </summary>
        [Input("eipInstanceId")]
        public Input<string>? EipInstanceId { get; set; }

        /// <summary>
        /// The name of the image cache.
        /// </summary>
        [Input("imageCacheName", required: true)]
        public Input<string> ImageCacheName { get; set; } = null!;

        /// <summary>
        /// The size of the image cache. Default to `20`. Unit: GiB.
        /// </summary>
        [Input("imageCacheSize")]
        public Input<int>? ImageCacheSize { get; set; }

        [Input("imageRegistryCredentials")]
        private InputList<Inputs.ImageCacheImageRegistryCredentialArgs>? _imageRegistryCredentials;

        /// <summary>
        /// The Image Registry parameters about the image to be cached.
        /// </summary>
        public InputList<Inputs.ImageCacheImageRegistryCredentialArgs> ImageRegistryCredentials
        {
            get => _imageRegistryCredentials ?? (_imageRegistryCredentials = new InputList<Inputs.ImageCacheImageRegistryCredentialArgs>());
            set => _imageRegistryCredentials = value;
        }

        [Input("images", required: true)]
        private InputList<string>? _images;

        /// <summary>
        /// The images to be cached. The image name must be versioned.
        /// </summary>
        public InputList<string> Images
        {
            get => _images ?? (_images = new InputList<string>());
            set => _images = value;
        }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The retention days of the image cache. Once the image cache expires, it will be cleared. By default, the image cache never expires. Note: The image cache that fails to be created is retained for only one day.
        /// </summary>
        [Input("retentionDays")]
        public Input<int>? RetentionDays { get; set; }

        /// <summary>
        /// The ID of the security group. You do not need to specify the same security group as the container group.
        /// </summary>
        [Input("securityGroupId", required: true)]
        public Input<string> SecurityGroupId { get; set; } = null!;

        /// <summary>
        /// The ID of the VSwitch. You do not need to specify the same VSwitch as the container group.
        /// </summary>
        [Input("vswitchId", required: true)]
        public Input<string> VswitchId { get; set; } = null!;

        /// <summary>
        /// The zone id to cache image.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ImageCacheArgs()
        {
        }
    }

    public sealed class ImageCacheState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the container group job that is used to create the image cache.
        /// * `status` -The status of the image cache.
        /// </summary>
        [Input("containerGroupId")]
        public Input<string>? ContainerGroupId { get; set; }

        /// <summary>
        /// The instance ID of the Elastic IP Address (EIP). If you want to pull images from the Internet, you must specify an EIP to make sure that the container group can access the Internet. You can also configure the network address translation (NAT) gateway. We recommend that you configure the NAT gateway for the Internet access. Refer to [Public Network Access Method](https://help.aliyun.com/document_detail/99146.html)
        /// </summary>
        [Input("eipInstanceId")]
        public Input<string>? EipInstanceId { get; set; }

        /// <summary>
        /// The name of the image cache.
        /// </summary>
        [Input("imageCacheName")]
        public Input<string>? ImageCacheName { get; set; }

        /// <summary>
        /// The size of the image cache. Default to `20`. Unit: GiB.
        /// </summary>
        [Input("imageCacheSize")]
        public Input<int>? ImageCacheSize { get; set; }

        [Input("imageRegistryCredentials")]
        private InputList<Inputs.ImageCacheImageRegistryCredentialGetArgs>? _imageRegistryCredentials;

        /// <summary>
        /// The Image Registry parameters about the image to be cached.
        /// </summary>
        public InputList<Inputs.ImageCacheImageRegistryCredentialGetArgs> ImageRegistryCredentials
        {
            get => _imageRegistryCredentials ?? (_imageRegistryCredentials = new InputList<Inputs.ImageCacheImageRegistryCredentialGetArgs>());
            set => _imageRegistryCredentials = value;
        }

        [Input("images")]
        private InputList<string>? _images;

        /// <summary>
        /// The images to be cached. The image name must be versioned.
        /// </summary>
        public InputList<string> Images
        {
            get => _images ?? (_images = new InputList<string>());
            set => _images = value;
        }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The retention days of the image cache. Once the image cache expires, it will be cleared. By default, the image cache never expires. Note: The image cache that fails to be created is retained for only one day.
        /// </summary>
        [Input("retentionDays")]
        public Input<int>? RetentionDays { get; set; }

        /// <summary>
        /// The ID of the security group. You do not need to specify the same security group as the container group.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the VSwitch. You do not need to specify the same VSwitch as the container group.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        /// <summary>
        /// The zone id to cache image.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ImageCacheState()
        {
        }
    }
}
