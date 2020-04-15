// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cdn.Inputs
{

    public sealed class DomainCertificateConfigGetArgs : Pulumi.ResourceArgs
    {
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

        public DomainCertificateConfigGetArgs()
        {
        }
    }
}
