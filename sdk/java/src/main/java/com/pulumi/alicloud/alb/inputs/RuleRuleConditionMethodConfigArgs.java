// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleRuleConditionMethodConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleRuleConditionMethodConfigArgs Empty = new RuleRuleConditionMethodConfigArgs();

    /**
     * The query string.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return The query string.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private RuleRuleConditionMethodConfigArgs() {}

    private RuleRuleConditionMethodConfigArgs(RuleRuleConditionMethodConfigArgs $) {
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleRuleConditionMethodConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleRuleConditionMethodConfigArgs $;

        public Builder() {
            $ = new RuleRuleConditionMethodConfigArgs();
        }

        public Builder(RuleRuleConditionMethodConfigArgs defaults) {
            $ = new RuleRuleConditionMethodConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param values The query string.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The query string.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The query string.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public RuleRuleConditionMethodConfigArgs build() {
            return $;
        }
    }

}
