// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Edas.Inputs
{

    public sealed class K8sSlbAttachmentSlbConfigPortMappingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of your tls certification, this is used for 'HTTPS' protocol only.
        /// </summary>
        [Input("certId")]
        public Input<string>? CertId { get; set; }

        /// <summary>
        /// The protocol of SLB instance configuration, values can be 'TCP', 'HTTP' or 'HTTPS'.
        /// </summary>
        [Input("loadbalancerProtocol", required: true)]
        public Input<string> LoadbalancerProtocol { get; set; } = null!;

        /// <summary>
        /// The backend k8s service configuration for SLB instance, which is supported for multiple configurations.
        /// </summary>
        [Input("servicePort", required: true)]
        public Input<Inputs.K8sSlbAttachmentSlbConfigPortMappingServicePortArgs> ServicePort { get; set; } = null!;

        public K8sSlbAttachmentSlbConfigPortMappingArgs()
        {
        }
        public static new K8sSlbAttachmentSlbConfigPortMappingArgs Empty => new K8sSlbAttachmentSlbConfigPortMappingArgs();
    }
}