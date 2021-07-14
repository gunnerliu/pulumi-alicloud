// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen.Outputs
{

    [OutputType]
    public sealed class TransitRouterVpcAttachmentZoneMapping
    {
        /// <summary>
        /// The VSwitch id of attachment.
        /// </summary>
        public readonly string? VswitchId;
        /// <summary>
        /// The zone Id of VSwitch.
        /// </summary>
        public readonly string? ZoneId;

        [OutputConstructor]
        private TransitRouterVpcAttachmentZoneMapping(
            string? vswitchId,

            string? zoneId)
        {
            VswitchId = vswitchId;
            ZoneId = zoneId;
        }
    }
}
