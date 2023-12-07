// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEndpointGroupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEndpointGroupsPlainArgs Empty = new GetEndpointGroupsPlainArgs();

    /**
     * The ID of the Global Accelerator instance to which the endpoint group will be added.
     * 
     */
    @Import(name="acceleratorId", required=true)
    private String acceleratorId;

    /**
     * @return The ID of the Global Accelerator instance to which the endpoint group will be added.
     * 
     */
    public String acceleratorId() {
        return this.acceleratorId;
    }

    /**
     * The endpoint group type. Default value: `default`. Valid values: `default`, `virtual`.
     * 
     */
    @Import(name="endpointGroupType")
    private @Nullable String endpointGroupType;

    /**
     * @return The endpoint group type. Default value: `default`. Valid values: `default`, `virtual`.
     * 
     */
    public Optional<String> endpointGroupType() {
        return Optional.ofNullable(this.endpointGroupType);
    }

    /**
     * A list of Endpoint Group IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Endpoint Group IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The ID of the listener that is associated with the endpoint group.
     * 
     */
    @Import(name="listenerId")
    private @Nullable String listenerId;

    /**
     * @return The ID of the listener that is associated with the endpoint group.
     * 
     */
    public Optional<String> listenerId() {
        return Optional.ofNullable(this.listenerId);
    }

    /**
     * A regex string to filter results by Endpoint Group name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Endpoint Group name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The status of the endpoint group. Valid values: `active`, `configuring`, `creating`, `init`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the endpoint group. Valid values: `active`, `configuring`, `creating`, `init`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetEndpointGroupsPlainArgs() {}

    private GetEndpointGroupsPlainArgs(GetEndpointGroupsPlainArgs $) {
        this.acceleratorId = $.acceleratorId;
        this.endpointGroupType = $.endpointGroupType;
        this.ids = $.ids;
        this.listenerId = $.listenerId;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEndpointGroupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEndpointGroupsPlainArgs $;

        public Builder() {
            $ = new GetEndpointGroupsPlainArgs();
        }

        public Builder(GetEndpointGroupsPlainArgs defaults) {
            $ = new GetEndpointGroupsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorId The ID of the Global Accelerator instance to which the endpoint group will be added.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(String acceleratorId) {
            $.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * @param endpointGroupType The endpoint group type. Default value: `default`. Valid values: `default`, `virtual`.
         * 
         * @return builder
         * 
         */
        public Builder endpointGroupType(@Nullable String endpointGroupType) {
            $.endpointGroupType = endpointGroupType;
            return this;
        }

        /**
         * @param ids A list of Endpoint Group IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Endpoint Group IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param listenerId The ID of the listener that is associated with the endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder listenerId(@Nullable String listenerId) {
            $.listenerId = listenerId;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Endpoint Group name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param status The status of the endpoint group. Valid values: `active`, `configuring`, `creating`, `init`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetEndpointGroupsPlainArgs build() {
            $.acceleratorId = Objects.requireNonNull($.acceleratorId, "expected parameter 'acceleratorId' to be non-null");
            return $;
        }
    }

}
