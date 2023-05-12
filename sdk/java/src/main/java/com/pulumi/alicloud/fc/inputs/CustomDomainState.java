// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.inputs;

import com.pulumi.alicloud.fc.inputs.CustomDomainCertConfigArgs;
import com.pulumi.alicloud.fc.inputs.CustomDomainRouteConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDomainState extends com.pulumi.resources.ResourceArgs {

    public static final CustomDomainState Empty = new CustomDomainState();

    /**
     * The account id.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account id.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The api version of Function Compute.
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return The api version of Function Compute.
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * The configuration of HTTPS certificate.
     * 
     * **route_config** includes the following arguments:
     * 
     */
    @Import(name="certConfig")
    private @Nullable Output<CustomDomainCertConfigArgs> certConfig;

    /**
     * @return The configuration of HTTPS certificate.
     * 
     * **route_config** includes the following arguments:
     * 
     */
    public Optional<Output<CustomDomainCertConfigArgs>> certConfig() {
        return Optional.ofNullable(this.certConfig);
    }

    /**
     * The date this resource was created.
     * 
     */
    @Import(name="createdTime")
    private @Nullable Output<String> createdTime;

    /**
     * @return The date this resource was created.
     * 
     */
    public Optional<Output<String>> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }

    /**
     * The custom domain name. For example, &#34;example.com&#34;.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The custom domain name. For example, &#34;example.com&#34;.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * The date this resource was last modified.
     * 
     */
    @Import(name="lastModifiedTime")
    private @Nullable Output<String> lastModifiedTime;

    /**
     * @return The date this resource was last modified.
     * 
     */
    public Optional<Output<String>> lastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }

    /**
     * The protocol, `HTTP` or `HTTP,HTTPS`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The protocol, `HTTP` or `HTTP,HTTPS`.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The configuration of domain route, mapping the path and Function Compute function.
     * 
     */
    @Import(name="routeConfigs")
    private @Nullable Output<List<CustomDomainRouteConfigArgs>> routeConfigs;

    /**
     * @return The configuration of domain route, mapping the path and Function Compute function.
     * 
     */
    public Optional<Output<List<CustomDomainRouteConfigArgs>>> routeConfigs() {
        return Optional.ofNullable(this.routeConfigs);
    }

    private CustomDomainState() {}

    private CustomDomainState(CustomDomainState $) {
        this.accountId = $.accountId;
        this.apiVersion = $.apiVersion;
        this.certConfig = $.certConfig;
        this.createdTime = $.createdTime;
        this.domainName = $.domainName;
        this.lastModifiedTime = $.lastModifiedTime;
        this.protocol = $.protocol;
        this.routeConfigs = $.routeConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDomainState $;

        public Builder() {
            $ = new CustomDomainState();
        }

        public Builder(CustomDomainState defaults) {
            $ = new CustomDomainState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account id.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account id.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param apiVersion The api version of Function Compute.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion The api version of Function Compute.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param certConfig The configuration of HTTPS certificate.
         * 
         * **route_config** includes the following arguments:
         * 
         * @return builder
         * 
         */
        public Builder certConfig(@Nullable Output<CustomDomainCertConfigArgs> certConfig) {
            $.certConfig = certConfig;
            return this;
        }

        /**
         * @param certConfig The configuration of HTTPS certificate.
         * 
         * **route_config** includes the following arguments:
         * 
         * @return builder
         * 
         */
        public Builder certConfig(CustomDomainCertConfigArgs certConfig) {
            return certConfig(Output.of(certConfig));
        }

        /**
         * @param createdTime The date this resource was created.
         * 
         * @return builder
         * 
         */
        public Builder createdTime(@Nullable Output<String> createdTime) {
            $.createdTime = createdTime;
            return this;
        }

        /**
         * @param createdTime The date this resource was created.
         * 
         * @return builder
         * 
         */
        public Builder createdTime(String createdTime) {
            return createdTime(Output.of(createdTime));
        }

        /**
         * @param domainName The custom domain name. For example, &#34;example.com&#34;.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The custom domain name. For example, &#34;example.com&#34;.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param lastModifiedTime The date this resource was last modified.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedTime(@Nullable Output<String> lastModifiedTime) {
            $.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * @param lastModifiedTime The date this resource was last modified.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            return lastModifiedTime(Output.of(lastModifiedTime));
        }

        /**
         * @param protocol The protocol, `HTTP` or `HTTP,HTTPS`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol, `HTTP` or `HTTP,HTTPS`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param routeConfigs The configuration of domain route, mapping the path and Function Compute function.
         * 
         * @return builder
         * 
         */
        public Builder routeConfigs(@Nullable Output<List<CustomDomainRouteConfigArgs>> routeConfigs) {
            $.routeConfigs = routeConfigs;
            return this;
        }

        /**
         * @param routeConfigs The configuration of domain route, mapping the path and Function Compute function.
         * 
         * @return builder
         * 
         */
        public Builder routeConfigs(List<CustomDomainRouteConfigArgs> routeConfigs) {
            return routeConfigs(Output.of(routeConfigs));
        }

        /**
         * @param routeConfigs The configuration of domain route, mapping the path and Function Compute function.
         * 
         * @return builder
         * 
         */
        public Builder routeConfigs(CustomDomainRouteConfigArgs... routeConfigs) {
            return routeConfigs(List.of(routeConfigs));
        }

        public CustomDomainState build() {
            return $;
        }
    }

}
