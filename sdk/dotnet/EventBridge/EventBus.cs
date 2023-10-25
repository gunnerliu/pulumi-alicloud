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
    /// Provides a Event Bridge Event Bus resource.
    /// 
    /// For information about Event Bridge Event Bus and how to use it, see [What is Event Bus](https://www.alibabacloud.com/help/en/eventbridge/latest/api-eventbridge-2020-04-01-createeventbus).
    /// 
    /// &gt; **NOTE:** Available since v1.129.0.
    /// 
    /// ## Import
    /// 
    /// Event Bridge Event Bus can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:eventbridge/eventBus:EventBus example &lt;event_bus_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:eventbridge/eventBus:EventBus")]
    public partial class EventBus : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of event bus.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of event bus. The length is limited to 2 ~ 127 characters, which can be composed of letters, numbers or hyphens (-)
        /// </summary>
        [Output("eventBusName")]
        public Output<string> EventBusName { get; private set; } = null!;


        /// <summary>
        /// Create a EventBus resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EventBus(string name, EventBusArgs args, CustomResourceOptions? options = null)
            : base("alicloud:eventbridge/eventBus:EventBus", name, args ?? new EventBusArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EventBus(string name, Input<string> id, EventBusState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:eventbridge/eventBus:EventBus", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EventBus resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EventBus Get(string name, Input<string> id, EventBusState? state = null, CustomResourceOptions? options = null)
        {
            return new EventBus(name, id, state, options);
        }
    }

    public sealed class EventBusArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of event bus.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of event bus. The length is limited to 2 ~ 127 characters, which can be composed of letters, numbers or hyphens (-)
        /// </summary>
        [Input("eventBusName", required: true)]
        public Input<string> EventBusName { get; set; } = null!;

        public EventBusArgs()
        {
        }
        public static new EventBusArgs Empty => new EventBusArgs();
    }

    public sealed class EventBusState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of event bus.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of event bus. The length is limited to 2 ~ 127 characters, which can be composed of letters, numbers or hyphens (-)
        /// </summary>
        [Input("eventBusName")]
        public Input<string>? EventBusName { get; set; }

        public EventBusState()
        {
        }
        public static new EventBusState Empty => new EventBusState();
    }
}
