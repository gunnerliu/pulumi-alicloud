// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBandwidthPackagesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBandwidthPackagesPlainArgs Empty = new GetBandwidthPackagesPlainArgs();

    /**
     * Limit search to a list of specific CEN Bandwidth Package IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return Limit search to a list of specific CEN Bandwidth Package IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Indicates whether to include renewal data. Valid values: `true`: Return renewal data in the response. `false`: Do not return renewal data in the response.
     * 
     */
    @Import(name="includeReservationData")
    private @Nullable Boolean includeReservationData;

    /**
     * @return Indicates whether to include renewal data. Valid values: `true`: Return renewal data in the response. `false`: Do not return renewal data in the response.
     * 
     */
    public Optional<Boolean> includeReservationData() {
        return Optional.ofNullable(this.includeReservationData);
    }

    /**
     * ID of a CEN instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable String instanceId;

    /**
     * @return ID of a CEN instance.
     * 
     */
    public Optional<String> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * A regex string to filter CEN Bandwidth Package by name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter CEN Bandwidth Package by name.
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
     * Status of the CEN Bandwidth Package in CEN instance, Valid value: `Idle` and `InUse`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Status of the CEN Bandwidth Package in CEN instance, Valid value: `Idle` and `InUse`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetBandwidthPackagesPlainArgs() {}

    private GetBandwidthPackagesPlainArgs(GetBandwidthPackagesPlainArgs $) {
        this.ids = $.ids;
        this.includeReservationData = $.includeReservationData;
        this.instanceId = $.instanceId;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBandwidthPackagesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBandwidthPackagesPlainArgs $;

        public Builder() {
            $ = new GetBandwidthPackagesPlainArgs();
        }

        public Builder(GetBandwidthPackagesPlainArgs defaults) {
            $ = new GetBandwidthPackagesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids Limit search to a list of specific CEN Bandwidth Package IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids Limit search to a list of specific CEN Bandwidth Package IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param includeReservationData Indicates whether to include renewal data. Valid values: `true`: Return renewal data in the response. `false`: Do not return renewal data in the response.
         * 
         * @return builder
         * 
         */
        public Builder includeReservationData(@Nullable Boolean includeReservationData) {
            $.includeReservationData = includeReservationData;
            return this;
        }

        /**
         * @param instanceId ID of a CEN instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter CEN Bandwidth Package by name.
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
         * @param status Status of the CEN Bandwidth Package in CEN instance, Valid value: `Idle` and `InUse`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetBandwidthPackagesPlainArgs build() {
            return $;
        }
    }

}
