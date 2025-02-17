// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcEndpointConnectionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcEndpointConnectionsPlainArgs Empty = new GetVpcEndpointConnectionsPlainArgs();

    /**
     * The ID of the Vpc Endpoint.
     * 
     */
    @Import(name="endpointId")
    private @Nullable String endpointId;

    /**
     * @return The ID of the Vpc Endpoint.
     * 
     */
    public Optional<String> endpointId() {
        return Optional.ofNullable(this.endpointId);
    }

    /**
     * The endpoint owner id.
     * 
     */
    @Import(name="endpointOwnerId")
    private @Nullable Integer endpointOwnerId;

    /**
     * @return The endpoint owner id.
     * 
     */
    public Optional<Integer> endpointOwnerId() {
        return Optional.ofNullable(this.endpointOwnerId);
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
     * The ID of the Vpc Endpoint Service.
     * 
     */
    @Import(name="serviceId", required=true)
    private String serviceId;

    /**
     * @return The ID of the Vpc Endpoint Service.
     * 
     */
    public String serviceId() {
        return this.serviceId;
    }

    /**
     * The status of Vpc Endpoint Connection.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of Vpc Endpoint Connection.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetVpcEndpointConnectionsPlainArgs() {}

    private GetVpcEndpointConnectionsPlainArgs(GetVpcEndpointConnectionsPlainArgs $) {
        this.endpointId = $.endpointId;
        this.endpointOwnerId = $.endpointOwnerId;
        this.outputFile = $.outputFile;
        this.serviceId = $.serviceId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcEndpointConnectionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcEndpointConnectionsPlainArgs $;

        public Builder() {
            $ = new GetVpcEndpointConnectionsPlainArgs();
        }

        public Builder(GetVpcEndpointConnectionsPlainArgs defaults) {
            $ = new GetVpcEndpointConnectionsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointId The ID of the Vpc Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointId(@Nullable String endpointId) {
            $.endpointId = endpointId;
            return this;
        }

        /**
         * @param endpointOwnerId The endpoint owner id.
         * 
         * @return builder
         * 
         */
        public Builder endpointOwnerId(@Nullable Integer endpointOwnerId) {
            $.endpointOwnerId = endpointOwnerId;
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
         * @param serviceId The ID of the Vpc Endpoint Service.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param status The status of Vpc Endpoint Connection.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetVpcEndpointConnectionsPlainArgs build() {
            if ($.serviceId == null) {
                throw new MissingRequiredPropertyException("GetVpcEndpointConnectionsPlainArgs", "serviceId");
            }
            return $;
        }
    }

}
