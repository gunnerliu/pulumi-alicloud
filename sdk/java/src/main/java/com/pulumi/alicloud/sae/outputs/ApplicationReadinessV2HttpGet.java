// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationReadinessV2HttpGet {
    /**
     * @return Specifies whether the response contains keywords. Valid values: `true` and `false`. If you do not set it, the advanced settings are not used.
     * 
     */
    private @Nullable Boolean isContainKeyWord;
    /**
     * @return The custom keywords.
     * 
     */
    private @Nullable String keyWord;
    /**
     * @return The request path.
     * 
     */
    private @Nullable String path;
    /**
     * @return The port.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return The protocol that is used to perform the health check. Valid values: `HTTP` and `HTTPS`.
     * 
     */
    private @Nullable String scheme;

    private ApplicationReadinessV2HttpGet() {}
    /**
     * @return Specifies whether the response contains keywords. Valid values: `true` and `false`. If you do not set it, the advanced settings are not used.
     * 
     */
    public Optional<Boolean> isContainKeyWord() {
        return Optional.ofNullable(this.isContainKeyWord);
    }
    /**
     * @return The custom keywords.
     * 
     */
    public Optional<String> keyWord() {
        return Optional.ofNullable(this.keyWord);
    }
    /**
     * @return The request path.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The port.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The protocol that is used to perform the health check. Valid values: `HTTP` and `HTTPS`.
     * 
     */
    public Optional<String> scheme() {
        return Optional.ofNullable(this.scheme);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationReadinessV2HttpGet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean isContainKeyWord;
        private @Nullable String keyWord;
        private @Nullable String path;
        private @Nullable Integer port;
        private @Nullable String scheme;
        public Builder() {}
        public Builder(ApplicationReadinessV2HttpGet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isContainKeyWord = defaults.isContainKeyWord;
    	      this.keyWord = defaults.keyWord;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.scheme = defaults.scheme;
        }

        @CustomType.Setter
        public Builder isContainKeyWord(@Nullable Boolean isContainKeyWord) {

            this.isContainKeyWord = isContainKeyWord;
            return this;
        }
        @CustomType.Setter
        public Builder keyWord(@Nullable String keyWord) {

            this.keyWord = keyWord;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder scheme(@Nullable String scheme) {

            this.scheme = scheme;
            return this;
        }
        public ApplicationReadinessV2HttpGet build() {
            final var _resultValue = new ApplicationReadinessV2HttpGet();
            _resultValue.isContainKeyWord = isContainKeyWord;
            _resultValue.keyWord = keyWord;
            _resultValue.path = path;
            _resultValue.port = port;
            _resultValue.scheme = scheme;
            return _resultValue;
        }
    }
}
