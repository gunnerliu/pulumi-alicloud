// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertPolicyConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertPolicyConfigurationArgs Empty = new AlertPolicyConfigurationArgs();

    /**
     * Action Policy Id.
     * 
     */
    @Import(name="actionPolicyId")
    private @Nullable Output<String> actionPolicyId;

    /**
     * @return Action Policy Id.
     * 
     */
    public Optional<Output<String>> actionPolicyId() {
        return Optional.ofNullable(this.actionPolicyId);
    }

    /**
     * Alert Policy Id.
     * 
     */
    @Import(name="alertPolicyId", required=true)
    private Output<String> alertPolicyId;

    /**
     * @return Alert Policy Id.
     * 
     */
    public Output<String> alertPolicyId() {
        return this.alertPolicyId;
    }

    /**
     * Repeat interval used by alert policy, 1h, 1m.e.g.
     * 
     */
    @Import(name="repeatInterval", required=true)
    private Output<String> repeatInterval;

    /**
     * @return Repeat interval used by alert policy, 1h, 1m.e.g.
     * 
     */
    public Output<String> repeatInterval() {
        return this.repeatInterval;
    }

    private AlertPolicyConfigurationArgs() {}

    private AlertPolicyConfigurationArgs(AlertPolicyConfigurationArgs $) {
        this.actionPolicyId = $.actionPolicyId;
        this.alertPolicyId = $.alertPolicyId;
        this.repeatInterval = $.repeatInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertPolicyConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertPolicyConfigurationArgs $;

        public Builder() {
            $ = new AlertPolicyConfigurationArgs();
        }

        public Builder(AlertPolicyConfigurationArgs defaults) {
            $ = new AlertPolicyConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionPolicyId Action Policy Id.
         * 
         * @return builder
         * 
         */
        public Builder actionPolicyId(@Nullable Output<String> actionPolicyId) {
            $.actionPolicyId = actionPolicyId;
            return this;
        }

        /**
         * @param actionPolicyId Action Policy Id.
         * 
         * @return builder
         * 
         */
        public Builder actionPolicyId(String actionPolicyId) {
            return actionPolicyId(Output.of(actionPolicyId));
        }

        /**
         * @param alertPolicyId Alert Policy Id.
         * 
         * @return builder
         * 
         */
        public Builder alertPolicyId(Output<String> alertPolicyId) {
            $.alertPolicyId = alertPolicyId;
            return this;
        }

        /**
         * @param alertPolicyId Alert Policy Id.
         * 
         * @return builder
         * 
         */
        public Builder alertPolicyId(String alertPolicyId) {
            return alertPolicyId(Output.of(alertPolicyId));
        }

        /**
         * @param repeatInterval Repeat interval used by alert policy, 1h, 1m.e.g.
         * 
         * @return builder
         * 
         */
        public Builder repeatInterval(Output<String> repeatInterval) {
            $.repeatInterval = repeatInterval;
            return this;
        }

        /**
         * @param repeatInterval Repeat interval used by alert policy, 1h, 1m.e.g.
         * 
         * @return builder
         * 
         */
        public Builder repeatInterval(String repeatInterval) {
            return repeatInterval(Output.of(repeatInterval));
        }

        public AlertPolicyConfigurationArgs build() {
            $.alertPolicyId = Objects.requireNonNull($.alertPolicyId, "expected parameter 'alertPolicyId' to be non-null");
            $.repeatInterval = Objects.requireNonNull($.repeatInterval, "expected parameter 'repeatInterval' to be non-null");
            return $;
        }
    }

}
