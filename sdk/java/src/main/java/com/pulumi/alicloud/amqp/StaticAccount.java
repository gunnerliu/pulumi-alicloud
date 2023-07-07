// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.amqp;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.amqp.StaticAccountArgs;
import com.pulumi.alicloud.amqp.inputs.StaticAccountState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Amqp Static Account resource.
 * 
 * For information about Amqp Static Account and how to use it, see [What is Static Account](https://www.alibabacloud.com/help/en/message-queue-for-rabbitmq/latest/create-a-pair-of-static-username-and-password).
 * 
 * &gt; **NOTE:** Available since v1.195.0.
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
 * import com.pulumi.alicloud.amqp.StaticAccount;
 * import com.pulumi.alicloud.amqp.StaticAccountArgs;
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
 *         final var accessKey = config.get(&#34;accessKey&#34;).orElse(&#34;access_key&#34;);
 *         final var secretKey = config.get(&#34;secretKey&#34;).orElse(&#34;secret_key&#34;);
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .instanceType(&#34;enterprise&#34;)
 *             .maxTps(3000)
 *             .queueCapacity(200)
 *             .storageSize(700)
 *             .supportEip(false)
 *             .maxEipTps(128)
 *             .paymentType(&#34;Subscription&#34;)
 *             .period(1)
 *             .build());
 * 
 *         var defaultStaticAccount = new StaticAccount(&#34;defaultStaticAccount&#34;, StaticAccountArgs.builder()        
 *             .instanceId(defaultInstance.id())
 *             .accessKey(accessKey)
 *             .secretKey(secretKey)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Amqp Static Account can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:amqp/staticAccount:StaticAccount example &lt;instance_id&gt;:&lt;access_key&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:amqp/staticAccount:StaticAccount")
public class StaticAccount extends com.pulumi.resources.CustomResource {
    /**
     * Access key.
     * 
     */
    @Export(name="accessKey", type=String.class, parameters={})
    private Output<String> accessKey;

    /**
     * @return Access key.
     * 
     */
    public Output<String> accessKey() {
        return this.accessKey;
    }
    /**
     * Create time stamp. Unix timestamp, to millisecond level.
     * 
     */
    @Export(name="createTime", type=Integer.class, parameters={})
    private Output<Integer> createTime;

    /**
     * @return Create time stamp. Unix timestamp, to millisecond level.
     * 
     */
    public Output<Integer> createTime() {
        return this.createTime;
    }
    /**
     * Amqp instance ID.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return Amqp instance ID.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The ID of the user&#39;s primary account.
     * 
     */
    @Export(name="masterUid", type=String.class, parameters={})
    private Output<String> masterUid;

    /**
     * @return The ID of the user&#39;s primary account.
     * 
     */
    public Output<String> masterUid() {
        return this.masterUid;
    }
    /**
     * Static password.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return Static password.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * Secret key.
     * 
     */
    @Export(name="secretKey", type=String.class, parameters={})
    private Output<String> secretKey;

    /**
     * @return Secret key.
     * 
     */
    public Output<String> secretKey() {
        return this.secretKey;
    }
    /**
     * Static user name.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return Static user name.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StaticAccount(String name) {
        this(name, StaticAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StaticAccount(String name, StaticAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StaticAccount(String name, StaticAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:amqp/staticAccount:StaticAccount", name, args == null ? StaticAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StaticAccount(String name, Output<String> id, @Nullable StaticAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:amqp/staticAccount:StaticAccount", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "secretKey"
            ))
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
    public static StaticAccount get(String name, Output<String> id, @Nullable StaticAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StaticAccount(name, id, state, options);
    }
}
