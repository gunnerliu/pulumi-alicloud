// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emr.Inputs
{

    public sealed class ClusterModifyClusterServiceConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cluster service configuration modification comment, e.g. "Modify tez configuration".
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Cluster service configuration modification params, e.g. ’{"hdfs-site":{"dfs.replication":"3"}}’.
        /// </summary>
        [Input("configParams", required: true)]
        public Input<string> ConfigParams { get; set; } = null!;

        /// <summary>
        /// Cluster service configuration modification type.
        /// </summary>
        [Input("configType")]
        public Input<string>? ConfigType { get; set; }

        /// <summary>
        /// Cluster service configuration modification custom params, e.g. ’{"tez-site":{"key":{"Value":"value"}}}’.
        /// </summary>
        [Input("customConfigParams")]
        public Input<string>? CustomConfigParams { get; set; }

        [Input("gatewayClusterIdLists")]
        private InputList<string>? _gatewayClusterIdLists;

        /// <summary>
        /// Cluster service configuration modification related gateway cluster id list.
        /// </summary>
        public InputList<string> GatewayClusterIdLists
        {
            get => _gatewayClusterIdLists ?? (_gatewayClusterIdLists = new InputList<string>());
            set => _gatewayClusterIdLists = value;
        }

        /// <summary>
        /// Cluster service configuration modification node group id, e.g. ’G-XXX’.
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// Cluster service configuration modification host instance id, e.g. ’i-bp146tnrkq4tcxxxxx’.
        /// </summary>
        [Input("hostInstanceId")]
        public Input<string>? HostInstanceId { get; set; }

        /// <summary>
        /// Cluster service configuration modification refresh host config, ’true’ or ’false’.
        /// </summary>
        [Input("refreshHostConfig")]
        public Input<bool>? RefreshHostConfig { get; set; }

        /// <summary>
        /// Custom configuration service name, e.g. ’HDFS’.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public ClusterModifyClusterServiceConfigGetArgs()
        {
        }
        public static new ClusterModifyClusterServiceConfigGetArgs Empty => new ClusterModifyClusterServiceConfigGetArgs();
    }
}