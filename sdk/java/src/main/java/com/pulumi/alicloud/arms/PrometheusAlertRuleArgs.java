// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms;

import com.pulumi.alicloud.arms.inputs.PrometheusAlertRuleAnnotationArgs;
import com.pulumi.alicloud.arms.inputs.PrometheusAlertRuleLabelArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrometheusAlertRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrometheusAlertRuleArgs Empty = new PrometheusAlertRuleArgs();

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
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The ID of the cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
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
    @Import(name="duration", required=true)
    private Output<String> duration;

    /**
     * @return The duration of the alert.
     * 
     */
    public Output<String> duration() {
        return this.duration;
    }

    /**
     * The alert rule expression that follows the PromQL syntax.
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return The alert rule expression that follows the PromQL syntax.
     * 
     */
    public Output<String> expression() {
        return this.expression;
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
    @Import(name="message", required=true)
    private Output<String> message;

    /**
     * @return The message of the alert notification.
     * 
     */
    public Output<String> message() {
        return this.message;
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
     * The name of the resource.
     * 
     */
    @Import(name="prometheusAlertRuleName", required=true)
    private Output<String> prometheusAlertRuleName;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> prometheusAlertRuleName() {
        return this.prometheusAlertRuleName;
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

    private PrometheusAlertRuleArgs() {}

    private PrometheusAlertRuleArgs(PrometheusAlertRuleArgs $) {
        this.annotations = $.annotations;
        this.clusterId = $.clusterId;
        this.dispatchRuleId = $.dispatchRuleId;
        this.duration = $.duration;
        this.expression = $.expression;
        this.labels = $.labels;
        this.message = $.message;
        this.notifyType = $.notifyType;
        this.prometheusAlertRuleName = $.prometheusAlertRuleName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrometheusAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrometheusAlertRuleArgs $;

        public Builder() {
            $ = new PrometheusAlertRuleArgs();
        }

        public Builder(PrometheusAlertRuleArgs defaults) {
            $ = new PrometheusAlertRuleArgs(Objects.requireNonNull(defaults));
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
        public Builder clusterId(Output<String> clusterId) {
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
        public Builder duration(Output<String> duration) {
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
        public Builder expression(Output<String> expression) {
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
        public Builder message(Output<String> message) {
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
         * @param prometheusAlertRuleName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder prometheusAlertRuleName(Output<String> prometheusAlertRuleName) {
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

        public PrometheusAlertRuleArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            $.prometheusAlertRuleName = Objects.requireNonNull($.prometheusAlertRuleName, "expected parameter 'prometheusAlertRuleName' to be non-null");
            return $;
        }
    }

}
