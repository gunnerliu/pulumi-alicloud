// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.outputs;

import com.pulumi.alicloud.vpn.outputs.GetGatewayVpnAttachmentsAttachmentBgpConfig;
import com.pulumi.alicloud.vpn.outputs.GetGatewayVpnAttachmentsAttachmentHealthCheckConfig;
import com.pulumi.alicloud.vpn.outputs.GetGatewayVpnAttachmentsAttachmentIkeConfig;
import com.pulumi.alicloud.vpn.outputs.GetGatewayVpnAttachmentsAttachmentIpsecConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGatewayVpnAttachmentsAttachment {
    /**
     * @return The configurations of the BGP routing protocol.
     * 
     */
    private List<GetGatewayVpnAttachmentsAttachmentBgpConfig> bgpConfigs;
    /**
     * @return The status of the IPsec-VPN connection.
     * 
     */
    private String connectionStatus;
    /**
     * @return The creation time of the resource.
     * 
     */
    private String createTime;
    /**
     * @return The ID of the customer gateway.
     * 
     */
    private String customerGatewayId;
    /**
     * @return Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
     * 
     */
    private Boolean effectImmediately;
    /**
     * @return The health check configurations.
     * 
     */
    private List<GetGatewayVpnAttachmentsAttachmentHealthCheckConfig> healthCheckConfigs;
    /**
     * @return The ID of the Vpn Attachment.
     * 
     */
    private String id;
    /**
     * @return Configuration negotiated in the second stage.
     * 
     */
    private List<GetGatewayVpnAttachmentsAttachmentIkeConfig> ikeConfigs;
    /**
     * @return The internet ip of the resource. The alicloud.cen.TransitRouterVpnAttachment resource will not have a value until after it is created.
     * 
     */
    private String internetIp;
    /**
     * @return The configuration of Phase 2 negotiations.
     * 
     */
    private List<GetGatewayVpnAttachmentsAttachmentIpsecConfig> ipsecConfigs;
    /**
     * @return The CIDR block of the virtual private cloud (VPC).
     * 
     */
    private String localSubnet;
    /**
     * @return The network type.
     * 
     */
    private String networkType;
    /**
     * @return The CIDR block of the on-premises data center.
     * 
     */
    private String remoteSubnet;
    /**
     * @return The status of the resource.
     * 
     */
    private String status;
    /**
     * @return The name of the IPsec-VPN connection.
     * 
     */
    private String vpnAttachmentName;
    /**
     * @return The first ID of the resource.
     * 
     */
    private String vpnConnectionId;

    private GetGatewayVpnAttachmentsAttachment() {}
    /**
     * @return The configurations of the BGP routing protocol.
     * 
     */
    public List<GetGatewayVpnAttachmentsAttachmentBgpConfig> bgpConfigs() {
        return this.bgpConfigs;
    }
    /**
     * @return The status of the IPsec-VPN connection.
     * 
     */
    public String connectionStatus() {
        return this.connectionStatus;
    }
    /**
     * @return The creation time of the resource.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The ID of the customer gateway.
     * 
     */
    public String customerGatewayId() {
        return this.customerGatewayId;
    }
    /**
     * @return Indicates whether IPsec-VPN negotiations are initiated immediately. Valid values.
     * 
     */
    public Boolean effectImmediately() {
        return this.effectImmediately;
    }
    /**
     * @return The health check configurations.
     * 
     */
    public List<GetGatewayVpnAttachmentsAttachmentHealthCheckConfig> healthCheckConfigs() {
        return this.healthCheckConfigs;
    }
    /**
     * @return The ID of the Vpn Attachment.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Configuration negotiated in the second stage.
     * 
     */
    public List<GetGatewayVpnAttachmentsAttachmentIkeConfig> ikeConfigs() {
        return this.ikeConfigs;
    }
    /**
     * @return The internet ip of the resource. The alicloud.cen.TransitRouterVpnAttachment resource will not have a value until after it is created.
     * 
     */
    public String internetIp() {
        return this.internetIp;
    }
    /**
     * @return The configuration of Phase 2 negotiations.
     * 
     */
    public List<GetGatewayVpnAttachmentsAttachmentIpsecConfig> ipsecConfigs() {
        return this.ipsecConfigs;
    }
    /**
     * @return The CIDR block of the virtual private cloud (VPC).
     * 
     */
    public String localSubnet() {
        return this.localSubnet;
    }
    /**
     * @return The network type.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return The CIDR block of the on-premises data center.
     * 
     */
    public String remoteSubnet() {
        return this.remoteSubnet;
    }
    /**
     * @return The status of the resource.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The name of the IPsec-VPN connection.
     * 
     */
    public String vpnAttachmentName() {
        return this.vpnAttachmentName;
    }
    /**
     * @return The first ID of the resource.
     * 
     */
    public String vpnConnectionId() {
        return this.vpnConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayVpnAttachmentsAttachment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGatewayVpnAttachmentsAttachmentBgpConfig> bgpConfigs;
        private String connectionStatus;
        private String createTime;
        private String customerGatewayId;
        private Boolean effectImmediately;
        private List<GetGatewayVpnAttachmentsAttachmentHealthCheckConfig> healthCheckConfigs;
        private String id;
        private List<GetGatewayVpnAttachmentsAttachmentIkeConfig> ikeConfigs;
        private String internetIp;
        private List<GetGatewayVpnAttachmentsAttachmentIpsecConfig> ipsecConfigs;
        private String localSubnet;
        private String networkType;
        private String remoteSubnet;
        private String status;
        private String vpnAttachmentName;
        private String vpnConnectionId;
        public Builder() {}
        public Builder(GetGatewayVpnAttachmentsAttachment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpConfigs = defaults.bgpConfigs;
    	      this.connectionStatus = defaults.connectionStatus;
    	      this.createTime = defaults.createTime;
    	      this.customerGatewayId = defaults.customerGatewayId;
    	      this.effectImmediately = defaults.effectImmediately;
    	      this.healthCheckConfigs = defaults.healthCheckConfigs;
    	      this.id = defaults.id;
    	      this.ikeConfigs = defaults.ikeConfigs;
    	      this.internetIp = defaults.internetIp;
    	      this.ipsecConfigs = defaults.ipsecConfigs;
    	      this.localSubnet = defaults.localSubnet;
    	      this.networkType = defaults.networkType;
    	      this.remoteSubnet = defaults.remoteSubnet;
    	      this.status = defaults.status;
    	      this.vpnAttachmentName = defaults.vpnAttachmentName;
    	      this.vpnConnectionId = defaults.vpnConnectionId;
        }

        @CustomType.Setter
        public Builder bgpConfigs(List<GetGatewayVpnAttachmentsAttachmentBgpConfig> bgpConfigs) {
            this.bgpConfigs = Objects.requireNonNull(bgpConfigs);
            return this;
        }
        public Builder bgpConfigs(GetGatewayVpnAttachmentsAttachmentBgpConfig... bgpConfigs) {
            return bgpConfigs(List.of(bgpConfigs));
        }
        @CustomType.Setter
        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = Objects.requireNonNull(connectionStatus);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder customerGatewayId(String customerGatewayId) {
            this.customerGatewayId = Objects.requireNonNull(customerGatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder effectImmediately(Boolean effectImmediately) {
            this.effectImmediately = Objects.requireNonNull(effectImmediately);
            return this;
        }
        @CustomType.Setter
        public Builder healthCheckConfigs(List<GetGatewayVpnAttachmentsAttachmentHealthCheckConfig> healthCheckConfigs) {
            this.healthCheckConfigs = Objects.requireNonNull(healthCheckConfigs);
            return this;
        }
        public Builder healthCheckConfigs(GetGatewayVpnAttachmentsAttachmentHealthCheckConfig... healthCheckConfigs) {
            return healthCheckConfigs(List.of(healthCheckConfigs));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ikeConfigs(List<GetGatewayVpnAttachmentsAttachmentIkeConfig> ikeConfigs) {
            this.ikeConfigs = Objects.requireNonNull(ikeConfigs);
            return this;
        }
        public Builder ikeConfigs(GetGatewayVpnAttachmentsAttachmentIkeConfig... ikeConfigs) {
            return ikeConfigs(List.of(ikeConfigs));
        }
        @CustomType.Setter
        public Builder internetIp(String internetIp) {
            this.internetIp = Objects.requireNonNull(internetIp);
            return this;
        }
        @CustomType.Setter
        public Builder ipsecConfigs(List<GetGatewayVpnAttachmentsAttachmentIpsecConfig> ipsecConfigs) {
            this.ipsecConfigs = Objects.requireNonNull(ipsecConfigs);
            return this;
        }
        public Builder ipsecConfigs(GetGatewayVpnAttachmentsAttachmentIpsecConfig... ipsecConfigs) {
            return ipsecConfigs(List.of(ipsecConfigs));
        }
        @CustomType.Setter
        public Builder localSubnet(String localSubnet) {
            this.localSubnet = Objects.requireNonNull(localSubnet);
            return this;
        }
        @CustomType.Setter
        public Builder networkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
            return this;
        }
        @CustomType.Setter
        public Builder remoteSubnet(String remoteSubnet) {
            this.remoteSubnet = Objects.requireNonNull(remoteSubnet);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder vpnAttachmentName(String vpnAttachmentName) {
            this.vpnAttachmentName = Objects.requireNonNull(vpnAttachmentName);
            return this;
        }
        @CustomType.Setter
        public Builder vpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = Objects.requireNonNull(vpnConnectionId);
            return this;
        }
        public GetGatewayVpnAttachmentsAttachment build() {
            final var _resultValue = new GetGatewayVpnAttachmentsAttachment();
            _resultValue.bgpConfigs = bgpConfigs;
            _resultValue.connectionStatus = connectionStatus;
            _resultValue.createTime = createTime;
            _resultValue.customerGatewayId = customerGatewayId;
            _resultValue.effectImmediately = effectImmediately;
            _resultValue.healthCheckConfigs = healthCheckConfigs;
            _resultValue.id = id;
            _resultValue.ikeConfigs = ikeConfigs;
            _resultValue.internetIp = internetIp;
            _resultValue.ipsecConfigs = ipsecConfigs;
            _resultValue.localSubnet = localSubnet;
            _resultValue.networkType = networkType;
            _resultValue.remoteSubnet = remoteSubnet;
            _resultValue.status = status;
            _resultValue.vpnAttachmentName = vpnAttachmentName;
            _resultValue.vpnConnectionId = vpnConnectionId;
            return _resultValue;
        }
    }
}
