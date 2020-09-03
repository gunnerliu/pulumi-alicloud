// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    /// <summary>
    /// Provides a network acl entries resource to create ingress and egress entries.
    /// 
    /// &gt; **NOTE:** Available in 1.45.0+. Currently, the resource are only available in Hongkong(cn-hongkong), India(ap-south-1), and Indonesia(ap-southeast-1) regions.
    /// 
    /// &gt; **NOTE:** It doesn't support concurrency and the order of the ingress and egress entries determines the priority.
    /// 
    /// &gt; **NOTE:** Using this resource need to open a whitelist.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var config = new Config();
    ///         var name = config.Get("name") ?? "NetworkAclEntries";
    ///         var defaultZones = Output.Create(AliCloud.GetZones.InvokeAsync(new AliCloud.GetZonesArgs
    ///         {
    ///             AvailableResourceCreation = "VSwitch",
    ///         }));
    ///         var defaultNetwork = new AliCloud.Vpc.Network("defaultNetwork", new AliCloud.Vpc.NetworkArgs
    ///         {
    ///             CidrBlock = "172.16.0.0/12",
    ///         });
    ///         var defaultNetworkAcl = new AliCloud.Vpc.NetworkAcl("defaultNetworkAcl", new AliCloud.Vpc.NetworkAclArgs
    ///         {
    ///             VpcId = defaultNetwork.Id,
    ///         });
    ///         var defaultSwitch = new AliCloud.Vpc.Switch("defaultSwitch", new AliCloud.Vpc.SwitchArgs
    ///         {
    ///             VpcId = defaultNetwork.Id,
    ///             CidrBlock = "172.16.0.0/21",
    ///             AvailabilityZone = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones[0].Id),
    ///         });
    ///         var defaultNetworkAclAttachment = new AliCloud.Vpc.NetworkAclAttachment("defaultNetworkAclAttachment", new AliCloud.Vpc.NetworkAclAttachmentArgs
    ///         {
    ///             NetworkAclId = defaultNetworkAcl.Id,
    ///             Resources = 
    ///             {
    ///                 new AliCloud.Vpc.Inputs.NetworkAclAttachmentResourceArgs
    ///                 {
    ///                     ResourceId = defaultSwitch.Id,
    ///                     ResourceType = "VSwitch",
    ///                 },
    ///             },
    ///         });
    ///         var defaultNetworkAclEntries = new AliCloud.Vpc.NetworkAclEntries("defaultNetworkAclEntries", new AliCloud.Vpc.NetworkAclEntriesArgs
    ///         {
    ///             NetworkAclId = defaultNetworkAcl.Id,
    ///             Ingresses = 
    ///             {
    ///                 new AliCloud.Vpc.Inputs.NetworkAclEntriesIngressArgs
    ///                 {
    ///                     Protocol = "all",
    ///                     Port = "-1/-1",
    ///                     SourceCidrIp = "0.0.0.0/32",
    ///                     Name = name,
    ///                     EntryType = "custom",
    ///                     Policy = "accept",
    ///                     Description = name,
    ///                 },
    ///             },
    ///             Egresses = 
    ///             {
    ///                 new AliCloud.Vpc.Inputs.NetworkAclEntriesEgressArgs
    ///                 {
    ///                     Protocol = "all",
    ///                     Port = "-1/-1",
    ///                     DestinationCidrIp = "0.0.0.0/32",
    ///                     Name = name,
    ///                     EntryType = "custom",
    ///                     Policy = "accept",
    ///                     Description = name,
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class NetworkAclEntries : Pulumi.CustomResource
    {
        /// <summary>
        /// List of the egress entries of the network acl. The order of the egress entries determines the priority. The details see Block Egress.
        /// </summary>
        [Output("egresses")]
        public Output<ImmutableArray<Outputs.NetworkAclEntriesEgress>> Egresses { get; private set; } = null!;

        /// <summary>
        /// List of the ingress entries of the network acl. The order of the ingress entries determines the priority. The details see Block Ingress.
        /// </summary>
        [Output("ingresses")]
        public Output<ImmutableArray<Outputs.NetworkAclEntriesIngress>> Ingresses { get; private set; } = null!;

        /// <summary>
        /// The id of the network acl, the field can't be changed.
        /// </summary>
        [Output("networkAclId")]
        public Output<string> NetworkAclId { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkAclEntries resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkAclEntries(string name, NetworkAclEntriesArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpc/networkAclEntries:NetworkAclEntries", name, args ?? new NetworkAclEntriesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkAclEntries(string name, Input<string> id, NetworkAclEntriesState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpc/networkAclEntries:NetworkAclEntries", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NetworkAclEntries resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkAclEntries Get(string name, Input<string> id, NetworkAclEntriesState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkAclEntries(name, id, state, options);
        }
    }

    public sealed class NetworkAclEntriesArgs : Pulumi.ResourceArgs
    {
        [Input("egresses")]
        private InputList<Inputs.NetworkAclEntriesEgressArgs>? _egresses;

        /// <summary>
        /// List of the egress entries of the network acl. The order of the egress entries determines the priority. The details see Block Egress.
        /// </summary>
        public InputList<Inputs.NetworkAclEntriesEgressArgs> Egresses
        {
            get => _egresses ?? (_egresses = new InputList<Inputs.NetworkAclEntriesEgressArgs>());
            set => _egresses = value;
        }

        [Input("ingresses")]
        private InputList<Inputs.NetworkAclEntriesIngressArgs>? _ingresses;

        /// <summary>
        /// List of the ingress entries of the network acl. The order of the ingress entries determines the priority. The details see Block Ingress.
        /// </summary>
        public InputList<Inputs.NetworkAclEntriesIngressArgs> Ingresses
        {
            get => _ingresses ?? (_ingresses = new InputList<Inputs.NetworkAclEntriesIngressArgs>());
            set => _ingresses = value;
        }

        /// <summary>
        /// The id of the network acl, the field can't be changed.
        /// </summary>
        [Input("networkAclId", required: true)]
        public Input<string> NetworkAclId { get; set; } = null!;

        public NetworkAclEntriesArgs()
        {
        }
    }

    public sealed class NetworkAclEntriesState : Pulumi.ResourceArgs
    {
        [Input("egresses")]
        private InputList<Inputs.NetworkAclEntriesEgressGetArgs>? _egresses;

        /// <summary>
        /// List of the egress entries of the network acl. The order of the egress entries determines the priority. The details see Block Egress.
        /// </summary>
        public InputList<Inputs.NetworkAclEntriesEgressGetArgs> Egresses
        {
            get => _egresses ?? (_egresses = new InputList<Inputs.NetworkAclEntriesEgressGetArgs>());
            set => _egresses = value;
        }

        [Input("ingresses")]
        private InputList<Inputs.NetworkAclEntriesIngressGetArgs>? _ingresses;

        /// <summary>
        /// List of the ingress entries of the network acl. The order of the ingress entries determines the priority. The details see Block Ingress.
        /// </summary>
        public InputList<Inputs.NetworkAclEntriesIngressGetArgs> Ingresses
        {
            get => _ingresses ?? (_ingresses = new InputList<Inputs.NetworkAclEntriesIngressGetArgs>());
            set => _ingresses = value;
        }

        /// <summary>
        /// The id of the network acl, the field can't be changed.
        /// </summary>
        [Input("networkAclId")]
        public Input<string>? NetworkAclId { get; set; }

        public NetworkAclEntriesState()
        {
        }
    }
}
