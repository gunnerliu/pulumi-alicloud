// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.AliCloud.Oos
{
    public static class GetParameters
    {
        /// <summary>
        /// This data source provides the Oos Parameters of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.147.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///         var ids = Output.Create(AliCloud.Oos.GetParameters.InvokeAsync(new AliCloud.Oos.GetParametersArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "my-Parameter",
        ///             },
        ///         }));
        ///         this.OosParameterId1 = ids.Apply(ids =&gt; ids.Parameters?[0]?.Id);
        ///         var nameRegex = Output.Create(AliCloud.Oos.GetParameters.InvokeAsync(new AliCloud.Oos.GetParametersArgs
        ///         {
        ///             NameRegex = "^my-Parameter",
        ///         }));
        ///         this.OosParameterId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Parameters?[0]?.Id);
        ///         var resourceGroupId = Output.Create(AliCloud.Oos.GetParameters.InvokeAsync(new AliCloud.Oos.GetParametersArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "my-Parameter",
        ///             },
        ///             ResourceGroupId = "example_value",
        ///         }));
        ///         this.OosParameterId3 = resourceGroupId.Apply(resourceGroupId =&gt; resourceGroupId.Parameters?[0]?.Id);
        ///         var tags = Output.Create(AliCloud.Oos.GetParameters.InvokeAsync(new AliCloud.Oos.GetParametersArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "my-Parameter",
        ///             },
        ///             Tags = 
        ///             {
        ///                 { "Created", "TF" },
        ///                 { "For", "OosParameter" },
        ///             },
        ///         }));
        ///         this.OosParameterId4 = tags.Apply(tags =&gt; tags.Parameters?[0]?.Id);
        ///     }
        /// 
        ///     [Output("oosParameterId1")]
        ///     public Output&lt;string&gt; OosParameterId1 { get; set; }
        ///     [Output("oosParameterId2")]
        ///     public Output&lt;string&gt; OosParameterId2 { get; set; }
        ///     [Output("oosParameterId3")]
        ///     public Output&lt;string&gt; OosParameterId3 { get; set; }
        ///     [Output("oosParameterId4")]
        ///     public Output&lt;string&gt; OosParameterId4 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetParametersResult> InvokeAsync(GetParametersArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetParametersResult>("alicloud:oos/getParameters:getParameters", args ?? new GetParametersArgs(), options.WithVersion());

        /// <summary>
        /// This data source provides the Oos Parameters of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.147.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///         var ids = Output.Create(AliCloud.Oos.GetParameters.InvokeAsync(new AliCloud.Oos.GetParametersArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "my-Parameter",
        ///             },
        ///         }));
        ///         this.OosParameterId1 = ids.Apply(ids =&gt; ids.Parameters?[0]?.Id);
        ///         var nameRegex = Output.Create(AliCloud.Oos.GetParameters.InvokeAsync(new AliCloud.Oos.GetParametersArgs
        ///         {
        ///             NameRegex = "^my-Parameter",
        ///         }));
        ///         this.OosParameterId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Parameters?[0]?.Id);
        ///         var resourceGroupId = Output.Create(AliCloud.Oos.GetParameters.InvokeAsync(new AliCloud.Oos.GetParametersArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "my-Parameter",
        ///             },
        ///             ResourceGroupId = "example_value",
        ///         }));
        ///         this.OosParameterId3 = resourceGroupId.Apply(resourceGroupId =&gt; resourceGroupId.Parameters?[0]?.Id);
        ///         var tags = Output.Create(AliCloud.Oos.GetParameters.InvokeAsync(new AliCloud.Oos.GetParametersArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "my-Parameter",
        ///             },
        ///             Tags = 
        ///             {
        ///                 { "Created", "TF" },
        ///                 { "For", "OosParameter" },
        ///             },
        ///         }));
        ///         this.OosParameterId4 = tags.Apply(tags =&gt; tags.Parameters?[0]?.Id);
        ///     }
        /// 
        ///     [Output("oosParameterId1")]
        ///     public Output&lt;string&gt; OosParameterId1 { get; set; }
        ///     [Output("oosParameterId2")]
        ///     public Output&lt;string&gt; OosParameterId2 { get; set; }
        ///     [Output("oosParameterId3")]
        ///     public Output&lt;string&gt; OosParameterId3 { get; set; }
        ///     [Output("oosParameterId4")]
        ///     public Output&lt;string&gt; OosParameterId4 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetParametersResult> Invoke(GetParametersInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetParametersResult>("alicloud:oos/getParameters:getParameters", args ?? new GetParametersInvokeArgs(), options.WithVersion());
    }


    public sealed class GetParametersArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Parameter IDs. Its element value is same as Parameter Name.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Parameter name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The name of the common parameter.
        /// </summary>
        [Input("parameterName")]
        public string? ParameterName { get; set; }

        /// <summary>
        /// The ID of the Resource Group.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        [Input("sortField")]
        public string? SortField { get; set; }

        [Input("sortOrder")]
        public string? SortOrder { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        /// <summary>
        /// The data type of the common parameter.
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        public GetParametersArgs()
        {
        }
    }

    public sealed class GetParametersInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Parameter IDs. Its element value is same as Parameter Name.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Parameter name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The name of the common parameter.
        /// </summary>
        [Input("parameterName")]
        public Input<string>? ParameterName { get; set; }

        /// <summary>
        /// The ID of the Resource Group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("sortField")]
        public Input<string>? SortField { get; set; }

        [Input("sortOrder")]
        public Input<string>? SortOrder { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// The tag of the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The data type of the common parameter.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public GetParametersInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetParametersResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? ParameterName;
        public readonly ImmutableArray<Outputs.GetParametersParameterResult> Parameters;
        public readonly string? ResourceGroupId;
        public readonly string? SortField;
        public readonly string? SortOrder;
        public readonly ImmutableDictionary<string, object>? Tags;
        public readonly string? Type;

        [OutputConstructor]
        private GetParametersResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? parameterName,

            ImmutableArray<Outputs.GetParametersParameterResult> parameters,

            string? resourceGroupId,

            string? sortField,

            string? sortOrder,

            ImmutableDictionary<string, object>? tags,

            string? type)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ParameterName = parameterName;
            Parameters = parameters;
            ResourceGroupId = resourceGroupId;
            SortField = sortField;
            SortOrder = sortOrder;
            Tags = tags;
            Type = type;
        }
    }
}