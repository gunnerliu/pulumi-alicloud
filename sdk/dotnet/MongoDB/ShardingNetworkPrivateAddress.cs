// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MongoDB
{
    /// <summary>
    /// Provides a MongoDB Sharding Network Private Address resource.
    /// 
    /// For information about MongoDB Sharding Network Private Address and how to use it, see [What is Sharding Network Private Address](https://www.alibabacloud.com/help/en/doc-detail/141403.html).
    /// 
    /// &gt; **NOTE:** Available since v1.157.0.
    /// 
    /// ## Import
    /// 
    /// MongoDB Sharding Network Private Address can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:mongodb/shardingNetworkPrivateAddress:ShardingNetworkPrivateAddress example &lt;db_instance_id&gt;:&lt;node_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:mongodb/shardingNetworkPrivateAddress:ShardingNetworkPrivateAddress")]
    public partial class ShardingNetworkPrivateAddress : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the account. 
        /// - The name must be 4 to 16 characters in length and can contain lowercase letters, digits, and underscores (_). It must start with a lowercase letter.
        /// - You need to set the account name and password only when you apply for an endpoint for a shard or Configserver node for the first time. In this case, the account name and password are used for all shard and Configserver nodes.
        /// - The permissions of this account are fixed to read-only.
        /// </summary>
        [Output("accountName")]
        public Output<string?> AccountName { get; private set; } = null!;

        /// <summary>
        /// Account password. 
        /// - The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!#$%^&amp;*()_+-=`.
        /// - The password must be 8 to 32 characters in length.
        /// </summary>
        [Output("accountPassword")]
        public Output<string?> AccountPassword { get; private set; } = null!;

        /// <summary>
        /// The db instance id.
        /// </summary>
        [Output("dbInstanceId")]
        public Output<string> DbInstanceId { get; private set; } = null!;

        /// <summary>
        /// The endpoint of the instance.
        /// </summary>
        [Output("networkAddresses")]
        public Output<ImmutableArray<Outputs.ShardingNetworkPrivateAddressNetworkAddress>> NetworkAddresses { get; private set; } = null!;

        /// <summary>
        /// The ID of the Shard node or the ConfigServer node.
        /// </summary>
        [Output("nodeId")]
        public Output<string> NodeId { get; private set; } = null!;

        /// <summary>
        /// The zone ID of the instance.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ShardingNetworkPrivateAddress resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ShardingNetworkPrivateAddress(string name, ShardingNetworkPrivateAddressArgs args, CustomResourceOptions? options = null)
            : base("alicloud:mongodb/shardingNetworkPrivateAddress:ShardingNetworkPrivateAddress", name, args ?? new ShardingNetworkPrivateAddressArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ShardingNetworkPrivateAddress(string name, Input<string> id, ShardingNetworkPrivateAddressState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:mongodb/shardingNetworkPrivateAddress:ShardingNetworkPrivateAddress", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "accountPassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ShardingNetworkPrivateAddress resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ShardingNetworkPrivateAddress Get(string name, Input<string> id, ShardingNetworkPrivateAddressState? state = null, CustomResourceOptions? options = null)
        {
            return new ShardingNetworkPrivateAddress(name, id, state, options);
        }
    }

    public sealed class ShardingNetworkPrivateAddressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the account. 
        /// - The name must be 4 to 16 characters in length and can contain lowercase letters, digits, and underscores (_). It must start with a lowercase letter.
        /// - You need to set the account name and password only when you apply for an endpoint for a shard or Configserver node for the first time. In this case, the account name and password are used for all shard and Configserver nodes.
        /// - The permissions of this account are fixed to read-only.
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        [Input("accountPassword")]
        private Input<string>? _accountPassword;

        /// <summary>
        /// Account password. 
        /// - The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!#$%^&amp;*()_+-=`.
        /// - The password must be 8 to 32 characters in length.
        /// </summary>
        public Input<string>? AccountPassword
        {
            get => _accountPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The db instance id.
        /// </summary>
        [Input("dbInstanceId", required: true)]
        public Input<string> DbInstanceId { get; set; } = null!;

        /// <summary>
        /// The ID of the Shard node or the ConfigServer node.
        /// </summary>
        [Input("nodeId", required: true)]
        public Input<string> NodeId { get; set; } = null!;

        /// <summary>
        /// The zone ID of the instance.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public ShardingNetworkPrivateAddressArgs()
        {
        }
        public static new ShardingNetworkPrivateAddressArgs Empty => new ShardingNetworkPrivateAddressArgs();
    }

    public sealed class ShardingNetworkPrivateAddressState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the account. 
        /// - The name must be 4 to 16 characters in length and can contain lowercase letters, digits, and underscores (_). It must start with a lowercase letter.
        /// - You need to set the account name and password only when you apply for an endpoint for a shard or Configserver node for the first time. In this case, the account name and password are used for all shard and Configserver nodes.
        /// - The permissions of this account are fixed to read-only.
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        [Input("accountPassword")]
        private Input<string>? _accountPassword;

        /// <summary>
        /// Account password. 
        /// - The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!#$%^&amp;*()_+-=`.
        /// - The password must be 8 to 32 characters in length.
        /// </summary>
        public Input<string>? AccountPassword
        {
            get => _accountPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The db instance id.
        /// </summary>
        [Input("dbInstanceId")]
        public Input<string>? DbInstanceId { get; set; }

        [Input("networkAddresses")]
        private InputList<Inputs.ShardingNetworkPrivateAddressNetworkAddressGetArgs>? _networkAddresses;

        /// <summary>
        /// The endpoint of the instance.
        /// </summary>
        public InputList<Inputs.ShardingNetworkPrivateAddressNetworkAddressGetArgs> NetworkAddresses
        {
            get => _networkAddresses ?? (_networkAddresses = new InputList<Inputs.ShardingNetworkPrivateAddressNetworkAddressGetArgs>());
            set => _networkAddresses = value;
        }

        /// <summary>
        /// The ID of the Shard node or the ConfigServer node.
        /// </summary>
        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        /// <summary>
        /// The zone ID of the instance.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ShardingNetworkPrivateAddressState()
        {
        }
        public static new ShardingNetworkPrivateAddressState Empty => new ShardingNetworkPrivateAddressState();
    }
}
