// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.DatabaseFilesystem
{
    /// <summary>
    /// Provides a DBFS Instance resource.
    /// 
    /// For information about DBFS Instance and how to use it, see [What is Instance](https://help.aliyun.com/document_detail/149726.html).
    /// 
    /// &gt; **NOTE:** Available in v1.136.0+.
    /// 
    /// ## Example Usage
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
    ///     var example = new AliCloud.DatabaseFilesystem.Instance("example", new()
    ///     {
    ///         Category = "standard",
    ///         InstanceName = "example_value",
    ///         Size = 1,
    ///         ZoneId = "example_value",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// DBFS Instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:databasefilesystem/instance:Instance example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:databasefilesystem/instance:Instance")]
    public partial class Instance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The type of the Database file system. Valid values: `standard`.
        /// </summary>
        [Output("category")]
        public Output<string> Category { get; private set; } = null!;

        /// <summary>
        /// Whether to delete the original snapshot after the DBFS is created using the snapshot. Valid values : `true` anf `false`.
        /// </summary>
        [Output("deleteSnapshot")]
        public Output<bool?> DeleteSnapshot { get; private set; } = null!;

        /// <summary>
        /// The collection of ECS instances mounted to the Database file system. See the following `Block ecs_list`. **NOTE:** Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS.
        /// </summary>
        [Output("ecsLists")]
        public Output<ImmutableArray<Outputs.InstanceEcsList>> EcsLists { get; private set; } = null!;

        /// <summary>
        /// Whether to create the Database file system in RAID way. Valid values : `true` anf `false`.
        /// </summary>
        [Output("enableRaid")]
        public Output<bool?> EnableRaid { get; private set; } = null!;

        /// <summary>
        /// Whether to encrypt the database file system. Valid values: `true` and `false`.
        /// </summary>
        [Output("encryption")]
        public Output<bool?> Encryption { get; private set; } = null!;

        /// <summary>
        /// The name of the Database file system.
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        /// <summary>
        /// The KMS key ID of the Database file system used. This parameter is valid When `encryption` parameter is set to `true`.
        /// </summary>
        [Output("kmsKeyId")]
        public Output<string?> KmsKeyId { get; private set; } = null!;

        /// <summary>
        /// The performance level of the Database file system. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        /// </summary>
        [Output("performanceLevel")]
        public Output<string> PerformanceLevel { get; private set; } = null!;

        /// <summary>
        /// The number of strip. This parameter is valid When `enable_raid` parameter is set to `true`.
        /// </summary>
        [Output("raidStripeUnitNumber")]
        public Output<string?> RaidStripeUnitNumber { get; private set; } = null!;

        /// <summary>
        /// The size Of the Database file system. Unit: GiB.
        /// </summary>
        [Output("size")]
        public Output<int> Size { get; private set; } = null!;

        /// <summary>
        /// The snapshot id of the Database file system.
        /// </summary>
        [Output("snapshotId")]
        public Output<string?> SnapshotId { get; private set; } = null!;

        /// <summary>
        /// The status of Database file system. Valid values: `attached`, `attaching`, `creating`, `deleted`, `deleting`, `detaching`, `resizing`, `snapshotting`, `unattached`, `upgrading`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The Zone ID of the Database file system.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:databasefilesystem/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:databasefilesystem/instance:Instance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Instance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Instance Get(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new Instance(name, id, state, options);
        }
    }

    public sealed class InstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of the Database file system. Valid values: `standard`.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// Whether to delete the original snapshot after the DBFS is created using the snapshot. Valid values : `true` anf `false`.
        /// </summary>
        [Input("deleteSnapshot")]
        public Input<bool>? DeleteSnapshot { get; set; }

        [Input("ecsLists")]
        private InputList<Inputs.InstanceEcsListArgs>? _ecsLists;

        /// <summary>
        /// The collection of ECS instances mounted to the Database file system. See the following `Block ecs_list`. **NOTE:** Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS.
        /// </summary>
        [Obsolete(@"Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS.")]
        public InputList<Inputs.InstanceEcsListArgs> EcsLists
        {
            get => _ecsLists ?? (_ecsLists = new InputList<Inputs.InstanceEcsListArgs>());
            set => _ecsLists = value;
        }

        /// <summary>
        /// Whether to create the Database file system in RAID way. Valid values : `true` anf `false`.
        /// </summary>
        [Input("enableRaid")]
        public Input<bool>? EnableRaid { get; set; }

        /// <summary>
        /// Whether to encrypt the database file system. Valid values: `true` and `false`.
        /// </summary>
        [Input("encryption")]
        public Input<bool>? Encryption { get; set; }

        /// <summary>
        /// The name of the Database file system.
        /// </summary>
        [Input("instanceName", required: true)]
        public Input<string> InstanceName { get; set; } = null!;

        /// <summary>
        /// The KMS key ID of the Database file system used. This parameter is valid When `encryption` parameter is set to `true`.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The performance level of the Database file system. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        /// </summary>
        [Input("performanceLevel")]
        public Input<string>? PerformanceLevel { get; set; }

        /// <summary>
        /// The number of strip. This parameter is valid When `enable_raid` parameter is set to `true`.
        /// </summary>
        [Input("raidStripeUnitNumber")]
        public Input<string>? RaidStripeUnitNumber { get; set; }

        /// <summary>
        /// The size Of the Database file system. Unit: GiB.
        /// </summary>
        [Input("size", required: true)]
        public Input<int> Size { get; set; } = null!;

        /// <summary>
        /// The snapshot id of the Database file system.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The Zone ID of the Database file system.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public InstanceArgs()
        {
        }
        public static new InstanceArgs Empty => new InstanceArgs();
    }

    public sealed class InstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of the Database file system. Valid values: `standard`.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// Whether to delete the original snapshot after the DBFS is created using the snapshot. Valid values : `true` anf `false`.
        /// </summary>
        [Input("deleteSnapshot")]
        public Input<bool>? DeleteSnapshot { get; set; }

        [Input("ecsLists")]
        private InputList<Inputs.InstanceEcsListGetArgs>? _ecsLists;

        /// <summary>
        /// The collection of ECS instances mounted to the Database file system. See the following `Block ecs_list`. **NOTE:** Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS.
        /// </summary>
        [Obsolete(@"Field 'ecs_list' has been deprecated from provider version 1.156.0 and it will be removed in the future version. Please use the new resource 'alicloud_dbfs_instance_attachment' to attach ECS and DBFS.")]
        public InputList<Inputs.InstanceEcsListGetArgs> EcsLists
        {
            get => _ecsLists ?? (_ecsLists = new InputList<Inputs.InstanceEcsListGetArgs>());
            set => _ecsLists = value;
        }

        /// <summary>
        /// Whether to create the Database file system in RAID way. Valid values : `true` anf `false`.
        /// </summary>
        [Input("enableRaid")]
        public Input<bool>? EnableRaid { get; set; }

        /// <summary>
        /// Whether to encrypt the database file system. Valid values: `true` and `false`.
        /// </summary>
        [Input("encryption")]
        public Input<bool>? Encryption { get; set; }

        /// <summary>
        /// The name of the Database file system.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// The KMS key ID of the Database file system used. This parameter is valid When `encryption` parameter is set to `true`.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The performance level of the Database file system. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        /// </summary>
        [Input("performanceLevel")]
        public Input<string>? PerformanceLevel { get; set; }

        /// <summary>
        /// The number of strip. This parameter is valid When `enable_raid` parameter is set to `true`.
        /// </summary>
        [Input("raidStripeUnitNumber")]
        public Input<string>? RaidStripeUnitNumber { get; set; }

        /// <summary>
        /// The size Of the Database file system. Unit: GiB.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        /// <summary>
        /// The snapshot id of the Database file system.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// The status of Database file system. Valid values: `attached`, `attaching`, `creating`, `deleted`, `deleting`, `detaching`, `resizing`, `snapshotting`, `unattached`, `upgrading`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The Zone ID of the Database file system.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public InstanceState()
        {
        }
        public static new InstanceState Empty => new InstanceState();
    }
}
