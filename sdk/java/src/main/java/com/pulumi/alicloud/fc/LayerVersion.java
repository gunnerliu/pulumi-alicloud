// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.fc.LayerVersionArgs;
import com.pulumi.alicloud.fc.inputs.LayerVersionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.random.RandomInteger;
 * import com.pulumi.random.RandomIntegerArgs;
 * import com.pulumi.alicloud.oss.Bucket;
 * import com.pulumi.alicloud.oss.BucketArgs;
 * import com.pulumi.alicloud.oss.BucketObject;
 * import com.pulumi.alicloud.oss.BucketObjectArgs;
 * import com.pulumi.alicloud.fc.LayerVersion;
 * import com.pulumi.alicloud.fc.LayerVersionArgs;
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
 *         var defaultRandomInteger = new RandomInteger(&#34;defaultRandomInteger&#34;, RandomIntegerArgs.builder()        
 *             .max(99999)
 *             .min(10000)
 *             .build());
 * 
 *         var defaultBucket = new Bucket(&#34;defaultBucket&#34;, BucketArgs.builder()        
 *             .bucket(defaultRandomInteger.result().applyValue(result -&gt; String.format(&#34;terraform-example-%s&#34;, result)))
 *             .build());
 * 
 *         var defaultBucketObject = new BucketObject(&#34;defaultBucketObject&#34;, BucketObjectArgs.builder()        
 *             .bucket(defaultBucket.id())
 *             .key(&#34;index.py&#34;)
 *             .content(&#34;&#34;&#34;
 * import logging 
 * def handler(event, context): 
 * logger = logging.getLogger() 
 * logger.info(&#39;hello world&#39;) 
 * return &#39;hello world&#39;            &#34;&#34;&#34;)
 *             .build());
 * 
 *         var example = new LayerVersion(&#34;example&#34;, LayerVersionArgs.builder()        
 *             .layerName(defaultRandomInteger.result().applyValue(result -&gt; String.format(&#34;terraform-example-%s&#34;, result)))
 *             .compatibleRuntimes(&#34;python2.7&#34;)
 *             .ossBucketName(defaultBucket.bucket())
 *             .ossObjectName(defaultBucketObject.key())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Function Compute Layer Version can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:fc/layerVersion:LayerVersion example my_function
 * ```
 * 
 */
@ResourceType(type="alicloud:fc/layerVersion:LayerVersion")
public class LayerVersion extends com.pulumi.resources.CustomResource {
    /**
     * The access mode of Layer Version.
     * 
     */
    @Export(name="acl", refs={String.class}, tree="[0]")
    private Output<String> acl;

    /**
     * @return The access mode of Layer Version.
     * 
     */
    public Output<String> acl() {
        return this.acl;
    }
    /**
     * The arn of Layer Version.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The arn of Layer Version.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The checksum of the layer code package.
     * 
     */
    @Export(name="codeCheckSum", refs={String.class}, tree="[0]")
    private Output<String> codeCheckSum;

    /**
     * @return The checksum of the layer code package.
     * 
     */
    public Output<String> codeCheckSum() {
        return this.codeCheckSum;
    }
    /**
     * The list of runtime environments that are supported by the layer. Valid values: `nodejs14`, `nodejs12`, `nodejs10`, `nodejs8`, `nodejs6`, `python3.9`, `python3`, `python2.7`, `java11`, `java8`, `php7.2`, `go1`,`dotnetcore2.1`, `custom`.
     * 
     */
    @Export(name="compatibleRuntimes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> compatibleRuntimes;

    /**
     * @return The list of runtime environments that are supported by the layer. Valid values: `nodejs14`, `nodejs12`, `nodejs10`, `nodejs8`, `nodejs6`, `python3.9`, `python3`, `python2.7`, `java11`, `java8`, `php7.2`, `go1`,`dotnetcore2.1`, `custom`.
     * 
     */
    public Output<List<String>> compatibleRuntimes() {
        return this.compatibleRuntimes;
    }
    /**
     * The description of the layer version.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the layer version.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the layer.
     * 
     */
    @Export(name="layerName", refs={String.class}, tree="[0]")
    private Output<String> layerName;

    /**
     * @return The name of the layer.
     * 
     */
    public Output<String> layerName() {
        return this.layerName;
    }
    /**
     * The name of the OSS bucket that stores the ZIP package of the function code.
     * 
     */
    @Export(name="ossBucketName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ossBucketName;

    /**
     * @return The name of the OSS bucket that stores the ZIP package of the function code.
     * 
     */
    public Output<Optional<String>> ossBucketName() {
        return Codegen.optional(this.ossBucketName);
    }
    /**
     * The name of the OSS object (ZIP package) that contains the function code.
     * 
     */
    @Export(name="ossObjectName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ossObjectName;

    /**
     * @return The name of the OSS object (ZIP package) that contains the function code.
     * 
     */
    public Output<Optional<String>> ossObjectName() {
        return Codegen.optional(this.ossObjectName);
    }
    /**
     * Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_runtimes`, `description`, `layer_name`, `oss_bucket_name`,  `oss_object_name`, or `zip_file` forces deletion of the existing layer version and creation of a new layer version.
     * 
     */
    @Export(name="skipDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipDestroy;

    /**
     * @return Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_runtimes`, `description`, `layer_name`, `oss_bucket_name`,  `oss_object_name`, or `zip_file` forces deletion of the existing layer version and creation of a new layer version.
     * 
     */
    public Output<Optional<Boolean>> skipDestroy() {
        return Codegen.optional(this.skipDestroy);
    }
    /**
     * The version of Layer Version.
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    /**
     * @return The version of Layer Version.
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * The ZIP package of the function code that is encoded in the Base64 format.
     * 
     * &gt; **NOTE:** `zip_file` and `oss_bucket_name`, `oss_object_name` cannot be used together.
     * 
     */
    @Export(name="zipFile", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> zipFile;

    /**
     * @return The ZIP package of the function code that is encoded in the Base64 format.
     * 
     * &gt; **NOTE:** `zip_file` and `oss_bucket_name`, `oss_object_name` cannot be used together.
     * 
     */
    public Output<Optional<String>> zipFile() {
        return Codegen.optional(this.zipFile);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LayerVersion(String name) {
        this(name, LayerVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LayerVersion(String name, LayerVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LayerVersion(String name, LayerVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:fc/layerVersion:LayerVersion", name, args == null ? LayerVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LayerVersion(String name, Output<String> id, @Nullable LayerVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:fc/layerVersion:LayerVersion", name, state, makeResourceOptions(options, id));
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
    public static LayerVersion get(String name, Output<String> id, @Nullable LayerVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LayerVersion(name, id, state, options);
    }
}
