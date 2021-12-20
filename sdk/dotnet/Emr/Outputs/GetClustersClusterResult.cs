// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emr.Outputs
{

    [OutputType]
    public sealed class GetClustersClusterResult
    {
        /// <summary>
        /// Cluster connection information.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClustersClusterAccessInfoResult> AccessInfos;
        /// <summary>
        /// Whether flexible expansion is allowed.
        /// </summary>
        public readonly bool AutoScalingAllowed;
        /// <summary>
        /// Whether to allow expansion by load.
        /// </summary>
        public readonly bool AutoScalingByLoadAllowed;
        /// <summary>
        /// Whether to enable elastic expansion.
        /// </summary>
        public readonly bool AutoScalingEnable;
        /// <summary>
        /// Whether to allow the use of elastic scaling bidding instances.
        /// </summary>
        public readonly bool AutoScalingSpotWithLimitAllowed;
        /// <summary>
        /// List of boot actions.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClustersClusterBootstrapActionListResult> BootstrapActionLists;
        /// <summary>
        /// The result of the boot operation.
        /// </summary>
        public readonly bool BootstrapFailed;
        /// <summary>
        /// The ID of the associated cluster.
        /// </summary>
        public readonly string ClusterId;
        /// <summary>
        /// The name of the associated cluster.
        /// </summary>
        public readonly string ClusterName;
        /// <summary>
        /// Cluster tag, no need to pay attention.
        /// </summary>
        public readonly string CreateResource;
        /// <summary>
        /// Creation time.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// How to create a cluster.
        /// </summary>
        public readonly string CreateType;
        /// <summary>
        /// The hosting type of the cluster.
        /// </summary>
        public readonly string DepositType;
        /// <summary>
        /// High security cluster.
        /// </summary>
        public readonly bool EasEnable;
        /// <summary>
        /// Timeout time.
        /// </summary>
        public readonly string ExpiredTime;
        /// <summary>
        /// Additional information for Stack.
        /// </summary>
        public readonly string ExtraInfo;
        public readonly bool HasUncompletedOrder;
        /// <summary>
        /// High availability cluster.
        /// </summary>
        public readonly bool HighAvailabilityEnable;
        /// <summary>
        /// List of cluster machine groups.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClustersClusterHostGroupListResult> HostGroupLists;
        /// <summary>
        /// Machine pool information.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClustersClusterHostPoolInfoResult> HostPoolInfos;
        public readonly string Id;
        /// <summary>
        /// The ID of the image used to create the cluster.
        /// </summary>
        public readonly string ImageId;
        /// <summary>
        /// Whether to use Hive local Metabase.
        /// </summary>
        public readonly bool LocalMetaDb;
        /// <summary>
        /// The host type of the cluster. The default is ECS.
        /// </summary>
        public readonly string MachineType;
        /// <summary>
        /// Metadata type:
        /// </summary>
        public readonly string MetaStoreType;
        /// <summary>
        /// Cluster network type.
        /// </summary>
        public readonly string NetType;
        /// <summary>
        /// The payment type of the resource.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// The package year and month time of the machine group. The Valid Values : `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`.
        /// </summary>
        public readonly int Period;
        /// <summary>
        /// The information of the primary cluster associated with the Gateway.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClustersClusterRelateClusterInfoResult> RelateClusterInfos;
        /// <summary>
        /// Whether to allow disk expansion:
        /// </summary>
        public readonly bool ResizeDiskEnable;
        /// <summary>
        /// The time (in seconds) that has been running.
        /// </summary>
        public readonly int RunningTime;
        /// <summary>
        /// The ID of the security group.
        /// </summary>
        public readonly string SecurityGroupId;
        /// <summary>
        /// The name of the security group.
        /// </summary>
        public readonly string SecurityGroupName;
        /// <summary>
        /// Service list.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClustersClusterSoftwareInfoResult> SoftwareInfos;
        /// <summary>
        /// Cluster startup time.
        /// </summary>
        public readonly string StartTime;
        /// <summary>
        /// The cluster status.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Cluster stop time.
        /// </summary>
        public readonly string StopTime;
        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, object> Tags;
        /// <summary>
        /// Disk type.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The EMR permission name used.
        /// </summary>
        public readonly string UserDefinedEmrEcsRole;
        /// <summary>
        /// The user ID.
        /// </summary>
        public readonly string UserId;
        /// <summary>
        /// The VPC ID.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// The vswitch id.
        /// </summary>
        public readonly string VswitchId;
        /// <summary>
        /// The zone ID.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetClustersClusterResult(
            ImmutableArray<Outputs.GetClustersClusterAccessInfoResult> accessInfos,

            bool autoScalingAllowed,

            bool autoScalingByLoadAllowed,

            bool autoScalingEnable,

            bool autoScalingSpotWithLimitAllowed,

            ImmutableArray<Outputs.GetClustersClusterBootstrapActionListResult> bootstrapActionLists,

            bool bootstrapFailed,

            string clusterId,

            string clusterName,

            string createResource,

            string createTime,

            string createType,

            string depositType,

            bool easEnable,

            string expiredTime,

            string extraInfo,

            bool hasUncompletedOrder,

            bool highAvailabilityEnable,

            ImmutableArray<Outputs.GetClustersClusterHostGroupListResult> hostGroupLists,

            ImmutableArray<Outputs.GetClustersClusterHostPoolInfoResult> hostPoolInfos,

            string id,

            string imageId,

            bool localMetaDb,

            string machineType,

            string metaStoreType,

            string netType,

            string paymentType,

            int period,

            ImmutableArray<Outputs.GetClustersClusterRelateClusterInfoResult> relateClusterInfos,

            bool resizeDiskEnable,

            int runningTime,

            string securityGroupId,

            string securityGroupName,

            ImmutableArray<Outputs.GetClustersClusterSoftwareInfoResult> softwareInfos,

            string startTime,

            string status,

            string stopTime,

            ImmutableDictionary<string, object> tags,

            string type,

            string userDefinedEmrEcsRole,

            string userId,

            string vpcId,

            string vswitchId,

            string zoneId)
        {
            AccessInfos = accessInfos;
            AutoScalingAllowed = autoScalingAllowed;
            AutoScalingByLoadAllowed = autoScalingByLoadAllowed;
            AutoScalingEnable = autoScalingEnable;
            AutoScalingSpotWithLimitAllowed = autoScalingSpotWithLimitAllowed;
            BootstrapActionLists = bootstrapActionLists;
            BootstrapFailed = bootstrapFailed;
            ClusterId = clusterId;
            ClusterName = clusterName;
            CreateResource = createResource;
            CreateTime = createTime;
            CreateType = createType;
            DepositType = depositType;
            EasEnable = easEnable;
            ExpiredTime = expiredTime;
            ExtraInfo = extraInfo;
            HasUncompletedOrder = hasUncompletedOrder;
            HighAvailabilityEnable = highAvailabilityEnable;
            HostGroupLists = hostGroupLists;
            HostPoolInfos = hostPoolInfos;
            Id = id;
            ImageId = imageId;
            LocalMetaDb = localMetaDb;
            MachineType = machineType;
            MetaStoreType = metaStoreType;
            NetType = netType;
            PaymentType = paymentType;
            Period = period;
            RelateClusterInfos = relateClusterInfos;
            ResizeDiskEnable = resizeDiskEnable;
            RunningTime = runningTime;
            SecurityGroupId = securityGroupId;
            SecurityGroupName = securityGroupName;
            SoftwareInfos = softwareInfos;
            StartTime = startTime;
            Status = status;
            StopTime = stopTime;
            Tags = tags;
            Type = type;
            UserDefinedEmrEcsRole = userDefinedEmrEcsRole;
            UserId = userId;
            VpcId = vpcId;
            VswitchId = vswitchId;
            ZoneId = zoneId;
        }
    }
}
