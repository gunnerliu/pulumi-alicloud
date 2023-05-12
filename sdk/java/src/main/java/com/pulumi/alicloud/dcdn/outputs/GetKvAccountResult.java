// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKvAccountResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The current kv account enable status.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetKvAccountResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("status") String status) {
        this.id = id;
        this.status = status;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The current kv account enable status.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKvAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKvAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.status = defaults.status;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetKvAccountResult build() {
            return new GetKvAccountResult(id, status);
        }
    }
}
