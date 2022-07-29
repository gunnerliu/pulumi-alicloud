// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bastionhost.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHostsHostProtocol {
    /**
     * @return Host fingerprint information, it is possible to uniquely identify a host.
     * 
     */
    private final String hostFingerPrint;
    /**
     * @return Host the service port of the RDS.
     * 
     */
    private final Integer port;
    /**
     * @return The host uses the protocol name.
     * 
     */
    private final String protocolName;

    @CustomType.Constructor
    private GetHostsHostProtocol(
        @CustomType.Parameter("hostFingerPrint") String hostFingerPrint,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("protocolName") String protocolName) {
        this.hostFingerPrint = hostFingerPrint;
        this.port = port;
        this.protocolName = protocolName;
    }

    /**
     * @return Host fingerprint information, it is possible to uniquely identify a host.
     * 
     */
    public String hostFingerPrint() {
        return this.hostFingerPrint;
    }
    /**
     * @return Host the service port of the RDS.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The host uses the protocol name.
     * 
     */
    public String protocolName() {
        return this.protocolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostsHostProtocol defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostFingerPrint;
        private Integer port;
        private String protocolName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHostsHostProtocol defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostFingerPrint = defaults.hostFingerPrint;
    	      this.port = defaults.port;
    	      this.protocolName = defaults.protocolName;
        }

        public Builder hostFingerPrint(String hostFingerPrint) {
            this.hostFingerPrint = Objects.requireNonNull(hostFingerPrint);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder protocolName(String protocolName) {
            this.protocolName = Objects.requireNonNull(protocolName);
            return this;
        }        public GetHostsHostProtocol build() {
            return new GetHostsHostProtocol(hostFingerPrint, port, protocolName);
        }
    }
}
