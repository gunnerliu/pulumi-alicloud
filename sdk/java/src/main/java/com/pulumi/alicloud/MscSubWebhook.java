// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud;

import com.pulumi.alicloud.MscSubWebhookArgs;
import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.inputs.MscSubWebhookState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Msc Sub Webhook resource.
 * 
 * &gt; **NOTE:** Available in v1.141.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Msc Sub Webhook can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:index/mscSubWebhook:MscSubWebhook example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:index/mscSubWebhook:MscSubWebhook")
public class MscSubWebhook extends com.pulumi.resources.CustomResource {
    /**
     * The serverUrl of the Webhook. This url must start with `https://oapi.dingtalk.com/robot/send?access_token=`.
     * 
     */
    @Export(name="serverUrl", type=String.class, parameters={})
    private Output<String> serverUrl;

    /**
     * @return The serverUrl of the Webhook. This url must start with `https://oapi.dingtalk.com/robot/send?access_token=`.
     * 
     */
    public Output<String> serverUrl() {
        return this.serverUrl;
    }
    /**
     * The name of the Webhook. **Note:** The name must be `2` to `12` characters in length, and can contain uppercase and lowercase letters.
     * 
     */
    @Export(name="webhookName", type=String.class, parameters={})
    private Output<String> webhookName;

    /**
     * @return The name of the Webhook. **Note:** The name must be `2` to `12` characters in length, and can contain uppercase and lowercase letters.
     * 
     */
    public Output<String> webhookName() {
        return this.webhookName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MscSubWebhook(String name) {
        this(name, MscSubWebhookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MscSubWebhook(String name, MscSubWebhookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MscSubWebhook(String name, MscSubWebhookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:index/mscSubWebhook:MscSubWebhook", name, args == null ? MscSubWebhookArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MscSubWebhook(String name, Output<String> id, @Nullable MscSubWebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:index/mscSubWebhook:MscSubWebhook", name, state, makeResourceOptions(options, id));
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
    public static MscSubWebhook get(String name, Output<String> id, @Nullable MscSubWebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MscSubWebhook(name, id, state, options);
    }
}
