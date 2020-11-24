// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS
{
    /// <summary>
    /// This resource will help you to manager Container Registry Enterprise Edition sync rules.
    /// 
    /// For information about Container Registry Enterprise Edition sync rules and how to use it, see [Create a Sync Rule](https://www.alibabacloud.com/help/doc-detail/145280.htm)
    /// 
    /// &gt; **NOTE:** Available in v1.90.0+.
    /// 
    /// &gt; **NOTE:** You need to set your registry password in Container Registry Enterprise Edition console before use this resource.
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
    ///         var @default = new AliCloud.CS.RegistryEnterpriseSyncRule("default", new AliCloud.CS.RegistryEnterpriseSyncRuleArgs
    ///         {
    ///             InstanceId = "my-source-instance-id",
    ///             NamespaceName = "my-source-namespace",
    ///             RepoName = "my-source-repo",
    ///             TagFilter = ".*",
    ///             TargetInstanceId = "my-target-instance-id",
    ///             TargetNamespaceName = "my-target-namespace",
    ///             TargetRegionId = "cn-hangzhou",
    ///             TargetRepoName = "my-target-repo",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Container Registry Enterprise Edition sync rule can be imported using the id. Format to `{instance_id}:{namespace_name}:{rule_id}`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cs/registryEnterpriseSyncRule:RegistryEnterpriseSyncRule default `cri-xxx:my-namespace:crsr-yyy`
    /// ```
    /// </summary>
    public partial class RegistryEnterpriseSyncRule : Pulumi.CustomResource
    {
        /// <summary>
        /// ID of Container Registry Enterprise Edition source instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// Name of Container Registry Enterprise Edition sync rule.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Name of Container Registry Enterprise Edition source namespace. It can contain 2 to 30 characters.
        /// </summary>
        [Output("namespaceName")]
        public Output<string> NamespaceName { get; private set; } = null!;

        /// <summary>
        /// Name of the source repository which should be set together with `target_repo_name`, if empty means that the synchronization scope is the entire namespace level.
        /// </summary>
        [Output("repoName")]
        public Output<string?> RepoName { get; private set; } = null!;

        /// <summary>
        /// The uuid of Container Registry Enterprise Edition sync rule.
        /// </summary>
        [Output("ruleId")]
        public Output<string> RuleId { get; private set; } = null!;

        /// <summary>
        /// `FROM` or `TO`, the direction of synchronization. `FROM` means source instance, `TO` means target instance.
        /// </summary>
        [Output("syncDirection")]
        public Output<string> SyncDirection { get; private set; } = null!;

        /// <summary>
        /// `REPO` or `NAMESPACE`,the scope that the synchronization rule applies.
        /// </summary>
        [Output("syncScope")]
        public Output<string> SyncScope { get; private set; } = null!;

        /// <summary>
        /// The regular expression used to filter image tags for synchronization in the source repository.
        /// </summary>
        [Output("tagFilter")]
        public Output<string> TagFilter { get; private set; } = null!;

        /// <summary>
        /// ID of Container Registry Enterprise Edition target instance to be synchronized.
        /// </summary>
        [Output("targetInstanceId")]
        public Output<string> TargetInstanceId { get; private set; } = null!;

        /// <summary>
        /// Name of Container Registry Enterprise Edition target namespace to be synchronized. It can contain 2 to 30 characters.
        /// </summary>
        [Output("targetNamespaceName")]
        public Output<string> TargetNamespaceName { get; private set; } = null!;

        /// <summary>
        /// The target region to be synchronized.
        /// </summary>
        [Output("targetRegionId")]
        public Output<string> TargetRegionId { get; private set; } = null!;

        /// <summary>
        /// Name of the target repository.
        /// </summary>
        [Output("targetRepoName")]
        public Output<string?> TargetRepoName { get; private set; } = null!;


        /// <summary>
        /// Create a RegistryEnterpriseSyncRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RegistryEnterpriseSyncRule(string name, RegistryEnterpriseSyncRuleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cs/registryEnterpriseSyncRule:RegistryEnterpriseSyncRule", name, args ?? new RegistryEnterpriseSyncRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RegistryEnterpriseSyncRule(string name, Input<string> id, RegistryEnterpriseSyncRuleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cs/registryEnterpriseSyncRule:RegistryEnterpriseSyncRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RegistryEnterpriseSyncRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RegistryEnterpriseSyncRule Get(string name, Input<string> id, RegistryEnterpriseSyncRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new RegistryEnterpriseSyncRule(name, id, state, options);
        }
    }

    public sealed class RegistryEnterpriseSyncRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of Container Registry Enterprise Edition source instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// Name of Container Registry Enterprise Edition sync rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Name of Container Registry Enterprise Edition source namespace. It can contain 2 to 30 characters.
        /// </summary>
        [Input("namespaceName", required: true)]
        public Input<string> NamespaceName { get; set; } = null!;

        /// <summary>
        /// Name of the source repository which should be set together with `target_repo_name`, if empty means that the synchronization scope is the entire namespace level.
        /// </summary>
        [Input("repoName")]
        public Input<string>? RepoName { get; set; }

        /// <summary>
        /// The regular expression used to filter image tags for synchronization in the source repository.
        /// </summary>
        [Input("tagFilter", required: true)]
        public Input<string> TagFilter { get; set; } = null!;

        /// <summary>
        /// ID of Container Registry Enterprise Edition target instance to be synchronized.
        /// </summary>
        [Input("targetInstanceId", required: true)]
        public Input<string> TargetInstanceId { get; set; } = null!;

        /// <summary>
        /// Name of Container Registry Enterprise Edition target namespace to be synchronized. It can contain 2 to 30 characters.
        /// </summary>
        [Input("targetNamespaceName", required: true)]
        public Input<string> TargetNamespaceName { get; set; } = null!;

        /// <summary>
        /// The target region to be synchronized.
        /// </summary>
        [Input("targetRegionId", required: true)]
        public Input<string> TargetRegionId { get; set; } = null!;

        /// <summary>
        /// Name of the target repository.
        /// </summary>
        [Input("targetRepoName")]
        public Input<string>? TargetRepoName { get; set; }

        public RegistryEnterpriseSyncRuleArgs()
        {
        }
    }

    public sealed class RegistryEnterpriseSyncRuleState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of Container Registry Enterprise Edition source instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Name of Container Registry Enterprise Edition sync rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Name of Container Registry Enterprise Edition source namespace. It can contain 2 to 30 characters.
        /// </summary>
        [Input("namespaceName")]
        public Input<string>? NamespaceName { get; set; }

        /// <summary>
        /// Name of the source repository which should be set together with `target_repo_name`, if empty means that the synchronization scope is the entire namespace level.
        /// </summary>
        [Input("repoName")]
        public Input<string>? RepoName { get; set; }

        /// <summary>
        /// The uuid of Container Registry Enterprise Edition sync rule.
        /// </summary>
        [Input("ruleId")]
        public Input<string>? RuleId { get; set; }

        /// <summary>
        /// `FROM` or `TO`, the direction of synchronization. `FROM` means source instance, `TO` means target instance.
        /// </summary>
        [Input("syncDirection")]
        public Input<string>? SyncDirection { get; set; }

        /// <summary>
        /// `REPO` or `NAMESPACE`,the scope that the synchronization rule applies.
        /// </summary>
        [Input("syncScope")]
        public Input<string>? SyncScope { get; set; }

        /// <summary>
        /// The regular expression used to filter image tags for synchronization in the source repository.
        /// </summary>
        [Input("tagFilter")]
        public Input<string>? TagFilter { get; set; }

        /// <summary>
        /// ID of Container Registry Enterprise Edition target instance to be synchronized.
        /// </summary>
        [Input("targetInstanceId")]
        public Input<string>? TargetInstanceId { get; set; }

        /// <summary>
        /// Name of Container Registry Enterprise Edition target namespace to be synchronized. It can contain 2 to 30 characters.
        /// </summary>
        [Input("targetNamespaceName")]
        public Input<string>? TargetNamespaceName { get; set; }

        /// <summary>
        /// The target region to be synchronized.
        /// </summary>
        [Input("targetRegionId")]
        public Input<string>? TargetRegionId { get; set; }

        /// <summary>
        /// Name of the target repository.
        /// </summary>
        [Input("targetRepoName")]
        public Input<string>? TargetRepoName { get; set; }

        public RegistryEnterpriseSyncRuleState()
        {
        }
    }
}
