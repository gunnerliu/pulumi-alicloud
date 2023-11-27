// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceTypesInstanceTypeBurstableInstance {
    private String baselineCredit;
    private String initialCredit;

    private GetInstanceTypesInstanceTypeBurstableInstance() {}
    public String baselineCredit() {
        return this.baselineCredit;
    }
    public String initialCredit() {
        return this.initialCredit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypesInstanceTypeBurstableInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String baselineCredit;
        private String initialCredit;
        public Builder() {}
        public Builder(GetInstanceTypesInstanceTypeBurstableInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baselineCredit = defaults.baselineCredit;
    	      this.initialCredit = defaults.initialCredit;
        }

        @CustomType.Setter
        public Builder baselineCredit(String baselineCredit) {
            this.baselineCredit = Objects.requireNonNull(baselineCredit);
            return this;
        }
        @CustomType.Setter
        public Builder initialCredit(String initialCredit) {
            this.initialCredit = Objects.requireNonNull(initialCredit);
            return this;
        }
        public GetInstanceTypesInstanceTypeBurstableInstance build() {
            final var _resultValue = new GetInstanceTypesInstanceTypeBurstableInstance();
            _resultValue.baselineCredit = baselineCredit;
            _resultValue.initialCredit = initialCredit;
            return _resultValue;
        }
    }
}
