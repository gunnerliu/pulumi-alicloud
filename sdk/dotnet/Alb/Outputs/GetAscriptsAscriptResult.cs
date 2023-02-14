// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Outputs
{

    [OutputType]
    public sealed class GetAscriptsAscriptResult
    {
        /// <summary>
        /// Script identification.
        /// </summary>
        public readonly string AscriptId;
        /// <summary>
        /// Script name.
        /// </summary>
        public readonly string AscriptName;
        /// <summary>
        /// Whether scripts are enabled.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Whether extension parameters are enabled.
        /// </summary>
        public readonly bool ExtAttributeEnabled;
        /// <summary>
        /// Extended attribute list.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAscriptsAscriptExtAttributeResult> ExtAttributes;
        public readonly string Id;
        /// <summary>
        /// Listener ID of script attribution
        /// </summary>
        public readonly string ListenerId;
        public readonly string LoadBalancerId;
        /// <summary>
        /// Script execution location.
        /// </summary>
        public readonly string Position;
        /// <summary>
        /// Script content.
        /// </summary>
        public readonly string ScriptContent;
        /// <summary>
        /// Script status.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetAscriptsAscriptResult(
            string ascriptId,

            string ascriptName,

            bool enabled,

            bool extAttributeEnabled,

            ImmutableArray<Outputs.GetAscriptsAscriptExtAttributeResult> extAttributes,

            string id,

            string listenerId,

            string loadBalancerId,

            string position,

            string scriptContent,

            string status)
        {
            AscriptId = ascriptId;
            AscriptName = ascriptName;
            Enabled = enabled;
            ExtAttributeEnabled = extAttributeEnabled;
            ExtAttributes = extAttributes;
            Id = id;
            ListenerId = listenerId;
            LoadBalancerId = loadBalancerId;
            Position = position;
            ScriptContent = scriptContent;
            Status = status;
        }
    }
}