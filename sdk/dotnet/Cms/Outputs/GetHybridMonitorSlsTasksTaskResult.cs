// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Outputs
{

    [OutputType]
    public sealed class GetHybridMonitorSlsTasksTaskResult
    {
        /// <summary>
        /// The tags of the metric import task.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHybridMonitorSlsTasksTaskAttachLabelResult> AttachLabels;
        /// <summary>
        /// The interval between the cloud monitoring plug-in collecting host monitoring data.
        /// </summary>
        public readonly int CollectInterval;
        /// <summary>
        /// The address where the cloudmonitor Plug-In collects the monitoring data of the host.
        /// </summary>
        public readonly string CollectTargetEndpoint;
        /// <summary>
        /// When the cloud monitor Agent collects, the relative path of the collection.
        /// </summary>
        public readonly string CollectTargetPath;
        /// <summary>
        /// The type of the monitoring data. Valid values: Spring, Tomcat, Nginx, Tengine, JVM, Redis, MySQL, and AWS.
        /// </summary>
        public readonly string CollectTargetType;
        /// <summary>
        /// The timeout period for the cloudmonitor plug-in to collect host monitoring data.
        /// </summary>
        public readonly int CollectTimout;
        /// <summary>
        /// Create the timestamp of the monitoring task. Unit: milliseconds.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// Monitoring task description.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Additional information for the instance.
        /// </summary>
        public readonly string ExtraInfo;
        /// <summary>
        /// The ID of the application Group.
        /// </summary>
        public readonly string GroupId;
        /// <summary>
        /// The ID of the monitoring task.
        /// </summary>
        public readonly string HybridMonitorSlsTaskId;
        /// <summary>
        /// The ID of the Hybrid Monitor Sls Task.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of instances where monitoring data is collected in batches.
        /// </summary>
        public readonly ImmutableArray<string> Instances;
        /// <summary>
        /// The path where on-premises log data is stored. On-premises log data is stored in the specified path of the host where CloudMonitor is deployed.
        /// </summary>
        public readonly string LogFilePath;
        /// <summary>
        /// Local Log Monitoring and calculation method.
        /// </summary>
        public readonly string LogProcess;
        /// <summary>
        /// The sample on-premises log.
        /// </summary>
        public readonly string LogSample;
        /// <summary>
        /// The local log data is divided according to different matching patterns.
        /// </summary>
        public readonly string LogSplit;
        /// <summary>
        /// The filter condition of the instance of the monitoring task.
        /// </summary>
        public readonly string MatchExpressRelation;
        /// <summary>
        /// The matching condition of the instance in the application Group.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHybridMonitorSlsTasksTaskMatchExpressResult> MatchExpresses;
        /// <summary>
        /// The namespace to which the host belongs.
        /// </summary>
        public readonly string Namespace;
        /// <summary>
        /// The network type of the host.
        /// </summary>
        public readonly string NetworkType;
        /// <summary>
        /// The configurations of the logs that are imported from Log Service.
        /// </summary>
        public readonly string SlsProcess;
        /// <summary>
        /// The configurations of the logs that are imported from Log Service.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHybridMonitorSlsTasksTaskSlsProcessConfigResult> SlsProcessConfigs;
        /// <summary>
        /// The name of the metric import task.
        /// </summary>
        public readonly string TaskName;
        /// <summary>
        /// Monitoring Task type.
        /// </summary>
        public readonly string TaskType;
        /// <summary>
        /// The region where the host resides.
        /// </summary>
        public readonly string UploadRegion;
        public readonly string YarmConfig;

        [OutputConstructor]
        private GetHybridMonitorSlsTasksTaskResult(
            ImmutableArray<Outputs.GetHybridMonitorSlsTasksTaskAttachLabelResult> attachLabels,

            int collectInterval,

            string collectTargetEndpoint,

            string collectTargetPath,

            string collectTargetType,

            int collectTimout,

            string createTime,

            string description,

            string extraInfo,

            string groupId,

            string hybridMonitorSlsTaskId,

            string id,

            ImmutableArray<string> instances,

            string logFilePath,

            string logProcess,

            string logSample,

            string logSplit,

            string matchExpressRelation,

            ImmutableArray<Outputs.GetHybridMonitorSlsTasksTaskMatchExpressResult> matchExpresses,

            string @namespace,

            string networkType,

            string slsProcess,

            ImmutableArray<Outputs.GetHybridMonitorSlsTasksTaskSlsProcessConfigResult> slsProcessConfigs,

            string taskName,

            string taskType,

            string uploadRegion,

            string yarmConfig)
        {
            AttachLabels = attachLabels;
            CollectInterval = collectInterval;
            CollectTargetEndpoint = collectTargetEndpoint;
            CollectTargetPath = collectTargetPath;
            CollectTargetType = collectTargetType;
            CollectTimout = collectTimout;
            CreateTime = createTime;
            Description = description;
            ExtraInfo = extraInfo;
            GroupId = groupId;
            HybridMonitorSlsTaskId = hybridMonitorSlsTaskId;
            Id = id;
            Instances = instances;
            LogFilePath = logFilePath;
            LogProcess = logProcess;
            LogSample = logSample;
            LogSplit = logSplit;
            MatchExpressRelation = matchExpressRelation;
            MatchExpresses = matchExpresses;
            Namespace = @namespace;
            NetworkType = networkType;
            SlsProcess = slsProcess;
            SlsProcessConfigs = slsProcessConfigs;
            TaskName = taskName;
            TaskType = taskType;
            UploadRegion = uploadRegion;
            YarmConfig = yarmConfig;
        }
    }
}
