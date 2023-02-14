// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.inputs;

import com.pulumi.alicloud.cr.inputs.ChainChainConfigRouterFromArgs;
import com.pulumi.alicloud.cr.inputs.ChainChainConfigRouterToArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChainChainConfigRouterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChainChainConfigRouterArgs Empty = new ChainChainConfigRouterArgs();

    /**
     * Source node.
     * 
     */
    @Import(name="froms")
    private @Nullable Output<List<ChainChainConfigRouterFromArgs>> froms;

    /**
     * @return Source node.
     * 
     */
    public Optional<Output<List<ChainChainConfigRouterFromArgs>>> froms() {
        return Optional.ofNullable(this.froms);
    }

    /**
     * Destination node.
     * 
     */
    @Import(name="tos")
    private @Nullable Output<List<ChainChainConfigRouterToArgs>> tos;

    /**
     * @return Destination node.
     * 
     */
    public Optional<Output<List<ChainChainConfigRouterToArgs>>> tos() {
        return Optional.ofNullable(this.tos);
    }

    private ChainChainConfigRouterArgs() {}

    private ChainChainConfigRouterArgs(ChainChainConfigRouterArgs $) {
        this.froms = $.froms;
        this.tos = $.tos;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChainChainConfigRouterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChainChainConfigRouterArgs $;

        public Builder() {
            $ = new ChainChainConfigRouterArgs();
        }

        public Builder(ChainChainConfigRouterArgs defaults) {
            $ = new ChainChainConfigRouterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param froms Source node.
         * 
         * @return builder
         * 
         */
        public Builder froms(@Nullable Output<List<ChainChainConfigRouterFromArgs>> froms) {
            $.froms = froms;
            return this;
        }

        /**
         * @param froms Source node.
         * 
         * @return builder
         * 
         */
        public Builder froms(List<ChainChainConfigRouterFromArgs> froms) {
            return froms(Output.of(froms));
        }

        /**
         * @param froms Source node.
         * 
         * @return builder
         * 
         */
        public Builder froms(ChainChainConfigRouterFromArgs... froms) {
            return froms(List.of(froms));
        }

        /**
         * @param tos Destination node.
         * 
         * @return builder
         * 
         */
        public Builder tos(@Nullable Output<List<ChainChainConfigRouterToArgs>> tos) {
            $.tos = tos;
            return this;
        }

        /**
         * @param tos Destination node.
         * 
         * @return builder
         * 
         */
        public Builder tos(List<ChainChainConfigRouterToArgs> tos) {
            return tos(Output.of(tos));
        }

        /**
         * @param tos Destination node.
         * 
         * @return builder
         * 
         */
        public Builder tos(ChainChainConfigRouterToArgs... tos) {
            return tos(List.of(tos));
        }

        public ChainChainConfigRouterArgs build() {
            return $;
        }
    }

}