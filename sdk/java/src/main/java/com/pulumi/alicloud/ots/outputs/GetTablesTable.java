// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ots.outputs;

import com.pulumi.alicloud.ots.outputs.GetTablesTablePrimaryKey;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTablesTable {
    /**
     * @return ID of the table. The value is `&lt;instance_name&gt;:&lt;table_name&gt;`.
     * 
     */
    private String id;
    /**
     * @return The name of OTS instance.
     * 
     */
    private String instanceName;
    /**
     * @return The maximum number of versions stored in this table.
     * 
     */
    private Integer maxVersion;
    /**
     * @return The property of `TableMeta` which indicates the structure information of a table.
     * 
     */
    private List<GetTablesTablePrimaryKey> primaryKeys;
    /**
     * @return The table name of the OTS which could not be changed.
     * 
     */
    private String tableName;
    /**
     * @return The retention time of data stored in this table.
     * 
     */
    private Integer timeToLive;

    private GetTablesTable() {}
    /**
     * @return ID of the table. The value is `&lt;instance_name&gt;:&lt;table_name&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of OTS instance.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return The maximum number of versions stored in this table.
     * 
     */
    public Integer maxVersion() {
        return this.maxVersion;
    }
    /**
     * @return The property of `TableMeta` which indicates the structure information of a table.
     * 
     */
    public List<GetTablesTablePrimaryKey> primaryKeys() {
        return this.primaryKeys;
    }
    /**
     * @return The table name of the OTS which could not be changed.
     * 
     */
    public String tableName() {
        return this.tableName;
    }
    /**
     * @return The retention time of data stored in this table.
     * 
     */
    public Integer timeToLive() {
        return this.timeToLive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTablesTable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String instanceName;
        private Integer maxVersion;
        private List<GetTablesTablePrimaryKey> primaryKeys;
        private String tableName;
        private Integer timeToLive;
        public Builder() {}
        public Builder(GetTablesTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceName = defaults.instanceName;
    	      this.maxVersion = defaults.maxVersion;
    	      this.primaryKeys = defaults.primaryKeys;
    	      this.tableName = defaults.tableName;
    	      this.timeToLive = defaults.timeToLive;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        @CustomType.Setter
        public Builder maxVersion(Integer maxVersion) {
            this.maxVersion = Objects.requireNonNull(maxVersion);
            return this;
        }
        @CustomType.Setter
        public Builder primaryKeys(List<GetTablesTablePrimaryKey> primaryKeys) {
            this.primaryKeys = Objects.requireNonNull(primaryKeys);
            return this;
        }
        public Builder primaryKeys(GetTablesTablePrimaryKey... primaryKeys) {
            return primaryKeys(List.of(primaryKeys));
        }
        @CustomType.Setter
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        @CustomType.Setter
        public Builder timeToLive(Integer timeToLive) {
            this.timeToLive = Objects.requireNonNull(timeToLive);
            return this;
        }
        public GetTablesTable build() {
            final var o = new GetTablesTable();
            o.id = id;
            o.instanceName = instanceName;
            o.maxVersion = maxVersion;
            o.primaryKeys = primaryKeys;
            o.tableName = tableName;
            o.timeToLive = timeToLive;
            return o;
        }
    }
}
