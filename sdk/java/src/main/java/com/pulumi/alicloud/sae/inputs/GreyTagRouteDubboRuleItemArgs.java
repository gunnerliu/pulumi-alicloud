// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GreyTagRouteDubboRuleItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final GreyTagRouteDubboRuleItemArgs Empty = new GreyTagRouteDubboRuleItemArgs();

    /**
     * The comparison operator. Valid values: `&gt;`, `&lt;`, `&gt;=`, `&lt;=`, `==`, `!=`.
     * 
     */
    @Import(name="cond")
    private @Nullable Output<String> cond;

    /**
     * @return The comparison operator. Valid values: `&gt;`, `&lt;`, `&gt;=`, `&lt;=`, `==`, `!=`.
     * 
     */
    public Optional<Output<String>> cond() {
        return Optional.ofNullable(this.cond);
    }

    /**
     * The parameter value gets the expression.
     * 
     */
    @Import(name="expr")
    private @Nullable Output<String> expr;

    /**
     * @return The parameter value gets the expression.
     * 
     */
    public Optional<Output<String>> expr() {
        return Optional.ofNullable(this.expr);
    }

    /**
     * The parameter number.
     * 
     */
    @Import(name="index")
    private @Nullable Output<Integer> index;

    /**
     * @return The parameter number.
     * 
     */
    public Optional<Output<Integer>> index() {
        return Optional.ofNullable(this.index);
    }

    /**
     * The operator. Valid values: `rawvalue`, `list`, `mod`, `deterministic_proportional_steaming_division`
     * 
     */
    @Import(name="operator")
    private @Nullable Output<String> operator;

    /**
     * @return The operator. Valid values: `rawvalue`, `list`, `mod`, `deterministic_proportional_steaming_division`
     * 
     */
    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    /**
     * The value of the parameter.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the parameter.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GreyTagRouteDubboRuleItemArgs() {}

    private GreyTagRouteDubboRuleItemArgs(GreyTagRouteDubboRuleItemArgs $) {
        this.cond = $.cond;
        this.expr = $.expr;
        this.index = $.index;
        this.operator = $.operator;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GreyTagRouteDubboRuleItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GreyTagRouteDubboRuleItemArgs $;

        public Builder() {
            $ = new GreyTagRouteDubboRuleItemArgs();
        }

        public Builder(GreyTagRouteDubboRuleItemArgs defaults) {
            $ = new GreyTagRouteDubboRuleItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cond The comparison operator. Valid values: `&gt;`, `&lt;`, `&gt;=`, `&lt;=`, `==`, `!=`.
         * 
         * @return builder
         * 
         */
        public Builder cond(@Nullable Output<String> cond) {
            $.cond = cond;
            return this;
        }

        /**
         * @param cond The comparison operator. Valid values: `&gt;`, `&lt;`, `&gt;=`, `&lt;=`, `==`, `!=`.
         * 
         * @return builder
         * 
         */
        public Builder cond(String cond) {
            return cond(Output.of(cond));
        }

        /**
         * @param expr The parameter value gets the expression.
         * 
         * @return builder
         * 
         */
        public Builder expr(@Nullable Output<String> expr) {
            $.expr = expr;
            return this;
        }

        /**
         * @param expr The parameter value gets the expression.
         * 
         * @return builder
         * 
         */
        public Builder expr(String expr) {
            return expr(Output.of(expr));
        }

        /**
         * @param index The parameter number.
         * 
         * @return builder
         * 
         */
        public Builder index(@Nullable Output<Integer> index) {
            $.index = index;
            return this;
        }

        /**
         * @param index The parameter number.
         * 
         * @return builder
         * 
         */
        public Builder index(Integer index) {
            return index(Output.of(index));
        }

        /**
         * @param operator The operator. Valid values: `rawvalue`, `list`, `mod`, `deterministic_proportional_steaming_division`
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator. Valid values: `rawvalue`, `list`, `mod`, `deterministic_proportional_steaming_division`
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param value The value of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GreyTagRouteDubboRuleItemArgs build() {
            return $;
        }
    }

}
