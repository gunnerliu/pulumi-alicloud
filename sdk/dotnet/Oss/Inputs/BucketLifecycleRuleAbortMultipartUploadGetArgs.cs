// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Inputs
{

    public sealed class BucketLifecycleRuleAbortMultipartUploadGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the time before which the rules take effect. The date must conform to the ISO8601 format and always be UTC 00:00. For example: 2002-10-11T00:00:00.000Z indicates that objects updated before 2002-10-11T00:00:00.000Z are deleted or converted to another storage class, and objects updated after this time (including this time) are not deleted or converted.
        /// </summary>
        [Input("createdBeforeDate")]
        public Input<string>? CreatedBeforeDate { get; set; }

        /// <summary>
        /// Specifies the number of days after object creation when the specific rule action takes effect.
        /// 
        /// `NOTE`: One and only one of "created_before_date" and "days" can be specified in one abort_multipart_upload configuration.
        /// </summary>
        [Input("days")]
        public Input<int>? Days { get; set; }

        public BucketLifecycleRuleAbortMultipartUploadGetArgs()
        {
        }
        public static new BucketLifecycleRuleAbortMultipartUploadGetArgs Empty => new BucketLifecycleRuleAbortMultipartUploadGetArgs();
    }
}
