// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpn.Inputs
{

    public sealed class IpsecServerIpsecConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The authentication algorithm that is used in Phase 2 negotiations. Default value: `sha1`.
        /// </summary>
        [Input("ipsecAuthAlg")]
        public Input<string>? IpsecAuthAlg { get; set; }

        /// <summary>
        /// The encryption algorithm that is used in Phase 2 negotiations. Default value: `aes`.
        /// </summary>
        [Input("ipsecEncAlg")]
        public Input<string>? IpsecEncAlg { get; set; }

        /// <summary>
        /// The SA lifetime determined by Phase 2 negotiations. Valid values: `0` to `86400`. Default value: `86400`. Unit: `seconds`.
        /// </summary>
        [Input("ipsecLifetime")]
        public Input<int>? IpsecLifetime { get; set; }

        /// <summary>
        /// Forwards packets of all protocols. The Diffie-Hellman key exchange algorithm used in Phase 2 negotiations. Default value: `group2`.
        /// </summary>
        [Input("ipsecPfs")]
        public Input<string>? IpsecPfs { get; set; }

        public IpsecServerIpsecConfigGetArgs()
        {
        }
    }
}
