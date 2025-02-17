// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolManagementArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolManagementArgs Empty = new NodePoolManagementArgs();

    /**
     * Whether automatic repair, Default to `false`.
     * 
     */
    @Import(name="autoRepair")
    private @Nullable Output<Boolean> autoRepair;

    /**
     * @return Whether automatic repair, Default to `false`.
     * 
     */
    public Optional<Output<Boolean>> autoRepair() {
        return Optional.ofNullable(this.autoRepair);
    }

    /**
     * Whether auto upgrade, Default to `false`.
     * 
     */
    @Import(name="autoUpgrade")
    private @Nullable Output<Boolean> autoUpgrade;

    /**
     * @return Whether auto upgrade, Default to `false`.
     * 
     */
    public Optional<Output<Boolean>> autoUpgrade() {
        return Optional.ofNullable(this.autoUpgrade);
    }

    /**
     * Max number of unavailable nodes. Default to `1`.
     * 
     */
    @Import(name="maxUnavailable", required=true)
    private Output<Integer> maxUnavailable;

    /**
     * @return Max number of unavailable nodes. Default to `1`.
     * 
     */
    public Output<Integer> maxUnavailable() {
        return this.maxUnavailable;
    }

    /**
     * Number of additional nodes. You have to specify one of surge, surge_percentage.
     * 
     */
    @Import(name="surge")
    private @Nullable Output<Integer> surge;

    /**
     * @return Number of additional nodes. You have to specify one of surge, surge_percentage.
     * 
     */
    public Optional<Output<Integer>> surge() {
        return Optional.ofNullable(this.surge);
    }

    /**
     * Proportion of additional nodes. You have to specify one of surge, surge_percentage.
     * 
     */
    @Import(name="surgePercentage")
    private @Nullable Output<Integer> surgePercentage;

    /**
     * @return Proportion of additional nodes. You have to specify one of surge, surge_percentage.
     * 
     */
    public Optional<Output<Integer>> surgePercentage() {
        return Optional.ofNullable(this.surgePercentage);
    }

    private NodePoolManagementArgs() {}

    private NodePoolManagementArgs(NodePoolManagementArgs $) {
        this.autoRepair = $.autoRepair;
        this.autoUpgrade = $.autoUpgrade;
        this.maxUnavailable = $.maxUnavailable;
        this.surge = $.surge;
        this.surgePercentage = $.surgePercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolManagementArgs $;

        public Builder() {
            $ = new NodePoolManagementArgs();
        }

        public Builder(NodePoolManagementArgs defaults) {
            $ = new NodePoolManagementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoRepair Whether automatic repair, Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoRepair(@Nullable Output<Boolean> autoRepair) {
            $.autoRepair = autoRepair;
            return this;
        }

        /**
         * @param autoRepair Whether automatic repair, Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoRepair(Boolean autoRepair) {
            return autoRepair(Output.of(autoRepair));
        }

        /**
         * @param autoUpgrade Whether auto upgrade, Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgrade(@Nullable Output<Boolean> autoUpgrade) {
            $.autoUpgrade = autoUpgrade;
            return this;
        }

        /**
         * @param autoUpgrade Whether auto upgrade, Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgrade(Boolean autoUpgrade) {
            return autoUpgrade(Output.of(autoUpgrade));
        }

        /**
         * @param maxUnavailable Max number of unavailable nodes. Default to `1`.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(Output<Integer> maxUnavailable) {
            $.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * @param maxUnavailable Max number of unavailable nodes. Default to `1`.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(Integer maxUnavailable) {
            return maxUnavailable(Output.of(maxUnavailable));
        }

        /**
         * @param surge Number of additional nodes. You have to specify one of surge, surge_percentage.
         * 
         * @return builder
         * 
         */
        public Builder surge(@Nullable Output<Integer> surge) {
            $.surge = surge;
            return this;
        }

        /**
         * @param surge Number of additional nodes. You have to specify one of surge, surge_percentage.
         * 
         * @return builder
         * 
         */
        public Builder surge(Integer surge) {
            return surge(Output.of(surge));
        }

        /**
         * @param surgePercentage Proportion of additional nodes. You have to specify one of surge, surge_percentage.
         * 
         * @return builder
         * 
         */
        public Builder surgePercentage(@Nullable Output<Integer> surgePercentage) {
            $.surgePercentage = surgePercentage;
            return this;
        }

        /**
         * @param surgePercentage Proportion of additional nodes. You have to specify one of surge, surge_percentage.
         * 
         * @return builder
         * 
         */
        public Builder surgePercentage(Integer surgePercentage) {
            return surgePercentage(Output.of(surgePercentage));
        }

        public NodePoolManagementArgs build() {
            if ($.maxUnavailable == null) {
                throw new MissingRequiredPropertyException("NodePoolManagementArgs", "maxUnavailable");
            }
            return $;
        }
    }

}
