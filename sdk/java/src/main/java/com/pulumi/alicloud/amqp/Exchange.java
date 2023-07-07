// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.amqp;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.amqp.ExchangeArgs;
import com.pulumi.alicloud.amqp.inputs.ExchangeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a RabbitMQ (AMQP) Exchange resource.
 * 
 * For information about RabbitMQ (AMQP) Exchange and how to use it, see [What is Exchange](https://www.alibabacloud.com/help/en/message-queue-for-rabbitmq/latest/createexchange).
 * 
 * &gt; **NOTE:** Available since v1.128.0.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.amqp.Instance;
 * import com.pulumi.alicloud.amqp.InstanceArgs;
 * import com.pulumi.alicloud.amqp.VirtualHost;
 * import com.pulumi.alicloud.amqp.VirtualHostArgs;
 * import com.pulumi.alicloud.amqp.Exchange;
 * import com.pulumi.alicloud.amqp.ExchangeArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .instanceType(&#34;professional&#34;)
 *             .maxTps(1000)
 *             .queueCapacity(50)
 *             .supportEip(true)
 *             .maxEipTps(128)
 *             .paymentType(&#34;Subscription&#34;)
 *             .period(1)
 *             .build());
 * 
 *         var defaultVirtualHost = new VirtualHost(&#34;defaultVirtualHost&#34;, VirtualHostArgs.builder()        
 *             .instanceId(defaultInstance.id())
 *             .virtualHostName(&#34;tf-example&#34;)
 *             .build());
 * 
 *         var defaultExchange = new Exchange(&#34;defaultExchange&#34;, ExchangeArgs.builder()        
 *             .autoDeleteState(false)
 *             .exchangeName(&#34;tf-example&#34;)
 *             .exchangeType(&#34;DIRECT&#34;)
 *             .instanceId(defaultInstance.id())
 *             .internal(false)
 *             .virtualHostName(defaultVirtualHost.virtualHostName())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * RabbitMQ (AMQP) Exchange can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:amqp/exchange:Exchange example &lt;instance_id&gt;:&lt;virtual_host_name&gt;:&lt;exchange_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:amqp/exchange:Exchange")
public class Exchange extends com.pulumi.resources.CustomResource {
    /**
     * The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
     * 
     */
    @Export(name="alternateExchange", type=String.class, parameters={})
    private Output</* @Nullable */ String> alternateExchange;

    /**
     * @return The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
     * 
     */
    public Output<Optional<String>> alternateExchange() {
        return Codegen.optional(this.alternateExchange);
    }
    /**
     * Specifies whether the Auto Delete attribute is configured. Valid values:
     * * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
     * * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
     * 
     */
    @Export(name="autoDeleteState", type=Boolean.class, parameters={})
    private Output<Boolean> autoDeleteState;

    /**
     * @return Specifies whether the Auto Delete attribute is configured. Valid values:
     * * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
     * * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
     * 
     */
    public Output<Boolean> autoDeleteState() {
        return this.autoDeleteState;
    }
    /**
     * The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
     * 
     */
    @Export(name="exchangeName", type=String.class, parameters={})
    private Output<String> exchangeName;

    /**
     * @return The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
     * 
     */
    public Output<String> exchangeName() {
        return this.exchangeName;
    }
    /**
     * The type of the exchange. Valid values:
     * * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
     * * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
     * * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
     * * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
     *   When binding Headers Exchange and Queue, set the key-value pair of the binding property;
     *   when sending a message to the Headers Exchange, set the message&#39;s Headers property key-value pair and use the message Headers
     *   The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
     * 
     */
    @Export(name="exchangeType", type=String.class, parameters={})
    private Output<String> exchangeType;

    /**
     * @return The type of the exchange. Valid values:
     * * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
     * * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
     * * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
     * * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
     *   When binding Headers Exchange and Queue, set the key-value pair of the binding property;
     *   when sending a message to the Headers Exchange, set the message&#39;s Headers property key-value pair and use the message Headers
     *   The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
     * 
     */
    public Output<String> exchangeType() {
        return this.exchangeType;
    }
    /**
     * The ID of the instance.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return The ID of the instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Specifies whether an exchange is an internal exchange. Valid values:
     * * false: The exchange is not an internal exchange.
     * * true: The exchange is an internal exchange.
     * 
     */
    @Export(name="internal", type=Boolean.class, parameters={})
    private Output<Boolean> internal;

    /**
     * @return Specifies whether an exchange is an internal exchange. Valid values:
     * * false: The exchange is not an internal exchange.
     * * true: The exchange is an internal exchange.
     * 
     */
    public Output<Boolean> internal() {
        return this.internal;
    }
    /**
     * The name of virtual host where an exchange resides.
     * 
     */
    @Export(name="virtualHostName", type=String.class, parameters={})
    private Output<String> virtualHostName;

    /**
     * @return The name of virtual host where an exchange resides.
     * 
     */
    public Output<String> virtualHostName() {
        return this.virtualHostName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Exchange(String name) {
        this(name, ExchangeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Exchange(String name, ExchangeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Exchange(String name, ExchangeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:amqp/exchange:Exchange", name, args == null ? ExchangeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Exchange(String name, Output<String> id, @Nullable ExchangeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:amqp/exchange:Exchange", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Exchange get(String name, Output<String> id, @Nullable ExchangeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Exchange(name, id, state, options);
    }
}
