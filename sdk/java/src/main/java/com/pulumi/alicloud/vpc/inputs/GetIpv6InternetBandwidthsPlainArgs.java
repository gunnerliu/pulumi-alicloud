// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpv6InternetBandwidthsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpv6InternetBandwidthsPlainArgs Empty = new GetIpv6InternetBandwidthsPlainArgs();

    /**
     * A list of Ipv6 Internet Bandwidth IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Ipv6 Internet Bandwidth IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The ID of the IPv6 address.
     * 
     */
    @Import(name="ipv6AddressId")
    private @Nullable String ipv6AddressId;

    /**
     * @return The ID of the IPv6 address.
     * 
     */
    public Optional<String> ipv6AddressId() {
        return Optional.ofNullable(this.ipv6AddressId);
    }

    /**
     * The ID of the Ipv6 Internet Bandwidth.
     * 
     */
    @Import(name="ipv6InternetBandwidthId")
    private @Nullable String ipv6InternetBandwidthId;

    /**
     * @return The ID of the Ipv6 Internet Bandwidth.
     * 
     */
    public Optional<String> ipv6InternetBandwidthId() {
        return Optional.ofNullable(this.ipv6InternetBandwidthId);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The status of the resource. Valid values: `Normal`, `FinancialLocked` and `SecurityLocked`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the resource. Valid values: `Normal`, `FinancialLocked` and `SecurityLocked`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetIpv6InternetBandwidthsPlainArgs() {}

    private GetIpv6InternetBandwidthsPlainArgs(GetIpv6InternetBandwidthsPlainArgs $) {
        this.ids = $.ids;
        this.ipv6AddressId = $.ipv6AddressId;
        this.ipv6InternetBandwidthId = $.ipv6InternetBandwidthId;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpv6InternetBandwidthsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpv6InternetBandwidthsPlainArgs $;

        public Builder() {
            $ = new GetIpv6InternetBandwidthsPlainArgs();
        }

        public Builder(GetIpv6InternetBandwidthsPlainArgs defaults) {
            $ = new GetIpv6InternetBandwidthsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Ipv6 Internet Bandwidth IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Ipv6 Internet Bandwidth IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param ipv6AddressId The ID of the IPv6 address.
         * 
         * @return builder
         * 
         */
        public Builder ipv6AddressId(@Nullable String ipv6AddressId) {
            $.ipv6AddressId = ipv6AddressId;
            return this;
        }

        /**
         * @param ipv6InternetBandwidthId The ID of the Ipv6 Internet Bandwidth.
         * 
         * @return builder
         * 
         */
        public Builder ipv6InternetBandwidthId(@Nullable String ipv6InternetBandwidthId) {
            $.ipv6InternetBandwidthId = ipv6InternetBandwidthId;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param status The status of the resource. Valid values: `Normal`, `FinancialLocked` and `SecurityLocked`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetIpv6InternetBandwidthsPlainArgs build() {
            return $;
        }
    }

}
