// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cms.MonitorGroupArgs;
import com.pulumi.alicloud.cms.inputs.MonitorGroupState;
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
 * Provides a Cloud Monitor Service Monitor Group resource.
 * 
 * For information about Cloud Monitor Service Monitor Group and how to use it, see [What is Monitor Group](https://www.alibabacloud.com/help/en/doc-detail/115030.htm).
 * 
 * &gt; **NOTE:** Available in v1.113.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Cloud Monitor Service Monitor Group can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cms/monitorGroup:MonitorGroup example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cms/monitorGroup:MonitorGroup")
public class MonitorGroup extends com.pulumi.resources.CustomResource {
    /**
     * The alert group to which alert notifications will be sent.
     * 
     */
    @Export(name="contactGroups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> contactGroups;

    /**
     * @return The alert group to which alert notifications will be sent.
     * 
     */
    public Output<Optional<List<String>>> contactGroups() {
        return Codegen.optional(this.contactGroups);
    }
    /**
     * The name of the application group.
     * 
     */
    @Export(name="monitorGroupName", type=String.class, parameters={})
    private Output<String> monitorGroupName;

    /**
     * @return The name of the application group.
     * 
     */
    public Output<String> monitorGroupName() {
        return this.monitorGroupName;
    }
    /**
     * The ID of the resource group.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Output<Optional<String>> resourceGroupId() {
        return Codegen.optional(this.resourceGroupId);
    }
    /**
     * The name of the resource group.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<Optional<String>> resourceGroupName() {
        return Codegen.optional(this.resourceGroupName);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MonitorGroup(String name) {
        this(name, MonitorGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MonitorGroup(String name, @Nullable MonitorGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MonitorGroup(String name, @Nullable MonitorGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cms/monitorGroup:MonitorGroup", name, args == null ? MonitorGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MonitorGroup(String name, Output<String> id, @Nullable MonitorGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cms/monitorGroup:MonitorGroup", name, state, makeResourceOptions(options, id));
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
    public static MonitorGroup get(String name, Output<String> id, @Nullable MonitorGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MonitorGroup(name, id, state, options);
    }
}
