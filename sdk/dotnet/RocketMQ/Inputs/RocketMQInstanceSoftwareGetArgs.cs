// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.RocketMQ.Inputs
{

    public sealed class RocketMQInstanceSoftwareGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Upgrade time period.
        /// </summary>
        [Input("maintainTime")]
        public Input<string>? MaintainTime { get; set; }

        /// <summary>
        /// Software version.
        /// </summary>
        [Input("softwareVersion")]
        public Input<string>? SoftwareVersion { get; set; }

        /// <summary>
        /// Upgrade method.
        /// </summary>
        [Input("upgradeMethod")]
        public Input<string>? UpgradeMethod { get; set; }

        public RocketMQInstanceSoftwareGetArgs()
        {
        }
        public static new RocketMQInstanceSoftwareGetArgs Empty => new RocketMQInstanceSoftwareGetArgs();
    }
}
