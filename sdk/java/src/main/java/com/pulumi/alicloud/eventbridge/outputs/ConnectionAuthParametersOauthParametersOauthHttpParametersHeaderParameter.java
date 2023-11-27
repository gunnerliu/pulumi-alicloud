// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionAuthParametersOauthParametersOauthHttpParametersHeaderParameter {
    /**
     * @return Specifies whether to enable authentication.
     * 
     */
    private @Nullable String isValueSecret;
    /**
     * @return The key of the request path.
     * 
     */
    private @Nullable String key;
    /**
     * @return The key of the request path.
     * 
     */
    private @Nullable String value;

    private ConnectionAuthParametersOauthParametersOauthHttpParametersHeaderParameter() {}
    /**
     * @return Specifies whether to enable authentication.
     * 
     */
    public Optional<String> isValueSecret() {
        return Optional.ofNullable(this.isValueSecret);
    }
    /**
     * @return The key of the request path.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return The key of the request path.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionAuthParametersOauthParametersOauthHttpParametersHeaderParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String isValueSecret;
        private @Nullable String key;
        private @Nullable String value;
        public Builder() {}
        public Builder(ConnectionAuthParametersOauthParametersOauthHttpParametersHeaderParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isValueSecret = defaults.isValueSecret;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder isValueSecret(@Nullable String isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }
        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ConnectionAuthParametersOauthParametersOauthHttpParametersHeaderParameter build() {
            final var _resultValue = new ConnectionAuthParametersOauthParametersOauthHttpParametersHeaderParameter();
            _resultValue.isValueSecret = isValueSecret;
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
