// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPrivateZonesZone {
    /**
     * @return The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
     * 
     */
    private final String accessRegionId;
    /**
     * @return The ID of the CEN instance.
     * 
     */
    private final String cenId;
    /**
     * @return The service region. The service region is the target region of the PrivateZone service accessed through CEN.
     * 
     */
    private final String hostRegionId;
    /**
     * @return The VPC that belongs to the service region.
     * 
     */
    private final String hostVpcId;
    /**
     * @return The ID of the private zone. It formats as `&lt;cen_id&gt;:&lt;access_region_id&gt;`.
     * 
     */
    private final String id;
    /**
     * @return The DNS IP addresses of the PrivateZone service.
     * 
     */
    private final String privateZoneDnsServers;
    /**
     * @return The status of the PrivateZone service, including `Creating`, `Active` and `Deleting`.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetPrivateZonesZone(
        @CustomType.Parameter("accessRegionId") String accessRegionId,
        @CustomType.Parameter("cenId") String cenId,
        @CustomType.Parameter("hostRegionId") String hostRegionId,
        @CustomType.Parameter("hostVpcId") String hostVpcId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("privateZoneDnsServers") String privateZoneDnsServers,
        @CustomType.Parameter("status") String status) {
        this.accessRegionId = accessRegionId;
        this.cenId = cenId;
        this.hostRegionId = hostRegionId;
        this.hostVpcId = hostVpcId;
        this.id = id;
        this.privateZoneDnsServers = privateZoneDnsServers;
        this.status = status;
    }

    /**
     * @return The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
     * 
     */
    public String accessRegionId() {
        return this.accessRegionId;
    }
    /**
     * @return The ID of the CEN instance.
     * 
     */
    public String cenId() {
        return this.cenId;
    }
    /**
     * @return The service region. The service region is the target region of the PrivateZone service accessed through CEN.
     * 
     */
    public String hostRegionId() {
        return this.hostRegionId;
    }
    /**
     * @return The VPC that belongs to the service region.
     * 
     */
    public String hostVpcId() {
        return this.hostVpcId;
    }
    /**
     * @return The ID of the private zone. It formats as `&lt;cen_id&gt;:&lt;access_region_id&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The DNS IP addresses of the PrivateZone service.
     * 
     */
    public String privateZoneDnsServers() {
        return this.privateZoneDnsServers;
    }
    /**
     * @return The status of the PrivateZone service, including `Creating`, `Active` and `Deleting`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateZonesZone defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessRegionId;
        private String cenId;
        private String hostRegionId;
        private String hostVpcId;
        private String id;
        private String privateZoneDnsServers;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateZonesZone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessRegionId = defaults.accessRegionId;
    	      this.cenId = defaults.cenId;
    	      this.hostRegionId = defaults.hostRegionId;
    	      this.hostVpcId = defaults.hostVpcId;
    	      this.id = defaults.id;
    	      this.privateZoneDnsServers = defaults.privateZoneDnsServers;
    	      this.status = defaults.status;
        }

        public Builder accessRegionId(String accessRegionId) {
            this.accessRegionId = Objects.requireNonNull(accessRegionId);
            return this;
        }
        public Builder cenId(String cenId) {
            this.cenId = Objects.requireNonNull(cenId);
            return this;
        }
        public Builder hostRegionId(String hostRegionId) {
            this.hostRegionId = Objects.requireNonNull(hostRegionId);
            return this;
        }
        public Builder hostVpcId(String hostVpcId) {
            this.hostVpcId = Objects.requireNonNull(hostVpcId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder privateZoneDnsServers(String privateZoneDnsServers) {
            this.privateZoneDnsServers = Objects.requireNonNull(privateZoneDnsServers);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetPrivateZonesZone build() {
            return new GetPrivateZonesZone(accessRegionId, cenId, hostRegionId, hostVpcId, id, privateZoneDnsServers, status);
        }
    }
}
