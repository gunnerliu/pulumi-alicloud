// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicecatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProvisionedProductOutput {
    /**
     * @return Description of the output value defined in the template.
     * 
     */
    private @Nullable String description;
    /**
     * @return The name of the output value defined in the template.
     * 
     */
    private @Nullable String outputKey;
    /**
     * @return The content of the output value defined in the template.
     * 
     */
    private @Nullable String outputValue;

    private ProvisionedProductOutput() {}
    /**
     * @return Description of the output value defined in the template.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The name of the output value defined in the template.
     * 
     */
    public Optional<String> outputKey() {
        return Optional.ofNullable(this.outputKey);
    }
    /**
     * @return The content of the output value defined in the template.
     * 
     */
    public Optional<String> outputValue() {
        return Optional.ofNullable(this.outputValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisionedProductOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable String outputKey;
        private @Nullable String outputValue;
        public Builder() {}
        public Builder(ProvisionedProductOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.outputKey = defaults.outputKey;
    	      this.outputValue = defaults.outputValue;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder outputKey(@Nullable String outputKey) {
            this.outputKey = outputKey;
            return this;
        }
        @CustomType.Setter
        public Builder outputValue(@Nullable String outputValue) {
            this.outputValue = outputValue;
            return this;
        }
        public ProvisionedProductOutput build() {
            final var _resultValue = new ProvisionedProductOutput();
            _resultValue.description = description;
            _resultValue.outputKey = outputKey;
            _resultValue.outputValue = outputValue;
            return _resultValue;
        }
    }
}
