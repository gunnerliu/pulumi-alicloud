// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCapacityReservationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCapacityReservationsPlainArgs Empty = new GetCapacityReservationsPlainArgs();

    @Import(name="capacityReservationIds")
    private @Nullable List<String> capacityReservationIds;

    public Optional<List<String>> capacityReservationIds() {
        return Optional.ofNullable(this.capacityReservationIds);
    }

    /**
     * A list of Capacity Reservation IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Capacity Reservation IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Instance type. Currently, you can only set the capacity reservation service for one instance type.
     * 
     */
    @Import(name="instanceType")
    private @Nullable String instanceType;

    /**
     * @return Instance type. Currently, you can only set the capacity reservation service for one instance type.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * A regex string to filter results by Group Metric Rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Group Metric Rule name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The payment type of the resource. value range `PostPaid`, `PrePaid`.
     * 
     */
    @Import(name="paymentType")
    private @Nullable String paymentType;

    /**
     * @return The payment type of the resource. value range `PostPaid`, `PrePaid`.
     * 
     */
    public Optional<String> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * platform of the capacity reservation , value range `windows`, `linux`, `all`.
     * 
     */
    @Import(name="platform")
    private @Nullable String platform;

    /**
     * @return platform of the capacity reservation , value range `windows`, `linux`, `all`.
     * 
     */
    public Optional<String> platform() {
        return Optional.ofNullable(this.platform);
    }

    /**
     * The resource group id.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable String resourceGroupId;

    /**
     * @return The resource group id.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The status of the capacity reservation. value range `All`, `Pending`, `Preparing`, `Prepared`, `Active`, `Released`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the capacity reservation. value range `All`, `Pending`, `Preparing`, `Prepared`, `Active`, `Released`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The tag of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,Object> tags;

    /**
     * @return The tag of the resource.
     * 
     */
    public Optional<Map<String,Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetCapacityReservationsPlainArgs() {}

    private GetCapacityReservationsPlainArgs(GetCapacityReservationsPlainArgs $) {
        this.capacityReservationIds = $.capacityReservationIds;
        this.ids = $.ids;
        this.instanceType = $.instanceType;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.paymentType = $.paymentType;
        this.platform = $.platform;
        this.resourceGroupId = $.resourceGroupId;
        this.status = $.status;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCapacityReservationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCapacityReservationsPlainArgs $;

        public Builder() {
            $ = new GetCapacityReservationsPlainArgs();
        }

        public Builder(GetCapacityReservationsPlainArgs defaults) {
            $ = new GetCapacityReservationsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacityReservationIds(@Nullable List<String> capacityReservationIds) {
            $.capacityReservationIds = capacityReservationIds;
            return this;
        }

        public Builder capacityReservationIds(String... capacityReservationIds) {
            return capacityReservationIds(List.of(capacityReservationIds));
        }

        /**
         * @param ids A list of Capacity Reservation IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Capacity Reservation IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param instanceType Instance type. Currently, you can only set the capacity reservation service for one instance type.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable String instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Group Metric Rule name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param paymentType The payment type of the resource. value range `PostPaid`, `PrePaid`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable String paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param platform platform of the capacity reservation , value range `windows`, `linux`, `all`.
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable String platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param resourceGroupId The resource group id.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param status The status of the capacity reservation. value range `All`, `Pending`, `Preparing`, `Prepared`, `Active`, `Released`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param tags The tag of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,Object> tags) {
            $.tags = tags;
            return this;
        }

        public GetCapacityReservationsPlainArgs build() {
            return $;
        }
    }

}
