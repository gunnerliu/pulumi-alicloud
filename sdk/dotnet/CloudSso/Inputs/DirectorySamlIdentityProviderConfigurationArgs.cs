// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudSso.Inputs
{

    public sealed class DirectorySamlIdentityProviderConfigurationArgs : global::Pulumi.ResourceArgs
    {
        [Input("encodedMetadataDocument")]
        private Input<string>? _encodedMetadataDocument;

        /// <summary>
        /// Base64 encoded IdP metadata document. **NOTE:** If the IdP Metadata has been uploaded, no update will be made if this parameter is not specified, otherwise the update will be made according to the parameter content. If IdP Metadata has not been uploaded, and the parameter `sso_status` is `Enabled`, this parameter must be provided. If the IdP Metadata has not been uploaded, and the parameter `sso_status` is `Disabled`, this parameter can be omitted, and the IdP Metadata will remain empty.
        /// </summary>
        public Input<string>? EncodedMetadataDocument
        {
            get => _encodedMetadataDocument;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _encodedMetadataDocument = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// SAML SSO login enabled status. Valid values: `Enabled` or `Disabled`. Default to `Disabled`.
        /// </summary>
        [Input("ssoStatus")]
        public Input<string>? SsoStatus { get; set; }

        public DirectorySamlIdentityProviderConfigurationArgs()
        {
        }
        public static new DirectorySamlIdentityProviderConfigurationArgs Empty => new DirectorySamlIdentityProviderConfigurationArgs();
    }
}
