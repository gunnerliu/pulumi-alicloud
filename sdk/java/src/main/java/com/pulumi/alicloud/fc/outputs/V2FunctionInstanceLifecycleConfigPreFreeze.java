// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V2FunctionInstanceLifecycleConfigPreFreeze {
    /**
     * @return entry point of function.
     * 
     */
    private @Nullable String handler;
    /**
     * @return max running time of function.
     * 
     */
    private @Nullable Integer timeout;

    private V2FunctionInstanceLifecycleConfigPreFreeze() {}
    /**
     * @return entry point of function.
     * 
     */
    public Optional<String> handler() {
        return Optional.ofNullable(this.handler);
    }
    /**
     * @return max running time of function.
     * 
     */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2FunctionInstanceLifecycleConfigPreFreeze defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String handler;
        private @Nullable Integer timeout;
        public Builder() {}
        public Builder(V2FunctionInstanceLifecycleConfigPreFreeze defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.handler = defaults.handler;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder handler(@Nullable String handler) {
            this.handler = handler;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public V2FunctionInstanceLifecycleConfigPreFreeze build() {
            final var _resultValue = new V2FunctionInstanceLifecycleConfigPreFreeze();
            _resultValue.handler = handler;
            _resultValue.timeout = timeout;
            return _resultValue;
        }
    }
}
