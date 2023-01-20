// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr
{
    public static class GetHanaBackupPlans
    {
        /// <summary>
        /// This data source provides the Hbr Hana Backup Plans of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.179.0+.
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
        ///     var ids = AliCloud.Hbr.GetHanaBackupPlans.Invoke(new()
        ///     {
        ///         ClusterId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["hbrHanaBackupPlanId1"] = ids.Apply(getHanaBackupPlansResult =&gt; getHanaBackupPlansResult.Plans[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetHanaBackupPlansResult> InvokeAsync(GetHanaBackupPlansArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHanaBackupPlansResult>("alicloud:hbr/getHanaBackupPlans:getHanaBackupPlans", args ?? new GetHanaBackupPlansArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Hbr Hana Backup Plans of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.179.0+.
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
        ///     var ids = AliCloud.Hbr.GetHanaBackupPlans.Invoke(new()
        ///     {
        ///         ClusterId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["hbrHanaBackupPlanId1"] = ids.Apply(getHanaBackupPlansResult =&gt; getHanaBackupPlansResult.Plans[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetHanaBackupPlansResult> Invoke(GetHanaBackupPlansInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHanaBackupPlansResult>("alicloud:hbr/getHanaBackupPlans:getHanaBackupPlans", args ?? new GetHanaBackupPlansInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHanaBackupPlansArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the SAP HANA instance.
        /// </summary>
        [Input("clusterId", required: true)]
        public string ClusterId { get; set; } = null!;

        /// <summary>
        /// The name of the database.
        /// </summary>
        [Input("databaseName")]
        public string? DatabaseName { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Hana Backup Plan IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Hana Backup Plan name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        /// <summary>
        /// The ID of the backup vault.
        /// </summary>
        [Input("vaultId")]
        public string? VaultId { get; set; }

        public GetHanaBackupPlansArgs()
        {
        }
        public static new GetHanaBackupPlansArgs Empty => new GetHanaBackupPlansArgs();
    }

    public sealed class GetHanaBackupPlansInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the SAP HANA instance.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The name of the database.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Hana Backup Plan IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Hana Backup Plan name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        /// <summary>
        /// The ID of the backup vault.
        /// </summary>
        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public GetHanaBackupPlansInvokeArgs()
        {
        }
        public static new GetHanaBackupPlansInvokeArgs Empty => new GetHanaBackupPlansInvokeArgs();
    }


    [OutputType]
    public sealed class GetHanaBackupPlansResult
    {
        public readonly string ClusterId;
        public readonly string? DatabaseName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        public readonly ImmutableArray<Outputs.GetHanaBackupPlansPlanResult> Plans;
        public readonly string? VaultId;

        [OutputConstructor]
        private GetHanaBackupPlansResult(
            string clusterId,

            string? databaseName,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            int? pageNumber,

            int? pageSize,

            ImmutableArray<Outputs.GetHanaBackupPlansPlanResult> plans,

            string? vaultId)
        {
            ClusterId = clusterId;
            DatabaseName = databaseName;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
            Plans = plans;
            VaultId = vaultId;
        }
    }
}
