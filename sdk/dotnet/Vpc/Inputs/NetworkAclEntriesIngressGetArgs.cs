// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc.Inputs
{

    public sealed class NetworkAclEntriesIngressGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the egress entry.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The entry type of the egress entry. It must be `custom` or `system`. Default value is `custom`.
        /// </summary>
        [Input("entryType")]
        public Input<string>? EntryType { get; set; }

        /// <summary>
        /// The name of the egress entry.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The policy of the egress entry. It must be `accept` or `drop`.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// The port of the egress entry.
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        /// <summary>
        /// The protocol of the egress entry.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// The source ip of the ingress entry.
        /// </summary>
        [Input("sourceCidrIp")]
        public Input<string>? SourceCidrIp { get; set; }

        public NetworkAclEntriesIngressGetArgs()
        {
        }
        public static new NetworkAclEntriesIngressGetArgs Empty => new NetworkAclEntriesIngressGetArgs();
    }
}
