// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.inputs;

import com.pulumi.alicloud.arms.inputs.PrometheusAlertRuleAnnotationArgs;
import com.pulumi.alicloud.arms.inputs.PrometheusAlertRuleLabelArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrometheusAlertRuleState extends com.pulumi.resources.ResourceArgs {

    public static final PrometheusAlertRuleState Empty = new PrometheusAlertRuleState();

    /**
     * The annotations of the alert rule.. See the following `Block annotations`.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<PrometheusAlertRuleAnnotationArgs>> annotations;

    /**
     * @return The annotations of the alert rule.. See the following `Block annotations`.
     * 
     */
    public Optional<Output<List<PrometheusAlertRuleAnnotationArgs>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The ID of the cluster.
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The ID of the cluster.
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * The ID of the notification policy. This parameter is required when the `notify_type` parameter is set to `DISPATCH_RULE`.
     * 
     */
    @Import(name="dispatchRuleId")
    private @Nullable Output<String> dispatchRuleId;

    /**
     * @return The ID of the notification policy. This parameter is required when the `notify_type` parameter is set to `DISPATCH_RULE`.
     * 
     */
    public Optional<Output<String>> dispatchRuleId() {
        return Optional.ofNullable(this.dispatchRuleId);
    }

    /**
     * The duration of the alert.
     * 
     */
    @Import(name="duration")
    private @Nullable Output<String> duration;

    /**
     * @return The duration of the alert.
     * 
     */
    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * The alert rule expression that follows the PromQL syntax.
     * 
     */
    @Import(name="expression")
    private @Nullable Output<String> expression;

    /**
     * @return The alert rule expression that follows the PromQL syntax.
     * 
     */
    public Optional<Output<String>> expression() {
        return Optional.ofNullable(this.expression);
    }

    /**
     * The labels of the resource. See the following `Block labels`.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<PrometheusAlertRuleLabelArgs>> labels;

    /**
     * @return The labels of the resource. See the following `Block labels`.
     * 
     */
    public Optional<Output<List<PrometheusAlertRuleLabelArgs>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The message of the alert notification.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return The message of the alert notification.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * The method of sending the alert notification. Valid values: `ALERT_MANAGER`, `DISPATCH_RULE`.
     * 
     */
    @Import(name="notifyType")
    private @Nullable Output<String> notifyType;

    /**
     * @return The method of sending the alert notification. Valid values: `ALERT_MANAGER`, `DISPATCH_RULE`.
     * 
     */
    public Optional<Output<String>> notifyType() {
        return Optional.ofNullable(this.notifyType);
    }

    /**
     * The first ID of the resource.
     * 
     */
    @Import(name="prometheusAlertRuleId")
    private @Nullable Output<Integer> prometheusAlertRuleId;

    /**
     * @return The first ID of the resource.
     * 
     */
    public Optional<Output<Integer>> prometheusAlertRuleId() {
        return Optional.ofNullable(this.prometheusAlertRuleId);
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="prometheusAlertRuleName")
    private @Nullable Output<String> prometheusAlertRuleName;

    /**
     * @return The name of the resource.
     * 
     */
    public Optional<Output<String>> prometheusAlertRuleName() {
        return Optional.ofNullable(this.prometheusAlertRuleName);
    }

    /**
     * The status of the resource. Valid values: `0`, `1`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Integer> status;

    /**
     * @return The status of the resource. Valid values: `0`, `1`.
     * 
     */
    public Optional<Output<Integer>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The type of the alert rule.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the alert rule.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private PrometheusAlertRuleState() {}

    private PrometheusAlertRuleState(PrometheusAlertRuleState $) {
        this.annotations = $.annotations;
        this.clusterId = $.clusterId;
        this.dispatchRuleId = $.dispatchRuleId;
        this.duration = $.duration;
        this.expression = $.expression;
        this.labels = $.labels;
        this.message = $.message;
        this.notifyType = $.notifyType;
        this.prometheusAlertRuleId = $.prometheusAlertRuleId;
        this.prometheusAlertRuleName = $.prometheusAlertRuleName;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrometheusAlertRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrometheusAlertRuleState $;

        public Builder() {
            $ = new PrometheusAlertRuleState();
        }

        public Builder(PrometheusAlertRuleState defaults) {
            $ = new PrometheusAlertRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations The annotations of the alert rule.. See the following `Block annotations`.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<PrometheusAlertRuleAnnotationArgs>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations The annotations of the alert rule.. See the following `Block annotations`.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<PrometheusAlertRuleAnnotationArgs> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations The annotations of the alert rule.. See the following `Block annotations`.
         * 
         * @return builder
         * 
         */
        public Builder annotations(PrometheusAlertRuleAnnotationArgs... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param clusterId The ID of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The ID of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param dispatchRuleId The ID of the notification policy. This parameter is required when the `notify_type` parameter is set to `DISPATCH_RULE`.
         * 
         * @return builder
         * 
         */
        public Builder dispatchRuleId(@Nullable Output<String> dispatchRuleId) {
            $.dispatchRuleId = dispatchRuleId;
            return this;
        }

        /**
         * @param dispatchRuleId The ID of the notification policy. This parameter is required when the `notify_type` parameter is set to `DISPATCH_RULE`.
         * 
         * @return builder
         * 
         */
        public Builder dispatchRuleId(String dispatchRuleId) {
            return dispatchRuleId(Output.of(dispatchRuleId));
        }

        /**
         * @param duration The duration of the alert.
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration The duration of the alert.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param expression The alert rule expression that follows the PromQL syntax.
         * 
         * @return builder
         * 
         */
        public Builder expression(@Nullable Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression The alert rule expression that follows the PromQL syntax.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param labels The labels of the resource. See the following `Block labels`.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<PrometheusAlertRuleLabelArgs>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels of the resource. See the following `Block labels`.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<PrometheusAlertRuleLabelArgs> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels The labels of the resource. See the following `Block labels`.
         * 
         * @return builder
         * 
         */
        public Builder labels(PrometheusAlertRuleLabelArgs... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param message The message of the alert notification.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message The message of the alert notification.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param notifyType The method of sending the alert notification. Valid values: `ALERT_MANAGER`, `DISPATCH_RULE`.
         * 
         * @return builder
         * 
         */
        public Builder notifyType(@Nullable Output<String> notifyType) {
            $.notifyType = notifyType;
            return this;
        }

        /**
         * @param notifyType The method of sending the alert notification. Valid values: `ALERT_MANAGER`, `DISPATCH_RULE`.
         * 
         * @return builder
         * 
         */
        public Builder notifyType(String notifyType) {
            return notifyType(Output.of(notifyType));
        }

        /**
         * @param prometheusAlertRuleId The first ID of the resource.
         * 
         * @return builder
         * 
         */
        public Builder prometheusAlertRuleId(@Nullable Output<Integer> prometheusAlertRuleId) {
            $.prometheusAlertRuleId = prometheusAlertRuleId;
            return this;
        }

        /**
         * @param prometheusAlertRuleId The first ID of the resource.
         * 
         * @return builder
         * 
         */
        public Builder prometheusAlertRuleId(Integer prometheusAlertRuleId) {
            return prometheusAlertRuleId(Output.of(prometheusAlertRuleId));
        }

        /**
         * @param prometheusAlertRuleName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder prometheusAlertRuleName(@Nullable Output<String> prometheusAlertRuleName) {
            $.prometheusAlertRuleName = prometheusAlertRuleName;
            return this;
        }

        /**
         * @param prometheusAlertRuleName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder prometheusAlertRuleName(String prometheusAlertRuleName) {
            return prometheusAlertRuleName(Output.of(prometheusAlertRuleName));
        }

        /**
         * @param status The status of the resource. Valid values: `0`, `1`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Integer> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource. Valid values: `0`, `1`.
         * 
         * @return builder
         * 
         */
        public Builder status(Integer status) {
            return status(Output.of(status));
        }

        /**
         * @param type The type of the alert rule.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the alert rule.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public PrometheusAlertRuleState build() {
            return $;
        }
    }

}
