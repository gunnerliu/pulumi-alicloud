// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss
{
    public static class GetTables
    {
        /// <summary>
        /// This data source provides the ots tables of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.40.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var tablesDs = Output.Create(AliCloud.Oss.GetTables.InvokeAsync(new AliCloud.Oss.GetTablesArgs
        ///         {
        ///             InstanceName = "sample-instance",
        ///             NameRegex = "sample-table",
        ///             OutputFile = "tables.txt",
        ///         }));
        ///         this.FirstTableId = tablesDs.Apply(tablesDs =&gt; tablesDs.Tables[0].Id);
        ///     }
        /// 
        ///     [Output("firstTableId")]
        ///     public Output&lt;string&gt; FirstTableId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetTablesResult> InvokeAsync(GetTablesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetTablesResult>("alicloud:oss/getTables:getTables", args ?? new GetTablesArgs(), options.WithVersion());
    }


    public sealed class GetTablesArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of table IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The name of OTS instance.
        /// </summary>
        [Input("instanceName", required: true)]
        public string InstanceName { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by table name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetTablesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetTablesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of table IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// The OTS instance name.
        /// </summary>
        public readonly string InstanceName;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of table names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of tables. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTablesTableResult> Tables;

        [OutputConstructor]
        private GetTablesResult(
            string id,

            ImmutableArray<string> ids,

            string instanceName,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetTablesTableResult> tables)
        {
            Id = id;
            Ids = ids;
            InstanceName = instanceName;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Tables = tables;
        }
    }
}
