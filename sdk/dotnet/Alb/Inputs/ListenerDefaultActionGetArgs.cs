// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class ListenerDefaultActionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The configurations of the actions. This parameter is required if Type is set to FowardGroup.
        /// </summary>
        [Input("forwardGroupConfig", required: true)]
        public Input<Inputs.ListenerDefaultActionForwardGroupConfigGetArgs> ForwardGroupConfig { get; set; } = null!;

        /// <summary>
        /// Action Type.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ListenerDefaultActionGetArgs()
        {
        }
        public static new ListenerDefaultActionGetArgs Empty => new ListenerDefaultActionGetArgs();
    }
}
