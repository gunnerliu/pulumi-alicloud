// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerlessKubernetesRrsaMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerlessKubernetesRrsaMetadataArgs Empty = new ServerlessKubernetesRrsaMetadataArgs();

    /**
     * Whether the RRSA feature has been enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the RRSA feature has been enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The arn of OIDC provider that was registered in RAM.
     * 
     */
    @Import(name="ramOidcProviderArn")
    private @Nullable Output<String> ramOidcProviderArn;

    /**
     * @return The arn of OIDC provider that was registered in RAM.
     * 
     */
    public Optional<Output<String>> ramOidcProviderArn() {
        return Optional.ofNullable(this.ramOidcProviderArn);
    }

    /**
     * The name of OIDC Provider that was registered in RAM.
     * 
     */
    @Import(name="ramOidcProviderName")
    private @Nullable Output<String> ramOidcProviderName;

    /**
     * @return The name of OIDC Provider that was registered in RAM.
     * 
     */
    public Optional<Output<String>> ramOidcProviderName() {
        return Optional.ofNullable(this.ramOidcProviderName);
    }

    /**
     * The issuer URL of RRSA OIDC Token.
     * 
     */
    @Import(name="rrsaOidcIssuerUrl")
    private @Nullable Output<String> rrsaOidcIssuerUrl;

    /**
     * @return The issuer URL of RRSA OIDC Token.
     * 
     */
    public Optional<Output<String>> rrsaOidcIssuerUrl() {
        return Optional.ofNullable(this.rrsaOidcIssuerUrl);
    }

    private ServerlessKubernetesRrsaMetadataArgs() {}

    private ServerlessKubernetesRrsaMetadataArgs(ServerlessKubernetesRrsaMetadataArgs $) {
        this.enabled = $.enabled;
        this.ramOidcProviderArn = $.ramOidcProviderArn;
        this.ramOidcProviderName = $.ramOidcProviderName;
        this.rrsaOidcIssuerUrl = $.rrsaOidcIssuerUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerlessKubernetesRrsaMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerlessKubernetesRrsaMetadataArgs $;

        public Builder() {
            $ = new ServerlessKubernetesRrsaMetadataArgs();
        }

        public Builder(ServerlessKubernetesRrsaMetadataArgs defaults) {
            $ = new ServerlessKubernetesRrsaMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether the RRSA feature has been enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the RRSA feature has been enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param ramOidcProviderArn The arn of OIDC provider that was registered in RAM.
         * 
         * @return builder
         * 
         */
        public Builder ramOidcProviderArn(@Nullable Output<String> ramOidcProviderArn) {
            $.ramOidcProviderArn = ramOidcProviderArn;
            return this;
        }

        /**
         * @param ramOidcProviderArn The arn of OIDC provider that was registered in RAM.
         * 
         * @return builder
         * 
         */
        public Builder ramOidcProviderArn(String ramOidcProviderArn) {
            return ramOidcProviderArn(Output.of(ramOidcProviderArn));
        }

        /**
         * @param ramOidcProviderName The name of OIDC Provider that was registered in RAM.
         * 
         * @return builder
         * 
         */
        public Builder ramOidcProviderName(@Nullable Output<String> ramOidcProviderName) {
            $.ramOidcProviderName = ramOidcProviderName;
            return this;
        }

        /**
         * @param ramOidcProviderName The name of OIDC Provider that was registered in RAM.
         * 
         * @return builder
         * 
         */
        public Builder ramOidcProviderName(String ramOidcProviderName) {
            return ramOidcProviderName(Output.of(ramOidcProviderName));
        }

        /**
         * @param rrsaOidcIssuerUrl The issuer URL of RRSA OIDC Token.
         * 
         * @return builder
         * 
         */
        public Builder rrsaOidcIssuerUrl(@Nullable Output<String> rrsaOidcIssuerUrl) {
            $.rrsaOidcIssuerUrl = rrsaOidcIssuerUrl;
            return this;
        }

        /**
         * @param rrsaOidcIssuerUrl The issuer URL of RRSA OIDC Token.
         * 
         * @return builder
         * 
         */
        public Builder rrsaOidcIssuerUrl(String rrsaOidcIssuerUrl) {
            return rrsaOidcIssuerUrl(Output.of(rrsaOidcIssuerUrl));
        }

        public ServerlessKubernetesRrsaMetadataArgs build() {
            return $;
        }
    }

}
