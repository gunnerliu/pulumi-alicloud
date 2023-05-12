// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr
{
    public static class GetRestoreJobs
    {
        /// <summary>
        /// This data source provides the Hbr Restore Jobs of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.133.0+.
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
        ///     var defaultEcsBackupPlans = AliCloud.Hbr.GetEcsBackupPlans.Invoke(new()
        ///     {
        ///         NameRegex = "plan-name",
        ///     });
        /// 
        ///     var defaultRestoreJobs = AliCloud.Hbr.GetRestoreJobs.Invoke(new()
        ///     {
        ///         RestoreType = "ECS_FILE",
        ///         VaultIds = new[]
        ///         {
        ///             defaultEcsBackupPlans.Apply(getEcsBackupPlansResult =&gt; getEcsBackupPlansResult.Plans[0]?.VaultId),
        ///         },
        ///         TargetInstanceIds = new[]
        ///         {
        ///             defaultEcsBackupPlans.Apply(getEcsBackupPlansResult =&gt; getEcsBackupPlansResult.Plans[0]?.InstanceId),
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRestoreJobsResult> InvokeAsync(GetRestoreJobsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRestoreJobsResult>("alicloud:hbr/getRestoreJobs:getRestoreJobs", args ?? new GetRestoreJobsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Hbr Restore Jobs of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.133.0+.
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
        ///     var defaultEcsBackupPlans = AliCloud.Hbr.GetEcsBackupPlans.Invoke(new()
        ///     {
        ///         NameRegex = "plan-name",
        ///     });
        /// 
        ///     var defaultRestoreJobs = AliCloud.Hbr.GetRestoreJobs.Invoke(new()
        ///     {
        ///         RestoreType = "ECS_FILE",
        ///         VaultIds = new[]
        ///         {
        ///             defaultEcsBackupPlans.Apply(getEcsBackupPlansResult =&gt; getEcsBackupPlansResult.Plans[0]?.VaultId),
        ///         },
        ///         TargetInstanceIds = new[]
        ///         {
        ///             defaultEcsBackupPlans.Apply(getEcsBackupPlansResult =&gt; getEcsBackupPlansResult.Plans[0]?.InstanceId),
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetRestoreJobsResult> Invoke(GetRestoreJobsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRestoreJobsResult>("alicloud:hbr/getRestoreJobs:getRestoreJobs", args ?? new GetRestoreJobsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRestoreJobsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("restoreIds")]
        private List<string>? _restoreIds;

        /// <summary>
        /// The list of restore job IDs.
        /// </summary>
        public List<string> RestoreIds
        {
            get => _restoreIds ?? (_restoreIds = new List<string>());
            set => _restoreIds = value;
        }

        /// <summary>
        /// The type of recovery destination. Valid Values: `ECS_FILE`, `OSS`, `NAS`.
        /// </summary>
        [Input("restoreType", required: true)]
        public string RestoreType { get; set; } = null!;

        [Input("sourceTypes")]
        private List<string>? _sourceTypes;

        /// <summary>
        /// The list of data source types. Valid values: `ECS_FILE`, `NAS`, `OSS`, `OTS_TABLE`,`UDM_ECS_ROLLBACK`.
        /// </summary>
        public List<string> SourceTypes
        {
            get => _sourceTypes ?? (_sourceTypes = new List<string>());
            set => _sourceTypes = value;
        }

        /// <summary>
        /// The status of restore job.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("targetBuckets")]
        private List<string>? _targetBuckets;

        /// <summary>
        /// The name of target ofo OSS bucket.
        /// </summary>
        public List<string> TargetBuckets
        {
            get => _targetBuckets ?? (_targetBuckets = new List<string>());
            set => _targetBuckets = value;
        }

        [Input("targetFileSystemIds")]
        private List<string>? _targetFileSystemIds;

        /// <summary>
        /// The ID of destination file system.
        /// </summary>
        public List<string> TargetFileSystemIds
        {
            get => _targetFileSystemIds ?? (_targetFileSystemIds = new List<string>());
            set => _targetFileSystemIds = value;
        }

        [Input("targetInstanceIds")]
        private List<string>? _targetInstanceIds;

        /// <summary>
        /// The ID of target ECS instance.
        /// </summary>
        public List<string> TargetInstanceIds
        {
            get => _targetInstanceIds ?? (_targetInstanceIds = new List<string>());
            set => _targetInstanceIds = value;
        }

        [Input("vaultIds")]
        private List<string>? _vaultIds;

        /// <summary>
        /// The ID of backup vault.
        /// </summary>
        public List<string> VaultIds
        {
            get => _vaultIds ?? (_vaultIds = new List<string>());
            set => _vaultIds = value;
        }

        public GetRestoreJobsArgs()
        {
        }
        public static new GetRestoreJobsArgs Empty => new GetRestoreJobsArgs();
    }

    public sealed class GetRestoreJobsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("restoreIds")]
        private InputList<string>? _restoreIds;

        /// <summary>
        /// The list of restore job IDs.
        /// </summary>
        public InputList<string> RestoreIds
        {
            get => _restoreIds ?? (_restoreIds = new InputList<string>());
            set => _restoreIds = value;
        }

        /// <summary>
        /// The type of recovery destination. Valid Values: `ECS_FILE`, `OSS`, `NAS`.
        /// </summary>
        [Input("restoreType", required: true)]
        public Input<string> RestoreType { get; set; } = null!;

        [Input("sourceTypes")]
        private InputList<string>? _sourceTypes;

        /// <summary>
        /// The list of data source types. Valid values: `ECS_FILE`, `NAS`, `OSS`, `OTS_TABLE`,`UDM_ECS_ROLLBACK`.
        /// </summary>
        public InputList<string> SourceTypes
        {
            get => _sourceTypes ?? (_sourceTypes = new InputList<string>());
            set => _sourceTypes = value;
        }

        /// <summary>
        /// The status of restore job.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("targetBuckets")]
        private InputList<string>? _targetBuckets;

        /// <summary>
        /// The name of target ofo OSS bucket.
        /// </summary>
        public InputList<string> TargetBuckets
        {
            get => _targetBuckets ?? (_targetBuckets = new InputList<string>());
            set => _targetBuckets = value;
        }

        [Input("targetFileSystemIds")]
        private InputList<string>? _targetFileSystemIds;

        /// <summary>
        /// The ID of destination file system.
        /// </summary>
        public InputList<string> TargetFileSystemIds
        {
            get => _targetFileSystemIds ?? (_targetFileSystemIds = new InputList<string>());
            set => _targetFileSystemIds = value;
        }

        [Input("targetInstanceIds")]
        private InputList<string>? _targetInstanceIds;

        /// <summary>
        /// The ID of target ECS instance.
        /// </summary>
        public InputList<string> TargetInstanceIds
        {
            get => _targetInstanceIds ?? (_targetInstanceIds = new InputList<string>());
            set => _targetInstanceIds = value;
        }

        [Input("vaultIds")]
        private InputList<string>? _vaultIds;

        /// <summary>
        /// The ID of backup vault.
        /// </summary>
        public InputList<string> VaultIds
        {
            get => _vaultIds ?? (_vaultIds = new InputList<string>());
            set => _vaultIds = value;
        }

        public GetRestoreJobsInvokeArgs()
        {
        }
        public static new GetRestoreJobsInvokeArgs Empty => new GetRestoreJobsInvokeArgs();
    }


    [OutputType]
    public sealed class GetRestoreJobsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableArray<Outputs.GetRestoreJobsJobResult> Jobs;
        public readonly string? OutputFile;
        public readonly ImmutableArray<string> RestoreIds;
        public readonly string RestoreType;
        public readonly ImmutableArray<string> SourceTypes;
        public readonly string? Status;
        public readonly ImmutableArray<string> TargetBuckets;
        public readonly ImmutableArray<string> TargetFileSystemIds;
        public readonly ImmutableArray<string> TargetInstanceIds;
        public readonly ImmutableArray<string> VaultIds;

        [OutputConstructor]
        private GetRestoreJobsResult(
            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetRestoreJobsJobResult> jobs,

            string? outputFile,

            ImmutableArray<string> restoreIds,

            string restoreType,

            ImmutableArray<string> sourceTypes,

            string? status,

            ImmutableArray<string> targetBuckets,

            ImmutableArray<string> targetFileSystemIds,

            ImmutableArray<string> targetInstanceIds,

            ImmutableArray<string> vaultIds)
        {
            Id = id;
            Ids = ids;
            Jobs = jobs;
            OutputFile = outputFile;
            RestoreIds = restoreIds;
            RestoreType = restoreType;
            SourceTypes = sourceTypes;
            Status = status;
            TargetBuckets = targetBuckets;
            TargetFileSystemIds = targetFileSystemIds;
            TargetInstanceIds = targetInstanceIds;
            VaultIds = vaultIds;
        }
    }
}
