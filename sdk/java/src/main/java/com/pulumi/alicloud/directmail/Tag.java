// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.directmail;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.directmail.TagArgs;
import com.pulumi.alicloud.directmail.inputs.TagState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Direct Mail Tag resource.
 * 
 * For information about Direct Mail Tag and how to use it, see [What is Tag](https://www.alibabacloud.com/help/en/directmail/latest/createtag).
 * 
 * &gt; **NOTE:** Available since v1.144.0.
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
 * import com.pulumi.alicloud.directmail.Tag;
 * import com.pulumi.alicloud.directmail.TagArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;example&#34;);
 *         var example = new Tag(&#34;example&#34;, TagArgs.builder()        
 *             .tagName(name)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Direct Mail Tag can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:directmail/tag:Tag example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:directmail/tag:Tag")
public class Tag extends com.pulumi.resources.CustomResource {
    /**
     * The name of the tag. The name must be `1` to `50` characters in length, and can contain letters and digits.
     * 
     */
    @Export(name="tagName", refs={String.class}, tree="[0]")
    private Output<String> tagName;

    /**
     * @return The name of the tag. The name must be `1` to `50` characters in length, and can contain letters and digits.
     * 
     */
    public Output<String> tagName() {
        return this.tagName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Tag(String name) {
        this(name, TagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Tag(String name, TagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tag(String name, TagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:directmail/tag:Tag", name, args == null ? TagArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Tag(String name, Output<String> id, @Nullable TagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:directmail/tag:Tag", name, state, makeResourceOptions(options, id));
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
    public static Tag get(String name, Output<String> id, @Nullable TagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Tag(name, id, state, options);
    }
}
