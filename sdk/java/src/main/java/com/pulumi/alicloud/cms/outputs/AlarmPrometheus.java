// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlarmPrometheus {
    /**
     * @return The annotations of the Prometheus alert rule. When a Prometheus alert is triggered, the system renders the annotated keys and values to help you understand the metrics and alert rule.
     * 
     */
    private @Nullable Map<String,Object> annotations;
    /**
     * @return The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
     * 
     */
    private @Nullable String level;
    /**
     * @return The PromQL query statement. **Note:** The data obtained by using the PromQL query statement is the monitoring data. You must include the alert threshold in this statement.
     * 
     */
    private @Nullable String promQl;
    /**
     * @return The number of consecutive triggers. If the number of times that the metric values meet the trigger conditions reaches the value of this parameter, CloudMonitor sends alert notifications.
     * 
     */
    private @Nullable Integer times;

    private AlarmPrometheus() {}
    /**
     * @return The annotations of the Prometheus alert rule. When a Prometheus alert is triggered, the system renders the annotated keys and values to help you understand the metrics and alert rule.
     * 
     */
    public Map<String,Object> annotations() {
        return this.annotations == null ? Map.of() : this.annotations;
    }
    /**
     * @return The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
     * 
     */
    public Optional<String> level() {
        return Optional.ofNullable(this.level);
    }
    /**
     * @return The PromQL query statement. **Note:** The data obtained by using the PromQL query statement is the monitoring data. You must include the alert threshold in this statement.
     * 
     */
    public Optional<String> promQl() {
        return Optional.ofNullable(this.promQl);
    }
    /**
     * @return The number of consecutive triggers. If the number of times that the metric values meet the trigger conditions reaches the value of this parameter, CloudMonitor sends alert notifications.
     * 
     */
    public Optional<Integer> times() {
        return Optional.ofNullable(this.times);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlarmPrometheus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> annotations;
        private @Nullable String level;
        private @Nullable String promQl;
        private @Nullable Integer times;
        public Builder() {}
        public Builder(AlarmPrometheus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.level = defaults.level;
    	      this.promQl = defaults.promQl;
    	      this.times = defaults.times;
        }

        @CustomType.Setter
        public Builder annotations(@Nullable Map<String,Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder level(@Nullable String level) {
            this.level = level;
            return this;
        }
        @CustomType.Setter
        public Builder promQl(@Nullable String promQl) {
            this.promQl = promQl;
            return this;
        }
        @CustomType.Setter
        public Builder times(@Nullable Integer times) {
            this.times = times;
            return this;
        }
        public AlarmPrometheus build() {
            final var _resultValue = new AlarmPrometheus();
            _resultValue.annotations = annotations;
            _resultValue.level = level;
            _resultValue.promQl = promQl;
            _resultValue.times = times;
            return _resultValue;
        }
    }
}
