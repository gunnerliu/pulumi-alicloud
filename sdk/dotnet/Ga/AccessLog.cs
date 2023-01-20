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
    /// Provides a Global Accelerator (GA) Access Log resource.
    /// 
    /// For information about Global Accelerator (GA) Access Log and how to use it, see [What is Access Log](https://www.alibabacloud.com/help/en/global-accelerator/latest/attachlogstoretoendpointgroup).
    /// 
    /// &gt; **NOTE:** Available in v1.187.0+.
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
    ///     var defaultAccelerators = AliCloud.Ga.GetAccelerators.Invoke(new()
    ///     {
    ///         Status = "active",
    ///     });
    /// 
    ///     var defaultProject = new AliCloud.Log.Project("defaultProject");
    /// 
    ///     var defaultStore = new AliCloud.Log.Store("defaultStore", new()
    ///     {
    ///         Project = defaultProject.Name,
    ///     });
    /// 
    ///     var defaultBandwidthPackage = new AliCloud.Ga.BandwidthPackage("defaultBandwidthPackage", new()
    ///     {
    ///         Bandwidth = 100,
    ///         Type = "Basic",
    ///         BandwidthType = "Basic",
    ///         PaymentType = "PayAsYouGo",
    ///         BillingType = "PayBy95",
    ///         Ratio = 30,
    ///     });
    /// 
    ///     var defaultBandwidthPackageAttachment = new AliCloud.Ga.BandwidthPackageAttachment("defaultBandwidthPackageAttachment", new()
    ///     {
    ///         AcceleratorId = defaultAccelerators.Apply(getAcceleratorsResult =&gt; getAcceleratorsResult.Accelerators[0]?.Id),
    ///         BandwidthPackageId = defaultBandwidthPackage.Id,
    ///     });
    /// 
    ///     var defaultListener = new AliCloud.Ga.Listener("defaultListener", new()
    ///     {
    ///         AcceleratorId = defaultBandwidthPackageAttachment.AcceleratorId,
    ///         PortRanges = new[]
    ///         {
    ///             new AliCloud.Ga.Inputs.ListenerPortRangeArgs
    ///             {
    ///                 FromPort = 80,
    ///                 ToPort = 80,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var defaultEipAddress = new AliCloud.Ecs.EipAddress("defaultEipAddress", new()
    ///     {
    ///         PaymentType = "PayAsYouGo",
    ///     });
    /// 
    ///     var defaultEndpointGroup = new AliCloud.Ga.EndpointGroup("defaultEndpointGroup", new()
    ///     {
    ///         AcceleratorId = defaultListener.AcceleratorId,
    ///         EndpointConfigurations = new[]
    ///         {
    ///             new AliCloud.Ga.Inputs.EndpointGroupEndpointConfigurationArgs
    ///             {
    ///                 Endpoint = defaultEipAddress.IpAddress,
    ///                 Type = "PublicIp",
    ///                 Weight = 20,
    ///             },
    ///         },
    ///         EndpointGroupRegion = "cn-hangzhou",
    ///         ListenerId = defaultListener.Id,
    ///     });
    /// 
    ///     var defaultAccessLog = new AliCloud.Ga.AccessLog("defaultAccessLog", new()
    ///     {
    ///         AcceleratorId = defaultAccelerators.Apply(getAcceleratorsResult =&gt; getAcceleratorsResult.Accelerators[0]?.Id),
    ///         ListenerId = defaultListener.Id,
    ///         EndpointGroupId = defaultEndpointGroup.Id,
    ///         SlsProjectName = defaultProject.Name,
    ///         SlsLogStoreName = defaultStore.Name,
    ///         SlsRegionId = "cn-hangzhou",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Global Accelerator (GA) Access Log can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ga/accessLog:AccessLog example &lt;accelerator_id&gt;:&lt;listener_id&gt;:&lt;endpoint_group_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ga/accessLog:AccessLog")]
    public partial class AccessLog : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the global acceleration instance.
        /// </summary>
        [Output("acceleratorId")]
        public Output<string> AcceleratorId { get; private set; } = null!;

        /// <summary>
        /// The ID of the endpoint group instance.
        /// </summary>
        [Output("endpointGroupId")]
        public Output<string> EndpointGroupId { get; private set; } = null!;

        /// <summary>
        /// The ID of the listener.
        /// </summary>
        [Output("listenerId")]
        public Output<string> ListenerId { get; private set; } = null!;

        /// <summary>
        /// The name of the Log Store.
        /// </summary>
        [Output("slsLogStoreName")]
        public Output<string> SlsLogStoreName { get; private set; } = null!;

        /// <summary>
        /// The name of the Log Service project.
        /// </summary>
        [Output("slsProjectName")]
        public Output<string> SlsProjectName { get; private set; } = null!;

        /// <summary>
        /// The region ID of the Log Service project.
        /// </summary>
        [Output("slsRegionId")]
        public Output<string> SlsRegionId { get; private set; } = null!;

        /// <summary>
        /// Whether access log is enabled.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a AccessLog resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessLog(string name, AccessLogArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ga/accessLog:AccessLog", name, args ?? new AccessLogArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessLog(string name, Input<string> id, AccessLogState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ga/accessLog:AccessLog", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessLog resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessLog Get(string name, Input<string> id, AccessLogState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessLog(name, id, state, options);
        }
    }

    public sealed class AccessLogArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the global acceleration instance.
        /// </summary>
        [Input("acceleratorId", required: true)]
        public Input<string> AcceleratorId { get; set; } = null!;

        /// <summary>
        /// The ID of the endpoint group instance.
        /// </summary>
        [Input("endpointGroupId", required: true)]
        public Input<string> EndpointGroupId { get; set; } = null!;

        /// <summary>
        /// The ID of the listener.
        /// </summary>
        [Input("listenerId", required: true)]
        public Input<string> ListenerId { get; set; } = null!;

        /// <summary>
        /// The name of the Log Store.
        /// </summary>
        [Input("slsLogStoreName", required: true)]
        public Input<string> SlsLogStoreName { get; set; } = null!;

        /// <summary>
        /// The name of the Log Service project.
        /// </summary>
        [Input("slsProjectName", required: true)]
        public Input<string> SlsProjectName { get; set; } = null!;

        /// <summary>
        /// The region ID of the Log Service project.
        /// </summary>
        [Input("slsRegionId", required: true)]
        public Input<string> SlsRegionId { get; set; } = null!;

        public AccessLogArgs()
        {
        }
        public static new AccessLogArgs Empty => new AccessLogArgs();
    }

    public sealed class AccessLogState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the global acceleration instance.
        /// </summary>
        [Input("acceleratorId")]
        public Input<string>? AcceleratorId { get; set; }

        /// <summary>
        /// The ID of the endpoint group instance.
        /// </summary>
        [Input("endpointGroupId")]
        public Input<string>? EndpointGroupId { get; set; }

        /// <summary>
        /// The ID of the listener.
        /// </summary>
        [Input("listenerId")]
        public Input<string>? ListenerId { get; set; }

        /// <summary>
        /// The name of the Log Store.
        /// </summary>
        [Input("slsLogStoreName")]
        public Input<string>? SlsLogStoreName { get; set; }

        /// <summary>
        /// The name of the Log Service project.
        /// </summary>
        [Input("slsProjectName")]
        public Input<string>? SlsProjectName { get; set; }

        /// <summary>
        /// The region ID of the Log Service project.
        /// </summary>
        [Input("slsRegionId")]
        public Input<string>? SlsRegionId { get; set; }

        /// <summary>
        /// Whether access log is enabled.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public AccessLogState()
        {
        }
        public static new AccessLogState Empty => new AccessLogState();
    }
}
