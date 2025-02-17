// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ens
{
    /// <summary>
    /// Provides a ENS Image resource.
    /// 
    /// For information about ENS Image and how to use it, see [What is Image](https://www.alibabacloud.com/help/en/).
    /// 
    /// &gt; **NOTE:** Available since v1.216.0.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var defaultInstance = new AliCloud.Ens.Instance("defaultInstance", new()
    ///     {
    ///         SystemDisk = new AliCloud.Ens.Inputs.InstanceSystemDiskArgs
    ///         {
    ///             Size = 20,
    ///         },
    ///         ScheduleAreaLevel = "Region",
    ///         ImageId = "centos_6_08_64_20G_alibase_20171208",
    ///         PaymentType = "PayAsYouGo",
    ///         Password = "12345678ABCabc",
    ///         Amount = 1,
    ///         InternetMaxBandwidthOut = 10,
    ///         PublicIpIdentification = true,
    ///         EnsRegionId = "cn-chenzhou-telecom_unicom_cmcc",
    ///         PeriodUnit = "Month",
    ///         InstanceType = "ens.sn1.stiny",
    ///         Status = "Stopped",
    ///     });
    /// 
    ///     var defaultImage = new AliCloud.Ens.Image("defaultImage", new()
    ///     {
    ///         ImageName = name,
    ///         InstanceId = defaultInstance.Id,
    ///         DeleteAfterImageUpload = "false",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ENS Image can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ens/image:Image example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ens/image:Image")]
    public partial class Image : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Image creation time.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Whether the instance is automatically released after the image is packaged and uploaded successfully, only the build machine is supported.  Optional values: true: When the instance is released, the image is released together with the instance. false: When the instance is released, the image is retained and is not released together with the instance. Empty means false by default.
        /// </summary>
        [Output("deleteAfterImageUpload")]
        public Output<string?> DeleteAfterImageUpload { get; private set; } = null!;

        /// <summary>
        /// Image Name.
        /// </summary>
        [Output("imageName")]
        public Output<string> ImageName { get; private set; } = null!;

        /// <summary>
        /// The ID of the instance corresponding to the image.
        /// </summary>
        [Output("instanceId")]
        public Output<string?> InstanceId { get; private set; } = null!;

        /// <summary>
        /// Mirror Status  Optional values: Creating: Creating Packing: Packing Uploading: Uploading Pack_failed: Packing failed Upload_failed: Upload failed Available: Only images in the Available state can be used and operated. Unavailable: Not available Copying: Copying.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a Image resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Image(string name, ImageArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ens/image:Image", name, args ?? new ImageArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Image(string name, Input<string> id, ImageState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ens/image:Image", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Image resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Image Get(string name, Input<string> id, ImageState? state = null, CustomResourceOptions? options = null)
        {
            return new Image(name, id, state, options);
        }
    }

    public sealed class ImageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the instance is automatically released after the image is packaged and uploaded successfully, only the build machine is supported.  Optional values: true: When the instance is released, the image is released together with the instance. false: When the instance is released, the image is retained and is not released together with the instance. Empty means false by default.
        /// </summary>
        [Input("deleteAfterImageUpload")]
        public Input<string>? DeleteAfterImageUpload { get; set; }

        /// <summary>
        /// Image Name.
        /// </summary>
        [Input("imageName", required: true)]
        public Input<string> ImageName { get; set; } = null!;

        /// <summary>
        /// The ID of the instance corresponding to the image.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        public ImageArgs()
        {
        }
        public static new ImageArgs Empty => new ImageArgs();
    }

    public sealed class ImageState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Image creation time.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Whether the instance is automatically released after the image is packaged and uploaded successfully, only the build machine is supported.  Optional values: true: When the instance is released, the image is released together with the instance. false: When the instance is released, the image is retained and is not released together with the instance. Empty means false by default.
        /// </summary>
        [Input("deleteAfterImageUpload")]
        public Input<string>? DeleteAfterImageUpload { get; set; }

        /// <summary>
        /// Image Name.
        /// </summary>
        [Input("imageName")]
        public Input<string>? ImageName { get; set; }

        /// <summary>
        /// The ID of the instance corresponding to the image.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Mirror Status  Optional values: Creating: Creating Packing: Packing Uploading: Uploading Pack_failed: Packing failed Upload_failed: Upload failed Available: Only images in the Available state can be used and operated. Unavailable: Not available Copying: Copying.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public ImageState()
        {
        }
        public static new ImageState Empty => new ImageState();
    }
}
