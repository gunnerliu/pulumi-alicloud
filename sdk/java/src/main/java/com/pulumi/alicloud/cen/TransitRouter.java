// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.TransitRouterArgs;
import com.pulumi.alicloud.cen.inputs.TransitRouterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a CEN transit router resource that associate the transitRouter with the CEN instance.[What is Cen Transit Router](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtransitrouter)
 * 
 * &gt; **NOTE:** Available since v1.126.0.
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
 * import com.pulumi.alicloud.cen.Instance;
 * import com.pulumi.alicloud.cen.InstanceArgs;
 * import com.pulumi.alicloud.cen.TransitRouter;
 * import com.pulumi.alicloud.cen.TransitRouterArgs;
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
 *         var exampleInstance = new Instance(&#34;exampleInstance&#34;, InstanceArgs.builder()        
 *             .cenInstanceName(&#34;tf_example&#34;)
 *             .description(&#34;an example for cen&#34;)
 *             .build());
 * 
 *         var exampleTransitRouter = new TransitRouter(&#34;exampleTransitRouter&#34;, TransitRouterArgs.builder()        
 *             .transitRouterName(&#34;tf_example&#34;)
 *             .cenId(exampleInstance.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * CEN instance can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cen/transitRouter:TransitRouter default cen-*****:tr-*******
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/transitRouter:TransitRouter")
public class TransitRouter extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the CEN.
     * 
     */
    @Export(name="cenId", refs={String.class}, tree="[0]")
    private Output<String> cenId;

    /**
     * @return The ID of the CEN.
     * 
     */
    public Output<String> cenId() {
        return this.cenId;
    }
    /**
     * The dry run.
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The associating status of the Transit Router.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The associating status of the Transit Router.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values: `false`, `true`. Default Value: `false`. The multicast feature is supported only in specific regions. You can call [ListTransitRouterAvailableResource](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-listtransitrouteravailableresource) to query the regions that support multicast.
     * 
     */
    @Export(name="supportMulticast", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> supportMulticast;

    /**
     * @return Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values: `false`, `true`. Default Value: `false`. The multicast feature is supported only in specific regions. You can call [ListTransitRouterAvailableResource](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-listtransitrouteravailableresource) to query the regions that support multicast.
     * 
     */
    public Output<Optional<Boolean>> supportMulticast() {
        return Codegen.optional(this.supportMulticast);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The description of the transit router.
     * 
     */
    @Export(name="transitRouterDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> transitRouterDescription;

    /**
     * @return The description of the transit router.
     * 
     */
    public Output<Optional<String>> transitRouterDescription() {
        return Codegen.optional(this.transitRouterDescription);
    }
    /**
     * The transit router id of the transit router.
     * 
     */
    @Export(name="transitRouterId", refs={String.class}, tree="[0]")
    private Output<String> transitRouterId;

    /**
     * @return The transit router id of the transit router.
     * 
     */
    public Output<String> transitRouterId() {
        return this.transitRouterId;
    }
    /**
     * The name of the transit router.
     * 
     */
    @Export(name="transitRouterName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> transitRouterName;

    /**
     * @return The name of the transit router.
     * 
     */
    public Output<Optional<String>> transitRouterName() {
        return Codegen.optional(this.transitRouterName);
    }
    /**
     * The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitRouter(String name) {
        this(name, TransitRouterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitRouter(String name, TransitRouterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitRouter(String name, TransitRouterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouter:TransitRouter", name, args == null ? TransitRouterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitRouter(String name, Output<String> id, @Nullable TransitRouterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouter:TransitRouter", name, state, makeResourceOptions(options, id));
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
    public static TransitRouter get(String name, Output<String> id, @Nullable TransitRouterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitRouter(name, id, state, options);
    }
}
