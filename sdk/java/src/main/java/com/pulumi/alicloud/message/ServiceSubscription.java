// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.message;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.message.ServiceSubscriptionArgs;
import com.pulumi.alicloud.message.inputs.ServiceSubscriptionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Message Notification Service Subscription resource.
 * 
 * For information about Message Notification Service Subscription and how to use it, see [What is Subscription](https://www.alibabacloud.com/help/en/message-service/latest/subscribe-1).
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
 * import com.pulumi.alicloud.message.ServiceTopic;
 * import com.pulumi.alicloud.message.ServiceTopicArgs;
 * import com.pulumi.alicloud.message.ServiceSubscription;
 * import com.pulumi.alicloud.message.ServiceSubscriptionArgs;
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
 *         var defaultServiceTopic = new ServiceTopic(&#34;defaultServiceTopic&#34;, ServiceTopicArgs.builder()        
 *             .topicName(name)
 *             .maxMessageSize(12357)
 *             .loggingEnabled(true)
 *             .build());
 * 
 *         var defaultServiceSubscription = new ServiceSubscription(&#34;defaultServiceSubscription&#34;, ServiceSubscriptionArgs.builder()        
 *             .topicName(defaultServiceTopic.topicName())
 *             .subscriptionName(name)
 *             .endpoint(&#34;http://example.com&#34;)
 *             .pushType(&#34;http&#34;)
 *             .filterTag(&#34;tf-example&#34;)
 *             .notifyContentFormat(&#34;XML&#34;)
 *             .notifyStrategy(&#34;BACKOFF_RETRY&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Message Notification Service Subscription can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:message/serviceSubscription:ServiceSubscription example &lt;topic_name&gt;:&lt;subscription_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:message/serviceSubscription:ServiceSubscription")
public class ServiceSubscription extends com.pulumi.resources.CustomResource {
    /**
     * The endpoint has three format. Available values format:
     * - `HTTP Format`: http://xxx.com/xxx
     * - `Queue Format`: acs:mns:{REGION}:{AccountID}:queues/{QueueName}
     * - `Email Format`: mail:directmail:{MailAddress}
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output<String> endpoint;

    /**
     * @return The endpoint has three format. Available values format:
     * - `HTTP Format`: http://xxx.com/xxx
     * - `Queue Format`: acs:mns:{REGION}:{AccountID}:queues/{QueueName}
     * - `Email Format`: mail:directmail:{MailAddress}
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * The tag that is used to filter messages. Only the messages that have the same tag can be pushed. A tag is a string that can be up to 16 characters in length. By default, no tag is specified to filter messages.
     * 
     */
    @Export(name="filterTag", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> filterTag;

    /**
     * @return The tag that is used to filter messages. Only the messages that have the same tag can be pushed. A tag is a string that can be up to 16 characters in length. By default, no tag is specified to filter messages.
     * 
     */
    public Output<Optional<String>> filterTag() {
        return Codegen.optional(this.filterTag);
    }
    /**
     * The NotifyContentFormat attribute of Subscription. This attribute specifies the content format of the messages pushed to users. Valid values: `XML`, `JSON` and `SIMPLIFIED`. Default value: `XML`.
     * 
     */
    @Export(name="notifyContentFormat", refs={String.class}, tree="[0]")
    private Output<String> notifyContentFormat;

    /**
     * @return The NotifyContentFormat attribute of Subscription. This attribute specifies the content format of the messages pushed to users. Valid values: `XML`, `JSON` and `SIMPLIFIED`. Default value: `XML`.
     * 
     */
    public Output<String> notifyContentFormat() {
        return this.notifyContentFormat;
    }
    /**
     * The NotifyStrategy attribute of Subscription. This attribute specifies the retry strategy when message sending fails. Default value: `BACKOFF_RETRY`. Valid values:
     * 
     */
    @Export(name="notifyStrategy", refs={String.class}, tree="[0]")
    private Output<String> notifyStrategy;

    /**
     * @return The NotifyStrategy attribute of Subscription. This attribute specifies the retry strategy when message sending fails. Default value: `BACKOFF_RETRY`. Valid values:
     * 
     */
    public Output<String> notifyStrategy() {
        return this.notifyStrategy;
    }
    /**
     * The Push type of Subscription. The Valid values: `http`, `queue`, `mpush`, `alisms` and `email`.
     * 
     */
    @Export(name="pushType", refs={String.class}, tree="[0]")
    private Output<String> pushType;

    /**
     * @return The Push type of Subscription. The Valid values: `http`, `queue`, `mpush`, `alisms` and `email`.
     * 
     */
    public Output<String> pushType() {
        return this.pushType;
    }
    /**
     * Two topics subscription on a single account in the same topic cannot have the same name. A topic subscription name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
     * 
     */
    @Export(name="subscriptionName", refs={String.class}, tree="[0]")
    private Output<String> subscriptionName;

    /**
     * @return Two topics subscription on a single account in the same topic cannot have the same name. A topic subscription name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
     * 
     */
    public Output<String> subscriptionName() {
        return this.subscriptionName;
    }
    /**
     * The topic which The subscription belongs to was named with the name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
     * 
     */
    @Export(name="topicName", refs={String.class}, tree="[0]")
    private Output<String> topicName;

    /**
     * @return The topic which The subscription belongs to was named with the name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
     * 
     */
    public Output<String> topicName() {
        return this.topicName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceSubscription(String name) {
        this(name, ServiceSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceSubscription(String name, ServiceSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceSubscription(String name, ServiceSubscriptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:message/serviceSubscription:ServiceSubscription", name, args == null ? ServiceSubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceSubscription(String name, Output<String> id, @Nullable ServiceSubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:message/serviceSubscription:ServiceSubscription", name, state, makeResourceOptions(options, id));
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
    public static ServiceSubscription get(String name, Output<String> id, @Nullable ServiceSubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceSubscription(name, id, state, options);
    }
}
