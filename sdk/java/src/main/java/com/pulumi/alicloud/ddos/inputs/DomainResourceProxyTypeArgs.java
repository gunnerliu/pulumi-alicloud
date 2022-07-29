// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainResourceProxyTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainResourceProxyTypeArgs Empty = new DomainResourceProxyTypeArgs();

    /**
     * the port number. This field is required and must be an integer.
     * 
     */
    @Import(name="proxyPorts")
    private @Nullable Output<List<Integer>> proxyPorts;

    /**
     * @return the port number. This field is required and must be an integer.
     * 
     */
    public Optional<Output<List<Integer>>> proxyPorts() {
        return Optional.ofNullable(this.proxyPorts);
    }

    /**
     * the protocol type. This field is required and must be a string. Valid values: `http`, `https`, `websocket`, and `websockets`.
     * 
     */
    @Import(name="proxyType")
    private @Nullable Output<String> proxyType;

    /**
     * @return the protocol type. This field is required and must be a string. Valid values: `http`, `https`, `websocket`, and `websockets`.
     * 
     */
    public Optional<Output<String>> proxyType() {
        return Optional.ofNullable(this.proxyType);
    }

    private DomainResourceProxyTypeArgs() {}

    private DomainResourceProxyTypeArgs(DomainResourceProxyTypeArgs $) {
        this.proxyPorts = $.proxyPorts;
        this.proxyType = $.proxyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainResourceProxyTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainResourceProxyTypeArgs $;

        public Builder() {
            $ = new DomainResourceProxyTypeArgs();
        }

        public Builder(DomainResourceProxyTypeArgs defaults) {
            $ = new DomainResourceProxyTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param proxyPorts the port number. This field is required and must be an integer.
         * 
         * @return builder
         * 
         */
        public Builder proxyPorts(@Nullable Output<List<Integer>> proxyPorts) {
            $.proxyPorts = proxyPorts;
            return this;
        }

        /**
         * @param proxyPorts the port number. This field is required and must be an integer.
         * 
         * @return builder
         * 
         */
        public Builder proxyPorts(List<Integer> proxyPorts) {
            return proxyPorts(Output.of(proxyPorts));
        }

        /**
         * @param proxyPorts the port number. This field is required and must be an integer.
         * 
         * @return builder
         * 
         */
        public Builder proxyPorts(Integer... proxyPorts) {
            return proxyPorts(List.of(proxyPorts));
        }

        /**
         * @param proxyType the protocol type. This field is required and must be a string. Valid values: `http`, `https`, `websocket`, and `websockets`.
         * 
         * @return builder
         * 
         */
        public Builder proxyType(@Nullable Output<String> proxyType) {
            $.proxyType = proxyType;
            return this;
        }

        /**
         * @param proxyType the protocol type. This field is required and must be a string. Valid values: `http`, `https`, `websocket`, and `websockets`.
         * 
         * @return builder
         * 
         */
        public Builder proxyType(String proxyType) {
            return proxyType(Output.of(proxyType));
        }

        public DomainResourceProxyTypeArgs build() {
            return $;
        }
    }

}
