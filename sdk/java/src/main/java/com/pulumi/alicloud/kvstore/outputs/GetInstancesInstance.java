// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kvstore.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInstancesInstance {
    /**
     * @return The type of the architecture. Valid values: `cluster`, `standard` and `SplitRW`.
     * 
     */
    private String architectureType;
    private Boolean autoRenew;
    private Integer autoRenewPeriod;
    /**
     * @return It has been deprecated from provider version 1.101.0 and `zone_id` instead.
     * 
     */
    private String availabilityZone;
    /**
     * @return Instance bandwidth limit. Unit: Mbit/s.
     * 
     */
    private Integer bandwidth;
    /**
     * @return Capacity of the applied ApsaraDB for the instance. Unit: MB.
     * 
     */
    private Integer capacity;
    /**
     * @return It has been deprecated from provider version 1.101.0 and `payment_type` instead.
     * 
     */
    private String chargeType;
    /**
     * @return The parameter configuration of the instance.
     * 
     */
    private Map<String,Object> config;
    /**
     * @return Instance connection domain (only Intranet access supported).
     * 
     */
    private String connectionDomain;
    /**
     * @return The connection mode of the instance.
     * 
     */
    private String connectionMode;
    /**
     * @return IIt has been deprecated from provider version 1.101.0 and `max_connections` instead.
     * 
     */
    private Integer connections;
    /**
     * @return Creation time of the instance.
     * 
     */
    private String createTime;
    /**
     * @return The ID of the instance.
     * 
     */
    private String dbInstanceId;
    /**
     * @return The name of the instance.
     * 
     */
    private String dbInstanceName;
    /**
     * @return The time when the instance was destroyed.
     * 
     */
    private String destroyTime;
    /**
     * @return Expiration time. Pay-As-You-Go instances are never expire.
     * 
     */
    private String endTime;
    /**
     * @return The engine version. Valid values: `2.8`, `4.0`, `5.0`, `6.0`, `7.0`.
     * 
     */
    private String engineVersion;
    /**
     * @return It has been deprecated from provider version 1.101.0 and `end_time` instead.
     * 
     */
    private String expireTime;
    /**
     * @return Indicates whether there was an order of renewal with configuration change that had not taken effect.
     * 
     */
    private Boolean hasRenewChangeOrder;
    /**
     * @return The ID of the instance.
     * 
     */
    private String id;
    /**
     * @return Type of the applied ApsaraDB for Redis instance. For more information, see [Instance type table](https://help.aliyun.com/zh/redis/developer-reference/instance-types).
     * 
     */
    private String instanceClass;
    private Boolean instanceReleaseProtection;
    /**
     * @return The engine type of the KVStore DBInstance. Options are `Memcache`, and `Redis`. If no value is specified, all types are returned.
     * 
     */
    private String instanceType;
    /**
     * @return Indicates whether the instance is managed by Relational Database Service (RDS).
     * 
     */
    private Boolean isRds;
    private String maintainEndTime;
    private String maintainStartTime;
    /**
     * @return Instance connection quantity limit. Unit: count.
     * 
     */
    private Integer maxConnections;
    /**
     * @return It has been deprecated from provider version 1.101.0 and `db_instance_name` instead.
     * 
     */
    private String name;
    /**
     * @return The type of the network. Valid values: `CLASSIC`, `VPC`.
     * 
     */
    private String networkType;
    /**
     * @return The node type of the instance.
     * 
     */
    private String nodeType;
    /**
     * @return The type of the package.
     * 
     */
    private String packageType;
    /**
     * @return The payment type. Valid values: `PostPaid`, `PrePaid`.
     * 
     */
    private String paymentType;
    /**
     * @return The service port of the instance.
     * 
     */
    private Integer port;
    /**
     * @return Private IP address of the instance.
     * 
     */
    private String privateIp;
    /**
     * @return The queries per second (QPS) supported by the instance.
     * 
     */
    private Integer qps;
    /**
     * @return Region ID the instance belongs to.
     * 
     */
    private String regionId;
    /**
     * @return The logical ID of the replica instance.
     * 
     */
    private String replacateId;
    /**
     * @return The ID of the resource group.
     * 
     */
    private String resourceGroupId;
    /**
     * @return The name of the instance.
     * 
     */
    private String searchKey;
    /**
     * @return (Optional, Available in 1.128.0+) The ID of the secondary zone to which you want to migrate the ApsaraDB for Redis instance.
     * 
     */
    private String secondaryZoneId;
    private String securityGroupId;
    private String securityIpGroupAttribute;
    private String securityIpGroupName;
    private List<String> securityIps;
    private String sslEnable;
    /**
     * @return The status of the KVStore DBInstance. Valid values: `Changing`, `CleaningUpExpiredData`, `Creating`, `Flushing`, `HASwitching`, `Inactive`, `MajorVersionUpgrading`, `Migrating`, `NetworkModifying`, `Normal`, `Rebooting`, `SSLModifying`, `Transforming`, `ZoneMigrating`.
     * 
     */
    private String status;
    /**
     * @return Query the instance bound to the tag. The format of the incoming value is `json` string, including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `{&#34;key1&#34;:&#34;value1&#34;}`.
     * 
     */
    private Map<String,Object> tags;
    /**
     * @return The username of the instance.
     * 
     */
    private String userName;
    private String vpcAuthMode;
    /**
     * @return Connection port of the instance.
     * 
     */
    private String vpcCloudInstanceId;
    /**
     * @return Used to retrieve instances belong to specified VPC.
     * 
     */
    private String vpcId;
    /**
     * @return Used to retrieve instances belong to specified `vswitch` resources.
     * 
     */
    private String vswitchId;
    /**
     * @return The ID of the zone.
     * 
     */
    private String zoneId;

    private GetInstancesInstance() {}
    /**
     * @return The type of the architecture. Valid values: `cluster`, `standard` and `SplitRW`.
     * 
     */
    public String architectureType() {
        return this.architectureType;
    }
    public Boolean autoRenew() {
        return this.autoRenew;
    }
    public Integer autoRenewPeriod() {
        return this.autoRenewPeriod;
    }
    /**
     * @return It has been deprecated from provider version 1.101.0 and `zone_id` instead.
     * 
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * @return Instance bandwidth limit. Unit: Mbit/s.
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return Capacity of the applied ApsaraDB for the instance. Unit: MB.
     * 
     */
    public Integer capacity() {
        return this.capacity;
    }
    /**
     * @return It has been deprecated from provider version 1.101.0 and `payment_type` instead.
     * 
     */
    public String chargeType() {
        return this.chargeType;
    }
    /**
     * @return The parameter configuration of the instance.
     * 
     */
    public Map<String,Object> config() {
        return this.config;
    }
    /**
     * @return Instance connection domain (only Intranet access supported).
     * 
     */
    public String connectionDomain() {
        return this.connectionDomain;
    }
    /**
     * @return The connection mode of the instance.
     * 
     */
    public String connectionMode() {
        return this.connectionMode;
    }
    /**
     * @return IIt has been deprecated from provider version 1.101.0 and `max_connections` instead.
     * 
     */
    public Integer connections() {
        return this.connections;
    }
    /**
     * @return Creation time of the instance.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The ID of the instance.
     * 
     */
    public String dbInstanceId() {
        return this.dbInstanceId;
    }
    /**
     * @return The name of the instance.
     * 
     */
    public String dbInstanceName() {
        return this.dbInstanceName;
    }
    /**
     * @return The time when the instance was destroyed.
     * 
     */
    public String destroyTime() {
        return this.destroyTime;
    }
    /**
     * @return Expiration time. Pay-As-You-Go instances are never expire.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return The engine version. Valid values: `2.8`, `4.0`, `5.0`, `6.0`, `7.0`.
     * 
     */
    public String engineVersion() {
        return this.engineVersion;
    }
    /**
     * @return It has been deprecated from provider version 1.101.0 and `end_time` instead.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return Indicates whether there was an order of renewal with configuration change that had not taken effect.
     * 
     */
    public Boolean hasRenewChangeOrder() {
        return this.hasRenewChangeOrder;
    }
    /**
     * @return The ID of the instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Type of the applied ApsaraDB for Redis instance. For more information, see [Instance type table](https://help.aliyun.com/zh/redis/developer-reference/instance-types).
     * 
     */
    public String instanceClass() {
        return this.instanceClass;
    }
    public Boolean instanceReleaseProtection() {
        return this.instanceReleaseProtection;
    }
    /**
     * @return The engine type of the KVStore DBInstance. Options are `Memcache`, and `Redis`. If no value is specified, all types are returned.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return Indicates whether the instance is managed by Relational Database Service (RDS).
     * 
     */
    public Boolean isRds() {
        return this.isRds;
    }
    public String maintainEndTime() {
        return this.maintainEndTime;
    }
    public String maintainStartTime() {
        return this.maintainStartTime;
    }
    /**
     * @return Instance connection quantity limit. Unit: count.
     * 
     */
    public Integer maxConnections() {
        return this.maxConnections;
    }
    /**
     * @return It has been deprecated from provider version 1.101.0 and `db_instance_name` instead.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The type of the network. Valid values: `CLASSIC`, `VPC`.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return The node type of the instance.
     * 
     */
    public String nodeType() {
        return this.nodeType;
    }
    /**
     * @return The type of the package.
     * 
     */
    public String packageType() {
        return this.packageType;
    }
    /**
     * @return The payment type. Valid values: `PostPaid`, `PrePaid`.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return The service port of the instance.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Private IP address of the instance.
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }
    /**
     * @return The queries per second (QPS) supported by the instance.
     * 
     */
    public Integer qps() {
        return this.qps;
    }
    /**
     * @return Region ID the instance belongs to.
     * 
     */
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return The logical ID of the replica instance.
     * 
     */
    public String replacateId() {
        return this.replacateId;
    }
    /**
     * @return The ID of the resource group.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The name of the instance.
     * 
     */
    public String searchKey() {
        return this.searchKey;
    }
    /**
     * @return (Optional, Available in 1.128.0+) The ID of the secondary zone to which you want to migrate the ApsaraDB for Redis instance.
     * 
     */
    public String secondaryZoneId() {
        return this.secondaryZoneId;
    }
    public String securityGroupId() {
        return this.securityGroupId;
    }
    public String securityIpGroupAttribute() {
        return this.securityIpGroupAttribute;
    }
    public String securityIpGroupName() {
        return this.securityIpGroupName;
    }
    public List<String> securityIps() {
        return this.securityIps;
    }
    public String sslEnable() {
        return this.sslEnable;
    }
    /**
     * @return The status of the KVStore DBInstance. Valid values: `Changing`, `CleaningUpExpiredData`, `Creating`, `Flushing`, `HASwitching`, `Inactive`, `MajorVersionUpgrading`, `Migrating`, `NetworkModifying`, `Normal`, `Rebooting`, `SSLModifying`, `Transforming`, `ZoneMigrating`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Query the instance bound to the tag. The format of the incoming value is `json` string, including `TagKey` and `TagValue`. `TagKey` cannot be null, and `TagValue` can be empty. Format example `{&#34;key1&#34;:&#34;value1&#34;}`.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return The username of the instance.
     * 
     */
    public String userName() {
        return this.userName;
    }
    public String vpcAuthMode() {
        return this.vpcAuthMode;
    }
    /**
     * @return Connection port of the instance.
     * 
     */
    public String vpcCloudInstanceId() {
        return this.vpcCloudInstanceId;
    }
    /**
     * @return Used to retrieve instances belong to specified VPC.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return Used to retrieve instances belong to specified `vswitch` resources.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }
    /**
     * @return The ID of the zone.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String architectureType;
        private Boolean autoRenew;
        private Integer autoRenewPeriod;
        private String availabilityZone;
        private Integer bandwidth;
        private Integer capacity;
        private String chargeType;
        private Map<String,Object> config;
        private String connectionDomain;
        private String connectionMode;
        private Integer connections;
        private String createTime;
        private String dbInstanceId;
        private String dbInstanceName;
        private String destroyTime;
        private String endTime;
        private String engineVersion;
        private String expireTime;
        private Boolean hasRenewChangeOrder;
        private String id;
        private String instanceClass;
        private Boolean instanceReleaseProtection;
        private String instanceType;
        private Boolean isRds;
        private String maintainEndTime;
        private String maintainStartTime;
        private Integer maxConnections;
        private String name;
        private String networkType;
        private String nodeType;
        private String packageType;
        private String paymentType;
        private Integer port;
        private String privateIp;
        private Integer qps;
        private String regionId;
        private String replacateId;
        private String resourceGroupId;
        private String searchKey;
        private String secondaryZoneId;
        private String securityGroupId;
        private String securityIpGroupAttribute;
        private String securityIpGroupName;
        private List<String> securityIps;
        private String sslEnable;
        private String status;
        private Map<String,Object> tags;
        private String userName;
        private String vpcAuthMode;
        private String vpcCloudInstanceId;
        private String vpcId;
        private String vswitchId;
        private String zoneId;
        public Builder() {}
        public Builder(GetInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architectureType = defaults.architectureType;
    	      this.autoRenew = defaults.autoRenew;
    	      this.autoRenewPeriod = defaults.autoRenewPeriod;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.bandwidth = defaults.bandwidth;
    	      this.capacity = defaults.capacity;
    	      this.chargeType = defaults.chargeType;
    	      this.config = defaults.config;
    	      this.connectionDomain = defaults.connectionDomain;
    	      this.connectionMode = defaults.connectionMode;
    	      this.connections = defaults.connections;
    	      this.createTime = defaults.createTime;
    	      this.dbInstanceId = defaults.dbInstanceId;
    	      this.dbInstanceName = defaults.dbInstanceName;
    	      this.destroyTime = defaults.destroyTime;
    	      this.endTime = defaults.endTime;
    	      this.engineVersion = defaults.engineVersion;
    	      this.expireTime = defaults.expireTime;
    	      this.hasRenewChangeOrder = defaults.hasRenewChangeOrder;
    	      this.id = defaults.id;
    	      this.instanceClass = defaults.instanceClass;
    	      this.instanceReleaseProtection = defaults.instanceReleaseProtection;
    	      this.instanceType = defaults.instanceType;
    	      this.isRds = defaults.isRds;
    	      this.maintainEndTime = defaults.maintainEndTime;
    	      this.maintainStartTime = defaults.maintainStartTime;
    	      this.maxConnections = defaults.maxConnections;
    	      this.name = defaults.name;
    	      this.networkType = defaults.networkType;
    	      this.nodeType = defaults.nodeType;
    	      this.packageType = defaults.packageType;
    	      this.paymentType = defaults.paymentType;
    	      this.port = defaults.port;
    	      this.privateIp = defaults.privateIp;
    	      this.qps = defaults.qps;
    	      this.regionId = defaults.regionId;
    	      this.replacateId = defaults.replacateId;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.searchKey = defaults.searchKey;
    	      this.secondaryZoneId = defaults.secondaryZoneId;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.securityIpGroupAttribute = defaults.securityIpGroupAttribute;
    	      this.securityIpGroupName = defaults.securityIpGroupName;
    	      this.securityIps = defaults.securityIps;
    	      this.sslEnable = defaults.sslEnable;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.userName = defaults.userName;
    	      this.vpcAuthMode = defaults.vpcAuthMode;
    	      this.vpcCloudInstanceId = defaults.vpcCloudInstanceId;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder architectureType(String architectureType) {
            this.architectureType = Objects.requireNonNull(architectureType);
            return this;
        }
        @CustomType.Setter
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = Objects.requireNonNull(autoRenew);
            return this;
        }
        @CustomType.Setter
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.autoRenewPeriod = Objects.requireNonNull(autoRenewPeriod);
            return this;
        }
        @CustomType.Setter
        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        @CustomType.Setter
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }
        @CustomType.Setter
        public Builder capacity(Integer capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }
        @CustomType.Setter
        public Builder chargeType(String chargeType) {
            this.chargeType = Objects.requireNonNull(chargeType);
            return this;
        }
        @CustomType.Setter
        public Builder config(Map<String,Object> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        @CustomType.Setter
        public Builder connectionDomain(String connectionDomain) {
            this.connectionDomain = Objects.requireNonNull(connectionDomain);
            return this;
        }
        @CustomType.Setter
        public Builder connectionMode(String connectionMode) {
            this.connectionMode = Objects.requireNonNull(connectionMode);
            return this;
        }
        @CustomType.Setter
        public Builder connections(Integer connections) {
            this.connections = Objects.requireNonNull(connections);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceId(String dbInstanceId) {
            this.dbInstanceId = Objects.requireNonNull(dbInstanceId);
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceName(String dbInstanceName) {
            this.dbInstanceName = Objects.requireNonNull(dbInstanceName);
            return this;
        }
        @CustomType.Setter
        public Builder destroyTime(String destroyTime) {
            this.destroyTime = Objects.requireNonNull(destroyTime);
            return this;
        }
        @CustomType.Setter
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        @CustomType.Setter
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }
        @CustomType.Setter
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        @CustomType.Setter
        public Builder hasRenewChangeOrder(Boolean hasRenewChangeOrder) {
            this.hasRenewChangeOrder = Objects.requireNonNull(hasRenewChangeOrder);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceClass(String instanceClass) {
            this.instanceClass = Objects.requireNonNull(instanceClass);
            return this;
        }
        @CustomType.Setter
        public Builder instanceReleaseProtection(Boolean instanceReleaseProtection) {
            this.instanceReleaseProtection = Objects.requireNonNull(instanceReleaseProtection);
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        @CustomType.Setter
        public Builder isRds(Boolean isRds) {
            this.isRds = Objects.requireNonNull(isRds);
            return this;
        }
        @CustomType.Setter
        public Builder maintainEndTime(String maintainEndTime) {
            this.maintainEndTime = Objects.requireNonNull(maintainEndTime);
            return this;
        }
        @CustomType.Setter
        public Builder maintainStartTime(String maintainStartTime) {
            this.maintainStartTime = Objects.requireNonNull(maintainStartTime);
            return this;
        }
        @CustomType.Setter
        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder networkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
            return this;
        }
        @CustomType.Setter
        public Builder nodeType(String nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }
        @CustomType.Setter
        public Builder packageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }
        @CustomType.Setter
        public Builder paymentType(String paymentType) {
            this.paymentType = Objects.requireNonNull(paymentType);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        @CustomType.Setter
        public Builder qps(Integer qps) {
            this.qps = Objects.requireNonNull(qps);
            return this;
        }
        @CustomType.Setter
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        @CustomType.Setter
        public Builder replacateId(String replacateId) {
            this.replacateId = Objects.requireNonNull(replacateId);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder searchKey(String searchKey) {
            this.searchKey = Objects.requireNonNull(searchKey);
            return this;
        }
        @CustomType.Setter
        public Builder secondaryZoneId(String secondaryZoneId) {
            this.secondaryZoneId = Objects.requireNonNull(secondaryZoneId);
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder securityIpGroupAttribute(String securityIpGroupAttribute) {
            this.securityIpGroupAttribute = Objects.requireNonNull(securityIpGroupAttribute);
            return this;
        }
        @CustomType.Setter
        public Builder securityIpGroupName(String securityIpGroupName) {
            this.securityIpGroupName = Objects.requireNonNull(securityIpGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder securityIps(List<String> securityIps) {
            this.securityIps = Objects.requireNonNull(securityIps);
            return this;
        }
        public Builder securityIps(String... securityIps) {
            return securityIps(List.of(securityIps));
        }
        @CustomType.Setter
        public Builder sslEnable(String sslEnable) {
            this.sslEnable = Objects.requireNonNull(sslEnable);
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
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        @CustomType.Setter
        public Builder vpcAuthMode(String vpcAuthMode) {
            this.vpcAuthMode = Objects.requireNonNull(vpcAuthMode);
            return this;
        }
        @CustomType.Setter
        public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = Objects.requireNonNull(vpcCloudInstanceId);
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
        public GetInstancesInstance build() {
            final var _resultValue = new GetInstancesInstance();
            _resultValue.architectureType = architectureType;
            _resultValue.autoRenew = autoRenew;
            _resultValue.autoRenewPeriod = autoRenewPeriod;
            _resultValue.availabilityZone = availabilityZone;
            _resultValue.bandwidth = bandwidth;
            _resultValue.capacity = capacity;
            _resultValue.chargeType = chargeType;
            _resultValue.config = config;
            _resultValue.connectionDomain = connectionDomain;
            _resultValue.connectionMode = connectionMode;
            _resultValue.connections = connections;
            _resultValue.createTime = createTime;
            _resultValue.dbInstanceId = dbInstanceId;
            _resultValue.dbInstanceName = dbInstanceName;
            _resultValue.destroyTime = destroyTime;
            _resultValue.endTime = endTime;
            _resultValue.engineVersion = engineVersion;
            _resultValue.expireTime = expireTime;
            _resultValue.hasRenewChangeOrder = hasRenewChangeOrder;
            _resultValue.id = id;
            _resultValue.instanceClass = instanceClass;
            _resultValue.instanceReleaseProtection = instanceReleaseProtection;
            _resultValue.instanceType = instanceType;
            _resultValue.isRds = isRds;
            _resultValue.maintainEndTime = maintainEndTime;
            _resultValue.maintainStartTime = maintainStartTime;
            _resultValue.maxConnections = maxConnections;
            _resultValue.name = name;
            _resultValue.networkType = networkType;
            _resultValue.nodeType = nodeType;
            _resultValue.packageType = packageType;
            _resultValue.paymentType = paymentType;
            _resultValue.port = port;
            _resultValue.privateIp = privateIp;
            _resultValue.qps = qps;
            _resultValue.regionId = regionId;
            _resultValue.replacateId = replacateId;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.searchKey = searchKey;
            _resultValue.secondaryZoneId = secondaryZoneId;
            _resultValue.securityGroupId = securityGroupId;
            _resultValue.securityIpGroupAttribute = securityIpGroupAttribute;
            _resultValue.securityIpGroupName = securityIpGroupName;
            _resultValue.securityIps = securityIps;
            _resultValue.sslEnable = sslEnable;
            _resultValue.status = status;
            _resultValue.tags = tags;
            _resultValue.userName = userName;
            _resultValue.vpcAuthMode = vpcAuthMode;
            _resultValue.vpcCloudInstanceId = vpcCloudInstanceId;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchId = vswitchId;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
