// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC.Inputs
{

    public sealed class V2FunctionCustomDnsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dnsOptions")]
        private InputList<Inputs.V2FunctionCustomDnsDnsOptionGetArgs>? _dnsOptions;

        /// <summary>
        /// DNS resolver configuration parameter list. See `dns_options` below.
        /// </summary>
        public InputList<Inputs.V2FunctionCustomDnsDnsOptionGetArgs> DnsOptions
        {
            get => _dnsOptions ?? (_dnsOptions = new InputList<Inputs.V2FunctionCustomDnsDnsOptionGetArgs>());
            set => _dnsOptions = value;
        }

        [Input("nameServers")]
        private InputList<string>? _nameServers;

        /// <summary>
        /// List of IP addresses of DNS servers.
        /// </summary>
        public InputList<string> NameServers
        {
            get => _nameServers ?? (_nameServers = new InputList<string>());
            set => _nameServers = value;
        }

        [Input("searches")]
        private InputList<string>? _searches;

        /// <summary>
        /// List of DNS search domains.
        /// </summary>
        public InputList<string> Searches
        {
            get => _searches ?? (_searches = new InputList<string>());
            set => _searches = value;
        }

        public V2FunctionCustomDnsGetArgs()
        {
        }
        public static new V2FunctionCustomDnsGetArgs Empty => new V2FunctionCustomDnsGetArgs();
    }
}