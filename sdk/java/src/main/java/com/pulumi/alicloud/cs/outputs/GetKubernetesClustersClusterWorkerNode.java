// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKubernetesClustersClusterWorkerNode {
    /**
     * @return ID of the node.
     * 
     */
    private String id;
    /**
     * @return Node name.
     * 
     */
    private String name;
    /**
     * @return The private IP address of node.
     * 
     */
    private String privateIp;

    private GetKubernetesClustersClusterWorkerNode() {}
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

    public static Builder builder(GetKubernetesClustersClusterWorkerNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private String privateIp;
        public Builder() {}
        public Builder(GetKubernetesClustersClusterWorkerNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateIp = defaults.privateIp;
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
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        public GetKubernetesClustersClusterWorkerNode build() {
            final var o = new GetKubernetesClustersClusterWorkerNode();
            o.id = id;
            o.name = name;
            o.privateIp = privateIp;
            return o;
        }
    }
}
