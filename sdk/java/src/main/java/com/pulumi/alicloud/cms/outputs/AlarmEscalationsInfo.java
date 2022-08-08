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
     * @return Critical level alarm comparison operator. Valid values: [&#34;&lt;=&#34;, &#34;&lt;&#34;, &#34;&gt;&#34;, &#34;&gt;=&#34;, &#34;==&#34;, &#34;!=&#34;]. Default to &#34;==&#34;.
     * 
     */
    private final @Nullable String comparisonOperator;
    /**
     * @return Critical level alarm statistics method. It must be consistent with that defined for metrics. Valid values: [&#34;Availability&#34;,&#34;Average&#34;, &#34;Minimum&#34;, &#34;Maximum&#34;, &#34;Value&#34;, &#34;ErrorCodeMaximum&#34;, &#34;Sum&#34;, &#34;Count&#34;]. Default to &#34;Average&#34;.
     * 
     */
    private final @Nullable String statistics;
    /**
     * @return Critical level alarm threshold value, which must be a numeric value currently.
     * 
     */
    private final @Nullable String threshold;
    /**
     * @return The number of consecutive triggers. If the number of times that the metric values meet the trigger conditions reaches the value of this parameter, CloudMonitor sends alert notifications.
     * 
     */
    private final @Nullable Integer times;

    @CustomType.Constructor
    private AlarmEscalationsInfo(
        @CustomType.Parameter("comparisonOperator") @Nullable String comparisonOperator,
        @CustomType.Parameter("statistics") @Nullable String statistics,
        @CustomType.Parameter("threshold") @Nullable String threshold,
        @CustomType.Parameter("times") @Nullable Integer times) {
        this.comparisonOperator = comparisonOperator;
        this.statistics = statistics;
        this.threshold = threshold;
        this.times = times;
    }

    /**
     * @return Critical level alarm comparison operator. Valid values: [&#34;&lt;=&#34;, &#34;&lt;&#34;, &#34;&gt;&#34;, &#34;&gt;=&#34;, &#34;==&#34;, &#34;!=&#34;]. Default to &#34;==&#34;.
     * 
     */
    public Optional<String> comparisonOperator() {
        return Optional.ofNullable(this.comparisonOperator);
    }
    /**
     * @return Critical level alarm statistics method. It must be consistent with that defined for metrics. Valid values: [&#34;Availability&#34;,&#34;Average&#34;, &#34;Minimum&#34;, &#34;Maximum&#34;, &#34;Value&#34;, &#34;ErrorCodeMaximum&#34;, &#34;Sum&#34;, &#34;Count&#34;]. Default to &#34;Average&#34;.
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
     * @return The number of consecutive triggers. If the number of times that the metric values meet the trigger conditions reaches the value of this parameter, CloudMonitor sends alert notifications.
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

    public static final class Builder {
        private @Nullable String comparisonOperator;
        private @Nullable String statistics;
        private @Nullable String threshold;
        private @Nullable Integer times;

        public Builder() {
    	      // Empty
        }

        public Builder(AlarmEscalationsInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.statistics = defaults.statistics;
    	      this.threshold = defaults.threshold;
    	      this.times = defaults.times;
        }

        public Builder comparisonOperator(@Nullable String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public Builder statistics(@Nullable String statistics) {
            this.statistics = statistics;
            return this;
        }
        public Builder threshold(@Nullable String threshold) {
            this.threshold = threshold;
            return this;
        }
        public Builder times(@Nullable Integer times) {
            this.times = times;
            return this;
        }        public AlarmEscalationsInfo build() {
            return new AlarmEscalationsInfo(comparisonOperator, statistics, threshold, times);
        }
    }
}
