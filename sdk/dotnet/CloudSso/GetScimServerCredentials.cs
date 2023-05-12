// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudSso
{
    public static class GetScimServerCredentials
    {
        /// <summary>
        /// This data source provides the Cloud Sso Scim Server Credentials of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.138.0+.
        /// 
        /// &gt; **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.CloudSso.GetScimServerCredentials.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cloudSsoScimServerCredentialId1"] = ids.Apply(getScimServerCredentialsResult =&gt; getScimServerCredentialsResult.Credentials[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetScimServerCredentialsResult> InvokeAsync(GetScimServerCredentialsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetScimServerCredentialsResult>("alicloud:cloudsso/getScimServerCredentials:getScimServerCredentials", args ?? new GetScimServerCredentialsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cloud Sso Scim Server Credentials of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.138.0+.
        /// 
        /// &gt; **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.CloudSso.GetScimServerCredentials.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cloudSsoScimServerCredentialId1"] = ids.Apply(getScimServerCredentialsResult =&gt; getScimServerCredentialsResult.Credentials[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetScimServerCredentialsResult> Invoke(GetScimServerCredentialsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetScimServerCredentialsResult>("alicloud:cloudsso/getScimServerCredentials:getScimServerCredentials", args ?? new GetScimServerCredentialsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetScimServerCredentialsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Directory.
        /// </summary>
        [Input("directoryId", required: true)]
        public string DirectoryId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of SCIM Server Credential IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The Status of the resource. Valid values: `Disabled`, `Enabled`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetScimServerCredentialsArgs()
        {
        }
        public static new GetScimServerCredentialsArgs Empty => new GetScimServerCredentialsArgs();
    }

    public sealed class GetScimServerCredentialsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Directory.
        /// </summary>
        [Input("directoryId", required: true)]
        public Input<string> DirectoryId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of SCIM Server Credential IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The Status of the resource. Valid values: `Disabled`, `Enabled`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetScimServerCredentialsInvokeArgs()
        {
        }
        public static new GetScimServerCredentialsInvokeArgs Empty => new GetScimServerCredentialsInvokeArgs();
    }


    [OutputType]
    public sealed class GetScimServerCredentialsResult
    {
        public readonly ImmutableArray<Outputs.GetScimServerCredentialsCredentialResult> Credentials;
        public readonly string DirectoryId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly string? Status;

        [OutputConstructor]
        private GetScimServerCredentialsResult(
            ImmutableArray<Outputs.GetScimServerCredentialsCredentialResult> credentials,

            string directoryId,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            string? status)
        {
            Credentials = credentials;
            DirectoryId = directoryId;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Status = status;
        }
    }
}
