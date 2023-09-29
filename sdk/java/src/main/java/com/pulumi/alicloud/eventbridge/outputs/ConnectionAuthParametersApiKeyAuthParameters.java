// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionAuthParametersApiKeyAuthParameters {
    /**
     * @return The name of the API key.
     * 
     */
    private @Nullable String apiKeyName;
    /**
     * @return The value of the API key.
     * 
     */
    private @Nullable String apiKeyValue;

    private ConnectionAuthParametersApiKeyAuthParameters() {}
    /**
     * @return The name of the API key.
     * 
     */
    public Optional<String> apiKeyName() {
        return Optional.ofNullable(this.apiKeyName);
    }
    /**
     * @return The value of the API key.
     * 
     */
    public Optional<String> apiKeyValue() {
        return Optional.ofNullable(this.apiKeyValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionAuthParametersApiKeyAuthParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiKeyName;
        private @Nullable String apiKeyValue;
        public Builder() {}
        public Builder(ConnectionAuthParametersApiKeyAuthParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyName = defaults.apiKeyName;
    	      this.apiKeyValue = defaults.apiKeyValue;
        }

        @CustomType.Setter
        public Builder apiKeyName(@Nullable String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }
        @CustomType.Setter
        public Builder apiKeyValue(@Nullable String apiKeyValue) {
            this.apiKeyValue = apiKeyValue;
            return this;
        }
        public ConnectionAuthParametersApiKeyAuthParameters build() {
            final var o = new ConnectionAuthParametersApiKeyAuthParameters();
            o.apiKeyName = apiKeyName;
            o.apiKeyValue = apiKeyValue;
            return o;
        }
    }
}