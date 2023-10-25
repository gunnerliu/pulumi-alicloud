// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.EventBridge
{
    /// <summary>
    /// Provides a Event Bridge Connection resource.
    /// 
    /// For information about Event Bridge Connection and how to use it, see [What is Connection](https://www.alibabacloud.com/help/en/eventbridge/latest/api-eventbridge-2020-04-01-createconnection).
    /// 
    /// &gt; **NOTE:** Available since v1.210.0.
    /// 
    /// ## Import
    /// 
    /// Event Bridge Connection can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:eventbridge/connection:Connection example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:eventbridge/connection:Connection")]
    public partial class Connection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The parameters that are configured for authentication. See `auth_parameters` below.
        /// </summary>
        [Output("authParameters")]
        public Output<Outputs.ConnectionAuthParameters?> AuthParameters { get; private set; } = null!;

        /// <summary>
        /// The name of the connection.
        /// </summary>
        [Output("connectionName")]
        public Output<string> ConnectionName { get; private set; } = null!;

        /// <summary>
        /// The creation time of the Connection.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The description of the connection.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The parameters that are configured for the network. See `network_parameters` below.
        /// </summary>
        [Output("networkParameters")]
        public Output<Outputs.ConnectionNetworkParameters> NetworkParameters { get; private set; } = null!;


        /// <summary>
        /// Create a Connection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Connection(string name, ConnectionArgs args, CustomResourceOptions? options = null)
            : base("alicloud:eventbridge/connection:Connection", name, args ?? new ConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Connection(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:eventbridge/connection:Connection", name, state, MakeResourceOptions(options, id))
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

    public sealed class ConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The parameters that are configured for authentication. See `auth_parameters` below.
        /// </summary>
        [Input("authParameters")]
        public Input<Inputs.ConnectionAuthParametersArgs>? AuthParameters { get; set; }

        /// <summary>
        /// The name of the connection.
        /// </summary>
        [Input("connectionName", required: true)]
        public Input<string> ConnectionName { get; set; } = null!;

        /// <summary>
        /// The description of the connection.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The parameters that are configured for the network. See `network_parameters` below.
        /// </summary>
        [Input("networkParameters", required: true)]
        public Input<Inputs.ConnectionNetworkParametersArgs> NetworkParameters { get; set; } = null!;

        public ConnectionArgs()
        {
        }
        public static new ConnectionArgs Empty => new ConnectionArgs();
    }

    public sealed class ConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The parameters that are configured for authentication. See `auth_parameters` below.
        /// </summary>
        [Input("authParameters")]
        public Input<Inputs.ConnectionAuthParametersGetArgs>? AuthParameters { get; set; }

        /// <summary>
        /// The name of the connection.
        /// </summary>
        [Input("connectionName")]
        public Input<string>? ConnectionName { get; set; }

        /// <summary>
        /// The creation time of the Connection.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The description of the connection.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The parameters that are configured for the network. See `network_parameters` below.
        /// </summary>
        [Input("networkParameters")]
        public Input<Inputs.ConnectionNetworkParametersGetArgs>? NetworkParameters { get; set; }

        public ConnectionState()
        {
        }
        public static new ConnectionState Empty => new ConnectionState();
    }
}
