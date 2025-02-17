// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.TrafficMirrorFilterArgs;
import com.pulumi.alicloud.vpc.inputs.TrafficMirrorFilterState;
import com.pulumi.alicloud.vpc.outputs.TrafficMirrorFilterEgressRule;
import com.pulumi.alicloud.vpc.outputs.TrafficMirrorFilterIngressRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a VPC Traffic Mirror Filter resource. Traffic mirror filter criteria.
 * 
 * For information about VPC Traffic Mirror Filter and how to use it, see [What is Traffic Mirror Filter](https://www.alibabacloud.com/help/doc-detail/207513.htm).
 * 
 * &gt; **NOTE:** Available in v1.140.0+.
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
 * import com.pulumi.alicloud.resourcemanager.ResourceGroup;
 * import com.pulumi.alicloud.resourcemanager.ResourceGroupArgs;
 * import com.pulumi.alicloud.vpc.TrafficMirrorFilter;
 * import com.pulumi.alicloud.vpc.TrafficMirrorFilterArgs;
 * import com.pulumi.alicloud.vpc.inputs.TrafficMirrorFilterEgressRuleArgs;
 * import com.pulumi.alicloud.vpc.inputs.TrafficMirrorFilterIngressRuleArgs;
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
 *         var default3iXhoa = new ResourceGroup(&#34;default3iXhoa&#34;, ResourceGroupArgs.builder()        
 *             .displayName(&#34;testname03&#34;)
 *             .resourceGroupName(name)
 *             .build());
 * 
 *         var defaultdNz2qk = new ResourceGroup(&#34;defaultdNz2qk&#34;, ResourceGroupArgs.builder()        
 *             .displayName(&#34;testname04&#34;)
 *             .resourceGroupName(String.format(&#34;%s1&#34;, name))
 *             .build());
 * 
 *         var default_ = new TrafficMirrorFilter(&#34;default&#34;, TrafficMirrorFilterArgs.builder()        
 *             .trafficMirrorFilterDescription(&#34;test&#34;)
 *             .trafficMirrorFilterName(name)
 *             .resourceGroupId(default3iXhoa.id())
 *             .egressRules(TrafficMirrorFilterEgressRuleArgs.builder()
 *                 .priority(1)
 *                 .protocol(&#34;TCP&#34;)
 *                 .action(&#34;accept&#34;)
 *                 .destinationCidrBlock(&#34;32.0.0.0/4&#34;)
 *                 .destinationPortRange(&#34;80/80&#34;)
 *                 .sourceCidrBlock(&#34;16.0.0.0/4&#34;)
 *                 .sourcePortRange(&#34;80/80&#34;)
 *                 .build())
 *             .ingressRules(TrafficMirrorFilterIngressRuleArgs.builder()
 *                 .priority(1)
 *                 .protocol(&#34;TCP&#34;)
 *                 .action(&#34;accept&#34;)
 *                 .destinationCidrBlock(&#34;10.64.0.0/10&#34;)
 *                 .destinationPortRange(&#34;80/80&#34;)
 *                 .sourceCidrBlock(&#34;10.0.0.0/8&#34;)
 *                 .sourcePortRange(&#34;80/80&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * VPC Traffic Mirror Filter can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:vpc/trafficMirrorFilter:TrafficMirrorFilter example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/trafficMirrorFilter:TrafficMirrorFilter")
public class TrafficMirrorFilter extends com.pulumi.resources.CustomResource {
    /**
     * Whether to PreCheck only this request. Value:
     * - **true**: The check request is sent without creating traffic Image filter conditions. Check items include whether required parameters, request format, and business restrictions are filled in. If the check does not pass, the corresponding error is returned. If the check passes, the error code &#39;DryRunOperation&#39; is returned &#39;.
     * - **false** (default): Sends a normal request, returns a 2xx HTTP status code after passing the check, and directly creates a filter condition.
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return Whether to PreCheck only this request. Value:
     * - **true**: The check request is sent without creating traffic Image filter conditions. Check items include whether required parameters, request format, and business restrictions are filled in. If the check does not pass, the corresponding error is returned. If the check passes, the error code &#39;DryRunOperation&#39; is returned &#39;.
     * - **false** (default): Sends a normal request, returns a 2xx HTTP status code after passing the check, and directly creates a filter condition.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * Information about the outbound rule. See the following `Block EgressRules`.
     * 
     */
    @Export(name="egressRules", refs={List.class,TrafficMirrorFilterEgressRule.class}, tree="[0,1]")
    private Output<List<TrafficMirrorFilterEgressRule>> egressRules;

    /**
     * @return Information about the outbound rule. See the following `Block EgressRules`.
     * 
     */
    public Output<List<TrafficMirrorFilterEgressRule>> egressRules() {
        return this.egressRules;
    }
    /**
     * Inward direction rule information. See the following `Block IngressRules`.
     * 
     */
    @Export(name="ingressRules", refs={List.class,TrafficMirrorFilterIngressRule.class}, tree="[0,1]")
    private Output<List<TrafficMirrorFilterIngressRule>> ingressRules;

    /**
     * @return Inward direction rule information. See the following `Block IngressRules`.
     * 
     */
    public Output<List<TrafficMirrorFilterIngressRule>> ingressRules() {
        return this.ingressRules;
    }
    /**
     * The ID of the resource group to which the VPC belongs.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group to which the VPC belongs.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The status of the resource.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The tags of this resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return The tags of this resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The description of the TrafficMirrorFilter.
     * 
     */
    @Export(name="trafficMirrorFilterDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> trafficMirrorFilterDescription;

    /**
     * @return The description of the TrafficMirrorFilter.
     * 
     */
    public Output<Optional<String>> trafficMirrorFilterDescription() {
        return Codegen.optional(this.trafficMirrorFilterDescription);
    }
    /**
     * The name of the TrafficMirrorFilter.
     * 
     */
    @Export(name="trafficMirrorFilterName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> trafficMirrorFilterName;

    /**
     * @return The name of the TrafficMirrorFilter.
     * 
     */
    public Output<Optional<String>> trafficMirrorFilterName() {
        return Codegen.optional(this.trafficMirrorFilterName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrafficMirrorFilter(String name) {
        this(name, TrafficMirrorFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrafficMirrorFilter(String name, @Nullable TrafficMirrorFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrafficMirrorFilter(String name, @Nullable TrafficMirrorFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/trafficMirrorFilter:TrafficMirrorFilter", name, args == null ? TrafficMirrorFilterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrafficMirrorFilter(String name, Output<String> id, @Nullable TrafficMirrorFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/trafficMirrorFilter:TrafficMirrorFilter", name, state, makeResourceOptions(options, id));
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
    public static TrafficMirrorFilter get(String name, Output<String> id, @Nullable TrafficMirrorFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TrafficMirrorFilter(name, id, state, options);
    }
}
