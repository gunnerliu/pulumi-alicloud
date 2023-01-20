// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.alicloud.alb.inputs.RuleRuleConditionQueryStringConfigValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleRuleConditionQueryStringConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleRuleConditionQueryStringConfigArgs Empty = new RuleRuleConditionQueryStringConfigArgs();

    /**
     * The value of the header field. The value must be 1 to 128 characters in length, and can contain lowercase letters, printable ASCII characters whose values are ch &gt;= 32 &amp;&amp; ch &lt; 127, asterisks (*), and question marks (?). The value cannot start or end with a space.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<RuleRuleConditionQueryStringConfigValueArgs>> values;

    /**
     * @return The value of the header field. The value must be 1 to 128 characters in length, and can contain lowercase letters, printable ASCII characters whose values are ch &gt;= 32 &amp;&amp; ch &lt; 127, asterisks (*), and question marks (?). The value cannot start or end with a space.
     * 
     */
    public Optional<Output<List<RuleRuleConditionQueryStringConfigValueArgs>>> values() {
        return Optional.ofNullable(this.values);
    }

    private RuleRuleConditionQueryStringConfigArgs() {}

    private RuleRuleConditionQueryStringConfigArgs(RuleRuleConditionQueryStringConfigArgs $) {
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleRuleConditionQueryStringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleRuleConditionQueryStringConfigArgs $;

        public Builder() {
            $ = new RuleRuleConditionQueryStringConfigArgs();
        }

        public Builder(RuleRuleConditionQueryStringConfigArgs defaults) {
            $ = new RuleRuleConditionQueryStringConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param values The value of the header field. The value must be 1 to 128 characters in length, and can contain lowercase letters, printable ASCII characters whose values are ch &gt;= 32 &amp;&amp; ch &lt; 127, asterisks (*), and question marks (?). The value cannot start or end with a space.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<RuleRuleConditionQueryStringConfigValueArgs>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The value of the header field. The value must be 1 to 128 characters in length, and can contain lowercase letters, printable ASCII characters whose values are ch &gt;= 32 &amp;&amp; ch &lt; 127, asterisks (*), and question marks (?). The value cannot start or end with a space.
         * 
         * @return builder
         * 
         */
        public Builder values(List<RuleRuleConditionQueryStringConfigValueArgs> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The value of the header field. The value must be 1 to 128 characters in length, and can contain lowercase letters, printable ASCII characters whose values are ch &gt;= 32 &amp;&amp; ch &lt; 127, asterisks (*), and question marks (?). The value cannot start or end with a space.
         * 
         * @return builder
         * 
         */
        public Builder values(RuleRuleConditionQueryStringConfigValueArgs... values) {
            return values(List.of(values));
        }

        public RuleRuleConditionQueryStringConfigArgs build() {
            return $;
        }
    }

}
