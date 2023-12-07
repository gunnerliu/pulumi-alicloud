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


public final class RuleRuleConditionResponseStatusCodeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleRuleConditionResponseStatusCodeConfigArgs Empty = new RuleRuleConditionResponseStatusCodeConfigArgs();

    /**
     * Add one or more IP addresses or IP address segments. You can add up to 5 forwarding rules in a SourceIp.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return Add one or more IP addresses or IP address segments. You can add up to 5 forwarding rules in a SourceIp.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private RuleRuleConditionResponseStatusCodeConfigArgs() {}

    private RuleRuleConditionResponseStatusCodeConfigArgs(RuleRuleConditionResponseStatusCodeConfigArgs $) {
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleRuleConditionResponseStatusCodeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleRuleConditionResponseStatusCodeConfigArgs $;

        public Builder() {
            $ = new RuleRuleConditionResponseStatusCodeConfigArgs();
        }

        public Builder(RuleRuleConditionResponseStatusCodeConfigArgs defaults) {
            $ = new RuleRuleConditionResponseStatusCodeConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param values Add one or more IP addresses or IP address segments. You can add up to 5 forwarding rules in a SourceIp.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Add one or more IP addresses or IP address segments. You can add up to 5 forwarding rules in a SourceIp.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Add one or more IP addresses or IP address segments. You can add up to 5 forwarding rules in a SourceIp.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public RuleRuleConditionResponseStatusCodeConfigArgs build() {
            return $;
        }
    }

}
