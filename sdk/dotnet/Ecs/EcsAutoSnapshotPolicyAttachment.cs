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
    /// Provides a ECS Auto Snapshot Policy Attachment resource.
    /// 
    /// For information about ECS Auto Snapshot Policy Attachment and how to use it, see [What is Auto Snapshot Policy Attachment](https://www.alibabacloud.com/help/en/doc-detail/25531.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.122.0+.
    /// 
    /// ## Import
    /// 
    /// ECS Auto Snapshot Policy Attachment can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ecs/ecsAutoSnapshotPolicyAttachment:EcsAutoSnapshotPolicyAttachment example s-abcd12345:d-abcd12345
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ecs/ecsAutoSnapshotPolicyAttachment:EcsAutoSnapshotPolicyAttachment")]
    public partial class EcsAutoSnapshotPolicyAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The auto snapshot policy id.
        /// </summary>
        [Output("autoSnapshotPolicyId")]
        public Output<string> AutoSnapshotPolicyId { get; private set; } = null!;

        /// <summary>
        /// The disk id.
        /// </summary>
        [Output("diskId")]
        public Output<string> DiskId { get; private set; } = null!;


        /// <summary>
        /// Create a EcsAutoSnapshotPolicyAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EcsAutoSnapshotPolicyAttachment(string name, EcsAutoSnapshotPolicyAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ecs/ecsAutoSnapshotPolicyAttachment:EcsAutoSnapshotPolicyAttachment", name, args ?? new EcsAutoSnapshotPolicyAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EcsAutoSnapshotPolicyAttachment(string name, Input<string> id, EcsAutoSnapshotPolicyAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/ecsAutoSnapshotPolicyAttachment:EcsAutoSnapshotPolicyAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EcsAutoSnapshotPolicyAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EcsAutoSnapshotPolicyAttachment Get(string name, Input<string> id, EcsAutoSnapshotPolicyAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new EcsAutoSnapshotPolicyAttachment(name, id, state, options);
        }
    }

    public sealed class EcsAutoSnapshotPolicyAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The auto snapshot policy id.
        /// </summary>
        [Input("autoSnapshotPolicyId", required: true)]
        public Input<string> AutoSnapshotPolicyId { get; set; } = null!;

        /// <summary>
        /// The disk id.
        /// </summary>
        [Input("diskId", required: true)]
        public Input<string> DiskId { get; set; } = null!;

        public EcsAutoSnapshotPolicyAttachmentArgs()
        {
        }
        public static new EcsAutoSnapshotPolicyAttachmentArgs Empty => new EcsAutoSnapshotPolicyAttachmentArgs();
    }

    public sealed class EcsAutoSnapshotPolicyAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The auto snapshot policy id.
        /// </summary>
        [Input("autoSnapshotPolicyId")]
        public Input<string>? AutoSnapshotPolicyId { get; set; }

        /// <summary>
        /// The disk id.
        /// </summary>
        [Input("diskId")]
        public Input<string>? DiskId { get; set; }

        public EcsAutoSnapshotPolicyAttachmentState()
        {
        }
        public static new EcsAutoSnapshotPolicyAttachmentState Empty => new EcsAutoSnapshotPolicyAttachmentState();
    }
}
