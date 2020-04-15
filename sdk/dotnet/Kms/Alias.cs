// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Kms
{
    /// <summary>
    /// Create an alias for the master key (CMK).
    /// 
    /// &gt; **NOTE:** Available in v1.77.0+.
    /// </summary>
    public partial class Alias : Pulumi.CustomResource
    {
        /// <summary>
        /// The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
        /// </summary>
        [Output("aliasName")]
        public Output<string> AliasName { get; private set; } = null!;

        /// <summary>
        /// The id of the key.
        /// </summary>
        [Output("keyId")]
        public Output<string> KeyId { get; private set; } = null!;


        /// <summary>
        /// Create a Alias resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Alias(string name, AliasArgs args, CustomResourceOptions? options = null)
            : base("alicloud:kms/alias:Alias", name, args ?? new AliasArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Alias(string name, Input<string> id, AliasState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:kms/alias:Alias", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Alias resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Alias Get(string name, Input<string> id, AliasState? state = null, CustomResourceOptions? options = null)
        {
            return new Alias(name, id, state, options);
        }
    }

    public sealed class AliasArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
        /// </summary>
        [Input("aliasName", required: true)]
        public Input<string> AliasName { get; set; } = null!;

        /// <summary>
        /// The id of the key.
        /// </summary>
        [Input("keyId", required: true)]
        public Input<string> KeyId { get; set; } = null!;

        public AliasArgs()
        {
        }
    }

    public sealed class AliasState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
        /// </summary>
        [Input("aliasName")]
        public Input<string>? AliasName { get; set; }

        /// <summary>
        /// The id of the key.
        /// </summary>
        [Input("keyId")]
        public Input<string>? KeyId { get; set; }

        public AliasState()
        {
        }
    }
}
