// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emr.outputs;

import com.pulumi.alicloud.emr.outputs.GetClustersClusterAccessInfo;
import com.pulumi.alicloud.emr.outputs.GetClustersClusterBootstrapActionList;
import com.pulumi.alicloud.emr.outputs.GetClustersClusterHostGroupList;
import com.pulumi.alicloud.emr.outputs.GetClustersClusterHostPoolInfo;
import com.pulumi.alicloud.emr.outputs.GetClustersClusterRelateClusterInfo;
import com.pulumi.alicloud.emr.outputs.GetClustersClusterSoftwareInfo;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClustersCluster {
    /**
     * @return Cluster connection information.
     * 
     */
    private List<GetClustersClusterAccessInfo> accessInfos;
    /**
     * @return Whether flexible expansion is allowed.
     * 
     */
    private Boolean autoScalingAllowed;
    /**
     * @return Whether to allow expansion by load.
     * 
     */
    private Boolean autoScalingByLoadAllowed;
    /**
     * @return Whether to enable elastic expansion.
     * 
     */
    private Boolean autoScalingEnable;
    /**
     * @return Whether to allow the use of elastic scaling bidding instances.
     * 
     */
    private Boolean autoScalingSpotWithLimitAllowed;
    /**
     * @return List of boot actions.
     * 
     */
    private List<GetClustersClusterBootstrapActionList> bootstrapActionLists;
    /**
     * @return The result of the boot operation.
     * 
     */
    private Boolean bootstrapFailed;
    /**
     * @return The ID of the associated cluster.
     * 
     */
    private String clusterId;
    /**
     * @return The name of the associated cluster.
     * 
     */
    private String clusterName;
    /**
     * @return Cluster tag, no need to pay attention.
     * 
     */
    private String createResource;
    /**
     * @return Creation time.
     * 
     */
    private String createTime;
    /**
     * @return How to create a cluster.
     * 
     */
    private String createType;
    /**
     * @return The hosting type of the cluster.
     * 
     */
    private String depositType;
    /**
     * @return High security cluster.
     * 
     */
    private Boolean easEnable;
    /**
     * @return Timeout time.
     * 
     */
    private String expiredTime;
    /**
     * @return Additional information for Stack.
     * 
     */
    private String extraInfo;
    private Boolean hasUncompletedOrder;
    /**
     * @return High availability cluster.
     * 
     */
    private Boolean highAvailabilityEnable;
    /**
     * @return List of cluster machine groups.
     * 
     */
    private List<GetClustersClusterHostGroupList> hostGroupLists;
    /**
     * @return Machine pool information.
     * 
     */
    private List<GetClustersClusterHostPoolInfo> hostPoolInfos;
    private String id;
    /**
     * @return The ID of the image used to create the cluster.
     * 
     */
    private String imageId;
    /**
     * @return Whether to use Hive local Metabase.
     * 
     */
    private Boolean localMetaDb;
    /**
     * @return The host type of the cluster. The default is ECS.
     * 
     */
    private String machineType;
    /**
     * @return Metadata type:
     * 
     */
    private String metaStoreType;
    /**
     * @return Cluster network type.
     * 
     */
    private String netType;
    /**
     * @return The payment type of the resource.
     * 
     */
    private String paymentType;
    /**
     * @return The package year and month time of the machine group. The Valid Values : `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`.
     * 
     */
    private Integer period;
    /**
     * @return The information of the primary cluster associated with the Gateway.
     * 
     */
    private List<GetClustersClusterRelateClusterInfo> relateClusterInfos;
    /**
     * @return Whether to allow disk expansion:
     * 
     */
    private Boolean resizeDiskEnable;
    /**
     * @return The time (in seconds) that has been running.
     * 
     */
    private Integer runningTime;
    /**
     * @return The ID of the security group.
     * 
     */
    private String securityGroupId;
    /**
     * @return The name of the security group.
     * 
     */
    private String securityGroupName;
    /**
     * @return Service list.
     * 
     */
    private List<GetClustersClusterSoftwareInfo> softwareInfos;
    /**
     * @return Cluster startup time.
     * 
     */
    private String startTime;
    /**
     * @return The cluster status.
     * 
     */
    private String status;
    /**
     * @return Cluster stop time.
     * 
     */
    private String stopTime;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private Map<String,Object> tags;
    /**
     * @return Disk type.
     * 
     */
    private String type;
    /**
     * @return The EMR permission name used.
     * 
     */
    private String userDefinedEmrEcsRole;
    /**
     * @return The user ID.
     * 
     */
    private String userId;
    /**
     * @return The VPC ID.
     * 
     */
    private String vpcId;
    /**
     * @return The vswitch id.
     * 
     */
    private String vswitchId;
    /**
     * @return The zone ID.
     * 
     */
    private String zoneId;

    private GetClustersCluster() {}
    /**
     * @return Cluster connection information.
     * 
     */
    public List<GetClustersClusterAccessInfo> accessInfos() {
        return this.accessInfos;
    }
    /**
     * @return Whether flexible expansion is allowed.
     * 
     */
    public Boolean autoScalingAllowed() {
        return this.autoScalingAllowed;
    }
    /**
     * @return Whether to allow expansion by load.
     * 
     */
    public Boolean autoScalingByLoadAllowed() {
        return this.autoScalingByLoadAllowed;
    }
    /**
     * @return Whether to enable elastic expansion.
     * 
     */
    public Boolean autoScalingEnable() {
        return this.autoScalingEnable;
    }
    /**
     * @return Whether to allow the use of elastic scaling bidding instances.
     * 
     */
    public Boolean autoScalingSpotWithLimitAllowed() {
        return this.autoScalingSpotWithLimitAllowed;
    }
    /**
     * @return List of boot actions.
     * 
     */
    public List<GetClustersClusterBootstrapActionList> bootstrapActionLists() {
        return this.bootstrapActionLists;
    }
    /**
     * @return The result of the boot operation.
     * 
     */
    public Boolean bootstrapFailed() {
        return this.bootstrapFailed;
    }
    /**
     * @return The ID of the associated cluster.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return The name of the associated cluster.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return Cluster tag, no need to pay attention.
     * 
     */
    public String createResource() {
        return this.createResource;
    }
    /**
     * @return Creation time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return How to create a cluster.
     * 
     */
    public String createType() {
        return this.createType;
    }
    /**
     * @return The hosting type of the cluster.
     * 
     */
    public String depositType() {
        return this.depositType;
    }
    /**
     * @return High security cluster.
     * 
     */
    public Boolean easEnable() {
        return this.easEnable;
    }
    /**
     * @return Timeout time.
     * 
     */
    public String expiredTime() {
        return this.expiredTime;
    }
    /**
     * @return Additional information for Stack.
     * 
     */
    public String extraInfo() {
        return this.extraInfo;
    }
    public Boolean hasUncompletedOrder() {
        return this.hasUncompletedOrder;
    }
    /**
     * @return High availability cluster.
     * 
     */
    public Boolean highAvailabilityEnable() {
        return this.highAvailabilityEnable;
    }
    /**
     * @return List of cluster machine groups.
     * 
     */
    public List<GetClustersClusterHostGroupList> hostGroupLists() {
        return this.hostGroupLists;
    }
    /**
     * @return Machine pool information.
     * 
     */
    public List<GetClustersClusterHostPoolInfo> hostPoolInfos() {
        return this.hostPoolInfos;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the image used to create the cluster.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return Whether to use Hive local Metabase.
     * 
     */
    public Boolean localMetaDb() {
        return this.localMetaDb;
    }
    /**
     * @return The host type of the cluster. The default is ECS.
     * 
     */
    public String machineType() {
        return this.machineType;
    }
    /**
     * @return Metadata type:
     * 
     */
    public String metaStoreType() {
        return this.metaStoreType;
    }
    /**
     * @return Cluster network type.
     * 
     */
    public String netType() {
        return this.netType;
    }
    /**
     * @return The payment type of the resource.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return The package year and month time of the machine group. The Valid Values : `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`.
     * 
     */
    public Integer period() {
        return this.period;
    }
    /**
     * @return The information of the primary cluster associated with the Gateway.
     * 
     */
    public List<GetClustersClusterRelateClusterInfo> relateClusterInfos() {
        return this.relateClusterInfos;
    }
    /**
     * @return Whether to allow disk expansion:
     * 
     */
    public Boolean resizeDiskEnable() {
        return this.resizeDiskEnable;
    }
    /**
     * @return The time (in seconds) that has been running.
     * 
     */
    public Integer runningTime() {
        return this.runningTime;
    }
    /**
     * @return The ID of the security group.
     * 
     */
    public String securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * @return The name of the security group.
     * 
     */
    public String securityGroupName() {
        return this.securityGroupName;
    }
    /**
     * @return Service list.
     * 
     */
    public List<GetClustersClusterSoftwareInfo> softwareInfos() {
        return this.softwareInfos;
    }
    /**
     * @return Cluster startup time.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return The cluster status.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Cluster stop time.
     * 
     */
    public String stopTime() {
        return this.stopTime;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return Disk type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The EMR permission name used.
     * 
     */
    public String userDefinedEmrEcsRole() {
        return this.userDefinedEmrEcsRole;
    }
    /**
     * @return The user ID.
     * 
     */
    public String userId() {
        return this.userId;
    }
    /**
     * @return The VPC ID.
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
     * @return The zone ID.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetClustersClusterAccessInfo> accessInfos;
        private Boolean autoScalingAllowed;
        private Boolean autoScalingByLoadAllowed;
        private Boolean autoScalingEnable;
        private Boolean autoScalingSpotWithLimitAllowed;
        private List<GetClustersClusterBootstrapActionList> bootstrapActionLists;
        private Boolean bootstrapFailed;
        private String clusterId;
        private String clusterName;
        private String createResource;
        private String createTime;
        private String createType;
        private String depositType;
        private Boolean easEnable;
        private String expiredTime;
        private String extraInfo;
        private Boolean hasUncompletedOrder;
        private Boolean highAvailabilityEnable;
        private List<GetClustersClusterHostGroupList> hostGroupLists;
        private List<GetClustersClusterHostPoolInfo> hostPoolInfos;
        private String id;
        private String imageId;
        private Boolean localMetaDb;
        private String machineType;
        private String metaStoreType;
        private String netType;
        private String paymentType;
        private Integer period;
        private List<GetClustersClusterRelateClusterInfo> relateClusterInfos;
        private Boolean resizeDiskEnable;
        private Integer runningTime;
        private String securityGroupId;
        private String securityGroupName;
        private List<GetClustersClusterSoftwareInfo> softwareInfos;
        private String startTime;
        private String status;
        private String stopTime;
        private Map<String,Object> tags;
        private String type;
        private String userDefinedEmrEcsRole;
        private String userId;
        private String vpcId;
        private String vswitchId;
        private String zoneId;
        public Builder() {}
        public Builder(GetClustersCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessInfos = defaults.accessInfos;
    	      this.autoScalingAllowed = defaults.autoScalingAllowed;
    	      this.autoScalingByLoadAllowed = defaults.autoScalingByLoadAllowed;
    	      this.autoScalingEnable = defaults.autoScalingEnable;
    	      this.autoScalingSpotWithLimitAllowed = defaults.autoScalingSpotWithLimitAllowed;
    	      this.bootstrapActionLists = defaults.bootstrapActionLists;
    	      this.bootstrapFailed = defaults.bootstrapFailed;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterName = defaults.clusterName;
    	      this.createResource = defaults.createResource;
    	      this.createTime = defaults.createTime;
    	      this.createType = defaults.createType;
    	      this.depositType = defaults.depositType;
    	      this.easEnable = defaults.easEnable;
    	      this.expiredTime = defaults.expiredTime;
    	      this.extraInfo = defaults.extraInfo;
    	      this.hasUncompletedOrder = defaults.hasUncompletedOrder;
    	      this.highAvailabilityEnable = defaults.highAvailabilityEnable;
    	      this.hostGroupLists = defaults.hostGroupLists;
    	      this.hostPoolInfos = defaults.hostPoolInfos;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.localMetaDb = defaults.localMetaDb;
    	      this.machineType = defaults.machineType;
    	      this.metaStoreType = defaults.metaStoreType;
    	      this.netType = defaults.netType;
    	      this.paymentType = defaults.paymentType;
    	      this.period = defaults.period;
    	      this.relateClusterInfos = defaults.relateClusterInfos;
    	      this.resizeDiskEnable = defaults.resizeDiskEnable;
    	      this.runningTime = defaults.runningTime;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.securityGroupName = defaults.securityGroupName;
    	      this.softwareInfos = defaults.softwareInfos;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.stopTime = defaults.stopTime;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.userDefinedEmrEcsRole = defaults.userDefinedEmrEcsRole;
    	      this.userId = defaults.userId;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder accessInfos(List<GetClustersClusterAccessInfo> accessInfos) {
            if (accessInfos == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "accessInfos");
            }
            this.accessInfos = accessInfos;
            return this;
        }
        public Builder accessInfos(GetClustersClusterAccessInfo... accessInfos) {
            return accessInfos(List.of(accessInfos));
        }
        @CustomType.Setter
        public Builder autoScalingAllowed(Boolean autoScalingAllowed) {
            if (autoScalingAllowed == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "autoScalingAllowed");
            }
            this.autoScalingAllowed = autoScalingAllowed;
            return this;
        }
        @CustomType.Setter
        public Builder autoScalingByLoadAllowed(Boolean autoScalingByLoadAllowed) {
            if (autoScalingByLoadAllowed == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "autoScalingByLoadAllowed");
            }
            this.autoScalingByLoadAllowed = autoScalingByLoadAllowed;
            return this;
        }
        @CustomType.Setter
        public Builder autoScalingEnable(Boolean autoScalingEnable) {
            if (autoScalingEnable == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "autoScalingEnable");
            }
            this.autoScalingEnable = autoScalingEnable;
            return this;
        }
        @CustomType.Setter
        public Builder autoScalingSpotWithLimitAllowed(Boolean autoScalingSpotWithLimitAllowed) {
            if (autoScalingSpotWithLimitAllowed == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "autoScalingSpotWithLimitAllowed");
            }
            this.autoScalingSpotWithLimitAllowed = autoScalingSpotWithLimitAllowed;
            return this;
        }
        @CustomType.Setter
        public Builder bootstrapActionLists(List<GetClustersClusterBootstrapActionList> bootstrapActionLists) {
            if (bootstrapActionLists == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "bootstrapActionLists");
            }
            this.bootstrapActionLists = bootstrapActionLists;
            return this;
        }
        public Builder bootstrapActionLists(GetClustersClusterBootstrapActionList... bootstrapActionLists) {
            return bootstrapActionLists(List.of(bootstrapActionLists));
        }
        @CustomType.Setter
        public Builder bootstrapFailed(Boolean bootstrapFailed) {
            if (bootstrapFailed == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "bootstrapFailed");
            }
            this.bootstrapFailed = bootstrapFailed;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            if (clusterId == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "clusterId");
            }
            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            if (clusterName == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "clusterName");
            }
            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder createResource(String createResource) {
            if (createResource == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "createResource");
            }
            this.createResource = createResource;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder createType(String createType) {
            if (createType == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "createType");
            }
            this.createType = createType;
            return this;
        }
        @CustomType.Setter
        public Builder depositType(String depositType) {
            if (depositType == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "depositType");
            }
            this.depositType = depositType;
            return this;
        }
        @CustomType.Setter
        public Builder easEnable(Boolean easEnable) {
            if (easEnable == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "easEnable");
            }
            this.easEnable = easEnable;
            return this;
        }
        @CustomType.Setter
        public Builder expiredTime(String expiredTime) {
            if (expiredTime == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "expiredTime");
            }
            this.expiredTime = expiredTime;
            return this;
        }
        @CustomType.Setter
        public Builder extraInfo(String extraInfo) {
            if (extraInfo == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "extraInfo");
            }
            this.extraInfo = extraInfo;
            return this;
        }
        @CustomType.Setter
        public Builder hasUncompletedOrder(Boolean hasUncompletedOrder) {
            if (hasUncompletedOrder == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "hasUncompletedOrder");
            }
            this.hasUncompletedOrder = hasUncompletedOrder;
            return this;
        }
        @CustomType.Setter
        public Builder highAvailabilityEnable(Boolean highAvailabilityEnable) {
            if (highAvailabilityEnable == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "highAvailabilityEnable");
            }
            this.highAvailabilityEnable = highAvailabilityEnable;
            return this;
        }
        @CustomType.Setter
        public Builder hostGroupLists(List<GetClustersClusterHostGroupList> hostGroupLists) {
            if (hostGroupLists == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "hostGroupLists");
            }
            this.hostGroupLists = hostGroupLists;
            return this;
        }
        public Builder hostGroupLists(GetClustersClusterHostGroupList... hostGroupLists) {
            return hostGroupLists(List.of(hostGroupLists));
        }
        @CustomType.Setter
        public Builder hostPoolInfos(List<GetClustersClusterHostPoolInfo> hostPoolInfos) {
            if (hostPoolInfos == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "hostPoolInfos");
            }
            this.hostPoolInfos = hostPoolInfos;
            return this;
        }
        public Builder hostPoolInfos(GetClustersClusterHostPoolInfo... hostPoolInfos) {
            return hostPoolInfos(List.of(hostPoolInfos));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder imageId(String imageId) {
            if (imageId == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "imageId");
            }
            this.imageId = imageId;
            return this;
        }
        @CustomType.Setter
        public Builder localMetaDb(Boolean localMetaDb) {
            if (localMetaDb == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "localMetaDb");
            }
            this.localMetaDb = localMetaDb;
            return this;
        }
        @CustomType.Setter
        public Builder machineType(String machineType) {
            if (machineType == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "machineType");
            }
            this.machineType = machineType;
            return this;
        }
        @CustomType.Setter
        public Builder metaStoreType(String metaStoreType) {
            if (metaStoreType == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "metaStoreType");
            }
            this.metaStoreType = metaStoreType;
            return this;
        }
        @CustomType.Setter
        public Builder netType(String netType) {
            if (netType == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "netType");
            }
            this.netType = netType;
            return this;
        }
        @CustomType.Setter
        public Builder paymentType(String paymentType) {
            if (paymentType == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "paymentType");
            }
            this.paymentType = paymentType;
            return this;
        }
        @CustomType.Setter
        public Builder period(Integer period) {
            if (period == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "period");
            }
            this.period = period;
            return this;
        }
        @CustomType.Setter
        public Builder relateClusterInfos(List<GetClustersClusterRelateClusterInfo> relateClusterInfos) {
            if (relateClusterInfos == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "relateClusterInfos");
            }
            this.relateClusterInfos = relateClusterInfos;
            return this;
        }
        public Builder relateClusterInfos(GetClustersClusterRelateClusterInfo... relateClusterInfos) {
            return relateClusterInfos(List.of(relateClusterInfos));
        }
        @CustomType.Setter
        public Builder resizeDiskEnable(Boolean resizeDiskEnable) {
            if (resizeDiskEnable == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "resizeDiskEnable");
            }
            this.resizeDiskEnable = resizeDiskEnable;
            return this;
        }
        @CustomType.Setter
        public Builder runningTime(Integer runningTime) {
            if (runningTime == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "runningTime");
            }
            this.runningTime = runningTime;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupId(String securityGroupId) {
            if (securityGroupId == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "securityGroupId");
            }
            this.securityGroupId = securityGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupName(String securityGroupName) {
            if (securityGroupName == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "securityGroupName");
            }
            this.securityGroupName = securityGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder softwareInfos(List<GetClustersClusterSoftwareInfo> softwareInfos) {
            if (softwareInfos == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "softwareInfos");
            }
            this.softwareInfos = softwareInfos;
            return this;
        }
        public Builder softwareInfos(GetClustersClusterSoftwareInfo... softwareInfos) {
            return softwareInfos(List.of(softwareInfos));
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            if (startTime == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "startTime");
            }
            this.startTime = startTime;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder stopTime(String stopTime) {
            if (stopTime == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "stopTime");
            }
            this.stopTime = stopTime;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder userDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
            if (userDefinedEmrEcsRole == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "userDefinedEmrEcsRole");
            }
            this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
            return this;
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            if (userId == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "userId");
            }
            this.userId = userId;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            if (vswitchId == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "vswitchId");
            }
            this.vswitchId = vswitchId;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetClustersCluster build() {
            final var _resultValue = new GetClustersCluster();
            _resultValue.accessInfos = accessInfos;
            _resultValue.autoScalingAllowed = autoScalingAllowed;
            _resultValue.autoScalingByLoadAllowed = autoScalingByLoadAllowed;
            _resultValue.autoScalingEnable = autoScalingEnable;
            _resultValue.autoScalingSpotWithLimitAllowed = autoScalingSpotWithLimitAllowed;
            _resultValue.bootstrapActionLists = bootstrapActionLists;
            _resultValue.bootstrapFailed = bootstrapFailed;
            _resultValue.clusterId = clusterId;
            _resultValue.clusterName = clusterName;
            _resultValue.createResource = createResource;
            _resultValue.createTime = createTime;
            _resultValue.createType = createType;
            _resultValue.depositType = depositType;
            _resultValue.easEnable = easEnable;
            _resultValue.expiredTime = expiredTime;
            _resultValue.extraInfo = extraInfo;
            _resultValue.hasUncompletedOrder = hasUncompletedOrder;
            _resultValue.highAvailabilityEnable = highAvailabilityEnable;
            _resultValue.hostGroupLists = hostGroupLists;
            _resultValue.hostPoolInfos = hostPoolInfos;
            _resultValue.id = id;
            _resultValue.imageId = imageId;
            _resultValue.localMetaDb = localMetaDb;
            _resultValue.machineType = machineType;
            _resultValue.metaStoreType = metaStoreType;
            _resultValue.netType = netType;
            _resultValue.paymentType = paymentType;
            _resultValue.period = period;
            _resultValue.relateClusterInfos = relateClusterInfos;
            _resultValue.resizeDiskEnable = resizeDiskEnable;
            _resultValue.runningTime = runningTime;
            _resultValue.securityGroupId = securityGroupId;
            _resultValue.securityGroupName = securityGroupName;
            _resultValue.softwareInfos = softwareInfos;
            _resultValue.startTime = startTime;
            _resultValue.status = status;
            _resultValue.stopTime = stopTime;
            _resultValue.tags = tags;
            _resultValue.type = type;
            _resultValue.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
            _resultValue.userId = userId;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchId = vswitchId;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
