// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.adb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDBClustersCluster {
    /**
     * @return Auto-renewal period of an cluster, in the unit of the month.
     * 
     */
    private Integer autoRenewPeriod;
    /**
     * @return The payment type of the resource.
     * 
     */
    private String chargeType;
    /**
     * @return The name of the service.
     * 
     */
    private String commodityCode;
    /**
     * @return The specifications of computing resources in elastic mode. The increase of resources can speed up queries. AnalyticDB for MySQL automatically scales computing resources. For more information, see [Specifications](https://www.alibabacloud.com/help/en/doc-detail/144851.htm).
     * 
     */
    private String computeResource;
    /**
     * @return The endpoint of the cluster.
     * 
     */
    private String connectionString;
    /**
     * @return The CreateTime of the ADB cluster.
     * 
     */
    private String createTime;
    /**
     * @return The db cluster category.
     * 
     */
    private String dbClusterCategory;
    /**
     * @return The db cluster id.
     * 
     */
    private String dbClusterId;
    /**
     * @return The db cluster network type.
     * 
     */
    private String dbClusterNetworkType;
    /**
     * @return The db cluster type.
     * 
     */
    private String dbClusterType;
    /**
     * @return The db cluster version.
     * 
     */
    private String dbClusterVersion;
    /**
     * @return The db node class.
     * 
     */
    private String dbNodeClass;
    /**
     * @return The db node count.
     * 
     */
    private Integer dbNodeCount;
    /**
     * @return The db node storage.
     * 
     */
    private Integer dbNodeStorage;
    /**
     * @return The description of DBCluster.
     * 
     */
    private String description;
    /**
     * @return The type of the disk.
     * 
     */
    private String diskType;
    /**
     * @return The ID of the data synchronization task in Data Transmission Service (DTS). This parameter is valid only for analytic instances.
     * 
     */
    private String dtsJobId;
    /**
     * @return The elastic io resource.
     * 
     */
    private Integer elasticIoResource;
    /**
     * @return The engine of the database.
     * 
     */
    private String engine;
    /**
     * @return The engine version of the database..
     * 
     */
    private String engineVersion;
    /**
     * @return The number of nodes. The node resources are used for data computing in elastic mode.
     * 
     */
    private String executorCount;
    /**
     * @return The time when the cluster expires.
     * 
     */
    private String expireTime;
    /**
     * @return Indicates whether the cluster has expired.
     * 
     */
    private String expired;
    /**
     * @return The ID of the DBCluster.
     * 
     */
    private String id;
    /**
     * @return The lock mode of the cluster.
     * 
     */
    private String lockMode;
    /**
     * @return The reason why the cluster is locked.
     * 
     */
    private String lockReason;
    /**
     * @return The maintenance window of the cluster.
     * 
     */
    private String maintainTime;
    /**
     * @return The lock mode of the cluster.
     * 
     */
    private String mode;
    private String networkType;
    /**
     * @return The payment type of the resource.
     * 
     */
    private String paymentType;
    /**
     * @return The port that is used to access the cluster.
     * 
     */
    private Integer port;
    /**
     * @return The ID of the ApsaraDB RDS instance from which data is synchronized to the cluster. This parameter is valid only for analytic instances.
     * 
     */
    private String rdsInstanceId;
    private String regionId;
    /**
     * @return The status of renewal.
     * 
     */
    private String renewalStatus;
    /**
     * @return The ID of the resource group.
     * 
     */
    private String resourceGroupId;
    /**
     * @return List of IP addresses allowed to access all databases of an cluster.
     * 
     */
    private List<String> securityIps;
    /**
     * @return The status of the resource.
     * 
     */
    private String status;
    /**
     * @return The specifications of storage resources in elastic mode. The resources are used for data read and write operations. The increase of resources can improve the read and write performance of your cluster. For more information, see [Specifications](https://www.alibabacloud.com/help/en/doc-detail/144851.htm).
     * 
     */
    private String storageResource;
    /**
     * @return The tag of the resource.
     * 
     */
    private Map<String,Object> tags;
    /**
     * @return The vpc cloud instance id.
     * 
     */
    private String vpcCloudInstanceId;
    /**
     * @return The vpc id.
     * 
     */
    private String vpcId;
    /**
     * @return The vswitch id.
     * 
     */
    private String vswitchId;
    /**
     * @return The zone ID  of the resource.
     * 
     */
    private String zoneId;

    private GetDBClustersCluster() {}
    /**
     * @return Auto-renewal period of an cluster, in the unit of the month.
     * 
     */
    public Integer autoRenewPeriod() {
        return this.autoRenewPeriod;
    }
    /**
     * @return The payment type of the resource.
     * 
     */
    public String chargeType() {
        return this.chargeType;
    }
    /**
     * @return The name of the service.
     * 
     */
    public String commodityCode() {
        return this.commodityCode;
    }
    /**
     * @return The specifications of computing resources in elastic mode. The increase of resources can speed up queries. AnalyticDB for MySQL automatically scales computing resources. For more information, see [Specifications](https://www.alibabacloud.com/help/en/doc-detail/144851.htm).
     * 
     */
    public String computeResource() {
        return this.computeResource;
    }
    /**
     * @return The endpoint of the cluster.
     * 
     */
    public String connectionString() {
        return this.connectionString;
    }
    /**
     * @return The CreateTime of the ADB cluster.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The db cluster category.
     * 
     */
    public String dbClusterCategory() {
        return this.dbClusterCategory;
    }
    /**
     * @return The db cluster id.
     * 
     */
    public String dbClusterId() {
        return this.dbClusterId;
    }
    /**
     * @return The db cluster network type.
     * 
     */
    public String dbClusterNetworkType() {
        return this.dbClusterNetworkType;
    }
    /**
     * @return The db cluster type.
     * 
     */
    public String dbClusterType() {
        return this.dbClusterType;
    }
    /**
     * @return The db cluster version.
     * 
     */
    public String dbClusterVersion() {
        return this.dbClusterVersion;
    }
    /**
     * @return The db node class.
     * 
     */
    public String dbNodeClass() {
        return this.dbNodeClass;
    }
    /**
     * @return The db node count.
     * 
     */
    public Integer dbNodeCount() {
        return this.dbNodeCount;
    }
    /**
     * @return The db node storage.
     * 
     */
    public Integer dbNodeStorage() {
        return this.dbNodeStorage;
    }
    /**
     * @return The description of DBCluster.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The type of the disk.
     * 
     */
    public String diskType() {
        return this.diskType;
    }
    /**
     * @return The ID of the data synchronization task in Data Transmission Service (DTS). This parameter is valid only for analytic instances.
     * 
     */
    public String dtsJobId() {
        return this.dtsJobId;
    }
    /**
     * @return The elastic io resource.
     * 
     */
    public Integer elasticIoResource() {
        return this.elasticIoResource;
    }
    /**
     * @return The engine of the database.
     * 
     */
    public String engine() {
        return this.engine;
    }
    /**
     * @return The engine version of the database..
     * 
     */
    public String engineVersion() {
        return this.engineVersion;
    }
    /**
     * @return The number of nodes. The node resources are used for data computing in elastic mode.
     * 
     */
    public String executorCount() {
        return this.executorCount;
    }
    /**
     * @return The time when the cluster expires.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return Indicates whether the cluster has expired.
     * 
     */
    public String expired() {
        return this.expired;
    }
    /**
     * @return The ID of the DBCluster.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The lock mode of the cluster.
     * 
     */
    public String lockMode() {
        return this.lockMode;
    }
    /**
     * @return The reason why the cluster is locked.
     * 
     */
    public String lockReason() {
        return this.lockReason;
    }
    /**
     * @return The maintenance window of the cluster.
     * 
     */
    public String maintainTime() {
        return this.maintainTime;
    }
    /**
     * @return The lock mode of the cluster.
     * 
     */
    public String mode() {
        return this.mode;
    }
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return The payment type of the resource.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return The port that is used to access the cluster.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The ID of the ApsaraDB RDS instance from which data is synchronized to the cluster. This parameter is valid only for analytic instances.
     * 
     */
    public String rdsInstanceId() {
        return this.rdsInstanceId;
    }
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return The status of renewal.
     * 
     */
    public String renewalStatus() {
        return this.renewalStatus;
    }
    /**
     * @return The ID of the resource group.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return List of IP addresses allowed to access all databases of an cluster.
     * 
     */
    public List<String> securityIps() {
        return this.securityIps;
    }
    /**
     * @return The status of the resource.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The specifications of storage resources in elastic mode. The resources are used for data read and write operations. The increase of resources can improve the read and write performance of your cluster. For more information, see [Specifications](https://www.alibabacloud.com/help/en/doc-detail/144851.htm).
     * 
     */
    public String storageResource() {
        return this.storageResource;
    }
    /**
     * @return The tag of the resource.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return The vpc cloud instance id.
     * 
     */
    public String vpcCloudInstanceId() {
        return this.vpcCloudInstanceId;
    }
    /**
     * @return The vpc id.
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
     * @return The zone ID  of the resource.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDBClustersCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer autoRenewPeriod;
        private String chargeType;
        private String commodityCode;
        private String computeResource;
        private String connectionString;
        private String createTime;
        private String dbClusterCategory;
        private String dbClusterId;
        private String dbClusterNetworkType;
        private String dbClusterType;
        private String dbClusterVersion;
        private String dbNodeClass;
        private Integer dbNodeCount;
        private Integer dbNodeStorage;
        private String description;
        private String diskType;
        private String dtsJobId;
        private Integer elasticIoResource;
        private String engine;
        private String engineVersion;
        private String executorCount;
        private String expireTime;
        private String expired;
        private String id;
        private String lockMode;
        private String lockReason;
        private String maintainTime;
        private String mode;
        private String networkType;
        private String paymentType;
        private Integer port;
        private String rdsInstanceId;
        private String regionId;
        private String renewalStatus;
        private String resourceGroupId;
        private List<String> securityIps;
        private String status;
        private String storageResource;
        private Map<String,Object> tags;
        private String vpcCloudInstanceId;
        private String vpcId;
        private String vswitchId;
        private String zoneId;
        public Builder() {}
        public Builder(GetDBClustersCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRenewPeriod = defaults.autoRenewPeriod;
    	      this.chargeType = defaults.chargeType;
    	      this.commodityCode = defaults.commodityCode;
    	      this.computeResource = defaults.computeResource;
    	      this.connectionString = defaults.connectionString;
    	      this.createTime = defaults.createTime;
    	      this.dbClusterCategory = defaults.dbClusterCategory;
    	      this.dbClusterId = defaults.dbClusterId;
    	      this.dbClusterNetworkType = defaults.dbClusterNetworkType;
    	      this.dbClusterType = defaults.dbClusterType;
    	      this.dbClusterVersion = defaults.dbClusterVersion;
    	      this.dbNodeClass = defaults.dbNodeClass;
    	      this.dbNodeCount = defaults.dbNodeCount;
    	      this.dbNodeStorage = defaults.dbNodeStorage;
    	      this.description = defaults.description;
    	      this.diskType = defaults.diskType;
    	      this.dtsJobId = defaults.dtsJobId;
    	      this.elasticIoResource = defaults.elasticIoResource;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.executorCount = defaults.executorCount;
    	      this.expireTime = defaults.expireTime;
    	      this.expired = defaults.expired;
    	      this.id = defaults.id;
    	      this.lockMode = defaults.lockMode;
    	      this.lockReason = defaults.lockReason;
    	      this.maintainTime = defaults.maintainTime;
    	      this.mode = defaults.mode;
    	      this.networkType = defaults.networkType;
    	      this.paymentType = defaults.paymentType;
    	      this.port = defaults.port;
    	      this.rdsInstanceId = defaults.rdsInstanceId;
    	      this.regionId = defaults.regionId;
    	      this.renewalStatus = defaults.renewalStatus;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.securityIps = defaults.securityIps;
    	      this.status = defaults.status;
    	      this.storageResource = defaults.storageResource;
    	      this.tags = defaults.tags;
    	      this.vpcCloudInstanceId = defaults.vpcCloudInstanceId;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.autoRenewPeriod = Objects.requireNonNull(autoRenewPeriod);
            return this;
        }
        @CustomType.Setter
        public Builder chargeType(String chargeType) {
            this.chargeType = Objects.requireNonNull(chargeType);
            return this;
        }
        @CustomType.Setter
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = Objects.requireNonNull(commodityCode);
            return this;
        }
        @CustomType.Setter
        public Builder computeResource(String computeResource) {
            this.computeResource = Objects.requireNonNull(computeResource);
            return this;
        }
        @CustomType.Setter
        public Builder connectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder dbClusterCategory(String dbClusterCategory) {
            this.dbClusterCategory = Objects.requireNonNull(dbClusterCategory);
            return this;
        }
        @CustomType.Setter
        public Builder dbClusterId(String dbClusterId) {
            this.dbClusterId = Objects.requireNonNull(dbClusterId);
            return this;
        }
        @CustomType.Setter
        public Builder dbClusterNetworkType(String dbClusterNetworkType) {
            this.dbClusterNetworkType = Objects.requireNonNull(dbClusterNetworkType);
            return this;
        }
        @CustomType.Setter
        public Builder dbClusterType(String dbClusterType) {
            this.dbClusterType = Objects.requireNonNull(dbClusterType);
            return this;
        }
        @CustomType.Setter
        public Builder dbClusterVersion(String dbClusterVersion) {
            this.dbClusterVersion = Objects.requireNonNull(dbClusterVersion);
            return this;
        }
        @CustomType.Setter
        public Builder dbNodeClass(String dbNodeClass) {
            this.dbNodeClass = Objects.requireNonNull(dbNodeClass);
            return this;
        }
        @CustomType.Setter
        public Builder dbNodeCount(Integer dbNodeCount) {
            this.dbNodeCount = Objects.requireNonNull(dbNodeCount);
            return this;
        }
        @CustomType.Setter
        public Builder dbNodeStorage(Integer dbNodeStorage) {
            this.dbNodeStorage = Objects.requireNonNull(dbNodeStorage);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        @CustomType.Setter
        public Builder dtsJobId(String dtsJobId) {
            this.dtsJobId = Objects.requireNonNull(dtsJobId);
            return this;
        }
        @CustomType.Setter
        public Builder elasticIoResource(Integer elasticIoResource) {
            this.elasticIoResource = Objects.requireNonNull(elasticIoResource);
            return this;
        }
        @CustomType.Setter
        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        @CustomType.Setter
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }
        @CustomType.Setter
        public Builder executorCount(String executorCount) {
            this.executorCount = Objects.requireNonNull(executorCount);
            return this;
        }
        @CustomType.Setter
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        @CustomType.Setter
        public Builder expired(String expired) {
            this.expired = Objects.requireNonNull(expired);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder lockMode(String lockMode) {
            this.lockMode = Objects.requireNonNull(lockMode);
            return this;
        }
        @CustomType.Setter
        public Builder lockReason(String lockReason) {
            this.lockReason = Objects.requireNonNull(lockReason);
            return this;
        }
        @CustomType.Setter
        public Builder maintainTime(String maintainTime) {
            this.maintainTime = Objects.requireNonNull(maintainTime);
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        @CustomType.Setter
        public Builder networkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
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
        public Builder rdsInstanceId(String rdsInstanceId) {
            this.rdsInstanceId = Objects.requireNonNull(rdsInstanceId);
            return this;
        }
        @CustomType.Setter
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        @CustomType.Setter
        public Builder renewalStatus(String renewalStatus) {
            this.renewalStatus = Objects.requireNonNull(renewalStatus);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
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
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder storageResource(String storageResource) {
            this.storageResource = Objects.requireNonNull(storageResource);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
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
        public GetDBClustersCluster build() {
            final var o = new GetDBClustersCluster();
            o.autoRenewPeriod = autoRenewPeriod;
            o.chargeType = chargeType;
            o.commodityCode = commodityCode;
            o.computeResource = computeResource;
            o.connectionString = connectionString;
            o.createTime = createTime;
            o.dbClusterCategory = dbClusterCategory;
            o.dbClusterId = dbClusterId;
            o.dbClusterNetworkType = dbClusterNetworkType;
            o.dbClusterType = dbClusterType;
            o.dbClusterVersion = dbClusterVersion;
            o.dbNodeClass = dbNodeClass;
            o.dbNodeCount = dbNodeCount;
            o.dbNodeStorage = dbNodeStorage;
            o.description = description;
            o.diskType = diskType;
            o.dtsJobId = dtsJobId;
            o.elasticIoResource = elasticIoResource;
            o.engine = engine;
            o.engineVersion = engineVersion;
            o.executorCount = executorCount;
            o.expireTime = expireTime;
            o.expired = expired;
            o.id = id;
            o.lockMode = lockMode;
            o.lockReason = lockReason;
            o.maintainTime = maintainTime;
            o.mode = mode;
            o.networkType = networkType;
            o.paymentType = paymentType;
            o.port = port;
            o.rdsInstanceId = rdsInstanceId;
            o.regionId = regionId;
            o.renewalStatus = renewalStatus;
            o.resourceGroupId = resourceGroupId;
            o.securityIps = securityIps;
            o.status = status;
            o.storageResource = storageResource;
            o.tags = tags;
            o.vpcCloudInstanceId = vpcCloudInstanceId;
            o.vpcId = vpcId;
            o.vswitchId = vswitchId;
            o.zoneId = zoneId;
            return o;
        }
    }
}
