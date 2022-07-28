// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcEndpointServiceConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcEndpointServiceConnectionArgs Empty = new VpcEndpointServiceConnectionArgs();

    /**
     * The Bandwidth.
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<Integer> bandwidth;

    /**
     * @return The Bandwidth.
     * 
     */
    public Optional<Output<Integer>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * The dry run.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The ID of the Vpc Endpoint.
     * 
     */
    @Import(name="endpointId", required=true)
    private Output<String> endpointId;

    /**
     * @return The ID of the Vpc Endpoint.
     * 
     */
    public Output<String> endpointId() {
        return this.endpointId;
    }

    /**
     * The ID of the Vpc Endpoint Service.
     * 
     */
    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    /**
     * @return The ID of the Vpc Endpoint Service.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    private VpcEndpointServiceConnectionArgs() {}

    private VpcEndpointServiceConnectionArgs(VpcEndpointServiceConnectionArgs $) {
        this.bandwidth = $.bandwidth;
        this.dryRun = $.dryRun;
        this.endpointId = $.endpointId;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcEndpointServiceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcEndpointServiceConnectionArgs $;

        public Builder() {
            $ = new VpcEndpointServiceConnectionArgs();
        }

        public Builder(VpcEndpointServiceConnectionArgs defaults) {
            $ = new VpcEndpointServiceConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidth The Bandwidth.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<Integer> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth The Bandwidth.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Integer bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param dryRun The dry run.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun The dry run.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param endpointId The ID of the Vpc Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointId(Output<String> endpointId) {
            $.endpointId = endpointId;
            return this;
        }

        /**
         * @param endpointId The ID of the Vpc Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointId(String endpointId) {
            return endpointId(Output.of(endpointId));
        }

        /**
         * @param serviceId The ID of the Vpc Endpoint Service.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The ID of the Vpc Endpoint Service.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public VpcEndpointServiceConnectionArgs build() {
            $.endpointId = Objects.requireNonNull($.endpointId, "expected parameter 'endpointId' to be non-null");
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            return $;
        }
    }

}
