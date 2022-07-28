// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.alicloud.cms.inputs.MetricRuleTemplateAlertTemplateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricRuleTemplateState extends com.pulumi.resources.ResourceArgs {

    public static final MetricRuleTemplateState Empty = new MetricRuleTemplateState();

    /**
     * The details of alert rules that are generated based on the alert template. See the following `Block alert_templates`.
     * 
     */
    @Import(name="alertTemplates")
    private @Nullable Output<List<MetricRuleTemplateAlertTemplateArgs>> alertTemplates;

    /**
     * @return The details of alert rules that are generated based on the alert template. See the following `Block alert_templates`.
     * 
     */
    public Optional<Output<List<MetricRuleTemplateAlertTemplateArgs>>> alertTemplates() {
        return Optional.ofNullable(this.alertTemplates);
    }

    /**
     * The mode in which the alert template is applied. Valid values:`GROUP_INSTANCE_FIRST`or `ALARM_TEMPLATE_FIRST`. GROUP_INSTANCE_FIRST: The metrics in the application group take precedence. If a metric specified in the alert template does not exist in the application group, the system does not generate an alert rule for the metric based on the alert template. ALARM_TEMPLATE_FIRST: The metrics specified in the alert template take precedence. If a metric specified in the alert template does not exist in the application group, the system still generates an alert rule for the metric based on the alert template.
     * 
     */
    @Import(name="applyMode")
    private @Nullable Output<String> applyMode;

    /**
     * @return The mode in which the alert template is applied. Valid values:`GROUP_INSTANCE_FIRST`or `ALARM_TEMPLATE_FIRST`. GROUP_INSTANCE_FIRST: The metrics in the application group take precedence. If a metric specified in the alert template does not exist in the application group, the system does not generate an alert rule for the metric based on the alert template. ALARM_TEMPLATE_FIRST: The metrics specified in the alert template take precedence. If a metric specified in the alert template does not exist in the application group, the system still generates an alert rule for the metric based on the alert template.
     * 
     */
    public Optional<Output<String>> applyMode() {
        return Optional.ofNullable(this.applyMode);
    }

    /**
     * The description of the alert template.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the alert template.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The end of the time period during which the alert rule is effective. Valid values: 00 to 23. The value 00 indicates 00:59 and the value 23 indicates 23:59.
     * 
     */
    @Import(name="enableEndTime")
    private @Nullable Output<String> enableEndTime;

    /**
     * @return The end of the time period during which the alert rule is effective. Valid values: 00 to 23. The value 00 indicates 00:59 and the value 23 indicates 23:59.
     * 
     */
    public Optional<Output<String>> enableEndTime() {
        return Optional.ofNullable(this.enableEndTime);
    }

    /**
     * The beginning of the time period during which the alert rule is effective. Valid values: 00 to 23. The value 00 indicates 00:00 and the value 23 indicates 23:00.
     * 
     */
    @Import(name="enableStartTime")
    private @Nullable Output<String> enableStartTime;

    /**
     * @return The beginning of the time period during which the alert rule is effective. Valid values: 00 to 23. The value 00 indicates 00:00 and the value 23 indicates 23:00.
     * 
     */
    public Optional<Output<String>> enableStartTime() {
        return Optional.ofNullable(this.enableStartTime);
    }

    /**
     * The ID of the application group.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The ID of the application group.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The name of the alert template.
     * 
     */
    @Import(name="metricRuleTemplateName")
    private @Nullable Output<String> metricRuleTemplateName;

    /**
     * @return The name of the alert template.
     * 
     */
    public Optional<Output<String>> metricRuleTemplateName() {
        return Optional.ofNullable(this.metricRuleTemplateName);
    }

    /**
     * The alert notification method. Valid values:Set the value to 4. The value 4 indicates that alert notifications are sent by using TradeManager and DingTalk chatbots.
     * 
     */
    @Import(name="notifyLevel")
    private @Nullable Output<String> notifyLevel;

    /**
     * @return The alert notification method. Valid values:Set the value to 4. The value 4 indicates that alert notifications are sent by using TradeManager and DingTalk chatbots.
     * 
     */
    public Optional<Output<String>> notifyLevel() {
        return Optional.ofNullable(this.notifyLevel);
    }

    /**
     * The version of the alert template to be modified.
     * 
     */
    @Import(name="restVersion")
    private @Nullable Output<String> restVersion;

    /**
     * @return The version of the alert template to be modified.
     * 
     */
    public Optional<Output<String>> restVersion() {
        return Optional.ofNullable(this.restVersion);
    }

    /**
     * The mute period during which notifications are not repeatedly sent for an alert.Valid values: 0 to 86400. Unit: seconds. Default value: `86400`.
     * 
     */
    @Import(name="silenceTime")
    private @Nullable Output<Integer> silenceTime;

    /**
     * @return The mute period during which notifications are not repeatedly sent for an alert.Valid values: 0 to 86400. Unit: seconds. Default value: `86400`.
     * 
     */
    public Optional<Output<Integer>> silenceTime() {
        return Optional.ofNullable(this.silenceTime);
    }

    /**
     * The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
     * 
     */
    @Import(name="webhook")
    private @Nullable Output<String> webhook;

    /**
     * @return The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
     * 
     */
    public Optional<Output<String>> webhook() {
        return Optional.ofNullable(this.webhook);
    }

    private MetricRuleTemplateState() {}

    private MetricRuleTemplateState(MetricRuleTemplateState $) {
        this.alertTemplates = $.alertTemplates;
        this.applyMode = $.applyMode;
        this.description = $.description;
        this.enableEndTime = $.enableEndTime;
        this.enableStartTime = $.enableStartTime;
        this.groupId = $.groupId;
        this.metricRuleTemplateName = $.metricRuleTemplateName;
        this.notifyLevel = $.notifyLevel;
        this.restVersion = $.restVersion;
        this.silenceTime = $.silenceTime;
        this.webhook = $.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricRuleTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricRuleTemplateState $;

        public Builder() {
            $ = new MetricRuleTemplateState();
        }

        public Builder(MetricRuleTemplateState defaults) {
            $ = new MetricRuleTemplateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertTemplates The details of alert rules that are generated based on the alert template. See the following `Block alert_templates`.
         * 
         * @return builder
         * 
         */
        public Builder alertTemplates(@Nullable Output<List<MetricRuleTemplateAlertTemplateArgs>> alertTemplates) {
            $.alertTemplates = alertTemplates;
            return this;
        }

        /**
         * @param alertTemplates The details of alert rules that are generated based on the alert template. See the following `Block alert_templates`.
         * 
         * @return builder
         * 
         */
        public Builder alertTemplates(List<MetricRuleTemplateAlertTemplateArgs> alertTemplates) {
            return alertTemplates(Output.of(alertTemplates));
        }

        /**
         * @param alertTemplates The details of alert rules that are generated based on the alert template. See the following `Block alert_templates`.
         * 
         * @return builder
         * 
         */
        public Builder alertTemplates(MetricRuleTemplateAlertTemplateArgs... alertTemplates) {
            return alertTemplates(List.of(alertTemplates));
        }

        /**
         * @param applyMode The mode in which the alert template is applied. Valid values:`GROUP_INSTANCE_FIRST`or `ALARM_TEMPLATE_FIRST`. GROUP_INSTANCE_FIRST: The metrics in the application group take precedence. If a metric specified in the alert template does not exist in the application group, the system does not generate an alert rule for the metric based on the alert template. ALARM_TEMPLATE_FIRST: The metrics specified in the alert template take precedence. If a metric specified in the alert template does not exist in the application group, the system still generates an alert rule for the metric based on the alert template.
         * 
         * @return builder
         * 
         */
        public Builder applyMode(@Nullable Output<String> applyMode) {
            $.applyMode = applyMode;
            return this;
        }

        /**
         * @param applyMode The mode in which the alert template is applied. Valid values:`GROUP_INSTANCE_FIRST`or `ALARM_TEMPLATE_FIRST`. GROUP_INSTANCE_FIRST: The metrics in the application group take precedence. If a metric specified in the alert template does not exist in the application group, the system does not generate an alert rule for the metric based on the alert template. ALARM_TEMPLATE_FIRST: The metrics specified in the alert template take precedence. If a metric specified in the alert template does not exist in the application group, the system still generates an alert rule for the metric based on the alert template.
         * 
         * @return builder
         * 
         */
        public Builder applyMode(String applyMode) {
            return applyMode(Output.of(applyMode));
        }

        /**
         * @param description The description of the alert template.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the alert template.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enableEndTime The end of the time period during which the alert rule is effective. Valid values: 00 to 23. The value 00 indicates 00:59 and the value 23 indicates 23:59.
         * 
         * @return builder
         * 
         */
        public Builder enableEndTime(@Nullable Output<String> enableEndTime) {
            $.enableEndTime = enableEndTime;
            return this;
        }

        /**
         * @param enableEndTime The end of the time period during which the alert rule is effective. Valid values: 00 to 23. The value 00 indicates 00:59 and the value 23 indicates 23:59.
         * 
         * @return builder
         * 
         */
        public Builder enableEndTime(String enableEndTime) {
            return enableEndTime(Output.of(enableEndTime));
        }

        /**
         * @param enableStartTime The beginning of the time period during which the alert rule is effective. Valid values: 00 to 23. The value 00 indicates 00:00 and the value 23 indicates 23:00.
         * 
         * @return builder
         * 
         */
        public Builder enableStartTime(@Nullable Output<String> enableStartTime) {
            $.enableStartTime = enableStartTime;
            return this;
        }

        /**
         * @param enableStartTime The beginning of the time period during which the alert rule is effective. Valid values: 00 to 23. The value 00 indicates 00:00 and the value 23 indicates 23:00.
         * 
         * @return builder
         * 
         */
        public Builder enableStartTime(String enableStartTime) {
            return enableStartTime(Output.of(enableStartTime));
        }

        /**
         * @param groupId The ID of the application group.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The ID of the application group.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param metricRuleTemplateName The name of the alert template.
         * 
         * @return builder
         * 
         */
        public Builder metricRuleTemplateName(@Nullable Output<String> metricRuleTemplateName) {
            $.metricRuleTemplateName = metricRuleTemplateName;
            return this;
        }

        /**
         * @param metricRuleTemplateName The name of the alert template.
         * 
         * @return builder
         * 
         */
        public Builder metricRuleTemplateName(String metricRuleTemplateName) {
            return metricRuleTemplateName(Output.of(metricRuleTemplateName));
        }

        /**
         * @param notifyLevel The alert notification method. Valid values:Set the value to 4. The value 4 indicates that alert notifications are sent by using TradeManager and DingTalk chatbots.
         * 
         * @return builder
         * 
         */
        public Builder notifyLevel(@Nullable Output<String> notifyLevel) {
            $.notifyLevel = notifyLevel;
            return this;
        }

        /**
         * @param notifyLevel The alert notification method. Valid values:Set the value to 4. The value 4 indicates that alert notifications are sent by using TradeManager and DingTalk chatbots.
         * 
         * @return builder
         * 
         */
        public Builder notifyLevel(String notifyLevel) {
            return notifyLevel(Output.of(notifyLevel));
        }

        /**
         * @param restVersion The version of the alert template to be modified.
         * 
         * @return builder
         * 
         */
        public Builder restVersion(@Nullable Output<String> restVersion) {
            $.restVersion = restVersion;
            return this;
        }

        /**
         * @param restVersion The version of the alert template to be modified.
         * 
         * @return builder
         * 
         */
        public Builder restVersion(String restVersion) {
            return restVersion(Output.of(restVersion));
        }

        /**
         * @param silenceTime The mute period during which notifications are not repeatedly sent for an alert.Valid values: 0 to 86400. Unit: seconds. Default value: `86400`.
         * 
         * @return builder
         * 
         */
        public Builder silenceTime(@Nullable Output<Integer> silenceTime) {
            $.silenceTime = silenceTime;
            return this;
        }

        /**
         * @param silenceTime The mute period during which notifications are not repeatedly sent for an alert.Valid values: 0 to 86400. Unit: seconds. Default value: `86400`.
         * 
         * @return builder
         * 
         */
        public Builder silenceTime(Integer silenceTime) {
            return silenceTime(Output.of(silenceTime));
        }

        /**
         * @param webhook The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
         * 
         * @return builder
         * 
         */
        public Builder webhook(@Nullable Output<String> webhook) {
            $.webhook = webhook;
            return this;
        }

        /**
         * @param webhook The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
         * 
         * @return builder
         * 
         */
        public Builder webhook(String webhook) {
            return webhook(Output.of(webhook));
        }

        public MetricRuleTemplateState build() {
            return $;
        }
    }

}
