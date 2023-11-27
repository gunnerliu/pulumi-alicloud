// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrometheusAlertRuleLabel {
    /**
     * @return The name of the label.
     * 
     */
    private @Nullable String name;
    /**
     * @return The value of the label.
     * 
     */
    private @Nullable String value;

    private PrometheusAlertRuleLabel() {}
    /**
     * @return The name of the label.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The value of the label.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrometheusAlertRuleLabel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;
        public Builder() {}
        public Builder(PrometheusAlertRuleLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public PrometheusAlertRuleLabel build() {
            final var _resultValue = new PrometheusAlertRuleLabel();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
