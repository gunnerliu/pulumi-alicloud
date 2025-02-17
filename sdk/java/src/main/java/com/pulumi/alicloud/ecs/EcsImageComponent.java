// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.EcsImageComponentArgs;
import com.pulumi.alicloud.ecs.inputs.EcsImageComponentState;
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
 * Provides a Ecs Image Component resource.
 * 
 * For information about Ecs Image Component and how to use it, see [What is Image Component](https://www.alibabacloud.com/help/en/doc-detail/200424.htm).
 * 
 * &gt; **NOTE:** Available since v1.159.0.
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
 * import com.pulumi.alicloud.ecs.EcsImageComponent;
 * import com.pulumi.alicloud.ecs.EcsImageComponentArgs;
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
 *         final var default = ResourcemanagerFunctions.getResourceGroups(GetResourceGroupsArgs.builder()
 *             .nameRegex(&#34;default&#34;)
 *             .build());
 * 
 *         var example = new EcsImageComponent(&#34;example&#34;, EcsImageComponentArgs.builder()        
 *             .componentType(&#34;Build&#34;)
 *             .content(&#34;RUN yum update -y&#34;)
 *             .description(&#34;example_value&#34;)
 *             .imageComponentName(&#34;example_value&#34;)
 *             .resourceGroupId(default_.groups()[0].id())
 *             .systemType(&#34;Linux&#34;)
 *             .tags(Map.of(&#34;Created&#34;, &#34;TF&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Ecs Image Component can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ecs/ecsImageComponent:EcsImageComponent example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/ecsImageComponent:EcsImageComponent")
public class EcsImageComponent extends com.pulumi.resources.CustomResource {
    /**
     * The component type. Currently, only mirror build components are supported. Value: Build.  Default value: Build.
     * 
     */
    @Export(name="componentType", refs={String.class}, tree="[0]")
    private Output<String> componentType;

    /**
     * @return The component type. Currently, only mirror build components are supported. Value: Build.  Default value: Build.
     * 
     */
    public Output<String> componentType() {
        return this.componentType;
    }
    /**
     * Component content.
     * 
     */
    @Export(name="content", refs={String.class}, tree="[0]")
    private Output<String> content;

    /**
     * @return Component content.
     * 
     */
    public Output<String> content() {
        return this.content;
    }
    /**
     * Component creation time.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Component creation time.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Describe the information.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Describe the information.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The component name. The name must be 2 to 128 characters in length and must start with an uppercase letter or a Chinese character. It cannot start with http:// or https. Can contain Chinese, English, numbers, half-length colons (:), underscores (_), half-length periods (.), or dashes (-).  Note: If Name is not set, the return value of ImageComponentId is used by default.
     * 
     */
    @Export(name="imageComponentName", refs={String.class}, tree="[0]")
    private Output<String> imageComponentName;

    /**
     * @return The component name. The name must be 2 to 128 characters in length and must start with an uppercase letter or a Chinese character. It cannot start with http:// or https. Can contain Chinese, English, numbers, half-length colons (:), underscores (_), half-length periods (.), or dashes (-).  Note: If Name is not set, the return value of ImageComponentId is used by default.
     * 
     */
    public Output<String> imageComponentName() {
        return this.imageComponentName;
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
     * The operating system supported by the component. Currently, only Linux systems are supported. Value: Linux.  Default value: Linux.
     * 
     */
    @Export(name="systemType", refs={String.class}, tree="[0]")
    private Output<String> systemType;

    /**
     * @return The operating system supported by the component. Currently, only Linux systems are supported. Value: Linux.  Default value: Linux.
     * 
     */
    public Output<String> systemType() {
        return this.systemType;
    }
    /**
     * List of label key-value pairs.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return List of label key-value pairs.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EcsImageComponent(String name) {
        this(name, EcsImageComponentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EcsImageComponent(String name, EcsImageComponentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EcsImageComponent(String name, EcsImageComponentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsImageComponent:EcsImageComponent", name, args == null ? EcsImageComponentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EcsImageComponent(String name, Output<String> id, @Nullable EcsImageComponentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsImageComponent:EcsImageComponent", name, state, makeResourceOptions(options, id));
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
    public static EcsImageComponent get(String name, Output<String> id, @Nullable EcsImageComponentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EcsImageComponent(name, id, state, options);
    }
}
