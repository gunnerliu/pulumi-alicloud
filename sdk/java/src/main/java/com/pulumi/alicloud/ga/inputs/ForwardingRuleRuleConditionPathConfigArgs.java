// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ForwardingRuleRuleConditionPathConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ForwardingRuleRuleConditionPathConfigArgs Empty = new ForwardingRuleRuleConditionPathConfigArgs();

    /**
     * The domain name is 3-128 characters long, which can contain letters, numbers, dashes (-) and width period (.), and supports the use of asterisk (*) and width question mark (?) as wildcard characters.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return The domain name is 3-128 characters long, which can contain letters, numbers, dashes (-) and width period (.), and supports the use of asterisk (*) and width question mark (?) as wildcard characters.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ForwardingRuleRuleConditionPathConfigArgs() {}

    private ForwardingRuleRuleConditionPathConfigArgs(ForwardingRuleRuleConditionPathConfigArgs $) {
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ForwardingRuleRuleConditionPathConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ForwardingRuleRuleConditionPathConfigArgs $;

        public Builder() {
            $ = new ForwardingRuleRuleConditionPathConfigArgs();
        }

        public Builder(ForwardingRuleRuleConditionPathConfigArgs defaults) {
            $ = new ForwardingRuleRuleConditionPathConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param values The domain name is 3-128 characters long, which can contain letters, numbers, dashes (-) and width period (.), and supports the use of asterisk (*) and width question mark (?) as wildcard characters.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The domain name is 3-128 characters long, which can contain letters, numbers, dashes (-) and width period (.), and supports the use of asterisk (*) and width question mark (?) as wildcard characters.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The domain name is 3-128 characters long, which can contain letters, numbers, dashes (-) and width period (.), and supports the use of asterisk (*) and width question mark (?) as wildcard characters.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ForwardingRuleRuleConditionPathConfigArgs build() {
            return $;
        }
    }

}
