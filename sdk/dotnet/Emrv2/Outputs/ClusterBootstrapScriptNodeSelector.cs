// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emrv2.Outputs
{

    [OutputType]
    public sealed class ClusterBootstrapScriptNodeSelector
    {
        /// <summary>
        /// The configuration effected which node group id of emr cluster.
        /// </summary>
        public readonly string? NodeGroupId;
        /// <summary>
        /// The configuration effected which node group name of emr cluster.
        /// </summary>
        public readonly string? NodeGroupName;
        /// <summary>
        /// The bootstrap scripts execution target node group types.
        /// </summary>
        public readonly ImmutableArray<string> NodeGroupTypes;
        /// <summary>
        /// The bootstrap scripts execution target node names.
        /// </summary>
        public readonly ImmutableArray<string> NodeNames;
        /// <summary>
        /// The bootstrap scripts execution target node select type. Supported value: NODE, NODEGROUP or CLUSTER.
        /// </summary>
        public readonly string NodeSelectType;

        [OutputConstructor]
        private ClusterBootstrapScriptNodeSelector(
            string? nodeGroupId,

            string? nodeGroupName,

            ImmutableArray<string> nodeGroupTypes,

            ImmutableArray<string> nodeNames,

            string nodeSelectType)
        {
            NodeGroupId = nodeGroupId;
            NodeGroupName = nodeGroupName;
            NodeGroupTypes = nodeGroupTypes;
            NodeNames = nodeNames;
            NodeSelectType = nodeSelectType;
        }
    }
}