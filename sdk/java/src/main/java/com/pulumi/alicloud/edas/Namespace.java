// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.edas;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.edas.NamespaceArgs;
import com.pulumi.alicloud.edas.inputs.NamespaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a EDAS Namespace resource.
 * 
 * For information about EDAS Namespace and how to use it, see [What is Namespace](https://www.alibabacloud.com/help/en/enterprise-distributed-application-service/latest/insertorupdateregion).
 * 
 * &gt; **NOTE:** Available since v1.173.0.
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
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetRegionsArgs;
 * import com.pulumi.alicloud.edas.Namespace;
 * import com.pulumi.alicloud.edas.NamespaceArgs;
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
 *         final var defaultRegions = AlicloudFunctions.getRegions(GetRegionsArgs.builder()
 *             .current(true)
 *             .build());
 * 
 *         var defaultNamespace = new Namespace(&#34;defaultNamespace&#34;, NamespaceArgs.builder()        
 *             .debugEnable(false)
 *             .description(name)
 *             .namespaceLogicalId(String.format(&#34;%s:example&#34;, defaultRegions.applyValue(getRegionsResult -&gt; getRegionsResult.regions()[0].id())))
 *             .namespaceName(name)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * EDAS Namespace can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:edas/namespace:Namespace example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:edas/namespace:Namespace")
public class Namespace extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether to enable remote debugging.
     * 
     */
    @Export(name="debugEnable", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> debugEnable;

    /**
     * @return Specifies whether to enable remote debugging.
     * 
     */
    public Output<Boolean> debugEnable() {
        return this.debugEnable;
    }
    /**
     * The description of the namespace, The description can be up to `128` characters in length.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the namespace, The description can be up to `128` characters in length.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the namespace.
     * - The ID of a custom namespace is in the `region ID:namespace identifier` format. An example is `cn-beijing:tdy218`.
     * - The ID of the default namespace is in the `region ID` format. An example is cn-beijing.
     * 
     */
    @Export(name="namespaceLogicalId", refs={String.class}, tree="[0]")
    private Output<String> namespaceLogicalId;

    /**
     * @return The ID of the namespace.
     * - The ID of a custom namespace is in the `region ID:namespace identifier` format. An example is `cn-beijing:tdy218`.
     * - The ID of the default namespace is in the `region ID` format. An example is cn-beijing.
     * 
     */
    public Output<String> namespaceLogicalId() {
        return this.namespaceLogicalId;
    }
    /**
     * The name of the namespace, The name can be up to `63` characters in length.
     * 
     */
    @Export(name="namespaceName", refs={String.class}, tree="[0]")
    private Output<String> namespaceName;

    /**
     * @return The name of the namespace, The name can be up to `63` characters in length.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Namespace(String name) {
        this(name, NamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Namespace(String name, NamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Namespace(String name, NamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:edas/namespace:Namespace", name, args == null ? NamespaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Namespace(String name, Output<String> id, @Nullable NamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:edas/namespace:Namespace", name, state, makeResourceOptions(options, id));
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
    public static Namespace get(String name, Output<String> id, @Nullable NamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Namespace(name, id, state, options);
    }
}
