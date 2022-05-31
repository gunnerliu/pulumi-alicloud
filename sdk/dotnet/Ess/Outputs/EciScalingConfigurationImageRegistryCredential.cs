// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess.Outputs
{

    [OutputType]
    public sealed class EciScalingConfigurationImageRegistryCredential
    {
        /// <summary>
        /// The password used to log on to the image repository. It is required
        /// when `image_registry_credential` is configured.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// The address of the image repository. It is required when `image_registry_credential` is
        /// configured.
        /// </summary>
        public readonly string? Server;
        public readonly string? Username;

        [OutputConstructor]
        private EciScalingConfigurationImageRegistryCredential(
            string? password,

            string? server,

            string? username)
        {
            Password = password;
            Server = server;
            Username = username;
        }
    }
}
