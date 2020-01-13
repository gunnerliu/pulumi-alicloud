// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpn
{
    /// <summary>
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/ssl_vpn_client_cert.html.markdown.
    /// </summary>
    public partial class SslVpnClientCert : Pulumi.CustomResource
    {
        [Output("caCert")]
        public Output<string> CaCert { get; private set; } = null!;

        [Output("clientCert")]
        public Output<string> ClientCert { get; private set; } = null!;

        [Output("clientConfig")]
        public Output<string> ClientConfig { get; private set; } = null!;

        [Output("clientKey")]
        public Output<string> ClientKey { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("sslVpnServerId")]
        public Output<string> SslVpnServerId { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a SslVpnClientCert resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SslVpnClientCert(string name, SslVpnClientCertArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpn/sslVpnClientCert:SslVpnClientCert", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private SslVpnClientCert(string name, Input<string> id, SslVpnClientCertState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpn/sslVpnClientCert:SslVpnClientCert", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SslVpnClientCert resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SslVpnClientCert Get(string name, Input<string> id, SslVpnClientCertState? state = null, CustomResourceOptions? options = null)
        {
            return new SslVpnClientCert(name, id, state, options);
        }
    }

    public sealed class SslVpnClientCertArgs : Pulumi.ResourceArgs
    {
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("sslVpnServerId", required: true)]
        public Input<string> SslVpnServerId { get; set; } = null!;

        public SslVpnClientCertArgs()
        {
        }
    }

    public sealed class SslVpnClientCertState : Pulumi.ResourceArgs
    {
        [Input("caCert")]
        public Input<string>? CaCert { get; set; }

        [Input("clientCert")]
        public Input<string>? ClientCert { get; set; }

        [Input("clientConfig")]
        public Input<string>? ClientConfig { get; set; }

        [Input("clientKey")]
        public Input<string>? ClientKey { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("sslVpnServerId")]
        public Input<string>? SslVpnServerId { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        public SslVpnClientCertState()
        {
        }
    }
}