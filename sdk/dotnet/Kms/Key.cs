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
    /// A kms key can help user to protect data security in the transmission process. For information about Alikms Key and how to use it, see [What is Resource Alikms Key](https://www.alibabacloud.com/help/doc-detail/28947.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.85.0+.
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
    ///         var key = new AliCloud.Kms.Key("key", new AliCloud.Kms.KeyArgs
    ///         {
    ///             Description = "Hello KMS",
    ///             KeyState = "Enabled",
    ///             PendingWindowInDays = 7,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class Key : Pulumi.CustomResource
    {
        /// <summary>
        /// The Alicloud Resource Name (ARN) of the key.
        /// * `creation_date` -The date and time when the CMK was created. The time is displayed in UTC.
        /// * `creator` -The creator of the CMK.
        /// * `delete_date` -The scheduled date to delete CMK. The time is displayed in UTC. This value is returned only when the KeyState value is PendingDeletion.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to enable automatic key rotation. Default:"Disabled".
        /// </summary>
        [Output("automaticRotation")]
        public Output<string?> AutomaticRotation { get; private set; } = null!;

        [Output("creationDate")]
        public Output<string> CreationDate { get; private set; } = null!;

        [Output("creator")]
        public Output<string> Creator { get; private set; } = null!;

        [Output("deleteDate")]
        public Output<string> DeleteDate { get; private set; } = null!;

        /// <summary>
        /// Field 'deletion_window_in_days' has been deprecated from provider version 1.85.0. New field 'pending_window_in_days' instead.
        /// </summary>
        [Output("deletionWindowInDays")]
        public Output<int?> DeletionWindowInDays { get; private set; } = null!;

        /// <summary>
        /// The description of the key as viewed in Alicloud console.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Field 'is_enabled' has been deprecated from provider version 1.85.0. New field 'key_state' instead.
        /// </summary>
        [Output("isEnabled")]
        public Output<bool?> IsEnabled { get; private set; } = null!;

        /// <summary>
        /// The type of the CMK.
        /// </summary>
        [Output("keySpec")]
        public Output<string?> KeySpec { get; private set; } = null!;

        /// <summary>
        /// The status of CMK. Defaults to Enabled.
        /// </summary>
        [Output("keyState")]
        public Output<string?> KeyStatus { get; private set; } = null!;

        /// <summary>
        /// Specifies the usage of CMK. Currently, default to 'ENCRYPT/DECRYPT', indicating that CMK is used for encryption and decryption.
        /// </summary>
        [Output("keyUsage")]
        public Output<string?> KeyUsage { get; private set; } = null!;

        /// <summary>
        /// The date and time the last rotation was performed. The time is displayed in UTC. 
        /// </summary>
        [Output("lastRotationDate")]
        public Output<string> LastRotationDate { get; private set; } = null!;

        /// <summary>
        /// The time and date the key material for the CMK expires. The time is displayed in UTC. If the value is empty, the key material for the CMK does not expire.
        /// </summary>
        [Output("materialExpireTime")]
        public Output<string> MaterialExpireTime { get; private set; } = null!;

        /// <summary>
        /// The time the next rotation is scheduled for execution. 
        /// </summary>
        [Output("nextRotationDate")]
        public Output<string> NextRotationDate { get; private set; } = null!;

        /// <summary>
        /// The source of the key material for the CMK. Defaults to "Aliyun_KMS".
        /// </summary>
        [Output("origin")]
        public Output<string?> Origin { get; private set; } = null!;

        /// <summary>
        /// Duration in days after which the key is deleted after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
        /// </summary>
        [Output("pendingWindowInDays")]
        public Output<int?> PendingWindowInDays { get; private set; } = null!;

        /// <summary>
        /// The ID of the current primary key version of the symmetric CMK. 
        /// </summary>
        [Output("primaryKeyVersion")]
        public Output<string> PrimaryKeyVersion { get; private set; } = null!;

        /// <summary>
        /// The protection level of the CMK. Defaults to "SOFTWARE".
        /// </summary>
        [Output("protectionLevel")]
        public Output<string?> ProtectionLevel { get; private set; } = null!;

        /// <summary>
        /// The period of automatic key rotation. Unit: seconds. 
        /// </summary>
        [Output("rotationInterval")]
        public Output<string?> RotationInterval { get; private set; } = null!;


        /// <summary>
        /// Create a Key resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Key(string name, KeyArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:kms/key:Key", name, args ?? new KeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Key(string name, Input<string> id, KeyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:kms/key:Key", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Key resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Key Get(string name, Input<string> id, KeyState? state = null, CustomResourceOptions? options = null)
        {
            return new Key(name, id, state, options);
        }
    }

    public sealed class KeyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to enable automatic key rotation. Default:"Disabled".
        /// </summary>
        [Input("automaticRotation")]
        public Input<string>? AutomaticRotation { get; set; }

        /// <summary>
        /// Field 'deletion_window_in_days' has been deprecated from provider version 1.85.0. New field 'pending_window_in_days' instead.
        /// </summary>
        [Input("deletionWindowInDays")]
        public Input<int>? DeletionWindowInDays { get; set; }

        /// <summary>
        /// The description of the key as viewed in Alicloud console.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Field 'is_enabled' has been deprecated from provider version 1.85.0. New field 'key_state' instead.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        /// <summary>
        /// The type of the CMK.
        /// </summary>
        [Input("keySpec")]
        public Input<string>? KeySpec { get; set; }

        /// <summary>
        /// The status of CMK. Defaults to Enabled.
        /// </summary>
        [Input("keyState")]
        public Input<string>? KeyStatus { get; set; }

        /// <summary>
        /// Specifies the usage of CMK. Currently, default to 'ENCRYPT/DECRYPT', indicating that CMK is used for encryption and decryption.
        /// </summary>
        [Input("keyUsage")]
        public Input<string>? KeyUsage { get; set; }

        /// <summary>
        /// The source of the key material for the CMK. Defaults to "Aliyun_KMS".
        /// </summary>
        [Input("origin")]
        public Input<string>? Origin { get; set; }

        /// <summary>
        /// Duration in days after which the key is deleted after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
        /// </summary>
        [Input("pendingWindowInDays")]
        public Input<int>? PendingWindowInDays { get; set; }

        /// <summary>
        /// The protection level of the CMK. Defaults to "SOFTWARE".
        /// </summary>
        [Input("protectionLevel")]
        public Input<string>? ProtectionLevel { get; set; }

        /// <summary>
        /// The period of automatic key rotation. Unit: seconds. 
        /// </summary>
        [Input("rotationInterval")]
        public Input<string>? RotationInterval { get; set; }

        public KeyArgs()
        {
        }
    }

    public sealed class KeyState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Alicloud Resource Name (ARN) of the key.
        /// * `creation_date` -The date and time when the CMK was created. The time is displayed in UTC.
        /// * `creator` -The creator of the CMK.
        /// * `delete_date` -The scheduled date to delete CMK. The time is displayed in UTC. This value is returned only when the KeyState value is PendingDeletion.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Specifies whether to enable automatic key rotation. Default:"Disabled".
        /// </summary>
        [Input("automaticRotation")]
        public Input<string>? AutomaticRotation { get; set; }

        [Input("creationDate")]
        public Input<string>? CreationDate { get; set; }

        [Input("creator")]
        public Input<string>? Creator { get; set; }

        [Input("deleteDate")]
        public Input<string>? DeleteDate { get; set; }

        /// <summary>
        /// Field 'deletion_window_in_days' has been deprecated from provider version 1.85.0. New field 'pending_window_in_days' instead.
        /// </summary>
        [Input("deletionWindowInDays")]
        public Input<int>? DeletionWindowInDays { get; set; }

        /// <summary>
        /// The description of the key as viewed in Alicloud console.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Field 'is_enabled' has been deprecated from provider version 1.85.0. New field 'key_state' instead.
        /// </summary>
        [Input("isEnabled")]
        public Input<bool>? IsEnabled { get; set; }

        /// <summary>
        /// The type of the CMK.
        /// </summary>
        [Input("keySpec")]
        public Input<string>? KeySpec { get; set; }

        /// <summary>
        /// The status of CMK. Defaults to Enabled.
        /// </summary>
        [Input("keyState")]
        public Input<string>? KeyStatus { get; set; }

        /// <summary>
        /// Specifies the usage of CMK. Currently, default to 'ENCRYPT/DECRYPT', indicating that CMK is used for encryption and decryption.
        /// </summary>
        [Input("keyUsage")]
        public Input<string>? KeyUsage { get; set; }

        /// <summary>
        /// The date and time the last rotation was performed. The time is displayed in UTC. 
        /// </summary>
        [Input("lastRotationDate")]
        public Input<string>? LastRotationDate { get; set; }

        /// <summary>
        /// The time and date the key material for the CMK expires. The time is displayed in UTC. If the value is empty, the key material for the CMK does not expire.
        /// </summary>
        [Input("materialExpireTime")]
        public Input<string>? MaterialExpireTime { get; set; }

        /// <summary>
        /// The time the next rotation is scheduled for execution. 
        /// </summary>
        [Input("nextRotationDate")]
        public Input<string>? NextRotationDate { get; set; }

        /// <summary>
        /// The source of the key material for the CMK. Defaults to "Aliyun_KMS".
        /// </summary>
        [Input("origin")]
        public Input<string>? Origin { get; set; }

        /// <summary>
        /// Duration in days after which the key is deleted after destruction of the resource, must be between 7 and 30 days. Defaults to 30 days.
        /// </summary>
        [Input("pendingWindowInDays")]
        public Input<int>? PendingWindowInDays { get; set; }

        /// <summary>
        /// The ID of the current primary key version of the symmetric CMK. 
        /// </summary>
        [Input("primaryKeyVersion")]
        public Input<string>? PrimaryKeyVersion { get; set; }

        /// <summary>
        /// The protection level of the CMK. Defaults to "SOFTWARE".
        /// </summary>
        [Input("protectionLevel")]
        public Input<string>? ProtectionLevel { get; set; }

        /// <summary>
        /// The period of automatic key rotation. Unit: seconds. 
        /// </summary>
        [Input("rotationInterval")]
        public Input<string>? RotationInterval { get; set; }

        public KeyState()
        {
        }
    }
}
