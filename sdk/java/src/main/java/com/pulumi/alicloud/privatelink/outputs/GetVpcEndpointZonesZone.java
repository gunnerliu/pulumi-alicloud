// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVpcEndpointZonesZone {
    /**
     * @return Terminal node network card.
     * 
     */
    private final String eniId;
    /**
     * @return IP address of the terminal node network card.
     * 
     */
    private final String eniIp;
    /**
     * @return The ID of the Vpc Endpoint Zone.
     * 
     */
    private final String id;
    /**
     * @return The Status of Vpc Endpoint Zone..
     * 
     */
    private final String status;
    /**
     * @return The VSwitch id.
     * 
     */
    private final String vswitchId;
    /**
     * @return The Zone Domain.
     * 
     */
    private final String zoneDomain;
    /**
     * @return The Zone Id.
     * 
     */
    private final String zoneId;

    @CustomType.Constructor
    private GetVpcEndpointZonesZone(
        @CustomType.Parameter("eniId") String eniId,
        @CustomType.Parameter("eniIp") String eniIp,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("vswitchId") String vswitchId,
        @CustomType.Parameter("zoneDomain") String zoneDomain,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.eniId = eniId;
        this.eniIp = eniIp;
        this.id = id;
        this.status = status;
        this.vswitchId = vswitchId;
        this.zoneDomain = zoneDomain;
        this.zoneId = zoneId;
    }

    /**
     * @return Terminal node network card.
     * 
     */
    public String eniId() {
        return this.eniId;
    }
    /**
     * @return IP address of the terminal node network card.
     * 
     */
    public String eniIp() {
        return this.eniIp;
    }
    /**
     * @return The ID of the Vpc Endpoint Zone.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Status of Vpc Endpoint Zone..
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The VSwitch id.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }
    /**
     * @return The Zone Domain.
     * 
     */
    public String zoneDomain() {
        return this.zoneDomain;
    }
    /**
     * @return The Zone Id.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcEndpointZonesZone defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eniId;
        private String eniIp;
        private String id;
        private String status;
        private String vswitchId;
        private String zoneDomain;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcEndpointZonesZone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eniId = defaults.eniId;
    	      this.eniIp = defaults.eniIp;
    	      this.id = defaults.id;
    	      this.status = defaults.status;
    	      this.vswitchId = defaults.vswitchId;
    	      this.zoneDomain = defaults.zoneDomain;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder eniId(String eniId) {
            this.eniId = Objects.requireNonNull(eniId);
            return this;
        }
        public Builder eniIp(String eniIp) {
            this.eniIp = Objects.requireNonNull(eniIp);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = Objects.requireNonNull(vswitchId);
            return this;
        }
        public Builder zoneDomain(String zoneDomain) {
            this.zoneDomain = Objects.requireNonNull(zoneDomain);
            return this;
        }
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }        public GetVpcEndpointZonesZone build() {
            return new GetVpcEndpointZonesZone(eniId, eniIp, id, status, vswitchId, zoneDomain, zoneId);
        }
    }
}
