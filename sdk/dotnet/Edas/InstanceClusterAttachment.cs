// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Edas
{
    /// <summary>
    /// Provides an EDAS instance cluster attachment resource, see [What is EDAS Instance Cluster Attachment](https://www.alibabacloud.com/help/en/edas/developer-reference/api-edas-2017-08-01-installagent).
    /// 
    /// &gt; **NOTE:** Available since v1.82.0.
    /// </summary>
    [AliCloudResourceType("alicloud:edas/instanceClusterAttachment:InstanceClusterAttachment")]
    public partial class InstanceClusterAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the cluster that you want to create the application.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The cluster members map of the resource supplied above. The key is instance_id and the value is cluster_member_id.
        /// </summary>
        [Output("clusterMemberIds")]
        public Output<ImmutableDictionary<string, string>> ClusterMemberIds { get; private set; } = null!;

        /// <summary>
        /// The ecu map of the resource supplied above. The key is instance_id and the value is ecu_id.
        /// </summary>
        [Output("ecuMap")]
        public Output<ImmutableDictionary<string, string>> EcuMap { get; private set; } = null!;

        /// <summary>
        /// The ID of instance. Type: list.
        /// </summary>
        [Output("instanceIds")]
        public Output<ImmutableArray<string>> InstanceIds { get; private set; } = null!;

        /// <summary>
        /// The status map of the resource supplied above. The key is instance_id and the values are 1(running) 0(converting) -1(failed) and -2(offline).
        /// </summary>
        [Output("statusMap")]
        public Output<ImmutableDictionary<string, int>> StatusMap { get; private set; } = null!;


        /// <summary>
        /// Create a InstanceClusterAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstanceClusterAttachment(string name, InstanceClusterAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:edas/instanceClusterAttachment:InstanceClusterAttachment", name, args ?? new InstanceClusterAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstanceClusterAttachment(string name, Input<string> id, InstanceClusterAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:edas/instanceClusterAttachment:InstanceClusterAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InstanceClusterAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstanceClusterAttachment Get(string name, Input<string> id, InstanceClusterAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new InstanceClusterAttachment(name, id, state, options);
        }
    }

    public sealed class InstanceClusterAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the cluster that you want to create the application.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        [Input("instanceIds", required: true)]
        private InputList<string>? _instanceIds;

        /// <summary>
        /// The ID of instance. Type: list.
        /// </summary>
        public InputList<string> InstanceIds
        {
            get => _instanceIds ?? (_instanceIds = new InputList<string>());
            set => _instanceIds = value;
        }

        public InstanceClusterAttachmentArgs()
        {
        }
        public static new InstanceClusterAttachmentArgs Empty => new InstanceClusterAttachmentArgs();
    }

    public sealed class InstanceClusterAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the cluster that you want to create the application.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("clusterMemberIds")]
        private InputMap<string>? _clusterMemberIds;

        /// <summary>
        /// The cluster members map of the resource supplied above. The key is instance_id and the value is cluster_member_id.
        /// </summary>
        public InputMap<string> ClusterMemberIds
        {
            get => _clusterMemberIds ?? (_clusterMemberIds = new InputMap<string>());
            set => _clusterMemberIds = value;
        }

        [Input("ecuMap")]
        private InputMap<string>? _ecuMap;

        /// <summary>
        /// The ecu map of the resource supplied above. The key is instance_id and the value is ecu_id.
        /// </summary>
        public InputMap<string> EcuMap
        {
            get => _ecuMap ?? (_ecuMap = new InputMap<string>());
            set => _ecuMap = value;
        }

        [Input("instanceIds")]
        private InputList<string>? _instanceIds;

        /// <summary>
        /// The ID of instance. Type: list.
        /// </summary>
        public InputList<string> InstanceIds
        {
            get => _instanceIds ?? (_instanceIds = new InputList<string>());
            set => _instanceIds = value;
        }

        [Input("statusMap")]
        private InputMap<int>? _statusMap;

        /// <summary>
        /// The status map of the resource supplied above. The key is instance_id and the values are 1(running) 0(converting) -1(failed) and -2(offline).
        /// </summary>
        public InputMap<int> StatusMap
        {
            get => _statusMap ?? (_statusMap = new InputMap<int>());
            set => _statusMap = value;
        }

        public InstanceClusterAttachmentState()
        {
        }
        public static new InstanceClusterAttachmentState Empty => new InstanceClusterAttachmentState();
    }
}
