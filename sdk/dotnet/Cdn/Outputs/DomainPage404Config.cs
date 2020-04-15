// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cdn.Outputs
{

    [OutputType]
    public sealed class DomainPage404Config
    {
        /// <summary>
        /// Custom page url of the error page. It must be the full path under the accelerated domain name. It's value must be `http://promotion.alicdn.com/help/oss/error.html` when `page_type` value is `charity` and It can not be set when `page_type` value is `default`.
        /// </summary>
        public readonly string? CustomPageUrl;
        public readonly string? ErrorCode;
        /// <summary>
        /// Page type of the error page. Valid values are `default`, `charity`, `other`. Default value is `default`.
        /// </summary>
        public readonly string? PageType;

        [OutputConstructor]
        private DomainPage404Config(
            string? customPageUrl,

            string? errorCode,

            string? pageType)
        {
            CustomPageUrl = customPageUrl;
            ErrorCode = errorCode;
            PageType = pageType;
        }
    }
}
