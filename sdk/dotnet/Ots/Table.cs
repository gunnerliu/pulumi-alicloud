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
    /// Provides an OTS table resource.
    /// 
    /// &gt; **NOTE:** From Provider version 1.10.0, the provider field 'ots_instance_name' has been deprecated and
    /// you should use resource alicloud_ots_table's new field 'instance_name' and 'table_name' to re-import this resource.
    /// 
    /// &gt; **NOTE:** Available since v1.9.2.
    /// 
    /// ## Import
    /// 
    /// OTS table can be imported using id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ots/table:Table table my-ots:ots_table
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ots/table:Table")]
    public partial class Table : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The property of `TableMeta` which indicates the structure information of a table. It describes the attribute value of defined column. The number of `defined_column` should not be more than 32. See `defined_column` below.
        /// </summary>
        [Output("definedColumns")]
        public Output<ImmutableArray<Outputs.TableDefinedColumn>> DefinedColumns { get; private set; } = null!;

        /// <summary>
        /// The max version offset of the table. The valid value is 1-9223372036854775807. Defaults to 86400.
        /// </summary>
        [Output("deviationCellVersionInSec")]
        public Output<string?> DeviationCellVersionInSec { get; private set; } = null!;

        /// <summary>
        /// Whether enable OTS server side encryption. Default value is false.
        /// </summary>
        [Output("enableSse")]
        public Output<bool?> EnableSse { get; private set; } = null!;

        /// <summary>
        /// The name of the OTS instance in which table will located.
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        /// <summary>
        /// The maximum number of versions stored in this table. The valid value is 1-2147483647.
        /// </summary>
        [Output("maxVersion")]
        public Output<int> MaxVersion { get; private set; } = null!;

        /// <summary>
        /// The property of `TableMeta` which indicates the structure information of a table. It describes the attribute value of primary key. The number of `primary_key` should not be less than one and not be more than four. See `primary_key` below.
        /// </summary>
        [Output("primaryKeys")]
        public Output<ImmutableArray<Outputs.TablePrimaryKey>> PrimaryKeys { get; private set; } = null!;

        /// <summary>
        /// The key type of OTS server side encryption. Only `SSE_KMS_SERVICE` is allowed.
        /// </summary>
        [Output("sseKeyType")]
        public Output<string?> SseKeyType { get; private set; } = null!;

        /// <summary>
        /// The table name of the OTS instance. If changed, a new table would be created.
        /// </summary>
        [Output("tableName")]
        public Output<string> TableName { get; private set; } = null!;

        /// <summary>
        /// The retention time of data stored in this table (unit: second). The value maximum is 2147483647 and -1 means never expired.
        /// </summary>
        [Output("timeToLive")]
        public Output<int> TimeToLive { get; private set; } = null!;


        /// <summary>
        /// Create a Table resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Table(string name, TableArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ots/table:Table", name, args ?? new TableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Table(string name, Input<string> id, TableState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ots/table:Table", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Table resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Table Get(string name, Input<string> id, TableState? state = null, CustomResourceOptions? options = null)
        {
            return new Table(name, id, state, options);
        }
    }

    public sealed class TableArgs : global::Pulumi.ResourceArgs
    {
        [Input("definedColumns")]
        private InputList<Inputs.TableDefinedColumnArgs>? _definedColumns;

        /// <summary>
        /// The property of `TableMeta` which indicates the structure information of a table. It describes the attribute value of defined column. The number of `defined_column` should not be more than 32. See `defined_column` below.
        /// </summary>
        public InputList<Inputs.TableDefinedColumnArgs> DefinedColumns
        {
            get => _definedColumns ?? (_definedColumns = new InputList<Inputs.TableDefinedColumnArgs>());
            set => _definedColumns = value;
        }

        /// <summary>
        /// The max version offset of the table. The valid value is 1-9223372036854775807. Defaults to 86400.
        /// </summary>
        [Input("deviationCellVersionInSec")]
        public Input<string>? DeviationCellVersionInSec { get; set; }

        /// <summary>
        /// Whether enable OTS server side encryption. Default value is false.
        /// </summary>
        [Input("enableSse")]
        public Input<bool>? EnableSse { get; set; }

        /// <summary>
        /// The name of the OTS instance in which table will located.
        /// </summary>
        [Input("instanceName", required: true)]
        public Input<string> InstanceName { get; set; } = null!;

        /// <summary>
        /// The maximum number of versions stored in this table. The valid value is 1-2147483647.
        /// </summary>
        [Input("maxVersion", required: true)]
        public Input<int> MaxVersion { get; set; } = null!;

        [Input("primaryKeys", required: true)]
        private InputList<Inputs.TablePrimaryKeyArgs>? _primaryKeys;

        /// <summary>
        /// The property of `TableMeta` which indicates the structure information of a table. It describes the attribute value of primary key. The number of `primary_key` should not be less than one and not be more than four. See `primary_key` below.
        /// </summary>
        public InputList<Inputs.TablePrimaryKeyArgs> PrimaryKeys
        {
            get => _primaryKeys ?? (_primaryKeys = new InputList<Inputs.TablePrimaryKeyArgs>());
            set => _primaryKeys = value;
        }

        /// <summary>
        /// The key type of OTS server side encryption. Only `SSE_KMS_SERVICE` is allowed.
        /// </summary>
        [Input("sseKeyType")]
        public Input<string>? SseKeyType { get; set; }

        /// <summary>
        /// The table name of the OTS instance. If changed, a new table would be created.
        /// </summary>
        [Input("tableName", required: true)]
        public Input<string> TableName { get; set; } = null!;

        /// <summary>
        /// The retention time of data stored in this table (unit: second). The value maximum is 2147483647 and -1 means never expired.
        /// </summary>
        [Input("timeToLive", required: true)]
        public Input<int> TimeToLive { get; set; } = null!;

        public TableArgs()
        {
        }
        public static new TableArgs Empty => new TableArgs();
    }

    public sealed class TableState : global::Pulumi.ResourceArgs
    {
        [Input("definedColumns")]
        private InputList<Inputs.TableDefinedColumnGetArgs>? _definedColumns;

        /// <summary>
        /// The property of `TableMeta` which indicates the structure information of a table. It describes the attribute value of defined column. The number of `defined_column` should not be more than 32. See `defined_column` below.
        /// </summary>
        public InputList<Inputs.TableDefinedColumnGetArgs> DefinedColumns
        {
            get => _definedColumns ?? (_definedColumns = new InputList<Inputs.TableDefinedColumnGetArgs>());
            set => _definedColumns = value;
        }

        /// <summary>
        /// The max version offset of the table. The valid value is 1-9223372036854775807. Defaults to 86400.
        /// </summary>
        [Input("deviationCellVersionInSec")]
        public Input<string>? DeviationCellVersionInSec { get; set; }

        /// <summary>
        /// Whether enable OTS server side encryption. Default value is false.
        /// </summary>
        [Input("enableSse")]
        public Input<bool>? EnableSse { get; set; }

        /// <summary>
        /// The name of the OTS instance in which table will located.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// The maximum number of versions stored in this table. The valid value is 1-2147483647.
        /// </summary>
        [Input("maxVersion")]
        public Input<int>? MaxVersion { get; set; }

        [Input("primaryKeys")]
        private InputList<Inputs.TablePrimaryKeyGetArgs>? _primaryKeys;

        /// <summary>
        /// The property of `TableMeta` which indicates the structure information of a table. It describes the attribute value of primary key. The number of `primary_key` should not be less than one and not be more than four. See `primary_key` below.
        /// </summary>
        public InputList<Inputs.TablePrimaryKeyGetArgs> PrimaryKeys
        {
            get => _primaryKeys ?? (_primaryKeys = new InputList<Inputs.TablePrimaryKeyGetArgs>());
            set => _primaryKeys = value;
        }

        /// <summary>
        /// The key type of OTS server side encryption. Only `SSE_KMS_SERVICE` is allowed.
        /// </summary>
        [Input("sseKeyType")]
        public Input<string>? SseKeyType { get; set; }

        /// <summary>
        /// The table name of the OTS instance. If changed, a new table would be created.
        /// </summary>
        [Input("tableName")]
        public Input<string>? TableName { get; set; }

        /// <summary>
        /// The retention time of data stored in this table (unit: second). The value maximum is 2147483647 and -1 means never expired.
        /// </summary>
        [Input("timeToLive")]
        public Input<int>? TimeToLive { get; set; }

        public TableState()
        {
        }
        public static new TableState Empty => new TableState();
    }
}
