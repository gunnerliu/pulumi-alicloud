// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci.Outputs
{

    [OutputType]
    public sealed class ContainerGroupImageRegistryCredential
    {
        /// <summary>
        /// The password used to log on to the image repository. It is required when `image_registry_credential` is configured.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// The address of the image repository. It is required when `image_registry_credential` is configured.
        /// </summary>
        public readonly string Server;
        /// <summary>
        /// The username used to log on to the image repository. It is required when `image_registry_credential` is configured.
        /// </summary>
        public readonly string UserName;

        [OutputConstructor]
        private ContainerGroupImageRegistryCredential(
            string password,

            string server,

            string userName)
        {
            Password = password;
            Server = server;
            UserName = userName;
        }
    }
}