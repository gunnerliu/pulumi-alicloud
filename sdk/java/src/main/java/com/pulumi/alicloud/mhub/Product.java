// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mhub;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.mhub.ProductArgs;
import com.pulumi.alicloud.mhub.inputs.ProductState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a MHUB Product resource.
 * 
 * For information about MHUB Product and how to use it, see [What is Product](https://help.aliyun.com/product/65109.html).
 * 
 * &gt; **NOTE:** Available in v1.138.0+.
 * 
 * &gt; **NOTE:** At present, the resource only supports cn-shanghai region.
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
 * import com.pulumi.alicloud.mhub.Product;
 * import com.pulumi.alicloud.mhub.ProductArgs;
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
 *         var example = new Product(&#34;example&#34;, ProductArgs.builder()        
 *             .productName(&#34;example_value&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * MHUB Product can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:mhub/product:Product example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:mhub/product:Product")
public class Product extends com.pulumi.resources.CustomResource {
    /**
     * ProductName.
     * 
     */
    @Export(name="productName", type=String.class, parameters={})
    private Output<String> productName;

    /**
     * @return ProductName.
     * 
     */
    public Output<String> productName() {
        return this.productName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Product(String name) {
        this(name, ProductArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Product(String name, ProductArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Product(String name, ProductArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:mhub/product:Product", name, args == null ? ProductArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Product(String name, Output<String> id, @Nullable ProductState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:mhub/product:Product", name, state, makeResourceOptions(options, id));
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
    public static Product get(String name, Output<String> id, @Nullable ProductState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Product(name, id, state, options);
    }
}