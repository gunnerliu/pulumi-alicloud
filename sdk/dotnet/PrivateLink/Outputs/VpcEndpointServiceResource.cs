// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PrivateLink.Outputs
{

    [OutputType]
    public sealed class VpcEndpointServiceResource
    {
        /// <summary>
        /// The id of service resources added to the endpoint service.
        /// </summary>
        public readonly string? ResourceId;
        /// <summary>
        /// The type of service resource added to the endpoint service.
        /// </summary>
        public readonly string? ResourceType;

        [OutputConstructor]
        private VpcEndpointServiceResource(
            string? resourceId,

            string? resourceType)
        {
            ResourceId = resourceId;
            ResourceType = resourceType;
        }
    }
}
