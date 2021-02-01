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
    /// Import a copy of your local on-premise file to ECS, and appear as a custom replacement in the corresponding domain.
    /// 
    /// &gt; **NOTE:** You must upload the image file to the object storage OSS in advance.
    /// 
    /// &gt; **NOTE:** The region where the image is imported must be the same region as the OSS bucket where the image file is uploaded.
    /// 
    /// &gt; **NOTE:** Available in 1.69.0+.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var @this = new AliCloud.Ecs.ImageImport("this", new AliCloud.Ecs.ImageImportArgs
    ///         {
    ///             Architecture = "x86_64",
    ///             Description = "test import image",
    ///             DiskDeviceMappings = 
    ///             {
    ///                 new AliCloud.Ecs.Inputs.ImageImportDiskDeviceMappingArgs
    ///                 {
    ///                     DiskImageSize = 5,
    ///                     OssBucket = "testimportimage",
    ///                     OssObject = "root.img",
    ///                 },
    ///             },
    ///             ImageName = "test-import-image",
    ///             LicenseType = "Auto",
    ///             OsType = "linux",
    ///             Platform = "Ubuntu",
    ///         });
    ///     }
    /// 
    /// }
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
    ///  $ pulumi import alicloud:ecs/imageImport:ImageImport default m-uf66871ape***yg1q***
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ecs/imageImport:ImageImport")]
    public partial class ImageImport : Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the architecture of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `i386` , Default is `x86_64`.
        /// </summary>
        [Output("architecture")]
        public Output<string?> Architecture { get; private set; } = null!;

        /// <summary>
        /// Description of the image. The length is 2 to 256 English or Chinese characters, and cannot begin with http: // and https: //.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Description of the system with disks and snapshots under the image.
        /// </summary>
        [Output("diskDeviceMappings")]
        public Output<ImmutableArray<Outputs.ImageImportDiskDeviceMapping>> DiskDeviceMappings { get; private set; } = null!;

        /// <summary>
        /// The image name. The length is 2 ~ 128 English or Chinese characters. Must start with a english letter or Chinese, and cannot start with http: // and https: //. Can contain numbers, colons (:), underscores (_), or hyphens (-).
        /// </summary>
        [Output("imageName")]
        public Output<string?> ImageName { get; private set; } = null!;

        /// <summary>
        /// The type of the license used to activate the operating system after the image is imported. Default value: `Auto`. Valid values: `Auto`,`Aliyun`,`BYOL`.
        /// </summary>
        [Output("licenseType")]
        public Output<string?> LicenseType { get; private set; } = null!;

        /// <summary>
        /// Operating system platform type. Valid values: `windows`, Default is `linux`.
        /// </summary>
        [Output("osType")]
        public Output<string?> OsType { get; private set; } = null!;

        /// <summary>
        /// Specifies the operating system platform of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `CentOS`, `Ubuntu`, `SUSE`, `OpenSUSE`, `Debian`, `CoreOS`, `Windows Server 2003`, `Windows Server 2008`, `Windows Server 2012`, `Windows 7`, Default is `Others Linux`, `Customized Linux`.
        /// </summary>
        [Output("platform")]
        public Output<string?> Platform { get; private set; } = null!;


        /// <summary>
        /// Create a ImageImport resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ImageImport(string name, ImageImportArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ecs/imageImport:ImageImport", name, args ?? new ImageImportArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ImageImport(string name, Input<string> id, ImageImportState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/imageImport:ImageImport", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ImageImport resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ImageImport Get(string name, Input<string> id, ImageImportState? state = null, CustomResourceOptions? options = null)
        {
            return new ImageImport(name, id, state, options);
        }
    }

    public sealed class ImageImportArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the architecture of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `i386` , Default is `x86_64`.
        /// </summary>
        [Input("architecture")]
        public Input<string>? Architecture { get; set; }

        /// <summary>
        /// Description of the image. The length is 2 to 256 English or Chinese characters, and cannot begin with http: // and https: //.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("diskDeviceMappings", required: true)]
        private InputList<Inputs.ImageImportDiskDeviceMappingArgs>? _diskDeviceMappings;

        /// <summary>
        /// Description of the system with disks and snapshots under the image.
        /// </summary>
        public InputList<Inputs.ImageImportDiskDeviceMappingArgs> DiskDeviceMappings
        {
            get => _diskDeviceMappings ?? (_diskDeviceMappings = new InputList<Inputs.ImageImportDiskDeviceMappingArgs>());
            set => _diskDeviceMappings = value;
        }

        /// <summary>
        /// The image name. The length is 2 ~ 128 English or Chinese characters. Must start with a english letter or Chinese, and cannot start with http: // and https: //. Can contain numbers, colons (:), underscores (_), or hyphens (-).
        /// </summary>
        [Input("imageName")]
        public Input<string>? ImageName { get; set; }

        /// <summary>
        /// The type of the license used to activate the operating system after the image is imported. Default value: `Auto`. Valid values: `Auto`,`Aliyun`,`BYOL`.
        /// </summary>
        [Input("licenseType")]
        public Input<string>? LicenseType { get; set; }

        /// <summary>
        /// Operating system platform type. Valid values: `windows`, Default is `linux`.
        /// </summary>
        [Input("osType")]
        public Input<string>? OsType { get; set; }

        /// <summary>
        /// Specifies the operating system platform of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `CentOS`, `Ubuntu`, `SUSE`, `OpenSUSE`, `Debian`, `CoreOS`, `Windows Server 2003`, `Windows Server 2008`, `Windows Server 2012`, `Windows 7`, Default is `Others Linux`, `Customized Linux`.
        /// </summary>
        [Input("platform")]
        public Input<string>? Platform { get; set; }

        public ImageImportArgs()
        {
        }
    }

    public sealed class ImageImportState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the architecture of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `i386` , Default is `x86_64`.
        /// </summary>
        [Input("architecture")]
        public Input<string>? Architecture { get; set; }

        /// <summary>
        /// Description of the image. The length is 2 to 256 English or Chinese characters, and cannot begin with http: // and https: //.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("diskDeviceMappings")]
        private InputList<Inputs.ImageImportDiskDeviceMappingGetArgs>? _diskDeviceMappings;

        /// <summary>
        /// Description of the system with disks and snapshots under the image.
        /// </summary>
        public InputList<Inputs.ImageImportDiskDeviceMappingGetArgs> DiskDeviceMappings
        {
            get => _diskDeviceMappings ?? (_diskDeviceMappings = new InputList<Inputs.ImageImportDiskDeviceMappingGetArgs>());
            set => _diskDeviceMappings = value;
        }

        /// <summary>
        /// The image name. The length is 2 ~ 128 English or Chinese characters. Must start with a english letter or Chinese, and cannot start with http: // and https: //. Can contain numbers, colons (:), underscores (_), or hyphens (-).
        /// </summary>
        [Input("imageName")]
        public Input<string>? ImageName { get; set; }

        /// <summary>
        /// The type of the license used to activate the operating system after the image is imported. Default value: `Auto`. Valid values: `Auto`,`Aliyun`,`BYOL`.
        /// </summary>
        [Input("licenseType")]
        public Input<string>? LicenseType { get; set; }

        /// <summary>
        /// Operating system platform type. Valid values: `windows`, Default is `linux`.
        /// </summary>
        [Input("osType")]
        public Input<string>? OsType { get; set; }

        /// <summary>
        /// Specifies the operating system platform of the system disk after you specify a data disk snapshot as the data source of the system disk for creating an image. Valid values: `CentOS`, `Ubuntu`, `SUSE`, `OpenSUSE`, `Debian`, `CoreOS`, `Windows Server 2003`, `Windows Server 2008`, `Windows Server 2012`, `Windows 7`, Default is `Others Linux`, `Customized Linux`.
        /// </summary>
        [Input("platform")]
        public Input<string>? Platform { get; set; }

        public ImageImportState()
        {
        }
    }
}
