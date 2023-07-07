// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.TransitRouterCidrArgs;
import com.pulumi.alicloud.cen.inputs.TransitRouterCidrState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Enterprise Network (CEN) Transit Router Cidr resource.
 * 
 * For information about Cloud Enterprise Network (CEN) Transit Router Cidr and how to use it, see [What is Transit Router Cidr](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/createtransitroutercidr).
 * 
 * &gt; **NOTE:** Available since v1.193.0.
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
 * import com.pulumi.alicloud.cen.TransitRouterCidr;
 * import com.pulumi.alicloud.cen.TransitRouterCidrArgs;
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
 *         var exampleTransitRouterCidr = new TransitRouterCidr(&#34;exampleTransitRouterCidr&#34;, TransitRouterCidrArgs.builder()        
 *             .transitRouterId(exampleTransitRouter.transitRouterId())
 *             .cidr(&#34;192.168.0.0/16&#34;)
 *             .transitRouterCidrName(&#34;tf_example&#34;)
 *             .description(&#34;tf_example&#34;)
 *             .publishCidrRoute(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloud Enterprise Network (CEN) Transit Router Cidr can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cen/transitRouterCidr:TransitRouterCidr default &lt;transit_router_id&gt;:&lt;transit_router_cidr_id&gt;.
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/transitRouterCidr:TransitRouterCidr")
public class TransitRouterCidr extends com.pulumi.resources.CustomResource {
    /**
     * The cidr of the transit router.
     * 
     */
    @Export(name="cidr", type=String.class, parameters={})
    private Output<String> cidr;

    /**
     * @return The cidr of the transit router.
     * 
     */
    public Output<String> cidr() {
        return this.cidr;
    }
    /**
     * The description of the transit router. The description must be `2` to `256` characters in length, and it must start with English letters, but cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the transit router. The description must be `2` to `256` characters in length, and it must start with English letters, but cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether to allow automatically adding Transit Router Cidr in Transit Router Route Table. Valid values: `true` and `false`. Default value: `true`.
     * 
     */
    @Export(name="publishCidrRoute", type=Boolean.class, parameters={})
    private Output<Boolean> publishCidrRoute;

    /**
     * @return Whether to allow automatically adding Transit Router Cidr in Transit Router Route Table. Valid values: `true` and `false`. Default value: `true`.
     * 
     */
    public Output<Boolean> publishCidrRoute() {
        return this.publishCidrRoute;
    }
    /**
     * The ID of the transit router cidr.
     * 
     */
    @Export(name="transitRouterCidrId", type=String.class, parameters={})
    private Output<String> transitRouterCidrId;

    /**
     * @return The ID of the transit router cidr.
     * 
     */
    public Output<String> transitRouterCidrId() {
        return this.transitRouterCidrId;
    }
    /**
     * The name of the transit router. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="transitRouterCidrName", type=String.class, parameters={})
    private Output</* @Nullable */ String> transitRouterCidrName;

    /**
     * @return The name of the transit router. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> transitRouterCidrName() {
        return Codegen.optional(this.transitRouterCidrName);
    }
    /**
     * The ID of the transit router.
     * 
     */
    @Export(name="transitRouterId", type=String.class, parameters={})
    private Output<String> transitRouterId;

    /**
     * @return The ID of the transit router.
     * 
     */
    public Output<String> transitRouterId() {
        return this.transitRouterId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitRouterCidr(String name) {
        this(name, TransitRouterCidrArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitRouterCidr(String name, TransitRouterCidrArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitRouterCidr(String name, TransitRouterCidrArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterCidr:TransitRouterCidr", name, args == null ? TransitRouterCidrArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitRouterCidr(String name, Output<String> id, @Nullable TransitRouterCidrState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterCidr:TransitRouterCidr", name, state, makeResourceOptions(options, id));
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
    public static TransitRouterCidr get(String name, Output<String> id, @Nullable TransitRouterCidrState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitRouterCidr(name, id, state, options);
    }
}
