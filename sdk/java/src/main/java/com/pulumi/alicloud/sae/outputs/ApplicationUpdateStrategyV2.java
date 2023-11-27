// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.alicloud.sae.outputs.ApplicationUpdateStrategyV2BatchUpdate;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationUpdateStrategyV2 {
    /**
     * @return The phased release policy. See `batch_update` below.
     * 
     */
    private @Nullable ApplicationUpdateStrategyV2BatchUpdate batchUpdate;
    /**
     * @return The type of the release policy. Valid values: `GrayBatchUpdate` and `BatchUpdate`.
     * 
     */
    private @Nullable String type;

    private ApplicationUpdateStrategyV2() {}
    /**
     * @return The phased release policy. See `batch_update` below.
     * 
     */
    public Optional<ApplicationUpdateStrategyV2BatchUpdate> batchUpdate() {
        return Optional.ofNullable(this.batchUpdate);
    }
    /**
     * @return The type of the release policy. Valid values: `GrayBatchUpdate` and `BatchUpdate`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationUpdateStrategyV2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ApplicationUpdateStrategyV2BatchUpdate batchUpdate;
        private @Nullable String type;
        public Builder() {}
        public Builder(ApplicationUpdateStrategyV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchUpdate = defaults.batchUpdate;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder batchUpdate(@Nullable ApplicationUpdateStrategyV2BatchUpdate batchUpdate) {
            this.batchUpdate = batchUpdate;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ApplicationUpdateStrategyV2 build() {
            final var _resultValue = new ApplicationUpdateStrategyV2();
            _resultValue.batchUpdate = batchUpdate;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
