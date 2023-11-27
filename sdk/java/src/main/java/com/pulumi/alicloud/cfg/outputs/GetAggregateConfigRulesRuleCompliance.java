// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAggregateConfigRulesRuleCompliance {
    /**
     * @return The Compliance Type.
     * 
     */
    private String complianceType;
    /**
     * @return The Count.
     * 
     */
    private Integer count;

    private GetAggregateConfigRulesRuleCompliance() {}
    /**
     * @return The Compliance Type.
     * 
     */
    public String complianceType() {
        return this.complianceType;
    }
    /**
     * @return The Count.
     * 
     */
    public Integer count() {
        return this.count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAggregateConfigRulesRuleCompliance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String complianceType;
        private Integer count;
        public Builder() {}
        public Builder(GetAggregateConfigRulesRuleCompliance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceType = defaults.complianceType;
    	      this.count = defaults.count;
        }

        @CustomType.Setter
        public Builder complianceType(String complianceType) {
            this.complianceType = Objects.requireNonNull(complianceType);
            return this;
        }
        @CustomType.Setter
        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public GetAggregateConfigRulesRuleCompliance build() {
            final var _resultValue = new GetAggregateConfigRulesRuleCompliance();
            _resultValue.complianceType = complianceType;
            _resultValue.count = count;
            return _resultValue;
        }
    }
}
