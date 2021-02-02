// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ram.Outputs
{

    [OutputType]
    public sealed class GetSamlProvidersProviderResult
    {
        /// <summary>
        /// The Alibaba Cloud Resource Name (ARN) of the IdP.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// The description of SAML Provider.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The encodedsaml metadata document.
        /// </summary>
        public readonly string EncodedsamlMetadataDocument;
        /// <summary>
        /// The ID of the SAML Provider.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The saml provider name.
        /// </summary>
        public readonly string SamlProviderName;
        /// <summary>
        /// The update time.
        /// </summary>
        public readonly string UpdateDate;

        [OutputConstructor]
        private GetSamlProvidersProviderResult(
            string arn,

            string description,

            string encodedsamlMetadataDocument,

            string id,

            string samlProviderName,

            string updateDate)
        {
            Arn = arn;
            Description = description;
            EncodedsamlMetadataDocument = encodedsamlMetadataDocument;
            Id = id;
            SamlProviderName = samlProviderName;
            UpdateDate = updateDate;
        }
    }
}
