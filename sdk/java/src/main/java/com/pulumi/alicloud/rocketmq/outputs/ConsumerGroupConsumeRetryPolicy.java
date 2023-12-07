// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConsumerGroupConsumeRetryPolicy {
    /**
     * @return Maximum number of retries.
     * 
     */
    private @Nullable Integer maxRetryTimes;
    /**
     * @return Consume retry policy.
     * 
     */
    private @Nullable String retryPolicy;

    private ConsumerGroupConsumeRetryPolicy() {}
    /**
     * @return Maximum number of retries.
     * 
     */
    public Optional<Integer> maxRetryTimes() {
        return Optional.ofNullable(this.maxRetryTimes);
    }
    /**
     * @return Consume retry policy.
     * 
     */
    public Optional<String> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsumerGroupConsumeRetryPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maxRetryTimes;
        private @Nullable String retryPolicy;
        public Builder() {}
        public Builder(ConsumerGroupConsumeRetryPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRetryTimes = defaults.maxRetryTimes;
    	      this.retryPolicy = defaults.retryPolicy;
        }

        @CustomType.Setter
        public Builder maxRetryTimes(@Nullable Integer maxRetryTimes) {
            this.maxRetryTimes = maxRetryTimes;
            return this;
        }
        @CustomType.Setter
        public Builder retryPolicy(@Nullable String retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public ConsumerGroupConsumeRetryPolicy build() {
            final var _resultValue = new ConsumerGroupConsumeRetryPolicy();
            _resultValue.maxRetryTimes = maxRetryTimes;
            _resultValue.retryPolicy = retryPolicy;
            return _resultValue;
        }
    }
}