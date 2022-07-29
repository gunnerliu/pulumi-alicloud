// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pvtz.outputs;

import com.pulumi.alicloud.pvtz.outputs.GetEndpointsEndpointIpConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEndpointsEndpoint {
    /**
     * @return The creation time of the resource.
     * 
     */
    private final String createTime;
    /**
     * @return The name of the resource.
     * 
     */
    private final String endpointName;
    private final String id;
    /**
     * @return The Ip Configs.
     * 
     */
    private final List<GetEndpointsEndpointIpConfig> ipConfigs;
    /**
     * @return The ID of the Security Group.
     * 
     */
    private final String securityGroupId;
    /**
     * @return The status of the resource. Valid values: `CHANGE_FAILED`, `CHANGE_INIT`, `EXCEPTION`, `FAILED`, `INIT`, `SUCCESS`.
     * 
     */
    private final String status;
    /**
     * @return The VPC ID.
     * 
     */
    private final String vpcId;
    /**
     * @return The name of the VPC.
     * 
     */
    private final String vpcName;
    /**
     * @return The Region of the VPC.
     * 
     */
    private final String vpcRegionId;

    @CustomType.Constructor
    private GetEndpointsEndpoint(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("endpointName") String endpointName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipConfigs") List<GetEndpointsEndpointIpConfig> ipConfigs,
        @CustomType.Parameter("securityGroupId") String securityGroupId,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("vpcName") String vpcName,
        @CustomType.Parameter("vpcRegionId") String vpcRegionId) {
        this.createTime = createTime;
        this.endpointName = endpointName;
        this.id = id;
        this.ipConfigs = ipConfigs;
        this.securityGroupId = securityGroupId;
        this.status = status;
        this.vpcId = vpcId;
        this.vpcName = vpcName;
        this.vpcRegionId = vpcRegionId;
    }

    /**
     * @return The creation time of the resource.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String endpointName() {
        return this.endpointName;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return The Ip Configs.
     * 
     */
    public List<GetEndpointsEndpointIpConfig> ipConfigs() {
        return this.ipConfigs;
    }
    /**
     * @return The ID of the Security Group.
     * 
     */
    public String securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * @return The status of the resource. Valid values: `CHANGE_FAILED`, `CHANGE_INIT`, `EXCEPTION`, `FAILED`, `INIT`, `SUCCESS`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The VPC ID.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The name of the VPC.
     * 
     */
    public String vpcName() {
        return this.vpcName;
    }
    /**
     * @return The Region of the VPC.
     * 
     */
    public String vpcRegionId() {
        return this.vpcRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointsEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String endpointName;
        private String id;
        private List<GetEndpointsEndpointIpConfig> ipConfigs;
        private String securityGroupId;
        private String status;
        private String vpcId;
        private String vpcName;
        private String vpcRegionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEndpointsEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.endpointName = defaults.endpointName;
    	      this.id = defaults.id;
    	      this.ipConfigs = defaults.ipConfigs;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.status = defaults.status;
    	      this.vpcId = defaults.vpcId;
    	      this.vpcName = defaults.vpcName;
    	      this.vpcRegionId = defaults.vpcRegionId;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder endpointName(String endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipConfigs(List<GetEndpointsEndpointIpConfig> ipConfigs) {
            this.ipConfigs = Objects.requireNonNull(ipConfigs);
            return this;
        }
        public Builder ipConfigs(GetEndpointsEndpointIpConfig... ipConfigs) {
            return ipConfigs(List.of(ipConfigs));
        }
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vpcName(String vpcName) {
            this.vpcName = Objects.requireNonNull(vpcName);
            return this;
        }
        public Builder vpcRegionId(String vpcRegionId) {
            this.vpcRegionId = Objects.requireNonNull(vpcRegionId);
            return this;
        }        public GetEndpointsEndpoint build() {
            return new GetEndpointsEndpoint(createTime, endpointName, id, ipConfigs, securityGroupId, status, vpcId, vpcName, vpcRegionId);
        }
    }
}
