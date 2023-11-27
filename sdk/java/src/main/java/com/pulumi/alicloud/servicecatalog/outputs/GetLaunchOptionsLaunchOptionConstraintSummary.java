// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicecatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLaunchOptionsLaunchOptionConstraintSummary {
    /**
     * @return Constraint type.The value is Launch, which indicates that the constraint is started.
     * 
     */
    private String constraintType;
    /**
     * @return Constraint description.
     * 
     */
    private String description;

    private GetLaunchOptionsLaunchOptionConstraintSummary() {}
    /**
     * @return Constraint type.The value is Launch, which indicates that the constraint is started.
     * 
     */
    public String constraintType() {
        return this.constraintType;
    }
    /**
     * @return Constraint description.
     * 
     */
    public String description() {
        return this.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchOptionsLaunchOptionConstraintSummary defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String constraintType;
        private String description;
        public Builder() {}
        public Builder(GetLaunchOptionsLaunchOptionConstraintSummary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraintType = defaults.constraintType;
    	      this.description = defaults.description;
        }

        @CustomType.Setter
        public Builder constraintType(String constraintType) {
            this.constraintType = Objects.requireNonNull(constraintType);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public GetLaunchOptionsLaunchOptionConstraintSummary build() {
            final var _resultValue = new GetLaunchOptionsLaunchOptionConstraintSummary();
            _resultValue.constraintType = constraintType;
            _resultValue.description = description;
            return _resultValue;
        }
    }
}
