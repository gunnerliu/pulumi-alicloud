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


public final class GetTransitRouteTableAggregationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitRouteTableAggregationsArgs Empty = new GetTransitRouteTableAggregationsArgs();

    /**
     * A list of Transit Route Table Aggregation IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Transit Route Table Aggregation IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Transit Route Table Aggregation name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Transit Route Table Aggregation name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The status of Transit Route Table Aggregation. Valid Values: `AllConfigured`, `Configuring`, `ConfigFailed`, `PartialConfigured`, `Deleting`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of Transit Route Table Aggregation. Valid Values: `AllConfigured`, `Configuring`, `ConfigFailed`, `PartialConfigured`, `Deleting`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The destination CIDR block of the aggregate route.
     * 
     */
    @Import(name="transitRouteTableAggregationCidr")
    private @Nullable Output<String> transitRouteTableAggregationCidr;

    /**
     * @return The destination CIDR block of the aggregate route.
     * 
     */
    public Optional<Output<String>> transitRouteTableAggregationCidr() {
        return Optional.ofNullable(this.transitRouteTableAggregationCidr);
    }

    /**
     * The ID of the route table of the Enterprise Edition transit router.
     * 
     */
    @Import(name="transitRouteTableId", required=true)
    private Output<String> transitRouteTableId;

    /**
     * @return The ID of the route table of the Enterprise Edition transit router.
     * 
     */
    public Output<String> transitRouteTableId() {
        return this.transitRouteTableId;
    }

    private GetTransitRouteTableAggregationsArgs() {}

    private GetTransitRouteTableAggregationsArgs(GetTransitRouteTableAggregationsArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
        this.transitRouteTableAggregationCidr = $.transitRouteTableAggregationCidr;
        this.transitRouteTableId = $.transitRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitRouteTableAggregationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitRouteTableAggregationsArgs $;

        public Builder() {
            $ = new GetTransitRouteTableAggregationsArgs();
        }

        public Builder(GetTransitRouteTableAggregationsArgs defaults) {
            $ = new GetTransitRouteTableAggregationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Transit Route Table Aggregation IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Transit Route Table Aggregation IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Transit Route Table Aggregation IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Transit Route Table Aggregation name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Transit Route Table Aggregation name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param status The status of Transit Route Table Aggregation. Valid Values: `AllConfigured`, `Configuring`, `ConfigFailed`, `PartialConfigured`, `Deleting`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of Transit Route Table Aggregation. Valid Values: `AllConfigured`, `Configuring`, `ConfigFailed`, `PartialConfigured`, `Deleting`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param transitRouteTableAggregationCidr The destination CIDR block of the aggregate route.
         * 
         * @return builder
         * 
         */
        public Builder transitRouteTableAggregationCidr(@Nullable Output<String> transitRouteTableAggregationCidr) {
            $.transitRouteTableAggregationCidr = transitRouteTableAggregationCidr;
            return this;
        }

        /**
         * @param transitRouteTableAggregationCidr The destination CIDR block of the aggregate route.
         * 
         * @return builder
         * 
         */
        public Builder transitRouteTableAggregationCidr(String transitRouteTableAggregationCidr) {
            return transitRouteTableAggregationCidr(Output.of(transitRouteTableAggregationCidr));
        }

        /**
         * @param transitRouteTableId The ID of the route table of the Enterprise Edition transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouteTableId(Output<String> transitRouteTableId) {
            $.transitRouteTableId = transitRouteTableId;
            return this;
        }

        /**
         * @param transitRouteTableId The ID of the route table of the Enterprise Edition transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouteTableId(String transitRouteTableId) {
            return transitRouteTableId(Output.of(transitRouteTableId));
        }

        public GetTransitRouteTableAggregationsArgs build() {
            $.transitRouteTableId = Objects.requireNonNull($.transitRouteTableId, "expected parameter 'transitRouteTableId' to be non-null");
            return $;
        }
    }

}
