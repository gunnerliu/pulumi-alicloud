// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleTargetDeadLetterQueue {
    /**
     * @return The srn of the dead letter queue.
     * 
     */
    private @Nullable String arn;

    private RuleTargetDeadLetterQueue() {}
    /**
     * @return The srn of the dead letter queue.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleTargetDeadLetterQueue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arn;
        public Builder() {}
        public Builder(RuleTargetDeadLetterQueue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        @CustomType.Setter
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public RuleTargetDeadLetterQueue build() {
            final var _resultValue = new RuleTargetDeadLetterQueue();
            _resultValue.arn = arn;
            return _resultValue;
        }
    }
}
