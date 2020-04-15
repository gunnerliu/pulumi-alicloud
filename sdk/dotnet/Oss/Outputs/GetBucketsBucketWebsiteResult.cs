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
    public sealed class GetBucketsBucketWebsiteResult
    {
        /// <summary>
        /// Key of the HTML document containing the error page.
        /// </summary>
        public readonly string ErrorDocument;
        /// <summary>
        /// Key of the HTML document containing the home page.
        /// </summary>
        public readonly string IndexDocument;

        [OutputConstructor]
        private GetBucketsBucketWebsiteResult(
            string errorDocument,

            string indexDocument)
        {
            ErrorDocument = errorDocument;
            IndexDocument = indexDocument;
        }
    }
}
