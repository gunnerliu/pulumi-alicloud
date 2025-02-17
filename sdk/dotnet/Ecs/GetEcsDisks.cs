// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static class GetEcsDisks
    {
        /// <summary>
        /// This data source provides the Ecs Disks of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.122.0+.
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
        ///     var example = AliCloud.Ecs.GetEcsDisks.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "d-artgdsvdvxxxx",
        ///         },
        ///         NameRegex = "tf-test",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstEcsDiskId"] = example.Apply(getEcsDisksResult =&gt; getEcsDisksResult.Disks[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEcsDisksResult> InvokeAsync(GetEcsDisksArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEcsDisksResult>("alicloud:ecs/getEcsDisks:getEcsDisks", args ?? new GetEcsDisksArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ecs Disks of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.122.0+.
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
        ///     var example = AliCloud.Ecs.GetEcsDisks.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "d-artgdsvdvxxxx",
        ///         },
        ///         NameRegex = "tf-test",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstEcsDiskId"] = example.Apply(getEcsDisksResult =&gt; getEcsDisksResult.Disks[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetEcsDisksResult> Invoke(GetEcsDisksInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEcsDisksResult>("alicloud:ecs/getEcsDisks:getEcsDisks", args ?? new GetEcsDisksInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEcsDisksArgs : global::Pulumi.InvokeArgs
    {
        [Input("additionalAttributes")]
        private List<string>? _additionalAttributes;

        /// <summary>
        /// Other attribute values. Currently, only the incoming value of IOPS is supported, which means to query the IOPS upper limit of the current disk.
        /// </summary>
        public List<string> AdditionalAttributes
        {
            get => _additionalAttributes ?? (_additionalAttributes = new List<string>());
            set => _additionalAttributes = value;
        }

        /// <summary>
        /// Query cloud disks based on the automatic snapshot policy ID.
        /// </summary>
        [Input("autoSnapshotPolicyId")]
        public string? AutoSnapshotPolicyId { get; set; }

        /// <summary>
        /// Availability zone of the disk.
        /// </summary>
        [Input("availabilityZone")]
        public string? AvailabilityZone { get; set; }

        /// <summary>
        /// Disk category.
        /// </summary>
        [Input("category")]
        public string? Category { get; set; }

        /// <summary>
        /// Indicates whether the automatic snapshot is deleted when the disk is released.
        /// </summary>
        [Input("deleteAutoSnapshot")]
        public bool? DeleteAutoSnapshot { get; set; }

        /// <summary>
        /// Indicates whether the disk is released together with the instance.
        /// </summary>
        [Input("deleteWithInstance")]
        public bool? DeleteWithInstance { get; set; }

        /// <summary>
        /// The disk name.
        /// </summary>
        [Input("diskName")]
        public string? DiskName { get; set; }

        /// <summary>
        /// The disk type.
        /// </summary>
        [Input("diskType")]
        public string? DiskType { get; set; }

        /// <summary>
        /// Specifies whether to check the validity of the request without actually making the request.request Default value: false. Valid values:
        /// </summary>
        [Input("dryRun")]
        public bool? DryRun { get; set; }

        /// <summary>
        /// Whether the disk implements an automatic snapshot policy.
        /// </summary>
        [Input("enableAutoSnapshot")]
        public bool? EnableAutoSnapshot { get; set; }

        /// <summary>
        /// Whether the disk implements an automatic snapshot policy.
        /// </summary>
        [Input("enableAutomatedSnapshotPolicy")]
        public bool? EnableAutomatedSnapshotPolicy { get; set; }

        /// <summary>
        /// Whether it is shared block storage.
        /// </summary>
        [Input("enableShared")]
        public bool? EnableShared { get; set; }

        /// <summary>
        /// Indicate whether the disk is encrypted or not.
        /// </summary>
        [Input("encrypted")]
        public string? Encrypted { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Disk IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The instance ID of the disk mount.
        /// </summary>
        [Input("instanceId")]
        public string? InstanceId { get; set; }

        /// <summary>
        /// The kms key id.
        /// </summary>
        [Input("kmsKeyId")]
        public string? KmsKeyId { get; set; }

        /// <summary>
        /// A regex string to filter results by Disk name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("operationLocks")]
        private List<Inputs.GetEcsDisksOperationLockArgs>? _operationLocks;
        public List<Inputs.GetEcsDisksOperationLockArgs> OperationLocks
        {
            get => _operationLocks ?? (_operationLocks = new List<Inputs.GetEcsDisksOperationLockArgs>());
            set => _operationLocks = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        /// <summary>
        /// Payment method for disk.
        /// </summary>
        [Input("paymentType")]
        public string? PaymentType { get; set; }

        /// <summary>
        /// Whether the disk is unmountable.
        /// </summary>
        [Input("portable")]
        public bool? Portable { get; set; }

        /// <summary>
        /// The Id of resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
        /// </summary>
        [Input("snapshotId")]
        public string? SnapshotId { get; set; }

        /// <summary>
        /// Current status.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// A map of tags assigned to the disk.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        /// <summary>
        /// Disk type.
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        /// <summary>
        /// The zone id.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetEcsDisksArgs()
        {
        }
        public static new GetEcsDisksArgs Empty => new GetEcsDisksArgs();
    }

    public sealed class GetEcsDisksInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("additionalAttributes")]
        private InputList<string>? _additionalAttributes;

        /// <summary>
        /// Other attribute values. Currently, only the incoming value of IOPS is supported, which means to query the IOPS upper limit of the current disk.
        /// </summary>
        public InputList<string> AdditionalAttributes
        {
            get => _additionalAttributes ?? (_additionalAttributes = new InputList<string>());
            set => _additionalAttributes = value;
        }

        /// <summary>
        /// Query cloud disks based on the automatic snapshot policy ID.
        /// </summary>
        [Input("autoSnapshotPolicyId")]
        public Input<string>? AutoSnapshotPolicyId { get; set; }

        /// <summary>
        /// Availability zone of the disk.
        /// </summary>
        [Input("availabilityZone")]
        public Input<string>? AvailabilityZone { get; set; }

        /// <summary>
        /// Disk category.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// Indicates whether the automatic snapshot is deleted when the disk is released.
        /// </summary>
        [Input("deleteAutoSnapshot")]
        public Input<bool>? DeleteAutoSnapshot { get; set; }

        /// <summary>
        /// Indicates whether the disk is released together with the instance.
        /// </summary>
        [Input("deleteWithInstance")]
        public Input<bool>? DeleteWithInstance { get; set; }

        /// <summary>
        /// The disk name.
        /// </summary>
        [Input("diskName")]
        public Input<string>? DiskName { get; set; }

        /// <summary>
        /// The disk type.
        /// </summary>
        [Input("diskType")]
        public Input<string>? DiskType { get; set; }

        /// <summary>
        /// Specifies whether to check the validity of the request without actually making the request.request Default value: false. Valid values:
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// Whether the disk implements an automatic snapshot policy.
        /// </summary>
        [Input("enableAutoSnapshot")]
        public Input<bool>? EnableAutoSnapshot { get; set; }

        /// <summary>
        /// Whether the disk implements an automatic snapshot policy.
        /// </summary>
        [Input("enableAutomatedSnapshotPolicy")]
        public Input<bool>? EnableAutomatedSnapshotPolicy { get; set; }

        /// <summary>
        /// Whether it is shared block storage.
        /// </summary>
        [Input("enableShared")]
        public Input<bool>? EnableShared { get; set; }

        /// <summary>
        /// Indicate whether the disk is encrypted or not.
        /// </summary>
        [Input("encrypted")]
        public Input<string>? Encrypted { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Disk IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The instance ID of the disk mount.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The kms key id.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// A regex string to filter results by Disk name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("operationLocks")]
        private InputList<Inputs.GetEcsDisksOperationLockInputArgs>? _operationLocks;
        public InputList<Inputs.GetEcsDisksOperationLockInputArgs> OperationLocks
        {
            get => _operationLocks ?? (_operationLocks = new InputList<Inputs.GetEcsDisksOperationLockInputArgs>());
            set => _operationLocks = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        /// <summary>
        /// Payment method for disk.
        /// </summary>
        [Input("paymentType")]
        public Input<string>? PaymentType { get; set; }

        /// <summary>
        /// Whether the disk is unmountable.
        /// </summary>
        [Input("portable")]
        public Input<bool>? Portable { get; set; }

        /// <summary>
        /// The Id of resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// Current status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A map of tags assigned to the disk.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// Disk type.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The zone id.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetEcsDisksInvokeArgs()
        {
        }
        public static new GetEcsDisksInvokeArgs Empty => new GetEcsDisksInvokeArgs();
    }


    [OutputType]
    public sealed class GetEcsDisksResult
    {
        public readonly ImmutableArray<string> AdditionalAttributes;
        public readonly string? AutoSnapshotPolicyId;
        public readonly string? AvailabilityZone;
        public readonly string? Category;
        public readonly bool? DeleteAutoSnapshot;
        public readonly bool? DeleteWithInstance;
        public readonly string? DiskName;
        public readonly string? DiskType;
        public readonly ImmutableArray<Outputs.GetEcsDisksDiskResult> Disks;
        public readonly bool? DryRun;
        public readonly bool? EnableAutoSnapshot;
        public readonly bool? EnableAutomatedSnapshotPolicy;
        public readonly bool? EnableShared;
        public readonly string? Encrypted;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? InstanceId;
        public readonly string? KmsKeyId;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly ImmutableArray<Outputs.GetEcsDisksOperationLockResult> OperationLocks;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        public readonly string? PaymentType;
        public readonly bool? Portable;
        public readonly string? ResourceGroupId;
        public readonly string? SnapshotId;
        public readonly string? Status;
        public readonly ImmutableDictionary<string, object>? Tags;
        public readonly int TotalCount;
        public readonly string? Type;
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetEcsDisksResult(
            ImmutableArray<string> additionalAttributes,

            string? autoSnapshotPolicyId,

            string? availabilityZone,

            string? category,

            bool? deleteAutoSnapshot,

            bool? deleteWithInstance,

            string? diskName,

            string? diskType,

            ImmutableArray<Outputs.GetEcsDisksDiskResult> disks,

            bool? dryRun,

            bool? enableAutoSnapshot,

            bool? enableAutomatedSnapshotPolicy,

            bool? enableShared,

            string? encrypted,

            string id,

            ImmutableArray<string> ids,

            string? instanceId,

            string? kmsKeyId,

            string? nameRegex,

            ImmutableArray<string> names,

            ImmutableArray<Outputs.GetEcsDisksOperationLockResult> operationLocks,

            string? outputFile,

            int? pageNumber,

            int? pageSize,

            string? paymentType,

            bool? portable,

            string? resourceGroupId,

            string? snapshotId,

            string? status,

            ImmutableDictionary<string, object>? tags,

            int totalCount,

            string? type,

            string? zoneId)
        {
            AdditionalAttributes = additionalAttributes;
            AutoSnapshotPolicyId = autoSnapshotPolicyId;
            AvailabilityZone = availabilityZone;
            Category = category;
            DeleteAutoSnapshot = deleteAutoSnapshot;
            DeleteWithInstance = deleteWithInstance;
            DiskName = diskName;
            DiskType = diskType;
            Disks = disks;
            DryRun = dryRun;
            EnableAutoSnapshot = enableAutoSnapshot;
            EnableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
            EnableShared = enableShared;
            Encrypted = encrypted;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            KmsKeyId = kmsKeyId;
            NameRegex = nameRegex;
            Names = names;
            OperationLocks = operationLocks;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
            PaymentType = paymentType;
            Portable = portable;
            ResourceGroupId = resourceGroupId;
            SnapshotId = snapshotId;
            Status = status;
            Tags = tags;
            TotalCount = totalCount;
            Type = type;
            ZoneId = zoneId;
        }
    }
}
