// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNatIpsIp {
    /**
     * @return The ID of the Nat Ip.
     * 
     */
    private String id;
    /**
     * @return Indicates whether the BGP Group is the default NAT IP ADDRESS. Valid values: `true`: is the default NAT IP ADDRESS. `false`: it is not the default NAT IP ADDRESS.
     * 
     */
    private Boolean isDefault;
    /**
     * @return The ID of the Virtual Private Cloud (VPC) NAT gateway to which the NAT IP address belongs.
     * 
     */
    private String natGatewayId;
    /**
     * @return The NAT IP address that is queried.
     * 
     */
    private String natIp;
    /**
     * @return The CIDR block to which the NAT IP address belongs.
     * 
     */
    private String natIpCidr;
    /**
     * @return The description of the NAT IP address.
     * 
     */
    private String natIpDescription;
    /**
     * @return The ID of the NAT IP address.
     * 
     */
    private String natIpId;
    /**
     * @return The name of the NAT IP address.
     * 
     */
    private String natIpName;
    /**
     * @return The status of the NAT IP address. Valid values: `Available`, `Deleting` and `Creating`.
     * 
     */
    private String status;

    private GetNatIpsIp() {}
    /**
     * @return The ID of the Nat Ip.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates whether the BGP Group is the default NAT IP ADDRESS. Valid values: `true`: is the default NAT IP ADDRESS. `false`: it is not the default NAT IP ADDRESS.
     * 
     */
    public Boolean isDefault() {
        return this.isDefault;
    }
    /**
     * @return The ID of the Virtual Private Cloud (VPC) NAT gateway to which the NAT IP address belongs.
     * 
     */
    public String natGatewayId() {
        return this.natGatewayId;
    }
    /**
     * @return The NAT IP address that is queried.
     * 
     */
    public String natIp() {
        return this.natIp;
    }
    /**
     * @return The CIDR block to which the NAT IP address belongs.
     * 
     */
    public String natIpCidr() {
        return this.natIpCidr;
    }
    /**
     * @return The description of the NAT IP address.
     * 
     */
    public String natIpDescription() {
        return this.natIpDescription;
    }
    /**
     * @return The ID of the NAT IP address.
     * 
     */
    public String natIpId() {
        return this.natIpId;
    }
    /**
     * @return The name of the NAT IP address.
     * 
     */
    public String natIpName() {
        return this.natIpName;
    }
    /**
     * @return The status of the NAT IP address. Valid values: `Available`, `Deleting` and `Creating`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatIpsIp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Boolean isDefault;
        private String natGatewayId;
        private String natIp;
        private String natIpCidr;
        private String natIpDescription;
        private String natIpId;
        private String natIpName;
        private String status;
        public Builder() {}
        public Builder(GetNatIpsIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.isDefault = defaults.isDefault;
    	      this.natGatewayId = defaults.natGatewayId;
    	      this.natIp = defaults.natIp;
    	      this.natIpCidr = defaults.natIpCidr;
    	      this.natIpDescription = defaults.natIpDescription;
    	      this.natIpId = defaults.natIpId;
    	      this.natIpName = defaults.natIpName;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = Objects.requireNonNull(isDefault);
            return this;
        }
        @CustomType.Setter
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = Objects.requireNonNull(natGatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder natIp(String natIp) {
            this.natIp = Objects.requireNonNull(natIp);
            return this;
        }
        @CustomType.Setter
        public Builder natIpCidr(String natIpCidr) {
            this.natIpCidr = Objects.requireNonNull(natIpCidr);
            return this;
        }
        @CustomType.Setter
        public Builder natIpDescription(String natIpDescription) {
            this.natIpDescription = Objects.requireNonNull(natIpDescription);
            return this;
        }
        @CustomType.Setter
        public Builder natIpId(String natIpId) {
            this.natIpId = Objects.requireNonNull(natIpId);
            return this;
        }
        @CustomType.Setter
        public Builder natIpName(String natIpName) {
            this.natIpName = Objects.requireNonNull(natIpName);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetNatIpsIp build() {
            final var o = new GetNatIpsIp();
            o.id = id;
            o.isDefault = isDefault;
            o.natGatewayId = natGatewayId;
            o.natIp = natIp;
            o.natIpCidr = natIpCidr;
            o.natIpDescription = natIpDescription;
            o.natIpId = natIpId;
            o.natIpName = natIpName;
            o.status = status;
            return o;
        }
    }
}