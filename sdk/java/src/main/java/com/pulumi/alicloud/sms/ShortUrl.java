// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.sms.ShortUrlArgs;
import com.pulumi.alicloud.sms.inputs.ShortUrlState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a SMS Short Url resource.
 * 
 * For information about SMS Short Url and how to use it, see [What is Short Url](https://next.api.alibabacloud.com/api/Dysmsapi/2017-05-25/AddShortUrl).
 * 
 * &gt; **NOTE:** Available in v1.178.0+.
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
 * import com.pulumi.alicloud.sms.ShortUrl;
 * import com.pulumi.alicloud.sms.ShortUrlArgs;
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
 *         var example = new ShortUrl(&#34;example&#34;, ShortUrlArgs.builder()        
 *             .effectiveDays(30)
 *             .shortUrlName(&#34;example_value&#34;)
 *             .sourceUrl(&#34;example_value&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * SMS Short Url can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:sms/shortUrl:ShortUrl example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:sms/shortUrl:ShortUrl")
public class ShortUrl extends com.pulumi.resources.CustomResource {
    /**
     * Short chain service use validity period. Valid values: `30`, `60`, `90`. The unit is days, and the maximum validity period is 90 days.
     * 
     */
    @Export(name="effectiveDays", refs={Integer.class}, tree="[0]")
    private Output<Integer> effectiveDays;

    /**
     * @return Short chain service use validity period. Valid values: `30`, `60`, `90`. The unit is days, and the maximum validity period is 90 days.
     * 
     */
    public Output<Integer> effectiveDays() {
        return this.effectiveDays;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="shortUrlName", refs={String.class}, tree="[0]")
    private Output<String> shortUrlName;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> shortUrlName() {
        return this.shortUrlName;
    }
    /**
     * The original link address.
     * 
     */
    @Export(name="sourceUrl", refs={String.class}, tree="[0]")
    private Output<String> sourceUrl;

    /**
     * @return The original link address.
     * 
     */
    public Output<String> sourceUrl() {
        return this.sourceUrl;
    }
    /**
     * Short chain status.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Short chain status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ShortUrl(String name) {
        this(name, ShortUrlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ShortUrl(String name, ShortUrlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ShortUrl(String name, ShortUrlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:sms/shortUrl:ShortUrl", name, args == null ? ShortUrlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ShortUrl(String name, Output<String> id, @Nullable ShortUrlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:sms/shortUrl:ShortUrl", name, state, makeResourceOptions(options, id));
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
    public static ShortUrl get(String name, Output<String> id, @Nullable ShortUrlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ShortUrl(name, id, state, options);
    }
}
