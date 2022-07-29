// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolScalingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolScalingConfigArgs Empty = new NodePoolScalingConfigArgs();

    /**
     * Peak EIP bandwidth. Its valid value range [1~500] in Mbps. Default to `5`.
     * 
     */
    @Import(name="eipBandwidth")
    private @Nullable Output<Integer> eipBandwidth;

    /**
     * @return Peak EIP bandwidth. Its valid value range [1~500] in Mbps. Default to `5`.
     * 
     */
    public Optional<Output<Integer>> eipBandwidth() {
        return Optional.ofNullable(this.eipBandwidth);
    }

    /**
     * EIP billing type. `PayByBandwidth`: Charged at fixed bandwidth. `PayByTraffic`: Billed as used traffic. Default: `PayByBandwidth`. Conflict with `internet_charge_type`, EIP and public network IP can only choose one.
     * 
     */
    @Import(name="eipInternetChargeType")
    private @Nullable Output<String> eipInternetChargeType;

    /**
     * @return EIP billing type. `PayByBandwidth`: Charged at fixed bandwidth. `PayByTraffic`: Billed as used traffic. Default: `PayByBandwidth`. Conflict with `internet_charge_type`, EIP and public network IP can only choose one.
     * 
     */
    public Optional<Output<String>> eipInternetChargeType() {
        return Optional.ofNullable(this.eipInternetChargeType);
    }

    /**
     * Whether to bind EIP for an instance. Default: `false`.
     * 
     */
    @Import(name="isBondEip")
    private @Nullable Output<Boolean> isBondEip;

    /**
     * @return Whether to bind EIP for an instance. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> isBondEip() {
        return Optional.ofNullable(this.isBondEip);
    }

    /**
     * Max number of instances in a auto scaling group, its valid value range [0~1000]. `max_size` has to be greater than `min_size`.
     * 
     */
    @Import(name="maxSize", required=true)
    private Output<Integer> maxSize;

    /**
     * @return Max number of instances in a auto scaling group, its valid value range [0~1000]. `max_size` has to be greater than `min_size`.
     * 
     */
    public Output<Integer> maxSize() {
        return this.maxSize;
    }

    /**
     * Min number of instances in a auto scaling group, its valid value range [0~1000].
     * 
     */
    @Import(name="minSize", required=true)
    private Output<Integer> minSize;

    /**
     * @return Min number of instances in a auto scaling group, its valid value range [0~1000].
     * 
     */
    public Output<Integer> minSize() {
        return this.minSize;
    }

    /**
     * Instance classification, not required. Vaild value: `cpu`, `gpu`, `gpushare` and `spot`. Default: `cpu`. The actual instance type is determined by `instance_types`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Instance classification, not required. Vaild value: `cpu`, `gpu`, `gpushare` and `spot`. Default: `cpu`. The actual instance type is determined by `instance_types`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private NodePoolScalingConfigArgs() {}

    private NodePoolScalingConfigArgs(NodePoolScalingConfigArgs $) {
        this.eipBandwidth = $.eipBandwidth;
        this.eipInternetChargeType = $.eipInternetChargeType;
        this.isBondEip = $.isBondEip;
        this.maxSize = $.maxSize;
        this.minSize = $.minSize;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolScalingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolScalingConfigArgs $;

        public Builder() {
            $ = new NodePoolScalingConfigArgs();
        }

        public Builder(NodePoolScalingConfigArgs defaults) {
            $ = new NodePoolScalingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eipBandwidth Peak EIP bandwidth. Its valid value range [1~500] in Mbps. Default to `5`.
         * 
         * @return builder
         * 
         */
        public Builder eipBandwidth(@Nullable Output<Integer> eipBandwidth) {
            $.eipBandwidth = eipBandwidth;
            return this;
        }

        /**
         * @param eipBandwidth Peak EIP bandwidth. Its valid value range [1~500] in Mbps. Default to `5`.
         * 
         * @return builder
         * 
         */
        public Builder eipBandwidth(Integer eipBandwidth) {
            return eipBandwidth(Output.of(eipBandwidth));
        }

        /**
         * @param eipInternetChargeType EIP billing type. `PayByBandwidth`: Charged at fixed bandwidth. `PayByTraffic`: Billed as used traffic. Default: `PayByBandwidth`. Conflict with `internet_charge_type`, EIP and public network IP can only choose one.
         * 
         * @return builder
         * 
         */
        public Builder eipInternetChargeType(@Nullable Output<String> eipInternetChargeType) {
            $.eipInternetChargeType = eipInternetChargeType;
            return this;
        }

        /**
         * @param eipInternetChargeType EIP billing type. `PayByBandwidth`: Charged at fixed bandwidth. `PayByTraffic`: Billed as used traffic. Default: `PayByBandwidth`. Conflict with `internet_charge_type`, EIP and public network IP can only choose one.
         * 
         * @return builder
         * 
         */
        public Builder eipInternetChargeType(String eipInternetChargeType) {
            return eipInternetChargeType(Output.of(eipInternetChargeType));
        }

        /**
         * @param isBondEip Whether to bind EIP for an instance. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder isBondEip(@Nullable Output<Boolean> isBondEip) {
            $.isBondEip = isBondEip;
            return this;
        }

        /**
         * @param isBondEip Whether to bind EIP for an instance. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder isBondEip(Boolean isBondEip) {
            return isBondEip(Output.of(isBondEip));
        }

        /**
         * @param maxSize Max number of instances in a auto scaling group, its valid value range [0~1000]. `max_size` has to be greater than `min_size`.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        /**
         * @param maxSize Max number of instances in a auto scaling group, its valid value range [0~1000]. `max_size` has to be greater than `min_size`.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        /**
         * @param minSize Min number of instances in a auto scaling group, its valid value range [0~1000].
         * 
         * @return builder
         * 
         */
        public Builder minSize(Output<Integer> minSize) {
            $.minSize = minSize;
            return this;
        }

        /**
         * @param minSize Min number of instances in a auto scaling group, its valid value range [0~1000].
         * 
         * @return builder
         * 
         */
        public Builder minSize(Integer minSize) {
            return minSize(Output.of(minSize));
        }

        /**
         * @param type Instance classification, not required. Vaild value: `cpu`, `gpu`, `gpushare` and `spot`. Default: `cpu`. The actual instance type is determined by `instance_types`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Instance classification, not required. Vaild value: `cpu`, `gpu`, `gpushare` and `spot`. Default: `cpu`. The actual instance type is determined by `instance_types`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NodePoolScalingConfigArgs build() {
            $.maxSize = Objects.requireNonNull($.maxSize, "expected parameter 'maxSize' to be non-null");
            $.minSize = Objects.requireNonNull($.minSize, "expected parameter 'minSize' to be non-null");
            return $;
        }
    }

}
