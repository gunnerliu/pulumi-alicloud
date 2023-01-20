// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlarmPrometheusArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlarmPrometheusArgs Empty = new AlarmPrometheusArgs();

    /**
     * The annotations of the Prometheus alert rule. When a Prometheus alert is triggered, the system renders the annotated keys and values to help you understand the metrics and alert rule.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return The annotations of the Prometheus alert rule. When a Prometheus alert is triggered, the system renders the annotated keys and values to help you understand the metrics and alert rule.
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
     * 
     */
    @Import(name="level")
    private @Nullable Output<String> level;

    /**
     * @return The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
     * 
     */
    public Optional<Output<String>> level() {
        return Optional.ofNullable(this.level);
    }

    /**
     * The PromQL query statement. **Note:** The data obtained by using the PromQL query statement is the monitoring data. You must include the alert threshold in this statement.
     * 
     */
    @Import(name="promQl")
    private @Nullable Output<String> promQl;

    /**
     * @return The PromQL query statement. **Note:** The data obtained by using the PromQL query statement is the monitoring data. You must include the alert threshold in this statement.
     * 
     */
    public Optional<Output<String>> promQl() {
        return Optional.ofNullable(this.promQl);
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

    private AlarmPrometheusArgs() {}

    private AlarmPrometheusArgs(AlarmPrometheusArgs $) {
        this.annotations = $.annotations;
        this.level = $.level;
        this.promQl = $.promQl;
        this.times = $.times;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlarmPrometheusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlarmPrometheusArgs $;

        public Builder() {
            $ = new AlarmPrometheusArgs();
        }

        public Builder(AlarmPrometheusArgs defaults) {
            $ = new AlarmPrometheusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations The annotations of the Prometheus alert rule. When a Prometheus alert is triggered, the system renders the annotated keys and values to help you understand the metrics and alert rule.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations The annotations of the Prometheus alert rule. When a Prometheus alert is triggered, the system renders the annotated keys and values to help you understand the metrics and alert rule.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param level The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
         * 
         * @return builder
         * 
         */
        public Builder level(@Nullable Output<String> level) {
            $.level = level;
            return this;
        }

        /**
         * @param level The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
         * 
         * @return builder
         * 
         */
        public Builder level(String level) {
            return level(Output.of(level));
        }

        /**
         * @param promQl The PromQL query statement. **Note:** The data obtained by using the PromQL query statement is the monitoring data. You must include the alert threshold in this statement.
         * 
         * @return builder
         * 
         */
        public Builder promQl(@Nullable Output<String> promQl) {
            $.promQl = promQl;
            return this;
        }

        /**
         * @param promQl The PromQL query statement. **Note:** The data obtained by using the PromQL query statement is the monitoring data. You must include the alert threshold in this statement.
         * 
         * @return builder
         * 
         */
        public Builder promQl(String promQl) {
            return promQl(Output.of(promQl));
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

        public AlarmPrometheusArgs build() {
            return $;
        }
    }

}
