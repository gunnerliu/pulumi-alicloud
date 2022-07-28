// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class AlertSeverityConfiguration {
    /**
     * @return Severity when this condition is met.
     * 
     */
    private final Map<String,String> evalCondition;
    /**
     * @return Severity for new alert, including 2,4,6,8,10 for Report,Low,Medium,High,Critical.
     * 
     */
    private final Integer severity;

    @CustomType.Constructor
    private AlertSeverityConfiguration(
        @CustomType.Parameter("evalCondition") Map<String,String> evalCondition,
        @CustomType.Parameter("severity") Integer severity) {
        this.evalCondition = evalCondition;
        this.severity = severity;
    }

    /**
     * @return Severity when this condition is met.
     * 
     */
    public Map<String,String> evalCondition() {
        return this.evalCondition;
    }
    /**
     * @return Severity for new alert, including 2,4,6,8,10 for Report,Low,Medium,High,Critical.
     * 
     */
    public Integer severity() {
        return this.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertSeverityConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> evalCondition;
        private Integer severity;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertSeverityConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evalCondition = defaults.evalCondition;
    	      this.severity = defaults.severity;
        }

        public Builder evalCondition(Map<String,String> evalCondition) {
            this.evalCondition = Objects.requireNonNull(evalCondition);
            return this;
        }
        public Builder severity(Integer severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }        public AlertSeverityConfiguration build() {
            return new AlertSeverityConfiguration(evalCondition, severity);
        }
    }
}
