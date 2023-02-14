// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZnodesZnode {
    /**
     * @return The ID of the Cluster.
     * 
     */
    private String clusterId;
    /**
     * @return The Node data.
     * 
     */
    private String data;
    /**
     * @return Node list information, the value is as follows:
     * 
     */
    private Boolean dir;
    /**
     * @return The ID of the Znode. The value formats as `&lt;cluster_id&gt;:&lt;path&gt;`.
     * 
     */
    private String id;
    /**
     * @return The Node path.
     * 
     */
    private String path;
    /**
     * @return The Node name.
     * 
     */
    private String znodeName;

    private GetZnodesZnode() {}
    /**
     * @return The ID of the Cluster.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return The Node data.
     * 
     */
    public String data() {
        return this.data;
    }
    /**
     * @return Node list information, the value is as follows:
     * 
     */
    public Boolean dir() {
        return this.dir;
    }
    /**
     * @return The ID of the Znode. The value formats as `&lt;cluster_id&gt;:&lt;path&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Node path.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The Node name.
     * 
     */
    public String znodeName() {
        return this.znodeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZnodesZnode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterId;
        private String data;
        private Boolean dir;
        private String id;
        private String path;
        private String znodeName;
        public Builder() {}
        public Builder(GetZnodesZnode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.data = defaults.data;
    	      this.dir = defaults.dir;
    	      this.id = defaults.id;
    	      this.path = defaults.path;
    	      this.znodeName = defaults.znodeName;
        }

        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        @CustomType.Setter
        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        @CustomType.Setter
        public Builder dir(Boolean dir) {
            this.dir = Objects.requireNonNull(dir);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder znodeName(String znodeName) {
            this.znodeName = Objects.requireNonNull(znodeName);
            return this;
        }
        public GetZnodesZnode build() {
            final var o = new GetZnodesZnode();
            o.clusterId = clusterId;
            o.data = data;
            o.dir = dir;
            o.id = id;
            o.path = path;
            o.znodeName = znodeName;
            return o;
        }
    }
}