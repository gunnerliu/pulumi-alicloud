// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cassandra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDataCentersCenter {
    /**
     * @return The cluster id of dataCenters belongs to.
     * 
     */
    private final String clusterId;
    /**
     * @return The commodity ID of the Cassandra dataCenter.
     * 
     */
    private final String commodityInstance;
    private final String createdTime;
    /**
     * @return The id of the Cassandra dataCenter.
     * 
     */
    private final String dataCenterId;
    /**
     * @return The name of the Cassandra dataCenter.
     * 
     */
    private final String dataCenterName;
    /**
     * @return One node disk size, unit:GB.
     * 
     */
    private final Integer diskSize;
    /**
     * @return Cloud_ssd or cloud_efficiency.
     * 
     */
    private final String diskType;
    /**
     * @return The expire time of the dataCenter.
     * 
     */
    private final String expireTime;
    /**
     * @return The instance type of the Cassandra dataCenter, eg: cassandra.c.large.
     * 
     */
    private final String instanceType;
    /**
     * @return The lock mode of the dataCenter.
     * 
     */
    private final String lockMode;
    /**
     * @return The node count of dataCenter.
     * 
     */
    private final Integer nodeCount;
    /**
     * @return Billing method. Value options are `Subscription` for Pay-As-You-Go and `PayAsYouGo` for yearly or monthly subscription.
     * 
     */
    private final String payType;
    /**
     * @return Status of the dataCenter.
     * 
     */
    private final String status;
    /**
     * @return VPC ID the dataCenter belongs to.
     * 
     */
    private final String vpcId;
    /**
     * @return VSwitch ID the dataCenter belongs to.
     * 
     */
    private final String vswitchId;
    /**
     * @return Zone ID the dataCenter belongs to.
     * 
     */
    private final String zoneId;

    @CustomType.Constructor
    private GetDataCentersCenter(
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("commodityInstance") String commodityInstance,
        @CustomType.Parameter("createdTime") String createdTime,
        @CustomType.Parameter("dataCenterId") String dataCenterId,
        @CustomType.Parameter("dataCenterName") String dataCenterName,
        @CustomType.Parameter("diskSize") Integer diskSize,
        @CustomType.Parameter("diskType") String diskType,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("lockMode") String lockMode,
        @CustomType.Parameter("nodeCount") Integer nodeCount,
        @CustomType.Parameter("payType") String payType,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("vswitchId") String vswitchId,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.clusterId = clusterId;
        this.commodityInstance = commodityInstance;
        this.createdTime = createdTime;
        this.dataCenterId = dataCenterId;
        this.dataCenterName = dataCenterName;
        this.diskSize = diskSize;
        this.diskType = diskType;
        this.expireTime = expireTime;
        this.instanceType = instanceType;
        this.lockMode = lockMode;
        this.nodeCount = nodeCount;
        this.payType = payType;
        this.status = status;
        this.vpcId = vpcId;
        this.vswitchId = vswitchId;
        this.zoneId = zoneId;
    }

    /**
     * @return The cluster id of dataCenters belongs to.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return The commodity ID of the Cassandra dataCenter.
     * 
     */
    public String commodityInstance() {
        return this.commodityInstance;
    }
    public String createdTime() {
        return this.createdTime;
    }
    /**
     * @return The id of the Cassandra dataCenter.
     * 
     */
    public String dataCenterId() {
        return this.dataCenterId;
    }
    /**
     * @return The name of the Cassandra dataCenter.
     * 
     */
    public String dataCenterName() {
        return this.dataCenterName;
    }
    /**
     * @return One node disk size, unit:GB.
     * 
     */
    public Integer diskSize() {
        return this.diskSize;
    }
    /**
     * @return Cloud_ssd or cloud_efficiency.
     * 
     */
    public String diskType() {
        return this.diskType;
    }
    /**
     * @return The expire time of the dataCenter.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return The instance type of the Cassandra dataCenter, eg: cassandra.c.large.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The lock mode of the dataCenter.
     * 
     */
    public String lockMode() {
        return this.lockMode;
    }
    /**
     * @return The node count of dataCenter.
     * 
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }
    /**
     * @return Billing method. Value options are `Subscription` for Pay-As-You-Go and `PayAsYouGo` for yearly or monthly subscription.
     * 
     */
    public String payType() {
        return this.payType;
    }
    /**
     * @return Status of the dataCenter.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return VPC ID the dataCenter belongs to.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return VSwitch ID the dataCenter belongs to.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }
    /**
     * @return Zone ID the dataCenter belongs to.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCentersCenter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterId;
        private String commodityInstance;
        private String createdTime;
        private String dataCenterId;
        private String dataCenterName;
        private Integer diskSize;
        private String diskType;
        private String expireTime;
        private String instanceType;
        private String lockMode;
        private Integer nodeCount;
        private String payType;
        private String status;
        private String vpcId;
        private String vswitchId;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCentersCenter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.commodityInstance = defaults.commodityInstance;
    	      this.createdTime = defaults.createdTime;
    	      this.dataCenterId = defaults.dataCenterId;
    	      this.dataCenterName = defaults.dataCenterName;
    	      this.diskSize = defaults.diskSize;
    	      this.diskType = defaults.diskType;
    	      this.expireTime = defaults.expireTime;
    	      this.instanceType = defaults.instanceType;
    	      this.lockMode = defaults.lockMode;
    	      this.nodeCount = defaults.nodeCount;
    	      this.payType = defaults.payType;
    	      this.status = defaults.status;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder commodityInstance(String commodityInstance) {
            this.commodityInstance = Objects.requireNonNull(commodityInstance);
            return this;
        }
        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }
        public Builder dataCenterId(String dataCenterId) {
            this.dataCenterId = Objects.requireNonNull(dataCenterId);
            return this;
        }
        public Builder dataCenterName(String dataCenterName) {
            this.dataCenterName = Objects.requireNonNull(dataCenterName);
            return this;
        }
        public Builder diskSize(Integer diskSize) {
            this.diskSize = Objects.requireNonNull(diskSize);
            return this;
        }
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder lockMode(String lockMode) {
            this.lockMode = Objects.requireNonNull(lockMode);
            return this;
        }
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }
        public Builder payType(String payType) {
            this.payType = Objects.requireNonNull(payType);
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
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = Objects.requireNonNull(vswitchId);
            return this;
        }
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }        public GetDataCentersCenter build() {
            return new GetDataCentersCenter(clusterId, commodityInstance, createdTime, dataCenterId, dataCenterName, diskSize, diskType, expireTime, instanceType, lockMode, nodeCount, payType, status, vpcId, vswitchId, zoneId);
        }
    }
}
