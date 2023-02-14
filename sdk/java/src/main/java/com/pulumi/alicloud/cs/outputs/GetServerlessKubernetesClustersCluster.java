// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.alicloud.cs.outputs.GetServerlessKubernetesClustersClusterConnections;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServerlessKubernetesClustersCluster {
    /**
     * @return Map of serverless cluster connection information. It contains several attributes to `Block Connections`.
     * 
     */
    private GetServerlessKubernetesClustersClusterConnections connections;
    /**
     * @return Whether the cluster support delete protection.
     * 
     */
    private Boolean deletionProtection;
    private Boolean endpointPublicAccessEnabled;
    /**
     * @return The ID of the container cluster.
     * 
     */
    private String id;
    /**
     * @return The name of the container cluster.
     * 
     */
    private String name;
    /**
     * @return The ID of nat gateway used to launch kubernetes cluster.
     * 
     */
    private String natGatewayId;
    /**
     * @return The ID of security group where the current cluster  is located.
     * 
     */
    private String securityGroupId;
    private Map<String,Object> tags;
    /**
     * @return The ID of VPC where the current cluster is located.
     * 
     */
    private String vpcId;
    /**
     * @return The ID of VSwitch where the current cluster is located.
     * 
     */
    private String vswitchId;

    private GetServerlessKubernetesClustersCluster() {}
    /**
     * @return Map of serverless cluster connection information. It contains several attributes to `Block Connections`.
     * 
     */
    public GetServerlessKubernetesClustersClusterConnections connections() {
        return this.connections;
    }
    /**
     * @return Whether the cluster support delete protection.
     * 
     */
    public Boolean deletionProtection() {
        return this.deletionProtection;
    }
    public Boolean endpointPublicAccessEnabled() {
        return this.endpointPublicAccessEnabled;
    }
    /**
     * @return The ID of the container cluster.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the container cluster.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of nat gateway used to launch kubernetes cluster.
     * 
     */
    public String natGatewayId() {
        return this.natGatewayId;
    }
    /**
     * @return The ID of security group where the current cluster  is located.
     * 
     */
    public String securityGroupId() {
        return this.securityGroupId;
    }
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return The ID of VPC where the current cluster is located.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The ID of VSwitch where the current cluster is located.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerlessKubernetesClustersCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetServerlessKubernetesClustersClusterConnections connections;
        private Boolean deletionProtection;
        private Boolean endpointPublicAccessEnabled;
        private String id;
        private String name;
        private String natGatewayId;
        private String securityGroupId;
        private Map<String,Object> tags;
        private String vpcId;
        private String vswitchId;
        public Builder() {}
        public Builder(GetServerlessKubernetesClustersCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connections = defaults.connections;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.endpointPublicAccessEnabled = defaults.endpointPublicAccessEnabled;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.natGatewayId = defaults.natGatewayId;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
        }

        @CustomType.Setter
        public Builder connections(GetServerlessKubernetesClustersClusterConnections connections) {
            this.connections = Objects.requireNonNull(connections);
            return this;
        }
        @CustomType.Setter
        public Builder deletionProtection(Boolean deletionProtection) {
            this.deletionProtection = Objects.requireNonNull(deletionProtection);
            return this;
        }
        @CustomType.Setter
        public Builder endpointPublicAccessEnabled(Boolean endpointPublicAccessEnabled) {
            this.endpointPublicAccessEnabled = Objects.requireNonNull(endpointPublicAccessEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = Objects.requireNonNull(natGatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
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
        public GetServerlessKubernetesClustersCluster build() {
            final var o = new GetServerlessKubernetesClustersCluster();
            o.connections = connections;
            o.deletionProtection = deletionProtection;
            o.endpointPublicAccessEnabled = endpointPublicAccessEnabled;
            o.id = id;
            o.name = name;
            o.natGatewayId = natGatewayId;
            o.securityGroupId = securityGroupId;
            o.tags = tags;
            o.vpcId = vpcId;
            o.vswitchId = vswitchId;
            return o;
        }
    }
}