// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    /// <summary>
    /// Provides a ECS Key Pair resource.
    /// 
    /// For information about ECS Key Pair and how to use it, see [What is Key Pair](https://www.alibabacloud.com/help/en/doc-detail/51771.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.121.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new AliCloud.Ecs.EcsKeyPair("example", new()
    ///     {
    ///         KeyPairName = "key_pair_name",
    ///     });
    /// 
    ///     // Using name prefix to build key pair
    ///     var prefix = new AliCloud.Ecs.EcsKeyPair("prefix", new()
    ///     {
    ///         KeyNamePrefix = "terraform-test-key-pair-prefix",
    ///     });
    /// 
    ///     // Import an existing public key to build a alicloud key pair
    ///     var publickey = new AliCloud.Ecs.EcsKeyPair("publickey", new()
    ///     {
    ///         KeyPairName = "my_public_key",
    ///         PublicKey = "ssh-rsa AAAAB3Nza12345678qwertyuudsfsg",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ECS Key Pair can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ecs/ecsKeyPair:EcsKeyPair example &lt;key_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ecs/ecsKeyPair:EcsKeyPair")]
    public partial class EcsKeyPair : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The finger print of the key pair.
        /// </summary>
        [Output("fingerPrint")]
        public Output<string> FingerPrint { get; private set; } = null!;

        /// <summary>
        /// The key file.
        /// </summary>
        [Output("keyFile")]
        public Output<string?> KeyFile { get; private set; } = null!;

        /// <summary>
        /// Field `key_name` has been deprecated from provider version 1.121.0. New field `key_pair_name` instead.
        /// </summary>
        [Output("keyName")]
        public Output<string> KeyName { get; private set; } = null!;

        [Output("keyNamePrefix")]
        public Output<string?> KeyNamePrefix { get; private set; } = null!;

        /// <summary>
        /// The key pair's name. It is the only in one Alicloud account, the key pair's name. must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
        /// </summary>
        [Output("keyPairName")]
        public Output<string> KeyPairName { get; private set; } = null!;

        /// <summary>
        /// You can import an existing public key and using Alicloud key pair to manage it. If this parameter is specified, `resource_group_id` is the key pair belongs.
        /// </summary>
        [Output("publicKey")]
        public Output<string?> PublicKey { get; private set; } = null!;

        /// <summary>
        /// The Id of resource group which the key pair belongs.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string?> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a EcsKeyPair resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EcsKeyPair(string name, EcsKeyPairArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/ecsKeyPair:EcsKeyPair", name, args ?? new EcsKeyPairArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EcsKeyPair(string name, Input<string> id, EcsKeyPairState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/ecsKeyPair:EcsKeyPair", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EcsKeyPair resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EcsKeyPair Get(string name, Input<string> id, EcsKeyPairState? state = null, CustomResourceOptions? options = null)
        {
            return new EcsKeyPair(name, id, state, options);
        }
    }

    public sealed class EcsKeyPairArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The key file.
        /// </summary>
        [Input("keyFile")]
        public Input<string>? KeyFile { get; set; }

        /// <summary>
        /// Field `key_name` has been deprecated from provider version 1.121.0. New field `key_pair_name` instead.
        /// </summary>
        [Input("keyName")]
        public Input<string>? KeyName { get; set; }

        [Input("keyNamePrefix")]
        public Input<string>? KeyNamePrefix { get; set; }

        /// <summary>
        /// The key pair's name. It is the only in one Alicloud account, the key pair's name. must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
        /// </summary>
        [Input("keyPairName")]
        public Input<string>? KeyPairName { get; set; }

        /// <summary>
        /// You can import an existing public key and using Alicloud key pair to manage it. If this parameter is specified, `resource_group_id` is the key pair belongs.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        /// <summary>
        /// The Id of resource group which the key pair belongs.
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

        public EcsKeyPairArgs()
        {
        }
        public static new EcsKeyPairArgs Empty => new EcsKeyPairArgs();
    }

    public sealed class EcsKeyPairState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The finger print of the key pair.
        /// </summary>
        [Input("fingerPrint")]
        public Input<string>? FingerPrint { get; set; }

        /// <summary>
        /// The key file.
        /// </summary>
        [Input("keyFile")]
        public Input<string>? KeyFile { get; set; }

        /// <summary>
        /// Field `key_name` has been deprecated from provider version 1.121.0. New field `key_pair_name` instead.
        /// </summary>
        [Input("keyName")]
        public Input<string>? KeyName { get; set; }

        [Input("keyNamePrefix")]
        public Input<string>? KeyNamePrefix { get; set; }

        /// <summary>
        /// The key pair's name. It is the only in one Alicloud account, the key pair's name. must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.
        /// </summary>
        [Input("keyPairName")]
        public Input<string>? KeyPairName { get; set; }

        /// <summary>
        /// You can import an existing public key and using Alicloud key pair to manage it. If this parameter is specified, `resource_group_id` is the key pair belongs.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        /// <summary>
        /// The Id of resource group which the key pair belongs.
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

        public EcsKeyPairState()
        {
        }
        public static new EcsKeyPairState Empty => new EcsKeyPairState();
    }
}
