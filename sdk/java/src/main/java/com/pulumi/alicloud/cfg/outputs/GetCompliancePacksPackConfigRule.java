// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.outputs;

import com.pulumi.alicloud.cfg.outputs.GetCompliancePacksPackConfigRuleConfigRuleParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCompliancePacksPackConfigRule {
    /**
     * @return The ID of the rule.
     * 
     */
    private String configRuleId;
    /**
     * @return A list of parameter rules.
     * 
     */
    private List<GetCompliancePacksPackConfigRuleConfigRuleParameter> configRuleParameters;
    /**
     * @return Managed Rule Identifier.
     * 
     */
    private String managedRuleIdentifier;

    private GetCompliancePacksPackConfigRule() {}
    /**
     * @return The ID of the rule.
     * 
     */
    public String configRuleId() {
        return this.configRuleId;
    }
    /**
     * @return A list of parameter rules.
     * 
     */
    public List<GetCompliancePacksPackConfigRuleConfigRuleParameter> configRuleParameters() {
        return this.configRuleParameters;
    }
    /**
     * @return Managed Rule Identifier.
     * 
     */
    public String managedRuleIdentifier() {
        return this.managedRuleIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCompliancePacksPackConfigRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String configRuleId;
        private List<GetCompliancePacksPackConfigRuleConfigRuleParameter> configRuleParameters;
        private String managedRuleIdentifier;
        public Builder() {}
        public Builder(GetCompliancePacksPackConfigRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configRuleId = defaults.configRuleId;
    	      this.configRuleParameters = defaults.configRuleParameters;
    	      this.managedRuleIdentifier = defaults.managedRuleIdentifier;
        }

        @CustomType.Setter
        public Builder configRuleId(String configRuleId) {
            this.configRuleId = Objects.requireNonNull(configRuleId);
            return this;
        }
        @CustomType.Setter
        public Builder configRuleParameters(List<GetCompliancePacksPackConfigRuleConfigRuleParameter> configRuleParameters) {
            this.configRuleParameters = Objects.requireNonNull(configRuleParameters);
            return this;
        }
        public Builder configRuleParameters(GetCompliancePacksPackConfigRuleConfigRuleParameter... configRuleParameters) {
            return configRuleParameters(List.of(configRuleParameters));
        }
        @CustomType.Setter
        public Builder managedRuleIdentifier(String managedRuleIdentifier) {
            this.managedRuleIdentifier = Objects.requireNonNull(managedRuleIdentifier);
            return this;
        }
        public GetCompliancePacksPackConfigRule build() {
            final var _resultValue = new GetCompliancePacksPackConfigRule();
            _resultValue.configRuleId = configRuleId;
            _resultValue.configRuleParameters = configRuleParameters;
            _resultValue.managedRuleIdentifier = managedRuleIdentifier;
            return _resultValue;
        }
    }
}
