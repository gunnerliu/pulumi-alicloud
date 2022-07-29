// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudstoragegateway;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cloudstoragegateway.ExpressSyncArgs;
import com.pulumi.alicloud.cloudstoragegateway.inputs.ExpressSyncState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Storage Gateway Express Sync resource.
 * 
 * For information about Cloud Storage Gateway Express Sync and how to use it, see [What is Express Sync](https://www.alibabacloud.com/help/en/doc-detail/53972.htm).
 * 
 * &gt; **NOTE:** Available in v1.144.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Cloud Storage Gateway Express Sync can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cloudstoragegateway/expressSync:ExpressSync example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cloudstoragegateway/expressSync:ExpressSync")
public class ExpressSync extends com.pulumi.resources.CustomResource {
    /**
     * The name of the OSS Bucket.
     * 
     */
    @Export(name="bucketName", type=String.class, parameters={})
    private Output<String> bucketName;

    /**
     * @return The name of the OSS Bucket.
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }
    /**
     * The prefix of the OSS Bucket.
     * 
     */
    @Export(name="bucketPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> bucketPrefix;

    /**
     * @return The prefix of the OSS Bucket.
     * 
     */
    public Output<Optional<String>> bucketPrefix() {
        return Codegen.optional(this.bucketPrefix);
    }
    /**
     * The region of the OSS Bucket.
     * 
     */
    @Export(name="bucketRegion", type=String.class, parameters={})
    private Output<String> bucketRegion;

    /**
     * @return The region of the OSS Bucket.
     * 
     */
    public Output<String> bucketRegion() {
        return this.bucketRegion;
    }
    /**
     * The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Express Sync. The length of the name is limited to `1` to `255` characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
     * 
     */
    @Export(name="expressSyncName", type=String.class, parameters={})
    private Output<String> expressSyncName;

    /**
     * @return The name of the ExpressSync. The length of the name is limited to `1` to `128` characters. It can contain uppercase and lowercase letters, Chinese characters, numbers, English periods (.), underscores (_), or hyphens (-), and must start with  letters.
     * 
     */
    public Output<String> expressSyncName() {
        return this.expressSyncName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExpressSync(String name) {
        this(name, ExpressSyncArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExpressSync(String name, ExpressSyncArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExpressSync(String name, ExpressSyncArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudstoragegateway/expressSync:ExpressSync", name, args == null ? ExpressSyncArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExpressSync(String name, Output<String> id, @Nullable ExpressSyncState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudstoragegateway/expressSync:ExpressSync", name, state, makeResourceOptions(options, id));
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
    public static ExpressSync get(String name, Output<String> id, @Nullable ExpressSyncState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExpressSync(name, id, state, options);
    }
}
