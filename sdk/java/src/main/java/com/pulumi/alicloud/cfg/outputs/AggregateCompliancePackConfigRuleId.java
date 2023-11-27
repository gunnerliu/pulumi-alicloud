// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AggregateCompliancePackConfigRuleId {
    /**
     * @return The rule ID of Aggregate Config Rule.
     * 
     */
    private @Nullable String configRuleId;

    private AggregateCompliancePackConfigRuleId() {}
    /**
     * @return The rule ID of Aggregate Config Rule.
     * 
     */
    public Optional<String> configRuleId() {
        return Optional.ofNullable(this.configRuleId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AggregateCompliancePackConfigRuleId defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String configRuleId;
        public Builder() {}
        public Builder(AggregateCompliancePackConfigRuleId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configRuleId = defaults.configRuleId;
        }

        @CustomType.Setter
        public Builder configRuleId(@Nullable String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public AggregateCompliancePackConfigRuleId build() {
            final var _resultValue = new AggregateCompliancePackConfigRuleId();
            _resultValue.configRuleId = configRuleId;
            return _resultValue;
        }
    }
}
