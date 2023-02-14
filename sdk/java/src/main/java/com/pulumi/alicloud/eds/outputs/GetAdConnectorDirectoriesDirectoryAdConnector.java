// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAdConnectorDirectoriesDirectoryAdConnector {
    /**
     * @return The address of AD connector.
     * 
     */
    private String adConnectorAddress;
    /**
     * @return The status of connector.
     * 
     */
    private String connectorStatus;
    /**
     * @return The ID of the network interface.
     * 
     */
    private String networkInterfaceId;
    /**
     * @return The AD Connector specifications.
     * 
     */
    private String specification;
    /**
     * @return The AD Connector control trust password.
     * 
     */
    private String trustKey;
    /**
     * @return The ID of VSwitch.
     * 
     */
    private String vswitchId;

    private GetAdConnectorDirectoriesDirectoryAdConnector() {}
    /**
     * @return The address of AD connector.
     * 
     */
    public String adConnectorAddress() {
        return this.adConnectorAddress;
    }
    /**
     * @return The status of connector.
     * 
     */
    public String connectorStatus() {
        return this.connectorStatus;
    }
    /**
     * @return The ID of the network interface.
     * 
     */
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * @return The AD Connector specifications.
     * 
     */
    public String specification() {
        return this.specification;
    }
    /**
     * @return The AD Connector control trust password.
     * 
     */
    public String trustKey() {
        return this.trustKey;
    }
    /**
     * @return The ID of VSwitch.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdConnectorDirectoriesDirectoryAdConnector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String adConnectorAddress;
        private String connectorStatus;
        private String networkInterfaceId;
        private String specification;
        private String trustKey;
        private String vswitchId;
        public Builder() {}
        public Builder(GetAdConnectorDirectoriesDirectoryAdConnector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adConnectorAddress = defaults.adConnectorAddress;
    	      this.connectorStatus = defaults.connectorStatus;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.specification = defaults.specification;
    	      this.trustKey = defaults.trustKey;
    	      this.vswitchId = defaults.vswitchId;
        }

        @CustomType.Setter
        public Builder adConnectorAddress(String adConnectorAddress) {
            this.adConnectorAddress = Objects.requireNonNull(adConnectorAddress);
            return this;
        }
        @CustomType.Setter
        public Builder connectorStatus(String connectorStatus) {
            this.connectorStatus = Objects.requireNonNull(connectorStatus);
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        @CustomType.Setter
        public Builder specification(String specification) {
            this.specification = Objects.requireNonNull(specification);
            return this;
        }
        @CustomType.Setter
        public Builder trustKey(String trustKey) {
            this.trustKey = Objects.requireNonNull(trustKey);
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = Objects.requireNonNull(vswitchId);
            return this;
        }
        public GetAdConnectorDirectoriesDirectoryAdConnector build() {
            final var o = new GetAdConnectorDirectoriesDirectoryAdConnector();
            o.adConnectorAddress = adConnectorAddress;
            o.connectorStatus = connectorStatus;
            o.networkInterfaceId = networkInterfaceId;
            o.specification = specification;
            o.trustKey = trustKey;
            o.vswitchId = vswitchId;
            return o;
        }
    }
}