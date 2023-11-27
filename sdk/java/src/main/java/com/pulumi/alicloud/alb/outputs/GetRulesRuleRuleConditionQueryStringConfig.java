// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.alicloud.alb.outputs.GetRulesRuleRuleConditionQueryStringConfigValue;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRulesRuleRuleConditionQueryStringConfig {
    /**
     * @return Add one or more IP addresses or IP address segments.
     * 
     */
    private List<GetRulesRuleRuleConditionQueryStringConfigValue> values;

    private GetRulesRuleRuleConditionQueryStringConfig() {}
    /**
     * @return Add one or more IP addresses or IP address segments.
     * 
     */
    public List<GetRulesRuleRuleConditionQueryStringConfigValue> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesRuleRuleConditionQueryStringConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRulesRuleRuleConditionQueryStringConfigValue> values;
        public Builder() {}
        public Builder(GetRulesRuleRuleConditionQueryStringConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder values(List<GetRulesRuleRuleConditionQueryStringConfigValue> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(GetRulesRuleRuleConditionQueryStringConfigValue... values) {
            return values(List.of(values));
        }
        public GetRulesRuleRuleConditionQueryStringConfig build() {
            final var _resultValue = new GetRulesRuleRuleConditionQueryStringConfig();
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
