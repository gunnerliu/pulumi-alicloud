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
    /// Provides a Resource Manager Control Policy resource.
    /// 
    /// For information about Resource Manager Control Policy and how to use it, see [What is Control Policy](https://help.aliyun.com/document_detail/208287.html).
    /// 
    /// &gt; **NOTE:** Available in v1.120.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new AliCloud.ResourceManager.ControlPolicy("example", new AliCloud.ResourceManager.ControlPolicyArgs
    ///         {
    ///             ControlPolicyName = "tf-testAccRDControlPolicy",
    ///             Description = "tf-testAccRDControlPolicy",
    ///             EffectScope = "RAM",
    ///             PolicyDocument = @"  {
    ///     ""Version"": ""1"",
    ///     ""Statement"": [
    ///       {
    ///         ""Effect"": ""Deny"",
    ///         ""Action"": [
    ///           ""ram:UpdateRole"",
    ///           ""ram:DeleteRole"",
    ///           ""ram:AttachPolicyToRole"",
    ///           ""ram:DetachPolicyFromRole""
    ///         ],
    ///         ""Resource"": ""acs:ram:*:*:role/ResourceDirectoryAccountAccessRole""
    ///       }
    ///     ]
    ///   }
    ///   
    /// ",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Resource Manager Control Policy can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:resourcemanager/controlPolicy:ControlPolicy example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:resourcemanager/controlPolicy:ControlPolicy")]
    public partial class ControlPolicy : Pulumi.CustomResource
    {
        /// <summary>
        /// The name of control policy.
        /// </summary>
        [Output("controlPolicyName")]
        public Output<string> ControlPolicyName { get; private set; } = null!;

        /// <summary>
        /// The description of control policy.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The effect scope. Valid values `RAM`.
        /// </summary>
        [Output("effectScope")]
        public Output<string> EffectScope { get; private set; } = null!;

        /// <summary>
        /// The policy document of control policy.
        /// </summary>
        [Output("policyDocument")]
        public Output<string> PolicyDocument { get; private set; } = null!;


        /// <summary>
        /// Create a ControlPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ControlPolicy(string name, ControlPolicyArgs args, CustomResourceOptions? options = null)
            : base("alicloud:resourcemanager/controlPolicy:ControlPolicy", name, args ?? new ControlPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ControlPolicy(string name, Input<string> id, ControlPolicyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:resourcemanager/controlPolicy:ControlPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ControlPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ControlPolicy Get(string name, Input<string> id, ControlPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new ControlPolicy(name, id, state, options);
        }
    }

    public sealed class ControlPolicyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of control policy.
        /// </summary>
        [Input("controlPolicyName", required: true)]
        public Input<string> ControlPolicyName { get; set; } = null!;

        /// <summary>
        /// The description of control policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The effect scope. Valid values `RAM`.
        /// </summary>
        [Input("effectScope", required: true)]
        public Input<string> EffectScope { get; set; } = null!;

        /// <summary>
        /// The policy document of control policy.
        /// </summary>
        [Input("policyDocument", required: true)]
        public Input<string> PolicyDocument { get; set; } = null!;

        public ControlPolicyArgs()
        {
        }
    }

    public sealed class ControlPolicyState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of control policy.
        /// </summary>
        [Input("controlPolicyName")]
        public Input<string>? ControlPolicyName { get; set; }

        /// <summary>
        /// The description of control policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The effect scope. Valid values `RAM`.
        /// </summary>
        [Input("effectScope")]
        public Input<string>? EffectScope { get; set; }

        /// <summary>
        /// The policy document of control policy.
        /// </summary>
        [Input("policyDocument")]
        public Input<string>? PolicyDocument { get; set; }

        public ControlPolicyState()
        {
        }
    }
}
