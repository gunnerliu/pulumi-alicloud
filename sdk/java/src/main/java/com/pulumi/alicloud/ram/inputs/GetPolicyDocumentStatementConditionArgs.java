// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetPolicyDocumentStatementConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPolicyDocumentStatementConditionArgs Empty = new GetPolicyDocumentStatementConditionArgs();

    /**
     * The operator of the condition.
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return The operator of the condition.
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * The values of the condition.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return The values of the condition.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    /**
     * The variable of the condition.
     * 
     */
    @Import(name="variable", required=true)
    private Output<String> variable;

    /**
     * @return The variable of the condition.
     * 
     */
    public Output<String> variable() {
        return this.variable;
    }

    private GetPolicyDocumentStatementConditionArgs() {}

    private GetPolicyDocumentStatementConditionArgs(GetPolicyDocumentStatementConditionArgs $) {
        this.operator = $.operator;
        this.values = $.values;
        this.variable = $.variable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyDocumentStatementConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyDocumentStatementConditionArgs $;

        public Builder() {
            $ = new GetPolicyDocumentStatementConditionArgs();
        }

        public Builder(GetPolicyDocumentStatementConditionArgs defaults) {
            $ = new GetPolicyDocumentStatementConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operator The operator of the condition.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator of the condition.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param values The values of the condition.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The values of the condition.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The values of the condition.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        /**
         * @param variable The variable of the condition.
         * 
         * @return builder
         * 
         */
        public Builder variable(Output<String> variable) {
            $.variable = variable;
            return this;
        }

        /**
         * @param variable The variable of the condition.
         * 
         * @return builder
         * 
         */
        public Builder variable(String variable) {
            return variable(Output.of(variable));
        }

        public GetPolicyDocumentStatementConditionArgs build() {
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            $.variable = Objects.requireNonNull($.variable, "expected parameter 'variable' to be non-null");
            return $;
        }
    }

}