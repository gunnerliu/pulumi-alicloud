// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class ListenerCertificatesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Certificate.
        /// </summary>
        [Input("certificateId")]
        public Input<string>? CertificateId { get; set; }

        public ListenerCertificatesGetArgs()
        {
        }
        public static new ListenerCertificatesGetArgs Empty => new ListenerCertificatesGetArgs();
    }
}
