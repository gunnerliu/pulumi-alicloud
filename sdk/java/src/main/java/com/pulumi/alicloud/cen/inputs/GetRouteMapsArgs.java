// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouteMapsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouteMapsArgs Empty = new GetRouteMapsArgs();

    /**
     * The ID of the CEN instance.
     * 
     */
    @Import(name="cenId", required=true)
    private Output<String> cenId;

    /**
     * @return The ID of the CEN instance.
     * 
     */
    public Output<String> cenId() {
        return this.cenId;
    }

    /**
     * The ID of the region to which the CEN instance belongs.
     * 
     */
    @Import(name="cenRegionId")
    private @Nullable Output<String> cenRegionId;

    /**
     * @return The ID of the region to which the CEN instance belongs.
     * 
     */
    public Optional<Output<String>> cenRegionId() {
        return Optional.ofNullable(this.cenRegionId);
    }

    /**
     * A regex string to filter CEN route map by description.
     * 
     */
    @Import(name="descriptionRegex")
    private @Nullable Output<String> descriptionRegex;

    /**
     * @return A regex string to filter CEN route map by description.
     * 
     */
    public Optional<Output<String>> descriptionRegex() {
        return Optional.ofNullable(this.descriptionRegex);
    }

    /**
     * A list of CEN route map IDs. Each item formats as `&lt;cen_id&gt;:&lt;route_map_id&gt;`.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of CEN route map IDs. Each item formats as `&lt;cen_id&gt;:&lt;route_map_id&gt;`.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The status of the route map, including `Creating`, `Active` and `Deleting`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the route map, including `Creating`, `Active` and `Deleting`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The direction in which the route map is applied, including `RegionIn` and `RegionOut`.
     * 
     */
    @Import(name="transmitDirection")
    private @Nullable Output<String> transmitDirection;

    /**
     * @return The direction in which the route map is applied, including `RegionIn` and `RegionOut`.
     * 
     */
    public Optional<Output<String>> transmitDirection() {
        return Optional.ofNullable(this.transmitDirection);
    }

    private GetRouteMapsArgs() {}

    private GetRouteMapsArgs(GetRouteMapsArgs $) {
        this.cenId = $.cenId;
        this.cenRegionId = $.cenRegionId;
        this.descriptionRegex = $.descriptionRegex;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.status = $.status;
        this.transmitDirection = $.transmitDirection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouteMapsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouteMapsArgs $;

        public Builder() {
            $ = new GetRouteMapsArgs();
        }

        public Builder(GetRouteMapsArgs defaults) {
            $ = new GetRouteMapsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cenId The ID of the CEN instance.
         * 
         * @return builder
         * 
         */
        public Builder cenId(Output<String> cenId) {
            $.cenId = cenId;
            return this;
        }

        /**
         * @param cenId The ID of the CEN instance.
         * 
         * @return builder
         * 
         */
        public Builder cenId(String cenId) {
            return cenId(Output.of(cenId));
        }

        /**
         * @param cenRegionId The ID of the region to which the CEN instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder cenRegionId(@Nullable Output<String> cenRegionId) {
            $.cenRegionId = cenRegionId;
            return this;
        }

        /**
         * @param cenRegionId The ID of the region to which the CEN instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder cenRegionId(String cenRegionId) {
            return cenRegionId(Output.of(cenRegionId));
        }

        /**
         * @param descriptionRegex A regex string to filter CEN route map by description.
         * 
         * @return builder
         * 
         */
        public Builder descriptionRegex(@Nullable Output<String> descriptionRegex) {
            $.descriptionRegex = descriptionRegex;
            return this;
        }

        /**
         * @param descriptionRegex A regex string to filter CEN route map by description.
         * 
         * @return builder
         * 
         */
        public Builder descriptionRegex(String descriptionRegex) {
            return descriptionRegex(Output.of(descriptionRegex));
        }

        /**
         * @param ids A list of CEN route map IDs. Each item formats as `&lt;cen_id&gt;:&lt;route_map_id&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of CEN route map IDs. Each item formats as `&lt;cen_id&gt;:&lt;route_map_id&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of CEN route map IDs. Each item formats as `&lt;cen_id&gt;:&lt;route_map_id&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param status The status of the route map, including `Creating`, `Active` and `Deleting`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the route map, including `Creating`, `Active` and `Deleting`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param transmitDirection The direction in which the route map is applied, including `RegionIn` and `RegionOut`.
         * 
         * @return builder
         * 
         */
        public Builder transmitDirection(@Nullable Output<String> transmitDirection) {
            $.transmitDirection = transmitDirection;
            return this;
        }

        /**
         * @param transmitDirection The direction in which the route map is applied, including `RegionIn` and `RegionOut`.
         * 
         * @return builder
         * 
         */
        public Builder transmitDirection(String transmitDirection) {
            return transmitDirection(Output.of(transmitDirection));
        }

        public GetRouteMapsArgs build() {
            $.cenId = Objects.requireNonNull($.cenId, "expected parameter 'cenId' to be non-null");
            return $;
        }
    }

}
