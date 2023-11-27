// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicecatalog;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.servicecatalog.PortfolioArgs;
import com.pulumi.alicloud.servicecatalog.inputs.PortfolioState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Service Catalog Portfolio resource.
 * 
 * For information about Service Catalog Portfolio and how to use it, see [What is Portfolio](https://www.alibabacloud.com/help/en/service-catalog/developer-reference/api-servicecatalog-2021-09-01-createportfolio).
 * 
 * &gt; **NOTE:** Available since v1.204.0+.
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
 * import com.pulumi.alicloud.servicecatalog.Portfolio;
 * import com.pulumi.alicloud.servicecatalog.PortfolioArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf_example&#34;);
 *         var default_ = new Portfolio(&#34;default&#34;, PortfolioArgs.builder()        
 *             .portfolioName(name)
 *             .providerName(name)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Service Catalog Portfolio can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:servicecatalog/portfolio:Portfolio example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:servicecatalog/portfolio:Portfolio")
public class Portfolio extends com.pulumi.resources.CustomResource {
    /**
     * The creation time of the portfolio.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the portfolio.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The description of the portfolio. The value must be 1 to 128 characters in length.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the portfolio. The value must be 1 to 128 characters in length.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ARN of the portfolio.
     * 
     */
    @Export(name="portfolioArn", refs={String.class}, tree="[0]")
    private Output<String> portfolioArn;

    /**
     * @return The ARN of the portfolio.
     * 
     */
    public Output<String> portfolioArn() {
        return this.portfolioArn;
    }
    /**
     * The name of the portfolio. The value must be 1 to 128 characters in length.
     * 
     */
    @Export(name="portfolioName", refs={String.class}, tree="[0]")
    private Output<String> portfolioName;

    /**
     * @return The name of the portfolio. The value must be 1 to 128 characters in length.
     * 
     */
    public Output<String> portfolioName() {
        return this.portfolioName;
    }
    /**
     * The provider name of the portfolio. The value must be 1 to 128 characters in length.
     * 
     */
    @Export(name="providerName", refs={String.class}, tree="[0]")
    private Output<String> providerName;

    /**
     * @return The provider name of the portfolio. The value must be 1 to 128 characters in length.
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Portfolio(String name) {
        this(name, PortfolioArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Portfolio(String name, PortfolioArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Portfolio(String name, PortfolioArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:servicecatalog/portfolio:Portfolio", name, args == null ? PortfolioArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Portfolio(String name, Output<String> id, @Nullable PortfolioState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:servicecatalog/portfolio:Portfolio", name, state, makeResourceOptions(options, id));
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
    public static Portfolio get(String name, Output<String> id, @Nullable PortfolioState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Portfolio(name, id, state, options);
    }
}
