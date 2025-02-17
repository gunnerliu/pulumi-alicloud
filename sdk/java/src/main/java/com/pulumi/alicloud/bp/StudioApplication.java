// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bp;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.bp.StudioApplicationArgs;
import com.pulumi.alicloud.bp.inputs.StudioApplicationState;
import com.pulumi.alicloud.bp.outputs.StudioApplicationInstance;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Architect Design Tools Application resource.
 * 
 * For information about Cloud Architect Design Tools Application and how to use it, see [What is Application](https://help.aliyun.com/document_detail/428263.html).
 * 
 * &gt; **NOTE:** Available in v1.192.0+.
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
 * import com.pulumi.alicloud.bp.StudioApplication;
 * import com.pulumi.alicloud.bp.StudioApplicationArgs;
 * import com.pulumi.alicloud.bp.inputs.StudioApplicationInstanceArgs;
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
 *         var default_ = new StudioApplication(&#34;default&#34;, StudioApplicationArgs.builder()        
 *             .applicationName(&#34;example_value&#34;)
 *             .areaId(&#34;example_value&#34;)
 *             .configuration(Map.of(&#34;enableMonitor&#34;, &#34;1&#34;))
 *             .instances(StudioApplicationInstanceArgs.builder()
 *                 .id(&#34;example_value&#34;)
 *                 .nodeName(&#34;example_value&#34;)
 *                 .nodeType(&#34;ecs&#34;)
 *                 .build())
 *             .resourceGroupId(&#34;example_value&#34;)
 *             .templateId(&#34;example_value&#34;)
 *             .variables(Map.of(&#34;test&#34;, &#34;1&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloud Architect Design Tools Application can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:bp/studioApplication:StudioApplication example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:bp/studioApplication:StudioApplication")
public class StudioApplication extends com.pulumi.resources.CustomResource {
    /**
     * The name of the application.
     * 
     */
    @Export(name="applicationName", refs={String.class}, tree="[0]")
    private Output<String> applicationName;

    /**
     * @return The name of the application.
     * 
     */
    public Output<String> applicationName() {
        return this.applicationName;
    }
    /**
     * The id of the area.
     * 
     */
    @Export(name="areaId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> areaId;

    /**
     * @return The id of the area.
     * 
     */
    public Output<Optional<String>> areaId() {
        return Codegen.optional(this.areaId);
    }
    /**
     * The configuration of the application.
     * 
     */
    @Export(name="configuration", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> configuration;

    /**
     * @return The configuration of the application.
     * 
     */
    public Output<Optional<Map<String,Object>>> configuration() {
        return Codegen.optional(this.configuration);
    }
    /**
     * The instance list. Support the creation of instances in the existing vpc under the application. See the following `Block instances`.
     * 
     */
    @Export(name="instances", refs={List.class,StudioApplicationInstance.class}, tree="[0,1]")
    private Output</* @Nullable */ List<StudioApplicationInstance>> instances;

    /**
     * @return The instance list. Support the creation of instances in the existing vpc under the application. See the following `Block instances`.
     * 
     */
    public Output<Optional<List<StudioApplicationInstance>>> instances() {
        return Codegen.optional(this.instances);
    }
    /**
     * The id of the resource group.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The id of the resource group.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The status of the Application.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the Application.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The id of the template.
     * 
     */
    @Export(name="templateId", refs={String.class}, tree="[0]")
    private Output<String> templateId;

    /**
     * @return The id of the template.
     * 
     */
    public Output<String> templateId() {
        return this.templateId;
    }
    /**
     * The variables of the application.
     * 
     */
    @Export(name="variables", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> variables;

    /**
     * @return The variables of the application.
     * 
     */
    public Output<Optional<Map<String,Object>>> variables() {
        return Codegen.optional(this.variables);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StudioApplication(String name) {
        this(name, StudioApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StudioApplication(String name, StudioApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StudioApplication(String name, StudioApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:bp/studioApplication:StudioApplication", name, args == null ? StudioApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StudioApplication(String name, Output<String> id, @Nullable StudioApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:bp/studioApplication:StudioApplication", name, state, makeResourceOptions(options, id));
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
    public static StudioApplication get(String name, Output<String> id, @Nullable StudioApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StudioApplication(name, id, state, options);
    }
}
