// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    /// <summary>
    /// Copies a custom image from one region to another. You can use copied images to perform operations in the target region, such as creating instances (RunInstances) and replacing system disks (ReplaceSystemDisk).
    /// 
    /// &gt; **NOTE:** You can only copy the custom image when it is in the Available state.
    /// 
    /// &gt; **NOTE:** You can only copy the image belonging to your Alibaba Cloud account. Images cannot be copied from one account to another.
    /// 
    /// &gt; **NOTE:** If the copying is not completed, you cannot call DeleteImage to delete the image but you can call CancelCopyImage to cancel the copying.
    /// 
    /// &gt; **NOTE:** Available in 1.66.0+.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new AliCloud.Ecs.ImageCopy("default", new()
    ///     {
    ///         Description = "test-image",
    ///         ImageName = "test-image",
    ///         SourceImageId = "m-bp1gxyhdswlsn18tu***",
    ///         SourceRegionId = "cn-hangzhou",
    ///         Tags = 
    ///         {
    ///             { "FinanceDept", "FinanceDeptJoshua" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## Attributes Reference0
    /// 
    ///  The following attributes are exported:
    /// 
    /// * `id` - ID of the image.
    /// 
    /// ## Import
    /// 
    /// image can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ecs/imageCopy:ImageCopy default m-uf66871ape***yg1q***
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ecs/imageCopy:ImageCopy")]
    public partial class ImageCopy : global::Pulumi.CustomResource
    {
        [Output("deleteAutoSnapshot")]
        public Output<bool?> DeleteAutoSnapshot { get; private set; } = null!;

        /// <summary>
        /// The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Indicates whether to encrypt the image.
        /// </summary>
        [Output("encrypted")]
        public Output<bool?> Encrypted { get; private set; } = null!;

        /// <summary>
        /// Indicates whether to force delete the custom image, Default is `false`. 
        /// - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
        /// - false：Verifies that the image is not currently in use by any other instances before deleting the image.
        /// </summary>
        [Output("force")]
        public Output<bool?> Force { get; private set; } = null!;

        /// <summary>
        /// The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
        /// </summary>
        [Output("imageName")]
        public Output<string> ImageName { get; private set; } = null!;

        /// <summary>
        /// Key ID used to encrypt the image.
        /// </summary>
        [Output("kmsKeyId")]
        public Output<string?> KmsKeyId { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The source image ID.
        /// </summary>
        [Output("sourceImageId")]
        public Output<string> SourceImageId { get; private set; } = null!;

        /// <summary>
        /// The ID of the region to which the source custom image belongs. You can call [DescribeRegions](https://www.alibabacloud.com/help/doc-detail/25609.htm) to view the latest regions of Alibaba Cloud.
        /// </summary>
        [Output("sourceRegionId")]
        public Output<string> SourceRegionId { get; private set; } = null!;

        /// <summary>
        /// The tag value of an image. The value of N ranges from 1 to 20.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a ImageCopy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ImageCopy(string name, ImageCopyArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ecs/imageCopy:ImageCopy", name, args ?? new ImageCopyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ImageCopy(string name, Input<string> id, ImageCopyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/imageCopy:ImageCopy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ImageCopy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ImageCopy Get(string name, Input<string> id, ImageCopyState? state = null, CustomResourceOptions? options = null)
        {
            return new ImageCopy(name, id, state, options);
        }
    }

    public sealed class ImageCopyArgs : global::Pulumi.ResourceArgs
    {
        [Input("deleteAutoSnapshot")]
        public Input<bool>? DeleteAutoSnapshot { get; set; }

        /// <summary>
        /// The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Indicates whether to encrypt the image.
        /// </summary>
        [Input("encrypted")]
        public Input<bool>? Encrypted { get; set; }

        /// <summary>
        /// Indicates whether to force delete the custom image, Default is `false`. 
        /// - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
        /// - false：Verifies that the image is not currently in use by any other instances before deleting the image.
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
        /// </summary>
        [Input("imageName")]
        public Input<string>? ImageName { get; set; }

        /// <summary>
        /// Key ID used to encrypt the image.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The source image ID.
        /// </summary>
        [Input("sourceImageId", required: true)]
        public Input<string> SourceImageId { get; set; } = null!;

        /// <summary>
        /// The ID of the region to which the source custom image belongs. You can call [DescribeRegions](https://www.alibabacloud.com/help/doc-detail/25609.htm) to view the latest regions of Alibaba Cloud.
        /// </summary>
        [Input("sourceRegionId", required: true)]
        public Input<string> SourceRegionId { get; set; } = null!;

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// The tag value of an image. The value of N ranges from 1 to 20.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public ImageCopyArgs()
        {
        }
        public static new ImageCopyArgs Empty => new ImageCopyArgs();
    }

    public sealed class ImageCopyState : global::Pulumi.ResourceArgs
    {
        [Input("deleteAutoSnapshot")]
        public Input<bool>? DeleteAutoSnapshot { get; set; }

        /// <summary>
        /// The description of the image. It must be 2 to 256 characters in length and must not start with http:// or https://. Default value: null.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Indicates whether to encrypt the image.
        /// </summary>
        [Input("encrypted")]
        public Input<bool>? Encrypted { get; set; }

        /// <summary>
        /// Indicates whether to force delete the custom image, Default is `false`. 
        /// - true：Force deletes the custom image, regardless of whether the image is currently being used by other instances.
        /// - false：Verifies that the image is not currently in use by any other instances before deleting the image.
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// The image name. It must be 2 to 128 characters in length, and must begin with a letter or Chinese character (beginning with http:// or https:// is not allowed). It can contain digits, colons (:), underscores (_), or hyphens (-). Default value: null.
        /// </summary>
        [Input("imageName")]
        public Input<string>? ImageName { get; set; }

        /// <summary>
        /// Key ID used to encrypt the image.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The source image ID.
        /// </summary>
        [Input("sourceImageId")]
        public Input<string>? SourceImageId { get; set; }

        /// <summary>
        /// The ID of the region to which the source custom image belongs. You can call [DescribeRegions](https://www.alibabacloud.com/help/doc-detail/25609.htm) to view the latest regions of Alibaba Cloud.
        /// </summary>
        [Input("sourceRegionId")]
        public Input<string>? SourceRegionId { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// The tag value of an image. The value of N ranges from 1 to 20.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public ImageCopyState()
        {
        }
        public static new ImageCopyState Empty => new ImageCopyState();
    }
}
