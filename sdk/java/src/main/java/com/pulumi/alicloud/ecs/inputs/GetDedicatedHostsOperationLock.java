// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDedicatedHostsOperationLock extends com.pulumi.resources.InvokeArgs {

    public static final GetDedicatedHostsOperationLock Empty = new GetDedicatedHostsOperationLock();

    /**
     * The reason why the dedicated host resource is locked.
     * 
     */
    @Import(name="lockReason")
    private @Nullable String lockReason;

    /**
     * @return The reason why the dedicated host resource is locked.
     * 
     */
    public Optional<String> lockReason() {
        return Optional.ofNullable(this.lockReason);
    }

    private GetDedicatedHostsOperationLock() {}

    private GetDedicatedHostsOperationLock(GetDedicatedHostsOperationLock $) {
        this.lockReason = $.lockReason;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDedicatedHostsOperationLock defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDedicatedHostsOperationLock $;

        public Builder() {
            $ = new GetDedicatedHostsOperationLock();
        }

        public Builder(GetDedicatedHostsOperationLock defaults) {
            $ = new GetDedicatedHostsOperationLock(Objects.requireNonNull(defaults));
        }

        /**
         * @param lockReason The reason why the dedicated host resource is locked.
         * 
         * @return builder
         * 
         */
        public Builder lockReason(@Nullable String lockReason) {
            $.lockReason = lockReason;
            return this;
        }

        public GetDedicatedHostsOperationLock build() {
            return $;
        }
    }

}
