// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.threatdetection.OssScanConfigArgs;
import com.pulumi.alicloud.threatdetection.inputs.OssScanConfigState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Threat Detection Oss Scan Config resource. Oss detection configuration.
 * 
 * For information about Threat Detection Oss Scan Config and how to use it, see [What is Oss Scan Config](https://www.alibabacloud.com/help/zh/security-center/developer-reference/api-sas-2018-12-03-createossscanconfig/).
 * 
 * &gt; **NOTE:** Available since v1.214.0.
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
 * import com.pulumi.alicloud.oss.Bucket;
 * import com.pulumi.alicloud.oss.BucketArgs;
 * import com.pulumi.alicloud.threatdetection.OssScanConfig;
 * import com.pulumi.alicloud.threatdetection.OssScanConfigArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;terraform-example&#34;);
 *         var default8j4t1R = new Bucket(&#34;default8j4t1R&#34;, BucketArgs.builder()        
 *             .bucket(String.format(&#34;%s-1&#34;, name))
 *             .storageClass(&#34;Standard&#34;)
 *             .build());
 * 
 *         var default9HMqfT = new Bucket(&#34;default9HMqfT&#34;, BucketArgs.builder()        
 *             .bucket(String.format(&#34;%s-2&#34;, name))
 *             .storageClass(&#34;Standard&#34;)
 *             .build());
 * 
 *         var defaultxBXqFQ = new Bucket(&#34;defaultxBXqFQ&#34;, BucketArgs.builder()        
 *             .bucket(String.format(&#34;%s-3&#34;, name))
 *             .storageClass(&#34;Standard&#34;)
 *             .build());
 * 
 *         var defaulthZvCmR = new Bucket(&#34;defaulthZvCmR&#34;, BucketArgs.builder()        
 *             .bucket(String.format(&#34;%s-4&#34;, name))
 *             .storageClass(&#34;Standard&#34;)
 *             .build());
 * 
 *         var default_ = new OssScanConfig(&#34;default&#34;, OssScanConfigArgs.builder()        
 *             .keySuffixLists(            
 *                 &#34;.jsp&#34;,
 *                 &#34;.php&#34;,
 *                 &#34;.k&#34;)
 *             .scanDayLists(            
 *                 &#34;2&#34;,
 *                 &#34;5&#34;,
 *                 &#34;4&#34;,
 *                 &#34;3&#34;)
 *             .ossScanConfigName(name)
 *             .endTime(&#34;00:00:02&#34;)
 *             .startTime(&#34;00:00:01&#34;)
 *             .enable(&#34;1&#34;)
 *             .allKeyPrefix(&#34;false&#34;)
 *             .bucketNameLists(            
 *                 default8j4t1R.bucket(),
 *                 default9HMqfT.bucket(),
 *                 defaultxBXqFQ.bucket())
 *             .keyPrefixLists(            
 *                 &#34;/root&#34;,
 *                 &#34;/usr&#34;,
 *                 &#34;/123&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Threat Detection Oss Scan Config can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:threatdetection/ossScanConfig:OssScanConfig example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:threatdetection/ossScanConfig:OssScanConfig")
public class OssScanConfig extends com.pulumi.resources.CustomResource {
    /**
     * Match all prefixes.
     * 
     */
    @Export(name="allKeyPrefix", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> allKeyPrefix;

    /**
     * @return Match all prefixes.
     * 
     */
    public Output<Boolean> allKeyPrefix() {
        return this.allKeyPrefix;
    }
    /**
     * Bucket List.
     * 
     */
    @Export(name="bucketNameLists", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> bucketNameLists;

    /**
     * @return Bucket List.
     * 
     */
    public Output<List<String>> bucketNameLists() {
        return this.bucketNameLists;
    }
    /**
     * Enable configuration.
     * 
     */
    @Export(name="enable", refs={Integer.class}, tree="[0]")
    private Output<Integer> enable;

    /**
     * @return Enable configuration.
     * 
     */
    public Output<Integer> enable() {
        return this.enable;
    }
    /**
     * End time, hours, minutes and seconds.
     * 
     */
    @Export(name="endTime", refs={String.class}, tree="[0]")
    private Output<String> endTime;

    /**
     * @return End time, hours, minutes and seconds.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    /**
     * File prefix list.
     * 
     */
    @Export(name="keyPrefixLists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> keyPrefixLists;

    /**
     * @return File prefix list.
     * 
     */
    public Output<Optional<List<String>>> keyPrefixLists() {
        return Codegen.optional(this.keyPrefixLists);
    }
    /**
     * File Suffix List.
     * 
     */
    @Export(name="keySuffixLists", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> keySuffixLists;

    /**
     * @return File Suffix List.
     * 
     */
    public Output<List<String>> keySuffixLists() {
        return this.keySuffixLists;
    }
    /**
     * Configuration Name.
     * 
     */
    @Export(name="ossScanConfigName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ossScanConfigName;

    /**
     * @return Configuration Name.
     * 
     */
    public Output<Optional<String>> ossScanConfigName() {
        return Codegen.optional(this.ossScanConfigName);
    }
    /**
     * Scan cycle.
     * 
     */
    @Export(name="scanDayLists", refs={List.class,Integer.class}, tree="[0,1]")
    private Output<List<Integer>> scanDayLists;

    /**
     * @return Scan cycle.
     * 
     */
    public Output<List<Integer>> scanDayLists() {
        return this.scanDayLists;
    }
    /**
     * Start time, hours, minutes and seconds.
     * 
     */
    @Export(name="startTime", refs={String.class}, tree="[0]")
    private Output<String> startTime;

    /**
     * @return Start time, hours, minutes and seconds.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OssScanConfig(String name) {
        this(name, OssScanConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OssScanConfig(String name, OssScanConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OssScanConfig(String name, OssScanConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:threatdetection/ossScanConfig:OssScanConfig", name, args == null ? OssScanConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OssScanConfig(String name, Output<String> id, @Nullable OssScanConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:threatdetection/ossScanConfig:OssScanConfig", name, state, makeResourceOptions(options, id));
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
    public static OssScanConfig get(String name, Output<String> id, @Nullable OssScanConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OssScanConfig(name, id, state, options);
    }
}
