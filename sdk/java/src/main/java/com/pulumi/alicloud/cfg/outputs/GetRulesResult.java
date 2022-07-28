// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.outputs;

import com.pulumi.alicloud.cfg.outputs.GetRulesRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesResult {
    /**
     * @deprecated
     * Field &#39;config_rule_state&#39; has been deprecated from provider version 1.124.1. New field &#39;status&#39; instead.
     * 
     */
    @Deprecated /* Field 'config_rule_state' has been deprecated from provider version 1.124.1. New field 'status' instead. */
    private final @Nullable String configRuleState;
    private final @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of Config Rule IDs.
     * 
     */
    private final List<String> ids;
    private final @Nullable String nameRegex;
    /**
     * @return A list of Config Rule names.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;
    private final @Nullable Integer riskLevel;
    private final @Nullable String ruleName;
    /**
     * @return A list of Config Rules. Each element contains the following attributes:
     * 
     */
    private final List<GetRulesRule> rules;
    /**
     * @return (Available in 1.124.1+) The status of config rule.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private GetRulesResult(
        @CustomType.Parameter("configRuleState") @Nullable String configRuleState,
        @CustomType.Parameter("enableDetails") @Nullable Boolean enableDetails,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("riskLevel") @Nullable Integer riskLevel,
        @CustomType.Parameter("ruleName") @Nullable String ruleName,
        @CustomType.Parameter("rules") List<GetRulesRule> rules,
        @CustomType.Parameter("status") @Nullable String status) {
        this.configRuleState = configRuleState;
        this.enableDetails = enableDetails;
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.riskLevel = riskLevel;
        this.ruleName = ruleName;
        this.rules = rules;
        this.status = status;
    }

    /**
     * @deprecated
     * Field &#39;config_rule_state&#39; has been deprecated from provider version 1.124.1. New field &#39;status&#39; instead.
     * 
     */
    @Deprecated /* Field 'config_rule_state' has been deprecated from provider version 1.124.1. New field 'status' instead. */
    public Optional<String> configRuleState() {
        return Optional.ofNullable(this.configRuleState);
    }
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of Config Rule IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of Config Rule names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<Integer> riskLevel() {
        return Optional.ofNullable(this.riskLevel);
    }
    public Optional<String> ruleName() {
        return Optional.ofNullable(this.ruleName);
    }
    /**
     * @return A list of Config Rules. Each element contains the following attributes:
     * 
     */
    public List<GetRulesRule> rules() {
        return this.rules;
    }
    /**
     * @return (Available in 1.124.1+) The status of config rule.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String configRuleState;
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable Integer riskLevel;
        private @Nullable String ruleName;
        private List<GetRulesRule> rules;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configRuleState = defaults.configRuleState;
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.riskLevel = defaults.riskLevel;
    	      this.ruleName = defaults.ruleName;
    	      this.rules = defaults.rules;
    	      this.status = defaults.status;
        }

        public Builder configRuleState(@Nullable String configRuleState) {
            this.configRuleState = configRuleState;
            return this;
        }
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder riskLevel(@Nullable Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public Builder rules(List<GetRulesRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetRulesRule... rules) {
            return rules(List.of(rules));
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetRulesResult build() {
            return new GetRulesResult(configRuleState, enableDetails, id, ids, nameRegex, names, outputFile, riskLevel, ruleName, rules, status);
        }
    }
}
