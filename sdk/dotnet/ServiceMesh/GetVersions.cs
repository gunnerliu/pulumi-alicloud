// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh
{
    public static class GetVersions
    {
        /// <summary>
        /// This data source provides ASM available versions in the specified region.
        /// 
        /// &gt; **NOTE:** Available in v1.161.0+.
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
        ///     var @default = AliCloud.ServiceMesh.GetVersions.Invoke(new()
        ///     {
        ///         Edition = "Default",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["serviceMeshVersion"] = data.Alicloud_service_mesh_versions.Versions[0].Version,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVersionsResult> InvokeAsync(GetVersionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVersionsResult>("alicloud:servicemesh/getVersions:getVersions", args ?? new GetVersionsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides ASM available versions in the specified region.
        /// 
        /// &gt; **NOTE:** Available in v1.161.0+.
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
        ///     var @default = AliCloud.ServiceMesh.GetVersions.Invoke(new()
        ///     {
        ///         Edition = "Default",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["serviceMeshVersion"] = data.Alicloud_service_mesh_versions.Versions[0].Version,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVersionsResult> Invoke(GetVersionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVersionsResult>("alicloud:servicemesh/getVersions:getVersions", args ?? new GetVersionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVersionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The edition of the ASM instance.
        /// </summary>
        [Input("edition")]
        public string? Edition { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of ASM versions. Its element formats as `&lt;edition&gt;:&lt;version&gt;`.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetVersionsArgs()
        {
        }
        public static new GetVersionsArgs Empty => new GetVersionsArgs();
    }

    public sealed class GetVersionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The edition of the ASM instance.
        /// </summary>
        [Input("edition")]
        public Input<string>? Edition { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of ASM versions. Its element formats as `&lt;edition&gt;:&lt;version&gt;`.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetVersionsInvokeArgs()
        {
        }
        public static new GetVersionsInvokeArgs Empty => new GetVersionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetVersionsResult
    {
        public readonly string? Edition;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetVersionsVersionResult> Versions;

        [OutputConstructor]
        private GetVersionsResult(
            string? edition,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetVersionsVersionResult> versions)
        {
            Edition = edition;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Versions = versions;
        }
    }
}
