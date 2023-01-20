// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceTypeFamiliesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTypeFamiliesPlainArgs Empty = new GetInstanceTypeFamiliesPlainArgs();

    /**
     * The generation of the instance type family, Valid values: `ecs-1`, `ecs-2`, `ecs-3`, `ecs-4`, `ecs-5`, `ecs-6`. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.htm).
     * 
     */
    @Import(name="generation")
    private @Nullable String generation;

    /**
     * @return The generation of the instance type family, Valid values: `ecs-1`, `ecs-2`, `ecs-3`, `ecs-4`, `ecs-5`, `ecs-6`. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.htm).
     * 
     */
    public Optional<String> generation() {
        return Optional.ofNullable(this.generation);
    }

    /**
     * Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
     * 
     */
    @Import(name="instanceChargeType")
    private @Nullable String instanceChargeType;

    /**
     * @return Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
     * 
     */
    public Optional<String> instanceChargeType() {
        return Optional.ofNullable(this.instanceChargeType);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * Filter the results by ECS spot type. Valid values: `NoSpot`, `SpotWithPriceLimit` and `SpotAsPriceGo`. Default to `NoSpot`.
     * 
     */
    @Import(name="spotStrategy")
    private @Nullable String spotStrategy;

    /**
     * @return Filter the results by ECS spot type. Valid values: `NoSpot`, `SpotWithPriceLimit` and `SpotAsPriceGo`. Default to `NoSpot`.
     * 
     */
    public Optional<String> spotStrategy() {
        return Optional.ofNullable(this.spotStrategy);
    }

    /**
     * The Zone to launch the instance.
     * 
     */
    @Import(name="zoneId")
    private @Nullable String zoneId;

    /**
     * @return The Zone to launch the instance.
     * 
     */
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private GetInstanceTypeFamiliesPlainArgs() {}

    private GetInstanceTypeFamiliesPlainArgs(GetInstanceTypeFamiliesPlainArgs $) {
        this.generation = $.generation;
        this.instanceChargeType = $.instanceChargeType;
        this.outputFile = $.outputFile;
        this.spotStrategy = $.spotStrategy;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTypeFamiliesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTypeFamiliesPlainArgs $;

        public Builder() {
            $ = new GetInstanceTypeFamiliesPlainArgs();
        }

        public Builder(GetInstanceTypeFamiliesPlainArgs defaults) {
            $ = new GetInstanceTypeFamiliesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param generation The generation of the instance type family, Valid values: `ecs-1`, `ecs-2`, `ecs-3`, `ecs-4`, `ecs-5`, `ecs-6`. For more information, see [Instance type families](https://www.alibabacloud.com/help/doc-detail/25378.htm).
         * 
         * @return builder
         * 
         */
        public Builder generation(@Nullable String generation) {
            $.generation = generation;
            return this;
        }

        /**
         * @param instanceChargeType Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`.
         * 
         * @return builder
         * 
         */
        public Builder instanceChargeType(@Nullable String instanceChargeType) {
            $.instanceChargeType = instanceChargeType;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param spotStrategy Filter the results by ECS spot type. Valid values: `NoSpot`, `SpotWithPriceLimit` and `SpotAsPriceGo`. Default to `NoSpot`.
         * 
         * @return builder
         * 
         */
        public Builder spotStrategy(@Nullable String spotStrategy) {
            $.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * @param zoneId The Zone to launch the instance.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetInstanceTypeFamiliesPlainArgs build() {
            return $;
        }
    }

}
