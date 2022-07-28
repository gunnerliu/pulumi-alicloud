// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcEndpointZoneState extends com.pulumi.resources.ResourceArgs {

    public static final VpcEndpointZoneState Empty = new VpcEndpointZoneState();

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
    @Import(name="endpointId")
    private @Nullable Output<String> endpointId;

    /**
     * @return The ID of the Vpc Endpoint.
     * 
     */
    public Optional<Output<String>> endpointId() {
        return Optional.ofNullable(this.endpointId);
    }

    /**
     * Status.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The VSwitch id.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The VSwitch id.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    /**
     * The Zone Id.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The Zone Id.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private VpcEndpointZoneState() {}

    private VpcEndpointZoneState(VpcEndpointZoneState $) {
        this.dryRun = $.dryRun;
        this.endpointId = $.endpointId;
        this.status = $.status;
        this.vswitchId = $.vswitchId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcEndpointZoneState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcEndpointZoneState $;

        public Builder() {
            $ = new VpcEndpointZoneState();
        }

        public Builder(VpcEndpointZoneState defaults) {
            $ = new VpcEndpointZoneState(Objects.requireNonNull(defaults));
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
        public Builder endpointId(@Nullable Output<String> endpointId) {
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
         * @param status Status.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vswitchId The VSwitch id.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The VSwitch id.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        /**
         * @param zoneId The Zone Id.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The Zone Id.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public VpcEndpointZoneState build() {
            return $;
        }
    }

}
