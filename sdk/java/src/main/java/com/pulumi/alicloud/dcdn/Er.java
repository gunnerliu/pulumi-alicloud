// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dcdn.ErArgs;
import com.pulumi.alicloud.dcdn.inputs.ErState;
import com.pulumi.alicloud.dcdn.outputs.ErEnvConf;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DCDN Er resource.
 * 
 * For information about DCDN Er and how to use it, see [What is Er](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/createroutine).
 * 
 * &gt; **NOTE:** Available in v1.201.0+.
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
 * import com.pulumi.alicloud.dcdn.Er;
 * import com.pulumi.alicloud.dcdn.ErArgs;
 * import com.pulumi.alicloud.dcdn.inputs.ErEnvConfArgs;
 * import com.pulumi.alicloud.dcdn.inputs.ErEnvConfProductionArgs;
 * import com.pulumi.alicloud.dcdn.inputs.ErEnvConfStagingArgs;
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
 *         var default_ = new Er(&#34;default&#34;, ErArgs.builder()        
 *             .description(&#34;tf-example-description&#34;)
 *             .envConf(ErEnvConfArgs.builder()
 *                 .production(ErEnvConfProductionArgs.builder()
 *                     .allowedHosts(&#34;example.com&#34;)
 *                     .specName(&#34;5ms&#34;)
 *                     .build())
 *                 .staging(ErEnvConfStagingArgs.builder()
 *                     .allowedHosts(&#34;example.com&#34;)
 *                     .specName(&#34;5ms&#34;)
 *                     .build())
 *                 .build())
 *             .erName(&#34;tf-example-name&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * DCDN Er can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:dcdn/er:Er example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:dcdn/er:Er")
public class Er extends com.pulumi.resources.CustomResource {
    /**
     * Routine The description of the routine.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Routine The description of the routine.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The configurations of the specified environment. See the following `Block env_conf`.
     * 
     */
    @Export(name="envConf", type=ErEnvConf.class, parameters={})
    private Output<ErEnvConf> envConf;

    /**
     * @return The configurations of the specified environment. See the following `Block env_conf`.
     * 
     */
    public Output<ErEnvConf> envConf() {
        return this.envConf;
    }
    /**
     * The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
     * 
     */
    @Export(name="erName", type=String.class, parameters={})
    private Output<String> erName;

    /**
     * @return The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
     * 
     */
    public Output<String> erName() {
        return this.erName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Er(String name) {
        this(name, ErArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Er(String name, ErArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Er(String name, ErArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dcdn/er:Er", name, args == null ? ErArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Er(String name, Output<String> id, @Nullable ErState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dcdn/er:Er", name, state, makeResourceOptions(options, id));
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
    public static Er get(String name, Output<String> id, @Nullable ErState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Er(name, id, state, options);
    }
}