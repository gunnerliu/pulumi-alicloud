// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Kms
{
    public static class GetPlaintext
    {
        public static Task<GetPlaintextResult> InvokeAsync(GetPlaintextArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetPlaintextResult>("alicloud:kms/getPlaintext:getPlaintext", args ?? new GetPlaintextArgs(), options.WithDefaults());

        public static Output<GetPlaintextResult> Invoke(GetPlaintextInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetPlaintextResult>("alicloud:kms/getPlaintext:getPlaintext", args ?? new GetPlaintextInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPlaintextArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ciphertext to be decrypted.
        /// </summary>
        [Input("ciphertextBlob", required: true)]
        public string CiphertextBlob { get; set; } = null!;

        [Input("encryptionContext")]
        private Dictionary<string, string>? _encryptionContext;

        /// <summary>
        /// -
        /// (Optional) The Encryption context. If you specify this parameter in the Encrypt or GenerateDataKey API operation, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
        /// </summary>
        public Dictionary<string, string> EncryptionContext
        {
            get => _encryptionContext ?? (_encryptionContext = new Dictionary<string, string>());
            set => _encryptionContext = value;
        }

        public GetPlaintextArgs()
        {
        }
    }

    public sealed class GetPlaintextInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ciphertext to be decrypted.
        /// </summary>
        [Input("ciphertextBlob", required: true)]
        public Input<string> CiphertextBlob { get; set; } = null!;

        [Input("encryptionContext")]
        private InputMap<string>? _encryptionContext;

        /// <summary>
        /// -
        /// (Optional) The Encryption context. If you specify this parameter in the Encrypt or GenerateDataKey API operation, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
        /// </summary>
        public InputMap<string> EncryptionContext
        {
            get => _encryptionContext ?? (_encryptionContext = new InputMap<string>());
            set => _encryptionContext = value;
        }

        public GetPlaintextInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetPlaintextResult
    {
        public readonly string CiphertextBlob;
        public readonly ImmutableDictionary<string, string>? EncryptionContext;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The globally unique ID of the CMK. It is the ID of the CMK used to decrypt ciphertext.
        /// </summary>
        public readonly string KeyId;
        /// <summary>
        /// The decrypted plaintext.
        /// </summary>
        public readonly string Plaintext;

        [OutputConstructor]
        private GetPlaintextResult(
            string ciphertextBlob,

            ImmutableDictionary<string, string>? encryptionContext,

            string id,

            string keyId,

            string plaintext)
        {
            CiphertextBlob = ciphertextBlob;
            EncryptionContext = encryptionContext;
            Id = id;
            KeyId = keyId;
            Plaintext = plaintext;
        }
    }
}
