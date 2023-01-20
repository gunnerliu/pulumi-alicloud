// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs.Inputs
{

    public sealed class EcsLaunchTemplateNetworkInterfacesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of instance launch template version 1. It can be [2, 256] characters in length. It cannot start with "http://" or "https://". The default value is null.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// It has been deprecated from version 1.120.0, and use field `launch_template_name` instead.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The primary private IP address of the ENI.
        /// </summary>
        [Input("primaryIp")]
        public Input<string>? PrimaryIp { get; set; }

        /// <summary>
        /// The security group ID.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// When creating a VPC-Connected instance, you must specify its VSwitch ID.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public EcsLaunchTemplateNetworkInterfacesArgs()
        {
        }
        public static new EcsLaunchTemplateNetworkInterfacesArgs Empty => new EcsLaunchTemplateNetworkInterfacesArgs();
    }
}
