// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Kms
{
    public static class GetKeys
    {
        /// <summary>
        /// This data source provides a list of KMS keys in an Alibaba Cloud account according to the specified filters.
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
        ///     var kmsKeysDs = AliCloud.Kms.GetKeys.Invoke(new()
        ///     {
        ///         DescriptionRegex = "Hello KMS",
        ///         OutputFile = "kms_keys.json",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstKeyId"] = kmsKeysDs.Apply(getKeysResult =&gt; getKeysResult.Keys[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetKeysResult> InvokeAsync(GetKeysArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKeysResult>("alicloud:kms/getKeys:getKeys", args ?? new GetKeysArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of KMS keys in an Alibaba Cloud account according to the specified filters.
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
        ///     var kmsKeysDs = AliCloud.Kms.GetKeys.Invoke(new()
        ///     {
        ///         DescriptionRegex = "Hello KMS",
        ///         OutputFile = "kms_keys.json",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstKeyId"] = kmsKeysDs.Apply(getKeysResult =&gt; getKeysResult.Keys[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetKeysResult> Invoke(GetKeysInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKeysResult>("alicloud:kms/getKeys:getKeys", args ?? new GetKeysInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKeysArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A regex string to filter the results by the KMS key description.
        /// </summary>
        [Input("descriptionRegex")]
        public string? DescriptionRegex { get; set; }

        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        /// <summary>
        /// The CMK filter. The filter consists of one or more key-value pairs. 
        /// You can specify a maximum of 10 key-value pairs. More details see API [ListKeys](https://www.alibabacloud.com/help/en/key-management-service/latest/listkeys).
        /// </summary>
        [Input("filters")]
        public string? Filters { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of KMS key IDs.
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
        /// Filter the results by status of the KMS keys. Valid values: `Enabled`, `Disabled`, `PendingDeletion`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetKeysArgs()
        {
        }
        public static new GetKeysArgs Empty => new GetKeysArgs();
    }

    public sealed class GetKeysInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A regex string to filter the results by the KMS key description.
        /// </summary>
        [Input("descriptionRegex")]
        public Input<string>? DescriptionRegex { get; set; }

        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        /// <summary>
        /// The CMK filter. The filter consists of one or more key-value pairs. 
        /// You can specify a maximum of 10 key-value pairs. More details see API [ListKeys](https://www.alibabacloud.com/help/en/key-management-service/latest/listkeys).
        /// </summary>
        [Input("filters")]
        public Input<string>? Filters { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of KMS key IDs.
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
        /// Filter the results by status of the KMS keys. Valid values: `Enabled`, `Disabled`, `PendingDeletion`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetKeysInvokeArgs()
        {
        }
        public static new GetKeysInvokeArgs Empty => new GetKeysInvokeArgs();
    }


    [OutputType]
    public sealed class GetKeysResult
    {
        public readonly string? DescriptionRegex;
        public readonly bool? EnableDetails;
        public readonly string? Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of KMS key IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// A list of KMS keys. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKeysKeyResult> Keys;
        public readonly string? OutputFile;
        /// <summary>
        /// Status of the key. Possible values: `Enabled`, `Disabled` and `PendingDeletion`.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetKeysResult(
            string? descriptionRegex,

            bool? enableDetails,

            string? filters,

            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetKeysKeyResult> keys,

            string? outputFile,

            string? status)
        {
            DescriptionRegex = descriptionRegex;
            EnableDetails = enableDetails;
            Filters = filters;
            Id = id;
            Ids = ids;
            Keys = keys;
            OutputFile = outputFile;
            Status = status;
        }
    }
}
