// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Kms
{
    public static class GetKeyVersions
    {
        /// <summary>
        /// This data source provides a list of KMS KeyVersions in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; NOTE: Available in v1.85.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var alicloudKmsKeyVersionsDs = AliCloud.Kms.GetKeyVersions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "d89e8a53-b708-41aa-8c67-6873axxx",
        ///         },
        ///         KeyId = "08438c-b4d5-4d05-928c-07b7xxxx",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["allVersions"] = alicloudKmsKeyVersionsDs.Apply(getKeyVersionsResult =&gt; getKeyVersionsResult.Versions),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetKeyVersionsResult> InvokeAsync(GetKeyVersionsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKeyVersionsResult>("alicloud:kms/getKeyVersions:getKeyVersions", args ?? new GetKeyVersionsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of KMS KeyVersions in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; NOTE: Available in v1.85.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var alicloudKmsKeyVersionsDs = AliCloud.Kms.GetKeyVersions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "d89e8a53-b708-41aa-8c67-6873axxx",
        ///         },
        ///         KeyId = "08438c-b4d5-4d05-928c-07b7xxxx",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["allVersions"] = alicloudKmsKeyVersionsDs.Apply(getKeyVersionsResult =&gt; getKeyVersionsResult.Versions),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetKeyVersionsResult> Invoke(GetKeyVersionsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKeyVersionsResult>("alicloud:kms/getKeyVersions:getKeyVersions", args ?? new GetKeyVersionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKeyVersionsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of KMS KeyVersion IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The id of kms key.
        /// </summary>
        [Input("keyId", required: true)]
        public string KeyId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetKeyVersionsArgs()
        {
        }
        public static new GetKeyVersionsArgs Empty => new GetKeyVersionsArgs();
    }

    public sealed class GetKeyVersionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of KMS KeyVersion IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The id of kms key.
        /// </summary>
        [Input("keyId", required: true)]
        public Input<string> KeyId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetKeyVersionsInvokeArgs()
        {
        }
        public static new GetKeyVersionsInvokeArgs Empty => new GetKeyVersionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetKeyVersionsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of KMS KeyVersion IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// ID of the key.
        /// </summary>
        public readonly string KeyId;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of KMS KeyVersions. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKeyVersionsVersionResult> Versions;

        [OutputConstructor]
        private GetKeyVersionsResult(
            string id,

            ImmutableArray<string> ids,

            string keyId,

            string? outputFile,

            ImmutableArray<Outputs.GetKeyVersionsVersionResult> versions)
        {
            Id = id;
            Ids = ids;
            KeyId = keyId;
            OutputFile = outputFile;
            Versions = versions;
        }
    }
}
