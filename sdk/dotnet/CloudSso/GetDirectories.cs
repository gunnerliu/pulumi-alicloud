// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudSso
{
    public static class GetDirectories
    {
        /// <summary>
        /// This data source provides the Cloud Sso Directories of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.135.0+.
        /// 
        /// &gt; **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
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
        ///     var ids = AliCloud.CloudSso.GetDirectories.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.CloudSso.GetDirectories.Invoke(new()
        ///     {
        ///         NameRegex = "^my-Directory",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cloudSsoDirectoryId1"] = ids.Apply(getDirectoriesResult =&gt; getDirectoriesResult.Directories[0]?.Id),
        ///         ["cloudSsoDirectoryId2"] = nameRegex.Apply(getDirectoriesResult =&gt; getDirectoriesResult.Directories[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDirectoriesResult> InvokeAsync(GetDirectoriesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDirectoriesResult>("alicloud:cloudsso/getDirectories:getDirectories", args ?? new GetDirectoriesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cloud Sso Directories of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.135.0+.
        /// 
        /// &gt; **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
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
        ///     var ids = AliCloud.CloudSso.GetDirectories.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.CloudSso.GetDirectories.Invoke(new()
        ///     {
        ///         NameRegex = "^my-Directory",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cloudSsoDirectoryId1"] = ids.Apply(getDirectoriesResult =&gt; getDirectoriesResult.Directories[0]?.Id),
        ///         ["cloudSsoDirectoryId2"] = nameRegex.Apply(getDirectoriesResult =&gt; getDirectoriesResult.Directories[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDirectoriesResult> Invoke(GetDirectoriesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDirectoriesResult>("alicloud:cloudsso/getDirectories:getDirectories", args ?? new GetDirectoriesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDirectoriesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Directory IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Directory name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetDirectoriesArgs()
        {
        }
        public static new GetDirectoriesArgs Empty => new GetDirectoriesArgs();
    }

    public sealed class GetDirectoriesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Directory IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Directory name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetDirectoriesInvokeArgs()
        {
        }
        public static new GetDirectoriesInvokeArgs Empty => new GetDirectoriesInvokeArgs();
    }


    [OutputType]
    public sealed class GetDirectoriesResult
    {
        public readonly ImmutableArray<Outputs.GetDirectoriesDirectoryResult> Directories;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetDirectoriesResult(
            ImmutableArray<Outputs.GetDirectoriesDirectoryResult> directories,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            Directories = directories;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
