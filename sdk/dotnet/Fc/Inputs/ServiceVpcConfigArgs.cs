// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Inputs
{

    public sealed class ServiceVpcConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A security group ID associated with the FC service.
        /// </summary>
        [Input("securityGroupId", required: true)]
        public Input<string> SecurityGroupId { get; set; } = null!;

        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        [Input("vswitchIds", required: true)]
        private InputList<string>? _vswitchIds;

        /// <summary>
        /// A list of vswitch IDs associated with the FC service.
        /// </summary>
        public InputList<string> VswitchIds
        {
            get => _vswitchIds ?? (_vswitchIds = new InputList<string>());
            set => _vswitchIds = value;
        }

        public ServiceVpcConfigArgs()
        {
        }
    }
}
