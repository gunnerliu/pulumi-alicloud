// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS
{
    /// <summary>
    /// &gt; **DEPRECATED:** This resource manages applications in swarm cluster only, which is being deprecated and will be replaced by Kubernetes cluster.
    /// 
    /// This resource use an orchestration template to define and deploy a multi-container application. An application is created by using an orchestration template.
    /// Each application can contain one or more services.
    /// 
    /// &gt; **NOTE:** Application orchestration template must be a valid Docker Compose YAML template.
    /// 
    /// &gt; **NOTE:** At present, this resource only support swarm cluster.
    /// </summary>
    public partial class Application : Pulumi.CustomResource
    {
        /// <summary>
        /// Wherther to use "Blue Green" method when release a new version. Default to false.
        /// </summary>
        [Output("blueGreen")]
        public Output<bool?> BlueGreen { get; private set; } = null!;

        /// <summary>
        /// Whether to confirm a "Blue Green" application. Default to false. It will be ignored when `blue_green` is false.
        /// </summary>
        [Output("blueGreenConfirm")]
        public Output<bool?> BlueGreenConfirm { get; private set; } = null!;

        /// <summary>
        /// The swarm cluster's name.
        /// </summary>
        [Output("clusterName")]
        public Output<string> ClusterName { get; private set; } = null!;

        /// <summary>
        /// The application default domain and it can be used to configure routing service.
        /// </summary>
        [Output("defaultDomain")]
        public Output<string> DefaultDomain { get; private set; } = null!;

        /// <summary>
        /// The description of application.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A key/value map used to replace the variable parameter in the Compose template.
        /// </summary>
        [Output("environment")]
        public Output<ImmutableDictionary<string, object>?> Environment { get; private set; } = null!;

        /// <summary>
        /// Whether to use latest docker image while each updating application. Default to false.
        /// </summary>
        [Output("latestImage")]
        public Output<bool?> LatestImage { get; private set; } = null!;

        /// <summary>
        /// The application name. It should be 1-64 characters long, and can contain numbers, English letters and hyphens, but cannot start with hyphens.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// List of services in the application. It contains several attributes to `Block Nodes`.
        /// </summary>
        [Output("services")]
        public Output<ImmutableArray<Outputs.ApplicationService>> Services { get; private set; } = null!;

        /// <summary>
        /// The application deployment template and it must be [Docker Compose format](https://docs.docker.com/compose/).
        /// </summary>
        [Output("template")]
        public Output<string> Template { get; private set; } = null!;

        /// <summary>
        /// The application deploying version. Each updating, it must be different with current. Default to "1.0"
        /// </summary>
        [Output("version")]
        public Output<string?> Version { get; private set; } = null!;


        /// <summary>
        /// Create a Application resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Application(string name, ApplicationArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cs/application:Application", name, args ?? new ApplicationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Application(string name, Input<string> id, ApplicationState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cs/application:Application", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Application resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Application Get(string name, Input<string> id, ApplicationState? state = null, CustomResourceOptions? options = null)
        {
            return new Application(name, id, state, options);
        }
    }

    public sealed class ApplicationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Wherther to use "Blue Green" method when release a new version. Default to false.
        /// </summary>
        [Input("blueGreen")]
        public Input<bool>? BlueGreen { get; set; }

        /// <summary>
        /// Whether to confirm a "Blue Green" application. Default to false. It will be ignored when `blue_green` is false.
        /// </summary>
        [Input("blueGreenConfirm")]
        public Input<bool>? BlueGreenConfirm { get; set; }

        /// <summary>
        /// The swarm cluster's name.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// The description of application.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("environment")]
        private InputMap<object>? _environment;

        /// <summary>
        /// A key/value map used to replace the variable parameter in the Compose template.
        /// </summary>
        public InputMap<object> Environment
        {
            get => _environment ?? (_environment = new InputMap<object>());
            set => _environment = value;
        }

        /// <summary>
        /// Whether to use latest docker image while each updating application. Default to false.
        /// </summary>
        [Input("latestImage")]
        public Input<bool>? LatestImage { get; set; }

        /// <summary>
        /// The application name. It should be 1-64 characters long, and can contain numbers, English letters and hyphens, but cannot start with hyphens.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The application deployment template and it must be [Docker Compose format](https://docs.docker.com/compose/).
        /// </summary>
        [Input("template", required: true)]
        public Input<string> Template { get; set; } = null!;

        /// <summary>
        /// The application deploying version. Each updating, it must be different with current. Default to "1.0"
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public ApplicationArgs()
        {
        }
    }

    public sealed class ApplicationState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Wherther to use "Blue Green" method when release a new version. Default to false.
        /// </summary>
        [Input("blueGreen")]
        public Input<bool>? BlueGreen { get; set; }

        /// <summary>
        /// Whether to confirm a "Blue Green" application. Default to false. It will be ignored when `blue_green` is false.
        /// </summary>
        [Input("blueGreenConfirm")]
        public Input<bool>? BlueGreenConfirm { get; set; }

        /// <summary>
        /// The swarm cluster's name.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        /// <summary>
        /// The application default domain and it can be used to configure routing service.
        /// </summary>
        [Input("defaultDomain")]
        public Input<string>? DefaultDomain { get; set; }

        /// <summary>
        /// The description of application.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("environment")]
        private InputMap<object>? _environment;

        /// <summary>
        /// A key/value map used to replace the variable parameter in the Compose template.
        /// </summary>
        public InputMap<object> Environment
        {
            get => _environment ?? (_environment = new InputMap<object>());
            set => _environment = value;
        }

        /// <summary>
        /// Whether to use latest docker image while each updating application. Default to false.
        /// </summary>
        [Input("latestImage")]
        public Input<bool>? LatestImage { get; set; }

        /// <summary>
        /// The application name. It should be 1-64 characters long, and can contain numbers, English letters and hyphens, but cannot start with hyphens.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("services")]
        private InputList<Inputs.ApplicationServiceGetArgs>? _services;

        /// <summary>
        /// List of services in the application. It contains several attributes to `Block Nodes`.
        /// </summary>
        public InputList<Inputs.ApplicationServiceGetArgs> Services
        {
            get => _services ?? (_services = new InputList<Inputs.ApplicationServiceGetArgs>());
            set => _services = value;
        }

        /// <summary>
        /// The application deployment template and it must be [Docker Compose format](https://docs.docker.com/compose/).
        /// </summary>
        [Input("template")]
        public Input<string>? Template { get; set; }

        /// <summary>
        /// The application deploying version. Each updating, it must be different with current. Default to "1.0"
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public ApplicationState()
        {
        }
    }
}
