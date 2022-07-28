// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ros.StackInstanceArgs;
import com.pulumi.alicloud.ros.inputs.StackInstanceState;
import com.pulumi.alicloud.ros.outputs.StackInstanceParameterOverride;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ROS Stack Instance resource.
 * 
 * For information about ROS Stack Instance and how to use it, see [What is Stack Instance](https://www.alibabacloud.com/help/en/doc-detail/151338.html).
 * 
 * &gt; **NOTE:** Available in v1.145.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ROS Stack Instance can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ros/stackInstance:StackInstance example &lt;stack_group_name&gt;:&lt;stack_instance_account_id&gt;:&lt;stack_instance_region_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ros/stackInstance:StackInstance")
public class StackInstance extends com.pulumi.resources.CustomResource {
    /**
     * The operation description.
     * 
     */
    @Export(name="operationDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> operationDescription;

    /**
     * @return The operation description.
     * 
     */
    public Output<Optional<String>> operationDescription() {
        return Codegen.optional(this.operationDescription);
    }
    /**
     * The operation preferences. The operation settings. The following fields are supported:
     * 
     */
    @Export(name="operationPreferences", type=String.class, parameters={})
    private Output</* @Nullable */ String> operationPreferences;

    /**
     * @return The operation preferences. The operation settings. The following fields are supported:
     * 
     */
    public Output<Optional<String>> operationPreferences() {
        return Codegen.optional(this.operationPreferences);
    }
    /**
     * ParameterOverrides. See the following `Block parameter_overrides`.
     * 
     */
    @Export(name="parameterOverrides", type=List.class, parameters={StackInstanceParameterOverride.class})
    private Output</* @Nullable */ List<StackInstanceParameterOverride>> parameterOverrides;

    /**
     * @return ParameterOverrides. See the following `Block parameter_overrides`.
     * 
     */
    public Output<Optional<List<StackInstanceParameterOverride>>> parameterOverrides() {
        return Codegen.optional(this.parameterOverrides);
    }
    /**
     * Specifies whether to retain the stack corresponding to the stack instance.Default value `false`. **NOTE:** When `retain_stacks` is `true`, the stack is retained. If the stack is retained, the corresponding stack is not deleted when the stack instance is deleted from the stack group.
     * 
     */
    @Export(name="retainStacks", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> retainStacks;

    /**
     * @return Specifies whether to retain the stack corresponding to the stack instance.Default value `false`. **NOTE:** When `retain_stacks` is `true`, the stack is retained. If the stack is retained, the corresponding stack is not deleted when the stack instance is deleted from the stack group.
     * 
     */
    public Output<Optional<Boolean>> retainStacks() {
        return Codegen.optional(this.retainStacks);
    }
    /**
     * The name of the stack group.
     * 
     */
    @Export(name="stackGroupName", type=String.class, parameters={})
    private Output<String> stackGroupName;

    /**
     * @return The name of the stack group.
     * 
     */
    public Output<String> stackGroupName() {
        return this.stackGroupName;
    }
    /**
     * The account to which the stack instance belongs.
     * 
     */
    @Export(name="stackInstanceAccountId", type=String.class, parameters={})
    private Output<String> stackInstanceAccountId;

    /**
     * @return The account to which the stack instance belongs.
     * 
     */
    public Output<String> stackInstanceAccountId() {
        return this.stackInstanceAccountId;
    }
    /**
     * The region of the stack instance.
     * 
     */
    @Export(name="stackInstanceRegionId", type=String.class, parameters={})
    private Output<String> stackInstanceRegionId;

    /**
     * @return The region of the stack instance.
     * 
     */
    public Output<String> stackInstanceRegionId() {
        return this.stackInstanceRegionId;
    }
    /**
     * The status of the stack instance. Valid values: `CURRENT` or `OUTDATED`.
     * * `CURRENT`: The stack corresponding to the stack instance is up to date with the stack group.
     * * `OUTDATED`: The stack corresponding to the stack instance is not up to date with the stack group. The `OUTDATED` state has the following possible causes:
     * * When the CreateStackInstances operation is called to create stack instances, the corresponding stacks fail to be created.
     * * When the UpdateStackInstances or UpdateStackGroup operation is called to update stack instances, the corresponding stacks fail to be updated, or only some of the stack instances are updated.
     * * The create or update operation is not complete.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the stack instance. Valid values: `CURRENT` or `OUTDATED`.
     * * `CURRENT`: The stack corresponding to the stack instance is up to date with the stack group.
     * * `OUTDATED`: The stack corresponding to the stack instance is not up to date with the stack group. The `OUTDATED` state has the following possible causes:
     * * When the CreateStackInstances operation is called to create stack instances, the corresponding stacks fail to be created.
     * * When the UpdateStackInstances or UpdateStackGroup operation is called to update stack instances, the corresponding stacks fail to be updated, or only some of the stack instances are updated.
     * * The create or update operation is not complete.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The timeout period that is specified for the stack creation request. Default value: `60`. Unit: `minutes`.
     * 
     */
    @Export(name="timeoutInMinutes", type=String.class, parameters={})
    private Output</* @Nullable */ String> timeoutInMinutes;

    /**
     * @return The timeout period that is specified for the stack creation request. Default value: `60`. Unit: `minutes`.
     * 
     */
    public Output<Optional<String>> timeoutInMinutes() {
        return Codegen.optional(this.timeoutInMinutes);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StackInstance(String name) {
        this(name, StackInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StackInstance(String name, StackInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StackInstance(String name, StackInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ros/stackInstance:StackInstance", name, args == null ? StackInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StackInstance(String name, Output<String> id, @Nullable StackInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ros/stackInstance:StackInstance", name, state, makeResourceOptions(options, id));
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
    public static StackInstance get(String name, Output<String> id, @Nullable StackInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StackInstance(name, id, state, options);
    }
}
