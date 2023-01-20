// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Inputs
{

    public sealed class BucketReplicationProgressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The percentage of the replicated historical data. This element is valid only when historical_object_replication is set to enabled.
        /// </summary>
        [Input("historicalObject")]
        public Input<string>? HistoricalObject { get; set; }

        /// <summary>
        /// The time used to distinguish new data from historical data. Data that is written to the source bucket before the time is replicated to the destination bucket as new data. The value of this element is in GMT.
        /// </summary>
        [Input("newObject")]
        public Input<string>? NewObject { get; set; }

        public BucketReplicationProgressArgs()
        {
        }
        public static new BucketReplicationProgressArgs Empty => new BucketReplicationProgressArgs();
    }
}
