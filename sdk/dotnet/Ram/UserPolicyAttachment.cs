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
    /// Provides a RAM User Policy attachment resource. 
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
    ///         // Create a RAM User Policy attachment.
    ///         var user = new AliCloud.Ram.User("user", new AliCloud.Ram.UserArgs
    ///         {
    ///             Comments = "yoyoyo",
    ///             DisplayName = "user_display_name",
    ///             Email = "hello.uuu@aaa.com",
    ///             Force = true,
    ///             Mobile = "86-18688888888",
    ///         });
    ///         var policy = new AliCloud.Ram.Policy("policy", new AliCloud.Ram.PolicyArgs
    ///         {
    ///             Description = "this is a policy test",
    ///             Document = @"  {
    ///     ""Statement"": [
    ///       {
    ///         ""Action"": [
    ///           ""oss:ListObjects"",
    ///           ""oss:GetObject""
    ///         ],
    ///         ""Effect"": ""Allow"",
    ///         ""Resource"": [
    ///           ""acs:oss:*:*:mybucket"",
    ///           ""acs:oss:*:*:mybucket/*""
    ///         ]
    ///       }
    ///     ],
    ///       ""Version"": ""1""
    ///   }
    ///   
    /// ",
    ///             Force = true,
    ///         });
    ///         var attach = new AliCloud.Ram.UserPolicyAttachment("attach", new AliCloud.Ram.UserPolicyAttachmentArgs
    ///         {
    ///             PolicyName = policy.Name,
    ///             PolicyType = policy.Type,
    ///             UserName = user.Name,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class UserPolicyAttachment : Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        /// </summary>
        [Output("policyName")]
        public Output<string> PolicyName { get; private set; } = null!;

        /// <summary>
        /// Type of the RAM policy. It must be `Custom` or `System`.
        /// </summary>
        [Output("policyType")]
        public Output<string> PolicyType { get; private set; } = null!;

        /// <summary>
        /// Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
        /// </summary>
        [Output("userName")]
        public Output<string> UserName { get; private set; } = null!;


        /// <summary>
        /// Create a UserPolicyAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserPolicyAttachment(string name, UserPolicyAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ram/userPolicyAttachment:UserPolicyAttachment", name, args ?? new UserPolicyAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserPolicyAttachment(string name, Input<string> id, UserPolicyAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ram/userPolicyAttachment:UserPolicyAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserPolicyAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserPolicyAttachment Get(string name, Input<string> id, UserPolicyAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new UserPolicyAttachment(name, id, state, options);
        }
    }

    public sealed class UserPolicyAttachmentArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        /// </summary>
        [Input("policyName", required: true)]
        public Input<string> PolicyName { get; set; } = null!;

        /// <summary>
        /// Type of the RAM policy. It must be `Custom` or `System`.
        /// </summary>
        [Input("policyType", required: true)]
        public Input<string> PolicyType { get; set; } = null!;

        /// <summary>
        /// Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
        /// </summary>
        [Input("userName", required: true)]
        public Input<string> UserName { get; set; } = null!;

        public UserPolicyAttachmentArgs()
        {
        }
    }

    public sealed class UserPolicyAttachmentState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        /// </summary>
        [Input("policyName")]
        public Input<string>? PolicyName { get; set; }

        /// <summary>
        /// Type of the RAM policy. It must be `Custom` or `System`.
        /// </summary>
        [Input("policyType")]
        public Input<string>? PolicyType { get; set; }

        /// <summary>
        /// Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public UserPolicyAttachmentState()
        {
        }
    }
}
