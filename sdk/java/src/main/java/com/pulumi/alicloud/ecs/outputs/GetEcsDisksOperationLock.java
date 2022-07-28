// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEcsDisksOperationLock {
    private final @Nullable String lockReason;

    @CustomType.Constructor
    private GetEcsDisksOperationLock(@CustomType.Parameter("lockReason") @Nullable String lockReason) {
        this.lockReason = lockReason;
    }

    public Optional<String> lockReason() {
        return Optional.ofNullable(this.lockReason);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsDisksOperationLock defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lockReason;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEcsDisksOperationLock defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lockReason = defaults.lockReason;
        }

        public Builder lockReason(@Nullable String lockReason) {
            this.lockReason = lockReason;
            return this;
        }        public GetEcsDisksOperationLock build() {
            return new GetEcsDisksOperationLock(lockReason);
        }
    }
}
