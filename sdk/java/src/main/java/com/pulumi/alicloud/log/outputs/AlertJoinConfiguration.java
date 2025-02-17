// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AlertJoinConfiguration {
    /**
     * @return Join condition.
     * 
     */
    private String condition;
    /**
     * @return including FixedRate,Hourly,Daily,Weekly,Cron.
     * 
     */
    private String type;

    private AlertJoinConfiguration() {}
    /**
     * @return Join condition.
     * 
     */
    public String condition() {
        return this.condition;
    }
    /**
     * @return including FixedRate,Hourly,Daily,Weekly,Cron.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertJoinConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String condition;
        private String type;
        public Builder() {}
        public Builder(AlertJoinConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder condition(String condition) {
            if (condition == null) {
              throw new MissingRequiredPropertyException("AlertJoinConfiguration", "condition");
            }
            this.condition = condition;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("AlertJoinConfiguration", "type");
            }
            this.type = type;
            return this;
        }
        public AlertJoinConfiguration build() {
            final var _resultValue = new AlertJoinConfiguration();
            _resultValue.condition = condition;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
