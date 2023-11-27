// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTemplateScratchesScratchStack {
    /**
     * @return The ID of the Resource stack.
     * 
     */
    private String stackId;

    private GetTemplateScratchesScratchStack() {}
    /**
     * @return The ID of the Resource stack.
     * 
     */
    public String stackId() {
        return this.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplateScratchesScratchStack defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String stackId;
        public Builder() {}
        public Builder(GetTemplateScratchesScratchStack defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stackId = defaults.stackId;
        }

        @CustomType.Setter
        public Builder stackId(String stackId) {
            this.stackId = Objects.requireNonNull(stackId);
            return this;
        }
        public GetTemplateScratchesScratchStack build() {
            final var _resultValue = new GetTemplateScratchesScratchStack();
            _resultValue.stackId = stackId;
            return _resultValue;
        }
    }
}
