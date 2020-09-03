// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds
{
    /// <summary>
    /// Provides an RDS connection resource to allocate an Internet connection string for RDS instance.
    /// 
    /// &gt; **NOTE:** Each RDS instance will allocate a intranet connnection string automatically and its prifix is RDS instance ID.
    ///  To avoid unnecessary conflict, please specified a internet connection prefix before applying the resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var config = new Config();
    ///         var creation = config.Get("creation") ?? "Rds";
    ///         var name = config.Get("name") ?? "dbconnectionbasic";
    ///         var defaultZones = Output.Create(AliCloud.GetZones.InvokeAsync(new AliCloud.GetZonesArgs
    ///         {
    ///             AvailableResourceCreation = creation,
    ///         }));
    ///         var defaultNetwork = new AliCloud.Vpc.Network("defaultNetwork", new AliCloud.Vpc.NetworkArgs
    ///         {
    ///             CidrBlock = "172.16.0.0/16",
    ///         });
    ///         var defaultSwitch = new AliCloud.Vpc.Switch("defaultSwitch", new AliCloud.Vpc.SwitchArgs
    ///         {
    ///             VpcId = defaultNetwork.Id,
    ///             CidrBlock = "172.16.0.0/24",
    ///             AvailabilityZone = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones[0].Id),
    ///         });
    ///         var instance = new AliCloud.Rds.Instance("instance", new AliCloud.Rds.InstanceArgs
    ///         {
    ///             Engine = "MySQL",
    ///             EngineVersion = "5.6",
    ///             InstanceType = "rds.mysql.t1.small",
    ///             InstanceStorage = 10,
    ///             VswitchId = defaultSwitch.Id,
    ///             InstanceName = name,
    ///         });
    ///         var foo = new AliCloud.Rds.Connection("foo", new AliCloud.Rds.ConnectionArgs
    ///         {
    ///             InstanceId = instance.Id,
    ///             ConnectionPrefix = "testabc",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class Connection : Pulumi.CustomResource
    {
        /// <summary>
        /// Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to &lt;instance_id&gt; + 'tf'.
        /// </summary>
        [Output("connectionPrefix")]
        public Output<string> ConnectionPrefix { get; private set; } = null!;

        /// <summary>
        /// Connection instance string.
        /// </summary>
        [Output("connectionString")]
        public Output<string> ConnectionString { get; private set; } = null!;

        /// <summary>
        /// The Id of instance that can run database.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The ip address of connection string.
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;

        /// <summary>
        /// Internet connection port. Valid value: [3001-3999]. Default to 3306.
        /// </summary>
        [Output("port")]
        public Output<string?> Port { get; private set; } = null!;


        /// <summary>
        /// Create a Connection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Connection(string name, ConnectionArgs args, CustomResourceOptions? options = null)
            : base("alicloud:rds/connection:Connection", name, args ?? new ConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Connection(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:rds/connection:Connection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Connection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Connection Get(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new Connection(name, id, state, options);
        }
    }

    public sealed class ConnectionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to &lt;instance_id&gt; + 'tf'.
        /// </summary>
        [Input("connectionPrefix")]
        public Input<string>? ConnectionPrefix { get; set; }

        /// <summary>
        /// The Id of instance that can run database.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// Internet connection port. Valid value: [3001-3999]. Default to 3306.
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        public ConnectionArgs()
        {
        }
    }

    public sealed class ConnectionState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to &lt;instance_id&gt; + 'tf'.
        /// </summary>
        [Input("connectionPrefix")]
        public Input<string>? ConnectionPrefix { get; set; }

        /// <summary>
        /// Connection instance string.
        /// </summary>
        [Input("connectionString")]
        public Input<string>? ConnectionString { get; set; }

        /// <summary>
        /// The Id of instance that can run database.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The ip address of connection string.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// Internet connection port. Valid value: [3001-3999]. Default to 3306.
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        public ConnectionState()
        {
        }
    }
}
