// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr
{
    public static class GetOssBackupPlans
    {
        /// <summary>
        /// This data source provides the Hbr OssBackupPlans of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.131.0+.
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
        ///     var ids = AliCloud.Hbr.GetOssBackupPlans.Invoke(new()
        ///     {
        ///         NameRegex = "^my-OssBackupPlan",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["hbrOssBackupPlanId"] = ids.Apply(getOssBackupPlansResult =&gt; getOssBackupPlansResult.Plans[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetOssBackupPlansResult> InvokeAsync(GetOssBackupPlansArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOssBackupPlansResult>("alicloud:hbr/getOssBackupPlans:getOssBackupPlans", args ?? new GetOssBackupPlansArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Hbr OssBackupPlans of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.131.0+.
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
        ///     var ids = AliCloud.Hbr.GetOssBackupPlans.Invoke(new()
        ///     {
        ///         NameRegex = "^my-OssBackupPlan",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["hbrOssBackupPlanId"] = ids.Apply(getOssBackupPlansResult =&gt; getOssBackupPlansResult.Plans[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetOssBackupPlansResult> Invoke(GetOssBackupPlansInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOssBackupPlansResult>("alicloud:hbr/getOssBackupPlans:getOssBackupPlans", args ?? new GetOssBackupPlansInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOssBackupPlansArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of OSS bucket.
        /// </summary>
        [Input("bucket")]
        public string? Bucket { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of OssBackupPlan IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by OssBackupPlan name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of backup vault.
        /// </summary>
        [Input("vaultId")]
        public string? VaultId { get; set; }

        public GetOssBackupPlansArgs()
        {
        }
        public static new GetOssBackupPlansArgs Empty => new GetOssBackupPlansArgs();
    }

    public sealed class GetOssBackupPlansInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of OSS bucket.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of OssBackupPlan IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by OssBackupPlan name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of backup vault.
        /// </summary>
        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public GetOssBackupPlansInvokeArgs()
        {
        }
        public static new GetOssBackupPlansInvokeArgs Empty => new GetOssBackupPlansInvokeArgs();
    }


    [OutputType]
    public sealed class GetOssBackupPlansResult
    {
        public readonly string? Bucket;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetOssBackupPlansPlanResult> Plans;
        public readonly string? VaultId;

        [OutputConstructor]
        private GetOssBackupPlansResult(
            string? bucket,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetOssBackupPlansPlanResult> plans,

            string? vaultId)
        {
            Bucket = bucket;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Plans = plans;
            VaultId = vaultId;
        }
    }
}
