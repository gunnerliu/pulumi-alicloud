// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.alicloud.fc.outputs.FunctionAsyncInvokeConfigDestinationConfigOnFailure;
import com.pulumi.alicloud.fc.outputs.FunctionAsyncInvokeConfigDestinationConfigOnSuccess;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionAsyncInvokeConfigDestinationConfig {
    /**
     * @return Configuration block with destination configuration for failed asynchronous invocations. See `on_failure` below.
     * 
     */
    private @Nullable FunctionAsyncInvokeConfigDestinationConfigOnFailure onFailure;
    /**
     * @return Configuration block with destination configuration for successful asynchronous invocations. See `on_success` below.
     * 
     */
    private @Nullable FunctionAsyncInvokeConfigDestinationConfigOnSuccess onSuccess;

    private FunctionAsyncInvokeConfigDestinationConfig() {}
    /**
     * @return Configuration block with destination configuration for failed asynchronous invocations. See `on_failure` below.
     * 
     */
    public Optional<FunctionAsyncInvokeConfigDestinationConfigOnFailure> onFailure() {
        return Optional.ofNullable(this.onFailure);
    }
    /**
     * @return Configuration block with destination configuration for successful asynchronous invocations. See `on_success` below.
     * 
     */
    public Optional<FunctionAsyncInvokeConfigDestinationConfigOnSuccess> onSuccess() {
        return Optional.ofNullable(this.onSuccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionAsyncInvokeConfigDestinationConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FunctionAsyncInvokeConfigDestinationConfigOnFailure onFailure;
        private @Nullable FunctionAsyncInvokeConfigDestinationConfigOnSuccess onSuccess;
        public Builder() {}
        public Builder(FunctionAsyncInvokeConfigDestinationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onFailure = defaults.onFailure;
    	      this.onSuccess = defaults.onSuccess;
        }

        @CustomType.Setter
        public Builder onFailure(@Nullable FunctionAsyncInvokeConfigDestinationConfigOnFailure onFailure) {
            this.onFailure = onFailure;
            return this;
        }
        @CustomType.Setter
        public Builder onSuccess(@Nullable FunctionAsyncInvokeConfigDestinationConfigOnSuccess onSuccess) {
            this.onSuccess = onSuccess;
            return this;
        }
        public FunctionAsyncInvokeConfigDestinationConfig build() {
            final var _resultValue = new FunctionAsyncInvokeConfigDestinationConfig();
            _resultValue.onFailure = onFailure;
            _resultValue.onSuccess = onSuccess;
            return _resultValue;
        }
    }
}
