// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn;

import com.pulumi.alicloud.dcdn.inputs.DomainConfigFunctionArgArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DomainConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainConfigArgs Empty = new DomainConfigArgs();

    /**
     * Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * The args of the domain config. See `function_args` below.
     * 
     */
    @Import(name="functionArgs", required=true)
    private Output<List<DomainConfigFunctionArgArgs>> functionArgs;

    /**
     * @return The args of the domain config. See `function_args` below.
     * 
     */
    public Output<List<DomainConfigFunctionArgArgs>> functionArgs() {
        return this.functionArgs;
    }

    /**
     * The name of the domain config.
     * 
     */
    @Import(name="functionName", required=true)
    private Output<String> functionName;

    /**
     * @return The name of the domain config.
     * 
     */
    public Output<String> functionName() {
        return this.functionName;
    }

    private DomainConfigArgs() {}

    private DomainConfigArgs(DomainConfigArgs $) {
        this.domainName = $.domainName;
        this.functionArgs = $.functionArgs;
        this.functionName = $.functionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainConfigArgs $;

        public Builder() {
            $ = new DomainConfigArgs();
        }

        public Builder(DomainConfigArgs defaults) {
            $ = new DomainConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
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
        public Builder functionArgs(Output<List<DomainConfigFunctionArgArgs>> functionArgs) {
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
        public Builder functionName(Output<String> functionName) {
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

        public DomainConfigArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            $.functionArgs = Objects.requireNonNull($.functionArgs, "expected parameter 'functionArgs' to be non-null");
            $.functionName = Objects.requireNonNull($.functionName, "expected parameter 'functionName' to be non-null");
            return $;
        }
    }

}
