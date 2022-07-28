// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoProvisioningGroupLaunchTemplateConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoProvisioningGroupLaunchTemplateConfigArgs Empty = new AutoProvisioningGroupLaunchTemplateConfigArgs();

    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    @Import(name="maxPrice", required=true)
    private Output<String> maxPrice;

    public Output<String> maxPrice() {
        return this.maxPrice;
    }

    @Import(name="priority")
    private @Nullable Output<String> priority;

    public Optional<Output<String>> priority() {
        return Optional.ofNullable(this.priority);
    }

    @Import(name="vswitchId", required=true)
    private Output<String> vswitchId;

    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    @Import(name="weightedCapacity", required=true)
    private Output<String> weightedCapacity;

    public Output<String> weightedCapacity() {
        return this.weightedCapacity;
    }

    private AutoProvisioningGroupLaunchTemplateConfigArgs() {}

    private AutoProvisioningGroupLaunchTemplateConfigArgs(AutoProvisioningGroupLaunchTemplateConfigArgs $) {
        this.instanceType = $.instanceType;
        this.maxPrice = $.maxPrice;
        this.priority = $.priority;
        this.vswitchId = $.vswitchId;
        this.weightedCapacity = $.weightedCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoProvisioningGroupLaunchTemplateConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoProvisioningGroupLaunchTemplateConfigArgs $;

        public Builder() {
            $ = new AutoProvisioningGroupLaunchTemplateConfigArgs();
        }

        public Builder(AutoProvisioningGroupLaunchTemplateConfigArgs defaults) {
            $ = new AutoProvisioningGroupLaunchTemplateConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public Builder maxPrice(Output<String> maxPrice) {
            $.maxPrice = maxPrice;
            return this;
        }

        public Builder maxPrice(String maxPrice) {
            return maxPrice(Output.of(maxPrice));
        }

        public Builder priority(@Nullable Output<String> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(String priority) {
            return priority(Output.of(priority));
        }

        public Builder vswitchId(Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public Builder weightedCapacity(Output<String> weightedCapacity) {
            $.weightedCapacity = weightedCapacity;
            return this;
        }

        public Builder weightedCapacity(String weightedCapacity) {
            return weightedCapacity(Output.of(weightedCapacity));
        }

        public AutoProvisioningGroupLaunchTemplateConfigArgs build() {
            $.maxPrice = Objects.requireNonNull($.maxPrice, "expected parameter 'maxPrice' to be non-null");
            $.vswitchId = Objects.requireNonNull($.vswitchId, "expected parameter 'vswitchId' to be non-null");
            $.weightedCapacity = Objects.requireNonNull($.weightedCapacity, "expected parameter 'weightedCapacity' to be non-null");
            return $;
        }
    }

}
