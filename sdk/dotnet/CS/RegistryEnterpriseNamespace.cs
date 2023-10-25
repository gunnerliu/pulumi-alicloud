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
    /// This resource will help you to manager Container Registry Enterprise Edition namespaces.
    /// 
    /// For information about Container Registry Enterprise Edition namespaces and how to use it, see [Create a Namespace](https://www.alibabacloud.com/help/en/acr/developer-reference/api-cr-2018-12-01-createnamespace)
    /// 
    /// &gt; **NOTE:** Available since v1.86.0.
    /// 
    /// &gt; **NOTE:** You need to set your registry password in Container Registry Enterprise Edition console before use this resource.
    /// 
    /// ## Import
    /// 
    /// Container Registry Enterprise Edition namespace can be imported using the `{instance_id}:{namespace}`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cs/registryEnterpriseNamespace:RegistryEnterpriseNamespace default cri-xxx:my-namespace
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cs/registryEnterpriseNamespace:RegistryEnterpriseNamespace")]
    public partial class RegistryEnterpriseNamespace : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Boolean, when it set to true, repositories are automatically created when pushing new images. If it set to false, you create repository for images before pushing.
        /// </summary>
        [Output("autoCreate")]
        public Output<bool> AutoCreate { get; private set; } = null!;

        /// <summary>
        /// `PUBLIC` or `PRIVATE`, default repository visibility in this namespace.
        /// </summary>
        [Output("defaultVisibility")]
        public Output<string> DefaultVisibility { get; private set; } = null!;

        /// <summary>
        /// ID of Container Registry Enterprise Edition instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// Name of Container Registry Enterprise Edition namespace. It can contain 2 to 30 characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a RegistryEnterpriseNamespace resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RegistryEnterpriseNamespace(string name, RegistryEnterpriseNamespaceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cs/registryEnterpriseNamespace:RegistryEnterpriseNamespace", name, args ?? new RegistryEnterpriseNamespaceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RegistryEnterpriseNamespace(string name, Input<string> id, RegistryEnterpriseNamespaceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cs/registryEnterpriseNamespace:RegistryEnterpriseNamespace", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RegistryEnterpriseNamespace resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RegistryEnterpriseNamespace Get(string name, Input<string> id, RegistryEnterpriseNamespaceState? state = null, CustomResourceOptions? options = null)
        {
            return new RegistryEnterpriseNamespace(name, id, state, options);
        }
    }

    public sealed class RegistryEnterpriseNamespaceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean, when it set to true, repositories are automatically created when pushing new images. If it set to false, you create repository for images before pushing.
        /// </summary>
        [Input("autoCreate", required: true)]
        public Input<bool> AutoCreate { get; set; } = null!;

        /// <summary>
        /// `PUBLIC` or `PRIVATE`, default repository visibility in this namespace.
        /// </summary>
        [Input("defaultVisibility", required: true)]
        public Input<string> DefaultVisibility { get; set; } = null!;

        /// <summary>
        /// ID of Container Registry Enterprise Edition instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// Name of Container Registry Enterprise Edition namespace. It can contain 2 to 30 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public RegistryEnterpriseNamespaceArgs()
        {
        }
        public static new RegistryEnterpriseNamespaceArgs Empty => new RegistryEnterpriseNamespaceArgs();
    }

    public sealed class RegistryEnterpriseNamespaceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean, when it set to true, repositories are automatically created when pushing new images. If it set to false, you create repository for images before pushing.
        /// </summary>
        [Input("autoCreate")]
        public Input<bool>? AutoCreate { get; set; }

        /// <summary>
        /// `PUBLIC` or `PRIVATE`, default repository visibility in this namespace.
        /// </summary>
        [Input("defaultVisibility")]
        public Input<string>? DefaultVisibility { get; set; }

        /// <summary>
        /// ID of Container Registry Enterprise Edition instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Name of Container Registry Enterprise Edition namespace. It can contain 2 to 30 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public RegistryEnterpriseNamespaceState()
        {
        }
        public static new RegistryEnterpriseNamespaceState Empty => new RegistryEnterpriseNamespaceState();
    }
}
