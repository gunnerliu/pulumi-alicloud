// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ram
{
    /// <summary>
    /// Provides a RAM User access key resource.
    /// 
    /// &gt; **NOTE:**  You should set the `secret_file` if you want to get the access key.  
    /// 
    /// ## Example Usage
    /// 
    /// 
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new RAM access key for user.
    ///         var user = new AliCloud.Ram.User("user", new AliCloud.Ram.UserArgs
    ///         {
    ///             Comments = "yoyoyo",
    ///             DisplayName = "user_display_name",
    ///             Email = "hello.uuu@aaa.com",
    ///             Force = true,
    ///             Mobile = "86-18688888888",
    ///         });
    ///         var ak = new AliCloud.Ram.AccessKey("ak", new AliCloud.Ram.AccessKeyArgs
    ///         {
    ///             SecretFile = "/xxx/xxx/xxx.txt",
    ///             UserName = user.Name,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class AccessKey : Pulumi.CustomResource
    {
        [Output("encryptedSecret")]
        public Output<string> EncryptedSecret { get; private set; } = null!;

        /// <summary>
        /// The fingerprint of the PGP key used to encrypt the secret
        /// </summary>
        [Output("keyFingerprint")]
        public Output<string> KeyFingerprint { get; private set; } = null!;

        /// <summary>
        /// Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:some_person_that_exists`
        /// </summary>
        [Output("pgpKey")]
        public Output<string?> PgpKey { get; private set; } = null!;

        /// <summary>
        /// The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
        /// </summary>
        [Output("secretFile")]
        public Output<string?> SecretFile { get; private set; } = null!;

        /// <summary>
        /// Status of access key. It must be `Active` or `Inactive`. Default value is `Active`.
        /// </summary>
        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;

        /// <summary>
        /// Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
        /// </summary>
        [Output("userName")]
        public Output<string?> UserName { get; private set; } = null!;


        /// <summary>
        /// Create a AccessKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessKey(string name, AccessKeyArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:ram/accessKey:AccessKey", name, args ?? new AccessKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessKey(string name, Input<string> id, AccessKeyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ram/accessKey:AccessKey", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessKey Get(string name, Input<string> id, AccessKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessKey(name, id, state, options);
        }
    }

    public sealed class AccessKeyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:some_person_that_exists`
        /// </summary>
        [Input("pgpKey")]
        public Input<string>? PgpKey { get; set; }

        /// <summary>
        /// The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
        /// </summary>
        [Input("secretFile")]
        public Input<string>? SecretFile { get; set; }

        /// <summary>
        /// Status of access key. It must be `Active` or `Inactive`. Default value is `Active`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public AccessKeyArgs()
        {
        }
    }

    public sealed class AccessKeyState : Pulumi.ResourceArgs
    {
        [Input("encryptedSecret")]
        public Input<string>? EncryptedSecret { get; set; }

        /// <summary>
        /// The fingerprint of the PGP key used to encrypt the secret
        /// </summary>
        [Input("keyFingerprint")]
        public Input<string>? KeyFingerprint { get; set; }

        /// <summary>
        /// Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:some_person_that_exists`
        /// </summary>
        [Input("pgpKey")]
        public Input<string>? PgpKey { get; set; }

        /// <summary>
        /// The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
        /// </summary>
        [Input("secretFile")]
        public Input<string>? SecretFile { get; set; }

        /// <summary>
        /// Status of access key. It must be `Active` or `Inactive`. Default value is `Active`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public AccessKeyState()
        {
        }
    }
}
