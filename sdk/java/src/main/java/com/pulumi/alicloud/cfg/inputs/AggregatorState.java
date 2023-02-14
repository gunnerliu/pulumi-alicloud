// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.inputs;

import com.pulumi.alicloud.cfg.inputs.AggregatorAggregatorAccountArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AggregatorState extends com.pulumi.resources.ResourceArgs {

    public static final AggregatorState Empty = new AggregatorState();

    /**
     * The information of account in aggregator. If the aggregator_type is RD, it is optional and means add all members in the resource directory to the account group. **NOTE:** the field `aggregator_accounts` is not required from version 1.148.0.
     * 
     */
    @Import(name="aggregatorAccounts")
    private @Nullable Output<List<AggregatorAggregatorAccountArgs>> aggregatorAccounts;

    /**
     * @return The information of account in aggregator. If the aggregator_type is RD, it is optional and means add all members in the resource directory to the account group. **NOTE:** the field `aggregator_accounts` is not required from version 1.148.0.
     * 
     */
    public Optional<Output<List<AggregatorAggregatorAccountArgs>>> aggregatorAccounts() {
        return Optional.ofNullable(this.aggregatorAccounts);
    }

    /**
     * The name of aggregator.
     * 
     */
    @Import(name="aggregatorName")
    private @Nullable Output<String> aggregatorName;

    /**
     * @return The name of aggregator.
     * 
     */
    public Optional<Output<String>> aggregatorName() {
        return Optional.ofNullable(this.aggregatorName);
    }

    /**
     * The type of aggregator. Valid values: `CUSTOM`, `RD`. The Default value: `CUSTOM`.
     * 
     */
    @Import(name="aggregatorType")
    private @Nullable Output<String> aggregatorType;

    /**
     * @return The type of aggregator. Valid values: `CUSTOM`, `RD`. The Default value: `CUSTOM`.
     * 
     */
    public Optional<Output<String>> aggregatorType() {
        return Optional.ofNullable(this.aggregatorType);
    }

    /**
     * The description of aggregator.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of aggregator.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The status of the resource. Valid values: `0`: creating `1`: normal `2`: deleting.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource. Valid values: `0`: creating `1`: normal `2`: deleting.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private AggregatorState() {}

    private AggregatorState(AggregatorState $) {
        this.aggregatorAccounts = $.aggregatorAccounts;
        this.aggregatorName = $.aggregatorName;
        this.aggregatorType = $.aggregatorType;
        this.description = $.description;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AggregatorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AggregatorState $;

        public Builder() {
            $ = new AggregatorState();
        }

        public Builder(AggregatorState defaults) {
            $ = new AggregatorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregatorAccounts The information of account in aggregator. If the aggregator_type is RD, it is optional and means add all members in the resource directory to the account group. **NOTE:** the field `aggregator_accounts` is not required from version 1.148.0.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorAccounts(@Nullable Output<List<AggregatorAggregatorAccountArgs>> aggregatorAccounts) {
            $.aggregatorAccounts = aggregatorAccounts;
            return this;
        }

        /**
         * @param aggregatorAccounts The information of account in aggregator. If the aggregator_type is RD, it is optional and means add all members in the resource directory to the account group. **NOTE:** the field `aggregator_accounts` is not required from version 1.148.0.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorAccounts(List<AggregatorAggregatorAccountArgs> aggregatorAccounts) {
            return aggregatorAccounts(Output.of(aggregatorAccounts));
        }

        /**
         * @param aggregatorAccounts The information of account in aggregator. If the aggregator_type is RD, it is optional and means add all members in the resource directory to the account group. **NOTE:** the field `aggregator_accounts` is not required from version 1.148.0.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorAccounts(AggregatorAggregatorAccountArgs... aggregatorAccounts) {
            return aggregatorAccounts(List.of(aggregatorAccounts));
        }

        /**
         * @param aggregatorName The name of aggregator.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorName(@Nullable Output<String> aggregatorName) {
            $.aggregatorName = aggregatorName;
            return this;
        }

        /**
         * @param aggregatorName The name of aggregator.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorName(String aggregatorName) {
            return aggregatorName(Output.of(aggregatorName));
        }

        /**
         * @param aggregatorType The type of aggregator. Valid values: `CUSTOM`, `RD`. The Default value: `CUSTOM`.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorType(@Nullable Output<String> aggregatorType) {
            $.aggregatorType = aggregatorType;
            return this;
        }

        /**
         * @param aggregatorType The type of aggregator. Valid values: `CUSTOM`, `RD`. The Default value: `CUSTOM`.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorType(String aggregatorType) {
            return aggregatorType(Output.of(aggregatorType));
        }

        /**
         * @param description The description of aggregator.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of aggregator.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param status The status of the resource. Valid values: `0`: creating `1`: normal `2`: deleting.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource. Valid values: `0`: creating `1`: normal `2`: deleting.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public AggregatorState build() {
            return $;
        }
    }

}