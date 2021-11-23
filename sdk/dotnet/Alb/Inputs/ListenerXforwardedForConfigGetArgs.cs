// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb.Inputs
{

    public sealed class ListenerXforwardedForConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Custom Header Field Names Only When `xforwardedforclientcert_issuerdnenabled`, Which Evaluates to True When the Entry into Force of.
        /// </summary>
        [Input("xforwardedforclientcertIssuerdnalias")]
        public Input<string>? XforwardedforclientcertIssuerdnalias { get; set; }

        /// <summary>
        /// Indicates Whether the `X-Forwarded-Clientcert-issuerdn` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate after the Manifests Are Signed, the Publisher Information.
        /// </summary>
        [Input("xforwardedforclientcertIssuerdnenabled")]
        public Input<bool>? XforwardedforclientcertIssuerdnenabled { get; set; }

        /// <summary>
        /// The Custom Header Field Names Only When `xforwardedforclientcertclientverifyenabled` Has a Value of True, this Value Will Not Take Effect until.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
        /// </summary>
        [Input("xforwardedforclientcertclientverifyalias")]
        public Input<string>? Xforwardedforclientcertclientverifyalias { get; set; }

        /// <summary>
        /// Indicates Whether the `X-Forwarded-Clientcert-clientverify` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate to Verify the Results.
        /// </summary>
        [Input("xforwardedforclientcertclientverifyenabled")]
        public Input<bool>? Xforwardedforclientcertclientverifyenabled { get; set; }

        /// <summary>
        /// The Custom Header Field Names Only When `xforwardedforclientcertfingerprintenabled`, Which Evaluates to True When the Entry into Force of.The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
        /// </summary>
        [Input("xforwardedforclientcertfingerprintalias")]
        public Input<string>? Xforwardedforclientcertfingerprintalias { get; set; }

        /// <summary>
        /// Indicates Whether the `X-Forwarded-Clientcert-fingerprint` Header Field Is Used to Obtain Access to the Server Load Balancer Instance of the Client Certificate Fingerprint Value.
        /// </summary>
        [Input("xforwardedforclientcertfingerprintenabled")]
        public Input<bool>? Xforwardedforclientcertfingerprintenabled { get; set; }

        /// <summary>
        /// The name of the custom header. This parameter is valid only if `xforwardedforclientcertsubjectdnenabled` is set to true. The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (_), and digits.
        /// </summary>
        [Input("xforwardedforclientcertsubjectdnalias")]
        public Input<string>? Xforwardedforclientcertsubjectdnalias { get; set; }

        /// <summary>
        /// Specifies whether to use the `X-Forwarded-Clientcert-subjectdn` header field to obtain information about the owner of the ALB client certificate. Valid values: true and false. Default value: false.
        /// </summary>
        [Input("xforwardedforclientcertsubjectdnenabled")]
        public Input<bool>? Xforwardedforclientcertsubjectdnenabled { get; set; }

        /// <summary>
        /// Indicates Whether the X-Forwarded-Client-Port Header Field Is Used to Obtain Access to Server Load Balancer Instances to the Client, and Those of the Ports.
        /// </summary>
        [Input("xforwardedforclientsrcportenabled")]
        public Input<bool>? Xforwardedforclientsrcportenabled { get; set; }

        /// <summary>
        /// Whether to Enable by X-Forwarded-For Header Field Is Used to Obtain the Client IP Addresses.
        /// </summary>
        [Input("xforwardedforenabled")]
        public Input<bool>? Xforwardedforenabled { get; set; }

        /// <summary>
        /// Indicates Whether the X-Forwarded-Proto Header Field Is Used to Obtain the Server Load Balancer Instance Snooping Protocols.
        /// </summary>
        [Input("xforwardedforprotoenabled")]
        public Input<bool>? Xforwardedforprotoenabled { get; set; }

        /// <summary>
        /// Indicates Whether the SLB-ID Header Field Is Used to Obtain the Load Balancing Instance Id.
        /// </summary>
        [Input("xforwardedforslbidenabled")]
        public Input<bool>? Xforwardedforslbidenabled { get; set; }

        /// <summary>
        /// Indicates Whether the X-Forwarded-Port Header Field Is Used to Obtain the Server Load Balancer Instance Listening Port.
        /// </summary>
        [Input("xforwardedforslbportenabled")]
        public Input<bool>? Xforwardedforslbportenabled { get; set; }

        public ListenerXforwardedForConfigGetArgs()
        {
        }
    }
}