// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWafRulesWafRuleCondition {
    /**
     * @return The match field.
     * 
     */
    private String key;
    /**
     * @return The logical symbol.
     * 
     */
    private String opValue;
    /**
     * @return The subfield of the target field.
     * 
     */
    private String subKey;
    /**
     * @return The match content. Separate multiple values with commas (,).
     * 
     */
    private String values;

    private GetWafRulesWafRuleCondition() {}
    /**
     * @return The match field.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The logical symbol.
     * 
     */
    public String opValue() {
        return this.opValue;
    }
    /**
     * @return The subfield of the target field.
     * 
     */
    public String subKey() {
        return this.subKey;
    }
    /**
     * @return The match content. Separate multiple values with commas (,).
     * 
     */
    public String values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWafRulesWafRuleCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String opValue;
        private String subKey;
        private String values;
        public Builder() {}
        public Builder(GetWafRulesWafRuleCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.opValue = defaults.opValue;
    	      this.subKey = defaults.subKey;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder opValue(String opValue) {
            this.opValue = Objects.requireNonNull(opValue);
            return this;
        }
        @CustomType.Setter
        public Builder subKey(String subKey) {
            this.subKey = Objects.requireNonNull(subKey);
            return this;
        }
        @CustomType.Setter
        public Builder values(String values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public GetWafRulesWafRuleCondition build() {
            final var o = new GetWafRulesWafRuleCondition();
            o.key = key;
            o.opValue = opValue;
            o.subKey = subKey;
            o.values = values;
            return o;
        }
    }
}
