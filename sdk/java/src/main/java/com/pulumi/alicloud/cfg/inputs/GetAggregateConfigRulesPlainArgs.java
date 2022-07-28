// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAggregateConfigRulesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAggregateConfigRulesPlainArgs Empty = new GetAggregateConfigRulesPlainArgs();

    /**
     * The config rule name.
     * 
     */
    @Import(name="aggregateConfigRuleName")
    private @Nullable String aggregateConfigRuleName;

    /**
     * @return The config rule name.
     * 
     */
    public Optional<String> aggregateConfigRuleName() {
        return Optional.ofNullable(this.aggregateConfigRuleName);
    }

    /**
     * The ID of aggregator.
     * 
     */
    @Import(name="aggregatorId", required=true)
    private String aggregatorId;

    /**
     * @return The ID of aggregator.
     * 
     */
    public String aggregatorId() {
        return this.aggregatorId;
    }

    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    /**
     * @return Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of Aggregate Config Rule IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Aggregate Config Rule IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Aggregate Config Rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Aggregate Config Rule name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * Optional, ForceNew) The Risk Level. Valid values `1`: critical, `2`: warning, `3`: info.
     * 
     */
    @Import(name="riskLevel")
    private @Nullable Integer riskLevel;

    /**
     * @return Optional, ForceNew) The Risk Level. Valid values `1`: critical, `2`: warning, `3`: info.
     * 
     */
    public Optional<Integer> riskLevel() {
        return Optional.ofNullable(this.riskLevel);
    }

    /**
     * The state of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The state of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetAggregateConfigRulesPlainArgs() {}

    private GetAggregateConfigRulesPlainArgs(GetAggregateConfigRulesPlainArgs $) {
        this.aggregateConfigRuleName = $.aggregateConfigRuleName;
        this.aggregatorId = $.aggregatorId;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.riskLevel = $.riskLevel;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAggregateConfigRulesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAggregateConfigRulesPlainArgs $;

        public Builder() {
            $ = new GetAggregateConfigRulesPlainArgs();
        }

        public Builder(GetAggregateConfigRulesPlainArgs defaults) {
            $ = new GetAggregateConfigRulesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregateConfigRuleName The config rule name.
         * 
         * @return builder
         * 
         */
        public Builder aggregateConfigRuleName(@Nullable String aggregateConfigRuleName) {
            $.aggregateConfigRuleName = aggregateConfigRuleName;
            return this;
        }

        /**
         * @param aggregatorId The ID of aggregator.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorId(String aggregatorId) {
            $.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * @param enableDetails Default to `false`. Set it to `true` can output more details about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of Aggregate Config Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Aggregate Config Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Aggregate Config Rule name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param riskLevel Optional, ForceNew) The Risk Level. Valid values `1`: critical, `2`: warning, `3`: info.
         * 
         * @return builder
         * 
         */
        public Builder riskLevel(@Nullable Integer riskLevel) {
            $.riskLevel = riskLevel;
            return this;
        }

        /**
         * @param status The state of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetAggregateConfigRulesPlainArgs build() {
            $.aggregatorId = Objects.requireNonNull($.aggregatorId, "expected parameter 'aggregatorId' to be non-null");
            return $;
        }
    }

}
