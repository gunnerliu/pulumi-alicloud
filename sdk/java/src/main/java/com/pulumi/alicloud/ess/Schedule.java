// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ess.ScheduleArgs;
import com.pulumi.alicloud.ess.inputs.ScheduleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **NOTE:** This resource has been deprecated from v1.45.0. New resource `alicloud.ess.ScheduledTask` will replace.
 * 
 */
@ResourceType(type="alicloud:ess/schedule:Schedule")
public class Schedule extends com.pulumi.resources.CustomResource {
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    public Output<String> description() {
        return this.description;
    }
    @Export(name="desiredCapacity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> desiredCapacity;

    public Output<Optional<Integer>> desiredCapacity() {
        return Codegen.optional(this.desiredCapacity);
    }
    @Export(name="launchExpirationTime", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> launchExpirationTime;

    public Output<Optional<Integer>> launchExpirationTime() {
        return Codegen.optional(this.launchExpirationTime);
    }
    @Export(name="launchTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> launchTime;

    public Output<Optional<String>> launchTime() {
        return Codegen.optional(this.launchTime);
    }
    @Export(name="maxValue", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxValue;

    public Output<Optional<Integer>> maxValue() {
        return Codegen.optional(this.maxValue);
    }
    @Export(name="minValue", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minValue;

    public Output<Optional<Integer>> minValue() {
        return Codegen.optional(this.minValue);
    }
    @Export(name="recurrenceEndTime", refs={String.class}, tree="[0]")
    private Output<String> recurrenceEndTime;

    public Output<String> recurrenceEndTime() {
        return this.recurrenceEndTime;
    }
    @Export(name="recurrenceType", refs={String.class}, tree="[0]")
    private Output<String> recurrenceType;

    public Output<String> recurrenceType() {
        return this.recurrenceType;
    }
    @Export(name="recurrenceValue", refs={String.class}, tree="[0]")
    private Output<String> recurrenceValue;

    public Output<String> recurrenceValue() {
        return this.recurrenceValue;
    }
    @Export(name="scalingGroupId", refs={String.class}, tree="[0]")
    private Output<String> scalingGroupId;

    public Output<String> scalingGroupId() {
        return this.scalingGroupId;
    }
    @Export(name="scheduledAction", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scheduledAction;

    public Output<Optional<String>> scheduledAction() {
        return Codegen.optional(this.scheduledAction);
    }
    @Export(name="scheduledTaskName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scheduledTaskName;

    public Output<Optional<String>> scheduledTaskName() {
        return Codegen.optional(this.scheduledTaskName);
    }
    @Export(name="taskEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> taskEnabled;

    public Output<Optional<Boolean>> taskEnabled() {
        return Codegen.optional(this.taskEnabled);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schedule(String name) {
        this(name, ScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schedule(String name, @Nullable ScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schedule(String name, @Nullable ScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/schedule:Schedule", name, args == null ? ScheduleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Schedule(String name, Output<String> id, @Nullable ScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/schedule:Schedule", name, state, makeResourceOptions(options, id));
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
    public static Schedule get(String name, Output<String> id, @Nullable ScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Schedule(name, id, state, options);
    }
}
