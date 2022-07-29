// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.EcsSessionManagerStatusArgs;
import com.pulumi.alicloud.ecs.inputs.EcsSessionManagerStatusState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a ECS Session Manager Status resource.
 * 
 * For information about ECS Session Manager Status and how to use it, see [What is Session Manager Status](https://www.alibabacloud.com/help/zh/doc-detail/337915.html).
 * 
 * &gt; **NOTE:** Available in v1.148.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ECS Session Manager Status can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ecs/ecsSessionManagerStatus:EcsSessionManagerStatus example &lt;session_manager_status_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/ecsSessionManagerStatus:EcsSessionManagerStatus")
public class EcsSessionManagerStatus extends com.pulumi.resources.CustomResource {
    /**
     * The name of the resource. Valid values: `sessionManagerStatus`.
     * 
     */
    @Export(name="sessionManagerStatusName", type=String.class, parameters={})
    private Output<String> sessionManagerStatusName;

    /**
     * @return The name of the resource. Valid values: `sessionManagerStatus`.
     * 
     */
    public Output<String> sessionManagerStatusName() {
        return this.sessionManagerStatusName;
    }
    /**
     * The status of the resource. Valid values: `Disabled`, `Enabled`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the resource. Valid values: `Disabled`, `Enabled`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EcsSessionManagerStatus(String name) {
        this(name, EcsSessionManagerStatusArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EcsSessionManagerStatus(String name, EcsSessionManagerStatusArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EcsSessionManagerStatus(String name, EcsSessionManagerStatusArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsSessionManagerStatus:EcsSessionManagerStatus", name, args == null ? EcsSessionManagerStatusArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EcsSessionManagerStatus(String name, Output<String> id, @Nullable EcsSessionManagerStatusState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsSessionManagerStatus:EcsSessionManagerStatus", name, state, makeResourceOptions(options, id));
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
    public static EcsSessionManagerStatus get(String name, Output<String> id, @Nullable EcsSessionManagerStatusState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EcsSessionManagerStatus(name, id, state, options);
    }
}
