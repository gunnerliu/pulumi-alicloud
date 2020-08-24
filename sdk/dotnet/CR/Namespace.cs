// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CR
{
    /// <summary>
    /// This resource will help you to manager Container Registry namespaces.
    /// 
    /// &gt; **NOTE:** Available in v1.34.0+.
    /// 
    /// &gt; **NOTE:** You need to set your registry password in Container Registry console before use this resource.
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
    ///         var my_namespace = new AliCloud.CR.Namespace("my-namespace", new AliCloud.CR.NamespaceArgs
    ///         {
    ///             AutoCreate = false,
    ///             DefaultVisibility = "PUBLIC",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class Namespace : Pulumi.CustomResource
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
        /// Name of Container Registry namespace.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a Namespace resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Namespace(string name, NamespaceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cr/namespace:Namespace", name, args ?? new NamespaceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Namespace(string name, Input<string> id, NamespaceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cr/namespace:Namespace", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Namespace resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Namespace Get(string name, Input<string> id, NamespaceState? state = null, CustomResourceOptions? options = null)
        {
            return new Namespace(name, id, state, options);
        }
    }

    public sealed class NamespaceArgs : Pulumi.ResourceArgs
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
        /// Name of Container Registry namespace.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public NamespaceArgs()
        {
        }
    }

    public sealed class NamespaceState : Pulumi.ResourceArgs
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
        /// Name of Container Registry namespace.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public NamespaceState()
        {
        }
    }
}
