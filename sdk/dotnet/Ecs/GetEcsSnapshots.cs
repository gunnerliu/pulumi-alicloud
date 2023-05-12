// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static class GetEcsSnapshots
    {
        /// <summary>
        /// This data source provides the Ecs Snapshots of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.120.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var example = AliCloud.Ecs.GetEcsSnapshots.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "s-bp1fvuxxxxxxxx",
        ///         },
        ///         NameRegex = "tf-test",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstEcsSnapshotId"] = example.Apply(getEcsSnapshotsResult =&gt; getEcsSnapshotsResult.Snapshots[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEcsSnapshotsResult> InvokeAsync(GetEcsSnapshotsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEcsSnapshotsResult>("alicloud:ecs/getEcsSnapshots:getEcsSnapshots", args ?? new GetEcsSnapshotsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ecs Snapshots of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.120.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var example = AliCloud.Ecs.GetEcsSnapshots.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "s-bp1fvuxxxxxxxx",
        ///         },
        ///         NameRegex = "tf-test",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstEcsSnapshotId"] = example.Apply(getEcsSnapshotsResult =&gt; getEcsSnapshotsResult.Snapshots[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetEcsSnapshotsResult> Invoke(GetEcsSnapshotsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEcsSnapshotsResult>("alicloud:ecs/getEcsSnapshots:getEcsSnapshots", args ?? new GetEcsSnapshotsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEcsSnapshotsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The category of the snapshot.
        /// </summary>
        [Input("category")]
        public string? Category { get; set; }

        /// <summary>
        /// Specifies whether to check the validity of the request without actually making the request.
        /// </summary>
        [Input("dryRun")]
        public bool? DryRun { get; set; }

        /// <summary>
        /// Whether the snapshot is encrypted.
        /// </summary>
        [Input("encrypted")]
        public bool? Encrypted { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Snapshot IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The kms key id.
        /// </summary>
        [Input("kmsKeyId")]
        public string? KmsKeyId { get; set; }

        /// <summary>
        /// A regex string to filter results by Snapshot name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The resource group id.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// The snapshot link id.
        /// </summary>
        [Input("snapshotLinkId")]
        public string? SnapshotLinkId { get; set; }

        /// <summary>
        /// Snapshot Display Name.
        /// </summary>
        [Input("snapshotName")]
        public string? SnapshotName { get; set; }

        /// <summary>
        /// Snapshot creation type.
        /// </summary>
        [Input("snapshotType")]
        public string? SnapshotType { get; set; }

        /// <summary>
        /// Source disk attributes.
        /// </summary>
        [Input("sourceDiskType")]
        public string? SourceDiskType { get; set; }

        /// <summary>
        /// The status of the snapshot.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// The tags.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        [Input("type")]
        public string? Type { get; set; }

        /// <summary>
        /// A resource type that has a reference relationship.
        /// </summary>
        [Input("usage")]
        public string? Usage { get; set; }

        public GetEcsSnapshotsArgs()
        {
        }
        public static new GetEcsSnapshotsArgs Empty => new GetEcsSnapshotsArgs();
    }

    public sealed class GetEcsSnapshotsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The category of the snapshot.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// Specifies whether to check the validity of the request without actually making the request.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// Whether the snapshot is encrypted.
        /// </summary>
        [Input("encrypted")]
        public Input<bool>? Encrypted { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Snapshot IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The kms key id.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// A regex string to filter results by Snapshot name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The resource group id.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The snapshot link id.
        /// </summary>
        [Input("snapshotLinkId")]
        public Input<string>? SnapshotLinkId { get; set; }

        /// <summary>
        /// Snapshot Display Name.
        /// </summary>
        [Input("snapshotName")]
        public Input<string>? SnapshotName { get; set; }

        /// <summary>
        /// Snapshot creation type.
        /// </summary>
        [Input("snapshotType")]
        public Input<string>? SnapshotType { get; set; }

        /// <summary>
        /// Source disk attributes.
        /// </summary>
        [Input("sourceDiskType")]
        public Input<string>? SourceDiskType { get; set; }

        /// <summary>
        /// The status of the snapshot.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// The tags.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// A resource type that has a reference relationship.
        /// </summary>
        [Input("usage")]
        public Input<string>? Usage { get; set; }

        public GetEcsSnapshotsInvokeArgs()
        {
        }
        public static new GetEcsSnapshotsInvokeArgs Empty => new GetEcsSnapshotsInvokeArgs();
    }


    [OutputType]
    public sealed class GetEcsSnapshotsResult
    {
        public readonly string? Category;
        public readonly bool? DryRun;
        public readonly bool? Encrypted;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? KmsKeyId;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? ResourceGroupId;
        public readonly string? SnapshotLinkId;
        public readonly string? SnapshotName;
        public readonly string? SnapshotType;
        public readonly ImmutableArray<Outputs.GetEcsSnapshotsSnapshotResult> Snapshots;
        public readonly string? SourceDiskType;
        public readonly string? Status;
        public readonly ImmutableDictionary<string, object>? Tags;
        public readonly string? Type;
        public readonly string? Usage;

        [OutputConstructor]
        private GetEcsSnapshotsResult(
            string? category,

            bool? dryRun,

            bool? encrypted,

            string id,

            ImmutableArray<string> ids,

            string? kmsKeyId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? resourceGroupId,

            string? snapshotLinkId,

            string? snapshotName,

            string? snapshotType,

            ImmutableArray<Outputs.GetEcsSnapshotsSnapshotResult> snapshots,

            string? sourceDiskType,

            string? status,

            ImmutableDictionary<string, object>? tags,

            string? type,

            string? usage)
        {
            Category = category;
            DryRun = dryRun;
            Encrypted = encrypted;
            Id = id;
            Ids = ids;
            KmsKeyId = kmsKeyId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ResourceGroupId = resourceGroupId;
            SnapshotLinkId = snapshotLinkId;
            SnapshotName = snapshotName;
            SnapshotType = snapshotType;
            Snapshots = snapshots;
            SourceDiskType = sourceDiskType;
            Status = status;
            Tags = tags;
            Type = type;
            Usage = usage;
        }
    }
}
