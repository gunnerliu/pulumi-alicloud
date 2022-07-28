// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSwitchesVswitch {
    /**
     * @return The available ip address count of the VSwitch.
     * 
     */
    private final Integer availableIpAddressCount;
    /**
     * @return Filter results by a specific CIDR block. For example: &#34;172.16.0.0/12&#34;.
     * 
     */
    private final String cidrBlock;
    /**
     * @return Time of creation.
     * 
     */
    private final String creationTime;
    /**
     * @return Description of the VSwitch.
     * 
     */
    private final String description;
    /**
     * @return ID of the VSwitch.
     * 
     */
    private final String id;
    /**
     * @return Indicate whether the VSwitch is created by the system.
     * 
     */
    private final Boolean isDefault;
    /**
     * @return Name of the VSwitch.
     * 
     */
    private final String name;
    /**
     * @return The Id of resource group which VSWitch belongs.
     * 
     */
    private final String resourceGroupId;
    /**
     * @return The route table ID of the VSwitch.
     * 
     */
    private final String routeTableId;
    /**
     * @return The status of the VSwitch. Valid values: `Available` and `Pending`.
     * 
     */
    private final String status;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private final Map<String,Object> tags;
    /**
     * @return ID of the VPC that owns the VSwitch.
     * 
     */
    private final String vpcId;
    /**
     * @return ID of the VSwitch.
     * 
     */
    private final String vswitchId;
    /**
     * @return The name of the VSwitch.
     * 
     */
    private final String vswitchName;
    /**
     * @return The availability zone of the VSwitch.
     * 
     */
    private final String zoneId;

    @CustomType.Constructor
    private GetSwitchesVswitch(
        @CustomType.Parameter("availableIpAddressCount") Integer availableIpAddressCount,
        @CustomType.Parameter("cidrBlock") String cidrBlock,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isDefault") Boolean isDefault,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupId") String resourceGroupId,
        @CustomType.Parameter("routeTableId") String routeTableId,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") Map<String,Object> tags,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("vswitchId") String vswitchId,
        @CustomType.Parameter("vswitchName") String vswitchName,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.availableIpAddressCount = availableIpAddressCount;
        this.cidrBlock = cidrBlock;
        this.creationTime = creationTime;
        this.description = description;
        this.id = id;
        this.isDefault = isDefault;
        this.name = name;
        this.resourceGroupId = resourceGroupId;
        this.routeTableId = routeTableId;
        this.status = status;
        this.tags = tags;
        this.vpcId = vpcId;
        this.vswitchId = vswitchId;
        this.vswitchName = vswitchName;
        this.zoneId = zoneId;
    }

    /**
     * @return The available ip address count of the VSwitch.
     * 
     */
    public Integer availableIpAddressCount() {
        return this.availableIpAddressCount;
    }
    /**
     * @return Filter results by a specific CIDR block. For example: &#34;172.16.0.0/12&#34;.
     * 
     */
    public String cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * @return Time of creation.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return Description of the VSwitch.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return ID of the VSwitch.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicate whether the VSwitch is created by the system.
     * 
     */
    public Boolean isDefault() {
        return this.isDefault;
    }
    /**
     * @return Name of the VSwitch.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Id of resource group which VSWitch belongs.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The route table ID of the VSwitch.
     * 
     */
    public String routeTableId() {
        return this.routeTableId;
    }
    /**
     * @return The status of the VSwitch. Valid values: `Available` and `Pending`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return ID of the VPC that owns the VSwitch.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return ID of the VSwitch.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }
    /**
     * @return The name of the VSwitch.
     * 
     */
    public String vswitchName() {
        return this.vswitchName;
    }
    /**
     * @return The availability zone of the VSwitch.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchesVswitch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer availableIpAddressCount;
        private String cidrBlock;
        private String creationTime;
        private String description;
        private String id;
        private Boolean isDefault;
        private String name;
        private String resourceGroupId;
        private String routeTableId;
        private String status;
        private Map<String,Object> tags;
        private String vpcId;
        private String vswitchId;
        private String vswitchName;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSwitchesVswitch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableIpAddressCount = defaults.availableIpAddressCount;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.isDefault = defaults.isDefault;
    	      this.name = defaults.name;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.routeTableId = defaults.routeTableId;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
    	      this.vswitchName = defaults.vswitchName;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder availableIpAddressCount(Integer availableIpAddressCount) {
            this.availableIpAddressCount = Objects.requireNonNull(availableIpAddressCount);
            return this;
        }
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = Objects.requireNonNull(isDefault);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = Objects.requireNonNull(routeTableId);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = Objects.requireNonNull(vswitchId);
            return this;
        }
        public Builder vswitchName(String vswitchName) {
            this.vswitchName = Objects.requireNonNull(vswitchName);
            return this;
        }
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }        public GetSwitchesVswitch build() {
            return new GetSwitchesVswitch(availableIpAddressCount, cidrBlock, creationTime, description, id, isDefault, name, resourceGroupId, routeTableId, status, tags, vpcId, vswitchId, vswitchName, zoneId);
        }
    }
}
