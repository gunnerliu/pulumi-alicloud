// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DomainConfigFunctionArg {
    /**
     * @return The name of arg.
     * 
     */
    private final String argName;
    /**
     * @return The value of arg.
     * 
     */
    private final String argValue;

    @CustomType.Constructor
    private DomainConfigFunctionArg(
        @CustomType.Parameter("argName") String argName,
        @CustomType.Parameter("argValue") String argValue) {
        this.argName = argName;
        this.argValue = argValue;
    }

    /**
     * @return The name of arg.
     * 
     */
    public String argName() {
        return this.argName;
    }
    /**
     * @return The value of arg.
     * 
     */
    public String argValue() {
        return this.argValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainConfigFunctionArg defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String argName;
        private String argValue;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainConfigFunctionArg defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.argName = defaults.argName;
    	      this.argValue = defaults.argValue;
        }

        public Builder argName(String argName) {
            this.argName = Objects.requireNonNull(argName);
            return this;
        }
        public Builder argValue(String argValue) {
            this.argValue = Objects.requireNonNull(argValue);
            return this;
        }        public DomainConfigFunctionArg build() {
            return new DomainConfigFunctionArg(argName, argValue);
        }
    }
}
