// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.polardb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClustersClusterDbNode {
    /**
     * @return The create_time of the db_nodes.
     * 
     */
    private String createTime;
    /**
     * @return The db_node_class of the db_nodes.
     * 
     */
    private String dbNodeClass;
    /**
     * @return The db_node_id of the db_nodes.
     * 
     */
    private String dbNodeId;
    /**
     * @return The db_node_role of the db_nodes.
     * 
     */
    private String dbNodeRole;
    /**
     * @return The db_node_status of the db_nodes.
     * 
     */
    private String dbNodeStatus;
    /**
     * @return The max_connections of the db_nodes.
     * 
     */
    private Integer maxConnections;
    /**
     * @return The max_iops of the db_nodes.
     * 
     */
    private Integer maxIops;
    /**
     * @return The region_id of the db_nodes.
     * 
     */
    private String regionId;
    /**
     * @return The zone_id of the db_nodes.
     * 
     */
    private String zoneId;

    private GetClustersClusterDbNode() {}
    /**
     * @return The create_time of the db_nodes.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The db_node_class of the db_nodes.
     * 
     */
    public String dbNodeClass() {
        return this.dbNodeClass;
    }
    /**
     * @return The db_node_id of the db_nodes.
     * 
     */
    public String dbNodeId() {
        return this.dbNodeId;
    }
    /**
     * @return The db_node_role of the db_nodes.
     * 
     */
    public String dbNodeRole() {
        return this.dbNodeRole;
    }
    /**
     * @return The db_node_status of the db_nodes.
     * 
     */
    public String dbNodeStatus() {
        return this.dbNodeStatus;
    }
    /**
     * @return The max_connections of the db_nodes.
     * 
     */
    public Integer maxConnections() {
        return this.maxConnections;
    }
    /**
     * @return The max_iops of the db_nodes.
     * 
     */
    public Integer maxIops() {
        return this.maxIops;
    }
    /**
     * @return The region_id of the db_nodes.
     * 
     */
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return The zone_id of the db_nodes.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersClusterDbNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String dbNodeClass;
        private String dbNodeId;
        private String dbNodeRole;
        private String dbNodeStatus;
        private Integer maxConnections;
        private Integer maxIops;
        private String regionId;
        private String zoneId;
        public Builder() {}
        public Builder(GetClustersClusterDbNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.dbNodeClass = defaults.dbNodeClass;
    	      this.dbNodeId = defaults.dbNodeId;
    	      this.dbNodeRole = defaults.dbNodeRole;
    	      this.dbNodeStatus = defaults.dbNodeStatus;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxIops = defaults.maxIops;
    	      this.regionId = defaults.regionId;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder dbNodeClass(String dbNodeClass) {
            this.dbNodeClass = Objects.requireNonNull(dbNodeClass);
            return this;
        }
        @CustomType.Setter
        public Builder dbNodeId(String dbNodeId) {
            this.dbNodeId = Objects.requireNonNull(dbNodeId);
            return this;
        }
        @CustomType.Setter
        public Builder dbNodeRole(String dbNodeRole) {
            this.dbNodeRole = Objects.requireNonNull(dbNodeRole);
            return this;
        }
        @CustomType.Setter
        public Builder dbNodeStatus(String dbNodeStatus) {
            this.dbNodeStatus = Objects.requireNonNull(dbNodeStatus);
            return this;
        }
        @CustomType.Setter
        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }
        @CustomType.Setter
        public Builder maxIops(Integer maxIops) {
            this.maxIops = Objects.requireNonNull(maxIops);
            return this;
        }
        @CustomType.Setter
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }
        public GetClustersClusterDbNode build() {
            final var _resultValue = new GetClustersClusterDbNode();
            _resultValue.createTime = createTime;
            _resultValue.dbNodeClass = dbNodeClass;
            _resultValue.dbNodeId = dbNodeId;
            _resultValue.dbNodeRole = dbNodeRole;
            _resultValue.dbNodeStatus = dbNodeStatus;
            _resultValue.maxConnections = maxConnections;
            _resultValue.maxIops = maxIops;
            _resultValue.regionId = regionId;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
