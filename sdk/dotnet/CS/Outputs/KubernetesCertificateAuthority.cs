// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Outputs
{

    [OutputType]
    public sealed class KubernetesCertificateAuthority
    {
        /// <summary>
        /// The path of client certificate, like `~/.kube/client-cert.pem`.
        /// </summary>
        public readonly string? ClientCert;
        /// <summary>
        /// The path of client key, like `~/.kube/client-key.pem`.
        /// </summary>
        public readonly string? ClientKey;
        /// <summary>
        /// The base64 encoded cluster certificate data required to communicate with your cluster. Add this to the certificate-authority-data section of the kubeconfig file for your cluster.
        /// </summary>
        public readonly string? ClusterCert;

        [OutputConstructor]
        private KubernetesCertificateAuthority(
            string? clientCert,

            string? clientKey,

            string? clusterCert)
        {
            ClientCert = clientCert;
            ClientKey = clientKey;
            ClusterCert = clusterCert;
        }
    }
}
