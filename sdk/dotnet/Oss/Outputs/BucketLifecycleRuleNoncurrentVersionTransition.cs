// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Outputs
{

    [OutputType]
    public sealed class BucketLifecycleRuleNoncurrentVersionTransition
    {
        /// <summary>
        /// Specifies the number of days after object creation when the specific rule action takes effect.
        /// </summary>
        public readonly int Days;
        /// <summary>
        /// The [storage class](https://www.alibabacloud.com/help/doc-detail/51374.htm) to apply. Can be "Standard", "IA" and "Archive". Defaults to "Standard".
        /// </summary>
        public readonly string StorageClass;

        [OutputConstructor]
        private BucketLifecycleRuleNoncurrentVersionTransition(
            int days,

            string storageClass)
        {
            Days = days;
            StorageClass = storageClass;
        }
    }
}
