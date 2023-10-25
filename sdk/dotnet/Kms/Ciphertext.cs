// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Kms
{
    [AliCloudResourceType("alicloud:kms/ciphertext:Ciphertext")]
    public partial class Ciphertext : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ciphertext of the data key encrypted with the primary CMK version.
        /// </summary>
        [Output("ciphertextBlob")]
        public Output<string> CiphertextBlob { get; private set; } = null!;

        /// <summary>
        /// The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
        /// </summary>
        [Output("encryptionContext")]
        public Output<ImmutableDictionary<string, string>?> EncryptionContext { get; private set; } = null!;

        /// <summary>
        /// The globally unique ID of the CMK.
        /// </summary>
        [Output("keyId")]
        public Output<string> KeyId { get; private set; } = null!;

        /// <summary>
        /// The plaintext to be encrypted which must be encoded in Base64.
        /// </summary>
        [Output("plaintext")]
        public Output<string> Plaintext { get; private set; } = null!;


        /// <summary>
        /// Create a Ciphertext resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Ciphertext(string name, CiphertextArgs args, CustomResourceOptions? options = null)
            : base("alicloud:kms/ciphertext:Ciphertext", name, args ?? new CiphertextArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Ciphertext(string name, Input<string> id, CiphertextState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:kms/ciphertext:Ciphertext", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "plaintext",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Ciphertext resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Ciphertext Get(string name, Input<string> id, CiphertextState? state = null, CustomResourceOptions? options = null)
        {
            return new Ciphertext(name, id, state, options);
        }
    }

    public sealed class CiphertextArgs : global::Pulumi.ResourceArgs
    {
        [Input("encryptionContext")]
        private InputMap<string>? _encryptionContext;

        /// <summary>
        /// The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
        /// </summary>
        public InputMap<string> EncryptionContext
        {
            get => _encryptionContext ?? (_encryptionContext = new InputMap<string>());
            set => _encryptionContext = value;
        }

        /// <summary>
        /// The globally unique ID of the CMK.
        /// </summary>
        [Input("keyId", required: true)]
        public Input<string> KeyId { get; set; } = null!;

        [Input("plaintext", required: true)]
        private Input<string>? _plaintext;

        /// <summary>
        /// The plaintext to be encrypted which must be encoded in Base64.
        /// </summary>
        public Input<string>? Plaintext
        {
            get => _plaintext;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _plaintext = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public CiphertextArgs()
        {
        }
        public static new CiphertextArgs Empty => new CiphertextArgs();
    }

    public sealed class CiphertextState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ciphertext of the data key encrypted with the primary CMK version.
        /// </summary>
        [Input("ciphertextBlob")]
        public Input<string>? CiphertextBlob { get; set; }

        [Input("encryptionContext")]
        private InputMap<string>? _encryptionContext;

        /// <summary>
        /// The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
        /// </summary>
        public InputMap<string> EncryptionContext
        {
            get => _encryptionContext ?? (_encryptionContext = new InputMap<string>());
            set => _encryptionContext = value;
        }

        /// <summary>
        /// The globally unique ID of the CMK.
        /// </summary>
        [Input("keyId")]
        public Input<string>? KeyId { get; set; }

        [Input("plaintext")]
        private Input<string>? _plaintext;

        /// <summary>
        /// The plaintext to be encrypted which must be encoded in Base64.
        /// </summary>
        public Input<string>? Plaintext
        {
            get => _plaintext;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _plaintext = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public CiphertextState()
        {
        }
        public static new CiphertextState Empty => new CiphertextState();
    }
}
