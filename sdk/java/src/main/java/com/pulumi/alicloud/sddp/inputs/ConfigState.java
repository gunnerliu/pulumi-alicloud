// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sddp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigState extends com.pulumi.resources.ResourceArgs {

    public static final ConfigState Empty = new ConfigState();

    /**
     * Abnormal Alarm General Configuration Module by Using the Encoding. Valid values: `access_failed_cnt`, `access_permission_exprie_max_days`, `log_datasize_avg_days`.
     * 
     */
    @Import(name="code")
    private @Nullable Output<String> code;

    /**
     * @return Abnormal Alarm General Configuration Module by Using the Encoding. Valid values: `access_failed_cnt`, `access_permission_exprie_max_days`, `log_datasize_avg_days`.
     * 
     */
    public Optional<Output<String>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * Abnormal Alarm General Description of the Configuration Item.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Abnormal Alarm General Description of the Configuration Item.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The language of the request and response. Valid values: `zh`,`en`.
     * * `zh`: Chinese.
     * * `en`: English.
     * 
     */
    @Import(name="lang")
    private @Nullable Output<String> lang;

    /**
     * @return The language of the request and response. Valid values: `zh`,`en`.
     * * `zh`: Chinese.
     * * `en`: English.
     * 
     */
    public Optional<Output<String>> lang() {
        return Optional.ofNullable(this.lang);
    }

    /**
     * The Specified Exception Alarm Generic by Using the Value. Code Different Values for This Parameter the Specific Meaning of Different:
     * * `access_failed_cnt`: Value Represents the Non-Authorized Resource Repeatedly Attempts to Access the Threshold.
     * * `access_permission_exprie_max_days`: Value Represents the Permissions during Periods of Inactivity Exceeding a Threshold.
     * * `log_datasize_avg_days`: Value Represents the Date Certain Log Output Is Less than 10 Days before the Average Value of the Threshold.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The Specified Exception Alarm Generic by Using the Value. Code Different Values for This Parameter the Specific Meaning of Different:
     * * `access_failed_cnt`: Value Represents the Non-Authorized Resource Repeatedly Attempts to Access the Threshold.
     * * `access_permission_exprie_max_days`: Value Represents the Permissions during Periods of Inactivity Exceeding a Threshold.
     * * `log_datasize_avg_days`: Value Represents the Date Certain Log Output Is Less than 10 Days before the Average Value of the Threshold.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ConfigState() {}

    private ConfigState(ConfigState $) {
        this.code = $.code;
        this.description = $.description;
        this.lang = $.lang;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigState $;

        public Builder() {
            $ = new ConfigState();
        }

        public Builder(ConfigState defaults) {
            $ = new ConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param code Abnormal Alarm General Configuration Module by Using the Encoding. Valid values: `access_failed_cnt`, `access_permission_exprie_max_days`, `log_datasize_avg_days`.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<String> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code Abnormal Alarm General Configuration Module by Using the Encoding. Valid values: `access_failed_cnt`, `access_permission_exprie_max_days`, `log_datasize_avg_days`.
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            return code(Output.of(code));
        }

        /**
         * @param description Abnormal Alarm General Description of the Configuration Item.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Abnormal Alarm General Description of the Configuration Item.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param lang The language of the request and response. Valid values: `zh`,`en`.
         * * `zh`: Chinese.
         * * `en`: English.
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable Output<String> lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param lang The language of the request and response. Valid values: `zh`,`en`.
         * * `zh`: Chinese.
         * * `en`: English.
         * 
         * @return builder
         * 
         */
        public Builder lang(String lang) {
            return lang(Output.of(lang));
        }

        /**
         * @param value The Specified Exception Alarm Generic by Using the Value. Code Different Values for This Parameter the Specific Meaning of Different:
         * * `access_failed_cnt`: Value Represents the Non-Authorized Resource Repeatedly Attempts to Access the Threshold.
         * * `access_permission_exprie_max_days`: Value Represents the Permissions during Periods of Inactivity Exceeding a Threshold.
         * * `log_datasize_avg_days`: Value Represents the Date Certain Log Output Is Less than 10 Days before the Average Value of the Threshold.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The Specified Exception Alarm Generic by Using the Value. Code Different Values for This Parameter the Specific Meaning of Different:
         * * `access_failed_cnt`: Value Represents the Non-Authorized Resource Repeatedly Attempts to Access the Threshold.
         * * `access_permission_exprie_max_days`: Value Represents the Permissions during Periods of Inactivity Exceeding a Threshold.
         * * `log_datasize_avg_days`: Value Represents the Date Certain Log Output Is Less than 10 Days before the Average Value of the Threshold.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ConfigState build() {
            return $;
        }
    }

}
