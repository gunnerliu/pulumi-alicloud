// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.imm;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.imm.ProjectArgs;
import com.pulumi.alicloud.imm.inputs.ProjectState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Intelligent Media Management Project resource.
 * 
 * For information about Intelligent Media Management Project and how to use it, see [What is Project](https://www.alibabacloud.com/help/en/network-intelligence-service/latest/user-overview).
 * 
 * &gt; **NOTE:** Available since v1.134.0.
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
 * import com.pulumi.alicloud.ram.Role;
 * import com.pulumi.alicloud.ram.RoleArgs;
 * import com.pulumi.alicloud.imm.Project;
 * import com.pulumi.alicloud.imm.ProjectArgs;
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
 *         var role = new Role(&#34;role&#34;, RoleArgs.builder()        
 *             .document(&#34;&#34;&#34;
 *   {
 *     &#34;Statement&#34;: [
 *       {
 *         &#34;Action&#34;: &#34;sts:AssumeRole&#34;,
 *         &#34;Effect&#34;: &#34;Allow&#34;,
 *         &#34;Principal&#34;: {
 *           &#34;Service&#34;: [
 *             &#34;imm.aliyuncs.com&#34;
 *           ]
 *         }
 *       }
 *     ],
 *     &#34;Version&#34;: &#34;1&#34;
 *   }
 *             &#34;&#34;&#34;)
 *             .description(&#34;this is a role test.&#34;)
 *             .force(true)
 *             .build());
 * 
 *         var example = new Project(&#34;example&#34;, ProjectArgs.builder()        
 *             .project(name)
 *             .serviceRole(role.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Intelligent Media Management Project can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:imm/project:Project example &lt;project&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:imm/project:Project")
public class Project extends com.pulumi.resources.CustomResource {
    /**
     * The name of Project.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The name of Project.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The service role authorized to the Intelligent Media Management service to access other cloud resources. Default value: `AliyunIMMDefaultRole`. You can also create authorization  roles through the `alicloud.ram.Role`.
     * 
     */
    @Export(name="serviceRole", refs={String.class}, tree="[0]")
    private Output<String> serviceRole;

    /**
     * @return The service role authorized to the Intelligent Media Management service to access other cloud resources. Default value: `AliyunIMMDefaultRole`. You can also create authorization  roles through the `alicloud.ram.Role`.
     * 
     */
    public Output<String> serviceRole() {
        return this.serviceRole;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Project(String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(String name, ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(String name, ProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:imm/project:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Project(String name, Output<String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:imm/project:Project", name, state, makeResourceOptions(options, id));
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
    public static Project get(String name, Output<String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, state, options);
    }
}
