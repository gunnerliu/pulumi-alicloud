// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ots
{
    /// <summary>
    /// Provides an OTS secondary index resource.
    /// 
    /// For information about OTS secondary index and how to use it, see [Secondary index overview](https://www.alibabacloud.com/help/en/tablestore/latest/secondary-index-overview).
    /// 
    /// &gt; **NOTE:** Available in v1.187.0+.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraformtest";
    ///     var pks = config.GetObject&lt;string[]&gt;("pks") ?? new[]
    ///     {
    ///         "pk1",
    ///         "pk2",
    ///         "pk3",
    ///     };
    ///     var definedCols = config.GetObject&lt;string[]&gt;("definedCols") ?? new[]
    ///     {
    ///         "col1",
    ///         "col2",
    ///         "col3",
    ///     };
    ///     var instance1 = new AliCloud.Ots.Instance("instance1", new()
    ///     {
    ///         Description = name,
    ///         AccessedBy = "Any",
    ///         Tags = 
    ///         {
    ///             { "Created", "TF" },
    ///             { "For", "acceptance test" },
    ///         },
    ///     });
    /// 
    ///     var table1 = new AliCloud.Ots.Table("table1", new()
    ///     {
    ///         InstanceName = instance1.Name,
    ///         TableName = name,
    ///         PrimaryKeys = new[]
    ///         {
    ///             new AliCloud.Ots.Inputs.TablePrimaryKeyArgs
    ///             {
    ///                 Name = "pk1",
    ///                 Type = "Integer",
    ///             },
    ///             new AliCloud.Ots.Inputs.TablePrimaryKeyArgs
    ///             {
    ///                 Name = "pk2",
    ///                 Type = "String",
    ///             },
    ///             new AliCloud.Ots.Inputs.TablePrimaryKeyArgs
    ///             {
    ///                 Name = "pk3",
    ///                 Type = "Binary",
    ///             },
    ///         },
    ///         DefinedColumns = new[]
    ///         {
    ///             new AliCloud.Ots.Inputs.TableDefinedColumnArgs
    ///             {
    ///                 Name = "col1",
    ///                 Type = "Integer",
    ///             },
    ///             new AliCloud.Ots.Inputs.TableDefinedColumnArgs
    ///             {
    ///                 Name = "col2",
    ///                 Type = "String",
    ///             },
    ///             new AliCloud.Ots.Inputs.TableDefinedColumnArgs
    ///             {
    ///                 Name = "col3",
    ///                 Type = "Binary",
    ///             },
    ///         },
    ///         TimeToLive = -1,
    ///         MaxVersion = 1,
    ///         DeviationCellVersionInSec = "1",
    ///     });
    /// 
    ///     var index1 = new AliCloud.Ots.SecondaryIndex("index1", new()
    ///     {
    ///         InstanceName = instance1.Name,
    ///         TableName = table1.TableName,
    ///         IndexName = name,
    ///         IndexType = "Global",
    ///         IncludeBaseData = true,
    ///         PrimaryKeys = pks,
    ///         DefinedColumns = definedCols,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// OTS secondary index can be imported using id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ots/secondaryIndex:SecondaryIndex index1 &lt;instance_name&gt;:&lt;table_name&gt;:&lt;index_name&gt;:&lt;index_type&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ots/secondaryIndex:SecondaryIndex")]
    public partial class SecondaryIndex : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A list of defined column for index, referenced from Table's primary keys or predefined columns.
        /// </summary>
        [Output("definedColumns")]
        public Output<ImmutableArray<string>> DefinedColumns { get; private set; } = null!;

        /// <summary>
        /// whether the index contains data that already exists in the data table. When include_base_data is set to true, it means that stock data is included.
        /// </summary>
        [Output("includeBaseData")]
        public Output<bool> IncludeBaseData { get; private set; } = null!;

        /// <summary>
        /// The index name of the OTS Table. If changed, a new index would be created.
        /// </summary>
        [Output("indexName")]
        public Output<string> IndexName { get; private set; } = null!;

        /// <summary>
        /// The index type of the OTS Table. If changed, a new index would be created, only `Global` or `Local` is allowed.
        /// </summary>
        [Output("indexType")]
        public Output<string> IndexType { get; private set; } = null!;

        /// <summary>
        /// The name of the OTS instance in which table will located.
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        /// <summary>
        /// A list of primary keys for index, referenced from Table's primary keys or predefined columns.
        /// </summary>
        [Output("primaryKeys")]
        public Output<ImmutableArray<string>> PrimaryKeys { get; private set; } = null!;

        /// <summary>
        /// The name of the OTS table. If changed, a new table would be created.
        /// </summary>
        [Output("tableName")]
        public Output<string> TableName { get; private set; } = null!;


        /// <summary>
        /// Create a SecondaryIndex resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecondaryIndex(string name, SecondaryIndexArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ots/secondaryIndex:SecondaryIndex", name, args ?? new SecondaryIndexArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecondaryIndex(string name, Input<string> id, SecondaryIndexState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ots/secondaryIndex:SecondaryIndex", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SecondaryIndex resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecondaryIndex Get(string name, Input<string> id, SecondaryIndexState? state = null, CustomResourceOptions? options = null)
        {
            return new SecondaryIndex(name, id, state, options);
        }
    }

    public sealed class SecondaryIndexArgs : global::Pulumi.ResourceArgs
    {
        [Input("definedColumns")]
        private InputList<string>? _definedColumns;

        /// <summary>
        /// A list of defined column for index, referenced from Table's primary keys or predefined columns.
        /// </summary>
        public InputList<string> DefinedColumns
        {
            get => _definedColumns ?? (_definedColumns = new InputList<string>());
            set => _definedColumns = value;
        }

        /// <summary>
        /// whether the index contains data that already exists in the data table. When include_base_data is set to true, it means that stock data is included.
        /// </summary>
        [Input("includeBaseData", required: true)]
        public Input<bool> IncludeBaseData { get; set; } = null!;

        /// <summary>
        /// The index name of the OTS Table. If changed, a new index would be created.
        /// </summary>
        [Input("indexName", required: true)]
        public Input<string> IndexName { get; set; } = null!;

        /// <summary>
        /// The index type of the OTS Table. If changed, a new index would be created, only `Global` or `Local` is allowed.
        /// </summary>
        [Input("indexType", required: true)]
        public Input<string> IndexType { get; set; } = null!;

        /// <summary>
        /// The name of the OTS instance in which table will located.
        /// </summary>
        [Input("instanceName", required: true)]
        public Input<string> InstanceName { get; set; } = null!;

        [Input("primaryKeys", required: true)]
        private InputList<string>? _primaryKeys;

        /// <summary>
        /// A list of primary keys for index, referenced from Table's primary keys or predefined columns.
        /// </summary>
        public InputList<string> PrimaryKeys
        {
            get => _primaryKeys ?? (_primaryKeys = new InputList<string>());
            set => _primaryKeys = value;
        }

        /// <summary>
        /// The name of the OTS table. If changed, a new table would be created.
        /// </summary>
        [Input("tableName", required: true)]
        public Input<string> TableName { get; set; } = null!;

        public SecondaryIndexArgs()
        {
        }
        public static new SecondaryIndexArgs Empty => new SecondaryIndexArgs();
    }

    public sealed class SecondaryIndexState : global::Pulumi.ResourceArgs
    {
        [Input("definedColumns")]
        private InputList<string>? _definedColumns;

        /// <summary>
        /// A list of defined column for index, referenced from Table's primary keys or predefined columns.
        /// </summary>
        public InputList<string> DefinedColumns
        {
            get => _definedColumns ?? (_definedColumns = new InputList<string>());
            set => _definedColumns = value;
        }

        /// <summary>
        /// whether the index contains data that already exists in the data table. When include_base_data is set to true, it means that stock data is included.
        /// </summary>
        [Input("includeBaseData")]
        public Input<bool>? IncludeBaseData { get; set; }

        /// <summary>
        /// The index name of the OTS Table. If changed, a new index would be created.
        /// </summary>
        [Input("indexName")]
        public Input<string>? IndexName { get; set; }

        /// <summary>
        /// The index type of the OTS Table. If changed, a new index would be created, only `Global` or `Local` is allowed.
        /// </summary>
        [Input("indexType")]
        public Input<string>? IndexType { get; set; }

        /// <summary>
        /// The name of the OTS instance in which table will located.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        [Input("primaryKeys")]
        private InputList<string>? _primaryKeys;

        /// <summary>
        /// A list of primary keys for index, referenced from Table's primary keys or predefined columns.
        /// </summary>
        public InputList<string> PrimaryKeys
        {
            get => _primaryKeys ?? (_primaryKeys = new InputList<string>());
            set => _primaryKeys = value;
        }

        /// <summary>
        /// The name of the OTS table. If changed, a new table would be created.
        /// </summary>
        [Input("tableName")]
        public Input<string>? TableName { get; set; }

        public SecondaryIndexState()
        {
        }
        public static new SecondaryIndexState Empty => new SecondaryIndexState();
    }
}
