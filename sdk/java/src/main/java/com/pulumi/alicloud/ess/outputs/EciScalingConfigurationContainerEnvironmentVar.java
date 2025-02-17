// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EciScalingConfigurationContainerEnvironmentVar {
    /**
     * @return Environment variable value reference. Optional values:
     * - status.podIP: IP of pod.
     * 
     */
    private @Nullable String fieldRefFieldPath;
    /**
     * @return The name of the variable. The name can be 1 to 128 characters in length and can contain letters,
     * digits, and underscores (_). It cannot start with a digit.
     * 
     */
    private @Nullable String key;
    /**
     * @return The value of the variable. The value can be 0 to 256 characters in length.
     * 
     */
    private @Nullable String value;

    private EciScalingConfigurationContainerEnvironmentVar() {}
    /**
     * @return Environment variable value reference. Optional values:
     * - status.podIP: IP of pod.
     * 
     */
    public Optional<String> fieldRefFieldPath() {
        return Optional.ofNullable(this.fieldRefFieldPath);
    }
    /**
     * @return The name of the variable. The name can be 1 to 128 characters in length and can contain letters,
     * digits, and underscores (_). It cannot start with a digit.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return The value of the variable. The value can be 0 to 256 characters in length.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EciScalingConfigurationContainerEnvironmentVar defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fieldRefFieldPath;
        private @Nullable String key;
        private @Nullable String value;
        public Builder() {}
        public Builder(EciScalingConfigurationContainerEnvironmentVar defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldRefFieldPath = defaults.fieldRefFieldPath;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder fieldRefFieldPath(@Nullable String fieldRefFieldPath) {

            this.fieldRefFieldPath = fieldRefFieldPath;
            return this;
        }
        @CustomType.Setter
        public Builder key(@Nullable String key) {

            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public EciScalingConfigurationContainerEnvironmentVar build() {
            final var _resultValue = new EciScalingConfigurationContainerEnvironmentVar();
            _resultValue.fieldRefFieldPath = fieldRefFieldPath;
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
