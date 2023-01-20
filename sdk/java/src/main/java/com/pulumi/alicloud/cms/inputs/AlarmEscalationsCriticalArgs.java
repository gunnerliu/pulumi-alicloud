// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlarmEscalationsCriticalArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlarmEscalationsCriticalArgs Empty = new AlarmEscalationsCriticalArgs();

    /**
     * Critical level alarm comparison operator. Valid values: [&#34;&lt;=&#34;, &#34;&lt;&#34;, &#34;&gt;&#34;, &#34;&gt;=&#34;, &#34;==&#34;, &#34;!=&#34;]. Default to &#34;==&#34;.
     * 
     */
    @Import(name="comparisonOperator")
    private @Nullable Output<String> comparisonOperator;

    /**
     * @return Critical level alarm comparison operator. Valid values: [&#34;&lt;=&#34;, &#34;&lt;&#34;, &#34;&gt;&#34;, &#34;&gt;=&#34;, &#34;==&#34;, &#34;!=&#34;]. Default to &#34;==&#34;.
     * 
     */
    public Optional<Output<String>> comparisonOperator() {
        return Optional.ofNullable(this.comparisonOperator);
    }

    /**
     * It has been deprecated from provider version 1.94.0 and &#39;escalations_critical.statistics&#39; instead.
     * 
     */
    @Import(name="statistics")
    private @Nullable Output<String> statistics;

    /**
     * @return It has been deprecated from provider version 1.94.0 and &#39;escalations_critical.statistics&#39; instead.
     * 
     */
    public Optional<Output<String>> statistics() {
        return Optional.ofNullable(this.statistics);
    }

    /**
     * It has been deprecated from provider version 1.94.0 and &#39;escalations_critical.threshold&#39; instead.
     * 
     */
    @Import(name="threshold")
    private @Nullable Output<String> threshold;

    /**
     * @return It has been deprecated from provider version 1.94.0 and &#39;escalations_critical.threshold&#39; instead.
     * 
     */
    public Optional<Output<String>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    /**
     * Critical level alarm retry times. Default to 3.
     * 
     */
    @Import(name="times")
    private @Nullable Output<Integer> times;

    /**
     * @return Critical level alarm retry times. Default to 3.
     * 
     */
    public Optional<Output<Integer>> times() {
        return Optional.ofNullable(this.times);
    }

    private AlarmEscalationsCriticalArgs() {}

    private AlarmEscalationsCriticalArgs(AlarmEscalationsCriticalArgs $) {
        this.comparisonOperator = $.comparisonOperator;
        this.statistics = $.statistics;
        this.threshold = $.threshold;
        this.times = $.times;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlarmEscalationsCriticalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlarmEscalationsCriticalArgs $;

        public Builder() {
            $ = new AlarmEscalationsCriticalArgs();
        }

        public Builder(AlarmEscalationsCriticalArgs defaults) {
            $ = new AlarmEscalationsCriticalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comparisonOperator Critical level alarm comparison operator. Valid values: [&#34;&lt;=&#34;, &#34;&lt;&#34;, &#34;&gt;&#34;, &#34;&gt;=&#34;, &#34;==&#34;, &#34;!=&#34;]. Default to &#34;==&#34;.
         * 
         * @return builder
         * 
         */
        public Builder comparisonOperator(@Nullable Output<String> comparisonOperator) {
            $.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * @param comparisonOperator Critical level alarm comparison operator. Valid values: [&#34;&lt;=&#34;, &#34;&lt;&#34;, &#34;&gt;&#34;, &#34;&gt;=&#34;, &#34;==&#34;, &#34;!=&#34;]. Default to &#34;==&#34;.
         * 
         * @return builder
         * 
         */
        public Builder comparisonOperator(String comparisonOperator) {
            return comparisonOperator(Output.of(comparisonOperator));
        }

        /**
         * @param statistics It has been deprecated from provider version 1.94.0 and &#39;escalations_critical.statistics&#39; instead.
         * 
         * @return builder
         * 
         */
        public Builder statistics(@Nullable Output<String> statistics) {
            $.statistics = statistics;
            return this;
        }

        /**
         * @param statistics It has been deprecated from provider version 1.94.0 and &#39;escalations_critical.statistics&#39; instead.
         * 
         * @return builder
         * 
         */
        public Builder statistics(String statistics) {
            return statistics(Output.of(statistics));
        }

        /**
         * @param threshold It has been deprecated from provider version 1.94.0 and &#39;escalations_critical.threshold&#39; instead.
         * 
         * @return builder
         * 
         */
        public Builder threshold(@Nullable Output<String> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold It has been deprecated from provider version 1.94.0 and &#39;escalations_critical.threshold&#39; instead.
         * 
         * @return builder
         * 
         */
        public Builder threshold(String threshold) {
            return threshold(Output.of(threshold));
        }

        /**
         * @param times Critical level alarm retry times. Default to 3.
         * 
         * @return builder
         * 
         */
        public Builder times(@Nullable Output<Integer> times) {
            $.times = times;
            return this;
        }

        /**
         * @param times Critical level alarm retry times. Default to 3.
         * 
         * @return builder
         * 
         */
        public Builder times(Integer times) {
            return times(Output.of(times));
        }

        public AlarmEscalationsCriticalArgs build() {
            return $;
        }
    }

}
