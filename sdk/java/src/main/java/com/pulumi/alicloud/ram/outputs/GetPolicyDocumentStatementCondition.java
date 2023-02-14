// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPolicyDocumentStatementCondition {
    /**
     * @return The operator of the condition.
     * 
     */
    private String operator;
    /**
     * @return The values of the condition.
     * 
     */
    private List<String> values;
    /**
     * @return The variable of the condition.
     * 
     */
    private String variable;

    private GetPolicyDocumentStatementCondition() {}
    /**
     * @return The operator of the condition.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return The values of the condition.
     * 
     */
    public List<String> values() {
        return this.values;
    }
    /**
     * @return The variable of the condition.
     * 
     */
    public String variable() {
        return this.variable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyDocumentStatementCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String operator;
        private List<String> values;
        private String variable;
        public Builder() {}
        public Builder(GetPolicyDocumentStatementCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
    	      this.variable = defaults.variable;
        }

        @CustomType.Setter
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        @CustomType.Setter
        public Builder variable(String variable) {
            this.variable = Objects.requireNonNull(variable);
            return this;
        }
        public GetPolicyDocumentStatementCondition build() {
            final var o = new GetPolicyDocumentStatementCondition();
            o.operator = operator;
            o.values = values;
            o.variable = variable;
            return o;
        }
    }
}