// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb.Inputs
{

    public sealed class BackendServerBackendServerGetArgs : Pulumi.ResourceArgs
    {
        [Input("serverId", required: true)]
        public Input<string> ServerId { get; set; } = null!;

        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("weight", required: true)]
        public Input<int> Weight { get; set; } = null!;

        public BackendServerBackendServerGetArgs()
        {
        }
    }
}
