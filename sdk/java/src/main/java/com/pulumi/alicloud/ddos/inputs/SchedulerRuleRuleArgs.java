// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchedulerRuleRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchedulerRuleRuleArgs Empty = new SchedulerRuleRuleArgs();

    /**
     * The priority of the rule.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of the rule.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The region where the interaction resource that is used in the scheduling rule is deployed. **NOTE:** This parameter is returned only if the RuleType parameter is set to 2.
     * 
     */
    @Import(name="regionId")
    private @Nullable Output<String> regionId;

    /**
     * @return The region where the interaction resource that is used in the scheduling rule is deployed. **NOTE:** This parameter is returned only if the RuleType parameter is set to 2.
     * 
     */
    public Optional<Output<String>> regionId() {
        return Optional.ofNullable(this.regionId);
    }

    /**
     * The status of the scheduling rule.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Integer> status;

    /**
     * @return The status of the scheduling rule.
     * 
     */
    public Optional<Output<Integer>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The address type of the interaction resource. Valid values:
     * `A`: IPv4 address.
     * `CNAME`: CNAME record.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The address type of the interaction resource. Valid values:
     * `A`: IPv4 address.
     * `CNAME`: CNAME record.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The address of the interaction resource.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The address of the interaction resource.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * Required. The type of the linked resource. It is an Integer. Valid values:
     * `1`: The IP address of Anti-DDoS Pro or Anti-DDoS Premium
     * `2`: the IP address of the interaction resource (in the tiered protection scenario)
     * `3`: the IP address used to accelerate access (in the network acceleration scenario)
     * `6` the IP address of the interaction resource (in the cloud service interaction scenario)
     * 
     */
    @Import(name="valueType")
    private @Nullable Output<Integer> valueType;

    /**
     * @return Required. The type of the linked resource. It is an Integer. Valid values:
     * `1`: The IP address of Anti-DDoS Pro or Anti-DDoS Premium
     * `2`: the IP address of the interaction resource (in the tiered protection scenario)
     * `3`: the IP address used to accelerate access (in the network acceleration scenario)
     * `6` the IP address of the interaction resource (in the cloud service interaction scenario)
     * 
     */
    public Optional<Output<Integer>> valueType() {
        return Optional.ofNullable(this.valueType);
    }

    private SchedulerRuleRuleArgs() {}

    private SchedulerRuleRuleArgs(SchedulerRuleRuleArgs $) {
        this.priority = $.priority;
        this.regionId = $.regionId;
        this.status = $.status;
        this.type = $.type;
        this.value = $.value;
        this.valueType = $.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchedulerRuleRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulerRuleRuleArgs $;

        public Builder() {
            $ = new SchedulerRuleRuleArgs();
        }

        public Builder(SchedulerRuleRuleArgs defaults) {
            $ = new SchedulerRuleRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param priority The priority of the rule.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of the rule.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param regionId The region where the interaction resource that is used in the scheduling rule is deployed. **NOTE:** This parameter is returned only if the RuleType parameter is set to 2.
         * 
         * @return builder
         * 
         */
        public Builder regionId(@Nullable Output<String> regionId) {
            $.regionId = regionId;
            return this;
        }

        /**
         * @param regionId The region where the interaction resource that is used in the scheduling rule is deployed. **NOTE:** This parameter is returned only if the RuleType parameter is set to 2.
         * 
         * @return builder
         * 
         */
        public Builder regionId(String regionId) {
            return regionId(Output.of(regionId));
        }

        /**
         * @param status The status of the scheduling rule.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Integer> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the scheduling rule.
         * 
         * @return builder
         * 
         */
        public Builder status(Integer status) {
            return status(Output.of(status));
        }

        /**
         * @param type The address type of the interaction resource. Valid values:
         * `A`: IPv4 address.
         * `CNAME`: CNAME record.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The address type of the interaction resource. Valid values:
         * `A`: IPv4 address.
         * `CNAME`: CNAME record.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The address of the interaction resource.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The address of the interaction resource.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param valueType Required. The type of the linked resource. It is an Integer. Valid values:
         * `1`: The IP address of Anti-DDoS Pro or Anti-DDoS Premium
         * `2`: the IP address of the interaction resource (in the tiered protection scenario)
         * `3`: the IP address used to accelerate access (in the network acceleration scenario)
         * `6` the IP address of the interaction resource (in the cloud service interaction scenario)
         * 
         * @return builder
         * 
         */
        public Builder valueType(@Nullable Output<Integer> valueType) {
            $.valueType = valueType;
            return this;
        }

        /**
         * @param valueType Required. The type of the linked resource. It is an Integer. Valid values:
         * `1`: The IP address of Anti-DDoS Pro or Anti-DDoS Premium
         * `2`: the IP address of the interaction resource (in the tiered protection scenario)
         * `3`: the IP address used to accelerate access (in the network acceleration scenario)
         * `6` the IP address of the interaction resource (in the cloud service interaction scenario)
         * 
         * @return builder
         * 
         */
        public Builder valueType(Integer valueType) {
            return valueType(Output.of(valueType));
        }

        public SchedulerRuleRuleArgs build() {
            return $;
        }
    }

}
