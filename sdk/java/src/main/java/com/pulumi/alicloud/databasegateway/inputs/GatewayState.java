// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.databasegateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayState extends com.pulumi.resources.ResourceArgs {

    public static final GatewayState Empty = new GatewayState();

    /**
     * The description of Gateway.
     * 
     */
    @Import(name="gatewayDesc")
    private @Nullable Output<String> gatewayDesc;

    /**
     * @return The description of Gateway.
     * 
     */
    public Optional<Output<String>> gatewayDesc() {
        return Optional.ofNullable(this.gatewayDesc);
    }

    /**
     * The name of the Gateway.
     * 
     */
    @Import(name="gatewayName")
    private @Nullable Output<String> gatewayName;

    /**
     * @return The name of the Gateway.
     * 
     */
    public Optional<Output<String>> gatewayName() {
        return Optional.ofNullable(this.gatewayName);
    }

    /**
     * The status of gateway. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of gateway. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GatewayState() {}

    private GatewayState(GatewayState $) {
        this.gatewayDesc = $.gatewayDesc;
        this.gatewayName = $.gatewayName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayState $;

        public Builder() {
            $ = new GatewayState();
        }

        public Builder(GatewayState defaults) {
            $ = new GatewayState(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayDesc The description of Gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayDesc(@Nullable Output<String> gatewayDesc) {
            $.gatewayDesc = gatewayDesc;
            return this;
        }

        /**
         * @param gatewayDesc The description of Gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayDesc(String gatewayDesc) {
            return gatewayDesc(Output.of(gatewayDesc));
        }

        /**
         * @param gatewayName The name of the Gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayName(@Nullable Output<String> gatewayName) {
            $.gatewayName = gatewayName;
            return this;
        }

        /**
         * @param gatewayName The name of the Gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayName(String gatewayName) {
            return gatewayName(Output.of(gatewayName));
        }

        /**
         * @param status The status of gateway. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of gateway. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GatewayState build() {
            return $;
        }
    }

}
