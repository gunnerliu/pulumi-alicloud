// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga
{
    /// <summary>
    /// Provides a Global Accelerator (GA) Endpoint Group resource.
    /// 
    /// For information about Global Accelerator (GA) Endpoint Group and how to use it, see [What is Endpoint Group](https://www.alibabacloud.com/help/en/doc-detail/153259.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.113.0+.
    /// 
    /// &gt; **NOTE:** Listeners that use different protocols support different types of endpoint groups:
    /// * For a TCP or UDP listener, you can create only one default endpoint group.
    /// * For an HTTP or HTTPS listener, you can create one default endpoint group and one virtual endpoint group. By default, you can create only one virtual endpoint group.
    ///   * A default endpoint group refers to the endpoint group that you configure when you create an HTTP or HTTPS listener.
    ///   * A virtual endpoint group refers to the endpoint group that you can create on the Endpoint Group page after you create a listener.
    /// * After you create a virtual endpoint group for an HTTP or HTTPS listener, you can create a forwarding rule and associate the forwarding rule with the virtual endpoint group. Then, the HTTP or HTTPS listener forwards requests with different destination domain names or paths to the default or virtual endpoint group based on the forwarding rule. This way, you can use one Global Accelerator (GA) instance to accelerate access to multiple domain names or paths. For more information about how to create a forwarding rule, see [Manage forwarding rules](https://www.alibabacloud.com/help/en/doc-detail/204224.htm).
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
    ///     var exampleAccelerator = new AliCloud.Ga.Accelerator("exampleAccelerator", new()
    ///     {
    ///         Duration = 1,
    ///         AutoUseCoupon = true,
    ///         Spec = "1",
    ///     });
    /// 
    ///     var deBandwidthPackage = new AliCloud.Ga.BandwidthPackage("deBandwidthPackage", new()
    ///     {
    ///         Bandwidth = 100,
    ///         Type = "Basic",
    ///         BandwidthType = "Basic",
    ///         PaymentType = "PayAsYouGo",
    ///         BillingType = "PayBy95",
    ///         Ratio = 30,
    ///     });
    /// 
    ///     var deBandwidthPackageAttachment = new AliCloud.Ga.BandwidthPackageAttachment("deBandwidthPackageAttachment", new()
    ///     {
    ///         AcceleratorId = exampleAccelerator.Id,
    ///         BandwidthPackageId = deBandwidthPackage.Id,
    ///     });
    /// 
    ///     var exampleListener = new AliCloud.Ga.Listener("exampleListener", new()
    ///     {
    ///         AcceleratorId = exampleAccelerator.Id,
    ///         PortRanges = new[]
    ///         {
    ///             new AliCloud.Ga.Inputs.ListenerPortRangeArgs
    ///             {
    ///                 FromPort = 60,
    ///                 ToPort = 70,
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             deBandwidthPackageAttachment,
    ///         },
    ///     });
    /// 
    ///     var exampleEipAddress = new AliCloud.Ecs.EipAddress("exampleEipAddress", new()
    ///     {
    ///         Bandwidth = "10",
    ///         InternetChargeType = "PayByBandwidth",
    ///     });
    /// 
    ///     var exampleEndpointGroup = new AliCloud.Ga.EndpointGroup("exampleEndpointGroup", new()
    ///     {
    ///         AcceleratorId = exampleAccelerator.Id,
    ///         EndpointConfigurations = new[]
    ///         {
    ///             new AliCloud.Ga.Inputs.EndpointGroupEndpointConfigurationArgs
    ///             {
    ///                 Endpoint = exampleEipAddress.IpAddress,
    ///                 Type = "PublicIp",
    ///                 Weight = 20,
    ///             },
    ///         },
    ///         EndpointGroupRegion = "cn-hangzhou",
    ///         ListenerId = exampleListener.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Ga Endpoint Group can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ga/endpointGroup:EndpointGroup example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ga/endpointGroup:EndpointGroup")]
    public partial class EndpointGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Global Accelerator instance to which the endpoint group will be added.
        /// </summary>
        [Output("acceleratorId")]
        public Output<string> AcceleratorId { get; private set; } = null!;

        /// <summary>
        /// The description of the endpoint group.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The endpointConfigurations of the endpoint group. See the following `Block endpoint_configurations`.
        /// </summary>
        [Output("endpointConfigurations")]
        public Output<ImmutableArray<Outputs.EndpointGroupEndpointConfiguration>> EndpointConfigurations { get; private set; } = null!;

        /// <summary>
        /// The ID of the region where the endpoint group is deployed.
        /// </summary>
        [Output("endpointGroupRegion")]
        public Output<string> EndpointGroupRegion { get; private set; } = null!;

        /// <summary>
        /// The endpoint group type. Valid values: `default`, `virtual`. Default value is `default`.
        /// </summary>
        [Output("endpointGroupType")]
        public Output<string> EndpointGroupType { get; private set; } = null!;

        /// <summary>
        /// The endpoint request protocol. Valid value: `HTTP`, `HTTPS`.
        /// </summary>
        [Output("endpointRequestProtocol")]
        public Output<string?> EndpointRequestProtocol { get; private set; } = null!;

        /// <summary>
        /// The interval between two consecutive health checks. Unit: seconds.
        /// </summary>
        [Output("healthCheckIntervalSeconds")]
        public Output<int?> HealthCheckIntervalSeconds { get; private set; } = null!;

        /// <summary>
        /// The path specified as the destination of the targets for health checks.
        /// </summary>
        [Output("healthCheckPath")]
        public Output<string?> HealthCheckPath { get; private set; } = null!;

        /// <summary>
        /// The port that is used for health checks.
        /// </summary>
        [Output("healthCheckPort")]
        public Output<int?> HealthCheckPort { get; private set; } = null!;

        /// <summary>
        /// The protocol that is used to connect to the targets for health checks. Valid values: `http`, `https`, `tcp`.
        /// </summary>
        [Output("healthCheckProtocol")]
        public Output<string?> HealthCheckProtocol { get; private set; } = null!;

        /// <summary>
        /// The ID of the listener that is associated with the endpoint group.
        /// </summary>
        [Output("listenerId")]
        public Output<string> ListenerId { get; private set; } = null!;

        /// <summary>
        /// The name of the endpoint group.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Mapping between listening port and forwarding port of boarding point. See the following `Block port_overrides`.
        /// </summary>
        [Output("portOverrides")]
        public Output<Outputs.EndpointGroupPortOverrides?> PortOverrides { get; private set; } = null!;

        /// <summary>
        /// The status of the endpoint group.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The number of consecutive failed heath checks that must occur before the endpoint is deemed unhealthy. Default value is `3`.
        /// </summary>
        [Output("thresholdCount")]
        public Output<int?> ThresholdCount { get; private set; } = null!;

        /// <summary>
        /// The weight of the endpoint group when the corresponding listener is associated with multiple endpoint groups.
        /// </summary>
        [Output("trafficPercentage")]
        public Output<int?> TrafficPercentage { get; private set; } = null!;


        /// <summary>
        /// Create a EndpointGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EndpointGroup(string name, EndpointGroupArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ga/endpointGroup:EndpointGroup", name, args ?? new EndpointGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EndpointGroup(string name, Input<string> id, EndpointGroupState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ga/endpointGroup:EndpointGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EndpointGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EndpointGroup Get(string name, Input<string> id, EndpointGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new EndpointGroup(name, id, state, options);
        }
    }

    public sealed class EndpointGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Global Accelerator instance to which the endpoint group will be added.
        /// </summary>
        [Input("acceleratorId", required: true)]
        public Input<string> AcceleratorId { get; set; } = null!;

        /// <summary>
        /// The description of the endpoint group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("endpointConfigurations", required: true)]
        private InputList<Inputs.EndpointGroupEndpointConfigurationArgs>? _endpointConfigurations;

        /// <summary>
        /// The endpointConfigurations of the endpoint group. See the following `Block endpoint_configurations`.
        /// </summary>
        public InputList<Inputs.EndpointGroupEndpointConfigurationArgs> EndpointConfigurations
        {
            get => _endpointConfigurations ?? (_endpointConfigurations = new InputList<Inputs.EndpointGroupEndpointConfigurationArgs>());
            set => _endpointConfigurations = value;
        }

        /// <summary>
        /// The ID of the region where the endpoint group is deployed.
        /// </summary>
        [Input("endpointGroupRegion", required: true)]
        public Input<string> EndpointGroupRegion { get; set; } = null!;

        /// <summary>
        /// The endpoint group type. Valid values: `default`, `virtual`. Default value is `default`.
        /// </summary>
        [Input("endpointGroupType")]
        public Input<string>? EndpointGroupType { get; set; }

        /// <summary>
        /// The endpoint request protocol. Valid value: `HTTP`, `HTTPS`.
        /// </summary>
        [Input("endpointRequestProtocol")]
        public Input<string>? EndpointRequestProtocol { get; set; }

        /// <summary>
        /// The interval between two consecutive health checks. Unit: seconds.
        /// </summary>
        [Input("healthCheckIntervalSeconds")]
        public Input<int>? HealthCheckIntervalSeconds { get; set; }

        /// <summary>
        /// The path specified as the destination of the targets for health checks.
        /// </summary>
        [Input("healthCheckPath")]
        public Input<string>? HealthCheckPath { get; set; }

        /// <summary>
        /// The port that is used for health checks.
        /// </summary>
        [Input("healthCheckPort")]
        public Input<int>? HealthCheckPort { get; set; }

        /// <summary>
        /// The protocol that is used to connect to the targets for health checks. Valid values: `http`, `https`, `tcp`.
        /// </summary>
        [Input("healthCheckProtocol")]
        public Input<string>? HealthCheckProtocol { get; set; }

        /// <summary>
        /// The ID of the listener that is associated with the endpoint group.
        /// </summary>
        [Input("listenerId", required: true)]
        public Input<string> ListenerId { get; set; } = null!;

        /// <summary>
        /// The name of the endpoint group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Mapping between listening port and forwarding port of boarding point. See the following `Block port_overrides`.
        /// </summary>
        [Input("portOverrides")]
        public Input<Inputs.EndpointGroupPortOverridesArgs>? PortOverrides { get; set; }

        /// <summary>
        /// The number of consecutive failed heath checks that must occur before the endpoint is deemed unhealthy. Default value is `3`.
        /// </summary>
        [Input("thresholdCount")]
        public Input<int>? ThresholdCount { get; set; }

        /// <summary>
        /// The weight of the endpoint group when the corresponding listener is associated with multiple endpoint groups.
        /// </summary>
        [Input("trafficPercentage")]
        public Input<int>? TrafficPercentage { get; set; }

        public EndpointGroupArgs()
        {
        }
        public static new EndpointGroupArgs Empty => new EndpointGroupArgs();
    }

    public sealed class EndpointGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Global Accelerator instance to which the endpoint group will be added.
        /// </summary>
        [Input("acceleratorId")]
        public Input<string>? AcceleratorId { get; set; }

        /// <summary>
        /// The description of the endpoint group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("endpointConfigurations")]
        private InputList<Inputs.EndpointGroupEndpointConfigurationGetArgs>? _endpointConfigurations;

        /// <summary>
        /// The endpointConfigurations of the endpoint group. See the following `Block endpoint_configurations`.
        /// </summary>
        public InputList<Inputs.EndpointGroupEndpointConfigurationGetArgs> EndpointConfigurations
        {
            get => _endpointConfigurations ?? (_endpointConfigurations = new InputList<Inputs.EndpointGroupEndpointConfigurationGetArgs>());
            set => _endpointConfigurations = value;
        }

        /// <summary>
        /// The ID of the region where the endpoint group is deployed.
        /// </summary>
        [Input("endpointGroupRegion")]
        public Input<string>? EndpointGroupRegion { get; set; }

        /// <summary>
        /// The endpoint group type. Valid values: `default`, `virtual`. Default value is `default`.
        /// </summary>
        [Input("endpointGroupType")]
        public Input<string>? EndpointGroupType { get; set; }

        /// <summary>
        /// The endpoint request protocol. Valid value: `HTTP`, `HTTPS`.
        /// </summary>
        [Input("endpointRequestProtocol")]
        public Input<string>? EndpointRequestProtocol { get; set; }

        /// <summary>
        /// The interval between two consecutive health checks. Unit: seconds.
        /// </summary>
        [Input("healthCheckIntervalSeconds")]
        public Input<int>? HealthCheckIntervalSeconds { get; set; }

        /// <summary>
        /// The path specified as the destination of the targets for health checks.
        /// </summary>
        [Input("healthCheckPath")]
        public Input<string>? HealthCheckPath { get; set; }

        /// <summary>
        /// The port that is used for health checks.
        /// </summary>
        [Input("healthCheckPort")]
        public Input<int>? HealthCheckPort { get; set; }

        /// <summary>
        /// The protocol that is used to connect to the targets for health checks. Valid values: `http`, `https`, `tcp`.
        /// </summary>
        [Input("healthCheckProtocol")]
        public Input<string>? HealthCheckProtocol { get; set; }

        /// <summary>
        /// The ID of the listener that is associated with the endpoint group.
        /// </summary>
        [Input("listenerId")]
        public Input<string>? ListenerId { get; set; }

        /// <summary>
        /// The name of the endpoint group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Mapping between listening port and forwarding port of boarding point. See the following `Block port_overrides`.
        /// </summary>
        [Input("portOverrides")]
        public Input<Inputs.EndpointGroupPortOverridesGetArgs>? PortOverrides { get; set; }

        /// <summary>
        /// The status of the endpoint group.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The number of consecutive failed heath checks that must occur before the endpoint is deemed unhealthy. Default value is `3`.
        /// </summary>
        [Input("thresholdCount")]
        public Input<int>? ThresholdCount { get; set; }

        /// <summary>
        /// The weight of the endpoint group when the corresponding listener is associated with multiple endpoint groups.
        /// </summary>
        [Input("trafficPercentage")]
        public Input<int>? TrafficPercentage { get; set; }

        public EndpointGroupState()
        {
        }
        public static new EndpointGroupState Empty => new EndpointGroupState();
    }
}
