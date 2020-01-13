// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ram
{
    /// <summary>
    /// Provides a RAM Role attachment resource.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/ram_role_policy_attachment.html.markdown.
    /// </summary>
    public partial class RolePolicyAttachment : Pulumi.CustomResource
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
        /// Name of the RAM Role. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
        /// </summary>
        [Output("roleName")]
        public Output<string> RoleName { get; private set; } = null!;


        /// <summary>
        /// Create a RolePolicyAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RolePolicyAttachment(string name, RolePolicyAttachmentArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ram/rolePolicyAttachment:RolePolicyAttachment", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private RolePolicyAttachment(string name, Input<string> id, RolePolicyAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ram/rolePolicyAttachment:RolePolicyAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RolePolicyAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RolePolicyAttachment Get(string name, Input<string> id, RolePolicyAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new RolePolicyAttachment(name, id, state, options);
        }
    }

    public sealed class RolePolicyAttachmentArgs : Pulumi.ResourceArgs
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
        /// Name of the RAM Role. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
        /// </summary>
        [Input("roleName", required: true)]
        public Input<string> RoleName { get; set; } = null!;

        public RolePolicyAttachmentArgs()
        {
        }
    }

    public sealed class RolePolicyAttachmentState : Pulumi.ResourceArgs
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
        /// Name of the RAM Role. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
        /// </summary>
        [Input("roleName")]
        public Input<string>? RoleName { get; set; }

        public RolePolicyAttachmentState()
        {
        }
    }
}