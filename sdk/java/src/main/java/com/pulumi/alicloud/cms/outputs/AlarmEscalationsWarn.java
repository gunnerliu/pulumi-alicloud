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
public final class AlarmEscalationsWarn {
    /**
     * @return Critical level alarm comparison operator. Valid values: [&#34;&lt;=&#34;, &#34;&lt;&#34;, &#34;&gt;&#34;, &#34;&gt;=&#34;, &#34;==&#34;, &#34;!=&#34;]. Default to &#34;==&#34;.
     * 
     */
    private @Nullable String comparisonOperator;
    /**
     * @return It has been deprecated from provider version 1.94.0 and &#39;escalations_critical.statistics&#39; instead.
     * 
     */
    private @Nullable String statistics;
    /**
     * @return It has been deprecated from provider version 1.94.0 and &#39;escalations_critical.threshold&#39; instead.
     * 
     */
    private @Nullable String threshold;
    /**
     * @return Critical level alarm retry times. Default to 3.
     * 
     */
    private @Nullable Integer times;

    private AlarmEscalationsWarn() {}
    /**
     * @return Critical level alarm comparison operator. Valid values: [&#34;&lt;=&#34;, &#34;&lt;&#34;, &#34;&gt;&#34;, &#34;&gt;=&#34;, &#34;==&#34;, &#34;!=&#34;]. Default to &#34;==&#34;.
     * 
     */
    public Optional<String> comparisonOperator() {
        return Optional.ofNullable(this.comparisonOperator);
    }
    /**
     * @return It has been deprecated from provider version 1.94.0 and &#39;escalations_critical.statistics&#39; instead.
     * 
     */
    public Optional<String> statistics() {
        return Optional.ofNullable(this.statistics);
    }
    /**
     * @return It has been deprecated from provider version 1.94.0 and &#39;escalations_critical.threshold&#39; instead.
     * 
     */
    public Optional<String> threshold() {
        return Optional.ofNullable(this.threshold);
    }
    /**
     * @return Critical level alarm retry times. Default to 3.
     * 
     */
    public Optional<Integer> times() {
        return Optional.ofNullable(this.times);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlarmEscalationsWarn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comparisonOperator;
        private @Nullable String statistics;
        private @Nullable String threshold;
        private @Nullable Integer times;
        public Builder() {}
        public Builder(AlarmEscalationsWarn defaults) {
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
        public AlarmEscalationsWarn build() {
            final var o = new AlarmEscalationsWarn();
            o.comparisonOperator = comparisonOperator;
            o.statistics = statistics;
            o.threshold = threshold;
            o.times = times;
            return o;
        }
    }
}