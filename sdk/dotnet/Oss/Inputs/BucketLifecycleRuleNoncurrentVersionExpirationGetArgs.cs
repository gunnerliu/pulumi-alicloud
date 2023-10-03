// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Inputs
{

    public sealed class BucketLifecycleRuleNoncurrentVersionExpirationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the number of days noncurrent object versions transition.
        /// </summary>
        [Input("days", required: true)]
        public Input<int> Days { get; set; } = null!;

        public BucketLifecycleRuleNoncurrentVersionExpirationGetArgs()
        {
        }
        public static new BucketLifecycleRuleNoncurrentVersionExpirationGetArgs Empty => new BucketLifecycleRuleNoncurrentVersionExpirationGetArgs();
    }
}
