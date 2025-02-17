// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlarmEscalationsInfo {
    /**
     * @return Critical level alarm comparison operator. Default value: `==`. Valid values: [&#34;&lt;=&#34;, &#34;&lt;&#34;, &#34;&gt;&#34;, &#34;&gt;=&#34;, &#34;==&#34;, &#34;!=&#34;].
     * 
     */
    private @Nullable String comparisonOperator;
    /**
     * @return Critical level alarm statistics method. It must be consistent with that defined for metrics. For more information, see [How to use it](https://cms.console.aliyun.com/metric-meta/acs_ecs_dashboard/ecs).
     * 
     */
    private @Nullable String statistics;
    /**
     * @return Critical level alarm threshold value, which must be a numeric value currently.
     * 
     */
    private @Nullable String threshold;
    /**
     * @return Critical level alarm retry times. Default value: `3`.
     * 
     */
    private @Nullable Integer times;

    private AlarmEscalationsInfo() {}
    /**
     * @return Critical level alarm comparison operator. Default value: `==`. Valid values: [&#34;&lt;=&#34;, &#34;&lt;&#34;, &#34;&gt;&#34;, &#34;&gt;=&#34;, &#34;==&#34;, &#34;!=&#34;].
     * 
     */
    public Optional<String> comparisonOperator() {
        return Optional.ofNullable(this.comparisonOperator);
    }
    /**
     * @return Critical level alarm statistics method. It must be consistent with that defined for metrics. For more information, see [How to use it](https://cms.console.aliyun.com/metric-meta/acs_ecs_dashboard/ecs).
     * 
     */
    public Optional<String> statistics() {
        return Optional.ofNullable(this.statistics);
    }
    /**
     * @return Critical level alarm threshold value, which must be a numeric value currently.
     * 
     */
    public Optional<String> threshold() {
        return Optional.ofNullable(this.threshold);
    }
    /**
     * @return Critical level alarm retry times. Default value: `3`.
     * 
     */
    public Optional<Integer> times() {
        return Optional.ofNullable(this.times);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlarmEscalationsInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comparisonOperator;
        private @Nullable String statistics;
        private @Nullable String threshold;
        private @Nullable Integer times;
        public Builder() {}
        public Builder(AlarmEscalationsInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.statistics = defaults.statistics;
    	      this.threshold = defaults.threshold;
    	      this.times = defaults.times;
        }

        @CustomType.Setter
        public Builder comparisonOperator(@Nullable String comparisonOperator) {

            this.comparisonOperator = comparisonOperator;
            return this;
        }
        @CustomType.Setter
        public Builder statistics(@Nullable String statistics) {

            this.statistics = statistics;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(@Nullable String threshold) {

            this.threshold = threshold;
            return this;
        }
        @CustomType.Setter
        public Builder times(@Nullable Integer times) {

            this.times = times;
            return this;
        }
        public AlarmEscalationsInfo build() {
            final var _resultValue = new AlarmEscalationsInfo();
            _resultValue.comparisonOperator = comparisonOperator;
            _resultValue.statistics = statistics;
            _resultValue.threshold = threshold;
            _resultValue.times = times;
            return _resultValue;
        }
    }
}
