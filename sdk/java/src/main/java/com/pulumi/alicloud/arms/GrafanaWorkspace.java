// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.arms.GrafanaWorkspaceArgs;
import com.pulumi.alicloud.arms.inputs.GrafanaWorkspaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ARMS Grafana Workspace resource.
 * 
 * For information about ARMS Grafana Workspace and how to use it, see [What is Grafana Workspace](https://next.api.alibabacloud.com/document/ARMS/2019-08-08/ListGrafanaWorkspace).
 * 
 * &gt; **NOTE:** Available since v1.215.0.
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
 * import com.pulumi.alicloud.resourcemanager.ResourcemanagerFunctions;
 * import com.pulumi.alicloud.resourcemanager.inputs.GetResourceGroupsArgs;
 * import com.pulumi.alicloud.arms.GrafanaWorkspace;
 * import com.pulumi.alicloud.arms.GrafanaWorkspaceArgs;
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
 *         final var defaultResourceGroups = ResourcemanagerFunctions.getResourceGroups();
 * 
 *         var defaultGrafanaWorkspace = new GrafanaWorkspace(&#34;defaultGrafanaWorkspace&#34;, GrafanaWorkspaceArgs.builder()        
 *             .grafanaVersion(&#34;9.0.x&#34;)
 *             .description(name)
 *             .resourceGroupId(defaultResourceGroups.applyValue(getResourceGroupsResult -&gt; getResourceGroupsResult.ids()[0]))
 *             .grafanaWorkspaceEdition(&#34;standard&#34;)
 *             .grafanaWorkspaceName(name)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Created&#34;, &#34;tf&#34;),
 *                 Map.entry(&#34;For&#34;, &#34;example&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ARMS Grafana Workspace can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:arms/grafanaWorkspace:GrafanaWorkspace example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:arms/grafanaWorkspace:GrafanaWorkspace")
public class GrafanaWorkspace extends com.pulumi.resources.CustomResource {
    /**
     * The creation time of the resource.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the resource.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The version of the grafana.
     * 
     */
    @Export(name="grafanaVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> grafanaVersion;

    /**
     * @return The version of the grafana.
     * 
     */
    public Output<Optional<String>> grafanaVersion() {
        return Codegen.optional(this.grafanaVersion);
    }
    /**
     * The edition of the grafana.
     * 
     */
    @Export(name="grafanaWorkspaceEdition", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> grafanaWorkspaceEdition;

    /**
     * @return The edition of the grafana.
     * 
     */
    public Output<Optional<String>> grafanaWorkspaceEdition() {
        return Codegen.optional(this.grafanaWorkspaceEdition);
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="grafanaWorkspaceName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> grafanaWorkspaceName;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<Optional<String>> grafanaWorkspaceName() {
        return Codegen.optional(this.grafanaWorkspaceName);
    }
    /**
     * The ID of the resource group.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
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
     * The tag of the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return The tag of the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GrafanaWorkspace(String name) {
        this(name, GrafanaWorkspaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GrafanaWorkspace(String name, @Nullable GrafanaWorkspaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GrafanaWorkspace(String name, @Nullable GrafanaWorkspaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:arms/grafanaWorkspace:GrafanaWorkspace", name, args == null ? GrafanaWorkspaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GrafanaWorkspace(String name, Output<String> id, @Nullable GrafanaWorkspaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:arms/grafanaWorkspace:GrafanaWorkspace", name, state, makeResourceOptions(options, id));
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
    public static GrafanaWorkspace get(String name, Output<String> id, @Nullable GrafanaWorkspaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GrafanaWorkspace(name, id, state, options);
    }
}