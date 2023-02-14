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
    /// Provides an OTS tunnel resource.
    /// 
    /// For information about OTS tunnel and how to use it, see [Tunnel overview](https://www.alibabacloud.com/help/en/tablestore/latest/tunnel-service-overview).
    /// 
    /// &gt; **NOTE:** Available in v1.172.0+.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraformtest";
    ///     var fooInstance = new AliCloud.Ots.Instance("fooInstance", new()
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
    ///     var fooTable = new AliCloud.Ots.Table("fooTable", new()
    ///     {
    ///         InstanceName = fooInstance.Name,
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
    ///         TimeToLive = -1,
    ///         MaxVersion = 1,
    ///         DeviationCellVersionInSec = "1",
    ///     });
    /// 
    ///     var fooTunnel = new AliCloud.Ots.Tunnel("fooTunnel", new()
    ///     {
    ///         InstanceName = fooInstance.Name,
    ///         TableName = fooTable.TableName,
    ///         TunnelName = name,
    ///         TunnelType = "BaseAndStream",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// OTS tunnel can be imported using id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ots/tunnel:Tunnel foo &lt;instance_name&gt;:&lt;table_name&gt;:&lt;tunnel_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ots/tunnel:Tunnel")]
    public partial class Tunnel : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The channels of OTS tunnel. Each element contains the following attributes:
        /// </summary>
        [Output("channels")]
        public Output<ImmutableArray<Outputs.TunnelChannel>> Channels { get; private set; } = null!;

        /// <summary>
        /// The creation time of the Tunnel.
        /// </summary>
        [Output("createTime")]
        public Output<int> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Whether the tunnel has expired.
        /// </summary>
        [Output("expired")]
        public Output<bool> Expired { get; private set; } = null!;

        /// <summary>
        /// The name of the OTS instance in which table will located.
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        /// <summary>
        /// The name of the OTS table. If changed, a new table would be created.
        /// </summary>
        [Output("tableName")]
        public Output<string> TableName { get; private set; } = null!;

        /// <summary>
        /// The tunnel id of the OTS which could not be changed.
        /// </summary>
        [Output("tunnelId")]
        public Output<string> TunnelId { get; private set; } = null!;

        /// <summary>
        /// The name of the OTS tunnel. If changed, a new tunnel would be created.
        /// </summary>
        [Output("tunnelName")]
        public Output<string> TunnelName { get; private set; } = null!;

        /// <summary>
        /// The latest consumption time of the tunnel, unix time in nanosecond.
        /// </summary>
        [Output("tunnelRpo")]
        public Output<int> TunnelRpo { get; private set; } = null!;

        /// <summary>
        /// The stage of OTS tunnel, valid values: `InitBaseDataAndStreamShard`, `ProcessBaseData`, `ProcessStream`.
        /// </summary>
        [Output("tunnelStage")]
        public Output<string> TunnelStage { get; private set; } = null!;

        /// <summary>
        /// The type of the OTS tunnel. Only `BaseAndStream`, `BaseData` or `Stream` is allowed.
        /// </summary>
        [Output("tunnelType")]
        public Output<string> TunnelType { get; private set; } = null!;


        /// <summary>
        /// Create a Tunnel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Tunnel(string name, TunnelArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ots/tunnel:Tunnel", name, args ?? new TunnelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Tunnel(string name, Input<string> id, TunnelState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ots/tunnel:Tunnel", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Tunnel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Tunnel Get(string name, Input<string> id, TunnelState? state = null, CustomResourceOptions? options = null)
        {
            return new Tunnel(name, id, state, options);
        }
    }

    public sealed class TunnelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the OTS instance in which table will located.
        /// </summary>
        [Input("instanceName", required: true)]
        public Input<string> InstanceName { get; set; } = null!;

        /// <summary>
        /// The name of the OTS table. If changed, a new table would be created.
        /// </summary>
        [Input("tableName", required: true)]
        public Input<string> TableName { get; set; } = null!;

        /// <summary>
        /// The name of the OTS tunnel. If changed, a new tunnel would be created.
        /// </summary>
        [Input("tunnelName", required: true)]
        public Input<string> TunnelName { get; set; } = null!;

        /// <summary>
        /// The type of the OTS tunnel. Only `BaseAndStream`, `BaseData` or `Stream` is allowed.
        /// </summary>
        [Input("tunnelType", required: true)]
        public Input<string> TunnelType { get; set; } = null!;

        public TunnelArgs()
        {
        }
        public static new TunnelArgs Empty => new TunnelArgs();
    }

    public sealed class TunnelState : global::Pulumi.ResourceArgs
    {
        [Input("channels")]
        private InputList<Inputs.TunnelChannelGetArgs>? _channels;

        /// <summary>
        /// The channels of OTS tunnel. Each element contains the following attributes:
        /// </summary>
        public InputList<Inputs.TunnelChannelGetArgs> Channels
        {
            get => _channels ?? (_channels = new InputList<Inputs.TunnelChannelGetArgs>());
            set => _channels = value;
        }

        /// <summary>
        /// The creation time of the Tunnel.
        /// </summary>
        [Input("createTime")]
        public Input<int>? CreateTime { get; set; }

        /// <summary>
        /// Whether the tunnel has expired.
        /// </summary>
        [Input("expired")]
        public Input<bool>? Expired { get; set; }

        /// <summary>
        /// The name of the OTS instance in which table will located.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// The name of the OTS table. If changed, a new table would be created.
        /// </summary>
        [Input("tableName")]
        public Input<string>? TableName { get; set; }

        /// <summary>
        /// The tunnel id of the OTS which could not be changed.
        /// </summary>
        [Input("tunnelId")]
        public Input<string>? TunnelId { get; set; }

        /// <summary>
        /// The name of the OTS tunnel. If changed, a new tunnel would be created.
        /// </summary>
        [Input("tunnelName")]
        public Input<string>? TunnelName { get; set; }

        /// <summary>
        /// The latest consumption time of the tunnel, unix time in nanosecond.
        /// </summary>
        [Input("tunnelRpo")]
        public Input<int>? TunnelRpo { get; set; }

        /// <summary>
        /// The stage of OTS tunnel, valid values: `InitBaseDataAndStreamShard`, `ProcessBaseData`, `ProcessStream`.
        /// </summary>
        [Input("tunnelStage")]
        public Input<string>? TunnelStage { get; set; }

        /// <summary>
        /// The type of the OTS tunnel. Only `BaseAndStream`, `BaseData` or `Stream` is allowed.
        /// </summary>
        [Input("tunnelType")]
        public Input<string>? TunnelType { get; set; }

        public TunnelState()
        {
        }
        public static new TunnelState Empty => new TunnelState();
    }
}