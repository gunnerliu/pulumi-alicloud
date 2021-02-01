// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Gpdb
{
    /// <summary>
    /// Provides a AnalyticDB for PostgreSQL instance resource supports replica set instances only. the AnalyticDB for PostgreSQL provides stable, reliable, and automatic scalable database services.
    /// You can see detail product introduction [here](https://www.alibabacloud.com/help/doc-detail/35387.htm)
    /// 
    /// &gt; **NOTE:**  Available in 1.47.0+
    /// 
    /// &gt; **NOTE:**  The following regions don't support create Classic network Gpdb instance.
    /// [`ap-southeast-2`,`ap-southeast-3`,`ap-southeast-5`,`ap-south-1`,`me-east-1`,`ap-northeast-1`,`eu-west-1`,`us-east-1`,`eu-central-1`,`cn-shanghai-finance-1`,`cn-shenzhen-finance-1`,`cn-hangzhou-finance`]
    /// 
    /// &gt; **NOTE:**  Create instance or change instance would cost 10~15 minutes. Please make full preparation.
    /// 
    /// ## Example Usage
    /// ### Create a Gpdb instance
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var defaultZones = Output.Create(AliCloud.GetZones.InvokeAsync(new AliCloud.GetZonesArgs
    ///         {
    ///             AvailableResourceCreation = "Gpdb",
    ///         }));
    ///         var defaultNetwork = new AliCloud.Vpc.Network("defaultNetwork", new AliCloud.Vpc.NetworkArgs
    ///         {
    ///             CidrBlock = "172.16.0.0/16",
    ///         });
    ///         var defaultSwitch = new AliCloud.Vpc.Switch("defaultSwitch", new AliCloud.Vpc.SwitchArgs
    ///         {
    ///             AvailabilityZone = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones[0].Id),
    ///             VpcId = defaultNetwork.Id,
    ///             CidrBlock = "172.16.0.0/24",
    ///         });
    ///         var example = new AliCloud.Gpdb.Instance("example", new AliCloud.Gpdb.InstanceArgs
    ///         {
    ///             Description = "tf-gpdb-test",
    ///             Engine = "gpdb",
    ///             EngineVersion = "4.3",
    ///             InstanceClass = "gpdb.group.segsdx2",
    ///             InstanceGroupCount = "2",
    ///             VswitchId = defaultSwitch.Id,
    ///             SecurityIpLists = 
    ///             {
    ///                 "10.168.1.12",
    ///                 "100.69.7.112",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// AnalyticDB for PostgreSQL can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:gpdb/instance:Instance example gp-bp1291daeda44194
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:gpdb/instance:Instance")]
    public partial class Instance : Pulumi.CustomResource
    {
        [Output("availabilityZone")]
        public Output<string> AvailabilityZone { get; private set; } = null!;

        /// <summary>
        /// The name of DB instance. It a string of 2 to 256 characters.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Database engine: gpdb. System Default value: gpdb.
        /// </summary>
        [Output("engine")]
        public Output<string> Engine { get; private set; } = null!;

        /// <summary>
        /// Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/86908.htm) `EngineVersion`.
        /// </summary>
        [Output("engineVersion")]
        public Output<string> EngineVersion { get; private set; } = null!;

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
        /// </summary>
        [Output("instanceChargeType")]
        public Output<string> InstanceChargeType { get; private set; } = null!;

        /// <summary>
        /// Instance specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/86942.htm).
        /// </summary>
        [Output("instanceClass")]
        public Output<string> InstanceClass { get; private set; } = null!;

        /// <summary>
        /// The number of groups. Valid values: [2,4,8,16,32]
        /// </summary>
        [Output("instanceGroupCount")]
        public Output<string> InstanceGroupCount { get; private set; } = null!;

        /// <summary>
        /// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        /// </summary>
        [Output("securityIpLists")]
        public Output<ImmutableArray<string>> SecurityIpLists { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The virtual switch ID to launch DB instances in one VPC.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs args, CustomResourceOptions? options = null)
            : base("alicloud:gpdb/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:gpdb/instance:Instance", name, state, MakeResourceOptions(options, id))
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

    public sealed class InstanceArgs : Pulumi.ResourceArgs
    {
        [Input("availabilityZone")]
        public Input<string>? AvailabilityZone { get; set; }

        /// <summary>
        /// The name of DB instance. It a string of 2 to 256 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Database engine: gpdb. System Default value: gpdb.
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/86908.htm) `EngineVersion`.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        /// <summary>
        /// Instance specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/86942.htm).
        /// </summary>
        [Input("instanceClass", required: true)]
        public Input<string> InstanceClass { get; set; } = null!;

        /// <summary>
        /// The number of groups. Valid values: [2,4,8,16,32]
        /// </summary>
        [Input("instanceGroupCount", required: true)]
        public Input<string> InstanceGroupCount { get; set; } = null!;

        [Input("securityIpLists")]
        private InputList<string>? _securityIpLists;

        /// <summary>
        /// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        /// </summary>
        public InputList<string> SecurityIpLists
        {
            get => _securityIpLists ?? (_securityIpLists = new InputList<string>());
            set => _securityIpLists = value;
        }

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
        /// The virtual switch ID to launch DB instances in one VPC.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public InstanceArgs()
        {
        }
    }

    public sealed class InstanceState : Pulumi.ResourceArgs
    {
        [Input("availabilityZone")]
        public Input<string>? AvailabilityZone { get; set; }

        /// <summary>
        /// The name of DB instance. It a string of 2 to 256 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Database engine: gpdb. System Default value: gpdb.
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// Database version. Value options can refer to the latest docs [CreateDBInstance](https://www.alibabacloud.com/help/doc-detail/86908.htm) `EngineVersion`.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// Valid values are `PrePaid`, `PostPaid`,System default to `PostPaid`.
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        /// <summary>
        /// Instance specification. see [Instance specifications](https://www.alibabacloud.com/help/doc-detail/86942.htm).
        /// </summary>
        [Input("instanceClass")]
        public Input<string>? InstanceClass { get; set; }

        /// <summary>
        /// The number of groups. Valid values: [2,4,8,16,32]
        /// </summary>
        [Input("instanceGroupCount")]
        public Input<string>? InstanceGroupCount { get; set; }

        [Input("securityIpLists")]
        private InputList<string>? _securityIpLists;

        /// <summary>
        /// List of IP addresses allowed to access all databases of an instance. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        /// </summary>
        public InputList<string> SecurityIpLists
        {
            get => _securityIpLists ?? (_securityIpLists = new InputList<string>());
            set => _securityIpLists = value;
        }

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
        /// The virtual switch ID to launch DB instances in one VPC.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public InstanceState()
        {
        }
    }
}
