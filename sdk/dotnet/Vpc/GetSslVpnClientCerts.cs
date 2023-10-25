// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetSslVpnClientCerts
    {
        /// <summary>
        /// The SSL-VPN client certificates data source lists lots of SSL-VPN client certificates resource information owned by an Alicloud account.
        /// </summary>
        public static Task<GetSslVpnClientCertsResult> InvokeAsync(GetSslVpnClientCertsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSslVpnClientCertsResult>("alicloud:vpc/getSslVpnClientCerts:getSslVpnClientCerts", args ?? new GetSslVpnClientCertsArgs(), options.WithDefaults());

        /// <summary>
        /// The SSL-VPN client certificates data source lists lots of SSL-VPN client certificates resource information owned by an Alicloud account.
        /// </summary>
        public static Output<GetSslVpnClientCertsResult> Invoke(GetSslVpnClientCertsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSslVpnClientCertsResult>("alicloud:vpc/getSslVpnClientCerts:getSslVpnClientCerts", args ?? new GetSslVpnClientCertsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSslVpnClientCertsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// IDs of the SSL-VPN client certificates.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string of SSL-VPN client certificate name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// Save the result to the file.
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Use the SSL-VPN server ID as the search key.
        /// </summary>
        [Input("sslVpnServerId")]
        public string? SslVpnServerId { get; set; }

        public GetSslVpnClientCertsArgs()
        {
        }
        public static new GetSslVpnClientCertsArgs Empty => new GetSslVpnClientCertsArgs();
    }

    public sealed class GetSslVpnClientCertsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// IDs of the SSL-VPN client certificates.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string of SSL-VPN client certificate name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// Save the result to the file.
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// Use the SSL-VPN server ID as the search key.
        /// </summary>
        [Input("sslVpnServerId")]
        public Input<string>? SslVpnServerId { get; set; }

        public GetSslVpnClientCertsInvokeArgs()
        {
        }
        public static new GetSslVpnClientCertsInvokeArgs Empty => new GetSslVpnClientCertsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSslVpnClientCertsResult
    {
        /// <summary>
        /// A list of SSL-VPN client certificates. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSslVpnClientCertsCertResult> Certs;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of SSL-VPN client cert IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of SSL-VPN client cert names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// ID of the SSL-VPN Server.
        /// </summary>
        public readonly string? SslVpnServerId;

        [OutputConstructor]
        private GetSslVpnClientCertsResult(
            ImmutableArray<Outputs.GetSslVpnClientCertsCertResult> certs,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? sslVpnServerId)
        {
            Certs = certs;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            SslVpnServerId = sslVpnServerId;
        }
    }
}
