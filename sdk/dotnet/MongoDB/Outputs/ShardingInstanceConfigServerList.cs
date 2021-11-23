// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MongoDB.Outputs
{

    [OutputType]
    public sealed class ShardingInstanceConfigServerList
    {
        /// <summary>
        /// The connection address of the Config Server node.
        /// </summary>
        public readonly string? ConnectString;
        /// <summary>
        /// The max connections of the Config Server node.
        /// </summary>
        public readonly int? MaxConnections;
        /// <summary>
        /// The maximum IOPS of the Config Server node.
        /// </summary>
        public readonly int? MaxIops;
        /// <summary>
        /// -(Required) Node specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/57141.htm).
        /// </summary>
        public readonly string? NodeClass;
        /// <summary>
        /// The description of the Config Server node.
        /// </summary>
        public readonly string? NodeDescription;
        /// <summary>
        /// The ID of the Config Server node.
        /// </summary>
        public readonly string? NodeId;
        /// <summary>
        /// - Custom storage space; value range: [10, 1,000]
        /// - 10-GB increments. Unit: GB.
        /// </summary>
        public readonly int? NodeStorage;
        /// <summary>
        /// The connection port of the Config Server node.
        /// </summary>
        public readonly int? Port;

        [OutputConstructor]
        private ShardingInstanceConfigServerList(
            string? connectString,

            int? maxConnections,

            int? maxIops,

            string? nodeClass,

            string? nodeDescription,

            string? nodeId,

            int? nodeStorage,

            int? port)
        {
            ConnectString = connectString;
            MaxConnections = maxConnections;
            MaxIops = maxIops;
            NodeClass = nodeClass;
            NodeDescription = nodeDescription;
            NodeId = nodeId;
            NodeStorage = nodeStorage;
            Port = port;
        }
    }
}