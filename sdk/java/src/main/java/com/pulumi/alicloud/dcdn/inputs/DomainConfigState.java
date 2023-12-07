// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.inputs;

import com.pulumi.alicloud.dcdn.inputs.DomainConfigFunctionArgArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainConfigState extends com.pulumi.resources.ResourceArgs {

    public static final DomainConfigState Empty = new DomainConfigState();

    /**
     * The ID of the configuration.
     * 
     */
    @Import(name="configId")
    private @Nullable Output<String> configId;

    /**
     * @return The ID of the configuration.
     * 
     */
    public Optional<Output<String>> configId() {
        return Optional.ofNullable(this.configId);
    }

    /**
     * Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * The args of the domain config. See `function_args` below.
     * 
     */
    @Import(name="functionArgs")
    private @Nullable Output<List<DomainConfigFunctionArgArgs>> functionArgs;

    /**
     * @return The args of the domain config. See `function_args` below.
     * 
     */
    public Optional<Output<List<DomainConfigFunctionArgArgs>>> functionArgs() {
        return Optional.ofNullable(this.functionArgs);
    }

    /**
     * The name of the domain config.
     * 
     */
    @Import(name="functionName")
    private @Nullable Output<String> functionName;

    /**
     * @return The name of the domain config.
     * 
     */
    public Optional<Output<String>> functionName() {
        return Optional.ofNullable(this.functionName);
    }

    /**
     * The status of the Config.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the Config.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private DomainConfigState() {}

    private DomainConfigState(DomainConfigState $) {
        this.configId = $.configId;
        this.domainName = $.domainName;
        this.functionArgs = $.functionArgs;
        this.functionName = $.functionName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainConfigState $;

        public Builder() {
            $ = new DomainConfigState();
        }

        public Builder(DomainConfigState defaults) {
            $ = new DomainConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId The ID of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder configId(@Nullable Output<String> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId The ID of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder configId(String configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param domainName Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param functionArgs The args of the domain config. See `function_args` below.
         * 
         * @return builder
         * 
         */
        public Builder functionArgs(@Nullable Output<List<DomainConfigFunctionArgArgs>> functionArgs) {
            $.functionArgs = functionArgs;
            return this;
        }

        /**
         * @param functionArgs The args of the domain config. See `function_args` below.
         * 
         * @return builder
         * 
         */
        public Builder functionArgs(List<DomainConfigFunctionArgArgs> functionArgs) {
            return functionArgs(Output.of(functionArgs));
        }

        /**
         * @param functionArgs The args of the domain config. See `function_args` below.
         * 
         * @return builder
         * 
         */
        public Builder functionArgs(DomainConfigFunctionArgArgs... functionArgs) {
            return functionArgs(List.of(functionArgs));
        }

        /**
         * @param functionName The name of the domain config.
         * 
         * @return builder
         * 
         */
        public Builder functionName(@Nullable Output<String> functionName) {
            $.functionName = functionName;
            return this;
        }

        /**
         * @param functionName The name of the domain config.
         * 
         * @return builder
         * 
         */
        public Builder functionName(String functionName) {
            return functionName(Output.of(functionName));
        }

        /**
         * @param status The status of the Config.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the Config.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public DomainConfigState build() {
            return $;
        }
    }

}
