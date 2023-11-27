// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHybridMonitorDatasDataLabel {
    /**
     * @return Label key.
     * 
     */
    private String key;
    /**
     * @return Label value.
     * 
     */
    private String value;

    private GetHybridMonitorDatasDataLabel() {}
    /**
     * @return Label key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Label value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridMonitorDatasDataLabel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String value;
        public Builder() {}
        public Builder(GetHybridMonitorDatasDataLabel defaults) {
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
        public GetHybridMonitorDatasDataLabel build() {
            final var _resultValue = new GetHybridMonitorDatasDataLabel();
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
