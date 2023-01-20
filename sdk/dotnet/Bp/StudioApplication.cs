// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Bp
{
    /// <summary>
    /// Provides a Cloud Architect Design Tools Application resource.
    /// 
    /// For information about Cloud Architect Design Tools Application and how to use it, see [What is Application](https://help.aliyun.com/document_detail/428263.html).
    /// 
    /// &gt; **NOTE:** Available in v1.192.0+.
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
    ///     var @default = new AliCloud.Bp.StudioApplication("default", new()
    ///     {
    ///         ApplicationName = "example_value",
    ///         AreaId = "example_value",
    ///         Configuration = 
    ///         {
    ///             { "enableMonitor", "1" },
    ///         },
    ///         Instances = new[]
    ///         {
    ///             new AliCloud.Bp.Inputs.StudioApplicationInstanceArgs
    ///             {
    ///                 Id = "example_value",
    ///                 NodeName = "example_value",
    ///                 NodeType = "ecs",
    ///             },
    ///         },
    ///         ResourceGroupId = "example_value",
    ///         TemplateId = "example_value",
    ///         Variables = 
    ///         {
    ///             { "test", "1" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Cloud Architect Design Tools Application can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:bp/studioApplication:StudioApplication example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:bp/studioApplication:StudioApplication")]
    public partial class StudioApplication : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the application.
        /// </summary>
        [Output("applicationName")]
        public Output<string> ApplicationName { get; private set; } = null!;

        /// <summary>
        /// The id of the area.
        /// </summary>
        [Output("areaId")]
        public Output<string?> AreaId { get; private set; } = null!;

        /// <summary>
        /// The configuration of the application.
        /// </summary>
        [Output("configuration")]
        public Output<ImmutableDictionary<string, object>?> Configuration { get; private set; } = null!;

        /// <summary>
        /// The instance list. Support the creation of instances in the existing vpc under the application. See the following `Block instances`.
        /// </summary>
        [Output("instances")]
        public Output<ImmutableArray<Outputs.StudioApplicationInstance>> Instances { get; private set; } = null!;

        /// <summary>
        /// The id of the resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The status of the Application.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The id of the template.
        /// </summary>
        [Output("templateId")]
        public Output<string> TemplateId { get; private set; } = null!;

        /// <summary>
        /// The variables of the application.
        /// </summary>
        [Output("variables")]
        public Output<ImmutableDictionary<string, object>?> Variables { get; private set; } = null!;


        /// <summary>
        /// Create a StudioApplication resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StudioApplication(string name, StudioApplicationArgs args, CustomResourceOptions? options = null)
            : base("alicloud:bp/studioApplication:StudioApplication", name, args ?? new StudioApplicationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StudioApplication(string name, Input<string> id, StudioApplicationState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:bp/studioApplication:StudioApplication", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StudioApplication resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StudioApplication Get(string name, Input<string> id, StudioApplicationState? state = null, CustomResourceOptions? options = null)
        {
            return new StudioApplication(name, id, state, options);
        }
    }

    public sealed class StudioApplicationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the application.
        /// </summary>
        [Input("applicationName", required: true)]
        public Input<string> ApplicationName { get; set; } = null!;

        /// <summary>
        /// The id of the area.
        /// </summary>
        [Input("areaId")]
        public Input<string>? AreaId { get; set; }

        [Input("configuration")]
        private InputMap<object>? _configuration;

        /// <summary>
        /// The configuration of the application.
        /// </summary>
        public InputMap<object> Configuration
        {
            get => _configuration ?? (_configuration = new InputMap<object>());
            set => _configuration = value;
        }

        [Input("instances")]
        private InputList<Inputs.StudioApplicationInstanceArgs>? _instances;

        /// <summary>
        /// The instance list. Support the creation of instances in the existing vpc under the application. See the following `Block instances`.
        /// </summary>
        public InputList<Inputs.StudioApplicationInstanceArgs> Instances
        {
            get => _instances ?? (_instances = new InputList<Inputs.StudioApplicationInstanceArgs>());
            set => _instances = value;
        }

        /// <summary>
        /// The id of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The id of the template.
        /// </summary>
        [Input("templateId", required: true)]
        public Input<string> TemplateId { get; set; } = null!;

        [Input("variables")]
        private InputMap<object>? _variables;

        /// <summary>
        /// The variables of the application.
        /// </summary>
        public InputMap<object> Variables
        {
            get => _variables ?? (_variables = new InputMap<object>());
            set => _variables = value;
        }

        public StudioApplicationArgs()
        {
        }
        public static new StudioApplicationArgs Empty => new StudioApplicationArgs();
    }

    public sealed class StudioApplicationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the application.
        /// </summary>
        [Input("applicationName")]
        public Input<string>? ApplicationName { get; set; }

        /// <summary>
        /// The id of the area.
        /// </summary>
        [Input("areaId")]
        public Input<string>? AreaId { get; set; }

        [Input("configuration")]
        private InputMap<object>? _configuration;

        /// <summary>
        /// The configuration of the application.
        /// </summary>
        public InputMap<object> Configuration
        {
            get => _configuration ?? (_configuration = new InputMap<object>());
            set => _configuration = value;
        }

        [Input("instances")]
        private InputList<Inputs.StudioApplicationInstanceGetArgs>? _instances;

        /// <summary>
        /// The instance list. Support the creation of instances in the existing vpc under the application. See the following `Block instances`.
        /// </summary>
        public InputList<Inputs.StudioApplicationInstanceGetArgs> Instances
        {
            get => _instances ?? (_instances = new InputList<Inputs.StudioApplicationInstanceGetArgs>());
            set => _instances = value;
        }

        /// <summary>
        /// The id of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The status of the Application.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The id of the template.
        /// </summary>
        [Input("templateId")]
        public Input<string>? TemplateId { get; set; }

        [Input("variables")]
        private InputMap<object>? _variables;

        /// <summary>
        /// The variables of the application.
        /// </summary>
        public InputMap<object> Variables
        {
            get => _variables ?? (_variables = new InputMap<object>());
            set => _variables = value;
        }

        public StudioApplicationState()
        {
        }
        public static new StudioApplicationState Empty => new StudioApplicationState();
    }
}
