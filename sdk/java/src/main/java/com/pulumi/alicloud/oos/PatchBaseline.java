// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oos;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.oos.PatchBaselineArgs;
import com.pulumi.alicloud.oos.inputs.PatchBaselineState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a OOS Patch Baseline resource.
 * 
 * For information about OOS Patch Baseline and how to use it, see [What is Patch Baseline](https://www.alibabacloud.com/help/en/doc-detail/268700.html).
 * 
 * &gt; **NOTE:** Available in v1.146.0+.
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
 *         var example = new PatchBaseline(&#34;example&#34;, PatchBaselineArgs.builder()        
 *             .approvalRules(&#34;example_value&#34;)
 *             .operationSystem(&#34;Windows&#34;)
 *             .patchBaselineName(&#34;my-PatchBaseline&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * OOS Patch Baseline can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:oos/patchBaseline:PatchBaseline example &lt;patch_baseline_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:oos/patchBaseline:PatchBaseline")
public class PatchBaseline extends com.pulumi.resources.CustomResource {
    /**
     * Accept the rules. This value follows the json format. For more details, see the [description of ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/doc-detail/311002.html).
     * 
     */
    @Export(name="approvalRules", type=String.class, parameters={})
    private Output<String> approvalRules;

    /**
     * @return Accept the rules. This value follows the json format. For more details, see the [description of ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/doc-detail/311002.html).
     * 
     */
    public Output<String> approvalRules() {
        return this.approvalRules;
    }
    /**
     * Patches baseline description information.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Patches baseline description information.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`.
     * 
     */
    @Export(name="operationSystem", type=String.class, parameters={})
    private Output<String> operationSystem;

    /**
     * @return Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`.
     * 
     */
    public Output<String> operationSystem() {
        return this.operationSystem;
    }
    /**
     * The name of the patch baseline.
     * 
     */
    @Export(name="patchBaselineName", type=String.class, parameters={})
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
    public PatchBaseline(String name) {
        this(name, PatchBaselineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PatchBaseline(String name, PatchBaselineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PatchBaseline(String name, PatchBaselineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:oos/patchBaseline:PatchBaseline", name, args == null ? PatchBaselineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PatchBaseline(String name, Output<String> id, @Nullable PatchBaselineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:oos/patchBaseline:PatchBaseline", name, state, makeResourceOptions(options, id));
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
    public static PatchBaseline get(String name, Output<String> id, @Nullable PatchBaselineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PatchBaseline(name, id, state, options);
    }
}