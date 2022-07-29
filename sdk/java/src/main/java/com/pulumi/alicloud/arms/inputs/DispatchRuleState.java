// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.inputs;

import com.pulumi.alicloud.arms.inputs.DispatchRuleGroupRuleArgs;
import com.pulumi.alicloud.arms.inputs.DispatchRuleLabelMatchExpressionGridArgs;
import com.pulumi.alicloud.arms.inputs.DispatchRuleNotifyRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DispatchRuleState extends com.pulumi.resources.ResourceArgs {

    public static final DispatchRuleState Empty = new DispatchRuleState();

    /**
     * The name of the dispatch policy.
     * 
     */
    @Import(name="dispatchRuleName")
    private @Nullable Output<String> dispatchRuleName;

    /**
     * @return The name of the dispatch policy.
     * 
     */
    public Optional<Output<String>> dispatchRuleName() {
        return Optional.ofNullable(this.dispatchRuleName);
    }

    /**
     * The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
     * 
     */
    @Import(name="dispatchType")
    private @Nullable Output<String> dispatchType;

    /**
     * @return The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
     * 
     */
    public Optional<Output<String>> dispatchType() {
        return Optional.ofNullable(this.dispatchType);
    }

    /**
     * Sets the event group. See the following `Block group_rules`. It will be ignored  when `dispatch_type = &#34;DISCARD_ALERT&#34;`.
     * 
     */
    @Import(name="groupRules")
    private @Nullable Output<List<DispatchRuleGroupRuleArgs>> groupRules;

    /**
     * @return Sets the event group. See the following `Block group_rules`. It will be ignored  when `dispatch_type = &#34;DISCARD_ALERT&#34;`.
     * 
     */
    public Optional<Output<List<DispatchRuleGroupRuleArgs>>> groupRules() {
        return Optional.ofNullable(this.groupRules);
    }

    /**
     * Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
     * 
     */
    @Import(name="isRecover")
    private @Nullable Output<Boolean> isRecover;

    /**
     * @return Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
     * 
     */
    public Optional<Output<Boolean>> isRecover() {
        return Optional.ofNullable(this.isRecover);
    }

    /**
     * Sets the dispatch rule. See the following `Block label_match_expression_grid`.
     * 
     */
    @Import(name="labelMatchExpressionGrids")
    private @Nullable Output<List<DispatchRuleLabelMatchExpressionGridArgs>> labelMatchExpressionGrids;

    /**
     * @return Sets the dispatch rule. See the following `Block label_match_expression_grid`.
     * 
     */
    public Optional<Output<List<DispatchRuleLabelMatchExpressionGridArgs>>> labelMatchExpressionGrids() {
        return Optional.ofNullable(this.labelMatchExpressionGrids);
    }

    /**
     * Sets the notification rule. See the following `Block notify_rules`. It will be ignored  when `dispatch_type = &#34;DISCARD_ALERT&#34;`.
     * 
     */
    @Import(name="notifyRules")
    private @Nullable Output<List<DispatchRuleNotifyRuleArgs>> notifyRules;

    /**
     * @return Sets the notification rule. See the following `Block notify_rules`. It will be ignored  when `dispatch_type = &#34;DISCARD_ALERT&#34;`.
     * 
     */
    public Optional<Output<List<DispatchRuleNotifyRuleArgs>>> notifyRules() {
        return Optional.ofNullable(this.notifyRules);
    }

    /**
     * The resource status of Alert Dispatch Rule.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The resource status of Alert Dispatch Rule.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private DispatchRuleState() {}

    private DispatchRuleState(DispatchRuleState $) {
        this.dispatchRuleName = $.dispatchRuleName;
        this.dispatchType = $.dispatchType;
        this.groupRules = $.groupRules;
        this.isRecover = $.isRecover;
        this.labelMatchExpressionGrids = $.labelMatchExpressionGrids;
        this.notifyRules = $.notifyRules;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DispatchRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DispatchRuleState $;

        public Builder() {
            $ = new DispatchRuleState();
        }

        public Builder(DispatchRuleState defaults) {
            $ = new DispatchRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dispatchRuleName The name of the dispatch policy.
         * 
         * @return builder
         * 
         */
        public Builder dispatchRuleName(@Nullable Output<String> dispatchRuleName) {
            $.dispatchRuleName = dispatchRuleName;
            return this;
        }

        /**
         * @param dispatchRuleName The name of the dispatch policy.
         * 
         * @return builder
         * 
         */
        public Builder dispatchRuleName(String dispatchRuleName) {
            return dispatchRuleName(Output.of(dispatchRuleName));
        }

        /**
         * @param dispatchType The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
         * 
         * @return builder
         * 
         */
        public Builder dispatchType(@Nullable Output<String> dispatchType) {
            $.dispatchType = dispatchType;
            return this;
        }

        /**
         * @param dispatchType The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
         * 
         * @return builder
         * 
         */
        public Builder dispatchType(String dispatchType) {
            return dispatchType(Output.of(dispatchType));
        }

        /**
         * @param groupRules Sets the event group. See the following `Block group_rules`. It will be ignored  when `dispatch_type = &#34;DISCARD_ALERT&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder groupRules(@Nullable Output<List<DispatchRuleGroupRuleArgs>> groupRules) {
            $.groupRules = groupRules;
            return this;
        }

        /**
         * @param groupRules Sets the event group. See the following `Block group_rules`. It will be ignored  when `dispatch_type = &#34;DISCARD_ALERT&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder groupRules(List<DispatchRuleGroupRuleArgs> groupRules) {
            return groupRules(Output.of(groupRules));
        }

        /**
         * @param groupRules Sets the event group. See the following `Block group_rules`. It will be ignored  when `dispatch_type = &#34;DISCARD_ALERT&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder groupRules(DispatchRuleGroupRuleArgs... groupRules) {
            return groupRules(List.of(groupRules));
        }

        /**
         * @param isRecover Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
         * 
         * @return builder
         * 
         */
        public Builder isRecover(@Nullable Output<Boolean> isRecover) {
            $.isRecover = isRecover;
            return this;
        }

        /**
         * @param isRecover Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
         * 
         * @return builder
         * 
         */
        public Builder isRecover(Boolean isRecover) {
            return isRecover(Output.of(isRecover));
        }

        /**
         * @param labelMatchExpressionGrids Sets the dispatch rule. See the following `Block label_match_expression_grid`.
         * 
         * @return builder
         * 
         */
        public Builder labelMatchExpressionGrids(@Nullable Output<List<DispatchRuleLabelMatchExpressionGridArgs>> labelMatchExpressionGrids) {
            $.labelMatchExpressionGrids = labelMatchExpressionGrids;
            return this;
        }

        /**
         * @param labelMatchExpressionGrids Sets the dispatch rule. See the following `Block label_match_expression_grid`.
         * 
         * @return builder
         * 
         */
        public Builder labelMatchExpressionGrids(List<DispatchRuleLabelMatchExpressionGridArgs> labelMatchExpressionGrids) {
            return labelMatchExpressionGrids(Output.of(labelMatchExpressionGrids));
        }

        /**
         * @param labelMatchExpressionGrids Sets the dispatch rule. See the following `Block label_match_expression_grid`.
         * 
         * @return builder
         * 
         */
        public Builder labelMatchExpressionGrids(DispatchRuleLabelMatchExpressionGridArgs... labelMatchExpressionGrids) {
            return labelMatchExpressionGrids(List.of(labelMatchExpressionGrids));
        }

        /**
         * @param notifyRules Sets the notification rule. See the following `Block notify_rules`. It will be ignored  when `dispatch_type = &#34;DISCARD_ALERT&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder notifyRules(@Nullable Output<List<DispatchRuleNotifyRuleArgs>> notifyRules) {
            $.notifyRules = notifyRules;
            return this;
        }

        /**
         * @param notifyRules Sets the notification rule. See the following `Block notify_rules`. It will be ignored  when `dispatch_type = &#34;DISCARD_ALERT&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder notifyRules(List<DispatchRuleNotifyRuleArgs> notifyRules) {
            return notifyRules(Output.of(notifyRules));
        }

        /**
         * @param notifyRules Sets the notification rule. See the following `Block notify_rules`. It will be ignored  when `dispatch_type = &#34;DISCARD_ALERT&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder notifyRules(DispatchRuleNotifyRuleArgs... notifyRules) {
            return notifyRules(List.of(notifyRules));
        }

        /**
         * @param status The resource status of Alert Dispatch Rule.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The resource status of Alert Dispatch Rule.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public DispatchRuleState build() {
            return $;
        }
    }

}
