// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.threatdetection.HoneypotPresetArgs;
import com.pulumi.alicloud.threatdetection.inputs.HoneypotPresetState;
import com.pulumi.alicloud.threatdetection.outputs.HoneypotPresetMeta;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Threat Detection Honeypot Preset resource.
 * 
 * For information about Threat Detection Honeypot Preset and how to use it, see [What is Honeypot Preset](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-createhoneypotpreset).
 * 
 * &gt; **NOTE:** Available since v1.195.0.
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
 * import com.pulumi.alicloud.threatdetection.ThreatdetectionFunctions;
 * import com.pulumi.alicloud.threatdetection.inputs.GetHoneypotImagesArgs;
 * import com.pulumi.alicloud.threatdetection.HoneypotNode;
 * import com.pulumi.alicloud.threatdetection.HoneypotNodeArgs;
 * import com.pulumi.alicloud.threatdetection.HoneypotPreset;
 * import com.pulumi.alicloud.threatdetection.HoneypotPresetArgs;
 * import com.pulumi.alicloud.threatdetection.inputs.HoneypotPresetMetaArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tfexample&#34;);
 *         final var defaultHoneypotImages = ThreatdetectionFunctions.getHoneypotImages(GetHoneypotImagesArgs.builder()
 *             .nameRegex(&#34;^ruoyi&#34;)
 *             .build());
 * 
 *         var defaultHoneypotNode = new HoneypotNode(&#34;defaultHoneypotNode&#34;, HoneypotNodeArgs.builder()        
 *             .nodeName(name)
 *             .availableProbeNum(20)
 *             .securityGroupProbeIpLists(&#34;0.0.0.0/0&#34;)
 *             .build());
 * 
 *         var defaultHoneypotPreset = new HoneypotPreset(&#34;defaultHoneypotPreset&#34;, HoneypotPresetArgs.builder()        
 *             .presetName(name)
 *             .nodeId(defaultHoneypotNode.id())
 *             .honeypotImageName(defaultHoneypotImages.applyValue(getHoneypotImagesResult -&gt; getHoneypotImagesResult.images()[0].honeypotImageName()))
 *             .meta(HoneypotPresetMetaArgs.builder()
 *                 .portraitOption(true)
 *                 .burp(&#34;open&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Threat Detection Honeypot Preset can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:threatdetection/honeypotPreset:HoneypotPreset example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:threatdetection/honeypotPreset:HoneypotPreset")
public class HoneypotPreset extends com.pulumi.resources.CustomResource {
    /**
     * Honeypot mirror name
     * 
     */
    @Export(name="honeypotImageName", refs={String.class}, tree="[0]")
    private Output<String> honeypotImageName;

    /**
     * @return Honeypot mirror name
     * 
     */
    public Output<String> honeypotImageName() {
        return this.honeypotImageName;
    }
    /**
     * Unique ID of honeypot Template
     * 
     */
    @Export(name="honeypotPresetId", refs={String.class}, tree="[0]")
    private Output<String> honeypotPresetId;

    /**
     * @return Unique ID of honeypot Template
     * 
     */
    public Output<String> honeypotPresetId() {
        return this.honeypotPresetId;
    }
    /**
     * Honeypot template custom parameters. See `meta` below.
     * 
     */
    @Export(name="meta", refs={HoneypotPresetMeta.class}, tree="[0]")
    private Output<HoneypotPresetMeta> meta;

    /**
     * @return Honeypot template custom parameters. See `meta` below.
     * 
     */
    public Output<HoneypotPresetMeta> meta() {
        return this.meta;
    }
    /**
     * Unique id of management node
     * 
     */
    @Export(name="nodeId", refs={String.class}, tree="[0]")
    private Output<String> nodeId;

    /**
     * @return Unique id of management node
     * 
     */
    public Output<String> nodeId() {
        return this.nodeId;
    }
    /**
     * Honeypot template custom name
     * 
     */
    @Export(name="presetName", refs={String.class}, tree="[0]")
    private Output<String> presetName;

    /**
     * @return Honeypot template custom name
     * 
     */
    public Output<String> presetName() {
        return this.presetName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HoneypotPreset(String name) {
        this(name, HoneypotPresetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HoneypotPreset(String name, HoneypotPresetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HoneypotPreset(String name, HoneypotPresetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:threatdetection/honeypotPreset:HoneypotPreset", name, args == null ? HoneypotPresetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HoneypotPreset(String name, Output<String> id, @Nullable HoneypotPresetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:threatdetection/honeypotPreset:HoneypotPreset", name, state, makeResourceOptions(options, id));
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
    public static HoneypotPreset get(String name, Output<String> id, @Nullable HoneypotPresetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HoneypotPreset(name, id, state, options);
    }
}
