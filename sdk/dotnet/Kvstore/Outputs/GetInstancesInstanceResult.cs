// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.KVStore.Outputs
{

    [OutputType]
    public sealed class GetInstancesInstanceResult
    {
        /// <summary>
        /// Availability zone.
        /// </summary>
        public readonly string AvailabilityZone;
        /// <summary>
        /// Instance bandwidth limit. Unit: Mbit/s.
        /// </summary>
        public readonly int Bandwidth;
        /// <summary>
        /// Capacity of the applied ApsaraDB for Redis instance. Unit: MB.
        /// </summary>
        public readonly int Capacity;
        /// <summary>
        /// Billing method. Value options: `PostPaid` for  Pay-As-You-Go and `PrePaid` for subscription.
        /// </summary>
        public readonly string ChargeType;
        public readonly string ConnectionDomain;
        /// <summary>
        /// Instance connection quantity limit. Unit: count.
        /// </summary>
        public readonly int Connections;
        /// <summary>
        /// Creation time of the instance.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// Expiration time. Pay-As-You-Go instances are never expire.
        /// </summary>
        public readonly string ExpireTime;
        /// <summary>
        /// The ID of the RKV instance.
        /// </summary>
        public readonly string Id;
        public readonly string InstanceClass;
        /// <summary>
        /// Database type. Options are `Memcache`, and `Redis`. If no value is specified, all types are returned.
        /// </summary>
        public readonly string InstanceType;
        /// <summary>
        /// The name of the RKV instance.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Connection port of the instance.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// Private IP address of the instance.
        /// </summary>
        public readonly string PrivateIp;
        /// <summary>
        /// Region ID the instance belongs to.
        /// </summary>
        public readonly string RegionId;
        /// <summary>
        /// Status of the instance.
        /// * `instance_class`- (Optional) Type of the applied ApsaraDB for Redis instance.
        /// For more information, see [Instance type table](https://www.alibabacloud.com/help/doc-detail/61135.htm).
        /// </summary>
        public readonly string Status;
        public readonly string UserName;
        /// <summary>
        /// Used to retrieve instances belong to specified VPC.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// Used to retrieve instances belong to specified `vswitch` resources.
        /// </summary>
        public readonly string VswitchId;

        [OutputConstructor]
        private GetInstancesInstanceResult(
            string availabilityZone,

            int bandwidth,

            int capacity,

            string chargeType,

            string connectionDomain,

            int connections,

            string createTime,

            string expireTime,

            string id,

            string instanceClass,

            string instanceType,

            string name,

            int port,

            string privateIp,

            string regionId,

            string status,

            string userName,

            string vpcId,

            string vswitchId)
        {
            AvailabilityZone = availabilityZone;
            Bandwidth = bandwidth;
            Capacity = capacity;
            ChargeType = chargeType;
            ConnectionDomain = connectionDomain;
            Connections = connections;
            CreateTime = createTime;
            ExpireTime = expireTime;
            Id = id;
            InstanceClass = instanceClass;
            InstanceType = instanceType;
            Name = name;
            Port = port;
            PrivateIp = privateIp;
            RegionId = regionId;
            Status = status;
            UserName = userName;
            VpcId = vpcId;
            VswitchId = vswitchId;
        }
    }
}
