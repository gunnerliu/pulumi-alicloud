// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.inputs;

import com.pulumi.alicloud.cr.inputs.ChainChainConfigNodeArgs;
import com.pulumi.alicloud.cr.inputs.ChainChainConfigRouterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChainChainConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChainChainConfigArgs Empty = new ChainChainConfigArgs();

    /**
     * Each node in the delivery chain.
     * 
     */
    @Import(name="nodes")
    private @Nullable Output<List<ChainChainConfigNodeArgs>> nodes;

    /**
     * @return Each node in the delivery chain.
     * 
     */
    public Optional<Output<List<ChainChainConfigNodeArgs>>> nodes() {
        return Optional.ofNullable(this.nodes);
    }

    /**
     * Execution sequence relationship between delivery chain nodes.
     * 
     */
    @Import(name="routers")
    private @Nullable Output<List<ChainChainConfigRouterArgs>> routers;

    /**
     * @return Execution sequence relationship between delivery chain nodes.
     * 
     */
    public Optional<Output<List<ChainChainConfigRouterArgs>>> routers() {
        return Optional.ofNullable(this.routers);
    }

    private ChainChainConfigArgs() {}

    private ChainChainConfigArgs(ChainChainConfigArgs $) {
        this.nodes = $.nodes;
        this.routers = $.routers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChainChainConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChainChainConfigArgs $;

        public Builder() {
            $ = new ChainChainConfigArgs();
        }

        public Builder(ChainChainConfigArgs defaults) {
            $ = new ChainChainConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodes Each node in the delivery chain.
         * 
         * @return builder
         * 
         */
        public Builder nodes(@Nullable Output<List<ChainChainConfigNodeArgs>> nodes) {
            $.nodes = nodes;
            return this;
        }

        /**
         * @param nodes Each node in the delivery chain.
         * 
         * @return builder
         * 
         */
        public Builder nodes(List<ChainChainConfigNodeArgs> nodes) {
            return nodes(Output.of(nodes));
        }

        /**
         * @param nodes Each node in the delivery chain.
         * 
         * @return builder
         * 
         */
        public Builder nodes(ChainChainConfigNodeArgs... nodes) {
            return nodes(List.of(nodes));
        }

        /**
         * @param routers Execution sequence relationship between delivery chain nodes.
         * 
         * @return builder
         * 
         */
        public Builder routers(@Nullable Output<List<ChainChainConfigRouterArgs>> routers) {
            $.routers = routers;
            return this;
        }

        /**
         * @param routers Execution sequence relationship between delivery chain nodes.
         * 
         * @return builder
         * 
         */
        public Builder routers(List<ChainChainConfigRouterArgs> routers) {
            return routers(Output.of(routers));
        }

        /**
         * @param routers Execution sequence relationship between delivery chain nodes.
         * 
         * @return builder
         * 
         */
        public Builder routers(ChainChainConfigRouterArgs... routers) {
            return routers(List.of(routers));
        }

        public ChainChainConfigArgs build() {
            return $;
        }
    }

}
