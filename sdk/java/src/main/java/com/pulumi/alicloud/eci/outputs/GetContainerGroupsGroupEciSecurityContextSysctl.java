// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetContainerGroupsGroupEciSecurityContextSysctl {
    /**
     * @return The name of the volume.
     * 
     */
    private String name;
    /**
     * @return The value of the variable.
     * 
     */
    private String value;

    private GetContainerGroupsGroupEciSecurityContextSysctl() {}
    /**
     * @return The name of the volume.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value of the variable.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerGroupsGroupEciSecurityContextSysctl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(GetContainerGroupsGroupEciSecurityContextSysctl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetContainerGroupsGroupEciSecurityContextSysctl build() {
            final var _resultValue = new GetContainerGroupsGroupEciSecurityContextSysctl();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
