// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Outputs
{

    [OutputType]
    public sealed class ApplicationLivenessV2HttpGet
    {
        /// <summary>
        /// Specifies whether the response contains keywords. Valid values: `true` and `false`. If you do not set it, the advanced settings are not used.
        /// </summary>
        public readonly bool? IsContainKeyWord;
        /// <summary>
        /// The custom keywords.
        /// </summary>
        public readonly string? KeyWord;
        /// <summary>
        /// The request path.
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// The port.
        /// </summary>
        public readonly int? Port;
        /// <summary>
        /// The protocol that is used to perform the health check. Valid values: `HTTP` and `HTTPS`.
        /// </summary>
        public readonly string? Scheme;

        [OutputConstructor]
        private ApplicationLivenessV2HttpGet(
            bool? isContainKeyWord,

            string? keyWord,

            string? path,

            int? port,

            string? scheme)
        {
            IsContainKeyWord = isContainKeyWord;
            KeyWord = keyWord;
            Path = path;
            Port = port;
            Scheme = scheme;
        }
    }
}
