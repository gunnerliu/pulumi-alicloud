// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AlertAnnotation {
    /**
     * @return Annotations&#39;s key for new alert.
     * 
     */
    private final String key;
    /**
     * @return Annotations&#39;s value for new alert.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private AlertAnnotation(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @return Annotations&#39;s key for new alert.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Annotations&#39;s value for new alert.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertAnnotation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertAnnotation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public AlertAnnotation build() {
            return new AlertAnnotation(key, value);
        }
    }
}
