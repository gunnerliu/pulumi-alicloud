// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.edas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClustersCluster {
    /**
     * @return The ID of the cluster that you want to create the application.
     * 
     */
    private final String clusterId;
    /**
     * @return The name of the cluster.
     * 
     */
    private final String clusterName;
    /**
     * @return The type of the cluster, Valid values: 1: Swarm cluster. 2: ECS cluster. 3: Kubernates cluster.
     * 
     */
    private final Integer clusterType;
    /**
     * @return The total number of CPUs in the cluster.
     * 
     */
    private final Integer cpu;
    /**
     * @return The number of used CPUs in the cluster.
     * 
     */
    private final Integer cpuUsed;
    /**
     * @return Cluster&#39;s creation time.
     * 
     */
    private final Integer createTime;
    /**
     * @return The total amount of memory in the cluser. Unit: MB.
     * 
     */
    private final Integer mem;
    /**
     * @return The amount of used memory in the cluser. Unit: MB.
     * 
     */
    private final Integer memUsed;
    /**
     * @return The network type of the cluster. Valid values: 1: classic network. 2: VPC.
     * 
     */
    private final Integer networkMode;
    /**
     * @return The number of the Elastic Compute Service (ECS) instances that are deployed to the cluster.
     * 
     */
    private final Integer nodeNum;
    /**
     * @return The ID of the namespace the application belongs to.
     * 
     */
    private final String regionId;
    /**
     * @return The time when the cluster was last updated.
     * 
     */
    private final Integer updateTime;
    /**
     * @return The ID of the Virtual Private Cloud (VPC) for the cluster.
     * 
     */
    private final String vpcId;

    @CustomType.Constructor
    private GetClustersCluster(
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("clusterName") String clusterName,
        @CustomType.Parameter("clusterType") Integer clusterType,
        @CustomType.Parameter("cpu") Integer cpu,
        @CustomType.Parameter("cpuUsed") Integer cpuUsed,
        @CustomType.Parameter("createTime") Integer createTime,
        @CustomType.Parameter("mem") Integer mem,
        @CustomType.Parameter("memUsed") Integer memUsed,
        @CustomType.Parameter("networkMode") Integer networkMode,
        @CustomType.Parameter("nodeNum") Integer nodeNum,
        @CustomType.Parameter("regionId") String regionId,
        @CustomType.Parameter("updateTime") Integer updateTime,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.clusterId = clusterId;
        this.clusterName = clusterName;
        this.clusterType = clusterType;
        this.cpu = cpu;
        this.cpuUsed = cpuUsed;
        this.createTime = createTime;
        this.mem = mem;
        this.memUsed = memUsed;
        this.networkMode = networkMode;
        this.nodeNum = nodeNum;
        this.regionId = regionId;
        this.updateTime = updateTime;
        this.vpcId = vpcId;
    }

    /**
     * @return The ID of the cluster that you want to create the application.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return The name of the cluster.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return The type of the cluster, Valid values: 1: Swarm cluster. 2: ECS cluster. 3: Kubernates cluster.
     * 
     */
    public Integer clusterType() {
        return this.clusterType;
    }
    /**
     * @return The total number of CPUs in the cluster.
     * 
     */
    public Integer cpu() {
        return this.cpu;
    }
    /**
     * @return The number of used CPUs in the cluster.
     * 
     */
    public Integer cpuUsed() {
        return this.cpuUsed;
    }
    /**
     * @return Cluster&#39;s creation time.
     * 
     */
    public Integer createTime() {
        return this.createTime;
    }
    /**
     * @return The total amount of memory in the cluser. Unit: MB.
     * 
     */
    public Integer mem() {
        return this.mem;
    }
    /**
     * @return The amount of used memory in the cluser. Unit: MB.
     * 
     */
    public Integer memUsed() {
        return this.memUsed;
    }
    /**
     * @return The network type of the cluster. Valid values: 1: classic network. 2: VPC.
     * 
     */
    public Integer networkMode() {
        return this.networkMode;
    }
    /**
     * @return The number of the Elastic Compute Service (ECS) instances that are deployed to the cluster.
     * 
     */
    public Integer nodeNum() {
        return this.nodeNum;
    }
    /**
     * @return The ID of the namespace the application belongs to.
     * 
     */
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return The time when the cluster was last updated.
     * 
     */
    public Integer updateTime() {
        return this.updateTime;
    }
    /**
     * @return The ID of the Virtual Private Cloud (VPC) for the cluster.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterId;
        private String clusterName;
        private Integer clusterType;
        private Integer cpu;
        private Integer cpuUsed;
        private Integer createTime;
        private Integer mem;
        private Integer memUsed;
        private Integer networkMode;
        private Integer nodeNum;
        private String regionId;
        private Integer updateTime;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClustersCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.clusterName = defaults.clusterName;
    	      this.clusterType = defaults.clusterType;
    	      this.cpu = defaults.cpu;
    	      this.cpuUsed = defaults.cpuUsed;
    	      this.createTime = defaults.createTime;
    	      this.mem = defaults.mem;
    	      this.memUsed = defaults.memUsed;
    	      this.networkMode = defaults.networkMode;
    	      this.nodeNum = defaults.nodeNum;
    	      this.regionId = defaults.regionId;
    	      this.updateTime = defaults.updateTime;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterType(Integer clusterType) {
            this.clusterType = Objects.requireNonNull(clusterType);
            return this;
        }
        public Builder cpu(Integer cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }
        public Builder cpuUsed(Integer cpuUsed) {
            this.cpuUsed = Objects.requireNonNull(cpuUsed);
            return this;
        }
        public Builder createTime(Integer createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder mem(Integer mem) {
            this.mem = Objects.requireNonNull(mem);
            return this;
        }
        public Builder memUsed(Integer memUsed) {
            this.memUsed = Objects.requireNonNull(memUsed);
            return this;
        }
        public Builder networkMode(Integer networkMode) {
            this.networkMode = Objects.requireNonNull(networkMode);
            return this;
        }
        public Builder nodeNum(Integer nodeNum) {
            this.nodeNum = Objects.requireNonNull(nodeNum);
            return this;
        }
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        public Builder updateTime(Integer updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }        public GetClustersCluster build() {
            return new GetClustersCluster(clusterId, clusterName, clusterType, cpu, cpuUsed, createTime, mem, memUsed, networkMode, nodeNum, regionId, updateTime, vpcId);
        }
    }
}
