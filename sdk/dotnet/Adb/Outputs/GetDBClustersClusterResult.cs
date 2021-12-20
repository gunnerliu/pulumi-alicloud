// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Adb.Outputs
{

    [OutputType]
    public sealed class GetDBClustersClusterResult
    {
        /// <summary>
        /// Auto-renewal period of an cluster, in the unit of the month.
        /// </summary>
        public readonly int AutoRenewPeriod;
        /// <summary>
        /// The payment type of the resource.
        /// </summary>
        public readonly string ChargeType;
        /// <summary>
        /// The name of the service.
        /// </summary>
        public readonly string CommodityCode;
        /// <summary>
        /// The specifications of computing resources in elastic mode. The increase of resources can speed up queries. AnalyticDB for MySQL automatically scales computing resources. For more information, see [Specifications](https://www.alibabacloud.com/help/en/doc-detail/144851.htm).
        /// </summary>
        public readonly string ComputeResource;
        /// <summary>
        /// The endpoint of the cluster.
        /// </summary>
        public readonly string ConnectionString;
        /// <summary>
        /// The CreateTime of the ADB cluster.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The db cluster category.
        /// </summary>
        public readonly string DbClusterCategory;
        /// <summary>
        /// The db cluster id.
        /// </summary>
        public readonly string DbClusterId;
        /// <summary>
        /// The db cluster network type.
        /// </summary>
        public readonly string DbClusterNetworkType;
        /// <summary>
        /// The db cluster type.
        /// </summary>
        public readonly string DbClusterType;
        /// <summary>
        /// The db cluster version.
        /// </summary>
        public readonly string DbClusterVersion;
        /// <summary>
        /// The db node class.
        /// </summary>
        public readonly string DbNodeClass;
        /// <summary>
        /// The db node count.
        /// </summary>
        public readonly int DbNodeCount;
        /// <summary>
        /// The db node storage.
        /// </summary>
        public readonly int DbNodeStorage;
        /// <summary>
        /// The description of DBCluster.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The type of the disk.
        /// </summary>
        public readonly string DiskType;
        /// <summary>
        /// The ID of the data synchronization task in Data Transmission Service (DTS). This parameter is valid only for analytic instances.
        /// </summary>
        public readonly string DtsJobId;
        /// <summary>
        /// The elastic io resource.
        /// </summary>
        public readonly int ElasticIoResource;
        /// <summary>
        /// The engine of the database.
        /// </summary>
        public readonly string Engine;
        /// <summary>
        /// The engine version of the database..
        /// </summary>
        public readonly string EngineVersion;
        /// <summary>
        /// The number of nodes. The node resources are used for data computing in elastic mode.
        /// </summary>
        public readonly string ExecutorCount;
        /// <summary>
        /// The time when the cluster expires.
        /// </summary>
        public readonly string ExpireTime;
        /// <summary>
        /// Indicates whether the cluster has expired.
        /// </summary>
        public readonly string Expired;
        /// <summary>
        /// The ID of the DBCluster.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The lock mode of the cluster.
        /// </summary>
        public readonly string LockMode;
        /// <summary>
        /// The reason why the cluster is locked.
        /// </summary>
        public readonly string LockReason;
        /// <summary>
        /// The maintenance window of the cluster.
        /// </summary>
        public readonly string MaintainTime;
        /// <summary>
        /// The lock mode of the cluster.
        /// </summary>
        public readonly string Mode;
        public readonly string NetworkType;
        /// <summary>
        /// The payment type of the resource.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// The port that is used to access the cluster.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// The ID of the ApsaraDB RDS instance from which data is synchronized to the cluster. This parameter is valid only for analytic instances.
        /// </summary>
        public readonly string RdsInstanceId;
        public readonly string RegionId;
        /// <summary>
        /// The status of renewal.
        /// </summary>
        public readonly string RenewalStatus;
        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// List of IP addresses allowed to access all databases of an cluster.
        /// </summary>
        public readonly ImmutableArray<string> SecurityIps;
        /// <summary>
        /// The status of the resource.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The specifications of storage resources in elastic mode. The resources are used for data read and write operations. The increase of resources can improve the read and write performance of your cluster. For more information, see [Specifications](https://www.alibabacloud.com/help/en/doc-detail/144851.htm).
        /// </summary>
        public readonly string StorageResource;
        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, object> Tags;
        /// <summary>
        /// The vpc cloud instance id.
        /// </summary>
        public readonly string VpcCloudInstanceId;
        /// <summary>
        /// The vpc id.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// The vswitch id.
        /// </summary>
        public readonly string VswitchId;
        /// <summary>
        /// The zone ID  of the resource.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetDBClustersClusterResult(
            int autoRenewPeriod,

            string chargeType,

            string commodityCode,

            string computeResource,

            string connectionString,

            string createTime,

            string dbClusterCategory,

            string dbClusterId,

            string dbClusterNetworkType,

            string dbClusterType,

            string dbClusterVersion,

            string dbNodeClass,

            int dbNodeCount,

            int dbNodeStorage,

            string description,

            string diskType,

            string dtsJobId,

            int elasticIoResource,

            string engine,

            string engineVersion,

            string executorCount,

            string expireTime,

            string expired,

            string id,

            string lockMode,

            string lockReason,

            string maintainTime,

            string mode,

            string networkType,

            string paymentType,

            int port,

            string rdsInstanceId,

            string regionId,

            string renewalStatus,

            string resourceGroupId,

            ImmutableArray<string> securityIps,

            string status,

            string storageResource,

            ImmutableDictionary<string, object> tags,

            string vpcCloudInstanceId,

            string vpcId,

            string vswitchId,

            string zoneId)
        {
            AutoRenewPeriod = autoRenewPeriod;
            ChargeType = chargeType;
            CommodityCode = commodityCode;
            ComputeResource = computeResource;
            ConnectionString = connectionString;
            CreateTime = createTime;
            DbClusterCategory = dbClusterCategory;
            DbClusterId = dbClusterId;
            DbClusterNetworkType = dbClusterNetworkType;
            DbClusterType = dbClusterType;
            DbClusterVersion = dbClusterVersion;
            DbNodeClass = dbNodeClass;
            DbNodeCount = dbNodeCount;
            DbNodeStorage = dbNodeStorage;
            Description = description;
            DiskType = diskType;
            DtsJobId = dtsJobId;
            ElasticIoResource = elasticIoResource;
            Engine = engine;
            EngineVersion = engineVersion;
            ExecutorCount = executorCount;
            ExpireTime = expireTime;
            Expired = expired;
            Id = id;
            LockMode = lockMode;
            LockReason = lockReason;
            MaintainTime = maintainTime;
            Mode = mode;
            NetworkType = networkType;
            PaymentType = paymentType;
            Port = port;
            RdsInstanceId = rdsInstanceId;
            RegionId = regionId;
            RenewalStatus = renewalStatus;
            ResourceGroupId = resourceGroupId;
            SecurityIps = securityIps;
            Status = status;
            StorageResource = storageResource;
            Tags = tags;
            VpcCloudInstanceId = vpcCloudInstanceId;
            VpcId = vpcId;
            VswitchId = vswitchId;
            ZoneId = zoneId;
        }
    }
}
