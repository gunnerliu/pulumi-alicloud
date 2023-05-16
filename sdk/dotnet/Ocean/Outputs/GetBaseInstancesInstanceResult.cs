// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ocean.Outputs
{

    [OutputType]
    public sealed class GetBaseInstancesInstanceResult
    {
        /// <summary>
        /// The product code of the OceanBase cluster.
        /// </summary>
        public readonly string CommodityCode;
        /// <summary>
        /// The number of CPU cores of the cluster.
        /// </summary>
        public readonly int Cpu;
        /// <summary>
        /// The creation time of the resource.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The size of the storage space, in GB.
        /// </summary>
        public readonly string DiskSize;
        /// <summary>
        /// The ID of the Instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Cluster specification information.
        /// </summary>
        public readonly string InstanceClass;
        /// <summary>
        /// OceanBase cluster ID.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// OceanBase cluster name.
        /// </summary>
        public readonly string InstanceName;
        /// <summary>
        /// The number of nodes in the cluster.
        /// </summary>
        public readonly string NodeNum;
        /// <summary>
        /// The payment method of the instance.
        /// </summary>
        public readonly string PaymentType;
        /// <summary>
        /// The ID of the enterprise resource group to which the instance resides.
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// Series of OceanBase clusters.
        /// </summary>
        public readonly string Series;
        /// <summary>
        /// The status of the resource.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Information about the zone where the cluster is deployed.
        /// </summary>
        public readonly ImmutableArray<string> Zones;

        [OutputConstructor]
        private GetBaseInstancesInstanceResult(
            string commodityCode,

            int cpu,

            string createTime,

            string diskSize,

            string id,

            string instanceClass,

            string instanceId,

            string instanceName,

            string nodeNum,

            string paymentType,

            string resourceGroupId,

            string series,

            string status,

            ImmutableArray<string> zones)
        {
            CommodityCode = commodityCode;
            Cpu = cpu;
            CreateTime = createTime;
            DiskSize = diskSize;
            Id = id;
            InstanceClass = instanceClass;
            InstanceId = instanceId;
            InstanceName = instanceName;
            NodeNum = nodeNum;
            PaymentType = paymentType;
            ResourceGroupId = resourceGroupId;
            Series = series;
            Status = status;
            Zones = zones;
        }
    }
}