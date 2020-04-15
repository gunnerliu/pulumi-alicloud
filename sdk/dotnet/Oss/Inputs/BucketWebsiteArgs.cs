// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Inputs
{

    public sealed class BucketWebsiteArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// An absolute path to the document to return in case of a 4XX error.
        /// </summary>
        [Input("errorDocument")]
        public Input<string>? ErrorDocument { get; set; }

        /// <summary>
        /// Alicloud OSS returns this index document when requests are made to the root domain or any of the subfolders.
        /// </summary>
        [Input("indexDocument", required: true)]
        public Input<string> IndexDocument { get; set; } = null!;

        public BucketWebsiteArgs()
        {
        }
    }
}
