// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.message;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.message.ServiceQueueArgs;
import com.pulumi.alicloud.message.inputs.ServiceQueueState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Message Notification Service Queue resource.
 * 
 * For information about Message Notification Service Queue and how to use it, see [What is Queue](https://www.alibabacloud.com/help/en/message-service/latest/createqueue).
 * 
 * &gt; **NOTE:** Available since v1.188.0.
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
 * import com.pulumi.alicloud.message.ServiceQueue;
 * import com.pulumi.alicloud.message.ServiceQueueArgs;
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
 *         final var config = ctx.config();
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf-example&#34;);
 *         var queue = new ServiceQueue(&#34;queue&#34;, ServiceQueueArgs.builder()        
 *             .queueName(name)
 *             .delaySeconds(60478)
 *             .maximumMessageSize(12357)
 *             .messageRetentionPeriod(256000)
 *             .visibilityTimeout(30)
 *             .pollingWaitSeconds(3)
 *             .loggingEnabled(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Message Notification Service Queue can be imported using the id or queue_name, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:message/serviceQueue:ServiceQueue example &lt;queue_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:message/serviceQueue:ServiceQueue")
public class ServiceQueue extends com.pulumi.resources.CustomResource {
    /**
     * The delay period after which a message sent to the queue can be consumed. Unit: seconds. Valid values: 0-604800 seconds. Default value: 0.
     * 
     */
    @Export(name="delaySeconds", refs={Integer.class}, tree="[0]")
    private Output<Integer> delaySeconds;

    /**
     * @return The delay period after which a message sent to the queue can be consumed. Unit: seconds. Valid values: 0-604800 seconds. Default value: 0.
     * 
     */
    public Output<Integer> delaySeconds() {
        return this.delaySeconds;
    }
    /**
     * Specifies whether to enable the log management feature. Default value: false. Valid values:
     * 
     */
    @Export(name="loggingEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> loggingEnabled;

    /**
     * @return Specifies whether to enable the log management feature. Default value: false. Valid values:
     * 
     */
    public Output<Optional<Boolean>> loggingEnabled() {
        return Codegen.optional(this.loggingEnabled);
    }
    /**
     * The maximum size of a message body that can be sent to the queue. Unit: bytes. Valid value range: 1024-65536. Default value: 65536.
     * 
     */
    @Export(name="maximumMessageSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> maximumMessageSize;

    /**
     * @return The maximum size of a message body that can be sent to the queue. Unit: bytes. Valid value range: 1024-65536. Default value: 65536.
     * 
     */
    public Output<Integer> maximumMessageSize() {
        return this.maximumMessageSize;
    }
    /**
     * The maximum period for which a message can be retained in the queue. After the specified period, the message is deleted no matter whether the message is consumed. Unit: seconds. Valid values: 60-604800. Default value: 345600.
     * 
     */
    @Export(name="messageRetentionPeriod", refs={Integer.class}, tree="[0]")
    private Output<Integer> messageRetentionPeriod;

    /**
     * @return The maximum period for which a message can be retained in the queue. After the specified period, the message is deleted no matter whether the message is consumed. Unit: seconds. Valid values: 60-604800. Default value: 345600.
     * 
     */
    public Output<Integer> messageRetentionPeriod() {
        return this.messageRetentionPeriod;
    }
    /**
     * The maximum period for which a ReceiveMessage request waits if no message is available in the queue. Unit: seconds. Valid values: 0-30. Default value: 0.
     * 
     */
    @Export(name="pollingWaitSeconds", refs={Integer.class}, tree="[0]")
    private Output<Integer> pollingWaitSeconds;

    /**
     * @return The maximum period for which a ReceiveMessage request waits if no message is available in the queue. Unit: seconds. Valid values: 0-30. Default value: 0.
     * 
     */
    public Output<Integer> pollingWaitSeconds() {
        return this.pollingWaitSeconds;
    }
    /**
     * Two queues on a single account in the same region cannot have the same name. A queue name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 120 characters.
     * 
     */
    @Export(name="queueName", refs={String.class}, tree="[0]")
    private Output<String> queueName;

    /**
     * @return Two queues on a single account in the same region cannot have the same name. A queue name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 120 characters.
     * 
     */
    public Output<String> queueName() {
        return this.queueName;
    }
    /**
     * The invisibility period for which the received message remains the Inactive state. Unit: seconds. Valid values: 1-43200. Default value: 30.
     * 
     */
    @Export(name="visibilityTimeout", refs={Integer.class}, tree="[0]")
    private Output<Integer> visibilityTimeout;

    /**
     * @return The invisibility period for which the received message remains the Inactive state. Unit: seconds. Valid values: 1-43200. Default value: 30.
     * 
     */
    public Output<Integer> visibilityTimeout() {
        return this.visibilityTimeout;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceQueue(String name) {
        this(name, ServiceQueueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceQueue(String name, ServiceQueueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceQueue(String name, ServiceQueueArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:message/serviceQueue:ServiceQueue", name, args == null ? ServiceQueueArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceQueue(String name, Output<String> id, @Nullable ServiceQueueState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:message/serviceQueue:ServiceQueue", name, state, makeResourceOptions(options, id));
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
    public static ServiceQueue get(String name, Output<String> id, @Nullable ServiceQueueState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceQueue(name, id, state, options);
    }
}
