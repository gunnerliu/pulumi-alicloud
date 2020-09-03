// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb
{
    /// <summary>
    /// An access control list contains multiple IP addresses or CIDR blocks.
    /// The access control list can help you to define multiple instance listening dimension,
    /// and to meet the multiple usage for single access control list.
    /// 
    /// Server Load Balancer allows you to configure access control for listeners.
    /// You can configure different whitelists or blacklists for different listeners.
    /// 
    /// You can configure access control
    /// when you create a listener or change access control configuration after a listener is created.
    /// 
    /// &gt; **NOTE:** One access control list can be attached to many Listeners in different load balancer as whitelists or blacklists.
    /// 
    /// &gt; **NOTE:** The maximum number of access control lists per region  is 50.
    /// 
    /// &gt; **NOTE:** The maximum number of IP addresses added each time is 50.
    /// 
    /// &gt; **NOTE:** The maximum number of entries per access control list is 300.
    /// 
    /// &gt; **NOTE:** The maximum number of listeners that an access control list can be added to is 50.
    /// 
    /// For information about slb and how to use it, see [What is Server Load Balancer](https://www.alibabacloud.com/help/doc-detail/27539.htm).
    /// 
    /// For information about acl and how to use it, see [Configure an access control list](https://www.alibabacloud.com/help/doc-detail/85978.htm).
    /// 
    /// ## Example Usage
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
    ///         var name = config.Get("name") ?? "terraformslbaclconfig";
    ///         var ipVersion = config.Get("ipVersion") ?? "ipv4";
    ///         var @default = new AliCloud.Slb.Acl("default", new AliCloud.Slb.AclArgs
    ///         {
    ///             IpVersion = ipVersion,
    ///             EntryLists = 
    ///             {
    ///                 new AliCloud.Slb.Inputs.AclEntryListArgs
    ///                 {
    ///                     Entry = "10.10.10.0/24",
    ///                     Comment = "first",
    ///                 },
    ///                 new AliCloud.Slb.Inputs.AclEntryListArgs
    ///                 {
    ///                     Entry = "168.10.10.0/24",
    ///                     Comment = "second",
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ## Entry Block
    /// 
    /// The entry mapping supports the following:
    /// 
    /// * `entry` - (Required) An IP addresses or CIDR blocks.
    /// * `comment` - (Optional) the comment of the entry.
    /// </summary>
    public partial class Acl : Pulumi.CustomResource
    {
        /// <summary>
        /// A list of entry (IP addresses or CIDR blocks) to be added. At most 50 etnry can be supported in one resource. It contains two sub-fields as `Entry Block` follows.
        /// </summary>
        [Output("entryLists")]
        public Output<ImmutableArray<Outputs.AclEntryList>> EntryLists { get; private set; } = null!;

        /// <summary>
        /// The IP Version of access control list is the type of its entry (IP addresses or CIDR blocks). It values ipv4/ipv6. Our plugin provides a default ip_version: "ipv4".
        /// </summary>
        [Output("ipVersion")]
        public Output<string?> IpVersion { get; private set; } = null!;

        /// <summary>
        /// Name of the access control list.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Resource group ID.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Acl resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Acl(string name, AclArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:slb/acl:Acl", name, args ?? new AclArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Acl(string name, Input<string> id, AclState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:slb/acl:Acl", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Acl resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Acl Get(string name, Input<string> id, AclState? state = null, CustomResourceOptions? options = null)
        {
            return new Acl(name, id, state, options);
        }
    }

    public sealed class AclArgs : Pulumi.ResourceArgs
    {
        [Input("entryLists")]
        private InputList<Inputs.AclEntryListArgs>? _entryLists;

        /// <summary>
        /// A list of entry (IP addresses or CIDR blocks) to be added. At most 50 etnry can be supported in one resource. It contains two sub-fields as `Entry Block` follows.
        /// </summary>
        public InputList<Inputs.AclEntryListArgs> EntryLists
        {
            get => _entryLists ?? (_entryLists = new InputList<Inputs.AclEntryListArgs>());
            set => _entryLists = value;
        }

        /// <summary>
        /// The IP Version of access control list is the type of its entry (IP addresses or CIDR blocks). It values ipv4/ipv6. Our plugin provides a default ip_version: "ipv4".
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        /// <summary>
        /// Name of the access control list.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Resource group ID.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public AclArgs()
        {
        }
    }

    public sealed class AclState : Pulumi.ResourceArgs
    {
        [Input("entryLists")]
        private InputList<Inputs.AclEntryListGetArgs>? _entryLists;

        /// <summary>
        /// A list of entry (IP addresses or CIDR blocks) to be added. At most 50 etnry can be supported in one resource. It contains two sub-fields as `Entry Block` follows.
        /// </summary>
        public InputList<Inputs.AclEntryListGetArgs> EntryLists
        {
            get => _entryLists ?? (_entryLists = new InputList<Inputs.AclEntryListGetArgs>());
            set => _entryLists = value;
        }

        /// <summary>
        /// The IP Version of access control list is the type of its entry (IP addresses or CIDR blocks). It values ipv4/ipv6. Our plugin provides a default ip_version: "ipv4".
        /// </summary>
        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        /// <summary>
        /// Name of the access control list.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Resource group ID.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public AclState()
        {
        }
    }
}
