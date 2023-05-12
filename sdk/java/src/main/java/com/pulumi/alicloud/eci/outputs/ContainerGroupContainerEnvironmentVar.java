// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerGroupContainerEnvironmentVar {
    /**
     * @return The name of the variable. The name can be 1 to 128 characters in length and can contain letters, digits, and underscores (_). It cannot start with a digit.
     * 
     */
    private final @Nullable String key;
    /**
     * @return The value of the variable. The value can be 0 to 256 characters in length.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private ContainerGroupContainerEnvironmentVar(
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("value") @Nullable String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @return The name of the variable. The name can be 1 to 128 characters in length and can contain letters, digits, and underscores (_). It cannot start with a digit.
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

    public static Builder builder(ContainerGroupContainerEnvironmentVar defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerGroupContainerEnvironmentVar defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public ContainerGroupContainerEnvironmentVar build() {
            return new ContainerGroupContainerEnvironmentVar(key, value);
        }
    }
}
