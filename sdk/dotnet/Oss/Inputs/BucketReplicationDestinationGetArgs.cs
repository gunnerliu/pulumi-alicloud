// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Inputs
{

    public sealed class BucketReplicationDestinationGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The destination bucket to which the data is replicated.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The link used to transfer data in data replication.. Can be `internal` or `oss_acc`. Defaults to `internal`.
        /// </summary>
        [Input("transferType")]
        public Input<string>? TransferType { get; set; }

        public BucketReplicationDestinationGetArgs()
        {
        }
    }
}
