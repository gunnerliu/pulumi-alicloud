// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Kms
{
    public partial class Ciphertext : Pulumi.CustomResource
    {
        /// <summary>
        /// The ciphertext of the data key encrypted with the primary CMK version.
        /// </summary>
        [Output("ciphertextBlob")]
        public Output<string> CiphertextBlob { get; private set; } = null!;

        [Output("encryptionContext")]
        public Output<ImmutableDictionary<string, string>?> EncryptionContext { get; private set; } = null!;

        /// <summary>
        /// The globally unique ID of the CMK.
        /// * `encryption_context` -
        /// (Optional, ForceNew) The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
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

    public sealed class CiphertextArgs : Pulumi.ResourceArgs
    {
        [Input("encryptionContext")]
        private InputMap<string>? _encryptionContext;
        public InputMap<string> EncryptionContext
        {
            get => _encryptionContext ?? (_encryptionContext = new InputMap<string>());
            set => _encryptionContext = value;
        }

        /// <summary>
        /// The globally unique ID of the CMK.
        /// * `encryption_context` -
        /// (Optional, ForceNew) The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
        /// </summary>
        [Input("keyId", required: true)]
        public Input<string> KeyId { get; set; } = null!;

        /// <summary>
        /// The plaintext to be encrypted which must be encoded in Base64.
        /// </summary>
        [Input("plaintext", required: true)]
        public Input<string> Plaintext { get; set; } = null!;

        public CiphertextArgs()
        {
        }
    }

    public sealed class CiphertextState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ciphertext of the data key encrypted with the primary CMK version.
        /// </summary>
        [Input("ciphertextBlob")]
        public Input<string>? CiphertextBlob { get; set; }

        [Input("encryptionContext")]
        private InputMap<string>? _encryptionContext;
        public InputMap<string> EncryptionContext
        {
            get => _encryptionContext ?? (_encryptionContext = new InputMap<string>());
            set => _encryptionContext = value;
        }

        /// <summary>
        /// The globally unique ID of the CMK.
        /// * `encryption_context` -
        /// (Optional, ForceNew) The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
        /// </summary>
        [Input("keyId")]
        public Input<string>? KeyId { get; set; }

        /// <summary>
        /// The plaintext to be encrypted which must be encoded in Base64.
        /// </summary>
        [Input("plaintext")]
        public Input<string>? Plaintext { get; set; }

        public CiphertextState()
        {
        }
    }
}
