// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedKubernetesRrsaMetadata {
    /**
     * @return Whether the RRSA feature has been enabled.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The arn of OIDC provider that was registered in RAM.
     * 
     */
    private @Nullable String ramOidcProviderArn;
    /**
     * @return The name of OIDC Provider that was registered in RAM.
     * 
     */
    private @Nullable String ramOidcProviderName;
    /**
     * @return The issuer URL of RRSA OIDC Token.
     * 
     */
    private @Nullable String rrsaOidcIssuerUrl;

    private ManagedKubernetesRrsaMetadata() {}
    /**
     * @return Whether the RRSA feature has been enabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The arn of OIDC provider that was registered in RAM.
     * 
     */
    public Optional<String> ramOidcProviderArn() {
        return Optional.ofNullable(this.ramOidcProviderArn);
    }
    /**
     * @return The name of OIDC Provider that was registered in RAM.
     * 
     */
    public Optional<String> ramOidcProviderName() {
        return Optional.ofNullable(this.ramOidcProviderName);
    }
    /**
     * @return The issuer URL of RRSA OIDC Token.
     * 
     */
    public Optional<String> rrsaOidcIssuerUrl() {
        return Optional.ofNullable(this.rrsaOidcIssuerUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedKubernetesRrsaMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String ramOidcProviderArn;
        private @Nullable String ramOidcProviderName;
        private @Nullable String rrsaOidcIssuerUrl;
        public Builder() {}
        public Builder(ManagedKubernetesRrsaMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.ramOidcProviderArn = defaults.ramOidcProviderArn;
    	      this.ramOidcProviderName = defaults.ramOidcProviderName;
    	      this.rrsaOidcIssuerUrl = defaults.rrsaOidcIssuerUrl;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder ramOidcProviderArn(@Nullable String ramOidcProviderArn) {
            this.ramOidcProviderArn = ramOidcProviderArn;
            return this;
        }
        @CustomType.Setter
        public Builder ramOidcProviderName(@Nullable String ramOidcProviderName) {
            this.ramOidcProviderName = ramOidcProviderName;
            return this;
        }
        @CustomType.Setter
        public Builder rrsaOidcIssuerUrl(@Nullable String rrsaOidcIssuerUrl) {
            this.rrsaOidcIssuerUrl = rrsaOidcIssuerUrl;
            return this;
        }
        public ManagedKubernetesRrsaMetadata build() {
            final var _resultValue = new ManagedKubernetesRrsaMetadata();
            _resultValue.enabled = enabled;
            _resultValue.ramOidcProviderArn = ramOidcProviderArn;
            _resultValue.ramOidcProviderName = ramOidcProviderName;
            _resultValue.rrsaOidcIssuerUrl = rrsaOidcIssuerUrl;
            return _resultValue;
        }
    }
}
