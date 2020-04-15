// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PolarDB.Outputs
{

    [OutputType]
    public sealed class GetClustersClusterResult
    {
        /// <summary>
        /// Billing method. Value options: `PostPaid` for Pay-As-You-Go and `PrePaid` for subscription.
        /// </summary>
        public readonly string ChargeType;
        /// <summary>
        /// The create_time of the db_nodes.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The db_node_class of the db_nodes.
        /// </summary>
        public readonly string DbNodeClass;
        /// <summary>
        /// The DBNodeNumber of the PolarDB cluster.
        /// </summary>
        public readonly int DbNodeNumber;
        /// <summary>
        /// The DBNodes of the PolarDB cluster.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClustersClusterDbNodeResult> DbNodes;
        /// <summary>
        /// Database type. Options are `MySQL`, `Oracle` and `PostgreSQL`. If no value is specified, all types are returned.
        /// </summary>
        public readonly string DbType;
        /// <summary>
        /// The DBVersion of the PolarDB cluster.
        /// </summary>
        public readonly string DbVersion;
        /// <summary>
        /// The DeleteLock of the PolarDB cluster.
        /// </summary>
        public readonly int DeleteLock;
        /// <summary>
        /// The description of the PolarDB cluster.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Database type. Options are `MySQL`, `Oracle` and `PostgreSQL`. If no value is specified, all types are returned.
        /// </summary>
        public readonly string Engine;
        /// <summary>
        /// Expiration time. Pay-As-You-Go clusters never expire.
        /// </summary>
        public readonly string ExpireTime;
        /// <summary>
        /// The expired of the PolarDB cluster.
        /// </summary>
        public readonly string Expired;
        /// <summary>
        /// The ID of the PolarDB cluster.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The LockMode of the PolarDB cluster.
        /// </summary>
        public readonly string LockMode;
        /// <summary>
        /// The DBClusterNetworkType of the PolarDB cluster.
        /// </summary>
        public readonly string NetworkType;
        /// <summary>
        /// The region_id of the db_nodes.
        /// </summary>
        public readonly string RegionId;
        /// <summary>
        /// status of the cluster.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The StorageUsed of the PolarDB cluster.
        /// </summary>
        public readonly int StorageUsed;
        /// <summary>
        /// ID of the VPC the cluster belongs to.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// The zone_id of the db_nodes.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetClustersClusterResult(
            string chargeType,

            string createTime,

            string dbNodeClass,

            int dbNodeNumber,

            ImmutableArray<Outputs.GetClustersClusterDbNodeResult> dbNodes,

            string dbType,

            string dbVersion,

            int deleteLock,

            string description,

            string engine,

            string expireTime,

            string expired,

            string id,

            string lockMode,

            string networkType,

            string regionId,

            string status,

            int storageUsed,

            string vpcId,

            string zoneId)
        {
            ChargeType = chargeType;
            CreateTime = createTime;
            DbNodeClass = dbNodeClass;
            DbNodeNumber = dbNodeNumber;
            DbNodes = dbNodes;
            DbType = dbType;
            DbVersion = dbVersion;
            DeleteLock = deleteLock;
            Description = description;
            Engine = engine;
            ExpireTime = expireTime;
            Expired = expired;
            Id = id;
            LockMode = lockMode;
            NetworkType = networkType;
            RegionId = regionId;
            Status = status;
            StorageUsed = storageUsed;
            VpcId = vpcId;
            ZoneId = zoneId;
        }
    }
}
