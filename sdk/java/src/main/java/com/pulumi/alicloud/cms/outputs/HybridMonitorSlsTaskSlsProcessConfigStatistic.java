// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HybridMonitorSlsTaskSlsProcessConfigStatistic {
    /**
     * @return The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    private @Nullable String alias;
    /**
     * @return The function that is used to aggregate log data within a statistical period. Valid values: `count`, `sum`, `avg`, `max`, `min`, `value`, `countps`, `sumps`, `distinct`, `distribution`, `percentile`.
     * 
     */
    private @Nullable String function;
    /**
     * @return The value of the function that is used to aggregate logs imported from Log Service.
     * - If you set the `function` parameter to `distribution`, this parameter specifies the lower limit of the statistical interval. For example, if you want to calculate the number of HTTP requests whose status code is 2XX, set this parameter to 200.
     * - If you set the `function` parameter to `percentile`, this parameter specifies the percentile at which the expected value is. For example, 0.5 specifies P50.
     * 
     */
    private @Nullable String parameterOne;
    /**
     * @return The value of the function that is used to aggregate logs imported from Log Service. **Note:** This parameter is required only if the `function` parameter is set to `distribution`. This parameter specifies the upper limit of the statistical interval.
     * 
     */
    private @Nullable String parameterTwo;
    /**
     * @return The name of the key that is used to filter logs imported from Log Service.
     * 
     */
    private @Nullable String slsKeyName;

    private HybridMonitorSlsTaskSlsProcessConfigStatistic() {}
    /**
     * @return The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    public Optional<String> alias() {
        return Optional.ofNullable(this.alias);
    }
    /**
     * @return The function that is used to aggregate log data within a statistical period. Valid values: `count`, `sum`, `avg`, `max`, `min`, `value`, `countps`, `sumps`, `distinct`, `distribution`, `percentile`.
     * 
     */
    public Optional<String> function() {
        return Optional.ofNullable(this.function);
    }
    /**
     * @return The value of the function that is used to aggregate logs imported from Log Service.
     * - If you set the `function` parameter to `distribution`, this parameter specifies the lower limit of the statistical interval. For example, if you want to calculate the number of HTTP requests whose status code is 2XX, set this parameter to 200.
     * - If you set the `function` parameter to `percentile`, this parameter specifies the percentile at which the expected value is. For example, 0.5 specifies P50.
     * 
     */
    public Optional<String> parameterOne() {
        return Optional.ofNullable(this.parameterOne);
    }
    /**
     * @return The value of the function that is used to aggregate logs imported from Log Service. **Note:** This parameter is required only if the `function` parameter is set to `distribution`. This parameter specifies the upper limit of the statistical interval.
     * 
     */
    public Optional<String> parameterTwo() {
        return Optional.ofNullable(this.parameterTwo);
    }
    /**
     * @return The name of the key that is used to filter logs imported from Log Service.
     * 
     */
    public Optional<String> slsKeyName() {
        return Optional.ofNullable(this.slsKeyName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridMonitorSlsTaskSlsProcessConfigStatistic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String alias;
        private @Nullable String function;
        private @Nullable String parameterOne;
        private @Nullable String parameterTwo;
        private @Nullable String slsKeyName;
        public Builder() {}
        public Builder(HybridMonitorSlsTaskSlsProcessConfigStatistic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.function = defaults.function;
    	      this.parameterOne = defaults.parameterOne;
    	      this.parameterTwo = defaults.parameterTwo;
    	      this.slsKeyName = defaults.slsKeyName;
        }

        @CustomType.Setter
        public Builder alias(@Nullable String alias) {
            this.alias = alias;
            return this;
        }
        @CustomType.Setter
        public Builder function(@Nullable String function) {
            this.function = function;
            return this;
        }
        @CustomType.Setter
        public Builder parameterOne(@Nullable String parameterOne) {
            this.parameterOne = parameterOne;
            return this;
        }
        @CustomType.Setter
        public Builder parameterTwo(@Nullable String parameterTwo) {
            this.parameterTwo = parameterTwo;
            return this;
        }
        @CustomType.Setter
        public Builder slsKeyName(@Nullable String slsKeyName) {
            this.slsKeyName = slsKeyName;
            return this;
        }
        public HybridMonitorSlsTaskSlsProcessConfigStatistic build() {
            final var _resultValue = new HybridMonitorSlsTaskSlsProcessConfigStatistic();
            _resultValue.alias = alias;
            _resultValue.function = function;
            _resultValue.parameterOne = parameterOne;
            _resultValue.parameterTwo = parameterTwo;
            _resultValue.slsKeyName = slsKeyName;
            return _resultValue;
        }
    }
}
