// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Outputs
{

    [OutputType]
    public sealed class ApplicationService
    {
        /// <summary>
        /// ID of the service.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The application name. It should be 1-64 characters long, and can contain numbers, English letters and hyphens, but cannot start with hyphens.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The current status of service.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// The application deploying version. Each updating, it must be different with current. Default to "1.0"
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private ApplicationService(
            string? id,

            string? name,

            string? status,

            string? version)
        {
            Id = id;
            Name = name;
            Status = status;
            Version = version;
        }
    }
}
