// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionAuthParametersOauthParametersClientParameters {
    /**
     * @return The ID of the client.
     * 
     */
    private @Nullable String clientId;
    /**
     * @return The AccessKey secret of the client.
     * 
     */
    private @Nullable String clientSecret;

    private ConnectionAuthParametersOauthParametersClientParameters() {}
    /**
     * @return The ID of the client.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The AccessKey secret of the client.
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionAuthParametersOauthParametersClientParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        public Builder() {}
        public Builder(ConnectionAuthParametersOauthParametersClientParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
        }

        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public ConnectionAuthParametersOauthParametersClientParameters build() {
            final var _resultValue = new ConnectionAuthParametersOauthParametersClientParameters();
            _resultValue.clientId = clientId;
            _resultValue.clientSecret = clientSecret;
            return _resultValue;
        }
    }
}
