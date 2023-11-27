// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cms.NamespaceArgs;
import com.pulumi.alicloud.cms.inputs.NamespaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Monitor Service Namespace resource.
 * 
 * For information about Cloud Monitor Service Namespace and how to use it, see [What is Namespace](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createhybridmonitornamespace).
 * 
 * &gt; **NOTE:** Available since v1.171.0.
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
 * import com.pulumi.alicloud.cms.Namespace;
 * import com.pulumi.alicloud.cms.NamespaceArgs;
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
 *         var example = new Namespace(&#34;example&#34;, NamespaceArgs.builder()        
 *             .namespace(&#34;tf_example&#34;)
 *             .specification(&#34;cms.s1.large&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloud Monitor Service Namespace can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cms/namespace:Namespace example &lt;namespace&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cms/namespace:Namespace")
public class Namespace extends com.pulumi.resources.CustomResource {
    /**
     * Description of indicator warehouse.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of indicator warehouse.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Indicator warehouse name. The namespace can contain lowercase letters, digits, and hyphens (-).
     * 
     */
    @Export(name="namespace", refs={String.class}, tree="[0]")
    private Output<String> namespace;

    /**
     * @return Indicator warehouse name. The namespace can contain lowercase letters, digits, and hyphens (-).
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }
    /**
     * Data storage duration. Valid values: `cms.s1.12xlarge`, `cms.s1.2xlarge`, `cms.s1.3xlarge`, `cms.s1.6xlarge`, `cms.s1.large`, `cms.s1.xlarge`.
     * - `cms.s1.large`: Data storage duration is 15 days.
     * - `cms.s1.xlarge`: Data storage duration is 32 days.
     * - `cms.s1.2xlarge`: Data storage duration 63 days.
     * - `cms.s1.3xlarge`: (Default) Data storage duration 93 days.
     * - `cms.s1.6xlarge`: Data storage duration 185 days.
     * - `cms.s1.12xlarge`: Data storage duration 376 days.
     * 
     */
    @Export(name="specification", refs={String.class}, tree="[0]")
    private Output<String> specification;

    /**
     * @return Data storage duration. Valid values: `cms.s1.12xlarge`, `cms.s1.2xlarge`, `cms.s1.3xlarge`, `cms.s1.6xlarge`, `cms.s1.large`, `cms.s1.xlarge`.
     * - `cms.s1.large`: Data storage duration is 15 days.
     * - `cms.s1.xlarge`: Data storage duration is 32 days.
     * - `cms.s1.2xlarge`: Data storage duration 63 days.
     * - `cms.s1.3xlarge`: (Default) Data storage duration 93 days.
     * - `cms.s1.6xlarge`: Data storage duration 185 days.
     * - `cms.s1.12xlarge`: Data storage duration 376 days.
     * 
     */
    public Output<String> specification() {
        return this.specification;
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
        super("alicloud:cms/namespace:Namespace", name, args == null ? NamespaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Namespace(String name, Output<String> id, @Nullable NamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cms/namespace:Namespace", name, state, makeResourceOptions(options, id));
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
