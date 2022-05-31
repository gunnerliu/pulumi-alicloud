// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Tag.Outputs
{

    [OutputType]
    public sealed class GetMetaTagsTagResult
    {
        /// <summary>
        /// The type of the resource tags.
        /// </summary>
        public readonly string Category;
        /// <summary>
        /// The name of the key.
        /// </summary>
        public readonly string KeyName;
        /// <summary>
        /// The name of the value.
        /// </summary>
        public readonly string ValueName;

        [OutputConstructor]
        private GetMetaTagsTagResult(
            string category,

            string keyName,

            string valueName)
        {
            Category = category;
            KeyName = keyName;
            ValueName = valueName;
        }
    }
}
