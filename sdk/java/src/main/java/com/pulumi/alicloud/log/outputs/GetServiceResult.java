// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceResult {
    private final @Nullable String enable;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The current service enable status.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetServiceResult(
        @CustomType.Parameter("enable") @Nullable String enable,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("status") String status) {
        this.enable = enable;
        this.id = id;
        this.status = status;
    }

    public Optional<String> enable() {
        return Optional.ofNullable(this.enable);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The current service enable status.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String enable;
        private String id;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.id = defaults.id;
    	      this.status = defaults.status;
        }

        public Builder enable(@Nullable String enable) {
            this.enable = enable;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetServiceResult build() {
            return new GetServiceResult(enable, id, status);
        }
    }
}
