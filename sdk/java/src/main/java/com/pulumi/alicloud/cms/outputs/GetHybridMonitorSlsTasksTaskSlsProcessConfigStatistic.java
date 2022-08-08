// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHybridMonitorSlsTasksTaskSlsProcessConfigStatistic {
    /**
     * @return The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    private final String alias;
    /**
     * @return The function that is used to aggregate log data within a statistical period.
     * 
     */
    private final String function;
    /**
     * @return The value of the function that is used to aggregate logs imported from Log Service.
     * 
     */
    private final String parameterOne;
    /**
     * @return The value of the function that is used to aggregate logs imported from Log Service.
     * 
     */
    private final String parameterTwo;
    /**
     * @return The name of the key that is used to filter logs imported from Log Service.
     * 
     */
    private final String slsKeyName;

    @CustomType.Constructor
    private GetHybridMonitorSlsTasksTaskSlsProcessConfigStatistic(
        @CustomType.Parameter("alias") String alias,
        @CustomType.Parameter("function") String function,
        @CustomType.Parameter("parameterOne") String parameterOne,
        @CustomType.Parameter("parameterTwo") String parameterTwo,
        @CustomType.Parameter("slsKeyName") String slsKeyName) {
        this.alias = alias;
        this.function = function;
        this.parameterOne = parameterOne;
        this.parameterTwo = parameterTwo;
        this.slsKeyName = slsKeyName;
    }

    /**
     * @return The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    public String alias() {
        return this.alias;
    }
    /**
     * @return The function that is used to aggregate log data within a statistical period.
     * 
     */
    public String function() {
        return this.function;
    }
    /**
     * @return The value of the function that is used to aggregate logs imported from Log Service.
     * 
     */
    public String parameterOne() {
        return this.parameterOne;
    }
    /**
     * @return The value of the function that is used to aggregate logs imported from Log Service.
     * 
     */
    public String parameterTwo() {
        return this.parameterTwo;
    }
    /**
     * @return The name of the key that is used to filter logs imported from Log Service.
     * 
     */
    public String slsKeyName() {
        return this.slsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridMonitorSlsTasksTaskSlsProcessConfigStatistic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alias;
        private String function;
        private String parameterOne;
        private String parameterTwo;
        private String slsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridMonitorSlsTasksTaskSlsProcessConfigStatistic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.function = defaults.function;
    	      this.parameterOne = defaults.parameterOne;
    	      this.parameterTwo = defaults.parameterTwo;
    	      this.slsKeyName = defaults.slsKeyName;
        }

        public Builder alias(String alias) {
            this.alias = Objects.requireNonNull(alias);
            return this;
        }
        public Builder function(String function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }
        public Builder parameterOne(String parameterOne) {
            this.parameterOne = Objects.requireNonNull(parameterOne);
            return this;
        }
        public Builder parameterTwo(String parameterTwo) {
            this.parameterTwo = Objects.requireNonNull(parameterTwo);
            return this;
        }
        public Builder slsKeyName(String slsKeyName) {
            this.slsKeyName = Objects.requireNonNull(slsKeyName);
            return this;
        }        public GetHybridMonitorSlsTasksTaskSlsProcessConfigStatistic build() {
            return new GetHybridMonitorSlsTasksTaskSlsProcessConfigStatistic(alias, function, parameterOne, parameterTwo, slsKeyName);
        }
    }
}
