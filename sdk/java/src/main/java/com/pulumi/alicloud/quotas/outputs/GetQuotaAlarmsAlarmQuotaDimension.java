// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.quotas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetQuotaAlarmsAlarmQuotaDimension {
    /**
     * @return The key of quota_dimensions.
     * 
     */
    private String key;
    /**
     * @return The value of quota_dimensions.
     * 
     */
    private String value;

    private GetQuotaAlarmsAlarmQuotaDimension() {}
    /**
     * @return The key of quota_dimensions.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The value of quota_dimensions.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQuotaAlarmsAlarmQuotaDimension defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String value;
        public Builder() {}
        public Builder(GetQuotaAlarmsAlarmQuotaDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetQuotaAlarmsAlarmQuotaDimension build() {
            final var _resultValue = new GetQuotaAlarmsAlarmQuotaDimension();
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
