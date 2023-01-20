// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dcdn.WafPolicyArgs;
import com.pulumi.alicloud.dcdn.inputs.WafPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a DCDN Waf Policy resource.
 * 
 * For information about DCDN Waf Policy and how to use it, see [What is Waf Policy](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/set-the-protection-policies#doc-api-dcdn-CreateDcdnWafPolicy).
 * 
 * &gt; **NOTE:** Available in v1.184.0+.
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
 * import com.pulumi.alicloud.dcdn.WafPolicy;
 * import com.pulumi.alicloud.dcdn.WafPolicyArgs;
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
 *         var example = new WafPolicy(&#34;example&#34;, WafPolicyArgs.builder()        
 *             .defenseScene(&#34;waf_group&#34;)
 *             .policyName(var_.name())
 *             .policyType(&#34;custom&#34;)
 *             .status(&#34;on&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * DCDN Waf Policy can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:dcdn/wafPolicy:WafPolicy example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:dcdn/wafPolicy:WafPolicy")
public class WafPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The type of protection policy. Valid values: `waf_group`, `custom_acl`, `whitelist`.
     * 
     */
    @Export(name="defenseScene", type=String.class, parameters={})
    private Output<String> defenseScene;

    /**
     * @return The type of protection policy. Valid values: `waf_group`, `custom_acl`, `whitelist`.
     * 
     */
    public Output<String> defenseScene() {
        return this.defenseScene;
    }
    /**
     * The name of the protection policy. The name must be 1 to 64 characters in length, and can contain letters, digits,and underscores (_).
     * 
     */
    @Export(name="policyName", type=String.class, parameters={})
    private Output<String> policyName;

    /**
     * @return The name of the protection policy. The name must be 1 to 64 characters in length, and can contain letters, digits,and underscores (_).
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }
    /**
     * The type of the protection policy. Valid values: `default`, `custom`.
     * 
     */
    @Export(name="policyType", type=String.class, parameters={})
    private Output<String> policyType;

    /**
     * @return The type of the protection policy. Valid values: `default`, `custom`.
     * 
     */
    public Output<String> policyType() {
        return this.policyType;
    }
    /**
     * The status of the resource. Valid values: `on`, `off`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the resource. Valid values: `on`, `off`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WafPolicy(String name) {
        this(name, WafPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WafPolicy(String name, WafPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WafPolicy(String name, WafPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dcdn/wafPolicy:WafPolicy", name, args == null ? WafPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WafPolicy(String name, Output<String> id, @Nullable WafPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dcdn/wafPolicy:WafPolicy", name, state, makeResourceOptions(options, id));
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
    public static WafPolicy get(String name, Output<String> id, @Nullable WafPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WafPolicy(name, id, state, options);
    }
}
