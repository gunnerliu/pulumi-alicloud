// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Inputs
{

    public sealed class NodePoolLabelGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The label key.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// The label value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public NodePoolLabelGetArgs()
        {
        }
    }
}
