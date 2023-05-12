// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cddc.outputs;

import com.pulumi.alicloud.cddc.outputs.GetDedicatedHostGroupsGroupDedicatedHostCountGroupByHostType;
import com.pulumi.alicloud.cddc.outputs.GetDedicatedHostGroupsGroupZoneIdList;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDedicatedHostGroupsGroup {
    /**
     * @return The policy that is used to allocate resources in the dedicated cluster. Valid values:`Evenly`,`Intensively`
     * 
     */
    private final String allocationPolicy;
    /**
     * @return The Bastion Instance id of the Dedicated Host Group.
     * 
     */
    private final String bastionInstanceId;
    /**
     * @return The CPU overcommitment ratio of the dedicated cluster. If you set this parameter to 200, the CPU resources that can be allocated are twice as many as the CPU resources that are provided. This maximizes the CPU utilization. Valid values: 100 to 300. Default value: 200.
     * 
     */
    private final Double cpuAllocateRation;
    /**
     * @return The CPU Allocated Amount of the Dedicated Host Group.
     * 
     */
    private final Double cpuAllocatedAmount;
    /**
     * @return The CPU overcommitment ratio of the dedicated cluster.Valid values: 100 to 300. Default value: 200.
     * 
     */
    private final Integer cpuAllocationRatio;
    /**
     * @return The Created Time of the Dedicated Host Group.
     * 
     */
    private final String createTime;
    /**
     * @return The Dedicated Host Count Group by Host Type of the Dedicated Host Group.
     * 
     */
    private final List<GetDedicatedHostGroupsGroupDedicatedHostCountGroupByHostType> dedicatedHostCountGroupByHostTypes;
    /**
     * @return The name of the dedicated cluster. The name must be 1 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
     * 
     */
    private final String dedicatedHostGroupDesc;
    /**
     * @return Dedicated Host Group ID.
     * 
     */
    private final String dedicatedHostGroupId;
    /**
     * @return The Deployment Type of the Dedicated Host Group.
     * 
     */
    private final String deployType;
    /**
     * @return The storage overcommitment ratio of the dedicated cluster.Valid values: 100 to 300. Default value: 200.
     * 
     */
    private final Double diskAllocateRation;
    /**
     * @return The Disk Allocated Amount of the Dedicated Host Group.
     * 
     */
    private final Double diskAllocatedAmount;
    /**
     * @return The Disk Allocation Ratio of the Dedicated Host Group.
     * 
     */
    private final Integer diskAllocationRatio;
    /**
     * @return The DiskUsedAmount of the Dedicated Host Group.
     * 
     */
    private final Double diskUsedAmount;
    /**
     * @return The DiskUtility of the Dedicated Host Group.
     * 
     */
    private final Double diskUtility;
    /**
     * @return Database Engine Type.The database engine of the dedicated cluster. Valid values:`Redis`, `SQLServer`, `MySQL`, `PostgreSQL`, `MongoDB`
     * 
     */
    private final String engine;
    /**
     * @return The Total Host Number  of the Dedicated Host Group.
     * 
     */
    private final Integer hostNumber;
    /**
     * @return The policy based on which the system handles host failures. Valid values:`Auto`,`Manual`
     * 
     */
    private final String hostReplacePolicy;
    /**
     * @return The ID of the Dedicated Host Group.
     * 
     */
    private final String id;
    /**
     * @return The Total Instance Number of the Dedicated Host Group.
     * 
     */
    private final Integer instanceNumber;
    /**
     * @return The maximum memory usage of each host in the dedicated cluster.Valid values: 0 to 90. Default value: 90.
     * 
     */
    private final Double memAllocateRation;
    /**
     * @return The MemAllocatedAmount of the Dedicated Host Group.
     * 
     */
    private final Double memAllocatedAmount;
    /**
     * @return The Memory Allocation Ratio of the Dedicated Host Group.
     * 
     */
    private final Integer memAllocationRatio;
    /**
     * @return The MemUsedAmount of the Dedicated Host Group.
     * 
     */
    private final Double memUsedAmount;
    /**
     * @return The Mem Utility of the Dedicated Host Group.
     * 
     */
    private final Double memUtility;
    /**
     * @return The Text of the Dedicated Host Group.
     * 
     */
    private final String text;
    /**
     * @return The virtual private cloud (VPC) ID of the dedicated cluster.
     * 
     */
    private final String vpcId;
    /**
     * @return The ZoneIDList of the Dedicated Host Group.
     * 
     */
    private final List<GetDedicatedHostGroupsGroupZoneIdList> zoneIdLists;

    @CustomType.Constructor
    private GetDedicatedHostGroupsGroup(
        @CustomType.Parameter("allocationPolicy") String allocationPolicy,
        @CustomType.Parameter("bastionInstanceId") String bastionInstanceId,
        @CustomType.Parameter("cpuAllocateRation") Double cpuAllocateRation,
        @CustomType.Parameter("cpuAllocatedAmount") Double cpuAllocatedAmount,
        @CustomType.Parameter("cpuAllocationRatio") Integer cpuAllocationRatio,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("dedicatedHostCountGroupByHostTypes") List<GetDedicatedHostGroupsGroupDedicatedHostCountGroupByHostType> dedicatedHostCountGroupByHostTypes,
        @CustomType.Parameter("dedicatedHostGroupDesc") String dedicatedHostGroupDesc,
        @CustomType.Parameter("dedicatedHostGroupId") String dedicatedHostGroupId,
        @CustomType.Parameter("deployType") String deployType,
        @CustomType.Parameter("diskAllocateRation") Double diskAllocateRation,
        @CustomType.Parameter("diskAllocatedAmount") Double diskAllocatedAmount,
        @CustomType.Parameter("diskAllocationRatio") Integer diskAllocationRatio,
        @CustomType.Parameter("diskUsedAmount") Double diskUsedAmount,
        @CustomType.Parameter("diskUtility") Double diskUtility,
        @CustomType.Parameter("engine") String engine,
        @CustomType.Parameter("hostNumber") Integer hostNumber,
        @CustomType.Parameter("hostReplacePolicy") String hostReplacePolicy,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceNumber") Integer instanceNumber,
        @CustomType.Parameter("memAllocateRation") Double memAllocateRation,
        @CustomType.Parameter("memAllocatedAmount") Double memAllocatedAmount,
        @CustomType.Parameter("memAllocationRatio") Integer memAllocationRatio,
        @CustomType.Parameter("memUsedAmount") Double memUsedAmount,
        @CustomType.Parameter("memUtility") Double memUtility,
        @CustomType.Parameter("text") String text,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("zoneIdLists") List<GetDedicatedHostGroupsGroupZoneIdList> zoneIdLists) {
        this.allocationPolicy = allocationPolicy;
        this.bastionInstanceId = bastionInstanceId;
        this.cpuAllocateRation = cpuAllocateRation;
        this.cpuAllocatedAmount = cpuAllocatedAmount;
        this.cpuAllocationRatio = cpuAllocationRatio;
        this.createTime = createTime;
        this.dedicatedHostCountGroupByHostTypes = dedicatedHostCountGroupByHostTypes;
        this.dedicatedHostGroupDesc = dedicatedHostGroupDesc;
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        this.deployType = deployType;
        this.diskAllocateRation = diskAllocateRation;
        this.diskAllocatedAmount = diskAllocatedAmount;
        this.diskAllocationRatio = diskAllocationRatio;
        this.diskUsedAmount = diskUsedAmount;
        this.diskUtility = diskUtility;
        this.engine = engine;
        this.hostNumber = hostNumber;
        this.hostReplacePolicy = hostReplacePolicy;
        this.id = id;
        this.instanceNumber = instanceNumber;
        this.memAllocateRation = memAllocateRation;
        this.memAllocatedAmount = memAllocatedAmount;
        this.memAllocationRatio = memAllocationRatio;
        this.memUsedAmount = memUsedAmount;
        this.memUtility = memUtility;
        this.text = text;
        this.vpcId = vpcId;
        this.zoneIdLists = zoneIdLists;
    }

    /**
     * @return The policy that is used to allocate resources in the dedicated cluster. Valid values:`Evenly`,`Intensively`
     * 
     */
    public String allocationPolicy() {
        return this.allocationPolicy;
    }
    /**
     * @return The Bastion Instance id of the Dedicated Host Group.
     * 
     */
    public String bastionInstanceId() {
        return this.bastionInstanceId;
    }
    /**
     * @return The CPU overcommitment ratio of the dedicated cluster. If you set this parameter to 200, the CPU resources that can be allocated are twice as many as the CPU resources that are provided. This maximizes the CPU utilization. Valid values: 100 to 300. Default value: 200.
     * 
     */
    public Double cpuAllocateRation() {
        return this.cpuAllocateRation;
    }
    /**
     * @return The CPU Allocated Amount of the Dedicated Host Group.
     * 
     */
    public Double cpuAllocatedAmount() {
        return this.cpuAllocatedAmount;
    }
    /**
     * @return The CPU overcommitment ratio of the dedicated cluster.Valid values: 100 to 300. Default value: 200.
     * 
     */
    public Integer cpuAllocationRatio() {
        return this.cpuAllocationRatio;
    }
    /**
     * @return The Created Time of the Dedicated Host Group.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The Dedicated Host Count Group by Host Type of the Dedicated Host Group.
     * 
     */
    public List<GetDedicatedHostGroupsGroupDedicatedHostCountGroupByHostType> dedicatedHostCountGroupByHostTypes() {
        return this.dedicatedHostCountGroupByHostTypes;
    }
    /**
     * @return The name of the dedicated cluster. The name must be 1 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.
     * 
     */
    public String dedicatedHostGroupDesc() {
        return this.dedicatedHostGroupDesc;
    }
    /**
     * @return Dedicated Host Group ID.
     * 
     */
    public String dedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }
    /**
     * @return The Deployment Type of the Dedicated Host Group.
     * 
     */
    public String deployType() {
        return this.deployType;
    }
    /**
     * @return The storage overcommitment ratio of the dedicated cluster.Valid values: 100 to 300. Default value: 200.
     * 
     */
    public Double diskAllocateRation() {
        return this.diskAllocateRation;
    }
    /**
     * @return The Disk Allocated Amount of the Dedicated Host Group.
     * 
     */
    public Double diskAllocatedAmount() {
        return this.diskAllocatedAmount;
    }
    /**
     * @return The Disk Allocation Ratio of the Dedicated Host Group.
     * 
     */
    public Integer diskAllocationRatio() {
        return this.diskAllocationRatio;
    }
    /**
     * @return The DiskUsedAmount of the Dedicated Host Group.
     * 
     */
    public Double diskUsedAmount() {
        return this.diskUsedAmount;
    }
    /**
     * @return The DiskUtility of the Dedicated Host Group.
     * 
     */
    public Double diskUtility() {
        return this.diskUtility;
    }
    /**
     * @return Database Engine Type.The database engine of the dedicated cluster. Valid values:`Redis`, `SQLServer`, `MySQL`, `PostgreSQL`, `MongoDB`
     * 
     */
    public String engine() {
        return this.engine;
    }
    /**
     * @return The Total Host Number  of the Dedicated Host Group.
     * 
     */
    public Integer hostNumber() {
        return this.hostNumber;
    }
    /**
     * @return The policy based on which the system handles host failures. Valid values:`Auto`,`Manual`
     * 
     */
    public String hostReplacePolicy() {
        return this.hostReplacePolicy;
    }
    /**
     * @return The ID of the Dedicated Host Group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Total Instance Number of the Dedicated Host Group.
     * 
     */
    public Integer instanceNumber() {
        return this.instanceNumber;
    }
    /**
     * @return The maximum memory usage of each host in the dedicated cluster.Valid values: 0 to 90. Default value: 90.
     * 
     */
    public Double memAllocateRation() {
        return this.memAllocateRation;
    }
    /**
     * @return The MemAllocatedAmount of the Dedicated Host Group.
     * 
     */
    public Double memAllocatedAmount() {
        return this.memAllocatedAmount;
    }
    /**
     * @return The Memory Allocation Ratio of the Dedicated Host Group.
     * 
     */
    public Integer memAllocationRatio() {
        return this.memAllocationRatio;
    }
    /**
     * @return The MemUsedAmount of the Dedicated Host Group.
     * 
     */
    public Double memUsedAmount() {
        return this.memUsedAmount;
    }
    /**
     * @return The Mem Utility of the Dedicated Host Group.
     * 
     */
    public Double memUtility() {
        return this.memUtility;
    }
    /**
     * @return The Text of the Dedicated Host Group.
     * 
     */
    public String text() {
        return this.text;
    }
    /**
     * @return The virtual private cloud (VPC) ID of the dedicated cluster.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The ZoneIDList of the Dedicated Host Group.
     * 
     */
    public List<GetDedicatedHostGroupsGroupZoneIdList> zoneIdLists() {
        return this.zoneIdLists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedHostGroupsGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationPolicy;
        private String bastionInstanceId;
        private Double cpuAllocateRation;
        private Double cpuAllocatedAmount;
        private Integer cpuAllocationRatio;
        private String createTime;
        private List<GetDedicatedHostGroupsGroupDedicatedHostCountGroupByHostType> dedicatedHostCountGroupByHostTypes;
        private String dedicatedHostGroupDesc;
        private String dedicatedHostGroupId;
        private String deployType;
        private Double diskAllocateRation;
        private Double diskAllocatedAmount;
        private Integer diskAllocationRatio;
        private Double diskUsedAmount;
        private Double diskUtility;
        private String engine;
        private Integer hostNumber;
        private String hostReplacePolicy;
        private String id;
        private Integer instanceNumber;
        private Double memAllocateRation;
        private Double memAllocatedAmount;
        private Integer memAllocationRatio;
        private Double memUsedAmount;
        private Double memUtility;
        private String text;
        private String vpcId;
        private List<GetDedicatedHostGroupsGroupZoneIdList> zoneIdLists;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDedicatedHostGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationPolicy = defaults.allocationPolicy;
    	      this.bastionInstanceId = defaults.bastionInstanceId;
    	      this.cpuAllocateRation = defaults.cpuAllocateRation;
    	      this.cpuAllocatedAmount = defaults.cpuAllocatedAmount;
    	      this.cpuAllocationRatio = defaults.cpuAllocationRatio;
    	      this.createTime = defaults.createTime;
    	      this.dedicatedHostCountGroupByHostTypes = defaults.dedicatedHostCountGroupByHostTypes;
    	      this.dedicatedHostGroupDesc = defaults.dedicatedHostGroupDesc;
    	      this.dedicatedHostGroupId = defaults.dedicatedHostGroupId;
    	      this.deployType = defaults.deployType;
    	      this.diskAllocateRation = defaults.diskAllocateRation;
    	      this.diskAllocatedAmount = defaults.diskAllocatedAmount;
    	      this.diskAllocationRatio = defaults.diskAllocationRatio;
    	      this.diskUsedAmount = defaults.diskUsedAmount;
    	      this.diskUtility = defaults.diskUtility;
    	      this.engine = defaults.engine;
    	      this.hostNumber = defaults.hostNumber;
    	      this.hostReplacePolicy = defaults.hostReplacePolicy;
    	      this.id = defaults.id;
    	      this.instanceNumber = defaults.instanceNumber;
    	      this.memAllocateRation = defaults.memAllocateRation;
    	      this.memAllocatedAmount = defaults.memAllocatedAmount;
    	      this.memAllocationRatio = defaults.memAllocationRatio;
    	      this.memUsedAmount = defaults.memUsedAmount;
    	      this.memUtility = defaults.memUtility;
    	      this.text = defaults.text;
    	      this.vpcId = defaults.vpcId;
    	      this.zoneIdLists = defaults.zoneIdLists;
        }

        public Builder allocationPolicy(String allocationPolicy) {
            this.allocationPolicy = Objects.requireNonNull(allocationPolicy);
            return this;
        }
        public Builder bastionInstanceId(String bastionInstanceId) {
            this.bastionInstanceId = Objects.requireNonNull(bastionInstanceId);
            return this;
        }
        public Builder cpuAllocateRation(Double cpuAllocateRation) {
            this.cpuAllocateRation = Objects.requireNonNull(cpuAllocateRation);
            return this;
        }
        public Builder cpuAllocatedAmount(Double cpuAllocatedAmount) {
            this.cpuAllocatedAmount = Objects.requireNonNull(cpuAllocatedAmount);
            return this;
        }
        public Builder cpuAllocationRatio(Integer cpuAllocationRatio) {
            this.cpuAllocationRatio = Objects.requireNonNull(cpuAllocationRatio);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder dedicatedHostCountGroupByHostTypes(List<GetDedicatedHostGroupsGroupDedicatedHostCountGroupByHostType> dedicatedHostCountGroupByHostTypes) {
            this.dedicatedHostCountGroupByHostTypes = Objects.requireNonNull(dedicatedHostCountGroupByHostTypes);
            return this;
        }
        public Builder dedicatedHostCountGroupByHostTypes(GetDedicatedHostGroupsGroupDedicatedHostCountGroupByHostType... dedicatedHostCountGroupByHostTypes) {
            return dedicatedHostCountGroupByHostTypes(List.of(dedicatedHostCountGroupByHostTypes));
        }
        public Builder dedicatedHostGroupDesc(String dedicatedHostGroupDesc) {
            this.dedicatedHostGroupDesc = Objects.requireNonNull(dedicatedHostGroupDesc);
            return this;
        }
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = Objects.requireNonNull(dedicatedHostGroupId);
            return this;
        }
        public Builder deployType(String deployType) {
            this.deployType = Objects.requireNonNull(deployType);
            return this;
        }
        public Builder diskAllocateRation(Double diskAllocateRation) {
            this.diskAllocateRation = Objects.requireNonNull(diskAllocateRation);
            return this;
        }
        public Builder diskAllocatedAmount(Double diskAllocatedAmount) {
            this.diskAllocatedAmount = Objects.requireNonNull(diskAllocatedAmount);
            return this;
        }
        public Builder diskAllocationRatio(Integer diskAllocationRatio) {
            this.diskAllocationRatio = Objects.requireNonNull(diskAllocationRatio);
            return this;
        }
        public Builder diskUsedAmount(Double diskUsedAmount) {
            this.diskUsedAmount = Objects.requireNonNull(diskUsedAmount);
            return this;
        }
        public Builder diskUtility(Double diskUtility) {
            this.diskUtility = Objects.requireNonNull(diskUtility);
            return this;
        }
        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        public Builder hostNumber(Integer hostNumber) {
            this.hostNumber = Objects.requireNonNull(hostNumber);
            return this;
        }
        public Builder hostReplacePolicy(String hostReplacePolicy) {
            this.hostReplacePolicy = Objects.requireNonNull(hostReplacePolicy);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceNumber(Integer instanceNumber) {
            this.instanceNumber = Objects.requireNonNull(instanceNumber);
            return this;
        }
        public Builder memAllocateRation(Double memAllocateRation) {
            this.memAllocateRation = Objects.requireNonNull(memAllocateRation);
            return this;
        }
        public Builder memAllocatedAmount(Double memAllocatedAmount) {
            this.memAllocatedAmount = Objects.requireNonNull(memAllocatedAmount);
            return this;
        }
        public Builder memAllocationRatio(Integer memAllocationRatio) {
            this.memAllocationRatio = Objects.requireNonNull(memAllocationRatio);
            return this;
        }
        public Builder memUsedAmount(Double memUsedAmount) {
            this.memUsedAmount = Objects.requireNonNull(memUsedAmount);
            return this;
        }
        public Builder memUtility(Double memUtility) {
            this.memUtility = Objects.requireNonNull(memUtility);
            return this;
        }
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder zoneIdLists(List<GetDedicatedHostGroupsGroupZoneIdList> zoneIdLists) {
            this.zoneIdLists = Objects.requireNonNull(zoneIdLists);
            return this;
        }
        public Builder zoneIdLists(GetDedicatedHostGroupsGroupZoneIdList... zoneIdLists) {
            return zoneIdLists(List.of(zoneIdLists));
        }        public GetDedicatedHostGroupsGroup build() {
            return new GetDedicatedHostGroupsGroup(allocationPolicy, bastionInstanceId, cpuAllocateRation, cpuAllocatedAmount, cpuAllocationRatio, createTime, dedicatedHostCountGroupByHostTypes, dedicatedHostGroupDesc, dedicatedHostGroupId, deployType, diskAllocateRation, diskAllocatedAmount, diskAllocationRatio, diskUsedAmount, diskUtility, engine, hostNumber, hostReplacePolicy, id, instanceNumber, memAllocateRation, memAllocatedAmount, memAllocationRatio, memUsedAmount, memUtility, text, vpcId, zoneIdLists);
        }
    }
}
