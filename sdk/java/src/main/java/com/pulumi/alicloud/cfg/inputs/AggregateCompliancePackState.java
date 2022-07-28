// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.inputs;

import com.pulumi.alicloud.cfg.inputs.AggregateCompliancePackConfigRuleArgs;
import com.pulumi.alicloud.cfg.inputs.AggregateCompliancePackConfigRuleIdArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AggregateCompliancePackState extends com.pulumi.resources.ResourceArgs {

    public static final AggregateCompliancePackState Empty = new AggregateCompliancePackState();

    /**
     * The name of compliance package name. **NOTE:** the `aggregate_compliance_pack_name` supports modification since V1.145.0.
     * 
     */
    @Import(name="aggregateCompliancePackName")
    private @Nullable Output<String> aggregateCompliancePackName;

    /**
     * @return The name of compliance package name. **NOTE:** the `aggregate_compliance_pack_name` supports modification since V1.145.0.
     * 
     */
    public Optional<Output<String>> aggregateCompliancePackName() {
        return Optional.ofNullable(this.aggregateCompliancePackName);
    }

    /**
     * The ID of aggregator.
     * 
     */
    @Import(name="aggregatorId")
    private @Nullable Output<String> aggregatorId;

    /**
     * @return The ID of aggregator.
     * 
     */
    public Optional<Output<String>> aggregatorId() {
        return Optional.ofNullable(this.aggregatorId);
    }

    /**
     * The Template ID of compliance package.
     * 
     */
    @Import(name="compliancePackTemplateId")
    private @Nullable Output<String> compliancePackTemplateId;

    /**
     * @return The Template ID of compliance package.
     * 
     */
    public Optional<Output<String>> compliancePackTemplateId() {
        return Optional.ofNullable(this.compliancePackTemplateId);
    }

    /**
     * A list of Config Rule IDs.
     * 
     */
    @Import(name="configRuleIds")
    private @Nullable Output<List<AggregateCompliancePackConfigRuleIdArgs>> configRuleIds;

    /**
     * @return A list of Config Rule IDs.
     * 
     */
    public Optional<Output<List<AggregateCompliancePackConfigRuleIdArgs>>> configRuleIds() {
        return Optional.ofNullable(this.configRuleIds);
    }

    /**
     * A list of Config Rules.
     * 
     * @deprecated
     * Field &#39;config_rules&#39; has been deprecated from provider version 1.141.0. New field &#39;config_rule_ids&#39; instead.
     * 
     */
    @Deprecated /* Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead. */
    @Import(name="configRules")
    private @Nullable Output<List<AggregateCompliancePackConfigRuleArgs>> configRules;

    /**
     * @return A list of Config Rules.
     * 
     * @deprecated
     * Field &#39;config_rules&#39; has been deprecated from provider version 1.141.0. New field &#39;config_rule_ids&#39; instead.
     * 
     */
    @Deprecated /* Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead. */
    public Optional<Output<List<AggregateCompliancePackConfigRuleArgs>>> configRules() {
        return Optional.ofNullable(this.configRules);
    }

    /**
     * The description of compliance package.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of compliance package.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Risk Level. Valid values: `1`: critical `2`: warning `3`: info.
     * 
     */
    @Import(name="riskLevel")
    private @Nullable Output<Integer> riskLevel;

    /**
     * @return The Risk Level. Valid values: `1`: critical `2`: warning `3`: info.
     * 
     */
    public Optional<Output<Integer>> riskLevel() {
        return Optional.ofNullable(this.riskLevel);
    }

    /**
     * The status of the resource. The valid values: `CREATING`, `ACTIVE`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource. The valid values: `CREATING`, `ACTIVE`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private AggregateCompliancePackState() {}

    private AggregateCompliancePackState(AggregateCompliancePackState $) {
        this.aggregateCompliancePackName = $.aggregateCompliancePackName;
        this.aggregatorId = $.aggregatorId;
        this.compliancePackTemplateId = $.compliancePackTemplateId;
        this.configRuleIds = $.configRuleIds;
        this.configRules = $.configRules;
        this.description = $.description;
        this.riskLevel = $.riskLevel;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AggregateCompliancePackState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AggregateCompliancePackState $;

        public Builder() {
            $ = new AggregateCompliancePackState();
        }

        public Builder(AggregateCompliancePackState defaults) {
            $ = new AggregateCompliancePackState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregateCompliancePackName The name of compliance package name. **NOTE:** the `aggregate_compliance_pack_name` supports modification since V1.145.0.
         * 
         * @return builder
         * 
         */
        public Builder aggregateCompliancePackName(@Nullable Output<String> aggregateCompliancePackName) {
            $.aggregateCompliancePackName = aggregateCompliancePackName;
            return this;
        }

        /**
         * @param aggregateCompliancePackName The name of compliance package name. **NOTE:** the `aggregate_compliance_pack_name` supports modification since V1.145.0.
         * 
         * @return builder
         * 
         */
        public Builder aggregateCompliancePackName(String aggregateCompliancePackName) {
            return aggregateCompliancePackName(Output.of(aggregateCompliancePackName));
        }

        /**
         * @param aggregatorId The ID of aggregator.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorId(@Nullable Output<String> aggregatorId) {
            $.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * @param aggregatorId The ID of aggregator.
         * 
         * @return builder
         * 
         */
        public Builder aggregatorId(String aggregatorId) {
            return aggregatorId(Output.of(aggregatorId));
        }

        /**
         * @param compliancePackTemplateId The Template ID of compliance package.
         * 
         * @return builder
         * 
         */
        public Builder compliancePackTemplateId(@Nullable Output<String> compliancePackTemplateId) {
            $.compliancePackTemplateId = compliancePackTemplateId;
            return this;
        }

        /**
         * @param compliancePackTemplateId The Template ID of compliance package.
         * 
         * @return builder
         * 
         */
        public Builder compliancePackTemplateId(String compliancePackTemplateId) {
            return compliancePackTemplateId(Output.of(compliancePackTemplateId));
        }

        /**
         * @param configRuleIds A list of Config Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder configRuleIds(@Nullable Output<List<AggregateCompliancePackConfigRuleIdArgs>> configRuleIds) {
            $.configRuleIds = configRuleIds;
            return this;
        }

        /**
         * @param configRuleIds A list of Config Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder configRuleIds(List<AggregateCompliancePackConfigRuleIdArgs> configRuleIds) {
            return configRuleIds(Output.of(configRuleIds));
        }

        /**
         * @param configRuleIds A list of Config Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder configRuleIds(AggregateCompliancePackConfigRuleIdArgs... configRuleIds) {
            return configRuleIds(List.of(configRuleIds));
        }

        /**
         * @param configRules A list of Config Rules.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;config_rules&#39; has been deprecated from provider version 1.141.0. New field &#39;config_rule_ids&#39; instead.
         * 
         */
        @Deprecated /* Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead. */
        public Builder configRules(@Nullable Output<List<AggregateCompliancePackConfigRuleArgs>> configRules) {
            $.configRules = configRules;
            return this;
        }

        /**
         * @param configRules A list of Config Rules.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;config_rules&#39; has been deprecated from provider version 1.141.0. New field &#39;config_rule_ids&#39; instead.
         * 
         */
        @Deprecated /* Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead. */
        public Builder configRules(List<AggregateCompliancePackConfigRuleArgs> configRules) {
            return configRules(Output.of(configRules));
        }

        /**
         * @param configRules A list of Config Rules.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;config_rules&#39; has been deprecated from provider version 1.141.0. New field &#39;config_rule_ids&#39; instead.
         * 
         */
        @Deprecated /* Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead. */
        public Builder configRules(AggregateCompliancePackConfigRuleArgs... configRules) {
            return configRules(List.of(configRules));
        }

        /**
         * @param description The description of compliance package.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of compliance package.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param riskLevel The Risk Level. Valid values: `1`: critical `2`: warning `3`: info.
         * 
         * @return builder
         * 
         */
        public Builder riskLevel(@Nullable Output<Integer> riskLevel) {
            $.riskLevel = riskLevel;
            return this;
        }

        /**
         * @param riskLevel The Risk Level. Valid values: `1`: critical `2`: warning `3`: info.
         * 
         * @return builder
         * 
         */
        public Builder riskLevel(Integer riskLevel) {
            return riskLevel(Output.of(riskLevel));
        }

        /**
         * @param status The status of the resource. The valid values: `CREATING`, `ACTIVE`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource. The valid values: `CREATING`, `ACTIVE`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public AggregateCompliancePackState build() {
            return $;
        }
    }

}
