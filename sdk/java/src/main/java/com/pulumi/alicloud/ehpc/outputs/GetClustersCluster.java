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
    private String accountType;
    private List<GetClustersClusterApplication> applications;
    /**
     * @return The version number of the client used by the cluster.
     * 
     */
    private String clientVersion;
    /**
     * @return The id of E-HPC Cluster.
     * 
     */
    private String clusterId;
    /**
     * @return The name of E-HPC cluster.
     * 
     */
    private String clusterName;
    /**
     * @return The number of compute nodes in the cluster.
     * 
     */
    private Integer computeCount;
    /**
     * @return Cluster compute node specifications.
     * 
     */
    private String computeInstanceType;
    /**
     * @return The creation time of the resource.
     * 
     */
    private String createTime;
    /**
     * @return Cluster deployment mode. Possible values:
     * - Standard: separate deployment of account nodes, scheduling nodes, login nodes, and compute nodes.
     * - Advanced:HA mode deployment.
     * - Simple: the account node and the scheduling node are deployed on one node, and the login node and the compute node are deployed separately.
     * - Tiny: account nodes, scheduling nodes, and login nodes are deployed on one node, and compute nodes are deployed separately.
     * - OneBox: account node, scheduling node, login node and compute node are deployed on one node.
     * 
     */
    private String deployMode;
    /**
     * @return The description of E-HPC cluster.
     * 
     */
    private String description;
    /**
     * @return Whether to turn on high availability. &gt; If high availability is enabled, each control role in the cluster will use two primary and secondary instances.
     * 
     */
    private Boolean haEnable;
    /**
     * @return The ID of the Cluster.
     * 
     */
    private String id;
    /**
     * @return The ID of the Image.
     * 
     */
    private String imageId;
    /**
     * @return The type of the image.
     * 
     */
    private String imageOwnerAlias;
    /**
     * @return The number of cluster login nodes. Only configuration 1 is supported.
     * 
     */
    private Integer loginCount;
    /**
     * @return Cluster login node specifications.
     * 
     */
    private String loginInstanceType;
    private Integer managerCount;
    /**
     * @return The instance type of manager nodes.
     * 
     */
    private String managerInstanceType;
    /**
     * @return The image tag of the operating system.
     * 
     */
    private String osTag;
    private List<GetClustersClusterPostInstallScript> postInstallScripts;
    /**
     * @return Mount the remote directory of the shared storage.
     * 
     */
    private String remoteDirectory;
    /**
     * @return The SccCluster ID used by the cluster. If the cluster is not an SCC model, it is empty.
     * 
     */
    private String sccClusterId;
    /**
     * @return Dispatch server type.
     * 
     */
    private String schedulerType;
    /**
     * @return The ID of the security group.
     * 
     */
    private String securityGroupId;
    /**
     * @return The status of the resource.
     * 
     */
    private String status;
    /**
     * @return The ID of the NAS instance. Currently, you cannot automatically create an Alibaba Cloud NAS instance.
     * 
     */
    private String volumeId;
    /**
     * @return The mount target of the file system. Mount targets cannot be automatically created for NAS file systems.
     * 
     */
    private String volumeMountpoint;
    /**
     * @return The type of the protocol that is used by the file system.
     * 
     */
    private String volumeProtocol;
    /**
     * @return The type of the network shared storage. Valid value: NAS.
     * 
     */
    private String volumeType;
    /**
     * @return The ID of the VPC network.
     * 
     */
    private String vpcId;
    /**
     * @return The vswitch id.
     * 
     */
    private String vswitchId;
    private String zoneId;

    private GetClustersCluster() {}
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
    @CustomType.Builder
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
        public Builder() {}
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

        @CustomType.Setter
        public Builder accountType(String accountType) {
            this.accountType = Objects.requireNonNull(accountType);
            return this;
        }
        @CustomType.Setter
        public Builder applications(List<GetClustersClusterApplication> applications) {
            this.applications = Objects.requireNonNull(applications);
            return this;
        }
        public Builder applications(GetClustersClusterApplication... applications) {
            return applications(List.of(applications));
        }
        @CustomType.Setter
        public Builder clientVersion(String clientVersion) {
            this.clientVersion = Objects.requireNonNull(clientVersion);
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        @CustomType.Setter
        public Builder computeCount(Integer computeCount) {
            this.computeCount = Objects.requireNonNull(computeCount);
            return this;
        }
        @CustomType.Setter
        public Builder computeInstanceType(String computeInstanceType) {
            this.computeInstanceType = Objects.requireNonNull(computeInstanceType);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder deployMode(String deployMode) {
            this.deployMode = Objects.requireNonNull(deployMode);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder haEnable(Boolean haEnable) {
            this.haEnable = Objects.requireNonNull(haEnable);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        @CustomType.Setter
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = Objects.requireNonNull(imageOwnerAlias);
            return this;
        }
        @CustomType.Setter
        public Builder loginCount(Integer loginCount) {
            this.loginCount = Objects.requireNonNull(loginCount);
            return this;
        }
        @CustomType.Setter
        public Builder loginInstanceType(String loginInstanceType) {
            this.loginInstanceType = Objects.requireNonNull(loginInstanceType);
            return this;
        }
        @CustomType.Setter
        public Builder managerCount(Integer managerCount) {
            this.managerCount = Objects.requireNonNull(managerCount);
            return this;
        }
        @CustomType.Setter
        public Builder managerInstanceType(String managerInstanceType) {
            this.managerInstanceType = Objects.requireNonNull(managerInstanceType);
            return this;
        }
        @CustomType.Setter
        public Builder osTag(String osTag) {
            this.osTag = Objects.requireNonNull(osTag);
            return this;
        }
        @CustomType.Setter
        public Builder postInstallScripts(List<GetClustersClusterPostInstallScript> postInstallScripts) {
            this.postInstallScripts = Objects.requireNonNull(postInstallScripts);
            return this;
        }
        public Builder postInstallScripts(GetClustersClusterPostInstallScript... postInstallScripts) {
            return postInstallScripts(List.of(postInstallScripts));
        }
        @CustomType.Setter
        public Builder remoteDirectory(String remoteDirectory) {
            this.remoteDirectory = Objects.requireNonNull(remoteDirectory);
            return this;
        }
        @CustomType.Setter
        public Builder sccClusterId(String sccClusterId) {
            this.sccClusterId = Objects.requireNonNull(sccClusterId);
            return this;
        }
        @CustomType.Setter
        public Builder schedulerType(String schedulerType) {
            this.schedulerType = Objects.requireNonNull(schedulerType);
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder volumeId(String volumeId) {
            this.volumeId = Objects.requireNonNull(volumeId);
            return this;
        }
        @CustomType.Setter
        public Builder volumeMountpoint(String volumeMountpoint) {
            this.volumeMountpoint = Objects.requireNonNull(volumeMountpoint);
            return this;
        }
        @CustomType.Setter
        public Builder volumeProtocol(String volumeProtocol) {
            this.volumeProtocol = Objects.requireNonNull(volumeProtocol);
            return this;
        }
        @CustomType.Setter
        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
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
        public GetClustersCluster build() {
            final var o = new GetClustersCluster();
            o.accountType = accountType;
            o.applications = applications;
            o.clientVersion = clientVersion;
            o.clusterId = clusterId;
            o.clusterName = clusterName;
            o.computeCount = computeCount;
            o.computeInstanceType = computeInstanceType;
            o.createTime = createTime;
            o.deployMode = deployMode;
            o.description = description;
            o.haEnable = haEnable;
            o.id = id;
            o.imageId = imageId;
            o.imageOwnerAlias = imageOwnerAlias;
            o.loginCount = loginCount;
            o.loginInstanceType = loginInstanceType;
            o.managerCount = managerCount;
            o.managerInstanceType = managerInstanceType;
            o.osTag = osTag;
            o.postInstallScripts = postInstallScripts;
            o.remoteDirectory = remoteDirectory;
            o.sccClusterId = sccClusterId;
            o.schedulerType = schedulerType;
            o.securityGroupId = securityGroupId;
            o.status = status;
            o.volumeId = volumeId;
            o.volumeMountpoint = volumeMountpoint;
            o.volumeProtocol = volumeProtocol;
            o.volumeType = volumeType;
            o.vpcId = vpcId;
            o.vswitchId = vswitchId;
            o.zoneId = zoneId;
            return o;
        }
    }
}
