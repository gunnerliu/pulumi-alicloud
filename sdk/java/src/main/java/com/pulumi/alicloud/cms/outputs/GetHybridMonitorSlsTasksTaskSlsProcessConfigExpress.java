// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHybridMonitorSlsTasksTaskSlsProcessConfigExpress {
    /**
     * @return The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    private final String alias;
    /**
     * @return The extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    private final String express;

    @CustomType.Constructor
    private GetHybridMonitorSlsTasksTaskSlsProcessConfigExpress(
        @CustomType.Parameter("alias") String alias,
        @CustomType.Parameter("express") String express) {
        this.alias = alias;
        this.express = express;
    }

    /**
     * @return The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    public String alias() {
        return this.alias;
    }
    /**
     * @return The extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    public String express() {
        return this.express;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridMonitorSlsTasksTaskSlsProcessConfigExpress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alias;
        private String express;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridMonitorSlsTasksTaskSlsProcessConfigExpress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.express = defaults.express;
        }

        public Builder alias(String alias) {
            this.alias = Objects.requireNonNull(alias);
            return this;
        }
        public Builder express(String express) {
            this.express = Objects.requireNonNull(express);
            return this;
        }        public GetHybridMonitorSlsTasksTaskSlsProcessConfigExpress build() {
            return new GetHybridMonitorSlsTasksTaskSlsProcessConfigExpress(alias, express);
        }
    }
}
