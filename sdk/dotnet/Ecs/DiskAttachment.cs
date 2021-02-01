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
    /// Provides an Alicloud ECS Disk Attachment as a resource, to attach and detach disks from ECS Instances.
    /// 
    /// ## Example Usage
    /// 
    /// Basic usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new ECS disk-attachment and use it attach one disk to a new instance.
    ///         var ecsSg = new AliCloud.Ecs.SecurityGroup("ecsSg", new AliCloud.Ecs.SecurityGroupArgs
    ///         {
    ///             Description = "New security group",
    ///         });
    ///         var ecsDisk = new AliCloud.Ecs.Disk("ecsDisk", new AliCloud.Ecs.DiskArgs
    ///         {
    ///             AvailabilityZone = "cn-beijing-a",
    ///             Size = 50,
    ///             Tags = 
    ///             {
    ///                 { "Name", "TerraformTest-disk" },
    ///             },
    ///         });
    ///         var ecsInstance = new AliCloud.Ecs.Instance("ecsInstance", new AliCloud.Ecs.InstanceArgs
    ///         {
    ///             ImageId = "ubuntu_18_04_64_20G_alibase_20190624.vhd",
    ///             InstanceType = "ecs.n4.small",
    ///             AvailabilityZone = "cn-beijing-a",
    ///             SecurityGroups = 
    ///             {
    ///                 ecsSg.Id,
    ///             },
    ///             InstanceName = "Hello",
    ///             InternetChargeType = "PayByBandwidth",
    ///             Tags = 
    ///             {
    ///                 { "Name", "TerraformTest-instance" },
    ///             },
    ///         });
    ///         var ecsDiskAtt = new AliCloud.Ecs.DiskAttachment("ecsDiskAtt", new AliCloud.Ecs.DiskAttachmentArgs
    ///         {
    ///             DiskId = ecsDisk.Id,
    ///             InstanceId = ecsInstance.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ecs/diskAttachment:DiskAttachment")]
    public partial class DiskAttachment : Pulumi.CustomResource
    {
        /// <summary>
        /// The device name has been deprecated, and when attaching disk, it will be allocated automatically by system according to default order from /dev/xvdb to /dev/xvdz.
        /// </summary>
        [Output("deviceName")]
        public Output<string> DeviceName { get; private set; } = null!;

        /// <summary>
        /// ID of the Disk to be attached.
        /// </summary>
        [Output("diskId")]
        public Output<string> DiskId { get; private set; } = null!;

        /// <summary>
        /// ID of the Instance to attach to.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;


        /// <summary>
        /// Create a DiskAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DiskAttachment(string name, DiskAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ecs/diskAttachment:DiskAttachment", name, args ?? new DiskAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DiskAttachment(string name, Input<string> id, DiskAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/diskAttachment:DiskAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DiskAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DiskAttachment Get(string name, Input<string> id, DiskAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new DiskAttachment(name, id, state, options);
        }
    }

    public sealed class DiskAttachmentArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The device name has been deprecated, and when attaching disk, it will be allocated automatically by system according to default order from /dev/xvdb to /dev/xvdz.
        /// </summary>
        [Input("deviceName")]
        public Input<string>? DeviceName { get; set; }

        /// <summary>
        /// ID of the Disk to be attached.
        /// </summary>
        [Input("diskId", required: true)]
        public Input<string> DiskId { get; set; } = null!;

        /// <summary>
        /// ID of the Instance to attach to.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        public DiskAttachmentArgs()
        {
        }
    }

    public sealed class DiskAttachmentState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The device name has been deprecated, and when attaching disk, it will be allocated automatically by system according to default order from /dev/xvdb to /dev/xvdz.
        /// </summary>
        [Input("deviceName")]
        public Input<string>? DeviceName { get; set; }

        /// <summary>
        /// ID of the Disk to be attached.
        /// </summary>
        [Input("diskId")]
        public Input<string>? DiskId { get; set; }

        /// <summary>
        /// ID of the Instance to attach to.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        public DiskAttachmentState()
        {
        }
    }
}
