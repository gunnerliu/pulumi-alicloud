// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cdn.Inputs
{

    public sealed class DomainNewCertificateConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The SSL certificate name.
        /// </summary>
        [Input("certName")]
        public Input<string>? CertName { get; set; }

        /// <summary>
        /// The SSL certificate type, can be "upload", "cas" and "free".
        /// </summary>
        [Input("certType")]
        public Input<string>? CertType { get; set; }

        /// <summary>
        /// Set `1` to ignore the repeated verification for certificate name, and cover the information of the origin certificate (with the same name). Set `0` to work the verification.
        /// </summary>
        [Input("forceSet")]
        public Input<string>? ForceSet { get; set; }

        /// <summary>
        /// The SSL private key. This is required if `server_certificate_status` is `on`
        /// </summary>
        [Input("privateKey")]
        public Input<string>? PrivateKey { get; set; }

        /// <summary>
        /// The SSL server certificate string. This is required if `server_certificate_status` is `on`
        /// </summary>
        [Input("serverCertificate")]
        public Input<string>? ServerCertificate { get; set; }

        /// <summary>
        /// This parameter indicates whether or not enable https. Valid values are `on` and `off`. Default value is `on`.
        /// </summary>
        [Input("serverCertificateStatus")]
        public Input<string>? ServerCertificateStatus { get; set; }

        public DomainNewCertificateConfigGetArgs()
        {
        }
    }
}
