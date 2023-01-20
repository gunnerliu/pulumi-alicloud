// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eds
{
    public static class GetCustomProperties
    {
        /// <summary>
        /// This data source provides the Ecd Custom Properties of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.176.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var ids = AliCloud.Eds.GetCustomProperties.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ecdCustomPropertyId1"] = ids.Apply(getCustomPropertiesResult =&gt; getCustomPropertiesResult.Properties[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCustomPropertiesResult> InvokeAsync(GetCustomPropertiesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCustomPropertiesResult>("alicloud:eds/getCustomProperties:getCustomProperties", args ?? new GetCustomPropertiesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ecd Custom Properties of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.176.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var ids = AliCloud.Eds.GetCustomProperties.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ecdCustomPropertyId1"] = ids.Apply(getCustomPropertiesResult =&gt; getCustomPropertiesResult.Properties[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCustomPropertiesResult> Invoke(GetCustomPropertiesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCustomPropertiesResult>("alicloud:eds/getCustomProperties:getCustomProperties", args ?? new GetCustomPropertiesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCustomPropertiesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Custom Property IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetCustomPropertiesArgs()
        {
        }
        public static new GetCustomPropertiesArgs Empty => new GetCustomPropertiesArgs();
    }

    public sealed class GetCustomPropertiesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Custom Property IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetCustomPropertiesInvokeArgs()
        {
        }
        public static new GetCustomPropertiesInvokeArgs Empty => new GetCustomPropertiesInvokeArgs();
    }


    [OutputType]
    public sealed class GetCustomPropertiesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetCustomPropertiesPropertyResult> Properties;

        [OutputConstructor]
        private GetCustomPropertiesResult(
            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetCustomPropertiesPropertyResult> properties)
        {
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Properties = properties;
        }
    }
}
