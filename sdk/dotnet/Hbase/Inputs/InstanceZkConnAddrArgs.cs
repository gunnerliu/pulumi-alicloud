// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbase.Inputs
{

    public sealed class InstanceZkConnAddrArgs : Pulumi.ResourceArgs
    {
        [Input("connAddr")]
        public Input<string>? ConnAddr { get; set; }

        [Input("connAddrPort")]
        public Input<string>? ConnAddrPort { get; set; }

        [Input("netType")]
        public Input<string>? NetType { get; set; }

        public InstanceZkConnAddrArgs()
        {
        }
    }
}
