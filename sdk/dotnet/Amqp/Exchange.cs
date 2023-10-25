// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Amqp
{
    /// <summary>
    /// Provides a RabbitMQ (AMQP) Exchange resource.
    /// 
    /// For information about RabbitMQ (AMQP) Exchange and how to use it, see [What is Exchange](https://www.alibabacloud.com/help/en/message-queue-for-rabbitmq/latest/createexchange).
    /// 
    /// &gt; **NOTE:** Available since v1.128.0.
    /// 
    /// ## Import
    /// 
    /// RabbitMQ (AMQP) Exchange can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:amqp/exchange:Exchange example &lt;instance_id&gt;:&lt;virtual_host_name&gt;:&lt;exchange_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:amqp/exchange:Exchange")]
    public partial class Exchange : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
        /// </summary>
        [Output("alternateExchange")]
        public Output<string?> AlternateExchange { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the Auto Delete attribute is configured. Valid values:
        /// * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
        /// * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
        /// </summary>
        [Output("autoDeleteState")]
        public Output<bool> AutoDeleteState { get; private set; } = null!;

        /// <summary>
        /// The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        /// </summary>
        [Output("exchangeName")]
        public Output<string> ExchangeName { get; private set; } = null!;

        /// <summary>
        /// The type of the exchange. Valid values:
        /// * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
        /// * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
        /// * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
        /// * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
        /// When binding Headers Exchange and Queue, set the key-value pair of the binding property;
        /// when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
        /// The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
        /// </summary>
        [Output("exchangeType")]
        public Output<string> ExchangeType { get; private set; } = null!;

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// Specifies whether an exchange is an internal exchange. Valid values:
        /// * false: The exchange is not an internal exchange.
        /// * true: The exchange is an internal exchange.
        /// </summary>
        [Output("internal")]
        public Output<bool> Internal { get; private set; } = null!;

        /// <summary>
        /// The name of virtual host where an exchange resides.
        /// </summary>
        [Output("virtualHostName")]
        public Output<string> VirtualHostName { get; private set; } = null!;


        /// <summary>
        /// Create a Exchange resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Exchange(string name, ExchangeArgs args, CustomResourceOptions? options = null)
            : base("alicloud:amqp/exchange:Exchange", name, args ?? new ExchangeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Exchange(string name, Input<string> id, ExchangeState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:amqp/exchange:Exchange", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Exchange resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Exchange Get(string name, Input<string> id, ExchangeState? state = null, CustomResourceOptions? options = null)
        {
            return new Exchange(name, id, state, options);
        }
    }

    public sealed class ExchangeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
        /// </summary>
        [Input("alternateExchange")]
        public Input<string>? AlternateExchange { get; set; }

        /// <summary>
        /// Specifies whether the Auto Delete attribute is configured. Valid values:
        /// * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
        /// * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
        /// </summary>
        [Input("autoDeleteState", required: true)]
        public Input<bool> AutoDeleteState { get; set; } = null!;

        /// <summary>
        /// The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        /// </summary>
        [Input("exchangeName", required: true)]
        public Input<string> ExchangeName { get; set; } = null!;

        /// <summary>
        /// The type of the exchange. Valid values:
        /// * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
        /// * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
        /// * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
        /// * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
        /// When binding Headers Exchange and Queue, set the key-value pair of the binding property;
        /// when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
        /// The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
        /// </summary>
        [Input("exchangeType", required: true)]
        public Input<string> ExchangeType { get; set; } = null!;

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// Specifies whether an exchange is an internal exchange. Valid values:
        /// * false: The exchange is not an internal exchange.
        /// * true: The exchange is an internal exchange.
        /// </summary>
        [Input("internal", required: true)]
        public Input<bool> Internal { get; set; } = null!;

        /// <summary>
        /// The name of virtual host where an exchange resides.
        /// </summary>
        [Input("virtualHostName", required: true)]
        public Input<string> VirtualHostName { get; set; } = null!;

        public ExchangeArgs()
        {
        }
        public static new ExchangeArgs Empty => new ExchangeArgs();
    }

    public sealed class ExchangeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
        /// </summary>
        [Input("alternateExchange")]
        public Input<string>? AlternateExchange { get; set; }

        /// <summary>
        /// Specifies whether the Auto Delete attribute is configured. Valid values:
        /// * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
        /// * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
        /// </summary>
        [Input("autoDeleteState")]
        public Input<bool>? AutoDeleteState { get; set; }

        /// <summary>
        /// The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        /// </summary>
        [Input("exchangeName")]
        public Input<string>? ExchangeName { get; set; }

        /// <summary>
        /// The type of the exchange. Valid values:
        /// * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
        /// * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
        /// * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
        /// * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
        /// When binding Headers Exchange and Queue, set the key-value pair of the binding property;
        /// when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
        /// The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
        /// </summary>
        [Input("exchangeType")]
        public Input<string>? ExchangeType { get; set; }

        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Specifies whether an exchange is an internal exchange. Valid values:
        /// * false: The exchange is not an internal exchange.
        /// * true: The exchange is an internal exchange.
        /// </summary>
        [Input("internal")]
        public Input<bool>? Internal { get; set; }

        /// <summary>
        /// The name of virtual host where an exchange resides.
        /// </summary>
        [Input("virtualHostName")]
        public Input<string>? VirtualHostName { get; set; }

        public ExchangeState()
        {
        }
        public static new ExchangeState Empty => new ExchangeState();
    }
}
