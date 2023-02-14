// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDdosCooPortsPort {
    /**
     * @return The source station port.
     * 
     */
    private String backendPort;
    /**
     * @return The forwarding port.
     * 
     */
    private String frontendPort;
    /**
     * @return The forwarding protocol.
     * 
     */
    private String frontendProtocol;
    /**
     * @return The ID of the Port.
     * 
     */
    private String id;
    /**
     * @return The Ddoscoo instance ID.
     * 
     */
    private String instanceId;
    /**
     * @return List of source IP addresses.
     * 
     */
    private List<String> realServers;

    private GetDdosCooPortsPort() {}
    /**
     * @return The source station port.
     * 
     */
    public String backendPort() {
        return this.backendPort;
    }
    /**
     * @return The forwarding port.
     * 
     */
    public String frontendPort() {
        return this.frontendPort;
    }
    /**
     * @return The forwarding protocol.
     * 
     */
    public String frontendProtocol() {
        return this.frontendProtocol;
    }
    /**
     * @return The ID of the Port.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Ddoscoo instance ID.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return List of source IP addresses.
     * 
     */
    public List<String> realServers() {
        return this.realServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDdosCooPortsPort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backendPort;
        private String frontendPort;
        private String frontendProtocol;
        private String id;
        private String instanceId;
        private List<String> realServers;
        public Builder() {}
        public Builder(GetDdosCooPortsPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.frontendPort = defaults.frontendPort;
    	      this.frontendProtocol = defaults.frontendProtocol;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.realServers = defaults.realServers;
        }

        @CustomType.Setter
        public Builder backendPort(String backendPort) {
            this.backendPort = Objects.requireNonNull(backendPort);
            return this;
        }
        @CustomType.Setter
        public Builder frontendPort(String frontendPort) {
            this.frontendPort = Objects.requireNonNull(frontendPort);
            return this;
        }
        @CustomType.Setter
        public Builder frontendProtocol(String frontendProtocol) {
            this.frontendProtocol = Objects.requireNonNull(frontendProtocol);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder realServers(List<String> realServers) {
            this.realServers = Objects.requireNonNull(realServers);
            return this;
        }
        public Builder realServers(String... realServers) {
            return realServers(List.of(realServers));
        }
        public GetDdosCooPortsPort build() {
            final var o = new GetDdosCooPortsPort();
            o.backendPort = backendPort;
            o.frontendPort = frontendPort;
            o.frontendProtocol = frontendProtocol;
            o.id = id;
            o.instanceId = instanceId;
            o.realServers = realServers;
            return o;
        }
    }
}