// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.polardb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNodeClassesClassSupportedEngineAvailableResource {
    /**
     * @return The PolarDB node class type by the user.
     * 
     */
    private String dbNodeClass;

    private GetNodeClassesClassSupportedEngineAvailableResource() {}
    /**
     * @return The PolarDB node class type by the user.
     * 
     */
    public String dbNodeClass() {
        return this.dbNodeClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeClassesClassSupportedEngineAvailableResource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dbNodeClass;
        public Builder() {}
        public Builder(GetNodeClassesClassSupportedEngineAvailableResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbNodeClass = defaults.dbNodeClass;
        }

        @CustomType.Setter
        public Builder dbNodeClass(String dbNodeClass) {
            this.dbNodeClass = Objects.requireNonNull(dbNodeClass);
            return this;
        }
        public GetNodeClassesClassSupportedEngineAvailableResource build() {
            final var _resultValue = new GetNodeClassesClassSupportedEngineAvailableResource();
            _resultValue.dbNodeClass = dbNodeClass;
            return _resultValue;
        }
    }
}
