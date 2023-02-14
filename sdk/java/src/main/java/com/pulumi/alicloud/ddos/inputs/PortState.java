// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PortState extends com.pulumi.resources.ResourceArgs {

    public static final PortState Empty = new PortState();

    /**
     * The port of the origin server. Valid values: [1~65535].
     * 
     */
    @Import(name="backendPort")
    private @Nullable Output<String> backendPort;

    /**
     * @return The port of the origin server. Valid values: [1~65535].
     * 
     */
    public Optional<Output<String>> backendPort() {
        return Optional.ofNullable(this.backendPort);
    }

    /**
     * The forwarding port. Valid values: [1~65535].
     * 
     */
    @Import(name="frontendPort")
    private @Nullable Output<String> frontendPort;

    /**
     * @return The forwarding port. Valid values: [1~65535].
     * 
     */
    public Optional<Output<String>> frontendPort() {
        return Optional.ofNullable(this.frontendPort);
    }

    /**
     * The forwarding protocol. Valid values `tcp` and `udp`.
     * 
     */
    @Import(name="frontendProtocol")
    private @Nullable Output<String> frontendProtocol;

    /**
     * @return The forwarding protocol. Valid values `tcp` and `udp`.
     * 
     */
    public Optional<Output<String>> frontendProtocol() {
        return Optional.ofNullable(this.frontendProtocol);
    }

    /**
     * The ID of Ddoscoo instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The ID of Ddoscoo instance.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * List of source IP addresses.
     * 
     */
    @Import(name="realServers")
    private @Nullable Output<List<String>> realServers;

    /**
     * @return List of source IP addresses.
     * 
     */
    public Optional<Output<List<String>>> realServers() {
        return Optional.ofNullable(this.realServers);
    }

    private PortState() {}

    private PortState(PortState $) {
        this.backendPort = $.backendPort;
        this.frontendPort = $.frontendPort;
        this.frontendProtocol = $.frontendProtocol;
        this.instanceId = $.instanceId;
        this.realServers = $.realServers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PortState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PortState $;

        public Builder() {
            $ = new PortState();
        }

        public Builder(PortState defaults) {
            $ = new PortState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendPort The port of the origin server. Valid values: [1~65535].
         * 
         * @return builder
         * 
         */
        public Builder backendPort(@Nullable Output<String> backendPort) {
            $.backendPort = backendPort;
            return this;
        }

        /**
         * @param backendPort The port of the origin server. Valid values: [1~65535].
         * 
         * @return builder
         * 
         */
        public Builder backendPort(String backendPort) {
            return backendPort(Output.of(backendPort));
        }

        /**
         * @param frontendPort The forwarding port. Valid values: [1~65535].
         * 
         * @return builder
         * 
         */
        public Builder frontendPort(@Nullable Output<String> frontendPort) {
            $.frontendPort = frontendPort;
            return this;
        }

        /**
         * @param frontendPort The forwarding port. Valid values: [1~65535].
         * 
         * @return builder
         * 
         */
        public Builder frontendPort(String frontendPort) {
            return frontendPort(Output.of(frontendPort));
        }

        /**
         * @param frontendProtocol The forwarding protocol. Valid values `tcp` and `udp`.
         * 
         * @return builder
         * 
         */
        public Builder frontendProtocol(@Nullable Output<String> frontendProtocol) {
            $.frontendProtocol = frontendProtocol;
            return this;
        }

        /**
         * @param frontendProtocol The forwarding protocol. Valid values `tcp` and `udp`.
         * 
         * @return builder
         * 
         */
        public Builder frontendProtocol(String frontendProtocol) {
            return frontendProtocol(Output.of(frontendProtocol));
        }

        /**
         * @param instanceId The ID of Ddoscoo instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of Ddoscoo instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param realServers List of source IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder realServers(@Nullable Output<List<String>> realServers) {
            $.realServers = realServers;
            return this;
        }

        /**
         * @param realServers List of source IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder realServers(List<String> realServers) {
            return realServers(Output.of(realServers));
        }

        /**
         * @param realServers List of source IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder realServers(String... realServers) {
            return realServers(List.of(realServers));
        }

        public PortState build() {
            return $;
        }
    }

}