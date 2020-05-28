// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager
{
    /// <summary>
    /// Provides a Resource Manager Account resource. Member accounts are containers for resources in a resource directory. These accounts isolate resources and serve as organizational units in the resource directory. You can create member accounts in a folder and then manage them in a unified manner.
    /// For information about Resource Manager Account and how to use it, see [What is Resource Manager Account](https://www.alibabacloud.com/help/en/doc-detail/111231.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.83.0+.
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
    ///         // Add a Resource Manager Account.
    ///         var f1 = new AliCloud.ResourceManager.Folder("f1", new AliCloud.ResourceManager.FolderArgs
    ///         {
    ///             FolderName = "test1",
    ///         });
    ///         var example = new AliCloud.ResourceManager.Account("example", new AliCloud.ResourceManager.AccountArgs
    ///         {
    ///             DisplayName = "RDAccount",
    ///             FolderId = f1.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class Account : Pulumi.CustomResource
    {
        /// <summary>
        /// Member name. The length is 2 ~ 50 characters or Chinese characters, which can include Chinese characters, English letters, numbers, underscores (_), dots (.) And dashes (-).
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The ID of the parent folder.
        /// </summary>
        [Output("folderId")]
        public Output<string?> FolderId { get; private set; } = null!;

        /// <summary>
        /// Ways for members to join the resource directory. Valid values: `invited`, `created`.
        /// </summary>
        [Output("joinMethod")]
        public Output<string> JoinMethod { get; private set; } = null!;

        /// <summary>
        /// The time when the member joined the resource directory.
        /// </summary>
        [Output("joinTime")]
        public Output<string> JoinTime { get; private set; } = null!;

        /// <summary>
        /// The modification time of the invitation.
        /// </summary>
        [Output("modifyTime")]
        public Output<string> ModifyTime { get; private set; } = null!;

        /// <summary>
        /// Settlement account ID. If the value is empty, the current account will be used for settlement.
        /// </summary>
        [Output("payerAccountId")]
        public Output<string?> PayerAccountId { get; private set; } = null!;

        /// <summary>
        /// Resource directory ID.
        /// </summary>
        [Output("resourceDirectoryId")]
        public Output<string> ResourceDirectoryId { get; private set; } = null!;

        /// <summary>
        /// Member joining status. Valid values: `CreateSuccess`,`CreateVerifying`,`CreateFailed`,`CreateExpired`,`CreateCancelled`,`PromoteVerifying`,`PromoteFailed`,`PromoteExpired`,`PromoteCancelled`,`PromoteSuccess`,`InviteSuccess`,`Removed`. 
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Member type. The value of `ResourceAccount` indicates the resource account. 
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Account resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Account(string name, AccountArgs args, CustomResourceOptions? options = null)
            : base("alicloud:resourcemanager/account:Account", name, args ?? new AccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Account(string name, Input<string> id, AccountState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:resourcemanager/account:Account", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Account resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Account Get(string name, Input<string> id, AccountState? state = null, CustomResourceOptions? options = null)
        {
            return new Account(name, id, state, options);
        }
    }

    public sealed class AccountArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Member name. The length is 2 ~ 50 characters or Chinese characters, which can include Chinese characters, English letters, numbers, underscores (_), dots (.) And dashes (-).
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// The ID of the parent folder.
        /// </summary>
        [Input("folderId")]
        public Input<string>? FolderId { get; set; }

        /// <summary>
        /// Settlement account ID. If the value is empty, the current account will be used for settlement.
        /// </summary>
        [Input("payerAccountId")]
        public Input<string>? PayerAccountId { get; set; }

        public AccountArgs()
        {
        }
    }

    public sealed class AccountState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Member name. The length is 2 ~ 50 characters or Chinese characters, which can include Chinese characters, English letters, numbers, underscores (_), dots (.) And dashes (-).
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The ID of the parent folder.
        /// </summary>
        [Input("folderId")]
        public Input<string>? FolderId { get; set; }

        /// <summary>
        /// Ways for members to join the resource directory. Valid values: `invited`, `created`.
        /// </summary>
        [Input("joinMethod")]
        public Input<string>? JoinMethod { get; set; }

        /// <summary>
        /// The time when the member joined the resource directory.
        /// </summary>
        [Input("joinTime")]
        public Input<string>? JoinTime { get; set; }

        /// <summary>
        /// The modification time of the invitation.
        /// </summary>
        [Input("modifyTime")]
        public Input<string>? ModifyTime { get; set; }

        /// <summary>
        /// Settlement account ID. If the value is empty, the current account will be used for settlement.
        /// </summary>
        [Input("payerAccountId")]
        public Input<string>? PayerAccountId { get; set; }

        /// <summary>
        /// Resource directory ID.
        /// </summary>
        [Input("resourceDirectoryId")]
        public Input<string>? ResourceDirectoryId { get; set; }

        /// <summary>
        /// Member joining status. Valid values: `CreateSuccess`,`CreateVerifying`,`CreateFailed`,`CreateExpired`,`CreateCancelled`,`PromoteVerifying`,`PromoteFailed`,`PromoteExpired`,`PromoteCancelled`,`PromoteSuccess`,`InviteSuccess`,`Removed`. 
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Member type. The value of `ResourceAccount` indicates the resource account. 
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public AccountState()
        {
        }
    }
}
