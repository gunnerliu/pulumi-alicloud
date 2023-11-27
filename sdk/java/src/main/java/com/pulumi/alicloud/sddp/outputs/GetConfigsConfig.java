// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sddp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConfigsConfig {
    /**
     * @return Abnormal Alarm General Configuration Module by Using the Encoding.Valid values: `access_failed_cnt`, `access_permission_exprie_max_days`, `log_datasize_avg_days`.
     * 
     */
    private String code;
    /**
     * @return Configure the Number.
     * 
     */
    private String configId;
    /**
     * @return Default Value.
     * 
     */
    private String defaultValue;
    /**
     * @return Abnormal Alarm General Description of the Configuration Item.
     * 
     */
    private String description;
    /**
     * @return The ID of the Config.
     * 
     */
    private String id;
    /**
     * @return The Specified Exception Alarm Generic by Using the Value. Code Different Values for This Parameter the Specific Meaning of Different.
     * 
     */
    private String value;

    private GetConfigsConfig() {}
    /**
     * @return Abnormal Alarm General Configuration Module by Using the Encoding.Valid values: `access_failed_cnt`, `access_permission_exprie_max_days`, `log_datasize_avg_days`.
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return Configure the Number.
     * 
     */
    public String configId() {
        return this.configId;
    }
    /**
     * @return Default Value.
     * 
     */
    public String defaultValue() {
        return this.defaultValue;
    }
    /**
     * @return Abnormal Alarm General Description of the Configuration Item.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Config.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Specified Exception Alarm Generic by Using the Value. Code Different Values for This Parameter the Specific Meaning of Different.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String code;
        private String configId;
        private String defaultValue;
        private String description;
        private String id;
        private String value;
        public Builder() {}
        public Builder(GetConfigsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.configId = defaults.configId;
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        @CustomType.Setter
        public Builder configId(String configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
        }
        @CustomType.Setter
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetConfigsConfig build() {
            final var _resultValue = new GetConfigsConfig();
            _resultValue.code = code;
            _resultValue.configId = configId;
            _resultValue.defaultValue = defaultValue;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
