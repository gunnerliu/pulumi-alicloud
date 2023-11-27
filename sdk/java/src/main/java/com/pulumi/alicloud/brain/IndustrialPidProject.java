// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.brain;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.brain.IndustrialPidProjectArgs;
import com.pulumi.alicloud.brain.inputs.IndustrialPidProjectState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Brain Industrial Pid Project resource.
 * 
 * &gt; **NOTE:** Available in v1.113.0+.
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
 * import com.pulumi.alicloud.brain.IndustrialPidProject;
 * import com.pulumi.alicloud.brain.IndustrialPidProjectArgs;
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
 *         var example = new IndustrialPidProject(&#34;example&#34;, IndustrialPidProjectArgs.builder()        
 *             .pidOrganizationId(&#34;3e74e684-cbb5-xxxx&#34;)
 *             .pidProjectName(&#34;tf-testAcc&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Brain Industrial Pid Project can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:brain/industrialPidProject:IndustrialPidProject example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:brain/industrialPidProject:IndustrialPidProject")
public class IndustrialPidProject extends com.pulumi.resources.CustomResource {
    /**
     * The ID of Pid Organization.
     * 
     */
    @Export(name="pidOrganizationId", refs={String.class}, tree="[0]")
    private Output<String> pidOrganizationId;

    /**
     * @return The ID of Pid Organization.
     * 
     */
    public Output<String> pidOrganizationId() {
        return this.pidOrganizationId;
    }
    /**
     * The description of Pid Project.
     * 
     */
    @Export(name="pidProjectDesc", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pidProjectDesc;

    /**
     * @return The description of Pid Project.
     * 
     */
    public Output<Optional<String>> pidProjectDesc() {
        return Codegen.optional(this.pidProjectDesc);
    }
    /**
     * The name of Pid Project.
     * 
     */
    @Export(name="pidProjectName", refs={String.class}, tree="[0]")
    private Output<String> pidProjectName;

    /**
     * @return The name of Pid Project.
     * 
     */
    public Output<String> pidProjectName() {
        return this.pidProjectName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IndustrialPidProject(String name) {
        this(name, IndustrialPidProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IndustrialPidProject(String name, IndustrialPidProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IndustrialPidProject(String name, IndustrialPidProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:brain/industrialPidProject:IndustrialPidProject", name, args == null ? IndustrialPidProjectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IndustrialPidProject(String name, Output<String> id, @Nullable IndustrialPidProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:brain/industrialPidProject:IndustrialPidProject", name, state, makeResourceOptions(options, id));
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
    public static IndustrialPidProject get(String name, Output<String> id, @Nullable IndustrialPidProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IndustrialPidProject(name, id, state, options);
    }
}
