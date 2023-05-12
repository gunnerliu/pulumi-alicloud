// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEdgeKubernetesClustersClusterWorkerNode {
    /**
     * @return ID of the node.
     * 
     */
    private final String id;
    /**
     * @return Node name.
     * 
     */
    private final String name;
    /**
     * @return The private IP address of node.
     * 
     */
    private final String privateIp;

    @CustomType.Constructor
    private GetEdgeKubernetesClustersClusterWorkerNode(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateIp") String privateIp) {
        this.id = id;
        this.name = name;
        this.privateIp = privateIp;
    }

    /**
     * @return ID of the node.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Node name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The private IP address of node.
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEdgeKubernetesClustersClusterWorkerNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String privateIp;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEdgeKubernetesClustersClusterWorkerNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateIp = defaults.privateIp;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }        public GetEdgeKubernetesClustersClusterWorkerNode build() {
            return new GetEdgeKubernetesClustersClusterWorkerNode(id, name, privateIp);
        }
    }
}
