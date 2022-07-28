// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAckServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAckServicePlainArgs Empty = new GetAckServicePlainArgs();

    /**
     * Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
     * 
     */
    @Import(name="enable")
    private @Nullable String enable;

    /**
     * @return Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
     * 
     */
    public Optional<String> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * Types of services opened. Valid values: `propayasgo`: Container service ack Pro managed version, `edgepayasgo`: Edge container service, `gspayasgo`: Gene computing services.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Types of services opened. Valid values: `propayasgo`: Container service ack Pro managed version, `edgepayasgo`: Edge container service, `gspayasgo`: Gene computing services.
     * 
     */
    public String type() {
        return this.type;
    }

    private GetAckServicePlainArgs() {}

    private GetAckServicePlainArgs(GetAckServicePlainArgs $) {
        this.enable = $.enable;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAckServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAckServicePlainArgs $;

        public Builder() {
            $ = new GetAckServicePlainArgs();
        }

        public Builder(GetAckServicePlainArgs defaults) {
            $ = new GetAckServicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable String enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param type Types of services opened. Valid values: `propayasgo`: Container service ack Pro managed version, `edgepayasgo`: Edge container service, `gspayasgo`: Gene computing services.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetAckServicePlainArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
