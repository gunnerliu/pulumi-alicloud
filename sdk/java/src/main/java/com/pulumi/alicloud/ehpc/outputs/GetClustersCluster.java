// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ehpc.outputs;

import com.pulumi.alicloud.ehpc.outputs.GetClustersClusterApplication;
import com.pulumi.alicloud.ehpc.outputs.GetClustersClusterPostInstallScript;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClustersCluster {
    /**
     * @return The server type of the account.
     * 
     */
    private final String accountType;
    private final List<GetClustersClusterApplication> applications;
    /**
     * @return The version number of the client used by the cluster.
     * 
     */
    private final String clientVersion;
    /**
     * @return The id of E-HPC Cluster.
     * 
     */
    private final String clusterId;
    /**
     * @return The name of E-HPC cluster.
     * 
     */
    private final String clusterName;
    /**
     * @return The number of compute nodes in the cluster.
     * 
     */
    private final Integer computeCount;
    /**
     * @return Cluster compute node specifications.
     * 
     */
    private final String computeInstanceType;
    /**
     * @return The creation time of the resource.
     * 
     */
    private final String createTime;
    /**
     * @return Cluster deployment mode. Possible values:
     * - Standard: separate deployment of account nodes, scheduling nodes, login nodes, and compute nodes.
     * - Advanced:HA mode deployment.
     * - Simple: the account node and the scheduling node are deployed on one node, and the login node and the compute node are deployed separately.
     * - Tiny: account nodes, scheduling nodes, and login nodes are deployed on one node, and compute nodes are deployed separately.
     * - OneBox: account node, scheduling node, login node and compute node are deployed on one node.
     * 
     */
    private final String deployMode;
    /**
     * @return The description of E-HPC cluster.
     * 
     */
    private final String description;
    /**
     * @return Whether to turn on high availability. &gt; If high availability is enabled, each control role in the cluster will use two primary and secondary instances.
     * 
     */
    private final Boolean haEnable;
    /**
     * @return The ID of the Cluster.
     * 
     */
    private final String id;
    /**
     * @return The ID of the Image.
     * 
     */
    private final String imageId;
    /**
     * @return The type of the image.
     * 
     */
    private final String imageOwnerAlias;
    /**
     * @return The number of cluster login nodes. Only configuration 1 is supported.
     * 
     */
    private final Integer loginCount;
    /**
     * @return Cluster login node specifications.
     * 
     */
    private final String loginInstanceType;
    private final Integer managerCount;
    /**
     * @return The instance type of manager nodes.
     * 
     */
    private final String managerInstanceType;
    /**
     * @return The image tag of the operating system.
     * 
     */
    private final String osTag;
    private final List<GetClustersClusterPostInstallScript> postInstallScripts;
    /**
     * @return Mount the remote directory of the shared storage.
     * 
     */
    private final String remoteDirectory;
    /**
     * @return The SccCluster ID used by the cluster. If the cluster is not an SCC model, it is empty.
     * 
     */
    private final String sccClusterId;
    /**
     * @return Dispatch server type.
     * 
     */
    private final String schedulerType;
    /**
     * @return The ID of the security group.
     * 
     */
    private final String securityGroupId;
    /**
     * @return The status of the resource.
     * 
     */
    private final String status;
    /**
     * @return The ID of the NAS instance. Currently, you cannot automatically create an Alibaba Cloud NAS instance.
     * 
     */
    private final String volumeId;
    /**
     * @return The mount target of the file system. Mount targets cannot be automatically created for NAS file systems.
     * 
     */
    private final String volumeMountpoint;
    /**
     * @return The type of the protocol that is used by the file system.
     * 
     */
    private final String volumeProtocol;
    /**
     * @return The type of the network shared storage. Valid value: NAS.
     * 
     */
    private final String volumeType;
    /**
     * @return The ID of the VPC network.
     * 
     */
    private final String vpcId;
    /**
     * @return The vswitch id.
     * 
     */
    private final String vswitchId;
    private final String zoneId;

    @CustomType.Constructor
    private GetClustersCluster(
        @CustomType.Parameter("accountType") String accountType,
        @CustomType.Parameter("applications") List<GetClustersClusterApplication> applications,
        @CustomType.Parameter("clientVersion") String clientVersion,
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("clusterName") String clusterName,
        @CustomType.Parameter("computeCount") Integer computeCount,
        @CustomType.Parameter("computeInstanceType") String computeInstanceType,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deployMode") String deployMode,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("haEnable") Boolean haEnable,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageId") String imageId,
        @CustomType.Parameter("imageOwnerAlias") String imageOwnerAlias,
        @CustomType.Parameter("loginCount") Integer loginCount,
        @CustomType.Parameter("loginInstanceType") String loginInstanceType,
        @CustomType.Parameter("managerCount") Integer managerCount,
        @CustomType.Parameter("managerInstanceType") String managerInstanceType,
        @CustomType.Parameter("osTag") String osTag,
        @CustomType.Parameter("postInstallScripts") List<GetClustersClusterPostInstallScript> postInstallScripts,
        @CustomType.Parameter("remoteDirectory") String remoteDirectory,
        @CustomType.Parameter("sccClusterId") String sccClusterId,
        @CustomType.Parameter("schedulerType") String schedulerType,
        @CustomType.Parameter("securityGroupId") String securityGroupId,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("volumeId") String volumeId,
        @CustomType.Parameter("volumeMountpoint") String volumeMountpoint,
        @CustomType.Parameter("volumeProtocol") String volumeProtocol,
        @CustomType.Parameter("volumeType") String volumeType,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("vswitchId") String vswitchId,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.accountType = accountType;
        this.applications = applications;
        this.clientVersion = clientVersion;
        this.clusterId = clusterId;
        this.clusterName = clusterName;
        this.computeCount = computeCount;
        this.computeInstanceType = computeInstanceType;
        this.createTime = createTime;
        this.deployMode = deployMode;
        this.description = description;
        this.haEnable = haEnable;
        this.id = id;
        this.imageId = imageId;
        this.imageOwnerAlias = imageOwnerAlias;
        this.loginCount = loginCount;
        this.loginInstanceType = loginInstanceType;
        this.managerCount = managerCount;
        this.managerInstanceType = managerInstanceType;
        this.osTag = osTag;
        this.postInstallScripts = postInstallScripts;
        this.remoteDirectory = remoteDirectory;
        this.sccClusterId = sccClusterId;
        this.schedulerType = schedulerType;
        this.securityGroupId = securityGroupId;
        this.status = status;
        this.volumeId = volumeId;
        this.volumeMountpoint = volumeMountpoint;
        this.volumeProtocol = volumeProtocol;
        this.volumeType = volumeType;
        this.vpcId = vpcId;
        this.vswitchId = vswitchId;
        this.zoneId = zoneId;
    }

    /**
     * @return The server type of the account.
     * 
     */
    public String accountType() {
        return this.accountType;
    }
    public List<GetClustersClusterApplication> applications() {
        return this.applications;
    }
    /**
     * @return The version number of the client used by the cluster.
     * 
     */
    public String clientVersion() {
        return this.clientVersion;
    }
    /**
     * @return The id of E-HPC Cluster.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return The name of E-HPC cluster.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return The number of compute nodes in the cluster.
     * 
     */
    public Integer computeCount() {
        return this.computeCount;
    }
    /**
     * @return Cluster compute node specifications.
     * 
     */
    public String computeInstanceType() {
        return this.computeInstanceType;
    }
    /**
     * @return The creation time of the resource.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Cluster deployment mode. Possible values:
     * - Standard: separate deployment of account nodes, scheduling nodes, login nodes, and compute nodes.
     * - Advanced:HA mode deployment.
     * - Simple: the account node and the scheduling node are deployed on one node, and the login node and the compute node are deployed separately.
     * - Tiny: account nodes, scheduling nodes, and login nodes are deployed on one node, and compute nodes are deployed separately.
     * - OneBox: account node, scheduling node, login node and compute node are deployed on one node.
     * 
     */
    public String deployMode() {
        return this.deployMode;
    }
    /**
     * @return The description of E-HPC cluster.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Whether to turn on high availability. &gt; If high availability is enabled, each control role in the cluster will use two primary and secondary instances.
     * 
     */
    public Boolean haEnable() {
        return this.haEnable;
    }
    /**
     * @return The ID of the Cluster.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the Image.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return The type of the image.
     * 
     */
    public String imageOwnerAlias() {
        return this.imageOwnerAlias;
    }
    /**
     * @return The number of cluster login nodes. Only configuration 1 is supported.
     * 
     */
    public Integer loginCount() {
        return this.loginCount;
    }
    /**
     * @return Cluster login node specifications.
     * 
     */
    public String loginInstanceType() {
        return this.loginInstanceType;
    }
    public Integer managerCount() {
        return this.managerCount;
    }
    /**
     * @return The instance type of manager nodes.
     * 
     */
    public String managerInstanceType() {
        return this.managerInstanceType;
    }
    /**
     * @return The image tag of the operating system.
     * 
     */
    public String osTag() {
        return this.osTag;
    }
    public List<GetClustersClusterPostInstallScript> postInstallScripts() {
        return this.postInstallScripts;
    }
    /**
     * @return Mount the remote directory of the shared storage.
     * 
     */
    public String remoteDirectory() {
        return this.remoteDirectory;
    }
    /**
     * @return The SccCluster ID used by the cluster. If the cluster is not an SCC model, it is empty.
     * 
     */
    public String sccClusterId() {
        return this.sccClusterId;
    }
    /**
     * @return Dispatch server type.
     * 
     */
    public String schedulerType() {
        return this.schedulerType;
    }
    /**
     * @return The ID of the security group.
     * 
     */
    public String securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * @return The status of the resource.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The ID of the NAS instance. Currently, you cannot automatically create an Alibaba Cloud NAS instance.
     * 
     */
    public String volumeId() {
        return this.volumeId;
    }
    /**
     * @return The mount target of the file system. Mount targets cannot be automatically created for NAS file systems.
     * 
     */
    public String volumeMountpoint() {
        return this.volumeMountpoint;
    }
    /**
     * @return The type of the protocol that is used by the file system.
     * 
     */
    public String volumeProtocol() {
        return this.volumeProtocol;
    }
    /**
     * @return The type of the network shared storage. Valid value: NAS.
     * 
     */
    public String volumeType() {
        return this.volumeType;
    }
    /**
     * @return The ID of the VPC network.
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
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountType;
        private List<GetClustersClusterApplication> applications;
        private String clientVersion;
        private String clusterId;
        private String clusterName;
        private Integer computeCount;
        private String computeInstanceType;
        private String createTime;
        private String deployMode;
        private String description;
        private Boolean haEnable;
        private String id;
        private String imageId;
        private String imageOwnerAlias;
        private Integer loginCount;
        private String loginInstanceType;
        private Integer managerCount;
        private String managerInstanceType;
        private String osTag;
        private List<GetClustersClusterPostInstallScript> postInstallScripts;
        private String remoteDirectory;
        private String sccClusterId;
        private String schedulerType;
        private String securityGroupId;
        private String status;
        private String volumeId;
        private String volumeMountpoint;
        private String volumeProtocol;
        private String volumeType;
        private String vpcId;
        private String vswitchId;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClustersCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountType = defaults.accountType;
    	      this.applications = defaults.applications;
    	      this.clientVersion = defaults.clientVersion;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterName = defaults.clusterName;
    	      this.computeCount = defaults.computeCount;
    	      this.computeInstanceType = defaults.computeInstanceType;
    	      this.createTime = defaults.createTime;
    	      this.deployMode = defaults.deployMode;
    	      this.description = defaults.description;
    	      this.haEnable = defaults.haEnable;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.imageOwnerAlias = defaults.imageOwnerAlias;
    	      this.loginCount = defaults.loginCount;
    	      this.loginInstanceType = defaults.loginInstanceType;
    	      this.managerCount = defaults.managerCount;
    	      this.managerInstanceType = defaults.managerInstanceType;
    	      this.osTag = defaults.osTag;
    	      this.postInstallScripts = defaults.postInstallScripts;
    	      this.remoteDirectory = defaults.remoteDirectory;
    	      this.sccClusterId = defaults.sccClusterId;
    	      this.schedulerType = defaults.schedulerType;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.status = defaults.status;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeMountpoint = defaults.volumeMountpoint;
    	      this.volumeProtocol = defaults.volumeProtocol;
    	      this.volumeType = defaults.volumeType;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder accountType(String accountType) {
            this.accountType = Objects.requireNonNull(accountType);
            return this;
        }
        public Builder applications(List<GetClustersClusterApplication> applications) {
            this.applications = Objects.requireNonNull(applications);
            return this;
        }
        public Builder applications(GetClustersClusterApplication... applications) {
            return applications(List.of(applications));
        }
        public Builder clientVersion(String clientVersion) {
            this.clientVersion = Objects.requireNonNull(clientVersion);
            return this;
        }
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder computeCount(Integer computeCount) {
            this.computeCount = Objects.requireNonNull(computeCount);
            return this;
        }
        public Builder computeInstanceType(String computeInstanceType) {
            this.computeInstanceType = Objects.requireNonNull(computeInstanceType);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder deployMode(String deployMode) {
            this.deployMode = Objects.requireNonNull(deployMode);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder haEnable(Boolean haEnable) {
            this.haEnable = Objects.requireNonNull(haEnable);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = Objects.requireNonNull(imageOwnerAlias);
            return this;
        }
        public Builder loginCount(Integer loginCount) {
            this.loginCount = Objects.requireNonNull(loginCount);
            return this;
        }
        public Builder loginInstanceType(String loginInstanceType) {
            this.loginInstanceType = Objects.requireNonNull(loginInstanceType);
            return this;
        }
        public Builder managerCount(Integer managerCount) {
            this.managerCount = Objects.requireNonNull(managerCount);
            return this;
        }
        public Builder managerInstanceType(String managerInstanceType) {
            this.managerInstanceType = Objects.requireNonNull(managerInstanceType);
            return this;
        }
        public Builder osTag(String osTag) {
            this.osTag = Objects.requireNonNull(osTag);
            return this;
        }
        public Builder postInstallScripts(List<GetClustersClusterPostInstallScript> postInstallScripts) {
            this.postInstallScripts = Objects.requireNonNull(postInstallScripts);
            return this;
        }
        public Builder postInstallScripts(GetClustersClusterPostInstallScript... postInstallScripts) {
            return postInstallScripts(List.of(postInstallScripts));
        }
        public Builder remoteDirectory(String remoteDirectory) {
            this.remoteDirectory = Objects.requireNonNull(remoteDirectory);
            return this;
        }
        public Builder sccClusterId(String sccClusterId) {
            this.sccClusterId = Objects.requireNonNull(sccClusterId);
            return this;
        }
        public Builder schedulerType(String schedulerType) {
            this.schedulerType = Objects.requireNonNull(schedulerType);
            return this;
        }
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder volumeId(String volumeId) {
            this.volumeId = Objects.requireNonNull(volumeId);
            return this;
        }
        public Builder volumeMountpoint(String volumeMountpoint) {
            this.volumeMountpoint = Objects.requireNonNull(volumeMountpoint);
            return this;
        }
        public Builder volumeProtocol(String volumeProtocol) {
            this.volumeProtocol = Objects.requireNonNull(volumeProtocol);
            return this;
        }
        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
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
        }        public GetClustersCluster build() {
            return new GetClustersCluster(accountType, applications, clientVersion, clusterId, clusterName, computeCount, computeInstanceType, createTime, deployMode, description, haEnable, id, imageId, imageOwnerAlias, loginCount, loginInstanceType, managerCount, managerInstanceType, osTag, postInstallScripts, remoteDirectory, sccClusterId, schedulerType, securityGroupId, status, volumeId, volumeMountpoint, volumeProtocol, volumeType, vpcId, vswitchId, zoneId);
        }
    }
}
