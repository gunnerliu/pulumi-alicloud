// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiMockServiceConfig {
    private final @Nullable String aoneName;
    /**
     * @return The result of the mock service.
     * 
     */
    private final String result;

    @CustomType.Constructor
    private ApiMockServiceConfig(
        @CustomType.Parameter("aoneName") @Nullable String aoneName,
        @CustomType.Parameter("result") String result) {
        this.aoneName = aoneName;
        this.result = result;
    }

    public Optional<String> aoneName() {
        return Optional.ofNullable(this.aoneName);
    }
    /**
     * @return The result of the mock service.
     * 
     */
    public String result() {
        return this.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiMockServiceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aoneName;
        private String result;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiMockServiceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aoneName = defaults.aoneName;
    	      this.result = defaults.result;
        }

        public Builder aoneName(@Nullable String aoneName) {
            this.aoneName = aoneName;
            return this;
        }
        public Builder result(String result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }        public ApiMockServiceConfig build() {
            return new ApiMockServiceConfig(aoneName, result);
        }
    }
}
