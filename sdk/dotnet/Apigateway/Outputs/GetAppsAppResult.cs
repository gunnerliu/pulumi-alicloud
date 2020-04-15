// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ApiGateway.Outputs
{

    [OutputType]
    public sealed class GetAppsAppResult
    {
        /// <summary>
        /// App code.
        /// </summary>
        public readonly string AppCode;
        /// <summary>
        /// Creation time (Greenwich mean time).
        /// </summary>
        public readonly string CreatedTime;
        /// <summary>
        /// App description.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// App ID, which is generated by the system and globally unique.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// Last modification time (Greenwich mean time).
        /// </summary>
        public readonly string ModifiedTime;
        /// <summary>
        /// App name.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetAppsAppResult(
            string appCode,

            string createdTime,

            string description,

            int id,

            string modifiedTime,

            string name)
        {
            AppCode = appCode;
            CreatedTime = createdTime;
            Description = description;
            Id = id;
            ModifiedTime = modifiedTime;
            Name = name;
        }
    }
}
