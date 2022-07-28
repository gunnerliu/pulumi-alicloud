// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.inputs;

import com.pulumi.alicloud.ga.inputs.ForwardingRuleRuleActionForwardGroupConfigServerGroupTupleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class ForwardingRuleRuleActionForwardGroupConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ForwardingRuleRuleActionForwardGroupConfigArgs Empty = new ForwardingRuleRuleActionForwardGroupConfigArgs();

    /**
     * Terminal node group configuration.
     * 
     */
    @Import(name="serverGroupTuples", required=true)
    private Output<List<ForwardingRuleRuleActionForwardGroupConfigServerGroupTupleArgs>> serverGroupTuples;

    /**
     * @return Terminal node group configuration.
     * 
     */
    public Output<List<ForwardingRuleRuleActionForwardGroupConfigServerGroupTupleArgs>> serverGroupTuples() {
        return this.serverGroupTuples;
    }

    private ForwardingRuleRuleActionForwardGroupConfigArgs() {}

    private ForwardingRuleRuleActionForwardGroupConfigArgs(ForwardingRuleRuleActionForwardGroupConfigArgs $) {
        this.serverGroupTuples = $.serverGroupTuples;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ForwardingRuleRuleActionForwardGroupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ForwardingRuleRuleActionForwardGroupConfigArgs $;

        public Builder() {
            $ = new ForwardingRuleRuleActionForwardGroupConfigArgs();
        }

        public Builder(ForwardingRuleRuleActionForwardGroupConfigArgs defaults) {
            $ = new ForwardingRuleRuleActionForwardGroupConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serverGroupTuples Terminal node group configuration.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupTuples(Output<List<ForwardingRuleRuleActionForwardGroupConfigServerGroupTupleArgs>> serverGroupTuples) {
            $.serverGroupTuples = serverGroupTuples;
            return this;
        }

        /**
         * @param serverGroupTuples Terminal node group configuration.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupTuples(List<ForwardingRuleRuleActionForwardGroupConfigServerGroupTupleArgs> serverGroupTuples) {
            return serverGroupTuples(Output.of(serverGroupTuples));
        }

        /**
         * @param serverGroupTuples Terminal node group configuration.
         * 
         * @return builder
         * 
         */
        public Builder serverGroupTuples(ForwardingRuleRuleActionForwardGroupConfigServerGroupTupleArgs... serverGroupTuples) {
            return serverGroupTuples(List.of(serverGroupTuples));
        }

        public ForwardingRuleRuleActionForwardGroupConfigArgs build() {
            $.serverGroupTuples = Objects.requireNonNull($.serverGroupTuples, "expected parameter 'serverGroupTuples' to be non-null");
            return $;
        }
    }

}
