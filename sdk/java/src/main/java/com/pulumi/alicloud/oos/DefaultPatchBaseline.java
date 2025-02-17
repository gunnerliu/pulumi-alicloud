// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oos;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.oos.DefaultPatchBaselineArgs;
import com.pulumi.alicloud.oos.inputs.DefaultPatchBaselineState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Oos Default Patch Baseline resource.
 * 
 * For information about Oos Default Patch Baseline and how to use it, see [What is Default Patch Baseline](https://www.alibabacloud.com/help/en/operation-orchestration-service/latest/api-oos-2019-06-01-registerdefaultpatchbaseline).
 * 
 * &gt; **NOTE:** Available in v1.203.0+.
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
 * import com.pulumi.alicloud.oos.PatchBaseline;
 * import com.pulumi.alicloud.oos.PatchBaselineArgs;
 * import com.pulumi.alicloud.oos.DefaultPatchBaseline;
 * import com.pulumi.alicloud.oos.DefaultPatchBaselineArgs;
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
 *         var defaultPatchBaseline = new PatchBaseline(&#34;defaultPatchBaseline&#34;, PatchBaselineArgs.builder()        
 *             .operationSystem(&#34;Windows&#34;)
 *             .patchBaselineName(&#34;terraform-example&#34;)
 *             .description(&#34;terraform-example&#34;)
 *             .approvalRules(&#34;{\&#34;PatchRules\&#34;:[{\&#34;PatchFilterGroup\&#34;:[{\&#34;Key\&#34;:\&#34;PatchSet\&#34;,\&#34;Values\&#34;:[\&#34;OS\&#34;]},{\&#34;Key\&#34;:\&#34;ProductFamily\&#34;,\&#34;Values\&#34;:[\&#34;Windows\&#34;]},{\&#34;Key\&#34;:\&#34;Product\&#34;,\&#34;Values\&#34;:[\&#34;Windows 10\&#34;,\&#34;Windows 7\&#34;]},{\&#34;Key\&#34;:\&#34;Classification\&#34;,\&#34;Values\&#34;:[\&#34;Security Updates\&#34;,\&#34;Updates\&#34;,\&#34;Update Rollups\&#34;,\&#34;Critical Updates\&#34;]},{\&#34;Key\&#34;:\&#34;Severity\&#34;,\&#34;Values\&#34;:[\&#34;Critical\&#34;,\&#34;Important\&#34;,\&#34;Moderate\&#34;]}],\&#34;ApproveAfterDays\&#34;:7,\&#34;EnableNonSecurity\&#34;:true,\&#34;ComplianceLevel\&#34;:\&#34;Medium\&#34;}]}&#34;)
 *             .build());
 * 
 *         var defaultDefaultPatchBaseline = new DefaultPatchBaseline(&#34;defaultDefaultPatchBaseline&#34;, DefaultPatchBaselineArgs.builder()        
 *             .patchBaselineName(defaultPatchBaseline.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Oos Default Patch Baseline can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:oos/defaultPatchBaseline:DefaultPatchBaseline example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:oos/defaultPatchBaseline:DefaultPatchBaseline")
public class DefaultPatchBaseline extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the patch baseline.
     * 
     */
    @Export(name="patchBaselineId", refs={String.class}, tree="[0]")
    private Output<String> patchBaselineId;

    /**
     * @return The ID of the patch baseline.
     * 
     */
    public Output<String> patchBaselineId() {
        return this.patchBaselineId;
    }
    /**
     * The name of the patch baseline.
     * 
     */
    @Export(name="patchBaselineName", refs={String.class}, tree="[0]")
    private Output<String> patchBaselineName;

    /**
     * @return The name of the patch baseline.
     * 
     */
    public Output<String> patchBaselineName() {
        return this.patchBaselineName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DefaultPatchBaseline(String name) {
        this(name, DefaultPatchBaselineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefaultPatchBaseline(String name, DefaultPatchBaselineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultPatchBaseline(String name, DefaultPatchBaselineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:oos/defaultPatchBaseline:DefaultPatchBaseline", name, args == null ? DefaultPatchBaselineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DefaultPatchBaseline(String name, Output<String> id, @Nullable DefaultPatchBaselineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:oos/defaultPatchBaseline:DefaultPatchBaseline", name, state, makeResourceOptions(options, id));
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
    public static DefaultPatchBaseline get(String name, Output<String> id, @Nullable DefaultPatchBaselineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DefaultPatchBaseline(name, id, state, options);
    }
}
