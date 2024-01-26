// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms.Inputs
{

    public sealed class SyntheticTaskMonitorConfArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// HTTP(S) task configuration information. See `api_http` below.
        /// </summary>
        [Input("apiHttp")]
        public Input<Inputs.SyntheticTaskMonitorConfApiHttpArgs>? ApiHttp { get; set; }

        /// <summary>
        /// File download type task configuration. See `file_download` below.
        /// </summary>
        [Input("fileDownload")]
        public Input<Inputs.SyntheticTaskMonitorConfFileDownloadArgs>? FileDownload { get; set; }

        /// <summary>
        /// The configuration parameters of the DNS dial test. Required when TaskType is 3. See `net_dns` below.
        /// </summary>
        [Input("netDns")]
        public Input<Inputs.SyntheticTaskMonitorConfNetDnsArgs>? NetDns { get; set; }

        /// <summary>
        /// ICMP dialing configuration parameters. Required when TaskType is 1. See `net_icmp` below.
        /// </summary>
        [Input("netIcmp")]
        public Input<Inputs.SyntheticTaskMonitorConfNetIcmpArgs>? NetIcmp { get; set; }

        /// <summary>
        /// The configuration parameters of TCP dial test. Required when TaskType is 2. See `net_tcp` below.
        /// </summary>
        [Input("netTcp")]
        public Input<Inputs.SyntheticTaskMonitorConfNetTcpArgs>? NetTcp { get; set; }

        /// <summary>
        /// Streaming Media Dial Test Configuration. See `stream` below.
        /// </summary>
        [Input("stream")]
        public Input<Inputs.SyntheticTaskMonitorConfStreamArgs>? Stream { get; set; }

        /// <summary>
        /// Website speed measurement type task configuration. See `website` below.
        /// </summary>
        [Input("website")]
        public Input<Inputs.SyntheticTaskMonitorConfWebsiteArgs>? Website { get; set; }

        public SyntheticTaskMonitorConfArgs()
        {
        }
        public static new SyntheticTaskMonitorConfArgs Empty => new SyntheticTaskMonitorConfArgs();
    }
}