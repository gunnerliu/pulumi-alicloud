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
    /// Provides a RAM cloud account alias.
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
    ///         // Create a alias for cloud account.
    ///         var @alias = new AliCloud.Ram.AccountAlias("alias", new AliCloud.Ram.AccountAliasArgs
    ///         {
    ///             Alias = "hallo",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// RAM account alias can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ram/accountAlias:AccountAlias example my-alias
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ram/accountAlias:AccountAlias")]
    public partial class AccountAlias : Pulumi.CustomResource
    {
        /// <summary>
        /// Alias of cloud account. This name can have a string of 3 to 32 characters, must contain only alphanumeric characters or hyphens, such as "-", and must not begin with a hyphen.
        /// </summary>
        [Output("accountAlias")]
        public Output<string> Alias { get; private set; } = null!;


        /// <summary>
        /// Create a AccountAlias resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccountAlias(string name, AccountAliasArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ram/accountAlias:AccountAlias", name, args ?? new AccountAliasArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccountAlias(string name, Input<string> id, AccountAliasState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ram/accountAlias:AccountAlias", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccountAlias resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccountAlias Get(string name, Input<string> id, AccountAliasState? state = null, CustomResourceOptions? options = null)
        {
            return new AccountAlias(name, id, state, options);
        }
    }

    public sealed class AccountAliasArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alias of cloud account. This name can have a string of 3 to 32 characters, must contain only alphanumeric characters or hyphens, such as "-", and must not begin with a hyphen.
        /// </summary>
        [Input("accountAlias", required: true)]
        public Input<string> Alias { get; set; } = null!;

        public AccountAliasArgs()
        {
        }
    }

    public sealed class AccountAliasState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alias of cloud account. This name can have a string of 3 to 32 characters, must contain only alphanumeric characters or hyphens, such as "-", and must not begin with a hyphen.
        /// </summary>
        [Input("accountAlias")]
        public Input<string>? Alias { get; set; }

        public AccountAliasState()
        {
        }
    }
}
