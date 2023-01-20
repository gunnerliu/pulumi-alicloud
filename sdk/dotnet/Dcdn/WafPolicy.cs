// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dcdn
{
    /// <summary>
    /// Provides a DCDN Waf Policy resource.
    /// 
    /// For information about DCDN Waf Policy and how to use it, see [What is Waf Policy](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/set-the-protection-policies#doc-api-dcdn-CreateDcdnWafPolicy).
    /// 
    /// &gt; **NOTE:** Available in v1.184.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new AliCloud.Dcdn.WafPolicy("example", new()
    ///     {
    ///         DefenseScene = "waf_group",
    ///         PolicyName = @var.Name,
    ///         PolicyType = "custom",
    ///         Status = "on",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// DCDN Waf Policy can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:dcdn/wafPolicy:WafPolicy example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:dcdn/wafPolicy:WafPolicy")]
    public partial class WafPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The type of protection policy. Valid values: `waf_group`, `custom_acl`, `whitelist`.
        /// </summary>
        [Output("defenseScene")]
        public Output<string> DefenseScene { get; private set; } = null!;

        /// <summary>
        /// The name of the protection policy. The name must be 1 to 64 characters in length, and can contain letters, digits,and underscores (_).
        /// </summary>
        [Output("policyName")]
        public Output<string> PolicyName { get; private set; } = null!;

        /// <summary>
        /// The type of the protection policy. Valid values: `default`, `custom`.
        /// </summary>
        [Output("policyType")]
        public Output<string> PolicyType { get; private set; } = null!;

        /// <summary>
        /// The status of the resource. Valid values: `on`, `off`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a WafPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WafPolicy(string name, WafPolicyArgs args, CustomResourceOptions? options = null)
            : base("alicloud:dcdn/wafPolicy:WafPolicy", name, args ?? new WafPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WafPolicy(string name, Input<string> id, WafPolicyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:dcdn/wafPolicy:WafPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WafPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WafPolicy Get(string name, Input<string> id, WafPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new WafPolicy(name, id, state, options);
        }
    }

    public sealed class WafPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of protection policy. Valid values: `waf_group`, `custom_acl`, `whitelist`.
        /// </summary>
        [Input("defenseScene", required: true)]
        public Input<string> DefenseScene { get; set; } = null!;

        /// <summary>
        /// The name of the protection policy. The name must be 1 to 64 characters in length, and can contain letters, digits,and underscores (_).
        /// </summary>
        [Input("policyName", required: true)]
        public Input<string> PolicyName { get; set; } = null!;

        /// <summary>
        /// The type of the protection policy. Valid values: `default`, `custom`.
        /// </summary>
        [Input("policyType", required: true)]
        public Input<string> PolicyType { get; set; } = null!;

        /// <summary>
        /// The status of the resource. Valid values: `on`, `off`.
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        public WafPolicyArgs()
        {
        }
        public static new WafPolicyArgs Empty => new WafPolicyArgs();
    }

    public sealed class WafPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of protection policy. Valid values: `waf_group`, `custom_acl`, `whitelist`.
        /// </summary>
        [Input("defenseScene")]
        public Input<string>? DefenseScene { get; set; }

        /// <summary>
        /// The name of the protection policy. The name must be 1 to 64 characters in length, and can contain letters, digits,and underscores (_).
        /// </summary>
        [Input("policyName")]
        public Input<string>? PolicyName { get; set; }

        /// <summary>
        /// The type of the protection policy. Valid values: `default`, `custom`.
        /// </summary>
        [Input("policyType")]
        public Input<string>? PolicyType { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: `on`, `off`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public WafPolicyState()
        {
        }
        public static new WafPolicyState Empty => new WafPolicyState();
    }
}
