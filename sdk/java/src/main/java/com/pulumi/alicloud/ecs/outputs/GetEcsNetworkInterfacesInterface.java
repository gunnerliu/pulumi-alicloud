// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetEcsNetworkInterfacesInterfaceAssociatedPublicIp;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetEcsNetworkInterfacesInterface {
    /**
     * @return The EIP associated with the secondary private IP address of the ENI.  **NOTE:** Available in v1.163.0+.
     * 
     */
    private List<GetEcsNetworkInterfacesInterfaceAssociatedPublicIp> associatedPublicIps;
    /**
     * @return The creation time.
     * 
     */
    private String creationTime;
    /**
     * @return The description of the ENI.
     * 
     */
    private String description;
    /**
     * @return The ID of the Network Interface.
     * 
     */
    private String id;
    /**
     * @return The instance id.
     * 
     */
    private String instanceId;
    /**
     * @return The MAC address of the ENI.
     * 
     */
    private String mac;
    /**
     * @return The network interface name.
     * 
     */
    private String name;
    /**
     * @return The network interface id.
     * 
     */
    private String networkInterfaceId;
    /**
     * @return The network interface name.
     * 
     */
    private String networkInterfaceName;
    /**
     * @return The communication mode of the elastic network card.
     * 
     */
    private String networkInterfaceTrafficMode;
    /**
     * @return The ID of the account to which the ENIC belongs.
     * 
     */
    private String ownerId;
    /**
     * @return The primary private IP address of the ENI.
     * 
     */
    private String primaryIpAddress;
    /**
     * @return The primary private IP address of the ENI.
     * 
     */
    private String privateIp;
    private List<String> privateIpAddresses;
    /**
     * @return A list of secondary private IP address that is assigned to the ENI.
     * 
     */
    private List<String> privateIps;
    /**
     * @return Number of network card queues.
     * 
     */
    private Integer queueNumber;
    /**
     * @return The resource group id.
     * 
     */
    private String resourceGroupId;
    /**
     * @return The security group ids.
     * 
     */
    private List<String> securityGroupIds;
    /**
     * @return The security groups.
     * 
     */
    private List<String> securityGroups;
    /**
     * @return The service id.
     * 
     */
    private Integer serviceId;
    /**
     * @return Whether the user of the elastic network card is a cloud product or a virtual vendor.
     * 
     */
    private Boolean serviceManaged;
    /**
     * @return The status of the ENI.
     * 
     */
    private String status;
    /**
     * @return The tags.
     * 
     */
    private Map<String,Object> tags;
    /**
     * @return The type of the ENI.
     * 
     */
    private String type;
    /**
     * @return The Vpc Id.
     * 
     */
    private String vpcId;
    /**
     * @return The vswitch id.
     * 
     */
    private String vswitchId;
    /**
     * @return The zone id.
     * 
     */
    private String zoneId;

    private GetEcsNetworkInterfacesInterface() {}
    /**
     * @return The EIP associated with the secondary private IP address of the ENI.  **NOTE:** Available in v1.163.0+.
     * 
     */
    public List<GetEcsNetworkInterfacesInterfaceAssociatedPublicIp> associatedPublicIps() {
        return this.associatedPublicIps;
    }
    /**
     * @return The creation time.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return The description of the ENI.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Network Interface.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The instance id.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The MAC address of the ENI.
     * 
     */
    public String mac() {
        return this.mac;
    }
    /**
     * @return The network interface name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The network interface id.
     * 
     */
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * @return The network interface name.
     * 
     */
    public String networkInterfaceName() {
        return this.networkInterfaceName;
    }
    /**
     * @return The communication mode of the elastic network card.
     * 
     */
    public String networkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }
    /**
     * @return The ID of the account to which the ENIC belongs.
     * 
     */
    public String ownerId() {
        return this.ownerId;
    }
    /**
     * @return The primary private IP address of the ENI.
     * 
     */
    public String primaryIpAddress() {
        return this.primaryIpAddress;
    }
    /**
     * @return The primary private IP address of the ENI.
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }
    public List<String> privateIpAddresses() {
        return this.privateIpAddresses;
    }
    /**
     * @return A list of secondary private IP address that is assigned to the ENI.
     * 
     */
    public List<String> privateIps() {
        return this.privateIps;
    }
    /**
     * @return Number of network card queues.
     * 
     */
    public Integer queueNumber() {
        return this.queueNumber;
    }
    /**
     * @return The resource group id.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The security group ids.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * @return The security groups.
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups;
    }
    /**
     * @return The service id.
     * 
     */
    public Integer serviceId() {
        return this.serviceId;
    }
    /**
     * @return Whether the user of the elastic network card is a cloud product or a virtual vendor.
     * 
     */
    public Boolean serviceManaged() {
        return this.serviceManaged;
    }
    /**
     * @return The status of the ENI.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The tags.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return The type of the ENI.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The Vpc Id.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The vswitch id.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }
    /**
     * @return The zone id.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsNetworkInterfacesInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetEcsNetworkInterfacesInterfaceAssociatedPublicIp> associatedPublicIps;
        private String creationTime;
        private String description;
        private String id;
        private String instanceId;
        private String mac;
        private String name;
        private String networkInterfaceId;
        private String networkInterfaceName;
        private String networkInterfaceTrafficMode;
        private String ownerId;
        private String primaryIpAddress;
        private String privateIp;
        private List<String> privateIpAddresses;
        private List<String> privateIps;
        private Integer queueNumber;
        private String resourceGroupId;
        private List<String> securityGroupIds;
        private List<String> securityGroups;
        private Integer serviceId;
        private Boolean serviceManaged;
        private String status;
        private Map<String,Object> tags;
        private String type;
        private String vpcId;
        private String vswitchId;
        private String zoneId;
        public Builder() {}
        public Builder(GetEcsNetworkInterfacesInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatedPublicIps = defaults.associatedPublicIps;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.mac = defaults.mac;
    	      this.name = defaults.name;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.networkInterfaceName = defaults.networkInterfaceName;
    	      this.networkInterfaceTrafficMode = defaults.networkInterfaceTrafficMode;
    	      this.ownerId = defaults.ownerId;
    	      this.primaryIpAddress = defaults.primaryIpAddress;
    	      this.privateIp = defaults.privateIp;
    	      this.privateIpAddresses = defaults.privateIpAddresses;
    	      this.privateIps = defaults.privateIps;
    	      this.queueNumber = defaults.queueNumber;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.securityGroups = defaults.securityGroups;
    	      this.serviceId = defaults.serviceId;
    	      this.serviceManaged = defaults.serviceManaged;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder associatedPublicIps(List<GetEcsNetworkInterfacesInterfaceAssociatedPublicIp> associatedPublicIps) {
            this.associatedPublicIps = Objects.requireNonNull(associatedPublicIps);
            return this;
        }
        public Builder associatedPublicIps(GetEcsNetworkInterfacesInterfaceAssociatedPublicIp... associatedPublicIps) {
            return associatedPublicIps(List.of(associatedPublicIps));
        }
        @CustomType.Setter
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
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
        public Builder mac(String mac) {
            this.mac = Objects.requireNonNull(mac);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = Objects.requireNonNull(networkInterfaceName);
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = Objects.requireNonNull(networkInterfaceTrafficMode);
            return this;
        }
        @CustomType.Setter
        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }
        @CustomType.Setter
        public Builder primaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = Objects.requireNonNull(primaryIpAddress);
            return this;
        }
        @CustomType.Setter
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddresses(List<String> privateIpAddresses) {
            this.privateIpAddresses = Objects.requireNonNull(privateIpAddresses);
            return this;
        }
        public Builder privateIpAddresses(String... privateIpAddresses) {
            return privateIpAddresses(List.of(privateIpAddresses));
        }
        @CustomType.Setter
        public Builder privateIps(List<String> privateIps) {
            this.privateIps = Objects.requireNonNull(privateIps);
            return this;
        }
        public Builder privateIps(String... privateIps) {
            return privateIps(List.of(privateIps));
        }
        @CustomType.Setter
        public Builder queueNumber(Integer queueNumber) {
            this.queueNumber = Objects.requireNonNull(queueNumber);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        @CustomType.Setter
        public Builder securityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        @CustomType.Setter
        public Builder serviceId(Integer serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        @CustomType.Setter
        public Builder serviceManaged(Boolean serviceManaged) {
            this.serviceManaged = Objects.requireNonNull(serviceManaged);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = Objects.requireNonNull(vswitchId);
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }
        public GetEcsNetworkInterfacesInterface build() {
            final var _resultValue = new GetEcsNetworkInterfacesInterface();
            _resultValue.associatedPublicIps = associatedPublicIps;
            _resultValue.creationTime = creationTime;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.mac = mac;
            _resultValue.name = name;
            _resultValue.networkInterfaceId = networkInterfaceId;
            _resultValue.networkInterfaceName = networkInterfaceName;
            _resultValue.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            _resultValue.ownerId = ownerId;
            _resultValue.primaryIpAddress = primaryIpAddress;
            _resultValue.privateIp = privateIp;
            _resultValue.privateIpAddresses = privateIpAddresses;
            _resultValue.privateIps = privateIps;
            _resultValue.queueNumber = queueNumber;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.securityGroupIds = securityGroupIds;
            _resultValue.securityGroups = securityGroups;
            _resultValue.serviceId = serviceId;
            _resultValue.serviceManaged = serviceManaged;
            _resultValue.status = status;
            _resultValue.tags = tags;
            _resultValue.type = type;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchId = vswitchId;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
